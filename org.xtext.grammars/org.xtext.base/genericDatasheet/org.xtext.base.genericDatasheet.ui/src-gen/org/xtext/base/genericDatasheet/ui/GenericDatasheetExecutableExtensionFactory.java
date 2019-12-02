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
package org.xtext.base.genericDatasheet.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.base.genericDatasheet.ui.internal.GenericDatasheetActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GenericDatasheetExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(GenericDatasheetActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		GenericDatasheetActivator activator = GenericDatasheetActivator.getInstance();
		return activator != null ? activator.getInjector(GenericDatasheetActivator.ORG_XTEXT_BASE_GENERICDATASHEET_GENERICDATASHEET) : null;
	}

}
