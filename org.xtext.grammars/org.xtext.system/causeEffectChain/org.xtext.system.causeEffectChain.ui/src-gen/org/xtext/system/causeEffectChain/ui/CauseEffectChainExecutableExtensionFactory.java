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
package org.xtext.system.causeEffectChain.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.system.causeEffectChain.ui.internal.CauseEffectChainActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CauseEffectChainExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(CauseEffectChainActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		CauseEffectChainActivator activator = CauseEffectChainActivator.getInstance();
		return activator != null ? activator.getInjector(CauseEffectChainActivator.ORG_XTEXT_SYSTEM_CAUSEEFFECTCHAIN_CAUSEEFFECTCHAIN) : null;
	}

}
