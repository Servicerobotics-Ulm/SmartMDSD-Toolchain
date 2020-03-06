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
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectModel;
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectsRepository;
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectFactory;
import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeFactory;
import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeModel;
import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeRepository;
import org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.DomainModelsDatasheet;
import org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.DomainModelsDatasheetFactory;
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParamDefModel;
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionFactory;
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetRepository;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionFactory;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceRepoVersion;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionFactory;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionModel;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionRepository;
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetFactory;
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElement;
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElementNames;
import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionFactory;
import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionModel;
import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionRepository;
import org.eclipse.smartmdsd.ui.natures.DomainModelsNature;

public class DomainModelsFactory extends AbstractSelectedModelsFactory {
	public DomainModelsFactory(final IProject project, final IFolder modelFolder) {
		super(project, modelFolder);
	}
	
	@Override
	public boolean createSelectedModels(List<String> selectedModelTypes, IProgressMonitor monitor) {
		List<Resource> relatedResources = null;
		for(String modelName: selectedModelTypes) {
			DomainModelsNature.DSL dsl = DomainModelsNature.DSL.valueOf(modelName);
			
			EObject model = null;
			switch(dsl) {
			case CommunicationObjects : 
				model = createDefaultCommObjectsModel();
				break;
			case ServiceDefinition : 
				model = createDefaultServiceDefinitionModel();
				break;
			case ComponentModeDefinition : 
				model = createDefaultComponentModesModel();
				break;
			case ParameterDefinition : 
				model = createDefaultParametersModel();
				break;
			case DomainModelsDatasheet : 
				model = createDefaultDomainModelsDatasheet();
				break;
			case SkillDefinition :
				model = createDefaultSkillDefinitionModel();
				break;
			case TaskDefinition : 
				model = createDefaultTaskDefinitionModel();
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
	
	private EObject createDefaultTaskDefinitionModel() {
		// we use the Factory methods (instead of plain text) as this is checked by the compiler and is more robust in case of model updates
		TaskDefinitionModel model = TaskDefinitionFactory.eINSTANCE.createTaskDefinitionModel();
		TaskDefinitionRepository repo = TaskDefinitionFactory.eINSTANCE.createTaskDefinitionRepository();
		repo.setName(getProject().getName());
		model.setRepository(repo);
		return model;
	}

	private EObject createDefaultSkillDefinitionModel() {
		// we use the Factory methods (instead of plain text) as this is checked by the compiler and is more robust in case of model updates
		SkillDefinitionModel model = SkillDefinitionFactory.eINSTANCE.createSkillDefinitionModel();
		SkillDefinitionRepository repo = SkillDefinitionFactory.eINSTANCE.createSkillDefinitionRepository();
		repo.setName(getProject().getName());
		model.setRepository(repo);
		return model;
	}

	@Override
	public void openSelectedModelsInEditor(IWorkbench workbench, List<String> selectedModelTypes) {
		IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
		for(String modelName: selectedModelTypes) {
			DomainModelsNature.DSL dsl = DomainModelsNature.DSL.valueOf(modelName);
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
	
	public CommObjectModel createDefaultCommObjectsModel() {
		// we use the Factory methods (instead of plain text) as this is checked by the compiler and is more robust in case of model updates
		CommObjectModel model = CommunicationObjectFactory.eINSTANCE.createCommObjectModel();
		CommObjectsRepository repo = CommunicationObjectFactory.eINSTANCE.createCommObjectsRepository();
		repo.setName(getProject().getName());
		org.eclipse.smartmdsd.ecore.service.communicationObject.Version version = CommunicationObjectFactory.eINSTANCE.createVersion();
		version.setMajor(1);
		version.setMinor(0);
		repo.setVersion(version);
		model.setRepository(repo);
		return model;
	}
	
	public ServiceDefModel createDefaultServiceDefinitionModel() {
		// we use the Factory methods (instead of plain text) as this is checked by the compiler and is more robust in case of model updates
		ServiceDefModel model = ServiceDefinitionFactory.eINSTANCE.createServiceDefModel();
		ServiceDefRepository repo = ServiceDefinitionFactory.eINSTANCE.createServiceDefRepository();
		repo.setName(getProject().getName());
		ServiceRepoVersion version = ServiceDefinitionFactory.eINSTANCE.createServiceRepoVersion();
		version.setMajor(1);
		version.setMinor(0);
		repo.setVersion(version);
		model.setRepository(repo);
		return model;
	}
	
	public ComponentModeModel createDefaultComponentModesModel() {
		// we use the Factory methods (instead of plain text) as this is checked by the compiler and is more robust in case of model updates
		ComponentModeModel model = ComponentModeFactory.eINSTANCE.createComponentModeModel();
		ComponentModeRepository repo = ComponentModeFactory.eINSTANCE.createComponentModeRepository();
		repo.setName(getProject().getName());
		model.setRepository(repo);
		return model;
	}
	
	public ParamDefModel createDefaultParametersModel() {
		// we use the Factory methods (instead of plain text) as this is checked by the compiler and is more robust in case of model updates
		ParamDefModel model = ParameterDefinitionFactory.eINSTANCE.createParamDefModel();
		ParameterSetRepository repo = ParameterDefinitionFactory.eINSTANCE.createParameterSetRepository();
		repo.setName(getProject().getName());
		model.setRepository(repo);
		return model;
	}
	
	public DomainModelsDatasheet createDefaultDomainModelsDatasheet() {
		DomainModelsDatasheet datasheet = DomainModelsDatasheetFactory.eINSTANCE.createDomainModelsDatasheet();
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
