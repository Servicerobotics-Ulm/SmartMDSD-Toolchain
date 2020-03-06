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
package org.eclipse.smartmdsd.navigator.filters;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.PlatformUI;
import org.eclipse.smartmdsd.ui.perspectives.SmartMDSDPerspectiveEnum;

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
