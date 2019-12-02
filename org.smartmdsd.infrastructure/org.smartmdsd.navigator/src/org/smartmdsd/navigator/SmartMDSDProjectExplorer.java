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
package org.smartmdsd.navigator;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.ui.IPerspectiveListener;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonNavigator;
import org.smartmdsd.navigator.content.SiriusDiagramRepresentationDoubleClickListener;
import org.smartmdsd.utils.perspectives.AbstractSmartMDSDPerspective;

public class SmartMDSDProjectExplorer extends CommonNavigator {
	
	// the viewer ID is originally specified in the org.smartmdsd.utils plugin as it needs to be used there for proper prospective instantiation
	// the the org.smartmdsd.utils plugin cannot have a dependencies to this class as it would cause a cyclic dependency (therefore this somewhat
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
