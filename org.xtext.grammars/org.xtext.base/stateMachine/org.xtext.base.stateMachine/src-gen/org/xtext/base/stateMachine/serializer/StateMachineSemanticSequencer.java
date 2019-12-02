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
package org.xtext.base.stateMachine.serializer;

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
import org.ecore.base.stateMachine.State;
import org.ecore.base.stateMachine.StateMachine;
import org.ecore.base.stateMachine.StateMachinePackage;
import org.ecore.base.stateMachine.StateTransition;
import org.xtext.base.stateMachine.services.StateMachineGrammarAccess;

@SuppressWarnings("all")
public class StateMachineSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StateMachineGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == StateMachinePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case StateMachinePackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case StateMachinePackage.STATE_MACHINE:
				sequence_StateMachine(context, (StateMachine) semanticObject); 
				return; 
			case StateMachinePackage.STATE_TRANSITION:
				sequence_StateTransition(context, (StateTransition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     StateMachine returns StateMachine
	 *
	 * Constraint:
	 *     (name=ID elements+=AbstractMachineElement*)
	 */
	protected void sequence_StateMachine(ISerializationContext context, StateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractMachineElement returns StateTransition
	 *     StateTransition returns StateTransition
	 *
	 * Constraint:
	 *     (visibility=VisibilityType? from=[AbstractStateElement|FQN] to=[AbstractStateElement|FQN])
	 */
	protected void sequence_StateTransition(ISerializationContext context, StateTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractMachineElement returns State
	 *     AbstractStateElement returns State
	 *     State returns State
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.ABSTRACT_STATE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.ABSTRACT_STATE_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
