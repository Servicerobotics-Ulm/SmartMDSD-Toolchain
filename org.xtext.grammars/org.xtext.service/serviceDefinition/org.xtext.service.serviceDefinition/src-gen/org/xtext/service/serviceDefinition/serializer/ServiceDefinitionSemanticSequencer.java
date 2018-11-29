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
package org.xtext.service.serviceDefinition.serializer;

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
import org.ecore.service.communicationPattern.CommunicationPatternPackage;
import org.ecore.service.communicationPattern.EventPattern;
import org.ecore.service.communicationPattern.PushPattern;
import org.ecore.service.communicationPattern.QueryPattern;
import org.ecore.service.communicationPattern.SendPattern;
import org.ecore.service.coordinationPattern.CoordinationPatternPackage;
import org.ecore.service.coordinationPattern.DynamicWiringPattern;
import org.ecore.service.coordinationPattern.MonitoringPattern;
import org.ecore.service.coordinationPattern.ParameterPattern;
import org.ecore.service.coordinationPattern.StatePattern;
import org.ecore.service.serviceDefinition.CommRepoImport;
import org.ecore.service.serviceDefinition.CommunicationServiceUsage;
import org.ecore.service.serviceDefinition.CoordinationServiceDefinition;
import org.ecore.service.serviceDefinition.ForkingServiceDefinition;
import org.ecore.service.serviceDefinition.JoiningServiceDefinition;
import org.ecore.service.serviceDefinition.RequestAnswerServiceDefinition;
import org.ecore.service.serviceDefinition.ServiceDefModel;
import org.ecore.service.serviceDefinition.ServiceDefRepository;
import org.ecore.service.serviceDefinition.ServiceDefinitionPackage;
import org.ecore.service.serviceDefinition.ServiceProperty;
import org.ecore.service.serviceDefinition.ServiceRepoVersion;
import org.xtext.service.serviceDefinition.services.ServiceDefinitionGrammarAccess;

