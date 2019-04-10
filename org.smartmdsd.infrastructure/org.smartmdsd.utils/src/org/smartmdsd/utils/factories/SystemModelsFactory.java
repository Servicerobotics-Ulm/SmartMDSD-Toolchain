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
package org.smartmdsd.utils.factories;

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
import org.ecore.system.activityArchitecture.ActivityArchitectureFactory;
import org.ecore.system.activityArchitecture.ActivityArchitectureModel;
import org.ecore.system.causeEffectChain.CauseEffectChainFactory;
import org.ecore.system.causeEffectChain.CuaseEffectChainModel;
import org.ecore.system.componentArchitecture.ComponentArchitectureFactory;
import org.ecore.system.componentArchitecture.SystemComponentArchitecture;
import org.ecore.system.deployment.DeploymentFactory;
import org.ecore.system.deployment.DeploymentModel;
import org.ecore.system.systemParameter.SystemParamModel;
import org.ecore.system.systemParameter.SystemParameterFactory;
import org.ecore.system.targetPlatform.TargetPlatformFactory;
import org.ecore.system.targetPlatform.TargetPlatformModel;
import org.smartmdsd.utils.natures.SystemNature;

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
}
