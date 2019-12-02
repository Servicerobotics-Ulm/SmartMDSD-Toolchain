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
grammar InternalServiceDefinition;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.service.serviceDefinition.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.service.serviceDefinition.ide.contentassist.antlr.internal;

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
import org.xtext.service.serviceDefinition.services.ServiceDefinitionGrammarAccess;

}
@parser::members {
	private ServiceDefinitionGrammarAccess grammarAccess;

	public void setGrammarAccess(ServiceDefinitionGrammarAccess grammarAccess) {
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

// Entry rule entryRuleServiceDefModel
entryRuleServiceDefModel
:
{ before(grammarAccess.getServiceDefModelRule()); }
	 ruleServiceDefModel
{ after(grammarAccess.getServiceDefModelRule()); } 
	 EOF 
;

// Rule ServiceDefModel
ruleServiceDefModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getServiceDefModelAccess().getGroup()); }
		(rule__ServiceDefModel__Group__0)
		{ after(grammarAccess.getServiceDefModelAccess().getGroup()); }
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

// Entry rule entryRuleServiceDefRepository
entryRuleServiceDefRepository
:
{ before(grammarAccess.getServiceDefRepositoryRule()); }
	 ruleServiceDefRepository
{ after(grammarAccess.getServiceDefRepositoryRule()); } 
	 EOF 
;

