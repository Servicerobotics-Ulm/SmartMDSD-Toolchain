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
grammar InternalTargetPlatform;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.system.targetPlatform.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.system.targetPlatform.ide.contentassist.antlr.internal;

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
import org.xtext.system.targetPlatform.services.TargetPlatformGrammarAccess;

}
@parser::members {
	private TargetPlatformGrammarAccess grammarAccess;

	public void setGrammarAccess(TargetPlatformGrammarAccess grammarAccess) {
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

// Entry rule entryRuleTargetPlatformModel
entryRuleTargetPlatformModel
:
{ before(grammarAccess.getTargetPlatformModelRule()); }
	 ruleTargetPlatformModel
{ after(grammarAccess.getTargetPlatformModelRule()); } 
	 EOF 
;

// Rule TargetPlatformModel
ruleTargetPlatformModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTargetPlatformModelAccess().getGroup()); }
		(rule__TargetPlatformModel__Group__0)
		{ after(grammarAccess.getTargetPlatformModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractTPElement
entryRuleAbstractTPElement
:
{ before(grammarAccess.getAbstractTPElementRule()); }
	 ruleAbstractTPElement
{ after(grammarAccess.getAbstractTPElementRule()); } 
	 EOF 
;

// Rule AbstractTPElement
ruleAbstractTPElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractTPElementAccess().getAlternatives()); }
		(rule__AbstractTPElement__Alternatives)
		{ after(grammarAccess.getAbstractTPElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNetworkConnection
entryRuleNetworkConnection
:
{ before(grammarAccess.getNetworkConnectionRule()); }
	 ruleNetworkConnection
{ after(grammarAccess.getNetworkConnectionRule()); } 
	 EOF 
;

// Rule NetworkConnection
ruleNetworkConnection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNetworkConnectionAccess().getGroup()); }
		(rule__NetworkConnection__Group__0)
		{ after(grammarAccess.getNetworkConnectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTargetPlatformDefinition
entryRuleTargetPlatformDefinition
:
{ before(grammarAccess.getTargetPlatformDefinitionRule()); }
	 ruleTargetPlatformDefinition
{ after(grammarAccess.getTargetPlatformDefinitionRule()); } 
	 EOF 
;

// Rule TargetPlatformDefinition
ruleTargetPlatformDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTargetPlatformDefinitionAccess().getGroup()); }
		(rule__TargetPlatformDefinition__Group__0)
		{ after(grammarAccess.getTargetPlatformDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOperatingSystem
entryRuleOperatingSystem
:
{ before(grammarAccess.getOperatingSystemRule()); }
	 ruleOperatingSystem
{ after(grammarAccess.getOperatingSystemRule()); } 
	 EOF 
;

// Rule OperatingSystem
ruleOperatingSystem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperatingSystemAccess().getAlternatives()); }
		(rule__OperatingSystem__Alternatives)
		{ after(grammarAccess.getOperatingSystemAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWindows
entryRuleWindows
:
{ before(grammarAccess.getWindowsRule()); }
	 ruleWindows
{ after(grammarAccess.getWindowsRule()); } 
	 EOF 
;

// Rule Windows
ruleWindows 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWindowsAccess().getGroup()); }
		(rule__Windows__Group__0)
		{ after(grammarAccess.getWindowsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLinux
entryRuleLinux
:
{ before(grammarAccess.getLinuxRule()); }
	 ruleLinux
{ after(grammarAccess.getLinuxRule()); } 
	 EOF 
;

// Rule Linux
ruleLinux 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLinuxAccess().getGroup()); }
		(rule__Linux__Group__0)
		{ after(grammarAccess.getLinuxAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMacOS
entryRuleMacOS
:
{ before(grammarAccess.getMacOSRule()); }
	 ruleMacOS
{ after(grammarAccess.getMacOSRule()); } 
	 EOF 
;

// Rule MacOS
ruleMacOS 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMacOSAccess().getGroup()); }
		(rule__MacOS__Group__0)
		{ after(grammarAccess.getMacOSAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractTPSubNode
entryRuleAbstractTPSubNode
:
{ before(grammarAccess.getAbstractTPSubNodeRule()); }
	 ruleAbstractTPSubNode
{ after(grammarAccess.getAbstractTPSubNodeRule()); } 
	 EOF 
;

// Rule AbstractTPSubNode
ruleAbstractTPSubNode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractTPSubNodeAccess().getAlternatives()); }
		(rule__AbstractTPSubNode__Alternatives)
		{ after(grammarAccess.getAbstractTPSubNodeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNetworkInterface
entryRuleNetworkInterface
:
{ before(grammarAccess.getNetworkInterfaceRule()); }
	 ruleNetworkInterface
{ after(grammarAccess.getNetworkInterfaceRule()); } 
	 EOF 
;

// Rule NetworkInterface
ruleNetworkInterface 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNetworkInterfaceAccess().getGroup()); }
		(rule__NetworkInterface__Group__0)
		{ after(grammarAccess.getNetworkInterfaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCPU
entryRuleCPU
:
{ before(grammarAccess.getCPURule()); }
	 ruleCPU
{ after(grammarAccess.getCPURule()); } 
	 EOF 
;

// Rule CPU
ruleCPU 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCPUAccess().getGroup()); }
		(rule__CPU__Group__0)
		{ after(grammarAccess.getCPUAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLoginAccount
entryRuleLoginAccount
:
{ before(grammarAccess.getLoginAccountRule()); }
	 ruleLoginAccount
{ after(grammarAccess.getLoginAccountRule()); } 
	 EOF 
;

// Rule LoginAccount
ruleLoginAccount 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLoginAccountAccess().getGroup()); }
		(rule__LoginAccount__Group__0)
		{ after(grammarAccess.getLoginAccountAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTargetMiddleware
entryRuleTargetMiddleware
:
{ before(grammarAccess.getTargetMiddlewareRule()); }
	 ruleTargetMiddleware
{ after(grammarAccess.getTargetMiddlewareRule()); } 
	 EOF 
;

// Rule TargetMiddleware
ruleTargetMiddleware 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTargetMiddlewareAccess().getGroup()); }
		(rule__TargetMiddleware__Group__0)
		{ after(grammarAccess.getTargetMiddlewareAccess().getGroup()); }
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

