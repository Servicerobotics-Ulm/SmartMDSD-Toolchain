//--------------------------------------------------------------------------
//
//  Copyright (C) 2016 Alex Lotz
//
//        lotz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//  This library is free software; you can redistribute it and/or
//  modify it under the terms of the GNU Lesser General Public
//  License as published by the Free Software Foundation; either
//  version 2.1 of the License, or (at your option) any later version.
//
//  This library is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//  Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public
//  License along with this library; if not, write to the Free Software
//  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
//--------------------------------------------------------------------------

package org.smartsoft.utils;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class SmartSoftDefaultPreferences extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		String smartRoot = System.getenv("SMART_ROOT_ACE");
		if(smartRoot != null) {
			store.setDefault("SmartSoftRoot", "${env_var:SMART_ROOT_ACE}");
		} else {
			store.setDefault("SmartSoftRoot", System.getProperty("java.io.tmpdir"));
		}

		store.setDefault("CMakeCommand", "${system_path:cmake}");
	}

}
