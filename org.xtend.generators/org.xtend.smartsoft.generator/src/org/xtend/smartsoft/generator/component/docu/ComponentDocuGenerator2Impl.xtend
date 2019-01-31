//--------------------------------------------------------------------------
//
//  Copyright (C) 2016 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        ZAFH Servicerobotic Ulm
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
package org.xtend.smartsoft.generator.component.docu

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.ecore.component.componentDocumentation.ComponentDocumentation
import org.ecore.component.componentDocumentation.ComponentServiceDocu
import org.ecore.component.componentParameter.ComponentParametersRef
import com.google.inject.Inject
import org.ecore.component.componentDocumentation.CoordinationSlavePortDocu
import org.ecore.component.componentDocumentation.AbstractModeDocu
import org.ecore.component.componentDocumentation.ComponentModeDocu
import org.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider

class ComponentDocuGenerator2Impl extends AbstractGenerator 
{
	@Inject extension ComponentParametersDocu
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(docu: input.allContents.toIterable.filter(typeof(ComponentDocumentation))) {
			fsa.generateFile("README.md", ExtendedOutputConfigurationProvider::SRC_GEN_DOCU, docu.compileDocu)
		}
	}
	
	def compileDocu(ComponentDocumentation docu)
	'''
	<!--- This file is generated from the «docu.component.name».componentDocumentation model --->
	<!--- do not modify this file manually as it will by automatically overwritten by the code generator, modify the model instead and re-generate this file --->
	
	# «docu.component.name» Component
	
	![«docu.component.name»-ComponentImage](model/«docu.component.name»ComponentDefinition.jpg)
	
	«IF docu.description !== null»
		«docu.description.replace("\t","")»
	«ENDIF»
	
	| Metaelement | Documentation |
	|-------------|---------------|
	| License | «docu.license» |
	| Hardware Requirements | «docu.hardware» |
	| Purpose | «docu.purpose» |
	
	
	«FOR slave: docu.elements.filter(CoordinationSlavePortDocu)»
		## Coordination Port «slave.port.name»
		
		«slave.description»
		
		### States
		
		«slave.state»
		
		| MainState Name | MainState Description |
		|----------------|-----------------------|
		«FOR modeDoc: docu.elements.filter(AbstractModeDocu)»
			«IF modeDoc instanceof ComponentModeDocu»
				| «modeDoc.mode.name» | «modeDoc.description» |
			«ELSE»
				| Neutral | «modeDoc.description» |
			«ENDIF»
		«ENDFOR»
		
		### DynamicWiring
		
		«slave.dynamicWiring»
		
		### Parameter
		
		«slave.parameter»
	«ENDFOR»
	
	## Service Ports
	
	«FOR service: docu.elements.filter(ComponentServiceDocu)»
		### «service.port.name»
		
		«service.description»
		
	«ENDFOR»
	
	«FOR paramRef: docu.component.elements.filter(ComponentParametersRef)»
		«paramRef.parameter.compileComponentParameters»
	«ENDFOR»
	'''
}