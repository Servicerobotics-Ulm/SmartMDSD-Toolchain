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
grammar InternalComponentDefinition;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.component.componentDefinition.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.component.componentDefinition.ide.contentassist.antlr.internal;

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
import org.xtext.component.componentDefinition.services.ComponentDefinitionGrammarAccess;

}
@parser::members {
	private ComponentDefinitionGrammarAccess grammarAccess;

	public void setGrammarAccess(ComponentDefinitionGrammarAccess grammarAccess) {
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

// Entry rule entryRuleComponentDefModel
entryRuleComponentDefModel
:
{ before(grammarAccess.getComponentDefModelRule()); }
	 ruleComponentDefModel
{ after(grammarAccess.getComponentDefModelRule()); } 
	 EOF 
;

// Rule ComponentDefModel
ruleComponentDefModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentDefModelAccess().getGroup()); }
		(rule__ComponentDefModel__Group__0)
		{ after(grammarAccess.getComponentDefModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleServiceRepoImport
entryRuleServiceRepoImport
:
{ before(grammarAccess.getServiceRepoImportRule()); }
	 ruleServiceRepoImport
{ after(grammarAccess.getServiceRepoImportRule()); } 
	 EOF 
;

// Rule ServiceRepoImport
ruleServiceRepoImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getServiceRepoImportAccess().getGroup()); }
		(rule__ServiceRepoImport__Group__0)
		{ after(grammarAccess.getServiceRepoImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentDefinition
entryRuleComponentDefinition
:
{ before(grammarAccess.getComponentDefinitionRule()); }
	 ruleComponentDefinition
{ after(grammarAccess.getComponentDefinitionRule()); } 
	 EOF 
;

// Rule ComponentDefinition
ruleComponentDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentDefinitionAccess().getGroup()); }
		(rule__ComponentDefinition__Group__0)
		{ after(grammarAccess.getComponentDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractComponentElement
entryRuleAbstractComponentElement
:
{ before(grammarAccess.getAbstractComponentElementRule()); }
	 ruleAbstractComponentElement
{ after(grammarAccess.getAbstractComponentElementRule()); } 
	 EOF 
;

// Rule AbstractComponentElement
ruleAbstractComponentElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractComponentElementAccess().getAlternatives()); }
		(rule__AbstractComponentElement__Alternatives)
		{ after(grammarAccess.getAbstractComponentElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDerivedComponentElement
entryRuleDerivedComponentElement
:
{ before(grammarAccess.getDerivedComponentElementRule()); }
	 ruleDerivedComponentElement
{ after(grammarAccess.getDerivedComponentElementRule()); } 
	 EOF 
;

// Rule DerivedComponentElement
ruleDerivedComponentElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDerivedComponentElementAccess().getComponentParametersRefParserRuleCall()); }
		ruleComponentParametersRef
		{ after(grammarAccess.getDerivedComponentElementAccess().getComponentParametersRefParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNamedComponentElement
entryRuleNamedComponentElement
:
{ before(grammarAccess.getNamedComponentElementRule()); }
	 ruleNamedComponentElement
{ after(grammarAccess.getNamedComponentElementRule()); } 
	 EOF 
;

// Rule NamedComponentElement
ruleNamedComponentElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNamedComponentElementAccess().getAlternatives()); }
		(rule__NamedComponentElement__Alternatives)
		{ after(grammarAccess.getNamedComponentElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentSubNode
entryRuleComponentSubNode
:
{ before(grammarAccess.getComponentSubNodeRule()); }
	 ruleComponentSubNode
{ after(grammarAccess.getComponentSubNodeRule()); } 
	 EOF 
;

// Rule ComponentSubNode
ruleComponentSubNode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentSubNodeAccess().getAlternatives()); }
		(rule__ComponentSubNode__Alternatives)
		{ after(grammarAccess.getComponentSubNodeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentPort
entryRuleComponentPort
:
{ before(grammarAccess.getComponentPortRule()); }
	 ruleComponentPort
{ after(grammarAccess.getComponentPortRule()); } 
	 EOF 
;

// Rule ComponentPort
ruleComponentPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentPortAccess().getAlternatives()); }
		(rule__ComponentPort__Alternatives)
		{ after(grammarAccess.getComponentPortAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRequestPort
entryRuleRequestPort
:
{ before(grammarAccess.getRequestPortRule()); }
	 ruleRequestPort
{ after(grammarAccess.getRequestPortRule()); } 
	 EOF 
;

// Rule RequestPort
ruleRequestPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRequestPortAccess().getGroup()); }
		(rule__RequestPort__Group__0)
		{ after(grammarAccess.getRequestPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOutputPort
entryRuleOutputPort
:
{ before(grammarAccess.getOutputPortRule()); }
	 ruleOutputPort
{ after(grammarAccess.getOutputPortRule()); } 
	 EOF 
;

// Rule OutputPort
ruleOutputPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOutputPortAccess().getGroup()); }
		(rule__OutputPort__Group__0)
		{ after(grammarAccess.getOutputPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnswerPort
entryRuleAnswerPort
:
{ before(grammarAccess.getAnswerPortRule()); }
	 ruleAnswerPort
{ after(grammarAccess.getAnswerPortRule()); } 
	 EOF 
;

// Rule AnswerPort
ruleAnswerPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnswerPortAccess().getGroup()); }
		(rule__AnswerPort__Group__0)
		{ after(grammarAccess.getAnswerPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInputPort
entryRuleInputPort
:
{ before(grammarAccess.getInputPortRule()); }
	 ruleInputPort
{ after(grammarAccess.getInputPortRule()); } 
	 EOF 
;

// Rule InputPort
ruleInputPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputPortAccess().getGroup()); }
		(rule__InputPort__Group__0)
		{ after(grammarAccess.getInputPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentPortExtension
entryRuleComponentPortExtension
:
{ before(grammarAccess.getComponentPortExtensionRule()); }
	 ruleComponentPortExtension
{ after(grammarAccess.getComponentPortExtensionRule()); } 
	 EOF 
;

// Rule ComponentPortExtension
ruleComponentPortExtension 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentPortExtensionAccess().getSupportedMiddlewareParserRuleCall()); }
		ruleSupportedMiddleware
		{ after(grammarAccess.getComponentPortExtensionAccess().getSupportedMiddlewareParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSupportedMiddleware
entryRuleSupportedMiddleware
:
{ before(grammarAccess.getSupportedMiddlewareRule()); }
	 ruleSupportedMiddleware
{ after(grammarAccess.getSupportedMiddlewareRule()); } 
	 EOF 
;

// Rule SupportedMiddleware
ruleSupportedMiddleware 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSupportedMiddlewareAccess().getGroup()); }
		(rule__SupportedMiddleware__Group__0)
		{ after(grammarAccess.getSupportedMiddlewareAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleActivity
entryRuleActivity
:
{ before(grammarAccess.getActivityRule()); }
	 ruleActivity
{ after(grammarAccess.getActivityRule()); } 
	 EOF 
;

// Rule Activity
ruleActivity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActivityAccess().getGroup()); }
		(rule__Activity__Group__0)
		{ after(grammarAccess.getActivityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInputHandler
entryRuleInputHandler
:
{ before(grammarAccess.getInputHandlerRule()); }
	 ruleInputHandler
{ after(grammarAccess.getInputHandlerRule()); } 
	 EOF 
;

// Rule InputHandler
ruleInputHandler 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputHandlerAccess().getGroup()); }
		(rule__InputHandler__Group__0)
		{ after(grammarAccess.getInputHandlerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRequestHandler
entryRuleRequestHandler
:
{ before(grammarAccess.getRequestHandlerRule()); }
	 ruleRequestHandler
{ after(grammarAccess.getRequestHandlerRule()); } 
	 EOF 
;

// Rule RequestHandler
ruleRequestHandler 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRequestHandlerAccess().getGroup()); }
		(rule__RequestHandler__Group__0)
		{ after(grammarAccess.getRequestHandlerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractComponentLink
entryRuleAbstractComponentLink
:
{ before(grammarAccess.getAbstractComponentLinkRule()); }
	 ruleAbstractComponentLink
{ after(grammarAccess.getAbstractComponentLinkRule()); } 
	 EOF 
;

// Rule AbstractComponentLink
ruleAbstractComponentLink 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractComponentLinkAccess().getAlternatives()); }
		(rule__AbstractComponentLink__Alternatives)
		{ after(grammarAccess.getAbstractComponentLinkAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRequestPortLink
entryRuleRequestPortLink
:
{ before(grammarAccess.getRequestPortLinkRule()); }
	 ruleRequestPortLink
{ after(grammarAccess.getRequestPortLinkRule()); } 
	 EOF 
;

// Rule RequestPortLink
ruleRequestPortLink 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRequestPortLinkAccess().getGroup()); }
		(rule__RequestPortLink__Group__0)
		{ after(grammarAccess.getRequestPortLinkAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpcUaClientLink
entryRuleOpcUaClientLink
:
{ before(grammarAccess.getOpcUaClientLinkRule()); }
	 ruleOpcUaClientLink
{ after(grammarAccess.getOpcUaClientLinkRule()); } 
	 EOF 
;

// Rule OpcUaClientLink
ruleOpcUaClientLink 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpcUaClientLinkAccess().getGroup()); }
		(rule__OpcUaClientLink__Group__0)
		{ after(grammarAccess.getOpcUaClientLinkAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentSubNodeObserver
entryRuleComponentSubNodeObserver
:
{ before(grammarAccess.getComponentSubNodeObserverRule()); }
	 ruleComponentSubNodeObserver
{ after(grammarAccess.getComponentSubNodeObserverRule()); } 
	 EOF 
;

// Rule ComponentSubNodeObserver
ruleComponentSubNodeObserver 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentSubNodeObserverAccess().getGroup()); }
		(rule__ComponentSubNodeObserver__Group__0)
		{ after(grammarAccess.getComponentSubNodeObserverAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInputLinkExtension
entryRuleInputLinkExtension
:
{ before(grammarAccess.getInputLinkExtensionRule()); }
	 ruleInputLinkExtension
{ after(grammarAccess.getInputLinkExtensionRule()); } 
	 EOF 
;

// Rule InputLinkExtension
ruleInputLinkExtension 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputLinkExtensionAccess().getGroup()); }
		(rule__InputLinkExtension__Group__0)
		{ after(grammarAccess.getInputLinkExtensionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleActivityExtension
entryRuleActivityExtension
:
{ before(grammarAccess.getActivityExtensionRule()); }
	 ruleActivityExtension
{ after(grammarAccess.getActivityExtensionRule()); } 
	 EOF 
;

// Rule ActivityExtension
ruleActivityExtension 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActivityExtensionAccess().getAlternatives()); }
		(rule__ActivityExtension__Alternatives)
		{ after(grammarAccess.getActivityExtensionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleActivationConstraints
entryRuleActivationConstraints
:
{ before(grammarAccess.getActivationConstraintsRule()); }
	 ruleActivationConstraints
{ after(grammarAccess.getActivationConstraintsRule()); } 
	 EOF 
;

// Rule ActivationConstraints
ruleActivationConstraints 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActivationConstraintsAccess().getGroup()); }
		(rule__ActivationConstraints__Group__0)
		{ after(grammarAccess.getActivationConstraintsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOperationModeBinding
entryRuleOperationModeBinding
:
{ before(grammarAccess.getOperationModeBindingRule()); }
	 ruleOperationModeBinding
{ after(grammarAccess.getOperationModeBindingRule()); } 
	 EOF 
;

// Rule OperationModeBinding
ruleOperationModeBinding 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperationModeBindingAccess().getGroup()); }
		(rule__OperationModeBinding__Group__0)
		{ after(grammarAccess.getOperationModeBindingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefaultTrigger
entryRuleDefaultTrigger
:
{ before(grammarAccess.getDefaultTriggerRule()); }
	 ruleDefaultTrigger
{ after(grammarAccess.getDefaultTriggerRule()); } 
	 EOF 
;

// Rule DefaultTrigger
ruleDefaultTrigger 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefaultTriggerAccess().getGroup()); }
		(rule__DefaultTrigger__Group__0)
		{ after(grammarAccess.getDefaultTriggerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefaultInputTrigger
entryRuleDefaultInputTrigger
:
{ before(grammarAccess.getDefaultInputTriggerRule()); }
	 ruleDefaultInputTrigger
{ after(grammarAccess.getDefaultInputTriggerRule()); } 
	 EOF 
;

// Rule DefaultInputTrigger
ruleDefaultInputTrigger 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefaultInputTriggerAccess().getGroup()); }
		(rule__DefaultInputTrigger__Group__0)
		{ after(grammarAccess.getDefaultInputTriggerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefaultPeriodicTimer
entryRuleDefaultPeriodicTimer
:
{ before(grammarAccess.getDefaultPeriodicTimerRule()); }
	 ruleDefaultPeriodicTimer
{ after(grammarAccess.getDefaultPeriodicTimerRule()); } 
	 EOF 
;

// Rule DefaultPeriodicTimer
ruleDefaultPeriodicTimer 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefaultPeriodicTimerAccess().getGroup()); }
		(rule__DefaultPeriodicTimer__Group__0)
		{ after(grammarAccess.getDefaultPeriodicTimerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefaultObservedElementTrigger
entryRuleDefaultObservedElementTrigger
:
{ before(grammarAccess.getDefaultObservedElementTriggerRule()); }
	 ruleDefaultObservedElementTrigger
{ after(grammarAccess.getDefaultObservedElementTriggerRule()); } 
	 EOF 
;

// Rule DefaultObservedElementTrigger
ruleDefaultObservedElementTrigger 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefaultObservedElementTriggerAccess().getGroup()); }
		(rule__DefaultObservedElementTrigger__Group__0)
		{ after(grammarAccess.getDefaultObservedElementTriggerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlainOpcUaPort
entryRulePlainOpcUaPort
:
{ before(grammarAccess.getPlainOpcUaPortRule()); }
	 rulePlainOpcUaPort
{ after(grammarAccess.getPlainOpcUaPortRule()); } 
	 EOF 
;

// Rule PlainOpcUaPort
rulePlainOpcUaPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlainOpcUaPortAccess().getAlternatives()); }
		(rule__PlainOpcUaPort__Alternatives)
		{ after(grammarAccess.getPlainOpcUaPortAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpcUaDeviceClient
entryRuleOpcUaDeviceClient
:
{ before(grammarAccess.getOpcUaDeviceClientRule()); }
	 ruleOpcUaDeviceClient
{ after(grammarAccess.getOpcUaDeviceClientRule()); } 
	 EOF 
;

// Rule OpcUaDeviceClient
ruleOpcUaDeviceClient 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpcUaDeviceClientAccess().getGroup()); }
		(rule__OpcUaDeviceClient__Group__0)
		{ after(grammarAccess.getOpcUaDeviceClientAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOpcUaReadServer
entryRuleOpcUaReadServer
:
{ before(grammarAccess.getOpcUaReadServerRule()); }
	 ruleOpcUaReadServer
{ after(grammarAccess.getOpcUaReadServerRule()); } 
	 EOF 
;

// Rule OpcUaReadServer
ruleOpcUaReadServer 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpcUaReadServerAccess().getGroup()); }
		(rule__OpcUaReadServer__Group__0)
		{ after(grammarAccess.getOpcUaReadServerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCoordinationSlavePort
entryRuleCoordinationSlavePort
:
{ before(grammarAccess.getCoordinationSlavePortRule()); }
	 ruleCoordinationSlavePort
{ after(grammarAccess.getCoordinationSlavePortRule()); } 
	 EOF 
;

// Rule CoordinationSlavePort
ruleCoordinationSlavePort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCoordinationSlavePortAccess().getGroup()); }
		(rule__CoordinationSlavePort__Group__0)
		{ after(grammarAccess.getCoordinationSlavePortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractCoordinationElement
entryRuleAbstractCoordinationElement
:
{ before(grammarAccess.getAbstractCoordinationElementRule()); }
	 ruleAbstractCoordinationElement
{ after(grammarAccess.getAbstractCoordinationElementRule()); } 
	 EOF 
;

// Rule AbstractCoordinationElement
ruleAbstractCoordinationElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractCoordinationElementAccess().getAlternatives()); }
		(rule__AbstractCoordinationElement__Alternatives)
		{ after(grammarAccess.getAbstractCoordinationElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSkillRealizationsRef
entryRuleSkillRealizationsRef
:
{ before(grammarAccess.getSkillRealizationsRefRule()); }
	 ruleSkillRealizationsRef
{ after(grammarAccess.getSkillRealizationsRefRule()); } 
	 EOF 
;

// Rule SkillRealizationsRef
ruleSkillRealizationsRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSkillRealizationsRefAccess().getGroup()); }
		(rule__SkillRealizationsRef__Group__0)
		{ after(grammarAccess.getSkillRealizationsRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommunicationServiceUsageRealization
entryRuleCommunicationServiceUsageRealization
:
{ before(grammarAccess.getCommunicationServiceUsageRealizationRule()); }
	 ruleCommunicationServiceUsageRealization
{ after(grammarAccess.getCommunicationServiceUsageRealizationRule()); } 
	 EOF 
;

// Rule CommunicationServiceUsageRealization
ruleCommunicationServiceUsageRealization 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getGroup()); }
		(rule__CommunicationServiceUsageRealization__Group__0)
		{ after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePublicOperationMode
entryRulePublicOperationMode
:
{ before(grammarAccess.getPublicOperationModeRule()); }
	 rulePublicOperationMode
{ after(grammarAccess.getPublicOperationModeRule()); } 
	 EOF 
;

// Rule PublicOperationMode
rulePublicOperationMode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPublicOperationModeAccess().getGroup()); }
		(rule__PublicOperationMode__Group__0)
		{ after(grammarAccess.getPublicOperationModeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrivateOperationMode
entryRulePrivateOperationMode
:
{ before(grammarAccess.getPrivateOperationModeRule()); }
	 rulePrivateOperationMode
{ after(grammarAccess.getPrivateOperationModeRule()); } 
	 EOF 
;

// Rule PrivateOperationMode
rulePrivateOperationMode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrivateOperationModeAccess().getGroup()); }
		(rule__PrivateOperationMode__Group__0)
		{ after(grammarAccess.getPrivateOperationModeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCoordinationMasterPort
entryRuleCoordinationMasterPort
:
{ before(grammarAccess.getCoordinationMasterPortRule()); }
	 ruleCoordinationMasterPort
{ after(grammarAccess.getCoordinationMasterPortRule()); } 
	 EOF 
;

// Rule CoordinationMasterPort
ruleCoordinationMasterPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCoordinationMasterPortAccess().getGroup()); }
		(rule__CoordinationMasterPort__Group__0)
		{ after(grammarAccess.getCoordinationMasterPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentParametersRef
entryRuleComponentParametersRef
:
{ before(grammarAccess.getComponentParametersRefRule()); }
	 ruleComponentParametersRef
{ after(grammarAccess.getComponentParametersRefRule()); } 
	 EOF 
;

// Rule ComponentParametersRef
ruleComponentParametersRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentParametersRefAccess().getGroup()); }
		(rule__ComponentParametersRef__Group__0)
		{ after(grammarAccess.getComponentParametersRefAccess().getGroup()); }
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

