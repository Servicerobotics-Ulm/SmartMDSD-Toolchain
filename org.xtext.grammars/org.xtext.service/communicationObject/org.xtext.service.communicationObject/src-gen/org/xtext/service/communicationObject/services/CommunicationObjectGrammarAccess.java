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
package org.xtext.service.communicationObject.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
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

@Singleton
public class CommunicationObjectGrammarAccess extends AbstractGrammarElementFinder {
	
	public class CommObjectModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.communicationObject.CommunicationObject.CommObjectModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsCommRepositoryImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cRepositoryAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRepositoryCommObjectsRepositoryParserRuleCall_1_0 = (RuleCall)cRepositoryAssignment_1.eContents().get(0);
		
		//CommObjectModel comm::CommObjectModel:
		//	imports+=CommRepositoryImport*
		//	repository=CommObjectsRepository?;
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=CommRepositoryImport* repository=CommObjectsRepository?
		public Group getGroup() { return cGroup; }
		
		//imports+=CommRepositoryImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//CommRepositoryImport
		public RuleCall getImportsCommRepositoryImportParserRuleCall_0_0() { return cImportsCommRepositoryImportParserRuleCall_0_0; }
		
		//repository=CommObjectsRepository?
		public Assignment getRepositoryAssignment_1() { return cRepositoryAssignment_1; }
		
