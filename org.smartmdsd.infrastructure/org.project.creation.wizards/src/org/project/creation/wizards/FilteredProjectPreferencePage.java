//--------------------------------------------------------------------------
//
//  Copyright (C) 2016 Alex Lotz
//
//        lotz@hs-ulm.de
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

package org.project.creation.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.ui.dialogs.WizardNewProjectReferencePage;
import org.eclipse.ui.model.WorkbenchContentProvider;

public class FilteredProjectPreferencePage extends WizardNewProjectReferencePage {
	private String modelFileExtension;
	private String modelFolderName;
	
	public FilteredProjectPreferencePage(String pageName, String modelFileExtension) {
		super(pageName);
		this.modelFolderName = "model";
		this.modelFileExtension = modelFileExtension;
	}

    /**
     * Returns a content provider for the reference project
     * viewer. It will return all projects in the workspace that contain a given model file in a model folder.
     *
     * @return the content provider
     */
    protected IStructuredContentProvider getContentProvider() {
        return new WorkbenchContentProvider() {
            @Override
			public Object[] getChildren(Object element) {
                if (!(element instanceof IWorkspace)) {
					return new Object[0];
				}
                IProject[] projects = ((IWorkspace) element).getRoot()
                        .getProjects();
                if(projects != null) {
                	List<IProject> filteredProjects = new ArrayList<IProject>();
                	for(IProject proj: projects) {
                		IFolder modelFolder = proj.getFolder(modelFolderName);
                		if(modelFolder.exists()) {
                			String fileName = proj.getName()+"."+modelFileExtension;
                			IFile modelFile = modelFolder.getFile(fileName);
                			if(modelFile.exists()) {
                				filteredProjects.add(proj);
                			}
                		}
                	}
                	return filteredProjects.toArray();
                }
                return projects == null ? new Object[0] : projects;
            }
        };
    }
}
