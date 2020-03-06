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
package org.eclipse.smartmdsd.ui.factories;

import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IWorkbench;

public abstract class AbstractSelectedModelsFactory extends XtextResourceFactory {

	public AbstractSelectedModelsFactory(IProject project, IFolder modelFolder) {
		super(project, modelFolder);
	}
	
	// implement these methods in derived classes
	public abstract boolean createSelectedModels(List<String> selectedModelTypes, IProgressMonitor monitor);
	public abstract void openSelectedModelsInEditor(IWorkbench workbench, List<String> selectedModelTypes);
	
}
