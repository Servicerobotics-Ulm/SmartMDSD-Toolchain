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
grammar InternalActivityArchitecture;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.system.activityArchitecture.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.system.activityArchitecture.ide.contentassist.antlr.internal;

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
import org.xtext.system.activityArchitecture.services.ActivityArchitectureGrammarAccess;

}
@parser::members {
	private ActivityArchitectureGrammarAccess grammarAccess;

	public void setGrammarAccess(ActivityArchitectureGrammarAccess grammarAccess) {
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

// Entry rule entryRuleActivityArchitectureModel
entryRuleActivityArchitectureModel
:
{ before(grammarAccess.getActivityArchitectureModelRule()); }
	 ruleActivityArchitectureModel
{ after(grammarAccess.getActivityArchitectureModelRule()); } 
	 EOF 
;

// Rule ActivityArchitectureModel
ruleActivityArchitectureModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActivityArchitectureModelAccess().getGroup()); }
		(rule__ActivityArchitectureModel__Group__0)
		{ after(grammarAccess.getActivityArchitectureModelAccess().getGroup()); }
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

// Entry rule entryRuleAbstractActivityArchitectureElement
entryRuleAbstractActivityArchitectureElement
:
{ before(grammarAccess.getAbstractActivityArchitectureElementRule()); }
	 ruleAbstractActivityArchitectureElement
{ after(grammarAccess.getAbstractActivityArchitectureElementRule()); } 
	 EOF 
;

// Rule AbstractActivityArchitectureElement
ruleAbstractActivityArchitectureElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractActivityArchitectureElementAccess().getAlternatives()); }
		(rule__AbstractActivityArchitectureElement__Alternatives)
		{ after(grammarAccess.getAbstractActivityArchitectureElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataFlow
entryRuleDataFlow
:
{ before(grammarAccess.getDataFlowRule()); }
	 ruleDataFlow
{ after(grammarAccess.getDataFlowRule()); } 
	 EOF 
;

// Rule DataFlow
ruleDataFlow 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataFlowAccess().getGroup()); }
		(rule__DataFlow__Group__0)
		{ after(grammarAccess.getDataFlowAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractSourceNode
entryRuleAbstractSourceNode
:
{ before(grammarAccess.getAbstractSourceNodeRule()); }
	 ruleAbstractSourceNode
{ after(grammarAccess.getAbstractSourceNodeRule()); } 
	 EOF 
;

// Rule AbstractSourceNode
ruleAbstractSourceNode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractSourceNodeAccess().getAlternatives()); }
		(rule__AbstractSourceNode__Alternatives)
		{ after(grammarAccess.getAbstractSourceNodeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInputHandlerNode
entryRuleInputHandlerNode
:
{ before(grammarAccess.getInputHandlerNodeRule()); }
	 ruleInputHandlerNode
{ after(grammarAccess.getInputHandlerNodeRule()); } 
	 EOF 
;

// Rule InputHandlerNode
ruleInputHandlerNode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputHandlerNodeAccess().getGroup()); }
		(rule__InputHandlerNode__Group__0)
		{ after(grammarAccess.getInputHandlerNodeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHandlerTriggerInputNode
entryRuleHandlerTriggerInputNode
:
{ before(grammarAccess.getHandlerTriggerInputNodeRule()); }
	 ruleHandlerTriggerInputNode
{ after(grammarAccess.getHandlerTriggerInputNodeRule()); } 
	 EOF 
;

// Rule HandlerTriggerInputNode
ruleHandlerTriggerInputNode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHandlerTriggerInputNodeAccess().getGroup()); }
		(rule__HandlerTriggerInputNode__Group__0)
		{ after(grammarAccess.getHandlerTriggerInputNodeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleActivityNode
entryRuleActivityNode
:
{ before(grammarAccess.getActivityNodeRule()); }
	 ruleActivityNode
{ after(grammarAccess.getActivityNodeRule()); } 
	 EOF 
;

// Rule ActivityNode
ruleActivityNode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActivityNodeAccess().getGroup()); }
		(rule__ActivityNode__Group__0)
		{ after(grammarAccess.getActivityNodeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractInputNode
entryRuleAbstractInputNode
:
{ before(grammarAccess.getAbstractInputNodeRule()); }
	 ruleAbstractInputNode
{ after(grammarAccess.getAbstractInputNodeRule()); } 
	 EOF 
;

// Rule AbstractInputNode
ruleAbstractInputNode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractInputNodeAccess().getAlternatives()); }
		(rule__AbstractInputNode__Alternatives)
		{ after(grammarAccess.getAbstractInputNodeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRegisterInputNode
entryRuleRegisterInputNode
:
{ before(grammarAccess.getRegisterInputNodeRule()); }
	 ruleRegisterInputNode
{ after(grammarAccess.getRegisterInputNodeRule()); } 
	 EOF 
;

// Rule RegisterInputNode
ruleRegisterInputNode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRegisterInputNodeAccess().getGroup()); }
		(rule__RegisterInputNode__Group__0)
		{ after(grammarAccess.getRegisterInputNodeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTriggerInputNode
entryRuleTriggerInputNode
:
{ before(grammarAccess.getTriggerInputNodeRule()); }
	 ruleTriggerInputNode
{ after(grammarAccess.getTriggerInputNodeRule()); } 
	 EOF 
;

// Rule TriggerInputNode
ruleTriggerInputNode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTriggerInputNodeAccess().getGroup()); }
		(rule__TriggerInputNode__Group__0)
		{ after(grammarAccess.getTriggerInputNodeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleActivationSource
entryRuleActivationSource
:
{ before(grammarAccess.getActivationSourceRule()); }
	 ruleActivationSource
{ after(grammarAccess.getActivationSourceRule()); } 
	 EOF 
;

// Rule ActivationSource
ruleActivationSource 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActivationSourceAccess().getAlternatives()); }
		(rule__ActivationSource__Alternatives)
		{ after(grammarAccess.getActivationSourceAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSporadic
entryRuleSporadic
:
{ before(grammarAccess.getSporadicRule()); }
	 ruleSporadic
{ after(grammarAccess.getSporadicRule()); } 
	 EOF 
;

// Rule Sporadic
ruleSporadic 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSporadicAccess().getGroup()); }
		(rule__Sporadic__Group__0)
		{ after(grammarAccess.getSporadicAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataTriggered
entryRuleDataTriggered
:
{ before(grammarAccess.getDataTriggeredRule()); }
	 ruleDataTriggered
{ after(grammarAccess.getDataTriggeredRule()); } 
	 EOF 
;

// Rule DataTriggered
ruleDataTriggered 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataTriggeredAccess().getGroup()); }
		(rule__DataTriggered__Group__0)
		{ after(grammarAccess.getDataTriggeredAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePeriodicTimer
entryRulePeriodicTimer
:
{ before(grammarAccess.getPeriodicTimerRule()); }
	 rulePeriodicTimer
{ after(grammarAccess.getPeriodicTimerRule()); } 
	 EOF 
;

// Rule PeriodicTimer
rulePeriodicTimer 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPeriodicTimerAccess().getGroup()); }
		(rule__PeriodicTimer__Group__0)
		{ after(grammarAccess.getPeriodicTimerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScheduler
entryRuleScheduler
:
{ before(grammarAccess.getSchedulerRule()); }
	 ruleScheduler
{ after(grammarAccess.getSchedulerRule()); } 
	 EOF 
;

// Rule Scheduler
ruleScheduler 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSchedulerAccess().getGroup()); }
		(rule__Scheduler__Group__0)
		{ after(grammarAccess.getSchedulerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCPUCore
entryRuleCPUCore
:
{ before(grammarAccess.getCPUCoreRule()); }
	 ruleCPUCore
{ after(grammarAccess.getCPUCoreRule()); } 
	 EOF 
;

// Rule CPUCore
ruleCPUCore 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCPUCoreAccess().getGroup()); }
		(rule__CPUCore__Group__0)
		{ after(grammarAccess.getCPUCoreAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExecutionTime
entryRuleExecutionTime
:
{ before(grammarAccess.getExecutionTimeRule()); }
	 ruleExecutionTime
{ after(grammarAccess.getExecutionTimeRule()); } 
	 EOF 
;

// Rule ExecutionTime
ruleExecutionTime 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExecutionTimeAccess().getGroup()); }
		(rule__ExecutionTime__Group__0)
		{ after(grammarAccess.getExecutionTimeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTimeValue
entryRuleTimeValue
:
{ before(grammarAccess.getTimeValueRule()); }
	 ruleTimeValue
{ after(grammarAccess.getTimeValueRule()); } 
	 EOF 
;

// Rule TimeValue
ruleTimeValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTimeValueAccess().getGroup()); }
		(rule__TimeValue__Group__0)
		{ after(grammarAccess.getTimeValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule SchedulerType
ruleSchedulerType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSchedulerTypeAccess().getAlternatives()); }
		(rule__SchedulerType__Alternatives)
		{ after(grammarAccess.getSchedulerTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TimeUnit
ruleTimeUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeUnitAccess().getAlternatives()); }
		(rule__TimeUnit__Alternatives)
		{ after(grammarAccess.getTimeUnitAccess().getAlternatives()); }
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

rule__AbstractActivityArchitectureElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractActivityArchitectureElementAccess().getCPUCoreParserRuleCall_0()); }
		ruleCPUCore
		{ after(grammarAccess.getAbstractActivityArchitectureElementAccess().getCPUCoreParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractActivityArchitectureElementAccess().getAbstractSourceNodeParserRuleCall_1()); }
		ruleAbstractSourceNode
		{ after(grammarAccess.getAbstractActivityArchitectureElementAccess().getAbstractSourceNodeParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractActivityArchitectureElementAccess().getDataFlowParserRuleCall_2()); }
		ruleDataFlow
		{ after(grammarAccess.getAbstractActivityArchitectureElementAccess().getDataFlowParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractSourceNode__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractSourceNodeAccess().getActivityNodeParserRuleCall_0()); }
		ruleActivityNode
		{ after(grammarAccess.getAbstractSourceNodeAccess().getActivityNodeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractSourceNodeAccess().getInputHandlerNodeParserRuleCall_1()); }
		ruleInputHandlerNode
		{ after(grammarAccess.getAbstractSourceNodeAccess().getInputHandlerNodeParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractInputNode__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractInputNodeAccess().getRegisterInputNodeParserRuleCall_0()); }
		ruleRegisterInputNode
		{ after(grammarAccess.getAbstractInputNodeAccess().getRegisterInputNodeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractInputNodeAccess().getTriggerInputNodeParserRuleCall_1()); }
		ruleTriggerInputNode
		{ after(grammarAccess.getAbstractInputNodeAccess().getTriggerInputNodeParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivationSource__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivationSourceAccess().getSporadicParserRuleCall_0()); }
		ruleSporadic
		{ after(grammarAccess.getActivationSourceAccess().getSporadicParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getActivationSourceAccess().getDataTriggeredParserRuleCall_1()); }
		ruleDataTriggered
		{ after(grammarAccess.getActivationSourceAccess().getDataTriggeredParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getActivationSourceAccess().getPeriodicTimerParserRuleCall_2()); }
		rulePeriodicTimer
		{ after(grammarAccess.getActivationSourceAccess().getPeriodicTimerParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SchedulerType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSchedulerTypeAccess().getDEFAULTEnumLiteralDeclaration_0()); }
		('DEFAULT')
		{ after(grammarAccess.getSchedulerTypeAccess().getDEFAULTEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getSchedulerTypeAccess().getFIFOEnumLiteralDeclaration_1()); }
		('FIFO')
		{ after(grammarAccess.getSchedulerTypeAccess().getFIFOEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getSchedulerTypeAccess().getRREnumLiteralDeclaration_2()); }
		('RR')
		{ after(grammarAccess.getSchedulerTypeAccess().getRREnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0()); }
		('sec')
		{ after(grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTimeUnitAccess().getMSECEnumLiteralDeclaration_1()); }
		('ms')
		{ after(grammarAccess.getTimeUnitAccess().getMSECEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTimeUnitAccess().getUSECEnumLiteralDeclaration_2()); }
		('us')
		{ after(grammarAccess.getTimeUnitAccess().getUSECEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityArchitectureModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityArchitectureModel__Group__0__Impl
	rule__ActivityArchitectureModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityArchitectureModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityArchitectureModelAccess().getActivityArchitectureModelAction_0()); }
	()
	{ after(grammarAccess.getActivityArchitectureModelAccess().getActivityArchitectureModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityArchitectureModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityArchitectureModel__Group__1__Impl
	rule__ActivityArchitectureModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityArchitectureModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityArchitectureModelAccess().getActivityArchitectureModelKeyword_1()); }
	'ActivityArchitectureModel'
	{ after(grammarAccess.getActivityArchitectureModelAccess().getActivityArchitectureModelKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityArchitectureModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityArchitectureModel__Group__2__Impl
	rule__ActivityArchitectureModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityArchitectureModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityArchitectureModelAccess().getNameAssignment_2()); }
	(rule__ActivityArchitectureModel__NameAssignment_2)
	{ after(grammarAccess.getActivityArchitectureModelAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityArchitectureModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityArchitectureModel__Group__3__Impl
	rule__ActivityArchitectureModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityArchitectureModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityArchitectureModelAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getActivityArchitectureModelAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityArchitectureModel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityArchitectureModel__Group__4__Impl
	rule__ActivityArchitectureModel__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityArchitectureModel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityArchitectureModelAccess().getElementsAssignment_4()); }
	(rule__ActivityArchitectureModel__ElementsAssignment_4)*
	{ after(grammarAccess.getActivityArchitectureModelAccess().getElementsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityArchitectureModel__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityArchitectureModel__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityArchitectureModel__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityArchitectureModelAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getActivityArchitectureModelAccess().getRightCurlyBracketKeyword_5()); }
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


