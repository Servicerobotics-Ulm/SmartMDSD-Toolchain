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
package org.smartmdsd.utils;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class SmartMDSDPreferencesPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public static final String PROP_MODEL_FOLDER = "ModelFolderName";
	public static final String PROP_IMPORTS_FOLDER = "ImportsFolderName";
	public static final String PROP_GENERATOR_FOLDER = "GeneratorFolderName";
	public static final String PROP_BUILD_FOLDER = "BuildFolderName";
	public static final String PROP_SHELL_COMMAND = "ShellCommand";
	public static final String PROP_SMART_ROOT = "SmartSoftRoot";
	public static final String PROP_CMAKE_COMMAND = "CMakeCommand";
	
	
	
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setMessage("SmartMDSD Preferences");
	}

	@Override
	protected void createFieldEditors() {
		
		addField(new StringFieldEditor(PROP_MODEL_FOLDER, "Default &Models Folder Name:", getFieldEditorParent()));
		addField(new StringFieldEditor(PROP_IMPORTS_FOLDER, "Default &Imports Folder Name:", getFieldEditorParent()));
		addField(new StringFieldEditor(PROP_GENERATOR_FOLDER, "Default &Generation Folder Name:", getFieldEditorParent()));
		addField(new StringFieldEditor(PROP_BUILD_FOLDER, "Default &Build Folder Name:", getFieldEditorParent()));
		
		addField(new StringFieldEditor(PROP_BUILD_FOLDER, "Default S&hell Command:", getFieldEditorParent()));
		
		addField(new VariablesAndDirectoryFieldEditor(PROP_SMART_ROOT, "&SmartSoft Root:",
		        getFieldEditorParent()));
		addField(new VariablesAndFileFieldEditor(PROP_CMAKE_COMMAND, "&CMake Executable:",
		        getFieldEditorParent()));
	}

}
