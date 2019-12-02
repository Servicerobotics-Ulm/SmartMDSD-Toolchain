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
package org.xtext.component.componentParameter.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.component.componentParameter.ide.contentassist.antlr.internal.InternalComponentParameterParser;
import org.xtext.component.componentParameter.services.ComponentParameterGrammarAccess;

public class ComponentParameterParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ComponentParameterGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ComponentParameterGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractComponentParameterAccess().getAlternatives(), "rule__AbstractComponentParameter__Alternatives");
			builder.put(grammarAccess.getExtendedTriggerAccess().getAlternatives_3(), "rule__ExtendedTrigger__Alternatives_3");
			builder.put(grammarAccess.getAbstractParameterInstanceAccess().getAlternatives(), "rule__AbstractParameterInstance__Alternatives");
			builder.put(grammarAccess.getTriggerInstanceAccess().getAlternatives_3(), "rule__TriggerInstance__Alternatives_3");
			builder.put(grammarAccess.getAbstractParameterAccess().getAlternatives(), "rule__AbstractParameter__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives(), "rule__AbstractAttributeType__Alternatives");
			builder.put(grammarAccess.getCardinalityAccess().getAlternatives(), "rule__Cardinality__Alternatives");
			builder.put(grammarAccess.getAbstractValueAccess().getAlternatives(), "rule__AbstractValue__Alternatives");
			builder.put(grammarAccess.getSingleValueAccess().getAlternatives(), "rule__SingleValue__Alternatives");
			builder.put(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives(), "rule__PRIMITIVE_TYPE_NAME__Alternatives");
			builder.put(grammarAccess.getComponentParamModelAccess().getGroup(), "rule__ComponentParamModel__Group__0");
			builder.put(grammarAccess.getComponentParameterAccess().getGroup(), "rule__ComponentParameter__Group__0");
			builder.put(grammarAccess.getComponentParameterAccess().getGroup_2(), "rule__ComponentParameter__Group_2__0");
			builder.put(grammarAccess.getInternalParameterAccess().getGroup(), "rule__InternalParameter__Group__0");
			builder.put(grammarAccess.getExtendedParameterAccess().getGroup(), "rule__ExtendedParameter__Group__0");
			builder.put(grammarAccess.getExtendedTriggerAccess().getGroup(), "rule__ExtendedTrigger__Group__0");
			builder.put(grammarAccess.getParameterSetInstanceAccess().getGroup(), "rule__ParameterSetInstance__Group__0");
			builder.put(grammarAccess.getTriggerInstanceAccess().getGroup(), "rule__TriggerInstance__Group__0");
			builder.put(grammarAccess.getParameterInstanceAccess().getGroup(), "rule__ParameterInstance__Group__0");
			builder.put(grammarAccess.getParamDefModelAccess().getGroup(), "rule__ParamDefModel__Group__0");
			builder.put(grammarAccess.getFQNWAccess().getGroup(), "rule__FQNW__Group__0");
			builder.put(grammarAccess.getParamDefRepoImportAccess().getGroup(), "rule__ParamDefRepoImport__Group__0");
			builder.put(grammarAccess.getParameterSetRepositoryAccess().getGroup(), "rule__ParameterSetRepository__Group__0");
			builder.put(grammarAccess.getParameterSetDefinitionAccess().getGroup(), "rule__ParameterSetDefinition__Group__0");
			builder.put(grammarAccess.getParameterSetDefinitionAccess().getGroup_3(), "rule__ParameterSetDefinition__Group_3__0");
			builder.put(grammarAccess.getParameterSetDefinitionAccess().getGroup_3_2(), "rule__ParameterSetDefinition__Group_3_2__0");
			builder.put(grammarAccess.getParameterDefinitionAccess().getGroup(), "rule__ParameterDefinition__Group__0");
			builder.put(grammarAccess.getTriggerDefinitionAccess().getGroup(), "rule__TriggerDefinition__Group__0");
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
			builder.put(grammarAccess.getComponentParamModelAccess().getImportsAssignment_1(), "rule__ComponentParamModel__ImportsAssignment_1");
			builder.put(grammarAccess.getComponentParamModelAccess().getParametrizationAssignment_2(), "rule__ComponentParamModel__ParametrizationAssignment_2");
			builder.put(grammarAccess.getComponentParameterAccess().getNameAssignment_1(), "rule__ComponentParameter__NameAssignment_1");
			builder.put(grammarAccess.getComponentParameterAccess().getComponentAssignment_2_1(), "rule__ComponentParameter__ComponentAssignment_2_1");
			builder.put(grammarAccess.getComponentParameterAccess().getParametersAssignment_4(), "rule__ComponentParameter__ParametersAssignment_4");
			builder.put(grammarAccess.getInternalParameterAccess().getDocumentationAssignment_0(), "rule__InternalParameter__DocumentationAssignment_0");
			builder.put(grammarAccess.getInternalParameterAccess().getNameAssignment_2(), "rule__InternalParameter__NameAssignment_2");
			builder.put(grammarAccess.getInternalParameterAccess().getAttributesAssignment_4(), "rule__InternalParameter__AttributesAssignment_4");
			builder.put(grammarAccess.getExtendedParameterAccess().getDocumentationAssignment_0(), "rule__ExtendedParameter__DocumentationAssignment_0");
			builder.put(grammarAccess.getExtendedParameterAccess().getNameAssignment_2(), "rule__ExtendedParameter__NameAssignment_2");
			builder.put(grammarAccess.getExtendedParameterAccess().getAttributesAssignment_4(), "rule__ExtendedParameter__AttributesAssignment_4");
			builder.put(grammarAccess.getExtendedTriggerAccess().getDocumentationAssignment_0(), "rule__ExtendedTrigger__DocumentationAssignment_0");
			builder.put(grammarAccess.getExtendedTriggerAccess().getNameAssignment_2(), "rule__ExtendedTrigger__NameAssignment_2");
			builder.put(grammarAccess.getExtendedTriggerAccess().getActiveAssignment_3_0(), "rule__ExtendedTrigger__ActiveAssignment_3_0");
			builder.put(grammarAccess.getExtendedTriggerAccess().getAttributesAssignment_5(), "rule__ExtendedTrigger__AttributesAssignment_5");
			builder.put(grammarAccess.getParameterSetInstanceAccess().getDocumentationAssignment_0(), "rule__ParameterSetInstance__DocumentationAssignment_0");
			builder.put(grammarAccess.getParameterSetInstanceAccess().getParamSetAssignment_2(), "rule__ParameterSetInstance__ParamSetAssignment_2");
			builder.put(grammarAccess.getParameterSetInstanceAccess().getParameterInstancesAssignment_4(), "rule__ParameterSetInstance__ParameterInstancesAssignment_4");
			builder.put(grammarAccess.getTriggerInstanceAccess().getDocumentationAssignment_0(), "rule__TriggerInstance__DocumentationAssignment_0");
			builder.put(grammarAccess.getTriggerInstanceAccess().getTriggerDefAssignment_2(), "rule__TriggerInstance__TriggerDefAssignment_2");
			builder.put(grammarAccess.getTriggerInstanceAccess().getActiveAssignment_3_0(), "rule__TriggerInstance__ActiveAssignment_3_0");
			builder.put(grammarAccess.getParameterInstanceAccess().getDocumentationAssignment_0(), "rule__ParameterInstance__DocumentationAssignment_0");
			builder.put(grammarAccess.getParameterInstanceAccess().getParameterDefAssignment_2(), "rule__ParameterInstance__ParameterDefAssignment_2");
			builder.put(grammarAccess.getParameterInstanceAccess().getAttributesAssignment_4(), "rule__ParameterInstance__AttributesAssignment_4");
			builder.put(grammarAccess.getParamDefModelAccess().getImportsAssignment_1(), "rule__ParamDefModel__ImportsAssignment_1");
			builder.put(grammarAccess.getParamDefModelAccess().getRepositoryAssignment_2(), "rule__ParamDefModel__RepositoryAssignment_2");
			builder.put(grammarAccess.getParamDefRepoImportAccess().getImportedNamespaceAssignment_1(), "rule__ParamDefRepoImport__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getParameterSetRepositoryAccess().getDocumentationAssignment_0(), "rule__ParameterSetRepository__DocumentationAssignment_0");
			builder.put(grammarAccess.getParameterSetRepositoryAccess().getNameAssignment_2(), "rule__ParameterSetRepository__NameAssignment_2");
			builder.put(grammarAccess.getParameterSetRepositoryAccess().getSetsAssignment_4(), "rule__ParameterSetRepository__SetsAssignment_4");
			builder.put(grammarAccess.getParameterSetDefinitionAccess().getDocumentationAssignment_0(), "rule__ParameterSetDefinition__DocumentationAssignment_0");
			builder.put(grammarAccess.getParameterSetDefinitionAccess().getNameAssignment_2(), "rule__ParameterSetDefinition__NameAssignment_2");
			builder.put(grammarAccess.getParameterSetDefinitionAccess().getExtendsAssignment_3_1(), "rule__ParameterSetDefinition__ExtendsAssignment_3_1");
			builder.put(grammarAccess.getParameterSetDefinitionAccess().getExtendsAssignment_3_2_1(), "rule__ParameterSetDefinition__ExtendsAssignment_3_2_1");
			builder.put(grammarAccess.getParameterSetDefinitionAccess().getParametersAssignment_5(), "rule__ParameterSetDefinition__ParametersAssignment_5");
			builder.put(grammarAccess.getParameterDefinitionAccess().getDocumentationAssignment_0(), "rule__ParameterDefinition__DocumentationAssignment_0");
			builder.put(grammarAccess.getParameterDefinitionAccess().getNameAssignment_2(), "rule__ParameterDefinition__NameAssignment_2");
			builder.put(grammarAccess.getParameterDefinitionAccess().getAttributesAssignment_4(), "rule__ParameterDefinition__AttributesAssignment_4");
			builder.put(grammarAccess.getTriggerDefinitionAccess().getDocumentationAssignment_0(), "rule__TriggerDefinition__DocumentationAssignment_0");
			builder.put(grammarAccess.getTriggerDefinitionAccess().getNameAssignment_2(), "rule__TriggerDefinition__NameAssignment_2");
			builder.put(grammarAccess.getTriggerDefinitionAccess().getAttributesAssignment_4(), "rule__TriggerDefinition__AttributesAssignment_4");
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
	private ComponentParameterGrammarAccess grammarAccess;

	@Override
	protected InternalComponentParameterParser createParser() {
		InternalComponentParameterParser result = new InternalComponentParameterParser(null);
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

	public ComponentParameterGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ComponentParameterGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