rule__AbstractTPElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractTPElementAccess().getTargetPlatformDefinitionParserRuleCall_0()); }
		ruleTargetPlatformDefinition
		{ after(grammarAccess.getAbstractTPElementAccess().getTargetPlatformDefinitionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractTPElementAccess().getNetworkConnectionParserRuleCall_1()); }
		ruleNetworkConnection
		{ after(grammarAccess.getAbstractTPElementAccess().getNetworkConnectionParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OperatingSystem__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperatingSystemAccess().getWindowsParserRuleCall_0()); }
		ruleWindows
		{ after(grammarAccess.getOperatingSystemAccess().getWindowsParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getOperatingSystemAccess().getLinuxParserRuleCall_1()); }
		ruleLinux
		{ after(grammarAccess.getOperatingSystemAccess().getLinuxParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getOperatingSystemAccess().getMacOSParserRuleCall_2()); }
		ruleMacOS
		{ after(grammarAccess.getOperatingSystemAccess().getMacOSParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractTPSubNode__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractTPSubNodeAccess().getNetworkInterfaceParserRuleCall_0()); }
		ruleNetworkInterface
		{ after(grammarAccess.getAbstractTPSubNodeAccess().getNetworkInterfaceParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractTPSubNodeAccess().getCPUParserRuleCall_1()); }
		ruleCPU
		{ after(grammarAccess.getAbstractTPSubNodeAccess().getCPUParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractTPSubNodeAccess().getLoginAccountParserRuleCall_2()); }
		ruleLoginAccount
		{ after(grammarAccess.getAbstractTPSubNodeAccess().getLoginAccountParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractTPSubNodeAccess().getTargetMiddlewareParserRuleCall_3()); }
		ruleTargetMiddleware
		{ after(grammarAccess.getAbstractTPSubNodeAccess().getTargetMiddlewareParserRuleCall_3()); }
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

