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

import org.ecore.component.componentParameter.ComponentParameter
import org.ecore.component.componentParameter.InternalParameter
import com.google.inject.Inject
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.ecore.base.basicAttributes.AttributeDefinition
import org.ecore.component.componentParameter.ExtendedParameter
import org.ecore.component.componentParameter.ExtendedTrigger
import org.ecore.base.basicAttributes.AbstractAttributeType
import org.ecore.base.basicAttributes.PrimitiveType
import org.ecore.base.basicAttributes.InlineEnumerationType
import org.ecore.component.componentParameter.ParameterSetInstance
import org.ecore.component.componentParameter.ParameterInstance
import org.ecore.component.componentParameter.TriggerInstance
import org.ecore.base.basicAttributes.AttributeRefinement

class ComponentParametersDocu {
	@Inject IEObjectDocumentationProvider doc;
	
	def compileComponentParameters(ComponentParameter parameter)
	'''
	## Component Parameters «parameter.name»
	
	«FOR param: parameter.parameters»
		«IF param instanceof InternalParameter»
			### InternalParameter «param.name»
			
			| Attribute Name | Attribute Type | Description |
			|----------------|----------------|-------------|
			«FOR attr: param.attributes»
				«attr.compileAttribute»
			«ENDFOR»
			
		«ELSEIF param instanceof ExtendedParameter»
			### ExtendedParameter «(param as ExtendedParameter).name»
			
			| Attribute Name | Attribute Type | Description |
			|----------------|----------------|-------------|
			«FOR attr: (param as ExtendedParameter).attributes»
				«attr.compileAttribute»
			«ENDFOR»
			
		«ELSEIF param instanceof ExtendedTrigger»
			### ExtendedTrigger «(param as ExtendedTrigger).name»
			
			active = «(param as ExtendedTrigger).active»
			
			| Attribute Name | Attribute Type | Description |
			|----------------|----------------|-------------|
			«FOR attr: (param as ExtendedTrigger).attributes»
				«attr.compileAttribute»
			«ENDFOR»
			
		«ELSEIF param instanceof ParameterSetInstance»
			### ParameterSetInstance «(param as ParameterSetInstance).name»
			
			«FOR instance: (param as ParameterSetInstance).parameterInstances»
				«IF instance instanceof ParameterInstance»
					#### ParameterInstance «instance.name»
					
					«doc.getDocumentation(instance)»
					
					| Attribute Name | Attribute Type | Description |
					|----------------|----------------|-------------|
					«FOR attr: instance.attributes»
						«attr.compileAttributeRefinement»
					«ENDFOR»
					
				«ELSEIF instance instanceof TriggerInstance»
					#### TriggerInstance «(instance as TriggerInstance).triggerDef.name»
					
					active = «(instance as TriggerInstance).active»
					
					«doc.getDocumentation(instance)»
					
				«ENDIF»
			«ENDFOR»
		«ENDIF»
	«ENDFOR»
	'''
	
	def compileAttribute(AttributeDefinition attr)
	'''
	| «attr.name» | «attr.type.typeName» | «doc.getDocumentation(attr)» |
	'''
	
	def compileAttributeRefinement(AttributeRefinement attr)
	'''
	| «attr.attribute.name» | «attr.attribute.type.typeName» | «doc.getDocumentation(attr)» |
	'''
	
	def getTypeName(AbstractAttributeType type) {
		switch(type) {
			PrimitiveType: type.typeName
			InlineEnumerationType: "InlineEnumeration"
		}
	}
}