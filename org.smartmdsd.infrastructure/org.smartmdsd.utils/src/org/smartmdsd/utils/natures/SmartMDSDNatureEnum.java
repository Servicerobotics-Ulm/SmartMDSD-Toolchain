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
package org.smartmdsd.utils.natures;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.smartmdsd.utils.factories.AbstractSelectedModelsFactory;
import org.smartmdsd.utils.factories.BehaviorModelsFactory;
import org.smartmdsd.utils.factories.ComponentModelsFactory;
import org.smartmdsd.utils.factories.DomainModelsFactory;
import org.smartmdsd.utils.factories.SystemModelsFactory;

public enum SmartMDSDNatureEnum {
	DomainModelsNature (org.smartmdsd.utils.natures.DomainModelsNature.NATURE_ID),
	ComponentNature (org.smartmdsd.utils.natures.ComponentNature.NATURE_ID),
	SystemNature (org.smartmdsd.utils.natures.SystemNature.NATURE_ID),
	BehaviorNature (org.smartmdsd.utils.natures.BehaviorNature.NATURE_ID);
	
	// Reverse-lookup map for getting a nature enum from a String natureId
	private static final Map<String, SmartMDSDNatureEnum> lookup = new HashMap<String, SmartMDSDNatureEnum>();
	static {
        for (SmartMDSDNatureEnum nature : SmartMDSDNatureEnum.values()) {
            lookup.put(nature.getId(), nature);
        }
    }
	// static factory method to construct a SmartMDSDNature enum element from a full natureId
	public static SmartMDSDNatureEnum getFromID(String natureId) {
        return lookup.get(natureId);
    }
	
	// internal data representation
	private String natureId;
	// private enum constructor
	private SmartMDSDNatureEnum(String natureId) {
		this.natureId = natureId;
	}
	
	// this is the full nature ID (i.e. internal enum value)
	public String getId() {
		return natureId;
	}
	
	public AbstractSmartMDSDNature getSmartMDSDNatureFrom(IProject project) throws CoreException {
		if(project.hasNature(natureId)) {
			IProjectNature natureObject = project.getNature(natureId);
			if(natureObject instanceof AbstractSmartMDSDNature) {
				return (AbstractSmartMDSDNature)natureObject;
			}
		}
		return null;
	}
	
	public AbstractSmartMDSDNature createSmartMDSDNatureObject() {
		switch(this) {
			case DomainModelsNature: return new DomainModelsNature();
			case ComponentNature: return new ComponentNature();
			case SystemNature: return new SystemNature();
			case BehaviorNature: return new BehaviorNature();
		}
		return null;
	}
	
	public AbstractSelectedModelsFactory createModelsFactory(final IProject project, final IFolder modelFolder) {
		switch(this) {
			case DomainModelsNature: return new DomainModelsFactory(project, modelFolder);
			case ComponentNature: return new ComponentModelsFactory(project, modelFolder);
			case SystemNature: return new SystemModelsFactory(project, modelFolder);
			case BehaviorNature: return new BehaviorModelsFactory(project, modelFolder);
		}
		return null;
	}
}
