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
import org.ecore.service.communicationObject.CommObjectModel;
import org.ecore.service.communicationObject.CommObjectsRepository;
import org.ecore.service.communicationObject.CommunicationObjectFactory;
import org.ecore.service.componentMode.ComponentModeFactory;
import org.ecore.service.componentMode.ComponentModeModel;
import org.ecore.service.componentMode.ComponentModeRepository;
import org.ecore.service.domainModelsDatasheet.DomainModelsDatasheet;
import org.ecore.service.domainModelsDatasheet.DomainModelsDatasheetFactory;
import org.ecore.service.parameterDefinition.ParamDefModel;
import org.ecore.service.parameterDefinition.ParameterDefinitionFactory;
import org.ecore.service.parameterDefinition.ParameterSetRepository;
import org.ecore.service.serviceDefinition.ServiceDefModel;
import org.ecore.service.serviceDefinition.ServiceDefRepository;
import org.ecore.service.serviceDefinition.ServiceDefinitionFactory;
import org.ecore.service.serviceDefinition.ServiceRepoVersion;
import org.ecore.service.skillDefinition.SkillDefinitionFactory;
import org.ecore.service.skillDefinition.SkillDefinitionModel;
import org.ecore.service.skillDefinition.SkillDefinitionRepository;
import org.ecore.base.genericDatasheet.GenericDatasheetFactory;
import org.ecore.base.genericDatasheet.MandatoryDatasheetElement;
import org.ecore.base.genericDatasheet.MandatoryDatasheetElementNames;
import org.ecore.behavior.taskDefinition.TaskDefinitionFactory;
import org.ecore.behavior.taskDefinition.TaskDefinitionModel;
import org.ecore.behavior.taskDefinition.TaskDefinitionRepository;
import org.smartmdsd.utils.natures.DomainModelsNature;

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
		org.ecore.service.communicationObject.Version version = CommunicationObjectFactory.eINSTANCE.createVersion();
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
