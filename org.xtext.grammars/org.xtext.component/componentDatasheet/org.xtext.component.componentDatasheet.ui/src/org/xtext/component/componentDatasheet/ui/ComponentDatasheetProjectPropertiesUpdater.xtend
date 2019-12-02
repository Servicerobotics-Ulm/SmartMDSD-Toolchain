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
package org.xtext.component.componentDatasheet.ui

import org.xtext.base.genericDatasheet.ui.GenericDatasheetProjectPropertiesUpdater
import org.ecore.base.genericDatasheet.AbstractDatasheetElement
import org.ecore.component.componentDatasheet.ComponentPortDatasheet

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