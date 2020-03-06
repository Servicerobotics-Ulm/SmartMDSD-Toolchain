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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

public class ImportedProjectsElement {
	private IProject container;

	
	public ImportedProjectsElement(IProject container) {
		this.container = container;
	}
	
	public IProject getParent() {
		return container;
	}
	
	public IProject[] getReferencedProjects() {
		try {
			if(container.isOpen()) {
				return container.getReferencedProjects();
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}
}