// Entry rule entryRuleFQNW
entryRuleFQNW
:
{ before(grammarAccess.getFQNWRule()); }
	 ruleFQNW
{ after(grammarAccess.getFQNWRule()); } 
	 EOF 
;

// Rule FQNW
ruleFQNW 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFQNWAccess().getGroup()); }
		(rule__FQNW__Group__0)
		{ after(grammarAccess.getFQNWAccess().getGroup()); }
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

// Entry rule entryRuleEDouble
entryRuleEDouble
:
{ before(grammarAccess.getEDoubleRule()); }
	 ruleEDouble
{ after(grammarAccess.getEDoubleRule()); } 
	 EOF 
;

// Rule EDouble
ruleEDouble 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEDoubleAccess().getGroup()); }
		(rule__EDouble__Group__0)
		{ after(grammarAccess.getEDoubleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEBoolean
entryRuleEBoolean
:
{ before(grammarAccess.getEBooleanRule()); }
	 ruleEBoolean
{ after(grammarAccess.getEBooleanRule()); } 
	 EOF 
;

// Rule EBoolean
ruleEBoolean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEBooleanAccess().getAlternatives()); }
		(rule__EBoolean__Alternatives)
		{ after(grammarAccess.getEBooleanAccess().getAlternatives()); }
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

