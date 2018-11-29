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
package org.xtext.system.componentArchitecture.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.system.componentArchitecture.ide.contentassist.antlr.internal.InternalComponentArchitectureParser;
import org.xtext.system.componentArchitecture.services.ComponentArchitectureGrammarAccess;

public class ComponentArchitectureParser extends AbstractContentAssistParser {

	@Inject
	private ComponentArchitectureGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalComponentArchitectureParser createParser() {
		InternalComponentArchitectureParser result = new InternalComponentArchitectureParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getComponentInstanceExtensionAccess().getAlternatives(), "rule__ComponentInstanceExtension__Alternatives");
					put(grammarAccess.getServiceInstanceAccess().getAlternatives(), "rule__ServiceInstance__Alternatives");
					put(grammarAccess.getRoboticMiddlewareAccess().getAlternatives(), "rule__RoboticMiddleware__Alternatives");
					put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getSystemComponentArchitectureAccess().getGroup(), "rule__SystemComponentArchitecture__Group__0");
					put(grammarAccess.getSystemComponentArchitectureAccess().getGroup_3(), "rule__SystemComponentArchitecture__Group_3__0");
					put(grammarAccess.getConnectionAccess().getGroup(), "rule__Connection__Group__0");
					put(grammarAccess.getConnectionAccess().getGroup_4(), "rule__Connection__Group_4__0");
					put(grammarAccess.getComponentInstanceAccess().getGroup(), "rule__ComponentInstance__Group__0");
					put(grammarAccess.getParameterStructInstanceAccess().getGroup(), "rule__ParameterStructInstance__Group__0");
					put(grammarAccess.getActivityConfigurationMappingAccess().getGroup(), "rule__ActivityConfigurationMapping__Group__0");
					put(grammarAccess.getInputHandlerConfigurationMappingAccess().getGroup(), "rule__InputHandlerConfigurationMapping__Group__0");
					put(grammarAccess.getOpcUaDeviceClientInstanceAccess().getGroup(), "rule__OpcUaDeviceClientInstance__Group__0");
					put(grammarAccess.getRequiredServiceAccess().getGroup(), "rule__RequiredService__Group__0");
					put(grammarAccess.getProvidedServiceAccess().getGroup(), "rule__ProvidedService__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getFQNWAccess().getGroup(), "rule__FQNW__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
					put(grammarAccess.getACE_SmartSoftAccess().getGroup(), "rule__ACE_SmartSoft__Group__0");
					put(grammarAccess.getACE_SmartSoftAccess().getGroup_2(), "rule__ACE_SmartSoft__Group_2__0");
					put(grammarAccess.getOpcUa_SeRoNetAccess().getGroup(), "rule__OpcUa_SeRoNet__Group__0");
					put(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2(), "rule__OpcUa_SeRoNet__Group_2__0");
					put(grammarAccess.getCORBA_SmartSoftAccess().getGroup(), "rule__CORBA_SmartSoft__Group__0");
					put(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2(), "rule__CORBA_SmartSoft__Group_2__0");
					put(grammarAccess.getDDS_SmartSoftAccess().getGroup(), "rule__DDS_SmartSoft__Group__0");
					put(grammarAccess.getDDS_SmartSoftAccess().getGroup_2(), "rule__DDS_SmartSoft__Group_2__0");
					put(grammarAccess.getSystemComponentArchitectureAccess().getNameAssignment_2(), "rule__SystemComponentArchitecture__NameAssignment_2");
					put(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchAssignment_3_1(), "rule__SystemComponentArchitecture__ActivityArchAssignment_3_1");
					put(grammarAccess.getSystemComponentArchitectureAccess().getComponentsAssignment_5(), "rule__SystemComponentArchitecture__ComponentsAssignment_5");
					put(grammarAccess.getSystemComponentArchitectureAccess().getConnectionsAssignment_6(), "rule__SystemComponentArchitecture__ConnectionsAssignment_6");
					put(grammarAccess.getConnectionAccess().getFromAssignment_1(), "rule__Connection__FromAssignment_1");
					put(grammarAccess.getConnectionAccess().getToAssignment_3(), "rule__Connection__ToAssignment_3");
					put(grammarAccess.getConnectionAccess().getMiddlewareSelectionAssignment_4_1(), "rule__Connection__MiddlewareSelectionAssignment_4_1");
					put(grammarAccess.getComponentInstanceAccess().getNameAssignment_1(), "rule__ComponentInstance__NameAssignment_1");
					put(grammarAccess.getComponentInstanceAccess().getComponentAssignment_3(), "rule__ComponentInstance__ComponentAssignment_3");
					put(grammarAccess.getComponentInstanceAccess().getPortsAssignment_5(), "rule__ComponentInstance__PortsAssignment_5");
					put(grammarAccess.getComponentInstanceAccess().getExtensionsAssignment_6(), "rule__ComponentInstance__ExtensionsAssignment_6");
					put(grammarAccess.getParameterStructInstanceAccess().getParameterAssignment_1(), "rule__ParameterStructInstance__ParameterAssignment_1");
					put(grammarAccess.getActivityConfigurationMappingAccess().getActivityAssignment_1(), "rule__ActivityConfigurationMapping__ActivityAssignment_1");
					put(grammarAccess.getActivityConfigurationMappingAccess().getConfigAssignment_3(), "rule__ActivityConfigurationMapping__ConfigAssignment_3");
					put(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerAssignment_1(), "rule__InputHandlerConfigurationMapping__HandlerAssignment_1");
					put(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigAssignment_3(), "rule__InputHandlerConfigurationMapping__ConfigAssignment_3");
					put(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientAssignment_1(), "rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1");
					put(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIAssignment_3(), "rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3");
					put(grammarAccess.getRequiredServiceAccess().getPortAssignment_1(), "rule__RequiredService__PortAssignment_1");
					put(grammarAccess.getProvidedServiceAccess().getPortAssignment_1(), "rule__ProvidedService__PortAssignment_1");
					put(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1(), "rule__ACE_SmartSoft__DescriptionAssignment_2_1");
					put(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1(), "rule__OpcUa_SeRoNet__DescriptionAssignment_2_1");
					put(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1(), "rule__CORBA_SmartSoft__DescriptionAssignment_2_1");
					put(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1(), "rule__DDS_SmartSoft__DescriptionAssignment_2_1");
				}
			};
		}
		return nameMappings.get(element);
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
}
