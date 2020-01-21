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
package org.eclipse.smartmdsd.ui.linux;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

public class DebianTerminalLauncher implements ILaunchConfigurationDelegate {

	public static final String LAUNCHER_ID = "org.eclipse.smartmdsd.ui.debianTerminalLauncher";
	
	public static final String ATTR_PROJECT_NAME = LAUNCHER_ID+".projectName";
	public static final String ATTR_WORKING_DIR = LAUNCHER_ID+".rootWorkingDir";
	
	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		String projectName = configuration.getAttribute(ATTR_PROJECT_NAME, "");
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if(project.exists() && project.isOpen()) {
			String workingDirString = configuration.getAttribute(ATTR_WORKING_DIR, "");
			IPath workingDir = null;
			if(workingDirString.contentEquals("")) {
				workingDir = project.getLocation();
			} else {
				IResource resource = project.findMember(workingDirString);
				if(resource instanceof IContainer) {
					workingDir = resource.getLocation();
				} else {
					workingDir = resource.getParent().getLocation();
				}
			}
			if(!workingDir.isEmpty()) {
				if(Platform.getOS().contentEquals(Platform.OS_LINUX)) {
					String teminalCommand = "x-terminal-emulator";
					String[] commands = new String[] {teminalCommand};	
					// execute the deployment script as an external process
					Process terminalProcess = DebugPlugin.exec(commands, workingDir.toFile());
					DebugPlugin.newProcess(launch, terminalProcess, teminalCommand);
				} // TODO: check option for other OSes
			}
		}
	}

}
