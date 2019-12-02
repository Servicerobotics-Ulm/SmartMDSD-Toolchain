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
package org.smartmdsd.utils.wizards;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.smartmdsd.utils.natures.SmartMDSDNatureEnum;

public class WizardNewSystemProject extends AbstractProjectCreationWizard {

	public static final String WIZARD_ID = "org.smartmdsd.utils.wizards.system";
	
	@Override
	protected WizardNewProjectCreationPage createFirstPage() {
		WizardNewProjectCreationPage page = new WizardNewProjectCreationPage("SystemProjectWizard");
		page.setTitle("System Project (Tier 3)");
		page.setDescription("This wizard creates a System project for the definition of a ComponentArchitecture, TargetDefinition, Deployment and other system-related models");
		page.setInitialProjectName("SystemAnyName");
		return page;
	}

	@Override
	protected void customizeProject(IProject project, IFolder modelFolder, IProgressMonitor monitor) throws CoreException {
		// no-op
	}
	
	@Override
	protected SmartMDSDNatureEnum getCurrentNatureEnum() {
		return SmartMDSDNatureEnum.SystemNature;
	}
	
	@Override
	protected boolean isModelingProject() {
		return true;
	}
	
}
