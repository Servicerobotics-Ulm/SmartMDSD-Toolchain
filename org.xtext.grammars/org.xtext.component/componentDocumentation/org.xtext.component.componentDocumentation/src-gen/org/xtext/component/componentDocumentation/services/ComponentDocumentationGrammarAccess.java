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
package org.xtext.component.componentDocumentation.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ComponentDocumentationGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ComponentDocumentationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDocumentation.ComponentDocumentation.ComponentDocumentation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentDocumentationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cComponentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cComponentComponentDefinitionCrossReference_1_0 = (CrossReference)cComponentAssignment_1.eContents().get(0);
		private final RuleCall cComponentComponentDefinitionFQNParserRuleCall_1_0_1 = (RuleCall)cComponentComponentDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cDescriptionKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cDescriptionAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cDescriptionEStringParserRuleCall_3_0_2_0 = (RuleCall)cDescriptionAssignment_3_0_2.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cPurposeKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cPurposeAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cPurposeEStringParserRuleCall_3_1_2_0 = (RuleCall)cPurposeAssignment_3_1_2.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cLicenseKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cColonKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cLicenseAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final RuleCall cLicenseEStringParserRuleCall_3_2_2_0 = (RuleCall)cLicenseAssignment_3_2_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cUnorderedGroup_3.eContents().get(3);
		private final Keyword cHardwareRequirementsKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Keyword cColonKeyword_3_3_1 = (Keyword)cGroup_3_3.eContents().get(1);
		private final Assignment cHardwareAssignment_3_3_2 = (Assignment)cGroup_3_3.eContents().get(2);
		private final RuleCall cHardwareEStringParserRuleCall_3_3_2_0 = (RuleCall)cHardwareAssignment_3_3_2.eContents().get(0);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementsAbstractComponentDocuElementParserRuleCall_4_0 = (RuleCall)cElementsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ComponentDocumentation:
		//	'ComponentDocumentation' component=[componentDefinition::ComponentDefinition|FQN]
		//	'{' (('Description' ':' description=EString)? & ('Purpose' ':' purpose=EString)? & ('License' ':' license=EString)? &
		//	('HardwareRequirements' ':' hardware=EString)?) elements+=AbstractComponentDocuElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ComponentDocumentation' component=[componentDefinition::ComponentDefinition|FQN] '{' (('Description' ':'
		//description=EString)? & ('Purpose' ':' purpose=EString)? & ('License' ':' license=EString)? & ('HardwareRequirements'
		//':' hardware=EString)?) elements+=AbstractComponentDocuElement* '}'
		public Group getGroup() { return cGroup; }
		
		//'ComponentDocumentation'
		public Keyword getComponentDocumentationKeyword_0() { return cComponentDocumentationKeyword_0; }
		
		//component=[componentDefinition::ComponentDefinition|FQN]
		public Assignment getComponentAssignment_1() { return cComponentAssignment_1; }
		
		//[componentDefinition::ComponentDefinition|FQN]
		public CrossReference getComponentComponentDefinitionCrossReference_1_0() { return cComponentComponentDefinitionCrossReference_1_0; }
		
		//FQN
		public RuleCall getComponentComponentDefinitionFQNParserRuleCall_1_0_1() { return cComponentComponentDefinitionFQNParserRuleCall_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('Description' ':' description=EString)? & ('Purpose' ':' purpose=EString)? & ('License' ':' license=EString)? &
		//('HardwareRequirements' ':' hardware=EString)?
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//('Description' ':' description=EString)?
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'Description'
		public Keyword getDescriptionKeyword_3_0_0() { return cDescriptionKeyword_3_0_0; }
		
		//':'
		public Keyword getColonKeyword_3_0_1() { return cColonKeyword_3_0_1; }
		
		//description=EString
		public Assignment getDescriptionAssignment_3_0_2() { return cDescriptionAssignment_3_0_2; }
		
		//EString
		public RuleCall getDescriptionEStringParserRuleCall_3_0_2_0() { return cDescriptionEStringParserRuleCall_3_0_2_0; }
		
		//('Purpose' ':' purpose=EString)?
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'Purpose'
		public Keyword getPurposeKeyword_3_1_0() { return cPurposeKeyword_3_1_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_1() { return cColonKeyword_3_1_1; }
		
		//purpose=EString
		public Assignment getPurposeAssignment_3_1_2() { return cPurposeAssignment_3_1_2; }
		
		//EString
		public RuleCall getPurposeEStringParserRuleCall_3_1_2_0() { return cPurposeEStringParserRuleCall_3_1_2_0; }
		
		//('License' ':' license=EString)?
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'License'
		public Keyword getLicenseKeyword_3_2_0() { return cLicenseKeyword_3_2_0; }
		
		//':'
		public Keyword getColonKeyword_3_2_1() { return cColonKeyword_3_2_1; }
		
		//license=EString
		public Assignment getLicenseAssignment_3_2_2() { return cLicenseAssignment_3_2_2; }
		
		//EString
		public RuleCall getLicenseEStringParserRuleCall_3_2_2_0() { return cLicenseEStringParserRuleCall_3_2_2_0; }
		
		//('HardwareRequirements' ':' hardware=EString)?
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//'HardwareRequirements'
		public Keyword getHardwareRequirementsKeyword_3_3_0() { return cHardwareRequirementsKeyword_3_3_0; }
		
		//':'
		public Keyword getColonKeyword_3_3_1() { return cColonKeyword_3_3_1; }
		
		//hardware=EString
		public Assignment getHardwareAssignment_3_3_2() { return cHardwareAssignment_3_3_2; }
		
		//EString
		public RuleCall getHardwareEStringParserRuleCall_3_3_2_0() { return cHardwareEStringParserRuleCall_3_3_2_0; }
		
		//elements+=AbstractComponentDocuElement*
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }
		
		//AbstractComponentDocuElement
		public RuleCall getElementsAbstractComponentDocuElementParserRuleCall_4_0() { return cElementsAbstractComponentDocuElementParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDocumentation.ComponentDocumentation.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EString:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class AbstractComponentDocuElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDocumentation.ComponentDocumentation.AbstractComponentDocuElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCoordinationSlavePortDocuParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cComponentServiceDocuParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAbstractModeDocuParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AbstractComponentDocuElement:
		//	CoordinationSlavePortDocu | ComponentServiceDocu | AbstractModeDocu;
		@Override public ParserRule getRule() { return rule; }
		
		//CoordinationSlavePortDocu | ComponentServiceDocu | AbstractModeDocu
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CoordinationSlavePortDocu
		public RuleCall getCoordinationSlavePortDocuParserRuleCall_0() { return cCoordinationSlavePortDocuParserRuleCall_0; }
		
		//ComponentServiceDocu
		public RuleCall getComponentServiceDocuParserRuleCall_1() { return cComponentServiceDocuParserRuleCall_1; }
		
		//AbstractModeDocu
		public RuleCall getAbstractModeDocuParserRuleCall_2() { return cAbstractModeDocuParserRuleCall_2; }
	}
	public class CoordinationSlavePortDocuElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDocumentation.ComponentDocumentation.CoordinationSlavePortDocu");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCoordinationSlavePortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPortAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPortCoordinationSlavePortCrossReference_1_0 = (CrossReference)cPortAssignment_1.eContents().get(0);
		private final RuleCall cPortCoordinationSlavePortFQNParserRuleCall_1_0_1 = (RuleCall)cPortCoordinationSlavePortCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cSlavePortDescriptionKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cDescriptionAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cDescriptionEStringParserRuleCall_3_0_2_0 = (RuleCall)cDescriptionAssignment_3_0_2.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cDynamicWiringPortKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cDynamicWiringAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cDynamicWiringEStringParserRuleCall_3_1_2_0 = (RuleCall)cDynamicWiringAssignment_3_1_2.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cStatePortKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cColonKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cStateAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final RuleCall cStateEStringParserRuleCall_3_2_2_0 = (RuleCall)cStateAssignment_3_2_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cUnorderedGroup_3.eContents().get(3);
		private final Keyword cParameterPortKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Keyword cColonKeyword_3_3_1 = (Keyword)cGroup_3_3.eContents().get(1);
		private final Assignment cParameterAssignment_3_3_2 = (Assignment)cGroup_3_3.eContents().get(2);
		private final RuleCall cParameterEStringParserRuleCall_3_3_2_0 = (RuleCall)cParameterAssignment_3_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//CoordinationSlavePortDocu:
		//	'CoordinationSlavePort' port=[stateExtension::CoordinationSlavePort|FQN] '{' (('SlavePortDescription' ':'
		//	description=EString)? & ('DynamicWiringPort' ':' dynamicWiring=EString)? & ('StatePort' ':' state=EString)? &
		//	('ParameterPort' ':' parameter=EString)?)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'CoordinationSlavePort' port=[stateExtension::CoordinationSlavePort|FQN] '{' (('SlavePortDescription' ':'
		//description=EString)? & ('DynamicWiringPort' ':' dynamicWiring=EString)? & ('StatePort' ':' state=EString)? &
		//('ParameterPort' ':' parameter=EString)?) '}'
		public Group getGroup() { return cGroup; }
		
		//'CoordinationSlavePort'
		public Keyword getCoordinationSlavePortKeyword_0() { return cCoordinationSlavePortKeyword_0; }
		
		//port=[stateExtension::CoordinationSlavePort|FQN]
		public Assignment getPortAssignment_1() { return cPortAssignment_1; }
		
		//[stateExtension::CoordinationSlavePort|FQN]
		public CrossReference getPortCoordinationSlavePortCrossReference_1_0() { return cPortCoordinationSlavePortCrossReference_1_0; }
		
		//FQN
		public RuleCall getPortCoordinationSlavePortFQNParserRuleCall_1_0_1() { return cPortCoordinationSlavePortFQNParserRuleCall_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('SlavePortDescription' ':' description=EString)? & ('DynamicWiringPort' ':' dynamicWiring=EString)? & ('StatePort' ':'
		//state=EString)? & ('ParameterPort' ':' parameter=EString)?
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//('SlavePortDescription' ':' description=EString)?
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'SlavePortDescription'
		public Keyword getSlavePortDescriptionKeyword_3_0_0() { return cSlavePortDescriptionKeyword_3_0_0; }
		
		//':'
		public Keyword getColonKeyword_3_0_1() { return cColonKeyword_3_0_1; }
		
		//description=EString
		public Assignment getDescriptionAssignment_3_0_2() { return cDescriptionAssignment_3_0_2; }
		
		//EString
		public RuleCall getDescriptionEStringParserRuleCall_3_0_2_0() { return cDescriptionEStringParserRuleCall_3_0_2_0; }
		
		//('DynamicWiringPort' ':' dynamicWiring=EString)?
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'DynamicWiringPort'
		public Keyword getDynamicWiringPortKeyword_3_1_0() { return cDynamicWiringPortKeyword_3_1_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_1() { return cColonKeyword_3_1_1; }
		
		//dynamicWiring=EString
		public Assignment getDynamicWiringAssignment_3_1_2() { return cDynamicWiringAssignment_3_1_2; }
		
		//EString
		public RuleCall getDynamicWiringEStringParserRuleCall_3_1_2_0() { return cDynamicWiringEStringParserRuleCall_3_1_2_0; }
		
		//('StatePort' ':' state=EString)?
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'StatePort'
		public Keyword getStatePortKeyword_3_2_0() { return cStatePortKeyword_3_2_0; }
		
		//':'
		public Keyword getColonKeyword_3_2_1() { return cColonKeyword_3_2_1; }
		
		//state=EString
		public Assignment getStateAssignment_3_2_2() { return cStateAssignment_3_2_2; }
		
		//EString
		public RuleCall getStateEStringParserRuleCall_3_2_2_0() { return cStateEStringParserRuleCall_3_2_2_0; }
		
		//('ParameterPort' ':' parameter=EString)?
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//'ParameterPort'
		public Keyword getParameterPortKeyword_3_3_0() { return cParameterPortKeyword_3_3_0; }
		
		//':'
		public Keyword getColonKeyword_3_3_1() { return cColonKeyword_3_3_1; }
		
		//parameter=EString
		public Assignment getParameterAssignment_3_3_2() { return cParameterAssignment_3_3_2; }
		
		//EString
		public RuleCall getParameterEStringParserRuleCall_3_3_2_0() { return cParameterEStringParserRuleCall_3_3_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ComponentServiceDocuElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDocumentation.ComponentDocumentation.ComponentServiceDocu");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPortAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPortComponentPortCrossReference_1_0 = (CrossReference)cPortAssignment_1.eContents().get(0);
		private final RuleCall cPortComponentPortFQNParserRuleCall_1_0_1 = (RuleCall)cPortComponentPortCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDescriptionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cColonKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cDescriptionAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cDescriptionEStringParserRuleCall_3_2_0 = (RuleCall)cDescriptionAssignment_3_2.eContents().get(0);
		private final Assignment cStatesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStatesAbstractModeDocuParserRuleCall_4_0 = (RuleCall)cStatesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ComponentServiceDocu:
		//	'ComponentPort' port=[componentDefinition::ComponentPort|FQN]
		//	'{' ('Description' ':' description=EString)?
		//	states+=AbstractModeDocu*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ComponentPort' port=[componentDefinition::ComponentPort|FQN] '{' ('Description' ':' description=EString)?
		//states+=AbstractModeDocu* '}'
		public Group getGroup() { return cGroup; }
		
		//'ComponentPort'
		public Keyword getComponentPortKeyword_0() { return cComponentPortKeyword_0; }
		
		//port=[componentDefinition::ComponentPort|FQN]
		public Assignment getPortAssignment_1() { return cPortAssignment_1; }
		
		//[componentDefinition::ComponentPort|FQN]
		public CrossReference getPortComponentPortCrossReference_1_0() { return cPortComponentPortCrossReference_1_0; }
		
		//FQN
		public RuleCall getPortComponentPortFQNParserRuleCall_1_0_1() { return cPortComponentPortFQNParserRuleCall_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('Description' ':' description=EString)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'Description'
		public Keyword getDescriptionKeyword_3_0() { return cDescriptionKeyword_3_0; }
		
		//':'
		public Keyword getColonKeyword_3_1() { return cColonKeyword_3_1; }
		
		//description=EString
		public Assignment getDescriptionAssignment_3_2() { return cDescriptionAssignment_3_2; }
		
		//EString
		public RuleCall getDescriptionEStringParserRuleCall_3_2_0() { return cDescriptionEStringParserRuleCall_3_2_0; }
		
		//states+=AbstractModeDocu*
		public Assignment getStatesAssignment_4() { return cStatesAssignment_4; }
		
		//AbstractModeDocu
		public RuleCall getStatesAbstractModeDocuParserRuleCall_4_0() { return cStatesAbstractModeDocuParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class AbstractModeDocuElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDocumentation.ComponentDocumentation.AbstractModeDocu");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cComponentModeDocuParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNeutralModeDocuParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractModeDocu:
		//	ComponentModeDocu | NeutralModeDocu;
		@Override public ParserRule getRule() { return rule; }
		
		//ComponentModeDocu | NeutralModeDocu
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ComponentModeDocu
		public RuleCall getComponentModeDocuParserRuleCall_0() { return cComponentModeDocuParserRuleCall_0; }
		
		//NeutralModeDocu
		public RuleCall getNeutralModeDocuParserRuleCall_1() { return cNeutralModeDocuParserRuleCall_1; }
	}
	public class ComponentModeDocuElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDocumentation.ComponentDocumentation.ComponentModeDocu");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentModeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cModeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cModePublicOperationModeCrossReference_1_0 = (CrossReference)cModeAssignment_1.eContents().get(0);
		private final RuleCall cModePublicOperationModeFQNParserRuleCall_1_0_1 = (RuleCall)cModePublicOperationModeCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionEStringParserRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		
		//ComponentModeDocu:
		//	'ComponentMode' mode=[stateExtension::PublicOperationMode|FQN] ':' description=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//'ComponentMode' mode=[stateExtension::PublicOperationMode|FQN] ':' description=EString
		public Group getGroup() { return cGroup; }
		
		//'ComponentMode'
		public Keyword getComponentModeKeyword_0() { return cComponentModeKeyword_0; }
		
		//mode=[stateExtension::PublicOperationMode|FQN]
		public Assignment getModeAssignment_1() { return cModeAssignment_1; }
		
		//[stateExtension::PublicOperationMode|FQN]
		public CrossReference getModePublicOperationModeCrossReference_1_0() { return cModePublicOperationModeCrossReference_1_0; }
		
		//FQN
		public RuleCall getModePublicOperationModeFQNParserRuleCall_1_0_1() { return cModePublicOperationModeFQNParserRuleCall_1_0_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//description=EString
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//EString
		public RuleCall getDescriptionEStringParserRuleCall_3_0() { return cDescriptionEStringParserRuleCall_3_0; }
	}
	public class NeutralModeDocuElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDocumentation.ComponentDocumentation.NeutralModeDocu");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNeutralModeDocuAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNeutralModeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionEStringParserRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		
		//NeutralModeDocu:
		//	{NeutralModeDocu}
		//	'NeutralMode' ':' description=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{NeutralModeDocu} 'NeutralMode' ':' description=EString
		public Group getGroup() { return cGroup; }
		
		//{NeutralModeDocu}
		public Action getNeutralModeDocuAction_0() { return cNeutralModeDocuAction_0; }
		
		//'NeutralMode'
		public Keyword getNeutralModeKeyword_1() { return cNeutralModeKeyword_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//description=EString
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//EString
		public RuleCall getDescriptionEStringParserRuleCall_3_0() { return cDescriptionEStringParserRuleCall_3_0; }
	}
	
	
	private final ComponentDocumentationElements pComponentDocumentation;
	private final FQNElements pFQN;
	private final EStringElements pEString;
	private final AbstractComponentDocuElementElements pAbstractComponentDocuElement;
	private final CoordinationSlavePortDocuElements pCoordinationSlavePortDocu;
	private final ComponentServiceDocuElements pComponentServiceDocu;
	private final AbstractModeDocuElements pAbstractModeDocu;
	private final ComponentModeDocuElements pComponentModeDocu;
	private final NeutralModeDocuElements pNeutralModeDocu;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ComponentDocumentationGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pComponentDocumentation = new ComponentDocumentationElements();
		this.pFQN = new FQNElements();
		this.pEString = new EStringElements();
		this.pAbstractComponentDocuElement = new AbstractComponentDocuElementElements();
		this.pCoordinationSlavePortDocu = new CoordinationSlavePortDocuElements();
		this.pComponentServiceDocu = new ComponentServiceDocuElements();
		this.pAbstractModeDocu = new AbstractModeDocuElements();
		this.pComponentModeDocu = new ComponentModeDocuElements();
		this.pNeutralModeDocu = new NeutralModeDocuElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.component.componentDocumentation.ComponentDocumentation".equals(grammar.getName())) {
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
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ComponentDocumentation:
	//	'ComponentDocumentation' component=[componentDefinition::ComponentDefinition|FQN]
	//	'{' (('Description' ':' description=EString)? & ('Purpose' ':' purpose=EString)? & ('License' ':' license=EString)? &
	//	('HardwareRequirements' ':' hardware=EString)?) elements+=AbstractComponentDocuElement*
	//	'}';
	public ComponentDocumentationElements getComponentDocumentationAccess() {
		return pComponentDocumentation;
	}
	
	public ParserRule getComponentDocumentationRule() {
		return getComponentDocumentationAccess().getRule();
	}
	
	//FQN:
	//	ID ('.' ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//EString:
	//	STRING;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//AbstractComponentDocuElement:
	//	CoordinationSlavePortDocu | ComponentServiceDocu | AbstractModeDocu;
	public AbstractComponentDocuElementElements getAbstractComponentDocuElementAccess() {
		return pAbstractComponentDocuElement;
	}
	
	public ParserRule getAbstractComponentDocuElementRule() {
		return getAbstractComponentDocuElementAccess().getRule();
	}
	
	//CoordinationSlavePortDocu:
	//	'CoordinationSlavePort' port=[stateExtension::CoordinationSlavePort|FQN] '{' (('SlavePortDescription' ':'
	//	description=EString)? & ('DynamicWiringPort' ':' dynamicWiring=EString)? & ('StatePort' ':' state=EString)? &
	//	('ParameterPort' ':' parameter=EString)?)
	//	'}';
	public CoordinationSlavePortDocuElements getCoordinationSlavePortDocuAccess() {
		return pCoordinationSlavePortDocu;
	}
	
	public ParserRule getCoordinationSlavePortDocuRule() {
		return getCoordinationSlavePortDocuAccess().getRule();
	}
	
	//ComponentServiceDocu:
	//	'ComponentPort' port=[componentDefinition::ComponentPort|FQN]
	//	'{' ('Description' ':' description=EString)?
	//	states+=AbstractModeDocu*
	//	'}';
	public ComponentServiceDocuElements getComponentServiceDocuAccess() {
		return pComponentServiceDocu;
	}
	
	public ParserRule getComponentServiceDocuRule() {
		return getComponentServiceDocuAccess().getRule();
	}
	
	//AbstractModeDocu:
	//	ComponentModeDocu | NeutralModeDocu;
	public AbstractModeDocuElements getAbstractModeDocuAccess() {
		return pAbstractModeDocu;
	}
	
	public ParserRule getAbstractModeDocuRule() {
		return getAbstractModeDocuAccess().getRule();
	}
	
	//ComponentModeDocu:
	//	'ComponentMode' mode=[stateExtension::PublicOperationMode|FQN] ':' description=EString;
	public ComponentModeDocuElements getComponentModeDocuAccess() {
		return pComponentModeDocu;
	}
	
	public ParserRule getComponentModeDocuRule() {
		return getComponentModeDocuAccess().getRule();
	}
	
	//NeutralModeDocu:
	//	{NeutralModeDocu}
	//	'NeutralMode' ':' description=EString;
	public NeutralModeDocuElements getNeutralModeDocuAccess() {
		return pNeutralModeDocu;
	}
	
	public ParserRule getNeutralModeDocuRule() {
		return getNeutralModeDocuAccess().getRule();
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
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
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
