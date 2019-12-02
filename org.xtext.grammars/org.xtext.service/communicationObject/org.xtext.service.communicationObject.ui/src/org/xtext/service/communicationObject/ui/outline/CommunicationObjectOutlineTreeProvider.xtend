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
package org.xtext.service.communicationObject.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import org.ecore.service.communicationObject.CommObjectModel

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class CommunicationObjectOutlineTreeProvider extends DefaultOutlineTreeProvider {
	def _createChildren(DocumentRootNode outlineNode, CommObjectModel model) {
		if(model.repository !== null) {
			model.repository.elements.filterNull.forEach[
				elem |
				createNode(outlineNode, elem)
			]	
		}
	}
}
