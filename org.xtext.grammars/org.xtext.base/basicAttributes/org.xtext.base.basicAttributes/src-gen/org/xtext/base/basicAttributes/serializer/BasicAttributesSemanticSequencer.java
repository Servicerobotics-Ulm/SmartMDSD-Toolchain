//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
package org.xtext.base.basicAttributes.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.ecore.base.basicAttributes.ArrayType;
import org.ecore.base.basicAttributes.ArrayValue;
import org.ecore.base.basicAttributes.AttributeDefinition;
import org.ecore.base.basicAttributes.AttributeRefinement;
import org.ecore.base.basicAttributes.BasicAttributesPackage;
import org.ecore.base.basicAttributes.BoolValue;
import org.ecore.base.basicAttributes.EnumerationElement;
import org.ecore.base.basicAttributes.EnumerationValue;
import org.ecore.base.basicAttributes.FloatingPointValue;
import org.ecore.base.basicAttributes.InlineEnumerationType;
import org.ecore.base.basicAttributes.IntValue;
import org.ecore.base.basicAttributes.PrimitiveType;
import org.ecore.base.basicAttributes.StringValue;
import org.xtext.base.basicAttributes.services.BasicAttributesGrammarAccess;

@SuppressWarnings("all")
public class BasicAttributesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BasicAttributesGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BasicAttributesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BasicAttributesPackage.ARRAY_TYPE:
				sequence_ArrayType(context, (ArrayType) semanticObject); 
				return; 
			case BasicAttributesPackage.ARRAY_VALUE:
				sequence_ArrayValue(context, (ArrayValue) semanticObject); 
				return; 
			case BasicAttributesPackage.ATTRIBUTE_DEFINITION:
				sequence_AttributeDefinition(context, (AttributeDefinition) semanticObject); 
				return; 
			case BasicAttributesPackage.ATTRIBUTE_REFINEMENT:
				sequence_AttributeRefinement(context, (AttributeRefinement) semanticObject); 
				return; 
			case BasicAttributesPackage.BOOL_VALUE:
				sequence_SingleValue(context, (BoolValue) semanticObject); 
				return; 
			case BasicAttributesPackage.ENUMERATION_ELEMENT:
				sequence_EnumerationElement(context, (EnumerationElement) semanticObject); 
				return; 
			case BasicAttributesPackage.ENUMERATION_VALUE:
				sequence_SingleValue(context, (EnumerationValue) semanticObject); 
				return; 
			case BasicAttributesPackage.FLOATING_POINT_VALUE:
				sequence_SingleValue(context, (FloatingPointValue) semanticObject); 
				return; 
			case BasicAttributesPackage.INLINE_ENUMERATION_TYPE:
				sequence_InlineEnumerationType(context, (InlineEnumerationType) semanticObject); 
				return; 
			case BasicAttributesPackage.INT_VALUE:
				sequence_SingleValue(context, (IntValue) semanticObject); 
				return; 
			case BasicAttributesPackage.PRIMITIVE_TYPE:
				sequence_PrimitiveType(context, (PrimitiveType) semanticObject); 
				return; 
			case BasicAttributesPackage.STRING_VALUE:
				sequence_SingleValue(context, (StringValue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ArrayType returns ArrayType
	 *
	 * Constraint:
	 *     length=Cardinality?
	 */
	protected void sequence_ArrayType(ISerializationContext context, ArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractValue returns ArrayValue
	 *     ArrayValue returns ArrayValue
	 *
	 * Constraint:
	 *     (values+=SingleValue values+=SingleValue*)
	 */
	protected void sequence_ArrayValue(ISerializationContext context, ArrayValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeDefinition returns AttributeDefinition
	 *
	 * Constraint:
	 *     (name=ID type=AbstractAttributeType defaultvalue=AbstractValue?)
	 */
	protected void sequence_AttributeDefinition(ISerializationContext context, AttributeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeRefinement returns AttributeRefinement
	 *
	 * Constraint:
	 *     (attribute=[AttributeDefinition|FQN] value=AbstractValue)
	 */
	protected void sequence_AttributeRefinement(ISerializationContext context, AttributeRefinement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasicAttributesPackage.Literals.ATTRIBUTE_REFINEMENT__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasicAttributesPackage.Literals.ATTRIBUTE_REFINEMENT__ATTRIBUTE));
			if (transientValues.isValueTransient(semanticObject, BasicAttributesPackage.Literals.ATTRIBUTE_REFINEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasicAttributesPackage.Literals.ATTRIBUTE_REFINEMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionFQNParserRuleCall_0_0_1(), semanticObject.eGet(BasicAttributesPackage.Literals.ATTRIBUTE_REFINEMENT__ATTRIBUTE, false));
		feeder.accept(grammarAccess.getAttributeRefinementAccess().getValueAbstractValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EnumerationElement returns EnumerationElement
	 *
	 * Constraint:
	 *     (name=ID value=EInt?)
	 */
	protected void sequence_EnumerationElement(ISerializationContext context, EnumerationElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractAttributeType returns InlineEnumerationType
	 *     InlineEnumerationType returns InlineEnumerationType
	 *
	 * Constraint:
	 *     (array=ArrayType? enums+=EnumerationElement+)
	 */
	protected void sequence_InlineEnumerationType(ISerializationContext context, InlineEnumerationType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractAttributeType returns PrimitiveType
	 *     PrimitiveType returns PrimitiveType
	 *
	 * Constraint:
	 *     (typeName=PRIMITIVE_TYPE_NAME array=ArrayType?)
	 */
	protected void sequence_PrimitiveType(ISerializationContext context, PrimitiveType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractValue returns BoolValue
	 *     SingleValue returns BoolValue
	 *
	 * Constraint:
	 *     value=EBoolean
	 */
	protected void sequence_SingleValue(ISerializationContext context, BoolValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasicAttributesPackage.Literals.BOOL_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasicAttributesPackage.Literals.BOOL_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSingleValueAccess().getValueEBooleanParserRuleCall_3_1_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractValue returns EnumerationValue
	 *     SingleValue returns EnumerationValue
	 *
	 * Constraint:
	 *     value=[EnumerationElement|FQN]
	 */
	protected void sequence_SingleValue(ISerializationContext context, EnumerationValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasicAttributesPackage.Literals.ENUMERATION_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasicAttributesPackage.Literals.ENUMERATION_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSingleValueAccess().getValueEnumerationElementFQNParserRuleCall_4_1_0_1(), semanticObject.eGet(BasicAttributesPackage.Literals.ENUMERATION_VALUE__VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractValue returns FloatingPointValue
	 *     SingleValue returns FloatingPointValue
	 *
	 * Constraint:
	 *     value=EDouble
	 */
	protected void sequence_SingleValue(ISerializationContext context, FloatingPointValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasicAttributesPackage.Literals.FLOATING_POINT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasicAttributesPackage.Literals.FLOATING_POINT_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSingleValueAccess().getValueEDoubleParserRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractValue returns IntValue
	 *     SingleValue returns IntValue
	 *
	 * Constraint:
	 *     value=EInt
	 */
	protected void sequence_SingleValue(ISerializationContext context, IntValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasicAttributesPackage.Literals.INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasicAttributesPackage.Literals.INT_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSingleValueAccess().getValueEIntParserRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractValue returns StringValue
	 *     SingleValue returns StringValue
	 *
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_SingleValue(ISerializationContext context, StringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasicAttributesPackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasicAttributesPackage.Literals.STRING_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSingleValueAccess().getValueEStringParserRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
