//===================================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
//===================================================================================
package org.xtext.base.docuterminals.ui

import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.eclipse.emf.ecore.EObject
import org.ecore.base.documentation.AbstractDocumentedElement

class DocuCommentHoverProvider extends DefaultEObjectHoverProvider {
	override protected getDocumentation(EObject object) {
		if(object instanceof AbstractDocumentedElement) {
			if(object.documentation !== null && !object.documentation.empty) {
				return object.multilineHtmlDocumentation
			}
		}
		return super.getDocumentation(object)
	}
}