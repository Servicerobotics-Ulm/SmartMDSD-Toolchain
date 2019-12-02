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
package org.xtext.base.basicAttributes.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.ecore.base.basicAttributes.AttributeDefinition
import org.ecore.base.basicAttributes.EnumerationElement
import org.ecore.base.basicAttributes.BasicAttributesStyledLabelProvider

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
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
