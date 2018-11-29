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
package org.xtext.system.causeEffectChain.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class CauseEffectChainGrammarAccess extends AbstractGrammarElementFinder {
	
	public class CuaseEffectChainModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.causeEffectChain.CauseEffectChain.CuaseEffectChainModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCuaseEffectChainModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cRefinesActivityArchKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cActArchAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cActArchActivityArchitectureModelCrossReference_3_0 = (CrossReference)cActArchAssignment_3.eContents().get(0);
		private final RuleCall cActArchActivityArchitectureModelFQNParserRuleCall_3_0_1 = (RuleCall)cActArchActivityArchitectureModelCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cChainsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cChainsActivityChainParserRuleCall_5_0 = (RuleCall)cChainsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//CuaseEffectChainModel:
		//	'CuaseEffectChainModel' name=ID 'refinesActivityArch' actArch=[activityArchitecture::ActivityArchitectureModel|FQN]
		//	'{'
		//	chains+=ActivityChain*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'CuaseEffectChainModel' name=ID 'refinesActivityArch' actArch=[activityArchitecture::ActivityArchitectureModel|FQN] '{'
		//chains+=ActivityChain* '}'
		public Group getGroup() { return cGroup; }
		
		//'CuaseEffectChainModel'
		public Keyword getCuaseEffectChainModelKeyword_0() { return cCuaseEffectChainModelKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'refinesActivityArch'
		public Keyword getRefinesActivityArchKeyword_2() { return cRefinesActivityArchKeyword_2; }
		
		//actArch=[activityArchitecture::ActivityArchitectureModel|FQN]
		public Assignment getActArchAssignment_3() { return cActArchAssignment_3; }
		
		//[activityArchitecture::ActivityArchitectureModel|FQN]
		public CrossReference getActArchActivityArchitectureModelCrossReference_3_0() { return cActArchActivityArchitectureModelCrossReference_3_0; }
		
		//FQN
		public RuleCall getActArchActivityArchitectureModelFQNParserRuleCall_3_0_1() { return cActArchActivityArchitectureModelFQNParserRuleCall_3_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//chains+=ActivityChain*
		public Assignment getChainsAssignment_5() { return cChainsAssignment_5; }
		
		//ActivityChain
		public RuleCall getChainsActivityChainParserRuleCall_5_0() { return cChainsActivityChainParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.causeEffectChain.CauseEffectChain.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.causeEffectChain.CauseEffectChain.FQN");
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
	public class ActivityChainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.causeEffectChain.CauseEffectChain.ActivityChain");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActivityChainAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cActivityChainKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cChainLinksKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cChainLinksAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cChainLinksAbstractChainLinkParserRuleCall_4_2_0 = (RuleCall)cChainLinksAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cChainLinksAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cChainLinksAbstractChainLinkParserRuleCall_4_3_1_0 = (RuleCall)cChainLinksAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Assignment cDesiredMinResponseAssignment_5_0 = (Assignment)cUnorderedGroup_5.eContents().get(0);
		private final RuleCall cDesiredMinResponseMinResponseTimeParserRuleCall_5_0_0 = (RuleCall)cDesiredMinResponseAssignment_5_0.eContents().get(0);
		private final Assignment cDesiredMaxResponseAssignment_5_1 = (Assignment)cUnorderedGroup_5.eContents().get(1);
		private final RuleCall cDesiredMaxResponseMaxResponseTimeParserRuleCall_5_1_0 = (RuleCall)cDesiredMaxResponseAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ActivityChain:
		//	{ActivityChain}
		//	'ActivityChain' name=ID
		//	'{' ('chainLinks' '{' chainLinks+=AbstractChainLink ("->" chainLinks+=AbstractChainLink)* '}')?
		//	(desiredMinResponse=MinResponseTime? & desiredMaxResponse=MaxResponseTime?)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{ActivityChain} 'ActivityChain' name=ID '{' ('chainLinks' '{' chainLinks+=AbstractChainLink ("->"
		//chainLinks+=AbstractChainLink)* '}')? (desiredMinResponse=MinResponseTime? & desiredMaxResponse=MaxResponseTime?) '}'
		public Group getGroup() { return cGroup; }
		
		//{ActivityChain}
		public Action getActivityChainAction_0() { return cActivityChainAction_0; }
		
		//'ActivityChain'
		public Keyword getActivityChainKeyword_1() { return cActivityChainKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('chainLinks' '{' chainLinks+=AbstractChainLink ("->" chainLinks+=AbstractChainLink)* '}')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'chainLinks'
		public Keyword getChainLinksKeyword_4_0() { return cChainLinksKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//chainLinks+=AbstractChainLink
		public Assignment getChainLinksAssignment_4_2() { return cChainLinksAssignment_4_2; }
		
		//AbstractChainLink
		public RuleCall getChainLinksAbstractChainLinkParserRuleCall_4_2_0() { return cChainLinksAbstractChainLinkParserRuleCall_4_2_0; }
		
		//("->" chainLinks+=AbstractChainLink)*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_4_3_0() { return cHyphenMinusGreaterThanSignKeyword_4_3_0; }
		
		//chainLinks+=AbstractChainLink
		public Assignment getChainLinksAssignment_4_3_1() { return cChainLinksAssignment_4_3_1; }
		
		//AbstractChainLink
		public RuleCall getChainLinksAbstractChainLinkParserRuleCall_4_3_1_0() { return cChainLinksAbstractChainLinkParserRuleCall_4_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }
		
		//desiredMinResponse=MinResponseTime? & desiredMaxResponse=MaxResponseTime?
		public UnorderedGroup getUnorderedGroup_5() { return cUnorderedGroup_5; }
		
		//desiredMinResponse=MinResponseTime?
		public Assignment getDesiredMinResponseAssignment_5_0() { return cDesiredMinResponseAssignment_5_0; }
		
		//MinResponseTime
		public RuleCall getDesiredMinResponseMinResponseTimeParserRuleCall_5_0_0() { return cDesiredMinResponseMinResponseTimeParserRuleCall_5_0_0; }
		
		//desiredMaxResponse=MaxResponseTime?
		public Assignment getDesiredMaxResponseAssignment_5_1() { return cDesiredMaxResponseAssignment_5_1; }
		
		//MaxResponseTime
		public RuleCall getDesiredMaxResponseMaxResponseTimeParserRuleCall_5_1_0() { return cDesiredMaxResponseMaxResponseTimeParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class AbstractChainLinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.causeEffectChain.CauseEffectChain.AbstractChainLink");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cActivityLinkParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cInputHandlerLinkParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractChainLink:
		//	ActivityLink | InputHandlerLink;
		@Override public ParserRule getRule() { return rule; }
		
		//ActivityLink | InputHandlerLink
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ActivityLink
		public RuleCall getActivityLinkParserRuleCall_0() { return cActivityLinkParserRuleCall_0; }
		
		//InputHandlerLink
		public RuleCall getInputHandlerLinkParserRuleCall_1() { return cInputHandlerLinkParserRuleCall_1; }
	}
	public class ActivityLinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.causeEffectChain.CauseEffectChain.ActivityLink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefActivityNodeCrossReference_1_0 = (CrossReference)cRefAssignment_1.eContents().get(0);
		private final RuleCall cRefActivityNodeFQNParserRuleCall_1_0_1 = (RuleCall)cRefActivityNodeCrossReference_1_0.eContents().get(1);
		
		//ActivityLink:
		//	'act.' ref=[activityArchitecture::ActivityNode|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//'act.' ref=[activityArchitecture::ActivityNode|FQN]
		public Group getGroup() { return cGroup; }
		
		//'act.'
		public Keyword getActKeyword_0() { return cActKeyword_0; }
		
		//ref=[activityArchitecture::ActivityNode|FQN]
		public Assignment getRefAssignment_1() { return cRefAssignment_1; }
		
		//[activityArchitecture::ActivityNode|FQN]
		public CrossReference getRefActivityNodeCrossReference_1_0() { return cRefActivityNodeCrossReference_1_0; }
		
		//FQN
		public RuleCall getRefActivityNodeFQNParserRuleCall_1_0_1() { return cRefActivityNodeFQNParserRuleCall_1_0_1; }
	}
	public class InputHandlerLinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.causeEffectChain.CauseEffectChain.InputHandlerLink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHndKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefInputHandlerNodeCrossReference_1_0 = (CrossReference)cRefAssignment_1.eContents().get(0);
		private final RuleCall cRefInputHandlerNodeFQNParserRuleCall_1_0_1 = (RuleCall)cRefInputHandlerNodeCrossReference_1_0.eContents().get(1);
		
		//InputHandlerLink:
		//	'hnd.' ref=[activityArchitecture::InputHandlerNode|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//'hnd.' ref=[activityArchitecture::InputHandlerNode|FQN]
		public Group getGroup() { return cGroup; }
		
		//'hnd.'
		public Keyword getHndKeyword_0() { return cHndKeyword_0; }
		
		//ref=[activityArchitecture::InputHandlerNode|FQN]
		public Assignment getRefAssignment_1() { return cRefAssignment_1; }
		
		//[activityArchitecture::InputHandlerNode|FQN]
		public CrossReference getRefInputHandlerNodeCrossReference_1_0() { return cRefInputHandlerNodeCrossReference_1_0; }
		
		//FQN
		public RuleCall getRefInputHandlerNodeFQNParserRuleCall_1_0_1() { return cRefInputHandlerNodeFQNParserRuleCall_1_0_1; }
	}
	public class MinResponseTimeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.causeEffectChain.CauseEffectChain.MinResponseTime");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDesiredMinResponseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueEIntParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUnitTimeUnitEnumRuleCall_2_0 = (RuleCall)cUnitAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//MinResponseTime:
		//	'desiredMinResponse' value=EInt unit=TimeUnit ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'desiredMinResponse' value=EInt unit=TimeUnit ';'?
		public Group getGroup() { return cGroup; }
		
		//'desiredMinResponse'
		public Keyword getDesiredMinResponseKeyword_0() { return cDesiredMinResponseKeyword_0; }
		
		//value=EInt
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//EInt
		public RuleCall getValueEIntParserRuleCall_1_0() { return cValueEIntParserRuleCall_1_0; }
		
		//unit=TimeUnit
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//TimeUnit
		public RuleCall getUnitTimeUnitEnumRuleCall_2_0() { return cUnitTimeUnitEnumRuleCall_2_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class MaxResponseTimeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.causeEffectChain.CauseEffectChain.MaxResponseTime");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDesiredMaxResponseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueEIntParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUnitTimeUnitEnumRuleCall_2_0 = (RuleCall)cUnitAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//MaxResponseTime:
		//	'desiredMaxResponse' value=EInt unit=TimeUnit ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'desiredMaxResponse' value=EInt unit=TimeUnit ';'?
		public Group getGroup() { return cGroup; }
		
		//'desiredMaxResponse'
		public Keyword getDesiredMaxResponseKeyword_0() { return cDesiredMaxResponseKeyword_0; }
		
		//value=EInt
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//EInt
		public RuleCall getValueEIntParserRuleCall_1_0() { return cValueEIntParserRuleCall_1_0; }
		
		//unit=TimeUnit
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//TimeUnit
		public RuleCall getUnitTimeUnitEnumRuleCall_2_0() { return cUnitTimeUnitEnumRuleCall_2_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	
	public class TimeUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.causeEffectChain.CauseEffectChain.TimeUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSECEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSECSecKeyword_0_0 = (Keyword)cSECEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMSECEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMSECMsKeyword_1_0 = (Keyword)cMSECEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cUSECEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cUSECUsKeyword_2_0 = (Keyword)cUSECEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum TimeUnit returns activityArchitecture::TimeUnit:
		//	SEC='sec' | MSEC='ms' | USEC='us';
		public EnumRule getRule() { return rule; }
		
		//SEC='sec' | MSEC='ms' | USEC='us'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SEC='sec'
		public EnumLiteralDeclaration getSECEnumLiteralDeclaration_0() { return cSECEnumLiteralDeclaration_0; }
		
		//'sec'
		public Keyword getSECSecKeyword_0_0() { return cSECSecKeyword_0_0; }
		
		//MSEC='ms'
		public EnumLiteralDeclaration getMSECEnumLiteralDeclaration_1() { return cMSECEnumLiteralDeclaration_1; }
		
		//'ms'
		public Keyword getMSECMsKeyword_1_0() { return cMSECMsKeyword_1_0; }
		
		//USEC='us'
		public EnumLiteralDeclaration getUSECEnumLiteralDeclaration_2() { return cUSECEnumLiteralDeclaration_2; }
		
		//'us'
		public Keyword getUSECUsKeyword_2_0() { return cUSECUsKeyword_2_0; }
	}
	
	private final CuaseEffectChainModelElements pCuaseEffectChainModel;
	private final EIntElements pEInt;
	private final FQNElements pFQN;
	private final ActivityChainElements pActivityChain;
	private final AbstractChainLinkElements pAbstractChainLink;
	private final ActivityLinkElements pActivityLink;
	private final InputHandlerLinkElements pInputHandlerLink;
	private final MinResponseTimeElements pMinResponseTime;
	private final MaxResponseTimeElements pMaxResponseTime;
	private final TimeUnitElements eTimeUnit;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CauseEffectChainGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pCuaseEffectChainModel = new CuaseEffectChainModelElements();
		this.pEInt = new EIntElements();
		this.pFQN = new FQNElements();
		this.pActivityChain = new ActivityChainElements();
		this.pAbstractChainLink = new AbstractChainLinkElements();
		this.pActivityLink = new ActivityLinkElements();
		this.pInputHandlerLink = new InputHandlerLinkElements();
		this.pMinResponseTime = new MinResponseTimeElements();
		this.pMaxResponseTime = new MaxResponseTimeElements();
		this.eTimeUnit = new TimeUnitElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.system.causeEffectChain.CauseEffectChain".equals(grammar.getName())) {
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

	
	//CuaseEffectChainModel:
	//	'CuaseEffectChainModel' name=ID 'refinesActivityArch' actArch=[activityArchitecture::ActivityArchitectureModel|FQN]
	//	'{'
	//	chains+=ActivityChain*
	//	'}';
	public CuaseEffectChainModelElements getCuaseEffectChainModelAccess() {
		return pCuaseEffectChainModel;
	}
	
	public ParserRule getCuaseEffectChainModelRule() {
		return getCuaseEffectChainModelAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//FQN:
	//	ID ('.' ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//ActivityChain:
	//	{ActivityChain}
	//	'ActivityChain' name=ID
	//	'{' ('chainLinks' '{' chainLinks+=AbstractChainLink ("->" chainLinks+=AbstractChainLink)* '}')?
	//	(desiredMinResponse=MinResponseTime? & desiredMaxResponse=MaxResponseTime?)
	//	'}';
	public ActivityChainElements getActivityChainAccess() {
		return pActivityChain;
	}
	
	public ParserRule getActivityChainRule() {
		return getActivityChainAccess().getRule();
	}
	
	//AbstractChainLink:
	//	ActivityLink | InputHandlerLink;
	public AbstractChainLinkElements getAbstractChainLinkAccess() {
		return pAbstractChainLink;
	}
	
	public ParserRule getAbstractChainLinkRule() {
		return getAbstractChainLinkAccess().getRule();
	}
	
	//ActivityLink:
	//	'act.' ref=[activityArchitecture::ActivityNode|FQN];
	public ActivityLinkElements getActivityLinkAccess() {
		return pActivityLink;
	}
	
	public ParserRule getActivityLinkRule() {
		return getActivityLinkAccess().getRule();
	}
	
	//InputHandlerLink:
	//	'hnd.' ref=[activityArchitecture::InputHandlerNode|FQN];
	public InputHandlerLinkElements getInputHandlerLinkAccess() {
		return pInputHandlerLink;
	}
	
	public ParserRule getInputHandlerLinkRule() {
		return getInputHandlerLinkAccess().getRule();
	}
	
	//MinResponseTime:
	//	'desiredMinResponse' value=EInt unit=TimeUnit ';'?;
	public MinResponseTimeElements getMinResponseTimeAccess() {
		return pMinResponseTime;
	}
	
	public ParserRule getMinResponseTimeRule() {
		return getMinResponseTimeAccess().getRule();
	}
	
	//MaxResponseTime:
	//	'desiredMaxResponse' value=EInt unit=TimeUnit ';'?;
	public MaxResponseTimeElements getMaxResponseTimeAccess() {
		return pMaxResponseTime;
	}
	
	public ParserRule getMaxResponseTimeRule() {
		return getMaxResponseTimeAccess().getRule();
	}
	
	//enum TimeUnit returns activityArchitecture::TimeUnit:
	//	SEC='sec' | MSEC='ms' | USEC='us';
	public TimeUnitElements getTimeUnitAccess() {
		return eTimeUnit;
	}
	
	public EnumRule getTimeUnitRule() {
		return getTimeUnitAccess().getRule();
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
