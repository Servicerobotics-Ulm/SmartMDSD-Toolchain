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
package org.xtext.service.parameterDefinition.serializer;

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
import org.ecore.base.documentation.AbstractDocumentedElement;
import org.ecore.base.documentation.DocumentationPackage;
import org.ecore.service.parameterDefinition.ParamDefModel;
import org.ecore.service.parameterDefinition.ParamDefRepoImport;
import org.ecore.service.parameterDefinition.ParameterDefinition;
import org.ecore.service.parameterDefinition.ParameterDefinitionPackage;
import org.ecore.service.parameterDefinition.ParameterSetDefinition;
import org.ecore.service.parameterDefinition.ParameterSetRepository;
import org.ecore.service.parameterDefinition.TriggerDefinition;
import org.xtext.base.basicAttributes.serializer.BasicAttributesSemanticSequencer;
import org.xtext.service.parameterDefinition.services.ParameterDefinitionGrammarAccess;

@SuppressWarnings("all")
public class ParameterDefinitionSemanticSequencer extends BasicAttributesSemanticSequencer {

	@Inject
	private ParameterDefinitionGrammarAccess grammarAccess;
	
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
	 *     ParamDefModel returns ParamDefModel
	 *
	 * Constraint:
	 *     (imports+=ParamDefRepoImport* repository=ParameterSetRepository?)
	 */
	protected void sequence_ParamDefModel(ISerializationContext context, ParamDefModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParamDefRepoImport returns ParamDefRepoImport
	 *
	 * Constraint:
	 *     importedNamespace=FQNW
	 */
	protected void sequence_ParamDefRepoImport(ISerializationContext context, ParamDefRepoImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ParameterDefinitionPackage.Literals.PARAM_DEF_REPO_IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ParameterDefinitionPackage.Literals.PARAM_DEF_REPO_IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParamDefRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractParameter returns ParameterDefinition
	 *     ParameterDefinition returns ParameterDefinition
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID attributes+=AttributeDefinition*)
	 */
	protected void sequence_ParameterDefinition(ISerializationContext context, ParameterDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterSetDefinition returns ParameterSetDefinition
	 *
	 * Constraint:
	 *     (
	 *         documentation=DOCU_COMMENT? 
	 *         name=ID 
	 *         (extends+=[ParameterSetDefinition|FQN] extends+=[ParameterSetDefinition|FQN]*)? 
	 *         parameters+=AbstractParameter*
	 *     )
	 */
	protected void sequence_ParameterSetDefinition(ISerializationContext context, ParameterSetDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterSetRepository returns ParameterSetRepository
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID sets+=ParameterSetDefinition*)
	 */
	protected void sequence_ParameterSetRepository(ISerializationContext context, ParameterSetRepository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractParameter returns TriggerDefinition
	 *     TriggerDefinition returns TriggerDefinition
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID attributes+=AttributeDefinition*)
	 */
	protected void sequence_TriggerDefinition(ISerializationContext context, TriggerDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
