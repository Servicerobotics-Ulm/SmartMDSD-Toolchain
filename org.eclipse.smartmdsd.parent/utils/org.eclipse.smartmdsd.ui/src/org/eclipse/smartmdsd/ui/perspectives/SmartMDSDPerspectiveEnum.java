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
package org.eclipse.smartmdsd.ui.perspectives;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.smartmdsd.ui.natures.SmartMDSDNatureEnum;

public enum SmartMDSDPerspectiveEnum {
	DomainExpert(DomainExpertPerspective.PERSPECTIVE_ID),
	ComponentSupplier(ComponentSupplierPerspective.PERSPECTIVE_ID),
	SystemBuilder(SystemBuilderPerspective.PERSPECTIVE_ID),
	BehaviorDeveloper(BehaviorDeveloperPerspective.PERSPECTIVE_ID);
	
	// Reverse-lookup map for getting a perspective enum from a String perspectiveId
	private static final Map<String, SmartMDSDPerspectiveEnum> lookup = new HashMap<String, SmartMDSDPerspectiveEnum>();
	static {
        for (SmartMDSDPerspectiveEnum perspective : SmartMDSDPerspectiveEnum.values()) {
            lookup.put(perspective.getId(), perspective);
        }
    }
	// static factory method to construct a SmartMDSDPerspective enum element from a full perspectiveId
	public static SmartMDSDPerspectiveEnum getFromID(String perspectiveId) {
        return lookup.get(perspectiveId);
    }
	
	// internal data representation
	private String perspectiveId;
	// private enum constructor
	private SmartMDSDPerspectiveEnum(String perspectiveId) {
		this.perspectiveId = perspectiveId;
	}
	
	// this is the full perspective ID (i.e. internal enum value)
	public String getId() {
		return perspectiveId;
	}
	
	public SmartMDSDNatureEnum getRelatedSmartMDSDNature() {
		switch(this) {
			case DomainExpert: return SmartMDSDNatureEnum.DomainModelsNature;
			case ComponentSupplier: return SmartMDSDNatureEnum.ComponentNature;
			case SystemBuilder: return SmartMDSDNatureEnum.SystemNature;
			case BehaviorDeveloper: return SmartMDSDNatureEnum.BehaviorNature;
		}
		return null;
	}
}
