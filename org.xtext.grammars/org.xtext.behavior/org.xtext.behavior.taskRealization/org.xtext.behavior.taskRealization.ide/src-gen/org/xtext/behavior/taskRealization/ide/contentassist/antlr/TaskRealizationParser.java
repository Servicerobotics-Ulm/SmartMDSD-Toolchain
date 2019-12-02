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
package org.xtext.behavior.taskRealization.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.behavior.taskRealization.ide.contentassist.antlr.internal.InternalTaskRealizationParser;
import org.xtext.behavior.taskRealization.services.TaskRealizationGrammarAccess;

public class TaskRealizationParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TaskRealizationGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TaskRealizationGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTaskRealizationModelAccess().getGroup(), "rule__TaskRealizationModel__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getTaskRealizationAccess().getGroup(), "rule__TaskRealization__Group__0");
			builder.put(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getGroup(), "rule__AbstractCoordinationModuleInstance__Group__0");
			builder.put(grammarAccess.getTaskRealizationModelAccess().getNameAssignment_2(), "rule__TaskRealizationModel__NameAssignment_2");
			builder.put(grammarAccess.getTaskRealizationModelAccess().getAbstCoordInstAssignment_4(), "rule__TaskRealizationModel__AbstCoordInstAssignment_4");
			builder.put(grammarAccess.getTaskRealizationModelAccess().getTasksAssignment_5(), "rule__TaskRealizationModel__TasksAssignment_5");
			builder.put(grammarAccess.getTaskRealizationAccess().getTaskDefAssignment_1(), "rule__TaskRealization__TaskDefAssignment_1");
			builder.put(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getNameAssignment_1(), "rule__AbstractCoordinationModuleInstance__NameAssignment_1");
			builder.put(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefAssignment_3(), "rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TaskRealizationGrammarAccess grammarAccess;

	@Override
	protected InternalTaskRealizationParser createParser() {
		InternalTaskRealizationParser result = new InternalTaskRealizationParser(null);
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

	public TaskRealizationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TaskRealizationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
