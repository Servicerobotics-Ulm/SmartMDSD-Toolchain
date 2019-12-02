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
package org.xtext.system.activityArchitecture.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.system.activityArchitecture.ui.internal.ActivityArchitectureActivator;

public class ActivityArchitectureUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ActivityArchitectureActivator.getInstance().getInjector("org.xtext.system.activityArchitecture.ActivityArchitecture");
	}

}
