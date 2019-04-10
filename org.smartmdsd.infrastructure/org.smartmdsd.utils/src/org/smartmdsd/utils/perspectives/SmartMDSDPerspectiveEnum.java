//--------------------------------------------------------------------------
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
// Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
// 
// 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the 
//    documentation and/or other materials provided with the distribution.
// 
// 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this 
//    software without specific prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
// THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS 
// BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
// POSSIBILITY OF SUCH DAMAGE.
//
//--------------------------------------------------------------------------
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
