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
package org.smartmdsd.utils.builder;

import org.eclipse.cdt.managedbuilder.core.IManagedBuildInfo;
import org.eclipse.cdt.managedbuilder.core.ManagedBuilderCorePlugin;
import org.eclipse.cdt.managedbuilder.makegen.IManagedBuilderMakefileGenerator;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.smartmdsd.utils.Activator;
import org.smartmdsd.utils.SmartMDSDPreferencesPage;

public class SmartMDSDManagedBuildConfigurator implements IManagedBuilderMakefileGenerator {

	public static final String BUILDER_ID = "org.smartmdsd.utils.smartmdsd.builder";
	
	private IProject project = null;
	private IPath buildWorkingDir = null;
	private String generatorFolderName = "";
	private String buildFolderName = "";
	private String buildConfigurationName = "";
	
	
	@Override
	public void generateDependencies() throws CoreException {
		regenerateDependencies(false);
	}

	@Override
	public MultiStatus generateMakefiles(IResourceDelta delta) throws CoreException {
		return regenerateMakefiles();
	}

	@Override
	public IPath getBuildWorkingDir() {
		return buildWorkingDir;
	}

	@Override
	public String getMakefileName() {
		return "Makefile";
	}

	@Override
	public void initialize(IProject project, IManagedBuildInfo info, IProgressMonitor monitor) {
		this.project = project;
		this.generatorFolderName = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_GENERATOR_FOLDER);
		this.buildFolderName = Activator.getDefault().getPreferenceStore().getString(SmartMDSDPreferencesPage.PROP_BUILD_FOLDER);
		this.buildWorkingDir = new Path(generatorFolderName + "/" + buildFolderName);
		this.buildConfigurationName = info.getConfigurationName();
	}

	@Override
	public boolean isGeneratedResource(IResource resource) {
		if(resource != null) {
			return resource.isDerived();	
		}
		return false;
	}

	@Override
	public void regenerateDependencies(boolean force) throws CoreException {
		// no-op
	}

	@Override
	public MultiStatus regenerateMakefiles() throws CoreException {
		MultiStatus status = new MultiStatus(
				ManagedBuilderCorePlugin.getUniqueIdentifier(),
				IStatus.INFO,
				"", //$NON-NLS-1$
				null);

		if(project == null) {
			return status;
		}
		
		final ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
		final ILaunchConfigurationType cmakeLauncher = launchManager.getLaunchConfigurationType(CMakeLauncher.LAUNCHER_ID);
		IWorkspaceRunnable cmakeRunnable = new IWorkspaceRunnable() {
			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				IFolder buildFolder = project.getFolder(buildWorkingDir);
				if(!buildFolder.exists()) {
					createBuildFolder(monitor);
				}
				
				String launcherName = project.getName();
				ILaunchConfigurationWorkingCopy cmakeLauncherConfiguration = cmakeLauncher.newInstance(project, launcherName);
				// the only mandatory parameter is the current project name
				cmakeLauncherConfiguration.setAttribute(CMakeLauncher.ATTR_PROJECT_NAME, project.getName());
				cmakeLauncherConfiguration.setAttribute(CMakeLauncher.ATTR_CMAKE_BUILD_TYPE, buildConfigurationName);
				
				// execute launch file
				cmakeLauncherConfiguration.launch(ILaunchManager.RUN_MODE, monitor);
			}
		};
		// trigger execution of the cmakeRunnable
		ResourcesPlugin.getWorkspace().run(cmakeRunnable, project, IWorkspace.AVOID_UPDATE, null);		
		
		return status;
	}
	
	protected void createBuildFolder(IProgressMonitor monitor) throws CoreException {
		// create and save build folder
		IFolder smartsoftFolder = project.getFolder(generatorFolderName);
		if (smartsoftFolder.exists()) {
			IFolder buildFolder = smartsoftFolder.getFolder(buildFolderName);
			if(!buildFolder.exists()) {
				buildFolder.create(true, true, monitor);
				project.refreshLocal(2, monitor);
			}
		}
	}
}
