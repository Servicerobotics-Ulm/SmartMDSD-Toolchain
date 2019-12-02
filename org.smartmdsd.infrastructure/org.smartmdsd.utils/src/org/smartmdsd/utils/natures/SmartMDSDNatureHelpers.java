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
package org.smartmdsd.utils.natures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;

/**
 * This factory class simplifies creation of specific nature objects
 * @author alex-lotz
 *
 */
public class SmartMDSDNatureHelpers {
	public static AbstractSmartMDSDNature getFirstSmartMDSDNatureFrom(IProject project) {
		for(SmartMDSDNatureEnum natureEnum: SmartMDSDNatureEnum.values()) {
			try {
				if(project.hasNature(natureEnum.getId())) {
					return natureEnum.getSmartMDSDNatureFrom(project);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static void addProjectNature(IProject project, String natureId, IProgressMonitor monitor) throws CoreException {
		IProjectDescription description = project.getDescription();
        String[] currNatures = description.getNatureIds();
        
        // use a set to prevent potential duplicates
        Set<String> natureSet = new HashSet<String>();
        natureSet.addAll(Arrays.asList(currNatures));
        natureSet.add(natureId);
        
        String[] combinedNatures = natureSet.toArray(new String[natureSet.size()]);
        
		// validate the natures before applying them
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IStatus status = workspace.validateNatureSet(combinedNatures);
		
		// only apply new nature, if the status is ok
		if (status.getCode() == IStatus.OK) {
			description.setNatureIds(combinedNatures);
			project.setDescription(description, monitor);
		}
	}
	
	public static void removeProjectNature(IProject project, String natureId, IProgressMonitor monitor) throws CoreException {
		IProjectDescription description = project.getDescription();
        String[] currNatures = description.getNatureIds();
        for (int i = 0; i < currNatures.length; ++i) {
            if (natureId.equals(currNatures[i])) {
                // Remove the nature
                String[] newNatures = new String[currNatures.length - 1];
                System.arraycopy(currNatures, 0, newNatures, 0, i);
                System.arraycopy(currNatures, i + 1, newNatures, i, currNatures.length - i - 1);
                description.setNatureIds(newNatures);
                project.setDescription(description, monitor);
                break;
            }
        }
	}
}