rule__TargetPlatformModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformModel__Group__0__Impl
	rule__TargetPlatformModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformModelAccess().getTargetPlatformModelKeyword_0()); }
	'TargetPlatformModel'
	{ after(grammarAccess.getTargetPlatformModelAccess().getTargetPlatformModelKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformModel__Group__1__Impl
	rule__TargetPlatformModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformModelAccess().getNameAssignment_1()); }
	(rule__TargetPlatformModel__NameAssignment_1)
	{ after(grammarAccess.getTargetPlatformModelAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformModel__Group__2__Impl
	rule__TargetPlatformModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformModelAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTargetPlatformModelAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformModel__Group__3__Impl
	rule__TargetPlatformModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformModelAccess().getElementsAssignment_3()); }
	(rule__TargetPlatformModel__ElementsAssignment_3)*
	{ after(grammarAccess.getTargetPlatformModelAccess().getElementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformModel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformModel__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformModel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformModelAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTargetPlatformModelAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NetworkConnection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkConnection__Group__0__Impl
	rule__NetworkConnection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkConnectionAccess().getNetworkConnectionKeyword_0()); }
	'NetworkConnection'
	{ after(grammarAccess.getNetworkConnectionAccess().getNetworkConnectionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkConnection__Group__1__Impl
	rule__NetworkConnection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkConnectionAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getNetworkConnectionAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkConnection__Group__2__Impl
	rule__NetworkConnection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkConnectionAccess().getEndpoint1Assignment_2()); }
	(rule__NetworkConnection__Endpoint1Assignment_2)
	{ after(grammarAccess.getNetworkConnectionAccess().getEndpoint1Assignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkConnection__Group__3__Impl
	rule__NetworkConnection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3()); }
	'<->'
	{ after(grammarAccess.getNetworkConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkConnection__Group__4__Impl
	rule__NetworkConnection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkConnectionAccess().getEndpoint2Assignment_4()); }
	(rule__NetworkConnection__Endpoint2Assignment_4)
	{ after(grammarAccess.getNetworkConnectionAccess().getEndpoint2Assignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkConnection__Group__5__Impl
	rule__NetworkConnection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkConnectionAccess().getGroup_5()); }
	(rule__NetworkConnection__Group_5__0)?
	{ after(grammarAccess.getNetworkConnectionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkConnection__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkConnectionAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getNetworkConnectionAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NetworkConnection__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkConnection__Group_5__0__Impl
	rule__NetworkConnection__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkConnectionAccess().getKindKeyword_5_0()); }
	'kind'
	{ after(grammarAccess.getNetworkConnectionAccess().getKindKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkConnection__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkConnectionAccess().getKindAssignment_5_1()); }
	(rule__NetworkConnection__KindAssignment_5_1)
	{ after(grammarAccess.getNetworkConnectionAccess().getKindAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TargetPlatformDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformDefinition__Group__0__Impl
	rule__TargetPlatformDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformDefinitionAccess().getTargetPlatformDefinitionKeyword_0()); }
	'TargetPlatformDefinition'
	{ after(grammarAccess.getTargetPlatformDefinitionAccess().getTargetPlatformDefinitionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformDefinition__Group__1__Impl
	rule__TargetPlatformDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformDefinitionAccess().getNameAssignment_1()); }
	(rule__TargetPlatformDefinition__NameAssignment_1)
	{ after(grammarAccess.getTargetPlatformDefinitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformDefinition__Group__2__Impl
	rule__TargetPlatformDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTargetPlatformDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformDefinition__Group__3__Impl
	rule__TargetPlatformDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformDefinitionAccess().getOsAssignment_3()); }
	(rule__TargetPlatformDefinition__OsAssignment_3)?
	{ after(grammarAccess.getTargetPlatformDefinitionAccess().getOsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformDefinition__Group__4__Impl
	rule__TargetPlatformDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformDefinitionAccess().getElementsAssignment_4()); }
	(rule__TargetPlatformDefinition__ElementsAssignment_4)*
	{ after(grammarAccess.getTargetPlatformDefinitionAccess().getElementsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformDefinition__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformDefinitionAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getTargetPlatformDefinitionAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Windows__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Windows__Group__0__Impl
	rule__Windows__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Windows__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWindowsAccess().getWindowsAction_0()); }
	()
	{ after(grammarAccess.getWindowsAccess().getWindowsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Windows__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Windows__Group__1__Impl
	rule__Windows__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Windows__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWindowsAccess().getWindowsKeyword_1()); }
	'Windows'
	{ after(grammarAccess.getWindowsAccess().getWindowsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Windows__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Windows__Group__2__Impl
	rule__Windows__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Windows__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWindowsAccess().getKindAssignment_2()); }
	(rule__Windows__KindAssignment_2)?
	{ after(grammarAccess.getWindowsAccess().getKindAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Windows__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Windows__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Windows__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWindowsAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getWindowsAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Linux__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Linux__Group__0__Impl
	rule__Linux__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Linux__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLinuxAccess().getLinuxAction_0()); }
	()
	{ after(grammarAccess.getLinuxAccess().getLinuxAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Linux__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Linux__Group__1__Impl
	rule__Linux__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Linux__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLinuxAccess().getLinuxKeyword_1()); }
	'Linux'
	{ after(grammarAccess.getLinuxAccess().getLinuxKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Linux__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Linux__Group__2__Impl
	rule__Linux__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Linux__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLinuxAccess().getKindAssignment_2()); }
	(rule__Linux__KindAssignment_2)?
	{ after(grammarAccess.getLinuxAccess().getKindAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Linux__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Linux__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Linux__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLinuxAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getLinuxAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MacOS__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MacOS__Group__0__Impl
	rule__MacOS__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MacOS__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMacOSAccess().getMacOSAction_0()); }
	()
	{ after(grammarAccess.getMacOSAccess().getMacOSAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MacOS__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MacOS__Group__1__Impl
	rule__MacOS__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MacOS__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMacOSAccess().getMacOSKeyword_1()); }
	'MacOS'
	{ after(grammarAccess.getMacOSAccess().getMacOSKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MacOS__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MacOS__Group__2__Impl
	rule__MacOS__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MacOS__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMacOSAccess().getKindAssignment_2()); }
	(rule__MacOS__KindAssignment_2)?
	{ after(grammarAccess.getMacOSAccess().getKindAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MacOS__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MacOS__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MacOS__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMacOSAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getMacOSAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NetworkInterface__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterface__Group__0__Impl
	rule__NetworkInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkInterfaceAccess().getNetworkInterfaceKeyword_0()); }
	'NetworkInterface'
	{ after(grammarAccess.getNetworkInterfaceAccess().getNetworkInterfaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterface__Group__1__Impl
	rule__NetworkInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkInterfaceAccess().getNameAssignment_1()); }
	(rule__NetworkInterface__NameAssignment_1)
	{ after(grammarAccess.getNetworkInterfaceAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterface__Group__2__Impl
	rule__NetworkInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkInterfaceAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getNetworkInterfaceAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterface__Group__3__Impl
	rule__NetworkInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3()); }
	(rule__NetworkInterface__UnorderedGroup_3)
	{ after(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterface__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkInterfaceAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getNetworkInterfaceAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NetworkInterface__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterface__Group_3_0__0__Impl
	rule__NetworkInterface__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkInterfaceAccess().getHostAddressKeyword_3_0_0()); }
	'HostAddress'
	{ after(grammarAccess.getNetworkInterfaceAccess().getHostAddressKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterface__Group_3_0__1__Impl
	rule__NetworkInterface__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkInterfaceAccess().getHostAddressAssignment_3_0_1()); }
	(rule__NetworkInterface__HostAddressAssignment_3_0_1)
	{ after(grammarAccess.getNetworkInterfaceAccess().getHostAddressAssignment_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterface__Group_3_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkInterfaceAccess().getGroup_3_0_2()); }
	(rule__NetworkInterface__Group_3_0_2__0)?
	{ after(grammarAccess.getNetworkInterfaceAccess().getGroup_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NetworkInterface__Group_3_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterface__Group_3_0_2__0__Impl
	rule__NetworkInterface__Group_3_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group_3_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkInterfaceAccess().getColonKeyword_3_0_2_0()); }
	':'
	{ after(grammarAccess.getNetworkInterfaceAccess().getColonKeyword_3_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group_3_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterface__Group_3_0_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group_3_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkInterfaceAccess().getPortNrAssignment_3_0_2_1()); }
	(rule__NetworkInterface__PortNrAssignment_3_0_2_1)
	{ after(grammarAccess.getNetworkInterfaceAccess().getPortNrAssignment_3_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NetworkInterface__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterface__Group_3_1__0__Impl
	rule__NetworkInterface__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkInterfaceAccess().getKindKeyword_3_1_0()); }
	'Kind'
	{ after(grammarAccess.getNetworkInterfaceAccess().getKindKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterface__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkInterfaceAccess().getKindAssignment_3_1_1()); }
	(rule__NetworkInterface__KindAssignment_3_1_1)
	{ after(grammarAccess.getNetworkInterfaceAccess().getKindAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CPU__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPU__Group__0__Impl
	rule__CPU__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUAccess().getCPUKeyword_0()); }
	'CPU'
	{ after(grammarAccess.getCPUAccess().getCPUKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPU__Group__1__Impl
	rule__CPU__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUAccess().getNameAssignment_1()); }
	(rule__CPU__NameAssignment_1)
	{ after(grammarAccess.getCPUAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPU__Group__2__Impl
	rule__CPU__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getCPUAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPU__Group__3__Impl
	rule__CPU__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUAccess().getUnorderedGroup_3()); }
	(rule__CPU__UnorderedGroup_3)
	{ after(grammarAccess.getCPUAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPU__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getCPUAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CPU__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPU__Group_3_0__0__Impl
	rule__CPU__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUAccess().getKindKeyword_3_0_0()); }
	'Kind'
	{ after(grammarAccess.getCPUAccess().getKindKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPU__Group_3_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUAccess().getKindAssignment_3_0_1()); }
	(rule__CPU__KindAssignment_3_0_1)
	{ after(grammarAccess.getCPUAccess().getKindAssignment_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CPU__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPU__Group_3_1__0__Impl
	rule__CPU__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUAccess().getCoresTallyKeyword_3_1_0()); }
	'CoresTally'
	{ after(grammarAccess.getCPUAccess().getCoresTallyKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPU__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCPUAccess().getCoresTallyAssignment_3_1_1()); }
	(rule__CPU__CoresTallyAssignment_3_1_1)
	{ after(grammarAccess.getCPUAccess().getCoresTallyAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LoginAccount__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoginAccount__Group__0__Impl
	rule__LoginAccount__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccountAccess().getLoginAccountKeyword_0()); }
	'LoginAccount'
	{ after(grammarAccess.getLoginAccountAccess().getLoginAccountKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoginAccount__Group__1__Impl
	rule__LoginAccount__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccountAccess().getNameAssignment_1()); }
	(rule__LoginAccount__NameAssignment_1)
	{ after(grammarAccess.getLoginAccountAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoginAccount__Group__2__Impl
	rule__LoginAccount__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccountAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getLoginAccountAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoginAccount__Group__3__Impl
	rule__LoginAccount__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3()); }
	(rule__LoginAccount__UnorderedGroup_3)
	{ after(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoginAccount__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccountAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getLoginAccountAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LoginAccount__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoginAccount__Group_3_0__0__Impl
	rule__LoginAccount__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccountAccess().getFullNameKeyword_3_0_0()); }
	'FullName'
	{ after(grammarAccess.getLoginAccountAccess().getFullNameKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoginAccount__Group_3_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccountAccess().getFullnameAssignment_3_0_1()); }
	(rule__LoginAccount__FullnameAssignment_3_0_1)
	{ after(grammarAccess.getLoginAccountAccess().getFullnameAssignment_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LoginAccount__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoginAccount__Group_3_1__0__Impl
	rule__LoginAccount__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccountAccess().getEmailKeyword_3_1_0()); }
	'Email'
	{ after(grammarAccess.getLoginAccountAccess().getEmailKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoginAccount__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccountAccess().getEmailAssignment_3_1_1()); }
	(rule__LoginAccount__EmailAssignment_3_1_1)
	{ after(grammarAccess.getLoginAccountAccess().getEmailAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TargetMiddleware__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetMiddleware__Group__0__Impl
	rule__TargetMiddleware__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetMiddleware__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetMiddlewareAccess().getTargetMiddlewareKeyword_0()); }
	'TargetMiddleware'
	{ after(grammarAccess.getTargetMiddlewareAccess().getTargetMiddlewareKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetMiddleware__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetMiddleware__Group__1__Impl
	rule__TargetMiddleware__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetMiddleware__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetMiddlewareAccess().getMiddlewareAssignment_1()); }
	(rule__TargetMiddleware__MiddlewareAssignment_1)
	{ after(grammarAccess.getTargetMiddlewareAccess().getMiddlewareAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetMiddleware__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetMiddleware__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetMiddleware__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetMiddlewareAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getTargetMiddlewareAccess().getSemicolonKeyword_2()); }
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


