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
package org.smartmdsd.utils.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.smartmdsd.utils.natures.SmartMDSDNatureHelpers;

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
}
