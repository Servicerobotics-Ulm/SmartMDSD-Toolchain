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
