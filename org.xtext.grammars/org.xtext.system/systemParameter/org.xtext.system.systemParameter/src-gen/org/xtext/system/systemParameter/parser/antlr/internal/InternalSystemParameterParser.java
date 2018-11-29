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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SystemParameterModel'", "'extendsSystem'", "'{'", "'}'", "'ComponentParameterInstance'", "'refinesParamStruct'", "'ParameterRefinement'", "'='", "';'", "'.'", "'true'", "'false'", "'-'", "'E'", "'e'", "'InlineEnumeration'", "'['", "']'", "'*'", "','", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

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
    // InternalSystemParameter.g:106:1: entryRuleSystemParamModel returns [EObject current=null] : iv_ruleSystemParamModel= ruleSystemParamModel EOF ;
    public final EObject entryRuleSystemParamModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemParamModel = null;


        try {
            // InternalSystemParameter.g:106:57: (iv_ruleSystemParamModel= ruleSystemParamModel EOF )
            // InternalSystemParameter.g:107:2: iv_ruleSystemParamModel= ruleSystemParamModel EOF
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
    // InternalSystemParameter.g:113:1: ruleSystemParamModel returns [EObject current=null] : ( () otherlv_1= 'SystemParameterModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'extendsSystem' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_components_6_0= ruleComponentParameterInstance ) )* otherlv_7= '}' ) ;
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
            // InternalSystemParameter.g:119:2: ( ( () otherlv_1= 'SystemParameterModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'extendsSystem' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_components_6_0= ruleComponentParameterInstance ) )* otherlv_7= '}' ) )
            // InternalSystemParameter.g:120:2: ( () otherlv_1= 'SystemParameterModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'extendsSystem' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_components_6_0= ruleComponentParameterInstance ) )* otherlv_7= '}' )
            {
            // InternalSystemParameter.g:120:2: ( () otherlv_1= 'SystemParameterModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'extendsSystem' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_components_6_0= ruleComponentParameterInstance ) )* otherlv_7= '}' )
            // InternalSystemParameter.g:121:3: () otherlv_1= 'SystemParameterModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'extendsSystem' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_components_6_0= ruleComponentParameterInstance ) )* otherlv_7= '}'
            {
            // InternalSystemParameter.g:121:3: ()
            // InternalSystemParameter.g:122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemParamModelAccess().getSystemParamModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemParamModelAccess().getSystemParameterModelKeyword_1());
            		
            // InternalSystemParameter.g:132:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSystemParameter.g:133:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSystemParameter.g:133:4: (lv_name_2_0= RULE_ID )
            // InternalSystemParameter.g:134:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemParamModelAccess().getExtendsSystemKeyword_3());
            		
            // InternalSystemParameter.g:154:3: ( ( ruleFQN ) )
            // InternalSystemParameter.g:155:4: ( ruleFQN )
            {
            // InternalSystemParameter.g:155:4: ( ruleFQN )
            // InternalSystemParameter.g:156:5: ruleFQN
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

            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemParamModelAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSystemParameter.g:174:3: ( (lv_components_6_0= ruleComponentParameterInstance ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSystemParameter.g:175:4: (lv_components_6_0= ruleComponentParameterInstance )
            	    {
            	    // InternalSystemParameter.g:175:4: (lv_components_6_0= ruleComponentParameterInstance )
            	    // InternalSystemParameter.g:176:5: lv_components_6_0= ruleComponentParameterInstance
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

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSystemParameter.g:201:1: entryRuleComponentParameterInstance returns [EObject current=null] : iv_ruleComponentParameterInstance= ruleComponentParameterInstance EOF ;
    public final EObject entryRuleComponentParameterInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentParameterInstance = null;


        try {
            // InternalSystemParameter.g:201:67: (iv_ruleComponentParameterInstance= ruleComponentParameterInstance EOF )
            // InternalSystemParameter.g:202:2: iv_ruleComponentParameterInstance= ruleComponentParameterInstance EOF
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
    // InternalSystemParameter.g:208:1: ruleComponentParameterInstance returns [EObject current=null] : (otherlv_0= 'ComponentParameterInstance' ( ( ruleFQN ) ) (otherlv_2= 'refinesParamStruct' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterRefinement ) )* otherlv_6= '}' ) ;
    public final EObject ruleComponentParameterInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:214:2: ( (otherlv_0= 'ComponentParameterInstance' ( ( ruleFQN ) ) (otherlv_2= 'refinesParamStruct' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterRefinement ) )* otherlv_6= '}' ) )
            // InternalSystemParameter.g:215:2: (otherlv_0= 'ComponentParameterInstance' ( ( ruleFQN ) ) (otherlv_2= 'refinesParamStruct' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterRefinement ) )* otherlv_6= '}' )
            {
            // InternalSystemParameter.g:215:2: (otherlv_0= 'ComponentParameterInstance' ( ( ruleFQN ) ) (otherlv_2= 'refinesParamStruct' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterRefinement ) )* otherlv_6= '}' )
            // InternalSystemParameter.g:216:3: otherlv_0= 'ComponentParameterInstance' ( ( ruleFQN ) ) (otherlv_2= 'refinesParamStruct' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleParameterRefinement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentParameterInstanceAccess().getComponentParameterInstanceKeyword_0());
            		
            // InternalSystemParameter.g:220:3: ( ( ruleFQN ) )
            // InternalSystemParameter.g:221:4: ( ruleFQN )
            {
            // InternalSystemParameter.g:221:4: ( ruleFQN )
            // InternalSystemParameter.g:222:5: ruleFQN
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

            // InternalSystemParameter.g:236:3: (otherlv_2= 'refinesParamStruct' ( ( ruleFQN ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSystemParameter.g:237:4: otherlv_2= 'refinesParamStruct' ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentParameterInstanceAccess().getRefinesParamStructKeyword_2_0());
                    			
                    // InternalSystemParameter.g:241:4: ( ( ruleFQN ) )
                    // InternalSystemParameter.g:242:5: ( ruleFQN )
                    {
                    // InternalSystemParameter.g:242:5: ( ruleFQN )
                    // InternalSystemParameter.g:243:6: ruleFQN
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

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentParameterInstanceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSystemParameter.g:262:3: ( (lv_parameters_5_0= ruleParameterRefinement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSystemParameter.g:263:4: (lv_parameters_5_0= ruleParameterRefinement )
            	    {
            	    // InternalSystemParameter.g:263:4: (lv_parameters_5_0= ruleParameterRefinement )
            	    // InternalSystemParameter.g:264:5: lv_parameters_5_0= ruleParameterRefinement
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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSystemParameter.g:289:1: entryRuleParameterRefinement returns [EObject current=null] : iv_ruleParameterRefinement= ruleParameterRefinement EOF ;
    public final EObject entryRuleParameterRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterRefinement = null;


        try {
            // InternalSystemParameter.g:289:60: (iv_ruleParameterRefinement= ruleParameterRefinement EOF )
            // InternalSystemParameter.g:290:2: iv_ruleParameterRefinement= ruleParameterRefinement EOF
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
    // InternalSystemParameter.g:296:1: ruleParameterRefinement returns [EObject current=null] : (otherlv_0= 'ParameterRefinement' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeRefinement ) )* otherlv_4= '}' ) ;
    public final EObject ruleParameterRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:302:2: ( (otherlv_0= 'ParameterRefinement' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeRefinement ) )* otherlv_4= '}' ) )
            // InternalSystemParameter.g:303:2: (otherlv_0= 'ParameterRefinement' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeRefinement ) )* otherlv_4= '}' )
            {
            // InternalSystemParameter.g:303:2: (otherlv_0= 'ParameterRefinement' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeRefinement ) )* otherlv_4= '}' )
            // InternalSystemParameter.g:304:3: otherlv_0= 'ParameterRefinement' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeRefinement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterRefinementAccess().getParameterRefinementKeyword_0());
            		
            // InternalSystemParameter.g:308:3: ( ( ruleFQN ) )
            // InternalSystemParameter.g:309:4: ( ruleFQN )
            {
            // InternalSystemParameter.g:309:4: ( ruleFQN )
            // InternalSystemParameter.g:310:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRefinementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterRefinementAccess().getParameterComponentParameterBaseCrossReference_1_0());
            				
            pushFollow(FOLLOW_5);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterRefinementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSystemParameter.g:328:3: ( (lv_attributes_3_0= ruleAttributeRefinement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSystemParameter.g:329:4: (lv_attributes_3_0= ruleAttributeRefinement )
            	    {
            	    // InternalSystemParameter.g:329:4: (lv_attributes_3_0= ruleAttributeRefinement )
            	    // InternalSystemParameter.g:330:5: lv_attributes_3_0= ruleAttributeRefinement
            	    {

            	    					newCompositeNode(grammarAccess.getParameterRefinementAccess().getAttributesAttributeRefinementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_3_0=ruleAttributeRefinement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterRefinementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeRefinement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterRefinementAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalSystemParameter.g:355:1: entryRuleAttributeRefinement returns [EObject current=null] : iv_ruleAttributeRefinement= ruleAttributeRefinement EOF ;
    public final EObject entryRuleAttributeRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeRefinement = null;


        try {
            // InternalSystemParameter.g:355:60: (iv_ruleAttributeRefinement= ruleAttributeRefinement EOF )
            // InternalSystemParameter.g:356:2: iv_ruleAttributeRefinement= ruleAttributeRefinement EOF
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
    // InternalSystemParameter.g:362:1: ruleAttributeRefinement returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractValue ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleAttributeRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:368:2: ( ( ( ( ruleFQN ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractValue ) ) (otherlv_3= ';' )? ) )
            // InternalSystemParameter.g:369:2: ( ( ( ruleFQN ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractValue ) ) (otherlv_3= ';' )? )
            {
            // InternalSystemParameter.g:369:2: ( ( ( ruleFQN ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractValue ) ) (otherlv_3= ';' )? )
            // InternalSystemParameter.g:370:3: ( ( ruleFQN ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractValue ) ) (otherlv_3= ';' )?
            {
            // InternalSystemParameter.g:370:3: ( ( ruleFQN ) )
            // InternalSystemParameter.g:371:4: ( ruleFQN )
            {
            // InternalSystemParameter.g:371:4: ( ruleFQN )
            // InternalSystemParameter.g:372:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRefinementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionCrossReference_0_0());
            				
            pushFollow(FOLLOW_10);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeRefinementAccess().getEqualsSignKeyword_1());
            		
            // InternalSystemParameter.g:390:3: ( (lv_value_2_0= ruleAbstractValue ) )
            // InternalSystemParameter.g:391:4: (lv_value_2_0= ruleAbstractValue )
            {
            // InternalSystemParameter.g:391:4: (lv_value_2_0= ruleAbstractValue )
            // InternalSystemParameter.g:392:5: lv_value_2_0= ruleAbstractValue
            {

            					newCompositeNode(grammarAccess.getAttributeRefinementAccess().getValueAbstractValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_value_2_0=ruleAbstractValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRefinementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.AbstractValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystemParameter.g:409:3: (otherlv_3= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSystemParameter.g:410:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeRefinementAccess().getSemicolonKeyword_3());
                    			

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
    // InternalSystemParameter.g:419:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalSystemParameter.g:419:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalSystemParameter.g:420:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalSystemParameter.g:426:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSystemParameter.g:432:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSystemParameter.g:433:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSystemParameter.g:433:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSystemParameter.g:434:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalSystemParameter.g:441:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSystemParameter.g:442:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalSystemParameter.g:459:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalSystemParameter.g:459:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalSystemParameter.g:460:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalSystemParameter.g:466:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSystemParameter.g:472:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalSystemParameter.g:473:2: (kw= 'true' | kw= 'false' )
            {
            // InternalSystemParameter.g:473:2: (kw= 'true' | kw= 'false' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSystemParameter.g:474:3: kw= 'true'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:480:3: kw= 'false'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

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
    // InternalSystemParameter.g:489:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSystemParameter.g:489:47: (iv_ruleEString= ruleEString EOF )
            // InternalSystemParameter.g:490:2: iv_ruleEString= ruleEString EOF
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
    // InternalSystemParameter.g:496:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSystemParameter.g:502:2: (this_STRING_0= RULE_STRING )
            // InternalSystemParameter.g:503:2: this_STRING_0= RULE_STRING
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
    // InternalSystemParameter.g:513:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSystemParameter.g:513:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSystemParameter.g:514:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSystemParameter.g:520:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSystemParameter.g:526:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSystemParameter.g:527:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSystemParameter.g:527:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSystemParameter.g:528:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSystemParameter.g:528:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSystemParameter.g:529:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_14); 

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
    // InternalSystemParameter.g:546:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalSystemParameter.g:546:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalSystemParameter.g:547:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalSystemParameter.g:553:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalSystemParameter.g:559:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalSystemParameter.g:560:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalSystemParameter.g:560:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalSystemParameter.g:561:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalSystemParameter.g:561:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSystemParameter.g:562:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSystemParameter.g:568:3: (this_INT_1= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSystemParameter.g:569:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_16); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,20,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_17); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalSystemParameter.g:589:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=24 && LA13_0<=25)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSystemParameter.g:590:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalSystemParameter.g:590:4: (kw= 'E' | kw= 'e' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==25) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSystemParameter.g:591:5: kw= 'E'
                            {
                            kw=(Token)match(input,24,FOLLOW_18); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSystemParameter.g:597:5: kw= 'e'
                            {
                            kw=(Token)match(input,25,FOLLOW_18); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSystemParameter.g:603:4: (kw= '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==23) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalSystemParameter.g:604:5: kw= '-'
                            {
                            kw=(Token)match(input,23,FOLLOW_14); 

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
    // InternalSystemParameter.g:622:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalSystemParameter.g:622:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalSystemParameter.g:623:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
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
    // InternalSystemParameter.g:629:1: ruleEnumerationElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:635:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) )
            // InternalSystemParameter.g:636:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            {
            // InternalSystemParameter.g:636:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            // InternalSystemParameter.g:637:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )?
            {
            // InternalSystemParameter.g:637:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSystemParameter.g:638:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSystemParameter.g:638:4: (lv_name_0_0= RULE_ID )
            // InternalSystemParameter.g:639:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalSystemParameter.g:655:3: (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSystemParameter.g:656:4: otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalSystemParameter.g:660:4: ( (lv_value_2_0= ruleEInt ) )
                    // InternalSystemParameter.g:661:5: (lv_value_2_0= ruleEInt )
                    {
                    // InternalSystemParameter.g:661:5: (lv_value_2_0= ruleEInt )
                    // InternalSystemParameter.g:662:6: lv_value_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEnumerationElementAccess().getValueEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
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

            // InternalSystemParameter.g:680:3: (otherlv_3= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSystemParameter.g:681:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalSystemParameter.g:690:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // InternalSystemParameter.g:690:62: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // InternalSystemParameter.g:691:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
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
    // InternalSystemParameter.g:697:1: ruleAbstractAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_InlineEnumerationType_1 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:703:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) )
            // InternalSystemParameter.g:704:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            {
            // InternalSystemParameter.g:704:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=31 && LA16_0<=42)) ) {
                alt16=1;
            }
            else if ( (LA16_0==26) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSystemParameter.g:705:3: this_PrimitiveType_0= rulePrimitiveType
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
                    // InternalSystemParameter.g:714:3: this_InlineEnumerationType_1= ruleInlineEnumerationType
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
    // InternalSystemParameter.g:726:1: entryRuleInlineEnumerationType returns [EObject current=null] : iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF ;
    public final EObject entryRuleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineEnumerationType = null;


        try {
            // InternalSystemParameter.g:726:62: (iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF )
            // InternalSystemParameter.g:727:2: iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF
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
    // InternalSystemParameter.g:733:1: ruleInlineEnumerationType returns [EObject current=null] : (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_array_1_0 = null;

        EObject lv_enums_3_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:739:2: ( (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) )
            // InternalSystemParameter.g:740:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            {
            // InternalSystemParameter.g:740:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            // InternalSystemParameter.g:741:3: otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0());
            		
            // InternalSystemParameter.g:745:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSystemParameter.g:746:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalSystemParameter.g:746:4: (lv_array_1_0= ruleArrayType )
                    // InternalSystemParameter.g:747:5: lv_array_1_0= ruleArrayType
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

            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSystemParameter.g:768:3: ( (lv_enums_3_0= ruleEnumerationElement ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSystemParameter.g:769:4: (lv_enums_3_0= ruleEnumerationElement )
            	    {
            	    // InternalSystemParameter.g:769:4: (lv_enums_3_0= ruleEnumerationElement )
            	    // InternalSystemParameter.g:770:5: lv_enums_3_0= ruleEnumerationElement
            	    {

            	    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSystemParameter.g:795:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalSystemParameter.g:795:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalSystemParameter.g:796:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalSystemParameter.g:802:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:808:2: ( ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) )
            // InternalSystemParameter.g:809:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            {
            // InternalSystemParameter.g:809:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            // InternalSystemParameter.g:810:3: () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']'
            {
            // InternalSystemParameter.g:810:3: ()
            // InternalSystemParameter.g:811:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSystemParameter.g:821:3: ( (lv_length_2_0= ruleCardinality ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT||LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSystemParameter.g:822:4: (lv_length_2_0= ruleCardinality )
                    {
                    // InternalSystemParameter.g:822:4: (lv_length_2_0= ruleCardinality )
                    // InternalSystemParameter.g:823:5: lv_length_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

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
    // InternalSystemParameter.g:848:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalSystemParameter.g:848:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalSystemParameter.g:849:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalSystemParameter.g:855:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSystemParameter.g:861:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalSystemParameter.g:862:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalSystemParameter.g:862:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            else if ( (LA20_0==29) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSystemParameter.g:863:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:871:3: kw= '*'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

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
    // InternalSystemParameter.g:880:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalSystemParameter.g:880:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalSystemParameter.g:881:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalSystemParameter.g:887:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeName_0_0 = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:893:2: ( ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) )
            // InternalSystemParameter.g:894:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            {
            // InternalSystemParameter.g:894:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            // InternalSystemParameter.g:895:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )?
            {
            // InternalSystemParameter.g:895:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) )
            // InternalSystemParameter.g:896:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            {
            // InternalSystemParameter.g:896:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            // InternalSystemParameter.g:897:5: lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalSystemParameter.g:914:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSystemParameter.g:915:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalSystemParameter.g:915:4: (lv_array_1_0= ruleArrayType )
                    // InternalSystemParameter.g:916:5: lv_array_1_0= ruleArrayType
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
    // InternalSystemParameter.g:937:1: entryRuleAbstractValue returns [EObject current=null] : iv_ruleAbstractValue= ruleAbstractValue EOF ;
    public final EObject entryRuleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractValue = null;


        try {
            // InternalSystemParameter.g:937:54: (iv_ruleAbstractValue= ruleAbstractValue EOF )
            // InternalSystemParameter.g:938:2: iv_ruleAbstractValue= ruleAbstractValue EOF
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
    // InternalSystemParameter.g:944:1: ruleAbstractValue returns [EObject current=null] : (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) ;
    public final EObject ruleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValue_0 = null;

        EObject this_ArrayValue_1 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:950:2: ( (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) )
            // InternalSystemParameter.g:951:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            {
            // InternalSystemParameter.g:951:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||(LA22_0>=20 && LA22_0<=23)) ) {
                alt22=1;
            }
            else if ( (LA22_0==27) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSystemParameter.g:952:3: this_SingleValue_0= ruleSingleValue
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
                    // InternalSystemParameter.g:961:3: this_ArrayValue_1= ruleArrayValue
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
    // InternalSystemParameter.g:973:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalSystemParameter.g:973:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalSystemParameter.g:974:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalSystemParameter.g:980:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:986:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) )
            // InternalSystemParameter.g:987:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            {
            // InternalSystemParameter.g:987:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            // InternalSystemParameter.g:988:3: otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSystemParameter.g:992:3: ( (lv_values_1_0= ruleSingleValue ) )
            // InternalSystemParameter.g:993:4: (lv_values_1_0= ruleSingleValue )
            {
            // InternalSystemParameter.g:993:4: (lv_values_1_0= ruleSingleValue )
            // InternalSystemParameter.g:994:5: lv_values_1_0= ruleSingleValue
            {

            					newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalSystemParameter.g:1011:3: (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSystemParameter.g:1012:4: otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSystemParameter.g:1016:4: ( (lv_values_3_0= ruleSingleValue ) )
            	    // InternalSystemParameter.g:1017:5: (lv_values_3_0= ruleSingleValue )
            	    {
            	    // InternalSystemParameter.g:1017:5: (lv_values_3_0= ruleSingleValue )
            	    // InternalSystemParameter.g:1018:6: lv_values_3_0= ruleSingleValue
            	    {

            	    						newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop23;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

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
    // InternalSystemParameter.g:1044:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalSystemParameter.g:1044:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalSystemParameter.g:1045:2: iv_ruleSingleValue= ruleSingleValue EOF
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
    // InternalSystemParameter.g:1051:1: ruleSingleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalSystemParameter.g:1057:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) )
            // InternalSystemParameter.g:1058:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            {
            // InternalSystemParameter.g:1058:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_INT) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==20) ) {
                        alt24=2;
                    }
                    else if ( (LA24_2==EOF||LA24_2==RULE_ID||LA24_2==14||LA24_2==19||LA24_2==28||LA24_2==30) ) {
                        alt24=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA24_1==20) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==20) ) {
                    alt24=2;
                }
                else if ( (LA24_2==EOF||LA24_2==RULE_ID||LA24_2==14||LA24_2==19||LA24_2==28||LA24_2==30) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt24=2;
                }
                break;
            case RULE_STRING:
                {
                alt24=3;
                }
                break;
            case 21:
            case 22:
                {
                alt24=4;
                }
                break;
            case RULE_ID:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalSystemParameter.g:1059:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalSystemParameter.g:1059:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalSystemParameter.g:1060:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalSystemParameter.g:1060:4: ()
                    // InternalSystemParameter.g:1061:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getIntValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSystemParameter.g:1067:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalSystemParameter.g:1068:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalSystemParameter.g:1068:5: (lv_value_1_0= ruleEInt )
                    // InternalSystemParameter.g:1069:6: lv_value_1_0= ruleEInt
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
                    // InternalSystemParameter.g:1088:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    {
                    // InternalSystemParameter.g:1088:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    // InternalSystemParameter.g:1089:4: () ( (lv_value_3_0= ruleEDouble ) )
                    {
                    // InternalSystemParameter.g:1089:4: ()
                    // InternalSystemParameter.g:1090:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSystemParameter.g:1096:4: ( (lv_value_3_0= ruleEDouble ) )
                    // InternalSystemParameter.g:1097:5: (lv_value_3_0= ruleEDouble )
                    {
                    // InternalSystemParameter.g:1097:5: (lv_value_3_0= ruleEDouble )
                    // InternalSystemParameter.g:1098:6: lv_value_3_0= ruleEDouble
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
                    // InternalSystemParameter.g:1117:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    {
                    // InternalSystemParameter.g:1117:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    // InternalSystemParameter.g:1118:4: () ( (lv_value_5_0= ruleEString ) )
                    {
                    // InternalSystemParameter.g:1118:4: ()
                    // InternalSystemParameter.g:1119:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getStringValueAction_2_0(),
                    						current);
                    				

                    }

                    // InternalSystemParameter.g:1125:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalSystemParameter.g:1126:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalSystemParameter.g:1126:5: (lv_value_5_0= ruleEString )
                    // InternalSystemParameter.g:1127:6: lv_value_5_0= ruleEString
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
                    // InternalSystemParameter.g:1146:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    {
                    // InternalSystemParameter.g:1146:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    // InternalSystemParameter.g:1147:4: () ( (lv_value_7_0= ruleEBoolean ) )
                    {
                    // InternalSystemParameter.g:1147:4: ()
                    // InternalSystemParameter.g:1148:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getBoolValueAction_3_0(),
                    						current);
                    				

                    }

                    // InternalSystemParameter.g:1154:4: ( (lv_value_7_0= ruleEBoolean ) )
                    // InternalSystemParameter.g:1155:5: (lv_value_7_0= ruleEBoolean )
                    {
                    // InternalSystemParameter.g:1155:5: (lv_value_7_0= ruleEBoolean )
                    // InternalSystemParameter.g:1156:6: lv_value_7_0= ruleEBoolean
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
                    // InternalSystemParameter.g:1175:3: ( () ( ( ruleFQN ) ) )
                    {
                    // InternalSystemParameter.g:1175:3: ( () ( ( ruleFQN ) ) )
                    // InternalSystemParameter.g:1176:4: () ( ( ruleFQN ) )
                    {
                    // InternalSystemParameter.g:1176:4: ()
                    // InternalSystemParameter.g:1177:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0(),
                    						current);
                    				

                    }

                    // InternalSystemParameter.g:1183:4: ( ( ruleFQN ) )
                    // InternalSystemParameter.g:1184:5: ( ruleFQN )
                    {
                    // InternalSystemParameter.g:1184:5: ( ruleFQN )
                    // InternalSystemParameter.g:1185:6: ruleFQN
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
    // InternalSystemParameter.g:1204:1: rulePRIMITIVE_TYPE_NAME returns [Enumerator current=null] : ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) ;
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
            // InternalSystemParameter.g:1210:2: ( ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) )
            // InternalSystemParameter.g:1211:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            {
            // InternalSystemParameter.g:1211:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            int alt25=12;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt25=1;
                }
                break;
            case 32:
                {
                alt25=2;
                }
                break;
            case 33:
                {
                alt25=3;
                }
                break;
            case 34:
                {
                alt25=4;
                }
                break;
            case 35:
                {
                alt25=5;
                }
                break;
            case 36:
                {
                alt25=6;
                }
                break;
            case 37:
                {
                alt25=7;
                }
                break;
            case 38:
                {
                alt25=8;
                }
                break;
            case 39:
                {
                alt25=9;
                }
                break;
            case 40:
                {
                alt25=10;
                }
                break;
            case 41:
                {
                alt25=11;
                }
                break;
            case 42:
                {
                alt25=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalSystemParameter.g:1212:3: (enumLiteral_0= 'Int8' )
                    {
                    // InternalSystemParameter.g:1212:3: (enumLiteral_0= 'Int8' )
                    // InternalSystemParameter.g:1213:4: enumLiteral_0= 'Int8'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:1220:3: (enumLiteral_1= 'Int16' )
                    {
                    // InternalSystemParameter.g:1220:3: (enumLiteral_1= 'Int16' )
                    // InternalSystemParameter.g:1221:4: enumLiteral_1= 'Int16'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSystemParameter.g:1228:3: (enumLiteral_2= 'Int32' )
                    {
                    // InternalSystemParameter.g:1228:3: (enumLiteral_2= 'Int32' )
                    // InternalSystemParameter.g:1229:4: enumLiteral_2= 'Int32'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSystemParameter.g:1236:3: (enumLiteral_3= 'Int64' )
                    {
                    // InternalSystemParameter.g:1236:3: (enumLiteral_3= 'Int64' )
                    // InternalSystemParameter.g:1237:4: enumLiteral_3= 'Int64'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSystemParameter.g:1244:3: (enumLiteral_4= 'UInt8' )
                    {
                    // InternalSystemParameter.g:1244:3: (enumLiteral_4= 'UInt8' )
                    // InternalSystemParameter.g:1245:4: enumLiteral_4= 'UInt8'
                    {
                    enumLiteral_4=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSystemParameter.g:1252:3: (enumLiteral_5= 'UInt16' )
                    {
                    // InternalSystemParameter.g:1252:3: (enumLiteral_5= 'UInt16' )
                    // InternalSystemParameter.g:1253:4: enumLiteral_5= 'UInt16'
                    {
                    enumLiteral_5=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSystemParameter.g:1260:3: (enumLiteral_6= 'UInt32' )
                    {
                    // InternalSystemParameter.g:1260:3: (enumLiteral_6= 'UInt32' )
                    // InternalSystemParameter.g:1261:4: enumLiteral_6= 'UInt32'
                    {
                    enumLiteral_6=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSystemParameter.g:1268:3: (enumLiteral_7= 'UInt64' )
                    {
                    // InternalSystemParameter.g:1268:3: (enumLiteral_7= 'UInt64' )
                    // InternalSystemParameter.g:1269:4: enumLiteral_7= 'UInt64'
                    {
                    enumLiteral_7=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSystemParameter.g:1276:3: (enumLiteral_8= 'Float' )
                    {
                    // InternalSystemParameter.g:1276:3: (enumLiteral_8= 'Float' )
                    // InternalSystemParameter.g:1277:4: enumLiteral_8= 'Float'
                    {
                    enumLiteral_8=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSystemParameter.g:1284:3: (enumLiteral_9= 'Double' )
                    {
                    // InternalSystemParameter.g:1284:3: (enumLiteral_9= 'Double' )
                    // InternalSystemParameter.g:1285:4: enumLiteral_9= 'Double'
                    {
                    enumLiteral_9=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalSystemParameter.g:1292:3: (enumLiteral_10= 'String' )
                    {
                    // InternalSystemParameter.g:1292:3: (enumLiteral_10= 'String' )
                    // InternalSystemParameter.g:1293:4: enumLiteral_10= 'String'
                    {
                    enumLiteral_10=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalSystemParameter.g:1300:3: (enumLiteral_11= 'Boolean' )
                    {
                    // InternalSystemParameter.g:1300:3: (enumLiteral_11= 'Boolean' )
                    // InternalSystemParameter.g:1301:4: enumLiteral_11= 'Boolean'
                    {
                    enumLiteral_11=(Token)match(input,42,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008F00070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000030000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000F00070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000050000000L});

}