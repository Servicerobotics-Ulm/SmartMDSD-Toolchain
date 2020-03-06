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
import org.eclipse.smartmdsd.ui.factories.AbstractSelectedModelsFactory;
import org.eclipse.smartmdsd.ui.natures.SmartMDSDNatureEnum;

public class WizardNewDomainModelsProject extends AbstractProjectCreationWizard {

	public static final String WIZARD_ID = "org.eclipse.smartmdsd.ui.wizards.domainModels";
	
	@Override
	protected WizardNewProjectCreationPage createFirstPage() {
		WizardNewProjectCreationPage page = new WizardNewProjectCreationPage("DomainModelsWizard");
		page.setTitle("Domain-Models Project (Tier 2)");
		page.setDescription("This wizard creates a repository-project for ServiceDefinitions, CommunicationObjects and other domain-specific model-definitions\n(see \"http://robmosys.eu/wiki/general_principles:ecosystem:start\" for more details)");
		page.setInitialProjectName("DomainAnyName");
		return page;
	}

	@Override
	protected void customizeProject(IProject project, IFolder modelFolder, IProgressMonitor monitor) throws CoreException {
		// setup the SmartSoft-specific C++ include settings (excluding the Kernel includes)
		boolean hasKernelIncludes = false; 
		CDTProjectHelpers.setDefaultCppIncludesFor(project, hasKernelIncludes);
		
		// since the domain models do not have any graphical representations, we just open all
		// created textual models
		AbstractSelectedModelsFactory modelsFactory = getCurrentNatureEnum().createModelsFactory(project, modelFolder);
		modelsFactory.openSelectedModelsInEditor(workbench, pageTwo.getSelectedModelTypes());
	}

	@Override
	protected SmartMDSDNatureEnum getCurrentNatureEnum() {
		return SmartMDSDNatureEnum.DomainModelsNature;
	}
	
	@Override
	protected boolean isModelingProject() {
		// we do not need the modeling nature for DomainModels projects (this might change in future)
		return false;
	}
	
}
