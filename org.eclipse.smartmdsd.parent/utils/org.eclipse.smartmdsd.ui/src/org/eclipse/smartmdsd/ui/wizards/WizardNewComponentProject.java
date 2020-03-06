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
package org.eclipse.smartmdsd.ui.wizards;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.smartmdsd.ui.builder.CDTProjectHelpers;
import org.eclipse.smartmdsd.ui.natures.SmartMDSDNatureEnum;

public class WizardNewComponentProject extends AbstractProjectCreationWizard {

	public static final String WIZARD_ID = "org.eclipse.smartmdsd.ui.wizards.component";
	
	@Override
	protected WizardNewProjectCreationPage createFirstPage() {
		WizardNewProjectCreationPage page = new WizardNewProjectCreationPage("ComponentProjectWizard");
		page.setTitle("Component Project (Tier 3)");
		page.setDescription("This wizard creates a Component project with the focus on component-internal details");
		page.setInitialProjectName("ComponentAnyName");
		return page;
	}
	
	@Override
	protected void customizeProject(IProject project, IFolder modelFolder, IProgressMonitor monitor) throws CoreException {
		// setup the SmartSoft-specific C++ include settings (including the Kernel includes)
		boolean hasKernelIncludes = true; 
		CDTProjectHelpers.setDefaultCppIncludesFor(project, hasKernelIncludes);
	}
	
	@Override
	protected SmartMDSDNatureEnum getCurrentNatureEnum() {
		return SmartMDSDNatureEnum.ComponentNature;
	}
	
	@Override
	protected boolean isModelingProject() {
		return true;
	}
	
}
