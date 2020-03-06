/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.system.activityArchitecture.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.DataTriggered
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.TimeValue
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ExecutionTime

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
class ActivityArchitectureLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
	def text(DataTriggered element) {
		'DataTriggered: ' + element.triggerRef.name + " / "+element.prescale
	}
	
	def text(TimeValue tv) {
		'TimeValue: '+tv.value+' '+tv.unit.literal
	}
	
	def text(ExecutionTime exec) {
		'ExecutionTime: '+exec.minTime.value+' '+exec.minTime.unit.literal+' -- '+exec.maxTime.value+' '+exec.maxTime.unit.literal
	}
}
