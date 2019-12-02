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
grammar InternalDeployment;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.system.deployment.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.system.deployment.ide.contentassist.antlr.internal;

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
import org.xtext.system.deployment.services.DeploymentGrammarAccess;

}
@parser::members {
	private DeploymentGrammarAccess grammarAccess;

	public void setGrammarAccess(DeploymentGrammarAccess grammarAccess) {
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

// Entry rule entryRuleDeploymentModel
entryRuleDeploymentModel
:
{ before(grammarAccess.getDeploymentModelRule()); }
	 ruleDeploymentModel
{ after(grammarAccess.getDeploymentModelRule()); } 
	 EOF 
;

// Rule DeploymentModel
ruleDeploymentModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeploymentModelAccess().getGroup()); }
		(rule__DeploymentModel__Group__0)
		{ after(grammarAccess.getDeploymentModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractDeploymentElement
entryRuleAbstractDeploymentElement
:
{ before(grammarAccess.getAbstractDeploymentElementRule()); }
	 ruleAbstractDeploymentElement
{ after(grammarAccess.getAbstractDeploymentElementRule()); } 
	 EOF 
;

// Rule AbstractDeploymentElement
ruleAbstractDeploymentElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractDeploymentElementAccess().getAlternatives()); }
		(rule__AbstractDeploymentElement__Alternatives)
		{ after(grammarAccess.getAbstractDeploymentElementAccess().getAlternatives()); }
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

// Entry rule entryRuleTargetModelInclude
entryRuleTargetModelInclude
:
{ before(grammarAccess.getTargetModelIncludeRule()); }
	 ruleTargetModelInclude
{ after(grammarAccess.getTargetModelIncludeRule()); } 
	 EOF 
;

