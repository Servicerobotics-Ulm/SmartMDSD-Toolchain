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
package org.xtext.system.componentArchitecture.services;

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
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;
import org.xtext.service.roboticMiddleware.services.RoboticMiddlewareGrammarAccess;

@Singleton
public class ComponentArchitectureGrammarAccess extends AbstractGrammarElementFinder {
	
	public class SystemComponentArchitectureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.componentArchitecture.ComponentArchitecture.SystemComponentArchitecture");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSystemComponentArchitectureAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSystemComponentArchitectureKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cUsingActivityArchitectureKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cActivityArchAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cActivityArchActivityArchitectureModelCrossReference_3_1_0 = (CrossReference)cActivityArchAssignment_3_1.eContents().get(0);
		private final RuleCall cActivityArchActivityArchitectureModelFQNParserRuleCall_3_1_0_1 = (RuleCall)cActivityArchActivityArchitectureModelCrossReference_3_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cComponentsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cComponentsComponentInstanceParserRuleCall_5_0 = (RuleCall)cComponentsAssignment_5.eContents().get(0);
		private final Assignment cConnectionsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cConnectionsConnectionParserRuleCall_6_0 = (RuleCall)cConnectionsAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//SystemComponentArchitecture:
		//	{SystemComponentArchitecture}
		//	'SystemComponentArchitecture' name=ID ('usingActivityArchitecture'
		//	activityArch=[activityArchitecture::ActivityArchitectureModel|FQN])?
		//	'{'
		//	components+=ComponentInstance*
		//	connections+=Connection*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{SystemComponentArchitecture} 'SystemComponentArchitecture' name=ID ('usingActivityArchitecture'
		//activityArch=[activityArchitecture::ActivityArchitectureModel|FQN])? '{' components+=ComponentInstance*
		//connections+=Connection* '}'
		public Group getGroup() { return cGroup; }
		
		//{SystemComponentArchitecture}
		public Action getSystemComponentArchitectureAction_0() { return cSystemComponentArchitectureAction_0; }
		
