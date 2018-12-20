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
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.component.componentDefinition.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.component.componentDefinition.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.component.componentDefinition.services.ComponentDefinitionGrammarAccess;

}

@parser::members {

 	private ComponentDefinitionGrammarAccess grammarAccess;

    public InternalComponentDefinitionParser(TokenStream input, ComponentDefinitionGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ComponentDefModel";
   	}

   	@Override
   	protected ComponentDefinitionGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleComponentDefModel
entryRuleComponentDefModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentDefModelRule()); }
	iv_ruleComponentDefModel=ruleComponentDefModel
	{ $current=$iv_ruleComponentDefModel.current; }
	EOF;

// Rule ComponentDefModel
ruleComponentDefModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getComponentDefModelAccess().getComponentDefModelAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentDefModelAccess().getImportsServiceRepoImportParserRuleCall_1_0());
				}
				lv_imports_1_0=ruleServiceRepoImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentDefModelRule());
					}
					add(
						$current,
						"imports",
						lv_imports_1_0,
						"org.xtext.component.componentDefinition.ComponentDefinition.ServiceRepoImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentDefModelAccess().getComponentComponentDefinitionParserRuleCall_2_0());
				}
				lv_component_2_0=ruleComponentDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentDefModelRule());
					}
					set(
						$current,
						"component",
						lv_component_2_0,
						"org.xtext.component.componentDefinition.ComponentDefinition.ComponentDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleServiceRepoImport
entryRuleServiceRepoImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServiceRepoImportRule()); }
	iv_ruleServiceRepoImport=ruleServiceRepoImport
	{ $current=$iv_ruleServiceRepoImport.current; }
	EOF;

// Rule ServiceRepoImport
ruleServiceRepoImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#import'
		{
			newLeafNode(otherlv_0, grammarAccess.getServiceRepoImportAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getServiceRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleFQNW
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getServiceRepoImportRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"org.xtext.service.roboticMiddleware.RoboticMiddleware.FQNW");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getServiceRepoImportAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleComponentDefinition
entryRuleComponentDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentDefinitionRule()); }
	iv_ruleComponentDefinition=ruleComponentDefinition
	{ $current=$iv_ruleComponentDefinition.current; }
	EOF;

// Rule ComponentDefinition
ruleComponentDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ComponentDefinition'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentDefinitionAccess().getComponentDefinitionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getComponentDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='logo'
			{
				newLeafNode(otherlv_2, grammarAccess.getComponentDefinitionAccess().getLogoKeyword_2_0());
			}
			(
				(
					lv_logo_3_0=RULE_STRING
					{
						newLeafNode(lv_logo_3_0, grammarAccess.getComponentDefinitionAccess().getLogoSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getComponentDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"logo",
							lv_logo_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getComponentDefinitionAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentDefinitionAccess().getElementsAbstractComponentElementParserRuleCall_4_0());
				}
				lv_elements_5_0=ruleAbstractComponentElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentDefinitionRule());
					}
					add(
						$current,
						"elements",
						lv_elements_5_0,
						"org.xtext.component.componentDefinition.ComponentDefinition.AbstractComponentElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getComponentDefinitionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleAbstractComponentElement
entryRuleAbstractComponentElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractComponentElementRule()); }
	iv_ruleAbstractComponentElement=ruleAbstractComponentElement
	{ $current=$iv_ruleAbstractComponentElement.current; }
	EOF;

// Rule AbstractComponentElement
ruleAbstractComponentElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractComponentElementAccess().getNamedComponentElementParserRuleCall_0());
		}
		this_NamedComponentElement_0=ruleNamedComponentElement
		{
			$current = $this_NamedComponentElement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractComponentElementAccess().getDerivedComponentElementParserRuleCall_1());
		}
		this_DerivedComponentElement_1=ruleDerivedComponentElement
		{
			$current = $this_DerivedComponentElement_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDerivedComponentElement
entryRuleDerivedComponentElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDerivedComponentElementRule()); }
	iv_ruleDerivedComponentElement=ruleDerivedComponentElement
	{ $current=$iv_ruleDerivedComponentElement.current; }
	EOF;

// Rule DerivedComponentElement
ruleDerivedComponentElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getDerivedComponentElementAccess().getComponentParametersRefParserRuleCall());
	}
	this_ComponentParametersRef_0=ruleComponentParametersRef
	{
		$current = $this_ComponentParametersRef_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleNamedComponentElement
entryRuleNamedComponentElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamedComponentElementRule()); }
	iv_ruleNamedComponentElement=ruleNamedComponentElement
	{ $current=$iv_ruleNamedComponentElement.current; }
	EOF;

// Rule NamedComponentElement
ruleNamedComponentElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNamedComponentElementAccess().getComponentSubNodeParserRuleCall_0());
		}
		this_ComponentSubNode_0=ruleComponentSubNode
		{
			$current = $this_ComponentSubNode_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNamedComponentElementAccess().getComponentPortParserRuleCall_1());
		}
		this_ComponentPort_1=ruleComponentPort
		{
			$current = $this_ComponentPort_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNamedComponentElementAccess().getCoordinationSlavePortParserRuleCall_2());
		}
		this_CoordinationSlavePort_2=ruleCoordinationSlavePort
		{
			$current = $this_CoordinationSlavePort_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNamedComponentElementAccess().getCoordinationMasterPortParserRuleCall_3());
		}
		this_CoordinationMasterPort_3=ruleCoordinationMasterPort
		{
			$current = $this_CoordinationMasterPort_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNamedComponentElementAccess().getPlainOpcUaPortParserRuleCall_4());
		}
		this_PlainOpcUaPort_4=rulePlainOpcUaPort
		{
			$current = $this_PlainOpcUaPort_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleComponentSubNode
entryRuleComponentSubNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentSubNodeRule()); }
	iv_ruleComponentSubNode=ruleComponentSubNode
	{ $current=$iv_ruleComponentSubNode.current; }
	EOF;

