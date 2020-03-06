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
package org.eclipse.smartmdsd.xtext.base.docuterminals.ui

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement

class DocuCommentHoverProvider extends DefaultEObjectHoverProvider {
	override protected getDocumentation(EObject object) {
		if(object instanceof AbstractDocumentationElement) {
			if(object.documentation !== null && !object.documentation.empty) {
				return object.multilineHtmlDocumentation
			}
		}
		return super.getDocumentation(object)
	}
}
