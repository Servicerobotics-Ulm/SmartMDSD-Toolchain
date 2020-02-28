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
package org.eclipse.smartmdsd.ui.perspectives;

import org.eclipse.smartmdsd.ui.wizards.WizardNewComponentProject;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;

public class ComponentSupplierPerspective extends AbstractSmartMDSDPerspective {

	public static final String PERSPECTIVE_ID = "org.eclipse.smartmdsd.ui.perspectives.componentSupplier";
	
	@Override
	protected void defineCustomActions(IPageLayout layout) {
		layout.addNewWizardShortcut(WizardNewComponentProject.WIZARD_ID);
	}

	@Override
	protected void defineCustomLayout(IPageLayout layout) {
		
	}

	@Override
	protected void addBottomViews(IFolderLayout bottom) {
		bottom.addView("org.eclipse.smartmdsd.sirius.component.design.ComponentParamView");
	}

}