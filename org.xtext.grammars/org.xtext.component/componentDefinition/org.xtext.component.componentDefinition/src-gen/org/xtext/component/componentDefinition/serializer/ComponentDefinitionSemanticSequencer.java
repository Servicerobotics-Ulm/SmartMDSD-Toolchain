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
package org.xtext.component.componentDefinition.serializer;

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
import org.ecore.base.documentation.AbstractDocumentedElement;
import org.ecore.base.documentation.DocumentationPackage;
import org.ecore.component.componentDefinition.Activity;
import org.ecore.component.componentDefinition.AnswerPort;
import org.ecore.component.componentDefinition.ComponentDefModel;
import org.ecore.component.componentDefinition.ComponentDefinition;
import org.ecore.component.componentDefinition.ComponentDefinitionPackage;
import org.ecore.component.componentDefinition.ComponentSubNodeObserver;
import org.ecore.component.componentDefinition.InputHandler;
import org.ecore.component.componentDefinition.InputPort;
import org.ecore.component.componentDefinition.OutputPort;
import org.ecore.component.componentDefinition.RequestHandler;
import org.ecore.component.componentDefinition.RequestPort;
import org.ecore.component.componentDefinition.RequestPortLink;
import org.ecore.component.componentDefinition.ServiceRepoImport;
import org.ecore.component.componentParameter.ComponentParameterPackage;
import org.ecore.component.componentParameter.ComponentParametersRef;
import org.ecore.component.coordinationExtension.CommunicationServiceUsageRealization;
import org.ecore.component.coordinationExtension.CoordinationExtensionPackage;
import org.ecore.component.coordinationExtension.CoordinationMasterPort;
import org.ecore.component.coordinationExtension.CoordinationSlavePort;
import org.ecore.component.coordinationExtension.OperationModeBinding;
import org.ecore.component.coordinationExtension.PrivateOperationMode;
import org.ecore.component.coordinationExtension.PublicOperationMode;
import org.ecore.component.coordinationExtension.SkillRealizationsRef;
import org.ecore.component.performanceExtension.ActivationConstraints;
import org.ecore.component.performanceExtension.DefaultInputTrigger;
import org.ecore.component.performanceExtension.DefaultObservedElementTrigger;
import org.ecore.component.performanceExtension.DefaultPeriodicTimer;
import org.ecore.component.performanceExtension.InputLinkExtension;
import org.ecore.component.performanceExtension.PerformanceExtensionPackage;
import org.ecore.component.seronetExtension.MixedPortROS;
import org.ecore.component.seronetExtension.MixedPortROSLink;
import org.ecore.component.seronetExtension.MixedPortYARP;
import org.ecore.component.seronetExtension.OpcUaClientLink;
import org.ecore.component.seronetExtension.OpcUaDeviceClient;
import org.ecore.component.seronetExtension.OpcUaReadServer;
import org.ecore.component.seronetExtension.SeronetExtensionPackage;
import org.ecore.component.seronetExtension.SupportedMiddleware;
import org.ecore.service.roboticMiddleware.ACE_SmartSoft;
import org.ecore.service.roboticMiddleware.CORBA_SmartSoft;
import org.ecore.service.roboticMiddleware.DDS_SmartSoft;
import org.ecore.service.roboticMiddleware.OpcUa_SeRoNet;
import org.ecore.service.roboticMiddleware.RoboticMiddlewarePackage;
import org.xtext.component.componentDefinition.services.ComponentDefinitionGrammarAccess;
import org.xtext.service.roboticMiddleware.serializer.RoboticMiddlewareSemanticSequencer;

@SuppressWarnings("all")
public class ComponentDefinitionSemanticSequencer extends RoboticMiddlewareSemanticSequencer {

