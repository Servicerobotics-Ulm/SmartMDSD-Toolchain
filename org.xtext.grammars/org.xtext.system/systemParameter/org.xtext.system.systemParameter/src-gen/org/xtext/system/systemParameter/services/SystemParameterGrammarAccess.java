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
package org.xtext.system.systemParameter.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;
import org.xtext.base.basicAttributes.services.BasicAttributesGrammarAccess;
import org.xtext.base.docuterminals.services.DocuTerminalsGrammarAccess;

@Singleton
public class SystemParameterGrammarAccess extends AbstractGrammarElementFinder {
	
	public class SystemParamModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.systemParameter.SystemParameter.SystemParamModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSystemParamModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSystemParameterModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cExtendsSystemKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSystemAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cSystemSystemComponentArchitectureCrossReference_4_0 = (CrossReference)cSystemAssignment_4.eContents().get(0);
		private final RuleCall cSystemSystemComponentArchitectureFQNParserRuleCall_4_0_1 = (RuleCall)cSystemSystemComponentArchitectureCrossReference_4_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cComponentsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cComponentsComponentParameterInstanceParserRuleCall_6_0 = (RuleCall)cComponentsAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//SystemParamModel systemParameter::SystemParamModel:
		//	{systemParameter::SystemParamModel}
		//	'SystemParameterModel' name=ID 'extendsSystem' system=[componentArchitecture::SystemComponentArchitecture|FQN] '{'
		//	components+=ComponentParameterInstance*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{systemParameter::SystemParamModel} 'SystemParameterModel' name=ID 'extendsSystem'
		//system=[componentArchitecture::SystemComponentArchitecture|FQN] '{' components+=ComponentParameterInstance* '}'
		public Group getGroup() { return cGroup; }
		
		//{systemParameter::SystemParamModel}
		public Action getSystemParamModelAction_0() { return cSystemParamModelAction_0; }
		