// Rule ComponentSubNode
ruleComponentSubNode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComponentSubNodeAccess().getActivityParserRuleCall_0());
		}
		this_Activity_0=ruleActivity
		{
			$current = $this_Activity_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentSubNodeAccess().getInputHandlerParserRuleCall_1());
		}
		this_InputHandler_1=ruleInputHandler
		{
			$current = $this_InputHandler_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentSubNodeAccess().getRequestHandlerParserRuleCall_2());
		}
		this_RequestHandler_2=ruleRequestHandler
		{
			$current = $this_RequestHandler_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleComponentPort
entryRuleComponentPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentPortRule()); }
	iv_ruleComponentPort=ruleComponentPort
	{ $current=$iv_ruleComponentPort.current; }
	EOF;

// Rule ComponentPort
ruleComponentPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComponentPortAccess().getInputPortParserRuleCall_0());
		}
		this_InputPort_0=ruleInputPort
		{
			$current = $this_InputPort_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentPortAccess().getAnswerPortParserRuleCall_1());
		}
		this_AnswerPort_1=ruleAnswerPort
		{
			$current = $this_AnswerPort_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentPortAccess().getOutputPortParserRuleCall_2());
		}
		this_OutputPort_2=ruleOutputPort
		{
			$current = $this_OutputPort_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComponentPortAccess().getRequestPortParserRuleCall_3());
		}
		this_RequestPort_3=ruleRequestPort
		{
			$current = $this_RequestPort_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRequestPort
entryRuleRequestPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequestPortRule()); }
	iv_ruleRequestPort=ruleRequestPort
	{ $current=$iv_ruleRequestPort.current; }
	EOF;

// Rule RequestPort
ruleRequestPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='RequestPort'
		{
			newLeafNode(otherlv_0, grammarAccess.getRequestPortAccess().getRequestPortKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRequestPortAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequestPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='implements'
		{
			newLeafNode(otherlv_2, grammarAccess.getRequestPortAccess().getImplementsKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequestPortRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getRequestPortAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequestPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0());
				}
				lv_extensions_5_0=ruleComponentPortExtension
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequestPortRule());
					}
					add(
						$current,
						"extensions",
						lv_extensions_5_0,
						"org.xtext.component.componentDefinition.ComponentDefinition.ComponentPortExtension");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getRequestPortAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleOutputPort
entryRuleOutputPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutputPortRule()); }
	iv_ruleOutputPort=ruleOutputPort
	{ $current=$iv_ruleOutputPort.current; }
	EOF;

// Rule OutputPort
ruleOutputPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='OutputPort'
		{
			newLeafNode(otherlv_0, grammarAccess.getOutputPortAccess().getOutputPortKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getOutputPortAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='implements'
		{
			newLeafNode(otherlv_2, grammarAccess.getOutputPortAccess().getImplementsKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputPortRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='realizedBy'
		{
			newLeafNode(otherlv_4, grammarAccess.getOutputPortAccess().getRealizedByKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputPortRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getOutputPortAccess().getActivityActivityCrossReference_5_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOutputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_7_0());
				}
				lv_extensions_7_0=ruleComponentPortExtension
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOutputPortRule());
					}
					add(
						$current,
						"extensions",
						lv_extensions_7_0,
						"org.xtext.component.componentDefinition.ComponentDefinition.ComponentPortExtension");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleAnswerPort
entryRuleAnswerPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnswerPortRule()); }
	iv_ruleAnswerPort=ruleAnswerPort
	{ $current=$iv_ruleAnswerPort.current; }
	EOF;

// Rule AnswerPort
ruleAnswerPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='AnswerPort'
		{
			newLeafNode(otherlv_0, grammarAccess.getAnswerPortAccess().getAnswerPortKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAnswerPortAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnswerPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='implements'
		{
			newLeafNode(otherlv_2, grammarAccess.getAnswerPortAccess().getImplementsKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnswerPortRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getAnswerPortAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnswerPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0());
				}
				lv_extensions_5_0=ruleComponentPortExtension
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnswerPortRule());
					}
					add(
						$current,
						"extensions",
						lv_extensions_5_0,
						"org.xtext.component.componentDefinition.ComponentDefinition.ComponentPortExtension");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getAnswerPortAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleInputPort
entryRuleInputPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputPortRule()); }
	iv_ruleInputPort=ruleInputPort
	{ $current=$iv_ruleInputPort.current; }
	EOF;

// Rule InputPort
ruleInputPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='InputPort'
		{
			newLeafNode(otherlv_0, grammarAccess.getInputPortAccess().getInputPortKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInputPortAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='implements'
		{
			newLeafNode(otherlv_2, grammarAccess.getInputPortAccess().getImplementsKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputPortRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0());
				}
				lv_extensions_5_0=ruleComponentPortExtension
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInputPortRule());
					}
					add(
						$current,
						"extensions",
						lv_extensions_5_0,
						"org.xtext.component.componentDefinition.ComponentDefinition.ComponentPortExtension");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleComponentPortExtension
entryRuleComponentPortExtension returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentPortExtensionRule()); }
	iv_ruleComponentPortExtension=ruleComponentPortExtension
	{ $current=$iv_ruleComponentPortExtension.current; }
	EOF;

