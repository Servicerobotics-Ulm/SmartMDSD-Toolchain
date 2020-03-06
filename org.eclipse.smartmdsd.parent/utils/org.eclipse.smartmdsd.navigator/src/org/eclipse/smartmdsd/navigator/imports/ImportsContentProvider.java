/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.navigator.imports;

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
