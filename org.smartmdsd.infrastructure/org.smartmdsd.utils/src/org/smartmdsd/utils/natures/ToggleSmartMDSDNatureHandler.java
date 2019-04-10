//--------------------------------------------------------------------------
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
// Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
// 
// 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the 
//    documentation and/or other materials provided with the distribution.
// 
// 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this 
//    software without specific prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
// THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS 
// BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
// POSSIBILITY OF SUCH DAMAGE.
//
//--------------------------------------------------------------------------
package org.smartmdsd.utils.natures;

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
	public static final String NATURE_PARAMETER = "org.smartmdsd.utils.natureParameter";

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
