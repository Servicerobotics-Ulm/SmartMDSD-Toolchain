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
package org.xtext.base.stateMachine.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.base.stateMachine.ide.contentassist.antlr.internal.InternalStateMachineParser;
import org.xtext.base.stateMachine.services.StateMachineGrammarAccess;

public class StateMachineParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(StateMachineGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, StateMachineGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractMachineElementAccess().getAlternatives(), "rule__AbstractMachineElement__Alternatives");
			builder.put(grammarAccess.getVisibilityTypeAccess().getAlternatives(), "rule__VisibilityType__Alternatives");
			builder.put(grammarAccess.getStateMachineAccess().getGroup(), "rule__StateMachine__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getStateTransitionAccess().getGroup(), "rule__StateTransition__Group__0");
			builder.put(grammarAccess.getStateMachineAccess().getNameAssignment_1(), "rule__StateMachine__NameAssignment_1");
			builder.put(grammarAccess.getStateMachineAccess().getElementsAssignment_3(), "rule__StateMachine__ElementsAssignment_3");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_1(), "rule__State__NameAssignment_1");
			builder.put(grammarAccess.getStateTransitionAccess().getVisibilityAssignment_0(), "rule__StateTransition__VisibilityAssignment_0");
			builder.put(grammarAccess.getStateTransitionAccess().getFromAssignment_2(), "rule__StateTransition__FromAssignment_2");
			builder.put(grammarAccess.getStateTransitionAccess().getToAssignment_4(), "rule__StateTransition__ToAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private StateMachineGrammarAccess grammarAccess;

	@Override
	protected InternalStateMachineParser createParser() {
		InternalStateMachineParser result = new InternalStateMachineParser(null);
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

	public StateMachineGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StateMachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
