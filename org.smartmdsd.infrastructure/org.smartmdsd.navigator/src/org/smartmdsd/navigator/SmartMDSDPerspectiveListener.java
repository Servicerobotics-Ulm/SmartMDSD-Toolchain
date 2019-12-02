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
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveListener;
import org.eclipse.ui.IWorkbenchPage;
import org.smartmdsd.utils.perspectives.SmartMDSDPerspectiveEnum;

public class SmartMDSDPerspectiveListener implements IPerspectiveListener {

	private TreeViewer viewer;
	
	public SmartMDSDPerspectiveListener(TreeViewer viewer) {
		this.viewer = viewer;
	}
	
	@Override
	public void perspectiveActivated(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
		if(SmartMDSDPerspectiveEnum.getFromID(perspective.getId()) != null) {
			// the currently activated perspective is indeed one of the SmartMDSDPerspectives, so trigger refresh
			// a refresh will update the visible content in the viewer including the activated filters
			viewer.refresh();
		}
	}

	@Override
	public void perspectiveChanged(IWorkbenchPage page, IPerspectiveDescriptor perspective, String changeId) {
	}

}
