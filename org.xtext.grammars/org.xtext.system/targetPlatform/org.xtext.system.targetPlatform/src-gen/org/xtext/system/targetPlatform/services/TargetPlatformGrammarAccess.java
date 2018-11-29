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
package org.xtext.system.targetPlatform.services;

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
import org.xtext.service.roboticMiddleware.services.RoboticMiddlewareGrammarAccess;

@Singleton
public class TargetPlatformGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TargetPlatformModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.targetPlatform.TargetPlatform.TargetPlatformModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTargetPlatformModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsAbstractTPElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//TargetPlatformModel:
		//	'TargetPlatformModel' name=ID
		//	'{'
		//	elements+=AbstractTPElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'TargetPlatformModel' name=ID '{' elements+=AbstractTPElement* '}'
		public Group getGroup() { return cGroup; }
		
		//'TargetPlatformModel'
		public Keyword getTargetPlatformModelKeyword_0() { return cTargetPlatformModelKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//elements+=AbstractTPElement*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//AbstractTPElement
		public RuleCall getElementsAbstractTPElementParserRuleCall_3_0() { return cElementsAbstractTPElementParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class AbstractTPElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.targetPlatform.TargetPlatform.AbstractTPElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTargetPlatformDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNetworkConnectionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractTPElement:
		//	TargetPlatformDefinition | NetworkConnection;
		@Override public ParserRule getRule() { return rule; }
		
		//TargetPlatformDefinition | NetworkConnection
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TargetPlatformDefinition
		public RuleCall getTargetPlatformDefinitionParserRuleCall_0() { return cTargetPlatformDefinitionParserRuleCall_0; }
		
		//NetworkConnection
		public RuleCall getNetworkConnectionParserRuleCall_1() { return cNetworkConnectionParserRuleCall_1; }
	}
	public class NetworkConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.targetPlatform.TargetPlatform.NetworkConnection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNetworkConnectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEndpoint1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cEndpoint1NetworkInterfaceCrossReference_2_0 = (CrossReference)cEndpoint1Assignment_2.eContents().get(0);
		private final RuleCall cEndpoint1NetworkInterfaceFQNParserRuleCall_2_0_1 = (RuleCall)cEndpoint1NetworkInterfaceCrossReference_2_0.eContents().get(1);
		private final Keyword cLessThanSignHyphenMinusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEndpoint2Assignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cEndpoint2NetworkInterfaceCrossReference_4_0 = (CrossReference)cEndpoint2Assignment_4.eContents().get(0);
		private final RuleCall cEndpoint2NetworkInterfaceFQNParserRuleCall_4_0_1 = (RuleCall)cEndpoint2NetworkInterfaceCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cKindKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cKindAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cKindEStringParserRuleCall_5_1_0 = (RuleCall)cKindAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//NetworkConnection:
		//	'NetworkConnection'
		//	'{'
		//	endpoint1=[NetworkInterface|FQN] '<->' endpoint2=[NetworkInterface|FQN] ('kind' kind=EString)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'NetworkConnection' '{' endpoint1=[NetworkInterface|FQN] '<->' endpoint2=[NetworkInterface|FQN] ('kind' kind=EString)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'NetworkConnection'
		public Keyword getNetworkConnectionKeyword_0() { return cNetworkConnectionKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//endpoint1=[NetworkInterface|FQN]
		public Assignment getEndpoint1Assignment_2() { return cEndpoint1Assignment_2; }
		
		//[NetworkInterface|FQN]
		public CrossReference getEndpoint1NetworkInterfaceCrossReference_2_0() { return cEndpoint1NetworkInterfaceCrossReference_2_0; }
		
		//FQN
		public RuleCall getEndpoint1NetworkInterfaceFQNParserRuleCall_2_0_1() { return cEndpoint1NetworkInterfaceFQNParserRuleCall_2_0_1; }
		
		//'<->'
		public Keyword getLessThanSignHyphenMinusGreaterThanSignKeyword_3() { return cLessThanSignHyphenMinusGreaterThanSignKeyword_3; }
		
		//endpoint2=[NetworkInterface|FQN]
		public Assignment getEndpoint2Assignment_4() { return cEndpoint2Assignment_4; }
		
		//[NetworkInterface|FQN]
		public CrossReference getEndpoint2NetworkInterfaceCrossReference_4_0() { return cEndpoint2NetworkInterfaceCrossReference_4_0; }
		
		//FQN
		public RuleCall getEndpoint2NetworkInterfaceFQNParserRuleCall_4_0_1() { return cEndpoint2NetworkInterfaceFQNParserRuleCall_4_0_1; }
		
		//('kind' kind=EString)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'kind'
		public Keyword getKindKeyword_5_0() { return cKindKeyword_5_0; }
		
		//kind=EString
		public Assignment getKindAssignment_5_1() { return cKindAssignment_5_1; }
		
		//EString
		public RuleCall getKindEStringParserRuleCall_5_1_0() { return cKindEStringParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class TargetPlatformDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.targetPlatform.TargetPlatform.TargetPlatformDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTargetPlatformDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cOsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOsOperatingSystemParserRuleCall_3_0 = (RuleCall)cOsAssignment_3.eContents().get(0);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementsAbstractTPSubNodeParserRuleCall_4_0 = (RuleCall)cElementsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//TargetPlatformDefinition:
		//	'TargetPlatformDefinition' name=ID
		//	'{'
		//	os=OperatingSystem?
		//	elements+=AbstractTPSubNode*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'TargetPlatformDefinition' name=ID '{' os=OperatingSystem? elements+=AbstractTPSubNode* '}'
		public Group getGroup() { return cGroup; }
		
		//'TargetPlatformDefinition'
		public Keyword getTargetPlatformDefinitionKeyword_0() { return cTargetPlatformDefinitionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//os=OperatingSystem?
		public Assignment getOsAssignment_3() { return cOsAssignment_3; }
		
		//OperatingSystem
		public RuleCall getOsOperatingSystemParserRuleCall_3_0() { return cOsOperatingSystemParserRuleCall_3_0; }
		
		//elements+=AbstractTPSubNode*
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }
		
		//AbstractTPSubNode
		public RuleCall getElementsAbstractTPSubNodeParserRuleCall_4_0() { return cElementsAbstractTPSubNodeParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class OperatingSystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.targetPlatform.TargetPlatform.OperatingSystem");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cWindowsParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLinuxParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMacOSParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//OperatingSystem:
		//	Windows | Linux | MacOS;
		@Override public ParserRule getRule() { return rule; }
		
		//Windows | Linux | MacOS
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Windows
		public RuleCall getWindowsParserRuleCall_0() { return cWindowsParserRuleCall_0; }
		
		//Linux
		public RuleCall getLinuxParserRuleCall_1() { return cLinuxParserRuleCall_1; }
		
		//MacOS
		public RuleCall getMacOSParserRuleCall_2() { return cMacOSParserRuleCall_2; }
	}
	public class WindowsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.targetPlatform.TargetPlatform.Windows");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cWindowsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cWindowsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cKindAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cKindSTRINGTerminalRuleCall_2_0 = (RuleCall)cKindAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Windows:
		//	{Windows}
		//	'Windows' kind=STRING? ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Windows} 'Windows' kind=STRING? ';'?
		public Group getGroup() { return cGroup; }
		
		//{Windows}
		public Action getWindowsAction_0() { return cWindowsAction_0; }
		
		//'Windows'
		public Keyword getWindowsKeyword_1() { return cWindowsKeyword_1; }
		
		//kind=STRING?
		public Assignment getKindAssignment_2() { return cKindAssignment_2; }
		
		//STRING
		public RuleCall getKindSTRINGTerminalRuleCall_2_0() { return cKindSTRINGTerminalRuleCall_2_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class LinuxElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.targetPlatform.TargetPlatform.Linux");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLinuxAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLinuxKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cKindAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cKindSTRINGTerminalRuleCall_2_0 = (RuleCall)cKindAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Linux:
		//	{Linux}
		//	'Linux' kind=STRING? ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Linux} 'Linux' kind=STRING? ';'?
		public Group getGroup() { return cGroup; }
		
		//{Linux}
		public Action getLinuxAction_0() { return cLinuxAction_0; }
		
		//'Linux'
		public Keyword getLinuxKeyword_1() { return cLinuxKeyword_1; }
		
		//kind=STRING?
		public Assignment getKindAssignment_2() { return cKindAssignment_2; }
		
		//STRING
		public RuleCall getKindSTRINGTerminalRuleCall_2_0() { return cKindSTRINGTerminalRuleCall_2_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class MacOSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.targetPlatform.TargetPlatform.MacOS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMacOSAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMacOSKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cKindAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cKindSTRINGTerminalRuleCall_2_0 = (RuleCall)cKindAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//MacOS:
		//	{MacOS}
		//	'MacOS' kind=STRING? ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//{MacOS} 'MacOS' kind=STRING? ';'?
		public Group getGroup() { return cGroup; }
		
		//{MacOS}
		public Action getMacOSAction_0() { return cMacOSAction_0; }
		
		//'MacOS'
		public Keyword getMacOSKeyword_1() { return cMacOSKeyword_1; }
		
		//kind=STRING?
		public Assignment getKindAssignment_2() { return cKindAssignment_2; }
		
		//STRING
		public RuleCall getKindSTRINGTerminalRuleCall_2_0() { return cKindSTRINGTerminalRuleCall_2_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class AbstractTPSubNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.targetPlatform.TargetPlatform.AbstractTPSubNode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNetworkInterfaceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCPUParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cLoginAccountParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cTargetMiddlewareParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//AbstractTPSubNode:
		//	NetworkInterface | CPU | LoginAccount | TargetMiddleware;
		@Override public ParserRule getRule() { return rule; }
		
		//NetworkInterface | CPU | LoginAccount | TargetMiddleware
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NetworkInterface
		public RuleCall getNetworkInterfaceParserRuleCall_0() { return cNetworkInterfaceParserRuleCall_0; }
		
		//CPU
		public RuleCall getCPUParserRuleCall_1() { return cCPUParserRuleCall_1; }
		
		//LoginAccount
		public RuleCall getLoginAccountParserRuleCall_2() { return cLoginAccountParserRuleCall_2; }
		
		//TargetMiddleware
		public RuleCall getTargetMiddlewareParserRuleCall_3() { return cTargetMiddlewareParserRuleCall_3; }
	}
	public class NetworkInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.targetPlatform.TargetPlatform.NetworkInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNetworkInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cHostAddressKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cHostAddressAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cHostAddressSTRINGTerminalRuleCall_3_0_1_0 = (RuleCall)cHostAddressAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_0_2 = (Group)cGroup_3_0.eContents().get(2);
		private final Keyword cColonKeyword_3_0_2_0 = (Keyword)cGroup_3_0_2.eContents().get(0);
		private final Assignment cPortNrAssignment_3_0_2_1 = (Assignment)cGroup_3_0_2.eContents().get(1);
		private final RuleCall cPortNrEIntParserRuleCall_3_0_2_1_0 = (RuleCall)cPortNrAssignment_3_0_2_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cKindKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cKindAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cKindEStringParserRuleCall_3_1_1_0 = (RuleCall)cKindAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//NetworkInterface:
		//	'NetworkInterface' name=ID '{' ('HostAddress' hostAddress=STRING (':' portNr=EInt)? & ('Kind' kind=EString)?)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'NetworkInterface' name=ID '{' ('HostAddress' hostAddress=STRING (':' portNr=EInt)? & ('Kind' kind=EString)?) '}'
		public Group getGroup() { return cGroup; }
		
		//'NetworkInterface'
		public Keyword getNetworkInterfaceKeyword_0() { return cNetworkInterfaceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'HostAddress' hostAddress=STRING (':' portNr=EInt)? & ('Kind' kind=EString)?
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//'HostAddress' hostAddress=STRING (':' portNr=EInt)?
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'HostAddress'
		public Keyword getHostAddressKeyword_3_0_0() { return cHostAddressKeyword_3_0_0; }
		
		//hostAddress=STRING
		public Assignment getHostAddressAssignment_3_0_1() { return cHostAddressAssignment_3_0_1; }
		
		//STRING
		public RuleCall getHostAddressSTRINGTerminalRuleCall_3_0_1_0() { return cHostAddressSTRINGTerminalRuleCall_3_0_1_0; }
		
		//(':' portNr=EInt)?
		public Group getGroup_3_0_2() { return cGroup_3_0_2; }
		
		//':'
		public Keyword getColonKeyword_3_0_2_0() { return cColonKeyword_3_0_2_0; }
		
		//portNr=EInt
		public Assignment getPortNrAssignment_3_0_2_1() { return cPortNrAssignment_3_0_2_1; }
		
		//EInt
		public RuleCall getPortNrEIntParserRuleCall_3_0_2_1_0() { return cPortNrEIntParserRuleCall_3_0_2_1_0; }
		
		//('Kind' kind=EString)?
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'Kind'
		public Keyword getKindKeyword_3_1_0() { return cKindKeyword_3_1_0; }
		
		//kind=EString
		public Assignment getKindAssignment_3_1_1() { return cKindAssignment_3_1_1; }
		
		//EString
		public RuleCall getKindEStringParserRuleCall_3_1_1_0() { return cKindEStringParserRuleCall_3_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class CPUElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.targetPlatform.TargetPlatform.CPU");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCPUKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cKindKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cKindAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cKindEStringParserRuleCall_3_0_1_0 = (RuleCall)cKindAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cCoresTallyKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cCoresTallyAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cCoresTallyEIntParserRuleCall_3_1_1_0 = (RuleCall)cCoresTallyAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//CPU:
		//	'CPU' name=ID
		//	'{' (('Kind' kind=EString)? & 'CoresTally' coresTally=EInt)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'CPU' name=ID '{' (('Kind' kind=EString)? & 'CoresTally' coresTally=EInt) '}'
		public Group getGroup() { return cGroup; }
		
		//'CPU'
		public Keyword getCPUKeyword_0() { return cCPUKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('Kind' kind=EString)? & 'CoresTally' coresTally=EInt
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//('Kind' kind=EString)?
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'Kind'
		public Keyword getKindKeyword_3_0_0() { return cKindKeyword_3_0_0; }
		
		//kind=EString
		public Assignment getKindAssignment_3_0_1() { return cKindAssignment_3_0_1; }
		
		//EString
		public RuleCall getKindEStringParserRuleCall_3_0_1_0() { return cKindEStringParserRuleCall_3_0_1_0; }
		
		//'CoresTally' coresTally=EInt
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'CoresTally'
		public Keyword getCoresTallyKeyword_3_1_0() { return cCoresTallyKeyword_3_1_0; }
		
		//coresTally=EInt
		public Assignment getCoresTallyAssignment_3_1_1() { return cCoresTallyAssignment_3_1_1; }
		
		//EInt
		public RuleCall getCoresTallyEIntParserRuleCall_3_1_1_0() { return cCoresTallyEIntParserRuleCall_3_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class LoginAccountElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.targetPlatform.TargetPlatform.LoginAccount");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLoginAccountKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cFullNameKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cFullnameAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cFullnameSTRINGTerminalRuleCall_3_0_1_0 = (RuleCall)cFullnameAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cEmailKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cEmailAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cEmailSTRINGTerminalRuleCall_3_1_1_0 = (RuleCall)cEmailAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//LoginAccount:
		//	'LoginAccount' name=ID '{' (('FullName' fullname=STRING)? & ('Email' email=STRING)?)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'LoginAccount' name=ID '{' (('FullName' fullname=STRING)? & ('Email' email=STRING)?) '}'
		public Group getGroup() { return cGroup; }
		
		//'LoginAccount'
		public Keyword getLoginAccountKeyword_0() { return cLoginAccountKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('FullName' fullname=STRING)? & ('Email' email=STRING)?
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//('FullName' fullname=STRING)?
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'FullName'
		public Keyword getFullNameKeyword_3_0_0() { return cFullNameKeyword_3_0_0; }
		
		//fullname=STRING
		public Assignment getFullnameAssignment_3_0_1() { return cFullnameAssignment_3_0_1; }
		
		//STRING
		public RuleCall getFullnameSTRINGTerminalRuleCall_3_0_1_0() { return cFullnameSTRINGTerminalRuleCall_3_0_1_0; }
		
		//('Email' email=STRING)?
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'Email'
		public Keyword getEmailKeyword_3_1_0() { return cEmailKeyword_3_1_0; }
		
		//email=STRING
		public Assignment getEmailAssignment_3_1_1() { return cEmailAssignment_3_1_1; }
		
		//STRING
		public RuleCall getEmailSTRINGTerminalRuleCall_3_1_1_0() { return cEmailSTRINGTerminalRuleCall_3_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class TargetMiddlewareElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.targetPlatform.TargetPlatform.TargetMiddleware");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTargetMiddlewareKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMiddlewareAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMiddlewareRoboticMiddlewareParserRuleCall_1_0 = (RuleCall)cMiddlewareAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//TargetMiddleware:
		//	'TargetMiddleware' middleware=RoboticMiddleware ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'TargetMiddleware' middleware=RoboticMiddleware ';'?
		public Group getGroup() { return cGroup; }
		
		//'TargetMiddleware'
		public Keyword getTargetMiddlewareKeyword_0() { return cTargetMiddlewareKeyword_0; }
		
		//middleware=RoboticMiddleware
		public Assignment getMiddlewareAssignment_1() { return cMiddlewareAssignment_1; }
		
		//RoboticMiddleware
		public RuleCall getMiddlewareRoboticMiddlewareParserRuleCall_1_0() { return cMiddlewareRoboticMiddlewareParserRuleCall_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	
	
	private final TargetPlatformModelElements pTargetPlatformModel;
	private final AbstractTPElementElements pAbstractTPElement;
	private final NetworkConnectionElements pNetworkConnection;
	private final TargetPlatformDefinitionElements pTargetPlatformDefinition;
	private final OperatingSystemElements pOperatingSystem;
	private final WindowsElements pWindows;
	private final LinuxElements pLinux;
	private final MacOSElements pMacOS;
	private final AbstractTPSubNodeElements pAbstractTPSubNode;
	private final NetworkInterfaceElements pNetworkInterface;
	private final CPUElements pCPU;
	private final LoginAccountElements pLoginAccount;
	private final TargetMiddlewareElements pTargetMiddleware;
	
	private final Grammar grammar;
	
	private final RoboticMiddlewareGrammarAccess gaRoboticMiddleware;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TargetPlatformGrammarAccess(GrammarProvider grammarProvider,
			RoboticMiddlewareGrammarAccess gaRoboticMiddleware,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaRoboticMiddleware = gaRoboticMiddleware;
		this.gaTerminals = gaTerminals;
		this.pTargetPlatformModel = new TargetPlatformModelElements();
		this.pAbstractTPElement = new AbstractTPElementElements();
		this.pNetworkConnection = new NetworkConnectionElements();
		this.pTargetPlatformDefinition = new TargetPlatformDefinitionElements();
		this.pOperatingSystem = new OperatingSystemElements();
		this.pWindows = new WindowsElements();
		this.pLinux = new LinuxElements();
		this.pMacOS = new MacOSElements();
		this.pAbstractTPSubNode = new AbstractTPSubNodeElements();
		this.pNetworkInterface = new NetworkInterfaceElements();
		this.pCPU = new CPUElements();
		this.pLoginAccount = new LoginAccountElements();
		this.pTargetMiddleware = new TargetMiddlewareElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.system.targetPlatform.TargetPlatform".equals(grammar.getName())) {
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
	
	
	public RoboticMiddlewareGrammarAccess getRoboticMiddlewareGrammarAccess() {
		return gaRoboticMiddleware;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//TargetPlatformModel:
	//	'TargetPlatformModel' name=ID
	//	'{'
	//	elements+=AbstractTPElement*
	//	'}';
	public TargetPlatformModelElements getTargetPlatformModelAccess() {
		return pTargetPlatformModel;
	}
	
	public ParserRule getTargetPlatformModelRule() {
		return getTargetPlatformModelAccess().getRule();
	}
	
	//AbstractTPElement:
	//	TargetPlatformDefinition | NetworkConnection;
	public AbstractTPElementElements getAbstractTPElementAccess() {
		return pAbstractTPElement;
	}
	
	public ParserRule getAbstractTPElementRule() {
		return getAbstractTPElementAccess().getRule();
	}
	
	//NetworkConnection:
	//	'NetworkConnection'
	//	'{'
	//	endpoint1=[NetworkInterface|FQN] '<->' endpoint2=[NetworkInterface|FQN] ('kind' kind=EString)?
	//	'}';
	public NetworkConnectionElements getNetworkConnectionAccess() {
		return pNetworkConnection;
	}
	
	public ParserRule getNetworkConnectionRule() {
		return getNetworkConnectionAccess().getRule();
	}
	
	//TargetPlatformDefinition:
	//	'TargetPlatformDefinition' name=ID
	//	'{'
	//	os=OperatingSystem?
	//	elements+=AbstractTPSubNode*
	//	'}';
	public TargetPlatformDefinitionElements getTargetPlatformDefinitionAccess() {
		return pTargetPlatformDefinition;
	}
	
	public ParserRule getTargetPlatformDefinitionRule() {
		return getTargetPlatformDefinitionAccess().getRule();
	}
	
	//OperatingSystem:
	//	Windows | Linux | MacOS;
	public OperatingSystemElements getOperatingSystemAccess() {
		return pOperatingSystem;
	}
	
	public ParserRule getOperatingSystemRule() {
		return getOperatingSystemAccess().getRule();
	}
	
	//Windows:
	//	{Windows}
	//	'Windows' kind=STRING? ';'?;
	public WindowsElements getWindowsAccess() {
		return pWindows;
	}
	
	public ParserRule getWindowsRule() {
		return getWindowsAccess().getRule();
	}
	
	//Linux:
	//	{Linux}
	//	'Linux' kind=STRING? ';'?;
	public LinuxElements getLinuxAccess() {
		return pLinux;
	}
	
	public ParserRule getLinuxRule() {
		return getLinuxAccess().getRule();
	}
	
	//MacOS:
	//	{MacOS}
	//	'MacOS' kind=STRING? ';'?;
	public MacOSElements getMacOSAccess() {
		return pMacOS;
	}
	
	public ParserRule getMacOSRule() {
		return getMacOSAccess().getRule();
	}
	
	//AbstractTPSubNode:
	//	NetworkInterface | CPU | LoginAccount | TargetMiddleware;
	public AbstractTPSubNodeElements getAbstractTPSubNodeAccess() {
		return pAbstractTPSubNode;
	}
	
	public ParserRule getAbstractTPSubNodeRule() {
		return getAbstractTPSubNodeAccess().getRule();
	}
	
	//NetworkInterface:
	//	'NetworkInterface' name=ID '{' ('HostAddress' hostAddress=STRING (':' portNr=EInt)? & ('Kind' kind=EString)?)
	//	'}';
	public NetworkInterfaceElements getNetworkInterfaceAccess() {
		return pNetworkInterface;
	}
	
	public ParserRule getNetworkInterfaceRule() {
		return getNetworkInterfaceAccess().getRule();
	}
	
	//CPU:
	//	'CPU' name=ID
	//	'{' (('Kind' kind=EString)? & 'CoresTally' coresTally=EInt)
	//	'}';
	public CPUElements getCPUAccess() {
		return pCPU;
	}
	
	public ParserRule getCPURule() {
		return getCPUAccess().getRule();
	}
	
	//LoginAccount:
	//	'LoginAccount' name=ID '{' (('FullName' fullname=STRING)? & ('Email' email=STRING)?)
	//	'}';
	public LoginAccountElements getLoginAccountAccess() {
		return pLoginAccount;
	}
	
	public ParserRule getLoginAccountRule() {
		return getLoginAccountAccess().getRule();
	}
	
	//TargetMiddleware:
	//	'TargetMiddleware' middleware=RoboticMiddleware ';'?;
	public TargetMiddlewareElements getTargetMiddlewareAccess() {
		return pTargetMiddleware;
	}
	
	public ParserRule getTargetMiddlewareRule() {
		return getTargetMiddlewareAccess().getRule();
	}
	
	//RoboticMiddleware:
	//	ACE_SmartSoft | OpcUa_SeRoNet | CORBA_SmartSoft | DDS_SmartSoft;
	public RoboticMiddlewareGrammarAccess.RoboticMiddlewareElements getRoboticMiddlewareAccess() {
		return gaRoboticMiddleware.getRoboticMiddlewareAccess();
	}
	
	public ParserRule getRoboticMiddlewareRule() {
		return getRoboticMiddlewareAccess().getRule();
	}
	
	//FQN:
	//	ID ('.' ID)*;
	public RoboticMiddlewareGrammarAccess.FQNElements getFQNAccess() {
		return gaRoboticMiddleware.getFQNAccess();
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//FQNW:
	//	FQN '.*'?;
	public RoboticMiddlewareGrammarAccess.FQNWElements getFQNWAccess() {
		return gaRoboticMiddleware.getFQNWAccess();
	}
	
	public ParserRule getFQNWRule() {
		return getFQNWAccess().getRule();
	}
	
	//EString:
	//	STRING;
	public RoboticMiddlewareGrammarAccess.EStringElements getEStringAccess() {
		return gaRoboticMiddleware.getEStringAccess();
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public RoboticMiddlewareGrammarAccess.EIntElements getEIntAccess() {
		return gaRoboticMiddleware.getEIntAccess();
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EDouble ecore::EDouble:
	//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
	public RoboticMiddlewareGrammarAccess.EDoubleElements getEDoubleAccess() {
		return gaRoboticMiddleware.getEDoubleAccess();
	}
	
	public ParserRule getEDoubleRule() {
		return getEDoubleAccess().getRule();
	}
	
	//EBoolean ecore::EBoolean:
	//	'true' | 'false';
	public RoboticMiddlewareGrammarAccess.EBooleanElements getEBooleanAccess() {
		return gaRoboticMiddleware.getEBooleanAccess();
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//ACE_SmartSoft:
	//	{ACE_SmartSoft}
	//	'ACE_SmartSoft' ('description' description=EString)?;
	public RoboticMiddlewareGrammarAccess.ACE_SmartSoftElements getACE_SmartSoftAccess() {
		return gaRoboticMiddleware.getACE_SmartSoftAccess();
	}
	
	public ParserRule getACE_SmartSoftRule() {
		return getACE_SmartSoftAccess().getRule();
	}
	
	//OpcUa_SeRoNet:
	//	{OpcUa_SeRoNet}
	//	'OpcUa_SeRoNet' ('description' description=EString)?;
	public RoboticMiddlewareGrammarAccess.OpcUa_SeRoNetElements getOpcUa_SeRoNetAccess() {
		return gaRoboticMiddleware.getOpcUa_SeRoNetAccess();
	}
	
	public ParserRule getOpcUa_SeRoNetRule() {
		return getOpcUa_SeRoNetAccess().getRule();
	}
	
	//CORBA_SmartSoft:
	//	{CORBA_SmartSoft}
	//	'CORBA_SmartSoft' ('description' description=EString)?;
	public RoboticMiddlewareGrammarAccess.CORBA_SmartSoftElements getCORBA_SmartSoftAccess() {
		return gaRoboticMiddleware.getCORBA_SmartSoftAccess();
	}
	
	public ParserRule getCORBA_SmartSoftRule() {
		return getCORBA_SmartSoftAccess().getRule();
	}
	
	//DDS_SmartSoft:
	//	{DDS_SmartSoft}
	//	'DDS_SmartSoft' ('description' description=EString)?;
	public RoboticMiddlewareGrammarAccess.DDS_SmartSoftElements getDDS_SmartSoftAccess() {
		return gaRoboticMiddleware.getDDS_SmartSoftAccess();
	}
	
	public ParserRule getDDS_SmartSoftRule() {
		return getDDS_SmartSoftAccess().getRule();
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
