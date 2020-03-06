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
package org.eclipse.smartmdsd.ui.linux;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class OpenDebianTerminalCommand extends AbstractHandler {
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
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		// try getting a project from a selection in the project-explorer
		IResource currentResource = getSelectedResource(window);
		if(currentResource != null) {
			final ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
			final ILaunchConfigurationType terminalLauncher = launchManager.getLaunchConfigurationType(DebianTerminalLauncher.LAUNCHER_ID);
			final IProject project = currentResource.getProject();
			WorkspaceJob openTerminalJob = new WorkspaceJob(""){
				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
					ILaunchConfigurationWorkingCopy terminalLauncherConfiguration = terminalLauncher.newInstance(project, project.getName());
					// the only mandatory parameter is the current project name
					terminalLauncherConfiguration.setAttribute(DebianTerminalLauncher.ATTR_PROJECT_NAME, project.getName());
					
					String workingDir = currentResource.getProjectRelativePath().toString();
					terminalLauncherConfiguration.setAttribute(DebianTerminalLauncher.ATTR_WORKING_DIR, workingDir);
					
					// execute launch file
					terminalLauncherConfiguration.launch(ILaunchManager.RUN_MODE, monitor);
					return Status.OK_STATUS;
				}
			};
			openTerminalJob.schedule();
		}
		return null;
	}

}
