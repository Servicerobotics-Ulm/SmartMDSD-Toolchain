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