rule__DataFlow__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFlow__Group__0__Impl
	rule__DataFlow__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFlowAccess().getDataFlowKeyword_0()); }
	'DataFlow'
	{ after(grammarAccess.getDataFlowAccess().getDataFlowKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFlow__Group__1__Impl
	rule__DataFlow__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFlowAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getDataFlowAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFlow__Group__2__Impl
	rule__DataFlow__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFlowAccess().getSourceKeyword_2()); }
	'source'
	{ after(grammarAccess.getDataFlowAccess().getSourceKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFlow__Group__3__Impl
	rule__DataFlow__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFlowAccess().getSourceAssignment_3()); }
	(rule__DataFlow__SourceAssignment_3)
	{ after(grammarAccess.getDataFlowAccess().getSourceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFlow__Group__4__Impl
	rule__DataFlow__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFlowAccess().getDestinationKeyword_4()); }
	'destination'
	{ after(grammarAccess.getDataFlowAccess().getDestinationKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFlow__Group__5__Impl
	rule__DataFlow__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFlowAccess().getDestinationAssignment_5()); }
	(rule__DataFlow__DestinationAssignment_5)
	{ after(grammarAccess.getDataFlowAccess().getDestinationAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataFlow__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataFlowAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getDataFlowAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InputHandlerNode__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerNode__Group__0__Impl
	rule__InputHandlerNode__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerNodeAccess().getInputHandlerNodeAction_0()); }
	()
	{ after(grammarAccess.getInputHandlerNodeAccess().getInputHandlerNodeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerNode__Group__1__Impl
	rule__InputHandlerNode__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerNodeAccess().getInputHandlerNodeKeyword_1()); }
	'InputHandlerNode'
	{ after(grammarAccess.getInputHandlerNodeAccess().getInputHandlerNodeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerNode__Group__2__Impl
	rule__InputHandlerNode__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerNodeAccess().getNameAssignment_2()); }
	(rule__InputHandlerNode__NameAssignment_2)
	{ after(grammarAccess.getInputHandlerNodeAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerNode__Group__3__Impl
	rule__InputHandlerNode__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerNodeAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getInputHandlerNodeAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerNode__Group__4__Impl
	rule__InputHandlerNode__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerNodeAccess().getGroup_4()); }
	(rule__InputHandlerNode__Group_4__0)?
	{ after(grammarAccess.getInputHandlerNodeAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerNode__Group__5__Impl
	rule__InputHandlerNode__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerNodeAccess().getGroup_5()); }
	(rule__InputHandlerNode__Group_5__0)?
	{ after(grammarAccess.getInputHandlerNodeAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerNode__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerNodeAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getInputHandlerNodeAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InputHandlerNode__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerNode__Group_4__0__Impl
	rule__InputHandlerNode__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerNodeAccess().getInputKeyword_4_0()); }
	'input'
	{ after(grammarAccess.getInputHandlerNodeAccess().getInputKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerNode__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerNodeAccess().getInputNodeAssignment_4_1()); }
	(rule__InputHandlerNode__InputNodeAssignment_4_1)
	{ after(grammarAccess.getInputHandlerNodeAccess().getInputNodeAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InputHandlerNode__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerNode__Group_5__0__Impl
	rule__InputHandlerNode__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerNodeAccess().getPrescaleKeyword_5_0()); }
	'prescale'
	{ after(grammarAccess.getInputHandlerNodeAccess().getPrescaleKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputHandlerNode__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputHandlerNodeAccess().getPrescaleAssignment_5_1()); }
	(rule__InputHandlerNode__PrescaleAssignment_5_1)
	{ after(grammarAccess.getInputHandlerNodeAccess().getPrescaleAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__HandlerTriggerInputNode__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerTriggerInputNode__Group__0__Impl
	rule__HandlerTriggerInputNode__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerTriggerInputNode__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandlerTriggerInputNodeAccess().getTriggerInputNodeAction_0()); }
	()
	{ after(grammarAccess.getHandlerTriggerInputNodeAccess().getTriggerInputNodeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerTriggerInputNode__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerTriggerInputNode__Group__1__Impl
	rule__HandlerTriggerInputNode__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerTriggerInputNode__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandlerTriggerInputNodeAccess().getTriggerInputNodeKeyword_1()); }
	'TriggerInputNode'
	{ after(grammarAccess.getHandlerTriggerInputNodeAccess().getTriggerInputNodeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerTriggerInputNode__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerTriggerInputNode__Group__2__Impl
	rule__HandlerTriggerInputNode__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerTriggerInputNode__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandlerTriggerInputNodeAccess().getNameAssignment_2()); }
	(rule__HandlerTriggerInputNode__NameAssignment_2)
	{ after(grammarAccess.getHandlerTriggerInputNodeAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerTriggerInputNode__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HandlerTriggerInputNode__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerTriggerInputNode__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHandlerTriggerInputNodeAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getHandlerTriggerInputNodeAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivityNode__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group__0__Impl
	rule__ActivityNode__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getActivityNodeAction_0()); }
	()
	{ after(grammarAccess.getActivityNodeAccess().getActivityNodeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group__1__Impl
	rule__ActivityNode__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getActivityNodeKeyword_1()); }
	'ActivityNode'
	{ after(grammarAccess.getActivityNodeAccess().getActivityNodeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group__2__Impl
	rule__ActivityNode__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getNameAssignment_2()); }
	(rule__ActivityNode__NameAssignment_2)
	{ after(grammarAccess.getActivityNodeAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group__3__Impl
	rule__ActivityNode__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group__4__Impl
	rule__ActivityNode__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getGroup_4()); }
	(rule__ActivityNode__Group_4__0)?
	{ after(grammarAccess.getActivityNodeAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group__5__Impl
	rule__ActivityNode__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5()); }
	(rule__ActivityNode__UnorderedGroup_5)
	{ after(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivityNode__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group_4__0__Impl
	rule__ActivityNode__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getInputsKeyword_4_0()); }
	'inputs'
	{ after(grammarAccess.getActivityNodeAccess().getInputsKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group_4__1__Impl
	rule__ActivityNode__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_4_1()); }
	'{'
	{ after(grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group_4__2__Impl
	rule__ActivityNode__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getInputsAssignment_4_2()); }
	(rule__ActivityNode__InputsAssignment_4_2)*
	{ after(grammarAccess.getActivityNodeAccess().getInputsAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_4_3()); }
	'}'
	{ after(grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivityNode__Group_5_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group_5_0__0__Impl
	rule__ActivityNode__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_5_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getCpuAffinityKeyword_5_0_0()); }
	'cpuAffinity'
	{ after(grammarAccess.getActivityNodeAccess().getCpuAffinityKeyword_5_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_5_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group_5_0__1__Impl
	rule__ActivityNode__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_5_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getAffinityAssignment_5_0_1()); }
	(rule__ActivityNode__AffinityAssignment_5_0_1)
	{ after(grammarAccess.getActivityNodeAccess().getAffinityAssignment_5_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_5_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group_5_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_5_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getSemicolonKeyword_5_0_2()); }
	(';')?
	{ after(grammarAccess.getActivityNodeAccess().getSemicolonKeyword_5_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivityNode__Group_5_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group_5_1__0__Impl
	rule__ActivityNode__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_5_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getActivationSourceKeyword_5_1_0()); }
	'activationSource'
	{ after(grammarAccess.getActivityNodeAccess().getActivationSourceKeyword_5_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_5_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group_5_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_5_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getActivationSourceAssignment_5_1_1()); }
	(rule__ActivityNode__ActivationSourceAssignment_5_1_1)
	{ after(grammarAccess.getActivityNodeAccess().getActivationSourceAssignment_5_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivityNode__Group_5_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group_5_2__0__Impl
	rule__ActivityNode__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_5_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getExecutionTimeKeyword_5_2_0()); }
	'executionTime'
	{ after(grammarAccess.getActivityNodeAccess().getExecutionTimeKeyword_5_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_5_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group_5_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_5_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getExecutionTimeAssignment_5_2_1()); }
	(rule__ActivityNode__ExecutionTimeAssignment_5_2_1)
	{ after(grammarAccess.getActivityNodeAccess().getExecutionTimeAssignment_5_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivityNode__Group_5_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group_5_3__0__Impl
	rule__ActivityNode__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_5_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getSchedulerKeyword_5_3_0()); }
	'scheduler'
	{ after(grammarAccess.getActivityNodeAccess().getSchedulerKeyword_5_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_5_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__Group_5_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__Group_5_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityNodeAccess().getSchedulerAssignment_5_3_1()); }
	(rule__ActivityNode__SchedulerAssignment_5_3_1)
	{ after(grammarAccess.getActivityNodeAccess().getSchedulerAssignment_5_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RegisterInputNode__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegisterInputNode__Group__0__Impl
	rule__RegisterInputNode__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterInputNode__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegisterInputNodeAccess().getRegisterInputNodeAction_0()); }
	()
	{ after(grammarAccess.getRegisterInputNodeAccess().getRegisterInputNodeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterInputNode__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegisterInputNode__Group__1__Impl
	rule__RegisterInputNode__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterInputNode__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegisterInputNodeAccess().getRegisterInputNodeKeyword_1()); }
	'RegisterInputNode'
	{ after(grammarAccess.getRegisterInputNodeAccess().getRegisterInputNodeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterInputNode__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegisterInputNode__Group__2__Impl
	rule__RegisterInputNode__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterInputNode__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegisterInputNodeAccess().getNameAssignment_2()); }
	(rule__RegisterInputNode__NameAssignment_2)
	{ after(grammarAccess.getRegisterInputNodeAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterInputNode__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegisterInputNode__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterInputNode__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegisterInputNodeAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getRegisterInputNodeAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TriggerInputNode__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriggerInputNode__Group__0__Impl
	rule__TriggerInputNode__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInputNode__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriggerInputNodeAccess().getTriggerInputNodeAction_0()); }
	()
	{ after(grammarAccess.getTriggerInputNodeAccess().getTriggerInputNodeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInputNode__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriggerInputNode__Group__1__Impl
	rule__TriggerInputNode__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInputNode__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriggerInputNodeAccess().getTriggerInputNodeKeyword_1()); }
	'TriggerInputNode'
	{ after(grammarAccess.getTriggerInputNodeAccess().getTriggerInputNodeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInputNode__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriggerInputNode__Group__2__Impl
	rule__TriggerInputNode__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInputNode__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriggerInputNodeAccess().getNameAssignment_2()); }
	(rule__TriggerInputNode__NameAssignment_2)
	{ after(grammarAccess.getTriggerInputNodeAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInputNode__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TriggerInputNode__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInputNode__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTriggerInputNodeAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getTriggerInputNodeAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Sporadic__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__Group__0__Impl
	rule__Sporadic__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSporadicAccess().getSporadicAction_0()); }
	()
	{ after(grammarAccess.getSporadicAccess().getSporadicAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__Group__1__Impl
	rule__Sporadic__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSporadicAccess().getSporadicKeyword_1()); }
	'Sporadic'
	{ after(grammarAccess.getSporadicAccess().getSporadicKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__Group__2__Impl
	rule__Sporadic__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSporadicAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getSporadicAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__Group__3__Impl
	rule__Sporadic__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSporadicAccess().getUnorderedGroup_3()); }
	(rule__Sporadic__UnorderedGroup_3)
	{ after(grammarAccess.getSporadicAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSporadicAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getSporadicAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Sporadic__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__Group_3_0__0__Impl
	rule__Sporadic__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSporadicAccess().getMinActFreqKeyword_3_0_0()); }
	'minActFreq'
	{ after(grammarAccess.getSporadicAccess().getMinActFreqKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__Group_3_0__1__Impl
	rule__Sporadic__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSporadicAccess().getMinActFreqAssignment_3_0_1()); }
	(rule__Sporadic__MinActFreqAssignment_3_0_1)
	{ after(grammarAccess.getSporadicAccess().getMinActFreqAssignment_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__Group_3_0__2__Impl
	rule__Sporadic__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSporadicAccess().getHzKeyword_3_0_2()); }
	'Hz'
	{ after(grammarAccess.getSporadicAccess().getHzKeyword_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSporadicAccess().getSemicolonKeyword_3_0_3()); }
	(';')?
	{ after(grammarAccess.getSporadicAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Sporadic__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__Group_3_1__0__Impl
	rule__Sporadic__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSporadicAccess().getMaxActFreqKeyword_3_1_0()); }
	'maxActFreq'
	{ after(grammarAccess.getSporadicAccess().getMaxActFreqKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__Group_3_1__1__Impl
	rule__Sporadic__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSporadicAccess().getMaxActFreqAssignment_3_1_1()); }
	(rule__Sporadic__MaxActFreqAssignment_3_1_1)
	{ after(grammarAccess.getSporadicAccess().getMaxActFreqAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__Group_3_1__2__Impl
	rule__Sporadic__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSporadicAccess().getHzKeyword_3_1_2()); }
	'Hz'
	{ after(grammarAccess.getSporadicAccess().getHzKeyword_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__Group_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSporadicAccess().getSemicolonKeyword_3_1_3()); }
	(';')?
	{ after(grammarAccess.getSporadicAccess().getSemicolonKeyword_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataTriggered__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataTriggered__Group__0__Impl
	rule__DataTriggered__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTriggeredAccess().getDataTriggeredKeyword_0()); }
	'DataTriggered'
	{ after(grammarAccess.getDataTriggeredAccess().getDataTriggeredKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataTriggered__Group__1__Impl
	rule__DataTriggered__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTriggeredAccess().getTriggerRefAssignment_1()); }
	(rule__DataTriggered__TriggerRefAssignment_1)
	{ after(grammarAccess.getDataTriggeredAccess().getTriggerRefAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataTriggered__Group__2__Impl
	rule__DataTriggered__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTriggeredAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getDataTriggeredAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataTriggered__Group__3__Impl
	rule__DataTriggered__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTriggeredAccess().getPrescaleKeyword_3()); }
	'prescale'
	{ after(grammarAccess.getDataTriggeredAccess().getPrescaleKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataTriggered__Group__4__Impl
	rule__DataTriggered__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTriggeredAccess().getPrescaleAssignment_4()); }
	(rule__DataTriggered__PrescaleAssignment_4)
	{ after(grammarAccess.getDataTriggeredAccess().getPrescaleAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataTriggered__Group__5__Impl
	rule__DataTriggered__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTriggeredAccess().getSemicolonKeyword_5()); }
	(';')?
	{ after(grammarAccess.getDataTriggeredAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataTriggered__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTriggeredAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getDataTriggeredAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PeriodicTimer__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PeriodicTimer__Group__0__Impl
	rule__PeriodicTimer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PeriodicTimer__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPeriodicTimerAccess().getPeriodicTimerKeyword_0()); }
	'PeriodicTimer'
	{ after(grammarAccess.getPeriodicTimerAccess().getPeriodicTimerKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PeriodicTimer__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PeriodicTimer__Group__1__Impl
	rule__PeriodicTimer__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PeriodicTimer__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPeriodicTimerAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getPeriodicTimerAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PeriodicTimer__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PeriodicTimer__Group__2__Impl
	rule__PeriodicTimer__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PeriodicTimer__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqKeyword_2()); }
	'periodicActFreq'
	{ after(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PeriodicTimer__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PeriodicTimer__Group__3__Impl
	rule__PeriodicTimer__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PeriodicTimer__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqAssignment_3()); }
	(rule__PeriodicTimer__PeriodicActFreqAssignment_3)
	{ after(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PeriodicTimer__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PeriodicTimer__Group__4__Impl
	rule__PeriodicTimer__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PeriodicTimer__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPeriodicTimerAccess().getHzKeyword_4()); }
	'Hz'
	{ after(grammarAccess.getPeriodicTimerAccess().getHzKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PeriodicTimer__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PeriodicTimer__Group__5__Impl
	rule__PeriodicTimer__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__PeriodicTimer__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPeriodicTimerAccess().getSemicolonKeyword_5()); }
	(';')?
	{ after(grammarAccess.getPeriodicTimerAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PeriodicTimer__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PeriodicTimer__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PeriodicTimer__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPeriodicTimerAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getPeriodicTimerAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scheduler__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scheduler__Group__0__Impl
	rule__Scheduler__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchedulerAccess().getSchedulerAction_0()); }
	()
	{ after(grammarAccess.getSchedulerAccess().getSchedulerAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scheduler__Group__1__Impl
	rule__Scheduler__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchedulerAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getSchedulerAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scheduler__Group__2__Impl
	rule__Scheduler__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchedulerAccess().getUnorderedGroup_2()); }
	(rule__Scheduler__UnorderedGroup_2)
	{ after(grammarAccess.getSchedulerAccess().getUnorderedGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scheduler__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchedulerAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getSchedulerAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scheduler__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scheduler__Group_2_0__0__Impl
	rule__Scheduler__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchedulerAccess().getTypeKeyword_2_0_0()); }
	'type'
	{ after(grammarAccess.getSchedulerAccess().getTypeKeyword_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scheduler__Group_2_0__1__Impl
	rule__Scheduler__Group_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchedulerAccess().getTypeAssignment_2_0_1()); }
	(rule__Scheduler__TypeAssignment_2_0_1)
	{ after(grammarAccess.getSchedulerAccess().getTypeAssignment_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scheduler__Group_2_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchedulerAccess().getSemicolonKeyword_2_0_2()); }
	(';')?
	{ after(grammarAccess.getSchedulerAccess().getSemicolonKeyword_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scheduler__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scheduler__Group_2_1__0__Impl
	rule__Scheduler__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchedulerAccess().getPriorityKeyword_2_1_0()); }
	'priority'
	{ after(grammarAccess.getSchedulerAccess().getPriorityKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scheduler__Group_2_1__1__Impl
	rule__Scheduler__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchedulerAccess().getPriorityAssignment_2_1_1()); }
	(rule__Scheduler__PriorityAssignment_2_1_1)
	{ after(grammarAccess.getSchedulerAccess().getPriorityAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scheduler__Group_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSchedulerAccess().getSemicolonKeyword_2_1_2()); }
	(';')?
	{ after(grammarAccess.getSchedulerAccess().getSemicolonKeyword_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CPUCore__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPUCore__Group__0__Impl
	rule__CPUCore__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUCoreAccess().getCPUCoreKeyword_0()); }
	'CPUCore'
	{ after(grammarAccess.getCPUCoreAccess().getCPUCoreKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPUCore__Group__1__Impl
	rule__CPUCore__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUCoreAccess().getNameAssignment_1()); }
	(rule__CPUCore__NameAssignment_1)
	{ after(grammarAccess.getCPUCoreAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPUCore__Group__2__Impl
	rule__CPUCore__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUCoreAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getCPUCoreAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPUCore__Group__3__Impl
	rule__CPUCore__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUCoreAccess().getCoreNumberKeyword_3()); }
	'coreNumber'
	{ after(grammarAccess.getCPUCoreAccess().getCoreNumberKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPUCore__Group__4__Impl
	rule__CPUCore__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUCoreAccess().getCoreNumberAssignment_4()); }
	(rule__CPUCore__CoreNumberAssignment_4)
	{ after(grammarAccess.getCPUCoreAccess().getCoreNumberAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPUCore__Group__5__Impl
	rule__CPUCore__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUCoreAccess().getSemicolonKeyword_5()); }
	(';')?
	{ after(grammarAccess.getCPUCoreAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPUCore__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUCoreAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getCPUCoreAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExecutionTime__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExecutionTime__Group__0__Impl
	rule__ExecutionTime__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExecutionTimeAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getExecutionTimeAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExecutionTime__Group__1__Impl
	rule__ExecutionTime__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1()); }
	(rule__ExecutionTime__UnorderedGroup_1)
	{ after(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExecutionTime__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExecutionTimeAccess().getRightCurlyBracketKeyword_2()); }
	'}'
	{ after(grammarAccess.getExecutionTimeAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExecutionTime__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExecutionTime__Group_1_0__0__Impl
	rule__ExecutionTime__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExecutionTimeAccess().getMinTimeKeyword_1_0_0()); }
	'minTime'
	{ after(grammarAccess.getExecutionTimeAccess().getMinTimeKeyword_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExecutionTime__Group_1_0__1__Impl
	rule__ExecutionTime__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExecutionTimeAccess().getMinTimeAssignment_1_0_1()); }
	(rule__ExecutionTime__MinTimeAssignment_1_0_1)
	{ after(grammarAccess.getExecutionTimeAccess().getMinTimeAssignment_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExecutionTime__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExecutionTimeAccess().getSemicolonKeyword_1_0_2()); }
	(';')?
	{ after(grammarAccess.getExecutionTimeAccess().getSemicolonKeyword_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExecutionTime__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExecutionTime__Group_1_1__0__Impl
	rule__ExecutionTime__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExecutionTimeAccess().getMaxTimeKeyword_1_1_0()); }
	'maxTime'
	{ after(grammarAccess.getExecutionTimeAccess().getMaxTimeKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExecutionTime__Group_1_1__1__Impl
	rule__ExecutionTime__Group_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExecutionTimeAccess().getMaxTimeAssignment_1_1_1()); }
	(rule__ExecutionTime__MaxTimeAssignment_1_1_1)
	{ after(grammarAccess.getExecutionTimeAccess().getMaxTimeAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group_1_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExecutionTime__Group_1_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__Group_1_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExecutionTimeAccess().getSemicolonKeyword_1_1_2()); }
	(';')?
	{ after(grammarAccess.getExecutionTimeAccess().getSemicolonKeyword_1_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimeValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeValue__Group__0__Impl
	rule__TimeValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeValueAccess().getValueAssignment_0()); }
	(rule__TimeValue__ValueAssignment_0)
	{ after(grammarAccess.getTimeValueAccess().getValueAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeValue__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeValueAccess().getUnitAssignment_1()); }
	(rule__TimeValue__UnitAssignment_1)
	{ after(grammarAccess.getTimeValueAccess().getUnitAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivityNode__UnorderedGroup_5
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
	}
:
	rule__ActivityNode__UnorderedGroup_5__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}

