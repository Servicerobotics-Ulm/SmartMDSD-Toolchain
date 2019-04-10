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
package org.smartmdsd.utils.codegen;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * This class implements a generic code generator for SmartMDSD project types (specified by the related SmartMDSD project nature, 
 * see classes derived from AbstractSmartMDSDNature).
 * 
 * @author alex-lotz
 *
 */
public class ManualCodeGeneratorTriggerHandler extends AbstractHandler {

	public IResource getSelectedResource(IWorkbenchWindow window) {
		ISelection selection = window.getSelectionService().getSelection();
		if(selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			Object firstElement = structuredSelection.getFirstElement();
			if(firstElement instanceof IResource) {
				return (IResource)firstElement;
			} else if(firstElement instanceof IProjectNature) {
				IProjectNature projNature = (IProjectNature)firstElement;
				return projNature.getProject();
			}
		}
		return null;
	}
	
	public IProject getProjectFromDialog(IWorkbenchWindow window) {
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				window.getShell(),
				new WorkbenchLabelProvider()
				);
		IStructuredContentProvider contentProvider = new BaseWorkbenchContentProvider();
		dialog.setElements(contentProvider.getElements(ResourcesPlugin.getWorkspace().getRoot()));
		dialog.setTitle("Select the Project for Code Generation");
		if(dialog.open() == Window.OK) {
			return (IProject)dialog.getFirstResult();
		}
		return null;
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		// try getting a project from a selection in the project-explorer
		IResource currentResource = getSelectedResource(window);
		if(currentResource == null) {
			currentResource = getProjectFromDialog(window);
		}
		if(currentResource != null) {
			ManualCodeGeneratorWorkspaceJob codeGeneratorJob = new ManualCodeGeneratorWorkspaceJob(currentResource);
			try {
				window.getActivePage().showView(IConsoleConstants.ID_CONSOLE_VIEW);
			} catch (PartInitException e) {
				e.printStackTrace();
			}
			codeGeneratorJob.schedule();
		}
		return Status.OK_STATUS;
	}
}