// Rule ComponentPortExtension
ruleComponentPortExtension returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getComponentPortExtensionAccess().getSupportedMiddlewareParserRuleCall());
	}
	this_SupportedMiddleware_0=ruleSupportedMiddleware
	{
		$current = $this_SupportedMiddleware_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleSupportedMiddleware
entryRuleSupportedMiddleware returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSupportedMiddlewareRule()); }
	iv_ruleSupportedMiddleware=ruleSupportedMiddleware
	{ $current=$iv_ruleSupportedMiddleware.current; }
	EOF;

// Rule SupportedMiddleware
ruleSupportedMiddleware returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='SupportedMiddleware'
		{
			newLeafNode(otherlv_0, grammarAccess.getSupportedMiddlewareAccess().getSupportedMiddlewareKeyword_0());
		}
		(
			(
				lv_default_1_0='default'
				{
					newLeafNode(lv_default_1_0, grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSupportedMiddlewareRule());
					}
					setWithLastConsumed($current, "default", true, "default");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSupportedMiddlewareAccess().getMiddlewareRoboticMiddlewareParserRuleCall_2_0());
				}
				lv_middleware_2_0=ruleRoboticMiddleware
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSupportedMiddlewareRule());
					}
					set(
						$current,
						"middleware",
						lv_middleware_2_0,
						"org.xtext.service.roboticMiddleware.RoboticMiddleware.RoboticMiddleware");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getSupportedMiddlewareAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleActivity
entryRuleActivity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActivityRule()); }
	iv_ruleActivity=ruleActivity
	{ $current=$iv_ruleActivity.current; }
	EOF;

// Rule Activity
ruleActivity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Activity'
		{
			newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActivityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActivityAccess().getLinksAbstractComponentLinkParserRuleCall_3_0());
				}
				lv_links_3_0=ruleAbstractComponentLink
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActivityRule());
					}
					add(
						$current,
						"links",
						lv_links_3_0,
						"org.xtext.component.componentDefinition.ComponentDefinition.AbstractComponentLink");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getActivityAccess().getExtensionsActivityExtensionParserRuleCall_4_0());
				}
				lv_extensions_4_0=ruleActivityExtension
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActivityRule());
					}
					add(
						$current,
						"extensions",
						lv_extensions_4_0,
						"org.xtext.component.componentDefinition.ComponentDefinition.ActivityExtension");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleInputHandler
entryRuleInputHandler returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputHandlerRule()); }
	iv_ruleInputHandler=ruleInputHandler
	{ $current=$iv_ruleInputHandler.current; }
	EOF;

// Rule InputHandler
ruleInputHandler returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='InputHandler'
		{
			newLeafNode(otherlv_0, grammarAccess.getInputHandlerAccess().getInputHandlerKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInputHandlerAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputHandlerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='triggeredFrom'
		{
			newLeafNode(otherlv_2, grammarAccess.getInputHandlerAccess().getTriggeredFromKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputHandlerRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getInputHandlerAccess().getInputPortInputPortCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_activeQueue_4_0='activeQueue'
				{
					newLeafNode(lv_activeQueue_4_0, grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputHandlerRule());
					}
					setWithLastConsumed($current, "activeQueue", true, "activeQueue");
				}
			)
		)?
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getInputHandlerAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInputHandlerAccess().getLinksAbstractComponentLinkParserRuleCall_6_0());
				}
				lv_links_6_0=ruleAbstractComponentLink
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInputHandlerRule());
					}
					add(
						$current,
						"links",
						lv_links_6_0,
						"org.xtext.component.componentDefinition.ComponentDefinition.AbstractComponentLink");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getInputHandlerAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleRequestHandler
entryRuleRequestHandler returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequestHandlerRule()); }
	iv_ruleRequestHandler=ruleRequestHandler
	{ $current=$iv_ruleRequestHandler.current; }
	EOF;

// Rule RequestHandler
ruleRequestHandler returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='RequestHandler'
		{
			newLeafNode(otherlv_0, grammarAccess.getRequestHandlerAccess().getRequestHandlerKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRequestHandlerAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequestHandlerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='triggeredFrom'
		{
			newLeafNode(otherlv_2, grammarAccess.getRequestHandlerAccess().getTriggeredFromKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequestHandlerRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getRequestHandlerAccess().getAnswerPortAnswerPortCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_activeQueue_4_0='activeQueue'
				{
					newLeafNode(lv_activeQueue_4_0, grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequestHandlerRule());
					}
					setWithLastConsumed($current, "activeQueue", true, "activeQueue");
				}
			)
		)?
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getRequestHandlerAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequestHandlerAccess().getLinksAbstractComponentLinkParserRuleCall_6_0());
				}
				lv_links_6_0=ruleAbstractComponentLink
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequestHandlerRule());
					}
					add(
						$current,
						"links",
						lv_links_6_0,
						"org.xtext.component.componentDefinition.ComponentDefinition.AbstractComponentLink");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getRequestHandlerAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleAbstractComponentLink
entryRuleAbstractComponentLink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractComponentLinkRule()); }
	iv_ruleAbstractComponentLink=ruleAbstractComponentLink
	{ $current=$iv_ruleAbstractComponentLink.current; }
	EOF;

// Rule AbstractComponentLink
ruleAbstractComponentLink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractComponentLinkAccess().getComponentSubNodeObserverParserRuleCall_0());
		}
		this_ComponentSubNodeObserver_0=ruleComponentSubNodeObserver
		{
			$current = $this_ComponentSubNodeObserver_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractComponentLinkAccess().getRequestPortLinkParserRuleCall_1());
		}
		this_RequestPortLink_1=ruleRequestPortLink
		{
			$current = $this_RequestPortLink_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractComponentLinkAccess().getInputLinkExtensionParserRuleCall_2());
		}
		this_InputLinkExtension_2=ruleInputLinkExtension
		{
			$current = $this_InputLinkExtension_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractComponentLinkAccess().getOpcUaClientLinkParserRuleCall_3());
		}
		this_OpcUaClientLink_3=ruleOpcUaClientLink
		{
			$current = $this_OpcUaClientLink_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRequestPortLink
entryRuleRequestPortLink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequestPortLinkRule()); }
	iv_ruleRequestPortLink=ruleRequestPortLink
	{ $current=$iv_ruleRequestPortLink.current; }
	EOF;

