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
package org.eclipse.smartmdsd.ui.natures;

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
import org.eclipse.smartmdsd.xtext.service.communicationObject.ui.internal.CommunicationObjectActivator;
import org.eclipse.smartmdsd.xtext.service.componentMode.ui.internal.ComponentModeActivator;
import org.eclipse.smartmdsd.xtext.service.domainModelsDatasheet.ui.internal.DomainModelsDatasheetActivator;
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.ui.internal.ParameterDefinitionActivator;
import org.eclipse.smartmdsd.xtext.service.serviceDefinition.ui.internal.ServiceDefinitionActivator;
import org.eclipse.smartmdsd.xtext.service.skillDefinition.ui.internal.SkillDefinitionActivator;
import org.eclipse.smartmdsd.xtext.behavior.taskDefinition.ui.internal.TaskDefinitionActivator;


import com.google.inject.Injector;

public class DomainModelsNature extends AbstractSmartMDSDNature {
	public static final String NATURE_ID = "org.eclipse.smartmdsd.ui.natures.DomainModelsNature";
	
	public enum DSL implements LanguageInterface {
		ServiceDefinition (ServiceDefinitionActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_SERVICE_SERVICEDEFINITION_SERVICEDEFINITION),
		CommunicationObjects (CommunicationObjectActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_SERVICE_COMMUNICATIONOBJECT_COMMUNICATIONOBJECT),
		ParameterDefinition (ParameterDefinitionActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_SERVICE_PARAMETERDEFINITION_PARAMETERDEFINITION),
		ComponentModeDefinition (ComponentModeActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_SERVICE_COMPONENTMODE_COMPONENTMODE),
		DomainModelsDatasheet (DomainModelsDatasheetActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_SERVICE_DOMAINMODELSDATASHEET_DOMAINMODELSDATASHEET),
		SkillDefinition (SkillDefinitionActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_SERVICE_SKILLDEFINITION_SKILLDEFINITION),
		TaskDefinition (TaskDefinitionActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_BEHAVIOR_TASKDEFINITION_TASKDEFINITION);
		
		
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
