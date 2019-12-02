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
package org.xtext.system.componentArchitecture.serializer;

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
import org.ecore.service.roboticMiddleware.ACE_SmartSoft;
import org.ecore.service.roboticMiddleware.CORBA_SmartSoft;
import org.ecore.service.roboticMiddleware.DDS_SmartSoft;
import org.ecore.service.roboticMiddleware.OpcUa_SeRoNet;
import org.ecore.service.roboticMiddleware.RoboticMiddlewarePackage;
import org.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage;
import org.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping;
import org.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping;
import org.ecore.system.compArchBehaviorExtension.TaskRealizationModelRef;
import org.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage;
import org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance;
import org.ecore.system.compArchSeronetExtension.OpcUaReadServerInstance;
import org.ecore.system.componentArchitecture.ActivityConfigurationMapping;
import org.ecore.system.componentArchitecture.ComponentArchitecturePackage;
import org.ecore.system.componentArchitecture.ComponentInstance;
import org.ecore.system.componentArchitecture.Connection;
import org.ecore.system.componentArchitecture.InputHandlerConfigurationMapping;
import org.ecore.system.componentArchitecture.ProvidedService;
import org.ecore.system.componentArchitecture.RequiredService;
import org.ecore.system.componentArchitecture.SystemComponentArchitecture;
import org.ecore.system.systemParameter.ParameterStructInstance;
import org.ecore.system.systemParameter.SystemParameterPackage;
import org.xtext.service.roboticMiddleware.serializer.RoboticMiddlewareSemanticSequencer;
import org.xtext.system.componentArchitecture.services.ComponentArchitectureGrammarAccess;

@SuppressWarnings("all")
public class ComponentArchitectureSemanticSequencer extends RoboticMiddlewareSemanticSequencer {

