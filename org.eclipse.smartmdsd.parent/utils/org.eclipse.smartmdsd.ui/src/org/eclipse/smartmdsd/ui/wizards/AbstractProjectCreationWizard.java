/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.ui.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.cdt.managedbuilder.core.BuildException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.dialogs.WizardNewProjectReferencePage;
import org.eclipse.smartmdsd.ui.Activator;
import org.eclipse.smartmdsd.ui.preferences.SmartMDSDPreferencesPage;
import org.eclipse.smartmdsd.ui.builder.CDTProjectHelpers;
import org.eclipse.smartmdsd.ui.factories.AbstractSelectedModelsFactory;
import org.eclipse.smartmdsd.ui.factories.JavaProjectFactory;
import org.eclipse.smartmdsd.ui.factories.ModelingProjectFactory;
import org.eclipse.smartmdsd.ui.natures.SmartMDSDNatureEnum;
import org.eclipse.smartmdsd.ui.natures.SmartMDSDNatureHelpers;

public abstract class AbstractProjectCreationWizard extends Wizard implements INewWizard {

	protected WizardNewProjectCreationPage pageOne;
	protected SmartMDSDModelTypeSelectionPage pageTwo;
	protected WizardNewProjectReferencePage pageThree;
	
	protected IWorkbench workbench;
	protected ISelection selection;

	
	public AbstractProjectCreationWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	// implement this method in derived classes provide a custom first page
	protected abstract WizardNewProjectCreationPage createFirstPage();

	// return the specific project-nature enum
	protected abstract SmartMDSDNatureEnum getCurrentNatureEnum();
	
	// return boolean value indicating whether the new project should get the modeling nature
	protected abstract boolean isModelingProject();
	
	// add further customizations (if needed) by implementing this method
	protected abstract void customizeProject(final IProject project, IFolder modelFolder, IProgressMonitor monitor) throws CoreException;
	
	@Override
	public void addPages() {
		pageOne = createFirstPage();
		addPage(pageOne);
		
		pageTwo = new SmartMDSDModelTypeSelectionPage("SmartMDSD-Model-Types-Selection");
		pageTwo.setTitle("Select SmartMDSD Model Types");
		pageTwo.setDescription("Select the SmartMDSD model-types that shall be created.");
		pageTwo.setAllModelTypeEntriesFor(getCurrentNatureEnum());
		addPage(pageTwo);
		
		pageThree = new FilteredProjectReferencePage("ProjectReferencesPage", getCurrentNatureEnum());
		pageThree.setTitle("Select referenced projects");
		pageThree.setDescription("This page allows to select referenced projects");
		addPage(pageThree);
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;	
	}

	@Override
	public boolean performFinish() {
		boolean result = true; // as long as no exception will be thrown this remains true
		
		// the workspace modify operation includes the progress bar for the wizard
		WorkspaceModifyOperation createProjectOperation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException, InterruptedException {
				SubMonitor subMonitor = SubMonitor.convert(monitor, "Project Creation Wizard", 350);

				// get the specified settings from the wizard pages
				String projectName = pageOne.getProjectName();
				java.net.URI projectLocation = pageOne.getLocationURI();
				List<String> selectedModelTypes = pageTwo.getSelectedModelTypes();
				IProject[] referencedProjects = pageThree.getReferencedProjects();
				
				// the model folder name is stored in the SmartMDSD Preferences
				String modelFolderName = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_MODELS_FOLDER);

				// create a new plain Eclipse project
				IProject project = createProject(projectName, projectLocation, referencedProjects, subMonitor.split(10));
				
				// add Xtext project nature by default (as every SmartMDSD project will have some Xtext models)
				SmartMDSDNatureHelpers.addProjectNature(project, "org.eclipse.xtext.ui.shared.xtextNature", subMonitor.split(10));
				
				// create a JavaProject (which provides a proper Xtext cross-references resolution based on the Java classpath)
				JavaProjectFactory.createJavaProject(project, referencedProjects, modelFolderName, subMonitor.split(10));

				if(subMonitor.isCanceled()) return;
				
				// setup the default CDT settings (including the default CDT managed builder)
				try {
					String activeBuildType = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_CMAKE_BUILD_TYPE);
					CDTProjectHelpers.addDefaultSettingsTo(project, activeBuildType, subMonitor.split(50));
				} catch (OperationCanceledException | BuildException e) {
					e.printStackTrace();
				}
				
				// this project gets also the specific SmartMDSD project nature
				// please note, that some SmartMDSD natures require the CDT nature to be specified first (so this command must come after the CDT configuration)
				SmartMDSDNatureHelpers.addProjectNature(project, getCurrentNatureEnum().getId(), subMonitor.split(10));
				
				if(subMonitor.isCanceled()) return;

				if(project.isOpen()) {		
					// create model folder
					IFolder modelFolder = project.getFolder(modelFolderName);
					modelFolder.create(true, true, subMonitor.split(10));

					// create model factory (specified in derived classes)
					AbstractSelectedModelsFactory modelsFactory = getCurrentNatureEnum().createModelsFactory(project, modelFolder);
					// the actual creation of specific model types is delegated to the specific models factory
					modelsFactory.createSelectedModels(selectedModelTypes, subMonitor.split(50));
					modelsFactory.openSelectedModelsInEditor(workbench, selectedModelTypes);
					
					if(subMonitor.isCanceled()) return;
					
					if(isModelingProject() == true) {
						ModelingProjectFactory.createModelingProject(project, selectedModelTypes, subMonitor.split(150));
					}
					
					// call project customization method (implemented in derived classes)
					customizeProject(project, modelFolder, subMonitor.split(50));
				}
				subMonitor.done();
			}
		};
		
		try {
			boolean doFork = false;
			boolean cancelable = true;
			getContainer().run(doFork, cancelable, createProjectOperation);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			result = false;
		} catch (InterruptedException e) {
			e.printStackTrace();
			result = false;
		}
		
		return result;
	}
	
	protected IProject createProject(String projectName, java.net.URI projectLocation, IProject[] referencedProjects, IProgressMonitor monitor) throws CoreException {
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Create Project "+projectName, 20);
		
		// create a new project description
		IProject projectHandle = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IProjectDescription description = ResourcesPlugin.getWorkspace().newProjectDescription(projectName);
		
		// set the default project settings
		description.setLocationURI(projectLocation);
		description.setReferencedProjects(referencedProjects);
		
		// create and open the project with a given description
		projectHandle.create(description, subMonitor.split(10));
		projectHandle.open(IResource.BACKGROUND_REFRESH, subMonitor.split(10));
		
		return projectHandle;
	}
}
