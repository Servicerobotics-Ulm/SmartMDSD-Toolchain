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
package org.smartmdsd.utils.natures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.xtext.service.communicationObject.ui.internal.CommunicationObjectActivator;
import org.xtext.service.componentMode.ui.internal.ComponentModeActivator;
import org.xtext.service.domainModelsDatasheet.ui.internal.DomainModelsDatasheetActivator;
import org.xtext.service.parameterDefinition.ui.internal.ParameterDefinitionActivator;
import org.xtext.service.serviceDefinition.ui.internal.ServiceDefinitionActivator;
import org.xtext.service.skillDefinition.ui.internal.SkillDefinitionActivator;
import org.xtext.behavior.taskDefinition.ui.internal.TaskDefinitionActivator;


import com.google.inject.Injector;

public class DomainModelsNature extends AbstractSmartMDSDNature {
	public static final String NATURE_ID = "org.smartmdsd.utils.natures.DomainModelsNature";
	
	public enum DSL implements LanguageInterface {
		ServiceDefinition (ServiceDefinitionActivator.ORG_XTEXT_SERVICE_SERVICEDEFINITION_SERVICEDEFINITION),
		CommunicationObjects (CommunicationObjectActivator.ORG_XTEXT_SERVICE_COMMUNICATIONOBJECT_COMMUNICATIONOBJECT),
		ParameterDefinition (ParameterDefinitionActivator.ORG_XTEXT_SERVICE_PARAMETERDEFINITION_PARAMETERDEFINITION),
		ComponentModeDefinition (ComponentModeActivator.ORG_XTEXT_SERVICE_COMPONENTMODE_COMPONENTMODE),
		DomainModelsDatasheet (DomainModelsDatasheetActivator.ORG_XTEXT_SERVICE_DOMAINMODELSDATASHEET_DOMAINMODELSDATASHEET),
		SkillDefinition (SkillDefinitionActivator.ORG_XTEXT_SERVICE_SKILLDEFINITION_SKILLDEFINITION),
		TaskDefinition (TaskDefinitionActivator.ORG_XTEXT_BEHAVIOR_TASKDEFINITION_TASKDEFINITION);
		
		
		// Reverse-lookup map for getting a language enum from a String languageId
		private static final Map<String, DSL> lookup = new HashMap<String, DSL>();
		static {
	        for (DSL lang : DSL.values()) {
	            lookup.put(lang.getLanguageID(), lang);
	        }
	    }
		// static factory method to construct a LANGUAGES enum element from a full languageID
		public static DSL getFromID(String languageID) {
	        return lookup.get(languageID);
	    }
		
		// private internal value representation as String
		private String languageID;
		// private constructor only used by the enum itself
		private DSL(String languageID) {
			this.languageID = languageID;
		}
		
		
		@Override
		public String getLanguageID() {
			return languageID;
		}
		
		@Override
		public String getKey() {
			return this.name();
		}
		
		@Override
		public Injector getInjector() {
			switch(this) {
			case ServiceDefinition:
				return ServiceDefinitionActivator.getInstance().getInjector(languageID);
			case CommunicationObjects:
				return CommunicationObjectActivator.getInstance().getInjector(languageID);
			case ParameterDefinition:
				return ParameterDefinitionActivator.getInstance().getInjector(languageID);
			case ComponentModeDefinition:
				return ComponentModeActivator.getInstance().getInjector(languageID);
			case DomainModelsDatasheet:
				return DomainModelsDatasheetActivator.getInstance().getInjector(languageID);
			case SkillDefinition:
				return SkillDefinitionActivator.getInstance().getInjector(languageID);
			case TaskDefinition:
				return TaskDefinitionActivator.getInstance().getInjector(languageID);
			// add further cases when new languages appear
			default:
				return null;
			}
		}
		
		@Override
		public String getModelFileExtension() {
			return getInjector().getInstance(FileExtensionProvider.class).getPrimaryFileExtension();
		}
		
		@Override
		public String getSiriusViewpointName() {
			// DomainModels so far do not use graphical editors
			return null;
		}
		
		@Override
		public boolean isDefaultLanguage() {
			switch (this) {
			case ServiceDefinition:
			case CommunicationObjects:
			case ParameterDefinition:
				return true;
			default:
				return false;
			}
		}
	}
	
	@Override
	public LanguageInterface getLanguageInterfaceOf(String languageName) {
		return DSL.valueOf(languageName);
	}
	
	@Override
	public LanguageInterface getLanguageInterfaceFrom(IResource modelResource) {
		try {
			IProject project = modelResource.getProject();
			if(project.hasNature(NATURE_ID)) {
				IEditorRegistry editorRegistry = PlatformUI.getWorkbench().getEditorRegistry();
				IEditorDescriptor editor = editorRegistry.getDefaultEditor(modelResource.getName());
				if(editor != null) {
					// this can be null if resource-type is unknown
					return DSL.getFromID(editor.getId());
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public LanguageInterface[] getAllSupportedLanguages() {
		return DSL.values();
	}
	
	@Override
	public List<String> getImportedProjectNatureIds() {
		return Arrays.asList(DomainModelsNature.NATURE_ID);
	}
}
