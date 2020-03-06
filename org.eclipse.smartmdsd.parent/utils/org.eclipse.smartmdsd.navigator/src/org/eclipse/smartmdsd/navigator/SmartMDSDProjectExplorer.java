/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.navigator;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.ui.IPerspectiveListener;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.smartmdsd.navigator.content.SiriusDiagramRepresentationDoubleClickListener;
import org.eclipse.smartmdsd.ui.perspectives.AbstractSmartMDSDPerspective;

public class SmartMDSDProjectExplorer extends CommonNavigator {
	
	// the viewer ID is originally specified in the org.eclipse.smartmdsd.utils plugin as it needs to be used there for proper prospective instantiation
	// the the org.eclipse.smartmdsd.utils plugin cannot have a dependencies to this class as it would cause a cyclic dependency (therefore this somewhat
	// strange re-definition)
	public static final String VIEWER_ID = AbstractSmartMDSDPerspective.NAVIGATOR_VIEW_ID;
	
	private IPerspectiveListener perspectiveChangeListener;
	
	@Override
	protected void initListeners(TreeViewer viewer) {
		super.initListeners(viewer);
		
		viewer.addDoubleClickListener(new SiriusDiagramRepresentationDoubleClickListener());
		
		perspectiveChangeListener = new SmartMDSDPerspectiveListener(viewer);
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().addPerspectiveListener(perspectiveChangeListener);
	}
	
	@Override
	public void dispose() {
		super.dispose();
		
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().removePerspectiveListener(perspectiveChangeListener);
	}
}
