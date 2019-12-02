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
package org.xtext.service.domainModelsDatasheet.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.service.domainModelsDatasheet.ide.contentassist.antlr.internal.InternalDomainModelsDatasheetParser;
import org.xtext.service.domainModelsDatasheet.services.DomainModelsDatasheetGrammarAccess;

public class DomainModelsDatasheetParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DomainModelsDatasheetGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DomainModelsDatasheetGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractDatasheetElementAccess().getAlternatives(), "rule__AbstractDatasheetElement__Alternatives");
			builder.put(grammarAccess.getMandatoryDatasheetElementNamesAccess().getAlternatives(), "rule__MandatoryDatasheetElementNames__Alternatives");
			builder.put(grammarAccess.getDomainModelsDatasheetAccess().getGroup(), "rule__DomainModelsDatasheet__Group__0");
			builder.put(grammarAccess.getDatasheetPropertyAccess().getGroup(), "rule__DatasheetProperty__Group__0");
			builder.put(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0(), "rule__DatasheetProperty__Group_3_0__0");
			builder.put(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0_2(), "rule__DatasheetProperty__Group_3_0_2__0");
			builder.put(grammarAccess.getDatasheetPropertyAccess().getGroup_3_1(), "rule__DatasheetProperty__Group_3_1__0");
			builder.put(grammarAccess.getDatasheetPropertyAccess().getGroup_3_2(), "rule__DatasheetProperty__Group_3_2__0");
			builder.put(grammarAccess.getMandatoryDatasheetElementAccess().getGroup(), "rule__MandatoryDatasheetElement__Group__0");
			builder.put(grammarAccess.getDomainModelsDatasheetAccess().getNameAssignment_1(), "rule__DomainModelsDatasheet__NameAssignment_1");
			builder.put(grammarAccess.getGenericDatasheetModelAccess().getElementsAssignment(), "rule__GenericDatasheetModel__ElementsAssignment");
			builder.put(grammarAccess.getDatasheetPropertyAccess().getNameAssignment_1(), "rule__DatasheetProperty__NameAssignment_1");
			builder.put(grammarAccess.getDatasheetPropertyAccess().getValueAssignment_3_0_1(), "rule__DatasheetProperty__ValueAssignment_3_0_1");
			builder.put(grammarAccess.getDatasheetPropertyAccess().getUnitAssignment_3_0_2_1(), "rule__DatasheetProperty__UnitAssignment_3_0_2_1");
			builder.put(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionAssignment_3_1_1(), "rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1");
			builder.put(grammarAccess.getDatasheetPropertyAccess().getSemanticIDAssignment_3_2_1(), "rule__DatasheetProperty__SemanticIDAssignment_3_2_1");
			builder.put(grammarAccess.getMandatoryDatasheetElementAccess().getNameAssignment_0(), "rule__MandatoryDatasheetElement__NameAssignment_0");
			builder.put(grammarAccess.getMandatoryDatasheetElementAccess().getValueAssignment_1(), "rule__MandatoryDatasheetElement__ValueAssignment_1");
			builder.put(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), "rule__DatasheetProperty__UnorderedGroup_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DomainModelsDatasheetGrammarAccess grammarAccess;

	@Override
	protected InternalDomainModelsDatasheetParser createParser() {
		InternalDomainModelsDatasheetParser result = new InternalDomainModelsDatasheetParser(null);
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

	public DomainModelsDatasheetGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DomainModelsDatasheetGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
