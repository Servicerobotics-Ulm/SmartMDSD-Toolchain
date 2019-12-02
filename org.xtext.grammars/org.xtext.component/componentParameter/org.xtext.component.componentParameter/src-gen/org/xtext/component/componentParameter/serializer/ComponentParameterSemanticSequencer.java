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
package org.xtext.component.componentParameter.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
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
import org.ecore.base.documentation.AbstractDocumentedElement;
import org.ecore.base.documentation.DocumentationPackage;
import org.ecore.component.componentParameter.ComponentParamModel;
import org.ecore.component.componentParameter.ComponentParameter;
import org.ecore.component.componentParameter.ComponentParameterPackage;
import org.ecore.component.componentParameter.ExtendedParameter;
import org.ecore.component.componentParameter.ExtendedTrigger;
import org.ecore.component.componentParameter.InternalParameter;
import org.ecore.component.componentParameter.ParameterInstance;
import org.ecore.component.componentParameter.ParameterSetInstance;
import org.ecore.component.componentParameter.TriggerInstance;
import org.ecore.service.parameterDefinition.ParamDefModel;
import org.ecore.service.parameterDefinition.ParamDefRepoImport;
import org.ecore.service.parameterDefinition.ParameterDefinition;
import org.ecore.service.parameterDefinition.ParameterDefinitionPackage;
import org.ecore.service.parameterDefinition.ParameterSetDefinition;
import org.ecore.service.parameterDefinition.ParameterSetRepository;
import org.ecore.service.parameterDefinition.TriggerDefinition;
import org.xtext.component.componentParameter.services.ComponentParameterGrammarAccess;
import org.xtext.service.parameterDefinition.serializer.ParameterDefinitionSemanticSequencer;

@SuppressWarnings("all")
public class ComponentParameterSemanticSequencer extends ParameterDefinitionSemanticSequencer {

	@Inject
	private ComponentParameterGrammarAccess grammarAccess;
	
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
		else if (epackage == ComponentParameterPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentParameterPackage.COMPONENT_PARAM_MODEL:
				sequence_ComponentParamModel(context, (ComponentParamModel) semanticObject); 
				return; 
			case ComponentParameterPackage.COMPONENT_PARAMETER:
				sequence_ComponentParameter(context, (ComponentParameter) semanticObject); 
				return; 
			case ComponentParameterPackage.EXTENDED_PARAMETER:
				sequence_ExtendedParameter(context, (ExtendedParameter) semanticObject); 
				return; 
			case ComponentParameterPackage.EXTENDED_TRIGGER:
				sequence_ExtendedTrigger(context, (ExtendedTrigger) semanticObject); 
				return; 
			case ComponentParameterPackage.INTERNAL_PARAMETER:
				sequence_InternalParameter(context, (InternalParameter) semanticObject); 
				return; 
			case ComponentParameterPackage.PARAMETER_INSTANCE:
				sequence_ParameterInstance(context, (ParameterInstance) semanticObject); 
				return; 
			case ComponentParameterPackage.PARAMETER_SET_INSTANCE:
				sequence_ParameterSetInstance(context, (ParameterSetInstance) semanticObject); 
				return; 
			case ComponentParameterPackage.TRIGGER_INSTANCE:
				sequence_TriggerInstance(context, (TriggerInstance) semanticObject); 
				return; 
			}
		else if (epackage == DocumentationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT:
				sequence_AbstractDocumentedElement(context, (AbstractDocumentedElement) semanticObject); 
				return; 
			}
		else if (epackage == ParameterDefinitionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ParameterDefinitionPackage.PARAM_DEF_MODEL:
				sequence_ParamDefModel(context, (ParamDefModel) semanticObject); 
				return; 
			case ParameterDefinitionPackage.PARAM_DEF_REPO_IMPORT:
				sequence_ParamDefRepoImport(context, (ParamDefRepoImport) semanticObject); 
				return; 
			case ParameterDefinitionPackage.PARAMETER_DEFINITION:
				sequence_ParameterDefinition(context, (ParameterDefinition) semanticObject); 
				return; 
			case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION:
				sequence_ParameterSetDefinition(context, (ParameterSetDefinition) semanticObject); 
				return; 
			case ParameterDefinitionPackage.PARAMETER_SET_REPOSITORY:
				sequence_ParameterSetRepository(context, (ParameterSetRepository) semanticObject); 
				return; 
			case ParameterDefinitionPackage.TRIGGER_DEFINITION:
				sequence_TriggerDefinition(context, (TriggerDefinition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ComponentParamModel returns ComponentParamModel
	 *
	 * Constraint:
	 *     (imports+=ParamDefRepoImport* parametrization=ComponentParameter?)
	 */
	protected void sequence_ComponentParamModel(ISerializationContext context, ComponentParamModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentParameter returns ComponentParameter
	 *
	 * Constraint:
	 *     (name=ID component=[ComponentDefinition|FQN]? parameters+=AbstractComponentParameter*)
	 */
	protected void sequence_ComponentParameter(ISerializationContext context, ComponentParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentParameter returns ExtendedParameter
	 *     ExtendedParameter returns ExtendedParameter
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID attributes+=AttributeDefinition*)
	 */
	protected void sequence_ExtendedParameter(ISerializationContext context, ExtendedParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentParameter returns ExtendedTrigger
	 *     ExtendedTrigger returns ExtendedTrigger
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID active?='active'? attributes+=AttributeDefinition*)
	 */
	protected void sequence_ExtendedTrigger(ISerializationContext context, ExtendedTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentParameter returns InternalParameter
	 *     InternalParameter returns InternalParameter
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID attributes+=AttributeDefinition*)
	 */
	protected void sequence_InternalParameter(ISerializationContext context, InternalParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractParameterInstance returns ParameterInstance
	 *     ParameterInstance returns ParameterInstance
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? parameterDef=[ParameterDefinition|FQN] attributes+=AttributeRefinement*)
	 */
	protected void sequence_ParameterInstance(ISerializationContext context, ParameterInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentParameter returns ParameterSetInstance
	 *     ParameterSetInstance returns ParameterSetInstance
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? paramSet=[ParameterSetDefinition|FQN] parameterInstances+=AbstractParameterInstance*)
	 */
	protected void sequence_ParameterSetInstance(ISerializationContext context, ParameterSetInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractParameterInstance returns TriggerInstance
	 *     TriggerInstance returns TriggerInstance
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? triggerDef=[TriggerDefinition|FQN] active?='active'?)
	 */
	protected void sequence_TriggerInstance(ISerializationContext context, TriggerInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
