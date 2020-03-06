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
package org.eclipse.smartmdsd.ui.natures;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class ToggleSmartMDSDNatureHandler extends AbstractHandler {
	public static final String NATURE_PARAMETER = "org.eclipse.smartmdsd.ui.natureParameter";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// the nature ID is provided as a command-parameter
		String natureId = event.getParameter(NATURE_PARAMETER);
		
		SmartMDSDNatureEnum natureEnum = SmartMDSDNatureEnum.getFromID(natureId);
		if(natureEnum != null) {
			ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
			if (currentSelection instanceof IStructuredSelection) {
				
				Object firstElement = ((IStructuredSelection) currentSelection).getFirstElement();
				
				// Get an IResource as an adapter from the current selection
				IAdapterManager adapterManager = Platform.getAdapterManager();
				IResource resource = adapterManager.getAdapter(firstElement, IResource.class);
				
				if (resource != null) {
					this.toggleNature(resource.getProject(), natureId, null);
				}
			}
		}
		return null;
	}
	
	private void toggleNature(final IProject project, final String natureId, IProgressMonitor monitor) {
		try {
			IProjectDescription description = project.getDescription();
			if(description.hasNature(natureId)) { // nature exists, so remove it
				SmartMDSDNatureHelpers.removeProjectNature(project, natureId, monitor);
			} else { // nature does not exist -> add it
				SmartMDSDNatureHelpers.addProjectNature(project, natureId, monitor);
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
}
