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
package org.xtext.behavior.taskRealization.serializer;

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
import org.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance;
import org.ecore.behavior.taskRealization.TaskRealization;
import org.ecore.behavior.taskRealization.TaskRealizationModel;
import org.ecore.behavior.taskRealization.TaskRealizationPackage;
import org.xtext.behavior.taskRealization.services.TaskRealizationGrammarAccess;

@SuppressWarnings("all")
public class TaskRealizationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TaskRealizationGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TaskRealizationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TaskRealizationPackage.ABSTRACT_COORDINATION_MODULE_INSTANCE:
				sequence_AbstractCoordinationModuleInstance(context, (AbstractCoordinationModuleInstance) semanticObject); 
				return; 
			case TaskRealizationPackage.TASK_REALIZATION:
				sequence_TaskRealization(context, (TaskRealization) semanticObject); 
				return; 
			case TaskRealizationPackage.TASK_REALIZATION_MODEL:
				sequence_TaskRealizationModel(context, (TaskRealizationModel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractCoordinationModuleInstance returns AbstractCoordinationModuleInstance
	 *
	 * Constraint:
	 *     (name=ID coordModuleDef=[CoordinationModuleDefinition|FQN])
	 */
	protected void sequence_AbstractCoordinationModuleInstance(ISerializationContext context, AbstractCoordinationModuleInstance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TaskRealizationPackage.Literals.ABSTRACT_COORDINATION_MODULE_INSTANCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TaskRealizationPackage.Literals.ABSTRACT_COORDINATION_MODULE_INSTANCE__NAME));
			if (transientValues.isValueTransient(semanticObject, TaskRealizationPackage.Literals.ABSTRACT_COORDINATION_MODULE_INSTANCE__COORD_MODULE_DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TaskRealizationPackage.Literals.ABSTRACT_COORDINATION_MODULE_INSTANCE__COORD_MODULE_DEF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefCoordinationModuleDefinitionFQNParserRuleCall_3_0_1(), semanticObject.eGet(TaskRealizationPackage.Literals.ABSTRACT_COORDINATION_MODULE_INSTANCE__COORD_MODULE_DEF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TaskRealizationModel returns TaskRealizationModel
	 *
	 * Constraint:
	 *     (name=ID abstCoordInst+=AbstractCoordinationModuleInstance* tasks+=TaskRealization*)
	 */
	protected void sequence_TaskRealizationModel(ISerializationContext context, TaskRealizationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TaskRealization returns TaskRealization
	 *
	 * Constraint:
	 *     taskDef=[TaskDefinition|FQN]
	 */
	protected void sequence_TaskRealization(ISerializationContext context, TaskRealization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TaskRealizationPackage.Literals.TASK_REALIZATION__TASK_DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TaskRealizationPackage.Literals.TASK_REALIZATION__TASK_DEF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTaskRealizationAccess().getTaskDefTaskDefinitionFQNParserRuleCall_1_0_1(), semanticObject.eGet(TaskRealizationPackage.Literals.TASK_REALIZATION__TASK_DEF, false));
		feeder.finish();
	}
	
	
}
