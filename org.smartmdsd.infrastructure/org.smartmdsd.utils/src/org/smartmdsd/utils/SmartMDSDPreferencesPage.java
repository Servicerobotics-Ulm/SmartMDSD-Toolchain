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
package org.smartmdsd.utils;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class SmartMDSDPreferencesPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public static final String PROP_MODELS_FOLDER = "ModelsFolderName";
	public static final String PROP_IMPORTS_FOLDER = "ImportsFolderName";
	public static final String PROP_GENERATOR_FOLDER = "GeneratorFolderName";
	public static final String PROP_BUILD_FOLDER = "BuildFolderName";
	public static final String PROP_SHELL_COMMAND = "ShellCommand";
	public static final String PROP_SMART_ROOT = "SmartSoftRoot";
	public static final String PROP_CMAKE_COMMAND = "CMakeCommand";
	public static final String PROP_CMAKE_BUILD_TYPE = "CMakeBuildType";
	public static final String PROP_ROS_DISTRIBUTION_DIR = "ROSDistributionDir";
	
	
	
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setMessage("SmartMDSD Preferences");
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor(PROP_SHELL_COMMAND, "Default S&hell Command:", getFieldEditorParent()));
		
		addField(new StringFieldEditor(PROP_MODELS_FOLDER, "Default &Models Folder Name:", getFieldEditorParent()));
		addField(new StringFieldEditor(PROP_IMPORTS_FOLDER, "Default &Imports Folder Name:", getFieldEditorParent()));
		addField(new StringFieldEditor(PROP_GENERATOR_FOLDER, "Default &Generation Folder Name:", getFieldEditorParent()));
		addField(new StringFieldEditor(PROP_BUILD_FOLDER, "Default &Build Folder Name:", getFieldEditorParent()));
		
		addField(new RadioGroupFieldEditor(PROP_CMAKE_BUILD_TYPE, "Default CMake Build &Type:", 1,
				new String[][] { {"Debug Build Type", "Debug"}, {"Release Build Type", "Release"}},
				getFieldEditorParent()));
		
		addField(new VariablesAndDirectoryFieldEditor(PROP_SMART_ROOT, "&SmartSoft Root:",
		        getFieldEditorParent()));
		addField(new VariablesAndFileFieldEditor(PROP_CMAKE_COMMAND, "&CMake Executable:",
		        getFieldEditorParent()));
		
		addField(new DirectoryFieldEditor(PROP_ROS_DISTRIBUTION_DIR, "&ROS Distribution Directory:",
		        getFieldEditorParent()));
	}

}
