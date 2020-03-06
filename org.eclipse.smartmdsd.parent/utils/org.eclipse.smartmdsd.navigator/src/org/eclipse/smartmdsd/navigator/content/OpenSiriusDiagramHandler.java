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
package org.eclipse.smartmdsd.navigator.content;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class OpenSiriusDiagramHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		ISelection selection = window.getSelectionService().getSelection();
		if(selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			Object firstElement = structuredSelection.getFirstElement();
	    	if(firstElement instanceof SiriusDiagramRepresentationItem) {
	    		SiriusDiagramRepresentationItem diagram = (SiriusDiagramRepresentationItem)firstElement;
	    		WorkspaceJob job = new WorkspaceJob("Open Diagram for " + diagram.getName()) {
					@Override
					public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
						IEditorPart editor = diagram.openDiagramEditor(monitor);
						if(editor == null) {
							// try reloading the diagram session and reopening the editor
							diagram.reloadDiagram(monitor);
							diagram.openDiagramEditor(monitor);
						}
						return Status.OK_STATUS;
					}
	    		};
	    		job.setRule(diagram.getContainer());
	    		job.schedule();
	    	}
		}
		return null;
	}

}
