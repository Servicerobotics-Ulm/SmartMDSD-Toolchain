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
package org.xtext.system.activityArchitecture.serializer;

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
import org.ecore.system.activityArchitecture.ActivityArchitectureModel;
import org.ecore.system.activityArchitecture.ActivityArchitecturePackage;
import org.ecore.system.activityArchitecture.ActivityNode;
import org.ecore.system.activityArchitecture.CPUCore;
import org.ecore.system.activityArchitecture.DataFlow;
import org.ecore.system.activityArchitecture.DataTriggered;
import org.ecore.system.activityArchitecture.ExecutionTime;
import org.ecore.system.activityArchitecture.InputHandlerNode;
import org.ecore.system.activityArchitecture.PeriodicTimer;
import org.ecore.system.activityArchitecture.RegisterInputNode;
import org.ecore.system.activityArchitecture.Scheduler;
import org.ecore.system.activityArchitecture.Sporadic;
import org.ecore.system.activityArchitecture.TimeValue;
import org.ecore.system.activityArchitecture.TriggerInputNode;
import org.xtext.system.activityArchitecture.services.ActivityArchitectureGrammarAccess;

@SuppressWarnings("all")
public class ActivityArchitectureSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ActivityArchitectureGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ActivityArchitecturePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ActivityArchitecturePackage.ACTIVITY_ARCHITECTURE_MODEL:
				sequence_ActivityArchitectureModel(context, (ActivityArchitectureModel) semanticObject); 
				return; 
			case ActivityArchitecturePackage.ACTIVITY_NODE:
				sequence_ActivityNode(context, (ActivityNode) semanticObject); 
				return; 
			case ActivityArchitecturePackage.CPU_CORE:
				sequence_CPUCore(context, (CPUCore) semanticObject); 
				return; 
			case ActivityArchitecturePackage.DATA_FLOW:
				sequence_DataFlow(context, (DataFlow) semanticObject); 
				return; 
			case ActivityArchitecturePackage.DATA_TRIGGERED:
				sequence_DataTriggered(context, (DataTriggered) semanticObject); 
				return; 
			case ActivityArchitecturePackage.EXECUTION_TIME:
				sequence_ExecutionTime(context, (ExecutionTime) semanticObject); 
				return; 
			case ActivityArchitecturePackage.INPUT_HANDLER_NODE:
				sequence_InputHandlerNode(context, (InputHandlerNode) semanticObject); 
				return; 
			case ActivityArchitecturePackage.PERIODIC_TIMER:
				sequence_PeriodicTimer(context, (PeriodicTimer) semanticObject); 
				return; 
			case ActivityArchitecturePackage.REGISTER_INPUT_NODE:
				sequence_RegisterInputNode(context, (RegisterInputNode) semanticObject); 
				return; 
			case ActivityArchitecturePackage.SCHEDULER:
				sequence_Scheduler(context, (Scheduler) semanticObject); 
				return; 
			case ActivityArchitecturePackage.SPORADIC:
				sequence_Sporadic(context, (Sporadic) semanticObject); 
				return; 
			case ActivityArchitecturePackage.TIME_VALUE:
				sequence_TimeValue(context, (TimeValue) semanticObject); 
				return; 
			case ActivityArchitecturePackage.TRIGGER_INPUT_NODE:
				if (rule == grammarAccess.getHandlerTriggerInputNodeRule()) {
					sequence_HandlerTriggerInputNode(context, (TriggerInputNode) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAbstractInputNodeRule()
						|| rule == grammarAccess.getTriggerInputNodeRule()) {
					sequence_TriggerInputNode(context, (TriggerInputNode) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActivityArchitectureModel returns ActivityArchitectureModel
	 *
	 * Constraint:
	 *     (name=ID elements+=AbstractActivityArchitectureElement*)
	 */
	protected void sequence_ActivityArchitectureModel(ISerializationContext context, ActivityArchitectureModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractActivityArchitectureElement returns ActivityNode
	 *     AbstractSourceNode returns ActivityNode
	 *     ActivityNode returns ActivityNode
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         inputs+=AbstractInputNode* 
	 *         (affinity=[CPUCore|FQN] | activationSource=ActivationSource | executionTime=ExecutionTime | scheduler=Scheduler)*
	 *     )
	 */
	protected void sequence_ActivityNode(ISerializationContext context, ActivityNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractActivityArchitectureElement returns CPUCore
	 *     CPUCore returns CPUCore
	 *
	 * Constraint:
	 *     (name=ID coreNumber=EInt)
	 */
	protected void sequence_CPUCore(ISerializationContext context, CPUCore semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActivityArchitecturePackage.Literals.CPU_CORE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityArchitecturePackage.Literals.CPU_CORE__NAME));
			if (transientValues.isValueTransient(semanticObject, ActivityArchitecturePackage.Literals.CPU_CORE__CORE_NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityArchitecturePackage.Literals.CPU_CORE__CORE_NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCPUCoreAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCPUCoreAccess().getCoreNumberEIntParserRuleCall_4_0(), semanticObject.getCoreNumber());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractActivityArchitectureElement returns DataFlow
	 *     DataFlow returns DataFlow
	 *
	 * Constraint:
	 *     (source=[AbstractSourceNode|FQN] destination=[AbstractInputNode|FQN])
	 */
	protected void sequence_DataFlow(ISerializationContext context, DataFlow semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActivityArchitecturePackage.Literals.DATA_FLOW__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityArchitecturePackage.Literals.DATA_FLOW__SOURCE));
			if (transientValues.isValueTransient(semanticObject, ActivityArchitecturePackage.Literals.DATA_FLOW__DESTINATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityArchitecturePackage.Literals.DATA_FLOW__DESTINATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataFlowAccess().getSourceAbstractSourceNodeFQNParserRuleCall_3_0_1(), semanticObject.eGet(ActivityArchitecturePackage.Literals.DATA_FLOW__SOURCE, false));
		feeder.accept(grammarAccess.getDataFlowAccess().getDestinationAbstractInputNodeFQNParserRuleCall_5_0_1(), semanticObject.eGet(ActivityArchitecturePackage.Literals.DATA_FLOW__DESTINATION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ActivationSource returns DataTriggered
	 *     DataTriggered returns DataTriggered
	 *
	 * Constraint:
	 *     (triggerRef=[TriggerInputNode|FQN] prescale=EInt)
	 */
	protected void sequence_DataTriggered(ISerializationContext context, DataTriggered semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActivityArchitecturePackage.Literals.DATA_TRIGGERED__TRIGGER_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityArchitecturePackage.Literals.DATA_TRIGGERED__TRIGGER_REF));
			if (transientValues.isValueTransient(semanticObject, ActivityArchitecturePackage.Literals.DATA_TRIGGERED__PRESCALE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityArchitecturePackage.Literals.DATA_TRIGGERED__PRESCALE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataTriggeredAccess().getTriggerRefTriggerInputNodeFQNParserRuleCall_1_0_1(), semanticObject.eGet(ActivityArchitecturePackage.Literals.DATA_TRIGGERED__TRIGGER_REF, false));
		feeder.accept(grammarAccess.getDataTriggeredAccess().getPrescaleEIntParserRuleCall_4_0(), semanticObject.getPrescale());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExecutionTime returns ExecutionTime
	 *
	 * Constraint:
	 *     (minTime=TimeValue | maxTime=TimeValue)+
	 */
	protected void sequence_ExecutionTime(ISerializationContext context, ExecutionTime semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     HandlerTriggerInputNode returns TriggerInputNode
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_HandlerTriggerInputNode(ISerializationContext context, TriggerInputNode semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActivityArchitecturePackage.Literals.ABSTRACT_INPUT_NODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityArchitecturePackage.Literals.ABSTRACT_INPUT_NODE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHandlerTriggerInputNodeAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractActivityArchitectureElement returns InputHandlerNode
	 *     AbstractSourceNode returns InputHandlerNode
	 *     InputHandlerNode returns InputHandlerNode
	 *
	 * Constraint:
	 *     (name=ID inputNode=HandlerTriggerInputNode? prescale=EInt?)
	 */
	protected void sequence_InputHandlerNode(ISerializationContext context, InputHandlerNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActivationSource returns PeriodicTimer
	 *     PeriodicTimer returns PeriodicTimer
	 *
	 * Constraint:
	 *     periodicActFreq=EDouble
	 */
	protected void sequence_PeriodicTimer(ISerializationContext context, PeriodicTimer semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActivityArchitecturePackage.Literals.PERIODIC_TIMER__PERIODIC_ACT_FREQ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityArchitecturePackage.Literals.PERIODIC_TIMER__PERIODIC_ACT_FREQ));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_3_0(), semanticObject.getPeriodicActFreq());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractInputNode returns RegisterInputNode
	 *     RegisterInputNode returns RegisterInputNode
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_RegisterInputNode(ISerializationContext context, RegisterInputNode semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActivityArchitecturePackage.Literals.ABSTRACT_INPUT_NODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityArchitecturePackage.Literals.ABSTRACT_INPUT_NODE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRegisterInputNodeAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Scheduler returns Scheduler
	 *
	 * Constraint:
	 *     (type=SchedulerType | priority=EInt)*
	 */
	protected void sequence_Scheduler(ISerializationContext context, Scheduler semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActivationSource returns Sporadic
	 *     Sporadic returns Sporadic
	 *
	 * Constraint:
	 *     (minActFreq=EDouble | maxActFreq=EDouble)*
	 */
	protected void sequence_Sporadic(ISerializationContext context, Sporadic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TimeValue returns TimeValue
	 *
	 * Constraint:
	 *     (value=EInt unit=TimeUnit)
	 */
	protected void sequence_TimeValue(ISerializationContext context, TimeValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActivityArchitecturePackage.Literals.TIME_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityArchitecturePackage.Literals.TIME_VALUE__VALUE));
			if (transientValues.isValueTransient(semanticObject, ActivityArchitecturePackage.Literals.TIME_VALUE__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityArchitecturePackage.Literals.TIME_VALUE__UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeValueAccess().getValueEIntParserRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getTimeValueAccess().getUnitTimeUnitEnumRuleCall_1_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractInputNode returns TriggerInputNode
	 *     TriggerInputNode returns TriggerInputNode
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TriggerInputNode(ISerializationContext context, TriggerInputNode semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActivityArchitecturePackage.Literals.ABSTRACT_INPUT_NODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivityArchitecturePackage.Literals.ABSTRACT_INPUT_NODE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTriggerInputNodeAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
