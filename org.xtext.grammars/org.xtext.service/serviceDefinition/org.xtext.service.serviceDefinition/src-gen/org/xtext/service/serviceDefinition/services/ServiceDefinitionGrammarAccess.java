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
package org.xtext.service.serviceDefinition.services;

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
public class ServiceDefinitionGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ServiceDefModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.ServiceDefModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cServiceDefModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cImportsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportsCommRepoImportParserRuleCall_1_0 = (RuleCall)cImportsAssignment_1.eContents().get(0);
		private final Assignment cRepositoryAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRepositoryServiceDefRepositoryParserRuleCall_2_0 = (RuleCall)cRepositoryAssignment_2.eContents().get(0);
		
		//ServiceDefModel service::ServiceDefModel:
		//	{service::ServiceDefModel} imports+=CommRepoImport*
		//	repository=ServiceDefRepository?;
		@Override public ParserRule getRule() { return rule; }
		
		//{service::ServiceDefModel} imports+=CommRepoImport* repository=ServiceDefRepository?
		public Group getGroup() { return cGroup; }
		
		//{service::ServiceDefModel}
		public Action getServiceDefModelAction_0() { return cServiceDefModelAction_0; }
		
		//imports+=CommRepoImport*
		public Assignment getImportsAssignment_1() { return cImportsAssignment_1; }
		
		//CommRepoImport
		public RuleCall getImportsCommRepoImportParserRuleCall_1_0() { return cImportsCommRepoImportParserRuleCall_1_0; }
		
		//repository=ServiceDefRepository?
		public Assignment getRepositoryAssignment_2() { return cRepositoryAssignment_2; }
		
		//ServiceDefRepository
		public RuleCall getRepositoryServiceDefRepositoryParserRuleCall_2_0() { return cRepositoryServiceDefRepositoryParserRuleCall_2_0; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//// parser rules for names
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
	public class FQNWElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.FQNW");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFQNParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//FQNW:
		//	FQN '.*'?;
		@Override public ParserRule getRule() { return rule; }
		
		//FQN '.*'?
		public Group getGroup() { return cGroup; }
		
		//FQN
		public RuleCall getFQNParserRuleCall_0() { return cFQNParserRuleCall_0; }
		
		//'.*'?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.EInt");
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
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.EString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EString:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class ServiceDefRepositoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.ServiceDefRepository");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cServiceDefRepositoryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cVersionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVersionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVersionServiceRepoVersionParserRuleCall_2_1_0 = (RuleCall)cVersionAssignment_2_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cServicesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cServicesAbstractServiceDefinitionParserRuleCall_4_0 = (RuleCall)cServicesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ServiceDefRepository service::ServiceDefRepository:
		//	'ServiceDefRepository' name=ID ('version' version=ServiceRepoVersion)?
		//	'{'
		//	services+=AbstractServiceDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ServiceDefRepository' name=ID ('version' version=ServiceRepoVersion)? '{' services+=AbstractServiceDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//'ServiceDefRepository'
		public Keyword getServiceDefRepositoryKeyword_0() { return cServiceDefRepositoryKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('version' version=ServiceRepoVersion)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'version'
		public Keyword getVersionKeyword_2_0() { return cVersionKeyword_2_0; }
		
		//version=ServiceRepoVersion
		public Assignment getVersionAssignment_2_1() { return cVersionAssignment_2_1; }
		
		//ServiceRepoVersion
		public RuleCall getVersionServiceRepoVersionParserRuleCall_2_1_0() { return cVersionServiceRepoVersionParserRuleCall_2_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//services+=AbstractServiceDefinition*
		public Assignment getServicesAssignment_4() { return cServicesAssignment_4; }
		
		//AbstractServiceDefinition
		public RuleCall getServicesAbstractServiceDefinitionParserRuleCall_4_0() { return cServicesAbstractServiceDefinitionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ServiceRepoVersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.ServiceRepoVersion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cMajorAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cMajorEIntParserRuleCall_0_0 = (RuleCall)cMajorAssignment_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMinorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMinorEIntParserRuleCall_2_0 = (RuleCall)cMinorAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cFullStopKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPatchAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cPatchEIntParserRuleCall_3_1_0 = (RuleCall)cPatchAssignment_3_1.eContents().get(0);
		
		//ServiceRepoVersion service::ServiceRepoVersion:
		//	major=EInt '.' minor=EInt ('.' patch=EInt)?;
		@Override public ParserRule getRule() { return rule; }
		
		//major=EInt '.' minor=EInt ('.' patch=EInt)?
		public Group getGroup() { return cGroup; }
		
		//major=EInt
		public Assignment getMajorAssignment_0() { return cMajorAssignment_0; }
		
		//EInt
		public RuleCall getMajorEIntParserRuleCall_0_0() { return cMajorEIntParserRuleCall_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//minor=EInt
		public Assignment getMinorAssignment_2() { return cMinorAssignment_2; }
		
		//EInt
		public RuleCall getMinorEIntParserRuleCall_2_0() { return cMinorEIntParserRuleCall_2_0; }
		
		//('.' patch=EInt)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'.'
		public Keyword getFullStopKeyword_3_0() { return cFullStopKeyword_3_0; }
		
		//patch=EInt
		public Assignment getPatchAssignment_3_1() { return cPatchAssignment_3_1; }
		
		//EInt
		public RuleCall getPatchEIntParserRuleCall_3_1_0() { return cPatchEIntParserRuleCall_3_1_0; }
	}
	public class CommRepoImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.CommRepoImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceFQNWParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//CommRepoImport service::CommRepoImport:
		//	'#import' importedNamespace=FQNW ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'#import' importedNamespace=FQNW ';'?
		public Group getGroup() { return cGroup; }
		
		//'#import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=FQNW
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//FQNW
		public RuleCall getImportedNamespaceFQNWParserRuleCall_1_0() { return cImportedNamespaceFQNWParserRuleCall_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class AbstractServiceDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.AbstractServiceDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCommunicationServiceDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCoordinationServiceDefinitionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractServiceDefinition service::AbstractServiceDefinition:
		//	CommunicationServiceDefinition | CoordinationServiceDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//CommunicationServiceDefinition | CoordinationServiceDefinition
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CommunicationServiceDefinition
		public RuleCall getCommunicationServiceDefinitionParserRuleCall_0() { return cCommunicationServiceDefinitionParserRuleCall_0; }
		
		//CoordinationServiceDefinition
		public RuleCall getCoordinationServiceDefinitionParserRuleCall_1() { return cCoordinationServiceDefinitionParserRuleCall_1; }
	}
	public class CommunicationServiceDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.CommunicationServiceDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cForkingServiceDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cJoyningServiceDefinitionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRequestAnswerServiceDefinitionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//CommunicationServiceDefinition service::CommunicationServiceDefinition:
		//	ForkingServiceDefinition | JoyningServiceDefinition | RequestAnswerServiceDefinition;
		@Override public ParserRule getRule() { return rule; }
		
		//ForkingServiceDefinition | JoyningServiceDefinition | RequestAnswerServiceDefinition
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ForkingServiceDefinition
		public RuleCall getForkingServiceDefinitionParserRuleCall_0() { return cForkingServiceDefinitionParserRuleCall_0; }
		
		//JoyningServiceDefinition
		public RuleCall getJoyningServiceDefinitionParserRuleCall_1() { return cJoyningServiceDefinitionParserRuleCall_1; }
		
		//RequestAnswerServiceDefinition
		public RuleCall getRequestAnswerServiceDefinitionParserRuleCall_2() { return cRequestAnswerServiceDefinitionParserRuleCall_2; }
	}
	public class ForkingServiceDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.ForkingServiceDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cForkingServiceDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPatternAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPatternForkingPatternInstanceParserRuleCall_3_0 = (RuleCall)cPatternAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPurposeDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPurposeDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPurposeDescriptionEStringParserRuleCall_4_1_0 = (RuleCall)cPurposeDescriptionAssignment_4_1.eContents().get(0);
		private final Assignment cPropertiesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPropertiesServicePropertyParserRuleCall_5_0 = (RuleCall)cPropertiesAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ForkingServiceDefinition service::ForkingServiceDefinition:
		//	'ForkingServiceDefinition' name=ID
		//	'{'
		//	pattern=ForkingPatternInstance ('purposeDescription' purposeDescription=EString)?
		//	properties+=ServiceProperty*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ForkingServiceDefinition' name=ID '{' pattern=ForkingPatternInstance ('purposeDescription' purposeDescription=EString)?
		//properties+=ServiceProperty* '}'
		public Group getGroup() { return cGroup; }
		
		//'ForkingServiceDefinition'
		public Keyword getForkingServiceDefinitionKeyword_0() { return cForkingServiceDefinitionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//pattern=ForkingPatternInstance
		public Assignment getPatternAssignment_3() { return cPatternAssignment_3; }
		
		//ForkingPatternInstance
		public RuleCall getPatternForkingPatternInstanceParserRuleCall_3_0() { return cPatternForkingPatternInstanceParserRuleCall_3_0; }
		
		//('purposeDescription' purposeDescription=EString)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'purposeDescription'
		public Keyword getPurposeDescriptionKeyword_4_0() { return cPurposeDescriptionKeyword_4_0; }
		
		//purposeDescription=EString
		public Assignment getPurposeDescriptionAssignment_4_1() { return cPurposeDescriptionAssignment_4_1; }
		
		//EString
		public RuleCall getPurposeDescriptionEStringParserRuleCall_4_1_0() { return cPurposeDescriptionEStringParserRuleCall_4_1_0; }
		
		//properties+=ServiceProperty*
		public Assignment getPropertiesAssignment_5() { return cPropertiesAssignment_5; }
		
		//ServiceProperty
		public RuleCall getPropertiesServicePropertyParserRuleCall_5_0() { return cPropertiesServicePropertyParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class JoyningServiceDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.JoyningServiceDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cJoiningServiceDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPatternAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPatternJoiningPatternInstanceParserRuleCall_3_0 = (RuleCall)cPatternAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPurposeDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPurposeDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPurposeDescriptionEStringParserRuleCall_4_1_0 = (RuleCall)cPurposeDescriptionAssignment_4_1.eContents().get(0);
		private final Assignment cPropertiesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPropertiesServicePropertyParserRuleCall_5_0 = (RuleCall)cPropertiesAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//JoyningServiceDefinition service::JoiningServiceDefinition:
		//	'JoiningServiceDefinition' name=ID
		//	'{'
		//	pattern=JoiningPatternInstance ('purposeDescription' purposeDescription=EString)?
		//	properties+=ServiceProperty*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'JoiningServiceDefinition' name=ID '{' pattern=JoiningPatternInstance ('purposeDescription' purposeDescription=EString)?
		//properties+=ServiceProperty* '}'
		public Group getGroup() { return cGroup; }
		
		//'JoiningServiceDefinition'
		public Keyword getJoiningServiceDefinitionKeyword_0() { return cJoiningServiceDefinitionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//pattern=JoiningPatternInstance
		public Assignment getPatternAssignment_3() { return cPatternAssignment_3; }
		
		//JoiningPatternInstance
		public RuleCall getPatternJoiningPatternInstanceParserRuleCall_3_0() { return cPatternJoiningPatternInstanceParserRuleCall_3_0; }
		
		//('purposeDescription' purposeDescription=EString)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'purposeDescription'
		public Keyword getPurposeDescriptionKeyword_4_0() { return cPurposeDescriptionKeyword_4_0; }
		
		//purposeDescription=EString
		public Assignment getPurposeDescriptionAssignment_4_1() { return cPurposeDescriptionAssignment_4_1; }
		
		//EString
		public RuleCall getPurposeDescriptionEStringParserRuleCall_4_1_0() { return cPurposeDescriptionEStringParserRuleCall_4_1_0; }
		
		//properties+=ServiceProperty*
		public Assignment getPropertiesAssignment_5() { return cPropertiesAssignment_5; }
		
		//ServiceProperty
		public RuleCall getPropertiesServicePropertyParserRuleCall_5_0() { return cPropertiesServicePropertyParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class RequestAnswerServiceDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.RequestAnswerServiceDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequestAnswerServiceDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPatternAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPatternRequestAnswerPatternParserRuleCall_3_0 = (RuleCall)cPatternAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPurposeDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPurposeDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPurposeDescriptionEStringParserRuleCall_4_1_0 = (RuleCall)cPurposeDescriptionAssignment_4_1.eContents().get(0);
		private final Assignment cPropertiesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPropertiesServicePropertyParserRuleCall_5_0 = (RuleCall)cPropertiesAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//RequestAnswerServiceDefinition service::RequestAnswerServiceDefinition:
		//	'RequestAnswerServiceDefinition' name=ID
		//	'{'
		//	pattern=RequestAnswerPattern ('purposeDescription' purposeDescription=EString)?
		//	properties+=ServiceProperty*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'RequestAnswerServiceDefinition' name=ID '{' pattern=RequestAnswerPattern ('purposeDescription'
		//purposeDescription=EString)? properties+=ServiceProperty* '}'
		public Group getGroup() { return cGroup; }
		
		//'RequestAnswerServiceDefinition'
		public Keyword getRequestAnswerServiceDefinitionKeyword_0() { return cRequestAnswerServiceDefinitionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//pattern=RequestAnswerPattern
		public Assignment getPatternAssignment_3() { return cPatternAssignment_3; }
		
		//RequestAnswerPattern
		public RuleCall getPatternRequestAnswerPatternParserRuleCall_3_0() { return cPatternRequestAnswerPatternParserRuleCall_3_0; }
		
		//('purposeDescription' purposeDescription=EString)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'purposeDescription'
		public Keyword getPurposeDescriptionKeyword_4_0() { return cPurposeDescriptionKeyword_4_0; }
		
		//purposeDescription=EString
		public Assignment getPurposeDescriptionAssignment_4_1() { return cPurposeDescriptionAssignment_4_1; }
		
		//EString
		public RuleCall getPurposeDescriptionEStringParserRuleCall_4_1_0() { return cPurposeDescriptionEStringParserRuleCall_4_1_0; }
		
		//properties+=ServiceProperty*
		public Assignment getPropertiesAssignment_5() { return cPropertiesAssignment_5; }
		
		//ServiceProperty
		public RuleCall getPropertiesServicePropertyParserRuleCall_5_0() { return cPropertiesServicePropertyParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class CoordinationServiceDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.CoordinationServiceDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCoordinationServiceDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cPurposeDescriptionKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cPurposeDescriptionAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cPurposeDescriptionEStringParserRuleCall_3_0_1_0 = (RuleCall)cPurposeDescriptionAssignment_3_0_1.eContents().get(0);
		private final Assignment cStatePatternAssignment_3_1 = (Assignment)cUnorderedGroup_3.eContents().get(1);
		private final RuleCall cStatePatternStatePatternParserRuleCall_3_1_0 = (RuleCall)cStatePatternAssignment_3_1.eContents().get(0);
		private final Assignment cParameterPatternAssignment_3_2 = (Assignment)cUnorderedGroup_3.eContents().get(2);
		private final RuleCall cParameterPatternParameterPatternParserRuleCall_3_2_0 = (RuleCall)cParameterPatternAssignment_3_2.eContents().get(0);
		private final Assignment cMonitoringPatternAssignment_3_3 = (Assignment)cUnorderedGroup_3.eContents().get(3);
		private final RuleCall cMonitoringPatternMonitoringPatternParserRuleCall_3_3_0 = (RuleCall)cMonitoringPatternAssignment_3_3.eContents().get(0);
		private final Assignment cWiringPatternAssignment_3_4 = (Assignment)cUnorderedGroup_3.eContents().get(4);
		private final RuleCall cWiringPatternDynamicWiringPatternParserRuleCall_3_4_0 = (RuleCall)cWiringPatternAssignment_3_4.eContents().get(0);
		private final Assignment cServicesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cServicesCommunicationServiceUsageParserRuleCall_4_0 = (RuleCall)cServicesAssignment_4.eContents().get(0);
		private final Assignment cPropertiesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPropertiesServicePropertyParserRuleCall_5_0 = (RuleCall)cPropertiesAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//CoordinationServiceDefinition service::CoordinationServiceDefinition:
		//	'CoordinationServiceDefinition' name=ID
		//	'{' (('purposeDescription' purposeDescription=EString)? & statePattern=StatePattern? &
		//	parameterPattern=ParameterPattern? & monitoringPattern=MonitoringPattern? & wiringPattern=DynamicWiringPattern?)
		//	services+=CommunicationServiceUsage*
		//	properties+=ServiceProperty*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'CoordinationServiceDefinition' name=ID '{' (('purposeDescription' purposeDescription=EString)? &
		//statePattern=StatePattern? & parameterPattern=ParameterPattern? & monitoringPattern=MonitoringPattern? &
		//wiringPattern=DynamicWiringPattern?) services+=CommunicationServiceUsage* properties+=ServiceProperty* '}'
		public Group getGroup() { return cGroup; }
		
		//'CoordinationServiceDefinition'
		public Keyword getCoordinationServiceDefinitionKeyword_0() { return cCoordinationServiceDefinitionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('purposeDescription' purposeDescription=EString)? & statePattern=StatePattern? & parameterPattern=ParameterPattern? &
		//monitoringPattern=MonitoringPattern? & wiringPattern=DynamicWiringPattern?
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//('purposeDescription' purposeDescription=EString)?
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'purposeDescription'
		public Keyword getPurposeDescriptionKeyword_3_0_0() { return cPurposeDescriptionKeyword_3_0_0; }
		
		//purposeDescription=EString
		public Assignment getPurposeDescriptionAssignment_3_0_1() { return cPurposeDescriptionAssignment_3_0_1; }
		
		//EString
		public RuleCall getPurposeDescriptionEStringParserRuleCall_3_0_1_0() { return cPurposeDescriptionEStringParserRuleCall_3_0_1_0; }
		
		//statePattern=StatePattern?
		public Assignment getStatePatternAssignment_3_1() { return cStatePatternAssignment_3_1; }
		
		//StatePattern
		public RuleCall getStatePatternStatePatternParserRuleCall_3_1_0() { return cStatePatternStatePatternParserRuleCall_3_1_0; }
		
		//parameterPattern=ParameterPattern?
		public Assignment getParameterPatternAssignment_3_2() { return cParameterPatternAssignment_3_2; }
		
		//ParameterPattern
		public RuleCall getParameterPatternParameterPatternParserRuleCall_3_2_0() { return cParameterPatternParameterPatternParserRuleCall_3_2_0; }
		
		//monitoringPattern=MonitoringPattern?
		public Assignment getMonitoringPatternAssignment_3_3() { return cMonitoringPatternAssignment_3_3; }
		
		//MonitoringPattern
		public RuleCall getMonitoringPatternMonitoringPatternParserRuleCall_3_3_0() { return cMonitoringPatternMonitoringPatternParserRuleCall_3_3_0; }
		
		//wiringPattern=DynamicWiringPattern?
		public Assignment getWiringPatternAssignment_3_4() { return cWiringPatternAssignment_3_4; }
		
		//DynamicWiringPattern
		public RuleCall getWiringPatternDynamicWiringPatternParserRuleCall_3_4_0() { return cWiringPatternDynamicWiringPatternParserRuleCall_3_4_0; }
		
		//services+=CommunicationServiceUsage*
		public Assignment getServicesAssignment_4() { return cServicesAssignment_4; }
		
		//CommunicationServiceUsage
		public RuleCall getServicesCommunicationServiceUsageParserRuleCall_4_0() { return cServicesCommunicationServiceUsageParserRuleCall_4_0; }
		
		//properties+=ServiceProperty*
		public Assignment getPropertiesAssignment_5() { return cPropertiesAssignment_5; }
		
		//ServiceProperty
		public RuleCall getPropertiesServicePropertyParserRuleCall_5_0() { return cPropertiesServicePropertyParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class CommunicationServiceUsageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.CommunicationServiceUsage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommunicationServiceUsageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cUsesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cUsesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cUsesCommunicationServiceDefinitionCrossReference_3_0 = (CrossReference)cUsesAssignment_3.eContents().get(0);
		private final RuleCall cUsesCommunicationServiceDefinitionFQNParserRuleCall_3_0_1 = (RuleCall)cUsesCommunicationServiceDefinitionCrossReference_3_0.eContents().get(1);
		
		//CommunicationServiceUsage service::CommunicationServiceUsage:
		//	'CommunicationServiceUsage' name=ID 'uses' uses=[service::CommunicationServiceDefinition|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//'CommunicationServiceUsage' name=ID 'uses' uses=[service::CommunicationServiceDefinition|FQN]
		public Group getGroup() { return cGroup; }
		
		//'CommunicationServiceUsage'
		public Keyword getCommunicationServiceUsageKeyword_0() { return cCommunicationServiceUsageKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'uses'
		public Keyword getUsesKeyword_2() { return cUsesKeyword_2; }
		
		//uses=[service::CommunicationServiceDefinition|FQN]
		public Assignment getUsesAssignment_3() { return cUsesAssignment_3; }
		
		//[service::CommunicationServiceDefinition|FQN]
		public CrossReference getUsesCommunicationServiceDefinitionCrossReference_3_0() { return cUsesCommunicationServiceDefinitionCrossReference_3_0; }
		
		//FQN
		public RuleCall getUsesCommunicationServiceDefinitionFQNParserRuleCall_3_0_1() { return cUsesCommunicationServiceDefinitionFQNParserRuleCall_3_0_1; }
	}
	public class StatePatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.StatePattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStatePatternAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStatePatternKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLessThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLifecycleKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLifecycleAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cLifecycleStateMachineCrossReference_4_0 = (CrossReference)cLifecycleAssignment_4.eContents().get(0);
		private final RuleCall cLifecycleStateMachineFQNParserRuleCall_4_0_1 = (RuleCall)cLifecycleStateMachineCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cWithKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cModesAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cModesComponentModeCollectionCrossReference_5_1_0 = (CrossReference)cModesAssignment_5_1.eContents().get(0);
		private final RuleCall cModesComponentModeCollectionFQNParserRuleCall_5_1_0_1 = (RuleCall)cModesComponentModeCollectionCrossReference_5_1_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//StatePattern coordPattern::StatePattern:
		//	{coordPattern::StatePattern}
		//	'StatePattern' '<'
		//	'lifecycle' lifecycle=[stateMachine::StateMachine|FQN] ('with' modes=[modes::ComponentModeCollection|FQN])?
		//	'>';
		@Override public ParserRule getRule() { return rule; }
		
		//{coordPattern::StatePattern} 'StatePattern' '<' 'lifecycle' lifecycle=[stateMachine::StateMachine|FQN] ('with'
		//modes=[modes::ComponentModeCollection|FQN])? '>'
		public Group getGroup() { return cGroup; }
		
		//{coordPattern::StatePattern}
		public Action getStatePatternAction_0() { return cStatePatternAction_0; }
		
		//'StatePattern'
		public Keyword getStatePatternKeyword_1() { return cStatePatternKeyword_1; }
		
		//'<'
		public Keyword getLessThanSignKeyword_2() { return cLessThanSignKeyword_2; }
		
		//'lifecycle'
		public Keyword getLifecycleKeyword_3() { return cLifecycleKeyword_3; }
		
		//lifecycle=[stateMachine::StateMachine|FQN]
		public Assignment getLifecycleAssignment_4() { return cLifecycleAssignment_4; }
		
		//[stateMachine::StateMachine|FQN]
		public CrossReference getLifecycleStateMachineCrossReference_4_0() { return cLifecycleStateMachineCrossReference_4_0; }
		
		//FQN
		public RuleCall getLifecycleStateMachineFQNParserRuleCall_4_0_1() { return cLifecycleStateMachineFQNParserRuleCall_4_0_1; }
		
		//('with' modes=[modes::ComponentModeCollection|FQN])?
		public Group getGroup_5() { return cGroup_5; }
		
		//'with'
		public Keyword getWithKeyword_5_0() { return cWithKeyword_5_0; }
		
		//modes=[modes::ComponentModeCollection|FQN]
		public Assignment getModesAssignment_5_1() { return cModesAssignment_5_1; }
		
		//[modes::ComponentModeCollection|FQN]
		public CrossReference getModesComponentModeCollectionCrossReference_5_1_0() { return cModesComponentModeCollectionCrossReference_5_1_0; }
		
		//FQN
		public RuleCall getModesComponentModeCollectionFQNParserRuleCall_5_1_0_1() { return cModesComponentModeCollectionFQNParserRuleCall_5_1_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_6() { return cGreaterThanSignKeyword_6; }
	}
	public class ParameterPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.ParameterPattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cParameterPatternAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cParameterPatternKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLessThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParameterSetAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cParameterSetParameterSetDefinitionCrossReference_3_0 = (CrossReference)cParameterSetAssignment_3.eContents().get(0);
		private final RuleCall cParameterSetParameterSetDefinitionFQNParserRuleCall_3_0_1 = (RuleCall)cParameterSetParameterSetDefinitionCrossReference_3_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ParameterPattern coordPattern::ParameterPattern:
		//	{coordPattern::ParameterPattern}
		//	'ParameterPattern' '<' parameterSet=[param::ParameterSetDefinition|FQN] '>';
		@Override public ParserRule getRule() { return rule; }
		
		//{coordPattern::ParameterPattern} 'ParameterPattern' '<' parameterSet=[param::ParameterSetDefinition|FQN] '>'
		public Group getGroup() { return cGroup; }
		
		//{coordPattern::ParameterPattern}
		public Action getParameterPatternAction_0() { return cParameterPatternAction_0; }
		
		//'ParameterPattern'
		public Keyword getParameterPatternKeyword_1() { return cParameterPatternKeyword_1; }
		
		//'<'
		public Keyword getLessThanSignKeyword_2() { return cLessThanSignKeyword_2; }
		
		//parameterSet=[param::ParameterSetDefinition|FQN]
		public Assignment getParameterSetAssignment_3() { return cParameterSetAssignment_3; }
		
		//[param::ParameterSetDefinition|FQN]
		public CrossReference getParameterSetParameterSetDefinitionCrossReference_3_0() { return cParameterSetParameterSetDefinitionCrossReference_3_0; }
		
		//FQN
		public RuleCall getParameterSetParameterSetDefinitionFQNParserRuleCall_3_0_1() { return cParameterSetParameterSetDefinitionFQNParserRuleCall_3_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_4() { return cGreaterThanSignKeyword_4; }
	}
	public class DynamicWiringPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.DynamicWiringPattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDynamicWiringPatternAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDynamicWiringPatternKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//DynamicWiringPattern coordPattern::DynamicWiringPattern:
		//	{coordPattern::DynamicWiringPattern}
		//	'DynamicWiringPattern';
		@Override public ParserRule getRule() { return rule; }
		
		//{coordPattern::DynamicWiringPattern} 'DynamicWiringPattern'
		public Group getGroup() { return cGroup; }
		
		//{coordPattern::DynamicWiringPattern}
		public Action getDynamicWiringPatternAction_0() { return cDynamicWiringPatternAction_0; }
		
		//'DynamicWiringPattern'
		public Keyword getDynamicWiringPatternKeyword_1() { return cDynamicWiringPatternKeyword_1; }
	}
	public class MonitoringPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.MonitoringPattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMonitoringPatternAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMonitoringPatternKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//MonitoringPattern coordPattern::MonitoringPattern:
		//	{coordPattern::MonitoringPattern}
		//	'MonitoringPattern'
		//	//TODO: this rule needs to be extended in future
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{coordPattern::MonitoringPattern} 'MonitoringPattern'
		public Group getGroup() { return cGroup; }
		
		//{coordPattern::MonitoringPattern}
		public Action getMonitoringPatternAction_0() { return cMonitoringPatternAction_0; }
		
		//'MonitoringPattern'
		public Keyword getMonitoringPatternKeyword_1() { return cMonitoringPatternKeyword_1; }
	}
	public class ForkingPatternInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.ForkingPatternInstance");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPushPatternParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEventPatternParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ForkingPatternInstance commPattern::ForkingPattern:
		//	PushPattern | EventPattern;
		@Override public ParserRule getRule() { return rule; }
		
		//PushPattern | EventPattern
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PushPattern
		public RuleCall getPushPatternParserRuleCall_0() { return cPushPatternParserRuleCall_0; }
		
		//EventPattern
		public RuleCall getEventPatternParserRuleCall_1() { return cEventPatternParserRuleCall_1; }
	}
	public class JoiningPatternInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.JoiningPatternInstance");
		private final RuleCall cSendPatternParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//JoiningPatternInstance commPattern::JoiningPattern:
		//	SendPattern;
		@Override public ParserRule getRule() { return rule; }
		
		//SendPattern
		public RuleCall getSendPatternParserRuleCall() { return cSendPatternParserRuleCall; }
	}
	public class RequestAnswerPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.RequestAnswerPattern");
		private final RuleCall cQueryPatternParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//RequestAnswerPattern commPattern::RequestAnswerPattern:
		//	QueryPattern;
		@Override public ParserRule getRule() { return rule; }
		
		//QueryPattern
		public RuleCall getQueryPatternParserRuleCall() { return cQueryPatternParserRuleCall; }
	}
	public class PushPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.PushPattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPushPatternAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPushPatternKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLessThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cDataTypeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDataTypeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cDataTypeCommunicationObjectCrossReference_5_0 = (CrossReference)cDataTypeAssignment_5.eContents().get(0);
		private final RuleCall cDataTypeCommunicationObjectFQNParserRuleCall_5_0_1 = (RuleCall)cDataTypeCommunicationObjectCrossReference_5_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//PushPattern commPattern::PushPattern:
		//	{commPattern::PushPattern}
		//	'PushPattern' '<' 'DataType' '=' dataType=[commObject::CommunicationObject|FQN] '>';
		@Override public ParserRule getRule() { return rule; }
		
		//{commPattern::PushPattern} 'PushPattern' '<' 'DataType' '=' dataType=[commObject::CommunicationObject|FQN] '>'
		public Group getGroup() { return cGroup; }
		
		//{commPattern::PushPattern}
		public Action getPushPatternAction_0() { return cPushPatternAction_0; }
		
		//'PushPattern'
		public Keyword getPushPatternKeyword_1() { return cPushPatternKeyword_1; }
		
		//'<'
		public Keyword getLessThanSignKeyword_2() { return cLessThanSignKeyword_2; }
		
		//'DataType'
		public Keyword getDataTypeKeyword_3() { return cDataTypeKeyword_3; }
		
		//'='
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }
		
		//dataType=[commObject::CommunicationObject|FQN]
		public Assignment getDataTypeAssignment_5() { return cDataTypeAssignment_5; }
		
		//[commObject::CommunicationObject|FQN]
		public CrossReference getDataTypeCommunicationObjectCrossReference_5_0() { return cDataTypeCommunicationObjectCrossReference_5_0; }
		
		//FQN
		public RuleCall getDataTypeCommunicationObjectFQNParserRuleCall_5_0_1() { return cDataTypeCommunicationObjectFQNParserRuleCall_5_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_6() { return cGreaterThanSignKeyword_6; }
	}
	public class EventPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.EventPattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEventPatternAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEventPatternKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLessThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cEventTypeKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cEventTypeAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final CrossReference cEventTypeCommunicationObjectCrossReference_3_0_2_0 = (CrossReference)cEventTypeAssignment_3_0_2.eContents().get(0);
		private final RuleCall cEventTypeCommunicationObjectFQNParserRuleCall_3_0_2_0_1 = (RuleCall)cEventTypeCommunicationObjectCrossReference_3_0_2_0.eContents().get(1);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cActivationTypeKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cActivationTypeAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final CrossReference cActivationTypeCommunicationObjectCrossReference_3_1_2_0 = (CrossReference)cActivationTypeAssignment_3_1_2.eContents().get(0);
		private final RuleCall cActivationTypeCommunicationObjectFQNParserRuleCall_3_1_2_0_1 = (RuleCall)cActivationTypeCommunicationObjectCrossReference_3_1_2_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cEventStateTypeKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cEventStateTypeAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final CrossReference cEventStateTypeCommunicationObjectCrossReference_3_2_2_0 = (CrossReference)cEventStateTypeAssignment_3_2_2.eContents().get(0);
		private final RuleCall cEventStateTypeCommunicationObjectFQNParserRuleCall_3_2_2_0_1 = (RuleCall)cEventStateTypeCommunicationObjectCrossReference_3_2_2_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//EventPattern commPattern::EventPattern:
		//	{commPattern::EventPattern}
		//	'EventPattern' '<' ('EventType' '=' eventType=[commObject::CommunicationObject|FQN] &
		//	'ActivationType' '=' activationType=[commObject::CommunicationObject|FQN] &
		//	'EventStateType' '=' eventStateType=[commObject::CommunicationObject|FQN])
		//	'>';
		@Override public ParserRule getRule() { return rule; }
		
		//{commPattern::EventPattern} 'EventPattern' '<' ('EventType' '=' eventType=[commObject::CommunicationObject|FQN] &
		//'ActivationType' '=' activationType=[commObject::CommunicationObject|FQN] & 'EventStateType' '='
		//eventStateType=[commObject::CommunicationObject|FQN]) '>'
		public Group getGroup() { return cGroup; }
		
		//{commPattern::EventPattern}
		public Action getEventPatternAction_0() { return cEventPatternAction_0; }
		
		//'EventPattern'
		public Keyword getEventPatternKeyword_1() { return cEventPatternKeyword_1; }
		
		//'<'
		public Keyword getLessThanSignKeyword_2() { return cLessThanSignKeyword_2; }
		
		//'EventType' '=' eventType=[commObject::CommunicationObject|FQN] & 'ActivationType' '='
		//activationType=[commObject::CommunicationObject|FQN] & 'EventStateType' '='
		//eventStateType=[commObject::CommunicationObject|FQN]
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//'EventType' '=' eventType=[commObject::CommunicationObject|FQN]
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'EventType'
		public Keyword getEventTypeKeyword_3_0_0() { return cEventTypeKeyword_3_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_0_1() { return cEqualsSignKeyword_3_0_1; }
		
		//eventType=[commObject::CommunicationObject|FQN]
		public Assignment getEventTypeAssignment_3_0_2() { return cEventTypeAssignment_3_0_2; }
		
		//[commObject::CommunicationObject|FQN]
		public CrossReference getEventTypeCommunicationObjectCrossReference_3_0_2_0() { return cEventTypeCommunicationObjectCrossReference_3_0_2_0; }
		
		//FQN
		public RuleCall getEventTypeCommunicationObjectFQNParserRuleCall_3_0_2_0_1() { return cEventTypeCommunicationObjectFQNParserRuleCall_3_0_2_0_1; }
		
		//'ActivationType' '=' activationType=[commObject::CommunicationObject|FQN]
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'ActivationType'
		public Keyword getActivationTypeKeyword_3_1_0() { return cActivationTypeKeyword_3_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_1_1() { return cEqualsSignKeyword_3_1_1; }
		
		//activationType=[commObject::CommunicationObject|FQN]
		public Assignment getActivationTypeAssignment_3_1_2() { return cActivationTypeAssignment_3_1_2; }
		
		//[commObject::CommunicationObject|FQN]
		public CrossReference getActivationTypeCommunicationObjectCrossReference_3_1_2_0() { return cActivationTypeCommunicationObjectCrossReference_3_1_2_0; }
		
		//FQN
		public RuleCall getActivationTypeCommunicationObjectFQNParserRuleCall_3_1_2_0_1() { return cActivationTypeCommunicationObjectFQNParserRuleCall_3_1_2_0_1; }
		
		//'EventStateType' '=' eventStateType=[commObject::CommunicationObject|FQN]
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'EventStateType'
		public Keyword getEventStateTypeKeyword_3_2_0() { return cEventStateTypeKeyword_3_2_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_2_1() { return cEqualsSignKeyword_3_2_1; }
		
		//eventStateType=[commObject::CommunicationObject|FQN]
		public Assignment getEventStateTypeAssignment_3_2_2() { return cEventStateTypeAssignment_3_2_2; }
		
		//[commObject::CommunicationObject|FQN]
		public CrossReference getEventStateTypeCommunicationObjectCrossReference_3_2_2_0() { return cEventStateTypeCommunicationObjectCrossReference_3_2_2_0; }
		
		//FQN
		public RuleCall getEventStateTypeCommunicationObjectFQNParserRuleCall_3_2_2_0_1() { return cEventStateTypeCommunicationObjectFQNParserRuleCall_3_2_2_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_4() { return cGreaterThanSignKeyword_4; }
	}
	public class QueryPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.QueryPattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cQueryPatternAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cQueryPatternKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLessThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cRequestTypeKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cRequestTypeAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final CrossReference cRequestTypeCommunicationObjectCrossReference_3_0_2_0 = (CrossReference)cRequestTypeAssignment_3_0_2.eContents().get(0);
		private final RuleCall cRequestTypeCommunicationObjectFQNParserRuleCall_3_0_2_0_1 = (RuleCall)cRequestTypeCommunicationObjectCrossReference_3_0_2_0.eContents().get(1);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cAnswerTypeKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cAnswerTypeAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final CrossReference cAnswerTypeCommunicationObjectCrossReference_3_1_2_0 = (CrossReference)cAnswerTypeAssignment_3_1_2.eContents().get(0);
		private final RuleCall cAnswerTypeCommunicationObjectFQNParserRuleCall_3_1_2_0_1 = (RuleCall)cAnswerTypeCommunicationObjectCrossReference_3_1_2_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//QueryPattern commPattern::QueryPattern:
		//	{commPattern::QueryPattern}
		//	'QueryPattern' '<' ('RequestType' '=' requestType=[commObject::CommunicationObject|FQN] &
		//	'AnswerType' '=' answerType=[commObject::CommunicationObject|FQN])
		//	'>';
		@Override public ParserRule getRule() { return rule; }
		
		//{commPattern::QueryPattern} 'QueryPattern' '<' ('RequestType' '=' requestType=[commObject::CommunicationObject|FQN] &
		//'AnswerType' '=' answerType=[commObject::CommunicationObject|FQN]) '>'
		public Group getGroup() { return cGroup; }
		
		//{commPattern::QueryPattern}
		public Action getQueryPatternAction_0() { return cQueryPatternAction_0; }
		
		//'QueryPattern'
		public Keyword getQueryPatternKeyword_1() { return cQueryPatternKeyword_1; }
		
		//'<'
		public Keyword getLessThanSignKeyword_2() { return cLessThanSignKeyword_2; }
		
		//'RequestType' '=' requestType=[commObject::CommunicationObject|FQN] & 'AnswerType' '='
		//answerType=[commObject::CommunicationObject|FQN]
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//'RequestType' '=' requestType=[commObject::CommunicationObject|FQN]
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'RequestType'
		public Keyword getRequestTypeKeyword_3_0_0() { return cRequestTypeKeyword_3_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_0_1() { return cEqualsSignKeyword_3_0_1; }
		
		//requestType=[commObject::CommunicationObject|FQN]
		public Assignment getRequestTypeAssignment_3_0_2() { return cRequestTypeAssignment_3_0_2; }
		
		//[commObject::CommunicationObject|FQN]
		public CrossReference getRequestTypeCommunicationObjectCrossReference_3_0_2_0() { return cRequestTypeCommunicationObjectCrossReference_3_0_2_0; }
		
		//FQN
		public RuleCall getRequestTypeCommunicationObjectFQNParserRuleCall_3_0_2_0_1() { return cRequestTypeCommunicationObjectFQNParserRuleCall_3_0_2_0_1; }
		
		//'AnswerType' '=' answerType=[commObject::CommunicationObject|FQN]
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'AnswerType'
		public Keyword getAnswerTypeKeyword_3_1_0() { return cAnswerTypeKeyword_3_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_1_1() { return cEqualsSignKeyword_3_1_1; }
		
		//answerType=[commObject::CommunicationObject|FQN]
		public Assignment getAnswerTypeAssignment_3_1_2() { return cAnswerTypeAssignment_3_1_2; }
		
		//[commObject::CommunicationObject|FQN]
		public CrossReference getAnswerTypeCommunicationObjectCrossReference_3_1_2_0() { return cAnswerTypeCommunicationObjectCrossReference_3_1_2_0; }
		
		//FQN
		public RuleCall getAnswerTypeCommunicationObjectFQNParserRuleCall_3_1_2_0_1() { return cAnswerTypeCommunicationObjectFQNParserRuleCall_3_1_2_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_4() { return cGreaterThanSignKeyword_4; }
	}
	public class SendPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.SendPattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSendPatternAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSendPatternKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLessThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cDataTypeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDataTypeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cDataTypeCommunicationObjectCrossReference_5_0 = (CrossReference)cDataTypeAssignment_5.eContents().get(0);
		private final RuleCall cDataTypeCommunicationObjectFQNParserRuleCall_5_0_1 = (RuleCall)cDataTypeCommunicationObjectCrossReference_5_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//SendPattern commPattern::SendPattern:
		//	{commPattern::SendPattern}
		//	'SendPattern' '<' 'DataType' '=' dataType=[commObject::CommunicationObject|FQN] '>';
		@Override public ParserRule getRule() { return rule; }
		
		//{commPattern::SendPattern} 'SendPattern' '<' 'DataType' '=' dataType=[commObject::CommunicationObject|FQN] '>'
		public Group getGroup() { return cGroup; }
		
		//{commPattern::SendPattern}
		public Action getSendPatternAction_0() { return cSendPatternAction_0; }
		
		//'SendPattern'
		public Keyword getSendPatternKeyword_1() { return cSendPatternKeyword_1; }
		
		//'<'
		public Keyword getLessThanSignKeyword_2() { return cLessThanSignKeyword_2; }
		
		//'DataType'
		public Keyword getDataTypeKeyword_3() { return cDataTypeKeyword_3; }
		
		//'='
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }
		
		//dataType=[commObject::CommunicationObject|FQN]
		public Assignment getDataTypeAssignment_5() { return cDataTypeAssignment_5; }
		
		//[commObject::CommunicationObject|FQN]
		public CrossReference getDataTypeCommunicationObjectCrossReference_5_0() { return cDataTypeCommunicationObjectCrossReference_5_0; }
		
		//FQN
		public RuleCall getDataTypeCommunicationObjectFQNParserRuleCall_5_0_1() { return cDataTypeCommunicationObjectFQNParserRuleCall_5_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_6() { return cGreaterThanSignKeyword_6; }
	}
	public class ServicePropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.serviceDefinition.ServiceDefinition.ServiceProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cServicePropertyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//// this is just a placeholder for the later fully-fledged service-property definition
		//ServiceProperty service::ServiceProperty:
		//	'ServiceProperty' name=ID
		//	'{'
		//	//TODO: add property specification
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ServiceProperty' name=ID '{' //TODO: add property specification
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'ServiceProperty'
		public Keyword getServicePropertyKeyword_0() { return cServicePropertyKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		////TODO: add property specification
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	
	
	private final ServiceDefModelElements pServiceDefModel;
	private final FQNElements pFQN;
	private final FQNWElements pFQNW;
	private final EIntElements pEInt;
	private final EStringElements pEString;
	private final ServiceDefRepositoryElements pServiceDefRepository;
	private final ServiceRepoVersionElements pServiceRepoVersion;
	private final CommRepoImportElements pCommRepoImport;
	private final AbstractServiceDefinitionElements pAbstractServiceDefinition;
	private final CommunicationServiceDefinitionElements pCommunicationServiceDefinition;
	private final ForkingServiceDefinitionElements pForkingServiceDefinition;
	private final JoyningServiceDefinitionElements pJoyningServiceDefinition;
	private final RequestAnswerServiceDefinitionElements pRequestAnswerServiceDefinition;
	private final CoordinationServiceDefinitionElements pCoordinationServiceDefinition;
	private final CommunicationServiceUsageElements pCommunicationServiceUsage;
	private final StatePatternElements pStatePattern;
	private final ParameterPatternElements pParameterPattern;
	private final DynamicWiringPatternElements pDynamicWiringPattern;
	private final MonitoringPatternElements pMonitoringPattern;
	private final ForkingPatternInstanceElements pForkingPatternInstance;
	private final JoiningPatternInstanceElements pJoiningPatternInstance;
	private final RequestAnswerPatternElements pRequestAnswerPattern;
	private final PushPatternElements pPushPattern;
	private final EventPatternElements pEventPattern;
	private final QueryPatternElements pQueryPattern;
	private final SendPatternElements pSendPattern;
	private final ServicePropertyElements pServiceProperty;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ServiceDefinitionGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pServiceDefModel = new ServiceDefModelElements();
		this.pFQN = new FQNElements();
		this.pFQNW = new FQNWElements();
		this.pEInt = new EIntElements();
		this.pEString = new EStringElements();
		this.pServiceDefRepository = new ServiceDefRepositoryElements();
		this.pServiceRepoVersion = new ServiceRepoVersionElements();
		this.pCommRepoImport = new CommRepoImportElements();
		this.pAbstractServiceDefinition = new AbstractServiceDefinitionElements();
		this.pCommunicationServiceDefinition = new CommunicationServiceDefinitionElements();
		this.pForkingServiceDefinition = new ForkingServiceDefinitionElements();
		this.pJoyningServiceDefinition = new JoyningServiceDefinitionElements();
		this.pRequestAnswerServiceDefinition = new RequestAnswerServiceDefinitionElements();
		this.pCoordinationServiceDefinition = new CoordinationServiceDefinitionElements();
		this.pCommunicationServiceUsage = new CommunicationServiceUsageElements();
		this.pStatePattern = new StatePatternElements();
		this.pParameterPattern = new ParameterPatternElements();
		this.pDynamicWiringPattern = new DynamicWiringPatternElements();
		this.pMonitoringPattern = new MonitoringPatternElements();
		this.pForkingPatternInstance = new ForkingPatternInstanceElements();
		this.pJoiningPatternInstance = new JoiningPatternInstanceElements();
		this.pRequestAnswerPattern = new RequestAnswerPatternElements();
		this.pPushPattern = new PushPatternElements();
		this.pEventPattern = new EventPatternElements();
		this.pQueryPattern = new QueryPatternElements();
		this.pSendPattern = new SendPatternElements();
		this.pServiceProperty = new ServicePropertyElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.service.serviceDefinition.ServiceDefinition".equals(grammar.getName())) {
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

	
	//ServiceDefModel service::ServiceDefModel:
	//	{service::ServiceDefModel} imports+=CommRepoImport*
	//	repository=ServiceDefRepository?;
	public ServiceDefModelElements getServiceDefModelAccess() {
		return pServiceDefModel;
	}
	
	public ParserRule getServiceDefModelRule() {
		return getServiceDefModelAccess().getRule();
	}
	
	//// parser rules for names
	//FQN:
	//	ID ('.' ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//FQNW:
	//	FQN '.*'?;
	public FQNWElements getFQNWAccess() {
		return pFQNW;
	}
	
	public ParserRule getFQNWRule() {
		return getFQNWAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EString:
	//	STRING;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//ServiceDefRepository service::ServiceDefRepository:
	//	'ServiceDefRepository' name=ID ('version' version=ServiceRepoVersion)?
	//	'{'
	//	services+=AbstractServiceDefinition*
	//	'}';
	public ServiceDefRepositoryElements getServiceDefRepositoryAccess() {
		return pServiceDefRepository;
	}
	
	public ParserRule getServiceDefRepositoryRule() {
		return getServiceDefRepositoryAccess().getRule();
	}
	
	//ServiceRepoVersion service::ServiceRepoVersion:
	//	major=EInt '.' minor=EInt ('.' patch=EInt)?;
	public ServiceRepoVersionElements getServiceRepoVersionAccess() {
		return pServiceRepoVersion;
	}
	
	public ParserRule getServiceRepoVersionRule() {
		return getServiceRepoVersionAccess().getRule();
	}
	
	//CommRepoImport service::CommRepoImport:
	//	'#import' importedNamespace=FQNW ';'?;
	public CommRepoImportElements getCommRepoImportAccess() {
		return pCommRepoImport;
	}
	
	public ParserRule getCommRepoImportRule() {
		return getCommRepoImportAccess().getRule();
	}
	
	//AbstractServiceDefinition service::AbstractServiceDefinition:
	//	CommunicationServiceDefinition | CoordinationServiceDefinition;
	public AbstractServiceDefinitionElements getAbstractServiceDefinitionAccess() {
		return pAbstractServiceDefinition;
	}
	
	public ParserRule getAbstractServiceDefinitionRule() {
		return getAbstractServiceDefinitionAccess().getRule();
	}
	
	//CommunicationServiceDefinition service::CommunicationServiceDefinition:
	//	ForkingServiceDefinition | JoyningServiceDefinition | RequestAnswerServiceDefinition;
	public CommunicationServiceDefinitionElements getCommunicationServiceDefinitionAccess() {
		return pCommunicationServiceDefinition;
	}
	
	public ParserRule getCommunicationServiceDefinitionRule() {
		return getCommunicationServiceDefinitionAccess().getRule();
	}
	
	//ForkingServiceDefinition service::ForkingServiceDefinition:
	//	'ForkingServiceDefinition' name=ID
	//	'{'
	//	pattern=ForkingPatternInstance ('purposeDescription' purposeDescription=EString)?
	//	properties+=ServiceProperty*
	//	'}';
	public ForkingServiceDefinitionElements getForkingServiceDefinitionAccess() {
		return pForkingServiceDefinition;
	}
	
	public ParserRule getForkingServiceDefinitionRule() {
		return getForkingServiceDefinitionAccess().getRule();
	}
	
	//JoyningServiceDefinition service::JoiningServiceDefinition:
	//	'JoiningServiceDefinition' name=ID
	//	'{'
	//	pattern=JoiningPatternInstance ('purposeDescription' purposeDescription=EString)?
	//	properties+=ServiceProperty*
	//	'}';
	public JoyningServiceDefinitionElements getJoyningServiceDefinitionAccess() {
		return pJoyningServiceDefinition;
	}
	
	public ParserRule getJoyningServiceDefinitionRule() {
		return getJoyningServiceDefinitionAccess().getRule();
	}
	
	//RequestAnswerServiceDefinition service::RequestAnswerServiceDefinition:
	//	'RequestAnswerServiceDefinition' name=ID
	//	'{'
	//	pattern=RequestAnswerPattern ('purposeDescription' purposeDescription=EString)?
	//	properties+=ServiceProperty*
	//	'}';
	public RequestAnswerServiceDefinitionElements getRequestAnswerServiceDefinitionAccess() {
		return pRequestAnswerServiceDefinition;
	}
	
	public ParserRule getRequestAnswerServiceDefinitionRule() {
		return getRequestAnswerServiceDefinitionAccess().getRule();
	}
	
	//CoordinationServiceDefinition service::CoordinationServiceDefinition:
	//	'CoordinationServiceDefinition' name=ID
	//	'{' (('purposeDescription' purposeDescription=EString)? & statePattern=StatePattern? &
	//	parameterPattern=ParameterPattern? & monitoringPattern=MonitoringPattern? & wiringPattern=DynamicWiringPattern?)
	//	services+=CommunicationServiceUsage*
	//	properties+=ServiceProperty*
	//	'}';
	public CoordinationServiceDefinitionElements getCoordinationServiceDefinitionAccess() {
		return pCoordinationServiceDefinition;
	}
	
	public ParserRule getCoordinationServiceDefinitionRule() {
		return getCoordinationServiceDefinitionAccess().getRule();
	}
	
	//CommunicationServiceUsage service::CommunicationServiceUsage:
	//	'CommunicationServiceUsage' name=ID 'uses' uses=[service::CommunicationServiceDefinition|FQN];
	public CommunicationServiceUsageElements getCommunicationServiceUsageAccess() {
		return pCommunicationServiceUsage;
	}
	
	public ParserRule getCommunicationServiceUsageRule() {
		return getCommunicationServiceUsageAccess().getRule();
	}
	
	//StatePattern coordPattern::StatePattern:
	//	{coordPattern::StatePattern}
	//	'StatePattern' '<'
	//	'lifecycle' lifecycle=[stateMachine::StateMachine|FQN] ('with' modes=[modes::ComponentModeCollection|FQN])?
	//	'>';
	public StatePatternElements getStatePatternAccess() {
		return pStatePattern;
	}
	
	public ParserRule getStatePatternRule() {
		return getStatePatternAccess().getRule();
	}
	
	//ParameterPattern coordPattern::ParameterPattern:
	//	{coordPattern::ParameterPattern}
	//	'ParameterPattern' '<' parameterSet=[param::ParameterSetDefinition|FQN] '>';
	public ParameterPatternElements getParameterPatternAccess() {
		return pParameterPattern;
	}
	
	public ParserRule getParameterPatternRule() {
		return getParameterPatternAccess().getRule();
	}
	
	//DynamicWiringPattern coordPattern::DynamicWiringPattern:
	//	{coordPattern::DynamicWiringPattern}
	//	'DynamicWiringPattern';
	public DynamicWiringPatternElements getDynamicWiringPatternAccess() {
		return pDynamicWiringPattern;
	}
	
	public ParserRule getDynamicWiringPatternRule() {
		return getDynamicWiringPatternAccess().getRule();
	}
	
	//MonitoringPattern coordPattern::MonitoringPattern:
	//	{coordPattern::MonitoringPattern}
	//	'MonitoringPattern'
	//	//TODO: this rule needs to be extended in future
	//;
	public MonitoringPatternElements getMonitoringPatternAccess() {
		return pMonitoringPattern;
	}
	
	public ParserRule getMonitoringPatternRule() {
		return getMonitoringPatternAccess().getRule();
	}
	
	//ForkingPatternInstance commPattern::ForkingPattern:
	//	PushPattern | EventPattern;
	public ForkingPatternInstanceElements getForkingPatternInstanceAccess() {
		return pForkingPatternInstance;
	}
	
	public ParserRule getForkingPatternInstanceRule() {
		return getForkingPatternInstanceAccess().getRule();
	}
	
	//JoiningPatternInstance commPattern::JoiningPattern:
	//	SendPattern;
	public JoiningPatternInstanceElements getJoiningPatternInstanceAccess() {
		return pJoiningPatternInstance;
	}
	
	public ParserRule getJoiningPatternInstanceRule() {
		return getJoiningPatternInstanceAccess().getRule();
	}
	
	//RequestAnswerPattern commPattern::RequestAnswerPattern:
	//	QueryPattern;
	public RequestAnswerPatternElements getRequestAnswerPatternAccess() {
		return pRequestAnswerPattern;
	}
	
	public ParserRule getRequestAnswerPatternRule() {
		return getRequestAnswerPatternAccess().getRule();
	}
	
	//PushPattern commPattern::PushPattern:
	//	{commPattern::PushPattern}
	//	'PushPattern' '<' 'DataType' '=' dataType=[commObject::CommunicationObject|FQN] '>';
	public PushPatternElements getPushPatternAccess() {
		return pPushPattern;
	}
	
	public ParserRule getPushPatternRule() {
		return getPushPatternAccess().getRule();
	}
	
	//EventPattern commPattern::EventPattern:
	//	{commPattern::EventPattern}
	//	'EventPattern' '<' ('EventType' '=' eventType=[commObject::CommunicationObject|FQN] &
	//	'ActivationType' '=' activationType=[commObject::CommunicationObject|FQN] &
	//	'EventStateType' '=' eventStateType=[commObject::CommunicationObject|FQN])
	//	'>';
	public EventPatternElements getEventPatternAccess() {
		return pEventPattern;
	}
	
	public ParserRule getEventPatternRule() {
		return getEventPatternAccess().getRule();
	}
	
	//QueryPattern commPattern::QueryPattern:
	//	{commPattern::QueryPattern}
	//	'QueryPattern' '<' ('RequestType' '=' requestType=[commObject::CommunicationObject|FQN] &
	//	'AnswerType' '=' answerType=[commObject::CommunicationObject|FQN])
	//	'>';
	public QueryPatternElements getQueryPatternAccess() {
		return pQueryPattern;
	}
	
	public ParserRule getQueryPatternRule() {
		return getQueryPatternAccess().getRule();
	}
	
	//SendPattern commPattern::SendPattern:
	//	{commPattern::SendPattern}
	//	'SendPattern' '<' 'DataType' '=' dataType=[commObject::CommunicationObject|FQN] '>';
	public SendPatternElements getSendPatternAccess() {
		return pSendPattern;
	}
	
	public ParserRule getSendPatternRule() {
		return getSendPatternAccess().getRule();
	}
	
	//// this is just a placeholder for the later fully-fledged service-property definition
	//ServiceProperty service::ServiceProperty:
	//	'ServiceProperty' name=ID
	//	'{'
	//	//TODO: add property specification
	//	'}';
	public ServicePropertyElements getServicePropertyAccess() {
		return pServiceProperty;
	}
	
	public ParserRule getServicePropertyRule() {
		return getServicePropertyAccess().getRule();
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
