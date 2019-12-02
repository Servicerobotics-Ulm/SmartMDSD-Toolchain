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
package org.xtext.system.activityArchitecture.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.system.activityArchitecture.ui.internal.ActivityArchitectureActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ActivityArchitectureExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(ActivityArchitectureActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		ActivityArchitectureActivator activator = ActivityArchitectureActivator.getInstance();
		return activator != null ? activator.getInjector(ActivityArchitectureActivator.ORG_XTEXT_SYSTEM_ACTIVITYARCHITECTURE_ACTIVITYARCHITECTURE) : null;
	}

}
