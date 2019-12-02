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
package org.xtext.system.systemParameter.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.system.systemParameter.ide.contentassist.antlr.internal.InternalSystemParameterParser;
import org.xtext.system.systemParameter.services.SystemParameterGrammarAccess;

public class SystemParameterParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SystemParameterGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SystemParameterGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives(), "rule__AbstractAttributeType__Alternatives");
			builder.put(grammarAccess.getCardinalityAccess().getAlternatives(), "rule__Cardinality__Alternatives");
			builder.put(grammarAccess.getAbstractValueAccess().getAlternatives(), "rule__AbstractValue__Alternatives");
			builder.put(grammarAccess.getSingleValueAccess().getAlternatives(), "rule__SingleValue__Alternatives");
			builder.put(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives(), "rule__PRIMITIVE_TYPE_NAME__Alternatives");
			builder.put(grammarAccess.getSystemParamModelAccess().getGroup(), "rule__SystemParamModel__Group__0");
			builder.put(grammarAccess.getComponentParameterInstanceAccess().getGroup(), "rule__ComponentParameterInstance__Group__0");
			builder.put(grammarAccess.getComponentParameterInstanceAccess().getGroup_2(), "rule__ComponentParameterInstance__Group_2__0");
			builder.put(grammarAccess.getParameterRefinementAccess().getGroup(), "rule__ParameterRefinement__Group__0");
			builder.put(grammarAccess.getAttributeDefinitionAccess().getGroup(), "rule__AttributeDefinition__Group__0");
			builder.put(grammarAccess.getAttributeDefinitionAccess().getGroup_4(), "rule__AttributeDefinition__Group_4__0");
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
			builder.put(grammarAccess.getAbstractDocumentedElementAccess().getGroup(), "rule__AbstractDocumentedElement__Group__0");
			builder.put(grammarAccess.getSystemParamModelAccess().getNameAssignment_2(), "rule__SystemParamModel__NameAssignment_2");
			builder.put(grammarAccess.getSystemParamModelAccess().getSystemAssignment_4(), "rule__SystemParamModel__SystemAssignment_4");
			builder.put(grammarAccess.getSystemParamModelAccess().getComponentsAssignment_6(), "rule__SystemParamModel__ComponentsAssignment_6");
			builder.put(grammarAccess.getComponentParameterInstanceAccess().getComponentInstanceAssignment_1(), "rule__ComponentParameterInstance__ComponentInstanceAssignment_1");
			builder.put(grammarAccess.getComponentParameterInstanceAccess().getComponentParamAssignment_2_1(), "rule__ComponentParameterInstance__ComponentParamAssignment_2_1");
			builder.put(grammarAccess.getComponentParameterInstanceAccess().getParametersAssignment_4(), "rule__ComponentParameterInstance__ParametersAssignment_4");
			builder.put(grammarAccess.getParameterRefinementAccess().getDocumentationAssignment_0(), "rule__ParameterRefinement__DocumentationAssignment_0");
			builder.put(grammarAccess.getParameterRefinementAccess().getParameterAssignment_2(), "rule__ParameterRefinement__ParameterAssignment_2");
			builder.put(grammarAccess.getParameterRefinementAccess().getAttributesAssignment_4(), "rule__ParameterRefinement__AttributesAssignment_4");
			builder.put(grammarAccess.getAttributeDefinitionAccess().getDocumentationAssignment_0(), "rule__AttributeDefinition__DocumentationAssignment_0");
			builder.put(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_1(), "rule__AttributeDefinition__NameAssignment_1");
			builder.put(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_3(), "rule__AttributeDefinition__TypeAssignment_3");
			builder.put(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_4_1(), "rule__AttributeDefinition__DefaultvalueAssignment_4_1");
			builder.put(grammarAccess.getAttributeRefinementAccess().getDocumentationAssignment_0(), "rule__AttributeRefinement__DocumentationAssignment_0");
			builder.put(grammarAccess.getAttributeRefinementAccess().getAttributeAssignment_1(), "rule__AttributeRefinement__AttributeAssignment_1");
			builder.put(grammarAccess.getAttributeRefinementAccess().getValueAssignment_3(), "rule__AttributeRefinement__ValueAssignment_3");
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
			builder.put(grammarAccess.getAbstractDocumentedElementAccess().getDocumentationAssignment_1(), "rule__AbstractDocumentedElement__DocumentationAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SystemParameterGrammarAccess grammarAccess;

	@Override
	protected InternalSystemParameterParser createParser() {
		InternalSystemParameterParser result = new InternalSystemParameterParser(null);
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

	public SystemParameterGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SystemParameterGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
