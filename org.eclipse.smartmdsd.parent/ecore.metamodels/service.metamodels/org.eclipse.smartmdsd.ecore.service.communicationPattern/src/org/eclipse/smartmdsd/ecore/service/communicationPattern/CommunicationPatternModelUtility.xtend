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