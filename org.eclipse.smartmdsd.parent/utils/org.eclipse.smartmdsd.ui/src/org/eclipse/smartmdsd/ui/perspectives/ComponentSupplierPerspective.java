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
