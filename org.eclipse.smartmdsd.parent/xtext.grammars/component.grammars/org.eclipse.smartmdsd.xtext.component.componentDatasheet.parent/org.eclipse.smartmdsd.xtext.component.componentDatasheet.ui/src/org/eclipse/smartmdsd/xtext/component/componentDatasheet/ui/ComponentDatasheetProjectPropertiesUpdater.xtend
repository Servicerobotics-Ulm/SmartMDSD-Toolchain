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
package org.eclipse.smartmdsd.xtext.component.componentDatasheet.ui

import org.eclipse.smartmdsd.xtext.base.genericDatasheet.ui.GenericDatasheetProjectPropertiesUpdater
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.AbstractDatasheetElement
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentPortDatasheet

class ComponentDatasheetProjectPropertiesUpdater extends GenericDatasheetProjectPropertiesUpdater {
	override getDatasheetElementName(AbstractDatasheetElement element) {
		if(element instanceof ComponentPortDatasheet) {
			return element.name
		}
		super.getDatasheetElementName(element)
	}
	
	override getDatasheetProperties(AbstractDatasheetElement element) {
		if(element instanceof ComponentPortDatasheet) {
			return element.properties
		}
		super.getDatasheetProperties(element)
	}
}