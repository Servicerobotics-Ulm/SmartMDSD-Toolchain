//===============================================================
//
//  Copyright (C) 2016 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
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
//===============================================================
package org.eclipse.smartmdsd.xtend.smartsoft.generator.component;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition;

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