// Rule TargetModelInclude
ruleTargetModelInclude 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTargetModelIncludeAccess().getGroup()); }
		(rule__TargetModelInclude__Group__0)
		{ after(grammarAccess.getTargetModelIncludeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTargetPlatformReference
entryRuleTargetPlatformReference
:
{ before(grammarAccess.getTargetPlatformReferenceRule()); }
	 ruleTargetPlatformReference
{ after(grammarAccess.getTargetPlatformReferenceRule()); } 
	 EOF 
;

// Rule TargetPlatformReference
ruleTargetPlatformReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTargetPlatformReferenceAccess().getGroup()); }
		(rule__TargetPlatformReference__Group__0)
		{ after(grammarAccess.getTargetPlatformReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUploadDirectory
entryRuleUploadDirectory
:
{ before(grammarAccess.getUploadDirectoryRule()); }
	 ruleUploadDirectory
{ after(grammarAccess.getUploadDirectoryRule()); } 
	 EOF 
;

// Rule UploadDirectory
ruleUploadDirectory 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUploadDirectoryAccess().getGroup()); }
		(rule__UploadDirectory__Group__0)
		{ after(grammarAccess.getUploadDirectoryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLoginAccountSelection
entryRuleLoginAccountSelection
:
{ before(grammarAccess.getLoginAccountSelectionRule()); }
	 ruleLoginAccountSelection
{ after(grammarAccess.getLoginAccountSelectionRule()); } 
	 EOF 
;

// Rule LoginAccountSelection
ruleLoginAccountSelection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLoginAccountSelectionAccess().getGroup()); }
		(rule__LoginAccountSelection__Group__0)
		{ after(grammarAccess.getLoginAccountSelectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNetworkInterfaceSelection
entryRuleNetworkInterfaceSelection
:
{ before(grammarAccess.getNetworkInterfaceSelectionRule()); }
	 ruleNetworkInterfaceSelection
{ after(grammarAccess.getNetworkInterfaceSelectionRule()); } 
	 EOF 
;

// Rule NetworkInterfaceSelection
ruleNetworkInterfaceSelection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNetworkInterfaceSelectionAccess().getGroup()); }
		(rule__NetworkInterfaceSelection__Group__0)
		{ after(grammarAccess.getNetworkInterfaceSelectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentArtefact
entryRuleComponentArtefact
:
{ before(grammarAccess.getComponentArtefactRule()); }
	 ruleComponentArtefact
{ after(grammarAccess.getComponentArtefactRule()); } 
	 EOF 
;

// Rule ComponentArtefact
ruleComponentArtefact 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentArtefactAccess().getGroup()); }
		(rule__ComponentArtefact__Group__0)
		{ after(grammarAccess.getComponentArtefactAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNamingService
entryRuleNamingService
:
{ before(grammarAccess.getNamingServiceRule()); }
	 ruleNamingService
{ after(grammarAccess.getNamingServiceRule()); } 
	 EOF 
;

// Rule NamingService
ruleNamingService 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNamingServiceAccess().getGroup()); }
		(rule__NamingService__Group__0)
		{ after(grammarAccess.getNamingServiceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeployment
entryRuleDeployment
:
{ before(grammarAccess.getDeploymentRule()); }
	 ruleDeployment
{ after(grammarAccess.getDeploymentRule()); } 
	 EOF 
;

// Rule Deployment
ruleDeployment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeploymentAccess().getGroup()); }
		(rule__Deployment__Group__0)
		{ after(grammarAccess.getDeploymentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractDeploymentElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractDeploymentElementAccess().getNamingServiceParserRuleCall_0()); }
		ruleNamingService
		{ after(grammarAccess.getAbstractDeploymentElementAccess().getNamingServiceParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractDeploymentElementAccess().getTargetPlatformReferenceParserRuleCall_1()); }
		ruleTargetPlatformReference
		{ after(grammarAccess.getAbstractDeploymentElementAccess().getTargetPlatformReferenceParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractDeploymentElementAccess().getComponentArtefactParserRuleCall_2()); }
		ruleComponentArtefact
		{ after(grammarAccess.getAbstractDeploymentElementAccess().getComponentArtefactParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractDeploymentElementAccess().getTargetModelIncludeParserRuleCall_3()); }
		ruleTargetModelInclude
		{ after(grammarAccess.getAbstractDeploymentElementAccess().getTargetModelIncludeParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeploymentModel__Group__0__Impl
	rule__DeploymentModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeploymentModelAccess().getDeploymentModelKeyword_0()); }
	'DeploymentModel'
	{ after(grammarAccess.getDeploymentModelAccess().getDeploymentModelKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeploymentModel__Group__1__Impl
	rule__DeploymentModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeploymentModelAccess().getNameAssignment_1()); }
	(rule__DeploymentModel__NameAssignment_1)
	{ after(grammarAccess.getDeploymentModelAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeploymentModel__Group__2__Impl
	rule__DeploymentModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeploymentModelAccess().getGroup_2()); }
	(rule__DeploymentModel__Group_2__0)?
	{ after(grammarAccess.getDeploymentModelAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeploymentModel__Group__3__Impl
	rule__DeploymentModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeploymentModelAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getDeploymentModelAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeploymentModel__Group__4__Impl
	rule__DeploymentModel__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeploymentModelAccess().getElementsAssignment_4()); }
	(rule__DeploymentModel__ElementsAssignment_4)*
	{ after(grammarAccess.getDeploymentModelAccess().getElementsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeploymentModel__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeploymentModelAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getDeploymentModelAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DeploymentModel__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeploymentModel__Group_2__0__Impl
	rule__DeploymentModel__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeploymentModelAccess().getUsingKeyword_2_0()); }
	'using'
	{ after(grammarAccess.getDeploymentModelAccess().getUsingKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeploymentModel__Group_2__1__Impl
	rule__DeploymentModel__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeploymentModelAccess().getComponentArchitectureKeyword_2_1()); }
	'ComponentArchitecture'
	{ after(grammarAccess.getDeploymentModelAccess().getComponentArchitectureKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeploymentModel__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeploymentModelAccess().getComponentArchAssignment_2_2()); }
	(rule__DeploymentModel__ComponentArchAssignment_2_2)
	{ after(grammarAccess.getDeploymentModelAccess().getComponentArchAssignment_2_2()); }
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


