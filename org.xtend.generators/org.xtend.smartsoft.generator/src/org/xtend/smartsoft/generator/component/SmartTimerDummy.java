//--------------------------------------------------------------------------
//
//  Copyright (C) 2016 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//  This library is free software; you can redistribute it and/or
//  modify it under the terms of the GNU Lesser General Public
//  License as published by the Free Software Foundation; either
//  version 2.1 of the License, or (at your option) any later version.
//
//  This library is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//  Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public
//  License along with this library; if not, write to the Free Software
//  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
//--------------------------------------------------------------------------

package org.xtend.smartsoft.generator.component;

import org.ecore.component.componentDefinition.ComponentDefinition;

/**
 * This is a dummy class for a smart timer.
 * It is needed since the current meta-model 
 * does not yet support timers which however are needed
 * for creating a periodic task. In future work, as soon as
 * the metamodel supports timers, this class should be removed.
 * @author alexej
 *
 */
public class SmartTimerDummy {
	private String name;
	private int cycle;
	private String timeUnit;
	private ComponentDefinition comp;
	
	public SmartTimerDummy() {
		this.setName("");
		this.setCycle(0);
		this.setTimeUnit("s");
		this.setComponentDefinition(null);
	}
	
	public SmartTimerDummy(String name, int cycle, String timeUnit, ComponentDefinition comp) {
		this.setName(name);
		this.setCycle(cycle);
		this.setTimeUnit(timeUnit);
		this.setComponentDefinition(comp);
	}
	
	public int getCycle() {
		return cycle;
	}
	public void setCycle(int cycle) {
		this.cycle = cycle;
	}

	public String getTimeUnit() {
		return timeUnit;
	}

	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ComponentDefinition getComponentDefinition() {
		return comp;
	}

	public void setComponentDefinition(ComponentDefinition comp) {
		this.comp = comp;
	}
}