// Rule RequestPortLink
ruleRequestPortLink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='RequestPortLink'
		{
			newLeafNode(otherlv_0, grammarAccess.getRequestPortLinkAccess().getRequestPortLinkKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequestPortLinkRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getRequestPortLinkAccess().getRequestPortRequestPortCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getRequestPortLinkAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleOpcUaClientLink
entryRuleOpcUaClientLink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOpcUaClientLinkRule()); }
	iv_ruleOpcUaClientLink=ruleOpcUaClientLink
	{ $current=$iv_ruleOpcUaClientLink.current; }
	EOF;

// Rule OpcUaClientLink
ruleOpcUaClientLink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='OpcUaClientLink'
		{
			newLeafNode(otherlv_0, grammarAccess.getOpcUaClientLinkAccess().getOpcUaClientLinkKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOpcUaClientLinkRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getOpcUaClientLinkAccess().getClientOpcUaDeviceClientCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getOpcUaClientLinkAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleComponentSubNodeObserver
entryRuleComponentSubNodeObserver returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentSubNodeObserverRule()); }
	iv_ruleComponentSubNodeObserver=ruleComponentSubNodeObserver
	{ $current=$iv_ruleComponentSubNodeObserver.current; }
	EOF;

// Rule ComponentSubNodeObserver
ruleComponentSubNodeObserver returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Observe'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentSubNodeObserverAccess().getObserveKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentSubNodeObserverRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getComponentSubNodeObserverAccess().getSubjectComponentSubNodeCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getComponentSubNodeObserverAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleInputLinkExtension
entryRuleInputLinkExtension returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputLinkExtensionRule()); }
	iv_ruleInputLinkExtension=ruleInputLinkExtension
	{ $current=$iv_ruleInputLinkExtension.current; }
	EOF;

// Rule InputLinkExtension
ruleInputLinkExtension returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInputLinkExtensionAccess().getInputLinkExtensionAction_0(),
					$current);
			}
		)
		otherlv_1='InputPortLink'
		{
			newLeafNode(otherlv_1, grammarAccess.getInputLinkExtensionAccess().getInputPortLinkKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputLinkExtensionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getInputLinkExtensionAccess().getInputPortInputPortCrossReference_2_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getInputLinkExtensionAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0);
					}
								({true}?=>((
									lv_optional_5_0='optional'
									{
										newLeafNode(lv_optional_5_0, grammarAccess.getInputLinkExtensionAccess().getOptionalOptionalKeyword_4_0_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getInputLinkExtensionRule());
										}
										setWithLastConsumed($current, "optional", true, "optional");
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1);
					}
								({true}?=>((
									lv_oversamplingOk_6_0='oversamplingOk'
									{
										newLeafNode(lv_oversamplingOk_6_0, grammarAccess.getInputLinkExtensionAccess().getOversamplingOkOversamplingOkKeyword_4_1_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getInputLinkExtensionRule());
										}
										setWithLastConsumed($current, "oversamplingOk", true, "oversamplingOk");
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2);
					}
								({true}?=>((
									lv_undersamplingOk_7_0='undersamplingOk'
									{
										newLeafNode(lv_undersamplingOk_7_0, grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkUndersamplingOkKeyword_4_2_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getInputLinkExtensionRule());
										}
										setWithLastConsumed($current, "undersamplingOk", true, "undersamplingOk");
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
				}
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getInputLinkExtensionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleActivityExtension
entryRuleActivityExtension returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActivityExtensionRule()); }
	iv_ruleActivityExtension=ruleActivityExtension
	{ $current=$iv_ruleActivityExtension.current; }
	EOF;

// Rule ActivityExtension
ruleActivityExtension returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActivityExtensionAccess().getActivationConstraintsParserRuleCall_0());
		}
		this_ActivationConstraints_0=ruleActivationConstraints
		{
			$current = $this_ActivationConstraints_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActivityExtensionAccess().getOperationModeBindingParserRuleCall_1());
		}
		this_OperationModeBinding_1=ruleOperationModeBinding
		{
			$current = $this_OperationModeBinding_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActivityExtensionAccess().getDefaultTriggerParserRuleCall_2());
		}
		this_DefaultTrigger_2=ruleDefaultTrigger
		{
			$current = $this_DefaultTrigger_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleActivationConstraints
entryRuleActivationConstraints returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActivationConstraintsRule()); }
	iv_ruleActivationConstraints=ruleActivationConstraints
	{ $current=$iv_ruleActivationConstraints.current; }
	EOF;

