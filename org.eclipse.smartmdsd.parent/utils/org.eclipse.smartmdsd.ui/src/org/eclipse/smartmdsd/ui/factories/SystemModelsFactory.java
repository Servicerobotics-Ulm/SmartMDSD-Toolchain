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
package org.eclipse.smartmdsd.ui.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetFactory;
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElement;
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElementNames;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitectureFactory;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitectureModel;
import org.eclipse.smartmdsd.ecore.system.causeEffectChain.CauseEffectChainFactory;
import org.eclipse.smartmdsd.ecore.system.causeEffectChain.CuaseEffectChainModel;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitectureFactory;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture;
import org.eclipse.smartmdsd.ecore.system.deployment.DeploymentFactory;
import org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel;
import org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParamModel;
import org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterFactory;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformFactory;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformModel;
import org.eclipse.smartmdsd.ui.natures.SystemNature;
import org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheet;
import org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheetFactory;

public class SystemModelsFactory extends AbstractSelectedModelsFactory {

	public SystemModelsFactory(IProject project, IFolder modelFolder) {
		super(project, modelFolder);
	}
	
	@Override
	public boolean createSelectedModels(List<String> selectedModelTypes, IProgressMonitor monitor) {
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Create selected models", 60);

		List<Resource> relatedResources = new ArrayList<Resource>();
		
		// first the ActivityArchitecture model is either loaded from a project resource or a new default model is created on the fly
		// the ActivityArchitecture model is optionally used by the below SystemComponentArchitecture
		Resource activityArchitectureResource = loadEMFResource(SystemNature.DSL.SystemActivityArchitecture.getInjector());
		ActivityArchitectureModel activityArchitecture = null;
		if(activityArchitectureResource != null && activityArchitectureResource.isLoaded()) {
			activityArchitecture = (ActivityArchitectureModel)activityArchitectureResource.getContents().get(0);
			relatedResources.add(activityArchitectureResource);
		} else if(selectedModelTypes.contains(SystemNature.DSL.SystemActivityArchitecture.name())
				|| selectedModelTypes.contains(SystemNature.DSL.CauseEffectChains.name())) 
		{
			activityArchitecture = createDefaultActivityArchitectureModel();
			activityArchitectureResource = createNewXtextResource(SystemNature.DSL.SystemActivityArchitecture.getInjector(), relatedResources);
			saveEMFModelInResource(activityArchitecture, activityArchitectureResource);
			relatedResources.add(activityArchitectureResource);
		}

		subMonitor.split(10);
		
		// now the SystemComponentArchitecture is either loaded from a project resource or a new default model is created on the fly
		Resource systemCompArchResource = loadEMFResource(SystemNature.DSL.SystemComponentArchitecture.getInjector());
		SystemComponentArchitecture systemCompArch = null;
		if(systemCompArchResource != null && systemCompArchResource.isLoaded()) {
			systemCompArch = (SystemComponentArchitecture)systemCompArchResource.getContents().get(0);
			relatedResources.add(systemCompArchResource);
		} else if(selectedModelTypes.contains(SystemNature.DSL.SystemComponentArchitecture.name())
				|| selectedModelTypes.contains(SystemNature.DSL.Deployment.name())
				|| selectedModelTypes.contains(SystemNature.DSL.SystemParameters.name())) 
		{
			systemCompArch = createDefaultComponentArchitectureModel(activityArchitecture);
			systemCompArchResource = createNewXtextResource(SystemNature.DSL.SystemComponentArchitecture.getInjector(), relatedResources);
			saveEMFModelInResource(systemCompArch, systemCompArchResource);
			relatedResources.add(systemCompArchResource);
		}
		
		// all the other model-types are created on demand
		for(String modelName: selectedModelTypes) {
			subMonitor.split(10);
			
			SystemNature.DSL dsl = SystemNature.DSL.valueOf(modelName);
			
			EObject model = null;
			switch(dsl) {
			case TargetPlatform : 
				model = createDefaultTargetPlatformModel();
				break;
			case Deployment : 
				model = createDefaultDeploymentModel(systemCompArch);
				break;
			case SystemParameters : 
				model = createDefaultSystemParameterModel(systemCompArch);
				break;
			case SystemDatasheet : 
				model = createDefaultSystemDatasheetModel();
				break;
			case CauseEffectChains :
				model = createDefaultCauseEffectChainsModel(activityArchitecture);
				break;
			default:
				//do nothing
			}

			if(model != null) {
				Resource resource = createNewXtextResource(dsl.getInjector(), relatedResources);
				saveEMFModelInResource(model, resource);
			}
		}
		
		subMonitor.done();
		
		return true;
	}
	
