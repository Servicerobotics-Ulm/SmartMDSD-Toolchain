//--------------------------------------------------------------------------
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
// Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
// 
// 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the 
//    documentation and/or other materials provided with the distribution.
// 
// 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this 
//    software without specific prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
// THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS 
// BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
// POSSIBILITY OF SUCH DAMAGE.
//
//--------------------------------------------------------------------------
package org.smartmdsd.utils.wizards;

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
import org.smartmdsd.utils.Activator;
import org.smartmdsd.utils.SmartMDSDPreferencesPage;
import org.smartmdsd.utils.builder.CDTProjectHelpers;
import org.smartmdsd.utils.factories.AbstractSelectedModelsFactory;
import org.smartmdsd.utils.factories.JavaProjectFactory;
import org.smartmdsd.utils.factories.ModelingProjectFactory;
import org.smartmdsd.utils.natures.SmartMDSDNatureEnum;
import org.smartmdsd.utils.natures.SmartMDSDNatureHelpers;

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
				String modelFolderName = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_MODEL_FOLDER);

				// create a new plain Eclipse project
				IProject project = createProject(projectName, projectLocation, referencedProjects, subMonitor.split(10));
				
				// add Xtext project nature by default (as every SmartMDSD project will have some Xtext models)
				SmartMDSDNatureHelpers.addProjectNature(project, "org.eclipse.xtext.ui.shared.xtextNature", subMonitor.split(10));
				
				// create a JavaProject (which provides a proper Xtext cross-references resolution based on the Java classpath)
				JavaProjectFactory.createJavaProject(project, referencedProjects, modelFolderName, subMonitor.split(10));

				if(subMonitor.isCanceled()) return;
				
				// setup the default CDT settings (including the default CDT managed builder)
				try {
					CDTProjectHelpers.addDefaultSettingsTo(project, subMonitor.split(50));
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
