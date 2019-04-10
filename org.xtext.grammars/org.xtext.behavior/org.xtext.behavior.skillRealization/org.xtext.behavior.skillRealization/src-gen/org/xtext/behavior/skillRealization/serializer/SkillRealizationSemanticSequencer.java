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
package org.xtext.behavior.skillRealization.serializer;

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
import org.ecore.behavior.skillRealization.ComponentCoordinationActionActivation;
import org.ecore.behavior.skillRealization.ComponentCoordinationActionEvent;
import org.ecore.behavior.skillRealization.ComponentCoordinationActionParameter;
import org.ecore.behavior.skillRealization.CoordinationActionBlock;
import org.ecore.behavior.skillRealization.CoordinationInterfaceInstance;
import org.ecore.behavior.skillRealization.CoordinationModuleRealization;
import org.ecore.behavior.skillRealization.SkillRealization;
import org.ecore.behavior.skillRealization.SkillRealizationModel;
import org.ecore.behavior.skillRealization.SkillRealizationPackage;
import org.xtext.behavior.skillRealization.services.SkillRealizationGrammarAccess;

@SuppressWarnings("all")
public class SkillRealizationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SkillRealizationGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SkillRealizationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_ACTIVATION:
				sequence_ComponentCoordinationActionActivation(context, (ComponentCoordinationActionActivation) semanticObject); 
				return; 
			case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT:
				sequence_ComponentCoordinationActionEvent(context, (ComponentCoordinationActionEvent) semanticObject); 
				return; 
			case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_PARAMETER:
				sequence_ComponentCoordinationActionParameter(context, (ComponentCoordinationActionParameter) semanticObject); 
				return; 
			case SkillRealizationPackage.COORDINATION_ACTION_BLOCK:
				sequence_CoordinationActionBlock(context, (CoordinationActionBlock) semanticObject); 
				return; 
			case SkillRealizationPackage.COORDINATION_INTERFACE_INSTANCE:
				sequence_CoordinationInterfaceInstance(context, (CoordinationInterfaceInstance) semanticObject); 
				return; 
			case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION:
				sequence_CoordinationModuleRealization(context, (CoordinationModuleRealization) semanticObject); 
				return; 
			case SkillRealizationPackage.SKILL_REALIZATION:
				sequence_SkillRealization(context, (SkillRealization) semanticObject); 
				return; 
			case SkillRealizationPackage.SKILL_REALIZATION_MODEL:
				sequence_SkillRealizationModel(context, (SkillRealizationModel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractCoordinationAction returns ComponentCoordinationActionActivation
	 *     AbstractComponentCoordinationAction returns ComponentCoordinationActionActivation
	 *     ComponentCoordinationActionActivation returns ComponentCoordinationActionActivation
	 *
	 * Constraint:
	 *     (coordinationService=[CoordinationInterfaceInstance|ID] state=[ComponentModeDefinition|FQN])
	 */
	protected void sequence_ComponentCoordinationActionActivation(ISerializationContext context, ComponentCoordinationActionActivation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SkillRealizationPackage.Literals.ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SkillRealizationPackage.Literals.ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE));
			if (transientValues.isValueTransient(semanticObject, SkillRealizationPackage.Literals.COMPONENT_COORDINATION_ACTION_ACTIVATION__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SkillRealizationPackage.Literals.COMPONENT_COORDINATION_ACTION_ACTIVATION__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentCoordinationActionActivationAccess().getCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_2_0_1(), semanticObject.eGet(SkillRealizationPackage.Literals.ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE, false));
		feeder.accept(grammarAccess.getComponentCoordinationActionActivationAccess().getStateComponentModeDefinitionFQNParserRuleCall_4_0_1(), semanticObject.eGet(SkillRealizationPackage.Literals.COMPONENT_COORDINATION_ACTION_ACTIVATION__STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCoordinationAction returns ComponentCoordinationActionEvent
	 *     AbstractComponentCoordinationAction returns ComponentCoordinationActionEvent
	 *     ComponentCoordinationActionEvent returns ComponentCoordinationActionEvent
	 *
	 * Constraint:
	 *     coordinationService=[CoordinationInterfaceInstance|ID]
	 */
	protected void sequence_ComponentCoordinationActionEvent(ISerializationContext context, ComponentCoordinationActionEvent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SkillRealizationPackage.Literals.ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SkillRealizationPackage.Literals.ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentCoordinationActionEventAccess().getCoordinationServiceCoordinationInterfaceInstanceIDTerminalRuleCall_3_0_1(), semanticObject.eGet(SkillRealizationPackage.Literals.ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCoordinationAction returns ComponentCoordinationActionParameter
	 *     AbstractComponentCoordinationAction returns ComponentCoordinationActionParameter
	 *     ComponentCoordinationActionParameter returns ComponentCoordinationActionParameter
	 *
	 * Constraint:
	 *     (coordinationService=[CoordinationInterfaceInstance|ID] parameter=[AbstractParameter|FQN] value=STRING?)
	 */
	protected void sequence_ComponentCoordinationActionParameter(ISerializationContext context, ComponentCoordinationActionParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CoordinationActionBlock returns CoordinationActionBlock
	 *
	 * Constraint:
	 *     actions+=AbstractCoordinationAction*
	 */
	protected void sequence_CoordinationActionBlock(ISerializationContext context, CoordinationActionBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CoordinationInterfaceInstance returns CoordinationInterfaceInstance
	 *
	 * Constraint:
	 *     (coordinationInterfaceDef=[CoordinationServiceDefinition|FQN] name=ID)
	 */
	protected void sequence_CoordinationInterfaceInstance(ISerializationContext context, CoordinationInterfaceInstance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SkillRealizationPackage.Literals.COORDINATION_INTERFACE_INSTANCE__COORDINATION_INTERFACE_DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SkillRealizationPackage.Literals.COORDINATION_INTERFACE_INSTANCE__COORDINATION_INTERFACE_DEF));
			if (transientValues.isValueTransient(semanticObject, SkillRealizationPackage.Literals.COORDINATION_INTERFACE_INSTANCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SkillRealizationPackage.Literals.COORDINATION_INTERFACE_INSTANCE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCoordinationInterfaceInstanceAccess().getCoordinationInterfaceDefCoordinationServiceDefinitionFQNParserRuleCall_0_0_1(), semanticObject.eGet(SkillRealizationPackage.Literals.COORDINATION_INTERFACE_INSTANCE__COORDINATION_INTERFACE_DEF, false));
		feeder.accept(grammarAccess.getCoordinationInterfaceInstanceAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CoordinationModuleRealization returns CoordinationModuleRealization
	 *
	 * Constraint:
	 *     (name=ID coordinationModuleDef=[CoordinationModuleDefinition|FQN] coordInterfaceInsts+=CoordinationInterfaceInstance* skills+=SkillRealization*)
	 */
	protected void sequence_CoordinationModuleRealization(ISerializationContext context, CoordinationModuleRealization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SkillRealizationModel returns SkillRealizationModel
	 *
	 * Constraint:
	 *     modules+=CoordinationModuleRealization*
	 */
	protected void sequence_SkillRealizationModel(ISerializationContext context, SkillRealizationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SkillRealization returns SkillRealization
	 *
	 * Constraint:
	 *     (skillDef=[SkillDefinition|FQN] action=CoordinationActionBlock)
	 */
	protected void sequence_SkillRealization(ISerializationContext context, SkillRealization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SkillRealizationPackage.Literals.SKILL_REALIZATION__SKILL_DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SkillRealizationPackage.Literals.SKILL_REALIZATION__SKILL_DEF));
			if (transientValues.isValueTransient(semanticObject, SkillRealizationPackage.Literals.SKILL_REALIZATION__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SkillRealizationPackage.Literals.SKILL_REALIZATION__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSkillRealizationAccess().getSkillDefSkillDefinitionFQNParserRuleCall_1_0_1(), semanticObject.eGet(SkillRealizationPackage.Literals.SKILL_REALIZATION__SKILL_DEF, false));
		feeder.accept(grammarAccess.getSkillRealizationAccess().getActionCoordinationActionBlockParserRuleCall_5_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
}
