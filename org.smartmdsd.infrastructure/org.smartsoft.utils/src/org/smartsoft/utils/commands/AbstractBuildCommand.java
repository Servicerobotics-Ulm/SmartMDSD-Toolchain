//--------------------------------------------------------------------------
//
//  Copyright (C) 2016 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//  This library is free software; you can redistribute it and/or
//  modify it under the terms of the GNU Lesser General Public
//  License as published by the Free Software Foundation; either
//  version 2.1 of the License, or (at your option) any later version.
//
//  This library is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//  Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public
//  License along with this library; if not, write to the Free Software
//  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
//--------------------------------------------------------------------------

package org.smartsoft.utils.commands;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.externaltools.internal.IExternalToolConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.smartsoft.utils.Activator;

@SuppressWarnings("restriction")
public abstract class AbstractBuildCommand extends AbstractHandler {
	public IProject getCurrentProject(IWorkbenchWindow window) {
		ISelection selection = window.getSelectionService().getSelection();
		if(selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			Object firstElement = structuredSelection.getFirstElement();
			if(firstElement instanceof IResource) {
				IResource resource = (IResource)firstElement;
				return resource.getProject();
			} else if(firstElement instanceof IProjectNature) {
				IProjectNature projNature = (IProjectNature)firstElement;
				return projNature.getProject();
			}
		}
		return null;
	}
	
	public IProject getProjectFromDialog(IWorkbenchWindow window, String commandName) {
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				window.getShell(),
				new WorkbenchLabelProvider()
				);
		IStructuredContentProvider contentProvider = new BaseWorkbenchContentProvider();
		dialog.setElements(contentProvider.getElements(ResourcesPlugin.getWorkspace().getRoot()));
		dialog.setTitle("Select the Project for "+commandName+" command");
		if(dialog.open() == Window.OK) {
			return (IProject)dialog.getFirstResult();
		}
		return null;
	}
	
	public void generateAndExecuteLauncherFor(IProject currentProject, String launcherNameSuffix, String genFolder, String command, String cmdArgs, boolean useBuild) {
		IProgressMonitor monitor = new NullProgressMonitor();
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		// get luncher type for executing external programs in Eclipse
		String extProgramLaunchTypeName = IExternalToolConstants.ID_PROGRAM_LAUNCH_CONFIGURATION_TYPE;
		ILaunchConfigurationType extProgramLaunchType = manager.getLaunchConfigurationType(extProgramLaunchTypeName);
		try {
			IFolder smartSoftGenFolder = currentProject.getFolder(genFolder);
			if(!smartSoftGenFolder.exists()) {
				// do not blindly create the folder (the project might be not a smartsoft project)
				//smartSoftGenFolder.create(true, true, nullMonitor);
				return;
			}
			if(useBuild == true) {
				IFile cmakeFile = smartSoftGenFolder.getFile("CMakeLists.txt");
				if(!cmakeFile.exists()) {
					// no cmake-file so nothing to do
					return;
				}
				
				IFolder buildFolder = smartSoftGenFolder.getFolder("build");
				if(!buildFolder.exists()) {
					buildFolder.create(true, true, monitor);
					smartSoftGenFolder.refreshLocal(1, monitor);
				}
			}
			
			IFolder launcerFolder = smartSoftGenFolder.getFolder(".launch");
			if(!launcerFolder.exists()) {
				launcerFolder.create(true, true, monitor);
				launcerFolder.refreshLocal(1, monitor);
			}
			
			// use the smartsoft folder to generate the launch script
			String launcherName = currentProject.getName() + launcherNameSuffix;
			final ILaunchConfigurationWorkingCopy config = extProgramLaunchType.newInstance(launcerFolder, launcherName);
			// set launch file contents
			String workingDir =  "${workspace_loc:/" + currentProject.getName() + "}/"+genFolder;
			if(useBuild == true) {
				workingDir += "/build";
			}
			boolean launchInBackground = false;
			config.setAttribute(IExternalToolConstants.ATTR_LOCATION, command);
			config.setAttribute(IExternalToolConstants.ATTR_WORKING_DIRECTORY, workingDir);
			config.setAttribute(IExternalToolConstants.ATTR_TOOL_ARGUMENTS, cmdArgs);
			config.setAttribute(IExternalToolConstants.ATTR_LAUNCH_IN_BACKGROUND, launchInBackground);
			
			// adjust environment variables
			config.setAttribute(ILaunchManager.ATTR_APPEND_ENVIRONMENT_VARIABLES, true);
			Map<String,String> envVars = new HashMap<String,String>();
			envVars.put("SMART_ROOT_ACE", Activator.getDefault().getPreferenceStore().getString("SmartSoftRoot"));
			envVars.put("SMART_PACKAGE_PATH", "${env_var:SMART_PACKAGE_PATH}:${workspace_loc}");
			config.setAttribute(ILaunchManager.ATTR_ENVIRONMENT_VARIABLES, envVars);
			
			// save launch file to disk
			config.doSave();
			
			String jobName = currentProject.getName()+" "+launcherNameSuffix;
			Job job = new Job(jobName) {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					try {
						// execute launch file
//						System.out.println("Launch: "+launcherName);
						config.launch(ILaunchManager.RUN_MODE, monitor);
					} catch (CoreException e) {
						e.printStackTrace();
					}
					return Status.OK_STATUS;
				}
			};
			// Start the Job
			job.schedule();
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
}
