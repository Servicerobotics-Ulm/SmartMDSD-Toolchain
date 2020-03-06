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
 *   Alex Lotz, Matthias Lutz, Dennis Stampfer
 ********************************************************************************/
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
