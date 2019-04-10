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
package org.xtext.base.basicAttributes.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.base.basicAttributes.ide.contentassist.antlr.internal.InternalBasicAttributesParser;
import org.xtext.base.basicAttributes.services.BasicAttributesGrammarAccess;

public class BasicAttributesParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(BasicAttributesGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, BasicAttributesGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives(), "rule__AbstractAttributeType__Alternatives");
			builder.put(grammarAccess.getCardinalityAccess().getAlternatives(), "rule__Cardinality__Alternatives");
			builder.put(grammarAccess.getAbstractValueAccess().getAlternatives(), "rule__AbstractValue__Alternatives");
			builder.put(grammarAccess.getSingleValueAccess().getAlternatives(), "rule__SingleValue__Alternatives");
			builder.put(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives(), "rule__PRIMITIVE_TYPE_NAME__Alternatives");
			builder.put(grammarAccess.getAttributeDefinitionAccess().getGroup(), "rule__AttributeDefinition__Group__0");
			builder.put(grammarAccess.getAttributeDefinitionAccess().getGroup_3(), "rule__AttributeDefinition__Group_3__0");
			builder.put(grammarAccess.getAttributeRefinementAccess().getGroup(), "rule__AttributeRefinement__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getEnumerationElementAccess().getGroup(), "rule__EnumerationElement__Group__0");
			builder.put(grammarAccess.getEnumerationElementAccess().getGroup_1(), "rule__EnumerationElement__Group_1__0");
			builder.put(grammarAccess.getInlineEnumerationTypeAccess().getGroup(), "rule__InlineEnumerationType__Group__0");
			builder.put(grammarAccess.getArrayTypeAccess().getGroup(), "rule__ArrayType__Group__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup(), "rule__PrimitiveType__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup(), "rule__ArrayValue__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2(), "rule__ArrayValue__Group_2__0");
			builder.put(grammarAccess.getSingleValueAccess().getGroup_0(), "rule__SingleValue__Group_0__0");
			builder.put(grammarAccess.getSingleValueAccess().getGroup_1(), "rule__SingleValue__Group_1__0");
			builder.put(grammarAccess.getSingleValueAccess().getGroup_2(), "rule__SingleValue__Group_2__0");
			builder.put(grammarAccess.getSingleValueAccess().getGroup_3(), "rule__SingleValue__Group_3__0");
			builder.put(grammarAccess.getSingleValueAccess().getGroup_4(), "rule__SingleValue__Group_4__0");
			builder.put(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_0(), "rule__AttributeDefinition__NameAssignment_0");
			builder.put(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_2(), "rule__AttributeDefinition__TypeAssignment_2");
			builder.put(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_3_1(), "rule__AttributeDefinition__DefaultvalueAssignment_3_1");
			builder.put(grammarAccess.getAttributeRefinementAccess().getAttributeAssignment_0(), "rule__AttributeRefinement__AttributeAssignment_0");
			builder.put(grammarAccess.getAttributeRefinementAccess().getValueAssignment_2(), "rule__AttributeRefinement__ValueAssignment_2");
			builder.put(grammarAccess.getEnumerationElementAccess().getNameAssignment_0(), "rule__EnumerationElement__NameAssignment_0");
			builder.put(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1(), "rule__EnumerationElement__ValueAssignment_1_1");
			builder.put(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1(), "rule__InlineEnumerationType__ArrayAssignment_1");
			builder.put(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3(), "rule__InlineEnumerationType__EnumsAssignment_3");
			builder.put(grammarAccess.getArrayTypeAccess().getLengthAssignment_2(), "rule__ArrayType__LengthAssignment_2");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0(), "rule__PrimitiveType__TypeNameAssignment_0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1(), "rule__PrimitiveType__ArrayAssignment_1");
			builder.put(grammarAccess.getArrayValueAccess().getValuesAssignment_1(), "rule__ArrayValue__ValuesAssignment_1");
			builder.put(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1(), "rule__ArrayValue__ValuesAssignment_2_1");
			builder.put(grammarAccess.getSingleValueAccess().getValueAssignment_0_1(), "rule__SingleValue__ValueAssignment_0_1");
			builder.put(grammarAccess.getSingleValueAccess().getValueAssignment_1_1(), "rule__SingleValue__ValueAssignment_1_1");
			builder.put(grammarAccess.getSingleValueAccess().getValueAssignment_2_1(), "rule__SingleValue__ValueAssignment_2_1");
			builder.put(grammarAccess.getSingleValueAccess().getValueAssignment_3_1(), "rule__SingleValue__ValueAssignment_3_1");
			builder.put(grammarAccess.getSingleValueAccess().getValueAssignment_4_1(), "rule__SingleValue__ValueAssignment_4_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private BasicAttributesGrammarAccess grammarAccess;

	@Override
	protected InternalBasicAttributesParser createParser() {
		InternalBasicAttributesParser result = new InternalBasicAttributesParser(null);
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

	public BasicAttributesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BasicAttributesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
