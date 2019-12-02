//================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
package org.xtext.base.genericDatasheet.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.base.genericDatasheet.ui.internal.GenericDatasheetActivator;

public class GenericDatasheetUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return GenericDatasheetActivator.getInstance().getInjector("org.xtext.base.genericDatasheet.GenericDatasheet");
	}

}