		//CommObjectsRepository
		public RuleCall getRepositoryCommObjectsRepositoryParserRuleCall_1_0() { return cRepositoryCommObjectsRepositoryParserRuleCall_1_0; }
	}
	public class FQNWElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.communicationObject.CommunicationObject.FQNW");
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
	public class CommRepositoryImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.communicationObject.CommunicationObject.CommRepositoryImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceFQNWParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//// imports can be optionally used to simplify names of objects from a remote repository
		//CommRepositoryImport comm::CommRepositoryImport:
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
	public class CommObjectsRepositoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.communicationObject.CommunicationObject.CommObjectsRepository");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommObjectsRepositoryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cVersionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVersionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVersionVersionParserRuleCall_2_1_0 = (RuleCall)cVersionAssignment_2_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDependencyKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDependencyAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDependencyEStringParserRuleCall_4_1_0 = (RuleCall)cDependencyAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Assignment cElementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cElementsAbstractCommElementParserRuleCall_5_0 = (RuleCall)cElementsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//// this is the main element in a model
		//CommObjectsRepository comm::CommObjectsRepository:
		//	'CommObjectsRepository' name=ID ('version' version=Version)? '{' ("Dependency" dependency=EString ';'?)?
		//	elements+=AbstractCommElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'CommObjectsRepository' name=ID ('version' version=Version)? '{' ("Dependency" dependency=EString ';'?)?
		//elements+=AbstractCommElement* '}'
		public Group getGroup() { return cGroup; }
		
		//'CommObjectsRepository'
		public Keyword getCommObjectsRepositoryKeyword_0() { return cCommObjectsRepositoryKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('version' version=Version)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'version'
		public Keyword getVersionKeyword_2_0() { return cVersionKeyword_2_0; }
		
		//version=Version
		public Assignment getVersionAssignment_2_1() { return cVersionAssignment_2_1; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_2_1_0() { return cVersionVersionParserRuleCall_2_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//("Dependency" dependency=EString ';'?)?
		public Group getGroup_4() { return cGroup_4; }
		
		//"Dependency"
		public Keyword getDependencyKeyword_4_0() { return cDependencyKeyword_4_0; }
		
		//dependency=EString
		public Assignment getDependencyAssignment_4_1() { return cDependencyAssignment_4_1; }
		
		//EString
		public RuleCall getDependencyEStringParserRuleCall_4_1_0() { return cDependencyEStringParserRuleCall_4_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_4_2() { return cSemicolonKeyword_4_2; }
		
		//elements+=AbstractCommElement*
		public Assignment getElementsAssignment_5() { return cElementsAssignment_5; }
		
		//AbstractCommElement
		public RuleCall getElementsAbstractCommElementParserRuleCall_5_0() { return cElementsAbstractCommElementParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.communicationObject.CommunicationObject.Version");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cMajorAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cMajorINTTerminalRuleCall_0_0 = (RuleCall)cMajorAssignment_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMinorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMinorINTTerminalRuleCall_2_0 = (RuleCall)cMinorAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cFullStopKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPatchAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cPatchINTTerminalRuleCall_3_1_0 = (RuleCall)cPatchAssignment_3_1.eContents().get(0);
		
		//Version comm::Version:
		//	major=INT '.' minor=INT ('.' patch=INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//major=INT '.' minor=INT ('.' patch=INT)?
		public Group getGroup() { return cGroup; }
		
		//major=INT
		public Assignment getMajorAssignment_0() { return cMajorAssignment_0; }
		
		//INT
		public RuleCall getMajorINTTerminalRuleCall_0_0() { return cMajorINTTerminalRuleCall_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//minor=INT
		public Assignment getMinorAssignment_2() { return cMinorAssignment_2; }
		
		//INT
		public RuleCall getMinorINTTerminalRuleCall_2_0() { return cMinorINTTerminalRuleCall_2_0; }
		
		//('.' patch=INT)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'.'
		public Keyword getFullStopKeyword_3_0() { return cFullStopKeyword_3_0; }
		
		//patch=INT
		public Assignment getPatchAssignment_3_1() { return cPatchAssignment_3_1; }
		
		//INT
		public RuleCall getPatchINTTerminalRuleCall_3_1_0() { return cPatchINTTerminalRuleCall_3_1_0; }
	}
	public class AbstractCommElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.communicationObject.CommunicationObject.AbstractCommElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEnumerationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCommunicationObjectParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractCommElement comm::AbstractCommElement:
		//	Enumeration | CommunicationObject;
		@Override public ParserRule getRule() { return rule; }
		
		//Enumeration | CommunicationObject
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Enumeration
		public RuleCall getEnumerationParserRuleCall_0() { return cEnumerationParserRuleCall_0; }
		
		//CommunicationObject
		public RuleCall getCommunicationObjectParserRuleCall_1() { return cCommunicationObjectParserRuleCall_1; }
	}
	public class CommunicationObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.communicationObject.CommunicationObject.CommunicationObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommObjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributesAttributeDefinitionParserRuleCall_3_0 = (RuleCall)cAttributesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//CommunicationObject comm::CommunicationObject:
		//	'CommObject' name=ID '{'
		//	attributes+=AttributeDefinition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'CommObject' name=ID '{' attributes+=AttributeDefinition* '}'
		public Group getGroup() { return cGroup; }
		
		//'CommObject'
		public Keyword getCommObjectKeyword_0() { return cCommObjectKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//attributes+=AttributeDefinition*
		public Assignment getAttributesAssignment_3() { return cAttributesAssignment_3; }
		
		//AttributeDefinition
		public RuleCall getAttributesAttributeDefinitionParserRuleCall_3_0() { return cAttributesAttributeDefinitionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class EnumerationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.communicationObject.CommunicationObject.Enumeration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumerationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEnumsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEnumsEnumerationElementParserRuleCall_3_0 = (RuleCall)cEnumsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Enumeration comm::Enumeration:
		//	'Enumeration' name=ID '{'
		//	enums+=EnumerationElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Enumeration' name=ID '{' enums+=EnumerationElement* '}'
		public Group getGroup() { return cGroup; }
		
		//'Enumeration'
		public Keyword getEnumerationKeyword_0() { return cEnumerationKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//enums+=EnumerationElement*
		public Assignment getEnumsAssignment_3() { return cEnumsAssignment_3; }
		
		//EnumerationElement
		public RuleCall getEnumsEnumerationElementParserRuleCall_3_0() { return cEnumsEnumerationElementParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class AbstractAttributeTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.communicationObject.CommunicationObject.AbstractAttributeType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCommElementReferenceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAbstractAttributeTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//@ Override AbstractAttributeType attr::AbstractAttributeType:
		//	CommElementReference | super;
		@Override public ParserRule getRule() { return rule; }
		
		//CommElementReference | super
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CommElementReference
		public RuleCall getCommElementReferenceParserRuleCall_0() { return cCommElementReferenceParserRuleCall_0; }
		
		//super
		public RuleCall getAbstractAttributeTypeParserRuleCall_1() { return cAbstractAttributeTypeParserRuleCall_1; }
	}
	public class CommElementReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.communicationObject.CommunicationObject.CommElementReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cTypeNameAbstractCommElementCrossReference_0_0 = (CrossReference)cTypeNameAssignment_0.eContents().get(0);
		private final RuleCall cTypeNameAbstractCommElementFQNParserRuleCall_0_0_1 = (RuleCall)cTypeNameAbstractCommElementCrossReference_0_0.eContents().get(1);
		private final Assignment cArrayAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cArrayArrayTypeParserRuleCall_1_0 = (RuleCall)cArrayAssignment_1.eContents().get(0);
		
		//CommElementReference comm::CommElementReference:
		//	typeName=[comm::AbstractCommElement|FQN] array=ArrayType?;
		@Override public ParserRule getRule() { return rule; }
		
		//typeName=[comm::AbstractCommElement|FQN] array=ArrayType?
		public Group getGroup() { return cGroup; }
		
		//typeName=[comm::AbstractCommElement|FQN]
		public Assignment getTypeNameAssignment_0() { return cTypeNameAssignment_0; }
		
		//[comm::AbstractCommElement|FQN]
		public CrossReference getTypeNameAbstractCommElementCrossReference_0_0() { return cTypeNameAbstractCommElementCrossReference_0_0; }
		
		//FQN
		public RuleCall getTypeNameAbstractCommElementFQNParserRuleCall_0_0_1() { return cTypeNameAbstractCommElementFQNParserRuleCall_0_0_1; }
		
		//array=ArrayType?
		public Assignment getArrayAssignment_1() { return cArrayAssignment_1; }
		
		//ArrayType
		public RuleCall getArrayArrayTypeParserRuleCall_1_0() { return cArrayArrayTypeParserRuleCall_1_0; }
	}
	public class SingleValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.service.communicationObject.CommunicationObject.SingleValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cCommElementValueAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final CrossReference cValueAbstractCommElementCrossReference_0_1_0 = (CrossReference)cValueAssignment_0_1.eContents().get(0);
		private final RuleCall cValueAbstractCommElementFQNParserRuleCall_0_1_0_1 = (RuleCall)cValueAbstractCommElementCrossReference_0_1_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final RuleCall cSingleValueParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//@ Override SingleValue attr::SingleValue:
		//	{comm::CommElementValue} value=[comm::AbstractCommElement|FQN] '(' ')' // TODO: further constructor types could be defined in the future
		//	| super;
		@Override public ParserRule getRule() { return rule; }
		
		//{comm::CommElementValue} value=[comm::AbstractCommElement|FQN] '(' ')' // TODO: further constructor types could be defined in the future
		//| super
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{comm::CommElementValue} value=[comm::AbstractCommElement|FQN] '(' ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//{comm::CommElementValue}
		public Action getCommElementValueAction_0_0() { return cCommElementValueAction_0_0; }
		
		//value=[comm::AbstractCommElement|FQN]
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//[comm::AbstractCommElement|FQN]
		public CrossReference getValueAbstractCommElementCrossReference_0_1_0() { return cValueAbstractCommElementCrossReference_0_1_0; }
		
		//FQN
		public RuleCall getValueAbstractCommElementFQNParserRuleCall_0_1_0_1() { return cValueAbstractCommElementFQNParserRuleCall_0_1_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_2() { return cLeftParenthesisKeyword_0_2; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_3() { return cRightParenthesisKeyword_0_3; }
		
		//super
		public RuleCall getSingleValueParserRuleCall_1() { return cSingleValueParserRuleCall_1; }
	}
	
	
	private final CommObjectModelElements pCommObjectModel;
	private final FQNWElements pFQNW;
	private final CommRepositoryImportElements pCommRepositoryImport;
	private final CommObjectsRepositoryElements pCommObjectsRepository;
	private final VersionElements pVersion;
	private final AbstractCommElementElements pAbstractCommElement;
	private final CommunicationObjectElements pCommunicationObject;
	private final EnumerationElements pEnumeration;
	private final AbstractAttributeTypeElements pAbstractAttributeType;
	private final CommElementReferenceElements pCommElementReference;
	private final SingleValueElements pSingleValue;
	
	private final Grammar grammar;
	
	private final BasicAttributesGrammarAccess gaBasicAttributes;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CommunicationObjectGrammarAccess(GrammarProvider grammarProvider,
			BasicAttributesGrammarAccess gaBasicAttributes,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaBasicAttributes = gaBasicAttributes;
		this.gaTerminals = gaTerminals;
		this.pCommObjectModel = new CommObjectModelElements();
		this.pFQNW = new FQNWElements();
		this.pCommRepositoryImport = new CommRepositoryImportElements();
		this.pCommObjectsRepository = new CommObjectsRepositoryElements();
		this.pVersion = new VersionElements();
		this.pAbstractCommElement = new AbstractCommElementElements();
		this.pCommunicationObject = new CommunicationObjectElements();
		this.pEnumeration = new EnumerationElements();
		this.pAbstractAttributeType = new AbstractAttributeTypeElements();
		this.pCommElementReference = new CommElementReferenceElements();
		this.pSingleValue = new SingleValueElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.service.communicationObject.CommunicationObject".equals(grammar.getName())) {
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
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//CommObjectModel comm::CommObjectModel:
	//	imports+=CommRepositoryImport*
	//	repository=CommObjectsRepository?;
	public CommObjectModelElements getCommObjectModelAccess() {
		return pCommObjectModel;
	}
	
	public ParserRule getCommObjectModelRule() {
		return getCommObjectModelAccess().getRule();
	}
	
	//FQNW:
	//	FQN '.*'?;
	public FQNWElements getFQNWAccess() {
		return pFQNW;
	}
	
	public ParserRule getFQNWRule() {
		return getFQNWAccess().getRule();
	}
	
	//// imports can be optionally used to simplify names of objects from a remote repository
	//CommRepositoryImport comm::CommRepositoryImport:
	//	'#import' importedNamespace=FQNW ';'?;
	public CommRepositoryImportElements getCommRepositoryImportAccess() {
		return pCommRepositoryImport;
	}
	
	public ParserRule getCommRepositoryImportRule() {
		return getCommRepositoryImportAccess().getRule();
	}
	
	//// this is the main element in a model
	//CommObjectsRepository comm::CommObjectsRepository:
	//	'CommObjectsRepository' name=ID ('version' version=Version)? '{' ("Dependency" dependency=EString ';'?)?
	//	elements+=AbstractCommElement*
	//	'}';
	public CommObjectsRepositoryElements getCommObjectsRepositoryAccess() {
		return pCommObjectsRepository;
	}
	
	public ParserRule getCommObjectsRepositoryRule() {
		return getCommObjectsRepositoryAccess().getRule();
	}
	
	//Version comm::Version:
	//	major=INT '.' minor=INT ('.' patch=INT)?;
	public VersionElements getVersionAccess() {
		return pVersion;
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}
	
	//AbstractCommElement comm::AbstractCommElement:
	//	Enumeration | CommunicationObject;
	public AbstractCommElementElements getAbstractCommElementAccess() {
		return pAbstractCommElement;
	}
	
	public ParserRule getAbstractCommElementRule() {
		return getAbstractCommElementAccess().getRule();
	}
	
	//CommunicationObject comm::CommunicationObject:
	//	'CommObject' name=ID '{'
	//	attributes+=AttributeDefinition*
	//	'}';
	public CommunicationObjectElements getCommunicationObjectAccess() {
		return pCommunicationObject;
	}
	
	public ParserRule getCommunicationObjectRule() {
		return getCommunicationObjectAccess().getRule();
	}
	
	//Enumeration comm::Enumeration:
	//	'Enumeration' name=ID '{'
	//	enums+=EnumerationElement*
	//	'}';
	public EnumerationElements getEnumerationAccess() {
		return pEnumeration;
	}
	
	public ParserRule getEnumerationRule() {
		return getEnumerationAccess().getRule();
	}
	
	//@ Override AbstractAttributeType attr::AbstractAttributeType:
	//	CommElementReference | super;
	public AbstractAttributeTypeElements getAbstractAttributeTypeAccess() {
		return pAbstractAttributeType;
	}
	
	public ParserRule getAbstractAttributeTypeRule() {
		return getAbstractAttributeTypeAccess().getRule();
	}
	
	//CommElementReference comm::CommElementReference:
	//	typeName=[comm::AbstractCommElement|FQN] array=ArrayType?;
	public CommElementReferenceElements getCommElementReferenceAccess() {
		return pCommElementReference;
	}
	
	public ParserRule getCommElementReferenceRule() {
		return getCommElementReferenceAccess().getRule();
	}
	
	//@ Override SingleValue attr::SingleValue:
	//	{comm::CommElementValue} value=[comm::AbstractCommElement|FQN] '(' ')' // TODO: further constructor types could be defined in the future
	//	| super;
	public SingleValueElements getSingleValueAccess() {
		return pSingleValue;
	}
	
	public ParserRule getSingleValueRule() {
		return getSingleValueAccess().getRule();
	}
	
	//AttributeDefinition attr::AttributeDefinition:
	//	name=ID ':' type=super::AbstractAttributeType ('=' defaultvalue=AbstractValue)? ';'?;
	public BasicAttributesGrammarAccess.AttributeDefinitionElements getAttributeDefinitionAccess() {
		return gaBasicAttributes.getAttributeDefinitionAccess();
	}
	
	public ParserRule getAttributeDefinitionRule() {
		return getAttributeDefinitionAccess().getRule();
	}
	
	//AttributeRefinement attr::AttributeRefinement:
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
	public BasicAttributesGrammarAccess.AbstractAttributeTypeElements getBasicAttributesAbstractAttributeTypeAccess() {
		return gaBasicAttributes.getAbstractAttributeTypeAccess();
	}
	
	public ParserRule getBasicAttributesAbstractAttributeTypeRule() {
		return getBasicAttributesAbstractAttributeTypeAccess().getRule();
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
	//	super::SingleValue | ArrayValue;
	public BasicAttributesGrammarAccess.AbstractValueElements getAbstractValueAccess() {
		return gaBasicAttributes.getAbstractValueAccess();
	}
	
	public ParserRule getAbstractValueRule() {
		return getAbstractValueAccess().getRule();
	}
	
	//ArrayValue attr::ArrayValue:
	//	'[' values+=super::SingleValue (',' values+=super::SingleValue)* ']';
	public BasicAttributesGrammarAccess.ArrayValueElements getArrayValueAccess() {
		return gaBasicAttributes.getArrayValueAccess();
	}
	
	public ParserRule getArrayValueRule() {
		return getArrayValueAccess().getRule();
	}
	
	//SingleValue attr::SingleValue:
	//	{attr::IntValue} value=EInt | {attr::FloatingPointValue} value=EDouble | {attr::StringValue} value=EString |
	//	{attr::BoolValue} value=EBoolean | {attr::EnumerationValue} value=[attr::EnumerationElement|FQN];
	public BasicAttributesGrammarAccess.SingleValueElements getBasicAttributesSingleValueAccess() {
		return gaBasicAttributes.getSingleValueAccess();
	}
	
	public ParserRule getBasicAttributesSingleValueRule() {
		return getBasicAttributesSingleValueAccess().getRule();
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
