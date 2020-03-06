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
