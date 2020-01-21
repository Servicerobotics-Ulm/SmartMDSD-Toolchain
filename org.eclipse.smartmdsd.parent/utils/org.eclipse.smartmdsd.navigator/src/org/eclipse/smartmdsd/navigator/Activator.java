//==============================================================
//
// Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//      lotz@hs-ulm.de
//      stampfer@hs-ulm.de
//      lutz@hs-ulm.de
//
//      Servicerobotics Ulm
//      Christian Schlegel
//      Ulm University of Applied Sciences
//      Prittwitzstr. 10
//      89075 Ulm
//      Germany
//
// This file is part of the SmartSoft MDSD Toolchain v3. 
//
//==============================================================
package org.eclipse.smartmdsd.navigator;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.smartmdsd.navigator"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
