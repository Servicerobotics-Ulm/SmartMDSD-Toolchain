//================================================================
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
//================================================================
package org.xtext.base.genericDatasheet.ui

import org.eclipse.xtext.ui.editor.hover.html.IEObjectHoverDocumentationProvider
import org.eclipse.emf.ecore.EObject

class SPDXHoverDocuProvider implements IEObjectHoverDocumentationProvider {
	override getDocumentation(EObject object) {
//		if(object instanceof SpdxLicense) {
//			return 'Read online: <a href="https://spdx.org/licenses/' + object.licenseID + '.html">https://spdx.org/licenses/' + object.licenseID + "</a>"
//		}
	}
}