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
package org.smartmdsd.utils.builder;

import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.smartmdsd.utils.Activator;
import org.smartmdsd.utils.SmartMDSDPreferencesPage;

public class CMakeLauncher implements ILaunchConfigurationDelegate {

	public static final String LAUNCHER_ID = "org.smartmdsd.utils.launch.cmake";
	
	public static final String ATTR_PROJECT_NAME = LAUNCHER_ID+".projectName";
	public static final String ATTR_WORKING_DIR = LAUNCHER_ID+".rootWorkingDir";
	public static final String ATTR_CMAKE_COMMAND = LAUNCHER_ID+".cmakeCommand";
	public static final String ATTR_CMAKE_PARAMETER = LAUNCHER_ID+".cmakeParameter";
	
	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		String projectName = configuration.getAttribute(ATTR_PROJECT_NAME, "");
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if(project.exists() && project.isOpen()) {
			
			String generatorFolderName = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_GENERATOR_FOLDER);
			String buildFolderName = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_BUILD_FOLDER);
			String defaultWorkingDir = generatorFolderName + "/" + buildFolderName;
			String workingDirString = configuration.getAttribute(ATTR_WORKING_DIR, defaultWorkingDir);
			IFolder workingDir = project.getFolder(new Path(workingDirString));
			if(workingDir.exists()) {
				String defaultCmakeCommand = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_CMAKE_COMMAND);
				String cmakeCommand = configuration.getAttribute(ATTR_CMAKE_COMMAND, defaultCmakeCommand);
				String cmakeParameter = configuration.getAttribute(ATTR_CMAKE_PARAMETER, "..");
				
				//FIXME: it does not make sense to autobuild dependencies as they already are automatically built by the Eclipse builder
				// however, they cannot be deactivated (like follows) as this would break the manual build in a terminal
//				String buildDependenciesOff = "-DBUILD_DEPENDENCIES=OFF";
//				String[] commands = new String[] {cmakeCommand, buildDependenciesOff, cmakeParameter};
				
				String[] commands = new String[] {cmakeCommand, cmakeParameter};				
				
				// execute the deployment script as an external process
				Process cmakeProcess = DebugPlugin.exec(commands, workingDir.getLocation().toFile(), calculateEnvironmentVariables(project));
				String processLabel = cmakeCommand + " " + cmakeParameter;
				DebugPlugin.newProcess(launch, cmakeProcess, processLabel);
				try {
					// wait until the cmake process actually terminates (otherwise it will run asynchronously in the background)
					cmakeProcess.waitFor();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private String[] calculateEnvironmentVariables(IProject project) {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		Map<String, String> environment = manager.getNativeEnvironment();
		Integer index = 0;
		String[] environmentVariables = new String[environment.size()];
		String workspacePath = project.getWorkspace().getRoot().getLocation().toOSString();
		for(Map.Entry<String, String> entry: environment.entrySet()) {
			if(entry.getKey().contentEquals("SMART_PACKAGE_PATH")) {
				environmentVariables[index] = entry.getKey() + "=" + entry.getValue() + ":" + workspacePath;
			} else {
				environmentVariables[index] = entry.getKey() + "=" + entry.getValue();
			}
			index++;
		}
		return environmentVariables;
	}
}
