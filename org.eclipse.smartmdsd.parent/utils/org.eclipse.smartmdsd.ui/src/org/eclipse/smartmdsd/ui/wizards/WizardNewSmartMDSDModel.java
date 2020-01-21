//===============================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain v3. 
//
//===============================================================
package org.eclipse.smartmdsd.ui.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.smartmdsd.ui.Activator;
import org.eclipse.smartmdsd.ui.preferences.SmartMDSDPreferencesPage;
import org.eclipse.smartmdsd.ui.factories.AbstractSelectedModelsFactory;
import org.eclipse.smartmdsd.ui.factories.ModelingProjectFactory;
import org.eclipse.smartmdsd.ui.natures.SmartMDSDNatureEnum;

public class WizardNewSmartMDSDModel extends Wizard implements INewWizard {
	
	public static final String WIZARD_ID = "org.eclipse.smartmdsd.ui.wizards.individualModel";
	
	private SingleProjectSelectionPage pageOne;
	private SmartMDSDModelTypeSelectionPage pageTwo;
	
	private IWorkbench workbench;
	private IStructuredSelection selection;
	
	public WizardNewSmartMDSDModel() {
        super();
        setNeedsProgressMonitor(true);
    }
	
	@Override
	public void addPages() {
		pageOne = new SingleProjectSelectionPage("Project-Selection-Page", workbench, selection);
		pageOne.setTitle("Project Selection Page");
		pageOne.setDescription("Select an existing project for which a SmartMDSD Model will be created.");
		addPage(pageOne);
		
		pageTwo = new SmartMDSDModelTypeSelectionPage("SmartMDSD-Model-Types-Selection");
		pageTwo.setTitle("Select SmartMDSD Model Types");
		pageTwo.setDescription("Select the SmartMDSD model-types that shall be created.");
		addPage(pageTwo);
	}
	
	@Override
	public boolean performFinish() {
		boolean result = true; // as long as no exception will be thrown this remains true
		
		WorkspaceModifyOperation createSelectedModelsOperation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException, InterruptedException {
				IProject selectedProject = pageOne.getSelectedProject();
				if(selectedProject != null) {
					String modelFolderName = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_MODELS_FOLDER);
					IFolder modelFolder = selectedProject.getFolder(modelFolderName);
					if(modelFolder.exists()) {
						for(SmartMDSDNatureEnum natureEnum: SmartMDSDNatureEnum.values()) {
							if(selectedProject.hasNature(natureEnum.getId())) {
								AbstractSelectedModelsFactory selectedModelsFactory = natureEnum.createModelsFactory(selectedProject, modelFolder);
								if(selectedModelsFactory != null) {
									List<String> selectedModelTypes = pageTwo.getSelectedModelTypes();
									boolean creationSucceeded = selectedModelsFactory.createSelectedModels(selectedModelTypes, monitor);
									if(creationSucceeded) {
										selectedModelsFactory.openSelectedModelsInEditor(workbench, selectedModelTypes);
										Session session = ModelingProjectFactory.getProjectSession(selectedProject, monitor);
										if(session != null) {
											ModelingProjectFactory.selectViewpoints(selectedProject, session, selectedModelTypes, monitor);
											ModelingProjectFactory.openSelectedDiagramEditorsForSession(selectedProject, session, selectedModelTypes, monitor);
										}
									}
								}
							}
						}
					}
				}
			}
		};
		
		try {
			boolean doFork = false;
			boolean cancelable = true;
			getContainer().run(doFork, cancelable, createSelectedModelsOperation);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			result = false;
		} catch (InterruptedException e) {
			e.printStackTrace();
			result = false;
		}
		
		return result;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	    setWindowTitle("New SmartMDSD Model Wizard");	
	}
	
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if(page.equals(pageOne)) {
			IProject selectedProject = pageOne.getSelectedProject();
			if(selectedProject != null) {
				pageTwo.setModelTypeEntriesFrom(selectedProject);
			}
		}
		return super.getNextPage(page);
	}
}
