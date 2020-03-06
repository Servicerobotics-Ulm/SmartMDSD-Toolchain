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
package org.eclipse.smartmdsd.ui.deployment;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class DeploymentActionHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IResource resource = getSelectedResource(workbenchWindow);
		if(resource != null) {
			final IProject project = resource.getProject();
			// get luncher type for executing external programs in Eclipse
			final ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
			final ILaunchConfigurationType deploymentLauncher = launchManager.getLaunchConfigurationType(DeplyomentLauncher.LAUNCHER_ID);
			Job job = new Job("DeploymentJob") {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					try {
						String launcherName = project.getName();
						ILaunchConfigurationWorkingCopy deploymentLauncherConfiguration = deploymentLauncher.newInstance(project, launcherName);
						// the only mandatory parameter is the current project name
						deploymentLauncherConfiguration.setAttribute(DeplyomentLauncher.ATTR_PROJECT_NAME, project.getName());
						// execute launch file
						deploymentLauncherConfiguration.launch(ILaunchManager.RUN_MODE, monitor);
					} catch (CoreException e) {
						e.printStackTrace();
					}
					return Status.OK_STATUS;
				}
			};
			// Initiate the Job (will run in background)
			job.schedule();
		} else {
			System.out.println("Skip deployment-action, beacause a project could not be derived from the current selection");
		}
		return null;
	}
	
	private IResource getSelectedResource(IWorkbenchWindow window) {
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
}