rule__ActivityNode__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getActivityNodeAccess().getGroup_5_0()); }
					(rule__ActivityNode__Group_5_0__0)
					{ after(grammarAccess.getActivityNodeAccess().getGroup_5_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getActivityNodeAccess().getGroup_5_1()); }
					(rule__ActivityNode__Group_5_1__0)
					{ after(grammarAccess.getActivityNodeAccess().getGroup_5_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getActivityNodeAccess().getGroup_5_2()); }
					(rule__ActivityNode__Group_5_2__0)
					{ after(grammarAccess.getActivityNodeAccess().getGroup_5_2()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getActivityNodeAccess().getGroup_5_3()); }
					(rule__ActivityNode__Group_5_3__0)
					{ after(grammarAccess.getActivityNodeAccess().getGroup_5_3()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}

rule__ActivityNode__UnorderedGroup_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__UnorderedGroup_5__Impl
	rule__ActivityNode__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__UnorderedGroup_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__UnorderedGroup_5__Impl
	rule__ActivityNode__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__UnorderedGroup_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__UnorderedGroup_5__Impl
	rule__ActivityNode__UnorderedGroup_5__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__UnorderedGroup_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityNode__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__Sporadic__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getSporadicAccess().getUnorderedGroup_3());
	}
:
	rule__Sporadic__UnorderedGroup_3__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getSporadicAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__Sporadic__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getSporadicAccess().getGroup_3_0()); }
					(rule__Sporadic__Group_3_0__0)
					{ after(grammarAccess.getSporadicAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getSporadicAccess().getGroup_3_1()); }
					(rule__Sporadic__Group_3_1__0)
					{ after(grammarAccess.getSporadicAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSporadicAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__Sporadic__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__UnorderedGroup_3__Impl
	rule__Sporadic__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sporadic__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__Scheduler__UnorderedGroup_2
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getSchedulerAccess().getUnorderedGroup_2());
	}
