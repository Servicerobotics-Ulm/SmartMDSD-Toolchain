package org.xtext.system.systemParameter.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.system.systemParameter.services.SystemParameterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSystemParameterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOCU_COMMENT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_WS", "RULE_ANY_OTHER", "'SystemParameterModel'", "'extendsSystem'", "'{'", "'}'", "'ComponentParameterInstance'", "'refinesParamStruct'", "'ParameterRefinement'", "'='", "';'", "'.'", "'true'", "'false'", "'-'", "'E'", "'e'", "'InlineEnumeration'", "'['", "']'", "'*'", "','", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'"
    };
    public static final int RULE_ML_DOCUMENTATION=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int RULE_DOCU_COMMENT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_SL_DOCUMENTATION=11;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSystemParameterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSystemParameterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSystemParameterParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSystemParameter.g"; }



     	private SystemParameterGrammarAccess grammarAccess;

        public InternalSystemParameterParser(TokenStream input, SystemParameterGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SystemParamModel";
       	}

       	@Override
       	protected SystemParameterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystemParamModel"
    // InternalSystemParameter.g:80:1: entryRuleSystemParamModel returns [EObject current=null] : iv_ruleSystemParamModel= ruleSystemParamModel EOF ;
    public final EObject entryRuleSystemParamModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemParamModel = null;


        try {
            // InternalSystemParameter.g:80:57: (iv_ruleSystemParamModel= ruleSystemParamModel EOF )
            // InternalSystemParameter.g:81:2: iv_ruleSystemParamModel= ruleSystemParamModel EOF
            {
             newCompositeNode(grammarAccess.getSystemParamModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemParamModel=ruleSystemParamModel();

            state._fsp--;

             current =iv_ruleSystemParamModel; 
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
    // $ANTLR end "entryRuleSystemParamModel"


    // $ANTLR start "ruleSystemParamModel"
    // InternalSystemParameter.g:87:1: ruleSystemParamModel returns [EObject current=null] : ( () otherlv_1= 'SystemParameterModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'extendsSystem' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_components_6_0= ruleComponentParameterInstance ) )* otherlv_7= '}' ) ;
    public final EObject ruleSystemParamModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_components_6_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:93:2: ( ( () otherlv_1= 'SystemParameterModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'extendsSystem' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_components_6_0= ruleComponentParameterInstance ) )* otherlv_7= '}' ) )
            // InternalSystemParameter.g:94:2: ( () otherlv_1= 'SystemParameterModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'extendsSystem' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_components_6_0= ruleComponentParameterInstance ) )* otherlv_7= '}' )
            {
            // InternalSystemParameter.g:94:2: ( () otherlv_1= 'SystemParameterModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'extendsSystem' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_components_6_0= ruleComponentParameterInstance ) )* otherlv_7= '}' )
            // InternalSystemParameter.g:95:3: () otherlv_1= 'SystemParameterModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'extendsSystem' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_components_6_0= ruleComponentParameterInstance ) )* otherlv_7= '}'
            {
            // InternalSystemParameter.g:95:3: ()
            // InternalSystemParameter.g:96:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemParamModelAccess().getSystemParamModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemParamModelAccess().getSystemParameterModelKeyword_1());
            		
            // InternalSystemParameter.g:106:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSystemParameter.g:107:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSystemParameter.g:107:4: (lv_name_2_0= RULE_ID )
            // InternalSystemParameter.g:108:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSystemParamModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemParamModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemParamModelAccess().getExtendsSystemKeyword_3());
            		
            // InternalSystemParameter.g:128:3: ( ( ruleFQN ) )
            // InternalSystemParameter.g:129:4: ( ruleFQN )
            {
            // InternalSystemParameter.g:129:4: ( ruleFQN )
            // InternalSystemParameter.g:130:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemParamModelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSystemParamModelAccess().getSystemSystemComponentArchitectureCrossReference_4_0());
            				
            pushFollow(FOLLOW_5);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemParamModelAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSystemParameter.g:148:3: ( (lv_components_6_0= ruleComponentParameterInstance ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSystemParameter.g:149:4: (lv_components_6_0= ruleComponentParameterInstance )
            	    {
            	    // InternalSystemParameter.g:149:4: (lv_components_6_0= ruleComponentParameterInstance )
            	    // InternalSystemParameter.g:150:5: lv_components_6_0= ruleComponentParameterInstance
            	    {

            	    					newCompositeNode(grammarAccess.getSystemParamModelAccess().getComponentsComponentParameterInstanceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_components_6_0=ruleComponentParameterInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemParamModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_6_0,
            	    						"org.xtext.system.systemParameter.SystemParameter.ComponentParameterInstance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSystemParamModelAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSystemParamModel"


    // $ANTLR start "entryRuleComponentParameterInstance"
    // InternalSystemParameter.g:175:1: entryRuleComponentParameterInstance returns [EObject current=null] : iv_ruleComponentParameterInstance= ruleComponentParameterInstance EOF ;
    public final EObject entryRuleComponentParameterInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentParameterInstance = null;


        try {
            // InternalSystemParameter.g:175:67: (iv_ruleComponentParameterInstance= ruleComponentParameterInstance EOF )
            // InternalSystemParameter.g:176:2: iv_ruleComponentParameterInstance= ruleComponentParameterInstance EOF
            {
             newCompositeNode(grammarAccess.getComponentParameterInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentParameterInstance=ruleComponentParameterInstance();

            state._fsp--;

             current =iv_ruleComponentParameterInstance; 
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
    // $ANTLR end "entryRuleComponentParameterInstance"


    // $ANTLR start "ruleComponentParameterInstance"
    // InternalSystemParameter.g:182:1: ruleComponentParameterInstance returns [EObject current=null] : (otherlv_0= 'ComponentParameterInstance' ( ( ruleFQN ) ) (otherlv_2= 'refinesParamStruct' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterRefinement ) )* otherlv_6= '}' ) ;
    public final EObject ruleComponentParameterInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:188:2: ( (otherlv_0= 'ComponentParameterInstance' ( ( ruleFQN ) ) (otherlv_2= 'refinesParamStruct' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterRefinement ) )* otherlv_6= '}' ) )
            // InternalSystemParameter.g:189:2: (otherlv_0= 'ComponentParameterInstance' ( ( ruleFQN ) ) (otherlv_2= 'refinesParamStruct' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterRefinement ) )* otherlv_6= '}' )
            {
            // InternalSystemParameter.g:189:2: (otherlv_0= 'ComponentParameterInstance' ( ( ruleFQN ) ) (otherlv_2= 'refinesParamStruct' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterRefinement ) )* otherlv_6= '}' )
            // InternalSystemParameter.g:190:3: otherlv_0= 'ComponentParameterInstance' ( ( ruleFQN ) ) (otherlv_2= 'refinesParamStruct' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterRefinement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentParameterInstanceAccess().getComponentParameterInstanceKeyword_0());
            		
            // InternalSystemParameter.g:194:3: ( ( ruleFQN ) )
            // InternalSystemParameter.g:195:4: ( ruleFQN )
            {
            // InternalSystemParameter.g:195:4: ( ruleFQN )
            // InternalSystemParameter.g:196:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentParameterInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentParameterInstanceAccess().getComponentInstanceComponentInstanceCrossReference_1_0());
            				
            pushFollow(FOLLOW_7);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystemParameter.g:210:3: (otherlv_2= 'refinesParamStruct' ( ( ruleFQN ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSystemParameter.g:211:4: otherlv_2= 'refinesParamStruct' ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentParameterInstanceAccess().getRefinesParamStructKeyword_2_0());
                    			
                    // InternalSystemParameter.g:215:4: ( ( ruleFQN ) )
                    // InternalSystemParameter.g:216:5: ( ruleFQN )
                    {
                    // InternalSystemParameter.g:216:5: ( ruleFQN )
                    // InternalSystemParameter.g:217:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentParameterInstanceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentParameterInstanceAccess().getComponentParamComponentParameterCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentParameterInstanceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSystemParameter.g:236:3: ( (lv_parameters_5_0= ruleParameterRefinement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOCU_COMMENT||LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSystemParameter.g:237:4: (lv_parameters_5_0= ruleParameterRefinement )
            	    {
            	    // InternalSystemParameter.g:237:4: (lv_parameters_5_0= ruleParameterRefinement )
            	    // InternalSystemParameter.g:238:5: lv_parameters_5_0= ruleParameterRefinement
            	    {

            	    					newCompositeNode(grammarAccess.getComponentParameterInstanceAccess().getParametersParameterRefinementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_parameters_5_0=ruleParameterRefinement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentParameterInstanceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_5_0,
            	    						"org.xtext.system.systemParameter.SystemParameter.ParameterRefinement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentParameterInstanceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleComponentParameterInstance"


    // $ANTLR start "entryRuleParameterRefinement"
    // InternalSystemParameter.g:263:1: entryRuleParameterRefinement returns [EObject current=null] : iv_ruleParameterRefinement= ruleParameterRefinement EOF ;
    public final EObject entryRuleParameterRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterRefinement = null;


        try {
            // InternalSystemParameter.g:263:60: (iv_ruleParameterRefinement= ruleParameterRefinement EOF )
            // InternalSystemParameter.g:264:2: iv_ruleParameterRefinement= ruleParameterRefinement EOF
            {
             newCompositeNode(grammarAccess.getParameterRefinementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterRefinement=ruleParameterRefinement();

            state._fsp--;

             current =iv_ruleParameterRefinement; 
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
    // $ANTLR end "entryRuleParameterRefinement"


    // $ANTLR start "ruleParameterRefinement"
    // InternalSystemParameter.g:270:1: ruleParameterRefinement returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterRefinement' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeRefinement ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:276:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterRefinement' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeRefinement ) )* otherlv_5= '}' ) )
            // InternalSystemParameter.g:277:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterRefinement' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeRefinement ) )* otherlv_5= '}' )
            {
            // InternalSystemParameter.g:277:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterRefinement' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeRefinement ) )* otherlv_5= '}' )
            // InternalSystemParameter.g:278:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterRefinement' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeRefinement ) )* otherlv_5= '}'
            {
            // InternalSystemParameter.g:278:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOCU_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSystemParameter.g:279:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalSystemParameter.g:279:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalSystemParameter.g:280:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_9); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getParameterRefinementAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRefinementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_0_0,
                    						"org.xtext.base.docuterminals.DocuTerminals.DOCU_COMMENT");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterRefinementAccess().getParameterRefinementKeyword_1());
            		
            // InternalSystemParameter.g:300:3: ( ( ruleFQN ) )
            // InternalSystemParameter.g:301:4: ( ruleFQN )
            {
            // InternalSystemParameter.g:301:4: ( ruleFQN )
            // InternalSystemParameter.g:302:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRefinementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterRefinementAccess().getParameterComponentParameterBaseCrossReference_2_0());
            				
            pushFollow(FOLLOW_5);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterRefinementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSystemParameter.g:320:3: ( (lv_attributes_4_0= ruleAttributeRefinement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_DOCU_COMMENT)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSystemParameter.g:321:4: (lv_attributes_4_0= ruleAttributeRefinement )
            	    {
            	    // InternalSystemParameter.g:321:4: (lv_attributes_4_0= ruleAttributeRefinement )
            	    // InternalSystemParameter.g:322:5: lv_attributes_4_0= ruleAttributeRefinement
            	    {

            	    					newCompositeNode(grammarAccess.getParameterRefinementAccess().getAttributesAttributeRefinementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_attributes_4_0=ruleAttributeRefinement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterRefinementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_4_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeRefinement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterRefinementAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameterRefinement"


    // $ANTLR start "entryRuleAttributeRefinement"
    // InternalSystemParameter.g:347:1: entryRuleAttributeRefinement returns [EObject current=null] : iv_ruleAttributeRefinement= ruleAttributeRefinement EOF ;
    public final EObject entryRuleAttributeRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeRefinement = null;


        try {
            // InternalSystemParameter.g:347:60: (iv_ruleAttributeRefinement= ruleAttributeRefinement EOF )
            // InternalSystemParameter.g:348:2: iv_ruleAttributeRefinement= ruleAttributeRefinement EOF
            {
             newCompositeNode(grammarAccess.getAttributeRefinementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeRefinement=ruleAttributeRefinement();

            state._fsp--;

             current =iv_ruleAttributeRefinement; 
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
    // $ANTLR end "entryRuleAttributeRefinement"


    // $ANTLR start "ruleAttributeRefinement"
    // InternalSystemParameter.g:354:1: ruleAttributeRefinement returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( ( ruleFQN ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractValue ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleAttributeRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:360:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( ( ruleFQN ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractValue ) ) (otherlv_4= ';' )? ) )
            // InternalSystemParameter.g:361:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( ( ruleFQN ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractValue ) ) (otherlv_4= ';' )? )
            {
            // InternalSystemParameter.g:361:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( ( ruleFQN ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractValue ) ) (otherlv_4= ';' )? )
            // InternalSystemParameter.g:362:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( ( ruleFQN ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractValue ) ) (otherlv_4= ';' )?
            {
            // InternalSystemParameter.g:362:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOCU_COMMENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSystemParameter.g:363:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalSystemParameter.g:363:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalSystemParameter.g:364:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_3); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getAttributeRefinementAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRefinementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_0_0,
                    						"org.xtext.base.docuterminals.DocuTerminals.DOCU_COMMENT");
                    				

                    }


                    }
                    break;

            }

            // InternalSystemParameter.g:380:3: ( ( ruleFQN ) )
            // InternalSystemParameter.g:381:4: ( ruleFQN )
            {
            // InternalSystemParameter.g:381:4: ( ruleFQN )
            // InternalSystemParameter.g:382:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRefinementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_11);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeRefinementAccess().getEqualsSignKeyword_2());
            		
            // InternalSystemParameter.g:400:3: ( (lv_value_3_0= ruleAbstractValue ) )
            // InternalSystemParameter.g:401:4: (lv_value_3_0= ruleAbstractValue )
            {
            // InternalSystemParameter.g:401:4: (lv_value_3_0= ruleAbstractValue )
            // InternalSystemParameter.g:402:5: lv_value_3_0= ruleAbstractValue
            {

            					newCompositeNode(grammarAccess.getAttributeRefinementAccess().getValueAbstractValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_value_3_0=ruleAbstractValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRefinementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.AbstractValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystemParameter.g:419:3: (otherlv_4= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSystemParameter.g:420:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeRefinementAccess().getSemicolonKeyword_4());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleAttributeRefinement"


    // $ANTLR start "entryRuleFQN"
    // InternalSystemParameter.g:429:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalSystemParameter.g:429:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalSystemParameter.g:430:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalSystemParameter.g:436:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSystemParameter.g:442:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSystemParameter.g:443:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSystemParameter.g:443:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSystemParameter.g:444:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalSystemParameter.g:451:3: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSystemParameter.g:452:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalSystemParameter.g:469:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalSystemParameter.g:469:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalSystemParameter.g:470:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalSystemParameter.g:476:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSystemParameter.g:482:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalSystemParameter.g:483:2: (kw= 'true' | kw= 'false' )
            {
            // InternalSystemParameter.g:483:2: (kw= 'true' | kw= 'false' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSystemParameter.g:484:3: kw= 'true'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:490:3: kw= 'false'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEString"
    // InternalSystemParameter.g:499:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSystemParameter.g:499:47: (iv_ruleEString= ruleEString EOF )
            // InternalSystemParameter.g:500:2: iv_ruleEString= ruleEString EOF
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
    // InternalSystemParameter.g:506:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSystemParameter.g:512:2: (this_STRING_0= RULE_STRING )
            // InternalSystemParameter.g:513:2: this_STRING_0= RULE_STRING
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


    // $ANTLR start "entryRuleEInt"
    // InternalSystemParameter.g:523:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSystemParameter.g:523:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSystemParameter.g:524:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSystemParameter.g:530:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSystemParameter.g:536:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSystemParameter.g:537:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSystemParameter.g:537:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSystemParameter.g:538:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSystemParameter.g:538:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSystemParameter.g:539:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // InternalSystemParameter.g:556:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalSystemParameter.g:556:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalSystemParameter.g:557:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalSystemParameter.g:563:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalSystemParameter.g:569:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalSystemParameter.g:570:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalSystemParameter.g:570:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalSystemParameter.g:571:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalSystemParameter.g:571:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSystemParameter.g:572:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSystemParameter.g:578:3: (this_INT_1= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSystemParameter.g:579:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_17); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,23,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_18); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalSystemParameter.g:599:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=27 && LA15_0<=28)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSystemParameter.g:600:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalSystemParameter.g:600:4: (kw= 'E' | kw= 'e' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==27) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==28) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalSystemParameter.g:601:5: kw= 'E'
                            {
                            kw=(Token)match(input,27,FOLLOW_19); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSystemParameter.g:607:5: kw= 'e'
                            {
                            kw=(Token)match(input,28,FOLLOW_19); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSystemParameter.g:613:4: (kw= '-' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==26) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalSystemParameter.g:614:5: kw= '-'
                            {
                            kw=(Token)match(input,26,FOLLOW_15); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEnumerationElement"
    // InternalSystemParameter.g:632:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalSystemParameter.g:632:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalSystemParameter.g:633:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
            {
             newCompositeNode(grammarAccess.getEnumerationElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationElement=ruleEnumerationElement();

            state._fsp--;

             current =iv_ruleEnumerationElement; 
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
    // $ANTLR end "entryRuleEnumerationElement"


    // $ANTLR start "ruleEnumerationElement"
    // InternalSystemParameter.g:639:1: ruleEnumerationElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:645:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) )
            // InternalSystemParameter.g:646:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            {
            // InternalSystemParameter.g:646:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            // InternalSystemParameter.g:647:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )?
            {
            // InternalSystemParameter.g:647:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSystemParameter.g:648:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSystemParameter.g:648:4: (lv_name_0_0= RULE_ID )
            // InternalSystemParameter.g:649:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEnumerationElementAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSystemParameter.g:665:3: (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSystemParameter.g:666:4: otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalSystemParameter.g:670:4: ( (lv_value_2_0= ruleEInt ) )
                    // InternalSystemParameter.g:671:5: (lv_value_2_0= ruleEInt )
                    {
                    // InternalSystemParameter.g:671:5: (lv_value_2_0= ruleEInt )
                    // InternalSystemParameter.g:672:6: lv_value_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEnumerationElementAccess().getValueEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_value_2_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationElementRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSystemParameter.g:690:3: (otherlv_3= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSystemParameter.g:691:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEnumerationElement"


    // $ANTLR start "entryRuleAbstractAttributeType"
    // InternalSystemParameter.g:700:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // InternalSystemParameter.g:700:62: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // InternalSystemParameter.g:701:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAbstractAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractAttributeType=ruleAbstractAttributeType();

            state._fsp--;

             current =iv_ruleAbstractAttributeType; 
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
    // $ANTLR end "entryRuleAbstractAttributeType"


    // $ANTLR start "ruleAbstractAttributeType"
    // InternalSystemParameter.g:707:1: ruleAbstractAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_InlineEnumerationType_1 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:713:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) )
            // InternalSystemParameter.g:714:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            {
            // InternalSystemParameter.g:714:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=34 && LA18_0<=45)) ) {
                alt18=1;
            }
            else if ( (LA18_0==29) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSystemParameter.g:715:3: this_PrimitiveType_0= rulePrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;


                    			current = this_PrimitiveType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:724:3: this_InlineEnumerationType_1= ruleInlineEnumerationType
                    {

                    			newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getInlineEnumerationTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InlineEnumerationType_1=ruleInlineEnumerationType();

                    state._fsp--;


                    			current = this_InlineEnumerationType_1;
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
    // $ANTLR end "ruleAbstractAttributeType"


    // $ANTLR start "entryRuleInlineEnumerationType"
    // InternalSystemParameter.g:736:1: entryRuleInlineEnumerationType returns [EObject current=null] : iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF ;
    public final EObject entryRuleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineEnumerationType = null;


        try {
            // InternalSystemParameter.g:736:62: (iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF )
            // InternalSystemParameter.g:737:2: iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF
            {
             newCompositeNode(grammarAccess.getInlineEnumerationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInlineEnumerationType=ruleInlineEnumerationType();

            state._fsp--;

             current =iv_ruleInlineEnumerationType; 
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
    // $ANTLR end "entryRuleInlineEnumerationType"


    // $ANTLR start "ruleInlineEnumerationType"
    // InternalSystemParameter.g:743:1: ruleInlineEnumerationType returns [EObject current=null] : (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_array_1_0 = null;

        EObject lv_enums_3_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:749:2: ( (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) )
            // InternalSystemParameter.g:750:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            {
            // InternalSystemParameter.g:750:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            // InternalSystemParameter.g:751:3: otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0());
            		
            // InternalSystemParameter.g:755:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSystemParameter.g:756:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalSystemParameter.g:756:4: (lv_array_1_0= ruleArrayType )
                    // InternalSystemParameter.g:757:5: lv_array_1_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getArrayArrayTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_array_1_0=ruleArrayType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInlineEnumerationTypeRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_1_0,
                    						"org.xtext.base.basicAttributes.BasicAttributes.ArrayType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSystemParameter.g:778:3: ( (lv_enums_3_0= ruleEnumerationElement ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSystemParameter.g:779:4: (lv_enums_3_0= ruleEnumerationElement )
            	    {
            	    // InternalSystemParameter.g:779:4: (lv_enums_3_0= ruleEnumerationElement )
            	    // InternalSystemParameter.g:780:5: lv_enums_3_0= ruleEnumerationElement
            	    {

            	    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_enums_3_0=ruleEnumerationElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInlineEnumerationTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"enums",
            	    						lv_enums_3_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.EnumerationElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInlineEnumerationType"


    // $ANTLR start "entryRuleArrayType"
    // InternalSystemParameter.g:805:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalSystemParameter.g:805:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalSystemParameter.g:806:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalSystemParameter.g:812:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:818:2: ( ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) )
            // InternalSystemParameter.g:819:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            {
            // InternalSystemParameter.g:819:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            // InternalSystemParameter.g:820:3: () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']'
            {
            // InternalSystemParameter.g:820:3: ()
            // InternalSystemParameter.g:821:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSystemParameter.g:831:3: ( (lv_length_2_0= ruleCardinality ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT||LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSystemParameter.g:832:4: (lv_length_2_0= ruleCardinality )
                    {
                    // InternalSystemParameter.g:832:4: (lv_length_2_0= ruleCardinality )
                    // InternalSystemParameter.g:833:5: lv_length_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_length_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    					}
                    					set(
                    						current,
                    						"length",
                    						lv_length_2_0,
                    						"org.xtext.base.basicAttributes.BasicAttributes.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleCardinality"
    // InternalSystemParameter.g:858:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalSystemParameter.g:858:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalSystemParameter.g:859:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality.getText(); 
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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalSystemParameter.g:865:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSystemParameter.g:871:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalSystemParameter.g:872:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalSystemParameter.g:872:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            else if ( (LA22_0==32) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSystemParameter.g:873:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:881:3: kw= '*'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskKeyword_1());
                    		

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalSystemParameter.g:890:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalSystemParameter.g:890:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalSystemParameter.g:891:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalSystemParameter.g:897:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeName_0_0 = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:903:2: ( ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) )
            // InternalSystemParameter.g:904:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            {
            // InternalSystemParameter.g:904:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            // InternalSystemParameter.g:905:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )?
            {
            // InternalSystemParameter.g:905:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) )
            // InternalSystemParameter.g:906:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            {
            // InternalSystemParameter.g:906:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            // InternalSystemParameter.g:907:5: lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_typeName_0_0=rulePRIMITIVE_TYPE_NAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_0_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.PRIMITIVE_TYPE_NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystemParameter.g:924:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSystemParameter.g:925:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalSystemParameter.g:925:4: (lv_array_1_0= ruleArrayType )
                    // InternalSystemParameter.g:926:5: lv_array_1_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getArrayArrayTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_1_0=ruleArrayType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_1_0,
                    						"org.xtext.base.basicAttributes.BasicAttributes.ArrayType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleAbstractValue"
    // InternalSystemParameter.g:947:1: entryRuleAbstractValue returns [EObject current=null] : iv_ruleAbstractValue= ruleAbstractValue EOF ;
    public final EObject entryRuleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractValue = null;


        try {
            // InternalSystemParameter.g:947:54: (iv_ruleAbstractValue= ruleAbstractValue EOF )
            // InternalSystemParameter.g:948:2: iv_ruleAbstractValue= ruleAbstractValue EOF
            {
             newCompositeNode(grammarAccess.getAbstractValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractValue=ruleAbstractValue();

            state._fsp--;

             current =iv_ruleAbstractValue; 
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
    // $ANTLR end "entryRuleAbstractValue"


    // $ANTLR start "ruleAbstractValue"
    // InternalSystemParameter.g:954:1: ruleAbstractValue returns [EObject current=null] : (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) ;
    public final EObject ruleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValue_0 = null;

        EObject this_ArrayValue_1 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:960:2: ( (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) )
            // InternalSystemParameter.g:961:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            {
            // InternalSystemParameter.g:961:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||(LA24_0>=RULE_STRING && LA24_0<=RULE_INT)||(LA24_0>=23 && LA24_0<=26)) ) {
                alt24=1;
            }
            else if ( (LA24_0==30) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSystemParameter.g:962:3: this_SingleValue_0= ruleSingleValue
                    {

                    			newCompositeNode(grammarAccess.getAbstractValueAccess().getSingleValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleValue_0=ruleSingleValue();

                    state._fsp--;


                    			current = this_SingleValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:971:3: this_ArrayValue_1= ruleArrayValue
                    {

                    			newCompositeNode(grammarAccess.getAbstractValueAccess().getArrayValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayValue_1=ruleArrayValue();

                    state._fsp--;


                    			current = this_ArrayValue_1;
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
    // $ANTLR end "ruleAbstractValue"


    // $ANTLR start "entryRuleArrayValue"
    // InternalSystemParameter.g:983:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalSystemParameter.g:983:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalSystemParameter.g:984:2: iv_ruleArrayValue= ruleArrayValue EOF
            {
             newCompositeNode(grammarAccess.getArrayValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayValue=ruleArrayValue();

            state._fsp--;

             current =iv_ruleArrayValue; 
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
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalSystemParameter.g:990:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:996:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) )
            // InternalSystemParameter.g:997:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            {
            // InternalSystemParameter.g:997:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            // InternalSystemParameter.g:998:3: otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSystemParameter.g:1002:3: ( (lv_values_1_0= ruleSingleValue ) )
            // InternalSystemParameter.g:1003:4: (lv_values_1_0= ruleSingleValue )
            {
            // InternalSystemParameter.g:1003:4: (lv_values_1_0= ruleSingleValue )
            // InternalSystemParameter.g:1004:5: lv_values_1_0= ruleSingleValue
            {

            					newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_values_1_0=ruleSingleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrayValueRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_1_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.SingleValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystemParameter.g:1021:3: (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSystemParameter.g:1022:4: otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_26); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSystemParameter.g:1026:4: ( (lv_values_3_0= ruleSingleValue ) )
            	    // InternalSystemParameter.g:1027:5: (lv_values_3_0= ruleSingleValue )
            	    {
            	    // InternalSystemParameter.g:1027:5: (lv_values_3_0= ruleSingleValue )
            	    // InternalSystemParameter.g:1028:6: lv_values_3_0= ruleSingleValue
            	    {

            	    						newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_values_3_0=ruleSingleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArrayValueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.xtext.base.basicAttributes.BasicAttributes.SingleValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleSingleValue"
    // InternalSystemParameter.g:1054:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalSystemParameter.g:1054:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalSystemParameter.g:1055:2: iv_ruleSingleValue= ruleSingleValue EOF
            {
             newCompositeNode(grammarAccess.getSingleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleValue=ruleSingleValue();

            state._fsp--;

             current =iv_ruleSingleValue; 
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
    // $ANTLR end "entryRuleSingleValue"


    // $ANTLR start "ruleSingleValue"
    // InternalSystemParameter.g:1061:1: ruleSingleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:1067:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) )
            // InternalSystemParameter.g:1068:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            {
            // InternalSystemParameter.g:1068:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_INT) ) {
                    int LA26_2 = input.LA(3);

                    if ( (LA26_2==EOF||(LA26_2>=RULE_ID && LA26_2<=RULE_DOCU_COMMENT)||LA26_2==17||LA26_2==22||LA26_2==31||LA26_2==33) ) {
                        alt26=1;
                    }
                    else if ( (LA26_2==23) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA26_1==23) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==EOF||(LA26_2>=RULE_ID && LA26_2<=RULE_DOCU_COMMENT)||LA26_2==17||LA26_2==22||LA26_2==31||LA26_2==33) ) {
                    alt26=1;
                }
                else if ( (LA26_2==23) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt26=2;
                }
                break;
            case RULE_STRING:
                {
                alt26=3;
                }
                break;
            case 24:
            case 25:
                {
                alt26=4;
                }
                break;
            case RULE_ID:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalSystemParameter.g:1069:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalSystemParameter.g:1069:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalSystemParameter.g:1070:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalSystemParameter.g:1070:4: ()
                    // InternalSystemParameter.g:1071:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getIntValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSystemParameter.g:1077:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalSystemParameter.g:1078:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalSystemParameter.g:1078:5: (lv_value_1_0= ruleEInt )
                    // InternalSystemParameter.g:1079:6: lv_value_1_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEIntParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:1098:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    {
                    // InternalSystemParameter.g:1098:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    // InternalSystemParameter.g:1099:4: () ( (lv_value_3_0= ruleEDouble ) )
                    {
                    // InternalSystemParameter.g:1099:4: ()
                    // InternalSystemParameter.g:1100:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSystemParameter.g:1106:4: ( (lv_value_3_0= ruleEDouble ) )
                    // InternalSystemParameter.g:1107:5: (lv_value_3_0= ruleEDouble )
                    {
                    // InternalSystemParameter.g:1107:5: (lv_value_3_0= ruleEDouble )
                    // InternalSystemParameter.g:1108:6: lv_value_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEDoubleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSystemParameter.g:1127:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    {
                    // InternalSystemParameter.g:1127:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    // InternalSystemParameter.g:1128:4: () ( (lv_value_5_0= ruleEString ) )
                    {
                    // InternalSystemParameter.g:1128:4: ()
                    // InternalSystemParameter.g:1129:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getStringValueAction_2_0(),
                    						current);
                    				

                    }

                    // InternalSystemParameter.g:1135:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalSystemParameter.g:1136:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalSystemParameter.g:1136:5: (lv_value_5_0= ruleEString )
                    // InternalSystemParameter.g:1137:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSystemParameter.g:1156:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    {
                    // InternalSystemParameter.g:1156:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    // InternalSystemParameter.g:1157:4: () ( (lv_value_7_0= ruleEBoolean ) )
                    {
                    // InternalSystemParameter.g:1157:4: ()
                    // InternalSystemParameter.g:1158:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getBoolValueAction_3_0(),
                    						current);
                    				

                    }

                    // InternalSystemParameter.g:1164:4: ( (lv_value_7_0= ruleEBoolean ) )
                    // InternalSystemParameter.g:1165:5: (lv_value_7_0= ruleEBoolean )
                    {
                    // InternalSystemParameter.g:1165:5: (lv_value_7_0= ruleEBoolean )
                    // InternalSystemParameter.g:1166:6: lv_value_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSystemParameter.g:1185:3: ( () ( ( ruleFQN ) ) )
                    {
                    // InternalSystemParameter.g:1185:3: ( () ( ( ruleFQN ) ) )
                    // InternalSystemParameter.g:1186:4: () ( ( ruleFQN ) )
                    {
                    // InternalSystemParameter.g:1186:4: ()
                    // InternalSystemParameter.g:1187:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0(),
                    						current);
                    				

                    }

                    // InternalSystemParameter.g:1193:4: ( ( ruleFQN ) )
                    // InternalSystemParameter.g:1194:5: ( ruleFQN )
                    {
                    // InternalSystemParameter.g:1194:5: ( ruleFQN )
                    // InternalSystemParameter.g:1195:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleValueRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleSingleValue"


    // $ANTLR start "rulePRIMITIVE_TYPE_NAME"
    // InternalSystemParameter.g:1214:1: rulePRIMITIVE_TYPE_NAME returns [Enumerator current=null] : ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) ;
    public final Enumerator rulePRIMITIVE_TYPE_NAME() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalSystemParameter.g:1220:2: ( ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) )
            // InternalSystemParameter.g:1221:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            {
            // InternalSystemParameter.g:1221:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            int alt27=12;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt27=1;
                }
                break;
            case 35:
                {
                alt27=2;
                }
                break;
            case 36:
                {
                alt27=3;
                }
                break;
            case 37:
                {
                alt27=4;
                }
                break;
            case 38:
                {
                alt27=5;
                }
                break;
            case 39:
                {
                alt27=6;
                }
                break;
            case 40:
                {
                alt27=7;
                }
                break;
            case 41:
                {
                alt27=8;
                }
                break;
            case 42:
                {
                alt27=9;
                }
                break;
            case 43:
                {
                alt27=10;
                }
                break;
            case 44:
                {
                alt27=11;
                }
                break;
            case 45:
                {
                alt27=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalSystemParameter.g:1222:3: (enumLiteral_0= 'Int8' )
                    {
                    // InternalSystemParameter.g:1222:3: (enumLiteral_0= 'Int8' )
                    // InternalSystemParameter.g:1223:4: enumLiteral_0= 'Int8'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:1230:3: (enumLiteral_1= 'Int16' )
                    {
                    // InternalSystemParameter.g:1230:3: (enumLiteral_1= 'Int16' )
                    // InternalSystemParameter.g:1231:4: enumLiteral_1= 'Int16'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSystemParameter.g:1238:3: (enumLiteral_2= 'Int32' )
                    {
                    // InternalSystemParameter.g:1238:3: (enumLiteral_2= 'Int32' )
                    // InternalSystemParameter.g:1239:4: enumLiteral_2= 'Int32'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSystemParameter.g:1246:3: (enumLiteral_3= 'Int64' )
                    {
                    // InternalSystemParameter.g:1246:3: (enumLiteral_3= 'Int64' )
                    // InternalSystemParameter.g:1247:4: enumLiteral_3= 'Int64'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSystemParameter.g:1254:3: (enumLiteral_4= 'UInt8' )
                    {
                    // InternalSystemParameter.g:1254:3: (enumLiteral_4= 'UInt8' )
                    // InternalSystemParameter.g:1255:4: enumLiteral_4= 'UInt8'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSystemParameter.g:1262:3: (enumLiteral_5= 'UInt16' )
                    {
                    // InternalSystemParameter.g:1262:3: (enumLiteral_5= 'UInt16' )
                    // InternalSystemParameter.g:1263:4: enumLiteral_5= 'UInt16'
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSystemParameter.g:1270:3: (enumLiteral_6= 'UInt32' )
                    {
                    // InternalSystemParameter.g:1270:3: (enumLiteral_6= 'UInt32' )
                    // InternalSystemParameter.g:1271:4: enumLiteral_6= 'UInt32'
                    {
                    enumLiteral_6=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSystemParameter.g:1278:3: (enumLiteral_7= 'UInt64' )
                    {
                    // InternalSystemParameter.g:1278:3: (enumLiteral_7= 'UInt64' )
                    // InternalSystemParameter.g:1279:4: enumLiteral_7= 'UInt64'
                    {
                    enumLiteral_7=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSystemParameter.g:1286:3: (enumLiteral_8= 'Float' )
                    {
                    // InternalSystemParameter.g:1286:3: (enumLiteral_8= 'Float' )
                    // InternalSystemParameter.g:1287:4: enumLiteral_8= 'Float'
                    {
                    enumLiteral_8=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSystemParameter.g:1294:3: (enumLiteral_9= 'Double' )
                    {
                    // InternalSystemParameter.g:1294:3: (enumLiteral_9= 'Double' )
                    // InternalSystemParameter.g:1295:4: enumLiteral_9= 'Double'
                    {
                    enumLiteral_9=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalSystemParameter.g:1302:3: (enumLiteral_10= 'String' )
                    {
                    // InternalSystemParameter.g:1302:3: (enumLiteral_10= 'String' )
                    // InternalSystemParameter.g:1303:4: enumLiteral_10= 'String'
                    {
                    enumLiteral_10=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalSystemParameter.g:1310:3: (enumLiteral_11= 'Boolean' )
                    {
                    // InternalSystemParameter.g:1310:3: (enumLiteral_11= 'Boolean' )
                    // InternalSystemParameter.g:1311:4: enumLiteral_11= 'Boolean'
                    {
                    enumLiteral_11=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11());
                    			

                    }


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
    // $ANTLR end "rulePRIMITIVE_TYPE_NAME"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000120020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000478000D0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000180000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000078000D0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000280000000L});

}