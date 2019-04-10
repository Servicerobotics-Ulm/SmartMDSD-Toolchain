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
package org.smartmdsd.utils.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;
import org.smartmdsd.utils.wizards.WizardNewSmartMDSDModel;

public abstract class AbstractSmartMDSDPerspective implements IPerspectiveFactory {

	public static final String NAVIGATOR_VIEW_ID = "org.smartmdsd.navigator.view";
	
	@Override
	public void createInitialLayout(IPageLayout layout) {
		defineBaseActions(layout);
		defineBaseLayout(layout);
	}

    /**
     * add items and actions set to the window
     * 
     * @param layout
     *            layout of the perspective
     */
    protected void defineBaseActions(final IPageLayout layout) {
        // wizards
        layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder"); //$NON-NLS-1$ 
        layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file"); //$NON-NLS-1$

        layout.addNewWizardShortcut(WizardNewSmartMDSDModel.WIZARD_ID);
        
        // show view shortcuts
        layout.addShowViewShortcut(NAVIGATOR_VIEW_ID);
        layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
        layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
        layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
        
        defineCustomActions(layout);
    }

    /**
     * add views to the layout
     * 
     * @param layout
     *            layout of the perspective
     */
    protected void defineBaseLayout(final IPageLayout layout) {
        final String editorArea = layout.getEditorArea();
        layout.addView(NAVIGATOR_VIEW_ID, IPageLayout.LEFT, (float) 0.25, editorArea);
        layout.addView(IPageLayout.ID_OUTLINE, IPageLayout.BOTTOM, 0.50f, NAVIGATOR_VIEW_ID);

        defineCustomLayout(layout);
        
        // Place problem, properties and advance views to bottom of editor area.
        final IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, (float) 0.65, editorArea); //$NON-NLS-1$
        bottom.addView(IPageLayout.ID_PROP_SHEET);
        addBottomViews(bottom);
        bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
        bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
        bottom.addView(IPageLayout.ID_PROGRESS_VIEW);
    }

    // implement these methods in derived classes
    protected abstract void defineCustomActions(final IPageLayout layout);
    protected abstract void defineCustomLayout(final IPageLayout layout);
    protected abstract void addBottomViews(final IFolderLayout bottom);
}
