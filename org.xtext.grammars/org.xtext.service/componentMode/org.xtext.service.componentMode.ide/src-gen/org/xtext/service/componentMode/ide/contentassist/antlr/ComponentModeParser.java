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
