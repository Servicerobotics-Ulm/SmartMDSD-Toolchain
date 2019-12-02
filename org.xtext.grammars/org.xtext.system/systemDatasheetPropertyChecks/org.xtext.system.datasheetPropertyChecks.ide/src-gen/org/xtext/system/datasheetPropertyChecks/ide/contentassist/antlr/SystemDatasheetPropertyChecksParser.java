//================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
package org.xtext.system.datasheetPropertyChecks.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.system.datasheetPropertyChecks.ide.contentassist.antlr.internal.InternalSystemDatasheetPropertyChecksParser;
import org.xtext.system.datasheetPropertyChecks.services.SystemDatasheetPropertyChecksGrammarAccess;

public class SystemDatasheetPropertyChecksParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SystemDatasheetPropertyChecksGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SystemDatasheetPropertyChecksGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEvaluationFunctionAccess().getAlternatives(), "rule__EvaluationFunction__Alternatives");
			builder.put(grammarAccess.getEvaluationOperatorAccess().getAlternatives(), "rule__EvaluationOperator__Alternatives");
			builder.put(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getGroup(), "rule__SystemDatasheetPropertyChecksModel__Group__0");
			builder.put(grammarAccess.getDatasheetPropertyCheckAccess().getGroup(), "rule__DatasheetPropertyCheck__Group__0");
			builder.put(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getSystemAssignment_1(), "rule__SystemDatasheetPropertyChecksModel__SystemAssignment_1");
			builder.put(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getChecksAssignment_3(), "rule__SystemDatasheetPropertyChecksModel__ChecksAssignment_3");
			builder.put(grammarAccess.getDatasheetPropertyCheckAccess().getFunctionAssignment_1(), "rule__DatasheetPropertyCheck__FunctionAssignment_1");
			builder.put(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyNameAssignment_2(), "rule__DatasheetPropertyCheck__PropertyNameAssignment_2");
			builder.put(grammarAccess.getDatasheetPropertyCheckAccess().getOperatorAssignment_3(), "rule__DatasheetPropertyCheck__OperatorAssignment_3");
			builder.put(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyValueAssignment_4(), "rule__DatasheetPropertyCheck__PropertyValueAssignment_4");
			builder.put(grammarAccess.getDatasheetPropertyCheckAccess().getPropertyUnitAssignment_5(), "rule__DatasheetPropertyCheck__PropertyUnitAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SystemDatasheetPropertyChecksGrammarAccess grammarAccess;

	@Override
	protected InternalSystemDatasheetPropertyChecksParser createParser() {
		InternalSystemDatasheetPropertyChecksParser result = new InternalSystemDatasheetPropertyChecksParser(null);
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

	public SystemDatasheetPropertyChecksGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SystemDatasheetPropertyChecksGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
