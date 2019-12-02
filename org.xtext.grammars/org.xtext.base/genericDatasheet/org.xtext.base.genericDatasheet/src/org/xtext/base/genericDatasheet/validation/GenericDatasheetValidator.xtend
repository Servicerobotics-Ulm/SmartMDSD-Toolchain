//================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
package org.xtext.base.genericDatasheet.validation

import org.eclipse.xtext.validation.Check
import org.ecore.base.genericDatasheet.DatasheetProperty
import org.ecore.base.genericDatasheet.GenericDatasheetPackage
import org.ecore.base.genericDatasheet.TechnologyReadinessLevel
import org.xtext.base.genericDatasheet.GenericDatasheetUtils
import org.ecore.base.genericDatasheet.DefaultDatasheetProperties
import org.ecore.base.genericDatasheet.GenericDatasheetModel
import org.ecore.base.genericDatasheet.MandatoryDatasheetElement
import org.ecore.base.genericDatasheet.MandatoryDatasheetElementNames

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class GenericDatasheetValidator extends AbstractGenericDatasheetValidator {
	
	public static val INVALID_SPDX_ID = 'invalidSpdxId'
	public static val INVALID_SPDX_URI = 'invalidSpdxURI'
	public static val INVALID_TRL_VALUE = 'invalidTRLValue'
	public static val UNDEFINED_BASE_URI = 'undefinedBaseURI'
	public static val UNDEFINED_SHORT_DESCRIPTION = 'undefinedShortDescription'
	
	
	@Check
	def checkMandatoryElements(GenericDatasheetModel model) {
		val mandatory_elements = model.elements.filter(MandatoryDatasheetElement)
		if(!mandatory_elements.exists[it.name.equals(MandatoryDatasheetElementNames.BASE_URI)]) {
			warning("Mandatory Element BaseURI is not defined", null, UNDEFINED_BASE_URI)
		}
		if(!mandatory_elements.exists[it.name.equals(MandatoryDatasheetElementNames.SHORT_DESCRIPTION)]) {
			warning("Mandatory Element ShortDescription is not defined", null, UNDEFINED_SHORT_DESCRIPTION)
		}
	}
	
	@Check
	def checkSpdxId(DatasheetProperty property) {
		if(property.name.equals(DefaultDatasheetProperties.SPDX_LICENSE.literal)) {
			if(property.value !== null) {
				if(!GenericDatasheetUtils.spdxLicenseNames.exists[it.equals(property.value)]) {
					warning("Invalid SPDX ID, please use the completion helper by pressing CTRL+Space to get valid IDs",
						GenericDatasheetPackage.Literals.DATASHEET_PROPERTY__VALUE, INVALID_SPDX_ID
					)
				}
				
				if(property.semanticID !== null) {
					if(!property.semanticID.contains(property.value)) {
						warning("The semantic URI seems not to match the value",
							GenericDatasheetPackage.Literals.DATASHEET_PROPERTY__SEMANTIC_ID, 
							INVALID_SPDX_URI, property.value
						)
					}
				}
			}
		}
	}
	
	@Check
	def checkTRLValue(DatasheetProperty property) {
		if(property.name.equals(DefaultDatasheetProperties.TECHNOLOGY_READINESS_LEVEL.literal)) {
			if(!TechnologyReadinessLevel.VALUES.exists[it.literal==property.value]) {
				error("Invalid TRL value",
					GenericDatasheetPackage.Literals.DATASHEET_PROPERTY__VALUE, INVALID_TRL_VALUE
				)
			}
		}
	}
}