// Rule ServiceDefRepository
ruleServiceDefRepository 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getServiceDefRepositoryAccess().getGroup()); }
		(rule__ServiceDefRepository__Group__0)
		{ after(grammarAccess.getServiceDefRepositoryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleServiceRepoVersion
entryRuleServiceRepoVersion
:
{ before(grammarAccess.getServiceRepoVersionRule()); }
	 ruleServiceRepoVersion
{ after(grammarAccess.getServiceRepoVersionRule()); } 
	 EOF 
;

// Rule ServiceRepoVersion
ruleServiceRepoVersion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getServiceRepoVersionAccess().getGroup()); }
		(rule__ServiceRepoVersion__Group__0)
		{ after(grammarAccess.getServiceRepoVersionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommRepoImport
entryRuleCommRepoImport
:
{ before(grammarAccess.getCommRepoImportRule()); }
	 ruleCommRepoImport
{ after(grammarAccess.getCommRepoImportRule()); } 
	 EOF 
;

// Rule CommRepoImport
ruleCommRepoImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommRepoImportAccess().getGroup()); }
		(rule__CommRepoImport__Group__0)
		{ after(grammarAccess.getCommRepoImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractServiceDefinition
entryRuleAbstractServiceDefinition
:
{ before(grammarAccess.getAbstractServiceDefinitionRule()); }
	 ruleAbstractServiceDefinition
{ after(grammarAccess.getAbstractServiceDefinitionRule()); } 
	 EOF 
;

// Rule AbstractServiceDefinition
ruleAbstractServiceDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractServiceDefinitionAccess().getAlternatives()); }
		(rule__AbstractServiceDefinition__Alternatives)
		{ after(grammarAccess.getAbstractServiceDefinitionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommunicationServiceDefinition
entryRuleCommunicationServiceDefinition
:
{ before(grammarAccess.getCommunicationServiceDefinitionRule()); }
	 ruleCommunicationServiceDefinition
{ after(grammarAccess.getCommunicationServiceDefinitionRule()); } 
	 EOF 
;

// Rule CommunicationServiceDefinition
ruleCommunicationServiceDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommunicationServiceDefinitionAccess().getAlternatives()); }
		(rule__CommunicationServiceDefinition__Alternatives)
		{ after(grammarAccess.getCommunicationServiceDefinitionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleForkingServiceDefinition
entryRuleForkingServiceDefinition
:
{ before(grammarAccess.getForkingServiceDefinitionRule()); }
	 ruleForkingServiceDefinition
{ after(grammarAccess.getForkingServiceDefinitionRule()); } 
	 EOF 
;

// Rule ForkingServiceDefinition
ruleForkingServiceDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getForkingServiceDefinitionAccess().getGroup()); }
		(rule__ForkingServiceDefinition__Group__0)
		{ after(grammarAccess.getForkingServiceDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJoyningServiceDefinition
entryRuleJoyningServiceDefinition
:
{ before(grammarAccess.getJoyningServiceDefinitionRule()); }
	 ruleJoyningServiceDefinition
{ after(grammarAccess.getJoyningServiceDefinitionRule()); } 
	 EOF 
;

// Rule JoyningServiceDefinition
ruleJoyningServiceDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJoyningServiceDefinitionAccess().getGroup()); }
		(rule__JoyningServiceDefinition__Group__0)
		{ after(grammarAccess.getJoyningServiceDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRequestAnswerServiceDefinition
entryRuleRequestAnswerServiceDefinition
:
{ before(grammarAccess.getRequestAnswerServiceDefinitionRule()); }
	 ruleRequestAnswerServiceDefinition
{ after(grammarAccess.getRequestAnswerServiceDefinitionRule()); } 
	 EOF 
;

// Rule RequestAnswerServiceDefinition
ruleRequestAnswerServiceDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getGroup()); }
		(rule__RequestAnswerServiceDefinition__Group__0)
		{ after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCoordinationServiceDefinition
entryRuleCoordinationServiceDefinition
:
{ before(grammarAccess.getCoordinationServiceDefinitionRule()); }
	 ruleCoordinationServiceDefinition
{ after(grammarAccess.getCoordinationServiceDefinitionRule()); } 
	 EOF 
;

// Rule CoordinationServiceDefinition
ruleCoordinationServiceDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getGroup()); }
		(rule__CoordinationServiceDefinition__Group__0)
		{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommunicationServiceUsage
entryRuleCommunicationServiceUsage
:
{ before(grammarAccess.getCommunicationServiceUsageRule()); }
	 ruleCommunicationServiceUsage
{ after(grammarAccess.getCommunicationServiceUsageRule()); } 
	 EOF 
;

// Rule CommunicationServiceUsage
ruleCommunicationServiceUsage 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommunicationServiceUsageAccess().getGroup()); }
		(rule__CommunicationServiceUsage__Group__0)
		{ after(grammarAccess.getCommunicationServiceUsageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStatePattern
entryRuleStatePattern
:
{ before(grammarAccess.getStatePatternRule()); }
	 ruleStatePattern
{ after(grammarAccess.getStatePatternRule()); } 
	 EOF 
;

// Rule StatePattern
ruleStatePattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStatePatternAccess().getGroup()); }
		(rule__StatePattern__Group__0)
		{ after(grammarAccess.getStatePatternAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParameterPattern
entryRuleParameterPattern
:
{ before(grammarAccess.getParameterPatternRule()); }
	 ruleParameterPattern
{ after(grammarAccess.getParameterPatternRule()); } 
	 EOF 
;

// Rule ParameterPattern
ruleParameterPattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterPatternAccess().getGroup()); }
		(rule__ParameterPattern__Group__0)
		{ after(grammarAccess.getParameterPatternAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDynamicWiringPattern
entryRuleDynamicWiringPattern
:
{ before(grammarAccess.getDynamicWiringPatternRule()); }
	 ruleDynamicWiringPattern
{ after(grammarAccess.getDynamicWiringPatternRule()); } 
	 EOF 
;

// Rule DynamicWiringPattern
ruleDynamicWiringPattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDynamicWiringPatternAccess().getGroup()); }
		(rule__DynamicWiringPattern__Group__0)
		{ after(grammarAccess.getDynamicWiringPatternAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMonitoringPattern
entryRuleMonitoringPattern
:
{ before(grammarAccess.getMonitoringPatternRule()); }
	 ruleMonitoringPattern
{ after(grammarAccess.getMonitoringPatternRule()); } 
	 EOF 
;

// Rule MonitoringPattern
ruleMonitoringPattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMonitoringPatternAccess().getGroup()); }
		(rule__MonitoringPattern__Group__0)
		{ after(grammarAccess.getMonitoringPatternAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleForkingPatternInstance
entryRuleForkingPatternInstance
:
{ before(grammarAccess.getForkingPatternInstanceRule()); }
	 ruleForkingPatternInstance
{ after(grammarAccess.getForkingPatternInstanceRule()); } 
	 EOF 
;

// Rule ForkingPatternInstance
ruleForkingPatternInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getForkingPatternInstanceAccess().getAlternatives()); }
		(rule__ForkingPatternInstance__Alternatives)
		{ after(grammarAccess.getForkingPatternInstanceAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJoiningPatternInstance
entryRuleJoiningPatternInstance
:
{ before(grammarAccess.getJoiningPatternInstanceRule()); }
	 ruleJoiningPatternInstance
{ after(grammarAccess.getJoiningPatternInstanceRule()); } 
	 EOF 
;

// Rule JoiningPatternInstance
ruleJoiningPatternInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJoiningPatternInstanceAccess().getSendPatternParserRuleCall()); }
		ruleSendPattern
		{ after(grammarAccess.getJoiningPatternInstanceAccess().getSendPatternParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRequestAnswerPattern
entryRuleRequestAnswerPattern
:
{ before(grammarAccess.getRequestAnswerPatternRule()); }
	 ruleRequestAnswerPattern
{ after(grammarAccess.getRequestAnswerPatternRule()); } 
	 EOF 
;

// Rule RequestAnswerPattern
ruleRequestAnswerPattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRequestAnswerPatternAccess().getQueryPatternParserRuleCall()); }
		ruleQueryPattern
		{ after(grammarAccess.getRequestAnswerPatternAccess().getQueryPatternParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePushPattern
entryRulePushPattern
:
{ before(grammarAccess.getPushPatternRule()); }
	 rulePushPattern
{ after(grammarAccess.getPushPatternRule()); } 
	 EOF 
;

// Rule PushPattern
rulePushPattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPushPatternAccess().getGroup()); }
		(rule__PushPattern__Group__0)
		{ after(grammarAccess.getPushPatternAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEventPattern
entryRuleEventPattern
:
{ before(grammarAccess.getEventPatternRule()); }
	 ruleEventPattern
{ after(grammarAccess.getEventPatternRule()); } 
	 EOF 
;

// Rule EventPattern
ruleEventPattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEventPatternAccess().getGroup()); }
		(rule__EventPattern__Group__0)
		{ after(grammarAccess.getEventPatternAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQueryPattern
entryRuleQueryPattern
:
{ before(grammarAccess.getQueryPatternRule()); }
	 ruleQueryPattern
{ after(grammarAccess.getQueryPatternRule()); } 
	 EOF 
;

// Rule QueryPattern
ruleQueryPattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQueryPatternAccess().getGroup()); }
		(rule__QueryPattern__Group__0)
		{ after(grammarAccess.getQueryPatternAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSendPattern
entryRuleSendPattern
:
{ before(grammarAccess.getSendPatternRule()); }
	 ruleSendPattern
{ after(grammarAccess.getSendPatternRule()); } 
	 EOF 
;

// Rule SendPattern
ruleSendPattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSendPatternAccess().getGroup()); }
		(rule__SendPattern__Group__0)
		{ after(grammarAccess.getSendPatternAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleServiceProperty
entryRuleServiceProperty
:
{ before(grammarAccess.getServicePropertyRule()); }
	 ruleServiceProperty
{ after(grammarAccess.getServicePropertyRule()); } 
	 EOF 
;

// Rule ServiceProperty
ruleServiceProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getServicePropertyAccess().getGroup()); }
		(rule__ServiceProperty__Group__0)
		{ after(grammarAccess.getServicePropertyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractServiceDefinition__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractServiceDefinitionAccess().getCommunicationServiceDefinitionParserRuleCall_0()); }
		ruleCommunicationServiceDefinition
		{ after(grammarAccess.getAbstractServiceDefinitionAccess().getCommunicationServiceDefinitionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractServiceDefinitionAccess().getCoordinationServiceDefinitionParserRuleCall_1()); }
		ruleCoordinationServiceDefinition
		{ after(grammarAccess.getAbstractServiceDefinitionAccess().getCoordinationServiceDefinitionParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceDefinition__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommunicationServiceDefinitionAccess().getForkingServiceDefinitionParserRuleCall_0()); }
		ruleForkingServiceDefinition
		{ after(grammarAccess.getCommunicationServiceDefinitionAccess().getForkingServiceDefinitionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getCommunicationServiceDefinitionAccess().getJoyningServiceDefinitionParserRuleCall_1()); }
		ruleJoyningServiceDefinition
		{ after(grammarAccess.getCommunicationServiceDefinitionAccess().getJoyningServiceDefinitionParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getCommunicationServiceDefinitionAccess().getRequestAnswerServiceDefinitionParserRuleCall_2()); }
		ruleRequestAnswerServiceDefinition
		{ after(grammarAccess.getCommunicationServiceDefinitionAccess().getRequestAnswerServiceDefinitionParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingPatternInstance__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForkingPatternInstanceAccess().getPushPatternParserRuleCall_0()); }
		rulePushPattern
		{ after(grammarAccess.getForkingPatternInstanceAccess().getPushPatternParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getForkingPatternInstanceAccess().getEventPatternParserRuleCall_1()); }
		ruleEventPattern
		{ after(grammarAccess.getForkingPatternInstanceAccess().getEventPatternParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceDefModel__Group__0__Impl
	rule__ServiceDefModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceDefModelAccess().getServiceDefModelAction_0()); }
	()
	{ after(grammarAccess.getServiceDefModelAccess().getServiceDefModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceDefModel__Group__1__Impl
	rule__ServiceDefModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceDefModelAccess().getImportsAssignment_1()); }
	(rule__ServiceDefModel__ImportsAssignment_1)*
	{ after(grammarAccess.getServiceDefModelAccess().getImportsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceDefModel__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceDefModelAccess().getRepositoryAssignment_2()); }
	(rule__ServiceDefModel__RepositoryAssignment_2)?
	{ after(grammarAccess.getServiceDefModelAccess().getRepositoryAssignment_2()); }
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


