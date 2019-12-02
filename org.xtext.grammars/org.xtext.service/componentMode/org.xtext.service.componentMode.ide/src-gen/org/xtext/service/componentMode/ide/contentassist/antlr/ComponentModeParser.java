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
package org.xtext.service.componentMode.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.service.componentMode.ide.contentassist.antlr.internal.InternalComponentModeParser;
import org.xtext.service.componentMode.services.ComponentModeGrammarAccess;

public class ComponentModeParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ComponentModeGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ComponentModeGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getComponentModeModelAccess().getGroup(), "rule__ComponentModeModel__Group__0");
			builder.put(grammarAccess.getComponentModeRepositoryAccess().getGroup(), "rule__ComponentModeRepository__Group__0");
			builder.put(grammarAccess.getComponentModeCollectionAccess().getGroup(), "rule__ComponentModeCollection__Group__0");
			builder.put(grammarAccess.getComponentModeDefinitionAccess().getGroup(), "rule__ComponentModeDefinition__Group__0");
			builder.put(grammarAccess.getComponentModeModelAccess().getRepositoryAssignment_1(), "rule__ComponentModeModel__RepositoryAssignment_1");
			builder.put(grammarAccess.getComponentModeRepositoryAccess().getNameAssignment_2(), "rule__ComponentModeRepository__NameAssignment_2");
			builder.put(grammarAccess.getComponentModeRepositoryAccess().getCollectionsAssignment_4(), "rule__ComponentModeRepository__CollectionsAssignment_4");
			builder.put(grammarAccess.getComponentModeCollectionAccess().getNameAssignment_2(), "rule__ComponentModeCollection__NameAssignment_2");
			builder.put(grammarAccess.getComponentModeCollectionAccess().getModesAssignment_4(), "rule__ComponentModeCollection__ModesAssignment_4");
			builder.put(grammarAccess.getComponentModeDefinitionAccess().getNameAssignment_2(), "rule__ComponentModeDefinition__NameAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ComponentModeGrammarAccess grammarAccess;

	@Override
	protected InternalComponentModeParser createParser() {
		InternalComponentModeParser result = new InternalComponentModeParser(null);
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

	public ComponentModeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ComponentModeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