// Rule ActivationConstraints
ruleActivationConstraints returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActivationConstraintsAccess().getActivationConstraintsAction_0(),
					$current);
			}
		)
		otherlv_1='ActivationConstraints'
		{
			newLeafNode(otherlv_1, grammarAccess.getActivationConstraintsAccess().getActivationConstraintsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getActivationConstraintsAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='configurable'
		{
			newLeafNode(otherlv_3, grammarAccess.getActivationConstraintsAccess().getConfigurableKeyword_3());
		}
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActivationConstraintsAccess().getConfigurableEBooleanParserRuleCall_5_0());
				}
				lv_configurable_5_0=ruleEBoolean
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActivationConstraintsRule());
					}
					set(
						$current,
						"configurable",
						lv_configurable_5_0,
						"org.xtext.service.roboticMiddleware.RoboticMiddleware.EBoolean");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=';'
			{
				newLeafNode(otherlv_6, grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_6());
			}
		)?
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0);
					}
								({true}?=>(otherlv_8='minActFreq'
								{
									newLeafNode(otherlv_8, grammarAccess.getActivationConstraintsAccess().getMinActFreqKeyword_7_0_0());
								}
								otherlv_9='='
								{
									newLeafNode(otherlv_9, grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getActivationConstraintsAccess().getMinActFreqEDoubleParserRuleCall_7_0_2_0());
										}
										lv_minActFreq_10_0=ruleEDouble
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getActivationConstraintsRule());
											}
											set(
												$current,
												"minActFreq",
												lv_minActFreq_10_0,
												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EDouble");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_11='Hz'
								{
									newLeafNode(otherlv_11, grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_0_3());
								}
								(
									otherlv_12=';'
									{
										newLeafNode(otherlv_12, grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_0_4());
									}
								)?
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1);
					}
								({true}?=>(otherlv_13='maxActFreq'
								{
									newLeafNode(otherlv_13, grammarAccess.getActivationConstraintsAccess().getMaxActFreqKeyword_7_1_0());
								}
								otherlv_14='='
								{
									newLeafNode(otherlv_14, grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getActivationConstraintsAccess().getMaxActFreqEDoubleParserRuleCall_7_1_2_0());
										}
										lv_maxActFreq_15_0=ruleEDouble
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getActivationConstraintsRule());
											}
											set(
												$current,
												"maxActFreq",
												lv_maxActFreq_15_0,
												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EDouble");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_16='Hz'
								{
									newLeafNode(otherlv_16, grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_1_3());
								}
								(
									otherlv_17=';'
									{
										newLeafNode(otherlv_17, grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_1_4());
									}
								)?
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
				}
		)
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getActivationConstraintsAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleOperationModeBinding
entryRuleOperationModeBinding returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperationModeBindingRule()); }
	iv_ruleOperationModeBinding=ruleOperationModeBinding
	{ $current=$iv_ruleOperationModeBinding.current; }
	EOF;

// Rule OperationModeBinding
ruleOperationModeBinding returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='OperationModeBinding'
		{
			newLeafNode(otherlv_0, grammarAccess.getOperationModeBindingAccess().getOperationModeBindingKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperationModeBindingRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getOperationModeBindingAccess().getModePrivateOperationModeCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getOperationModeBindingAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleDefaultTrigger
entryRuleDefaultTrigger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefaultTriggerRule()); }
	iv_ruleDefaultTrigger=ruleDefaultTrigger
	{ $current=$iv_ruleDefaultTrigger.current; }
	EOF;

// Rule DefaultTrigger
ruleDefaultTrigger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DefaultTrigger'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefaultTriggerAccess().getDefaultTriggerKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getDefaultTriggerAccess().getDefaultInputTriggerParserRuleCall_1_0());
			}
			this_DefaultInputTrigger_1=ruleDefaultInputTrigger
			{
				$current = $this_DefaultInputTrigger_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getDefaultTriggerAccess().getDefaultPeriodicTimerParserRuleCall_1_1());
			}
			this_DefaultPeriodicTimer_2=ruleDefaultPeriodicTimer
			{
				$current = $this_DefaultPeriodicTimer_2.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getDefaultTriggerAccess().getDefaultObservedElementTriggerParserRuleCall_1_2());
			}
			this_DefaultObservedElementTrigger_3=ruleDefaultObservedElementTrigger
			{
				$current = $this_DefaultObservedElementTrigger_3.current;
				afterParserOrEnumRuleCall();
			}
		)
		(
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getDefaultTriggerAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleDefaultInputTrigger
entryRuleDefaultInputTrigger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefaultInputTriggerRule()); }
	iv_ruleDefaultInputTrigger=ruleDefaultInputTrigger
	{ $current=$iv_ruleDefaultInputTrigger.current; }
	EOF;

// Rule DefaultInputTrigger
ruleDefaultInputTrigger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='InputPortTrigger'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefaultInputTriggerAccess().getInputPortTriggerKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefaultInputTriggerRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDefaultInputTriggerAccess().getInputLinkInputLinkExtensionCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='prescale'
			{
				newLeafNode(otherlv_2, grammarAccess.getDefaultInputTriggerAccess().getPrescaleKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefaultInputTriggerAccess().getPrescaleEIntParserRuleCall_2_1_0());
					}
					lv_prescale_3_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefaultInputTriggerRule());
						}
						set(
							$current,
							"prescale",
							lv_prescale_3_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleDefaultPeriodicTimer
entryRuleDefaultPeriodicTimer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefaultPeriodicTimerRule()); }
	iv_ruleDefaultPeriodicTimer=ruleDefaultPeriodicTimer
	{ $current=$iv_ruleDefaultPeriodicTimer.current; }
	EOF;

// Rule DefaultPeriodicTimer
ruleDefaultPeriodicTimer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='PeriodicTimer'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicTimerKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_1_0());
				}
				lv_periodicActFreq_1_0=ruleEDouble
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefaultPeriodicTimerRule());
					}
					set(
						$current,
						"periodicActFreq",
						lv_periodicActFreq_1_0,
						"org.xtext.service.roboticMiddleware.RoboticMiddleware.EDouble");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='Hz'
		{
			newLeafNode(otherlv_2, grammarAccess.getDefaultPeriodicTimerAccess().getHzKeyword_2());
		}
	)
