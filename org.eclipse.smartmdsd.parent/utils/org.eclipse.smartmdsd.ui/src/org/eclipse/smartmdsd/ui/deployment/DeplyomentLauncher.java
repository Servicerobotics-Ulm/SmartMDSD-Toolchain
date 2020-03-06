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

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.smartmdsd.ui.Activator;
import org.eclipse.smartmdsd.ui.preferences.SmartMDSDPreferencesPage;
import org.eclipse.smartmdsd.ui.natures.SystemNature;

public class DeplyomentLauncher extends LaunchConfigurationDelegate {
	
	public static final String LAUNCHER_ID = "org.eclipse.smartmdsd.ui.launch.deployment";
	
	public static final String ATTR_PROJECT_NAME = LAUNCHER_ID+".projectName";
	public static final String ATTR_SHELL_COMMAND = LAUNCHER_ID+".shellCommand";
	public static final String ATTR_ROOT_FOLDER_NAME = LAUNCHER_ID+".rootFolderName";
	public static final String ATTR_DEPLOYMENT_SCRIPT = LAUNCHER_ID+".deploymentScript";
	
	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		String projectName = configuration.getAttribute(ATTR_PROJECT_NAME, "");
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if(project.exists() && project.isOpen()) {
			if(project.hasNature(SystemNature.NATURE_ID)) {
				String generatorFolderName = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_GENERATOR_FOLDER);
				String rootFolderName = configuration.getAttribute(ATTR_ROOT_FOLDER_NAME, generatorFolderName);
				IFolder workingDir = project.getFolder(rootFolderName);
				if(workingDir.exists()) {
					String defaultShellCommand = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_SHELL_COMMAND);
					String shell = configuration.getAttribute(ATTR_SHELL_COMMAND, defaultShellCommand);
					String skript = configuration.getAttribute(ATTR_DEPLOYMENT_SCRIPT, "src-gen/deployment/deploy-all.sh");
					
					String[] commands = new String[] {shell, skript};

					// execute the deployment script as an external process
					Process process = DebugPlugin.exec(commands, workingDir.getLocation().toFile());
					String processLabel = shell + " " + skript;
					DebugPlugin.newProcess(launch, process, processLabel);
				}
			} else {
				System.out.println("Skip the deployment-action as the selected project "+project.getName()+" does not have a System project-nature.");
			}
		}
	}

}
