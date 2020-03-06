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
package org.eclipse.smartmdsd.ecore.service.communicationPattern

import java.util.Collection
import java.util.HashSet
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObject

class CommunicationPatternModelUtility {
	def static Collection<CommunicationObject> getAllCommObjects(CommunicationPattern pattern) {
		val objects = new HashSet<CommunicationObject>();
		switch (pattern) {
			PushPattern: objects.add(pattern.dataType)
			SendPattern: objects.add(pattern.dataType)
			QueryPattern: objects.addAll(pattern.requestType, pattern.answerType)
			EventPattern: objects.addAll(pattern.eventType, pattern.activationType, pattern.eventStateType)
		}
		return objects;
	}
}