;

// Entry rule entryRuleDefaultObservedElementTrigger
entryRuleDefaultObservedElementTrigger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefaultObservedElementTriggerRule()); }
	iv_ruleDefaultObservedElementTrigger=ruleDefaultObservedElementTrigger
	{ $current=$iv_ruleDefaultObservedElementTrigger.current; }
	EOF;

// Rule DefaultObservedElementTrigger
ruleDefaultObservedElementTrigger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ObservedElement'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefaultObservedElementTriggerAccess().getObservedElementKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefaultObservedElementTriggerRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDefaultObservedElementTriggerAccess().getElementComponentSubNodeCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePlainOpcUaPort
entryRulePlainOpcUaPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlainOpcUaPortRule()); }
	iv_rulePlainOpcUaPort=rulePlainOpcUaPort
	{ $current=$iv_rulePlainOpcUaPort.current; }
	EOF;

// Rule PlainOpcUaPort
rulePlainOpcUaPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPlainOpcUaPortAccess().getOpcUaDeviceClientParserRuleCall_0());
		}
		this_OpcUaDeviceClient_0=ruleOpcUaDeviceClient
		{
			$current = $this_OpcUaDeviceClient_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPlainOpcUaPortAccess().getOpcUaStatusServerParserRuleCall_1());
		}
		this_OpcUaStatusServer_1=ruleOpcUaStatusServer
		{
			$current = $this_OpcUaStatusServer_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleOpcUaDeviceClient
entryRuleOpcUaDeviceClient returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOpcUaDeviceClientRule()); }
	iv_ruleOpcUaDeviceClient=ruleOpcUaDeviceClient
	{ $current=$iv_ruleOpcUaDeviceClient.current; }
	EOF;

// Rule OpcUaDeviceClient
ruleOpcUaDeviceClient returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='OpcUaDeviceClient'
		{
			newLeafNode(otherlv_0, grammarAccess.getOpcUaDeviceClientAccess().getOpcUaDeviceClientKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getOpcUaDeviceClientAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOpcUaDeviceClientRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0);
					}
								({true}?=>(otherlv_3='deviceURI'
								{
									newLeafNode(otherlv_3, grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIKeyword_2_0_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIEStringParserRuleCall_2_0_1_0());
										}
										lv_deviceURI_4_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getOpcUaDeviceClientRule());
											}
											set(
												$current,
												"deviceURI",
												lv_deviceURI_4_0,
												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1);
					}
								({true}?=>(otherlv_5='opcuaXmlFile'
								{
									newLeafNode(otherlv_5, grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileKeyword_2_1_0());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileEStringParserRuleCall_2_1_1_0());
										}
										lv_opcuaXmlFile_6_0=ruleEString
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getOpcUaDeviceClientRule());
											}
											set(
												$current,
												"opcuaXmlFile",
												lv_opcuaXmlFile_6_0,
												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
				}
		)
		(
			otherlv_7=';'
			{
				newLeafNode(otherlv_7, grammarAccess.getOpcUaDeviceClientAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleOpcUaStatusServer
entryRuleOpcUaStatusServer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOpcUaStatusServerRule()); }
	iv_ruleOpcUaStatusServer=ruleOpcUaStatusServer
	{ $current=$iv_ruleOpcUaStatusServer.current; }
	EOF;

// Rule OpcUaStatusServer
ruleOpcUaStatusServer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='OpcUaStatusServer'
		{
			newLeafNode(otherlv_0, grammarAccess.getOpcUaStatusServerAccess().getOpcUaStatusServerKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getOpcUaStatusServerAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOpcUaStatusServerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='dataProviderPort'
		{
			newLeafNode(otherlv_2, grammarAccess.getOpcUaStatusServerAccess().getDataProviderPortKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOpcUaStatusServerRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getOpcUaStatusServerAccess().getOutPortOutputPortCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getOpcUaStatusServerAccess().getSemicolonKeyword_4());
			}
		)?
	)
;

// Entry rule entryRuleCoordinationSlavePort
entryRuleCoordinationSlavePort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoordinationSlavePortRule()); }
	iv_ruleCoordinationSlavePort=ruleCoordinationSlavePort
	{ $current=$iv_ruleCoordinationSlavePort.current; }
	EOF;

// Rule CoordinationSlavePort
ruleCoordinationSlavePort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CoordinationSlavePort'
		{
			newLeafNode(otherlv_0, grammarAccess.getCoordinationSlavePortAccess().getCoordinationSlavePortKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCoordinationSlavePortAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinationSlavePortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='implements'
		{
			newLeafNode(otherlv_2, grammarAccess.getCoordinationSlavePortAccess().getImplementsKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinationSlavePortRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getCoordinationSlavePortAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCoordinationSlavePortAccess().getElementsAbstractCoordinationElementParserRuleCall_5_0());
				}
				lv_elements_5_0=ruleAbstractCoordinationElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCoordinationSlavePortRule());
					}
					add(
						$current,
						"elements",
						lv_elements_5_0,
						"org.xtext.component.componentDefinition.ComponentDefinition.AbstractCoordinationElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getCoordinationSlavePortAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleAbstractCoordinationElement
entryRuleAbstractCoordinationElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractCoordinationElementRule()); }
	iv_ruleAbstractCoordinationElement=ruleAbstractCoordinationElement
	{ $current=$iv_ruleAbstractCoordinationElement.current; }
	EOF;