rule__NetworkInterface__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
	}
:
	rule__NetworkInterface__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__NetworkInterface__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getNetworkInterfaceAccess().getGroup_3_0()); }
					(rule__NetworkInterface__Group_3_0__0)
					{ after(grammarAccess.getNetworkInterfaceAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getNetworkInterfaceAccess().getGroup_3_1()); }
					(rule__NetworkInterface__Group_3_1__0)
					{ after(grammarAccess.getNetworkInterfaceAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__NetworkInterface__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterface__UnorderedGroup_3__Impl
	rule__NetworkInterface__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterface__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__CPU__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getCPUAccess().getUnorderedGroup_3());
	}
:
	rule__CPU__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getCPUAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getCPUAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__CPU__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCPUAccess().getGroup_3_0()); }
					(rule__CPU__Group_3_0__0)
					{ after(grammarAccess.getCPUAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCPUAccess().getGroup_3_1()); }
					(rule__CPU__Group_3_1__0)
					{ after(grammarAccess.getCPUAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCPUAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__CPU__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPU__UnorderedGroup_3__Impl
	rule__CPU__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CPU__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__LoginAccount__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
	}
:
	rule__LoginAccount__UnorderedGroup_3__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__LoginAccount__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getLoginAccountAccess().getGroup_3_0()); }
					(rule__LoginAccount__Group_3_0__0)
					{ after(grammarAccess.getLoginAccountAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getLoginAccountAccess().getGroup_3_1()); }
					(rule__LoginAccount__Group_3_1__0)
					{ after(grammarAccess.getLoginAccountAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__LoginAccount__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoginAccount__UnorderedGroup_3__Impl
	rule__LoginAccount__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoginAccount__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__TargetPlatformModel__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTargetPlatformModelAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTargetPlatformModelAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformModel__ElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTargetPlatformModelAccess().getElementsAbstractTPElementParserRuleCall_3_0()); }
		ruleAbstractTPElement
		{ after(grammarAccess.getTargetPlatformModelAccess().getElementsAbstractTPElementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Endpoint1Assignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNetworkConnectionAccess().getEndpoint1NetworkInterfaceCrossReference_2_0()); }
		(
			{ before(grammarAccess.getNetworkConnectionAccess().getEndpoint1NetworkInterfaceFQNParserRuleCall_2_0_1()); }
			ruleFQN
			{ after(grammarAccess.getNetworkConnectionAccess().getEndpoint1NetworkInterfaceFQNParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getNetworkConnectionAccess().getEndpoint1NetworkInterfaceCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__Endpoint2Assignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNetworkConnectionAccess().getEndpoint2NetworkInterfaceCrossReference_4_0()); }
		(
			{ before(grammarAccess.getNetworkConnectionAccess().getEndpoint2NetworkInterfaceFQNParserRuleCall_4_0_1()); }
			ruleFQN
			{ after(grammarAccess.getNetworkConnectionAccess().getEndpoint2NetworkInterfaceFQNParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getNetworkConnectionAccess().getEndpoint2NetworkInterfaceCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkConnection__KindAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNetworkConnectionAccess().getKindEStringParserRuleCall_5_1_0()); }
		ruleEString
		{ after(grammarAccess.getNetworkConnectionAccess().getKindEStringParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformDefinition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTargetPlatformDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTargetPlatformDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformDefinition__OsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTargetPlatformDefinitionAccess().getOsOperatingSystemParserRuleCall_3_0()); }
		ruleOperatingSystem
		{ after(grammarAccess.getTargetPlatformDefinitionAccess().getOsOperatingSystemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformDefinition__ElementsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTargetPlatformDefinitionAccess().getElementsAbstractTPSubNodeParserRuleCall_4_0()); }
		ruleAbstractTPSubNode
		{ after(grammarAccess.getTargetPlatformDefinitionAccess().getElementsAbstractTPSubNodeParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Windows__KindAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWindowsAccess().getKindSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getWindowsAccess().getKindSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Linux__KindAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLinuxAccess().getKindSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getLinuxAccess().getKindSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MacOS__KindAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMacOSAccess().getKindSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getMacOSAccess().getKindSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNetworkInterfaceAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getNetworkInterfaceAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__HostAddressAssignment_3_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNetworkInterfaceAccess().getHostAddressSTRINGTerminalRuleCall_3_0_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getNetworkInterfaceAccess().getHostAddressSTRINGTerminalRuleCall_3_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__PortNrAssignment_3_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNetworkInterfaceAccess().getPortNrEIntParserRuleCall_3_0_2_1_0()); }
		ruleEInt
		{ after(grammarAccess.getNetworkInterfaceAccess().getPortNrEIntParserRuleCall_3_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterface__KindAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNetworkInterfaceAccess().getKindEStringParserRuleCall_3_1_1_0()); }
		ruleEString
		{ after(grammarAccess.getNetworkInterfaceAccess().getKindEStringParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCPUAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCPUAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__KindAssignment_3_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCPUAccess().getKindEStringParserRuleCall_3_0_1_0()); }
		ruleEString
		{ after(grammarAccess.getCPUAccess().getKindEStringParserRuleCall_3_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CPU__CoresTallyAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCPUAccess().getCoresTallyEIntParserRuleCall_3_1_1_0()); }
		ruleEInt
		{ after(grammarAccess.getCPUAccess().getCoresTallyEIntParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoginAccountAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getLoginAccountAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__FullnameAssignment_3_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoginAccountAccess().getFullnameSTRINGTerminalRuleCall_3_0_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getLoginAccountAccess().getFullnameSTRINGTerminalRuleCall_3_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccount__EmailAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoginAccountAccess().getEmailSTRINGTerminalRuleCall_3_1_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getLoginAccountAccess().getEmailSTRINGTerminalRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetMiddleware__MiddlewareAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTargetMiddlewareAccess().getMiddlewareRoboticMiddlewareParserRuleCall_1_0()); }
		ruleRoboticMiddleware
		{ after(grammarAccess.getTargetMiddlewareAccess().getMiddlewareRoboticMiddlewareParserRuleCall_1_0()); }
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