rule__AbstractComponentElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractComponentElementAccess().getNamedComponentElementParserRuleCall_0()); }
		ruleNamedComponentElement
		{ after(grammarAccess.getAbstractComponentElementAccess().getNamedComponentElementParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractComponentElementAccess().getDerivedComponentElementParserRuleCall_1()); }
		ruleDerivedComponentElement
		{ after(grammarAccess.getAbstractComponentElementAccess().getDerivedComponentElementParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedComponentElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamedComponentElementAccess().getComponentSubNodeParserRuleCall_0()); }
		ruleComponentSubNode
		{ after(grammarAccess.getNamedComponentElementAccess().getComponentSubNodeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNamedComponentElementAccess().getComponentPortParserRuleCall_1()); }
		ruleComponentPort
		{ after(grammarAccess.getNamedComponentElementAccess().getComponentPortParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getNamedComponentElementAccess().getCoordinationSlavePortParserRuleCall_2()); }
		ruleCoordinationSlavePort
		{ after(grammarAccess.getNamedComponentElementAccess().getCoordinationSlavePortParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getNamedComponentElementAccess().getCoordinationMasterPortParserRuleCall_3()); }
		ruleCoordinationMasterPort
		{ after(grammarAccess.getNamedComponentElementAccess().getCoordinationMasterPortParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getNamedComponentElementAccess().getPlainOpcUaPortParserRuleCall_4()); }
		rulePlainOpcUaPort
		{ after(grammarAccess.getNamedComponentElementAccess().getPlainOpcUaPortParserRuleCall_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSubNode__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentSubNodeAccess().getActivityParserRuleCall_0()); }
		ruleActivity
		{ after(grammarAccess.getComponentSubNodeAccess().getActivityParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getComponentSubNodeAccess().getInputHandlerParserRuleCall_1()); }
		ruleInputHandler
		{ after(grammarAccess.getComponentSubNodeAccess().getInputHandlerParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getComponentSubNodeAccess().getRequestHandlerParserRuleCall_2()); }
		ruleRequestHandler
		{ after(grammarAccess.getComponentSubNodeAccess().getRequestHandlerParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentPort__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentPortAccess().getInputPortParserRuleCall_0()); }
		ruleInputPort
		{ after(grammarAccess.getComponentPortAccess().getInputPortParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getComponentPortAccess().getAnswerPortParserRuleCall_1()); }
		ruleAnswerPort
		{ after(grammarAccess.getComponentPortAccess().getAnswerPortParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getComponentPortAccess().getOutputPortParserRuleCall_2()); }
		ruleOutputPort
		{ after(grammarAccess.getComponentPortAccess().getOutputPortParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getComponentPortAccess().getRequestPortParserRuleCall_3()); }
		ruleRequestPort
		{ after(grammarAccess.getComponentPortAccess().getRequestPortParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractComponentLink__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractComponentLinkAccess().getComponentSubNodeObserverParserRuleCall_0()); }
		ruleComponentSubNodeObserver
		{ after(grammarAccess.getAbstractComponentLinkAccess().getComponentSubNodeObserverParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractComponentLinkAccess().getRequestPortLinkParserRuleCall_1()); }
		ruleRequestPortLink
		{ after(grammarAccess.getAbstractComponentLinkAccess().getRequestPortLinkParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractComponentLinkAccess().getInputLinkExtensionParserRuleCall_2()); }
		ruleInputLinkExtension
		{ after(grammarAccess.getAbstractComponentLinkAccess().getInputLinkExtensionParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractComponentLinkAccess().getOpcUaClientLinkParserRuleCall_3()); }
		ruleOpcUaClientLink
		{ after(grammarAccess.getAbstractComponentLinkAccess().getOpcUaClientLinkParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityExtension__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityExtensionAccess().getActivationConstraintsParserRuleCall_0()); }
		ruleActivationConstraints
		{ after(grammarAccess.getActivityExtensionAccess().getActivationConstraintsParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getActivityExtensionAccess().getOperationModeBindingParserRuleCall_1()); }
		ruleOperationModeBinding
		{ after(grammarAccess.getActivityExtensionAccess().getOperationModeBindingParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getActivityExtensionAccess().getDefaultTriggerParserRuleCall_2()); }
		ruleDefaultTrigger
		{ after(grammarAccess.getActivityExtensionAccess().getDefaultTriggerParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultTrigger__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefaultTriggerAccess().getDefaultInputTriggerParserRuleCall_1_0()); }
		ruleDefaultInputTrigger
		{ after(grammarAccess.getDefaultTriggerAccess().getDefaultInputTriggerParserRuleCall_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefaultTriggerAccess().getDefaultPeriodicTimerParserRuleCall_1_1()); }
		ruleDefaultPeriodicTimer
		{ after(grammarAccess.getDefaultTriggerAccess().getDefaultPeriodicTimerParserRuleCall_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getDefaultTriggerAccess().getDefaultObservedElementTriggerParserRuleCall_1_2()); }
		ruleDefaultObservedElementTrigger
		{ after(grammarAccess.getDefaultTriggerAccess().getDefaultObservedElementTriggerParserRuleCall_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainOpcUaPort__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlainOpcUaPortAccess().getOpcUaDeviceClientParserRuleCall_0()); }
		ruleOpcUaDeviceClient
		{ after(grammarAccess.getPlainOpcUaPortAccess().getOpcUaDeviceClientParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPlainOpcUaPortAccess().getOpcUaReadServerParserRuleCall_1()); }
		ruleOpcUaReadServer
		{ after(grammarAccess.getPlainOpcUaPortAccess().getOpcUaReadServerParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractCoordinationElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractCoordinationElementAccess().getPublicOperationModeParserRuleCall_0()); }
		rulePublicOperationMode
		{ after(grammarAccess.getAbstractCoordinationElementAccess().getPublicOperationModeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractCoordinationElementAccess().getPrivateOperationModeParserRuleCall_1()); }
		rulePrivateOperationMode
		{ after(grammarAccess.getAbstractCoordinationElementAccess().getPrivateOperationModeParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractCoordinationElementAccess().getCommunicationServiceUsageRealizationParserRuleCall_2()); }
		ruleCommunicationServiceUsageRealization
		{ after(grammarAccess.getAbstractCoordinationElementAccess().getCommunicationServiceUsageRealizationParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractCoordinationElementAccess().getSkillRealizationsRefParserRuleCall_3()); }
		ruleSkillRealizationsRef
		{ after(grammarAccess.getAbstractCoordinationElementAccess().getSkillRealizationsRefParserRuleCall_3()); }
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

