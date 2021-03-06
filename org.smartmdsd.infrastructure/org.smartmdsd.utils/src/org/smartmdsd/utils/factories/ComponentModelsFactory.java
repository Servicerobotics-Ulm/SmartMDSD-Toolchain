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
import org.ecore.base.genericDatasheet.GenericDatasheetFactory;
import org.ecore.base.genericDatasheet.MandatoryDatasheetElement;
import org.ecore.base.genericDatasheet.MandatoryDatasheetElementNames;
import org.ecore.behavior.skillRealization.SkillRealizationFactory;
import org.ecore.behavior.skillRealization.SkillRealizationModel;
import org.ecore.component.componentDatasheet.ComponentDatasheet;
import org.ecore.component.componentDatasheet.ComponentDatasheetFactory;
import org.ecore.component.componentDefinition.ComponentDefModel;
import org.ecore.component.componentDefinition.ComponentDefinition;
import org.ecore.component.componentDefinition.ComponentDefinitionFactory;
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
		datasheet.setComponent(component);
		MandatoryDatasheetElement baseURI = GenericDatasheetFactory.eINSTANCE.createMandatoryDatasheetElement();
		baseURI.setName(MandatoryDatasheetElementNames.BASE_URI);
		baseURI.setValue("http://www.servicerobotik-ulm.de");
		datasheet.getElements().add(baseURI);
		MandatoryDatasheetElement short_description = GenericDatasheetFactory.eINSTANCE.createMandatoryDatasheetElement();
		short_description.setName(MandatoryDatasheetElementNames.SHORT_DESCRIPTION);
		short_description.setValue("TODO: add short description for "+component.getName()+" datasheet");
		datasheet.getElements().add(short_description);
		return datasheet;
	}
	
	public SkillRealizationModel createDefaultSkillRealizationModel() {
		SkillRealizationModel model = SkillRealizationFactory.eINSTANCE.createSkillRealizationModel();
		return model;
	}

}
