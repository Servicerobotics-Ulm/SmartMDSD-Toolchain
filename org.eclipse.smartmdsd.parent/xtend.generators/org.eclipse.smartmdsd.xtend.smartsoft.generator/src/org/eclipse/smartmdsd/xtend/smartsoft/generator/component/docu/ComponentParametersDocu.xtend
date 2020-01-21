//===============================================================
//
//  Copyright (C) 2016 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//===============================================================
package org.eclipse.smartmdsd.xtend.smartsoft.generator.component.docu

import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameter
import org.eclipse.smartmdsd.ecore.component.componentParameter.InternalParameter
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition
import org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedParameter
import org.eclipse.smartmdsd.ecore.component.componentParameter.ExtendedTrigger
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.InlineEnumerationType
import org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterSetInstance
import org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance
import org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement
import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.IntValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.FloatingPointValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.StringValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BoolValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayValue

class ComponentParametersDocu {
	@Inject extension HtmlTableHelpers
	
	def getAttributeTableHeader()
	'''
		«tableHeaderBegin»
		«"Attribute Name".asTableHeaderCell»
		«"Attribute Type".asTableHeaderCell»
		«"Attribute Value".asTableHeaderCell»
		«"Attribute Description".asTableHeaderCell»
		«tableHeaderEnd»
	'''
	
	def String getTypeName(AbstractAttributeType type) {
		switch(type) {
			PrimitiveType: type.typeName.literal
			InlineEnumerationType: "InlineEnumeration"
		}
	}
	
	def String getValueString(AbstractValue av) {
		switch (av) {
			IntValue: av.value.toString
			FloatingPointValue: av.value.toString
			StringValue: '"'+av.value+'"'
			BoolValue: av.value.toString
			EnumerationValue: av.value.name
			ArrayValue: "["+av.values?.map[it.valueString].join(", ")+"]"
			default: ""
		}
	}
	
	def dispatch getTableRow(AttributeDefinition attr)
	'''
		<tr>
		«("<b>"+attr.name+"</b>").asTableCell»
		«attr.type.typeName.asTableCell»
		«attr.defaultvalue.valueString.asTableCell»
		«attr.multilineHtmlDocumentation.asTableCell»
		</tr>
	'''
	
	def dispatch getTableRow(AttributeRefinement ref)
	'''
		<tr>
		«("<b>"+ref.attribute.name+"</b>").asTableCell»
		«ref.attribute.type.typeName.asTableCell»
		«ref.value.valueString.asTableCell»
		«ref.multilineHtmlDocumentation.asTableCell»
		</tr>
	'''
	
	def compileComponentParameters(ComponentParameter parameter)
	'''
	## Component Parameters: «parameter.name»
	
	«FOR param: parameter.parameters»
		«IF param instanceof InternalParameter»
			### Internal Parameter: «param.name»
			
			*Documentation:*
			«param.multilineHtmlDocumentation»
			
			«tableBegin»
			«getAsTableCaption("Internal Parameter <b>"+param.name+"</b>")»
			«attributeTableHeader»
			«FOR attr: param.attributes»
				«attr.tableRow»
			«ENDFOR»
			«tableEnd»
			
		«ELSEIF param instanceof ExtendedParameter»
			### Extended Parameter: «param.name»
			
			*Documentation:*
			«param.multilineHtmlDocumentation»
			
			«tableBegin»
			«getAsTableCaption("Extended Parameter <b>"+param.name+"</b>")»
			«attributeTableHeader»
			«FOR attr: param.attributes»
				«attr.tableRow»
			«ENDFOR»
			«tableEnd»
			
		«ELSEIF param instanceof ExtendedTrigger»
			### Extended Trigger: «param.name»
			
			*Property:* active = **«param.active»**
			
			*Documentation:*
			«param.multilineHtmlDocumentation»
			
			«tableBegin»
			«getAsTableCaption("Attributes of Extended Trigger <b>"+param.name+"</b>")»
			«attributeTableHeader»
			«FOR attr: param.attributes»
				«attr.tableRow»
			«ENDFOR»
			«tableEnd»
			
		«ELSEIF param instanceof ParameterSetInstance»
			### ParameterSetInstance: «param.name»
			
			«FOR instance: param.parameterInstances»
				«IF instance instanceof ParameterInstance»
					#### Parameter Instance: «instance.name»
					
					*Documentation:*
					«instance.multilineHtmlDocumentation»
					
					«tableBegin»
					«getAsTableCaption("Parameter-Instance <b>"+instance.name+"</b>")»
					«attributeTableHeader»
					«FOR attr: instance.attributes»
						«attr.tableRow»
					«ENDFOR»
					«tableEnd»
					
				«ELSEIF instance instanceof TriggerInstance»
					#### Trigger Instance: «instance.triggerDef.name»
					
					*Property:* active = **«instance.active»**
					
					*Documentation:*
					«instance.multilineHtmlDocumentation»
					
				«ENDIF»
			«ENDFOR»
		«ENDIF»
	«ENDFOR»
	'''
}