:
	rule__Scheduler__UnorderedGroup_2__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getSchedulerAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__Scheduler__UnorderedGroup_2__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getSchedulerAccess().getGroup_2_0()); }
					(rule__Scheduler__Group_2_0__0)
					{ after(grammarAccess.getSchedulerAccess().getGroup_2_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getSchedulerAccess().getGroup_2_1()); }
					(rule__Scheduler__Group_2_1__0)
					{ after(grammarAccess.getSchedulerAccess().getGroup_2_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchedulerAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__Scheduler__UnorderedGroup_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scheduler__UnorderedGroup_2__Impl
	rule__Scheduler__UnorderedGroup_2__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__UnorderedGroup_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scheduler__UnorderedGroup_2__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__ExecutionTime__UnorderedGroup_1
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1());
	}
:
	rule__ExecutionTime__UnorderedGroup_1__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1());
	restoreStackSize(stackSize);
}

rule__ExecutionTime__UnorderedGroup_1__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getExecutionTimeAccess().getGroup_1_0()); }
					(rule__ExecutionTime__Group_1_0__0)
					{ after(grammarAccess.getExecutionTimeAccess().getGroup_1_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getExecutionTimeAccess().getGroup_1_1()); }
					(rule__ExecutionTime__Group_1_1__0)
					{ after(grammarAccess.getExecutionTimeAccess().getGroup_1_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1());
	restoreStackSize(stackSize);
}

