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
package org.eclipse.smartmdsd.ui.natures;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.smartmdsd.ui.factories.AbstractSelectedModelsFactory;
import org.eclipse.smartmdsd.ui.factories.BehaviorModelsFactory;
import org.eclipse.smartmdsd.ui.factories.ComponentModelsFactory;
import org.eclipse.smartmdsd.ui.factories.DomainModelsFactory;
import org.eclipse.smartmdsd.ui.factories.SystemModelsFactory;

public enum SmartMDSDNatureEnum {
	DomainModelsNature (org.eclipse.smartmdsd.ui.natures.DomainModelsNature.NATURE_ID),
	ComponentNature (org.eclipse.smartmdsd.ui.natures.ComponentNature.NATURE_ID),
	SystemNature (org.eclipse.smartmdsd.ui.natures.SystemNature.NATURE_ID),
	BehaviorNature (org.eclipse.smartmdsd.ui.natures.BehaviorNature.NATURE_ID);
	
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
