/********************************************************************************
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtext.service.parameterDefinition.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider
import org.eclipse.smartmdsd.xtext.base.docuterminals.ui.DocuCommentColoringMapping
import org.eclipse.smartmdsd.xtext.base.docuterminals.ui.DocuCommentHoverProvider

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class ParameterDefinitionUiModule extends AbstractParameterDefinitionUiModule {
	def Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
        DocuCommentColoringMapping
    }
    
	def Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
		DocuCommentHoverProvider
	}
}
