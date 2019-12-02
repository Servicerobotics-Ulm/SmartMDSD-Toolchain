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
grammar InternalComponentArchitecture;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.system.componentArchitecture.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.system.componentArchitecture.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.system.componentArchitecture.services.ComponentArchitectureGrammarAccess;

}
@parser::members {
	private ComponentArchitectureGrammarAccess grammarAccess;

	public void setGrammarAccess(ComponentArchitectureGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleSystemComponentArchitecture
entryRuleSystemComponentArchitecture
:
{ before(grammarAccess.getSystemComponentArchitectureRule()); }
	 ruleSystemComponentArchitecture
{ after(grammarAccess.getSystemComponentArchitectureRule()); } 
	 EOF 
;

// Rule SystemComponentArchitecture
ruleSystemComponentArchitecture 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSystemComponentArchitectureAccess().getGroup()); }
		(rule__SystemComponentArchitecture__Group__0)
		{ after(grammarAccess.getSystemComponentArchitectureAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSystemExtension
entryRuleSystemExtension
:
{ before(grammarAccess.getSystemExtensionRule()); }
	 ruleSystemExtension
{ after(grammarAccess.getSystemExtensionRule()); } 
	 EOF 
;

// Rule SystemExtension
ruleSystemExtension 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSystemExtensionAccess().getAlternatives()); }
		(rule__SystemExtension__Alternatives)
		{ after(grammarAccess.getSystemExtensionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConnection
entryRuleConnection
:
{ before(grammarAccess.getConnectionRule()); }
	 ruleConnection
{ after(grammarAccess.getConnectionRule()); } 
	 EOF 
;

// Rule Connection
ruleConnection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConnectionAccess().getGroup()); }
		(rule__Connection__Group__0)
		{ after(grammarAccess.getConnectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentInstance
entryRuleComponentInstance
:
{ before(grammarAccess.getComponentInstanceRule()); }
	 ruleComponentInstance
{ after(grammarAccess.getComponentInstanceRule()); } 
	 EOF 
;

// Rule ComponentInstance
ruleComponentInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentInstanceAccess().getGroup()); }
		(rule__ComponentInstance__Group__0)
		{ after(grammarAccess.getComponentInstanceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentInstanceExtension
entryRuleComponentInstanceExtension
:
{ before(grammarAccess.getComponentInstanceExtensionRule()); }
	 ruleComponentInstanceExtension
{ after(grammarAccess.getComponentInstanceExtensionRule()); } 
	 EOF 
;

// Rule ComponentInstanceExtension
ruleComponentInstanceExtension 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentInstanceExtensionAccess().getAlternatives()); }
		(rule__ComponentInstanceExtension__Alternatives)
		{ after(grammarAccess.getComponentInstanceExtensionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParameterStructInstance
entryRuleParameterStructInstance
:
{ before(grammarAccess.getParameterStructInstanceRule()); }
	 ruleParameterStructInstance
{ after(grammarAccess.getParameterStructInstanceRule()); } 
	 EOF 
;

// Rule ParameterStructInstance
ruleParameterStructInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterStructInstanceAccess().getGroup()); }
		(rule__ParameterStructInstance__Group__0)
		{ after(grammarAccess.getParameterStructInstanceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleActivityConfigurationMapping
entryRuleActivityConfigurationMapping
:
{ before(grammarAccess.getActivityConfigurationMappingRule()); }
	 ruleActivityConfigurationMapping
{ after(grammarAccess.getActivityConfigurationMappingRule()); } 
	 EOF 
;

// Rule ActivityConfigurationMapping
ruleActivityConfigurationMapping 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActivityConfigurationMappingAccess().getGroup()); }
		(rule__ActivityConfigurationMapping__Group__0)
		{ after(grammarAccess.getActivityConfigurationMappingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInputHandlerConfigurationMapping
entryRuleInputHandlerConfigurationMapping
:
{ before(grammarAccess.getInputHandlerConfigurationMappingRule()); }
	 ruleInputHandlerConfigurationMapping
{ after(grammarAccess.getInputHandlerConfigurationMappingRule()); } 
	 EOF 
;

// Rule InputHandlerConfigurationMapping
ruleInputHandlerConfigurationMapping 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputHandlerConfigurationMappingAccess().getGroup()); }
		(rule__InputHandlerConfigurationMapping__Group__0)
		{ after(grammarAccess.getInputHandlerConfigurationMappingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpcUaDeviceClientInstance
entryRuleOpcUaDeviceClientInstance
:
{ before(grammarAccess.getOpcUaDeviceClientInstanceRule()); }
	 ruleOpcUaDeviceClientInstance
{ after(grammarAccess.getOpcUaDeviceClientInstanceRule()); } 
	 EOF 
;

// Rule OpcUaDeviceClientInstance
ruleOpcUaDeviceClientInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getGroup()); }
		(rule__OpcUaDeviceClientInstance__Group__0)
		{ after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpcUaReadServerInstance
entryRuleOpcUaReadServerInstance
:
{ before(grammarAccess.getOpcUaReadServerInstanceRule()); }
	 ruleOpcUaReadServerInstance
{ after(grammarAccess.getOpcUaReadServerInstanceRule()); } 
	 EOF 
;

// Rule OpcUaReadServerInstance
ruleOpcUaReadServerInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpcUaReadServerInstanceAccess().getGroup()); }
		(rule__OpcUaReadServerInstance__Group__0)
		{ after(grammarAccess.getOpcUaReadServerInstanceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleServiceInstance
entryRuleServiceInstance
:
{ before(grammarAccess.getServiceInstanceRule()); }
	 ruleServiceInstance
{ after(grammarAccess.getServiceInstanceRule()); } 
	 EOF 
;

// Rule ServiceInstance
ruleServiceInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getServiceInstanceAccess().getAlternatives()); }
		(rule__ServiceInstance__Alternatives)
		{ after(grammarAccess.getServiceInstanceAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRequiredService
entryRuleRequiredService
:
{ before(grammarAccess.getRequiredServiceRule()); }
	 ruleRequiredService
{ after(grammarAccess.getRequiredServiceRule()); } 
	 EOF 
;

// Rule RequiredService
ruleRequiredService 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRequiredServiceAccess().getGroup()); }
		(rule__RequiredService__Group__0)
		{ after(grammarAccess.getRequiredServiceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProvidedService
entryRuleProvidedService
:
{ before(grammarAccess.getProvidedServiceRule()); }
	 ruleProvidedService
{ after(grammarAccess.getProvidedServiceRule()); } 
	 EOF 
;

// Rule ProvidedService
ruleProvidedService 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProvidedServiceAccess().getGroup()); }
		(rule__ProvidedService__Group__0)
		{ after(grammarAccess.getProvidedServiceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCoordinationModuleMapping
entryRuleCoordinationModuleMapping
:
{ before(grammarAccess.getCoordinationModuleMappingRule()); }
	 ruleCoordinationModuleMapping
{ after(grammarAccess.getCoordinationModuleMappingRule()); } 
	 EOF 
;

// Rule CoordinationModuleMapping
ruleCoordinationModuleMapping 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCoordinationModuleMappingAccess().getGroup()); }
		(rule__CoordinationModuleMapping__Group__0)
		{ after(grammarAccess.getCoordinationModuleMappingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCoordinationInterfaceComponentInstanceMapping
entryRuleCoordinationInterfaceComponentInstanceMapping
:
{ before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingRule()); }
	 ruleCoordinationInterfaceComponentInstanceMapping
{ after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingRule()); } 
	 EOF 