rule__TargetModelInclude__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetModelInclude__Group__0__Impl
	rule__TargetModelInclude__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetModelInclude__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetModelIncludeAccess().getImportKeyword_0()); }
	'#import'
	{ after(grammarAccess.getTargetModelIncludeAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetModelInclude__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetModelInclude__Group__1__Impl
	rule__TargetModelInclude__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetModelInclude__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetModelIncludeAccess().getImportedNamespaceAssignment_1()); }
	(rule__TargetModelInclude__ImportedNamespaceAssignment_1)
	{ after(grammarAccess.getTargetModelIncludeAccess().getImportedNamespaceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetModelInclude__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetModelInclude__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetModelInclude__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetModelIncludeAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getTargetModelIncludeAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TargetPlatformReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformReference__Group__0__Impl
	rule__TargetPlatformReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformReferenceAccess().getTargetPlatformReferenceKeyword_0()); }
	'TargetPlatformReference'
	{ after(grammarAccess.getTargetPlatformReferenceAccess().getTargetPlatformReferenceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformReference__Group__1__Impl
	rule__TargetPlatformReference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformReferenceAccess().getNameAssignment_1()); }
	(rule__TargetPlatformReference__NameAssignment_1)
	{ after(grammarAccess.getTargetPlatformReferenceAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformReference__Group__2__Impl
	rule__TargetPlatformReference__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformReferenceAccess().getUsingKeyword_2()); }
	'using'
	{ after(grammarAccess.getTargetPlatformReferenceAccess().getUsingKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformReference__Group__3__Impl
	rule__TargetPlatformReference__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformReferenceAccess().getPlatformAssignment_3()); }
	(rule__TargetPlatformReference__PlatformAssignment_3)
	{ after(grammarAccess.getTargetPlatformReferenceAccess().getPlatformAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformReference__Group__4__Impl
	rule__TargetPlatformReference__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformReferenceAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getTargetPlatformReferenceAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformReference__Group__5__Impl
	rule__TargetPlatformReference__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5()); }
	(rule__TargetPlatformReference__UnorderedGroup_5)
	{ after(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformReference__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTargetPlatformReferenceAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getTargetPlatformReferenceAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UploadDirectory__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UploadDirectory__Group__0__Impl
	rule__UploadDirectory__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UploadDirectory__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUploadDirectoryAccess().getUploadDirectoryKeyword_0()); }
	'UploadDirectory'
	{ after(grammarAccess.getUploadDirectoryAccess().getUploadDirectoryKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UploadDirectory__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UploadDirectory__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UploadDirectory__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUploadDirectoryAccess().getPathAssignment_1()); }
	(rule__UploadDirectory__PathAssignment_1)
	{ after(grammarAccess.getUploadDirectoryAccess().getPathAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LoginAccountSelection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoginAccountSelection__Group__0__Impl
	rule__LoginAccountSelection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccountSelection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccountSelectionAccess().getLoginAccountKeyword_0()); }
	'LoginAccount'
	{ after(grammarAccess.getLoginAccountSelectionAccess().getLoginAccountKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccountSelection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoginAccountSelection__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccountSelection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoginAccountSelectionAccess().getLoginAssignment_1()); }
	(rule__LoginAccountSelection__LoginAssignment_1)
	{ after(grammarAccess.getLoginAccountSelectionAccess().getLoginAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NetworkInterfaceSelection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterfaceSelection__Group__0__Impl
	rule__NetworkInterfaceSelection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterfaceSelection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkInterfaceKeyword_0()); }
	'NetworkInterface'
	{ after(grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkInterfaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterfaceSelection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NetworkInterfaceSelection__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterfaceSelection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkAssignment_1()); }
	(rule__NetworkInterfaceSelection__NetworkAssignment_1)
	{ after(grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentArtefact__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentArtefact__Group__0__Impl
	rule__ComponentArtefact__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentArtefact__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentArtefactAccess().getComponentArtefactKeyword_0()); }
	'ComponentArtefact'
	{ after(grammarAccess.getComponentArtefactAccess().getComponentArtefactKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentArtefact__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentArtefact__Group__1__Impl
	rule__ComponentArtefact__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentArtefact__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentArtefactAccess().getComponentAssignment_1()); }
	(rule__ComponentArtefact__ComponentAssignment_1)
	{ after(grammarAccess.getComponentArtefactAccess().getComponentAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentArtefact__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentArtefact__Group__2__Impl
	rule__ComponentArtefact__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentArtefact__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentArtefactAccess().getDeployAssignment_2()); }
	(rule__ComponentArtefact__DeployAssignment_2)?
	{ after(grammarAccess.getComponentArtefactAccess().getDeployAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentArtefact__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentArtefact__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentArtefact__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentArtefactAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getComponentArtefactAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamingService__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamingService__Group__0__Impl
	rule__NamingService__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamingServiceAccess().getNamingServiceAction_0()); }
	()
	{ after(grammarAccess.getNamingServiceAccess().getNamingServiceAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamingService__Group__1__Impl
	rule__NamingService__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamingServiceAccess().getNamingServiceKeyword_1()); }
	'NamingService'
	{ after(grammarAccess.getNamingServiceAccess().getNamingServiceKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamingService__Group__2__Impl
	rule__NamingService__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamingServiceAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getNamingServiceAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamingService__Group__3__Impl
	rule__NamingService__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3()); }
	(rule__NamingService__UnorderedGroup_3)
	{ after(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamingService__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamingServiceAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getNamingServiceAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NamingService__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamingService__Group_3_0__0__Impl
	rule__NamingService__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamingServiceAccess().getPortNrKeyword_3_0_0()); }
	'portNr'
	{ after(grammarAccess.getNamingServiceAccess().getPortNrKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamingService__Group_3_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamingServiceAccess().getPortNrAssignment_3_0_1()); }
	(rule__NamingService__PortNrAssignment_3_0_1)
	{ after(grammarAccess.getNamingServiceAccess().getPortNrAssignment_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Deployment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deployment__Group__0__Impl
	rule__Deployment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Deployment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeploymentAccess().getDeployToKeyword_0()); }
	'deploy-to'
	{ after(grammarAccess.getDeploymentAccess().getDeployToKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deployment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Deployment__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Deployment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeploymentAccess().getToAssignment_1()); }
	(rule__Deployment__ToAssignment_1)
	{ after(grammarAccess.getDeploymentAccess().getToAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TargetPlatformReference__UnorderedGroup_5
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5());
	}
