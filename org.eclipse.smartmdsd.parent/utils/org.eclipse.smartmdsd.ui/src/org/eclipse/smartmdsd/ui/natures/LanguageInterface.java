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
package org.eclipse.smartmdsd.ui.natures;

import com.google.inject.Injector;

public interface LanguageInterface {
	public String getLanguageID();
	public String getKey();
	public Injector getInjector();
	public String getModelFileExtension();
	public String getSiriusViewpointName();
	public boolean isDefaultLanguage();
}