;

// Rule CoordinationInterfaceComponentInstanceMapping
ruleCoordinationInterfaceComponentInstanceMapping 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getGroup()); }
		(rule__CoordinationInterfaceComponentInstanceMapping__Group__0)
		{ after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTaskRealizationModelRef
entryRuleTaskRealizationModelRef
:
{ before(grammarAccess.getTaskRealizationModelRefRule()); }
	 ruleTaskRealizationModelRef
{ after(grammarAccess.getTaskRealizationModelRefRule()); } 
	 EOF 
;

// Rule TaskRealizationModelRef
ruleTaskRealizationModelRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTaskRealizationModelRefAccess().getGroup()); }
		(rule__TaskRealizationModelRef__Group__0)
		{ after(grammarAccess.getTaskRealizationModelRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRoboticMiddleware
entryRuleRoboticMiddleware
:
{ before(grammarAccess.getRoboticMiddlewareRule()); }
	 ruleRoboticMiddleware
{ after(grammarAccess.getRoboticMiddlewareRule()); } 
	 EOF 
;

// Rule RoboticMiddleware
ruleRoboticMiddleware 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); }
		(rule__RoboticMiddleware__Alternatives)
		{ after(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFQN
entryRuleFQN
:
{ before(grammarAccess.getFQNRule()); }
	 ruleFQN
{ after(grammarAccess.getFQNRule()); } 
	 EOF 
;

// Rule FQN
ruleFQN 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFQNAccess().getGroup()); }
		(rule__FQN__Group__0)
		{ after(grammarAccess.getFQNAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEInt
entryRuleEInt
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEIntAccess().getGroup()); }
		(rule__EInt__Group__0)
		{ after(grammarAccess.getEIntAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleACE_SmartSoft
entryRuleACE_SmartSoft
:
{ before(grammarAccess.getACE_SmartSoftRule()); }
	 ruleACE_SmartSoft
{ after(grammarAccess.getACE_SmartSoftRule()); } 
	 EOF 
;

// Rule ACE_SmartSoft
ruleACE_SmartSoft 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getACE_SmartSoftAccess().getGroup()); }
		(rule__ACE_SmartSoft__Group__0)
		{ after(grammarAccess.getACE_SmartSoftAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpcUa_SeRoNet
entryRuleOpcUa_SeRoNet
:
{ before(grammarAccess.getOpcUa_SeRoNetRule()); }
	 ruleOpcUa_SeRoNet
{ after(grammarAccess.getOpcUa_SeRoNetRule()); } 
	 EOF 
;

// Rule OpcUa_SeRoNet
ruleOpcUa_SeRoNet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); }
		(rule__OpcUa_SeRoNet__Group__0)
		{ after(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCORBA_SmartSoft
entryRuleCORBA_SmartSoft
:
{ before(grammarAccess.getCORBA_SmartSoftRule()); }
	 ruleCORBA_SmartSoft
{ after(grammarAccess.getCORBA_SmartSoftRule()); } 
	 EOF 
;

// Rule CORBA_SmartSoft
ruleCORBA_SmartSoft 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); }
		(rule__CORBA_SmartSoft__Group__0)
		{ after(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDDS_SmartSoft
entryRuleDDS_SmartSoft
:
{ before(grammarAccess.getDDS_SmartSoftRule()); }
	 ruleDDS_SmartSoft
{ after(grammarAccess.getDDS_SmartSoftRule()); } 
	 EOF 
;

// Rule DDS_SmartSoft
ruleDDS_SmartSoft 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDDS_SmartSoftAccess().getGroup()); }
		(rule__DDS_SmartSoft__Group__0)
		{ after(grammarAccess.getDDS_SmartSoftAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemExtension__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSystemExtensionAccess().getCoordinationModuleMappingParserRuleCall_0()); }
		ruleCoordinationModuleMapping
		{ after(grammarAccess.getSystemExtensionAccess().getCoordinationModuleMappingParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSystemExtensionAccess().getTaskRealizationModelRefParserRuleCall_1()); }
		ruleTaskRealizationModelRef
		{ after(grammarAccess.getSystemExtensionAccess().getTaskRealizationModelRefParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstanceExtension__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInstanceExtensionAccess().getParameterStructInstanceParserRuleCall_0()); }
		ruleParameterStructInstance
		{ after(grammarAccess.getComponentInstanceExtensionAccess().getParameterStructInstanceParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getComponentInstanceExtensionAccess().getActivityConfigurationMappingParserRuleCall_1()); }
		ruleActivityConfigurationMapping
		{ after(grammarAccess.getComponentInstanceExtensionAccess().getActivityConfigurationMappingParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getComponentInstanceExtensionAccess().getInputHandlerConfigurationMappingParserRuleCall_2()); }
		ruleInputHandlerConfigurationMapping
		{ after(grammarAccess.getComponentInstanceExtensionAccess().getInputHandlerConfigurationMappingParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaDeviceClientInstanceParserRuleCall_3()); }
		ruleOpcUaDeviceClientInstance
		{ after(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaDeviceClientInstanceParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaReadServerInstanceParserRuleCall_4()); }
		ruleOpcUaReadServerInstance
		{ after(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaReadServerInstanceParserRuleCall_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceInstance__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServiceInstanceAccess().getRequiredServiceParserRuleCall_0()); }
		ruleRequiredService
		{ after(grammarAccess.getServiceInstanceAccess().getRequiredServiceParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getServiceInstanceAccess().getProvidedServiceParserRuleCall_1()); }
		ruleProvidedService
		{ after(grammarAccess.getServiceInstanceAccess().getProvidedServiceParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RoboticMiddleware__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoboticMiddlewareAccess().getACE_SmartSoftParserRuleCall_0()); }
		ruleACE_SmartSoft
		{ after(grammarAccess.getRoboticMiddlewareAccess().getACE_SmartSoftParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getRoboticMiddlewareAccess().getOpcUa_SeRoNetParserRuleCall_1()); }
		ruleOpcUa_SeRoNet
		{ after(grammarAccess.getRoboticMiddlewareAccess().getOpcUa_SeRoNetParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getRoboticMiddlewareAccess().getCORBA_SmartSoftParserRuleCall_2()); }
		ruleCORBA_SmartSoft
		{ after(grammarAccess.getRoboticMiddlewareAccess().getCORBA_SmartSoftParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getRoboticMiddlewareAccess().getDDS_SmartSoftParserRuleCall_3()); }
		ruleDDS_SmartSoft
		{ after(grammarAccess.getRoboticMiddlewareAccess().getDDS_SmartSoftParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemComponentArchitecture__Group__0__Impl
	rule__SystemComponentArchitecture__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureAction_0()); }
	()
	{ after(grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemComponentArchitecture__Group__1__Impl
	rule__SystemComponentArchitecture__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureKeyword_1()); }
	'SystemComponentArchitecture'
	{ after(grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemComponentArchitecture__Group__2__Impl
	rule__SystemComponentArchitecture__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemComponentArchitectureAccess().getNameAssignment_2()); }
	(rule__SystemComponentArchitecture__NameAssignment_2)
	{ after(grammarAccess.getSystemComponentArchitectureAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemComponentArchitecture__Group__3__Impl
	rule__SystemComponentArchitecture__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemComponentArchitectureAccess().getGroup_3()); }
	(rule__SystemComponentArchitecture__Group_3__0)?
	{ after(grammarAccess.getSystemComponentArchitectureAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemComponentArchitecture__Group__4__Impl
	rule__SystemComponentArchitecture__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemComponentArchitectureAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getSystemComponentArchitectureAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemComponentArchitecture__Group__5__Impl
	rule__SystemComponentArchitecture__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemComponentArchitectureAccess().getComponentsAssignment_5()); }
	(rule__SystemComponentArchitecture__ComponentsAssignment_5)*
	{ after(grammarAccess.getSystemComponentArchitectureAccess().getComponentsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemComponentArchitecture__Group__6__Impl
	rule__SystemComponentArchitecture__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemComponentArchitectureAccess().getConnectionsAssignment_6()); }
	(rule__SystemComponentArchitecture__ConnectionsAssignment_6)*
	{ after(grammarAccess.getSystemComponentArchitectureAccess().getConnectionsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemComponentArchitecture__Group__7__Impl
	rule__SystemComponentArchitecture__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemComponentArchitectureAccess().getExtensionsAssignment_7()); }
	(rule__SystemComponentArchitecture__ExtensionsAssignment_7)*
	{ after(grammarAccess.getSystemComponentArchitectureAccess().getExtensionsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemComponentArchitecture__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemComponentArchitectureAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getSystemComponentArchitectureAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SystemComponentArchitecture__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemComponentArchitecture__Group_3__0__Impl
	rule__SystemComponentArchitecture__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemComponentArchitectureAccess().getUsingActivityArchitectureKeyword_3_0()); }
	'usingActivityArchitecture'
	{ after(grammarAccess.getSystemComponentArchitectureAccess().getUsingActivityArchitectureKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SystemComponentArchitecture__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchAssignment_3_1()); }
	(rule__SystemComponentArchitecture__ActivityArchAssignment_3_1)
	{ after(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__0__Impl
	rule__Connection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getConnectionKeyword_0()); }
	'Connection'
	{ after(grammarAccess.getConnectionAccess().getConnectionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__1__Impl
	rule__Connection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getFromAssignment_1()); }
	(rule__Connection__FromAssignment_1)
	{ after(grammarAccess.getConnectionAccess().getFromAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__2__Impl
	rule__Connection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_2()); }
	'->'
	{ after(grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__3__Impl
	rule__Connection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getToAssignment_3()); }
	(rule__Connection__ToAssignment_3)
	{ after(grammarAccess.getConnectionAccess().getToAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__4__Impl
	rule__Connection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getGroup_4()); }
	(rule__Connection__Group_4__0)?
	{ after(grammarAccess.getConnectionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getSemicolonKeyword_5()); }
	(';')?
	{ after(grammarAccess.getConnectionAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Connection__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group_4__0__Impl
	rule__Connection__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getUseMiddlewareKeyword_4_0()); }
	'useMiddleware'
	{ after(grammarAccess.getConnectionAccess().getUseMiddlewareKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connection__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectionAccess().getMiddlewareSelectionAssignment_4_1()); }
	(rule__Connection__MiddlewareSelectionAssignment_4_1)
	{ after(grammarAccess.getConnectionAccess().getMiddlewareSelectionAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentInstance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInstance__Group__0__Impl
	rule__ComponentInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInstanceAccess().getComponentInstanceKeyword_0()); }
	'ComponentInstance'
	{ after(grammarAccess.getComponentInstanceAccess().getComponentInstanceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInstance__Group__1__Impl
	rule__ComponentInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInstanceAccess().getNameAssignment_1()); }
	(rule__ComponentInstance__NameAssignment_1)
	{ after(grammarAccess.getComponentInstanceAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInstance__Group__2__Impl
	rule__ComponentInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInstanceAccess().getInstantiatesKeyword_2()); }
	'instantiates'
	{ after(grammarAccess.getComponentInstanceAccess().getInstantiatesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInstance__Group__3__Impl
	rule__ComponentInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInstanceAccess().getComponentAssignment_3()); }
	(rule__ComponentInstance__ComponentAssignment_3)
	{ after(grammarAccess.getComponentInstanceAccess().getComponentAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInstance__Group__4__Impl
	rule__ComponentInstance__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInstanceAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getComponentInstanceAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInstance__Group__5__Impl
	rule__ComponentInstance__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInstanceAccess().getPortsAssignment_5()); }
	(rule__ComponentInstance__PortsAssignment_5)*
	{ after(grammarAccess.getComponentInstanceAccess().getPortsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInstance__Group__6__Impl
	rule__ComponentInstance__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInstanceAccess().getExtensionsAssignment_6()); }
	(rule__ComponentInstance__ExtensionsAssignment_6)*
	{ after(grammarAccess.getComponentInstanceAccess().getExtensionsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentInstance__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentInstanceAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getComponentInstanceAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterStructInstance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterStructInstance__Group__0__Impl
	rule__ParameterStructInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterStructInstance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterStructInstanceAccess().getParameterStructInstanceKeyword_0()); }
	'ParameterStructInstance'
	{ after(grammarAccess.getParameterStructInstanceAccess().getParameterStructInstanceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterStructInstance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterStructInstance__Group__1__Impl
	rule__ParameterStructInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterStructInstance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterStructInstanceAccess().getParameterAssignment_1()); }
	(rule__ParameterStructInstance__ParameterAssignment_1)
	{ after(grammarAccess.getParameterStructInstanceAccess().getParameterAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterStructInstance__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterStructInstance__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterStructInstance__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterStructInstanceAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getParameterStructInstanceAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivityConfigurationMapping__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityConfigurationMapping__Group__0__Impl
	rule__ActivityConfigurationMapping__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityConfigurationMapping__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityConfigurationMappingAccess().getActivityKeyword_0()); }
	'Activity'
	{ after(grammarAccess.getActivityConfigurationMappingAccess().getActivityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityConfigurationMapping__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityConfigurationMapping__Group__1__Impl
	rule__ActivityConfigurationMapping__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityConfigurationMapping__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityConfigurationMappingAccess().getActivityAssignment_1()); }
	(rule__ActivityConfigurationMapping__ActivityAssignment_1)
	{ after(grammarAccess.getActivityConfigurationMappingAccess().getActivityAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityConfigurationMapping__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityConfigurationMapping__Group__2__Impl
	rule__ActivityConfigurationMapping__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityConfigurationMapping__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityConfigurationMappingAccess().getConfigurationKeyword_2()); }
	'configuration'
	{ after(grammarAccess.getActivityConfigurationMappingAccess().getConfigurationKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityConfigurationMapping__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityConfigurationMapping__Group__3__Impl
	rule__ActivityConfigurationMapping__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityConfigurationMapping__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityConfigurationMappingAccess().getConfigAssignment_3()); }
	(rule__ActivityConfigurationMapping__ConfigAssignment_3)
	{ after(grammarAccess.getActivityConfigurationMappingAccess().getConfigAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityConfigurationMapping__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityConfigurationMapping__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityConfigurationMapping__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityConfigurationMappingAccess().getSemicolonKeyword_4()); }
	(';')?
	{ after(grammarAccess.getActivityConfigurationMappingAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InputHandlerConfigurationMapping__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerConfigurationMapping__Group__0__Impl
	rule__InputHandlerConfigurationMapping__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerConfigurationMapping__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerConfigurationMappingAccess().getInputHandlerKeyword_0()); }
	'InputHandler'
	{ after(grammarAccess.getInputHandlerConfigurationMappingAccess().getInputHandlerKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerConfigurationMapping__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerConfigurationMapping__Group__1__Impl
	rule__InputHandlerConfigurationMapping__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerConfigurationMapping__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerAssignment_1()); }
	(rule__InputHandlerConfigurationMapping__HandlerAssignment_1)
	{ after(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerConfigurationMapping__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerConfigurationMapping__Group__2__Impl
	rule__InputHandlerConfigurationMapping__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerConfigurationMapping__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigurationKeyword_2()); }
	'configuration'
	{ after(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigurationKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerConfigurationMapping__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerConfigurationMapping__Group__3__Impl
	rule__InputHandlerConfigurationMapping__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerConfigurationMapping__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigAssignment_3()); }
	(rule__InputHandlerConfigurationMapping__ConfigAssignment_3)
	{ after(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerConfigurationMapping__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerConfigurationMapping__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerConfigurationMapping__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerConfigurationMappingAccess().getSemicolonKeyword_4()); }
	(';')?
	{ after(grammarAccess.getInputHandlerConfigurationMappingAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpcUaDeviceClientInstance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClientInstance__Group__0__Impl
	rule__OpcUaDeviceClientInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClientInstance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getOpcUaDeviceClientInstanceKeyword_0()); }
	'OpcUaDeviceClientInstance'
	{ after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getOpcUaDeviceClientInstanceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClientInstance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClientInstance__Group__1__Impl
	rule__OpcUaDeviceClientInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClientInstance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientAssignment_1()); }
	(rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1)
	{ after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClientInstance__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClientInstance__Group__2__Impl
	rule__OpcUaDeviceClientInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClientInstance__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIKeyword_2()); }
	'deviceURI'
	{ after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClientInstance__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClientInstance__Group__3__Impl
	rule__OpcUaDeviceClientInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClientInstance__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIAssignment_3()); }
	(rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3)
	{ after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClientInstance__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClientInstance__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClientInstance__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getSemicolonKeyword_4()); }
	(';')?
	{ after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpcUaReadServerInstance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaReadServerInstance__Group__0__Impl
	rule__OpcUaReadServerInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServerInstance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaReadServerInstanceAccess().getOpcUaReadServerInstanceKeyword_0()); }
	'OpcUaReadServerInstance'
	{ after(grammarAccess.getOpcUaReadServerInstanceAccess().getOpcUaReadServerInstanceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServerInstance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaReadServerInstance__Group__1__Impl
	rule__OpcUaReadServerInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServerInstance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerAssignment_1()); }
	(rule__OpcUaReadServerInstance__ReadServerAssignment_1)
	{ after(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServerInstance__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaReadServerInstance__Group__2__Impl
	rule__OpcUaReadServerInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServerInstance__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaReadServerInstanceAccess().getGroup_2()); }
	(rule__OpcUaReadServerInstance__Group_2__0)?
	{ after(grammarAccess.getOpcUaReadServerInstanceAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServerInstance__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaReadServerInstance__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServerInstance__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaReadServerInstanceAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getOpcUaReadServerInstanceAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpcUaReadServerInstance__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaReadServerInstance__Group_2__0__Impl
	rule__OpcUaReadServerInstance__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServerInstance__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberKeyword_2_0()); }
	'portNumber'
	{ after(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServerInstance__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaReadServerInstance__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServerInstance__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberAssignment_2_1()); }
	(rule__OpcUaReadServerInstance__PortNumberAssignment_2_1)
	{ after(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiredService__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredService__Group__0__Impl
	rule__RequiredService__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredService__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_0()); }
	'RequiredService'
	{ after(grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredService__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredService__Group__1__Impl
	rule__RequiredService__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredService__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredServiceAccess().getPortAssignment_1()); }
	(rule__RequiredService__PortAssignment_1)
	{ after(grammarAccess.getRequiredServiceAccess().getPortAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredService__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredService__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredService__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidedService__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedService__Group__0__Impl
	rule__ProvidedService__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedService__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_0()); }
	'ProvidedService'
	{ after(grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedService__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedService__Group__1__Impl
	rule__ProvidedService__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedService__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedServiceAccess().getPortAssignment_1()); }
	(rule__ProvidedService__PortAssignment_1)
	{ after(grammarAccess.getProvidedServiceAccess().getPortAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedService__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedService__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedService__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedServiceAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getProvidedServiceAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinationModuleMapping__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleMapping__Group__0__Impl
	rule__CoordinationModuleMapping__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleMappingAccess().getCoordinationModuleMappingKeyword_0()); }
	'CoordinationModuleMapping'
	{ after(grammarAccess.getCoordinationModuleMappingAccess().getCoordinationModuleMappingKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleMapping__Group__1__Impl
	rule__CoordinationModuleMapping__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleMappingAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getCoordinationModuleMappingAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleMapping__Group__2__Impl
	rule__CoordinationModuleMapping__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleMappingAccess().getModuleInstanceKeyword_2()); }
	'moduleInstance'
	{ after(grammarAccess.getCoordinationModuleMappingAccess().getModuleInstanceKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleMapping__Group__3__Impl
	rule__CoordinationModuleMapping__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAssignment_3()); }
	(rule__CoordinationModuleMapping__CoordModuleInstAssignment_3)
	{ after(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleMapping__Group__4__Impl
	rule__CoordinationModuleMapping__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleMappingAccess().getRealizedbyKeyword_4()); }
	'realizedby'
	{ after(grammarAccess.getCoordinationModuleMappingAccess().getRealizedbyKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleMapping__Group__5__Impl
	rule__CoordinationModuleMapping__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealAssignment_5()); }
	(rule__CoordinationModuleMapping__CoordModRealAssignment_5)
	{ after(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleMapping__Group__6__Impl
	rule__CoordinationModuleMapping__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleMappingAccess().getLeftCurlyBracketKeyword_6()); }
	'{'
	{ after(grammarAccess.getCoordinationModuleMappingAccess().getLeftCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleMapping__Group__7__Impl
	rule__CoordinationModuleMapping__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingAssignment_7()); }
		(rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7)
		{ after(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingAssignment_7()); }
	)
	(
		{ before(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingAssignment_7()); }
		(rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7)*
		{ after(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingAssignment_7()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleMapping__Group__8__Impl
	rule__CoordinationModuleMapping__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleMappingAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getCoordinationModuleMappingAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationModuleMapping__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationModuleMappingAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getCoordinationModuleMappingAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinationInterfaceComponentInstanceMapping__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl
	rule__CoordinationInterfaceComponentInstanceMapping__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getInterfaceInstanceKeyword_0()); }
	'interfaceInstance'
	{ after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getInterfaceInstanceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceComponentInstanceMapping__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl
	rule__CoordinationInterfaceComponentInstanceMapping__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstAssignment_1()); }
	(rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1)
	{ after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceComponentInstanceMapping__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl
	rule__CoordinationInterfaceComponentInstanceMapping__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getRealizedbyKeyword_2()); }
	'realizedby'
	{ after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getRealizedbyKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceComponentInstanceMapping__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstAssignment_3()); }
	(rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3)
	{ after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TaskRealizationModelRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskRealizationModelRef__Group__0__Impl
	rule__TaskRealizationModelRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModelRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskRealizationModelRefAccess().getBehaviorTaskRefKeyword_0()); }
	'BehaviorTaskRef'
	{ after(grammarAccess.getTaskRealizationModelRefAccess().getBehaviorTaskRefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModelRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskRealizationModelRef__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModelRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefAssignment_1()); }
	(rule__TaskRealizationModelRef__TaskModelRefAssignment_1)
	{ after(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group__0__Impl
	rule__FQN__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getGroup_1()); }
	(rule__FQN__Group_1__0)*
	{ after(grammarAccess.getFQNAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group_1__0__Impl
	rule__FQN__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ACE_SmartSoft__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ACE_SmartSoft__Group__0__Impl
	rule__ACE_SmartSoft__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); }
	()
	{ after(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ACE_SmartSoft__Group__1__Impl
	rule__ACE_SmartSoft__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); }
	'ACE_SmartSoft'
	{ after(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ACE_SmartSoft__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); }
	(rule__ACE_SmartSoft__Group_2__0)?
	{ after(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ACE_SmartSoft__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ACE_SmartSoft__Group_2__0__Impl
	rule__ACE_SmartSoft__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); }
	'description'
	{ after(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ACE_SmartSoft__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); }
	(rule__ACE_SmartSoft__DescriptionAssignment_2_1)
	{ after(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpcUa_SeRoNet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUa_SeRoNet__Group__0__Impl
	rule__OpcUa_SeRoNet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); }
	()
	{ after(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUa_SeRoNet__Group__1__Impl
	rule__OpcUa_SeRoNet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); }
	'OpcUa_SeRoNet'
	{ after(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUa_SeRoNet__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); }
	(rule__OpcUa_SeRoNet__Group_2__0)?
	{ after(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpcUa_SeRoNet__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUa_SeRoNet__Group_2__0__Impl
	rule__OpcUa_SeRoNet__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); }
	'description'
	{ after(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUa_SeRoNet__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); }
	(rule__OpcUa_SeRoNet__DescriptionAssignment_2_1)
	{ after(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CORBA_SmartSoft__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CORBA_SmartSoft__Group__0__Impl
	rule__CORBA_SmartSoft__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); }
	()
	{ after(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CORBA_SmartSoft__Group__1__Impl
	rule__CORBA_SmartSoft__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); }
	'CORBA_SmartSoft'
	{ after(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CORBA_SmartSoft__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); }
	(rule__CORBA_SmartSoft__Group_2__0)?
	{ after(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CORBA_SmartSoft__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CORBA_SmartSoft__Group_2__0__Impl
	rule__CORBA_SmartSoft__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); }
	'description'
	{ after(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CORBA_SmartSoft__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); }
	(rule__CORBA_SmartSoft__DescriptionAssignment_2_1)
	{ after(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DDS_SmartSoft__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DDS_SmartSoft__Group__0__Impl
	rule__DDS_SmartSoft__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); }
	()
	{ after(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DDS_SmartSoft__Group__1__Impl
	rule__DDS_SmartSoft__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); }
	'DDS_SmartSoft'
	{ after(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DDS_SmartSoft__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); }
	(rule__DDS_SmartSoft__Group_2__0)?
	{ after(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DDS_SmartSoft__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DDS_SmartSoft__Group_2__0__Impl
	rule__DDS_SmartSoft__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); }
	'description'
	{ after(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DDS_SmartSoft__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); }
	(rule__DDS_SmartSoft__DescriptionAssignment_2_1)
	{ after(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SystemComponentArchitecture__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSystemComponentArchitectureAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getSystemComponentArchitectureAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__ActivityArchAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchActivityArchitectureModelCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchActivityArchitectureModelFQNParserRuleCall_3_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchActivityArchitectureModelFQNParserRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchActivityArchitectureModelCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__ComponentsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSystemComponentArchitectureAccess().getComponentsComponentInstanceParserRuleCall_5_0()); }
		ruleComponentInstance
		{ after(grammarAccess.getSystemComponentArchitectureAccess().getComponentsComponentInstanceParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__ConnectionsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSystemComponentArchitectureAccess().getConnectionsConnectionParserRuleCall_6_0()); }
		ruleConnection
		{ after(grammarAccess.getSystemComponentArchitectureAccess().getConnectionsConnectionParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SystemComponentArchitecture__ExtensionsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSystemComponentArchitectureAccess().getExtensionsSystemExtensionParserRuleCall_7_0()); }
		ruleSystemExtension
		{ after(grammarAccess.getSystemComponentArchitectureAccess().getExtensionsSystemExtensionParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__FromAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectionAccess().getFromRequiredServiceCrossReference_1_0()); }
		(
			{ before(grammarAccess.getConnectionAccess().getFromRequiredServiceFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getConnectionAccess().getFromRequiredServiceFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getConnectionAccess().getFromRequiredServiceCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__ToAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectionAccess().getToProvidedServiceCrossReference_3_0()); }
		(
			{ before(grammarAccess.getConnectionAccess().getToProvidedServiceFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getConnectionAccess().getToProvidedServiceFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getConnectionAccess().getToProvidedServiceCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connection__MiddlewareSelectionAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectionAccess().getMiddlewareSelectionRoboticMiddlewareParserRuleCall_4_1_0()); }
		ruleRoboticMiddleware
		{ after(grammarAccess.getConnectionAccess().getMiddlewareSelectionRoboticMiddlewareParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__ComponentAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInstanceAccess().getComponentComponentDefinitionCrossReference_3_0()); }
		(
			{ before(grammarAccess.getComponentInstanceAccess().getComponentComponentDefinitionFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getComponentInstanceAccess().getComponentComponentDefinitionFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getComponentInstanceAccess().getComponentComponentDefinitionCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__PortsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInstanceAccess().getPortsServiceInstanceParserRuleCall_5_0()); }
		ruleServiceInstance
		{ after(grammarAccess.getComponentInstanceAccess().getPortsServiceInstanceParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentInstance__ExtensionsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentInstanceAccess().getExtensionsComponentInstanceExtensionParserRuleCall_6_0()); }
		ruleComponentInstanceExtension
		{ after(grammarAccess.getComponentInstanceAccess().getExtensionsComponentInstanceExtensionParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterStructInstance__ParameterAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterStructInstanceAccess().getParameterComponentParameterInstanceCrossReference_1_0()); }
		(
			{ before(grammarAccess.getParameterStructInstanceAccess().getParameterComponentParameterInstanceFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getParameterStructInstanceAccess().getParameterComponentParameterInstanceFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getParameterStructInstanceAccess().getParameterComponentParameterInstanceCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityConfigurationMapping__ActivityAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityConfigurationMappingAccess().getActivityActivityCrossReference_1_0()); }
		(
			{ before(grammarAccess.getActivityConfigurationMappingAccess().getActivityActivityFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getActivityConfigurationMappingAccess().getActivityActivityFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getActivityConfigurationMappingAccess().getActivityActivityCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityConfigurationMapping__ConfigAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityConfigurationMappingAccess().getConfigActivityNodeCrossReference_3_0()); }
		(
			{ before(grammarAccess.getActivityConfigurationMappingAccess().getConfigActivityNodeFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getActivityConfigurationMappingAccess().getConfigActivityNodeFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getActivityConfigurationMappingAccess().getConfigActivityNodeCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerConfigurationMapping__HandlerAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerInputHandlerCrossReference_1_0()); }
		(
			{ before(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerInputHandlerFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerInputHandlerFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerInputHandlerCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerConfigurationMapping__ConfigAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigInputHandlerNodeCrossReference_3_0()); }
		(
			{ before(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigInputHandlerNodeFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigInputHandlerNodeFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigInputHandlerNodeCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientOpcUaDeviceClientCrossReference_1_0()); }
		(
			{ before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientOpcUaDeviceClientFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientOpcUaDeviceClientFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientOpcUaDeviceClientCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServerInstance__ReadServerAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerOpcUaReadServerCrossReference_1_0()); }
		(
			{ before(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerOpcUaReadServerFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerOpcUaReadServerFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerOpcUaReadServerCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServerInstance__PortNumberAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberEIntParserRuleCall_2_1_0()); }
		ruleEInt
		{ after(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberEIntParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredService__PortAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredServiceAccess().getPortComponentPortCrossReference_1_0()); }
		(
			{ before(grammarAccess.getRequiredServiceAccess().getPortComponentPortIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRequiredServiceAccess().getPortComponentPortIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getRequiredServiceAccess().getPortComponentPortCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedService__PortAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProvidedServiceAccess().getPortComponentPortCrossReference_1_0()); }
		(
			{ before(grammarAccess.getProvidedServiceAccess().getPortComponentPortIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getProvidedServiceAccess().getPortComponentPortIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getProvidedServiceAccess().getPortComponentPortCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__CoordModuleInstAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAbstractCoordinationModuleInstanceCrossReference_3_0()); }
		(
			{ before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAbstractCoordinationModuleInstanceFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAbstractCoordinationModuleInstanceFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAbstractCoordinationModuleInstanceCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__CoordModRealAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealCoordinationModuleRealizationCrossReference_5_0()); }
		(
			{ before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealCoordinationModuleRealizationIDTerminalRuleCall_5_0_1()); }
			RULE_ID
			{ after(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealCoordinationModuleRealizationIDTerminalRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealCoordinationModuleRealizationCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingCoordinationInterfaceComponentInstanceMappingParserRuleCall_7_0()); }
		ruleCoordinationInterfaceComponentInstanceMapping
		{ after(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingCoordinationInterfaceComponentInstanceMappingParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstCoordinationInterfaceInstanceCrossReference_1_0()); }
		(
			{ before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstCoordinationInterfaceInstanceIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstCoordinationInterfaceInstanceIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstCoordinationInterfaceInstanceCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstComponentInstanceCrossReference_3_0()); }
		(
			{ before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstComponentInstanceIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstComponentInstanceIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstComponentInstanceCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskRealizationModelRef__TaskModelRefAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefTaskRealizationModelCrossReference_1_0()); }
		(
			{ before(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefTaskRealizationModelFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefTaskRealizationModelFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefTaskRealizationModelCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ACE_SmartSoft__DescriptionAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getACE_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
		ruleEString
		{ after(grammarAccess.getACE_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUa_SeRoNet__DescriptionAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
		ruleEString
		{ after(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CORBA_SmartSoft__DescriptionAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
		ruleEString
		{ after(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DDS_SmartSoft__DescriptionAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
		ruleEString
		{ after(grammarAccess.getDDS_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

fragment RULE_ML_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~('/') ~(('\n'|'\r'))* ('\r'? '\n')?;

fragment RULE_SL_DOCUMENTATION : '///' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_DOCU_COMMENT : (RULE_ML_DOCUMENTATION|RULE_SL_DOCUMENTATION);

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
