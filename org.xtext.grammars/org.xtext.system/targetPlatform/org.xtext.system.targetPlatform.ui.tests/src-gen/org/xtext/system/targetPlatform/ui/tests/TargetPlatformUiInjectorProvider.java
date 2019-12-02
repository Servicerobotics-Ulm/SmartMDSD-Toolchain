//================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartMDSD Toolchain V3. 
//
//================================================================
package org.xtext.system.targetPlatform.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.system.targetPlatform.ui.internal.TargetPlatformActivator;

public class TargetPlatformUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TargetPlatformActivator.getInstance().getInjector("org.xtext.system.targetPlatform.TargetPlatform");
	}

}