@SuppressWarnings("all")
public class ServiceDefinitionSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ServiceDefinitionGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CommunicationPatternPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CommunicationPatternPackage.EVENT_PATTERN:
				sequence_EventPattern(context, (EventPattern) semanticObject); 
				return; 
			case CommunicationPatternPackage.PUSH_PATTERN:
				sequence_PushPattern(context, (PushPattern) semanticObject); 
				return; 
			case CommunicationPatternPackage.QUERY_PATTERN:
				sequence_QueryPattern(context, (QueryPattern) semanticObject); 
				return; 
			case CommunicationPatternPackage.SEND_PATTERN:
				sequence_SendPattern(context, (SendPattern) semanticObject); 
				return; 
			}
		else if (epackage == CoordinationPatternPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CoordinationPatternPackage.DYNAMIC_WIRING_PATTERN:
				sequence_DynamicWiringPattern(context, (DynamicWiringPattern) semanticObject); 
				return; 
			case CoordinationPatternPackage.MONITORING_PATTERN:
				sequence_MonitoringPattern(context, (MonitoringPattern) semanticObject); 
				return; 
			case CoordinationPatternPackage.PARAMETER_PATTERN:
				sequence_ParameterPattern(context, (ParameterPattern) semanticObject); 
				return; 
			case CoordinationPatternPackage.STATE_PATTERN:
				sequence_StatePattern(context, (StatePattern) semanticObject); 
				return; 
			}
		else if (epackage == ServiceDefinitionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ServiceDefinitionPackage.COMM_REPO_IMPORT:
				sequence_CommRepoImport(context, (CommRepoImport) semanticObject); 
				return; 
			case ServiceDefinitionPackage.COMMUNICATION_SERVICE_USAGE:
				sequence_CommunicationServiceUsage(context, (CommunicationServiceUsage) semanticObject); 
				return; 
			case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION:
				sequence_CoordinationServiceDefinition(context, (CoordinationServiceDefinition) semanticObject); 
				return; 
			case ServiceDefinitionPackage.FORKING_SERVICE_DEFINITION:
				sequence_ForkingServiceDefinition(context, (ForkingServiceDefinition) semanticObject); 
				return; 
			case ServiceDefinitionPackage.JOINING_SERVICE_DEFINITION:
				sequence_JoyningServiceDefinition(context, (JoiningServiceDefinition) semanticObject); 
				return; 
			case ServiceDefinitionPackage.REQUEST_ANSWER_SERVICE_DEFINITION:
				sequence_RequestAnswerServiceDefinition(context, (RequestAnswerServiceDefinition) semanticObject); 
				return; 
			case ServiceDefinitionPackage.SERVICE_DEF_MODEL:
				sequence_ServiceDefModel(context, (ServiceDefModel) semanticObject); 
				return; 
			case ServiceDefinitionPackage.SERVICE_DEF_REPOSITORY:
				sequence_ServiceDefRepository(context, (ServiceDefRepository) semanticObject); 
				return; 
			case ServiceDefinitionPackage.SERVICE_PROPERTY:
				sequence_ServiceProperty(context, (ServiceProperty) semanticObject); 
				return; 
			case ServiceDefinitionPackage.SERVICE_REPO_VERSION:
				sequence_ServiceRepoVersion(context, (ServiceRepoVersion) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     CommRepoImport returns CommRepoImport
	 *
	 * Constraint:
	 *     importedNamespace=FQNW
	 */
	protected void sequence_CommRepoImport(ISerializationContext context, CommRepoImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ServiceDefinitionPackage.Literals.COMM_REPO_IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServiceDefinitionPackage.Literals.COMM_REPO_IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CommunicationServiceUsage returns CommunicationServiceUsage
	 *
	 * Constraint:
	 *     (name=ID uses=[CommunicationServiceDefinition|FQN])
	 */
	protected void sequence_CommunicationServiceUsage(ISerializationContext context, CommunicationServiceUsage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ServiceDefinitionPackage.Literals.COMMUNICATION_SERVICE_USAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServiceDefinitionPackage.Literals.COMMUNICATION_SERVICE_USAGE__NAME));
			if (transientValues.isValueTransient(semanticObject, ServiceDefinitionPackage.Literals.COMMUNICATION_SERVICE_USAGE__USES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServiceDefinitionPackage.Literals.COMMUNICATION_SERVICE_USAGE__USES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommunicationServiceUsageAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCommunicationServiceUsageAccess().getUsesCommunicationServiceDefinitionFQNParserRuleCall_3_0_1(), semanticObject.eGet(ServiceDefinitionPackage.Literals.COMMUNICATION_SERVICE_USAGE__USES, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractServiceDefinition returns CoordinationServiceDefinition
	 *     CoordinationServiceDefinition returns CoordinationServiceDefinition
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (statePattern=StatePattern | parameterPattern=ParameterPattern | monitoringPattern=MonitoringPattern | wiringPattern=DynamicWiringPattern)* 
	 *         services+=CommunicationServiceUsage* 
	 *         properties+=ServiceProperty*
	 *     )
	 */
	protected void sequence_CoordinationServiceDefinition(ISerializationContext context, CoordinationServiceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DynamicWiringPattern returns DynamicWiringPattern
	 *
	 * Constraint:
	 *     {DynamicWiringPattern}
	 */
	protected void sequence_DynamicWiringPattern(ISerializationContext context, DynamicWiringPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ForkingPatternInstance returns EventPattern
	 *     EventPattern returns EventPattern
	 *
	 * Constraint:
	 *     (eventType=[CommunicationObject|FQN] | activationType=[CommunicationObject|FQN] | eventStateType=[CommunicationObject|FQN])+
	 */
	protected void sequence_EventPattern(ISerializationContext context, EventPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractServiceDefinition returns ForkingServiceDefinition
	 *     CommunicationServiceDefinition returns ForkingServiceDefinition
	 *     ForkingServiceDefinition returns ForkingServiceDefinition
	 *
	 * Constraint:
	 *     (name=ID pattern=ForkingPatternInstance properties+=ServiceProperty*)
	 */
	protected void sequence_ForkingServiceDefinition(ISerializationContext context, ForkingServiceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractServiceDefinition returns JoiningServiceDefinition
	 *     CommunicationServiceDefinition returns JoiningServiceDefinition
	 *     JoyningServiceDefinition returns JoiningServiceDefinition
	 *
	 * Constraint:
	 *     (name=ID pattern=JoiningPatternInstance properties+=ServiceProperty*)
	 */
	protected void sequence_JoyningServiceDefinition(ISerializationContext context, JoiningServiceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MonitoringPattern returns MonitoringPattern
	 *
	 * Constraint:
	 *     {MonitoringPattern}
	 */
	protected void sequence_MonitoringPattern(ISerializationContext context, MonitoringPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterPattern returns ParameterPattern
	 *
	 * Constraint:
	 *     parameterSet=[ParameterSetDefinition|FQN]
	 */
	protected void sequence_ParameterPattern(ISerializationContext context, ParameterPattern semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoordinationPatternPackage.Literals.PARAMETER_PATTERN__PARAMETER_SET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoordinationPatternPackage.Literals.PARAMETER_PATTERN__PARAMETER_SET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterPatternAccess().getParameterSetParameterSetDefinitionFQNParserRuleCall_3_0_1(), semanticObject.eGet(CoordinationPatternPackage.Literals.PARAMETER_PATTERN__PARAMETER_SET, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ForkingPatternInstance returns PushPattern
	 *     PushPattern returns PushPattern
	 *
	 * Constraint:
	 *     dataType=[CommunicationObject|FQN]
	 */
	protected void sequence_PushPattern(ISerializationContext context, PushPattern semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommunicationPatternPackage.Literals.PUSH_PATTERN__DATA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommunicationPatternPackage.Literals.PUSH_PATTERN__DATA_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPushPatternAccess().getDataTypeCommunicationObjectFQNParserRuleCall_5_0_1(), semanticObject.eGet(CommunicationPatternPackage.Literals.PUSH_PATTERN__DATA_TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RequestAnswerPattern returns QueryPattern
	 *     QueryPattern returns QueryPattern
	 *
	 * Constraint:
	 *     (requestType=[CommunicationObject|FQN] | answerType=[CommunicationObject|FQN])+
	 */
	protected void sequence_QueryPattern(ISerializationContext context, QueryPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractServiceDefinition returns RequestAnswerServiceDefinition
	 *     CommunicationServiceDefinition returns RequestAnswerServiceDefinition
	 *     RequestAnswerServiceDefinition returns RequestAnswerServiceDefinition
	 *
	 * Constraint:
	 *     (name=ID pattern=RequestAnswerPattern properties+=ServiceProperty*)
	 */
	protected void sequence_RequestAnswerServiceDefinition(ISerializationContext context, RequestAnswerServiceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JoiningPatternInstance returns SendPattern
	 *     SendPattern returns SendPattern
	 *
	 * Constraint:
	 *     dataType=[CommunicationObject|FQN]
	 */
	protected void sequence_SendPattern(ISerializationContext context, SendPattern semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CommunicationPatternPackage.Literals.SEND_PATTERN__DATA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommunicationPatternPackage.Literals.SEND_PATTERN__DATA_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSendPatternAccess().getDataTypeCommunicationObjectFQNParserRuleCall_5_0_1(), semanticObject.eGet(CommunicationPatternPackage.Literals.SEND_PATTERN__DATA_TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ServiceDefModel returns ServiceDefModel
	 *
	 * Constraint:
	 *     (imports+=CommRepoImport* repository=ServiceDefRepository?)
	 */
	protected void sequence_ServiceDefModel(ISerializationContext context, ServiceDefModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ServiceDefRepository returns ServiceDefRepository
	 *
	 * Constraint:
	 *     (name=ID version=ServiceRepoVersion? services+=AbstractServiceDefinition*)
	 */
	protected void sequence_ServiceDefRepository(ISerializationContext context, ServiceDefRepository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ServiceProperty returns ServiceProperty
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ServiceProperty(ISerializationContext context, ServiceProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ServiceDefinitionPackage.Literals.SERVICE_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServiceDefinitionPackage.Literals.SERVICE_PROPERTY__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getServicePropertyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ServiceRepoVersion returns ServiceRepoVersion
	 *
	 * Constraint:
	 *     (major=EInt minor=EInt patch=EInt?)
	 */
	protected void sequence_ServiceRepoVersion(ISerializationContext context, ServiceRepoVersion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StatePattern returns StatePattern
	 *
	 * Constraint:
	 *     (lifecycle=[StateMachine|FQN] modes=[ComponentModeCollection|FQN]?)
	 */
	protected void sequence_StatePattern(ISerializationContext context, StatePattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
