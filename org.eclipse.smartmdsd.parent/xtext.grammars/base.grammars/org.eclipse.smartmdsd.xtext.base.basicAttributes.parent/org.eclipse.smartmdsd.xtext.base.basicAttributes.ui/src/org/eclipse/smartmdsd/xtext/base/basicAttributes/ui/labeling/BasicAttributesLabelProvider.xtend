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
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.base.basicAttributes.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesStyledLabelProvider
import org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationElement

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
class BasicAttributesLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	@Inject extension BasicAttributesStyledLabelProvider

	// Labels and icons can be computed like this:
	
	def text(AttributeDefinition attr) {
		attr.attributeStyledString
	}
	
	def text(EnumerationElement en) {
		en.enumerationElementStyledString
	}
}
