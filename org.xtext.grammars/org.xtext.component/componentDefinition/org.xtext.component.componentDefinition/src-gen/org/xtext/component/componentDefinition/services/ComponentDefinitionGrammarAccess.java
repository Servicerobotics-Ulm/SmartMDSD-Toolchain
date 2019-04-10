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
package org.xtext.component.componentDefinition.services;

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
public class ComponentDefinitionGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ComponentDefModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.ComponentDefModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cComponentDefModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cImportsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportsServiceRepoImportParserRuleCall_1_0 = (RuleCall)cImportsAssignment_1.eContents().get(0);
		private final Assignment cComponentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cComponentComponentDefinitionParserRuleCall_2_0 = (RuleCall)cComponentAssignment_2.eContents().get(0);
		
		//ComponentDefModel component::ComponentDefModel:
		//	{component::ComponentDefModel} imports+=ServiceRepoImport*
		//	component=ComponentDefinition?;
		@Override public ParserRule getRule() { return rule; }
		
		//{component::ComponentDefModel} imports+=ServiceRepoImport* component=ComponentDefinition?
		public Group getGroup() { return cGroup; }
		
		//{component::ComponentDefModel}
		public Action getComponentDefModelAction_0() { return cComponentDefModelAction_0; }
		
		//imports+=ServiceRepoImport*
		public Assignment getImportsAssignment_1() { return cImportsAssignment_1; }
		
		//ServiceRepoImport
		public RuleCall getImportsServiceRepoImportParserRuleCall_1_0() { return cImportsServiceRepoImportParserRuleCall_1_0; }
		
		//component=ComponentDefinition?
		public Assignment getComponentAssignment_2() { return cComponentAssignment_2; }
		
		//ComponentDefinition
		public RuleCall getComponentComponentDefinitionParserRuleCall_2_0() { return cComponentComponentDefinitionParserRuleCall_2_0; }
	}
	public class ServiceRepoImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.ServiceRepoImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceFQNWParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//// imports can be optionally used to simplify names of objects from a remote repository
		//ServiceRepoImport component::ServiceRepoImport:
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
	public class ComponentDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.ComponentDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLogoKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cLogoAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cLogoSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cLogoAssignment_2_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementsAbstractComponentElementParserRuleCall_4_0 = (RuleCall)cElementsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ComponentDefinition component::ComponentDefinition:
		//	'ComponentDefinition' name=ID ('logo' logo=STRING)?
		//	'{'
		//	elements+=AbstractComponentElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ComponentDefinition' name=ID ('logo' logo=STRING)? '{' elements+=AbstractComponentElement* '}'
		public Group getGroup() { return cGroup; }
		
		//'ComponentDefinition'
		public Keyword getComponentDefinitionKeyword_0() { return cComponentDefinitionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('logo' logo=STRING)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'logo'
		public Keyword getLogoKeyword_2_0() { return cLogoKeyword_2_0; }
		
		//logo=STRING
		public Assignment getLogoAssignment_2_1() { return cLogoAssignment_2_1; }
		
		//STRING
		public RuleCall getLogoSTRINGTerminalRuleCall_2_1_0() { return cLogoSTRINGTerminalRuleCall_2_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//elements+=AbstractComponentElement*
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }
		
		//AbstractComponentElement
		public RuleCall getElementsAbstractComponentElementParserRuleCall_4_0() { return cElementsAbstractComponentElementParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class AbstractComponentElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.AbstractComponentElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNamedComponentElementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDerivedComponentElementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractComponentElement component::AbstractComponentElement:
		//	NamedComponentElement | DerivedComponentElement;
		@Override public ParserRule getRule() { return rule; }
		
		//NamedComponentElement | DerivedComponentElement
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NamedComponentElement
		public RuleCall getNamedComponentElementParserRuleCall_0() { return cNamedComponentElementParserRuleCall_0; }
		
		//DerivedComponentElement
		public RuleCall getDerivedComponentElementParserRuleCall_1() { return cDerivedComponentElementParserRuleCall_1; }
	}
	public class DerivedComponentElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.DerivedComponentElement");
		private final RuleCall cComponentParametersRefParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//DerivedComponentElement component::DerivedComponentElement:
		//	ComponentParametersRef;
		@Override public ParserRule getRule() { return rule; }
		
		//ComponentParametersRef
		public RuleCall getComponentParametersRefParserRuleCall() { return cComponentParametersRefParserRuleCall; }
	}
	public class NamedComponentElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.NamedComponentElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cComponentSubNodeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cComponentPortParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCoordinationSlavePortParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cCoordinationMasterPortParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cPlainOpcUaPortParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//NamedComponentElement component::NamedComponentElement:
		//	ComponentSubNode | ComponentPort | CoordinationSlavePort | CoordinationMasterPort | PlainOpcUaPort;
		@Override public ParserRule getRule() { return rule; }
		
		//ComponentSubNode | ComponentPort | CoordinationSlavePort | CoordinationMasterPort | PlainOpcUaPort
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ComponentSubNode
		public RuleCall getComponentSubNodeParserRuleCall_0() { return cComponentSubNodeParserRuleCall_0; }
		
		//ComponentPort
		public RuleCall getComponentPortParserRuleCall_1() { return cComponentPortParserRuleCall_1; }
		
		//CoordinationSlavePort
		public RuleCall getCoordinationSlavePortParserRuleCall_2() { return cCoordinationSlavePortParserRuleCall_2; }
		
		//CoordinationMasterPort
		public RuleCall getCoordinationMasterPortParserRuleCall_3() { return cCoordinationMasterPortParserRuleCall_3; }
		
		//PlainOpcUaPort
		public RuleCall getPlainOpcUaPortParserRuleCall_4() { return cPlainOpcUaPortParserRuleCall_4; }
	}
	public class ComponentSubNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.ComponentSubNode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cActivityParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cInputHandlerParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRequestHandlerParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ComponentSubNode component::ComponentSubNode:
		//	Activity | InputHandler | RequestHandler;
		@Override public ParserRule getRule() { return rule; }
		
		//Activity | InputHandler | RequestHandler
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Activity
		public RuleCall getActivityParserRuleCall_0() { return cActivityParserRuleCall_0; }
		
		//InputHandler
		public RuleCall getInputHandlerParserRuleCall_1() { return cInputHandlerParserRuleCall_1; }
		
		//RequestHandler
		public RuleCall getRequestHandlerParserRuleCall_2() { return cRequestHandlerParserRuleCall_2; }
	}
	public class ComponentPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.ComponentPort");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInputPortParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAnswerPortParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cOutputPortParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cRequestPortParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//ComponentPort component::ComponentPort:
		//	InputPort | AnswerPort | OutputPort | RequestPort;
		@Override public ParserRule getRule() { return rule; }
		
		//InputPort | AnswerPort | OutputPort | RequestPort
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//InputPort
		public RuleCall getInputPortParserRuleCall_0() { return cInputPortParserRuleCall_0; }
		
		//AnswerPort
		public RuleCall getAnswerPortParserRuleCall_1() { return cAnswerPortParserRuleCall_1; }
		
		//OutputPort
		public RuleCall getOutputPortParserRuleCall_2() { return cOutputPortParserRuleCall_2; }
		
		//RequestPort
		public RuleCall getRequestPortParserRuleCall_3() { return cRequestPortParserRuleCall_3; }
	}
	public class RequestPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.RequestPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequestPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cImplementsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cServiceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cServiceTwoWayCommunicationServiceCrossReference_3_0 = (CrossReference)cServiceAssignment_3.eContents().get(0);
		private final RuleCall cServiceTwoWayCommunicationServiceFQNParserRuleCall_3_0_1 = (RuleCall)cServiceTwoWayCommunicationServiceCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cExtensionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cExtensionsComponentPortExtensionParserRuleCall_5_0 = (RuleCall)cExtensionsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//RequestPort component::RequestPort:
		//	'RequestPort' name=ID
		//	'implements' service=[serviceDefinition::TwoWayCommunicationService|FQN]
		//	'{'
		//	extensions+=ComponentPortExtension*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'RequestPort' name=ID 'implements' service=[serviceDefinition::TwoWayCommunicationService|FQN] '{'
		//extensions+=ComponentPortExtension* '}'
		public Group getGroup() { return cGroup; }
		
		//'RequestPort'
		public Keyword getRequestPortKeyword_0() { return cRequestPortKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'implements'
		public Keyword getImplementsKeyword_2() { return cImplementsKeyword_2; }
		
		//service=[serviceDefinition::TwoWayCommunicationService|FQN]
		public Assignment getServiceAssignment_3() { return cServiceAssignment_3; }
		
		//[serviceDefinition::TwoWayCommunicationService|FQN]
		public CrossReference getServiceTwoWayCommunicationServiceCrossReference_3_0() { return cServiceTwoWayCommunicationServiceCrossReference_3_0; }
		
		//FQN
		public RuleCall getServiceTwoWayCommunicationServiceFQNParserRuleCall_3_0_1() { return cServiceTwoWayCommunicationServiceFQNParserRuleCall_3_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//extensions+=ComponentPortExtension*
		public Assignment getExtensionsAssignment_5() { return cExtensionsAssignment_5; }
		
		//ComponentPortExtension
		public RuleCall getExtensionsComponentPortExtensionParserRuleCall_5_0() { return cExtensionsComponentPortExtensionParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class OutputPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.OutputPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOutputPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cImplementsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cServiceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cServiceOneWayCommunicationServiceCrossReference_3_0 = (CrossReference)cServiceAssignment_3.eContents().get(0);
		private final RuleCall cServiceOneWayCommunicationServiceFQNParserRuleCall_3_0_1 = (RuleCall)cServiceOneWayCommunicationServiceCrossReference_3_0.eContents().get(1);
		private final Keyword cRealizedByKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cActivityAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cActivityActivityCrossReference_5_0 = (CrossReference)cActivityAssignment_5.eContents().get(0);
		private final RuleCall cActivityActivityFQNParserRuleCall_5_0_1 = (RuleCall)cActivityActivityCrossReference_5_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cExtensionsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cExtensionsComponentPortExtensionParserRuleCall_7_0 = (RuleCall)cExtensionsAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//OutputPort component::OutputPort:
		//	'OutputPort' name=ID
		//	'implements' service=[serviceDefinition::OneWayCommunicationService|FQN]
		//	'realizedBy' activity=[component::Activity|FQN]
		//	'{'
		//	extensions+=ComponentPortExtension*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'OutputPort' name=ID 'implements' service=[serviceDefinition::OneWayCommunicationService|FQN] 'realizedBy'
		//activity=[component::Activity|FQN] '{' extensions+=ComponentPortExtension* '}'
		public Group getGroup() { return cGroup; }
		
		//'OutputPort'
		public Keyword getOutputPortKeyword_0() { return cOutputPortKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'implements'
		public Keyword getImplementsKeyword_2() { return cImplementsKeyword_2; }
		
		//service=[serviceDefinition::OneWayCommunicationService|FQN]
		public Assignment getServiceAssignment_3() { return cServiceAssignment_3; }
		
		//[serviceDefinition::OneWayCommunicationService|FQN]
		public CrossReference getServiceOneWayCommunicationServiceCrossReference_3_0() { return cServiceOneWayCommunicationServiceCrossReference_3_0; }
		
		//FQN
		public RuleCall getServiceOneWayCommunicationServiceFQNParserRuleCall_3_0_1() { return cServiceOneWayCommunicationServiceFQNParserRuleCall_3_0_1; }
		
		//'realizedBy'
		public Keyword getRealizedByKeyword_4() { return cRealizedByKeyword_4; }
		
		//activity=[component::Activity|FQN]
		public Assignment getActivityAssignment_5() { return cActivityAssignment_5; }
		
		//[component::Activity|FQN]
		public CrossReference getActivityActivityCrossReference_5_0() { return cActivityActivityCrossReference_5_0; }
		
		//FQN
		public RuleCall getActivityActivityFQNParserRuleCall_5_0_1() { return cActivityActivityFQNParserRuleCall_5_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//extensions+=ComponentPortExtension*
		public Assignment getExtensionsAssignment_7() { return cExtensionsAssignment_7; }
		
		//ComponentPortExtension
		public RuleCall getExtensionsComponentPortExtensionParserRuleCall_7_0() { return cExtensionsComponentPortExtensionParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class AnswerPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.AnswerPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAnswerPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cImplementsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cServiceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cServiceTwoWayCommunicationServiceCrossReference_3_0 = (CrossReference)cServiceAssignment_3.eContents().get(0);
		private final RuleCall cServiceTwoWayCommunicationServiceFQNParserRuleCall_3_0_1 = (RuleCall)cServiceTwoWayCommunicationServiceCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cExtensionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cExtensionsComponentPortExtensionParserRuleCall_5_0 = (RuleCall)cExtensionsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//AnswerPort component::AnswerPort:
		//	'AnswerPort' name=ID 'implements' service=[serviceDefinition::TwoWayCommunicationService|FQN] '{'
		//	extensions+=ComponentPortExtension*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'AnswerPort' name=ID 'implements' service=[serviceDefinition::TwoWayCommunicationService|FQN] '{'
		//extensions+=ComponentPortExtension* '}'
		public Group getGroup() { return cGroup; }
		
		//'AnswerPort'
		public Keyword getAnswerPortKeyword_0() { return cAnswerPortKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'implements'
		public Keyword getImplementsKeyword_2() { return cImplementsKeyword_2; }
		
		//service=[serviceDefinition::TwoWayCommunicationService|FQN]
		public Assignment getServiceAssignment_3() { return cServiceAssignment_3; }
		
		//[serviceDefinition::TwoWayCommunicationService|FQN]
		public CrossReference getServiceTwoWayCommunicationServiceCrossReference_3_0() { return cServiceTwoWayCommunicationServiceCrossReference_3_0; }
		
		//FQN
		public RuleCall getServiceTwoWayCommunicationServiceFQNParserRuleCall_3_0_1() { return cServiceTwoWayCommunicationServiceFQNParserRuleCall_3_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//extensions+=ComponentPortExtension*
		public Assignment getExtensionsAssignment_5() { return cExtensionsAssignment_5; }
		
		//ComponentPortExtension
		public RuleCall getExtensionsComponentPortExtensionParserRuleCall_5_0() { return cExtensionsComponentPortExtensionParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class InputPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.InputPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInputPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cImplementsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cServiceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cServiceOneWayCommunicationServiceCrossReference_3_0 = (CrossReference)cServiceAssignment_3.eContents().get(0);
		private final RuleCall cServiceOneWayCommunicationServiceFQNParserRuleCall_3_0_1 = (RuleCall)cServiceOneWayCommunicationServiceCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cExtensionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cExtensionsComponentPortExtensionParserRuleCall_5_0 = (RuleCall)cExtensionsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//InputPort component::InputPort:
		//	'InputPort' name=ID 'implements' service=[serviceDefinition::OneWayCommunicationService|FQN] '{'
		//	extensions+=ComponentPortExtension*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'InputPort' name=ID 'implements' service=[serviceDefinition::OneWayCommunicationService|FQN] '{'
		//extensions+=ComponentPortExtension* '}'
		public Group getGroup() { return cGroup; }
		
		//'InputPort'
		public Keyword getInputPortKeyword_0() { return cInputPortKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'implements'
		public Keyword getImplementsKeyword_2() { return cImplementsKeyword_2; }
		
		//service=[serviceDefinition::OneWayCommunicationService|FQN]
		public Assignment getServiceAssignment_3() { return cServiceAssignment_3; }
		
		//[serviceDefinition::OneWayCommunicationService|FQN]
		public CrossReference getServiceOneWayCommunicationServiceCrossReference_3_0() { return cServiceOneWayCommunicationServiceCrossReference_3_0; }
		
		//FQN
		public RuleCall getServiceOneWayCommunicationServiceFQNParserRuleCall_3_0_1() { return cServiceOneWayCommunicationServiceFQNParserRuleCall_3_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//extensions+=ComponentPortExtension*
		public Assignment getExtensionsAssignment_5() { return cExtensionsAssignment_5; }
		
		//ComponentPortExtension
		public RuleCall getExtensionsComponentPortExtensionParserRuleCall_5_0() { return cExtensionsComponentPortExtensionParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ComponentPortExtensionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.ComponentPortExtension");
		private final RuleCall cSupportedMiddlewareParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ComponentPortExtension component::ComponentPortExtension:
		//	SupportedMiddleware;
		@Override public ParserRule getRule() { return rule; }
		
		//SupportedMiddleware
		public RuleCall getSupportedMiddlewareParserRuleCall() { return cSupportedMiddlewareParserRuleCall; }
	}
	public class SupportedMiddlewareElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.SupportedMiddleware");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSupportedMiddlewareKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDefaultAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cDefaultDefaultKeyword_1_0 = (Keyword)cDefaultAssignment_1.eContents().get(0);
		private final Assignment cMiddlewareAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMiddlewareRoboticMiddlewareParserRuleCall_2_0 = (RuleCall)cMiddlewareAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SupportedMiddleware seronet::SupportedMiddleware:
		//	'SupportedMiddleware' default?='default'? middleware=RoboticMiddleware ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'SupportedMiddleware' default?='default'? middleware=RoboticMiddleware ';'?
		public Group getGroup() { return cGroup; }
		
		//'SupportedMiddleware'
		public Keyword getSupportedMiddlewareKeyword_0() { return cSupportedMiddlewareKeyword_0; }
		
		//default?='default'?
		public Assignment getDefaultAssignment_1() { return cDefaultAssignment_1; }
		
		//'default'
		public Keyword getDefaultDefaultKeyword_1_0() { return cDefaultDefaultKeyword_1_0; }
		
		//middleware=RoboticMiddleware
		public Assignment getMiddlewareAssignment_2() { return cMiddlewareAssignment_2; }
		
		//RoboticMiddleware
		public RuleCall getMiddlewareRoboticMiddlewareParserRuleCall_2_0() { return cMiddlewareRoboticMiddlewareParserRuleCall_2_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class ActivityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.Activity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActivityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLinksAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLinksAbstractComponentLinkParserRuleCall_3_0 = (RuleCall)cLinksAssignment_3.eContents().get(0);
		private final Assignment cExtensionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cExtensionsActivityExtensionParserRuleCall_4_0 = (RuleCall)cExtensionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Activity component::Activity:
		//	'Activity' name=ID
		//	'{'
		//	links+=AbstractComponentLink*
		//	extensions+=ActivityExtension*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Activity' name=ID '{' links+=AbstractComponentLink* extensions+=ActivityExtension* '}'
		public Group getGroup() { return cGroup; }
		
		//'Activity'
		public Keyword getActivityKeyword_0() { return cActivityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//links+=AbstractComponentLink*
		public Assignment getLinksAssignment_3() { return cLinksAssignment_3; }
		
		//AbstractComponentLink
		public RuleCall getLinksAbstractComponentLinkParserRuleCall_3_0() { return cLinksAbstractComponentLinkParserRuleCall_3_0; }
		
		//extensions+=ActivityExtension*
		public Assignment getExtensionsAssignment_4() { return cExtensionsAssignment_4; }
		
		//ActivityExtension
		public RuleCall getExtensionsActivityExtensionParserRuleCall_4_0() { return cExtensionsActivityExtensionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class InputHandlerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.InputHandler");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInputHandlerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cTriggeredFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInputPortAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cInputPortInputPortCrossReference_3_0 = (CrossReference)cInputPortAssignment_3.eContents().get(0);
		private final RuleCall cInputPortInputPortFQNParserRuleCall_3_0_1 = (RuleCall)cInputPortInputPortCrossReference_3_0.eContents().get(1);
		private final Assignment cActiveQueueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Keyword cActiveQueueActiveQueueKeyword_4_0 = (Keyword)cActiveQueueAssignment_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cLinksAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cLinksAbstractComponentLinkParserRuleCall_6_0 = (RuleCall)cLinksAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//InputHandler component::InputHandler:
		//	'InputHandler' name=ID 'triggeredFrom' inputPort=[component::InputPort|FQN] activeQueue?='activeQueue'? '{'
		//	links+=AbstractComponentLink*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'InputHandler' name=ID 'triggeredFrom' inputPort=[component::InputPort|FQN] activeQueue?='activeQueue'? '{'
		//links+=AbstractComponentLink* '}'
		public Group getGroup() { return cGroup; }
		
		//'InputHandler'
		public Keyword getInputHandlerKeyword_0() { return cInputHandlerKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'triggeredFrom'
		public Keyword getTriggeredFromKeyword_2() { return cTriggeredFromKeyword_2; }
		
		//inputPort=[component::InputPort|FQN]
		public Assignment getInputPortAssignment_3() { return cInputPortAssignment_3; }
		
		//[component::InputPort|FQN]
		public CrossReference getInputPortInputPortCrossReference_3_0() { return cInputPortInputPortCrossReference_3_0; }
		
		//FQN
		public RuleCall getInputPortInputPortFQNParserRuleCall_3_0_1() { return cInputPortInputPortFQNParserRuleCall_3_0_1; }
		
		//activeQueue?='activeQueue'?
		public Assignment getActiveQueueAssignment_4() { return cActiveQueueAssignment_4; }
		
		//'activeQueue'
		public Keyword getActiveQueueActiveQueueKeyword_4_0() { return cActiveQueueActiveQueueKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//links+=AbstractComponentLink*
		public Assignment getLinksAssignment_6() { return cLinksAssignment_6; }
		
		//AbstractComponentLink
		public RuleCall getLinksAbstractComponentLinkParserRuleCall_6_0() { return cLinksAbstractComponentLinkParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class RequestHandlerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.RequestHandler");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequestHandlerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cTriggeredFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAnswerPortAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cAnswerPortAnswerPortCrossReference_3_0 = (CrossReference)cAnswerPortAssignment_3.eContents().get(0);
		private final RuleCall cAnswerPortAnswerPortFQNParserRuleCall_3_0_1 = (RuleCall)cAnswerPortAnswerPortCrossReference_3_0.eContents().get(1);
		private final Assignment cActiveQueueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Keyword cActiveQueueActiveQueueKeyword_4_0 = (Keyword)cActiveQueueAssignment_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cLinksAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cLinksAbstractComponentLinkParserRuleCall_6_0 = (RuleCall)cLinksAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//RequestHandler component::RequestHandler:
		//	'RequestHandler' name=ID 'triggeredFrom' answerPort=[component::AnswerPort|FQN] activeQueue?='activeQueue'? '{'
		//	links+=AbstractComponentLink*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'RequestHandler' name=ID 'triggeredFrom' answerPort=[component::AnswerPort|FQN] activeQueue?='activeQueue'? '{'
		//links+=AbstractComponentLink* '}'
		public Group getGroup() { return cGroup; }
		
		//'RequestHandler'
		public Keyword getRequestHandlerKeyword_0() { return cRequestHandlerKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'triggeredFrom'
		public Keyword getTriggeredFromKeyword_2() { return cTriggeredFromKeyword_2; }
		
		//answerPort=[component::AnswerPort|FQN]
		public Assignment getAnswerPortAssignment_3() { return cAnswerPortAssignment_3; }
		
		//[component::AnswerPort|FQN]
		public CrossReference getAnswerPortAnswerPortCrossReference_3_0() { return cAnswerPortAnswerPortCrossReference_3_0; }
		
		//FQN
		public RuleCall getAnswerPortAnswerPortFQNParserRuleCall_3_0_1() { return cAnswerPortAnswerPortFQNParserRuleCall_3_0_1; }
		
		//activeQueue?='activeQueue'?
		public Assignment getActiveQueueAssignment_4() { return cActiveQueueAssignment_4; }
		
		//'activeQueue'
		public Keyword getActiveQueueActiveQueueKeyword_4_0() { return cActiveQueueActiveQueueKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//links+=AbstractComponentLink*
		public Assignment getLinksAssignment_6() { return cLinksAssignment_6; }
		
		//AbstractComponentLink
		public RuleCall getLinksAbstractComponentLinkParserRuleCall_6_0() { return cLinksAbstractComponentLinkParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class AbstractComponentLinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.AbstractComponentLink");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cComponentSubNodeObserverParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRequestPortLinkParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cInputLinkExtensionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cOpcUaClientLinkParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//AbstractComponentLink component::AbstractComponentLink:
		//	ComponentSubNodeObserver | RequestPortLink | InputLinkExtension | OpcUaClientLink;
		@Override public ParserRule getRule() { return rule; }
		
		//ComponentSubNodeObserver | RequestPortLink | InputLinkExtension | OpcUaClientLink
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ComponentSubNodeObserver
		public RuleCall getComponentSubNodeObserverParserRuleCall_0() { return cComponentSubNodeObserverParserRuleCall_0; }
		
		//RequestPortLink
		public RuleCall getRequestPortLinkParserRuleCall_1() { return cRequestPortLinkParserRuleCall_1; }
		
		//InputLinkExtension
		public RuleCall getInputLinkExtensionParserRuleCall_2() { return cInputLinkExtensionParserRuleCall_2; }
		
		//OpcUaClientLink
		public RuleCall getOpcUaClientLinkParserRuleCall_3() { return cOpcUaClientLinkParserRuleCall_3; }
	}
	public class RequestPortLinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.RequestPortLink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequestPortLinkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRequestPortAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRequestPortRequestPortCrossReference_1_0 = (CrossReference)cRequestPortAssignment_1.eContents().get(0);
		private final RuleCall cRequestPortRequestPortFQNParserRuleCall_1_0_1 = (RuleCall)cRequestPortRequestPortCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//RequestPortLink component::RequestPortLink:
		//	'RequestPortLink' requestPort=[component::RequestPort|FQN] ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'RequestPortLink' requestPort=[component::RequestPort|FQN] ';'?
		public Group getGroup() { return cGroup; }
		
		//'RequestPortLink'
		public Keyword getRequestPortLinkKeyword_0() { return cRequestPortLinkKeyword_0; }
		
		//requestPort=[component::RequestPort|FQN]
		public Assignment getRequestPortAssignment_1() { return cRequestPortAssignment_1; }
		
		//[component::RequestPort|FQN]
		public CrossReference getRequestPortRequestPortCrossReference_1_0() { return cRequestPortRequestPortCrossReference_1_0; }
		
		//FQN
		public RuleCall getRequestPortRequestPortFQNParserRuleCall_1_0_1() { return cRequestPortRequestPortFQNParserRuleCall_1_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class OpcUaClientLinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.OpcUaClientLink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOpcUaClientLinkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cClientAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cClientOpcUaDeviceClientCrossReference_1_0 = (CrossReference)cClientAssignment_1.eContents().get(0);
		private final RuleCall cClientOpcUaDeviceClientFQNParserRuleCall_1_0_1 = (RuleCall)cClientOpcUaDeviceClientCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//OpcUaClientLink seronet::OpcUaClientLink:
		//	'OpcUaClientLink' client=[seronet::OpcUaDeviceClient|FQN] ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'OpcUaClientLink' client=[seronet::OpcUaDeviceClient|FQN] ';'?
		public Group getGroup() { return cGroup; }
		
		//'OpcUaClientLink'
		public Keyword getOpcUaClientLinkKeyword_0() { return cOpcUaClientLinkKeyword_0; }
		
		//client=[seronet::OpcUaDeviceClient|FQN]
		public Assignment getClientAssignment_1() { return cClientAssignment_1; }
		
		//[seronet::OpcUaDeviceClient|FQN]
		public CrossReference getClientOpcUaDeviceClientCrossReference_1_0() { return cClientOpcUaDeviceClientCrossReference_1_0; }
		
		//FQN
		public RuleCall getClientOpcUaDeviceClientFQNParserRuleCall_1_0_1() { return cClientOpcUaDeviceClientFQNParserRuleCall_1_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class ComponentSubNodeObserverElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.ComponentSubNodeObserver");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cObserveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSubjectAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSubjectComponentSubNodeCrossReference_1_0 = (CrossReference)cSubjectAssignment_1.eContents().get(0);
		private final RuleCall cSubjectComponentSubNodeFQNParserRuleCall_1_0_1 = (RuleCall)cSubjectComponentSubNodeCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		///**
		// * Observer Pattern for component-internal activities<->upcalls interaction.
		// */ ComponentSubNodeObserver component::ComponentSubNodeObserver:
		//	'Observe' subject=[component::ComponentSubNode|FQN] ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'Observe' subject=[component::ComponentSubNode|FQN] ';'?
		public Group getGroup() { return cGroup; }
		
		//'Observe'
		public Keyword getObserveKeyword_0() { return cObserveKeyword_0; }
		
		//subject=[component::ComponentSubNode|FQN]
		public Assignment getSubjectAssignment_1() { return cSubjectAssignment_1; }
		
		//[component::ComponentSubNode|FQN]
		public CrossReference getSubjectComponentSubNodeCrossReference_1_0() { return cSubjectComponentSubNodeCrossReference_1_0; }
		
		//FQN
		public RuleCall getSubjectComponentSubNodeFQNParserRuleCall_1_0_1() { return cSubjectComponentSubNodeFQNParserRuleCall_1_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class InputLinkExtensionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.InputLinkExtension");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInputLinkExtensionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInputPortLinkKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cInputPortAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cInputPortInputPortCrossReference_2_0 = (CrossReference)cInputPortAssignment_2.eContents().get(0);
		private final RuleCall cInputPortInputPortFQNParserRuleCall_2_0_1 = (RuleCall)cInputPortInputPortCrossReference_2_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Assignment cOptionalAssignment_4_0 = (Assignment)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cOptionalOptionalKeyword_4_0_0 = (Keyword)cOptionalAssignment_4_0.eContents().get(0);
		private final Assignment cOversamplingOkAssignment_4_1 = (Assignment)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cOversamplingOkOversamplingOkKeyword_4_1_0 = (Keyword)cOversamplingOkAssignment_4_1.eContents().get(0);
		private final Assignment cUndersamplingOkAssignment_4_2 = (Assignment)cUnorderedGroup_4.eContents().get(2);
		private final Keyword cUndersamplingOkUndersamplingOkKeyword_4_2_0 = (Keyword)cUndersamplingOkAssignment_4_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		///**
		// * InputLink extension(s):
		// * - Performance: InputLinkExtension
		// */ InputLinkExtension performance::InputLinkExtension:
		//	{performance::InputLinkExtension}
		//	'InputPortLink' inputPort=[component::InputPort|FQN]
		//	'{' (optional?='optional'? & oversamplingOk?='oversamplingOk'? & undersamplingOk?='undersamplingOk'?)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{performance::InputLinkExtension} 'InputPortLink' inputPort=[component::InputPort|FQN] '{' (optional?='optional'? &
		//oversamplingOk?='oversamplingOk'? & undersamplingOk?='undersamplingOk'?) '}'
		public Group getGroup() { return cGroup; }
		
		//{performance::InputLinkExtension}
		public Action getInputLinkExtensionAction_0() { return cInputLinkExtensionAction_0; }
		
		//'InputPortLink'
		public Keyword getInputPortLinkKeyword_1() { return cInputPortLinkKeyword_1; }
		
		//inputPort=[component::InputPort|FQN]
		public Assignment getInputPortAssignment_2() { return cInputPortAssignment_2; }
		
		//[component::InputPort|FQN]
		public CrossReference getInputPortInputPortCrossReference_2_0() { return cInputPortInputPortCrossReference_2_0; }
		
		//FQN
		public RuleCall getInputPortInputPortFQNParserRuleCall_2_0_1() { return cInputPortInputPortFQNParserRuleCall_2_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//optional?='optional'? & oversamplingOk?='oversamplingOk'? & undersamplingOk?='undersamplingOk'?
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }
		
		//optional?='optional'?
		public Assignment getOptionalAssignment_4_0() { return cOptionalAssignment_4_0; }
		
		//'optional'
		public Keyword getOptionalOptionalKeyword_4_0_0() { return cOptionalOptionalKeyword_4_0_0; }
		
		//oversamplingOk?='oversamplingOk'?
		public Assignment getOversamplingOkAssignment_4_1() { return cOversamplingOkAssignment_4_1; }
		
		//'oversamplingOk'
		public Keyword getOversamplingOkOversamplingOkKeyword_4_1_0() { return cOversamplingOkOversamplingOkKeyword_4_1_0; }
		
		//undersamplingOk?='undersamplingOk'?
		public Assignment getUndersamplingOkAssignment_4_2() { return cUndersamplingOkAssignment_4_2; }
		
		//'undersamplingOk'
		public Keyword getUndersamplingOkUndersamplingOkKeyword_4_2_0() { return cUndersamplingOkUndersamplingOkKeyword_4_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ActivityExtensionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.ActivityExtension");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cActivationConstraintsParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOperationModeBindingParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDefaultTriggerParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		///** 
		// * Activity extensions:
		// * - Performance: ActivationConstraints
		// * - Coordination: OperationModeBinding
		// * - DefaultTrigger
		// */ ActivityExtension component::ActivityExtension:
		//	ActivationConstraints | OperationModeBinding | DefaultTrigger;
		@Override public ParserRule getRule() { return rule; }
		
		//ActivationConstraints | OperationModeBinding | DefaultTrigger
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ActivationConstraints
		public RuleCall getActivationConstraintsParserRuleCall_0() { return cActivationConstraintsParserRuleCall_0; }
		
		//OperationModeBinding
		public RuleCall getOperationModeBindingParserRuleCall_1() { return cOperationModeBindingParserRuleCall_1; }
		
		//DefaultTrigger
		public RuleCall getDefaultTriggerParserRuleCall_2() { return cDefaultTriggerParserRuleCall_2; }
	}
	public class ActivationConstraintsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.ActivationConstraints");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActivationConstraintsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cActivationConstraintsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cConfigurableKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cConfigurableAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cConfigurableEBooleanParserRuleCall_5_0 = (RuleCall)cConfigurableAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final UnorderedGroup cUnorderedGroup_7 = (UnorderedGroup)cGroup.eContents().get(7);
		private final Group cGroup_7_0 = (Group)cUnorderedGroup_7.eContents().get(0);
		private final Keyword cMinActFreqKeyword_7_0_0 = (Keyword)cGroup_7_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_7_0_1 = (Keyword)cGroup_7_0.eContents().get(1);
		private final Assignment cMinActFreqAssignment_7_0_2 = (Assignment)cGroup_7_0.eContents().get(2);
		private final RuleCall cMinActFreqEDoubleParserRuleCall_7_0_2_0 = (RuleCall)cMinActFreqAssignment_7_0_2.eContents().get(0);
		private final Keyword cHzKeyword_7_0_3 = (Keyword)cGroup_7_0.eContents().get(3);
		private final Keyword cSemicolonKeyword_7_0_4 = (Keyword)cGroup_7_0.eContents().get(4);
		private final Group cGroup_7_1 = (Group)cUnorderedGroup_7.eContents().get(1);
		private final Keyword cMaxActFreqKeyword_7_1_0 = (Keyword)cGroup_7_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_7_1_1 = (Keyword)cGroup_7_1.eContents().get(1);
		private final Assignment cMaxActFreqAssignment_7_1_2 = (Assignment)cGroup_7_1.eContents().get(2);
		private final RuleCall cMaxActFreqEDoubleParserRuleCall_7_1_2_0 = (RuleCall)cMaxActFreqAssignment_7_1_2.eContents().get(0);
		private final Keyword cHzKeyword_7_1_3 = (Keyword)cGroup_7_1.eContents().get(3);
		private final Keyword cSemicolonKeyword_7_1_4 = (Keyword)cGroup_7_1.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//ActivationConstraints performance::ActivationConstraints:
		//	{performance::ActivationConstraints}
		//	'ActivationConstraints'
		//	'{'
		//	'configurable' '=' configurable=EBoolean ';'? (('minActFreq' '=' minActFreq=EDouble 'Hz' ';'?)? & ('maxActFreq' '='
		//	maxActFreq=EDouble 'Hz' ';'?)?)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{performance::ActivationConstraints} 'ActivationConstraints' '{' 'configurable' '=' configurable=EBoolean ';'?
		//(('minActFreq' '=' minActFreq=EDouble 'Hz' ';'?)? & ('maxActFreq' '=' maxActFreq=EDouble 'Hz' ';'?)?) '}'
		public Group getGroup() { return cGroup; }
		
		//{performance::ActivationConstraints}
		public Action getActivationConstraintsAction_0() { return cActivationConstraintsAction_0; }
		
		//'ActivationConstraints'
		public Keyword getActivationConstraintsKeyword_1() { return cActivationConstraintsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'configurable'
		public Keyword getConfigurableKeyword_3() { return cConfigurableKeyword_3; }
		
		//'='
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }
		
		//configurable=EBoolean
		public Assignment getConfigurableAssignment_5() { return cConfigurableAssignment_5; }
		
		//EBoolean
		public RuleCall getConfigurableEBooleanParserRuleCall_5_0() { return cConfigurableEBooleanParserRuleCall_5_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
		
		//('minActFreq' '=' minActFreq=EDouble 'Hz' ';'?)? & ('maxActFreq' '=' maxActFreq=EDouble 'Hz' ';'?)?
		public UnorderedGroup getUnorderedGroup_7() { return cUnorderedGroup_7; }
		
		//('minActFreq' '=' minActFreq=EDouble 'Hz' ';'?)?
		public Group getGroup_7_0() { return cGroup_7_0; }
		
		//'minActFreq'
		public Keyword getMinActFreqKeyword_7_0_0() { return cMinActFreqKeyword_7_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_7_0_1() { return cEqualsSignKeyword_7_0_1; }
		
		//minActFreq=EDouble
		public Assignment getMinActFreqAssignment_7_0_2() { return cMinActFreqAssignment_7_0_2; }
		
		//EDouble
		public RuleCall getMinActFreqEDoubleParserRuleCall_7_0_2_0() { return cMinActFreqEDoubleParserRuleCall_7_0_2_0; }
		
		//'Hz'
		public Keyword getHzKeyword_7_0_3() { return cHzKeyword_7_0_3; }
		
		//';'?
		public Keyword getSemicolonKeyword_7_0_4() { return cSemicolonKeyword_7_0_4; }
		
		//('maxActFreq' '=' maxActFreq=EDouble 'Hz' ';'?)?
		public Group getGroup_7_1() { return cGroup_7_1; }
		
		//'maxActFreq'
		public Keyword getMaxActFreqKeyword_7_1_0() { return cMaxActFreqKeyword_7_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_7_1_1() { return cEqualsSignKeyword_7_1_1; }
		
		//maxActFreq=EDouble
		public Assignment getMaxActFreqAssignment_7_1_2() { return cMaxActFreqAssignment_7_1_2; }
		
		//EDouble
		public RuleCall getMaxActFreqEDoubleParserRuleCall_7_1_2_0() { return cMaxActFreqEDoubleParserRuleCall_7_1_2_0; }
		
		//'Hz'
		public Keyword getHzKeyword_7_1_3() { return cHzKeyword_7_1_3; }
		
		//';'?
		public Keyword getSemicolonKeyword_7_1_4() { return cSemicolonKeyword_7_1_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class OperationModeBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.OperationModeBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOperationModeBindingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cModeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cModePrivateOperationModeCrossReference_1_0 = (CrossReference)cModeAssignment_1.eContents().get(0);
		private final RuleCall cModePrivateOperationModeFQNParserRuleCall_1_0_1 = (RuleCall)cModePrivateOperationModeCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//OperationModeBinding coordination::OperationModeBinding:
		//	'OperationModeBinding' mode=[coordination::PrivateOperationMode|FQN] ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'OperationModeBinding' mode=[coordination::PrivateOperationMode|FQN] ';'?
		public Group getGroup() { return cGroup; }
		
		//'OperationModeBinding'
		public Keyword getOperationModeBindingKeyword_0() { return cOperationModeBindingKeyword_0; }
		
		//mode=[coordination::PrivateOperationMode|FQN]
		public Assignment getModeAssignment_1() { return cModeAssignment_1; }
		
		//[coordination::PrivateOperationMode|FQN]
		public CrossReference getModePrivateOperationModeCrossReference_1_0() { return cModePrivateOperationModeCrossReference_1_0; }
		
		//FQN
		public RuleCall getModePrivateOperationModeFQNParserRuleCall_1_0_1() { return cModePrivateOperationModeFQNParserRuleCall_1_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class DefaultTriggerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.DefaultTrigger");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefaultTriggerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cDefaultInputTriggerParserRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cDefaultPeriodicTimerParserRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final RuleCall cDefaultObservedElementTriggerParserRuleCall_1_2 = (RuleCall)cAlternatives_1.eContents().get(2);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DefaultTrigger performance::DefaultTrigger:
		//	'DefaultTrigger' (DefaultInputTrigger | DefaultPeriodicTimer | DefaultObservedElementTrigger) ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'DefaultTrigger' (DefaultInputTrigger | DefaultPeriodicTimer | DefaultObservedElementTrigger) ';'?
		public Group getGroup() { return cGroup; }
		
		//'DefaultTrigger'
		public Keyword getDefaultTriggerKeyword_0() { return cDefaultTriggerKeyword_0; }
		
		//DefaultInputTrigger | DefaultPeriodicTimer | DefaultObservedElementTrigger
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//DefaultInputTrigger
		public RuleCall getDefaultInputTriggerParserRuleCall_1_0() { return cDefaultInputTriggerParserRuleCall_1_0; }
		
		//DefaultPeriodicTimer
		public RuleCall getDefaultPeriodicTimerParserRuleCall_1_1() { return cDefaultPeriodicTimerParserRuleCall_1_1; }
		
		//DefaultObservedElementTrigger
		public RuleCall getDefaultObservedElementTriggerParserRuleCall_1_2() { return cDefaultObservedElementTriggerParserRuleCall_1_2; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class DefaultInputTriggerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.DefaultInputTrigger");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInputPortTriggerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cInputLinkAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cInputLinkInputLinkExtensionCrossReference_1_0 = (CrossReference)cInputLinkAssignment_1.eContents().get(0);
		private final RuleCall cInputLinkInputLinkExtensionFQNParserRuleCall_1_0_1 = (RuleCall)cInputLinkInputLinkExtensionCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cPrescaleKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cPrescaleAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cPrescaleEIntParserRuleCall_2_1_0 = (RuleCall)cPrescaleAssignment_2_1.eContents().get(0);
		
		//DefaultInputTrigger performance::DefaultInputTrigger:
		//	'InputPortTrigger' inputLink=[performance::InputLinkExtension|FQN] ('prescale' prescale=EInt)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'InputPortTrigger' inputLink=[performance::InputLinkExtension|FQN] ('prescale' prescale=EInt)?
		public Group getGroup() { return cGroup; }
		
		//'InputPortTrigger'
		public Keyword getInputPortTriggerKeyword_0() { return cInputPortTriggerKeyword_0; }
		
		//inputLink=[performance::InputLinkExtension|FQN]
		public Assignment getInputLinkAssignment_1() { return cInputLinkAssignment_1; }
		
		//[performance::InputLinkExtension|FQN]
		public CrossReference getInputLinkInputLinkExtensionCrossReference_1_0() { return cInputLinkInputLinkExtensionCrossReference_1_0; }
		
		//FQN
		public RuleCall getInputLinkInputLinkExtensionFQNParserRuleCall_1_0_1() { return cInputLinkInputLinkExtensionFQNParserRuleCall_1_0_1; }
		
		//('prescale' prescale=EInt)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'prescale'
		public Keyword getPrescaleKeyword_2_0() { return cPrescaleKeyword_2_0; }
		
		//prescale=EInt
		public Assignment getPrescaleAssignment_2_1() { return cPrescaleAssignment_2_1; }
		
		//EInt
		public RuleCall getPrescaleEIntParserRuleCall_2_1_0() { return cPrescaleEIntParserRuleCall_2_1_0; }
	}
	public class DefaultPeriodicTimerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.DefaultPeriodicTimer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPeriodicTimerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPeriodicActFreqAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPeriodicActFreqEDoubleParserRuleCall_1_0 = (RuleCall)cPeriodicActFreqAssignment_1.eContents().get(0);
		private final Keyword cHzKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DefaultPeriodicTimer performance::DefaultPeriodicTimer:
		//	'PeriodicTimer' periodicActFreq=EDouble 'Hz';
		@Override public ParserRule getRule() { return rule; }
		
		//'PeriodicTimer' periodicActFreq=EDouble 'Hz'
		public Group getGroup() { return cGroup; }
		
		//'PeriodicTimer'
		public Keyword getPeriodicTimerKeyword_0() { return cPeriodicTimerKeyword_0; }
		
		//periodicActFreq=EDouble
		public Assignment getPeriodicActFreqAssignment_1() { return cPeriodicActFreqAssignment_1; }
		
		//EDouble
		public RuleCall getPeriodicActFreqEDoubleParserRuleCall_1_0() { return cPeriodicActFreqEDoubleParserRuleCall_1_0; }
		
		//'Hz'
		public Keyword getHzKeyword_2() { return cHzKeyword_2; }
	}
	public class DefaultObservedElementTriggerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.DefaultObservedElementTrigger");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cObservedElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cElementComponentSubNodeCrossReference_1_0 = (CrossReference)cElementAssignment_1.eContents().get(0);
		private final RuleCall cElementComponentSubNodeFQNParserRuleCall_1_0_1 = (RuleCall)cElementComponentSubNodeCrossReference_1_0.eContents().get(1);
		
		//DefaultObservedElementTrigger performance::DefaultObservedElementTrigger:
		//	'ObservedElement' element=[component::ComponentSubNode|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//'ObservedElement' element=[component::ComponentSubNode|FQN]
		public Group getGroup() { return cGroup; }
		
		//'ObservedElement'
		public Keyword getObservedElementKeyword_0() { return cObservedElementKeyword_0; }
		
		//element=[component::ComponentSubNode|FQN]
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//[component::ComponentSubNode|FQN]
		public CrossReference getElementComponentSubNodeCrossReference_1_0() { return cElementComponentSubNodeCrossReference_1_0; }
		
		//FQN
		public RuleCall getElementComponentSubNodeFQNParserRuleCall_1_0_1() { return cElementComponentSubNodeFQNParserRuleCall_1_0_1; }
	}
	public class PlainOpcUaPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.PlainOpcUaPort");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cOpcUaDeviceClientParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOpcUaReadServerParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//PlainOpcUaPort seronet::PlainOpcUaPort:
		//	OpcUaDeviceClient | OpcUaReadServer;
		@Override public ParserRule getRule() { return rule; }
		
		//OpcUaDeviceClient | OpcUaReadServer
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//OpcUaDeviceClient
		public RuleCall getOpcUaDeviceClientParserRuleCall_0() { return cOpcUaDeviceClientParserRuleCall_0; }
		
		//OpcUaReadServer
		public RuleCall getOpcUaReadServerParserRuleCall_1() { return cOpcUaReadServerParserRuleCall_1; }
	}
	public class OpcUaDeviceClientElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.OpcUaDeviceClient");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOpcUaDeviceClientKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_2 = (UnorderedGroup)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cUnorderedGroup_2.eContents().get(0);
		private final Keyword cDeviceURIKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cDeviceURIAssignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cDeviceURIEStringParserRuleCall_2_0_1_0 = (RuleCall)cDeviceURIAssignment_2_0_1.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cUnorderedGroup_2.eContents().get(1);
		private final Keyword cOpcuaXmlFileKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cOpcuaXmlFileAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cOpcuaXmlFileEStringParserRuleCall_2_1_1_0 = (RuleCall)cOpcuaXmlFileAssignment_2_1_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//OpcUaDeviceClient seronet::OpcUaDeviceClient:
		//	'OpcUaDeviceClient' name=ID ('deviceURI' deviceURI=EString & ('opcuaXmlFile' opcuaXmlFile=EString)?) ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'OpcUaDeviceClient' name=ID ('deviceURI' deviceURI=EString & ('opcuaXmlFile' opcuaXmlFile=EString)?) ';'?
		public Group getGroup() { return cGroup; }
		
		//'OpcUaDeviceClient'
		public Keyword getOpcUaDeviceClientKeyword_0() { return cOpcUaDeviceClientKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'deviceURI' deviceURI=EString & ('opcuaXmlFile' opcuaXmlFile=EString)?
		public UnorderedGroup getUnorderedGroup_2() { return cUnorderedGroup_2; }
		
		//'deviceURI' deviceURI=EString
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'deviceURI'
		public Keyword getDeviceURIKeyword_2_0_0() { return cDeviceURIKeyword_2_0_0; }
		
		//deviceURI=EString
		public Assignment getDeviceURIAssignment_2_0_1() { return cDeviceURIAssignment_2_0_1; }
		
		//EString
		public RuleCall getDeviceURIEStringParserRuleCall_2_0_1_0() { return cDeviceURIEStringParserRuleCall_2_0_1_0; }
		
		//('opcuaXmlFile' opcuaXmlFile=EString)?
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'opcuaXmlFile'
		public Keyword getOpcuaXmlFileKeyword_2_1_0() { return cOpcuaXmlFileKeyword_2_1_0; }
		
		//opcuaXmlFile=EString
		public Assignment getOpcuaXmlFileAssignment_2_1_1() { return cOpcuaXmlFileAssignment_2_1_1; }
		
		//EString
		public RuleCall getOpcuaXmlFileEStringParserRuleCall_2_1_1_0() { return cOpcuaXmlFileEStringParserRuleCall_2_1_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class OpcUaReadServerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.OpcUaReadServer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOpcUaReadServerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cDataProviderPortKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cOutPortAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cOutPortOutputPortCrossReference_3_0 = (CrossReference)cOutPortAssignment_3.eContents().get(0);
		private final RuleCall cOutPortOutputPortFQNParserRuleCall_3_0_1 = (RuleCall)cOutPortOutputPortCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPortNumberKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPortNumberAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPortNumberEIntParserRuleCall_4_1_0 = (RuleCall)cPortNumberAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//OpcUaReadServer seronet::OpcUaReadServer:
		//	'OpcUaReadServer' name=ID 'dataProviderPort' outPort=[component::OutputPort|FQN] ('portNumber' portNumber=EInt)? ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'OpcUaReadServer' name=ID 'dataProviderPort' outPort=[component::OutputPort|FQN] ('portNumber' portNumber=EInt)? ';'?
		public Group getGroup() { return cGroup; }
		
		//'OpcUaReadServer'
		public Keyword getOpcUaReadServerKeyword_0() { return cOpcUaReadServerKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'dataProviderPort'
		public Keyword getDataProviderPortKeyword_2() { return cDataProviderPortKeyword_2; }
		
		//outPort=[component::OutputPort|FQN]
		public Assignment getOutPortAssignment_3() { return cOutPortAssignment_3; }
		
		//[component::OutputPort|FQN]
		public CrossReference getOutPortOutputPortCrossReference_3_0() { return cOutPortOutputPortCrossReference_3_0; }
		
		//FQN
		public RuleCall getOutPortOutputPortFQNParserRuleCall_3_0_1() { return cOutPortOutputPortFQNParserRuleCall_3_0_1; }
		
		//('portNumber' portNumber=EInt)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'portNumber'
		public Keyword getPortNumberKeyword_4_0() { return cPortNumberKeyword_4_0; }
		
		//portNumber=EInt
		public Assignment getPortNumberAssignment_4_1() { return cPortNumberAssignment_4_1; }
		
		//EInt
		public RuleCall getPortNumberEIntParserRuleCall_4_1_0() { return cPortNumberEIntParserRuleCall_4_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class CoordinationSlavePortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.CoordinationSlavePort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCoordinationSlavePortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cImplementsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cServiceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cServiceCoordinationServiceDefinitionCrossReference_3_0 = (CrossReference)cServiceAssignment_3.eContents().get(0);
		private final RuleCall cServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1 = (RuleCall)cServiceCoordinationServiceDefinitionCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cElementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cElementsAbstractCoordinationElementParserRuleCall_5_0 = (RuleCall)cElementsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//CoordinationSlavePort coordination::CoordinationSlavePort:
		//	'CoordinationSlavePort' name=ID 'implements' service=[serviceDefinition::CoordinationServiceDefinition|FQN] '{'
		//	elements+=AbstractCoordinationElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'CoordinationSlavePort' name=ID 'implements' service=[serviceDefinition::CoordinationServiceDefinition|FQN] '{'
		//elements+=AbstractCoordinationElement* '}'
		public Group getGroup() { return cGroup; }
		
		//'CoordinationSlavePort'
		public Keyword getCoordinationSlavePortKeyword_0() { return cCoordinationSlavePortKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'implements'
		public Keyword getImplementsKeyword_2() { return cImplementsKeyword_2; }
		
		//service=[serviceDefinition::CoordinationServiceDefinition|FQN]
		public Assignment getServiceAssignment_3() { return cServiceAssignment_3; }
		
		//[serviceDefinition::CoordinationServiceDefinition|FQN]
		public CrossReference getServiceCoordinationServiceDefinitionCrossReference_3_0() { return cServiceCoordinationServiceDefinitionCrossReference_3_0; }
		
		//FQN
		public RuleCall getServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1() { return cServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//elements+=AbstractCoordinationElement*
		public Assignment getElementsAssignment_5() { return cElementsAssignment_5; }
		
		//AbstractCoordinationElement
		public RuleCall getElementsAbstractCoordinationElementParserRuleCall_5_0() { return cElementsAbstractCoordinationElementParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class AbstractCoordinationElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.AbstractCoordinationElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPublicOperationModeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cPrivateOperationModeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCommunicationServiceUsageRealizationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cSkillRealizationsRefParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//AbstractCoordinationElement coordination::AbstractCoordinationElement:
		//	PublicOperationMode | PrivateOperationMode | CommunicationServiceUsageRealization | SkillRealizationsRef;
		@Override public ParserRule getRule() { return rule; }
		
		//PublicOperationMode | PrivateOperationMode | CommunicationServiceUsageRealization | SkillRealizationsRef
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PublicOperationMode
		public RuleCall getPublicOperationModeParserRuleCall_0() { return cPublicOperationModeParserRuleCall_0; }
		
		//PrivateOperationMode
		public RuleCall getPrivateOperationModeParserRuleCall_1() { return cPrivateOperationModeParserRuleCall_1; }
		
		//CommunicationServiceUsageRealization
		public RuleCall getCommunicationServiceUsageRealizationParserRuleCall_2() { return cCommunicationServiceUsageRealizationParserRuleCall_2; }
		
		//SkillRealizationsRef
		public RuleCall getSkillRealizationsRefParserRuleCall_3() { return cSkillRealizationsRefParserRuleCall_3; }
	}
	public class SkillRealizationsRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.SkillRealizationsRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSkillRealizationsRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSkillRealizationCoordModuleRefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSkillRealizationCoordModuleRefCoordinationModuleRealizationCrossReference_1_0 = (CrossReference)cSkillRealizationCoordModuleRefAssignment_1.eContents().get(0);
		private final RuleCall cSkillRealizationCoordModuleRefCoordinationModuleRealizationFQNParserRuleCall_1_0_1 = (RuleCall)cSkillRealizationCoordModuleRefCoordinationModuleRealizationCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//SkillRealizationsRef coordination::SkillRealizationsRef:
		//	'SkillRealizationsRef' skillRealizationCoordModuleRef=[skillRealization::CoordinationModuleRealization|FQN] ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'SkillRealizationsRef' skillRealizationCoordModuleRef=[skillRealization::CoordinationModuleRealization|FQN] ';'?
		public Group getGroup() { return cGroup; }
		
		//'SkillRealizationsRef'
		public Keyword getSkillRealizationsRefKeyword_0() { return cSkillRealizationsRefKeyword_0; }
		
		//skillRealizationCoordModuleRef=[skillRealization::CoordinationModuleRealization|FQN]
		public Assignment getSkillRealizationCoordModuleRefAssignment_1() { return cSkillRealizationCoordModuleRefAssignment_1; }
		
		//[skillRealization::CoordinationModuleRealization|FQN]
		public CrossReference getSkillRealizationCoordModuleRefCoordinationModuleRealizationCrossReference_1_0() { return cSkillRealizationCoordModuleRefCoordinationModuleRealizationCrossReference_1_0; }
		
		//FQN
		public RuleCall getSkillRealizationCoordModuleRefCoordinationModuleRealizationFQNParserRuleCall_1_0_1() { return cSkillRealizationCoordModuleRefCoordinationModuleRealizationFQNParserRuleCall_1_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class CommunicationServiceUsageRealizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.CommunicationServiceUsageRealization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWithKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cServiceUsageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cServiceUsageCommunicationServiceUsageCrossReference_1_0 = (CrossReference)cServiceUsageAssignment_1.eContents().get(0);
		private final RuleCall cServiceUsageCommunicationServiceUsageFQNParserRuleCall_1_0_1 = (RuleCall)cServiceUsageCommunicationServiceUsageCrossReference_1_0.eContents().get(1);
		private final Keyword cRealizedByKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cComponentPortAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cComponentPortComponentPortCrossReference_3_0 = (CrossReference)cComponentPortAssignment_3.eContents().get(0);
		private final RuleCall cComponentPortComponentPortFQNParserRuleCall_3_0_1 = (RuleCall)cComponentPortComponentPortCrossReference_3_0.eContents().get(1);
		
		//CommunicationServiceUsageRealization coordination::CommunicationServiceUsageRealization:
		//	'with' serviceUsage=[serviceDefinition::CommunicationServiceUsage|FQN] 'realizedBy'
		//	componentPort=[component::ComponentPort|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//'with' serviceUsage=[serviceDefinition::CommunicationServiceUsage|FQN] 'realizedBy'
		//componentPort=[component::ComponentPort|FQN]
		public Group getGroup() { return cGroup; }
		
		//'with'
		public Keyword getWithKeyword_0() { return cWithKeyword_0; }
		
		//serviceUsage=[serviceDefinition::CommunicationServiceUsage|FQN]
		public Assignment getServiceUsageAssignment_1() { return cServiceUsageAssignment_1; }
		
		//[serviceDefinition::CommunicationServiceUsage|FQN]
		public CrossReference getServiceUsageCommunicationServiceUsageCrossReference_1_0() { return cServiceUsageCommunicationServiceUsageCrossReference_1_0; }
		
		//FQN
		public RuleCall getServiceUsageCommunicationServiceUsageFQNParserRuleCall_1_0_1() { return cServiceUsageCommunicationServiceUsageFQNParserRuleCall_1_0_1; }
		
		//'realizedBy'
		public Keyword getRealizedByKeyword_2() { return cRealizedByKeyword_2; }
		
		//componentPort=[component::ComponentPort|FQN]
		public Assignment getComponentPortAssignment_3() { return cComponentPortAssignment_3; }
		
		//[component::ComponentPort|FQN]
		public CrossReference getComponentPortComponentPortCrossReference_3_0() { return cComponentPortComponentPortCrossReference_3_0; }
		
		//FQN
		public RuleCall getComponentPortComponentPortFQNParserRuleCall_3_0_1() { return cComponentPortComponentPortFQNParserRuleCall_3_0_1; }
	}
	public class PublicOperationModeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.PublicOperationMode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPublicOperationModeAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cIsDefaultInitAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cIsDefaultInitDefaultKeyword_1_0 = (Keyword)cIsDefaultInitAssignment_1.eContents().get(0);
		private final Keyword cPublicOperationModeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cModeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cModeComponentModeDefinitionCrossReference_3_0 = (CrossReference)cModeAssignment_3.eContents().get(0);
		private final RuleCall cModeComponentModeDefinitionFQNParserRuleCall_3_0_1 = (RuleCall)cModeComponentModeDefinitionCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cActivatesKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cActivatesAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final CrossReference cActivatesPrivateOperationModeCrossReference_5_2_0 = (CrossReference)cActivatesAssignment_5_2.eContents().get(0);
		private final RuleCall cActivatesPrivateOperationModeIDTerminalRuleCall_5_2_0_1 = (RuleCall)cActivatesPrivateOperationModeCrossReference_5_2_0.eContents().get(1);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cActivatesAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final CrossReference cActivatesPrivateOperationModeCrossReference_5_3_1_0 = (CrossReference)cActivatesAssignment_5_3_1.eContents().get(0);
		private final RuleCall cActivatesPrivateOperationModeIDTerminalRuleCall_5_3_1_0_1 = (RuleCall)cActivatesPrivateOperationModeCrossReference_5_3_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//PublicOperationMode coordination::PublicOperationMode:
		//	{coordination::PublicOperationMode} isDefaultInit?='default'? 'PublicOperationMode'
		//	mode=[modes::ComponentModeDefinition|FQN] '{' ('activates' '(' activates+=[coordination::PrivateOperationMode] (','
		//	activates+=[coordination::PrivateOperationMode])* ')')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{coordination::PublicOperationMode} isDefaultInit?='default'? 'PublicOperationMode'
		//mode=[modes::ComponentModeDefinition|FQN] '{' ('activates' '(' activates+=[coordination::PrivateOperationMode] (','
		//activates+=[coordination::PrivateOperationMode])* ')')? '}'
		public Group getGroup() { return cGroup; }
		
		//{coordination::PublicOperationMode}
		public Action getPublicOperationModeAction_0() { return cPublicOperationModeAction_0; }
		
		//isDefaultInit?='default'?
		public Assignment getIsDefaultInitAssignment_1() { return cIsDefaultInitAssignment_1; }
		
		//'default'
		public Keyword getIsDefaultInitDefaultKeyword_1_0() { return cIsDefaultInitDefaultKeyword_1_0; }
		
		//'PublicOperationMode'
		public Keyword getPublicOperationModeKeyword_2() { return cPublicOperationModeKeyword_2; }
		
		//mode=[modes::ComponentModeDefinition|FQN]
		public Assignment getModeAssignment_3() { return cModeAssignment_3; }
		
		//[modes::ComponentModeDefinition|FQN]
		public CrossReference getModeComponentModeDefinitionCrossReference_3_0() { return cModeComponentModeDefinitionCrossReference_3_0; }
		
		//FQN
		public RuleCall getModeComponentModeDefinitionFQNParserRuleCall_3_0_1() { return cModeComponentModeDefinitionFQNParserRuleCall_3_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//('activates' '(' activates+=[coordination::PrivateOperationMode] (',' activates+=[coordination::PrivateOperationMode])*
		//')')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'activates'
		public Keyword getActivatesKeyword_5_0() { return cActivatesKeyword_5_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5_1() { return cLeftParenthesisKeyword_5_1; }
		
		//activates+=[coordination::PrivateOperationMode]
		public Assignment getActivatesAssignment_5_2() { return cActivatesAssignment_5_2; }
		
		//[coordination::PrivateOperationMode]
		public CrossReference getActivatesPrivateOperationModeCrossReference_5_2_0() { return cActivatesPrivateOperationModeCrossReference_5_2_0; }
		
		//ID
		public RuleCall getActivatesPrivateOperationModeIDTerminalRuleCall_5_2_0_1() { return cActivatesPrivateOperationModeIDTerminalRuleCall_5_2_0_1; }
		
		//(',' activates+=[coordination::PrivateOperationMode])*
		public Group getGroup_5_3() { return cGroup_5_3; }
		
		//','
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }
		
		//activates+=[coordination::PrivateOperationMode]
		public Assignment getActivatesAssignment_5_3_1() { return cActivatesAssignment_5_3_1; }
		
		//[coordination::PrivateOperationMode]
		public CrossReference getActivatesPrivateOperationModeCrossReference_5_3_1_0() { return cActivatesPrivateOperationModeCrossReference_5_3_1_0; }
		
		//ID
		public RuleCall getActivatesPrivateOperationModeIDTerminalRuleCall_5_3_1_0_1() { return cActivatesPrivateOperationModeIDTerminalRuleCall_5_3_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5_4() { return cRightParenthesisKeyword_5_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class PrivateOperationModeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.PrivateOperationMode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPrivateOperationModeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//PrivateOperationMode coordination::PrivateOperationMode:
		//	'PrivateOperationMode' name=ID ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'PrivateOperationMode' name=ID ';'?
		public Group getGroup() { return cGroup; }
		
		//'PrivateOperationMode'
		public Keyword getPrivateOperationModeKeyword_0() { return cPrivateOperationModeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class CoordinationMasterPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.CoordinationMasterPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCoordinationMasterPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cImplementsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cServiceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cServiceCoordinationServiceDefinitionCrossReference_3_0 = (CrossReference)cServiceAssignment_3.eContents().get(0);
		private final RuleCall cServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1 = (RuleCall)cServiceCoordinationServiceDefinitionCrossReference_3_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//CoordinationMasterPort coordination::CoordinationMasterPort:
		//	'CoordinationMasterPort' name=ID 'implements' service=[serviceDefinition::CoordinationServiceDefinition|FQN] ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'CoordinationMasterPort' name=ID 'implements' service=[serviceDefinition::CoordinationServiceDefinition|FQN] ';'?
		public Group getGroup() { return cGroup; }
		
		//'CoordinationMasterPort'
		public Keyword getCoordinationMasterPortKeyword_0() { return cCoordinationMasterPortKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'implements'
		public Keyword getImplementsKeyword_2() { return cImplementsKeyword_2; }
		
		//service=[serviceDefinition::CoordinationServiceDefinition|FQN]
		public Assignment getServiceAssignment_3() { return cServiceAssignment_3; }
		
		//[serviceDefinition::CoordinationServiceDefinition|FQN]
		public CrossReference getServiceCoordinationServiceDefinitionCrossReference_3_0() { return cServiceCoordinationServiceDefinitionCrossReference_3_0; }
		
		//FQN
		public RuleCall getServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1() { return cServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class ComponentParametersRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.component.componentDefinition.ComponentDefinition.ComponentParametersRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentParametersKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParameterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cParameterComponentParameterCrossReference_1_0 = (CrossReference)cParameterAssignment_1.eContents().get(0);
		private final RuleCall cParameterComponentParameterFQNParserRuleCall_1_0_1 = (RuleCall)cParameterComponentParameterCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cSlaveKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSlaveAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSlaveCoordinationSlavePortCrossReference_2_1_0 = (CrossReference)cSlaveAssignment_2_1.eContents().get(0);
		private final RuleCall cSlaveCoordinationSlavePortFQNParserRuleCall_2_1_0_1 = (RuleCall)cSlaveCoordinationSlavePortCrossReference_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ComponentParametersRef parameter::ComponentParametersRef:
		//	'ComponentParameters' parameter=[parameter::ComponentParameter|FQN] ('slave'
		//	slave=[coordination::CoordinationSlavePort|FQN])? ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'ComponentParameters' parameter=[parameter::ComponentParameter|FQN] ('slave'
		//slave=[coordination::CoordinationSlavePort|FQN])? ';'?
		public Group getGroup() { return cGroup; }
		
		//'ComponentParameters'
		public Keyword getComponentParametersKeyword_0() { return cComponentParametersKeyword_0; }
		
		//parameter=[parameter::ComponentParameter|FQN]
		public Assignment getParameterAssignment_1() { return cParameterAssignment_1; }
		
		//[parameter::ComponentParameter|FQN]
		public CrossReference getParameterComponentParameterCrossReference_1_0() { return cParameterComponentParameterCrossReference_1_0; }
		
		//FQN
		public RuleCall getParameterComponentParameterFQNParserRuleCall_1_0_1() { return cParameterComponentParameterFQNParserRuleCall_1_0_1; }
		
		//('slave' slave=[coordination::CoordinationSlavePort|FQN])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'slave'
		public Keyword getSlaveKeyword_2_0() { return cSlaveKeyword_2_0; }
		
		//slave=[coordination::CoordinationSlavePort|FQN]
		public Assignment getSlaveAssignment_2_1() { return cSlaveAssignment_2_1; }
		
		//[coordination::CoordinationSlavePort|FQN]
		public CrossReference getSlaveCoordinationSlavePortCrossReference_2_1_0() { return cSlaveCoordinationSlavePortCrossReference_2_1_0; }
		
		//FQN
		public RuleCall getSlaveCoordinationSlavePortFQNParserRuleCall_2_1_0_1() { return cSlaveCoordinationSlavePortFQNParserRuleCall_2_1_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	
	
	private final ComponentDefModelElements pComponentDefModel;
	private final ServiceRepoImportElements pServiceRepoImport;
	private final ComponentDefinitionElements pComponentDefinition;
	private final AbstractComponentElementElements pAbstractComponentElement;
	private final DerivedComponentElementElements pDerivedComponentElement;
	private final NamedComponentElementElements pNamedComponentElement;
	private final ComponentSubNodeElements pComponentSubNode;
	private final ComponentPortElements pComponentPort;
	private final RequestPortElements pRequestPort;
	private final OutputPortElements pOutputPort;
	private final AnswerPortElements pAnswerPort;
	private final InputPortElements pInputPort;
	private final ComponentPortExtensionElements pComponentPortExtension;
	private final SupportedMiddlewareElements pSupportedMiddleware;
	private final ActivityElements pActivity;
	private final InputHandlerElements pInputHandler;
	private final RequestHandlerElements pRequestHandler;
	private final AbstractComponentLinkElements pAbstractComponentLink;
	private final RequestPortLinkElements pRequestPortLink;
	private final OpcUaClientLinkElements pOpcUaClientLink;
	private final ComponentSubNodeObserverElements pComponentSubNodeObserver;
	private final InputLinkExtensionElements pInputLinkExtension;
	private final ActivityExtensionElements pActivityExtension;
	private final ActivationConstraintsElements pActivationConstraints;
	private final OperationModeBindingElements pOperationModeBinding;
	private final DefaultTriggerElements pDefaultTrigger;
	private final DefaultInputTriggerElements pDefaultInputTrigger;
	private final DefaultPeriodicTimerElements pDefaultPeriodicTimer;
	private final DefaultObservedElementTriggerElements pDefaultObservedElementTrigger;
	private final PlainOpcUaPortElements pPlainOpcUaPort;
	private final OpcUaDeviceClientElements pOpcUaDeviceClient;
	private final OpcUaReadServerElements pOpcUaReadServer;
	private final CoordinationSlavePortElements pCoordinationSlavePort;
	private final AbstractCoordinationElementElements pAbstractCoordinationElement;
	private final SkillRealizationsRefElements pSkillRealizationsRef;
	private final CommunicationServiceUsageRealizationElements pCommunicationServiceUsageRealization;
	private final PublicOperationModeElements pPublicOperationMode;
	private final PrivateOperationModeElements pPrivateOperationMode;
	private final CoordinationMasterPortElements pCoordinationMasterPort;
	private final ComponentParametersRefElements pComponentParametersRef;
	
	private final Grammar grammar;
	
	private final RoboticMiddlewareGrammarAccess gaRoboticMiddleware;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ComponentDefinitionGrammarAccess(GrammarProvider grammarProvider,
			RoboticMiddlewareGrammarAccess gaRoboticMiddleware,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaRoboticMiddleware = gaRoboticMiddleware;
		this.gaTerminals = gaTerminals;
		this.pComponentDefModel = new ComponentDefModelElements();
		this.pServiceRepoImport = new ServiceRepoImportElements();
		this.pComponentDefinition = new ComponentDefinitionElements();
		this.pAbstractComponentElement = new AbstractComponentElementElements();
		this.pDerivedComponentElement = new DerivedComponentElementElements();
		this.pNamedComponentElement = new NamedComponentElementElements();
		this.pComponentSubNode = new ComponentSubNodeElements();
		this.pComponentPort = new ComponentPortElements();
		this.pRequestPort = new RequestPortElements();
		this.pOutputPort = new OutputPortElements();
		this.pAnswerPort = new AnswerPortElements();
		this.pInputPort = new InputPortElements();
		this.pComponentPortExtension = new ComponentPortExtensionElements();
		this.pSupportedMiddleware = new SupportedMiddlewareElements();
		this.pActivity = new ActivityElements();
		this.pInputHandler = new InputHandlerElements();
		this.pRequestHandler = new RequestHandlerElements();
		this.pAbstractComponentLink = new AbstractComponentLinkElements();
		this.pRequestPortLink = new RequestPortLinkElements();
		this.pOpcUaClientLink = new OpcUaClientLinkElements();
		this.pComponentSubNodeObserver = new ComponentSubNodeObserverElements();
		this.pInputLinkExtension = new InputLinkExtensionElements();
		this.pActivityExtension = new ActivityExtensionElements();
		this.pActivationConstraints = new ActivationConstraintsElements();
		this.pOperationModeBinding = new OperationModeBindingElements();
		this.pDefaultTrigger = new DefaultTriggerElements();
		this.pDefaultInputTrigger = new DefaultInputTriggerElements();
		this.pDefaultPeriodicTimer = new DefaultPeriodicTimerElements();
		this.pDefaultObservedElementTrigger = new DefaultObservedElementTriggerElements();
		this.pPlainOpcUaPort = new PlainOpcUaPortElements();
		this.pOpcUaDeviceClient = new OpcUaDeviceClientElements();
		this.pOpcUaReadServer = new OpcUaReadServerElements();
		this.pCoordinationSlavePort = new CoordinationSlavePortElements();
		this.pAbstractCoordinationElement = new AbstractCoordinationElementElements();
		this.pSkillRealizationsRef = new SkillRealizationsRefElements();
		this.pCommunicationServiceUsageRealization = new CommunicationServiceUsageRealizationElements();
		this.pPublicOperationMode = new PublicOperationModeElements();
		this.pPrivateOperationMode = new PrivateOperationModeElements();
		this.pCoordinationMasterPort = new CoordinationMasterPortElements();
		this.pComponentParametersRef = new ComponentParametersRefElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.component.componentDefinition.ComponentDefinition".equals(grammar.getName())) {
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

	
	//ComponentDefModel component::ComponentDefModel:
	//	{component::ComponentDefModel} imports+=ServiceRepoImport*
	//	component=ComponentDefinition?;
	public ComponentDefModelElements getComponentDefModelAccess() {
		return pComponentDefModel;
	}
	
	public ParserRule getComponentDefModelRule() {
		return getComponentDefModelAccess().getRule();
	}
	
	//// imports can be optionally used to simplify names of objects from a remote repository
	//ServiceRepoImport component::ServiceRepoImport:
	//	'#import' importedNamespace=FQNW ';'?;
	public ServiceRepoImportElements getServiceRepoImportAccess() {
		return pServiceRepoImport;
	}
	
	public ParserRule getServiceRepoImportRule() {
		return getServiceRepoImportAccess().getRule();
	}
	
	//ComponentDefinition component::ComponentDefinition:
	//	'ComponentDefinition' name=ID ('logo' logo=STRING)?
	//	'{'
	//	elements+=AbstractComponentElement*
	//	'}';
	public ComponentDefinitionElements getComponentDefinitionAccess() {
		return pComponentDefinition;
	}
	
	public ParserRule getComponentDefinitionRule() {
		return getComponentDefinitionAccess().getRule();
	}
	
	//AbstractComponentElement component::AbstractComponentElement:
	//	NamedComponentElement | DerivedComponentElement;
	public AbstractComponentElementElements getAbstractComponentElementAccess() {
		return pAbstractComponentElement;
	}
	
	public ParserRule getAbstractComponentElementRule() {
		return getAbstractComponentElementAccess().getRule();
	}
	
	//DerivedComponentElement component::DerivedComponentElement:
	//	ComponentParametersRef;
	public DerivedComponentElementElements getDerivedComponentElementAccess() {
		return pDerivedComponentElement;
	}
	
	public ParserRule getDerivedComponentElementRule() {
		return getDerivedComponentElementAccess().getRule();
	}
	
	//NamedComponentElement component::NamedComponentElement:
	//	ComponentSubNode | ComponentPort | CoordinationSlavePort | CoordinationMasterPort | PlainOpcUaPort;
	public NamedComponentElementElements getNamedComponentElementAccess() {
		return pNamedComponentElement;
	}
	
	public ParserRule getNamedComponentElementRule() {
		return getNamedComponentElementAccess().getRule();
	}
	
	//ComponentSubNode component::ComponentSubNode:
	//	Activity | InputHandler | RequestHandler;
	public ComponentSubNodeElements getComponentSubNodeAccess() {
		return pComponentSubNode;
	}
	
	public ParserRule getComponentSubNodeRule() {
		return getComponentSubNodeAccess().getRule();
	}
	
	//ComponentPort component::ComponentPort:
	//	InputPort | AnswerPort | OutputPort | RequestPort;
	public ComponentPortElements getComponentPortAccess() {
		return pComponentPort;
	}
	
	public ParserRule getComponentPortRule() {
		return getComponentPortAccess().getRule();
	}
	
	//RequestPort component::RequestPort:
	//	'RequestPort' name=ID
	//	'implements' service=[serviceDefinition::TwoWayCommunicationService|FQN]
	//	'{'
	//	extensions+=ComponentPortExtension*
	//	'}';
	public RequestPortElements getRequestPortAccess() {
		return pRequestPort;
	}
	
	public ParserRule getRequestPortRule() {
		return getRequestPortAccess().getRule();
	}
	
	//OutputPort component::OutputPort:
	//	'OutputPort' name=ID
	//	'implements' service=[serviceDefinition::OneWayCommunicationService|FQN]
	//	'realizedBy' activity=[component::Activity|FQN]
	//	'{'
	//	extensions+=ComponentPortExtension*
	//	'}';
	public OutputPortElements getOutputPortAccess() {
		return pOutputPort;
	}
	
	public ParserRule getOutputPortRule() {
		return getOutputPortAccess().getRule();
	}
	
	//AnswerPort component::AnswerPort:
	//	'AnswerPort' name=ID 'implements' service=[serviceDefinition::TwoWayCommunicationService|FQN] '{'
	//	extensions+=ComponentPortExtension*
	//	'}';
	public AnswerPortElements getAnswerPortAccess() {
		return pAnswerPort;
	}
	
	public ParserRule getAnswerPortRule() {
		return getAnswerPortAccess().getRule();
	}
	
	//InputPort component::InputPort:
	//	'InputPort' name=ID 'implements' service=[serviceDefinition::OneWayCommunicationService|FQN] '{'
	//	extensions+=ComponentPortExtension*
	//	'}';
	public InputPortElements getInputPortAccess() {
		return pInputPort;
	}
	
	public ParserRule getInputPortRule() {
		return getInputPortAccess().getRule();
	}
	
	//ComponentPortExtension component::ComponentPortExtension:
	//	SupportedMiddleware;
	public ComponentPortExtensionElements getComponentPortExtensionAccess() {
		return pComponentPortExtension;
	}
	
	public ParserRule getComponentPortExtensionRule() {
		return getComponentPortExtensionAccess().getRule();
	}
	
	//SupportedMiddleware seronet::SupportedMiddleware:
	//	'SupportedMiddleware' default?='default'? middleware=RoboticMiddleware ';'?;
	public SupportedMiddlewareElements getSupportedMiddlewareAccess() {
		return pSupportedMiddleware;
	}
	
	public ParserRule getSupportedMiddlewareRule() {
		return getSupportedMiddlewareAccess().getRule();
	}
	
	//Activity component::Activity:
	//	'Activity' name=ID
	//	'{'
	//	links+=AbstractComponentLink*
	//	extensions+=ActivityExtension*
	//	'}';
	public ActivityElements getActivityAccess() {
		return pActivity;
	}
	
	public ParserRule getActivityRule() {
		return getActivityAccess().getRule();
	}
	
	//InputHandler component::InputHandler:
	//	'InputHandler' name=ID 'triggeredFrom' inputPort=[component::InputPort|FQN] activeQueue?='activeQueue'? '{'
	//	links+=AbstractComponentLink*
	//	'}';
	public InputHandlerElements getInputHandlerAccess() {
		return pInputHandler;
	}
	
	public ParserRule getInputHandlerRule() {
		return getInputHandlerAccess().getRule();
	}
	
	//RequestHandler component::RequestHandler:
	//	'RequestHandler' name=ID 'triggeredFrom' answerPort=[component::AnswerPort|FQN] activeQueue?='activeQueue'? '{'
	//	links+=AbstractComponentLink*
	//	'}';
	public RequestHandlerElements getRequestHandlerAccess() {
		return pRequestHandler;
	}
	
	public ParserRule getRequestHandlerRule() {
		return getRequestHandlerAccess().getRule();
	}
	
	//AbstractComponentLink component::AbstractComponentLink:
	//	ComponentSubNodeObserver | RequestPortLink | InputLinkExtension | OpcUaClientLink;
	public AbstractComponentLinkElements getAbstractComponentLinkAccess() {
		return pAbstractComponentLink;
	}
	
	public ParserRule getAbstractComponentLinkRule() {
		return getAbstractComponentLinkAccess().getRule();
	}
	
	//RequestPortLink component::RequestPortLink:
	//	'RequestPortLink' requestPort=[component::RequestPort|FQN] ';'?;
	public RequestPortLinkElements getRequestPortLinkAccess() {
		return pRequestPortLink;
	}
	
	public ParserRule getRequestPortLinkRule() {
		return getRequestPortLinkAccess().getRule();
	}
	
	//OpcUaClientLink seronet::OpcUaClientLink:
	//	'OpcUaClientLink' client=[seronet::OpcUaDeviceClient|FQN] ';'?;
	public OpcUaClientLinkElements getOpcUaClientLinkAccess() {
		return pOpcUaClientLink;
	}
	
	public ParserRule getOpcUaClientLinkRule() {
		return getOpcUaClientLinkAccess().getRule();
	}
	
	///**
	// * Observer Pattern for component-internal activities<->upcalls interaction.
	// */ ComponentSubNodeObserver component::ComponentSubNodeObserver:
	//	'Observe' subject=[component::ComponentSubNode|FQN] ';'?;
	public ComponentSubNodeObserverElements getComponentSubNodeObserverAccess() {
		return pComponentSubNodeObserver;
	}
	
	public ParserRule getComponentSubNodeObserverRule() {
		return getComponentSubNodeObserverAccess().getRule();
	}
	
	///**
	// * InputLink extension(s):
	// * - Performance: InputLinkExtension
	// */ InputLinkExtension performance::InputLinkExtension:
	//	{performance::InputLinkExtension}
	//	'InputPortLink' inputPort=[component::InputPort|FQN]
	//	'{' (optional?='optional'? & oversamplingOk?='oversamplingOk'? & undersamplingOk?='undersamplingOk'?)
	//	'}';
	public InputLinkExtensionElements getInputLinkExtensionAccess() {
		return pInputLinkExtension;
	}
	
	public ParserRule getInputLinkExtensionRule() {
		return getInputLinkExtensionAccess().getRule();
	}
	
	///** 
	// * Activity extensions:
	// * - Performance: ActivationConstraints
	// * - Coordination: OperationModeBinding
	// * - DefaultTrigger
	// */ ActivityExtension component::ActivityExtension:
	//	ActivationConstraints | OperationModeBinding | DefaultTrigger;
	public ActivityExtensionElements getActivityExtensionAccess() {
		return pActivityExtension;
	}
	
	public ParserRule getActivityExtensionRule() {
		return getActivityExtensionAccess().getRule();
	}
	
	//ActivationConstraints performance::ActivationConstraints:
	//	{performance::ActivationConstraints}
	//	'ActivationConstraints'
	//	'{'
	//	'configurable' '=' configurable=EBoolean ';'? (('minActFreq' '=' minActFreq=EDouble 'Hz' ';'?)? & ('maxActFreq' '='
	//	maxActFreq=EDouble 'Hz' ';'?)?)
	//	'}';
	public ActivationConstraintsElements getActivationConstraintsAccess() {
		return pActivationConstraints;
	}
	
	public ParserRule getActivationConstraintsRule() {
		return getActivationConstraintsAccess().getRule();
	}
	
	//OperationModeBinding coordination::OperationModeBinding:
	//	'OperationModeBinding' mode=[coordination::PrivateOperationMode|FQN] ';'?;
	public OperationModeBindingElements getOperationModeBindingAccess() {
		return pOperationModeBinding;
	}
	
	public ParserRule getOperationModeBindingRule() {
		return getOperationModeBindingAccess().getRule();
	}
	
	//DefaultTrigger performance::DefaultTrigger:
	//	'DefaultTrigger' (DefaultInputTrigger | DefaultPeriodicTimer | DefaultObservedElementTrigger) ';'?;
	public DefaultTriggerElements getDefaultTriggerAccess() {
		return pDefaultTrigger;
	}
	
	public ParserRule getDefaultTriggerRule() {
		return getDefaultTriggerAccess().getRule();
	}
	
	//DefaultInputTrigger performance::DefaultInputTrigger:
	//	'InputPortTrigger' inputLink=[performance::InputLinkExtension|FQN] ('prescale' prescale=EInt)?;
	public DefaultInputTriggerElements getDefaultInputTriggerAccess() {
		return pDefaultInputTrigger;
	}
	
	public ParserRule getDefaultInputTriggerRule() {
		return getDefaultInputTriggerAccess().getRule();
	}
	
	//DefaultPeriodicTimer performance::DefaultPeriodicTimer:
	//	'PeriodicTimer' periodicActFreq=EDouble 'Hz';
	public DefaultPeriodicTimerElements getDefaultPeriodicTimerAccess() {
		return pDefaultPeriodicTimer;
	}
	
	public ParserRule getDefaultPeriodicTimerRule() {
		return getDefaultPeriodicTimerAccess().getRule();
	}
	
	//DefaultObservedElementTrigger performance::DefaultObservedElementTrigger:
	//	'ObservedElement' element=[component::ComponentSubNode|FQN];
	public DefaultObservedElementTriggerElements getDefaultObservedElementTriggerAccess() {
		return pDefaultObservedElementTrigger;
	}
	
	public ParserRule getDefaultObservedElementTriggerRule() {
		return getDefaultObservedElementTriggerAccess().getRule();
	}
	
	//PlainOpcUaPort seronet::PlainOpcUaPort:
	//	OpcUaDeviceClient | OpcUaReadServer;
	public PlainOpcUaPortElements getPlainOpcUaPortAccess() {
		return pPlainOpcUaPort;
	}
	
	public ParserRule getPlainOpcUaPortRule() {
		return getPlainOpcUaPortAccess().getRule();
	}
	
	//OpcUaDeviceClient seronet::OpcUaDeviceClient:
	//	'OpcUaDeviceClient' name=ID ('deviceURI' deviceURI=EString & ('opcuaXmlFile' opcuaXmlFile=EString)?) ';'?;
	public OpcUaDeviceClientElements getOpcUaDeviceClientAccess() {
		return pOpcUaDeviceClient;
	}
	
	public ParserRule getOpcUaDeviceClientRule() {
		return getOpcUaDeviceClientAccess().getRule();
	}
	
	//OpcUaReadServer seronet::OpcUaReadServer:
	//	'OpcUaReadServer' name=ID 'dataProviderPort' outPort=[component::OutputPort|FQN] ('portNumber' portNumber=EInt)? ';'?;
	public OpcUaReadServerElements getOpcUaReadServerAccess() {
		return pOpcUaReadServer;
	}
	
	public ParserRule getOpcUaReadServerRule() {
		return getOpcUaReadServerAccess().getRule();
	}
	
	//CoordinationSlavePort coordination::CoordinationSlavePort:
	//	'CoordinationSlavePort' name=ID 'implements' service=[serviceDefinition::CoordinationServiceDefinition|FQN] '{'
	//	elements+=AbstractCoordinationElement*
	//	'}';
	public CoordinationSlavePortElements getCoordinationSlavePortAccess() {
		return pCoordinationSlavePort;
	}
	
	public ParserRule getCoordinationSlavePortRule() {
		return getCoordinationSlavePortAccess().getRule();
	}
	
	//AbstractCoordinationElement coordination::AbstractCoordinationElement:
	//	PublicOperationMode | PrivateOperationMode | CommunicationServiceUsageRealization | SkillRealizationsRef;
	public AbstractCoordinationElementElements getAbstractCoordinationElementAccess() {
		return pAbstractCoordinationElement;
	}
	
	public ParserRule getAbstractCoordinationElementRule() {
		return getAbstractCoordinationElementAccess().getRule();
	}
	
	//SkillRealizationsRef coordination::SkillRealizationsRef:
	//	'SkillRealizationsRef' skillRealizationCoordModuleRef=[skillRealization::CoordinationModuleRealization|FQN] ';'?;
	public SkillRealizationsRefElements getSkillRealizationsRefAccess() {
		return pSkillRealizationsRef;
	}
	
	public ParserRule getSkillRealizationsRefRule() {
		return getSkillRealizationsRefAccess().getRule();
	}
	
	//CommunicationServiceUsageRealization coordination::CommunicationServiceUsageRealization:
	//	'with' serviceUsage=[serviceDefinition::CommunicationServiceUsage|FQN] 'realizedBy'
	//	componentPort=[component::ComponentPort|FQN];
	public CommunicationServiceUsageRealizationElements getCommunicationServiceUsageRealizationAccess() {
		return pCommunicationServiceUsageRealization;
	}
	
	public ParserRule getCommunicationServiceUsageRealizationRule() {
		return getCommunicationServiceUsageRealizationAccess().getRule();
	}
	
	//PublicOperationMode coordination::PublicOperationMode:
	//	{coordination::PublicOperationMode} isDefaultInit?='default'? 'PublicOperationMode'
	//	mode=[modes::ComponentModeDefinition|FQN] '{' ('activates' '(' activates+=[coordination::PrivateOperationMode] (','
	//	activates+=[coordination::PrivateOperationMode])* ')')?
	//	'}';
	public PublicOperationModeElements getPublicOperationModeAccess() {
		return pPublicOperationMode;
	}
	
	public ParserRule getPublicOperationModeRule() {
		return getPublicOperationModeAccess().getRule();
	}
	
	//PrivateOperationMode coordination::PrivateOperationMode:
	//	'PrivateOperationMode' name=ID ';'?;
	public PrivateOperationModeElements getPrivateOperationModeAccess() {
		return pPrivateOperationMode;
	}
	
	public ParserRule getPrivateOperationModeRule() {
		return getPrivateOperationModeAccess().getRule();
	}
	
	//CoordinationMasterPort coordination::CoordinationMasterPort:
	//	'CoordinationMasterPort' name=ID 'implements' service=[serviceDefinition::CoordinationServiceDefinition|FQN] ';'?;
	public CoordinationMasterPortElements getCoordinationMasterPortAccess() {
		return pCoordinationMasterPort;
	}
	
	public ParserRule getCoordinationMasterPortRule() {
		return getCoordinationMasterPortAccess().getRule();
	}
	
	//ComponentParametersRef parameter::ComponentParametersRef:
	//	'ComponentParameters' parameter=[parameter::ComponentParameter|FQN] ('slave'
	//	slave=[coordination::CoordinationSlavePort|FQN])? ';'?;
	public ComponentParametersRefElements getComponentParametersRefAccess() {
		return pComponentParametersRef;
	}
	
	public ParserRule getComponentParametersRefRule() {
		return getComponentParametersRefAccess().getRule();
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
