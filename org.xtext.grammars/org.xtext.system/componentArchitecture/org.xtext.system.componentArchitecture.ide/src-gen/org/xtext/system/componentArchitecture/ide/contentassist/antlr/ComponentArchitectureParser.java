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
package org.xtext.system.componentArchitecture.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.system.componentArchitecture.ide.contentassist.antlr.internal.InternalComponentArchitectureParser;
import org.xtext.system.componentArchitecture.services.ComponentArchitectureGrammarAccess;

public class ComponentArchitectureParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ComponentArchitectureGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ComponentArchitectureGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSystemExtensionAccess().getAlternatives(), "rule__SystemExtension__Alternatives");
			builder.put(grammarAccess.getComponentInstanceExtensionAccess().getAlternatives(), "rule__ComponentInstanceExtension__Alternatives");
			builder.put(grammarAccess.getServiceInstanceAccess().getAlternatives(), "rule__ServiceInstance__Alternatives");
			builder.put(grammarAccess.getRoboticMiddlewareAccess().getAlternatives(), "rule__RoboticMiddleware__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getSystemComponentArchitectureAccess().getGroup(), "rule__SystemComponentArchitecture__Group__0");
			builder.put(grammarAccess.getSystemComponentArchitectureAccess().getGroup_3(), "rule__SystemComponentArchitecture__Group_3__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup(), "rule__Connection__Group__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_4(), "rule__Connection__Group_4__0");
			builder.put(grammarAccess.getComponentInstanceAccess().getGroup(), "rule__ComponentInstance__Group__0");
			builder.put(grammarAccess.getParameterStructInstanceAccess().getGroup(), "rule__ParameterStructInstance__Group__0");
			builder.put(grammarAccess.getActivityConfigurationMappingAccess().getGroup(), "rule__ActivityConfigurationMapping__Group__0");
			builder.put(grammarAccess.getInputHandlerConfigurationMappingAccess().getGroup(), "rule__InputHandlerConfigurationMapping__Group__0");
			builder.put(grammarAccess.getOpcUaDeviceClientInstanceAccess().getGroup(), "rule__OpcUaDeviceClientInstance__Group__0");
			builder.put(grammarAccess.getOpcUaReadServerInstanceAccess().getGroup(), "rule__OpcUaReadServerInstance__Group__0");
			builder.put(grammarAccess.getOpcUaReadServerInstanceAccess().getGroup_2(), "rule__OpcUaReadServerInstance__Group_2__0");
			builder.put(grammarAccess.getRequiredServiceAccess().getGroup(), "rule__RequiredService__Group__0");
			builder.put(grammarAccess.getProvidedServiceAccess().getGroup(), "rule__ProvidedService__Group__0");
			builder.put(grammarAccess.getCoordinationModuleMappingAccess().getGroup(), "rule__CoordinationModuleMapping__Group__0");
			builder.put(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getGroup(), "rule__CoordinationInterfaceComponentInstanceMapping__Group__0");
			builder.put(grammarAccess.getTaskRealizationModelRefAccess().getGroup(), "rule__TaskRealizationModelRef__Group__0");
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
			builder.put(grammarAccess.getSystemComponentArchitectureAccess().getNameAssignment_2(), "rule__SystemComponentArchitecture__NameAssignment_2");
			builder.put(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchAssignment_3_1(), "rule__SystemComponentArchitecture__ActivityArchAssignment_3_1");
			builder.put(grammarAccess.getSystemComponentArchitectureAccess().getComponentsAssignment_5(), "rule__SystemComponentArchitecture__ComponentsAssignment_5");
			builder.put(grammarAccess.getSystemComponentArchitectureAccess().getConnectionsAssignment_6(), "rule__SystemComponentArchitecture__ConnectionsAssignment_6");
			builder.put(grammarAccess.getSystemComponentArchitectureAccess().getExtensionsAssignment_7(), "rule__SystemComponentArchitecture__ExtensionsAssignment_7");
			builder.put(grammarAccess.getConnectionAccess().getFromAssignment_1(), "rule__Connection__FromAssignment_1");
			builder.put(grammarAccess.getConnectionAccess().getToAssignment_3(), "rule__Connection__ToAssignment_3");
			builder.put(grammarAccess.getConnectionAccess().getMiddlewareSelectionAssignment_4_1(), "rule__Connection__MiddlewareSelectionAssignment_4_1");
			builder.put(grammarAccess.getComponentInstanceAccess().getNameAssignment_1(), "rule__ComponentInstance__NameAssignment_1");
			builder.put(grammarAccess.getComponentInstanceAccess().getComponentAssignment_3(), "rule__ComponentInstance__ComponentAssignment_3");
			builder.put(grammarAccess.getComponentInstanceAccess().getPortsAssignment_5(), "rule__ComponentInstance__PortsAssignment_5");
			builder.put(grammarAccess.getComponentInstanceAccess().getExtensionsAssignment_6(), "rule__ComponentInstance__ExtensionsAssignment_6");
			builder.put(grammarAccess.getParameterStructInstanceAccess().getParameterAssignment_1(), "rule__ParameterStructInstance__ParameterAssignment_1");
			builder.put(grammarAccess.getActivityConfigurationMappingAccess().getActivityAssignment_1(), "rule__ActivityConfigurationMapping__ActivityAssignment_1");
			builder.put(grammarAccess.getActivityConfigurationMappingAccess().getConfigAssignment_3(), "rule__ActivityConfigurationMapping__ConfigAssignment_3");
			builder.put(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerAssignment_1(), "rule__InputHandlerConfigurationMapping__HandlerAssignment_1");
			builder.put(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigAssignment_3(), "rule__InputHandlerConfigurationMapping__ConfigAssignment_3");
			builder.put(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientAssignment_1(), "rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1");
			builder.put(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIAssignment_3(), "rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3");
			builder.put(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerAssignment_1(), "rule__OpcUaReadServerInstance__ReadServerAssignment_1");
			builder.put(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberAssignment_2_1(), "rule__OpcUaReadServerInstance__PortNumberAssignment_2_1");
			builder.put(grammarAccess.getRequiredServiceAccess().getPortAssignment_1(), "rule__RequiredService__PortAssignment_1");
			builder.put(grammarAccess.getProvidedServiceAccess().getPortAssignment_1(), "rule__ProvidedService__PortAssignment_1");
			builder.put(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAssignment_3(), "rule__CoordinationModuleMapping__CoordModuleInstAssignment_3");
			builder.put(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealAssignment_5(), "rule__CoordinationModuleMapping__CoordModRealAssignment_5");
			builder.put(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingAssignment_7(), "rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7");
			builder.put(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstAssignment_1(), "rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1");
			builder.put(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstAssignment_3(), "rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3");
			builder.put(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefAssignment_1(), "rule__TaskRealizationModelRef__TaskModelRefAssignment_1");
			builder.put(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1(), "rule__ACE_SmartSoft__DescriptionAssignment_2_1");
			builder.put(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1(), "rule__OpcUa_SeRoNet__DescriptionAssignment_2_1");
			builder.put(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1(), "rule__CORBA_SmartSoft__DescriptionAssignment_2_1");
			builder.put(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1(), "rule__DDS_SmartSoft__DescriptionAssignment_2_1");
			builder.put(grammarAccess.getAbstractDocumentedElementAccess().getDocumentationAssignment_1(), "rule__AbstractDocumentedElement__DocumentationAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ComponentArchitectureGrammarAccess grammarAccess;

	@Override
	protected InternalComponentArchitectureParser createParser() {
		InternalComponentArchitectureParser result = new InternalComponentArchitectureParser(null);
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

	public ComponentArchitectureGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ComponentArchitectureGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
