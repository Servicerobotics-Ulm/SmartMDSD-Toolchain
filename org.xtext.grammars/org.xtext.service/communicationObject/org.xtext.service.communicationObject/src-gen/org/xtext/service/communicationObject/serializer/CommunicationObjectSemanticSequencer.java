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
package org.xtext.service.communicationObject.serializer;

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
import org.ecore.service.communicationObject.CommElementReference;
import org.ecore.service.communicationObject.CommElementValue;
import org.ecore.service.communicationObject.CommObjectModel;
import org.ecore.service.communicationObject.CommObjectsRepository;
import org.ecore.service.communicationObject.CommRepositoryImport;
import org.ecore.service.communicationObject.CommunicationObject;
import org.ecore.service.communicationObject.CommunicationObjectPackage;
import org.ecore.service.communicationObject.Enumeration;
import org.ecore.service.communicationObject.Version;
import org.xtext.base.basicAttributes.serializer.BasicAttributesSemanticSequencer;
import org.xtext.service.communicationObject.services.CommunicationObjectGrammarAccess;

@SuppressWarnings("all")
public class CommunicationObjectSemanticSequencer extends BasicAttributesSemanticSequencer {

	@Inject
	private CommunicationObjectGrammarAccess grammarAccess;
	
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
		else if (epackage == CommunicationObjectPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CommunicationObjectPackage.COMM_ELEMENT_REFERENCE:
				sequence_CommElementReference(context, (CommElementReference) semanticObject); 
				return; 
			case CommunicationObjectPackage.COMM_ELEMENT_VALUE:
				sequence_SingleValue(context, (CommElementValue) semanticObject); 
				return; 
			case CommunicationObjectPackage.COMM_OBJECT_MODEL:
				sequence_CommObjectModel(context, (CommObjectModel) semanticObject); 
				return; 
			case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY:
				sequence_CommObjectsRepository(context, (CommObjectsRepository) semanticObject); 
				return; 
			case CommunicationObjectPackage.COMM_REPOSITORY_IMPORT:
				sequence_CommRepositoryImport(context, (CommRepositoryImport) semanticObject); 
				return; 
			case CommunicationObjectPackage.COMMUNICATION_OBJECT:
				sequence_CommunicationObject(context, (CommunicationObject) semanticObject); 
				return; 
			case CommunicationObjectPackage.ENUMERATION:
				sequence_Enumeration(context, (Enumeration) semanticObject); 
				return; 
			case CommunicationObjectPackage.VERSION:
				sequence_Version(context, (Version) semanticObject); 
				return; 
			}
		else if (epackage == DocumentationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT:
				sequence_AbstractDocumentedElement(context, (AbstractDocumentedElement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractAttributeType returns CommElementReference
	 *     CommElementReference returns CommElementReference
	 *
	 * Constraint:
	 *     (typeName=[AbstractCommElement|FQN] array=ArrayType?)
	 */
	protected void sequence_CommElementReference(ISerializationContext context, CommElementReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CommObjectModel returns CommObjectModel
	 *
	 * Constraint:
	 *     ((imports+=CommRepositoryImport+ repository=CommObjectsRepository) | repository=CommObjectsRepository)?
	 */
	protected void sequence_CommObjectModel(ISerializationContext context, CommObjectModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CommObjectsRepository returns CommObjectsRepository
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID version=Version? dependency=EString? elements+=AbstractCommElement*)
	 */
	protected void sequence_CommObjectsRepository(ISerializationContext context, CommObjectsRepository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CommRepositoryImport returns CommRepositoryImport
	 *
	 * Constraint:
	 *     importedNamespace=FQNW
	 */
	protected void sequence_CommRepositoryImport(ISerializationContext context, CommRepositoryImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommunicationObjectPackage.Literals.COMM_REPOSITORY_IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommunicationObjectPackage.Literals.COMM_REPOSITORY_IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommRepositoryImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommElement returns CommunicationObject
	 *     CommunicationObject returns CommunicationObject
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID attributes+=AttributeDefinition*)
	 */
	protected void sequence_CommunicationObject(ISerializationContext context, CommunicationObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommElement returns Enumeration
	 *     Enumeration returns Enumeration
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID enums+=EnumerationElement*)
	 */
	protected void sequence_Enumeration(ISerializationContext context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SingleValue returns CommElementValue
	 *     AbstractValue returns CommElementValue
	 *
	 * Constraint:
	 *     value=[AbstractCommElement|FQN]
	 */
	protected void sequence_SingleValue(ISerializationContext context, CommElementValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommunicationObjectPackage.Literals.COMM_ELEMENT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommunicationObjectPackage.Literals.COMM_ELEMENT_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSingleValueAccess().getValueAbstractCommElementFQNParserRuleCall_0_1_0_1(), semanticObject.eGet(CommunicationObjectPackage.Literals.COMM_ELEMENT_VALUE__VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Version returns Version
	 *
	 * Constraint:
	 *     (major=INT minor=INT patch=INT?)
	 */
	protected void sequence_Version(ISerializationContext context, Version semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
