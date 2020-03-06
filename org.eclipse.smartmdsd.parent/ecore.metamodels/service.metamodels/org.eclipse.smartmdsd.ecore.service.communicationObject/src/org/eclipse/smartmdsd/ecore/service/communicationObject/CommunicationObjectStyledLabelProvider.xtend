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
package org.eclipse.smartmdsd.ecore.service.communicationObject

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesStyledLabelProvider
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType

class CommunicationObjectStyledLabelProvider extends BasicAttributesStyledLabelProvider {
	override getValueString(AbstractValue av) {
		if(av instanceof CommElementValue) {
			return av.value.name
		} else {
			super.getValueString(av)
		}
	}


	override getTypeName(AbstractAttributeType attrType) {
		if(attrType instanceof CommElementReference) {
			return attrType.typeName.name
		} else {
			super.getTypeName(attrType)
		}
	}
}