// Rule AbstractCoordinationElement
ruleAbstractCoordinationElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractCoordinationElementAccess().getPublicOperationModeParserRuleCall_0());
		}
		this_PublicOperationMode_0=rulePublicOperationMode
		{
			$current = $this_PublicOperationMode_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractCoordinationElementAccess().getPrivateOperationModeParserRuleCall_1());
		}
		this_PrivateOperationMode_1=rulePrivateOperationMode
		{
			$current = $this_PrivateOperationMode_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractCoordinationElementAccess().getCommunicationServiceUsageRealizationParserRuleCall_2());
		}
		this_CommunicationServiceUsageRealization_2=ruleCommunicationServiceUsageRealization
		{
			$current = $this_CommunicationServiceUsageRealization_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractCoordinationElementAccess().getSkillRealizationsRefParserRuleCall_3());
		}
		this_SkillRealizationsRef_3=ruleSkillRealizationsRef
		{
			$current = $this_SkillRealizationsRef_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSkillRealizationsRef
entryRuleSkillRealizationsRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSkillRealizationsRefRule()); }
	iv_ruleSkillRealizationsRef=ruleSkillRealizationsRef
	{ $current=$iv_ruleSkillRealizationsRef.current; }
	EOF;

// Rule SkillRealizationsRef
ruleSkillRealizationsRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='SkillRealizationsRef'
		{
			newLeafNode(otherlv_0, grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationsRefKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSkillRealizationsRefRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationSetRefSkillRealizationSetCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getSkillRealizationsRefAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleCommunicationServiceUsageRealization
entryRuleCommunicationServiceUsageRealization returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommunicationServiceUsageRealizationRule()); }
	iv_ruleCommunicationServiceUsageRealization=ruleCommunicationServiceUsageRealization
	{ $current=$iv_ruleCommunicationServiceUsageRealization.current; }
	EOF;

// Rule CommunicationServiceUsageRealization
ruleCommunicationServiceUsageRealization returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='with'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommunicationServiceUsageRealizationAccess().getWithKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommunicationServiceUsageRealizationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageCommunicationServiceUsageCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='realizedBy'
		{
			newLeafNode(otherlv_2, grammarAccess.getCommunicationServiceUsageRealizationAccess().getRealizedByKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommunicationServiceUsageRealizationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortComponentPortCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePublicOperationMode
entryRulePublicOperationMode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPublicOperationModeRule()); }
	iv_rulePublicOperationMode=rulePublicOperationMode
	{ $current=$iv_rulePublicOperationMode.current; }
	EOF;

// Rule PublicOperationMode
rulePublicOperationMode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPublicOperationModeAccess().getPublicOperationModeAction_0(),
					$current);
			}
		)
		(
			(
				lv_isDefaultInit_1_0='default'
				{
					newLeafNode(lv_isDefaultInit_1_0, grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPublicOperationModeRule());
					}
					setWithLastConsumed($current, "isDefaultInit", true, "default");
				}
			)
		)?
		otherlv_2='PublicOperationMode'
		{
			newLeafNode(otherlv_2, grammarAccess.getPublicOperationModeAccess().getPublicOperationModeKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPublicOperationModeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getPublicOperationModeAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			otherlv_5='activates'
			{
				newLeafNode(otherlv_5, grammarAccess.getPublicOperationModeAccess().getActivatesKeyword_5_0());
			}
			otherlv_6='('
			{
				newLeafNode(otherlv_6, grammarAccess.getPublicOperationModeAccess().getLeftParenthesisKeyword_5_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPublicOperationModeRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_2_0());
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getPublicOperationModeAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPublicOperationModeRule());
							}
						}
						otherlv_9=RULE_ID
						{
							newLeafNode(otherlv_9, grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_3_1_0());
						}
					)
				)
			)*
			otherlv_10=')'
			{
				newLeafNode(otherlv_10, grammarAccess.getPublicOperationModeAccess().getRightParenthesisKeyword_5_4());
			}
		)?
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getPublicOperationModeAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRulePrivateOperationMode
entryRulePrivateOperationMode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrivateOperationModeRule()); }
	iv_rulePrivateOperationMode=rulePrivateOperationMode
	{ $current=$iv_rulePrivateOperationMode.current; }
	EOF;

// Rule PrivateOperationMode
rulePrivateOperationMode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='PrivateOperationMode'
		{
			newLeafNode(otherlv_0, grammarAccess.getPrivateOperationModeAccess().getPrivateOperationModeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPrivateOperationModeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrivateOperationModeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getPrivateOperationModeAccess().getSemicolonKeyword_2());
			}
		)?
	)
;

// Entry rule entryRuleCoordinationMasterPort
entryRuleCoordinationMasterPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoordinationMasterPortRule()); }
	iv_ruleCoordinationMasterPort=ruleCoordinationMasterPort
	{ $current=$iv_ruleCoordinationMasterPort.current; }
	EOF;

// Rule CoordinationMasterPort
ruleCoordinationMasterPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CoordinationMasterPort'
		{
			newLeafNode(otherlv_0, grammarAccess.getCoordinationMasterPortAccess().getCoordinationMasterPortKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCoordinationMasterPortAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinationMasterPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='implements'
		{
			newLeafNode(otherlv_2, grammarAccess.getCoordinationMasterPortAccess().getImplementsKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinationMasterPortRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCoordinationMasterPortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getCoordinationMasterPortAccess().getSemicolonKeyword_4());
			}
		)?
	)
;

// Entry rule entryRuleComponentParametersRef
entryRuleComponentParametersRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentParametersRefRule()); }
	iv_ruleComponentParametersRef=ruleComponentParametersRef
	{ $current=$iv_ruleComponentParametersRef.current; }
	EOF;