		//'SystemComponentArchitecture'
		public Keyword getSystemComponentArchitectureKeyword_1() { return cSystemComponentArchitectureKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//('usingActivityArchitecture' activityArch=[activityArchitecture::ActivityArchitectureModel|FQN])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'usingActivityArchitecture'
		public Keyword getUsingActivityArchitectureKeyword_3_0() { return cUsingActivityArchitectureKeyword_3_0; }
		
		//activityArch=[activityArchitecture::ActivityArchitectureModel|FQN]
		public Assignment getActivityArchAssignment_3_1() { return cActivityArchAssignment_3_1; }
		
		//[activityArchitecture::ActivityArchitectureModel|FQN]
		public CrossReference getActivityArchActivityArchitectureModelCrossReference_3_1_0() { return cActivityArchActivityArchitectureModelCrossReference_3_1_0; }
		
		//FQN
		public RuleCall getActivityArchActivityArchitectureModelFQNParserRuleCall_3_1_0_1() { return cActivityArchActivityArchitectureModelFQNParserRuleCall_3_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//components+=ComponentInstance*
		public Assignment getComponentsAssignment_5() { return cComponentsAssignment_5; }
		
		//ComponentInstance
		public RuleCall getComponentsComponentInstanceParserRuleCall_5_0() { return cComponentsComponentInstanceParserRuleCall_5_0; }
		
		//connections+=Connection*
		public Assignment getConnectionsAssignment_6() { return cConnectionsAssignment_6; }
		
		//Connection
		public RuleCall getConnectionsConnectionParserRuleCall_6_0() { return cConnectionsConnectionParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class ConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.componentArchitecture.ComponentArchitecture.Connection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConnectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFromAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cFromRequiredServiceCrossReference_1_0 = (CrossReference)cFromAssignment_1.eContents().get(0);
		private final RuleCall cFromRequiredServiceFQNParserRuleCall_1_0_1 = (RuleCall)cFromRequiredServiceCrossReference_1_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cToAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cToProvidedServiceCrossReference_3_0 = (CrossReference)cToAssignment_3.eContents().get(0);
		private final RuleCall cToProvidedServiceFQNParserRuleCall_3_0_1 = (RuleCall)cToProvidedServiceCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cUseMiddlewareKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cMiddlewareSelectionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cMiddlewareSelectionRoboticMiddlewareParserRuleCall_4_1_0 = (RuleCall)cMiddlewareSelectionAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Connection:
		//	'Connection' from=[RequiredService|FQN] '->' to=[ProvidedService|FQN] ('useMiddleware'
		//	middlewareSelection=RoboticMiddleware)? ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'Connection' from=[RequiredService|FQN] '->' to=[ProvidedService|FQN] ('useMiddleware'
		//middlewareSelection=RoboticMiddleware)? ';'?
		public Group getGroup() { return cGroup; }
		
		//'Connection'
		public Keyword getConnectionKeyword_0() { return cConnectionKeyword_0; }
		
		//from=[RequiredService|FQN]
		public Assignment getFromAssignment_1() { return cFromAssignment_1; }
		
		//[RequiredService|FQN]
		public CrossReference getFromRequiredServiceCrossReference_1_0() { return cFromRequiredServiceCrossReference_1_0; }
		
		//FQN
		public RuleCall getFromRequiredServiceFQNParserRuleCall_1_0_1() { return cFromRequiredServiceFQNParserRuleCall_1_0_1; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_2() { return cHyphenMinusGreaterThanSignKeyword_2; }
		
		//to=[ProvidedService|FQN]
		public Assignment getToAssignment_3() { return cToAssignment_3; }
		
		//[ProvidedService|FQN]
		public CrossReference getToProvidedServiceCrossReference_3_0() { return cToProvidedServiceCrossReference_3_0; }
		
		//FQN
		public RuleCall getToProvidedServiceFQNParserRuleCall_3_0_1() { return cToProvidedServiceFQNParserRuleCall_3_0_1; }
		
		//('useMiddleware' middlewareSelection=RoboticMiddleware)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'useMiddleware'
		public Keyword getUseMiddlewareKeyword_4_0() { return cUseMiddlewareKeyword_4_0; }
		
		//middlewareSelection=RoboticMiddleware
		public Assignment getMiddlewareSelectionAssignment_4_1() { return cMiddlewareSelectionAssignment_4_1; }
		
		//RoboticMiddleware
		public RuleCall getMiddlewareSelectionRoboticMiddlewareParserRuleCall_4_1_0() { return cMiddlewareSelectionRoboticMiddlewareParserRuleCall_4_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class ComponentInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.componentArchitecture.ComponentArchitecture.ComponentInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentInstanceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cInstantiatesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cComponentAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cComponentComponentDefinitionCrossReference_3_0 = (CrossReference)cComponentAssignment_3.eContents().get(0);
		private final RuleCall cComponentComponentDefinitionFQNParserRuleCall_3_0_1 = (RuleCall)cComponentComponentDefinitionCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cPortsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPortsServiceInstanceParserRuleCall_5_0 = (RuleCall)cPortsAssignment_5.eContents().get(0);
		private final Assignment cExtensionsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cExtensionsComponentInstanceExtensionParserRuleCall_6_0 = (RuleCall)cExtensionsAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//ComponentInstance:
		//	'ComponentInstance' name=ID 'instantiates' component=[componentDefinition::ComponentDefinition|FQN]
		//	'{'
		//	ports+=ServiceInstance*
		//	extensions+=ComponentInstanceExtension*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ComponentInstance' name=ID 'instantiates' component=[componentDefinition::ComponentDefinition|FQN] '{'
		//ports+=ServiceInstance* extensions+=ComponentInstanceExtension* '}'
		public Group getGroup() { return cGroup; }
		
		//'ComponentInstance'
		public Keyword getComponentInstanceKeyword_0() { return cComponentInstanceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'instantiates'
		public Keyword getInstantiatesKeyword_2() { return cInstantiatesKeyword_2; }
		
		//component=[componentDefinition::ComponentDefinition|FQN]
		public Assignment getComponentAssignment_3() { return cComponentAssignment_3; }
		
		//[componentDefinition::ComponentDefinition|FQN]
		public CrossReference getComponentComponentDefinitionCrossReference_3_0() { return cComponentComponentDefinitionCrossReference_3_0; }
		
		//FQN
		public RuleCall getComponentComponentDefinitionFQNParserRuleCall_3_0_1() { return cComponentComponentDefinitionFQNParserRuleCall_3_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//ports+=ServiceInstance*
		public Assignment getPortsAssignment_5() { return cPortsAssignment_5; }
		
		//ServiceInstance
		public RuleCall getPortsServiceInstanceParserRuleCall_5_0() { return cPortsServiceInstanceParserRuleCall_5_0; }
		
		//extensions+=ComponentInstanceExtension*
		public Assignment getExtensionsAssignment_6() { return cExtensionsAssignment_6; }
		
		//ComponentInstanceExtension
		public RuleCall getExtensionsComponentInstanceExtensionParserRuleCall_6_0() { return cExtensionsComponentInstanceExtensionParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class ComponentInstanceExtensionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.componentArchitecture.ComponentArchitecture.ComponentInstanceExtension");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cParameterStructInstanceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cActivityConfigurationMappingParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cInputHandlerConfigurationMappingParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cOpcUaDeviceClientInstanceParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//ComponentInstanceExtension:
		//	ParameterStructInstance | ActivityConfigurationMapping | InputHandlerConfigurationMapping | OpcUaDeviceClientInstance;
		@Override public ParserRule getRule() { return rule; }
		
		//ParameterStructInstance | ActivityConfigurationMapping | InputHandlerConfigurationMapping | OpcUaDeviceClientInstance
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ParameterStructInstance
		public RuleCall getParameterStructInstanceParserRuleCall_0() { return cParameterStructInstanceParserRuleCall_0; }
		
		//ActivityConfigurationMapping
		public RuleCall getActivityConfigurationMappingParserRuleCall_1() { return cActivityConfigurationMappingParserRuleCall_1; }
		
		//InputHandlerConfigurationMapping
		public RuleCall getInputHandlerConfigurationMappingParserRuleCall_2() { return cInputHandlerConfigurationMappingParserRuleCall_2; }
		
		//OpcUaDeviceClientInstance
		public RuleCall getOpcUaDeviceClientInstanceParserRuleCall_3() { return cOpcUaDeviceClientInstanceParserRuleCall_3; }
	}
	public class ParameterStructInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.componentArchitecture.ComponentArchitecture.ParameterStructInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParameterStructInstanceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParameterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cParameterComponentParameterInstanceCrossReference_1_0 = (CrossReference)cParameterAssignment_1.eContents().get(0);
		private final RuleCall cParameterComponentParameterInstanceFQNParserRuleCall_1_0_1 = (RuleCall)cParameterComponentParameterInstanceCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ParameterStructInstance systemParameter::ParameterStructInstance:
		//	'ParameterStructInstance' parameter=[systemParameter::ComponentParameterInstance|FQN] ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'ParameterStructInstance' parameter=[systemParameter::ComponentParameterInstance|FQN] ';'?
		public Group getGroup() { return cGroup; }
		
		//'ParameterStructInstance'
		public Keyword getParameterStructInstanceKeyword_0() { return cParameterStructInstanceKeyword_0; }
		
		//parameter=[systemParameter::ComponentParameterInstance|FQN]
		public Assignment getParameterAssignment_1() { return cParameterAssignment_1; }
		
		//[systemParameter::ComponentParameterInstance|FQN]
		public CrossReference getParameterComponentParameterInstanceCrossReference_1_0() { return cParameterComponentParameterInstanceCrossReference_1_0; }
		
		//FQN
		public RuleCall getParameterComponentParameterInstanceFQNParserRuleCall_1_0_1() { return cParameterComponentParameterInstanceFQNParserRuleCall_1_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class ActivityConfigurationMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.componentArchitecture.ComponentArchitecture.ActivityConfigurationMapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActivityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cActivityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cActivityActivityCrossReference_1_0 = (CrossReference)cActivityAssignment_1.eContents().get(0);
		private final RuleCall cActivityActivityFQNParserRuleCall_1_0_1 = (RuleCall)cActivityActivityCrossReference_1_0.eContents().get(1);
		private final Keyword cConfigurationKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cConfigAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cConfigActivityNodeCrossReference_3_0 = (CrossReference)cConfigAssignment_3.eContents().get(0);
		private final RuleCall cConfigActivityNodeFQNParserRuleCall_3_0_1 = (RuleCall)cConfigActivityNodeCrossReference_3_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ActivityConfigurationMapping:
		//	'Activity' activity=[componentDefinition::Activity|FQN] 'configuration'
		//	config=[activityArchitecture::ActivityNode|FQN] ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'Activity' activity=[componentDefinition::Activity|FQN] 'configuration' config=[activityArchitecture::ActivityNode|FQN]
		//';'?
		public Group getGroup() { return cGroup; }
		
		//'Activity'
		public Keyword getActivityKeyword_0() { return cActivityKeyword_0; }
		
		//activity=[componentDefinition::Activity|FQN]
		public Assignment getActivityAssignment_1() { return cActivityAssignment_1; }
		
		//[componentDefinition::Activity|FQN]
		public CrossReference getActivityActivityCrossReference_1_0() { return cActivityActivityCrossReference_1_0; }
		
		//FQN
		public RuleCall getActivityActivityFQNParserRuleCall_1_0_1() { return cActivityActivityFQNParserRuleCall_1_0_1; }
		
		//'configuration'
		public Keyword getConfigurationKeyword_2() { return cConfigurationKeyword_2; }
		
		//config=[activityArchitecture::ActivityNode|FQN]
		public Assignment getConfigAssignment_3() { return cConfigAssignment_3; }
		
		//[activityArchitecture::ActivityNode|FQN]
		public CrossReference getConfigActivityNodeCrossReference_3_0() { return cConfigActivityNodeCrossReference_3_0; }
		
		//FQN
		public RuleCall getConfigActivityNodeFQNParserRuleCall_3_0_1() { return cConfigActivityNodeFQNParserRuleCall_3_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class InputHandlerConfigurationMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.componentArchitecture.ComponentArchitecture.InputHandlerConfigurationMapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInputHandlerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cHandlerAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cHandlerInputHandlerCrossReference_1_0 = (CrossReference)cHandlerAssignment_1.eContents().get(0);
		private final RuleCall cHandlerInputHandlerFQNParserRuleCall_1_0_1 = (RuleCall)cHandlerInputHandlerCrossReference_1_0.eContents().get(1);
		private final Keyword cConfigurationKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cConfigAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cConfigInputHandlerNodeCrossReference_3_0 = (CrossReference)cConfigAssignment_3.eContents().get(0);
		private final RuleCall cConfigInputHandlerNodeFQNParserRuleCall_3_0_1 = (RuleCall)cConfigInputHandlerNodeCrossReference_3_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//InputHandlerConfigurationMapping:
		//	'InputHandler' handler=[componentDefinition::InputHandler|FQN] 'configuration'
		//	config=[activityArchitecture::InputHandlerNode|FQN] ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'InputHandler' handler=[componentDefinition::InputHandler|FQN] 'configuration'
		//config=[activityArchitecture::InputHandlerNode|FQN] ';'?
		public Group getGroup() { return cGroup; }
		
		//'InputHandler'
		public Keyword getInputHandlerKeyword_0() { return cInputHandlerKeyword_0; }
		
		//handler=[componentDefinition::InputHandler|FQN]
		public Assignment getHandlerAssignment_1() { return cHandlerAssignment_1; }
		
		//[componentDefinition::InputHandler|FQN]
		public CrossReference getHandlerInputHandlerCrossReference_1_0() { return cHandlerInputHandlerCrossReference_1_0; }
		
		//FQN
		public RuleCall getHandlerInputHandlerFQNParserRuleCall_1_0_1() { return cHandlerInputHandlerFQNParserRuleCall_1_0_1; }
		
		//'configuration'
		public Keyword getConfigurationKeyword_2() { return cConfigurationKeyword_2; }
		
		//config=[activityArchitecture::InputHandlerNode|FQN]
		public Assignment getConfigAssignment_3() { return cConfigAssignment_3; }
		
		//[activityArchitecture::InputHandlerNode|FQN]
		public CrossReference getConfigInputHandlerNodeCrossReference_3_0() { return cConfigInputHandlerNodeCrossReference_3_0; }
		
		//FQN
		public RuleCall getConfigInputHandlerNodeFQNParserRuleCall_3_0_1() { return cConfigInputHandlerNodeFQNParserRuleCall_3_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class OpcUaDeviceClientInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.componentArchitecture.ComponentArchitecture.OpcUaDeviceClientInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOpcUaDeviceClientInstanceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDeviceClientAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cDeviceClientOpcUaDeviceClientCrossReference_1_0 = (CrossReference)cDeviceClientAssignment_1.eContents().get(0);
		private final RuleCall cDeviceClientOpcUaDeviceClientFQNParserRuleCall_1_0_1 = (RuleCall)cDeviceClientOpcUaDeviceClientCrossReference_1_0.eContents().get(1);
		private final Keyword cDeviceURIKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDeviceURIAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDeviceURIEStringParserRuleCall_3_0 = (RuleCall)cDeviceURIAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//OpcUaDeviceClientInstance compArchSeronetExtension::OpcUaDeviceClientInstance:
		//	'OpcUaDeviceClientInstance' deviceClient=[seronetExtension::OpcUaDeviceClient|FQN] 'deviceURI' deviceURI=EString ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'OpcUaDeviceClientInstance' deviceClient=[seronetExtension::OpcUaDeviceClient|FQN] 'deviceURI' deviceURI=EString ';'?
		public Group getGroup() { return cGroup; }
		
		//'OpcUaDeviceClientInstance'
		public Keyword getOpcUaDeviceClientInstanceKeyword_0() { return cOpcUaDeviceClientInstanceKeyword_0; }
		
		//deviceClient=[seronetExtension::OpcUaDeviceClient|FQN]
		public Assignment getDeviceClientAssignment_1() { return cDeviceClientAssignment_1; }
		
		//[seronetExtension::OpcUaDeviceClient|FQN]
		public CrossReference getDeviceClientOpcUaDeviceClientCrossReference_1_0() { return cDeviceClientOpcUaDeviceClientCrossReference_1_0; }
		
		//FQN
		public RuleCall getDeviceClientOpcUaDeviceClientFQNParserRuleCall_1_0_1() { return cDeviceClientOpcUaDeviceClientFQNParserRuleCall_1_0_1; }
		
		//'deviceURI'
		public Keyword getDeviceURIKeyword_2() { return cDeviceURIKeyword_2; }
		
		//deviceURI=EString
		public Assignment getDeviceURIAssignment_3() { return cDeviceURIAssignment_3; }
		
		//EString
		public RuleCall getDeviceURIEStringParserRuleCall_3_0() { return cDeviceURIEStringParserRuleCall_3_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class ServiceInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.componentArchitecture.ComponentArchitecture.ServiceInstance");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRequiredServiceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cProvidedServiceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ServiceInstance:
		//	RequiredService | ProvidedService;
		@Override public ParserRule getRule() { return rule; }
		
		//RequiredService | ProvidedService
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//RequiredService
		public RuleCall getRequiredServiceParserRuleCall_0() { return cRequiredServiceParserRuleCall_0; }
		
		//ProvidedService
		public RuleCall getProvidedServiceParserRuleCall_1() { return cProvidedServiceParserRuleCall_1; }
	}
	public class RequiredServiceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.componentArchitecture.ComponentArchitecture.RequiredService");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequiredServiceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPortAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPortComponentPortCrossReference_1_0 = (CrossReference)cPortAssignment_1.eContents().get(0);
		private final RuleCall cPortComponentPortIDTerminalRuleCall_1_0_1 = (RuleCall)cPortComponentPortCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//RequiredService:
		//	'RequiredService' port=[componentDefinition::ComponentPort] ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'RequiredService' port=[componentDefinition::ComponentPort] ';'?
		public Group getGroup() { return cGroup; }
		
		//'RequiredService'
		public Keyword getRequiredServiceKeyword_0() { return cRequiredServiceKeyword_0; }
		
		//port=[componentDefinition::ComponentPort]
		public Assignment getPortAssignment_1() { return cPortAssignment_1; }
		
		//[componentDefinition::ComponentPort]
		public CrossReference getPortComponentPortCrossReference_1_0() { return cPortComponentPortCrossReference_1_0; }
		
		//ID
		public RuleCall getPortComponentPortIDTerminalRuleCall_1_0_1() { return cPortComponentPortIDTerminalRuleCall_1_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class ProvidedServiceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.system.componentArchitecture.ComponentArchitecture.ProvidedService");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProvidedServiceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPortAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPortComponentPortCrossReference_1_0 = (CrossReference)cPortAssignment_1.eContents().get(0);
		private final RuleCall cPortComponentPortIDTerminalRuleCall_1_0_1 = (RuleCall)cPortComponentPortCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ProvidedService:
		//	'ProvidedService' port=[componentDefinition::ComponentPort] ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'ProvidedService' port=[componentDefinition::ComponentPort] ';'?
		public Group getGroup() { return cGroup; }
		
		//'ProvidedService'
		public Keyword getProvidedServiceKeyword_0() { return cProvidedServiceKeyword_0; }
		
		//port=[componentDefinition::ComponentPort]
		public Assignment getPortAssignment_1() { return cPortAssignment_1; }
		
		//[componentDefinition::ComponentPort]
		public CrossReference getPortComponentPortCrossReference_1_0() { return cPortComponentPortCrossReference_1_0; }
		
		//ID
		public RuleCall getPortComponentPortIDTerminalRuleCall_1_0_1() { return cPortComponentPortIDTerminalRuleCall_1_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	
	
	private final SystemComponentArchitectureElements pSystemComponentArchitecture;
	private final ConnectionElements pConnection;
	private final ComponentInstanceElements pComponentInstance;
	private final ComponentInstanceExtensionElements pComponentInstanceExtension;
	private final ParameterStructInstanceElements pParameterStructInstance;
	private final ActivityConfigurationMappingElements pActivityConfigurationMapping;
	private final InputHandlerConfigurationMappingElements pInputHandlerConfigurationMapping;
	private final OpcUaDeviceClientInstanceElements pOpcUaDeviceClientInstance;
	private final ServiceInstanceElements pServiceInstance;
	private final RequiredServiceElements pRequiredService;
	private final ProvidedServiceElements pProvidedService;
	
	private final Grammar grammar;
	
	private final RoboticMiddlewareGrammarAccess gaRoboticMiddleware;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ComponentArchitectureGrammarAccess(GrammarProvider grammarProvider,
			RoboticMiddlewareGrammarAccess gaRoboticMiddleware,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaRoboticMiddleware = gaRoboticMiddleware;
		this.gaTerminals = gaTerminals;
		this.pSystemComponentArchitecture = new SystemComponentArchitectureElements();
		this.pConnection = new ConnectionElements();
		this.pComponentInstance = new ComponentInstanceElements();
		this.pComponentInstanceExtension = new ComponentInstanceExtensionElements();
		this.pParameterStructInstance = new ParameterStructInstanceElements();
		this.pActivityConfigurationMapping = new ActivityConfigurationMappingElements();
		this.pInputHandlerConfigurationMapping = new InputHandlerConfigurationMappingElements();
		this.pOpcUaDeviceClientInstance = new OpcUaDeviceClientInstanceElements();
		this.pServiceInstance = new ServiceInstanceElements();
		this.pRequiredService = new RequiredServiceElements();
		this.pProvidedService = new ProvidedServiceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.system.componentArchitecture.ComponentArchitecture".equals(grammar.getName())) {
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

	
	//SystemComponentArchitecture:
	//	{SystemComponentArchitecture}
	//	'SystemComponentArchitecture' name=ID ('usingActivityArchitecture'
	//	activityArch=[activityArchitecture::ActivityArchitectureModel|FQN])?
	//	'{'
	//	components+=ComponentInstance*
	//	connections+=Connection*
	//	'}';
	public SystemComponentArchitectureElements getSystemComponentArchitectureAccess() {
		return pSystemComponentArchitecture;
	}
	
	public ParserRule getSystemComponentArchitectureRule() {
		return getSystemComponentArchitectureAccess().getRule();
	}
	
	//Connection:
	//	'Connection' from=[RequiredService|FQN] '->' to=[ProvidedService|FQN] ('useMiddleware'
	//	middlewareSelection=RoboticMiddleware)? ';'?;
	public ConnectionElements getConnectionAccess() {
		return pConnection;
	}
	
	public ParserRule getConnectionRule() {
		return getConnectionAccess().getRule();
	}
	
	//ComponentInstance:
	//	'ComponentInstance' name=ID 'instantiates' component=[componentDefinition::ComponentDefinition|FQN]
	//	'{'
	//	ports+=ServiceInstance*
	//	extensions+=ComponentInstanceExtension*
	//	'}';
	public ComponentInstanceElements getComponentInstanceAccess() {
		return pComponentInstance;
	}
	
	public ParserRule getComponentInstanceRule() {
		return getComponentInstanceAccess().getRule();
	}
	
	//ComponentInstanceExtension:
	//	ParameterStructInstance | ActivityConfigurationMapping | InputHandlerConfigurationMapping | OpcUaDeviceClientInstance;
	public ComponentInstanceExtensionElements getComponentInstanceExtensionAccess() {
		return pComponentInstanceExtension;
	}
	
	public ParserRule getComponentInstanceExtensionRule() {
		return getComponentInstanceExtensionAccess().getRule();
	}
	
	//ParameterStructInstance systemParameter::ParameterStructInstance:
	//	'ParameterStructInstance' parameter=[systemParameter::ComponentParameterInstance|FQN] ';'?;
	public ParameterStructInstanceElements getParameterStructInstanceAccess() {
		return pParameterStructInstance;
	}
	
	public ParserRule getParameterStructInstanceRule() {
		return getParameterStructInstanceAccess().getRule();
	}
	
	//ActivityConfigurationMapping:
	//	'Activity' activity=[componentDefinition::Activity|FQN] 'configuration'
	//	config=[activityArchitecture::ActivityNode|FQN] ';'?;
	public ActivityConfigurationMappingElements getActivityConfigurationMappingAccess() {
		return pActivityConfigurationMapping;
	}
	
	public ParserRule getActivityConfigurationMappingRule() {
		return getActivityConfigurationMappingAccess().getRule();
	}
	
	//InputHandlerConfigurationMapping:
	//	'InputHandler' handler=[componentDefinition::InputHandler|FQN] 'configuration'
	//	config=[activityArchitecture::InputHandlerNode|FQN] ';'?;
	public InputHandlerConfigurationMappingElements getInputHandlerConfigurationMappingAccess() {
		return pInputHandlerConfigurationMapping;
	}
	
	public ParserRule getInputHandlerConfigurationMappingRule() {
		return getInputHandlerConfigurationMappingAccess().getRule();
	}
	
	//OpcUaDeviceClientInstance compArchSeronetExtension::OpcUaDeviceClientInstance:
	//	'OpcUaDeviceClientInstance' deviceClient=[seronetExtension::OpcUaDeviceClient|FQN] 'deviceURI' deviceURI=EString ';'?;
	public OpcUaDeviceClientInstanceElements getOpcUaDeviceClientInstanceAccess() {
		return pOpcUaDeviceClientInstance;
	}
	
	public ParserRule getOpcUaDeviceClientInstanceRule() {
		return getOpcUaDeviceClientInstanceAccess().getRule();
	}
	
	//ServiceInstance:
	//	RequiredService | ProvidedService;
	public ServiceInstanceElements getServiceInstanceAccess() {
		return pServiceInstance;
	}
	
	public ParserRule getServiceInstanceRule() {
		return getServiceInstanceAccess().getRule();
	}
	
	//RequiredService:
	//	'RequiredService' port=[componentDefinition::ComponentPort] ';'?;
	public RequiredServiceElements getRequiredServiceAccess() {
		return pRequiredService;
	}
	
	public ParserRule getRequiredServiceRule() {
		return getRequiredServiceAccess().getRule();
	}
	
	//ProvidedService:
	//	'ProvidedService' port=[componentDefinition::ComponentPort] ';'?;
	public ProvidedServiceElements getProvidedServiceAccess() {
		return pProvidedService;
	}
	
	public ParserRule getProvidedServiceRule() {
		return getProvidedServiceAccess().getRule();
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
