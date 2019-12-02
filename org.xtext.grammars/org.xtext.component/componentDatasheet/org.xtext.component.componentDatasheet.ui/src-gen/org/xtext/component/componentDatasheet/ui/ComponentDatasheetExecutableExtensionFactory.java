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
package org.xtext.component.componentDatasheet.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.component.componentDatasheet.ui.internal.ComponentDatasheetActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ComponentDatasheetExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(ComponentDatasheetActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		ComponentDatasheetActivator activator = ComponentDatasheetActivator.getInstance();
		return activator != null ? activator.getInjector(ComponentDatasheetActivator.ORG_XTEXT_COMPONENT_COMPONENTDATASHEET_COMPONENTDATASHEET) : null;
	}

}
