//================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartMDSD Toolchain V3. 
//
//================================================================
package org.eclipse.smartmdsd.xtext.system.systemDatasheet.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider
import org.eclipse.smartmdsd.xtext.base.genericDatasheet.ui.GenericDatasheetProjectPropertiesUpdater

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class SystemDatasheetUiModule extends AbstractSystemDatasheetUiModule {
	def Class<? extends XtextDocumentProvider> bindXtextDocumentProvider() {
	    GenericDatasheetProjectPropertiesUpdater
	}
}