		//'SystemParameterModel'
		public Keyword getSystemParameterModelKeyword_1() { return cSystemParameterModelKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'extendsSystem'
		public Keyword getExtendsSystemKeyword_3() { return cExtendsSystemKeyword_3; }
		
		//system=[componentArchitecture::SystemComponentArchitecture|FQN]
		public Assignment getSystemAssignment_4() { return cSystemAssignment_4; }
		
		//[componentArchitecture::SystemComponentArchitecture|FQN]
		public CrossReference getSystemSystemComponentArchitectureCrossReference_4_0() { return cSystemSystemComponentArchitectureCrossReference_4_0; }
		
		//FQN
		public RuleCall getSystemSystemComponentArchitectureFQNParserRuleCall_4_0_1() { return cSystemSystemComponentArchitectureFQNParserRuleCall_4_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//components+=ComponentParameterInstance*
		public Assignment getComponentsAssignment_6() { return cComponentsAssignment_6; }
		
		//ComponentParameterInstance
		public RuleCall getComponentsComponentParameterInstanceParserRuleCall_6_0() { return cComponentsComponentParameterInstanceParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class ComponentParameterInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.systemParameter.SystemParameter.ComponentParameterInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentParameterInstanceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cComponentInstanceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cComponentInstanceComponentInstanceCrossReference_1_0 = (CrossReference)cComponentInstanceAssignment_1.eContents().get(0);
		private final RuleCall cComponentInstanceComponentInstanceFQNParserRuleCall_1_0_1 = (RuleCall)cComponentInstanceComponentInstanceCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cRefinesParamStructKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cComponentParamAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cComponentParamComponentParameterCrossReference_2_1_0 = (CrossReference)cComponentParamAssignment_2_1.eContents().get(0);
		private final RuleCall cComponentParamComponentParameterFQNParserRuleCall_2_1_0_1 = (RuleCall)cComponentParamComponentParameterCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParametersAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParametersParameterRefinementParserRuleCall_4_0 = (RuleCall)cParametersAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ComponentParameterInstance systemParameter::ComponentParameterInstance:
		//	'ComponentParameterInstance' componentInstance=[componentArchitecture::ComponentInstance|FQN] ('refinesParamStruct'
		//	componentParam=[componentParameter::ComponentParameter|FQN])?
		//	'{'
		//	parameters+=ParameterRefinement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ComponentParameterInstance' componentInstance=[componentArchitecture::ComponentInstance|FQN] ('refinesParamStruct'
		//componentParam=[componentParameter::ComponentParameter|FQN])? '{' parameters+=ParameterRefinement* '}'
		public Group getGroup() { return cGroup; }
		
		//'ComponentParameterInstance'
		public Keyword getComponentParameterInstanceKeyword_0() { return cComponentParameterInstanceKeyword_0; }
		
		//componentInstance=[componentArchitecture::ComponentInstance|FQN]
		public Assignment getComponentInstanceAssignment_1() { return cComponentInstanceAssignment_1; }
		
		//[componentArchitecture::ComponentInstance|FQN]
		public CrossReference getComponentInstanceComponentInstanceCrossReference_1_0() { return cComponentInstanceComponentInstanceCrossReference_1_0; }
		
		//FQN
		public RuleCall getComponentInstanceComponentInstanceFQNParserRuleCall_1_0_1() { return cComponentInstanceComponentInstanceFQNParserRuleCall_1_0_1; }
		
		//('refinesParamStruct' componentParam=[componentParameter::ComponentParameter|FQN])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'refinesParamStruct'
		public Keyword getRefinesParamStructKeyword_2_0() { return cRefinesParamStructKeyword_2_0; }
		
		//componentParam=[componentParameter::ComponentParameter|FQN]
		public Assignment getComponentParamAssignment_2_1() { return cComponentParamAssignment_2_1; }
		
		//[componentParameter::ComponentParameter|FQN]
		public CrossReference getComponentParamComponentParameterCrossReference_2_1_0() { return cComponentParamComponentParameterCrossReference_2_1_0; }
		
		//FQN
		public RuleCall getComponentParamComponentParameterFQNParserRuleCall_2_1_0_1() { return cComponentParamComponentParameterFQNParserRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//parameters+=ParameterRefinement*
		public Assignment getParametersAssignment_4() { return cParametersAssignment_4; }
		
		//ParameterRefinement
		public RuleCall getParametersParameterRefinementParserRuleCall_4_0() { return cParametersParameterRefinementParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ParameterRefinementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.systemParameter.SystemParameter.ParameterRefinement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDocumentationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDocumentationDOCU_COMMENTTerminalRuleCall_0_0 = (RuleCall)cDocumentationAssignment_0.eContents().get(0);
		private final Keyword cParameterRefinementKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cParameterAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cParameterComponentParameterBaseCrossReference_2_0 = (CrossReference)cParameterAssignment_2.eContents().get(0);
		private final RuleCall cParameterComponentParameterBaseFQNParserRuleCall_2_0_1 = (RuleCall)cParameterComponentParameterBaseCrossReference_2_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAttributesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAttributesAttributeRefinementParserRuleCall_4_0 = (RuleCall)cAttributesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ParameterRefinement systemParameter::ParameterRefinement:
		//	documentation=DOCU_COMMENT?
		//	'ParameterRefinement' parameter=[componentParameter::ComponentParameterBase|FQN]
		//	'{'
		//	attributes+=AttributeRefinement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//documentation=DOCU_COMMENT? 'ParameterRefinement' parameter=[componentParameter::ComponentParameterBase|FQN] '{'
		//attributes+=AttributeRefinement* '}'
		public Group getGroup() { return cGroup; }
		
		//documentation=DOCU_COMMENT?
		public Assignment getDocumentationAssignment_0() { return cDocumentationAssignment_0; }
		
		//DOCU_COMMENT
		public RuleCall getDocumentationDOCU_COMMENTTerminalRuleCall_0_0() { return cDocumentationDOCU_COMMENTTerminalRuleCall_0_0; }
		
		//'ParameterRefinement'
		public Keyword getParameterRefinementKeyword_1() { return cParameterRefinementKeyword_1; }
		
		//parameter=[componentParameter::ComponentParameterBase|FQN]
		public Assignment getParameterAssignment_2() { return cParameterAssignment_2; }
		
		//[componentParameter::ComponentParameterBase|FQN]
		public CrossReference getParameterComponentParameterBaseCrossReference_2_0() { return cParameterComponentParameterBaseCrossReference_2_0; }
		
		//FQN
		public RuleCall getParameterComponentParameterBaseFQNParserRuleCall_2_0_1() { return cParameterComponentParameterBaseFQNParserRuleCall_2_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//attributes+=AttributeRefinement*
		public Assignment getAttributesAssignment_4() { return cAttributesAssignment_4; }
		
		//AttributeRefinement
		public RuleCall getAttributesAttributeRefinementParserRuleCall_4_0() { return cAttributesAttributeRefinementParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	
	
	private final SystemParamModelElements pSystemParamModel;
	private final ComponentParameterInstanceElements pComponentParameterInstance;
	private final ParameterRefinementElements pParameterRefinement;
	
	private final Grammar grammar;
	
	private final BasicAttributesGrammarAccess gaBasicAttributes;
	
	private final DocuTerminalsGrammarAccess gaDocuTerminals;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SystemParameterGrammarAccess(GrammarProvider grammarProvider,
			BasicAttributesGrammarAccess gaBasicAttributes,
			DocuTerminalsGrammarAccess gaDocuTerminals,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaBasicAttributes = gaBasicAttributes;
		this.gaDocuTerminals = gaDocuTerminals;
		this.gaTerminals = gaTerminals;
		this.pSystemParamModel = new SystemParamModelElements();
		this.pComponentParameterInstance = new ComponentParameterInstanceElements();
		this.pParameterRefinement = new ParameterRefinementElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.system.systemParameter.SystemParameter".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public BasicAttributesGrammarAccess getBasicAttributesGrammarAccess() {
		return gaBasicAttributes;
	}
	
	public DocuTerminalsGrammarAccess getDocuTerminalsGrammarAccess() {
		return gaDocuTerminals;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SystemParamModel systemParameter::SystemParamModel:
	//	{systemParameter::SystemParamModel}
	//	'SystemParameterModel' name=ID 'extendsSystem' system=[componentArchitecture::SystemComponentArchitecture|FQN] '{'
	//	components+=ComponentParameterInstance*
	//	'}';
	public SystemParamModelElements getSystemParamModelAccess() {
		return pSystemParamModel;
	}
	
	public ParserRule getSystemParamModelRule() {
		return getSystemParamModelAccess().getRule();
	}
	
	//ComponentParameterInstance systemParameter::ComponentParameterInstance:
	//	'ComponentParameterInstance' componentInstance=[componentArchitecture::ComponentInstance|FQN] ('refinesParamStruct'
	//	componentParam=[componentParameter::ComponentParameter|FQN])?
	//	'{'
	//	parameters+=ParameterRefinement*
	//	'}';
	public ComponentParameterInstanceElements getComponentParameterInstanceAccess() {
		return pComponentParameterInstance;
	}
	
	public ParserRule getComponentParameterInstanceRule() {
		return getComponentParameterInstanceAccess().getRule();
	}
	
	//ParameterRefinement systemParameter::ParameterRefinement:
	//	documentation=DOCU_COMMENT?
	//	'ParameterRefinement' parameter=[componentParameter::ComponentParameterBase|FQN]
	//	'{'
	//	attributes+=AttributeRefinement*
	//	'}';
	public ParameterRefinementElements getParameterRefinementAccess() {
		return pParameterRefinement;
	}
	
	public ParserRule getParameterRefinementRule() {
		return getParameterRefinementAccess().getRule();
	}
	
	//AttributeDefinition attr::AttributeDefinition:
	//	documentation=DOCU_COMMENT?
	//	name=ID ':' type=AbstractAttributeType ('=' defaultvalue=AbstractValue)? ';'?;
	public BasicAttributesGrammarAccess.AttributeDefinitionElements getAttributeDefinitionAccess() {
		return gaBasicAttributes.getAttributeDefinitionAccess();
	}
	
	public ParserRule getAttributeDefinitionRule() {
		return getAttributeDefinitionAccess().getRule();
	}
	
	//AttributeRefinement attr::AttributeRefinement:
	//	documentation=DOCU_COMMENT?
	//	attribute=[attr::AttributeDefinition|FQN] '=' value=AbstractValue ';'?;
	public BasicAttributesGrammarAccess.AttributeRefinementElements getAttributeRefinementAccess() {
		return gaBasicAttributes.getAttributeRefinementAccess();
	}
	
	public ParserRule getAttributeRefinementRule() {
		return getAttributeRefinementAccess().getRule();
	}
	
	//// parser rules for names
	//FQN:
	//	ID ('.' ID)*;
	public BasicAttributesGrammarAccess.FQNElements getFQNAccess() {
		return gaBasicAttributes.getFQNAccess();
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//EBoolean ecore::EBoolean:
	//	'true' | 'false';
	public BasicAttributesGrammarAccess.EBooleanElements getEBooleanAccess() {
		return gaBasicAttributes.getEBooleanAccess();
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//EString:
	//	STRING;
	public BasicAttributesGrammarAccess.EStringElements getEStringAccess() {
		return gaBasicAttributes.getEStringAccess();
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public BasicAttributesGrammarAccess.EIntElements getEIntAccess() {
		return gaBasicAttributes.getEIntAccess();
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EDouble ecore::EDouble:
	//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
	public BasicAttributesGrammarAccess.EDoubleElements getEDoubleAccess() {
		return gaBasicAttributes.getEDoubleAccess();
	}
	
	public ParserRule getEDoubleRule() {
		return getEDoubleAccess().getRule();
	}
	
	//EnumerationElement attr::EnumerationElement:
	//	name=ID ('=' value=EInt)? ';'?;
	public BasicAttributesGrammarAccess.EnumerationElementElements getEnumerationElementAccess() {
		return gaBasicAttributes.getEnumerationElementAccess();
	}
	
	public ParserRule getEnumerationElementRule() {
		return getEnumerationElementAccess().getRule();
	}
	
	//AbstractAttributeType attr::AbstractAttributeType:
	//	PrimitiveType | InlineEnumerationType;
	public BasicAttributesGrammarAccess.AbstractAttributeTypeElements getAbstractAttributeTypeAccess() {
		return gaBasicAttributes.getAbstractAttributeTypeAccess();
	}
	
	public ParserRule getAbstractAttributeTypeRule() {
		return getAbstractAttributeTypeAccess().getRule();
	}
	
	//InlineEnumerationType attr::InlineEnumerationType:
	//	'InlineEnumeration' array=ArrayType? '{' enums+=EnumerationElement+ '}';
	public BasicAttributesGrammarAccess.InlineEnumerationTypeElements getInlineEnumerationTypeAccess() {
		return gaBasicAttributes.getInlineEnumerationTypeAccess();
	}
	
	public ParserRule getInlineEnumerationTypeRule() {
		return getInlineEnumerationTypeAccess().getRule();
	}
	
	//ArrayType attr::ArrayType:
	//	{attr::ArrayType}
	//	'[' length=Cardinality? ']';
	public BasicAttributesGrammarAccess.ArrayTypeElements getArrayTypeAccess() {
		return gaBasicAttributes.getArrayTypeAccess();
	}
	
	public ParserRule getArrayTypeRule() {
		return getArrayTypeAccess().getRule();
	}
	
	//Cardinality:
	//	INT | '*';
	public BasicAttributesGrammarAccess.CardinalityElements getCardinalityAccess() {
		return gaBasicAttributes.getCardinalityAccess();
	}
	
	public ParserRule getCardinalityRule() {
		return getCardinalityAccess().getRule();
	}
	
	//enum PRIMITIVE_TYPE_NAME returns attr::PRIMITIVE_TYPE_NAME:
	//	Int8 | Int16 | Int32 | Int64 |
	//	UInt8 | UInt16 | UInt32 | UInt64 |
	//	Float | Double | String | Boolean;
	public BasicAttributesGrammarAccess.PRIMITIVE_TYPE_NAMEElements getPRIMITIVE_TYPE_NAMEAccess() {
		return gaBasicAttributes.getPRIMITIVE_TYPE_NAMEAccess();
	}
	
	public EnumRule getPRIMITIVE_TYPE_NAMERule() {
		return getPRIMITIVE_TYPE_NAMEAccess().getRule();
	}
	
	//PrimitiveType attr::PrimitiveType:
	//	typeName=PRIMITIVE_TYPE_NAME array=ArrayType?;
	public BasicAttributesGrammarAccess.PrimitiveTypeElements getPrimitiveTypeAccess() {
		return gaBasicAttributes.getPrimitiveTypeAccess();
	}
	
	public ParserRule getPrimitiveTypeRule() {
		return getPrimitiveTypeAccess().getRule();
	}
	
	//AbstractValue attr::AbstractValue:
	//	SingleValue | ArrayValue;
	public BasicAttributesGrammarAccess.AbstractValueElements getAbstractValueAccess() {
		return gaBasicAttributes.getAbstractValueAccess();
	}
	
	public ParserRule getAbstractValueRule() {
		return getAbstractValueAccess().getRule();
	}
	
	//ArrayValue attr::ArrayValue:
	//	'[' values+=SingleValue (',' values+=SingleValue)* ']';
	public BasicAttributesGrammarAccess.ArrayValueElements getArrayValueAccess() {
		return gaBasicAttributes.getArrayValueAccess();
	}
	
	public ParserRule getArrayValueRule() {
		return getArrayValueAccess().getRule();
	}
	
	//SingleValue attr::SingleValue:
	//	{attr::IntValue} value=EInt | {attr::FloatingPointValue} value=EDouble | {attr::StringValue} value=EString |
	//	{attr::BoolValue} value=EBoolean | {attr::EnumerationValue} value=[attr::EnumerationElement|FQN];
	public BasicAttributesGrammarAccess.SingleValueElements getSingleValueAccess() {
		return gaBasicAttributes.getSingleValueAccess();
	}
	
	public ParserRule getSingleValueRule() {
		return getSingleValueAccess().getRule();
	}
	
	//AbstractDocumentedElement:
	//	{AbstractDocumentedElement} documentation=DOCU_COMMENT?;
	public DocuTerminalsGrammarAccess.AbstractDocumentedElementElements getAbstractDocumentedElementAccess() {
		return gaDocuTerminals.getAbstractDocumentedElementAccess();
	}
	
	public ParserRule getAbstractDocumentedElementRule() {
		return getAbstractDocumentedElementAccess().getRule();
	}
	
	//@Override
	//terminal ML_COMMENT:
	//	'/*' !'*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaDocuTerminals.getML_COMMENTRule();
	}
	
	//terminal fragment ML_DOCUMENTATION:
	//	'/**'->'*/';
	public TerminalRule getML_DOCUMENTATIONRule() {
		return gaDocuTerminals.getML_DOCUMENTATIONRule();
	}
	
	//@Override
	//terminal SL_COMMENT:
	//	'//' !'/' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaDocuTerminals.getSL_COMMENTRule();
	}
	
	//terminal fragment SL_DOCUMENTATION:
	//	'///' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_DOCUMENTATIONRule() {
		return gaDocuTerminals.getSL_DOCUMENTATIONRule();
	}
	
	//terminal DOCU_COMMENT:
	//	ML_DOCUMENTATION | SL_DOCUMENTATION;
	public TerminalRule getDOCU_COMMENTRule() {
		return gaDocuTerminals.getDOCU_COMMENTRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
