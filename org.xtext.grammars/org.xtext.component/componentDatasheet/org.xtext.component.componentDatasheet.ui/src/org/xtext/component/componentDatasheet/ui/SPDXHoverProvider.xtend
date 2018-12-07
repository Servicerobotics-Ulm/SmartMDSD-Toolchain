package org.xtext.component.componentDatasheet.ui

import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.eclipse.emf.ecore.EObject
import org.ecore.base.genericDatasheet.SpdxLicense

class SPDXHoverProvider extends DefaultEObjectHoverProvider {
	override protected hasHover(EObject obj) {
		if(obj instanceof SpdxLicense) {
			return true
		}
		return super.hasHover(obj)
	}
	
	override protected getLabel(EObject obj) {
		if(obj instanceof SpdxLicense) {
			return obj.licenseID
		}
		super.getLabel(obj)
	}
}