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
import org.smartmdsd.utils.Activator;
import org.smartmdsd.utils.SmartMDSDPreferencesPage;
import org.smartmdsd.utils.factories.AbstractSelectedModelsFactory;
import org.smartmdsd.utils.factories.ModelingProjectFactory;
import org.smartmdsd.utils.natures.SmartMDSDNatureEnum;

public class WizardNewSmartMDSDModel extends Wizard implements INewWizard {
	
	public static final String WIZARD_ID = "org.smartmdsd.utils.wizards.individualModel";
	
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
					String modelFolderName = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_MODEL_FOLDER);
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
