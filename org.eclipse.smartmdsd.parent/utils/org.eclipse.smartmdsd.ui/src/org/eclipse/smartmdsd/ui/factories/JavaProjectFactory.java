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
package org.eclipse.smartmdsd.ui.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.smartmdsd.ui.natures.SmartMDSDNatureHelpers;

public class JavaProjectFactory {
	public static void createJavaProject(IProject project, IProject[] referencedProjects, String modelFolderName, IProgressMonitor monitor) throws CoreException {
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Create Java Project", 20);
		
		// add java nature to the project
		SmartMDSDNatureHelpers.addProjectNature(project, JavaCore.NATURE_ID, subMonitor.split(10));

		// create the Java project
		IJavaProject javaProject = JavaCore.create(project);
		
		//set the model folder as a source entry
		int defaultEntriesNumber = 2;
		IClasspathEntry[] buildPath = new  IClasspathEntry[defaultEntriesNumber + referencedProjects.length];
		buildPath[0] = JavaRuntime.getDefaultJREContainerEntry();
		buildPath[1] = JavaCore.newSourceEntry(project.getFullPath().append(modelFolderName));
		
		for(Integer i=0; i<referencedProjects.length; i++) {
			buildPath[i+defaultEntriesNumber] = JavaCore.newProjectEntry(referencedProjects[i].getFullPath());
		}
		javaProject.setRawClasspath(buildPath, project.getFullPath().append("bin"), subMonitor.split(10));
	}
	
	public static void updateJavaReferencedProjects(IProject currentProject, Object[] selectedElements, IProgressMonitor monitor) throws CoreException {
		IProjectNature nature = currentProject.getNature(JavaCore.NATURE_ID);
		if(nature instanceof IJavaProject) {
			IJavaProject javaProject = (IJavaProject)nature;
			List<IClasspathEntry> newClasspath = new ArrayList<IClasspathEntry>();
			IClasspathEntry[] currClasspath = javaProject.getRawClasspath();
			for(IClasspathEntry entry: currClasspath) {
				if(entry.getEntryKind() != IClasspathEntry.CPE_PROJECT) {
					newClasspath.add(entry);
				}
			}
			for(Object object: selectedElements) {
				if(object instanceof IProject) {
					IProject selectedProject = (IProject)object;
					if(selectedProject != currentProject) {
						IClasspathEntry entry = JavaCore.newProjectEntry(selectedProject.getFullPath());
						newClasspath.add(entry);								
					}
				}
			}
			IClasspathEntry[] newRawClasspath = newClasspath.toArray(new IClasspathEntry[0]);
			javaProject.setRawClasspath(newRawClasspath, monitor);
		}
	}
	
	public static List<IResource> getContainingJavaSources(IResource selectedResource) throws CoreException {
		List<IResource> sourceFiles = new ArrayList<IResource>();
		// get the surrounding project of the selected resource
		// if the selected resource is a project itself then it will return itself
		IProject project = selectedResource.getProject();
		IProjectNature nature = project.getNature(JavaCore.NATURE_ID);
		if(nature instanceof IJavaProject) {
			IJavaProject javaProject = (IJavaProject)nature;
			IClasspathEntry[] currClasspath = javaProject.getRawClasspath();
			for(IClasspathEntry entry: currClasspath) {
				// use only the java build-path source entries
				if(entry.getEntryKind() == IClasspathEntry.CPE_SOURCE) {
					// we have to remove the leading segment from the entry path as it is the project itself
					IFolder sourceFolder = project.getFolder(entry.getPath().removeFirstSegments(1));
					if(selectedResource instanceof IProject) {
						// add all members from all source folders (of the current project) to the result list
						if(sourceFolder.exists()) {
							for(IResource source: sourceFolder.members()) {
								sourceFiles.add(source);
							}
						}
					} else if(selectedResource instanceof IFolder) {
						// check if the currently selected folder is a valid java source folder,
						// and if so, add all its members to the result list
						IFolder selectedFolder = (IFolder)selectedResource;
						if(selectedFolder.equals(sourceFolder)) {
							for(IResource source: sourceFolder.members()) {
								sourceFiles.add(source);
							}
						}
					} else if(selectedResource instanceof IFile) {
						// check if the currently selected file is within one of the source folders, 
						// and if so, add the selected file only to the result list
						if(sourceFolder.equals(selectedResource.getParent())) {
							sourceFiles.add(selectedResource);
						}
					}
				}
			}
		}
		return sourceFiles;
	}
}