	@Inject
	private ComponentDefinitionGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ComponentDefinitionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentDefinitionPackage.ACTIVITY:
				sequence_Activity(context, (Activity) semanticObject); 
				return; 
			case ComponentDefinitionPackage.ANSWER_PORT:
				sequence_AnswerPort(context, (AnswerPort) semanticObject); 
				return; 
			case ComponentDefinitionPackage.COMPONENT_DEF_MODEL:
				sequence_ComponentDefModel(context, (ComponentDefModel) semanticObject); 
				return; 
			case ComponentDefinitionPackage.COMPONENT_DEFINITION:
				sequence_ComponentDefinition(context, (ComponentDefinition) semanticObject); 
				return; 
			case ComponentDefinitionPackage.COMPONENT_SUB_NODE_OBSERVER:
				sequence_ComponentSubNodeObserver(context, (ComponentSubNodeObserver) semanticObject); 
				return; 
			case ComponentDefinitionPackage.INPUT_HANDLER:
				sequence_InputHandler(context, (InputHandler) semanticObject); 
				return; 
			case ComponentDefinitionPackage.INPUT_PORT:
				sequence_InputPort(context, (InputPort) semanticObject); 
				return; 
			case ComponentDefinitionPackage.OUTPUT_PORT:
				sequence_OutputPort(context, (OutputPort) semanticObject); 
				return; 
			case ComponentDefinitionPackage.REQUEST_HANDLER:
				sequence_RequestHandler(context, (RequestHandler) semanticObject); 
				return; 
			case ComponentDefinitionPackage.REQUEST_PORT:
				sequence_RequestPort(context, (RequestPort) semanticObject); 
				return; 
			case ComponentDefinitionPackage.REQUEST_PORT_LINK:
				sequence_RequestPortLink(context, (RequestPortLink) semanticObject); 
				return; 
			case ComponentDefinitionPackage.SERVICE_REPO_IMPORT:
				sequence_ServiceRepoImport(context, (ServiceRepoImport) semanticObject); 
				return; 
			}
		else if (epackage == ComponentParameterPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentParameterPackage.COMPONENT_PARAMETERS_REF:
				sequence_ComponentParametersRef(context, (ComponentParametersRef) semanticObject); 
				return; 
			}
		else if (epackage == CoordinationExtensionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION:
				sequence_CommunicationServiceUsageRealization(context, (CommunicationServiceUsageRealization) semanticObject); 
				return; 
			case CoordinationExtensionPackage.COORDINATION_MASTER_PORT:
				sequence_CoordinationMasterPort(context, (CoordinationMasterPort) semanticObject); 
				return; 
			case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT:
				sequence_CoordinationSlavePort(context, (CoordinationSlavePort) semanticObject); 
				return; 
			case CoordinationExtensionPackage.OPERATION_MODE_BINDING:
				sequence_OperationModeBinding(context, (OperationModeBinding) semanticObject); 
				return; 
			case CoordinationExtensionPackage.PRIVATE_OPERATION_MODE:
				sequence_PrivateOperationMode(context, (PrivateOperationMode) semanticObject); 
				return; 
			case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE:
				sequence_PublicOperationMode(context, (PublicOperationMode) semanticObject); 
				return; 
			case CoordinationExtensionPackage.SKILL_REALIZATIONS_REF:
				sequence_SkillRealizationsRef(context, (SkillRealizationsRef) semanticObject); 
				return; 
			}
		else if (epackage == DocumentationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT:
				sequence_AbstractDocumentedElement(context, (AbstractDocumentedElement) semanticObject); 
				return; 
			}
		else if (epackage == PerformanceExtensionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS:
				sequence_ActivationConstraints(context, (ActivationConstraints) semanticObject); 
				return; 
			case PerformanceExtensionPackage.DEFAULT_INPUT_TRIGGER:
				sequence_DefaultInputTrigger(context, (DefaultInputTrigger) semanticObject); 
				return; 
			case PerformanceExtensionPackage.DEFAULT_OBSERVED_ELEMENT_TRIGGER:
				sequence_DefaultObservedElementTrigger(context, (DefaultObservedElementTrigger) semanticObject); 
				return; 
			case PerformanceExtensionPackage.DEFAULT_PERIODIC_TIMER:
				sequence_DefaultPeriodicTimer(context, (DefaultPeriodicTimer) semanticObject); 
				return; 
			case PerformanceExtensionPackage.INPUT_LINK_EXTENSION:
				sequence_InputLinkExtension(context, (InputLinkExtension) semanticObject); 
				return; 
			}
		else if (epackage == RoboticMiddlewarePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RoboticMiddlewarePackage.ACE_SMART_SOFT:
				sequence_ACE_SmartSoft(context, (ACE_SmartSoft) semanticObject); 
				return; 
			case RoboticMiddlewarePackage.CORBA_SMART_SOFT:
				sequence_CORBA_SmartSoft(context, (CORBA_SmartSoft) semanticObject); 
				return; 
			case RoboticMiddlewarePackage.DDS_SMART_SOFT:
				sequence_DDS_SmartSoft(context, (DDS_SmartSoft) semanticObject); 
				return; 
			case RoboticMiddlewarePackage.OPC_UA_SE_RO_NET:
				sequence_OpcUa_SeRoNet(context, (OpcUa_SeRoNet) semanticObject); 
				return; 
			}
		else if (epackage == SeronetExtensionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SeronetExtensionPackage.MIXED_PORT_ROS:
				sequence_MixedPortROS(context, (MixedPortROS) semanticObject); 
				return; 
			case SeronetExtensionPackage.MIXED_PORT_ROS_LINK:
				sequence_MixedPortROSLink(context, (MixedPortROSLink) semanticObject); 
				return; 
			case SeronetExtensionPackage.MIXED_PORT_YARP:
				sequence_MixedPortYARP(context, (MixedPortYARP) semanticObject); 
				return; 
			case SeronetExtensionPackage.OPC_UA_CLIENT_LINK:
				sequence_OpcUaClientLink(context, (OpcUaClientLink) semanticObject); 
				return; 
			case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT:
				sequence_OpcUaDeviceClient(context, (OpcUaDeviceClient) semanticObject); 
				return; 
			case SeronetExtensionPackage.OPC_UA_READ_SERVER:
				sequence_OpcUaReadServer(context, (OpcUaReadServer) semanticObject); 
				return; 
			case SeronetExtensionPackage.SUPPORTED_MIDDLEWARE:
				sequence_SupportedMiddleware(context, (SupportedMiddleware) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActivityExtension returns ActivationConstraints
	 *     ActivationConstraints returns ActivationConstraints
	 *
	 * Constraint:
	 *     (configurable=EBoolean (minActFreq=EDouble | maxActFreq=EDouble)*)
	 */
	protected void sequence_ActivationConstraints(ISerializationContext context, ActivationConstraints semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentElement returns Activity
	 *     NamedComponentElement returns Activity
	 *     ComponentSubNode returns Activity
	 *     Activity returns Activity
	 *
	 * Constraint:
	 *     (name=ID links+=AbstractComponentLink* extensions+=ActivityExtension*)
	 */
	protected void sequence_Activity(ISerializationContext context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentElement returns AnswerPort
	 *     NamedComponentElement returns AnswerPort
	 *     ComponentPort returns AnswerPort
	 *     AnswerPort returns AnswerPort
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID service=[TwoWayCommunicationService|FQN] extensions+=ComponentPortExtension*)
	 */
	protected void sequence_AnswerPort(ISerializationContext context, AnswerPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCoordinationElement returns CommunicationServiceUsageRealization
	 *     CommunicationServiceUsageRealization returns CommunicationServiceUsageRealization
	 *
	 * Constraint:
	 *     (serviceUsage=[CommunicationServiceUsage|FQN] componentPort=[ComponentPort|FQN])
	 */
	protected void sequence_CommunicationServiceUsageRealization(ISerializationContext context, CommunicationServiceUsageRealization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoordinationExtensionPackage.Literals.COMMUNICATION_SERVICE_USAGE_REALIZATION__SERVICE_USAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoordinationExtensionPackage.Literals.COMMUNICATION_SERVICE_USAGE_REALIZATION__SERVICE_USAGE));
			if (transientValues.isValueTransient(semanticObject, CoordinationExtensionPackage.Literals.COMMUNICATION_SERVICE_USAGE_REALIZATION__COMPONENT_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoordinationExtensionPackage.Literals.COMMUNICATION_SERVICE_USAGE_REALIZATION__COMPONENT_PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageCommunicationServiceUsageFQNParserRuleCall_1_0_1(), semanticObject.eGet(CoordinationExtensionPackage.Literals.COMMUNICATION_SERVICE_USAGE_REALIZATION__SERVICE_USAGE, false));
		feeder.accept(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortComponentPortFQNParserRuleCall_3_0_1(), semanticObject.eGet(CoordinationExtensionPackage.Literals.COMMUNICATION_SERVICE_USAGE_REALIZATION__COMPONENT_PORT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentDefModel returns ComponentDefModel
	 *
	 * Constraint:
	 *     (imports+=ServiceRepoImport* component=ComponentDefinition?)
	 */
	protected void sequence_ComponentDefModel(ISerializationContext context, ComponentDefModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentDefinition returns ComponentDefinition
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID logo=STRING? elements+=AbstractComponentElement*)
	 */
	protected void sequence_ComponentDefinition(ISerializationContext context, ComponentDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentElement returns ComponentParametersRef
	 *     DerivedComponentElement returns ComponentParametersRef
	 *     ComponentParametersRef returns ComponentParametersRef
	 *
	 * Constraint:
	 *     (parameter=[ComponentParameter|FQN] slave=[CoordinationSlavePort|FQN]?)
	 */
	protected void sequence_ComponentParametersRef(ISerializationContext context, ComponentParametersRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentLink returns ComponentSubNodeObserver
	 *     ComponentSubNodeObserver returns ComponentSubNodeObserver
	 *
	 * Constraint:
	 *     subject=[ComponentSubNode|FQN]
	 */
	protected void sequence_ComponentSubNodeObserver(ISerializationContext context, ComponentSubNodeObserver semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDefinitionPackage.Literals.COMPONENT_SUB_NODE_OBSERVER__SUBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDefinitionPackage.Literals.COMPONENT_SUB_NODE_OBSERVER__SUBJECT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentSubNodeObserverAccess().getSubjectComponentSubNodeFQNParserRuleCall_1_0_1(), semanticObject.eGet(ComponentDefinitionPackage.Literals.COMPONENT_SUB_NODE_OBSERVER__SUBJECT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentElement returns CoordinationMasterPort
	 *     NamedComponentElement returns CoordinationMasterPort
	 *     CoordinationMasterPort returns CoordinationMasterPort
	 *
	 * Constraint:
	 *     (name=ID service=[CoordinationServiceDefinition|FQN])
	 */
	protected void sequence_CoordinationMasterPort(ISerializationContext context, CoordinationMasterPort semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDefinitionPackage.Literals.NAMED_COMPONENT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDefinitionPackage.Literals.NAMED_COMPONENT_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, CoordinationExtensionPackage.Literals.COORDINATION_MASTER_PORT__SERVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoordinationExtensionPackage.Literals.COORDINATION_MASTER_PORT__SERVICE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCoordinationMasterPortAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCoordinationMasterPortAccess().getServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1(), semanticObject.eGet(CoordinationExtensionPackage.Literals.COORDINATION_MASTER_PORT__SERVICE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentElement returns CoordinationSlavePort
	 *     NamedComponentElement returns CoordinationSlavePort
	 *     CoordinationSlavePort returns CoordinationSlavePort
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID service=[CoordinationServiceDefinition|FQN] elements+=AbstractCoordinationElement*)
	 */
	protected void sequence_CoordinationSlavePort(ISerializationContext context, CoordinationSlavePort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActivityExtension returns DefaultInputTrigger
	 *     DefaultTrigger returns DefaultInputTrigger
	 *     DefaultInputTrigger returns DefaultInputTrigger
	 *
	 * Constraint:
	 *     (inputLink=[InputLinkExtension|FQN] prescale=EInt?)
	 */
	protected void sequence_DefaultInputTrigger(ISerializationContext context, DefaultInputTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActivityExtension returns DefaultObservedElementTrigger
	 *     DefaultTrigger returns DefaultObservedElementTrigger
	 *     DefaultObservedElementTrigger returns DefaultObservedElementTrigger
	 *
	 * Constraint:
	 *     element=[ComponentSubNode|FQN]
	 */
	protected void sequence_DefaultObservedElementTrigger(ISerializationContext context, DefaultObservedElementTrigger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PerformanceExtensionPackage.Literals.DEFAULT_OBSERVED_ELEMENT_TRIGGER__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PerformanceExtensionPackage.Literals.DEFAULT_OBSERVED_ELEMENT_TRIGGER__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefaultObservedElementTriggerAccess().getElementComponentSubNodeFQNParserRuleCall_1_0_1(), semanticObject.eGet(PerformanceExtensionPackage.Literals.DEFAULT_OBSERVED_ELEMENT_TRIGGER__ELEMENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ActivityExtension returns DefaultPeriodicTimer
	 *     DefaultTrigger returns DefaultPeriodicTimer
	 *     DefaultPeriodicTimer returns DefaultPeriodicTimer
	 *
	 * Constraint:
	 *     periodicActFreq=EDouble
	 */
	protected void sequence_DefaultPeriodicTimer(ISerializationContext context, DefaultPeriodicTimer semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PerformanceExtensionPackage.Literals.DEFAULT_PERIODIC_TIMER__PERIODIC_ACT_FREQ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PerformanceExtensionPackage.Literals.DEFAULT_PERIODIC_TIMER__PERIODIC_ACT_FREQ));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_1_0(), semanticObject.getPeriodicActFreq());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentElement returns InputHandler
	 *     NamedComponentElement returns InputHandler
	 *     ComponentSubNode returns InputHandler
	 *     InputHandler returns InputHandler
	 *
	 * Constraint:
	 *     (name=ID inputPort=[InputPort|FQN] activeQueue?='activeQueue'? links+=AbstractComponentLink*)
	 */
	protected void sequence_InputHandler(ISerializationContext context, InputHandler semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentLink returns InputLinkExtension
	 *     InputLinkExtension returns InputLinkExtension
	 *
	 * Constraint:
	 *     (inputPort=[InputPort|FQN] (optional?='optional' | oversamplingOk?='oversamplingOk' | undersamplingOk?='undersamplingOk')*)
	 */
	protected void sequence_InputLinkExtension(ISerializationContext context, InputLinkExtension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentElement returns InputPort
	 *     NamedComponentElement returns InputPort
	 *     ComponentPort returns InputPort
	 *     InputPort returns InputPort
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID service=[OneWayCommunicationService|FQN] extensions+=ComponentPortExtension*)
	 */
	protected void sequence_InputPort(ISerializationContext context, InputPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentLink returns MixedPortROSLink
	 *     MixedPortROSLink returns MixedPortROSLink
	 *
	 * Constraint:
	 *     mixedportros=[MixedPortROS|FQN]
	 */
	protected void sequence_MixedPortROSLink(ISerializationContext context, MixedPortROSLink semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeronetExtensionPackage.Literals.MIXED_PORT_ROS_LINK__MIXEDPORTROS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeronetExtensionPackage.Literals.MIXED_PORT_ROS_LINK__MIXEDPORTROS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMixedPortROSLinkAccess().getMixedportrosMixedPortROSFQNParserRuleCall_1_0_1(), semanticObject.eGet(SeronetExtensionPackage.Literals.MIXED_PORT_ROS_LINK__MIXEDPORTROS, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentElement returns MixedPortROS
	 *     DerivedComponentElement returns MixedPortROS
	 *     MixedPortROS returns MixedPortROS
	 *
	 * Constraint:
	 *     port=[MixedPortROSBase|ID]
	 */
	protected void sequence_MixedPortROS(ISerializationContext context, MixedPortROS semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeronetExtensionPackage.Literals.MIXED_PORT_ROS__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeronetExtensionPackage.Literals.MIXED_PORT_ROS__PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMixedPortROSAccess().getPortMixedPortROSBaseIDTerminalRuleCall_1_0_1(), semanticObject.eGet(SeronetExtensionPackage.Literals.MIXED_PORT_ROS__PORT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentElement returns MixedPortYARP
	 *     DerivedComponentElement returns MixedPortYARP
	 *     MixedPortYARP returns MixedPortYARP
	 *
	 * Constraint:
	 *     port=[MixedPortYARPBase|ID]
	 */
	protected void sequence_MixedPortYARP(ISerializationContext context, MixedPortYARP semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeronetExtensionPackage.Literals.MIXED_PORT_YARP__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeronetExtensionPackage.Literals.MIXED_PORT_YARP__PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMixedPortYARPAccess().getPortMixedPortYARPBaseIDTerminalRuleCall_1_0_1(), semanticObject.eGet(SeronetExtensionPackage.Literals.MIXED_PORT_YARP__PORT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentLink returns OpcUaClientLink
	 *     OpcUaClientLink returns OpcUaClientLink
	 *
	 * Constraint:
	 *     client=[OpcUaDeviceClient|FQN]
	 */
	protected void sequence_OpcUaClientLink(ISerializationContext context, OpcUaClientLink semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeronetExtensionPackage.Literals.OPC_UA_CLIENT_LINK__CLIENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeronetExtensionPackage.Literals.OPC_UA_CLIENT_LINK__CLIENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOpcUaClientLinkAccess().getClientOpcUaDeviceClientFQNParserRuleCall_1_0_1(), semanticObject.eGet(SeronetExtensionPackage.Literals.OPC_UA_CLIENT_LINK__CLIENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentElement returns OpcUaDeviceClient
	 *     PlainOpcUaPort returns OpcUaDeviceClient
	 *     OpcUaDeviceClient returns OpcUaDeviceClient
	 *
	 * Constraint:
	 *     (name=ID (deviceURI=EString | autoConnect?='autoConnect' | rootObjectPath=EString | opcuaXmlFile=EString)*)
	 */
	protected void sequence_OpcUaDeviceClient(ISerializationContext context, OpcUaDeviceClient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentElement returns OpcUaReadServer
	 *     PlainOpcUaPort returns OpcUaReadServer
	 *     OpcUaReadServer returns OpcUaReadServer
	 *
	 * Constraint:
	 *     (name=ID outPort=[OutputPort|FQN] portNumber=EInt?)
	 */
	protected void sequence_OpcUaReadServer(ISerializationContext context, OpcUaReadServer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActivityExtension returns OperationModeBinding
	 *     OperationModeBinding returns OperationModeBinding
	 *
	 * Constraint:
	 *     mode=[PrivateOperationMode|FQN]
	 */
	protected void sequence_OperationModeBinding(ISerializationContext context, OperationModeBinding semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoordinationExtensionPackage.Literals.OPERATION_MODE_BINDING__MODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoordinationExtensionPackage.Literals.OPERATION_MODE_BINDING__MODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationModeBindingAccess().getModePrivateOperationModeFQNParserRuleCall_1_0_1(), semanticObject.eGet(CoordinationExtensionPackage.Literals.OPERATION_MODE_BINDING__MODE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentElement returns OutputPort
	 *     NamedComponentElement returns OutputPort
	 *     ComponentPort returns OutputPort
	 *     OutputPort returns OutputPort
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID service=[OneWayCommunicationService|FQN] activity=[Activity|FQN] extensions+=ComponentPortExtension*)
	 */
	protected void sequence_OutputPort(ISerializationContext context, OutputPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCoordinationElement returns PrivateOperationMode
	 *     PrivateOperationMode returns PrivateOperationMode
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_PrivateOperationMode(ISerializationContext context, PrivateOperationMode semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoordinationExtensionPackage.Literals.PRIVATE_OPERATION_MODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoordinationExtensionPackage.Literals.PRIVATE_OPERATION_MODE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrivateOperationModeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCoordinationElement returns PublicOperationMode
	 *     PublicOperationMode returns PublicOperationMode
	 *
	 * Constraint:
	 *     (
	 *         documentation=DOCU_COMMENT? 
	 *         isDefaultInit?='default'? 
	 *         mode=[ComponentModeDefinition|FQN] 
	 *         (activates+=[PrivateOperationMode|ID] activates+=[PrivateOperationMode|ID]*)?
	 *     )
	 */
	protected void sequence_PublicOperationMode(ISerializationContext context, PublicOperationMode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentElement returns RequestHandler
	 *     NamedComponentElement returns RequestHandler
	 *     ComponentSubNode returns RequestHandler
	 *     RequestHandler returns RequestHandler
	 *
	 * Constraint:
	 *     (name=ID answerPort=[AnswerPort|FQN] activeQueue?='activeQueue'? links+=AbstractComponentLink*)
	 */
	protected void sequence_RequestHandler(ISerializationContext context, RequestHandler semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentLink returns RequestPortLink
	 *     RequestPortLink returns RequestPortLink
	 *
	 * Constraint:
	 *     requestPort=[RequestPort|FQN]
	 */
	protected void sequence_RequestPortLink(ISerializationContext context, RequestPortLink semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDefinitionPackage.Literals.REQUEST_PORT_LINK__REQUEST_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDefinitionPackage.Literals.REQUEST_PORT_LINK__REQUEST_PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequestPortLinkAccess().getRequestPortRequestPortFQNParserRuleCall_1_0_1(), semanticObject.eGet(ComponentDefinitionPackage.Literals.REQUEST_PORT_LINK__REQUEST_PORT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractComponentElement returns RequestPort
	 *     NamedComponentElement returns RequestPort
	 *     ComponentPort returns RequestPort
	 *     RequestPort returns RequestPort
	 *
	 * Constraint:
	 *     (documentation=DOCU_COMMENT? name=ID service=[TwoWayCommunicationService|FQN] extensions+=ComponentPortExtension*)
	 */
	protected void sequence_RequestPort(ISerializationContext context, RequestPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ServiceRepoImport returns ServiceRepoImport
	 *
	 * Constraint:
	 *     importedNamespace=FQNW
	 */
	protected void sequence_ServiceRepoImport(ISerializationContext context, ServiceRepoImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentDefinitionPackage.Literals.SERVICE_REPO_IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentDefinitionPackage.Literals.SERVICE_REPO_IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getServiceRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCoordinationElement returns SkillRealizationsRef
	 *     SkillRealizationsRef returns SkillRealizationsRef
	 *
	 * Constraint:
	 *     skillRealizationCoordModuleRef=[CoordinationModuleRealization|FQN]
	 */
	protected void sequence_SkillRealizationsRef(ISerializationContext context, SkillRealizationsRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoordinationExtensionPackage.Literals.SKILL_REALIZATIONS_REF__SKILL_REALIZATION_COORD_MODULE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoordinationExtensionPackage.Literals.SKILL_REALIZATIONS_REF__SKILL_REALIZATION_COORD_MODULE_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefCoordinationModuleRealizationFQNParserRuleCall_1_0_1(), semanticObject.eGet(CoordinationExtensionPackage.Literals.SKILL_REALIZATIONS_REF__SKILL_REALIZATION_COORD_MODULE_REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentPortExtension returns SupportedMiddleware
	 *     SupportedMiddleware returns SupportedMiddleware
	 *
	 * Constraint:
	 *     (default?='default'? middleware=RoboticMiddleware)
	 */
	protected void sequence_SupportedMiddleware(ISerializationContext context, SupportedMiddleware semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
