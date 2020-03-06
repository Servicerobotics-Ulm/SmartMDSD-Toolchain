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
package org.eclipse.smartmdsd.xtend.smartsoft.generator.component.docu

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef
import com.google.inject.Inject
import org.eclipse.smartmdsd.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheet
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentPortDatasheet
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElement
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElementNames

class ComponentDocuGenerator2Impl extends AbstractGenerator 
{
	@Inject extension ComponentParametersDocu
	@Inject extension HtmlTableHelpers
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(datasheet: input.allContents.toIterable.filter(typeof(ComponentDatasheet))) {
			fsa.generateFile("README.md", ExtendedOutputConfigurationProvider::SRC_GEN_DOCU, datasheet.compileDocu)
		}
	}

	def getDatasheetPropertyTableHeader()
	'''
	«tableHeaderBegin»
	«"Property Name".asTableHeaderCell»
	«"Property Value".asTableHeaderCell»
	«"Property Description".asTableHeaderCell»
	«tableHeaderEnd»
	'''

	def getTableRow(DatasheetProperty property)
	'''
	<tr>
	«property.name.asTableCell»
	«IF property.unit !== null»
		«getAsTableCell(property.value+" "+property.unit)»
	«ELSE»
		«property.value.asTableCell»
	«ENDIF»
	«IF property.semanticID !== null»
		«property.semanticID.asTableCell»
	«ELSE»
		«property.shortDescription.asTableCell»
	«ENDIF»
	</tr>
	'''
	
	def getShortDescription(ComponentDatasheet datasheet)
	{
		val decription = datasheet.elements.filter(MandatoryDatasheetElement).findFirst[it.name.equals(MandatoryDatasheetElementNames.SHORT_DESCRIPTION)]
		if(decription !== null) {
			return decription.value
		}
		return ""
	}
	
	def compileDocu(ComponentDatasheet datasheet)
	'''
	<!--- This file is generated from the «datasheet.component.name».componentDocumentation model --->
	<!--- do not modify this file manually as it will by automatically overwritten by the code generator, modify the model instead and re-generate this file --->
	
	# «datasheet.component.name» Component
	
	<img src="model/«datasheet.component.name»ComponentDefinition.jpg" alt="«datasheet.component.name»-ComponentImage" width="1000">
	
	*Component Short Description:* «datasheet.shortDescription»
	
	«IF datasheet.component !== null && datasheet.component.documentation !== null»
		## Component Documentation
		«datasheet.component.multilineHtmlDocumentation»
	«ENDIF»
	
	## Component-Datasheet Properties
	
	«tableBegin»
	«"Component-Datasheet Properties".asTableCaption»
	«datasheetPropertyTableHeader»
	«FOR property: datasheet.elements.filter(DatasheetProperty)»
		«property.tableRow»
	«ENDFOR»
	«tableEnd»

	## Component Ports

	«FOR port: datasheet.component.elements.filter(ComponentPort)»
		### «port.name»
		
		*Documentation:*
		«port.multilineHtmlDocumentation»
		
		«FOR port_ds: datasheet.elements.filter(ComponentPortDatasheet).filter[it.port == port]»
			«IF port_ds.properties.size > 0»
				«tableBegin»
				«("Datasheet Properties of Component-Port <b>"+port.name+"</b>").asTableCaption»
				«datasheetPropertyTableHeader»
				«FOR property: port_ds.properties»
					«property.tableRow»
				«ENDFOR»
				«tableEnd»
				
			«ENDIF»
		«ENDFOR»
		
	«ENDFOR»

«««	«FOR slave: docu.elements.filter(CoordinationSlavePortDocu)»
«««		## Coordination Port «slave.port.name»
«««		
«««		«slave.description»
«««		
«««		### States
«««		
«««		«slave.state»
«««		
«««		| MainState Name | MainState Description |
«««		|----------------|-----------------------|
«««		«FOR modeDoc: docu.elements.filter(AbstractModeDocu)»
«««			«IF modeDoc instanceof ComponentModeDocu»
«««				| «modeDoc.mode.name» | «modeDoc.description» |
«««			«ELSE»
«««				| Neutral | «modeDoc.description» |
«««			«ENDIF»
«««		«ENDFOR»
«««		
«««		### DynamicWiring
«««		
«««		«slave.dynamicWiring»
«««		
«««		### Parameter
«««		
«««		«slave.parameter»
«««	«ENDFOR»
«««	
«««	## Service Ports
«««	
«««	«FOR service: docu.elements.filter(ComponentServiceDocu)»
«««		### «service.port.name»
«««		
«««		«service.description»
«««		
«««	«ENDFOR»
	
	«FOR paramRef: datasheet.component.elements.filter(ComponentParametersRef)»
		«paramRef.parameter.compileComponentParameters»
	«ENDFOR»
	'''
}