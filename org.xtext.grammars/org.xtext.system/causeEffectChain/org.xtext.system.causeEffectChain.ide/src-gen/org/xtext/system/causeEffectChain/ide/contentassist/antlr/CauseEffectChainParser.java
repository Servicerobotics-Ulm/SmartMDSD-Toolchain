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
package org.xtext.system.causeEffectChain.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.system.causeEffectChain.ide.contentassist.antlr.internal.InternalCauseEffectChainParser;
import org.xtext.system.causeEffectChain.services.CauseEffectChainGrammarAccess;

public class CauseEffectChainParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CauseEffectChainGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CauseEffectChainGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractChainLinkAccess().getAlternatives(), "rule__AbstractChainLink__Alternatives");
			builder.put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
			builder.put(grammarAccess.getCuaseEffectChainModelAccess().getGroup(), "rule__CuaseEffectChainModel__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getActivityChainAccess().getGroup(), "rule__ActivityChain__Group__0");
			builder.put(grammarAccess.getActivityChainAccess().getGroup_4(), "rule__ActivityChain__Group_4__0");
			builder.put(grammarAccess.getActivityChainAccess().getGroup_4_3(), "rule__ActivityChain__Group_4_3__0");
			builder.put(grammarAccess.getActivityLinkAccess().getGroup(), "rule__ActivityLink__Group__0");
			builder.put(grammarAccess.getInputHandlerLinkAccess().getGroup(), "rule__InputHandlerLink__Group__0");
			builder.put(grammarAccess.getMinResponseTimeAccess().getGroup(), "rule__MinResponseTime__Group__0");
			builder.put(grammarAccess.getMaxResponseTimeAccess().getGroup(), "rule__MaxResponseTime__Group__0");
			builder.put(grammarAccess.getCuaseEffectChainModelAccess().getNameAssignment_1(), "rule__CuaseEffectChainModel__NameAssignment_1");
			builder.put(grammarAccess.getCuaseEffectChainModelAccess().getActArchAssignment_3(), "rule__CuaseEffectChainModel__ActArchAssignment_3");
			builder.put(grammarAccess.getCuaseEffectChainModelAccess().getChainsAssignment_5(), "rule__CuaseEffectChainModel__ChainsAssignment_5");
			builder.put(grammarAccess.getActivityChainAccess().getNameAssignment_2(), "rule__ActivityChain__NameAssignment_2");
			builder.put(grammarAccess.getActivityChainAccess().getChainLinksAssignment_4_2(), "rule__ActivityChain__ChainLinksAssignment_4_2");
			builder.put(grammarAccess.getActivityChainAccess().getChainLinksAssignment_4_3_1(), "rule__ActivityChain__ChainLinksAssignment_4_3_1");
			builder.put(grammarAccess.getActivityChainAccess().getDesiredMinResponseAssignment_5_0(), "rule__ActivityChain__DesiredMinResponseAssignment_5_0");
			builder.put(grammarAccess.getActivityChainAccess().getDesiredMaxResponseAssignment_5_1(), "rule__ActivityChain__DesiredMaxResponseAssignment_5_1");
			builder.put(grammarAccess.getActivityLinkAccess().getRefAssignment_1(), "rule__ActivityLink__RefAssignment_1");
			builder.put(grammarAccess.getInputHandlerLinkAccess().getRefAssignment_1(), "rule__InputHandlerLink__RefAssignment_1");
			builder.put(grammarAccess.getMinResponseTimeAccess().getValueAssignment_1(), "rule__MinResponseTime__ValueAssignment_1");
			builder.put(grammarAccess.getMinResponseTimeAccess().getUnitAssignment_2(), "rule__MinResponseTime__UnitAssignment_2");
			builder.put(grammarAccess.getMaxResponseTimeAccess().getValueAssignment_1(), "rule__MaxResponseTime__ValueAssignment_1");
			builder.put(grammarAccess.getMaxResponseTimeAccess().getUnitAssignment_2(), "rule__MaxResponseTime__UnitAssignment_2");
			builder.put(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), "rule__ActivityChain__UnorderedGroup_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CauseEffectChainGrammarAccess grammarAccess;

	@Override
	protected InternalCauseEffectChainParser createParser() {
		InternalCauseEffectChainParser result = new InternalCauseEffectChainParser(null);
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

	public CauseEffectChainGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CauseEffectChainGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
