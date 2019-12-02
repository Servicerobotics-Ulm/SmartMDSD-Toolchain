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
package org.xtext.component.componentParameter.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.component.componentParameter.ui.internal.ComponentParameterActivator;

public class ComponentParameterUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ComponentParameterActivator.getInstance().getInjector("org.xtext.component.componentParameter.ComponentParameter");
	}

}
