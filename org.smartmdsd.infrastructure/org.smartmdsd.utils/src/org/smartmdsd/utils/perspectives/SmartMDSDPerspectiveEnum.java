//===============================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain v3. 
//
//===============================================================
package org.smartmdsd.utils.perspectives;

import java.util.HashMap;
import java.util.Map;

import org.smartmdsd.utils.natures.SmartMDSDNatureEnum;

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
