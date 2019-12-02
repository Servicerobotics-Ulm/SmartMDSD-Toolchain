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
package org.smartmdsd.utils.factories;

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
