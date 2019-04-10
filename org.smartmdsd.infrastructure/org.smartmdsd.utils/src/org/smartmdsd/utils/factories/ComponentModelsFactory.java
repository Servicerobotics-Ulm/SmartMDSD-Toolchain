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

import java.util.Collections;
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
import org.ecore.behavior.skillRealization.SkillRealizationFactory;
import org.ecore.behavior.skillRealization.SkillRealizationModel;
import org.ecore.component.componentDatasheet.ComponentDatasheet;
import org.ecore.component.componentDatasheet.ComponentDatasheetFactory;
import org.ecore.component.componentDefinition.ComponentDefModel;
import org.ecore.component.componentDefinition.ComponentDefinition;
import org.ecore.component.componentDefinition.ComponentDefinitionFactory;
import org.ecore.component.componentDocumentation.ComponentDocumentation;
import org.ecore.component.componentDocumentation.ComponentDocumentationFactory;
import org.ecore.component.componentParameter.ComponentParamModel;
import org.ecore.component.componentParameter.ComponentParameter;
import org.ecore.component.componentParameter.ComponentParameterFactory;
import org.smartmdsd.utils.natures.ComponentNature;

public class ComponentModelsFactory extends AbstractSelectedModelsFactory {
	
	public ComponentModelsFactory(final IProject project, final IFolder modelFolder) {
		super(project, modelFolder);
	}
	
	@Override
	public boolean createSelectedModels(List<String> selectedModelTypes, IProgressMonitor monitor) {
		Resource componentModelResource = loadEMFResource(ComponentNature.DSL.ComponentDefinition.getInjector());
		ComponentDefModel componentModel = null;
		if(componentModelResource != null && componentModelResource.isLoaded()) {
			componentModel = (ComponentDefModel)componentModelResource.getContents().get(0);
		} else {
			// component model resource does not exists -> we create a new default one
			componentModel = createDefaultComponentModel();
			componentModelResource = createNewXtextResource(ComponentNature.DSL.ComponentDefinition.getInjector(), null);
			saveEMFModelInResource(componentModel, componentModelResource);
		}
		
		List<Resource> relatedResources = Collections.singletonList(componentModelResource);
		for(String modelName: selectedModelTypes) {
			ComponentNature.DSL dsl = ComponentNature.DSL.valueOf(modelName);
			
			EObject model = null;
			switch(dsl) {
			case ComponentParameters : 
				model = createDefaultComponentParameterModel(componentModel.getComponent());
				break;
			case ComponentDatasheet : 
				model = createDefaultComponentDatasheetModel(componentModel.getComponent());
				break;
			case ComponentDocumentation : 
				model = createDefaultComponentDocumentationModel(componentModel.getComponent());
				break;
			case SkillRealization : 
				model = createDefaultSkillRealizationModel();
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
	
	@Override
	public void openSelectedModelsInEditor(IWorkbench workbench, List<String> selectedModelTypes) {
		IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
		for(String modelName: selectedModelTypes) {
			ComponentNature.DSL dsl = ComponentNature.DSL.valueOf(modelName);
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
	
	public ComponentDefModel createDefaultComponentModel() {
		ComponentDefModel model = ComponentDefinitionFactory.eINSTANCE.createComponentDefModel();
		ComponentDefinition component = ComponentDefinitionFactory.eINSTANCE.createComponentDefinition();
		component.setName(getProject().getName());
		component.setLogo("/"+getProject().getName()+"/model/logo.png");
		model.setComponent(component);
		return model;
	}
	
	public ComponentParamModel createDefaultComponentParameterModel(ComponentDefinition component) {
		ComponentParamModel model = ComponentParameterFactory.eINSTANCE.createComponentParamModel();
		ComponentParameter parameter = ComponentParameterFactory.eINSTANCE.createComponentParameter();
		parameter.setName(getProject().getName());
		parameter.setComponent(component);
		model.setParametrization(parameter);
		return model;
	}
	
	public ComponentDatasheet createDefaultComponentDatasheetModel(ComponentDefinition component) {
		ComponentDatasheet datasheet = ComponentDatasheetFactory.eINSTANCE.createComponentDatasheet();
		datasheet.setShortDescription("Datasheet for "+getProject().getName());
		datasheet.setBaseURI("http://www.servicerobotik-ulm.de");
		datasheet.setComponent(component);
		return datasheet;
	}

	public ComponentDocumentation createDefaultComponentDocumentationModel(ComponentDefinition component) {
		ComponentDocumentation docu = ComponentDocumentationFactory.eINSTANCE.createComponentDocumentation();
		docu.setComponent(component);
		return docu;
	}
	
	public SkillRealizationModel createDefaultSkillRealizationModel() {
		SkillRealizationModel model = SkillRealizationFactory.eINSTANCE.createSkillRealizationModel();
		return model;
	}

}
