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
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.smartmdsd.ui.perspectives.SmartMDSDPerspectiveEnum;

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
