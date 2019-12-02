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
package org.xtext.behavior.skillRealization.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.behavior.skillRealization.ide.contentassist.antlr.internal.InternalSkillRealizationParser;
import org.xtext.behavior.skillRealization.services.SkillRealizationGrammarAccess;

public class SkillRealizationParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SkillRealizationGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SkillRealizationGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractComponentCoordinationActionAccess().getAlternatives(), "rule__AbstractComponentCoordinationAction__Alternatives");
			builder.put(grammarAccess.getSkillRealizationModelAccess().getGroup(), "rule__SkillRealizationModel__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getCoordinationModuleRealizationAccess().getGroup(), "rule__CoordinationModuleRealization__Group__0");
			builder.put(grammarAccess.getCoordinationInterfaceInstanceAccess().getGroup(), "rule__CoordinationInterfaceInstance__Group__0");
			builder.put(grammarAccess.getSkillRealizationAccess().getGroup(), "rule__SkillRealization__Group__0");
			builder.put(grammarAccess.getCoordinationActionBlockAccess().getGroup(), "rule__CoordinationActionBlock__Group__0");
			builder.put(grammarAccess.getComponentCoordinationActionParameterAccess().getGroup(), "rule__ComponentCoordinationActionParameter__Group__0");
			builder.put(grammarAccess.getComponentCoordinationActionParameterAccess().getGroup_5(), "rule__ComponentCoordinationActionParameter__Group_5__0");
			builder.put(grammarAccess.getComponentCoordinationActionActivationAccess().getGroup(), "rule__ComponentCoordinationActionActivation__Group__0");
			builder.put(grammarAccess.getComponentCoordinationActionEventAccess().getGroup(), "rule__ComponentCoordinationActionEvent__Group__0");
			builder.put(grammarAccess.getSkillRealizationModelAccess().getModulesAssignment_3(), "rule__SkillRealizationModel__ModulesAssignment_3");
			builder.put(grammarAccess.getCoordinationModuleRealizationAccess().getNameAssignment_1(), "rule__CoordinationModuleRealization__NameAssignment_1");
			builder.put(grammarAccess.getCoordinationModuleRealizationAccess().getCoordinationModuleDefAssignment_3(), "rule__CoordinationModuleRealization__CoordinationModuleDefAssignment_3");
			builder.put(grammarAccess.getCoordinationModuleRealizationAccess().getCoordInterfaceInstsAssignment_6(), "rule__CoordinationModuleRealization__CoordInterfaceInstsAssignment_6");
			builder.put(grammarAccess.getCoordinationModuleRealizationAccess().getSkillsAssignment_9(), "rule__CoordinationModuleRealization__SkillsAssignment_9");
			builder.put(grammarAccess.getCoordinationInterfaceInstanceAccess().getCoordinationInterfaceDefAssignment_0(), "rule__CoordinationInterfaceInstance__CoordinationInterfaceDefAssignment_0");
			builder.put(grammarAccess.getCoordinationInterfaceInstanceAccess().getNameAssignment_2(), "rule__CoordinationInterfaceInstance__NameAssignment_2");
			builder.put(grammarAccess.getSkillRealizationAccess().getSkillDefAssignment_1(), "rule__SkillRealization__SkillDefAssignment_1");
			builder.put(grammarAccess.getSkillRealizationAccess().getActionAssignment_5(), "rule__SkillRealization__ActionAssignment_5");
			builder.put(grammarAccess.getCoordinationActionBlockAccess().getActionsAssignment_1(), "rule__CoordinationActionBlock__ActionsAssignment_1");
			builder.put(grammarAccess.getComponentCoordinationActionParameterAccess().getCoordinationServiceAssignment_2(), "rule__ComponentCoordinationActionParameter__CoordinationServiceAssignment_2");
			builder.put(grammarAccess.getComponentCoordinationActionParameterAccess().getParameterAssignment_4(), "rule__ComponentCoordinationActionParameter__ParameterAssignment_4");
			builder.put(grammarAccess.getComponentCoordinationActionParameterAccess().getValueAssignment_5_1(), "rule__ComponentCoordinationActionParameter__ValueAssignment_5_1");
			builder.put(grammarAccess.getComponentCoordinationActionActivationAccess().getCoordinationServiceAssignment_2(), "rule__ComponentCoordinationActionActivation__CoordinationServiceAssignment_2");
			builder.put(grammarAccess.getComponentCoordinationActionActivationAccess().getStateAssignment_4(), "rule__ComponentCoordinationActionActivation__StateAssignment_4");
			builder.put(grammarAccess.getComponentCoordinationActionEventAccess().getCoordinationServiceAssignment_3(), "rule__ComponentCoordinationActionEvent__CoordinationServiceAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SkillRealizationGrammarAccess grammarAccess;

	@Override
	protected InternalSkillRealizationParser createParser() {
		InternalSkillRealizationParser result = new InternalSkillRealizationParser(null);
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

	public SkillRealizationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SkillRealizationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
