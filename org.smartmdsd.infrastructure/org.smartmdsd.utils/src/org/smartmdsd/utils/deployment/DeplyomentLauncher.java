//===============================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain v3. 
//
//===============================================================
package org.smartmdsd.utils.deployment;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.smartmdsd.utils.Activator;
import org.smartmdsd.utils.SmartMDSDPreferencesPage;
import org.smartmdsd.utils.natures.SystemNature;

public class DeplyomentLauncher extends LaunchConfigurationDelegate {
	
	public static final String LAUNCHER_ID = "org.smartmdsd.utils.launch.deployment";
	
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
