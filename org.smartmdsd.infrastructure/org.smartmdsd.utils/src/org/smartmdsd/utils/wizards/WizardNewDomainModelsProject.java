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
import org.smartmdsd.utils.builder.CDTProjectHelpers;
import org.smartmdsd.utils.factories.AbstractSelectedModelsFactory;
import org.smartmdsd.utils.natures.SmartMDSDNatureEnum;

public class WizardNewDomainModelsProject extends AbstractProjectCreationWizard {

	public static final String WIZARD_ID = "org.smartmdsd.utils.wizards.domainModels";
	
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
