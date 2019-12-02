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
import org.xtext.behavior.taskRealization.ui.internal.TaskRealizationActivator;

import com.google.inject.Injector;

public class BehaviorNature extends AbstractSmartMDSDNature {

	public static final String NATURE_ID = "org.smartmdsd.utils.natures.BehaviorNature";
	
	public enum DSL implements LanguageInterface {
		TaskRealization (TaskRealizationActivator.ORG_XTEXT_BEHAVIOR_TASKREALIZATION_TASKREALIZATION)
		;

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
		public Injector getInjector() {
			switch (this) {
			case TaskRealization:
				return TaskRealizationActivator.getInstance().getInjector(languageID);
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
			return null;
		}

		@Override
		public String getKey() {
			return this.name();
		}

		@Override
		public boolean isDefaultLanguage() {
			switch (this) {
			case TaskRealization: 
				return true;
			default:
				return false;
			}
		}
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
	public LanguageInterface getLanguageInterfaceOf(String languageName) {
		return DSL.valueOf(languageName);
	}

	@Override
	public List<String> getImportedProjectNatureIds() {
		return Arrays.asList(DomainModelsNature.NATURE_ID);
	}
	
	@Override
	public LanguageInterface[] getAllSupportedLanguages() {
		return DSL.values();
	}
}
