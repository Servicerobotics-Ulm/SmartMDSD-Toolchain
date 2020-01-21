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
package org.eclipse.smartmdsd.xtext.service.serviceDefinition.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionStyledLabelProvider
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.AbstractServiceDefinition

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
class ServiceDefinitionLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	@Inject extension ServiceDefinitionStyledLabelProvider

	// Labels and icons can be computed like this:
	
	def text(AbstractServiceDefinition service) {
		service.styledServiceString
	}

}
