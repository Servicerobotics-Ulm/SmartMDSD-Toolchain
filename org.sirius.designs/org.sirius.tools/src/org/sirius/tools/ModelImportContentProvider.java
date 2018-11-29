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

package org.sirius.tools;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ModelImportContentProvider implements IStructuredContentProvider {
	private String modelFolderName;
	private String modelFileExtension;
	
	public ModelImportContentProvider() {
		modelFolderName = "model";
		modelFileExtension = "comm";
	}
	public ModelImportContentProvider(String modelFolderName, String modelFileExtension) {
		this.modelFolderName = modelFolderName;
		this.modelFileExtension = modelFileExtension;
	}
	
	@Override
	public void dispose() {
		// do nothing
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// do nothing
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if(inputElement instanceof IWorkspaceRoot) {
			IWorkspaceRoot root = (IWorkspaceRoot)inputElement;
			List<Object> resultList = new ArrayList<Object>();
			for(IProject project: root.getProjects()) {
				String modelFileString = modelFolderName + "/" + project.getName() + "."+modelFileExtension;
				IPath modelPath = new Path(modelFileString);
				IFile modelFile = project.getFile(modelPath);
				if(modelFile.exists()) {
					resultList.add(project);
				}
			}
			return resultList.toArray();
		}
		return null;
	}
}