rule__ServiceDefRepository__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceDefRepository__Group__0__Impl
	rule__ServiceDefRepository__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceDefRepositoryAccess().getDocumentationAssignment_0()); }
	(rule__ServiceDefRepository__DocumentationAssignment_0)?
	{ after(grammarAccess.getServiceDefRepositoryAccess().getDocumentationAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceDefRepository__Group__1__Impl
	rule__ServiceDefRepository__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceDefRepositoryAccess().getServiceDefRepositoryKeyword_1()); }
	'ServiceDefRepository'
	{ after(grammarAccess.getServiceDefRepositoryAccess().getServiceDefRepositoryKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceDefRepository__Group__2__Impl
	rule__ServiceDefRepository__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceDefRepositoryAccess().getNameAssignment_2()); }
	(rule__ServiceDefRepository__NameAssignment_2)
	{ after(grammarAccess.getServiceDefRepositoryAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceDefRepository__Group__3__Impl
	rule__ServiceDefRepository__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceDefRepositoryAccess().getGroup_3()); }
	(rule__ServiceDefRepository__Group_3__0)?
	{ after(grammarAccess.getServiceDefRepositoryAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceDefRepository__Group__4__Impl
	rule__ServiceDefRepository__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceDefRepositoryAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getServiceDefRepositoryAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceDefRepository__Group__5__Impl
	rule__ServiceDefRepository__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceDefRepositoryAccess().getServicesAssignment_5()); }
	(rule__ServiceDefRepository__ServicesAssignment_5)*
	{ after(grammarAccess.getServiceDefRepositoryAccess().getServicesAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceDefRepository__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceDefRepositoryAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getServiceDefRepositoryAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceDefRepository__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceDefRepository__Group_3__0__Impl
	rule__ServiceDefRepository__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceDefRepositoryAccess().getVersionKeyword_3_0()); }
	'version'
	{ after(grammarAccess.getServiceDefRepositoryAccess().getVersionKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceDefRepository__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceDefRepositoryAccess().getVersionAssignment_3_1()); }
	(rule__ServiceDefRepository__VersionAssignment_3_1)
	{ after(grammarAccess.getServiceDefRepositoryAccess().getVersionAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceRepoVersion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceRepoVersion__Group__0__Impl
	rule__ServiceRepoVersion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoVersion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceRepoVersionAccess().getMajorAssignment_0()); }
	(rule__ServiceRepoVersion__MajorAssignment_0)
	{ after(grammarAccess.getServiceRepoVersionAccess().getMajorAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoVersion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceRepoVersion__Group__1__Impl
	rule__ServiceRepoVersion__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoVersion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_1()); }
	'.'
	{ after(grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoVersion__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceRepoVersion__Group__2__Impl
	rule__ServiceRepoVersion__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoVersion__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceRepoVersionAccess().getMinorAssignment_2()); }
	(rule__ServiceRepoVersion__MinorAssignment_2)
	{ after(grammarAccess.getServiceRepoVersionAccess().getMinorAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoVersion__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceRepoVersion__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoVersion__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceRepoVersionAccess().getGroup_3()); }
	(rule__ServiceRepoVersion__Group_3__0)?
	{ after(grammarAccess.getServiceRepoVersionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceRepoVersion__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceRepoVersion__Group_3__0__Impl
	rule__ServiceRepoVersion__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoVersion__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_3_0()); }
	'.'
	{ after(grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoVersion__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceRepoVersion__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoVersion__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceRepoVersionAccess().getPatchAssignment_3_1()); }
	(rule__ServiceRepoVersion__PatchAssignment_3_1)
	{ after(grammarAccess.getServiceRepoVersionAccess().getPatchAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CommRepoImport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommRepoImport__Group__0__Impl
	rule__CommRepoImport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CommRepoImport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommRepoImportAccess().getImportKeyword_0()); }
	'#import'
	{ after(grammarAccess.getCommRepoImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommRepoImport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommRepoImport__Group__1__Impl
	rule__CommRepoImport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CommRepoImport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommRepoImportAccess().getImportedNamespaceAssignment_1()); }
	(rule__CommRepoImport__ImportedNamespaceAssignment_1)
	{ after(grammarAccess.getCommRepoImportAccess().getImportedNamespaceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommRepoImport__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommRepoImport__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CommRepoImport__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommRepoImportAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getCommRepoImportAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ForkingServiceDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForkingServiceDefinition__Group__0__Impl
	rule__ForkingServiceDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForkingServiceDefinitionAccess().getDocumentationAssignment_0()); }
	(rule__ForkingServiceDefinition__DocumentationAssignment_0)?
	{ after(grammarAccess.getForkingServiceDefinitionAccess().getDocumentationAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForkingServiceDefinition__Group__1__Impl
	rule__ForkingServiceDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForkingServiceDefinitionAccess().getForkingServiceDefinitionKeyword_1()); }
	'ForkingServiceDefinition'
	{ after(grammarAccess.getForkingServiceDefinitionAccess().getForkingServiceDefinitionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForkingServiceDefinition__Group__2__Impl
	rule__ForkingServiceDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForkingServiceDefinitionAccess().getNameAssignment_2()); }
	(rule__ForkingServiceDefinition__NameAssignment_2)
	{ after(grammarAccess.getForkingServiceDefinitionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForkingServiceDefinition__Group__3__Impl
	rule__ForkingServiceDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForkingServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getForkingServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForkingServiceDefinition__Group__4__Impl
	rule__ForkingServiceDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForkingServiceDefinitionAccess().getPatternAssignment_4()); }
	(rule__ForkingServiceDefinition__PatternAssignment_4)
	{ after(grammarAccess.getForkingServiceDefinitionAccess().getPatternAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForkingServiceDefinition__Group__5__Impl
	rule__ForkingServiceDefinition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesAssignment_5()); }
	(rule__ForkingServiceDefinition__PropertiesAssignment_5)*
	{ after(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForkingServiceDefinition__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForkingServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getForkingServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JoyningServiceDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JoyningServiceDefinition__Group__0__Impl
	rule__JoyningServiceDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJoyningServiceDefinitionAccess().getDocumentationAssignment_0()); }
	(rule__JoyningServiceDefinition__DocumentationAssignment_0)?
	{ after(grammarAccess.getJoyningServiceDefinitionAccess().getDocumentationAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JoyningServiceDefinition__Group__1__Impl
	rule__JoyningServiceDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJoyningServiceDefinitionAccess().getJoiningServiceDefinitionKeyword_1()); }
	'JoiningServiceDefinition'
	{ after(grammarAccess.getJoyningServiceDefinitionAccess().getJoiningServiceDefinitionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JoyningServiceDefinition__Group__2__Impl
	rule__JoyningServiceDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJoyningServiceDefinitionAccess().getNameAssignment_2()); }
	(rule__JoyningServiceDefinition__NameAssignment_2)
	{ after(grammarAccess.getJoyningServiceDefinitionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JoyningServiceDefinition__Group__3__Impl
	rule__JoyningServiceDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJoyningServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getJoyningServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JoyningServiceDefinition__Group__4__Impl
	rule__JoyningServiceDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJoyningServiceDefinitionAccess().getPatternAssignment_4()); }
	(rule__JoyningServiceDefinition__PatternAssignment_4)
	{ after(grammarAccess.getJoyningServiceDefinitionAccess().getPatternAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JoyningServiceDefinition__Group__5__Impl
	rule__JoyningServiceDefinition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesAssignment_5()); }
	(rule__JoyningServiceDefinition__PropertiesAssignment_5)*
	{ after(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JoyningServiceDefinition__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJoyningServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getJoyningServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequestAnswerServiceDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestAnswerServiceDefinition__Group__0__Impl
	rule__RequestAnswerServiceDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getDocumentationAssignment_0()); }
	(rule__RequestAnswerServiceDefinition__DocumentationAssignment_0)?
	{ after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getDocumentationAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestAnswerServiceDefinition__Group__1__Impl
	rule__RequestAnswerServiceDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getRequestAnswerServiceDefinitionKeyword_1()); }
	'RequestAnswerServiceDefinition'
	{ after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getRequestAnswerServiceDefinitionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestAnswerServiceDefinition__Group__2__Impl
	rule__RequestAnswerServiceDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameAssignment_2()); }
	(rule__RequestAnswerServiceDefinition__NameAssignment_2)
	{ after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestAnswerServiceDefinition__Group__3__Impl
	rule__RequestAnswerServiceDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestAnswerServiceDefinition__Group__4__Impl
	rule__RequestAnswerServiceDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternAssignment_4()); }
	(rule__RequestAnswerServiceDefinition__PatternAssignment_4)
	{ after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestAnswerServiceDefinition__Group__5__Impl
	rule__RequestAnswerServiceDefinition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesAssignment_5()); }
	(rule__RequestAnswerServiceDefinition__PropertiesAssignment_5)*
	{ after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequestAnswerServiceDefinition__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinationServiceDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationServiceDefinition__Group__0__Impl
	rule__CoordinationServiceDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getDocumentationAssignment_0()); }
	(rule__CoordinationServiceDefinition__DocumentationAssignment_0)?
	{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getDocumentationAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationServiceDefinition__Group__1__Impl
	rule__CoordinationServiceDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getCoordinationServiceDefinitionKeyword_1()); }
	'CoordinationServiceDefinition'
	{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getCoordinationServiceDefinitionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationServiceDefinition__Group__2__Impl
	rule__CoordinationServiceDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getNameAssignment_2()); }
	(rule__CoordinationServiceDefinition__NameAssignment_2)
	{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationServiceDefinition__Group__3__Impl
	rule__CoordinationServiceDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationServiceDefinition__Group__4__Impl
	rule__CoordinationServiceDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4()); }
	(rule__CoordinationServiceDefinition__UnorderedGroup_4)
	{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationServiceDefinition__Group__5__Impl
	rule__CoordinationServiceDefinition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesAssignment_5()); }
	(rule__CoordinationServiceDefinition__ServicesAssignment_5)*
	{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationServiceDefinition__Group__6__Impl
	rule__CoordinationServiceDefinition__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesAssignment_6()); }
	(rule__CoordinationServiceDefinition__PropertiesAssignment_6)*
	{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationServiceDefinition__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CommunicationServiceUsage__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommunicationServiceUsage__Group__0__Impl
	rule__CommunicationServiceUsage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsage__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommunicationServiceUsageAccess().getCommunicationServiceUsageKeyword_0()); }
	'CommunicationServiceUsage'
	{ after(grammarAccess.getCommunicationServiceUsageAccess().getCommunicationServiceUsageKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsage__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommunicationServiceUsage__Group__1__Impl
	rule__CommunicationServiceUsage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsage__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommunicationServiceUsageAccess().getNameAssignment_1()); }
	(rule__CommunicationServiceUsage__NameAssignment_1)
	{ after(grammarAccess.getCommunicationServiceUsageAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsage__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommunicationServiceUsage__Group__2__Impl
	rule__CommunicationServiceUsage__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsage__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommunicationServiceUsageAccess().getUsesKeyword_2()); }
	'uses'
	{ after(grammarAccess.getCommunicationServiceUsageAccess().getUsesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsage__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CommunicationServiceUsage__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsage__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommunicationServiceUsageAccess().getUsesAssignment_3()); }
	(rule__CommunicationServiceUsage__UsesAssignment_3)
	{ after(grammarAccess.getCommunicationServiceUsageAccess().getUsesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StatePattern__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StatePattern__Group__0__Impl
	rule__StatePattern__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatePatternAccess().getStatePatternAction_0()); }
	()
	{ after(grammarAccess.getStatePatternAccess().getStatePatternAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StatePattern__Group__1__Impl
	rule__StatePattern__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatePatternAccess().getStatePatternKeyword_1()); }
	'StatePattern'
	{ after(grammarAccess.getStatePatternAccess().getStatePatternKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StatePattern__Group__2__Impl
	rule__StatePattern__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatePatternAccess().getLessThanSignKeyword_2()); }
	'<'
	{ after(grammarAccess.getStatePatternAccess().getLessThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StatePattern__Group__3__Impl
	rule__StatePattern__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatePatternAccess().getLifecycleKeyword_3()); }
	'lifecycle'
	{ after(grammarAccess.getStatePatternAccess().getLifecycleKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StatePattern__Group__4__Impl
	rule__StatePattern__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatePatternAccess().getLifecycleAssignment_4()); }
	(rule__StatePattern__LifecycleAssignment_4)
	{ after(grammarAccess.getStatePatternAccess().getLifecycleAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StatePattern__Group__5__Impl
	rule__StatePattern__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatePatternAccess().getGroup_5()); }
	(rule__StatePattern__Group_5__0)?
	{ after(grammarAccess.getStatePatternAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StatePattern__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatePatternAccess().getGreaterThanSignKeyword_6()); }
	'>'
	{ after(grammarAccess.getStatePatternAccess().getGreaterThanSignKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StatePattern__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StatePattern__Group_5__0__Impl
	rule__StatePattern__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatePatternAccess().getWithKeyword_5_0()); }
	'with'
	{ after(grammarAccess.getStatePatternAccess().getWithKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StatePattern__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatePatternAccess().getModesAssignment_5_1()); }
	(rule__StatePattern__ModesAssignment_5_1)
	{ after(grammarAccess.getStatePatternAccess().getModesAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterPattern__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterPattern__Group__0__Impl
	rule__ParameterPattern__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterPattern__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterPatternAccess().getParameterPatternAction_0()); }
	()
	{ after(grammarAccess.getParameterPatternAccess().getParameterPatternAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterPattern__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterPattern__Group__1__Impl
	rule__ParameterPattern__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterPattern__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterPatternAccess().getParameterPatternKeyword_1()); }
	'ParameterPattern'
	{ after(grammarAccess.getParameterPatternAccess().getParameterPatternKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterPattern__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterPattern__Group__2__Impl
	rule__ParameterPattern__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterPattern__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterPatternAccess().getLessThanSignKeyword_2()); }
	'<'
	{ after(grammarAccess.getParameterPatternAccess().getLessThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterPattern__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterPattern__Group__3__Impl
	rule__ParameterPattern__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterPattern__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterPatternAccess().getParameterSetAssignment_3()); }
	(rule__ParameterPattern__ParameterSetAssignment_3)
	{ after(grammarAccess.getParameterPatternAccess().getParameterSetAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterPattern__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterPattern__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterPattern__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterPatternAccess().getGreaterThanSignKeyword_4()); }
	'>'
	{ after(grammarAccess.getParameterPatternAccess().getGreaterThanSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DynamicWiringPattern__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicWiringPattern__Group__0__Impl
	rule__DynamicWiringPattern__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicWiringPattern__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternAction_0()); }
	()
	{ after(grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicWiringPattern__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicWiringPattern__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicWiringPattern__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternKeyword_1()); }
	'DynamicWiringPattern'
	{ after(grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MonitoringPattern__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MonitoringPattern__Group__0__Impl
	rule__MonitoringPattern__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MonitoringPattern__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMonitoringPatternAccess().getMonitoringPatternAction_0()); }
	()
	{ after(grammarAccess.getMonitoringPatternAccess().getMonitoringPatternAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MonitoringPattern__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MonitoringPattern__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MonitoringPattern__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMonitoringPatternAccess().getMonitoringPatternKeyword_1()); }
	'MonitoringPattern'
	{ after(grammarAccess.getMonitoringPatternAccess().getMonitoringPatternKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PushPattern__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PushPattern__Group__0__Impl
	rule__PushPattern__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PushPattern__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPushPatternAccess().getPushPatternAction_0()); }
	()
	{ after(grammarAccess.getPushPatternAccess().getPushPatternAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PushPattern__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PushPattern__Group__1__Impl
	rule__PushPattern__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PushPattern__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPushPatternAccess().getPushPatternKeyword_1()); }
	'PushPattern'
	{ after(grammarAccess.getPushPatternAccess().getPushPatternKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PushPattern__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PushPattern__Group__2__Impl
	rule__PushPattern__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PushPattern__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPushPatternAccess().getLessThanSignKeyword_2()); }
	'<'
	{ after(grammarAccess.getPushPatternAccess().getLessThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PushPattern__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PushPattern__Group__3__Impl
	rule__PushPattern__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PushPattern__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPushPatternAccess().getDataTypeKeyword_3()); }
	'DataType'
	{ after(grammarAccess.getPushPatternAccess().getDataTypeKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PushPattern__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PushPattern__Group__4__Impl
	rule__PushPattern__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PushPattern__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPushPatternAccess().getEqualsSignKeyword_4()); }
	'='
	{ after(grammarAccess.getPushPatternAccess().getEqualsSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PushPattern__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PushPattern__Group__5__Impl
	rule__PushPattern__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__PushPattern__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPushPatternAccess().getDataTypeAssignment_5()); }
	(rule__PushPattern__DataTypeAssignment_5)
	{ after(grammarAccess.getPushPatternAccess().getDataTypeAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PushPattern__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PushPattern__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PushPattern__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPushPatternAccess().getGreaterThanSignKeyword_6()); }
	'>'
	{ after(grammarAccess.getPushPatternAccess().getGreaterThanSignKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EventPattern__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__Group__0__Impl
	rule__EventPattern__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventPatternAccess().getEventPatternAction_0()); }
	()
	{ after(grammarAccess.getEventPatternAccess().getEventPatternAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__Group__1__Impl
	rule__EventPattern__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventPatternAccess().getEventPatternKeyword_1()); }
	'EventPattern'
	{ after(grammarAccess.getEventPatternAccess().getEventPatternKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__Group__2__Impl
	rule__EventPattern__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventPatternAccess().getLessThanSignKeyword_2()); }
	'<'
	{ after(grammarAccess.getEventPatternAccess().getLessThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__Group__3__Impl
	rule__EventPattern__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventPatternAccess().getUnorderedGroup_3()); }
	(rule__EventPattern__UnorderedGroup_3)
	{ after(grammarAccess.getEventPatternAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventPatternAccess().getGreaterThanSignKeyword_4()); }
	'>'
	{ after(grammarAccess.getEventPatternAccess().getGreaterThanSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EventPattern__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__Group_3_0__0__Impl
	rule__EventPattern__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventPatternAccess().getEventTypeKeyword_3_0_0()); }
	'EventType'
	{ after(grammarAccess.getEventPatternAccess().getEventTypeKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__Group_3_0__1__Impl
	rule__EventPattern__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_0_1()); }
	'='
	{ after(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__Group_3_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventPatternAccess().getEventTypeAssignment_3_0_2()); }
	(rule__EventPattern__EventTypeAssignment_3_0_2)
	{ after(grammarAccess.getEventPatternAccess().getEventTypeAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EventPattern__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__Group_3_1__0__Impl
	rule__EventPattern__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventPatternAccess().getActivationTypeKeyword_3_1_0()); }
	'ActivationType'
	{ after(grammarAccess.getEventPatternAccess().getActivationTypeKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__Group_3_1__1__Impl
	rule__EventPattern__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_1_1()); }
	'='
	{ after(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__Group_3_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventPatternAccess().getActivationTypeAssignment_3_1_2()); }
	(rule__EventPattern__ActivationTypeAssignment_3_1_2)
	{ after(grammarAccess.getEventPatternAccess().getActivationTypeAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EventPattern__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__Group_3_2__0__Impl
	rule__EventPattern__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventPatternAccess().getEventStateTypeKeyword_3_2_0()); }
	'EventStateType'
	{ after(grammarAccess.getEventPatternAccess().getEventStateTypeKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__Group_3_2__1__Impl
	rule__EventPattern__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_2_1()); }
	'='
	{ after(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__Group_3_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__Group_3_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventPatternAccess().getEventStateTypeAssignment_3_2_2()); }
	(rule__EventPattern__EventStateTypeAssignment_3_2_2)
	{ after(grammarAccess.getEventPatternAccess().getEventStateTypeAssignment_3_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QueryPattern__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryPattern__Group__0__Impl
	rule__QueryPattern__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryPatternAccess().getQueryPatternAction_0()); }
	()
	{ after(grammarAccess.getQueryPatternAccess().getQueryPatternAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryPattern__Group__1__Impl
	rule__QueryPattern__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryPatternAccess().getQueryPatternKeyword_1()); }
	'QueryPattern'
	{ after(grammarAccess.getQueryPatternAccess().getQueryPatternKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryPattern__Group__2__Impl
	rule__QueryPattern__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryPatternAccess().getLessThanSignKeyword_2()); }
	'<'
	{ after(grammarAccess.getQueryPatternAccess().getLessThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryPattern__Group__3__Impl
	rule__QueryPattern__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3()); }
	(rule__QueryPattern__UnorderedGroup_3)
	{ after(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryPattern__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryPatternAccess().getGreaterThanSignKeyword_4()); }
	'>'
	{ after(grammarAccess.getQueryPatternAccess().getGreaterThanSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QueryPattern__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryPattern__Group_3_0__0__Impl
	rule__QueryPattern__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryPatternAccess().getRequestTypeKeyword_3_0_0()); }
	'RequestType'
	{ after(grammarAccess.getQueryPatternAccess().getRequestTypeKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryPattern__Group_3_0__1__Impl
	rule__QueryPattern__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_0_1()); }
	'='
	{ after(grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryPattern__Group_3_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryPatternAccess().getRequestTypeAssignment_3_0_2()); }
	(rule__QueryPattern__RequestTypeAssignment_3_0_2)
	{ after(grammarAccess.getQueryPatternAccess().getRequestTypeAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QueryPattern__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryPattern__Group_3_1__0__Impl
	rule__QueryPattern__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryPatternAccess().getAnswerTypeKeyword_3_1_0()); }
	'AnswerType'
	{ after(grammarAccess.getQueryPatternAccess().getAnswerTypeKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryPattern__Group_3_1__1__Impl
	rule__QueryPattern__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_1_1()); }
	'='
	{ after(grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryPattern__Group_3_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryPatternAccess().getAnswerTypeAssignment_3_1_2()); }
	(rule__QueryPattern__AnswerTypeAssignment_3_1_2)
	{ after(grammarAccess.getQueryPatternAccess().getAnswerTypeAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SendPattern__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendPattern__Group__0__Impl
	rule__SendPattern__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SendPattern__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendPatternAccess().getSendPatternAction_0()); }
	()
	{ after(grammarAccess.getSendPatternAccess().getSendPatternAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendPattern__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendPattern__Group__1__Impl
	rule__SendPattern__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SendPattern__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendPatternAccess().getSendPatternKeyword_1()); }
	'SendPattern'
	{ after(grammarAccess.getSendPatternAccess().getSendPatternKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendPattern__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendPattern__Group__2__Impl
	rule__SendPattern__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SendPattern__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendPatternAccess().getLessThanSignKeyword_2()); }
	'<'
	{ after(grammarAccess.getSendPatternAccess().getLessThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendPattern__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendPattern__Group__3__Impl
	rule__SendPattern__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SendPattern__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendPatternAccess().getDataTypeKeyword_3()); }
	'DataType'
	{ after(grammarAccess.getSendPatternAccess().getDataTypeKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendPattern__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendPattern__Group__4__Impl
	rule__SendPattern__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SendPattern__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendPatternAccess().getEqualsSignKeyword_4()); }
	'='
	{ after(grammarAccess.getSendPatternAccess().getEqualsSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendPattern__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendPattern__Group__5__Impl
	rule__SendPattern__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SendPattern__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendPatternAccess().getDataTypeAssignment_5()); }
	(rule__SendPattern__DataTypeAssignment_5)
	{ after(grammarAccess.getSendPatternAccess().getDataTypeAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendPattern__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendPattern__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SendPattern__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendPatternAccess().getGreaterThanSignKeyword_6()); }
	'>'
	{ after(grammarAccess.getSendPatternAccess().getGreaterThanSignKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceProperty__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceProperty__Group__0__Impl
	rule__ServiceProperty__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceProperty__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServicePropertyAccess().getServicePropertyKeyword_0()); }
	'ServiceProperty'
	{ after(grammarAccess.getServicePropertyAccess().getServicePropertyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceProperty__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceProperty__Group__1__Impl
	rule__ServiceProperty__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceProperty__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServicePropertyAccess().getNameAssignment_1()); }
	(rule__ServiceProperty__NameAssignment_1)
	{ after(grammarAccess.getServicePropertyAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceProperty__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceProperty__Group__2__Impl
	rule__ServiceProperty__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceProperty__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServicePropertyAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getServicePropertyAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceProperty__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceProperty__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceProperty__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServicePropertyAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getServicePropertyAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CoordinationServiceDefinition__UnorderedGroup_4
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4());
	}
