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

package org.smartmdsd.navigator.imports;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ITreeContentProvider;

public class ImportsContentProvider implements ITreeContentProvider {

	private static final Object[] NO_CHILDREN = new Object[0];
	private final Map<IProject, ImportedProjectsElement> cachedImportsMap = new HashMap<IProject, ImportedProjectsElement>();
	
	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof IProject) {
			IProject project = (IProject)parentElement;
			// do not create children if project is closed
			if(project.isOpen()) {
				// create only one single imports-element for each project
				ImportedProjectsElement imports = cachedImportsMap.get(project);
				if(imports == null) {
					imports = new ImportedProjectsElement(project);
					cachedImportsMap.put(project, imports);
				}
				return imports != null ? new Object[] { imports } : NO_CHILDREN;
			}
		} else if(parentElement instanceof ImportedProjectsElement) {
			ImportedProjectsElement imports = (ImportedProjectsElement)parentElement;
			// the imports element itself can have several sub-elements (these are the actual project references)
			return imports.getReferencedProjects();
		}
		return NO_CHILDREN;
	}

	@Override
	public Object getParent(Object element) {
		if(element instanceof ImportedProjectsElement) {
			ImportedProjectsElement imports = (ImportedProjectsElement)element;
			return imports.getParent();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if(element instanceof IProject) {
			IProject project = (IProject)element;
			// a project should always get the single imports-element by default (provided it is open),
			// even if the imports-element by itself might not have further sub-children (see below)
			return project.isOpen();
		} else if(element instanceof ImportedProjectsElement) {
			ImportedProjectsElement imports = (ImportedProjectsElement)element;
			return imports.getReferencedProjects() != null;
		}
		return false;
	}

}
