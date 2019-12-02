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
package org.smartmdsd.utils.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.smartmdsd.utils.wizards.WizardNewDomainModelsProject;

public class DomainExpertPerspective extends AbstractSmartMDSDPerspective {

	public static final String PERSPECTIVE_ID = "org.smartmdsd.utils.perspectives.domainExpert";
	
	@Override
	protected void defineCustomActions(IPageLayout layout) {
		layout.addNewWizardShortcut(WizardNewDomainModelsProject.WIZARD_ID);
	}

	@Override
	protected void defineCustomLayout(IPageLayout layout) {
		
	}

	@Override
	protected void addBottomViews(IFolderLayout bottom) {
		
	}

}
