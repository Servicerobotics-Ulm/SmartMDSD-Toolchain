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
package org.xtext.component.componentDefinition.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.component.componentDefinition.ide.contentassist.antlr.internal.InternalComponentDefinitionParser;
import org.xtext.component.componentDefinition.services.ComponentDefinitionGrammarAccess;

public class ComponentDefinitionParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ComponentDefinitionGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ComponentDefinitionGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractComponentElementAccess().getAlternatives(), "rule__AbstractComponentElement__Alternatives");
			builder.put(grammarAccess.getDerivedComponentElementAccess().getAlternatives(), "rule__DerivedComponentElement__Alternatives");
			builder.put(grammarAccess.getNamedComponentElementAccess().getAlternatives(), "rule__NamedComponentElement__Alternatives");
			builder.put(grammarAccess.getComponentSubNodeAccess().getAlternatives(), "rule__ComponentSubNode__Alternatives");
			builder.put(grammarAccess.getComponentPortAccess().getAlternatives(), "rule__ComponentPort__Alternatives");
			builder.put(grammarAccess.getAbstractComponentLinkAccess().getAlternatives(), "rule__AbstractComponentLink__Alternatives");
			builder.put(grammarAccess.getActivityExtensionAccess().getAlternatives(), "rule__ActivityExtension__Alternatives");
			builder.put(grammarAccess.getDefaultTriggerAccess().getAlternatives_1(), "rule__DefaultTrigger__Alternatives_1");
			builder.put(grammarAccess.getPlainOpcUaPortAccess().getAlternatives(), "rule__PlainOpcUaPort__Alternatives");
			builder.put(grammarAccess.getAbstractCoordinationElementAccess().getAlternatives(), "rule__AbstractCoordinationElement__Alternatives");
			builder.put(grammarAccess.getRoboticMiddlewareAccess().getAlternatives(), "rule__RoboticMiddleware__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getComponentDefModelAccess().getGroup(), "rule__ComponentDefModel__Group__0");
			builder.put(grammarAccess.getServiceRepoImportAccess().getGroup(), "rule__ServiceRepoImport__Group__0");
			builder.put(grammarAccess.getComponentDefinitionAccess().getGroup(), "rule__ComponentDefinition__Group__0");
			builder.put(grammarAccess.getComponentDefinitionAccess().getGroup_3(), "rule__ComponentDefinition__Group_3__0");
			builder.put(grammarAccess.getRequestPortAccess().getGroup(), "rule__RequestPort__Group__0");
			builder.put(grammarAccess.getOutputPortAccess().getGroup(), "rule__OutputPort__Group__0");
			builder.put(grammarAccess.getAnswerPortAccess().getGroup(), "rule__AnswerPort__Group__0");
			builder.put(grammarAccess.getInputPortAccess().getGroup(), "rule__InputPort__Group__0");
			builder.put(grammarAccess.getSupportedMiddlewareAccess().getGroup(), "rule__SupportedMiddleware__Group__0");
			builder.put(grammarAccess.getActivityAccess().getGroup(), "rule__Activity__Group__0");
			builder.put(grammarAccess.getInputHandlerAccess().getGroup(), "rule__InputHandler__Group__0");
			builder.put(grammarAccess.getRequestHandlerAccess().getGroup(), "rule__RequestHandler__Group__0");
			builder.put(grammarAccess.getRequestPortLinkAccess().getGroup(), "rule__RequestPortLink__Group__0");
			builder.put(grammarAccess.getOpcUaClientLinkAccess().getGroup(), "rule__OpcUaClientLink__Group__0");
			builder.put(grammarAccess.getMixedPortROSLinkAccess().getGroup(), "rule__MixedPortROSLink__Group__0");
			builder.put(grammarAccess.getComponentSubNodeObserverAccess().getGroup(), "rule__ComponentSubNodeObserver__Group__0");
			builder.put(grammarAccess.getInputLinkExtensionAccess().getGroup(), "rule__InputLinkExtension__Group__0");
			builder.put(grammarAccess.getActivationConstraintsAccess().getGroup(), "rule__ActivationConstraints__Group__0");
			builder.put(grammarAccess.getActivationConstraintsAccess().getGroup_7_0(), "rule__ActivationConstraints__Group_7_0__0");
			builder.put(grammarAccess.getActivationConstraintsAccess().getGroup_7_1(), "rule__ActivationConstraints__Group_7_1__0");
			builder.put(grammarAccess.getOperationModeBindingAccess().getGroup(), "rule__OperationModeBinding__Group__0");
			builder.put(grammarAccess.getDefaultTriggerAccess().getGroup(), "rule__DefaultTrigger__Group__0");
			builder.put(grammarAccess.getDefaultInputTriggerAccess().getGroup(), "rule__DefaultInputTrigger__Group__0");
			builder.put(grammarAccess.getDefaultInputTriggerAccess().getGroup_2(), "rule__DefaultInputTrigger__Group_2__0");
			builder.put(grammarAccess.getDefaultPeriodicTimerAccess().getGroup(), "rule__DefaultPeriodicTimer__Group__0");
			builder.put(grammarAccess.getDefaultObservedElementTriggerAccess().getGroup(), "rule__DefaultObservedElementTrigger__Group__0");
			builder.put(grammarAccess.getOpcUaDeviceClientAccess().getGroup(), "rule__OpcUaDeviceClient__Group__0");
			builder.put(grammarAccess.getOpcUaDeviceClientAccess().getGroup_3_0(), "rule__OpcUaDeviceClient__Group_3_0__0");
			builder.put(grammarAccess.getOpcUaDeviceClientAccess().getGroup_3_2(), "rule__OpcUaDeviceClient__Group_3_2__0");
			builder.put(grammarAccess.getOpcUaDeviceClientAccess().getGroup_3_3(), "rule__OpcUaDeviceClient__Group_3_3__0");
			builder.put(grammarAccess.getOpcUaReadServerAccess().getGroup(), "rule__OpcUaReadServer__Group__0");
			builder.put(grammarAccess.getOpcUaReadServerAccess().getGroup_4(), "rule__OpcUaReadServer__Group_4__0");
			builder.put(grammarAccess.getMixedPortROSAccess().getGroup(), "rule__MixedPortROS__Group__0");
			builder.put(grammarAccess.getMixedPortYARPAccess().getGroup(), "rule__MixedPortYARP__Group__0");
			builder.put(grammarAccess.getCoordinationSlavePortAccess().getGroup(), "rule__CoordinationSlavePort__Group__0");
			builder.put(grammarAccess.getSkillRealizationsRefAccess().getGroup(), "rule__SkillRealizationsRef__Group__0");
			builder.put(grammarAccess.getCommunicationServiceUsageRealizationAccess().getGroup(), "rule__CommunicationServiceUsageRealization__Group__0");
			builder.put(grammarAccess.getPublicOperationModeAccess().getGroup(), "rule__PublicOperationMode__Group__0");
			builder.put(grammarAccess.getPublicOperationModeAccess().getGroup_6(), "rule__PublicOperationMode__Group_6__0");
			builder.put(grammarAccess.getPublicOperationModeAccess().getGroup_6_3(), "rule__PublicOperationMode__Group_6_3__0");
			builder.put(grammarAccess.getPrivateOperationModeAccess().getGroup(), "rule__PrivateOperationMode__Group__0");
			builder.put(grammarAccess.getCoordinationMasterPortAccess().getGroup(), "rule__CoordinationMasterPort__Group__0");
			builder.put(grammarAccess.getComponentParametersRefAccess().getGroup(), "rule__ComponentParametersRef__Group__0");
			builder.put(grammarAccess.getComponentParametersRefAccess().getGroup_2(), "rule__ComponentParametersRef__Group_2__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getFQNWAccess().getGroup(), "rule__FQNW__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getACE_SmartSoftAccess().getGroup(), "rule__ACE_SmartSoft__Group__0");
			builder.put(grammarAccess.getACE_SmartSoftAccess().getGroup_2(), "rule__ACE_SmartSoft__Group_2__0");
			builder.put(grammarAccess.getOpcUa_SeRoNetAccess().getGroup(), "rule__OpcUa_SeRoNet__Group__0");
			builder.put(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2(), "rule__OpcUa_SeRoNet__Group_2__0");
			builder.put(grammarAccess.getCORBA_SmartSoftAccess().getGroup(), "rule__CORBA_SmartSoft__Group__0");
			builder.put(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2(), "rule__CORBA_SmartSoft__Group_2__0");
			builder.put(grammarAccess.getDDS_SmartSoftAccess().getGroup(), "rule__DDS_SmartSoft__Group__0");
			builder.put(grammarAccess.getDDS_SmartSoftAccess().getGroup_2(), "rule__DDS_SmartSoft__Group_2__0");
			builder.put(grammarAccess.getAbstractDocumentedElementAccess().getGroup(), "rule__AbstractDocumentedElement__Group__0");
			builder.put(grammarAccess.getComponentDefModelAccess().getImportsAssignment_1(), "rule__ComponentDefModel__ImportsAssignment_1");
			builder.put(grammarAccess.getComponentDefModelAccess().getComponentAssignment_2(), "rule__ComponentDefModel__ComponentAssignment_2");
			builder.put(grammarAccess.getServiceRepoImportAccess().getImportedNamespaceAssignment_1(), "rule__ServiceRepoImport__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getComponentDefinitionAccess().getDocumentationAssignment_0(), "rule__ComponentDefinition__DocumentationAssignment_0");
			builder.put(grammarAccess.getComponentDefinitionAccess().getNameAssignment_2(), "rule__ComponentDefinition__NameAssignment_2");
			builder.put(grammarAccess.getComponentDefinitionAccess().getLogoAssignment_3_1(), "rule__ComponentDefinition__LogoAssignment_3_1");
			builder.put(grammarAccess.getComponentDefinitionAccess().getElementsAssignment_5(), "rule__ComponentDefinition__ElementsAssignment_5");
			builder.put(grammarAccess.getRequestPortAccess().getDocumentationAssignment_0(), "rule__RequestPort__DocumentationAssignment_0");
			builder.put(grammarAccess.getRequestPortAccess().getNameAssignment_2(), "rule__RequestPort__NameAssignment_2");
			builder.put(grammarAccess.getRequestPortAccess().getServiceAssignment_4(), "rule__RequestPort__ServiceAssignment_4");
			builder.put(grammarAccess.getRequestPortAccess().getExtensionsAssignment_6(), "rule__RequestPort__ExtensionsAssignment_6");
			builder.put(grammarAccess.getOutputPortAccess().getDocumentationAssignment_0(), "rule__OutputPort__DocumentationAssignment_0");
			builder.put(grammarAccess.getOutputPortAccess().getNameAssignment_2(), "rule__OutputPort__NameAssignment_2");
			builder.put(grammarAccess.getOutputPortAccess().getServiceAssignment_4(), "rule__OutputPort__ServiceAssignment_4");
			builder.put(grammarAccess.getOutputPortAccess().getActivityAssignment_6(), "rule__OutputPort__ActivityAssignment_6");
			builder.put(grammarAccess.getOutputPortAccess().getExtensionsAssignment_8(), "rule__OutputPort__ExtensionsAssignment_8");
			builder.put(grammarAccess.getAnswerPortAccess().getDocumentationAssignment_0(), "rule__AnswerPort__DocumentationAssignment_0");
			builder.put(grammarAccess.getAnswerPortAccess().getNameAssignment_2(), "rule__AnswerPort__NameAssignment_2");
			builder.put(grammarAccess.getAnswerPortAccess().getServiceAssignment_4(), "rule__AnswerPort__ServiceAssignment_4");
			builder.put(grammarAccess.getAnswerPortAccess().getExtensionsAssignment_6(), "rule__AnswerPort__ExtensionsAssignment_6");
			builder.put(grammarAccess.getInputPortAccess().getDocumentationAssignment_0(), "rule__InputPort__DocumentationAssignment_0");
			builder.put(grammarAccess.getInputPortAccess().getNameAssignment_2(), "rule__InputPort__NameAssignment_2");
			builder.put(grammarAccess.getInputPortAccess().getServiceAssignment_4(), "rule__InputPort__ServiceAssignment_4");
			builder.put(grammarAccess.getInputPortAccess().getExtensionsAssignment_6(), "rule__InputPort__ExtensionsAssignment_6");
			builder.put(grammarAccess.getSupportedMiddlewareAccess().getDefaultAssignment_1(), "rule__SupportedMiddleware__DefaultAssignment_1");
			builder.put(grammarAccess.getSupportedMiddlewareAccess().getMiddlewareAssignment_2(), "rule__SupportedMiddleware__MiddlewareAssignment_2");
			builder.put(grammarAccess.getActivityAccess().getNameAssignment_1(), "rule__Activity__NameAssignment_1");
			builder.put(grammarAccess.getActivityAccess().getLinksAssignment_3(), "rule__Activity__LinksAssignment_3");
			builder.put(grammarAccess.getActivityAccess().getExtensionsAssignment_4(), "rule__Activity__ExtensionsAssignment_4");
			builder.put(grammarAccess.getInputHandlerAccess().getNameAssignment_1(), "rule__InputHandler__NameAssignment_1");
			builder.put(grammarAccess.getInputHandlerAccess().getInputPortAssignment_3(), "rule__InputHandler__InputPortAssignment_3");
			builder.put(grammarAccess.getInputHandlerAccess().getActiveQueueAssignment_4(), "rule__InputHandler__ActiveQueueAssignment_4");
			builder.put(grammarAccess.getInputHandlerAccess().getLinksAssignment_6(), "rule__InputHandler__LinksAssignment_6");
			builder.put(grammarAccess.getRequestHandlerAccess().getNameAssignment_1(), "rule__RequestHandler__NameAssignment_1");
			builder.put(grammarAccess.getRequestHandlerAccess().getAnswerPortAssignment_3(), "rule__RequestHandler__AnswerPortAssignment_3");
			builder.put(grammarAccess.getRequestHandlerAccess().getActiveQueueAssignment_4(), "rule__RequestHandler__ActiveQueueAssignment_4");
			builder.put(grammarAccess.getRequestHandlerAccess().getLinksAssignment_6(), "rule__RequestHandler__LinksAssignment_6");
			builder.put(grammarAccess.getRequestPortLinkAccess().getRequestPortAssignment_1(), "rule__RequestPortLink__RequestPortAssignment_1");
			builder.put(grammarAccess.getOpcUaClientLinkAccess().getClientAssignment_1(), "rule__OpcUaClientLink__ClientAssignment_1");
			builder.put(grammarAccess.getMixedPortROSLinkAccess().getMixedportrosAssignment_1(), "rule__MixedPortROSLink__MixedportrosAssignment_1");
			builder.put(grammarAccess.getComponentSubNodeObserverAccess().getSubjectAssignment_1(), "rule__ComponentSubNodeObserver__SubjectAssignment_1");
			builder.put(grammarAccess.getInputLinkExtensionAccess().getInputPortAssignment_2(), "rule__InputLinkExtension__InputPortAssignment_2");
			builder.put(grammarAccess.getInputLinkExtensionAccess().getOptionalAssignment_4_0(), "rule__InputLinkExtension__OptionalAssignment_4_0");
			builder.put(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkAssignment_4_1(), "rule__InputLinkExtension__OversamplingOkAssignment_4_1");
			builder.put(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkAssignment_4_2(), "rule__InputLinkExtension__UndersamplingOkAssignment_4_2");
			builder.put(grammarAccess.getActivationConstraintsAccess().getConfigurableAssignment_5(), "rule__ActivationConstraints__ConfigurableAssignment_5");
			builder.put(grammarAccess.getActivationConstraintsAccess().getMinActFreqAssignment_7_0_2(), "rule__ActivationConstraints__MinActFreqAssignment_7_0_2");
			builder.put(grammarAccess.getActivationConstraintsAccess().getMaxActFreqAssignment_7_1_2(), "rule__ActivationConstraints__MaxActFreqAssignment_7_1_2");
			builder.put(grammarAccess.getOperationModeBindingAccess().getModeAssignment_1(), "rule__OperationModeBinding__ModeAssignment_1");
			builder.put(grammarAccess.getDefaultInputTriggerAccess().getInputLinkAssignment_1(), "rule__DefaultInputTrigger__InputLinkAssignment_1");
			builder.put(grammarAccess.getDefaultInputTriggerAccess().getPrescaleAssignment_2_1(), "rule__DefaultInputTrigger__PrescaleAssignment_2_1");
			builder.put(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqAssignment_1(), "rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1");
			builder.put(grammarAccess.getDefaultObservedElementTriggerAccess().getElementAssignment_1(), "rule__DefaultObservedElementTrigger__ElementAssignment_1");
			builder.put(grammarAccess.getOpcUaDeviceClientAccess().getNameAssignment_1(), "rule__OpcUaDeviceClient__NameAssignment_1");
			builder.put(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIAssignment_3_0_1(), "rule__OpcUaDeviceClient__DeviceURIAssignment_3_0_1");
			builder.put(grammarAccess.getOpcUaDeviceClientAccess().getAutoConnectAssignment_3_1(), "rule__OpcUaDeviceClient__AutoConnectAssignment_3_1");
			builder.put(grammarAccess.getOpcUaDeviceClientAccess().getRootObjectPathAssignment_3_2_1(), "rule__OpcUaDeviceClient__RootObjectPathAssignment_3_2_1");
			builder.put(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileAssignment_3_3_1(), "rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_3_3_1");
			builder.put(grammarAccess.getOpcUaReadServerAccess().getNameAssignment_1(), "rule__OpcUaReadServer__NameAssignment_1");
			builder.put(grammarAccess.getOpcUaReadServerAccess().getOutPortAssignment_3(), "rule__OpcUaReadServer__OutPortAssignment_3");
			builder.put(grammarAccess.getOpcUaReadServerAccess().getPortNumberAssignment_4_1(), "rule__OpcUaReadServer__PortNumberAssignment_4_1");
			builder.put(grammarAccess.getMixedPortROSAccess().getPortAssignment_1(), "rule__MixedPortROS__PortAssignment_1");
			builder.put(grammarAccess.getMixedPortYARPAccess().getPortAssignment_1(), "rule__MixedPortYARP__PortAssignment_1");
			builder.put(grammarAccess.getCoordinationSlavePortAccess().getDocumentationAssignment_0(), "rule__CoordinationSlavePort__DocumentationAssignment_0");
			builder.put(grammarAccess.getCoordinationSlavePortAccess().getNameAssignment_2(), "rule__CoordinationSlavePort__NameAssignment_2");
			builder.put(grammarAccess.getCoordinationSlavePortAccess().getServiceAssignment_4(), "rule__CoordinationSlavePort__ServiceAssignment_4");
			builder.put(grammarAccess.getCoordinationSlavePortAccess().getElementsAssignment_6(), "rule__CoordinationSlavePort__ElementsAssignment_6");
			builder.put(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefAssignment_1(), "rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1");
			builder.put(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageAssignment_1(), "rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1");
			builder.put(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortAssignment_3(), "rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3");
			builder.put(grammarAccess.getPublicOperationModeAccess().getDocumentationAssignment_1(), "rule__PublicOperationMode__DocumentationAssignment_1");
			builder.put(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitAssignment_2(), "rule__PublicOperationMode__IsDefaultInitAssignment_2");
			builder.put(grammarAccess.getPublicOperationModeAccess().getModeAssignment_4(), "rule__PublicOperationMode__ModeAssignment_4");
			builder.put(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_6_2(), "rule__PublicOperationMode__ActivatesAssignment_6_2");
			builder.put(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_6_3_1(), "rule__PublicOperationMode__ActivatesAssignment_6_3_1");
			builder.put(grammarAccess.getPrivateOperationModeAccess().getNameAssignment_1(), "rule__PrivateOperationMode__NameAssignment_1");
			builder.put(grammarAccess.getCoordinationMasterPortAccess().getNameAssignment_1(), "rule__CoordinationMasterPort__NameAssignment_1");
			builder.put(grammarAccess.getCoordinationMasterPortAccess().getServiceAssignment_3(), "rule__CoordinationMasterPort__ServiceAssignment_3");
			builder.put(grammarAccess.getComponentParametersRefAccess().getParameterAssignment_1(), "rule__ComponentParametersRef__ParameterAssignment_1");
			builder.put(grammarAccess.getComponentParametersRefAccess().getSlaveAssignment_2_1(), "rule__ComponentParametersRef__SlaveAssignment_2_1");
			builder.put(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1(), "rule__ACE_SmartSoft__DescriptionAssignment_2_1");
			builder.put(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1(), "rule__OpcUa_SeRoNet__DescriptionAssignment_2_1");
			builder.put(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1(), "rule__CORBA_SmartSoft__DescriptionAssignment_2_1");
			builder.put(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1(), "rule__DDS_SmartSoft__DescriptionAssignment_2_1");
			builder.put(grammarAccess.getAbstractDocumentedElementAccess().getDocumentationAssignment_1(), "rule__AbstractDocumentedElement__DocumentationAssignment_1");
			builder.put(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), "rule__InputLinkExtension__UnorderedGroup_4");
			builder.put(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), "rule__ActivationConstraints__UnorderedGroup_7");
			builder.put(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), "rule__OpcUaDeviceClient__UnorderedGroup_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ComponentDefinitionGrammarAccess grammarAccess;

	@Override
	protected InternalComponentDefinitionParser createParser() {
		InternalComponentDefinitionParser result = new InternalComponentDefinitionParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ComponentDefinitionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ComponentDefinitionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
