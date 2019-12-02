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
package org.smartmdsd.navigator.filters;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.PlatformUI;
import org.smartmdsd.utils.perspectives.SmartMDSDPerspectiveEnum;

public class SmartMDSDPerspectiveBasedProjectFilter extends ViewerFilter {

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		IPerspectiveDescriptor perspective = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getPerspective();
		if(perspective != null) {
			if(parentElement instanceof IWorkspaceRoot && element instanceof IProject) {
				IProject project = (IProject)element;
				if(project.isOpen()) {
					SmartMDSDPerspectiveEnum perspectiveEnum = SmartMDSDPerspectiveEnum.getFromID(perspective.getId());
					if(perspectiveEnum != null) {
						String relatedNatureId = perspectiveEnum.getRelatedSmartMDSDNature().getId();
						try {
							return project.hasNature(relatedNatureId);
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return true;
	}

}