rule__EDouble__Alternatives_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); }
		'E'
		{ after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); }
		'e'
		{ after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EBoolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }
		'true'
		{ after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }
		'false'
		{ after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDefModel__Group__0__Impl
	rule__ComponentDefModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDefModelAccess().getComponentDefModelAction_0()); }
	()
	{ after(grammarAccess.getComponentDefModelAccess().getComponentDefModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDefModel__Group__1__Impl
	rule__ComponentDefModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDefModelAccess().getImportsAssignment_1()); }
	(rule__ComponentDefModel__ImportsAssignment_1)*
	{ after(grammarAccess.getComponentDefModelAccess().getImportsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDefModel__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDefModelAccess().getComponentAssignment_2()); }
	(rule__ComponentDefModel__ComponentAssignment_2)?
	{ after(grammarAccess.getComponentDefModelAccess().getComponentAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceRepoImport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceRepoImport__Group__0__Impl
	rule__ServiceRepoImport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoImport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceRepoImportAccess().getImportKeyword_0()); }
	'#import'
	{ after(grammarAccess.getServiceRepoImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoImport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceRepoImport__Group__1__Impl
	rule__ServiceRepoImport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoImport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceRepoImportAccess().getImportedNamespaceAssignment_1()); }
	(rule__ServiceRepoImport__ImportedNamespaceAssignment_1)
	{ after(grammarAccess.getServiceRepoImportAccess().getImportedNamespaceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoImport__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceRepoImport__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoImport__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceRepoImportAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getServiceRepoImportAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDefinition__Group__0__Impl
	rule__ComponentDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDefinitionAccess().getComponentDefinitionKeyword_0()); }
	'ComponentDefinition'
	{ after(grammarAccess.getComponentDefinitionAccess().getComponentDefinitionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDefinition__Group__1__Impl
	rule__ComponentDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDefinitionAccess().getNameAssignment_1()); }
	(rule__ComponentDefinition__NameAssignment_1)
	{ after(grammarAccess.getComponentDefinitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDefinition__Group__2__Impl
	rule__ComponentDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDefinitionAccess().getGroup_2()); }
	(rule__ComponentDefinition__Group_2__0)?
	{ after(grammarAccess.getComponentDefinitionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDefinition__Group__3__Impl
	rule__ComponentDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDefinitionAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getComponentDefinitionAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDefinition__Group__4__Impl
	rule__ComponentDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDefinitionAccess().getElementsAssignment_4()); }
	(rule__ComponentDefinition__ElementsAssignment_4)*
	{ after(grammarAccess.getComponentDefinitionAccess().getElementsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDefinition__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDefinitionAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getComponentDefinitionAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentDefinition__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDefinition__Group_2__0__Impl
	rule__ComponentDefinition__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDefinitionAccess().getLogoKeyword_2_0()); }
	'logo'
	{ after(grammarAccess.getComponentDefinitionAccess().getLogoKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDefinition__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDefinitionAccess().getLogoAssignment_2_1()); }
	(rule__ComponentDefinition__LogoAssignment_2_1)
	{ after(grammarAccess.getComponentDefinitionAccess().getLogoAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequestPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestPort__Group__0__Impl
	rule__RequestPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestPortAccess().getRequestPortKeyword_0()); }
	'RequestPort'
	{ after(grammarAccess.getRequestPortAccess().getRequestPortKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestPort__Group__1__Impl
	rule__RequestPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestPortAccess().getNameAssignment_1()); }
	(rule__RequestPort__NameAssignment_1)
	{ after(grammarAccess.getRequestPortAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestPort__Group__2__Impl
	rule__RequestPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestPortAccess().getImplementsKeyword_2()); }
	'implements'
	{ after(grammarAccess.getRequestPortAccess().getImplementsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestPort__Group__3__Impl
	rule__RequestPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestPortAccess().getServiceAssignment_3()); }
	(rule__RequestPort__ServiceAssignment_3)
	{ after(grammarAccess.getRequestPortAccess().getServiceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestPort__Group__4__Impl
	rule__RequestPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestPortAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getRequestPortAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestPort__Group__5__Impl
	rule__RequestPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestPortAccess().getExtensionsAssignment_5()); }
	(rule__RequestPort__ExtensionsAssignment_5)*
	{ after(grammarAccess.getRequestPortAccess().getExtensionsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestPort__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestPortAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getRequestPortAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OutputPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OutputPort__Group__0__Impl
	rule__OutputPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputPortAccess().getOutputPortKeyword_0()); }
	'OutputPort'
	{ after(grammarAccess.getOutputPortAccess().getOutputPortKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OutputPort__Group__1__Impl
	rule__OutputPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputPortAccess().getNameAssignment_1()); }
	(rule__OutputPort__NameAssignment_1)
	{ after(grammarAccess.getOutputPortAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OutputPort__Group__2__Impl
	rule__OutputPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputPortAccess().getImplementsKeyword_2()); }
	'implements'
	{ after(grammarAccess.getOutputPortAccess().getImplementsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OutputPort__Group__3__Impl
	rule__OutputPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputPortAccess().getServiceAssignment_3()); }
	(rule__OutputPort__ServiceAssignment_3)
	{ after(grammarAccess.getOutputPortAccess().getServiceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OutputPort__Group__4__Impl
	rule__OutputPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputPortAccess().getRealizedByKeyword_4()); }
	'realizedBy'
	{ after(grammarAccess.getOutputPortAccess().getRealizedByKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OutputPort__Group__5__Impl
	rule__OutputPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputPortAccess().getActivityAssignment_5()); }
	(rule__OutputPort__ActivityAssignment_5)
	{ after(grammarAccess.getOutputPortAccess().getActivityAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OutputPort__Group__6__Impl
	rule__OutputPort__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_6()); }
	'{'
	{ after(grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OutputPort__Group__7__Impl
	rule__OutputPort__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputPortAccess().getExtensionsAssignment_7()); }
	(rule__OutputPort__ExtensionsAssignment_7)*
	{ after(grammarAccess.getOutputPortAccess().getExtensionsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OutputPort__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnswerPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnswerPort__Group__0__Impl
	rule__AnswerPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnswerPortAccess().getAnswerPortKeyword_0()); }
	'AnswerPort'
	{ after(grammarAccess.getAnswerPortAccess().getAnswerPortKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnswerPort__Group__1__Impl
	rule__AnswerPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnswerPortAccess().getNameAssignment_1()); }
	(rule__AnswerPort__NameAssignment_1)
	{ after(grammarAccess.getAnswerPortAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnswerPort__Group__2__Impl
	rule__AnswerPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnswerPortAccess().getImplementsKeyword_2()); }
	'implements'
	{ after(grammarAccess.getAnswerPortAccess().getImplementsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnswerPort__Group__3__Impl
	rule__AnswerPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnswerPortAccess().getServiceAssignment_3()); }
	(rule__AnswerPort__ServiceAssignment_3)
	{ after(grammarAccess.getAnswerPortAccess().getServiceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnswerPort__Group__4__Impl
	rule__AnswerPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnswerPortAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getAnswerPortAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnswerPort__Group__5__Impl
	rule__AnswerPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnswerPortAccess().getExtensionsAssignment_5()); }
	(rule__AnswerPort__ExtensionsAssignment_5)*
	{ after(grammarAccess.getAnswerPortAccess().getExtensionsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnswerPort__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnswerPortAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getAnswerPortAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InputPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputPort__Group__0__Impl
	rule__InputPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputPortAccess().getInputPortKeyword_0()); }
	'InputPort'
	{ after(grammarAccess.getInputPortAccess().getInputPortKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputPort__Group__1__Impl
	rule__InputPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputPortAccess().getNameAssignment_1()); }
	(rule__InputPort__NameAssignment_1)
	{ after(grammarAccess.getInputPortAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputPort__Group__2__Impl
	rule__InputPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputPortAccess().getImplementsKeyword_2()); }
	'implements'
	{ after(grammarAccess.getInputPortAccess().getImplementsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputPort__Group__3__Impl
	rule__InputPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputPortAccess().getServiceAssignment_3()); }
	(rule__InputPort__ServiceAssignment_3)
	{ after(grammarAccess.getInputPortAccess().getServiceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputPort__Group__4__Impl
	rule__InputPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputPort__Group__5__Impl
	rule__InputPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputPortAccess().getExtensionsAssignment_5()); }
	(rule__InputPort__ExtensionsAssignment_5)*
	{ after(grammarAccess.getInputPortAccess().getExtensionsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputPort__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SupportedMiddleware__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SupportedMiddleware__Group__0__Impl
	rule__SupportedMiddleware__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SupportedMiddleware__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSupportedMiddlewareAccess().getSupportedMiddlewareKeyword_0()); }
	'SupportedMiddleware'
	{ after(grammarAccess.getSupportedMiddlewareAccess().getSupportedMiddlewareKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SupportedMiddleware__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SupportedMiddleware__Group__1__Impl
	rule__SupportedMiddleware__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SupportedMiddleware__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSupportedMiddlewareAccess().getDefaultAssignment_1()); }
	(rule__SupportedMiddleware__DefaultAssignment_1)?
	{ after(grammarAccess.getSupportedMiddlewareAccess().getDefaultAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SupportedMiddleware__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SupportedMiddleware__Group__2__Impl
	rule__SupportedMiddleware__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SupportedMiddleware__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSupportedMiddlewareAccess().getMiddlewareAssignment_2()); }
	(rule__SupportedMiddleware__MiddlewareAssignment_2)
	{ after(grammarAccess.getSupportedMiddlewareAccess().getMiddlewareAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SupportedMiddleware__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SupportedMiddleware__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SupportedMiddleware__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSupportedMiddlewareAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getSupportedMiddlewareAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Activity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Activity__Group__0__Impl
	rule__Activity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityAccess().getActivityKeyword_0()); }
	'Activity'
	{ after(grammarAccess.getActivityAccess().getActivityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Activity__Group__1__Impl
	rule__Activity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityAccess().getNameAssignment_1()); }
	(rule__Activity__NameAssignment_1)
	{ after(grammarAccess.getActivityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Activity__Group__2__Impl
	rule__Activity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Activity__Group__3__Impl
	rule__Activity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityAccess().getLinksAssignment_3()); }
	(rule__Activity__LinksAssignment_3)*
	{ after(grammarAccess.getActivityAccess().getLinksAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Activity__Group__4__Impl
	rule__Activity__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityAccess().getExtensionsAssignment_4()); }
	(rule__Activity__ExtensionsAssignment_4)*
	{ after(grammarAccess.getActivityAccess().getExtensionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Activity__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InputHandler__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandler__Group__0__Impl
	rule__InputHandler__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerAccess().getInputHandlerKeyword_0()); }
	'InputHandler'
	{ after(grammarAccess.getInputHandlerAccess().getInputHandlerKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandler__Group__1__Impl
	rule__InputHandler__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerAccess().getNameAssignment_1()); }
	(rule__InputHandler__NameAssignment_1)
	{ after(grammarAccess.getInputHandlerAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandler__Group__2__Impl
	rule__InputHandler__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerAccess().getTriggeredFromKeyword_2()); }
	'triggeredFrom'
	{ after(grammarAccess.getInputHandlerAccess().getTriggeredFromKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandler__Group__3__Impl
	rule__InputHandler__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerAccess().getInputPortAssignment_3()); }
	(rule__InputHandler__InputPortAssignment_3)
	{ after(grammarAccess.getInputHandlerAccess().getInputPortAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandler__Group__4__Impl
	rule__InputHandler__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerAccess().getActiveQueueAssignment_4()); }
	(rule__InputHandler__ActiveQueueAssignment_4)?
	{ after(grammarAccess.getInputHandlerAccess().getActiveQueueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandler__Group__5__Impl
	rule__InputHandler__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerAccess().getLeftCurlyBracketKeyword_5()); }
	'{'
	{ after(grammarAccess.getInputHandlerAccess().getLeftCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandler__Group__6__Impl
	rule__InputHandler__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerAccess().getLinksAssignment_6()); }
	(rule__InputHandler__LinksAssignment_6)*
	{ after(grammarAccess.getInputHandlerAccess().getLinksAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandler__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getInputHandlerAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequestHandler__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestHandler__Group__0__Impl
	rule__RequestHandler__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestHandlerAccess().getRequestHandlerKeyword_0()); }
	'RequestHandler'
	{ after(grammarAccess.getRequestHandlerAccess().getRequestHandlerKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestHandler__Group__1__Impl
	rule__RequestHandler__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestHandlerAccess().getNameAssignment_1()); }
	(rule__RequestHandler__NameAssignment_1)
	{ after(grammarAccess.getRequestHandlerAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestHandler__Group__2__Impl
	rule__RequestHandler__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestHandlerAccess().getTriggeredFromKeyword_2()); }
	'triggeredFrom'
	{ after(grammarAccess.getRequestHandlerAccess().getTriggeredFromKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestHandler__Group__3__Impl
	rule__RequestHandler__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestHandlerAccess().getAnswerPortAssignment_3()); }
	(rule__RequestHandler__AnswerPortAssignment_3)
	{ after(grammarAccess.getRequestHandlerAccess().getAnswerPortAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestHandler__Group__4__Impl
	rule__RequestHandler__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestHandlerAccess().getActiveQueueAssignment_4()); }
	(rule__RequestHandler__ActiveQueueAssignment_4)?
	{ after(grammarAccess.getRequestHandlerAccess().getActiveQueueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestHandler__Group__5__Impl
	rule__RequestHandler__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestHandlerAccess().getLeftCurlyBracketKeyword_5()); }
	'{'
	{ after(grammarAccess.getRequestHandlerAccess().getLeftCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestHandler__Group__6__Impl
	rule__RequestHandler__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestHandlerAccess().getLinksAssignment_6()); }
	(rule__RequestHandler__LinksAssignment_6)*
	{ after(grammarAccess.getRequestHandlerAccess().getLinksAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestHandler__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestHandlerAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getRequestHandlerAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequestPortLink__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestPortLink__Group__0__Impl
	rule__RequestPortLink__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPortLink__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestPortLinkAccess().getRequestPortLinkKeyword_0()); }
	'RequestPortLink'
	{ after(grammarAccess.getRequestPortLinkAccess().getRequestPortLinkKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPortLink__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestPortLink__Group__1__Impl
	rule__RequestPortLink__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPortLink__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestPortLinkAccess().getRequestPortAssignment_1()); }
	(rule__RequestPortLink__RequestPortAssignment_1)
	{ after(grammarAccess.getRequestPortLinkAccess().getRequestPortAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPortLink__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestPortLink__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPortLink__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestPortLinkAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getRequestPortLinkAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpcUaClientLink__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaClientLink__Group__0__Impl
	rule__OpcUaClientLink__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaClientLink__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaClientLinkAccess().getOpcUaClientLinkKeyword_0()); }
	'OpcUaClientLink'
	{ after(grammarAccess.getOpcUaClientLinkAccess().getOpcUaClientLinkKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaClientLink__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaClientLink__Group__1__Impl
	rule__OpcUaClientLink__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaClientLink__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaClientLinkAccess().getClientAssignment_1()); }
	(rule__OpcUaClientLink__ClientAssignment_1)
	{ after(grammarAccess.getOpcUaClientLinkAccess().getClientAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaClientLink__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaClientLink__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaClientLink__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaClientLinkAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getOpcUaClientLinkAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSubNodeObserver__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentSubNodeObserver__Group__0__Impl
	rule__ComponentSubNodeObserver__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSubNodeObserver__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentSubNodeObserverAccess().getObserveKeyword_0()); }
	'Observe'
	{ after(grammarAccess.getComponentSubNodeObserverAccess().getObserveKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSubNodeObserver__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentSubNodeObserver__Group__1__Impl
	rule__ComponentSubNodeObserver__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSubNodeObserver__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentSubNodeObserverAccess().getSubjectAssignment_1()); }
	(rule__ComponentSubNodeObserver__SubjectAssignment_1)
	{ after(grammarAccess.getComponentSubNodeObserverAccess().getSubjectAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSubNodeObserver__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentSubNodeObserver__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSubNodeObserver__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentSubNodeObserverAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getComponentSubNodeObserverAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InputLinkExtension__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputLinkExtension__Group__0__Impl
	rule__InputLinkExtension__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputLinkExtensionAccess().getInputLinkExtensionAction_0()); }
	()
	{ after(grammarAccess.getInputLinkExtensionAccess().getInputLinkExtensionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputLinkExtension__Group__1__Impl
	rule__InputLinkExtension__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputLinkExtensionAccess().getInputPortLinkKeyword_1()); }
	'InputPortLink'
	{ after(grammarAccess.getInputLinkExtensionAccess().getInputPortLinkKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputLinkExtension__Group__2__Impl
	rule__InputLinkExtension__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputLinkExtensionAccess().getInputPortAssignment_2()); }
	(rule__InputLinkExtension__InputPortAssignment_2)
	{ after(grammarAccess.getInputLinkExtensionAccess().getInputPortAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputLinkExtension__Group__3__Impl
	rule__InputLinkExtension__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputLinkExtensionAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getInputLinkExtensionAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputLinkExtension__Group__4__Impl
	rule__InputLinkExtension__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4()); }
	(rule__InputLinkExtension__UnorderedGroup_4)
	{ after(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputLinkExtension__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputLinkExtensionAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getInputLinkExtensionAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivationConstraints__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group__0__Impl
	rule__ActivationConstraints__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getActivationConstraintsAction_0()); }
	()
	{ after(grammarAccess.getActivationConstraintsAccess().getActivationConstraintsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group__1__Impl
	rule__ActivationConstraints__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getActivationConstraintsKeyword_1()); }
	'ActivationConstraints'
	{ after(grammarAccess.getActivationConstraintsAccess().getActivationConstraintsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group__2__Impl
	rule__ActivationConstraints__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getActivationConstraintsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group__3__Impl
	rule__ActivationConstraints__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getConfigurableKeyword_3()); }
	'configurable'
	{ after(grammarAccess.getActivationConstraintsAccess().getConfigurableKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group__4__Impl
	rule__ActivationConstraints__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_4()); }
	'='
	{ after(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group__5__Impl
	rule__ActivationConstraints__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getConfigurableAssignment_5()); }
	(rule__ActivationConstraints__ConfigurableAssignment_5)
	{ after(grammarAccess.getActivationConstraintsAccess().getConfigurableAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group__6__Impl
	rule__ActivationConstraints__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_6()); }
	(';')?
	{ after(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group__7__Impl
	rule__ActivationConstraints__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7()); }
	(rule__ActivationConstraints__UnorderedGroup_7)
	{ after(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getActivationConstraintsAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivationConstraints__Group_7_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group_7_0__0__Impl
	rule__ActivationConstraints__Group_7_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getMinActFreqKeyword_7_0_0()); }
	'minActFreq'
	{ after(grammarAccess.getActivationConstraintsAccess().getMinActFreqKeyword_7_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group_7_0__1__Impl
	rule__ActivationConstraints__Group_7_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_0_1()); }
	'='
	{ after(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group_7_0__2__Impl
	rule__ActivationConstraints__Group_7_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getMinActFreqAssignment_7_0_2()); }
	(rule__ActivationConstraints__MinActFreqAssignment_7_0_2)
	{ after(grammarAccess.getActivationConstraintsAccess().getMinActFreqAssignment_7_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group_7_0__3__Impl
	rule__ActivationConstraints__Group_7_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_0_3()); }
	'Hz'
	{ after(grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group_7_0__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_0_4()); }
	(';')?
	{ after(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_0_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivationConstraints__Group_7_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group_7_1__0__Impl
	rule__ActivationConstraints__Group_7_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getMaxActFreqKeyword_7_1_0()); }
	'maxActFreq'
	{ after(grammarAccess.getActivationConstraintsAccess().getMaxActFreqKeyword_7_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group_7_1__1__Impl
	rule__ActivationConstraints__Group_7_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_1_1()); }
	'='
	{ after(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group_7_1__2__Impl
	rule__ActivationConstraints__Group_7_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getMaxActFreqAssignment_7_1_2()); }
	(rule__ActivationConstraints__MaxActFreqAssignment_7_1_2)
	{ after(grammarAccess.getActivationConstraintsAccess().getMaxActFreqAssignment_7_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group_7_1__3__Impl
	rule__ActivationConstraints__Group_7_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_1_3()); }
	'Hz'
	{ after(grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__Group_7_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__Group_7_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_1_4()); }
	(';')?
	{ after(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OperationModeBinding__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OperationModeBinding__Group__0__Impl
	rule__OperationModeBinding__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationModeBinding__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationModeBindingAccess().getOperationModeBindingKeyword_0()); }
	'OperationModeBinding'
	{ after(grammarAccess.getOperationModeBindingAccess().getOperationModeBindingKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationModeBinding__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OperationModeBinding__Group__1__Impl
	rule__OperationModeBinding__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationModeBinding__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationModeBindingAccess().getModeAssignment_1()); }
	(rule__OperationModeBinding__ModeAssignment_1)
	{ after(grammarAccess.getOperationModeBindingAccess().getModeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationModeBinding__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OperationModeBinding__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationModeBinding__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationModeBindingAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getOperationModeBindingAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefaultTrigger__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultTrigger__Group__0__Impl
	rule__DefaultTrigger__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultTrigger__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultTriggerAccess().getDefaultTriggerKeyword_0()); }
	'DefaultTrigger'
	{ after(grammarAccess.getDefaultTriggerAccess().getDefaultTriggerKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultTrigger__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultTrigger__Group__1__Impl
	rule__DefaultTrigger__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultTrigger__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultTriggerAccess().getAlternatives_1()); }
	(rule__DefaultTrigger__Alternatives_1)
	{ after(grammarAccess.getDefaultTriggerAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultTrigger__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultTrigger__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultTrigger__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultTriggerAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getDefaultTriggerAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefaultInputTrigger__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultInputTrigger__Group__0__Impl
	rule__DefaultInputTrigger__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultInputTrigger__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultInputTriggerAccess().getInputPortTriggerKeyword_0()); }
	'InputPortTrigger'
	{ after(grammarAccess.getDefaultInputTriggerAccess().getInputPortTriggerKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultInputTrigger__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultInputTrigger__Group__1__Impl
	rule__DefaultInputTrigger__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultInputTrigger__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultInputTriggerAccess().getInputLinkAssignment_1()); }
	(rule__DefaultInputTrigger__InputLinkAssignment_1)
	{ after(grammarAccess.getDefaultInputTriggerAccess().getInputLinkAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultInputTrigger__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultInputTrigger__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultInputTrigger__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultInputTriggerAccess().getGroup_2()); }
	(rule__DefaultInputTrigger__Group_2__0)?
	{ after(grammarAccess.getDefaultInputTriggerAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefaultInputTrigger__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultInputTrigger__Group_2__0__Impl
	rule__DefaultInputTrigger__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultInputTrigger__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultInputTriggerAccess().getPrescaleKeyword_2_0()); }
	'prescale'
	{ after(grammarAccess.getDefaultInputTriggerAccess().getPrescaleKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultInputTrigger__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultInputTrigger__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultInputTrigger__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultInputTriggerAccess().getPrescaleAssignment_2_1()); }
	(rule__DefaultInputTrigger__PrescaleAssignment_2_1)
	{ after(grammarAccess.getDefaultInputTriggerAccess().getPrescaleAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefaultPeriodicTimer__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultPeriodicTimer__Group__0__Impl
	rule__DefaultPeriodicTimer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultPeriodicTimer__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicTimerKeyword_0()); }
	'PeriodicTimer'
	{ after(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicTimerKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultPeriodicTimer__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultPeriodicTimer__Group__1__Impl
	rule__DefaultPeriodicTimer__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultPeriodicTimer__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqAssignment_1()); }
	(rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1)
	{ after(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultPeriodicTimer__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultPeriodicTimer__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultPeriodicTimer__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultPeriodicTimerAccess().getHzKeyword_2()); }
	'Hz'
	{ after(grammarAccess.getDefaultPeriodicTimerAccess().getHzKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefaultObservedElementTrigger__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultObservedElementTrigger__Group__0__Impl
	rule__DefaultObservedElementTrigger__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultObservedElementTrigger__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultObservedElementTriggerAccess().getObservedElementKeyword_0()); }
	'ObservedElement'
	{ after(grammarAccess.getDefaultObservedElementTriggerAccess().getObservedElementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultObservedElementTrigger__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefaultObservedElementTrigger__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultObservedElementTrigger__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefaultObservedElementTriggerAccess().getElementAssignment_1()); }
	(rule__DefaultObservedElementTrigger__ElementAssignment_1)
	{ after(grammarAccess.getDefaultObservedElementTriggerAccess().getElementAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpcUaDeviceClient__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClient__Group__0__Impl
	rule__OpcUaDeviceClient__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaDeviceClientAccess().getOpcUaDeviceClientKeyword_0()); }
	'OpcUaDeviceClient'
	{ after(grammarAccess.getOpcUaDeviceClientAccess().getOpcUaDeviceClientKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClient__Group__1__Impl
	rule__OpcUaDeviceClient__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaDeviceClientAccess().getNameAssignment_1()); }
	(rule__OpcUaDeviceClient__NameAssignment_1)
	{ after(grammarAccess.getOpcUaDeviceClientAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClient__Group__2__Impl
	rule__OpcUaDeviceClient__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2()); }
	(rule__OpcUaDeviceClient__UnorderedGroup_2)
	{ after(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClient__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaDeviceClientAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getOpcUaDeviceClientAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpcUaDeviceClient__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClient__Group_2_0__0__Impl
	rule__OpcUaDeviceClient__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIKeyword_2_0_0()); }
	'deviceURI'
	{ after(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIKeyword_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClient__Group_2_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIAssignment_2_0_1()); }
	(rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1)
	{ after(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIAssignment_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpcUaDeviceClient__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClient__Group_2_1__0__Impl
	rule__OpcUaDeviceClient__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileKeyword_2_1_0()); }
	'opcuaXmlFile'
	{ after(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClient__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileAssignment_2_1_1()); }
	(rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1)
	{ after(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpcUaReadServer__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaReadServer__Group__0__Impl
	rule__OpcUaReadServer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaReadServerAccess().getOpcUaReadServerKeyword_0()); }
	'OpcUaReadServer'
	{ after(grammarAccess.getOpcUaReadServerAccess().getOpcUaReadServerKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaReadServer__Group__1__Impl
	rule__OpcUaReadServer__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaReadServerAccess().getNameAssignment_1()); }
	(rule__OpcUaReadServer__NameAssignment_1)
	{ after(grammarAccess.getOpcUaReadServerAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaReadServer__Group__2__Impl
	rule__OpcUaReadServer__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaReadServerAccess().getDataProviderPortKeyword_2()); }
	'dataProviderPort'
	{ after(grammarAccess.getOpcUaReadServerAccess().getDataProviderPortKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaReadServer__Group__3__Impl
	rule__OpcUaReadServer__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaReadServerAccess().getOutPortAssignment_3()); }
	(rule__OpcUaReadServer__OutPortAssignment_3)
	{ after(grammarAccess.getOpcUaReadServerAccess().getOutPortAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaReadServer__Group__4__Impl
	rule__OpcUaReadServer__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaReadServerAccess().getGroup_4()); }
	(rule__OpcUaReadServer__Group_4__0)?
	{ after(grammarAccess.getOpcUaReadServerAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaReadServer__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaReadServerAccess().getSemicolonKeyword_5()); }
	(';')?
	{ after(grammarAccess.getOpcUaReadServerAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OpcUaReadServer__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaReadServer__Group_4__0__Impl
	rule__OpcUaReadServer__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaReadServerAccess().getPortNumberKeyword_4_0()); }
	'portNumber'
	{ after(grammarAccess.getOpcUaReadServerAccess().getPortNumberKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaReadServer__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpcUaReadServerAccess().getPortNumberAssignment_4_1()); }
	(rule__OpcUaReadServer__PortNumberAssignment_4_1)
	{ after(grammarAccess.getOpcUaReadServerAccess().getPortNumberAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinationSlavePort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePort__Group__0__Impl
	rule__CoordinationSlavePort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortAccess().getCoordinationSlavePortKeyword_0()); }
	'CoordinationSlavePort'
	{ after(grammarAccess.getCoordinationSlavePortAccess().getCoordinationSlavePortKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePort__Group__1__Impl
	rule__CoordinationSlavePort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortAccess().getNameAssignment_1()); }
	(rule__CoordinationSlavePort__NameAssignment_1)
	{ after(grammarAccess.getCoordinationSlavePortAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePort__Group__2__Impl
	rule__CoordinationSlavePort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortAccess().getImplementsKeyword_2()); }
	'implements'
	{ after(grammarAccess.getCoordinationSlavePortAccess().getImplementsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePort__Group__3__Impl
	rule__CoordinationSlavePort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortAccess().getServiceAssignment_3()); }
	(rule__CoordinationSlavePort__ServiceAssignment_3)
	{ after(grammarAccess.getCoordinationSlavePortAccess().getServiceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePort__Group__4__Impl
	rule__CoordinationSlavePort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getCoordinationSlavePortAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePort__Group__5__Impl
	rule__CoordinationSlavePort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortAccess().getElementsAssignment_5()); }
	(rule__CoordinationSlavePort__ElementsAssignment_5)*
	{ after(grammarAccess.getCoordinationSlavePortAccess().getElementsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationSlavePort__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationSlavePortAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getCoordinationSlavePortAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SkillRealizationsRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationsRef__Group__0__Impl
	rule__SkillRealizationsRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationsRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationsRefKeyword_0()); }
	'SkillRealizationsRef'
	{ after(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationsRefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationsRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationsRef__Group__1__Impl
	rule__SkillRealizationsRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationsRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefAssignment_1()); }
	(rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1)
	{ after(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationsRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SkillRealizationsRef__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationsRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSkillRealizationsRefAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getSkillRealizationsRefAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CommunicationServiceUsageRealization__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommunicationServiceUsageRealization__Group__0__Impl
	rule__CommunicationServiceUsageRealization__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsageRealization__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getWithKeyword_0()); }
	'with'
	{ after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getWithKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsageRealization__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommunicationServiceUsageRealization__Group__1__Impl
	rule__CommunicationServiceUsageRealization__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsageRealization__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageAssignment_1()); }
	(rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1)
	{ after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsageRealization__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommunicationServiceUsageRealization__Group__2__Impl
	rule__CommunicationServiceUsageRealization__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsageRealization__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getRealizedByKeyword_2()); }
	'realizedBy'
	{ after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getRealizedByKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsageRealization__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommunicationServiceUsageRealization__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsageRealization__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortAssignment_3()); }
	(rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3)
	{ after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PublicOperationMode__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PublicOperationMode__Group__0__Impl
	rule__PublicOperationMode__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPublicOperationModeAccess().getPublicOperationModeAction_0()); }
	()
	{ after(grammarAccess.getPublicOperationModeAccess().getPublicOperationModeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PublicOperationMode__Group__1__Impl
	rule__PublicOperationMode__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitAssignment_1()); }
	(rule__PublicOperationMode__IsDefaultInitAssignment_1)?
	{ after(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PublicOperationMode__Group__2__Impl
	rule__PublicOperationMode__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPublicOperationModeAccess().getPublicOperationModeKeyword_2()); }
	'PublicOperationMode'
	{ after(grammarAccess.getPublicOperationModeAccess().getPublicOperationModeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PublicOperationMode__Group__3__Impl
	rule__PublicOperationMode__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPublicOperationModeAccess().getModeAssignment_3()); }
	(rule__PublicOperationMode__ModeAssignment_3)
	{ after(grammarAccess.getPublicOperationModeAccess().getModeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PublicOperationMode__Group__4__Impl
	rule__PublicOperationMode__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPublicOperationModeAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getPublicOperationModeAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PublicOperationMode__Group__5__Impl
	rule__PublicOperationMode__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPublicOperationModeAccess().getGroup_5()); }
	(rule__PublicOperationMode__Group_5__0)?
	{ after(grammarAccess.getPublicOperationModeAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PublicOperationMode__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPublicOperationModeAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getPublicOperationModeAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PublicOperationMode__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PublicOperationMode__Group_5__0__Impl
	rule__PublicOperationMode__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPublicOperationModeAccess().getActivatesKeyword_5_0()); }
	'activates'
	{ after(grammarAccess.getPublicOperationModeAccess().getActivatesKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PublicOperationMode__Group_5__1__Impl
	rule__PublicOperationMode__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPublicOperationModeAccess().getLeftParenthesisKeyword_5_1()); }
	'('
	{ after(grammarAccess.getPublicOperationModeAccess().getLeftParenthesisKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PublicOperationMode__Group_5__2__Impl
	rule__PublicOperationMode__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_5_2()); }
	(rule__PublicOperationMode__ActivatesAssignment_5_2)
	{ after(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PublicOperationMode__Group_5__3__Impl
	rule__PublicOperationMode__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPublicOperationModeAccess().getGroup_5_3()); }
	(rule__PublicOperationMode__Group_5_3__0)*
	{ after(grammarAccess.getPublicOperationModeAccess().getGroup_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PublicOperationMode__Group_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPublicOperationModeAccess().getRightParenthesisKeyword_5_4()); }
	')'
	{ after(grammarAccess.getPublicOperationModeAccess().getRightParenthesisKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PublicOperationMode__Group_5_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PublicOperationMode__Group_5_3__0__Impl
	rule__PublicOperationMode__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group_5_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPublicOperationModeAccess().getCommaKeyword_5_3_0()); }
	','
	{ after(grammarAccess.getPublicOperationModeAccess().getCommaKeyword_5_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group_5_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PublicOperationMode__Group_5_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__Group_5_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_5_3_1()); }
	(rule__PublicOperationMode__ActivatesAssignment_5_3_1)
	{ after(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_5_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrivateOperationMode__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrivateOperationMode__Group__0__Impl
	rule__PrivateOperationMode__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrivateOperationMode__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrivateOperationModeAccess().getPrivateOperationModeKeyword_0()); }
	'PrivateOperationMode'
	{ after(grammarAccess.getPrivateOperationModeAccess().getPrivateOperationModeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrivateOperationMode__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrivateOperationMode__Group__1__Impl
	rule__PrivateOperationMode__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PrivateOperationMode__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrivateOperationModeAccess().getNameAssignment_1()); }
	(rule__PrivateOperationMode__NameAssignment_1)
	{ after(grammarAccess.getPrivateOperationModeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrivateOperationMode__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrivateOperationMode__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrivateOperationMode__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrivateOperationModeAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getPrivateOperationModeAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinationMasterPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationMasterPort__Group__0__Impl
	rule__CoordinationMasterPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationMasterPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationMasterPortAccess().getCoordinationMasterPortKeyword_0()); }
	'CoordinationMasterPort'
	{ after(grammarAccess.getCoordinationMasterPortAccess().getCoordinationMasterPortKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationMasterPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationMasterPort__Group__1__Impl
	rule__CoordinationMasterPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationMasterPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationMasterPortAccess().getNameAssignment_1()); }
	(rule__CoordinationMasterPort__NameAssignment_1)
	{ after(grammarAccess.getCoordinationMasterPortAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationMasterPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationMasterPort__Group__2__Impl
	rule__CoordinationMasterPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationMasterPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationMasterPortAccess().getImplementsKeyword_2()); }
	'implements'
	{ after(grammarAccess.getCoordinationMasterPortAccess().getImplementsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationMasterPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationMasterPort__Group__3__Impl
	rule__CoordinationMasterPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationMasterPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationMasterPortAccess().getServiceAssignment_3()); }
	(rule__CoordinationMasterPort__ServiceAssignment_3)
	{ after(grammarAccess.getCoordinationMasterPortAccess().getServiceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationMasterPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationMasterPort__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationMasterPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationMasterPortAccess().getSemicolonKeyword_4()); }
	(';')?
	{ after(grammarAccess.getCoordinationMasterPortAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentParametersRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParametersRef__Group__0__Impl
	rule__ComponentParametersRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParametersRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParametersRefAccess().getComponentParametersKeyword_0()); }
	'ComponentParameters'
	{ after(grammarAccess.getComponentParametersRefAccess().getComponentParametersKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParametersRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParametersRef__Group__1__Impl
	rule__ComponentParametersRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParametersRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParametersRefAccess().getParameterAssignment_1()); }
	(rule__ComponentParametersRef__ParameterAssignment_1)
	{ after(grammarAccess.getComponentParametersRefAccess().getParameterAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParametersRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParametersRef__Group__2__Impl
	rule__ComponentParametersRef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParametersRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParametersRefAccess().getGroup_2()); }
	(rule__ComponentParametersRef__Group_2__0)?
	{ after(grammarAccess.getComponentParametersRefAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParametersRef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParametersRef__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParametersRef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParametersRefAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getComponentParametersRefAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentParametersRef__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParametersRef__Group_2__0__Impl
	rule__ComponentParametersRef__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParametersRef__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParametersRefAccess().getSlaveKeyword_2_0()); }
	'slave'
	{ after(grammarAccess.getComponentParametersRefAccess().getSlaveKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParametersRef__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentParametersRef__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParametersRef__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentParametersRefAccess().getSlaveAssignment_2_1()); }
	(rule__ComponentParametersRef__SlaveAssignment_2_1)
	{ after(grammarAccess.getComponentParametersRefAccess().getSlaveAssignment_2_1()); }
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


