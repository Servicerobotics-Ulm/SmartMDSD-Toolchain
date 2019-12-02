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
package org.xtext.service.componentMode.serializer;

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
import org.ecore.service.componentMode.ComponentModeCollection;
import org.ecore.service.componentMode.ComponentModeDefinition;
import org.ecore.service.componentMode.ComponentModeModel;
import org.ecore.service.componentMode.ComponentModePackage;
import org.ecore.service.componentMode.ComponentModeRepository;
import org.xtext.service.componentMode.services.ComponentModeGrammarAccess;

@SuppressWarnings("all")
public class ComponentModeSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ComponentModeGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ComponentModePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentModePackage.COMPONENT_MODE_COLLECTION:
				sequence_ComponentModeCollection(context, (ComponentModeCollection) semanticObject); 
				return; 
			case ComponentModePackage.COMPONENT_MODE_DEFINITION:
				sequence_ComponentModeDefinition(context, (ComponentModeDefinition) semanticObject); 
				return; 
			case ComponentModePackage.COMPONENT_MODE_MODEL:
				sequence_ComponentModeModel(context, (ComponentModeModel) semanticObject); 
				return; 
			case ComponentModePackage.COMPONENT_MODE_REPOSITORY:
				sequence_ComponentModeRepository(context, (ComponentModeRepository) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ComponentModeCollection returns ComponentModeCollection
	 *
	 * Constraint:
	 *     (name=ID modes+=ComponentModeDefinition*)
	 */
	protected void sequence_ComponentModeCollection(ISerializationContext context, ComponentModeCollection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentModeDefinition returns ComponentModeDefinition
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ComponentModeDefinition(ISerializationContext context, ComponentModeDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentModePackage.Literals.COMPONENT_MODE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentModePackage.Literals.COMPONENT_MODE_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentModeDefinitionAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentModeModel returns ComponentModeModel
	 *
	 * Constraint:
	 *     repository=ComponentModeRepository?
	 */
	protected void sequence_ComponentModeModel(ISerializationContext context, ComponentModeModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentModeRepository returns ComponentModeRepository
	 *
	 * Constraint:
	 *     (name=ID collections+=ComponentModeCollection*)
	 */
	protected void sequence_ComponentModeRepository(ISerializationContext context, ComponentModeRepository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
