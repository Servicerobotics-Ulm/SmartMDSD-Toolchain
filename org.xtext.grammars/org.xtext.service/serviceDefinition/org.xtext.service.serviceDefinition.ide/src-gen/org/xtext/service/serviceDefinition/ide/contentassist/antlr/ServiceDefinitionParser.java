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
package org.xtext.service.serviceDefinition.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.service.serviceDefinition.ide.contentassist.antlr.internal.InternalServiceDefinitionParser;
import org.xtext.service.serviceDefinition.services.ServiceDefinitionGrammarAccess;

public class ServiceDefinitionParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ServiceDefinitionGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ServiceDefinitionGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractServiceDefinitionAccess().getAlternatives(), "rule__AbstractServiceDefinition__Alternatives");
			builder.put(grammarAccess.getCommunicationServiceDefinitionAccess().getAlternatives(), "rule__CommunicationServiceDefinition__Alternatives");
			builder.put(grammarAccess.getForkingPatternInstanceAccess().getAlternatives(), "rule__ForkingPatternInstance__Alternatives");
			builder.put(grammarAccess.getServiceDefModelAccess().getGroup(), "rule__ServiceDefModel__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getFQNWAccess().getGroup(), "rule__FQNW__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getServiceDefRepositoryAccess().getGroup(), "rule__ServiceDefRepository__Group__0");
			builder.put(grammarAccess.getServiceDefRepositoryAccess().getGroup_3(), "rule__ServiceDefRepository__Group_3__0");
			builder.put(grammarAccess.getServiceRepoVersionAccess().getGroup(), "rule__ServiceRepoVersion__Group__0");
			builder.put(grammarAccess.getServiceRepoVersionAccess().getGroup_3(), "rule__ServiceRepoVersion__Group_3__0");
			builder.put(grammarAccess.getCommRepoImportAccess().getGroup(), "rule__CommRepoImport__Group__0");
			builder.put(grammarAccess.getForkingServiceDefinitionAccess().getGroup(), "rule__ForkingServiceDefinition__Group__0");
			builder.put(grammarAccess.getJoyningServiceDefinitionAccess().getGroup(), "rule__JoyningServiceDefinition__Group__0");
			builder.put(grammarAccess.getRequestAnswerServiceDefinitionAccess().getGroup(), "rule__RequestAnswerServiceDefinition__Group__0");
			builder.put(grammarAccess.getCoordinationServiceDefinitionAccess().getGroup(), "rule__CoordinationServiceDefinition__Group__0");
			builder.put(grammarAccess.getCommunicationServiceUsageAccess().getGroup(), "rule__CommunicationServiceUsage__Group__0");
			builder.put(grammarAccess.getStatePatternAccess().getGroup(), "rule__StatePattern__Group__0");
			builder.put(grammarAccess.getStatePatternAccess().getGroup_5(), "rule__StatePattern__Group_5__0");
			builder.put(grammarAccess.getParameterPatternAccess().getGroup(), "rule__ParameterPattern__Group__0");
			builder.put(grammarAccess.getDynamicWiringPatternAccess().getGroup(), "rule__DynamicWiringPattern__Group__0");
			builder.put(grammarAccess.getMonitoringPatternAccess().getGroup(), "rule__MonitoringPattern__Group__0");
			builder.put(grammarAccess.getPushPatternAccess().getGroup(), "rule__PushPattern__Group__0");
			builder.put(grammarAccess.getEventPatternAccess().getGroup(), "rule__EventPattern__Group__0");
			builder.put(grammarAccess.getEventPatternAccess().getGroup_3_0(), "rule__EventPattern__Group_3_0__0");
			builder.put(grammarAccess.getEventPatternAccess().getGroup_3_1(), "rule__EventPattern__Group_3_1__0");
			builder.put(grammarAccess.getEventPatternAccess().getGroup_3_2(), "rule__EventPattern__Group_3_2__0");
			builder.put(grammarAccess.getQueryPatternAccess().getGroup(), "rule__QueryPattern__Group__0");
			builder.put(grammarAccess.getQueryPatternAccess().getGroup_3_0(), "rule__QueryPattern__Group_3_0__0");
			builder.put(grammarAccess.getQueryPatternAccess().getGroup_3_1(), "rule__QueryPattern__Group_3_1__0");
			builder.put(grammarAccess.getSendPatternAccess().getGroup(), "rule__SendPattern__Group__0");
			builder.put(grammarAccess.getServicePropertyAccess().getGroup(), "rule__ServiceProperty__Group__0");
			builder.put(grammarAccess.getAbstractDocumentedElementAccess().getGroup(), "rule__AbstractDocumentedElement__Group__0");
			builder.put(grammarAccess.getServiceDefModelAccess().getImportsAssignment_1(), "rule__ServiceDefModel__ImportsAssignment_1");
			builder.put(grammarAccess.getServiceDefModelAccess().getRepositoryAssignment_2(), "rule__ServiceDefModel__RepositoryAssignment_2");
			builder.put(grammarAccess.getServiceDefRepositoryAccess().getDocumentationAssignment_0(), "rule__ServiceDefRepository__DocumentationAssignment_0");
			builder.put(grammarAccess.getServiceDefRepositoryAccess().getNameAssignment_2(), "rule__ServiceDefRepository__NameAssignment_2");
			builder.put(grammarAccess.getServiceDefRepositoryAccess().getVersionAssignment_3_1(), "rule__ServiceDefRepository__VersionAssignment_3_1");
			builder.put(grammarAccess.getServiceDefRepositoryAccess().getServicesAssignment_5(), "rule__ServiceDefRepository__ServicesAssignment_5");
			builder.put(grammarAccess.getServiceRepoVersionAccess().getMajorAssignment_0(), "rule__ServiceRepoVersion__MajorAssignment_0");
			builder.put(grammarAccess.getServiceRepoVersionAccess().getMinorAssignment_2(), "rule__ServiceRepoVersion__MinorAssignment_2");
			builder.put(grammarAccess.getServiceRepoVersionAccess().getPatchAssignment_3_1(), "rule__ServiceRepoVersion__PatchAssignment_3_1");
			builder.put(grammarAccess.getCommRepoImportAccess().getImportedNamespaceAssignment_1(), "rule__CommRepoImport__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getForkingServiceDefinitionAccess().getDocumentationAssignment_0(), "rule__ForkingServiceDefinition__DocumentationAssignment_0");
			builder.put(grammarAccess.getForkingServiceDefinitionAccess().getNameAssignment_2(), "rule__ForkingServiceDefinition__NameAssignment_2");
			builder.put(grammarAccess.getForkingServiceDefinitionAccess().getPatternAssignment_4(), "rule__ForkingServiceDefinition__PatternAssignment_4");
			builder.put(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesAssignment_5(), "rule__ForkingServiceDefinition__PropertiesAssignment_5");
			builder.put(grammarAccess.getJoyningServiceDefinitionAccess().getDocumentationAssignment_0(), "rule__JoyningServiceDefinition__DocumentationAssignment_0");
			builder.put(grammarAccess.getJoyningServiceDefinitionAccess().getNameAssignment_2(), "rule__JoyningServiceDefinition__NameAssignment_2");
			builder.put(grammarAccess.getJoyningServiceDefinitionAccess().getPatternAssignment_4(), "rule__JoyningServiceDefinition__PatternAssignment_4");
			builder.put(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesAssignment_5(), "rule__JoyningServiceDefinition__PropertiesAssignment_5");
			builder.put(grammarAccess.getRequestAnswerServiceDefinitionAccess().getDocumentationAssignment_0(), "rule__RequestAnswerServiceDefinition__DocumentationAssignment_0");
			builder.put(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameAssignment_2(), "rule__RequestAnswerServiceDefinition__NameAssignment_2");
			builder.put(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternAssignment_4(), "rule__RequestAnswerServiceDefinition__PatternAssignment_4");
			builder.put(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesAssignment_5(), "rule__RequestAnswerServiceDefinition__PropertiesAssignment_5");
			builder.put(grammarAccess.getCoordinationServiceDefinitionAccess().getDocumentationAssignment_0(), "rule__CoordinationServiceDefinition__DocumentationAssignment_0");
			builder.put(grammarAccess.getCoordinationServiceDefinitionAccess().getNameAssignment_2(), "rule__CoordinationServiceDefinition__NameAssignment_2");
			builder.put(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternAssignment_4_0(), "rule__CoordinationServiceDefinition__StatePatternAssignment_4_0");
			builder.put(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternAssignment_4_1(), "rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1");
			builder.put(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternAssignment_4_2(), "rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2");
			builder.put(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternAssignment_4_3(), "rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3");
			builder.put(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesAssignment_5(), "rule__CoordinationServiceDefinition__ServicesAssignment_5");
			builder.put(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesAssignment_6(), "rule__CoordinationServiceDefinition__PropertiesAssignment_6");
			builder.put(grammarAccess.getCommunicationServiceUsageAccess().getNameAssignment_1(), "rule__CommunicationServiceUsage__NameAssignment_1");
			builder.put(grammarAccess.getCommunicationServiceUsageAccess().getUsesAssignment_3(), "rule__CommunicationServiceUsage__UsesAssignment_3");
			builder.put(grammarAccess.getStatePatternAccess().getLifecycleAssignment_4(), "rule__StatePattern__LifecycleAssignment_4");
			builder.put(grammarAccess.getStatePatternAccess().getModesAssignment_5_1(), "rule__StatePattern__ModesAssignment_5_1");
			builder.put(grammarAccess.getParameterPatternAccess().getParameterSetAssignment_3(), "rule__ParameterPattern__ParameterSetAssignment_3");
			builder.put(grammarAccess.getPushPatternAccess().getDataTypeAssignment_5(), "rule__PushPattern__DataTypeAssignment_5");
			builder.put(grammarAccess.getEventPatternAccess().getEventTypeAssignment_3_0_2(), "rule__EventPattern__EventTypeAssignment_3_0_2");
			builder.put(grammarAccess.getEventPatternAccess().getActivationTypeAssignment_3_1_2(), "rule__EventPattern__ActivationTypeAssignment_3_1_2");
			builder.put(grammarAccess.getEventPatternAccess().getEventStateTypeAssignment_3_2_2(), "rule__EventPattern__EventStateTypeAssignment_3_2_2");
			builder.put(grammarAccess.getQueryPatternAccess().getRequestTypeAssignment_3_0_2(), "rule__QueryPattern__RequestTypeAssignment_3_0_2");
			builder.put(grammarAccess.getQueryPatternAccess().getAnswerTypeAssignment_3_1_2(), "rule__QueryPattern__AnswerTypeAssignment_3_1_2");
			builder.put(grammarAccess.getSendPatternAccess().getDataTypeAssignment_5(), "rule__SendPattern__DataTypeAssignment_5");
			builder.put(grammarAccess.getServicePropertyAccess().getNameAssignment_1(), "rule__ServiceProperty__NameAssignment_1");
			builder.put(grammarAccess.getAbstractDocumentedElementAccess().getDocumentationAssignment_1(), "rule__AbstractDocumentedElement__DocumentationAssignment_1");
			builder.put(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), "rule__CoordinationServiceDefinition__UnorderedGroup_4");
			builder.put(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), "rule__EventPattern__UnorderedGroup_3");
			builder.put(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), "rule__QueryPattern__UnorderedGroup_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ServiceDefinitionGrammarAccess grammarAccess;

	@Override
	protected InternalServiceDefinitionParser createParser() {
		InternalServiceDefinitionParser result = new InternalServiceDefinitionParser(null);
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

	public ServiceDefinitionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ServiceDefinitionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
