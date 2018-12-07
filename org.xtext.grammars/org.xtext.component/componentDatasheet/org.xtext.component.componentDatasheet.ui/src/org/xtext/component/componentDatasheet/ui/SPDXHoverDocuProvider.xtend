package org.xtext.component.componentDatasheet.ui

import org.eclipse.xtext.ui.editor.hover.html.IEObjectHoverDocumentationProvider
import org.eclipse.emf.ecore.EObject
import org.ecore.base.genericDatasheet.SpdxLicense

class SPDXHoverDocuProvider implements IEObjectHoverDocumentationProvider {
	override getDocumentation(EObject object) {
		if(object instanceof SpdxLicense) {
			return 'Read online: <a href="https://spdx.org/licenses/' + object.licenseID + '.html">https://spdx.org/licenses/' + object.licenseID + "</a>"
		}
	}
}