:
	rule__CoordinationServiceDefinition__UnorderedGroup_4__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternAssignment_4_0()); }
					(rule__CoordinationServiceDefinition__StatePatternAssignment_4_0)
					{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternAssignment_4_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternAssignment_4_1()); }
					(rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1)
					{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternAssignment_4_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternAssignment_4_2()); }
					(rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2)
					{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternAssignment_4_2()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 3);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternAssignment_4_3()); }
					(rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3)
					{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternAssignment_4_3()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__UnorderedGroup_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl
	rule__CoordinationServiceDefinition__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__UnorderedGroup_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl
	rule__CoordinationServiceDefinition__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__UnorderedGroup_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl
	rule__CoordinationServiceDefinition__UnorderedGroup_4__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__UnorderedGroup_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__EventPattern__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
	}
:
	rule__EventPattern__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getEventPatternAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__EventPattern__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getEventPatternAccess().getGroup_3_0()); }
					(rule__EventPattern__Group_3_0__0)
					{ after(grammarAccess.getEventPatternAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getEventPatternAccess().getGroup_3_1()); }
					(rule__EventPattern__Group_3_1__0)
					{ after(grammarAccess.getEventPatternAccess().getGroup_3_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getEventPatternAccess().getGroup_3_2()); }
					(rule__EventPattern__Group_3_2__0)
					{ after(grammarAccess.getEventPatternAccess().getGroup_3_2()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__EventPattern__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__UnorderedGroup_3__Impl
	rule__EventPattern__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__UnorderedGroup_3__Impl
	rule__EventPattern__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__UnorderedGroup_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventPattern__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__QueryPattern__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
	}
:
	rule__QueryPattern__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__QueryPattern__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getQueryPatternAccess().getGroup_3_0()); }
					(rule__QueryPattern__Group_3_0__0)
					{ after(grammarAccess.getQueryPatternAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getQueryPatternAccess().getGroup_3_1()); }
					(rule__QueryPattern__Group_3_1__0)
					{ after(grammarAccess.getQueryPatternAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__QueryPattern__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryPattern__UnorderedGroup_3__Impl
	rule__QueryPattern__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryPattern__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceDefModel__ImportsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServiceDefModelAccess().getImportsCommRepoImportParserRuleCall_1_0()); }
		ruleCommRepoImport
		{ after(grammarAccess.getServiceDefModelAccess().getImportsCommRepoImportParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefModel__RepositoryAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServiceDefModelAccess().getRepositoryServiceDefRepositoryParserRuleCall_2_0()); }
		ruleServiceDefRepository
		{ after(grammarAccess.getServiceDefModelAccess().getRepositoryServiceDefRepositoryParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__DocumentationAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServiceDefRepositoryAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
		RULE_DOCU_COMMENT
		{ after(grammarAccess.getServiceDefRepositoryAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServiceDefRepositoryAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getServiceDefRepositoryAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__VersionAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServiceDefRepositoryAccess().getVersionServiceRepoVersionParserRuleCall_3_1_0()); }
		ruleServiceRepoVersion
		{ after(grammarAccess.getServiceDefRepositoryAccess().getVersionServiceRepoVersionParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceDefRepository__ServicesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServiceDefRepositoryAccess().getServicesAbstractServiceDefinitionParserRuleCall_5_0()); }
		ruleAbstractServiceDefinition
		{ after(grammarAccess.getServiceDefRepositoryAccess().getServicesAbstractServiceDefinitionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoVersion__MajorAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServiceRepoVersionAccess().getMajorEIntParserRuleCall_0_0()); }
		ruleEInt
		{ after(grammarAccess.getServiceRepoVersionAccess().getMajorEIntParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoVersion__MinorAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServiceRepoVersionAccess().getMinorEIntParserRuleCall_2_0()); }
		ruleEInt
		{ after(grammarAccess.getServiceRepoVersionAccess().getMinorEIntParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceRepoVersion__PatchAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServiceRepoVersionAccess().getPatchEIntParserRuleCall_3_1_0()); }
		ruleEInt
		{ after(grammarAccess.getServiceRepoVersionAccess().getPatchEIntParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommRepoImport__ImportedNamespaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); }
		ruleFQNW
		{ after(grammarAccess.getCommRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__DocumentationAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForkingServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
		RULE_DOCU_COMMENT
		{ after(grammarAccess.getForkingServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForkingServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getForkingServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__PatternAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForkingServiceDefinitionAccess().getPatternForkingPatternInstanceParserRuleCall_4_0()); }
		ruleForkingPatternInstance
		{ after(grammarAccess.getForkingServiceDefinitionAccess().getPatternForkingPatternInstanceParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForkingServiceDefinition__PropertiesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0()); }
		ruleServiceProperty
		{ after(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__DocumentationAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJoyningServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
		RULE_DOCU_COMMENT
		{ after(grammarAccess.getJoyningServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJoyningServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getJoyningServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__PatternAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJoyningServiceDefinitionAccess().getPatternJoiningPatternInstanceParserRuleCall_4_0()); }
		ruleJoiningPatternInstance
		{ after(grammarAccess.getJoyningServiceDefinitionAccess().getPatternJoiningPatternInstanceParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JoyningServiceDefinition__PropertiesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0()); }
		ruleServiceProperty
		{ after(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__DocumentationAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
		RULE_DOCU_COMMENT
		{ after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__PatternAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternRequestAnswerPatternParserRuleCall_4_0()); }
		ruleRequestAnswerPattern
		{ after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternRequestAnswerPatternParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequestAnswerServiceDefinition__PropertiesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0()); }
		ruleServiceProperty
		{ after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__DocumentationAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
		RULE_DOCU_COMMENT
		{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__StatePatternAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternStatePatternParserRuleCall_4_0_0()); }
		ruleStatePattern
		{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternStatePatternParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternParameterPatternParserRuleCall_4_1_0()); }
		ruleParameterPattern
		{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternParameterPatternParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternMonitoringPatternParserRuleCall_4_2_0()); }
		ruleMonitoringPattern
		{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternMonitoringPatternParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternDynamicWiringPatternParserRuleCall_4_3_0()); }
		ruleDynamicWiringPattern
		{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternDynamicWiringPatternParserRuleCall_4_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__ServicesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesCommunicationServiceUsageParserRuleCall_5_0()); }
		ruleCommunicationServiceUsage
		{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesCommunicationServiceUsageParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CoordinationServiceDefinition__PropertiesAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_6_0()); }
		ruleServiceProperty
		{ after(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsage__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommunicationServiceUsageAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCommunicationServiceUsageAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CommunicationServiceUsage__UsesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommunicationServiceUsageAccess().getUsesCommunicationServiceDefinitionCrossReference_3_0()); }
		(
			{ before(grammarAccess.getCommunicationServiceUsageAccess().getUsesCommunicationServiceDefinitionFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getCommunicationServiceUsageAccess().getUsesCommunicationServiceDefinitionFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getCommunicationServiceUsageAccess().getUsesCommunicationServiceDefinitionCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__LifecycleAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatePatternAccess().getLifecycleStateMachineCrossReference_4_0()); }
		(
			{ before(grammarAccess.getStatePatternAccess().getLifecycleStateMachineFQNParserRuleCall_4_0_1()); }
			ruleFQN
			{ after(grammarAccess.getStatePatternAccess().getLifecycleStateMachineFQNParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getStatePatternAccess().getLifecycleStateMachineCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StatePattern__ModesAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatePatternAccess().getModesComponentModeCollectionCrossReference_5_1_0()); }
		(
			{ before(grammarAccess.getStatePatternAccess().getModesComponentModeCollectionFQNParserRuleCall_5_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getStatePatternAccess().getModesComponentModeCollectionFQNParserRuleCall_5_1_0_1()); }
		)
		{ after(grammarAccess.getStatePatternAccess().getModesComponentModeCollectionCrossReference_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterPattern__ParameterSetAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterPatternAccess().getParameterSetParameterSetDefinitionCrossReference_3_0()); }
		(
			{ before(grammarAccess.getParameterPatternAccess().getParameterSetParameterSetDefinitionFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getParameterPatternAccess().getParameterSetParameterSetDefinitionFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getParameterPatternAccess().getParameterSetParameterSetDefinitionCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PushPattern__DataTypeAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPushPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0()); }
		(
			{ before(grammarAccess.getPushPatternAccess().getDataTypeCommunicationObjectFQNParserRuleCall_5_0_1()); }
			ruleFQN
			{ after(grammarAccess.getPushPatternAccess().getDataTypeCommunicationObjectFQNParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getPushPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__EventTypeAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventPatternAccess().getEventTypeCommunicationObjectCrossReference_3_0_2_0()); }
		(
			{ before(grammarAccess.getEventPatternAccess().getEventTypeCommunicationObjectFQNParserRuleCall_3_0_2_0_1()); }
			ruleFQN
			{ after(grammarAccess.getEventPatternAccess().getEventTypeCommunicationObjectFQNParserRuleCall_3_0_2_0_1()); }
		)
		{ after(grammarAccess.getEventPatternAccess().getEventTypeCommunicationObjectCrossReference_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__ActivationTypeAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventPatternAccess().getActivationTypeCommunicationObjectCrossReference_3_1_2_0()); }
		(
			{ before(grammarAccess.getEventPatternAccess().getActivationTypeCommunicationObjectFQNParserRuleCall_3_1_2_0_1()); }
			ruleFQN
			{ after(grammarAccess.getEventPatternAccess().getActivationTypeCommunicationObjectFQNParserRuleCall_3_1_2_0_1()); }
		)
		{ after(grammarAccess.getEventPatternAccess().getActivationTypeCommunicationObjectCrossReference_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventPattern__EventStateTypeAssignment_3_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventPatternAccess().getEventStateTypeCommunicationObjectCrossReference_3_2_2_0()); }
		(
			{ before(grammarAccess.getEventPatternAccess().getEventStateTypeCommunicationObjectFQNParserRuleCall_3_2_2_0_1()); }
			ruleFQN
			{ after(grammarAccess.getEventPatternAccess().getEventStateTypeCommunicationObjectFQNParserRuleCall_3_2_2_0_1()); }
		)
		{ after(grammarAccess.getEventPatternAccess().getEventStateTypeCommunicationObjectCrossReference_3_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__RequestTypeAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQueryPatternAccess().getRequestTypeCommunicationObjectCrossReference_3_0_2_0()); }
		(
			{ before(grammarAccess.getQueryPatternAccess().getRequestTypeCommunicationObjectFQNParserRuleCall_3_0_2_0_1()); }
			ruleFQN
			{ after(grammarAccess.getQueryPatternAccess().getRequestTypeCommunicationObjectFQNParserRuleCall_3_0_2_0_1()); }
		)
		{ after(grammarAccess.getQueryPatternAccess().getRequestTypeCommunicationObjectCrossReference_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryPattern__AnswerTypeAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQueryPatternAccess().getAnswerTypeCommunicationObjectCrossReference_3_1_2_0()); }
		(
			{ before(grammarAccess.getQueryPatternAccess().getAnswerTypeCommunicationObjectFQNParserRuleCall_3_1_2_0_1()); }
			ruleFQN
			{ after(grammarAccess.getQueryPatternAccess().getAnswerTypeCommunicationObjectFQNParserRuleCall_3_1_2_0_1()); }
		)
		{ after(grammarAccess.getQueryPatternAccess().getAnswerTypeCommunicationObjectCrossReference_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendPattern__DataTypeAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSendPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0()); }
		(
			{ before(grammarAccess.getSendPatternAccess().getDataTypeCommunicationObjectFQNParserRuleCall_5_0_1()); }
			ruleFQN
			{ after(grammarAccess.getSendPatternAccess().getDataTypeCommunicationObjectFQNParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getSendPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceProperty__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServicePropertyAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getServicePropertyAccess().getNameIDTerminalRuleCall_1_0()); }
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