// Rule ComponentParametersRef
ruleComponentParametersRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ComponentParameters'
		{
			newLeafNode(otherlv_0, grammarAccess.getComponentParametersRefAccess().getComponentParametersKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentParametersRefRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getComponentParametersRefAccess().getParameterComponentParameterCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='slave'
			{
				newLeafNode(otherlv_2, grammarAccess.getComponentParametersRefAccess().getSlaveKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getComponentParametersRefRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getComponentParametersRefAccess().getSlaveCoordinationSlavePortCrossReference_2_1_0());
					}
					ruleFQN
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_4=';'
			{
				newLeafNode(otherlv_4, grammarAccess.getComponentParametersRefAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleRoboticMiddleware
entryRuleRoboticMiddleware returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoboticMiddlewareRule()); }
	iv_ruleRoboticMiddleware=ruleRoboticMiddleware
	{ $current=$iv_ruleRoboticMiddleware.current; }
	EOF;

// Rule RoboticMiddleware
ruleRoboticMiddleware returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getACE_SmartSoftParserRuleCall_0());
		}
		this_ACE_SmartSoft_0=ruleACE_SmartSoft
		{
			$current = $this_ACE_SmartSoft_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getOpcUa_SeRoNetParserRuleCall_1());
		}
		this_OpcUa_SeRoNet_1=ruleOpcUa_SeRoNet
		{
			$current = $this_OpcUa_SeRoNet_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getCORBA_SmartSoftParserRuleCall_2());
		}
		this_CORBA_SmartSoft_2=ruleCORBA_SmartSoft
		{
			$current = $this_CORBA_SmartSoft_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getDDS_SmartSoftParserRuleCall_3());
		}
		this_DDS_SmartSoft_3=ruleDDS_SmartSoft
		{
			$current = $this_DDS_SmartSoft_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNRule()); }
	iv_ruleFQN=ruleFQN
	{ $current=$iv_ruleFQN.current.getText(); }
	EOF;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleFQNW
entryRuleFQNW returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNWRule()); }
	iv_ruleFQNW=ruleFQNW
	{ $current=$iv_ruleFQNW.current.getText(); }
	EOF;

// Rule FQNW
ruleFQNW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0());
		}
		this_FQN_0=ruleFQN
		{
			$current.merge(this_FQN_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); }
	iv_ruleEDouble=ruleEDouble
	{ $current=$iv_ruleEDouble.current.getText(); }
	EOF;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

// Entry rule entryRuleEBoolean
entryRuleEBoolean returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEBooleanRule()); }
	iv_ruleEBoolean=ruleEBoolean
	{ $current=$iv_ruleEBoolean.current.getText(); }
	EOF;

// Rule EBoolean
ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='true'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
		}
		    |
		kw='false'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
		}
	)
;

// Entry rule entryRuleACE_SmartSoft
entryRuleACE_SmartSoft returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getACE_SmartSoftRule()); }
	iv_ruleACE_SmartSoft=ruleACE_SmartSoft
	{ $current=$iv_ruleACE_SmartSoft.current; }
	EOF;

// Rule ACE_SmartSoft
ruleACE_SmartSoft returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0(),
					$current);
			}
		)
		otherlv_1='ACE_SmartSoft'
		{
			newLeafNode(otherlv_1, grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1());
		}
		(
			otherlv_2='description'
			{
				newLeafNode(otherlv_2, grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getACE_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0());
					}
					lv_description_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getACE_SmartSoftRule());
						}
						set(
							$current,
							"description",
							lv_description_3_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleOpcUa_SeRoNet
entryRuleOpcUa_SeRoNet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOpcUa_SeRoNetRule()); }
	iv_ruleOpcUa_SeRoNet=ruleOpcUa_SeRoNet
	{ $current=$iv_ruleOpcUa_SeRoNet.current; }
	EOF;

// Rule OpcUa_SeRoNet
ruleOpcUa_SeRoNet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0(),
					$current);
			}
		)
		otherlv_1='OpcUa_SeRoNet'
		{
			newLeafNode(otherlv_1, grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1());
		}
		(
			otherlv_2='description'
			{
				newLeafNode(otherlv_2, grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionEStringParserRuleCall_2_1_0());
					}
					lv_description_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOpcUa_SeRoNetRule());
						}
						set(
							$current,
							"description",
							lv_description_3_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleCORBA_SmartSoft
entryRuleCORBA_SmartSoft returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCORBA_SmartSoftRule()); }
	iv_ruleCORBA_SmartSoft=ruleCORBA_SmartSoft
	{ $current=$iv_ruleCORBA_SmartSoft.current; }
	EOF;

// Rule CORBA_SmartSoft
ruleCORBA_SmartSoft returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0(),
					$current);
			}
		)
		otherlv_1='CORBA_SmartSoft'
		{
			newLeafNode(otherlv_1, grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1());
		}
		(
			otherlv_2='description'
			{
				newLeafNode(otherlv_2, grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0());
					}
					lv_description_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCORBA_SmartSoftRule());
						}
						set(
							$current,
							"description",
							lv_description_3_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleDDS_SmartSoft
entryRuleDDS_SmartSoft returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDDS_SmartSoftRule()); }
	iv_ruleDDS_SmartSoft=ruleDDS_SmartSoft
	{ $current=$iv_ruleDDS_SmartSoft.current; }
	EOF;

// Rule DDS_SmartSoft
ruleDDS_SmartSoft returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0(),
					$current);
			}
		)
		otherlv_1='DDS_SmartSoft'
		{
			newLeafNode(otherlv_1, grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1());
		}
		(
			otherlv_2='description'
			{
				newLeafNode(otherlv_2, grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDDS_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0());
					}
					lv_description_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDDS_SmartSoftRule());
						}
						set(
							$current,
							"description",
							lv_description_3_0,
							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