rule__FQNW__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQNW__Group__0__Impl
	rule__FQNW__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQNW__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0()); }
	ruleFQN
	{ after(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FQNW__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQNW__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQNW__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); }
	('.*')?
	{ after(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); }
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


rule__EDouble__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group__0__Impl
	rule__EDouble__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group__1__Impl
	rule__EDouble__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); }
	(RULE_INT)?
	{ after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group__2__Impl
	rule__EDouble__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); }
	'.'
	{ after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group__3__Impl
	rule__EDouble__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); }
	RULE_INT
	{ after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getGroup_4()); }
	(rule__EDouble__Group_4__0)?
	{ after(grammarAccess.getEDoubleAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EDouble__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group_4__0__Impl
	rule__EDouble__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); }
	(rule__EDouble__Alternatives_4_0)
	{ after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group_4__1__Impl
	rule__EDouble__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); }
	('-')?
	{ after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EDouble__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EDouble__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); }
	RULE_INT
	{ after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); }
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


rule__InputLinkExtension__UnorderedGroup_4
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
	}
:
	rule__InputLinkExtension__UnorderedGroup_4__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getInputLinkExtensionAccess().getOptionalAssignment_4_0()); }
					(rule__InputLinkExtension__OptionalAssignment_4_0)
					{ after(grammarAccess.getInputLinkExtensionAccess().getOptionalAssignment_4_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkAssignment_4_1()); }
					(rule__InputLinkExtension__OversamplingOkAssignment_4_1)
					{ after(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkAssignment_4_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkAssignment_4_2()); }
					(rule__InputLinkExtension__UndersamplingOkAssignment_4_2)
					{ after(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkAssignment_4_2()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__UnorderedGroup_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputLinkExtension__UnorderedGroup_4__Impl
	rule__InputLinkExtension__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__UnorderedGroup_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputLinkExtension__UnorderedGroup_4__Impl
	rule__InputLinkExtension__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__UnorderedGroup_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputLinkExtension__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivationConstraints__UnorderedGroup_7
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
	}
:
	rule__ActivationConstraints__UnorderedGroup_7__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__UnorderedGroup_7__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getActivationConstraintsAccess().getGroup_7_0()); }
					(rule__ActivationConstraints__Group_7_0__0)
					{ after(grammarAccess.getActivationConstraintsAccess().getGroup_7_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getActivationConstraintsAccess().getGroup_7_1()); }
					(rule__ActivationConstraints__Group_7_1__0)
					{ after(grammarAccess.getActivationConstraintsAccess().getGroup_7_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__UnorderedGroup_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__UnorderedGroup_7__Impl
	rule__ActivationConstraints__UnorderedGroup_7__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__UnorderedGroup_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivationConstraints__UnorderedGroup_7__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__OpcUaDeviceClient__UnorderedGroup_2
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
	}
:
	rule__OpcUaDeviceClient__UnorderedGroup_2__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__UnorderedGroup_2__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getOpcUaDeviceClientAccess().getGroup_2_0()); }
					(rule__OpcUaDeviceClient__Group_2_0__0)
					{ after(grammarAccess.getOpcUaDeviceClientAccess().getGroup_2_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getOpcUaDeviceClientAccess().getGroup_2_1()); }
					(rule__OpcUaDeviceClient__Group_2_1__0)
					{ after(grammarAccess.getOpcUaDeviceClientAccess().getGroup_2_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__UnorderedGroup_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClient__UnorderedGroup_2__Impl
	rule__OpcUaDeviceClient__UnorderedGroup_2__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__UnorderedGroup_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OpcUaDeviceClient__UnorderedGroup_2__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentDefModel__ImportsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDefModelAccess().getImportsServiceRepoImportParserRuleCall_1_0()); }
		ruleServiceRepoImport
		{ after(grammarAccess.getComponentDefModelAccess().getImportsServiceRepoImportParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefModel__ComponentAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDefModelAccess().getComponentComponentDefinitionParserRuleCall_2_0()); }
		ruleComponentDefinition
		{ after(grammarAccess.getComponentDefModelAccess().getComponentComponentDefinitionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoImport__ImportedNamespaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServiceRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); }
		ruleFQNW
		{ after(grammarAccess.getServiceRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__LogoAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDefinitionAccess().getLogoSTRINGTerminalRuleCall_2_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getComponentDefinitionAccess().getLogoSTRINGTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDefinition__ElementsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDefinitionAccess().getElementsAbstractComponentElementParserRuleCall_4_0()); }
		ruleAbstractComponentElement
		{ after(grammarAccess.getComponentDefinitionAccess().getElementsAbstractComponentElementParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequestPortAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRequestPortAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__ServiceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceCrossReference_3_0()); }
		(
			{ before(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPort__ExtensionsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequestPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0()); }
		ruleComponentPortExtension
		{ after(grammarAccess.getRequestPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOutputPortAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getOutputPortAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__ServiceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceCrossReference_3_0()); }
		(
			{ before(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__ActivityAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOutputPortAccess().getActivityActivityCrossReference_5_0()); }
		(
			{ before(grammarAccess.getOutputPortAccess().getActivityActivityFQNParserRuleCall_5_0_1()); }
			ruleFQN
			{ after(grammarAccess.getOutputPortAccess().getActivityActivityFQNParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getOutputPortAccess().getActivityActivityCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OutputPort__ExtensionsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOutputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_7_0()); }
		ruleComponentPortExtension
		{ after(grammarAccess.getOutputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnswerPortAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAnswerPortAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__ServiceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceCrossReference_3_0()); }
		(
			{ before(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnswerPort__ExtensionsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnswerPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0()); }
		ruleComponentPortExtension
		{ after(grammarAccess.getAnswerPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputPortAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getInputPortAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__ServiceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceCrossReference_3_0()); }
		(
			{ before(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputPort__ExtensionsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0()); }
		ruleComponentPortExtension
		{ after(grammarAccess.getInputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SupportedMiddleware__DefaultAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0()); }
		(
			{ before(grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0()); }
			'default'
			{ after(grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0()); }
		)
		{ after(grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SupportedMiddleware__MiddlewareAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSupportedMiddlewareAccess().getMiddlewareRoboticMiddlewareParserRuleCall_2_0()); }
		ruleRoboticMiddleware
		{ after(grammarAccess.getSupportedMiddlewareAccess().getMiddlewareRoboticMiddlewareParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__LinksAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityAccess().getLinksAbstractComponentLinkParserRuleCall_3_0()); }
		ruleAbstractComponentLink
		{ after(grammarAccess.getActivityAccess().getLinksAbstractComponentLinkParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__ExtensionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityAccess().getExtensionsActivityExtensionParserRuleCall_4_0()); }
		ruleActivityExtension
		{ after(grammarAccess.getActivityAccess().getExtensionsActivityExtensionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputHandlerAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getInputHandlerAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__InputPortAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputHandlerAccess().getInputPortInputPortCrossReference_3_0()); }
		(
			{ before(grammarAccess.getInputHandlerAccess().getInputPortInputPortFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getInputHandlerAccess().getInputPortInputPortFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getInputHandlerAccess().getInputPortInputPortCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__ActiveQueueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); }
		(
			{ before(grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); }
			'activeQueue'
			{ after(grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); }
		)
		{ after(grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandler__LinksAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputHandlerAccess().getLinksAbstractComponentLinkParserRuleCall_6_0()); }
		ruleAbstractComponentLink
		{ after(grammarAccess.getInputHandlerAccess().getLinksAbstractComponentLinkParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequestHandlerAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRequestHandlerAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__AnswerPortAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequestHandlerAccess().getAnswerPortAnswerPortCrossReference_3_0()); }
		(
			{ before(grammarAccess.getRequestHandlerAccess().getAnswerPortAnswerPortFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getRequestHandlerAccess().getAnswerPortAnswerPortFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getRequestHandlerAccess().getAnswerPortAnswerPortCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__ActiveQueueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); }
		(
			{ before(grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); }
			'activeQueue'
			{ after(grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); }
		)
		{ after(grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestHandler__LinksAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequestHandlerAccess().getLinksAbstractComponentLinkParserRuleCall_6_0()); }
		ruleAbstractComponentLink
		{ after(grammarAccess.getRequestHandlerAccess().getLinksAbstractComponentLinkParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestPortLink__RequestPortAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequestPortLinkAccess().getRequestPortRequestPortCrossReference_1_0()); }
		(
			{ before(grammarAccess.getRequestPortLinkAccess().getRequestPortRequestPortFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getRequestPortLinkAccess().getRequestPortRequestPortFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getRequestPortLinkAccess().getRequestPortRequestPortCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaClientLink__ClientAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpcUaClientLinkAccess().getClientOpcUaDeviceClientCrossReference_1_0()); }
		(
			{ before(grammarAccess.getOpcUaClientLinkAccess().getClientOpcUaDeviceClientFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getOpcUaClientLinkAccess().getClientOpcUaDeviceClientFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getOpcUaClientLinkAccess().getClientOpcUaDeviceClientCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSubNodeObserver__SubjectAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentSubNodeObserverAccess().getSubjectComponentSubNodeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getComponentSubNodeObserverAccess().getSubjectComponentSubNodeFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getComponentSubNodeObserverAccess().getSubjectComponentSubNodeFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getComponentSubNodeObserverAccess().getSubjectComponentSubNodeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__InputPortAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputLinkExtensionAccess().getInputPortInputPortCrossReference_2_0()); }
		(
			{ before(grammarAccess.getInputLinkExtensionAccess().getInputPortInputPortFQNParserRuleCall_2_0_1()); }
			ruleFQN
			{ after(grammarAccess.getInputLinkExtensionAccess().getInputPortInputPortFQNParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getInputLinkExtensionAccess().getInputPortInputPortCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__OptionalAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputLinkExtensionAccess().getOptionalOptionalKeyword_4_0_0()); }
		(
			{ before(grammarAccess.getInputLinkExtensionAccess().getOptionalOptionalKeyword_4_0_0()); }
			'optional'
			{ after(grammarAccess.getInputLinkExtensionAccess().getOptionalOptionalKeyword_4_0_0()); }
		)
		{ after(grammarAccess.getInputLinkExtensionAccess().getOptionalOptionalKeyword_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__OversamplingOkAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkOversamplingOkKeyword_4_1_0()); }
		(
			{ before(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkOversamplingOkKeyword_4_1_0()); }
			'oversamplingOk'
			{ after(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkOversamplingOkKeyword_4_1_0()); }
		)
		{ after(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkOversamplingOkKeyword_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputLinkExtension__UndersamplingOkAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkUndersamplingOkKeyword_4_2_0()); }
		(
			{ before(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkUndersamplingOkKeyword_4_2_0()); }
			'undersamplingOk'
			{ after(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkUndersamplingOkKeyword_4_2_0()); }
		)
		{ after(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkUndersamplingOkKeyword_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__ConfigurableAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivationConstraintsAccess().getConfigurableEBooleanParserRuleCall_5_0()); }
		ruleEBoolean
		{ after(grammarAccess.getActivationConstraintsAccess().getConfigurableEBooleanParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__MinActFreqAssignment_7_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivationConstraintsAccess().getMinActFreqEDoubleParserRuleCall_7_0_2_0()); }
		ruleEDouble
		{ after(grammarAccess.getActivationConstraintsAccess().getMinActFreqEDoubleParserRuleCall_7_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationConstraints__MaxActFreqAssignment_7_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivationConstraintsAccess().getMaxActFreqEDoubleParserRuleCall_7_1_2_0()); }
		ruleEDouble
		{ after(grammarAccess.getActivationConstraintsAccess().getMaxActFreqEDoubleParserRuleCall_7_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationModeBinding__ModeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperationModeBindingAccess().getModePrivateOperationModeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getOperationModeBindingAccess().getModePrivateOperationModeFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getOperationModeBindingAccess().getModePrivateOperationModeFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getOperationModeBindingAccess().getModePrivateOperationModeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultInputTrigger__InputLinkAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefaultInputTriggerAccess().getInputLinkInputLinkExtensionCrossReference_1_0()); }
		(
			{ before(grammarAccess.getDefaultInputTriggerAccess().getInputLinkInputLinkExtensionFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getDefaultInputTriggerAccess().getInputLinkInputLinkExtensionFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getDefaultInputTriggerAccess().getInputLinkInputLinkExtensionCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultInputTrigger__PrescaleAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefaultInputTriggerAccess().getPrescaleEIntParserRuleCall_2_1_0()); }
		ruleEInt
		{ after(grammarAccess.getDefaultInputTriggerAccess().getPrescaleEIntParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_1_0()); }
		ruleEDouble
		{ after(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultObservedElementTrigger__ElementAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefaultObservedElementTriggerAccess().getElementComponentSubNodeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getDefaultObservedElementTriggerAccess().getElementComponentSubNodeFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getDefaultObservedElementTriggerAccess().getElementComponentSubNodeFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getDefaultObservedElementTriggerAccess().getElementComponentSubNodeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpcUaDeviceClientAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getOpcUaDeviceClientAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIEStringParserRuleCall_2_0_1_0()); }
		ruleEString
		{ after(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIEStringParserRuleCall_2_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileEStringParserRuleCall_2_1_1_0()); }
		ruleEString
		{ after(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileEStringParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpcUaReadServerAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getOpcUaReadServerAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__OutPortAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpcUaReadServerAccess().getOutPortOutputPortCrossReference_3_0()); }
		(
			{ before(grammarAccess.getOpcUaReadServerAccess().getOutPortOutputPortFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getOpcUaReadServerAccess().getOutPortOutputPortFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getOpcUaReadServerAccess().getOutPortOutputPortCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OpcUaReadServer__PortNumberAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpcUaReadServerAccess().getPortNumberEIntParserRuleCall_4_1_0()); }
		ruleEInt
		{ after(grammarAccess.getOpcUaReadServerAccess().getPortNumberEIntParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationSlavePortAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCoordinationSlavePortAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__ServiceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0()); }
		(
			{ before(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationSlavePort__ElementsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationSlavePortAccess().getElementsAbstractCoordinationElementParserRuleCall_5_0()); }
		ruleAbstractCoordinationElement
		{ after(grammarAccess.getCoordinationSlavePortAccess().getElementsAbstractCoordinationElementParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefCoordinationModuleRealizationCrossReference_1_0()); }
		(
			{ before(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefCoordinationModuleRealizationFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefCoordinationModuleRealizationFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefCoordinationModuleRealizationCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageCommunicationServiceUsageCrossReference_1_0()); }
		(
			{ before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageCommunicationServiceUsageFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageCommunicationServiceUsageFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageCommunicationServiceUsageCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortComponentPortCrossReference_3_0()); }
		(
			{ before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortComponentPortFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortComponentPortFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortComponentPortCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__IsDefaultInitAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_1_0()); }
		(
			{ before(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_1_0()); }
			'default'
			{ after(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_1_0()); }
		)
		{ after(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__ModeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionCrossReference_3_0()); }
		(
			{ before(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__ActivatesAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_2_0()); }
		(
			{ before(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeIDTerminalRuleCall_5_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeIDTerminalRuleCall_5_2_0_1()); }
		)
		{ after(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOperationMode__ActivatesAssignment_5_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_3_1_0()); }
		(
			{ before(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeIDTerminalRuleCall_5_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeIDTerminalRuleCall_5_3_1_0_1()); }
		)
		{ after(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrivateOperationMode__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrivateOperationModeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPrivateOperationModeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationMasterPort__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationMasterPortAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCoordinationMasterPortAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationMasterPort__ServiceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationMasterPortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0()); }
		(
			{ before(grammarAccess.getCoordinationMasterPortAccess().getServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getCoordinationMasterPortAccess().getServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getCoordinationMasterPortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParametersRef__ParameterAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentParametersRefAccess().getParameterComponentParameterCrossReference_1_0()); }
		(
			{ before(grammarAccess.getComponentParametersRefAccess().getParameterComponentParameterFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getComponentParametersRefAccess().getParameterComponentParameterFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getComponentParametersRefAccess().getParameterComponentParameterCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentParametersRef__SlaveAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentParametersRefAccess().getSlaveCoordinationSlavePortCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getComponentParametersRefAccess().getSlaveCoordinationSlavePortFQNParserRuleCall_2_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getComponentParametersRefAccess().getSlaveCoordinationSlavePortFQNParserRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getComponentParametersRefAccess().getSlaveCoordinationSlavePortCrossReference_2_1_0()); }
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

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
