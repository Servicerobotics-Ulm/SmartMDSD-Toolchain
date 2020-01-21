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
package org.eclipse.smartmdsd.ui.preferences;

import java.io.File;

import org.eclipse.smartmdsd.ui.Activator;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class SmartMDSDPreferencesDefaults extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		store.setDefault(SmartMDSDPreferencesPage.PROP_MODELS_FOLDER, "model");
		store.setDefault(SmartMDSDPreferencesPage.PROP_IMPORTS_FOLDER, "imports");
		store.setDefault(SmartMDSDPreferencesPage.PROP_GENERATOR_FOLDER, "smartsoft");
		store.setDefault(SmartMDSDPreferencesPage.PROP_BUILD_FOLDER, "build");
		store.setDefault(SmartMDSDPreferencesPage.PROP_SHELL_COMMAND, "bash");
		
		String smartRoot = System.getenv("SMART_ROOT_ACE");
		if(smartRoot != null) {
			store.setDefault(SmartMDSDPreferencesPage.PROP_SMART_ROOT, "${env_var:SMART_ROOT_ACE}");
		} else {
			store.setDefault(SmartMDSDPreferencesPage.PROP_SMART_ROOT, System.getProperty("java.io.tmpdir"));
		}

		store.setDefault(SmartMDSDPreferencesPage.PROP_CMAKE_COMMAND, "${system_path:cmake}");
		
		store.setDefault(SmartMDSDPreferencesPage.PROP_CMAKE_BUILD_TYPE, "Debug");
		
		File ros_dir = new File("/opt/ros");
		if(ros_dir.exists()) {
			File[] ros_distros = ros_dir.listFiles(File::isDirectory);
			if(ros_distros.length > 0) {
				store.setDefault(SmartMDSDPreferencesPage.PROP_ROS_DISTRIBUTION_DIR, ros_distros[0].getPath());
			}
		}
	}

}
