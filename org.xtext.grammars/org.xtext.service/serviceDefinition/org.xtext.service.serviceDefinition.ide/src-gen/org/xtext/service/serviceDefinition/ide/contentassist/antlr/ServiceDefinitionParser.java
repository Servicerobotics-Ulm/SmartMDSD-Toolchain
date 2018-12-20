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
package org.xtext.service.serviceDefinition.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.service.serviceDefinition.ide.contentassist.antlr.internal.InternalServiceDefinitionParser;
import org.xtext.service.serviceDefinition.services.ServiceDefinitionGrammarAccess;

public class ServiceDefinitionParser extends AbstractContentAssistParser {

	@Inject
	private ServiceDefinitionGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalServiceDefinitionParser createParser() {
		InternalServiceDefinitionParser result = new InternalServiceDefinitionParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractServiceDefinitionAccess().getAlternatives(), "rule__AbstractServiceDefinition__Alternatives");
					put(grammarAccess.getCommunicationServiceDefinitionAccess().getAlternatives(), "rule__CommunicationServiceDefinition__Alternatives");
					put(grammarAccess.getForkingPatternInstanceAccess().getAlternatives(), "rule__ForkingPatternInstance__Alternatives");
					put(grammarAccess.getServiceDefModelAccess().getGroup(), "rule__ServiceDefModel__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getFQNWAccess().getGroup(), "rule__FQNW__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getServiceDefRepositoryAccess().getGroup(), "rule__ServiceDefRepository__Group__0");
					put(grammarAccess.getServiceDefRepositoryAccess().getGroup_2(), "rule__ServiceDefRepository__Group_2__0");
					put(grammarAccess.getServiceRepoVersionAccess().getGroup(), "rule__ServiceRepoVersion__Group__0");
					put(grammarAccess.getServiceRepoVersionAccess().getGroup_3(), "rule__ServiceRepoVersion__Group_3__0");
					put(grammarAccess.getCommRepoImportAccess().getGroup(), "rule__CommRepoImport__Group__0");
					put(grammarAccess.getForkingServiceDefinitionAccess().getGroup(), "rule__ForkingServiceDefinition__Group__0");
					put(grammarAccess.getForkingServiceDefinitionAccess().getGroup_4(), "rule__ForkingServiceDefinition__Group_4__0");
					put(grammarAccess.getJoyningServiceDefinitionAccess().getGroup(), "rule__JoyningServiceDefinition__Group__0");
					put(grammarAccess.getJoyningServiceDefinitionAccess().getGroup_4(), "rule__JoyningServiceDefinition__Group_4__0");
					put(grammarAccess.getRequestAnswerServiceDefinitionAccess().getGroup(), "rule__RequestAnswerServiceDefinition__Group__0");
					put(grammarAccess.getRequestAnswerServiceDefinitionAccess().getGroup_4(), "rule__RequestAnswerServiceDefinition__Group_4__0");
					put(grammarAccess.getCoordinationServiceDefinitionAccess().getGroup(), "rule__CoordinationServiceDefinition__Group__0");
					put(grammarAccess.getCoordinationServiceDefinitionAccess().getGroup_3_0(), "rule__CoordinationServiceDefinition__Group_3_0__0");
					put(grammarAccess.getCommunicationServiceUsageAccess().getGroup(), "rule__CommunicationServiceUsage__Group__0");
					put(grammarAccess.getStatePatternAccess().getGroup(), "rule__StatePattern__Group__0");
					put(grammarAccess.getStatePatternAccess().getGroup_5(), "rule__StatePattern__Group_5__0");
					put(grammarAccess.getParameterPatternAccess().getGroup(), "rule__ParameterPattern__Group__0");
					put(grammarAccess.getDynamicWiringPatternAccess().getGroup(), "rule__DynamicWiringPattern__Group__0");
					put(grammarAccess.getMonitoringPatternAccess().getGroup(), "rule__MonitoringPattern__Group__0");
					put(grammarAccess.getPushPatternAccess().getGroup(), "rule__PushPattern__Group__0");
					put(grammarAccess.getEventPatternAccess().getGroup(), "rule__EventPattern__Group__0");
					put(grammarAccess.getEventPatternAccess().getGroup_3_0(), "rule__EventPattern__Group_3_0__0");
					put(grammarAccess.getEventPatternAccess().getGroup_3_1(), "rule__EventPattern__Group_3_1__0");
					put(grammarAccess.getEventPatternAccess().getGroup_3_2(), "rule__EventPattern__Group_3_2__0");
					put(grammarAccess.getQueryPatternAccess().getGroup(), "rule__QueryPattern__Group__0");
					put(grammarAccess.getQueryPatternAccess().getGroup_3_0(), "rule__QueryPattern__Group_3_0__0");
					put(grammarAccess.getQueryPatternAccess().getGroup_3_1(), "rule__QueryPattern__Group_3_1__0");
					put(grammarAccess.getSendPatternAccess().getGroup(), "rule__SendPattern__Group__0");
					put(grammarAccess.getServicePropertyAccess().getGroup(), "rule__ServiceProperty__Group__0");
					put(grammarAccess.getServiceDefModelAccess().getImportsAssignment_1(), "rule__ServiceDefModel__ImportsAssignment_1");
					put(grammarAccess.getServiceDefModelAccess().getRepositoryAssignment_2(), "rule__ServiceDefModel__RepositoryAssignment_2");
					put(grammarAccess.getServiceDefRepositoryAccess().getNameAssignment_1(), "rule__ServiceDefRepository__NameAssignment_1");
					put(grammarAccess.getServiceDefRepositoryAccess().getVersionAssignment_2_1(), "rule__ServiceDefRepository__VersionAssignment_2_1");
					put(grammarAccess.getServiceDefRepositoryAccess().getServicesAssignment_4(), "rule__ServiceDefRepository__ServicesAssignment_4");
					put(grammarAccess.getServiceRepoVersionAccess().getMajorAssignment_0(), "rule__ServiceRepoVersion__MajorAssignment_0");
					put(grammarAccess.getServiceRepoVersionAccess().getMinorAssignment_2(), "rule__ServiceRepoVersion__MinorAssignment_2");
					put(grammarAccess.getServiceRepoVersionAccess().getPatchAssignment_3_1(), "rule__ServiceRepoVersion__PatchAssignment_3_1");
					put(grammarAccess.getCommRepoImportAccess().getImportedNamespaceAssignment_1(), "rule__CommRepoImport__ImportedNamespaceAssignment_1");
					put(grammarAccess.getForkingServiceDefinitionAccess().getNameAssignment_1(), "rule__ForkingServiceDefinition__NameAssignment_1");
					put(grammarAccess.getForkingServiceDefinitionAccess().getPatternAssignment_3(), "rule__ForkingServiceDefinition__PatternAssignment_3");
					put(grammarAccess.getForkingServiceDefinitionAccess().getPurposeDescriptionAssignment_4_1(), "rule__ForkingServiceDefinition__PurposeDescriptionAssignment_4_1");
					put(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesAssignment_5(), "rule__ForkingServiceDefinition__PropertiesAssignment_5");
					put(grammarAccess.getJoyningServiceDefinitionAccess().getNameAssignment_1(), "rule__JoyningServiceDefinition__NameAssignment_1");
					put(grammarAccess.getJoyningServiceDefinitionAccess().getPatternAssignment_3(), "rule__JoyningServiceDefinition__PatternAssignment_3");
					put(grammarAccess.getJoyningServiceDefinitionAccess().getPurposeDescriptionAssignment_4_1(), "rule__JoyningServiceDefinition__PurposeDescriptionAssignment_4_1");
					put(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesAssignment_5(), "rule__JoyningServiceDefinition__PropertiesAssignment_5");
					put(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameAssignment_1(), "rule__RequestAnswerServiceDefinition__NameAssignment_1");
					put(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternAssignment_3(), "rule__RequestAnswerServiceDefinition__PatternAssignment_3");
					put(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPurposeDescriptionAssignment_4_1(), "rule__RequestAnswerServiceDefinition__PurposeDescriptionAssignment_4_1");
					put(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesAssignment_5(), "rule__RequestAnswerServiceDefinition__PropertiesAssignment_5");
					put(grammarAccess.getCoordinationServiceDefinitionAccess().getNameAssignment_1(), "rule__CoordinationServiceDefinition__NameAssignment_1");
					put(grammarAccess.getCoordinationServiceDefinitionAccess().getPurposeDescriptionAssignment_3_0_1(), "rule__CoordinationServiceDefinition__PurposeDescriptionAssignment_3_0_1");
					put(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternAssignment_3_1(), "rule__CoordinationServiceDefinition__StatePatternAssignment_3_1");
					put(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternAssignment_3_2(), "rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2");
					put(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternAssignment_3_3(), "rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3");
					put(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternAssignment_3_4(), "rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4");
					put(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesAssignment_4(), "rule__CoordinationServiceDefinition__ServicesAssignment_4");
					put(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesAssignment_5(), "rule__CoordinationServiceDefinition__PropertiesAssignment_5");
					put(grammarAccess.getCommunicationServiceUsageAccess().getNameAssignment_1(), "rule__CommunicationServiceUsage__NameAssignment_1");
					put(grammarAccess.getCommunicationServiceUsageAccess().getUsesAssignment_3(), "rule__CommunicationServiceUsage__UsesAssignment_3");
					put(grammarAccess.getStatePatternAccess().getLifecycleAssignment_4(), "rule__StatePattern__LifecycleAssignment_4");
					put(grammarAccess.getStatePatternAccess().getModesAssignment_5_1(), "rule__StatePattern__ModesAssignment_5_1");
					put(grammarAccess.getParameterPatternAccess().getParameterSetAssignment_3(), "rule__ParameterPattern__ParameterSetAssignment_3");
					put(grammarAccess.getPushPatternAccess().getDataTypeAssignment_5(), "rule__PushPattern__DataTypeAssignment_5");
					put(grammarAccess.getEventPatternAccess().getEventTypeAssignment_3_0_2(), "rule__EventPattern__EventTypeAssignment_3_0_2");
					put(grammarAccess.getEventPatternAccess().getActivationTypeAssignment_3_1_2(), "rule__EventPattern__ActivationTypeAssignment_3_1_2");
					put(grammarAccess.getEventPatternAccess().getEventStateTypeAssignment_3_2_2(), "rule__EventPattern__EventStateTypeAssignment_3_2_2");
					put(grammarAccess.getQueryPatternAccess().getRequestTypeAssignment_3_0_2(), "rule__QueryPattern__RequestTypeAssignment_3_0_2");
					put(grammarAccess.getQueryPatternAccess().getAnswerTypeAssignment_3_1_2(), "rule__QueryPattern__AnswerTypeAssignment_3_1_2");
					put(grammarAccess.getSendPatternAccess().getDataTypeAssignment_5(), "rule__SendPattern__DataTypeAssignment_5");
					put(grammarAccess.getServicePropertyAccess().getNameAssignment_1(), "rule__ServiceProperty__NameAssignment_1");
					put(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), "rule__CoordinationServiceDefinition__UnorderedGroup_3");
					put(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), "rule__EventPattern__UnorderedGroup_3");
					put(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), "rule__QueryPattern__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ServiceDefinitionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ServiceDefinitionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
