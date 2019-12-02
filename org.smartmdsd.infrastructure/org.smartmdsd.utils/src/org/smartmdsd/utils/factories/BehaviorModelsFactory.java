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
package org.smartmdsd.utils.factories;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.smartmdsd.utils.natures.BehaviorNature;
import org.ecore.behavior.taskRealization.TaskRealizationModel;
import org.ecore.behavior.taskRealization.TaskRealizationFactory;

public class BehaviorModelsFactory extends AbstractSelectedModelsFactory {

	public BehaviorModelsFactory(IProject project, IFolder modelFolder) {
		super(project, modelFolder);
	}

	@Override
	public boolean createSelectedModels(List<String> selectedModelTypes, IProgressMonitor monitor) {
		List<Resource> relatedResources = null;
		for(String modelName: selectedModelTypes) {
			BehaviorNature.DSL dsl = BehaviorNature.DSL.valueOf(modelName);
			
			EObject model = null;
			switch(dsl) {
			case TaskRealization : 
				model = createDefaultTaskRealizationModel();
				break;
			default:
				//do nothing
			}

			if(model != null) {
				Resource resource = createNewXtextResource(dsl.getInjector(), relatedResources);
				saveEMFModelInResource(model, resource);
			}
		}
		return true;
	}

	private TaskRealizationModel createDefaultTaskRealizationModel() {
		// we use the Factory methods (instead of plain text) as this is checked by the compiler and is more robust in case of model updates
		TaskRealizationModel model = TaskRealizationFactory.eINSTANCE.createTaskRealizationModel();
		model.setName(getProject().getName());
		return model;
	}

	@Override
	public void openSelectedModelsInEditor(IWorkbench workbench, List<String> selectedModelTypes) {
		IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
		for(String modelName: selectedModelTypes) {
			BehaviorNature.DSL dsl = BehaviorNature.DSL.valueOf(modelName);
			// open model file in related editor
			String fileName = getProject().getName() + "." + dsl.getModelFileExtension();
			IFile modelFile = getModelFolder().getFile(fileName);
			try {
				IDE.openEditor(page, modelFile);
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}		
	}

}
