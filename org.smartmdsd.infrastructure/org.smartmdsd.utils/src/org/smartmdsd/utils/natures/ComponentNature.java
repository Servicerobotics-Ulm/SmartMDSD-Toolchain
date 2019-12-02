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
import org.xtext.component.componentDatasheet.ui.internal.ComponentDatasheetActivator;
import org.xtext.component.componentDefinition.ui.internal.ComponentDefinitionActivator;
import org.xtext.component.componentParameter.ui.internal.ComponentParameterActivator;
import org.xtext.behavior.skillRealization.ui.internal.SkillRealizationActivator;

import com.google.inject.Injector;

public class ComponentNature extends AbstractSmartMDSDNature {
	public static final String NATURE_ID = "org.smartmdsd.utils.natures.ComponentNature";

	public enum DSL implements LanguageInterface {
		ComponentDefinition (ComponentDefinitionActivator.ORG_XTEXT_COMPONENT_COMPONENTDEFINITION_COMPONENTDEFINITION),
		ComponentParameters (ComponentParameterActivator.ORG_XTEXT_COMPONENT_COMPONENTPARAMETER_COMPONENTPARAMETER),
		ComponentDatasheet (ComponentDatasheetActivator.ORG_XTEXT_COMPONENT_COMPONENTDATASHEET_COMPONENTDATASHEET),
		SkillRealization (SkillRealizationActivator.ORG_XTEXT_BEHAVIOR_SKILLREALIZATION_SKILLREALIZATION);
		
		
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
			switch (this) {
			case ComponentDefinition:
				return ComponentDefinitionActivator.getInstance().getInjector(languageID);
			case ComponentParameters:
				return ComponentParameterActivator.getInstance().getInjector(languageID);
			case ComponentDatasheet:
				return ComponentDatasheetActivator.getInstance().getInjector(languageID);
			case SkillRealization:
				return SkillRealizationActivator.getInstance().getInjector(languageID);
			// add further cases when new languages appear
			default:
				return null;	
			}
		}
		
		@Override
		public String getModelFileExtension() {
			return getInjector().getInstance(FileExtensionProvider.class).getPrimaryFileExtension();
		}
		
		// this map collects the Sirius Diagram Viewpoint names for the related languages
		private static final Map<String, String> siriusViewpoints = new HashMap<String, String>();
		static {
			siriusViewpoints.put(ComponentDefinition.languageID, "ComponentDefinitionViewpoint");
		}
		
		@Override
		public String getSiriusViewpointName() {
			return siriusViewpoints.get(languageID);
		}

		@Override
		public boolean isDefaultLanguage() {
			switch (this) {
			case ComponentDefinition: 
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
