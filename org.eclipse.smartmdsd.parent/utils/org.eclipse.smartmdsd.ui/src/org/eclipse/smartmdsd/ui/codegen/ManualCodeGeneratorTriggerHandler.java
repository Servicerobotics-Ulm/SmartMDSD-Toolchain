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
package org.eclipse.smartmdsd.ui.codegen;

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
			ManualCodeGeneratorWorkspaceJob codeGeneratorJob = new ManualCodeGeneratorWorkspaceJob(currentResource, window);
			codeGeneratorJob.schedule();
		}
		return Status.OK_STATUS;
	}
}