rule__ExecutionTime__UnorderedGroup_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExecutionTime__UnorderedGroup_1__Impl
	rule__ExecutionTime__UnorderedGroup_1__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__UnorderedGroup_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExecutionTime__UnorderedGroup_1__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivityArchitectureModel__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityArchitectureModelAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getActivityArchitectureModelAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityArchitectureModel__ElementsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityArchitectureModelAccess().getElementsAbstractActivityArchitectureElementParserRuleCall_4_0()); }
		ruleAbstractActivityArchitectureElement
		{ after(grammarAccess.getActivityArchitectureModelAccess().getElementsAbstractActivityArchitectureElementParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__SourceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataFlowAccess().getSourceAbstractSourceNodeCrossReference_3_0()); }
		(
			{ before(grammarAccess.getDataFlowAccess().getSourceAbstractSourceNodeFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getDataFlowAccess().getSourceAbstractSourceNodeFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getDataFlowAccess().getSourceAbstractSourceNodeCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataFlow__DestinationAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataFlowAccess().getDestinationAbstractInputNodeCrossReference_5_0()); }
		(
			{ before(grammarAccess.getDataFlowAccess().getDestinationAbstractInputNodeFQNParserRuleCall_5_0_1()); }
			ruleFQN
			{ after(grammarAccess.getDataFlowAccess().getDestinationAbstractInputNodeFQNParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getDataFlowAccess().getDestinationAbstractInputNodeCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputHandlerNodeAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getInputHandlerNodeAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__InputNodeAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputHandlerNodeAccess().getInputNodeHandlerTriggerInputNodeParserRuleCall_4_1_0()); }
		ruleHandlerTriggerInputNode
		{ after(grammarAccess.getInputHandlerNodeAccess().getInputNodeHandlerTriggerInputNodeParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputHandlerNode__PrescaleAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputHandlerNodeAccess().getPrescaleEIntParserRuleCall_5_1_0()); }
		ruleEInt
		{ after(grammarAccess.getInputHandlerNodeAccess().getPrescaleEIntParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HandlerTriggerInputNode__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHandlerTriggerInputNodeAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getHandlerTriggerInputNodeAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityNodeAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getActivityNodeAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__InputsAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityNodeAccess().getInputsAbstractInputNodeParserRuleCall_4_2_0()); }
		ruleAbstractInputNode
		{ after(grammarAccess.getActivityNodeAccess().getInputsAbstractInputNodeParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__AffinityAssignment_5_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityNodeAccess().getAffinityCPUCoreCrossReference_5_0_1_0()); }
		(
			{ before(grammarAccess.getActivityNodeAccess().getAffinityCPUCoreFQNParserRuleCall_5_0_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getActivityNodeAccess().getAffinityCPUCoreFQNParserRuleCall_5_0_1_0_1()); }
		)
		{ after(grammarAccess.getActivityNodeAccess().getAffinityCPUCoreCrossReference_5_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__ActivationSourceAssignment_5_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityNodeAccess().getActivationSourceActivationSourceParserRuleCall_5_1_1_0()); }
		ruleActivationSource
		{ after(grammarAccess.getActivityNodeAccess().getActivationSourceActivationSourceParserRuleCall_5_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__ExecutionTimeAssignment_5_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityNodeAccess().getExecutionTimeExecutionTimeParserRuleCall_5_2_1_0()); }
		ruleExecutionTime
		{ after(grammarAccess.getActivityNodeAccess().getExecutionTimeExecutionTimeParserRuleCall_5_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityNode__SchedulerAssignment_5_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityNodeAccess().getSchedulerSchedulerParserRuleCall_5_3_1_0()); }
		ruleScheduler
		{ after(grammarAccess.getActivityNodeAccess().getSchedulerSchedulerParserRuleCall_5_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterInputNode__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegisterInputNodeAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getRegisterInputNodeAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TriggerInputNode__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTriggerInputNodeAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getTriggerInputNodeAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__MinActFreqAssignment_3_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSporadicAccess().getMinActFreqEDoubleParserRuleCall_3_0_1_0()); }
		ruleEDouble
		{ after(grammarAccess.getSporadicAccess().getMinActFreqEDoubleParserRuleCall_3_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sporadic__MaxActFreqAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSporadicAccess().getMaxActFreqEDoubleParserRuleCall_3_1_1_0()); }
		ruleEDouble
		{ after(grammarAccess.getSporadicAccess().getMaxActFreqEDoubleParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__TriggerRefAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTriggeredAccess().getTriggerRefTriggerInputNodeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getDataTriggeredAccess().getTriggerRefTriggerInputNodeFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getDataTriggeredAccess().getTriggerRefTriggerInputNodeFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getDataTriggeredAccess().getTriggerRefTriggerInputNodeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTriggered__PrescaleAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTriggeredAccess().getPrescaleEIntParserRuleCall_4_0()); }
		ruleEInt
		{ after(grammarAccess.getDataTriggeredAccess().getPrescaleEIntParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PeriodicTimer__PeriodicActFreqAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_3_0()); }
		ruleEDouble
		{ after(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__TypeAssignment_2_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSchedulerAccess().getTypeSchedulerTypeEnumRuleCall_2_0_1_0()); }
		ruleSchedulerType
		{ after(grammarAccess.getSchedulerAccess().getTypeSchedulerTypeEnumRuleCall_2_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scheduler__PriorityAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSchedulerAccess().getPriorityEIntParserRuleCall_2_1_1_0()); }
		ruleEInt
		{ after(grammarAccess.getSchedulerAccess().getPriorityEIntParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCPUCoreAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCPUCoreAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPUCore__CoreNumberAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCPUCoreAccess().getCoreNumberEIntParserRuleCall_4_0()); }
		ruleEInt
		{ after(grammarAccess.getCPUCoreAccess().getCoreNumberEIntParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__MinTimeAssignment_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExecutionTimeAccess().getMinTimeTimeValueParserRuleCall_1_0_1_0()); }
		ruleTimeValue
		{ after(grammarAccess.getExecutionTimeAccess().getMinTimeTimeValueParserRuleCall_1_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExecutionTime__MaxTimeAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExecutionTimeAccess().getMaxTimeTimeValueParserRuleCall_1_1_1_0()); }
		ruleTimeValue
		{ after(grammarAccess.getExecutionTimeAccess().getMaxTimeTimeValueParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeValue__ValueAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeValueAccess().getValueEIntParserRuleCall_0_0()); }
		ruleEInt
		{ after(grammarAccess.getTimeValueAccess().getValueEIntParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeValue__UnitAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeValueAccess().getUnitTimeUnitEnumRuleCall_1_0()); }
		ruleTimeUnit
		{ after(grammarAccess.getTimeValueAccess().getUnitTimeUnitEnumRuleCall_1_0()); }
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