:
	rule__TargetPlatformReference__UnorderedGroup_5__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTargetPlatformReferenceAccess().getDirectoryAssignment_5_0()); }
					(rule__TargetPlatformReference__DirectoryAssignment_5_0)
					{ after(grammarAccess.getTargetPlatformReferenceAccess().getDirectoryAssignment_5_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTargetPlatformReferenceAccess().getLoginAssignment_5_1()); }
					(rule__TargetPlatformReference__LoginAssignment_5_1)
					{ after(grammarAccess.getTargetPlatformReferenceAccess().getLoginAssignment_5_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTargetPlatformReferenceAccess().getHostAssignment_5_2()); }
					(rule__TargetPlatformReference__HostAssignment_5_2)
					{ after(grammarAccess.getTargetPlatformReferenceAccess().getHostAssignment_5_2()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__UnorderedGroup_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformReference__UnorderedGroup_5__Impl
	rule__TargetPlatformReference__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__UnorderedGroup_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformReference__UnorderedGroup_5__Impl
	rule__TargetPlatformReference__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__UnorderedGroup_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TargetPlatformReference__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__NamingService__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3());
	}
:
	rule__NamingService__UnorderedGroup_3__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__NamingService__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getNamingServiceAccess().getGroup_3_0()); }
					(rule__NamingService__Group_3_0__0)
					{ after(grammarAccess.getNamingServiceAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getNamingServiceAccess().getDeployAssignment_3_1()); }
					(rule__NamingService__DeployAssignment_3_1)
					{ after(grammarAccess.getNamingServiceAccess().getDeployAssignment_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__NamingService__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamingService__UnorderedGroup_3__Impl
	rule__NamingService__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NamingService__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__DeploymentModel__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeploymentModelAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDeploymentModelAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__ComponentArchAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeploymentModelAccess().getComponentArchSystemComponentArchitectureCrossReference_2_2_0()); }
		(
			{ before(grammarAccess.getDeploymentModelAccess().getComponentArchSystemComponentArchitectureFQNParserRuleCall_2_2_0_1()); }
			ruleFQN
			{ after(grammarAccess.getDeploymentModelAccess().getComponentArchSystemComponentArchitectureFQNParserRuleCall_2_2_0_1()); }
		)
		{ after(grammarAccess.getDeploymentModelAccess().getComponentArchSystemComponentArchitectureCrossReference_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeploymentModel__ElementsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeploymentModelAccess().getElementsAbstractDeploymentElementParserRuleCall_4_0()); }
		ruleAbstractDeploymentElement
		{ after(grammarAccess.getDeploymentModelAccess().getElementsAbstractDeploymentElementParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetModelInclude__ImportedNamespaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTargetModelIncludeAccess().getImportedNamespaceEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getTargetModelIncludeAccess().getImportedNamespaceEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTargetPlatformReferenceAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTargetPlatformReferenceAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__PlatformAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTargetPlatformReferenceAccess().getPlatformTargetPlatformDefinitionCrossReference_3_0()); }
		(
			{ before(grammarAccess.getTargetPlatformReferenceAccess().getPlatformTargetPlatformDefinitionFQNParserRuleCall_3_0_1()); }
			ruleFQN
			{ after(grammarAccess.getTargetPlatformReferenceAccess().getPlatformTargetPlatformDefinitionFQNParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getTargetPlatformReferenceAccess().getPlatformTargetPlatformDefinitionCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__DirectoryAssignment_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTargetPlatformReferenceAccess().getDirectoryUploadDirectoryParserRuleCall_5_0_0()); }
		ruleUploadDirectory
		{ after(grammarAccess.getTargetPlatformReferenceAccess().getDirectoryUploadDirectoryParserRuleCall_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__LoginAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTargetPlatformReferenceAccess().getLoginLoginAccountSelectionParserRuleCall_5_1_0()); }
		ruleLoginAccountSelection
		{ after(grammarAccess.getTargetPlatformReferenceAccess().getLoginLoginAccountSelectionParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TargetPlatformReference__HostAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTargetPlatformReferenceAccess().getHostNetworkInterfaceSelectionParserRuleCall_5_2_0()); }
		ruleNetworkInterfaceSelection
		{ after(grammarAccess.getTargetPlatformReferenceAccess().getHostNetworkInterfaceSelectionParserRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UploadDirectory__PathAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUploadDirectoryAccess().getPathSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getUploadDirectoryAccess().getPathSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoginAccountSelection__LoginAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoginAccountSelectionAccess().getLoginLoginAccountCrossReference_1_0()); }
		(
			{ before(grammarAccess.getLoginAccountSelectionAccess().getLoginLoginAccountFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getLoginAccountSelectionAccess().getLoginLoginAccountFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getLoginAccountSelectionAccess().getLoginLoginAccountCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NetworkInterfaceSelection__NetworkAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkNetworkInterfaceCrossReference_1_0()); }
		(
			{ before(grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkNetworkInterfaceFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkNetworkInterfaceFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkNetworkInterfaceCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentArtefact__ComponentAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentArtefactAccess().getComponentComponentInstanceCrossReference_1_0()); }
		(
			{ before(grammarAccess.getComponentArtefactAccess().getComponentComponentInstanceFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getComponentArtefactAccess().getComponentComponentInstanceFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getComponentArtefactAccess().getComponentComponentInstanceCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentArtefact__DeployAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentArtefactAccess().getDeployDeploymentParserRuleCall_2_0()); }
		ruleDeployment
		{ after(grammarAccess.getComponentArtefactAccess().getDeployDeploymentParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__PortNrAssignment_3_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamingServiceAccess().getPortNrEIntParserRuleCall_3_0_1_0()); }
		ruleEInt
		{ after(grammarAccess.getNamingServiceAccess().getPortNrEIntParserRuleCall_3_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NamingService__DeployAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamingServiceAccess().getDeployDeploymentParserRuleCall_3_1_0()); }
		ruleDeployment
		{ after(grammarAccess.getNamingServiceAccess().getDeployDeploymentParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Deployment__ToAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeploymentAccess().getToTargetPlatformReferenceCrossReference_1_0()); }
		(
			{ before(grammarAccess.getDeploymentAccess().getToTargetPlatformReferenceFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getDeploymentAccess().getToTargetPlatformReferenceFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getDeploymentAccess().getToTargetPlatformReferenceCrossReference_1_0()); }
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
