package org.xtext.component.componentDocumentation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.component.componentDocumentation.services.ComponentDocumentationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentDocumentationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentDocumentation'", "'{'", "'Description'", "':'", "'Purpose'", "'License'", "'HardwareRequirements'", "'}'", "'.'", "'CoordinationSlavePort'", "'SlavePortDescription'", "'DynamicWiringPort'", "'StatePort'", "'ParameterPort'", "'ComponentPort'", "'ComponentMode'", "'NeutralMode'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalComponentDocumentationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentDocumentationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentDocumentationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentDocumentation.g"; }



     	private ComponentDocumentationGrammarAccess grammarAccess;

        public InternalComponentDocumentationParser(TokenStream input, ComponentDocumentationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentDocumentation";
       	}

       	@Override
       	protected ComponentDocumentationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentDocumentation"
    // InternalComponentDocumentation.g:105:1: entryRuleComponentDocumentation returns [EObject current=null] : iv_ruleComponentDocumentation= ruleComponentDocumentation EOF ;
    public final EObject entryRuleComponentDocumentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDocumentation = null;


        try {
            // InternalComponentDocumentation.g:105:63: (iv_ruleComponentDocumentation= ruleComponentDocumentation EOF )
            // InternalComponentDocumentation.g:106:2: iv_ruleComponentDocumentation= ruleComponentDocumentation EOF
            {
             newCompositeNode(grammarAccess.getComponentDocumentationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentDocumentation=ruleComponentDocumentation();

            state._fsp--;

             current =iv_ruleComponentDocumentation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentDocumentation"


    // $ANTLR start "ruleComponentDocumentation"
    // InternalComponentDocumentation.g:112:1: ruleComponentDocumentation returns [EObject current=null] : (otherlv_0= 'ComponentDocumentation' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) ) ) )* ) ) ) ( (lv_elements_16_0= ruleAbstractComponentDocuElement ) )* otherlv_17= '}' ) ;
    public final EObject ruleComponentDocumentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_purpose_9_0 = null;

        AntlrDatatypeRuleToken lv_license_12_0 = null;

        AntlrDatatypeRuleToken lv_hardware_15_0 = null;

        EObject lv_elements_16_0 = null;



        	enterRule();

        try {
            // InternalComponentDocumentation.g:118:2: ( (otherlv_0= 'ComponentDocumentation' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) ) ) )* ) ) ) ( (lv_elements_16_0= ruleAbstractComponentDocuElement ) )* otherlv_17= '}' ) )
            // InternalComponentDocumentation.g:119:2: (otherlv_0= 'ComponentDocumentation' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) ) ) )* ) ) ) ( (lv_elements_16_0= ruleAbstractComponentDocuElement ) )* otherlv_17= '}' )
            {
            // InternalComponentDocumentation.g:119:2: (otherlv_0= 'ComponentDocumentation' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) ) ) )* ) ) ) ( (lv_elements_16_0= ruleAbstractComponentDocuElement ) )* otherlv_17= '}' )
            // InternalComponentDocumentation.g:120:3: otherlv_0= 'ComponentDocumentation' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) ) ) )* ) ) ) ( (lv_elements_16_0= ruleAbstractComponentDocuElement ) )* otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentDocumentationAccess().getComponentDocumentationKeyword_0());
            		
            // InternalComponentDocumentation.g:124:3: ( ( ruleFQN ) )
            // InternalComponentDocumentation.g:125:4: ( ruleFQN )
            {
            // InternalComponentDocumentation.g:125:4: ( ruleFQN )
            // InternalComponentDocumentation.g:126:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDocumentationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentDocumentationAccess().getComponentComponentDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentDocumentationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentDocumentation.g:144:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalComponentDocumentation.g:145:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalComponentDocumentation.g:145:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalComponentDocumentation.g:146:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
            				
            // InternalComponentDocumentation.g:149:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) ) ) )* )
            // InternalComponentDocumentation.g:150:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalComponentDocumentation.g:150:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) ) ) )*
            loop1:
            do {
                int alt1=5;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2) ) {
                    alt1=3;
                }
                else if ( LA1_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3) ) {
                    alt1=4;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalComponentDocumentation.g:151:4: ({...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDocumentation.g:151:4: ({...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDocumentation.g:152:5: {...}? => ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDocumentation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalComponentDocumentation.g:152:119: ( ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) )
            	    // InternalComponentDocumentation.g:153:6: ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalComponentDocumentation.g:156:9: ({...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) )
            	    // InternalComponentDocumentation.g:156:10: {...}? => (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDocumentation", "true");
            	    }
            	    // InternalComponentDocumentation.g:156:19: (otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )
            	    // InternalComponentDocumentation.g:156:20: otherlv_4= 'Description' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    									newLeafNode(otherlv_4, grammarAccess.getComponentDocumentationAccess().getDescriptionKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,14,FOLLOW_7); 

            	    									newLeafNode(otherlv_5, grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalComponentDocumentation.g:164:9: ( (lv_description_6_0= ruleEString ) )
            	    // InternalComponentDocumentation.g:165:10: (lv_description_6_0= ruleEString )
            	    {
            	    // InternalComponentDocumentation.g:165:10: (lv_description_6_0= ruleEString )
            	    // InternalComponentDocumentation.g:166:11: lv_description_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getComponentDocumentationAccess().getDescriptionEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_description_6_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentDocumentationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_6_0,
            	    												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComponentDocumentation.g:189:4: ({...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDocumentation.g:189:4: ({...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDocumentation.g:190:5: {...}? => ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDocumentation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalComponentDocumentation.g:190:119: ( ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) ) )
            	    // InternalComponentDocumentation.g:191:6: ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalComponentDocumentation.g:194:9: ({...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) ) )
            	    // InternalComponentDocumentation.g:194:10: {...}? => (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDocumentation", "true");
            	    }
            	    // InternalComponentDocumentation.g:194:19: (otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) ) )
            	    // InternalComponentDocumentation.g:194:20: otherlv_7= 'Purpose' otherlv_8= ':' ( (lv_purpose_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_6); 

            	    									newLeafNode(otherlv_7, grammarAccess.getComponentDocumentationAccess().getPurposeKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,14,FOLLOW_7); 

            	    									newLeafNode(otherlv_8, grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalComponentDocumentation.g:202:9: ( (lv_purpose_9_0= ruleEString ) )
            	    // InternalComponentDocumentation.g:203:10: (lv_purpose_9_0= ruleEString )
            	    {
            	    // InternalComponentDocumentation.g:203:10: (lv_purpose_9_0= ruleEString )
            	    // InternalComponentDocumentation.g:204:11: lv_purpose_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getComponentDocumentationAccess().getPurposeEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_purpose_9_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentDocumentationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"purpose",
            	    												lv_purpose_9_0,
            	    												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComponentDocumentation.g:227:4: ({...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDocumentation.g:227:4: ({...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDocumentation.g:228:5: {...}? => ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDocumentation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalComponentDocumentation.g:228:119: ( ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) ) )
            	    // InternalComponentDocumentation.g:229:6: ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalComponentDocumentation.g:232:9: ({...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) ) )
            	    // InternalComponentDocumentation.g:232:10: {...}? => (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDocumentation", "true");
            	    }
            	    // InternalComponentDocumentation.g:232:19: (otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) ) )
            	    // InternalComponentDocumentation.g:232:20: otherlv_10= 'License' otherlv_11= ':' ( (lv_license_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_6); 

            	    									newLeafNode(otherlv_10, grammarAccess.getComponentDocumentationAccess().getLicenseKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,14,FOLLOW_7); 

            	    									newLeafNode(otherlv_11, grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalComponentDocumentation.g:240:9: ( (lv_license_12_0= ruleEString ) )
            	    // InternalComponentDocumentation.g:241:10: (lv_license_12_0= ruleEString )
            	    {
            	    // InternalComponentDocumentation.g:241:10: (lv_license_12_0= ruleEString )
            	    // InternalComponentDocumentation.g:242:11: lv_license_12_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getComponentDocumentationAccess().getLicenseEStringParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_license_12_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentDocumentationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"license",
            	    												lv_license_12_0,
            	    												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalComponentDocumentation.g:265:4: ({...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDocumentation.g:265:4: ({...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDocumentation.g:266:5: {...}? => ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDocumentation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalComponentDocumentation.g:266:119: ( ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) ) )
            	    // InternalComponentDocumentation.g:267:6: ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalComponentDocumentation.g:270:9: ({...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) ) )
            	    // InternalComponentDocumentation.g:270:10: {...}? => (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDocumentation", "true");
            	    }
            	    // InternalComponentDocumentation.g:270:19: (otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) ) )
            	    // InternalComponentDocumentation.g:270:20: otherlv_13= 'HardwareRequirements' otherlv_14= ':' ( (lv_hardware_15_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,17,FOLLOW_6); 

            	    									newLeafNode(otherlv_13, grammarAccess.getComponentDocumentationAccess().getHardwareRequirementsKeyword_3_3_0());
            	    								
            	    otherlv_14=(Token)match(input,14,FOLLOW_7); 

            	    									newLeafNode(otherlv_14, grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalComponentDocumentation.g:278:9: ( (lv_hardware_15_0= ruleEString ) )
            	    // InternalComponentDocumentation.g:279:10: (lv_hardware_15_0= ruleEString )
            	    {
            	    // InternalComponentDocumentation.g:279:10: (lv_hardware_15_0= ruleEString )
            	    // InternalComponentDocumentation.g:280:11: lv_hardware_15_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getComponentDocumentationAccess().getHardwareEStringParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_hardware_15_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentDocumentationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"hardware",
            	    												lv_hardware_15_0,
            	    												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
            				

            }

            // InternalComponentDocumentation.g:310:3: ( (lv_elements_16_0= ruleAbstractComponentDocuElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20||(LA2_0>=25 && LA2_0<=27)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalComponentDocumentation.g:311:4: (lv_elements_16_0= ruleAbstractComponentDocuElement )
            	    {
            	    // InternalComponentDocumentation.g:311:4: (lv_elements_16_0= ruleAbstractComponentDocuElement )
            	    // InternalComponentDocumentation.g:312:5: lv_elements_16_0= ruleAbstractComponentDocuElement
            	    {

            	    					newCompositeNode(grammarAccess.getComponentDocumentationAccess().getElementsAbstractComponentDocuElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_elements_16_0=ruleAbstractComponentDocuElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentDocumentationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_16_0,
            	    						"org.xtext.component.componentDocumentation.ComponentDocumentation.AbstractComponentDocuElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_17=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getComponentDocumentationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentDocumentation"


    // $ANTLR start "entryRuleFQN"
    // InternalComponentDocumentation.g:337:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalComponentDocumentation.g:337:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalComponentDocumentation.g:338:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalComponentDocumentation.g:344:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponentDocumentation.g:350:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalComponentDocumentation.g:351:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalComponentDocumentation.g:351:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalComponentDocumentation.g:352:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponentDocumentation.g:359:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalComponentDocumentation.g:360:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEString"
    // InternalComponentDocumentation.g:377:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentDocumentation.g:377:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentDocumentation.g:378:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalComponentDocumentation.g:384:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalComponentDocumentation.g:390:2: (this_STRING_0= RULE_STRING )
            // InternalComponentDocumentation.g:391:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAbstractComponentDocuElement"
    // InternalComponentDocumentation.g:401:1: entryRuleAbstractComponentDocuElement returns [EObject current=null] : iv_ruleAbstractComponentDocuElement= ruleAbstractComponentDocuElement EOF ;
    public final EObject entryRuleAbstractComponentDocuElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponentDocuElement = null;


        try {
            // InternalComponentDocumentation.g:401:69: (iv_ruleAbstractComponentDocuElement= ruleAbstractComponentDocuElement EOF )
            // InternalComponentDocumentation.g:402:2: iv_ruleAbstractComponentDocuElement= ruleAbstractComponentDocuElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractComponentDocuElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractComponentDocuElement=ruleAbstractComponentDocuElement();

            state._fsp--;

             current =iv_ruleAbstractComponentDocuElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractComponentDocuElement"


    // $ANTLR start "ruleAbstractComponentDocuElement"
    // InternalComponentDocumentation.g:408:1: ruleAbstractComponentDocuElement returns [EObject current=null] : (this_CoordinationSlavePortDocu_0= ruleCoordinationSlavePortDocu | this_ComponentServiceDocu_1= ruleComponentServiceDocu | this_AbstractModeDocu_2= ruleAbstractModeDocu ) ;
    public final EObject ruleAbstractComponentDocuElement() throws RecognitionException {
        EObject current = null;

        EObject this_CoordinationSlavePortDocu_0 = null;

        EObject this_ComponentServiceDocu_1 = null;

        EObject this_AbstractModeDocu_2 = null;



        	enterRule();

        try {
            // InternalComponentDocumentation.g:414:2: ( (this_CoordinationSlavePortDocu_0= ruleCoordinationSlavePortDocu | this_ComponentServiceDocu_1= ruleComponentServiceDocu | this_AbstractModeDocu_2= ruleAbstractModeDocu ) )
            // InternalComponentDocumentation.g:415:2: (this_CoordinationSlavePortDocu_0= ruleCoordinationSlavePortDocu | this_ComponentServiceDocu_1= ruleComponentServiceDocu | this_AbstractModeDocu_2= ruleAbstractModeDocu )
            {
            // InternalComponentDocumentation.g:415:2: (this_CoordinationSlavePortDocu_0= ruleCoordinationSlavePortDocu | this_ComponentServiceDocu_1= ruleComponentServiceDocu | this_AbstractModeDocu_2= ruleAbstractModeDocu )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
            case 27:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalComponentDocumentation.g:416:3: this_CoordinationSlavePortDocu_0= ruleCoordinationSlavePortDocu
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentDocuElementAccess().getCoordinationSlavePortDocuParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoordinationSlavePortDocu_0=ruleCoordinationSlavePortDocu();

                    state._fsp--;


                    			current = this_CoordinationSlavePortDocu_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDocumentation.g:425:3: this_ComponentServiceDocu_1= ruleComponentServiceDocu
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentDocuElementAccess().getComponentServiceDocuParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentServiceDocu_1=ruleComponentServiceDocu();

                    state._fsp--;


                    			current = this_ComponentServiceDocu_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentDocumentation.g:434:3: this_AbstractModeDocu_2= ruleAbstractModeDocu
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentDocuElementAccess().getAbstractModeDocuParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractModeDocu_2=ruleAbstractModeDocu();

                    state._fsp--;


                    			current = this_AbstractModeDocu_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractComponentDocuElement"


    // $ANTLR start "entryRuleCoordinationSlavePortDocu"
    // InternalComponentDocumentation.g:446:1: entryRuleCoordinationSlavePortDocu returns [EObject current=null] : iv_ruleCoordinationSlavePortDocu= ruleCoordinationSlavePortDocu EOF ;
    public final EObject entryRuleCoordinationSlavePortDocu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationSlavePortDocu = null;


        try {
            // InternalComponentDocumentation.g:446:66: (iv_ruleCoordinationSlavePortDocu= ruleCoordinationSlavePortDocu EOF )
            // InternalComponentDocumentation.g:447:2: iv_ruleCoordinationSlavePortDocu= ruleCoordinationSlavePortDocu EOF
            {
             newCompositeNode(grammarAccess.getCoordinationSlavePortDocuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinationSlavePortDocu=ruleCoordinationSlavePortDocu();

            state._fsp--;

             current =iv_ruleCoordinationSlavePortDocu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoordinationSlavePortDocu"


    // $ANTLR start "ruleCoordinationSlavePortDocu"
    // InternalComponentDocumentation.g:453:1: ruleCoordinationSlavePortDocu returns [EObject current=null] : (otherlv_0= 'CoordinationSlavePort' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_16= '}' ) ;
    public final EObject ruleCoordinationSlavePortDocu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_dynamicWiring_9_0 = null;

        AntlrDatatypeRuleToken lv_state_12_0 = null;

        AntlrDatatypeRuleToken lv_parameter_15_0 = null;



        	enterRule();

        try {
            // InternalComponentDocumentation.g:459:2: ( (otherlv_0= 'CoordinationSlavePort' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_16= '}' ) )
            // InternalComponentDocumentation.g:460:2: (otherlv_0= 'CoordinationSlavePort' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_16= '}' )
            {
            // InternalComponentDocumentation.g:460:2: (otherlv_0= 'CoordinationSlavePort' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_16= '}' )
            // InternalComponentDocumentation.g:461:3: otherlv_0= 'CoordinationSlavePort' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinationSlavePortDocuAccess().getCoordinationSlavePortKeyword_0());
            		
            // InternalComponentDocumentation.g:465:3: ( ( ruleFQN ) )
            // InternalComponentDocumentation.g:466:4: ( ruleFQN )
            {
            // InternalComponentDocumentation.g:466:4: ( ruleFQN )
            // InternalComponentDocumentation.g:467:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationSlavePortDocuRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoordinationSlavePortDocuAccess().getPortCoordinationSlavePortCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinationSlavePortDocuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentDocumentation.g:485:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalComponentDocumentation.g:486:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalComponentDocumentation.g:486:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalComponentDocumentation.g:487:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
            				
            // InternalComponentDocumentation.g:490:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) ) ) )* )
            // InternalComponentDocumentation.g:491:6: ( ({...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalComponentDocumentation.g:491:6: ( ({...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) ) ) )*
            loop5:
            do {
                int alt5=5;
                int LA5_0 = input.LA(1);

                if ( LA5_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1) ) {
                    alt5=2;
                }
                else if ( LA5_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2) ) {
                    alt5=3;
                }
                else if ( LA5_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3) ) {
                    alt5=4;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalComponentDocumentation.g:492:4: ({...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDocumentation.g:492:4: ({...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDocumentation.g:493:5: {...}? => ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationSlavePortDocu", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalComponentDocumentation.g:493:122: ( ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) ) )
            	    // InternalComponentDocumentation.g:494:6: ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalComponentDocumentation.g:497:9: ({...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) ) )
            	    // InternalComponentDocumentation.g:497:10: {...}? => (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationSlavePortDocu", "true");
            	    }
            	    // InternalComponentDocumentation.g:497:19: (otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )
            	    // InternalComponentDocumentation.g:497:20: otherlv_4= 'SlavePortDescription' otherlv_5= ':' ( (lv_description_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_6); 

            	    									newLeafNode(otherlv_4, grammarAccess.getCoordinationSlavePortDocuAccess().getSlavePortDescriptionKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,14,FOLLOW_7); 

            	    									newLeafNode(otherlv_5, grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalComponentDocumentation.g:505:9: ( (lv_description_6_0= ruleEString ) )
            	    // InternalComponentDocumentation.g:506:10: (lv_description_6_0= ruleEString )
            	    {
            	    // InternalComponentDocumentation.g:506:10: (lv_description_6_0= ruleEString )
            	    // InternalComponentDocumentation.g:507:11: lv_description_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getCoordinationSlavePortDocuAccess().getDescriptionEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_description_6_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCoordinationSlavePortDocuRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_6_0,
            	    												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComponentDocumentation.g:530:4: ({...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDocumentation.g:530:4: ({...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDocumentation.g:531:5: {...}? => ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationSlavePortDocu", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalComponentDocumentation.g:531:122: ( ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) ) )
            	    // InternalComponentDocumentation.g:532:6: ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalComponentDocumentation.g:535:9: ({...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) ) )
            	    // InternalComponentDocumentation.g:535:10: {...}? => (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationSlavePortDocu", "true");
            	    }
            	    // InternalComponentDocumentation.g:535:19: (otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) ) )
            	    // InternalComponentDocumentation.g:535:20: otherlv_7= 'DynamicWiringPort' otherlv_8= ':' ( (lv_dynamicWiring_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_6); 

            	    									newLeafNode(otherlv_7, grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringPortKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,14,FOLLOW_7); 

            	    									newLeafNode(otherlv_8, grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalComponentDocumentation.g:543:9: ( (lv_dynamicWiring_9_0= ruleEString ) )
            	    // InternalComponentDocumentation.g:544:10: (lv_dynamicWiring_9_0= ruleEString )
            	    {
            	    // InternalComponentDocumentation.g:544:10: (lv_dynamicWiring_9_0= ruleEString )
            	    // InternalComponentDocumentation.g:545:11: lv_dynamicWiring_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_dynamicWiring_9_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCoordinationSlavePortDocuRule());
            	    											}
            	    											set(
            	    												current,
            	    												"dynamicWiring",
            	    												lv_dynamicWiring_9_0,
            	    												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComponentDocumentation.g:568:4: ({...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDocumentation.g:568:4: ({...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDocumentation.g:569:5: {...}? => ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationSlavePortDocu", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalComponentDocumentation.g:569:122: ( ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) ) )
            	    // InternalComponentDocumentation.g:570:6: ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalComponentDocumentation.g:573:9: ({...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) ) )
            	    // InternalComponentDocumentation.g:573:10: {...}? => (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationSlavePortDocu", "true");
            	    }
            	    // InternalComponentDocumentation.g:573:19: (otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) ) )
            	    // InternalComponentDocumentation.g:573:20: otherlv_10= 'StatePort' otherlv_11= ':' ( (lv_state_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,23,FOLLOW_6); 

            	    									newLeafNode(otherlv_10, grammarAccess.getCoordinationSlavePortDocuAccess().getStatePortKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,14,FOLLOW_7); 

            	    									newLeafNode(otherlv_11, grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalComponentDocumentation.g:581:9: ( (lv_state_12_0= ruleEString ) )
            	    // InternalComponentDocumentation.g:582:10: (lv_state_12_0= ruleEString )
            	    {
            	    // InternalComponentDocumentation.g:582:10: (lv_state_12_0= ruleEString )
            	    // InternalComponentDocumentation.g:583:11: lv_state_12_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getCoordinationSlavePortDocuAccess().getStateEStringParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_state_12_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCoordinationSlavePortDocuRule());
            	    											}
            	    											set(
            	    												current,
            	    												"state",
            	    												lv_state_12_0,
            	    												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalComponentDocumentation.g:606:4: ({...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDocumentation.g:606:4: ({...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDocumentation.g:607:5: {...}? => ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationSlavePortDocu", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalComponentDocumentation.g:607:122: ( ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) ) )
            	    // InternalComponentDocumentation.g:608:6: ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalComponentDocumentation.g:611:9: ({...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) ) )
            	    // InternalComponentDocumentation.g:611:10: {...}? => (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationSlavePortDocu", "true");
            	    }
            	    // InternalComponentDocumentation.g:611:19: (otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) ) )
            	    // InternalComponentDocumentation.g:611:20: otherlv_13= 'ParameterPort' otherlv_14= ':' ( (lv_parameter_15_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,24,FOLLOW_6); 

            	    									newLeafNode(otherlv_13, grammarAccess.getCoordinationSlavePortDocuAccess().getParameterPortKeyword_3_3_0());
            	    								
            	    otherlv_14=(Token)match(input,14,FOLLOW_7); 

            	    									newLeafNode(otherlv_14, grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalComponentDocumentation.g:619:9: ( (lv_parameter_15_0= ruleEString ) )
            	    // InternalComponentDocumentation.g:620:10: (lv_parameter_15_0= ruleEString )
            	    {
            	    // InternalComponentDocumentation.g:620:10: (lv_parameter_15_0= ruleEString )
            	    // InternalComponentDocumentation.g:621:11: lv_parameter_15_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterEStringParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_parameter_15_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCoordinationSlavePortDocuRule());
            	    											}
            	    											set(
            	    												current,
            	    												"parameter",
            	    												lv_parameter_15_0,
            	    												"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
            				

            }

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getCoordinationSlavePortDocuAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoordinationSlavePortDocu"


    // $ANTLR start "entryRuleComponentServiceDocu"
    // InternalComponentDocumentation.g:659:1: entryRuleComponentServiceDocu returns [EObject current=null] : iv_ruleComponentServiceDocu= ruleComponentServiceDocu EOF ;
    public final EObject entryRuleComponentServiceDocu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentServiceDocu = null;


        try {
            // InternalComponentDocumentation.g:659:61: (iv_ruleComponentServiceDocu= ruleComponentServiceDocu EOF )
            // InternalComponentDocumentation.g:660:2: iv_ruleComponentServiceDocu= ruleComponentServiceDocu EOF
            {
             newCompositeNode(grammarAccess.getComponentServiceDocuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentServiceDocu=ruleComponentServiceDocu();

            state._fsp--;

             current =iv_ruleComponentServiceDocu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentServiceDocu"


    // $ANTLR start "ruleComponentServiceDocu"
    // InternalComponentDocumentation.g:666:1: ruleComponentServiceDocu returns [EObject current=null] : (otherlv_0= 'ComponentPort' ( ( ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) )? ( (lv_states_6_0= ruleAbstractModeDocu ) )* otherlv_7= '}' ) ;
    public final EObject ruleComponentServiceDocu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_states_6_0 = null;



        	enterRule();

        try {
            // InternalComponentDocumentation.g:672:2: ( (otherlv_0= 'ComponentPort' ( ( ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) )? ( (lv_states_6_0= ruleAbstractModeDocu ) )* otherlv_7= '}' ) )
            // InternalComponentDocumentation.g:673:2: (otherlv_0= 'ComponentPort' ( ( ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) )? ( (lv_states_6_0= ruleAbstractModeDocu ) )* otherlv_7= '}' )
            {
            // InternalComponentDocumentation.g:673:2: (otherlv_0= 'ComponentPort' ( ( ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) )? ( (lv_states_6_0= ruleAbstractModeDocu ) )* otherlv_7= '}' )
            // InternalComponentDocumentation.g:674:3: otherlv_0= 'ComponentPort' ( ( ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) )? ( (lv_states_6_0= ruleAbstractModeDocu ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentServiceDocuAccess().getComponentPortKeyword_0());
            		
            // InternalComponentDocumentation.g:678:3: ( ( ruleFQN ) )
            // InternalComponentDocumentation.g:679:4: ( ruleFQN )
            {
            // InternalComponentDocumentation.g:679:4: ( ruleFQN )
            // InternalComponentDocumentation.g:680:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentServiceDocuRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentServiceDocuAccess().getPortComponentPortCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentServiceDocuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentDocumentation.g:698:3: (otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentDocumentation.g:699:4: otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentServiceDocuAccess().getDescriptionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentServiceDocuAccess().getColonKeyword_3_1());
                    			
                    // InternalComponentDocumentation.g:707:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalComponentDocumentation.g:708:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalComponentDocumentation.g:708:5: (lv_description_5_0= ruleEString )
                    // InternalComponentDocumentation.g:709:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getComponentServiceDocuAccess().getDescriptionEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentServiceDocuRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentDocumentation.g:727:3: ( (lv_states_6_0= ruleAbstractModeDocu ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=26 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalComponentDocumentation.g:728:4: (lv_states_6_0= ruleAbstractModeDocu )
            	    {
            	    // InternalComponentDocumentation.g:728:4: (lv_states_6_0= ruleAbstractModeDocu )
            	    // InternalComponentDocumentation.g:729:5: lv_states_6_0= ruleAbstractModeDocu
            	    {

            	    					newCompositeNode(grammarAccess.getComponentServiceDocuAccess().getStatesAbstractModeDocuParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_states_6_0=ruleAbstractModeDocu();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentServiceDocuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_6_0,
            	    						"org.xtext.component.componentDocumentation.ComponentDocumentation.AbstractModeDocu");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentServiceDocuAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentServiceDocu"


    // $ANTLR start "entryRuleAbstractModeDocu"
    // InternalComponentDocumentation.g:754:1: entryRuleAbstractModeDocu returns [EObject current=null] : iv_ruleAbstractModeDocu= ruleAbstractModeDocu EOF ;
    public final EObject entryRuleAbstractModeDocu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractModeDocu = null;


        try {
            // InternalComponentDocumentation.g:754:57: (iv_ruleAbstractModeDocu= ruleAbstractModeDocu EOF )
            // InternalComponentDocumentation.g:755:2: iv_ruleAbstractModeDocu= ruleAbstractModeDocu EOF
            {
             newCompositeNode(grammarAccess.getAbstractModeDocuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractModeDocu=ruleAbstractModeDocu();

            state._fsp--;

             current =iv_ruleAbstractModeDocu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractModeDocu"


    // $ANTLR start "ruleAbstractModeDocu"
    // InternalComponentDocumentation.g:761:1: ruleAbstractModeDocu returns [EObject current=null] : (this_ComponentModeDocu_0= ruleComponentModeDocu | this_NeutralModeDocu_1= ruleNeutralModeDocu ) ;
    public final EObject ruleAbstractModeDocu() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentModeDocu_0 = null;

        EObject this_NeutralModeDocu_1 = null;



        	enterRule();

        try {
            // InternalComponentDocumentation.g:767:2: ( (this_ComponentModeDocu_0= ruleComponentModeDocu | this_NeutralModeDocu_1= ruleNeutralModeDocu ) )
            // InternalComponentDocumentation.g:768:2: (this_ComponentModeDocu_0= ruleComponentModeDocu | this_NeutralModeDocu_1= ruleNeutralModeDocu )
            {
            // InternalComponentDocumentation.g:768:2: (this_ComponentModeDocu_0= ruleComponentModeDocu | this_NeutralModeDocu_1= ruleNeutralModeDocu )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentDocumentation.g:769:3: this_ComponentModeDocu_0= ruleComponentModeDocu
                    {

                    			newCompositeNode(grammarAccess.getAbstractModeDocuAccess().getComponentModeDocuParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentModeDocu_0=ruleComponentModeDocu();

                    state._fsp--;


                    			current = this_ComponentModeDocu_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDocumentation.g:778:3: this_NeutralModeDocu_1= ruleNeutralModeDocu
                    {

                    			newCompositeNode(grammarAccess.getAbstractModeDocuAccess().getNeutralModeDocuParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NeutralModeDocu_1=ruleNeutralModeDocu();

                    state._fsp--;


                    			current = this_NeutralModeDocu_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractModeDocu"


    // $ANTLR start "entryRuleComponentModeDocu"
    // InternalComponentDocumentation.g:790:1: entryRuleComponentModeDocu returns [EObject current=null] : iv_ruleComponentModeDocu= ruleComponentModeDocu EOF ;
    public final EObject entryRuleComponentModeDocu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentModeDocu = null;


        try {
            // InternalComponentDocumentation.g:790:58: (iv_ruleComponentModeDocu= ruleComponentModeDocu EOF )
            // InternalComponentDocumentation.g:791:2: iv_ruleComponentModeDocu= ruleComponentModeDocu EOF
            {
             newCompositeNode(grammarAccess.getComponentModeDocuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentModeDocu=ruleComponentModeDocu();

            state._fsp--;

             current =iv_ruleComponentModeDocu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentModeDocu"


    // $ANTLR start "ruleComponentModeDocu"
    // InternalComponentDocumentation.g:797:1: ruleComponentModeDocu returns [EObject current=null] : (otherlv_0= 'ComponentMode' ( ( ruleFQN ) ) otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) ) ;
    public final EObject ruleComponentModeDocu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDocumentation.g:803:2: ( (otherlv_0= 'ComponentMode' ( ( ruleFQN ) ) otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) ) )
            // InternalComponentDocumentation.g:804:2: (otherlv_0= 'ComponentMode' ( ( ruleFQN ) ) otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) )
            {
            // InternalComponentDocumentation.g:804:2: (otherlv_0= 'ComponentMode' ( ( ruleFQN ) ) otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) )
            // InternalComponentDocumentation.g:805:3: otherlv_0= 'ComponentMode' ( ( ruleFQN ) ) otherlv_2= ':' ( (lv_description_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentModeDocuAccess().getComponentModeKeyword_0());
            		
            // InternalComponentDocumentation.g:809:3: ( ( ruleFQN ) )
            // InternalComponentDocumentation.g:810:4: ( ruleFQN )
            {
            // InternalComponentDocumentation.g:810:4: ( ruleFQN )
            // InternalComponentDocumentation.g:811:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentModeDocuRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentModeDocuAccess().getModePublicOperationModeCrossReference_1_0());
            				
            pushFollow(FOLLOW_6);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentModeDocuAccess().getColonKeyword_2());
            		
            // InternalComponentDocumentation.g:829:3: ( (lv_description_3_0= ruleEString ) )
            // InternalComponentDocumentation.g:830:4: (lv_description_3_0= ruleEString )
            {
            // InternalComponentDocumentation.g:830:4: (lv_description_3_0= ruleEString )
            // InternalComponentDocumentation.g:831:5: lv_description_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentModeDocuAccess().getDescriptionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentModeDocuRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentModeDocu"


    // $ANTLR start "entryRuleNeutralModeDocu"
    // InternalComponentDocumentation.g:852:1: entryRuleNeutralModeDocu returns [EObject current=null] : iv_ruleNeutralModeDocu= ruleNeutralModeDocu EOF ;
    public final EObject entryRuleNeutralModeDocu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeutralModeDocu = null;


        try {
            // InternalComponentDocumentation.g:852:56: (iv_ruleNeutralModeDocu= ruleNeutralModeDocu EOF )
            // InternalComponentDocumentation.g:853:2: iv_ruleNeutralModeDocu= ruleNeutralModeDocu EOF
            {
             newCompositeNode(grammarAccess.getNeutralModeDocuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeutralModeDocu=ruleNeutralModeDocu();

            state._fsp--;

             current =iv_ruleNeutralModeDocu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNeutralModeDocu"


    // $ANTLR start "ruleNeutralModeDocu"
    // InternalComponentDocumentation.g:859:1: ruleNeutralModeDocu returns [EObject current=null] : ( () otherlv_1= 'NeutralMode' otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) ) ;
    public final EObject ruleNeutralModeDocu() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDocumentation.g:865:2: ( ( () otherlv_1= 'NeutralMode' otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) ) )
            // InternalComponentDocumentation.g:866:2: ( () otherlv_1= 'NeutralMode' otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) )
            {
            // InternalComponentDocumentation.g:866:2: ( () otherlv_1= 'NeutralMode' otherlv_2= ':' ( (lv_description_3_0= ruleEString ) ) )
            // InternalComponentDocumentation.g:867:3: () otherlv_1= 'NeutralMode' otherlv_2= ':' ( (lv_description_3_0= ruleEString ) )
            {
            // InternalComponentDocumentation.g:867:3: ()
            // InternalComponentDocumentation.g:868:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNeutralModeDocuAccess().getNeutralModeDocuAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getNeutralModeDocuAccess().getNeutralModeKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getNeutralModeDocuAccess().getColonKeyword_2());
            		
            // InternalComponentDocumentation.g:882:3: ( (lv_description_3_0= ruleEString ) )
            // InternalComponentDocumentation.g:883:4: (lv_description_3_0= ruleEString )
            {
            // InternalComponentDocumentation.g:883:4: (lv_description_3_0= ruleEString )
            // InternalComponentDocumentation.g:884:5: lv_description_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNeutralModeDocuAccess().getDescriptionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNeutralModeDocuRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.component.componentDocumentation.ComponentDocumentation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNeutralModeDocu"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000E17A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000E140000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001E40000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000E142000L});

}
