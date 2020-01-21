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
package org.eclipse.smartmdsd.ui.builder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.variables.VariablesPlugin;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.smartmdsd.ui.Activator;
import org.eclipse.smartmdsd.ui.preferences.SmartMDSDPreferencesPage;

public class CMakeLauncher implements ILaunchConfigurationDelegate {

	public static final String LAUNCHER_ID = "org.eclipse.smartmdsd.ui.launch.cmake";
	
	public static final String ATTR_PROJECT_NAME = LAUNCHER_ID+".projectName";
	public static final String ATTR_WORKING_DIR = LAUNCHER_ID+".rootWorkingDir";
	public static final String ATTR_CMAKE_COMMAND = LAUNCHER_ID+".cmakeCommand";
	public static final String ATTR_CMAKE_PARAMETER = LAUNCHER_ID+".cmakeParameter";
	public static final String ATTR_CMAKE_BUILD_TYPE = LAUNCHER_ID+".cmakeBuildType";
	
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
				String cmakeParameters = configuration.getAttribute(ATTR_CMAKE_PARAMETER, "..");
				// here we resolve the system path variable and replace it by its value in the returned string
				String resolvedCmakeCommand = VariablesPlugin.getDefault().getStringVariableManager().performStringSubstitution(cmakeCommand);
				
				List<String> command_list = new ArrayList<String>();
				command_list.add(resolvedCmakeCommand);
				
				String defaultCmakeBuildType = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_CMAKE_BUILD_TYPE);
				String cmakeBuildType = configuration.getAttribute(ATTR_CMAKE_BUILD_TYPE, defaultCmakeBuildType);
				command_list.add("-DCMAKE_BUILD_TYPE="+cmakeBuildType);
				
				// FIXME: autobuild dependencies is deactivated for the the moment; this is just a workaround to be able to use the toolchain build
				// but this unfortunately also deactivates autobuild in console altogether which should be fixed at some point!!!
				command_list.add("-DBUILD_DEPENDENCIES=OFF");
				
				String ros_distro_dir = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_ROS_DISTRIBUTION_DIR);
				File ros_dir = new File(ros_distro_dir);
				if(ros_dir.exists()) {
					command_list.add("-DCMAKE_PREFIX_PATH="+ros_dir.getPath());
				}
				command_list.add(cmakeParameters);
				String[] commands = new String[command_list.size()];
				commands = command_list.toArray(commands);
				
				// execute the deployment script as an external process
				Process cmakeProcess = DebugPlugin.exec(commands, workingDir.getLocation().toFile(), calculateEnvironmentVariables(project, ros_dir));
				String processLabel = cmakeBuildType;
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

	private String[] calculateEnvironmentVariables(IProject project, File ros_dir) {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		Map<String, String> environment = manager.getNativeEnvironment();
		Integer index = 0;
		int env_size = environment.size();

		if(ros_dir.exists()) {
			env_size = env_size + 3;
		}
		
		String[] environmentVariables = new String[env_size];
		String workspacePath = project.getWorkspace().getRoot().getLocation().toOSString();
		for(Map.Entry<String, String> entry: environment.entrySet()) {
			if(entry.getKey().contentEquals("SMART_PACKAGE_PATH")) {
				environmentVariables[index] = entry.getKey() + "=" + entry.getValue() + ":" + workspacePath;
			} else if(entry.getKey().equals("PATH") && ros_dir.exists()) {
				environmentVariables[index] = entry.getKey() + "=" + ros_dir.getPath()+"/bin:" + entry.getValue();
			} else {
				environmentVariables[index] = entry.getKey() + "=" + entry.getValue();
			}
			index++;
		}
		
		if(ros_dir.exists()) {
			// add ROS main environment variables:
			environmentVariables[index++] = "ROS_ROOT="+ros_dir.getPath()+"/share/ros";
			environmentVariables[index++] = "ROS_PACKAGE_PATH="+ros_dir.getPath()+"/share";
			environmentVariables[index++] = "PYTHONPATH="+ros_dir.getPath()+"/lib/python2.7/dist-packages";
		}
		
		return environmentVariables;
	}
}