	@Inject
	private ComponentArchitectureGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CompArchBehaviorExtensionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING:
				sequence_CoordinationInterfaceComponentInstanceMapping(context, (CoordinationInterfaceComponentInstanceMapping) semanticObject); 
				return; 
			case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING:
				sequence_CoordinationModuleMapping(context, (CoordinationModuleMapping) semanticObject); 
				return; 
			case CompArchBehaviorExtensionPackage.TASK_REALIZATION_MODEL_REF:
				sequence_TaskRealizationModelRef(context, (TaskRealizationModelRef) semanticObject); 
				return; 
			}
		else if (epackage == CompArchSeronetExtensionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE:
				sequence_OpcUaDeviceClientInstance(context, (OpcUaDeviceClientInstance) semanticObject); 
				return; 
			case CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE:
				sequence_OpcUaReadServerInstance(context, (OpcUaReadServerInstance) semanticObject); 
				return; 
			}
		else if (epackage == ComponentArchitecturePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING:
				sequence_ActivityConfigurationMapping(context, (ActivityConfigurationMapping) semanticObject); 
				return; 
			case ComponentArchitecturePackage.COMPONENT_INSTANCE:
				sequence_ComponentInstance(context, (ComponentInstance) semanticObject); 
				return; 
			case ComponentArchitecturePackage.CONNECTION:
				sequence_Connection(context, (Connection) semanticObject); 
				return; 
			case ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING:
				sequence_InputHandlerConfigurationMapping(context, (InputHandlerConfigurationMapping) semanticObject); 
				return; 
			case ComponentArchitecturePackage.PROVIDED_SERVICE:
				sequence_ProvidedService(context, (ProvidedService) semanticObject); 
				return; 
			case ComponentArchitecturePackage.REQUIRED_SERVICE:
				sequence_RequiredService(context, (RequiredService) semanticObject); 
				return; 
			case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE:
				sequence_SystemComponentArchitecture(context, (SystemComponentArchitecture) semanticObject); 
				return; 
			}
		else if (epackage == DocumentationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT:
				sequence_AbstractDocumentedElement(context, (AbstractDocumentedElement) semanticObject); 
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
		else if (epackage == SystemParameterPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SystemParameterPackage.PARAMETER_STRUCT_INSTANCE:
				sequence_ParameterStructInstance(context, (ParameterStructInstance) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ComponentInstanceExtension returns ActivityConfigurationMapping
	 *     ActivityConfigurationMapping returns ActivityConfigurationMapping
	 *
	 * Constraint:
	 *     (activity=[Activity|FQN] config=[ActivityNode|FQN])
	 */
	protected void sequence_ActivityConfigurationMapping(ISerializationContext context, ActivityConfigurationMapping semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentArchitecturePackage.Literals.ACTIVITY_CONFIGURATION_MAPPING__ACTIVITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentArchitecturePackage.Literals.ACTIVITY_CONFIGURATION_MAPPING__ACTIVITY));
			if (transientValues.isValueTransient(semanticObject, ComponentArchitecturePackage.Literals.ACTIVITY_CONFIGURATION_MAPPING__CONFIG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentArchitecturePackage.Literals.ACTIVITY_CONFIGURATION_MAPPING__CONFIG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActivityConfigurationMappingAccess().getActivityActivityFQNParserRuleCall_1_0_1(), semanticObject.eGet(ComponentArchitecturePackage.Literals.ACTIVITY_CONFIGURATION_MAPPING__ACTIVITY, false));
		feeder.accept(grammarAccess.getActivityConfigurationMappingAccess().getConfigActivityNodeFQNParserRuleCall_3_0_1(), semanticObject.eGet(ComponentArchitecturePackage.Literals.ACTIVITY_CONFIGURATION_MAPPING__CONFIG, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentInstance returns ComponentInstance
	 *
	 * Constraint:
	 *     (name=ID component=[ComponentDefinition|FQN] ports+=ServiceInstance* extensions+=ComponentInstanceExtension*)
	 */
	protected void sequence_ComponentInstance(ISerializationContext context, ComponentInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Connection returns Connection
	 *
	 * Constraint:
	 *     (from=[RequiredService|FQN] to=[ProvidedService|FQN] middlewareSelection=RoboticMiddleware?)
	 */
	protected void sequence_Connection(ISerializationContext context, Connection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CoordinationInterfaceComponentInstanceMapping returns CoordinationInterfaceComponentInstanceMapping
	 *
	 * Constraint:
	 *     (coordInterInst=[CoordinationInterfaceInstance|ID] compInst=[ComponentInstance|ID])
	 */
	protected void sequence_CoordinationInterfaceComponentInstanceMapping(ISerializationContext context, CoordinationInterfaceComponentInstanceMapping semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CompArchBehaviorExtensionPackage.Literals.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COORD_INTER_INST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompArchBehaviorExtensionPackage.Literals.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COORD_INTER_INST));
			if (transientValues.isValueTransient(semanticObject, CompArchBehaviorExtensionPackage.Literals.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COMP_INST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompArchBehaviorExtensionPackage.Literals.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COMP_INST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstCoordinationInterfaceInstanceIDTerminalRuleCall_1_0_1(), semanticObject.eGet(CompArchBehaviorExtensionPackage.Literals.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COORD_INTER_INST, false));
		feeder.accept(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstComponentInstanceIDTerminalRuleCall_3_0_1(), semanticObject.eGet(CompArchBehaviorExtensionPackage.Literals.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COMP_INST, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SystemExtension returns CoordinationModuleMapping
	 *     CoordinationModuleMapping returns CoordinationModuleMapping
	 *
	 * Constraint:
	 *     (
	 *         coordModuleInst=[AbstractCoordinationModuleInstance|FQN] 
	 *         coordModReal=[CoordinationModuleRealization|ID] 
	 *         coordInterCompInstMapping+=CoordinationInterfaceComponentInstanceMapping+
	 *     )
	 */
	protected void sequence_CoordinationModuleMapping(ISerializationContext context, CoordinationModuleMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentInstanceExtension returns InputHandlerConfigurationMapping
	 *     InputHandlerConfigurationMapping returns InputHandlerConfigurationMapping
	 *
	 * Constraint:
	 *     (handler=[InputHandler|FQN] config=[InputHandlerNode|FQN])
	 */
	protected void sequence_InputHandlerConfigurationMapping(ISerializationContext context, InputHandlerConfigurationMapping semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentArchitecturePackage.Literals.INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentArchitecturePackage.Literals.INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER));
			if (transientValues.isValueTransient(semanticObject, ComponentArchitecturePackage.Literals.INPUT_HANDLER_CONFIGURATION_MAPPING__CONFIG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentArchitecturePackage.Literals.INPUT_HANDLER_CONFIGURATION_MAPPING__CONFIG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerInputHandlerFQNParserRuleCall_1_0_1(), semanticObject.eGet(ComponentArchitecturePackage.Literals.INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER, false));
		feeder.accept(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigInputHandlerNodeFQNParserRuleCall_3_0_1(), semanticObject.eGet(ComponentArchitecturePackage.Literals.INPUT_HANDLER_CONFIGURATION_MAPPING__CONFIG, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentInstanceExtension returns OpcUaDeviceClientInstance
	 *     OpcUaDeviceClientInstance returns OpcUaDeviceClientInstance
	 *
	 * Constraint:
	 *     (deviceClient=[OpcUaDeviceClient|FQN] deviceURI=EString)
	 */
	protected void sequence_OpcUaDeviceClientInstance(ISerializationContext context, OpcUaDeviceClientInstance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CompArchSeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompArchSeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT));
			if (transientValues.isValueTransient(semanticObject, CompArchSeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompArchSeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientOpcUaDeviceClientFQNParserRuleCall_1_0_1(), semanticObject.eGet(CompArchSeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT, false));
		feeder.accept(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIEStringParserRuleCall_3_0(), semanticObject.getDeviceURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentInstanceExtension returns OpcUaReadServerInstance
	 *     OpcUaReadServerInstance returns OpcUaReadServerInstance
	 *
	 * Constraint:
	 *     (readServer=[OpcUaReadServer|FQN] portNumber=EInt?)
	 */
	protected void sequence_OpcUaReadServerInstance(ISerializationContext context, OpcUaReadServerInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentInstanceExtension returns ParameterStructInstance
	 *     ParameterStructInstance returns ParameterStructInstance
	 *
	 * Constraint:
	 *     parameter=[ComponentParameterInstance|FQN]
	 */
	protected void sequence_ParameterStructInstance(ISerializationContext context, ParameterStructInstance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SystemParameterPackage.Literals.PARAMETER_STRUCT_INSTANCE__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemParameterPackage.Literals.PARAMETER_STRUCT_INSTANCE__PARAMETER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterStructInstanceAccess().getParameterComponentParameterInstanceFQNParserRuleCall_1_0_1(), semanticObject.eGet(SystemParameterPackage.Literals.PARAMETER_STRUCT_INSTANCE__PARAMETER, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ServiceInstance returns ProvidedService
	 *     ProvidedService returns ProvidedService
	 *
	 * Constraint:
	 *     port=[ComponentPort|ID]
	 */
	protected void sequence_ProvidedService(ISerializationContext context, ProvidedService semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentArchitecturePackage.Literals.SERVICE_INSTANCE__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentArchitecturePackage.Literals.SERVICE_INSTANCE__PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProvidedServiceAccess().getPortComponentPortIDTerminalRuleCall_1_0_1(), semanticObject.eGet(ComponentArchitecturePackage.Literals.SERVICE_INSTANCE__PORT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ServiceInstance returns RequiredService
	 *     RequiredService returns RequiredService
	 *
	 * Constraint:
	 *     port=[ComponentPort|ID]
	 */
	protected void sequence_RequiredService(ISerializationContext context, RequiredService semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentArchitecturePackage.Literals.SERVICE_INSTANCE__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentArchitecturePackage.Literals.SERVICE_INSTANCE__PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequiredServiceAccess().getPortComponentPortIDTerminalRuleCall_1_0_1(), semanticObject.eGet(ComponentArchitecturePackage.Literals.SERVICE_INSTANCE__PORT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SystemComponentArchitecture returns SystemComponentArchitecture
	 *
	 * Constraint:
	 *     (name=ID activityArch=[ActivityArchitectureModel|FQN]? components+=ComponentInstance* connections+=Connection* extensions+=SystemExtension*)
	 */
	protected void sequence_SystemComponentArchitecture(ISerializationContext context, SystemComponentArchitecture semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SystemExtension returns TaskRealizationModelRef
	 *     TaskRealizationModelRef returns TaskRealizationModelRef
	 *
	 * Constraint:
	 *     taskModelRef=[TaskRealizationModel|FQN]
	 */
	protected void sequence_TaskRealizationModelRef(ISerializationContext context, TaskRealizationModelRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CompArchBehaviorExtensionPackage.Literals.TASK_REALIZATION_MODEL_REF__TASK_MODEL_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompArchBehaviorExtensionPackage.Literals.TASK_REALIZATION_MODEL_REF__TASK_MODEL_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefTaskRealizationModelFQNParserRuleCall_1_0_1(), semanticObject.eGet(CompArchBehaviorExtensionPackage.Literals.TASK_REALIZATION_MODEL_REF__TASK_MODEL_REF, false));
		feeder.finish();
	}
	
	
}
