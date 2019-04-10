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
package org.xtext.service.skillDefinition.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
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
import org.ecore.service.skillDefinition.CoordinationModuleDefinition;
import org.ecore.service.skillDefinition.SkillDefinition;
import org.ecore.service.skillDefinition.SkillDefinitionModel;
import org.ecore.service.skillDefinition.SkillDefinitionPackage;
import org.ecore.service.skillDefinition.SkillDefinitionRepository;
import org.ecore.service.skillDefinition.SkillResult;
import org.xtext.base.basicAttributes.serializer.BasicAttributesSemanticSequencer;
import org.xtext.service.skillDefinition.services.SkillDefinitionGrammarAccess;

@SuppressWarnings("all")
public class SkillDefinitionSemanticSequencer extends BasicAttributesSemanticSequencer {

	@Inject
	private SkillDefinitionGrammarAccess grammarAccess;
	
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
		else if (epackage == SkillDefinitionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SkillDefinitionPackage.COORDINATION_MODULE_DEFINITION:
				sequence_CoordinationModuleDefinition(context, (CoordinationModuleDefinition) semanticObject); 
				return; 
			case SkillDefinitionPackage.SKILL_DEFINITION:
				sequence_SkillDefinition(context, (SkillDefinition) semanticObject); 
				return; 
			case SkillDefinitionPackage.SKILL_DEFINITION_MODEL:
				sequence_SkillDefinitionModel(context, (SkillDefinitionModel) semanticObject); 
				return; 
			case SkillDefinitionPackage.SKILL_DEFINITION_REPOSITORY:
				sequence_SkillDefinitionRepository(context, (SkillDefinitionRepository) semanticObject); 
				return; 
			case SkillDefinitionPackage.SKILL_RESULT:
				sequence_SkillResult(context, (SkillResult) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     CoordinationModuleDefinition returns CoordinationModuleDefinition
	 *
	 * Constraint:
	 *     (name=ID skills+=SkillDefinition*)
	 */
	protected void sequence_CoordinationModuleDefinition(ISerializationContext context, CoordinationModuleDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SkillDefinitionModel returns SkillDefinitionModel
	 *
	 * Constraint:
	 *     repository=SkillDefinitionRepository?
	 */
	protected void sequence_SkillDefinitionModel(ISerializationContext context, SkillDefinitionModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SkillDefinitionRepository returns SkillDefinitionRepository
	 *
	 * Constraint:
	 *     (name=ID modules+=CoordinationModuleDefinition*)
	 */
	protected void sequence_SkillDefinitionRepository(ISerializationContext context, SkillDefinitionRepository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SkillDefinition returns SkillDefinition
	 *
	 * Constraint:
	 *     (name=ID inAttribute+=AttributeDefinition* outAttribute+=AttributeDefinition* results+=SkillResult+)
	 */
	protected void sequence_SkillDefinition(ISerializationContext context, SkillDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SkillResult returns SkillResult
	 *
	 * Constraint:
	 *     (result=SKILL_RESULT_TYPES resultValue=EString)
	 */
	protected void sequence_SkillResult(ISerializationContext context, SkillResult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SkillDefinitionPackage.Literals.SKILL_RESULT__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SkillDefinitionPackage.Literals.SKILL_RESULT__RESULT));
			if (transientValues.isValueTransient(semanticObject, SkillDefinitionPackage.Literals.SKILL_RESULT__RESULT_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SkillDefinitionPackage.Literals.SKILL_RESULT__RESULT_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSkillResultAccess().getResultSKILL_RESULT_TYPESEnumRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getSkillResultAccess().getResultValueEStringParserRuleCall_3_0(), semanticObject.getResultValue());
		feeder.finish();
	}
	
	
}
