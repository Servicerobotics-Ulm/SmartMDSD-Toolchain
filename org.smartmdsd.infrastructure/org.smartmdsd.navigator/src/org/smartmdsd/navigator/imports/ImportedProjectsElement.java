//==============================================================
//
// Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//      lotz@hs-ulm.de
//      stampfer@hs-ulm.de
//      lutz@hs-ulm.de
//
//      Servicerobotics Ulm
//      Christian Schlegel
//      Ulm University of Applied Sciences
//      Prittwitzstr. 10
//      89075 Ulm
//      Germany
//
// This file is part of the SmartSoft MDSD Toolchain v3. 
//
//==============================================================
package org.smartmdsd.navigator.imports;

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
