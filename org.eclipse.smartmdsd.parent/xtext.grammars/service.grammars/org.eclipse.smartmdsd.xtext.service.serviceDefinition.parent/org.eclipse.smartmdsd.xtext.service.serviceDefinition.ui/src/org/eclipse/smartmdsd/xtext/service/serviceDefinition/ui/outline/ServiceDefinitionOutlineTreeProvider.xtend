/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtext.service.serviceDefinition.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class ServiceDefinitionOutlineTreeProvider extends DefaultOutlineTreeProvider {
	def _createChildren(DocumentRootNode outlineNode, ServiceDefModel model) {
		if(model.repository !== null) {
			model.repository.services.filterNull.forEach[
				elem |
				createNode(outlineNode, elem)
			]	
		}
	}
}