	@Override
	public void openSelectedModelsInEditor(IWorkbench workbench, List<String> selectedModelTypes) {
		IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
		for(String modelName: selectedModelTypes) {
			SystemNature.DSL dsl = SystemNature.DSL.valueOf(modelName);
			// only open textual files that do not have a graphical counterpart
			if(dsl.getSiriusViewpointName() == null) {
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

	private SystemComponentArchitecture createDefaultComponentArchitectureModel(ActivityArchitectureModel activityArch) {
		SystemComponentArchitecture model = ComponentArchitectureFactory.eINSTANCE.createSystemComponentArchitecture();
		model.setName(getProject().getName());
		if(activityArch != null) {
			model.setActivityArch(activityArch);
		}
		return model;
	}
	private TargetPlatformModel createDefaultTargetPlatformModel() {
		TargetPlatformModel model = TargetPlatformFactory.eINSTANCE.createTargetPlatformModel();
		model.setName(getProject().getName());
		return model;
	}
	private DeploymentModel createDefaultDeploymentModel(SystemComponentArchitecture compArch) {
		DeploymentModel model = DeploymentFactory.eINSTANCE.createDeploymentModel();
		model.setName(getProject().getName());
		model.setComponentArch(compArch);
		return model;
	}

	private SystemParamModel createDefaultSystemParameterModel(SystemComponentArchitecture compArch) {
		SystemParamModel model = SystemParameterFactory.eINSTANCE.createSystemParamModel();
		model.setName(getProject().getName());
		model.setSystem(compArch);
		return model;
	}

	private ActivityArchitectureModel createDefaultActivityArchitectureModel() {
		ActivityArchitectureModel model = ActivityArchitectureFactory.eINSTANCE.createActivityArchitectureModel();
		model.setName(getProject().getName());
		return model;
	}
	private CuaseEffectChainModel createDefaultCauseEffectChainsModel(ActivityArchitectureModel activityArch) {
		CuaseEffectChainModel model = CauseEffectChainFactory.eINSTANCE.createCuaseEffectChainModel();
		model.setName(getProject().getName());
		model.setActArch(activityArch);
		return model;
	}
	private SystemDatasheet createDefaultSystemDatasheetModel() {
		SystemDatasheet datasheet = SystemDatasheetFactory.eINSTANCE.createSystemDatasheet();
		datasheet.setName(getProject().getName());
		MandatoryDatasheetElement baseURI = GenericDatasheetFactory.eINSTANCE.createMandatoryDatasheetElement();
		baseURI.setName(MandatoryDatasheetElementNames.BASE_URI);
		baseURI.setValue("http://www.servicerobotik-ulm.de");
		datasheet.getElements().add(baseURI);
		MandatoryDatasheetElement short_description = GenericDatasheetFactory.eINSTANCE.createMandatoryDatasheetElement();
		short_description.setName(MandatoryDatasheetElementNames.SHORT_DESCRIPTION);
		short_description.setValue("TODO: add short description for "+getProject().getName()+" datasheet");
		datasheet.getElements().add(short_description);
		return datasheet;
	}
}
