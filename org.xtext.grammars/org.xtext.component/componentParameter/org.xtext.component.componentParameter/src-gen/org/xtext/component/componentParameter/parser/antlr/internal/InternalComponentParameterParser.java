package org.xtext.component.componentParameter.parser.antlr.internal;

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
import org.xtext.component.componentParameter.services.ComponentParameterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentParameterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOCU_COMMENT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_WS", "RULE_ANY_OTHER", "'ComponentParameter'", "'component'", "'{'", "'}'", "'InternalParameter'", "'ExtendedParameter'", "'ExtendedTrigger'", "'active'", "'passive'", "'ParameterSetInstance'", "'TriggerInstance'", "';'", "'ParameterInstance'", "'.*'", "'#import'", "'ParameterSetRepository'", "'ParameterSet'", "'extends'", "','", "'Parameter'", "'Trigger'", "':'", "'='", "'.'", "'true'", "'false'", "'-'", "'E'", "'e'", "'InlineEnumeration'", "'['", "']'", "'*'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'"
    };
    public static final int T__50=50;
    public static final int RULE_ML_DOCUMENTATION=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalComponentParameterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentParameterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentParameterParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentParameter.g"; }



     	private ComponentParameterGrammarAccess grammarAccess;

        public InternalComponentParameterParser(TokenStream input, ComponentParameterGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentParamModel";
       	}

       	@Override
       	protected ComponentParameterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentParamModel"
    // InternalComponentParameter.g:80:1: entryRuleComponentParamModel returns [EObject current=null] : iv_ruleComponentParamModel= ruleComponentParamModel EOF ;
    public final EObject entryRuleComponentParamModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentParamModel = null;


        try {
            // InternalComponentParameter.g:80:60: (iv_ruleComponentParamModel= ruleComponentParamModel EOF )
            // InternalComponentParameter.g:81:2: iv_ruleComponentParamModel= ruleComponentParamModel EOF
            {
             newCompositeNode(grammarAccess.getComponentParamModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentParamModel=ruleComponentParamModel();

            state._fsp--;

             current =iv_ruleComponentParamModel; 
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
    // $ANTLR end "entryRuleComponentParamModel"


    // $ANTLR start "ruleComponentParamModel"
    // InternalComponentParameter.g:87:1: ruleComponentParamModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_parametrization_2_0= ruleComponentParameter ) )? ) ;
    public final EObject ruleComponentParamModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_parametrization_2_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:93:2: ( ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_parametrization_2_0= ruleComponentParameter ) )? ) )
            // InternalComponentParameter.g:94:2: ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_parametrization_2_0= ruleComponentParameter ) )? )
            {
            // InternalComponentParameter.g:94:2: ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_parametrization_2_0= ruleComponentParameter ) )? )
            // InternalComponentParameter.g:95:3: () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_parametrization_2_0= ruleComponentParameter ) )?
            {
            // InternalComponentParameter.g:95:3: ()
            // InternalComponentParameter.g:96:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentParamModelAccess().getComponentParamModelAction_0(),
            					current);
            			

            }

            // InternalComponentParameter.g:102:3: ( (lv_imports_1_0= ruleParamDefRepoImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalComponentParameter.g:103:4: (lv_imports_1_0= ruleParamDefRepoImport )
            	    {
            	    // InternalComponentParameter.g:103:4: (lv_imports_1_0= ruleParamDefRepoImport )
            	    // InternalComponentParameter.g:104:5: lv_imports_1_0= ruleParamDefRepoImport
            	    {

            	    					newCompositeNode(grammarAccess.getComponentParamModelAccess().getImportsParamDefRepoImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleParamDefRepoImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentParamModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"org.xtext.service.parameterDefinition.ParameterDefinition.ParamDefRepoImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalComponentParameter.g:121:3: ( (lv_parametrization_2_0= ruleComponentParameter ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentParameter.g:122:4: (lv_parametrization_2_0= ruleComponentParameter )
                    {
                    // InternalComponentParameter.g:122:4: (lv_parametrization_2_0= ruleComponentParameter )
                    // InternalComponentParameter.g:123:5: lv_parametrization_2_0= ruleComponentParameter
                    {

                    					newCompositeNode(grammarAccess.getComponentParamModelAccess().getParametrizationComponentParameterParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parametrization_2_0=ruleComponentParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentParamModelRule());
                    					}
                    					set(
                    						current,
                    						"parametrization",
                    						lv_parametrization_2_0,
                    						"org.xtext.component.componentParameter.ComponentParameter.ComponentParameter");
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
    // $ANTLR end "ruleComponentParamModel"


    // $ANTLR start "entryRuleComponentParameter"
    // InternalComponentParameter.g:144:1: entryRuleComponentParameter returns [EObject current=null] : iv_ruleComponentParameter= ruleComponentParameter EOF ;
    public final EObject entryRuleComponentParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentParameter = null;


        try {
            // InternalComponentParameter.g:144:59: (iv_ruleComponentParameter= ruleComponentParameter EOF )
            // InternalComponentParameter.g:145:2: iv_ruleComponentParameter= ruleComponentParameter EOF
            {
             newCompositeNode(grammarAccess.getComponentParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentParameter=ruleComponentParameter();

            state._fsp--;

             current =iv_ruleComponentParameter; 
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
    // $ANTLR end "entryRuleComponentParameter"


    // $ANTLR start "ruleComponentParameter"
    // InternalComponentParameter.g:151:1: ruleComponentParameter returns [EObject current=null] : (otherlv_0= 'ComponentParameter' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'component' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleAbstractComponentParameter ) )* otherlv_6= '}' ) ;
    public final EObject ruleComponentParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:157:2: ( (otherlv_0= 'ComponentParameter' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'component' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleAbstractComponentParameter ) )* otherlv_6= '}' ) )
            // InternalComponentParameter.g:158:2: (otherlv_0= 'ComponentParameter' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'component' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleAbstractComponentParameter ) )* otherlv_6= '}' )
            {
            // InternalComponentParameter.g:158:2: (otherlv_0= 'ComponentParameter' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'component' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleAbstractComponentParameter ) )* otherlv_6= '}' )
            // InternalComponentParameter.g:159:3: otherlv_0= 'ComponentParameter' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'component' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleAbstractComponentParameter ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentParameterAccess().getComponentParameterKeyword_0());
            		
            // InternalComponentParameter.g:163:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentParameter.g:164:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentParameter.g:164:4: (lv_name_1_0= RULE_ID )
            // InternalComponentParameter.g:165:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalComponentParameter.g:181:3: (otherlv_2= 'component' ( ( ruleFQN ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentParameter.g:182:4: otherlv_2= 'component' ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentParameterAccess().getComponentKeyword_2_0());
                    			
                    // InternalComponentParameter.g:186:4: ( ( ruleFQN ) )
                    // InternalComponentParameter.g:187:5: ( ruleFQN )
                    {
                    // InternalComponentParameter.g:187:5: ( ruleFQN )
                    // InternalComponentParameter.g:188:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentParameterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentParameterAccess().getComponentComponentDefinitionCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentParameter.g:207:3: ( (lv_parameters_5_0= ruleAbstractComponentParameter ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOCU_COMMENT||(LA4_0>=18 && LA4_0<=20)||LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalComponentParameter.g:208:4: (lv_parameters_5_0= ruleAbstractComponentParameter )
            	    {
            	    // InternalComponentParameter.g:208:4: (lv_parameters_5_0= ruleAbstractComponentParameter )
            	    // InternalComponentParameter.g:209:5: lv_parameters_5_0= ruleAbstractComponentParameter
            	    {

            	    					newCompositeNode(grammarAccess.getComponentParameterAccess().getParametersAbstractComponentParameterParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_parameters_5_0=ruleAbstractComponentParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentParameterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_5_0,
            	    						"org.xtext.component.componentParameter.ComponentParameter.AbstractComponentParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentParameterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleComponentParameter"


    // $ANTLR start "entryRuleAbstractComponentParameter"
    // InternalComponentParameter.g:234:1: entryRuleAbstractComponentParameter returns [EObject current=null] : iv_ruleAbstractComponentParameter= ruleAbstractComponentParameter EOF ;
    public final EObject entryRuleAbstractComponentParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponentParameter = null;


        try {
            // InternalComponentParameter.g:234:67: (iv_ruleAbstractComponentParameter= ruleAbstractComponentParameter EOF )
            // InternalComponentParameter.g:235:2: iv_ruleAbstractComponentParameter= ruleAbstractComponentParameter EOF
            {
             newCompositeNode(grammarAccess.getAbstractComponentParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractComponentParameter=ruleAbstractComponentParameter();

            state._fsp--;

             current =iv_ruleAbstractComponentParameter; 
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
    // $ANTLR end "entryRuleAbstractComponentParameter"


    // $ANTLR start "ruleAbstractComponentParameter"
    // InternalComponentParameter.g:241:1: ruleAbstractComponentParameter returns [EObject current=null] : (this_InternalParameter_0= ruleInternalParameter | this_ExtendedParameter_1= ruleExtendedParameter | this_ExtendedTrigger_2= ruleExtendedTrigger | this_ParameterSetInstance_3= ruleParameterSetInstance ) ;
    public final EObject ruleAbstractComponentParameter() throws RecognitionException {
        EObject current = null;

        EObject this_InternalParameter_0 = null;

        EObject this_ExtendedParameter_1 = null;

        EObject this_ExtendedTrigger_2 = null;

        EObject this_ParameterSetInstance_3 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:247:2: ( (this_InternalParameter_0= ruleInternalParameter | this_ExtendedParameter_1= ruleExtendedParameter | this_ExtendedTrigger_2= ruleExtendedTrigger | this_ParameterSetInstance_3= ruleParameterSetInstance ) )
            // InternalComponentParameter.g:248:2: (this_InternalParameter_0= ruleInternalParameter | this_ExtendedParameter_1= ruleExtendedParameter | this_ExtendedTrigger_2= ruleExtendedTrigger | this_ParameterSetInstance_3= ruleParameterSetInstance )
            {
            // InternalComponentParameter.g:248:2: (this_InternalParameter_0= ruleInternalParameter | this_ExtendedParameter_1= ruleExtendedParameter | this_ExtendedTrigger_2= ruleExtendedTrigger | this_ParameterSetInstance_3= ruleParameterSetInstance )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    alt5=3;
                    }
                    break;
                case 19:
                    {
                    alt5=2;
                    }
                    break;
                case 18:
                    {
                    alt5=1;
                    }
                    break;
                case 23:
                    {
                    alt5=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

                }
                break;
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalComponentParameter.g:249:3: this_InternalParameter_0= ruleInternalParameter
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentParameterAccess().getInternalParameterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalParameter_0=ruleInternalParameter();

                    state._fsp--;


                    			current = this_InternalParameter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentParameter.g:258:3: this_ExtendedParameter_1= ruleExtendedParameter
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentParameterAccess().getExtendedParameterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExtendedParameter_1=ruleExtendedParameter();

                    state._fsp--;


                    			current = this_ExtendedParameter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentParameter.g:267:3: this_ExtendedTrigger_2= ruleExtendedTrigger
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentParameterAccess().getExtendedTriggerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExtendedTrigger_2=ruleExtendedTrigger();

                    state._fsp--;


                    			current = this_ExtendedTrigger_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalComponentParameter.g:276:3: this_ParameterSetInstance_3= ruleParameterSetInstance
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentParameterAccess().getParameterSetInstanceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterSetInstance_3=ruleParameterSetInstance();

                    state._fsp--;


                    			current = this_ParameterSetInstance_3;
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
    // $ANTLR end "ruleAbstractComponentParameter"


    // $ANTLR start "entryRuleInternalParameter"
    // InternalComponentParameter.g:288:1: entryRuleInternalParameter returns [EObject current=null] : iv_ruleInternalParameter= ruleInternalParameter EOF ;
    public final EObject entryRuleInternalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalParameter = null;


        try {
            // InternalComponentParameter.g:288:58: (iv_ruleInternalParameter= ruleInternalParameter EOF )
            // InternalComponentParameter.g:289:2: iv_ruleInternalParameter= ruleInternalParameter EOF
            {
             newCompositeNode(grammarAccess.getInternalParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalParameter=ruleInternalParameter();

            state._fsp--;

             current =iv_ruleInternalParameter; 
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
    // $ANTLR end "entryRuleInternalParameter"


    // $ANTLR start "ruleInternalParameter"
    // InternalComponentParameter.g:295:1: ruleInternalParameter returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'InternalParameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleInternalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:301:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'InternalParameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' ) )
            // InternalComponentParameter.g:302:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'InternalParameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' )
            {
            // InternalComponentParameter.g:302:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'InternalParameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' )
            // InternalComponentParameter.g:303:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'InternalParameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}'
            {
            // InternalComponentParameter.g:303:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOCU_COMMENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentParameter.g:304:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentParameter.g:304:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentParameter.g:305:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_8); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getInternalParameterAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInternalParameterRule());
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

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalParameterAccess().getInternalParameterKeyword_1());
            		
            // InternalComponentParameter.g:325:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentParameter.g:326:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentParameter.g:326:4: (lv_name_2_0= RULE_ID )
            // InternalComponentParameter.g:327:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInternalParameterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInternalParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getInternalParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentParameter.g:347:3: ( (lv_attributes_4_0= ruleAttributeDefinition ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_DOCU_COMMENT)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalComponentParameter.g:348:4: (lv_attributes_4_0= ruleAttributeDefinition )
            	    {
            	    // InternalComponentParameter.g:348:4: (lv_attributes_4_0= ruleAttributeDefinition )
            	    // InternalComponentParameter.g:349:5: lv_attributes_4_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getInternalParameterAccess().getAttributesAttributeDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_4_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInternalParameterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_4_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInternalParameterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleInternalParameter"


    // $ANTLR start "entryRuleExtendedParameter"
    // InternalComponentParameter.g:374:1: entryRuleExtendedParameter returns [EObject current=null] : iv_ruleExtendedParameter= ruleExtendedParameter EOF ;
    public final EObject entryRuleExtendedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedParameter = null;


        try {
            // InternalComponentParameter.g:374:58: (iv_ruleExtendedParameter= ruleExtendedParameter EOF )
            // InternalComponentParameter.g:375:2: iv_ruleExtendedParameter= ruleExtendedParameter EOF
            {
             newCompositeNode(grammarAccess.getExtendedParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtendedParameter=ruleExtendedParameter();

            state._fsp--;

             current =iv_ruleExtendedParameter; 
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
    // $ANTLR end "entryRuleExtendedParameter"


    // $ANTLR start "ruleExtendedParameter"
    // InternalComponentParameter.g:381:1: ruleExtendedParameter returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ExtendedParameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleExtendedParameter() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:387:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ExtendedParameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' ) )
            // InternalComponentParameter.g:388:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ExtendedParameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' )
            {
            // InternalComponentParameter.g:388:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ExtendedParameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' )
            // InternalComponentParameter.g:389:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ExtendedParameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}'
            {
            // InternalComponentParameter.g:389:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DOCU_COMMENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentParameter.g:390:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentParameter.g:390:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentParameter.g:391:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_10); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getExtendedParameterAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExtendedParameterRule());
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

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExtendedParameterAccess().getExtendedParameterKeyword_1());
            		
            // InternalComponentParameter.g:411:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentParameter.g:412:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentParameter.g:412:4: (lv_name_2_0= RULE_ID )
            // InternalComponentParameter.g:413:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getExtendedParameterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendedParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getExtendedParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentParameter.g:433:3: ( (lv_attributes_4_0= ruleAttributeDefinition ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_DOCU_COMMENT)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalComponentParameter.g:434:4: (lv_attributes_4_0= ruleAttributeDefinition )
            	    {
            	    // InternalComponentParameter.g:434:4: (lv_attributes_4_0= ruleAttributeDefinition )
            	    // InternalComponentParameter.g:435:5: lv_attributes_4_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getExtendedParameterAccess().getAttributesAttributeDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_4_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtendedParameterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_4_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExtendedParameterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleExtendedParameter"


    // $ANTLR start "entryRuleExtendedTrigger"
    // InternalComponentParameter.g:460:1: entryRuleExtendedTrigger returns [EObject current=null] : iv_ruleExtendedTrigger= ruleExtendedTrigger EOF ;
    public final EObject entryRuleExtendedTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedTrigger = null;


        try {
            // InternalComponentParameter.g:460:56: (iv_ruleExtendedTrigger= ruleExtendedTrigger EOF )
            // InternalComponentParameter.g:461:2: iv_ruleExtendedTrigger= ruleExtendedTrigger EOF
            {
             newCompositeNode(grammarAccess.getExtendedTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtendedTrigger=ruleExtendedTrigger();

            state._fsp--;

             current =iv_ruleExtendedTrigger; 
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
    // $ANTLR end "entryRuleExtendedTrigger"


    // $ANTLR start "ruleExtendedTrigger"
    // InternalComponentParameter.g:467:1: ruleExtendedTrigger returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ExtendedTrigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'passive' ) otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeDefinition ) )* otherlv_7= '}' ) ;
    public final EObject ruleExtendedTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_active_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_attributes_6_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:473:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ExtendedTrigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'passive' ) otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeDefinition ) )* otherlv_7= '}' ) )
            // InternalComponentParameter.g:474:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ExtendedTrigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'passive' ) otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeDefinition ) )* otherlv_7= '}' )
            {
            // InternalComponentParameter.g:474:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ExtendedTrigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'passive' ) otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeDefinition ) )* otherlv_7= '}' )
            // InternalComponentParameter.g:475:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ExtendedTrigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'passive' ) otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeDefinition ) )* otherlv_7= '}'
            {
            // InternalComponentParameter.g:475:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DOCU_COMMENT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentParameter.g:476:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentParameter.g:476:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentParameter.g:477:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_11); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getExtendedTriggerAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExtendedTriggerRule());
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

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExtendedTriggerAccess().getExtendedTriggerKeyword_1());
            		
            // InternalComponentParameter.g:497:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentParameter.g:498:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentParameter.g:498:4: (lv_name_2_0= RULE_ID )
            // InternalComponentParameter.g:499:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getExtendedTriggerAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendedTriggerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalComponentParameter.g:515:3: ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'passive' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentParameter.g:516:4: ( (lv_active_3_0= 'active' ) )
                    {
                    // InternalComponentParameter.g:516:4: ( (lv_active_3_0= 'active' ) )
                    // InternalComponentParameter.g:517:5: (lv_active_3_0= 'active' )
                    {
                    // InternalComponentParameter.g:517:5: (lv_active_3_0= 'active' )
                    // InternalComponentParameter.g:518:6: lv_active_3_0= 'active'
                    {
                    lv_active_3_0=(Token)match(input,21,FOLLOW_6); 

                    						newLeafNode(lv_active_3_0, grammarAccess.getExtendedTriggerAccess().getActiveActiveKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtendedTriggerRule());
                    						}
                    						setWithLastConsumed(current, "active", true, "active");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponentParameter.g:531:4: otherlv_4= 'passive'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getExtendedTriggerAccess().getPassiveKeyword_3_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getExtendedTriggerAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponentParameter.g:540:3: ( (lv_attributes_6_0= ruleAttributeDefinition ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_DOCU_COMMENT)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComponentParameter.g:541:4: (lv_attributes_6_0= ruleAttributeDefinition )
            	    {
            	    // InternalComponentParameter.g:541:4: (lv_attributes_6_0= ruleAttributeDefinition )
            	    // InternalComponentParameter.g:542:5: lv_attributes_6_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getExtendedTriggerAccess().getAttributesAttributeDefinitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_6_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtendedTriggerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_6_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExtendedTriggerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleExtendedTrigger"


    // $ANTLR start "entryRuleParameterSetInstance"
    // InternalComponentParameter.g:567:1: entryRuleParameterSetInstance returns [EObject current=null] : iv_ruleParameterSetInstance= ruleParameterSetInstance EOF ;
    public final EObject entryRuleParameterSetInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetInstance = null;


        try {
            // InternalComponentParameter.g:567:61: (iv_ruleParameterSetInstance= ruleParameterSetInstance EOF )
            // InternalComponentParameter.g:568:2: iv_ruleParameterSetInstance= ruleParameterSetInstance EOF
            {
             newCompositeNode(grammarAccess.getParameterSetInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterSetInstance=ruleParameterSetInstance();

            state._fsp--;

             current =iv_ruleParameterSetInstance; 
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
    // $ANTLR end "entryRuleParameterSetInstance"


    // $ANTLR start "ruleParameterSetInstance"
    // InternalComponentParameter.g:574:1: ruleParameterSetInstance returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetInstance' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_parameterInstances_4_0= ruleAbstractParameterInstance ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterSetInstance() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameterInstances_4_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:580:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetInstance' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_parameterInstances_4_0= ruleAbstractParameterInstance ) )* otherlv_5= '}' ) )
            // InternalComponentParameter.g:581:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetInstance' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_parameterInstances_4_0= ruleAbstractParameterInstance ) )* otherlv_5= '}' )
            {
            // InternalComponentParameter.g:581:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetInstance' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_parameterInstances_4_0= ruleAbstractParameterInstance ) )* otherlv_5= '}' )
            // InternalComponentParameter.g:582:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetInstance' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_parameterInstances_4_0= ruleAbstractParameterInstance ) )* otherlv_5= '}'
            {
            // InternalComponentParameter.g:582:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DOCU_COMMENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentParameter.g:583:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentParameter.g:583:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentParameter.g:584:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_13); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getParameterSetInstanceAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterSetInstanceRule());
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

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterSetInstanceAccess().getParameterSetInstanceKeyword_1());
            		
            // InternalComponentParameter.g:604:3: ( ( ruleFQN ) )
            // InternalComponentParameter.g:605:4: ( ruleFQN )
            {
            // InternalComponentParameter.g:605:4: ( ruleFQN )
            // InternalComponentParameter.g:606:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterSetInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterSetInstanceAccess().getParamSetParameterSetDefinitionCrossReference_2_0());
            				
            pushFollow(FOLLOW_6);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterSetInstanceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentParameter.g:624:3: ( (lv_parameterInstances_4_0= ruleAbstractParameterInstance ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_DOCU_COMMENT||LA14_0==24||LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalComponentParameter.g:625:4: (lv_parameterInstances_4_0= ruleAbstractParameterInstance )
            	    {
            	    // InternalComponentParameter.g:625:4: (lv_parameterInstances_4_0= ruleAbstractParameterInstance )
            	    // InternalComponentParameter.g:626:5: lv_parameterInstances_4_0= ruleAbstractParameterInstance
            	    {

            	    					newCompositeNode(grammarAccess.getParameterSetInstanceAccess().getParameterInstancesAbstractParameterInstanceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_parameterInstances_4_0=ruleAbstractParameterInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterSetInstanceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameterInstances",
            	    						lv_parameterInstances_4_0,
            	    						"org.xtext.component.componentParameter.ComponentParameter.AbstractParameterInstance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterSetInstanceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameterSetInstance"


    // $ANTLR start "entryRuleAbstractParameterInstance"
    // InternalComponentParameter.g:651:1: entryRuleAbstractParameterInstance returns [EObject current=null] : iv_ruleAbstractParameterInstance= ruleAbstractParameterInstance EOF ;
    public final EObject entryRuleAbstractParameterInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameterInstance = null;


        try {
            // InternalComponentParameter.g:651:66: (iv_ruleAbstractParameterInstance= ruleAbstractParameterInstance EOF )
            // InternalComponentParameter.g:652:2: iv_ruleAbstractParameterInstance= ruleAbstractParameterInstance EOF
            {
             newCompositeNode(grammarAccess.getAbstractParameterInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractParameterInstance=ruleAbstractParameterInstance();

            state._fsp--;

             current =iv_ruleAbstractParameterInstance; 
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
    // $ANTLR end "entryRuleAbstractParameterInstance"


    // $ANTLR start "ruleAbstractParameterInstance"
    // InternalComponentParameter.g:658:1: ruleAbstractParameterInstance returns [EObject current=null] : (this_TriggerInstance_0= ruleTriggerInstance | this_ParameterInstance_1= ruleParameterInstance ) ;
    public final EObject ruleAbstractParameterInstance() throws RecognitionException {
        EObject current = null;

        EObject this_TriggerInstance_0 = null;

        EObject this_ParameterInstance_1 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:664:2: ( (this_TriggerInstance_0= ruleTriggerInstance | this_ParameterInstance_1= ruleParameterInstance ) )
            // InternalComponentParameter.g:665:2: (this_TriggerInstance_0= ruleTriggerInstance | this_ParameterInstance_1= ruleParameterInstance )
            {
            // InternalComponentParameter.g:665:2: (this_TriggerInstance_0= ruleTriggerInstance | this_ParameterInstance_1= ruleParameterInstance )
            int alt15=2;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==24) ) {
                    alt15=1;
                }
                else if ( (LA15_1==26) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt15=1;
                }
                break;
            case 26:
                {
                alt15=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalComponentParameter.g:666:3: this_TriggerInstance_0= ruleTriggerInstance
                    {

                    			newCompositeNode(grammarAccess.getAbstractParameterInstanceAccess().getTriggerInstanceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TriggerInstance_0=ruleTriggerInstance();

                    state._fsp--;


                    			current = this_TriggerInstance_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentParameter.g:675:3: this_ParameterInstance_1= ruleParameterInstance
                    {

                    			newCompositeNode(grammarAccess.getAbstractParameterInstanceAccess().getParameterInstanceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterInstance_1=ruleParameterInstance();

                    state._fsp--;


                    			current = this_ParameterInstance_1;
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
    // $ANTLR end "ruleAbstractParameterInstance"


    // $ANTLR start "entryRuleTriggerInstance"
    // InternalComponentParameter.g:687:1: entryRuleTriggerInstance returns [EObject current=null] : iv_ruleTriggerInstance= ruleTriggerInstance EOF ;
    public final EObject entryRuleTriggerInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerInstance = null;


        try {
            // InternalComponentParameter.g:687:56: (iv_ruleTriggerInstance= ruleTriggerInstance EOF )
            // InternalComponentParameter.g:688:2: iv_ruleTriggerInstance= ruleTriggerInstance EOF
            {
             newCompositeNode(grammarAccess.getTriggerInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggerInstance=ruleTriggerInstance();

            state._fsp--;

             current =iv_ruleTriggerInstance; 
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
    // $ANTLR end "entryRuleTriggerInstance"


    // $ANTLR start "ruleTriggerInstance"
    // InternalComponentParameter.g:694:1: ruleTriggerInstance returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'TriggerInstance' ( ( ruleFQN ) ) ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'passive' ) (otherlv_5= ';' )? ) ;
    public final EObject ruleTriggerInstance() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_active_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalComponentParameter.g:700:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'TriggerInstance' ( ( ruleFQN ) ) ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'passive' ) (otherlv_5= ';' )? ) )
            // InternalComponentParameter.g:701:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'TriggerInstance' ( ( ruleFQN ) ) ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'passive' ) (otherlv_5= ';' )? )
            {
            // InternalComponentParameter.g:701:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'TriggerInstance' ( ( ruleFQN ) ) ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'passive' ) (otherlv_5= ';' )? )
            // InternalComponentParameter.g:702:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'TriggerInstance' ( ( ruleFQN ) ) ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'passive' ) (otherlv_5= ';' )?
            {
            // InternalComponentParameter.g:702:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DOCU_COMMENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentParameter.g:703:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentParameter.g:703:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentParameter.g:704:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_15); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getTriggerInstanceAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTriggerInstanceRule());
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

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTriggerInstanceAccess().getTriggerInstanceKeyword_1());
            		
            // InternalComponentParameter.g:724:3: ( ( ruleFQN ) )
            // InternalComponentParameter.g:725:4: ( ruleFQN )
            {
            // InternalComponentParameter.g:725:4: ( ruleFQN )
            // InternalComponentParameter.g:726:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTriggerInstanceAccess().getTriggerDefTriggerDefinitionCrossReference_2_0());
            				
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentParameter.g:740:3: ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'passive' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            else if ( (LA17_0==22) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentParameter.g:741:4: ( (lv_active_3_0= 'active' ) )
                    {
                    // InternalComponentParameter.g:741:4: ( (lv_active_3_0= 'active' ) )
                    // InternalComponentParameter.g:742:5: (lv_active_3_0= 'active' )
                    {
                    // InternalComponentParameter.g:742:5: (lv_active_3_0= 'active' )
                    // InternalComponentParameter.g:743:6: lv_active_3_0= 'active'
                    {
                    lv_active_3_0=(Token)match(input,21,FOLLOW_16); 

                    						newLeafNode(lv_active_3_0, grammarAccess.getTriggerInstanceAccess().getActiveActiveKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTriggerInstanceRule());
                    						}
                    						setWithLastConsumed(current, "active", true, "active");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponentParameter.g:756:4: otherlv_4= 'passive'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getTriggerInstanceAccess().getPassiveKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalComponentParameter.g:761:3: (otherlv_5= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentParameter.g:762:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTriggerInstanceAccess().getSemicolonKeyword_4());
                    			

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
    // $ANTLR end "ruleTriggerInstance"


    // $ANTLR start "entryRuleParameterInstance"
    // InternalComponentParameter.g:771:1: entryRuleParameterInstance returns [EObject current=null] : iv_ruleParameterInstance= ruleParameterInstance EOF ;
    public final EObject entryRuleParameterInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInstance = null;


        try {
            // InternalComponentParameter.g:771:58: (iv_ruleParameterInstance= ruleParameterInstance EOF )
            // InternalComponentParameter.g:772:2: iv_ruleParameterInstance= ruleParameterInstance EOF
            {
             newCompositeNode(grammarAccess.getParameterInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterInstance=ruleParameterInstance();

            state._fsp--;

             current =iv_ruleParameterInstance; 
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
    // $ANTLR end "entryRuleParameterInstance"


    // $ANTLR start "ruleParameterInstance"
    // InternalComponentParameter.g:778:1: ruleParameterInstance returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterInstance' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeRefinement ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterInstance() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:784:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterInstance' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeRefinement ) )* otherlv_5= '}' ) )
            // InternalComponentParameter.g:785:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterInstance' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeRefinement ) )* otherlv_5= '}' )
            {
            // InternalComponentParameter.g:785:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterInstance' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeRefinement ) )* otherlv_5= '}' )
            // InternalComponentParameter.g:786:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterInstance' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeRefinement ) )* otherlv_5= '}'
            {
            // InternalComponentParameter.g:786:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DOCU_COMMENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentParameter.g:787:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentParameter.g:787:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentParameter.g:788:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_17); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getParameterInstanceAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterInstanceRule());
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

            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterInstanceAccess().getParameterInstanceKeyword_1());
            		
            // InternalComponentParameter.g:808:3: ( ( ruleFQN ) )
            // InternalComponentParameter.g:809:4: ( ruleFQN )
            {
            // InternalComponentParameter.g:809:4: ( ruleFQN )
            // InternalComponentParameter.g:810:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterInstanceAccess().getParameterDefParameterDefinitionCrossReference_2_0());
            				
            pushFollow(FOLLOW_6);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterInstanceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentParameter.g:828:3: ( (lv_attributes_4_0= ruleAttributeRefinement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_DOCU_COMMENT)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalComponentParameter.g:829:4: (lv_attributes_4_0= ruleAttributeRefinement )
            	    {
            	    // InternalComponentParameter.g:829:4: (lv_attributes_4_0= ruleAttributeRefinement )
            	    // InternalComponentParameter.g:830:5: lv_attributes_4_0= ruleAttributeRefinement
            	    {

            	    					newCompositeNode(grammarAccess.getParameterInstanceAccess().getAttributesAttributeRefinementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_4_0=ruleAttributeRefinement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterInstanceRule());
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
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterInstanceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameterInstance"


    // $ANTLR start "entryRuleFQNW"
    // InternalComponentParameter.g:855:1: entryRuleFQNW returns [String current=null] : iv_ruleFQNW= ruleFQNW EOF ;
    public final String entryRuleFQNW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNW = null;


        try {
            // InternalComponentParameter.g:855:44: (iv_ruleFQNW= ruleFQNW EOF )
            // InternalComponentParameter.g:856:2: iv_ruleFQNW= ruleFQNW EOF
            {
             newCompositeNode(grammarAccess.getFQNWRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQNW=ruleFQNW();

            state._fsp--;

             current =iv_ruleFQNW.getText(); 
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
    // $ANTLR end "entryRuleFQNW"


    // $ANTLR start "ruleFQNW"
    // InternalComponentParameter.g:862:1: ruleFQNW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFQNW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:868:2: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // InternalComponentParameter.g:869:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // InternalComponentParameter.g:869:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // InternalComponentParameter.g:870:3: this_FQN_0= ruleFQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalComponentParameter.g:880:3: (kw= '.*' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentParameter.g:881:4: kw= '.*'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleFQNW"


    // $ANTLR start "entryRuleParamDefRepoImport"
    // InternalComponentParameter.g:891:1: entryRuleParamDefRepoImport returns [EObject current=null] : iv_ruleParamDefRepoImport= ruleParamDefRepoImport EOF ;
    public final EObject entryRuleParamDefRepoImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamDefRepoImport = null;


        try {
            // InternalComponentParameter.g:891:59: (iv_ruleParamDefRepoImport= ruleParamDefRepoImport EOF )
            // InternalComponentParameter.g:892:2: iv_ruleParamDefRepoImport= ruleParamDefRepoImport EOF
            {
             newCompositeNode(grammarAccess.getParamDefRepoImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamDefRepoImport=ruleParamDefRepoImport();

            state._fsp--;

             current =iv_ruleParamDefRepoImport; 
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
    // $ANTLR end "entryRuleParamDefRepoImport"


    // $ANTLR start "ruleParamDefRepoImport"
    // InternalComponentParameter.g:898:1: ruleParamDefRepoImport returns [EObject current=null] : (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleParamDefRepoImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:904:2: ( (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) )
            // InternalComponentParameter.g:905:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentParameter.g:905:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            // InternalComponentParameter.g:906:3: otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParamDefRepoImportAccess().getImportKeyword_0());
            		
            // InternalComponentParameter.g:910:3: ( (lv_importedNamespace_1_0= ruleFQNW ) )
            // InternalComponentParameter.g:911:4: (lv_importedNamespace_1_0= ruleFQNW )
            {
            // InternalComponentParameter.g:911:4: (lv_importedNamespace_1_0= ruleFQNW )
            // InternalComponentParameter.g:912:5: lv_importedNamespace_1_0= ruleFQNW
            {

            					newCompositeNode(grammarAccess.getParamDefRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_importedNamespace_1_0=ruleFQNW();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamDefRepoImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.xtext.service.parameterDefinition.ParameterDefinition.FQNW");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentParameter.g:929:3: (otherlv_2= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentParameter.g:930:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getParamDefRepoImportAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleParamDefRepoImport"


    // $ANTLR start "entryRuleParameterSetRepository"
    // InternalComponentParameter.g:939:1: entryRuleParameterSetRepository returns [EObject current=null] : iv_ruleParameterSetRepository= ruleParameterSetRepository EOF ;
    public final EObject entryRuleParameterSetRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetRepository = null;


        try {
            // InternalComponentParameter.g:939:63: (iv_ruleParameterSetRepository= ruleParameterSetRepository EOF )
            // InternalComponentParameter.g:940:2: iv_ruleParameterSetRepository= ruleParameterSetRepository EOF
            {
             newCompositeNode(grammarAccess.getParameterSetRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterSetRepository=ruleParameterSetRepository();

            state._fsp--;

             current =iv_ruleParameterSetRepository; 
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
    // $ANTLR end "entryRuleParameterSetRepository"


    // $ANTLR start "ruleParameterSetRepository"
    // InternalComponentParameter.g:946:1: ruleParameterSetRepository returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sets_4_0= ruleParameterSetDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterSetRepository() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_sets_4_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:952:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sets_4_0= ruleParameterSetDefinition ) )* otherlv_5= '}' ) )
            // InternalComponentParameter.g:953:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sets_4_0= ruleParameterSetDefinition ) )* otherlv_5= '}' )
            {
            // InternalComponentParameter.g:953:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sets_4_0= ruleParameterSetDefinition ) )* otherlv_5= '}' )
            // InternalComponentParameter.g:954:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sets_4_0= ruleParameterSetDefinition ) )* otherlv_5= '}'
            {
            // InternalComponentParameter.g:954:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_DOCU_COMMENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentParameter.g:955:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentParameter.g:955:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentParameter.g:956:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_19); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getParameterSetRepositoryAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterSetRepositoryRule());
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

            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterSetRepositoryAccess().getParameterSetRepositoryKeyword_1());
            		
            // InternalComponentParameter.g:976:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentParameter.g:977:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentParameter.g:977:4: (lv_name_2_0= RULE_ID )
            // InternalComponentParameter.g:978:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getParameterSetRepositoryAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterSetRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterSetRepositoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentParameter.g:998:3: ( (lv_sets_4_0= ruleParameterSetDefinition ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_DOCU_COMMENT||LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalComponentParameter.g:999:4: (lv_sets_4_0= ruleParameterSetDefinition )
            	    {
            	    // InternalComponentParameter.g:999:4: (lv_sets_4_0= ruleParameterSetDefinition )
            	    // InternalComponentParameter.g:1000:5: lv_sets_4_0= ruleParameterSetDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getParameterSetRepositoryAccess().getSetsParameterSetDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_sets_4_0=ruleParameterSetDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterSetRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sets",
            	    						lv_sets_4_0,
            	    						"org.xtext.service.parameterDefinition.ParameterDefinition.ParameterSetDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterSetRepositoryAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameterSetRepository"


    // $ANTLR start "entryRuleParameterSetDefinition"
    // InternalComponentParameter.g:1025:1: entryRuleParameterSetDefinition returns [EObject current=null] : iv_ruleParameterSetDefinition= ruleParameterSetDefinition EOF ;
    public final EObject entryRuleParameterSetDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetDefinition = null;


        try {
            // InternalComponentParameter.g:1025:63: (iv_ruleParameterSetDefinition= ruleParameterSetDefinition EOF )
            // InternalComponentParameter.g:1026:2: iv_ruleParameterSetDefinition= ruleParameterSetDefinition EOF
            {
             newCompositeNode(grammarAccess.getParameterSetDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterSetDefinition=ruleParameterSetDefinition();

            state._fsp--;

             current =iv_ruleParameterSetDefinition; 
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
    // $ANTLR end "entryRuleParameterSetDefinition"


    // $ANTLR start "ruleParameterSetDefinition"
    // InternalComponentParameter.g:1032:1: ruleParameterSetDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSet' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? otherlv_7= '{' ( (lv_parameters_8_0= ruleAbstractParameter ) )* otherlv_9= '}' ) ;
    public final EObject ruleParameterSetDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_8_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1038:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSet' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? otherlv_7= '{' ( (lv_parameters_8_0= ruleAbstractParameter ) )* otherlv_9= '}' ) )
            // InternalComponentParameter.g:1039:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSet' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? otherlv_7= '{' ( (lv_parameters_8_0= ruleAbstractParameter ) )* otherlv_9= '}' )
            {
            // InternalComponentParameter.g:1039:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSet' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? otherlv_7= '{' ( (lv_parameters_8_0= ruleAbstractParameter ) )* otherlv_9= '}' )
            // InternalComponentParameter.g:1040:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSet' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? otherlv_7= '{' ( (lv_parameters_8_0= ruleAbstractParameter ) )* otherlv_9= '}'
            {
            // InternalComponentParameter.g:1040:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_DOCU_COMMENT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentParameter.g:1041:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentParameter.g:1041:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentParameter.g:1042:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_21); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getParameterSetDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterSetDefinitionRule());
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

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterSetDefinitionAccess().getParameterSetKeyword_1());
            		
            // InternalComponentParameter.g:1062:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentParameter.g:1063:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentParameter.g:1063:4: (lv_name_2_0= RULE_ID )
            // InternalComponentParameter.g:1064:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_2_0, grammarAccess.getParameterSetDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterSetDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalComponentParameter.g:1080:3: (otherlv_3= 'extends' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponentParameter.g:1081:4: otherlv_3= 'extends' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterSetDefinitionAccess().getExtendsKeyword_3_0());
                    			
                    // InternalComponentParameter.g:1085:4: ( ( ruleFQN ) )
                    // InternalComponentParameter.g:1086:5: ( ruleFQN )
                    {
                    // InternalComponentParameter.g:1086:5: ( ruleFQN )
                    // InternalComponentParameter.g:1087:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterSetDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentParameter.g:1101:4: (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==32) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalComponentParameter.g:1102:5: otherlv_5= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_5=(Token)match(input,32,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getParameterSetDefinitionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalComponentParameter.g:1106:5: ( ( ruleFQN ) )
                    	    // InternalComponentParameter.g:1107:6: ( ruleFQN )
                    	    {
                    	    // InternalComponentParameter.g:1107:6: ( ruleFQN )
                    	    // InternalComponentParameter.g:1108:7: ruleFQN
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParameterSetDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleFQN();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getParameterSetDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponentParameter.g:1128:3: ( (lv_parameters_8_0= ruleAbstractParameter ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_DOCU_COMMENT||(LA28_0>=33 && LA28_0<=34)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalComponentParameter.g:1129:4: (lv_parameters_8_0= ruleAbstractParameter )
            	    {
            	    // InternalComponentParameter.g:1129:4: (lv_parameters_8_0= ruleAbstractParameter )
            	    // InternalComponentParameter.g:1130:5: lv_parameters_8_0= ruleAbstractParameter
            	    {

            	    					newCompositeNode(grammarAccess.getParameterSetDefinitionAccess().getParametersAbstractParameterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_parameters_8_0=ruleAbstractParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterSetDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_8_0,
            	    						"org.xtext.service.parameterDefinition.ParameterDefinition.AbstractParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getParameterSetDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleParameterSetDefinition"


    // $ANTLR start "entryRuleAbstractParameter"
    // InternalComponentParameter.g:1155:1: entryRuleAbstractParameter returns [EObject current=null] : iv_ruleAbstractParameter= ruleAbstractParameter EOF ;
    public final EObject entryRuleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameter = null;


        try {
            // InternalComponentParameter.g:1155:58: (iv_ruleAbstractParameter= ruleAbstractParameter EOF )
            // InternalComponentParameter.g:1156:2: iv_ruleAbstractParameter= ruleAbstractParameter EOF
            {
             newCompositeNode(grammarAccess.getAbstractParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractParameter=ruleAbstractParameter();

            state._fsp--;

             current =iv_ruleAbstractParameter; 
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
    // $ANTLR end "entryRuleAbstractParameter"


    // $ANTLR start "ruleAbstractParameter"
    // InternalComponentParameter.g:1162:1: ruleAbstractParameter returns [EObject current=null] : (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition ) ;
    public final EObject ruleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterDefinition_0 = null;

        EObject this_TriggerDefinition_1 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1168:2: ( (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition ) )
            // InternalComponentParameter.g:1169:2: (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition )
            {
            // InternalComponentParameter.g:1169:2: (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition )
            int alt29=2;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
                {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==34) ) {
                    alt29=2;
                }
                else if ( (LA29_1==33) ) {
                    alt29=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt29=1;
                }
                break;
            case 34:
                {
                alt29=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalComponentParameter.g:1170:3: this_ParameterDefinition_0= ruleParameterDefinition
                    {

                    			newCompositeNode(grammarAccess.getAbstractParameterAccess().getParameterDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDefinition_0=ruleParameterDefinition();

                    state._fsp--;


                    			current = this_ParameterDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentParameter.g:1179:3: this_TriggerDefinition_1= ruleTriggerDefinition
                    {

                    			newCompositeNode(grammarAccess.getAbstractParameterAccess().getTriggerDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TriggerDefinition_1=ruleTriggerDefinition();

                    state._fsp--;


                    			current = this_TriggerDefinition_1;
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
    // $ANTLR end "ruleAbstractParameter"


    // $ANTLR start "entryRuleParameterDefinition"
    // InternalComponentParameter.g:1191:1: entryRuleParameterDefinition returns [EObject current=null] : iv_ruleParameterDefinition= ruleParameterDefinition EOF ;
    public final EObject entryRuleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDefinition = null;


        try {
            // InternalComponentParameter.g:1191:60: (iv_ruleParameterDefinition= ruleParameterDefinition EOF )
            // InternalComponentParameter.g:1192:2: iv_ruleParameterDefinition= ruleParameterDefinition EOF
            {
             newCompositeNode(grammarAccess.getParameterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDefinition=ruleParameterDefinition();

            state._fsp--;

             current =iv_ruleParameterDefinition; 
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
    // $ANTLR end "entryRuleParameterDefinition"


    // $ANTLR start "ruleParameterDefinition"
    // InternalComponentParameter.g:1198:1: ruleParameterDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1204:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' ) )
            // InternalComponentParameter.g:1205:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' )
            {
            // InternalComponentParameter.g:1205:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' )
            // InternalComponentParameter.g:1206:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}'
            {
            // InternalComponentParameter.g:1206:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_DOCU_COMMENT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponentParameter.g:1207:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentParameter.g:1207:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentParameter.g:1208:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_25); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getParameterDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterDefinitionRule());
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

            otherlv_1=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDefinitionAccess().getParameterKeyword_1());
            		
            // InternalComponentParameter.g:1228:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentParameter.g:1229:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentParameter.g:1229:4: (lv_name_2_0= RULE_ID )
            // InternalComponentParameter.g:1230:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getParameterDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentParameter.g:1250:3: ( (lv_attributes_4_0= ruleAttributeDefinition ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_DOCU_COMMENT)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalComponentParameter.g:1251:4: (lv_attributes_4_0= ruleAttributeDefinition )
            	    {
            	    // InternalComponentParameter.g:1251:4: (lv_attributes_4_0= ruleAttributeDefinition )
            	    // InternalComponentParameter.g:1252:5: lv_attributes_4_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getParameterDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_4_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_4_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameterDefinition"


    // $ANTLR start "entryRuleTriggerDefinition"
    // InternalComponentParameter.g:1277:1: entryRuleTriggerDefinition returns [EObject current=null] : iv_ruleTriggerDefinition= ruleTriggerDefinition EOF ;
    public final EObject entryRuleTriggerDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerDefinition = null;


        try {
            // InternalComponentParameter.g:1277:58: (iv_ruleTriggerDefinition= ruleTriggerDefinition EOF )
            // InternalComponentParameter.g:1278:2: iv_ruleTriggerDefinition= ruleTriggerDefinition EOF
            {
             newCompositeNode(grammarAccess.getTriggerDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggerDefinition=ruleTriggerDefinition();

            state._fsp--;

             current =iv_ruleTriggerDefinition; 
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
    // $ANTLR end "entryRuleTriggerDefinition"


    // $ANTLR start "ruleTriggerDefinition"
    // InternalComponentParameter.g:1284:1: ruleTriggerDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Trigger' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleTriggerDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1290:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Trigger' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' ) )
            // InternalComponentParameter.g:1291:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Trigger' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' )
            {
            // InternalComponentParameter.g:1291:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Trigger' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' )
            // InternalComponentParameter.g:1292:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Trigger' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}'
            {
            // InternalComponentParameter.g:1292:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_DOCU_COMMENT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalComponentParameter.g:1293:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentParameter.g:1293:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentParameter.g:1294:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_26); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getTriggerDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTriggerDefinitionRule());
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

            otherlv_1=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTriggerDefinitionAccess().getTriggerKeyword_1());
            		
            // InternalComponentParameter.g:1314:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentParameter.g:1315:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentParameter.g:1315:4: (lv_name_2_0= RULE_ID )
            // InternalComponentParameter.g:1316:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTriggerDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getTriggerDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentParameter.g:1336:3: ( (lv_attributes_4_0= ruleAttributeDefinition ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_DOCU_COMMENT)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalComponentParameter.g:1337:4: (lv_attributes_4_0= ruleAttributeDefinition )
            	    {
            	    // InternalComponentParameter.g:1337:4: (lv_attributes_4_0= ruleAttributeDefinition )
            	    // InternalComponentParameter.g:1338:5: lv_attributes_4_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getTriggerDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_4_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTriggerDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_4_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTriggerDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTriggerDefinition"


    // $ANTLR start "entryRuleAttributeDefinition"
    // InternalComponentParameter.g:1363:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalComponentParameter.g:1363:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalComponentParameter.g:1364:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
             newCompositeNode(grammarAccess.getAttributeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();

            state._fsp--;

             current =iv_ruleAttributeDefinition; 
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
    // $ANTLR end "entryRuleAttributeDefinition"


    // $ANTLR start "ruleAttributeDefinition"
    // InternalComponentParameter.g:1370:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_defaultvalue_5_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1376:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? ) )
            // InternalComponentParameter.g:1377:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? )
            {
            // InternalComponentParameter.g:1377:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? )
            // InternalComponentParameter.g:1378:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )?
            {
            // InternalComponentParameter.g:1378:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_DOCU_COMMENT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalComponentParameter.g:1379:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentParameter.g:1379:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentParameter.g:1380:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_4); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getAttributeDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeDefinitionRule());
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

            // InternalComponentParameter.g:1396:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentParameter.g:1397:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentParameter.g:1397:4: (lv_name_1_0= RULE_ID )
            // InternalComponentParameter.g:1398:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2());
            		
            // InternalComponentParameter.g:1418:3: ( (lv_type_3_0= ruleAbstractAttributeType ) )
            // InternalComponentParameter.g:1419:4: (lv_type_3_0= ruleAbstractAttributeType )
            {
            // InternalComponentParameter.g:1419:4: (lv_type_3_0= ruleAbstractAttributeType )
            // InternalComponentParameter.g:1420:5: lv_type_3_0= ruleAbstractAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_type_3_0=ruleAbstractAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.AbstractAttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentParameter.g:1437:3: (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalComponentParameter.g:1438:4: otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalComponentParameter.g:1442:4: ( (lv_defaultvalue_5_0= ruleAbstractValue ) )
                    // InternalComponentParameter.g:1443:5: (lv_defaultvalue_5_0= ruleAbstractValue )
                    {
                    // InternalComponentParameter.g:1443:5: (lv_defaultvalue_5_0= ruleAbstractValue )
                    // InternalComponentParameter.g:1444:6: lv_defaultvalue_5_0= ruleAbstractValue
                    {

                    						newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_defaultvalue_5_0=ruleAbstractValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"defaultvalue",
                    							lv_defaultvalue_5_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.AbstractValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentParameter.g:1462:3: (otherlv_6= ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalComponentParameter.g:1463:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5());
                    			

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
    // $ANTLR end "ruleAttributeDefinition"


    // $ANTLR start "entryRuleAttributeRefinement"
    // InternalComponentParameter.g:1472:1: entryRuleAttributeRefinement returns [EObject current=null] : iv_ruleAttributeRefinement= ruleAttributeRefinement EOF ;
    public final EObject entryRuleAttributeRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeRefinement = null;


        try {
            // InternalComponentParameter.g:1472:60: (iv_ruleAttributeRefinement= ruleAttributeRefinement EOF )
            // InternalComponentParameter.g:1473:2: iv_ruleAttributeRefinement= ruleAttributeRefinement EOF
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
    // InternalComponentParameter.g:1479:1: ruleAttributeRefinement returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( ( ruleFQN ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractValue ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleAttributeRefinement() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1485:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( ( ruleFQN ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractValue ) ) (otherlv_4= ';' )? ) )
            // InternalComponentParameter.g:1486:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( ( ruleFQN ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractValue ) ) (otherlv_4= ';' )? )
            {
            // InternalComponentParameter.g:1486:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( ( ruleFQN ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractValue ) ) (otherlv_4= ';' )? )
            // InternalComponentParameter.g:1487:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( ( ruleFQN ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractValue ) ) (otherlv_4= ';' )?
            {
            // InternalComponentParameter.g:1487:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_DOCU_COMMENT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalComponentParameter.g:1488:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentParameter.g:1488:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentParameter.g:1489:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_4); 

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

            // InternalComponentParameter.g:1505:3: ( ( ruleFQN ) )
            // InternalComponentParameter.g:1506:4: ( ruleFQN )
            {
            // InternalComponentParameter.g:1506:4: ( ruleFQN )
            // InternalComponentParameter.g:1507:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRefinementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_31);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeRefinementAccess().getEqualsSignKeyword_2());
            		
            // InternalComponentParameter.g:1525:3: ( (lv_value_3_0= ruleAbstractValue ) )
            // InternalComponentParameter.g:1526:4: (lv_value_3_0= ruleAbstractValue )
            {
            // InternalComponentParameter.g:1526:4: (lv_value_3_0= ruleAbstractValue )
            // InternalComponentParameter.g:1527:5: lv_value_3_0= ruleAbstractValue
            {

            					newCompositeNode(grammarAccess.getAttributeRefinementAccess().getValueAbstractValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalComponentParameter.g:1544:3: (otherlv_4= ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalComponentParameter.g:1545:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

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
    // InternalComponentParameter.g:1554:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalComponentParameter.g:1554:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalComponentParameter.g:1555:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalComponentParameter.g:1561:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponentParameter.g:1567:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalComponentParameter.g:1568:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalComponentParameter.g:1568:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalComponentParameter.g:1569:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponentParameter.g:1576:3: (kw= '.' this_ID_2= RULE_ID )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==37) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalComponentParameter.g:1577:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,37,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalComponentParameter.g:1594:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalComponentParameter.g:1594:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalComponentParameter.g:1595:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalComponentParameter.g:1601:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalComponentParameter.g:1607:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalComponentParameter.g:1608:2: (kw= 'true' | kw= 'false' )
            {
            // InternalComponentParameter.g:1608:2: (kw= 'true' | kw= 'false' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38) ) {
                alt40=1;
            }
            else if ( (LA40_0==39) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalComponentParameter.g:1609:3: kw= 'true'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentParameter.g:1615:3: kw= 'false'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalComponentParameter.g:1624:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentParameter.g:1624:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentParameter.g:1625:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentParameter.g:1631:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalComponentParameter.g:1637:2: (this_STRING_0= RULE_STRING )
            // InternalComponentParameter.g:1638:2: this_STRING_0= RULE_STRING
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
    // InternalComponentParameter.g:1648:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalComponentParameter.g:1648:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalComponentParameter.g:1649:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalComponentParameter.g:1655:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalComponentParameter.g:1661:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalComponentParameter.g:1662:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalComponentParameter.g:1662:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalComponentParameter.g:1663:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalComponentParameter.g:1663:3: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalComponentParameter.g:1664:4: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_33); 

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
    // InternalComponentParameter.g:1681:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalComponentParameter.g:1681:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalComponentParameter.g:1682:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalComponentParameter.g:1688:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalComponentParameter.g:1694:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalComponentParameter.g:1695:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalComponentParameter.g:1695:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalComponentParameter.g:1696:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalComponentParameter.g:1696:3: (kw= '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==40) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalComponentParameter.g:1697:4: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_34); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalComponentParameter.g:1703:3: (this_INT_1= RULE_INT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalComponentParameter.g:1704:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_35); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,37,FOLLOW_33); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_36); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalComponentParameter.g:1724:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=41 && LA46_0<=42)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalComponentParameter.g:1725:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalComponentParameter.g:1725:4: (kw= 'E' | kw= 'e' )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==41) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==42) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalComponentParameter.g:1726:5: kw= 'E'
                            {
                            kw=(Token)match(input,41,FOLLOW_37); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalComponentParameter.g:1732:5: kw= 'e'
                            {
                            kw=(Token)match(input,42,FOLLOW_37); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalComponentParameter.g:1738:4: (kw= '-' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==40) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalComponentParameter.g:1739:5: kw= '-'
                            {
                            kw=(Token)match(input,40,FOLLOW_33); 

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
    // InternalComponentParameter.g:1757:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalComponentParameter.g:1757:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalComponentParameter.g:1758:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
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
    // InternalComponentParameter.g:1764:1: ruleEnumerationElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1770:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) )
            // InternalComponentParameter.g:1771:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            {
            // InternalComponentParameter.g:1771:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            // InternalComponentParameter.g:1772:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )?
            {
            // InternalComponentParameter.g:1772:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalComponentParameter.g:1773:4: (lv_name_0_0= RULE_ID )
            {
            // InternalComponentParameter.g:1773:4: (lv_name_0_0= RULE_ID )
            // InternalComponentParameter.g:1774:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            // InternalComponentParameter.g:1790:3: (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==36) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalComponentParameter.g:1791:4: otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalComponentParameter.g:1795:4: ( (lv_value_2_0= ruleEInt ) )
                    // InternalComponentParameter.g:1796:5: (lv_value_2_0= ruleEInt )
                    {
                    // InternalComponentParameter.g:1796:5: (lv_value_2_0= ruleEInt )
                    // InternalComponentParameter.g:1797:6: lv_value_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEnumerationElementAccess().getValueEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            // InternalComponentParameter.g:1815:3: (otherlv_3= ';' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==25) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalComponentParameter.g:1816:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

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
    // InternalComponentParameter.g:1825:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // InternalComponentParameter.g:1825:62: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // InternalComponentParameter.g:1826:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
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
    // InternalComponentParameter.g:1832:1: ruleAbstractAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_InlineEnumerationType_1 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1838:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) )
            // InternalComponentParameter.g:1839:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            {
            // InternalComponentParameter.g:1839:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=47 && LA49_0<=58)) ) {
                alt49=1;
            }
            else if ( (LA49_0==43) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalComponentParameter.g:1840:3: this_PrimitiveType_0= rulePrimitiveType
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
                    // InternalComponentParameter.g:1849:3: this_InlineEnumerationType_1= ruleInlineEnumerationType
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
    // InternalComponentParameter.g:1861:1: entryRuleInlineEnumerationType returns [EObject current=null] : iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF ;
    public final EObject entryRuleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineEnumerationType = null;


        try {
            // InternalComponentParameter.g:1861:62: (iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF )
            // InternalComponentParameter.g:1862:2: iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF
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
    // InternalComponentParameter.g:1868:1: ruleInlineEnumerationType returns [EObject current=null] : (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_array_1_0 = null;

        EObject lv_enums_3_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1874:2: ( (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) )
            // InternalComponentParameter.g:1875:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            {
            // InternalComponentParameter.g:1875:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            // InternalComponentParameter.g:1876:3: otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0());
            		
            // InternalComponentParameter.g:1880:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==44) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalComponentParameter.g:1881:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalComponentParameter.g:1881:4: (lv_array_1_0= ruleArrayType )
                    // InternalComponentParameter.g:1882:5: lv_array_1_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getArrayArrayTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_6);
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

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentParameter.g:1903:3: ( (lv_enums_3_0= ruleEnumerationElement ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalComponentParameter.g:1904:4: (lv_enums_3_0= ruleEnumerationElement )
            	    {
            	    // InternalComponentParameter.g:1904:4: (lv_enums_3_0= ruleEnumerationElement )
            	    // InternalComponentParameter.g:1905:5: lv_enums_3_0= ruleEnumerationElement
            	    {

            	    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_39);
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
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
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
    // InternalComponentParameter.g:1930:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalComponentParameter.g:1930:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalComponentParameter.g:1931:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalComponentParameter.g:1937:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1943:2: ( ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) )
            // InternalComponentParameter.g:1944:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            {
            // InternalComponentParameter.g:1944:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            // InternalComponentParameter.g:1945:3: () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']'
            {
            // InternalComponentParameter.g:1945:3: ()
            // InternalComponentParameter.g:1946:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalComponentParameter.g:1956:3: ( (lv_length_2_0= ruleCardinality ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_INT||LA52_0==46) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalComponentParameter.g:1957:4: (lv_length_2_0= ruleCardinality )
                    {
                    // InternalComponentParameter.g:1957:4: (lv_length_2_0= ruleCardinality )
                    // InternalComponentParameter.g:1958:5: lv_length_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_41);
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

            otherlv_3=(Token)match(input,45,FOLLOW_2); 

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
    // InternalComponentParameter.g:1983:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalComponentParameter.g:1983:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalComponentParameter.g:1984:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalComponentParameter.g:1990:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalComponentParameter.g:1996:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalComponentParameter.g:1997:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalComponentParameter.g:1997:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT) ) {
                alt53=1;
            }
            else if ( (LA53_0==46) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalComponentParameter.g:1998:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentParameter.g:2006:3: kw= '*'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

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
    // InternalComponentParameter.g:2015:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalComponentParameter.g:2015:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalComponentParameter.g:2016:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalComponentParameter.g:2022:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeName_0_0 = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:2028:2: ( ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) )
            // InternalComponentParameter.g:2029:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            {
            // InternalComponentParameter.g:2029:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            // InternalComponentParameter.g:2030:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )?
            {
            // InternalComponentParameter.g:2030:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) )
            // InternalComponentParameter.g:2031:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            {
            // InternalComponentParameter.g:2031:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            // InternalComponentParameter.g:2032:5: lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalComponentParameter.g:2049:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==44) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalComponentParameter.g:2050:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalComponentParameter.g:2050:4: (lv_array_1_0= ruleArrayType )
                    // InternalComponentParameter.g:2051:5: lv_array_1_0= ruleArrayType
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
    // InternalComponentParameter.g:2072:1: entryRuleAbstractValue returns [EObject current=null] : iv_ruleAbstractValue= ruleAbstractValue EOF ;
    public final EObject entryRuleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractValue = null;


        try {
            // InternalComponentParameter.g:2072:54: (iv_ruleAbstractValue= ruleAbstractValue EOF )
            // InternalComponentParameter.g:2073:2: iv_ruleAbstractValue= ruleAbstractValue EOF
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
    // InternalComponentParameter.g:2079:1: ruleAbstractValue returns [EObject current=null] : (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) ;
    public final EObject ruleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValue_0 = null;

        EObject this_ArrayValue_1 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:2085:2: ( (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) )
            // InternalComponentParameter.g:2086:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            {
            // InternalComponentParameter.g:2086:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID||(LA55_0>=RULE_STRING && LA55_0<=RULE_INT)||(LA55_0>=37 && LA55_0<=40)) ) {
                alt55=1;
            }
            else if ( (LA55_0==44) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalComponentParameter.g:2087:3: this_SingleValue_0= ruleSingleValue
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
                    // InternalComponentParameter.g:2096:3: this_ArrayValue_1= ruleArrayValue
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
    // InternalComponentParameter.g:2108:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalComponentParameter.g:2108:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalComponentParameter.g:2109:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalComponentParameter.g:2115:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:2121:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) )
            // InternalComponentParameter.g:2122:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            {
            // InternalComponentParameter.g:2122:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            // InternalComponentParameter.g:2123:3: otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalComponentParameter.g:2127:3: ( (lv_values_1_0= ruleSingleValue ) )
            // InternalComponentParameter.g:2128:4: (lv_values_1_0= ruleSingleValue )
            {
            // InternalComponentParameter.g:2128:4: (lv_values_1_0= ruleSingleValue )
            // InternalComponentParameter.g:2129:5: lv_values_1_0= ruleSingleValue
            {

            					newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalComponentParameter.g:2146:3: (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==32) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalComponentParameter.g:2147:4: otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_43); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalComponentParameter.g:2151:4: ( (lv_values_3_0= ruleSingleValue ) )
            	    // InternalComponentParameter.g:2152:5: (lv_values_3_0= ruleSingleValue )
            	    {
            	    // InternalComponentParameter.g:2152:5: (lv_values_3_0= ruleSingleValue )
            	    // InternalComponentParameter.g:2153:6: lv_values_3_0= ruleSingleValue
            	    {

            	    						newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
            	    break loop56;
                }
            } while (true);

            otherlv_4=(Token)match(input,45,FOLLOW_2); 

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
    // InternalComponentParameter.g:2179:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalComponentParameter.g:2179:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalComponentParameter.g:2180:2: iv_ruleSingleValue= ruleSingleValue EOF
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
    // InternalComponentParameter.g:2186:1: ruleSingleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:2192:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) )
            // InternalComponentParameter.g:2193:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            {
            // InternalComponentParameter.g:2193:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            int alt57=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==RULE_INT) ) {
                    int LA57_2 = input.LA(3);

                    if ( (LA57_2==37) ) {
                        alt57=2;
                    }
                    else if ( (LA57_2==EOF||(LA57_2>=RULE_ID && LA57_2<=RULE_DOCU_COMMENT)||LA57_2==17||LA57_2==25||LA57_2==32||LA57_2==45) ) {
                        alt57=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA57_1==37) ) {
                    alt57=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA57_2 = input.LA(2);

                if ( (LA57_2==37) ) {
                    alt57=2;
                }
                else if ( (LA57_2==EOF||(LA57_2>=RULE_ID && LA57_2<=RULE_DOCU_COMMENT)||LA57_2==17||LA57_2==25||LA57_2==32||LA57_2==45) ) {
                    alt57=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 2, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                alt57=2;
                }
                break;
            case RULE_STRING:
                {
                alt57=3;
                }
                break;
            case 38:
            case 39:
                {
                alt57=4;
                }
                break;
            case RULE_ID:
                {
                alt57=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalComponentParameter.g:2194:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalComponentParameter.g:2194:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalComponentParameter.g:2195:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalComponentParameter.g:2195:4: ()
                    // InternalComponentParameter.g:2196:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getIntValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalComponentParameter.g:2202:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalComponentParameter.g:2203:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalComponentParameter.g:2203:5: (lv_value_1_0= ruleEInt )
                    // InternalComponentParameter.g:2204:6: lv_value_1_0= ruleEInt
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
                    // InternalComponentParameter.g:2223:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    {
                    // InternalComponentParameter.g:2223:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    // InternalComponentParameter.g:2224:4: () ( (lv_value_3_0= ruleEDouble ) )
                    {
                    // InternalComponentParameter.g:2224:4: ()
                    // InternalComponentParameter.g:2225:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalComponentParameter.g:2231:4: ( (lv_value_3_0= ruleEDouble ) )
                    // InternalComponentParameter.g:2232:5: (lv_value_3_0= ruleEDouble )
                    {
                    // InternalComponentParameter.g:2232:5: (lv_value_3_0= ruleEDouble )
                    // InternalComponentParameter.g:2233:6: lv_value_3_0= ruleEDouble
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
                    // InternalComponentParameter.g:2252:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    {
                    // InternalComponentParameter.g:2252:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    // InternalComponentParameter.g:2253:4: () ( (lv_value_5_0= ruleEString ) )
                    {
                    // InternalComponentParameter.g:2253:4: ()
                    // InternalComponentParameter.g:2254:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getStringValueAction_2_0(),
                    						current);
                    				

                    }

                    // InternalComponentParameter.g:2260:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalComponentParameter.g:2261:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalComponentParameter.g:2261:5: (lv_value_5_0= ruleEString )
                    // InternalComponentParameter.g:2262:6: lv_value_5_0= ruleEString
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
                    // InternalComponentParameter.g:2281:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    {
                    // InternalComponentParameter.g:2281:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    // InternalComponentParameter.g:2282:4: () ( (lv_value_7_0= ruleEBoolean ) )
                    {
                    // InternalComponentParameter.g:2282:4: ()
                    // InternalComponentParameter.g:2283:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getBoolValueAction_3_0(),
                    						current);
                    				

                    }

                    // InternalComponentParameter.g:2289:4: ( (lv_value_7_0= ruleEBoolean ) )
                    // InternalComponentParameter.g:2290:5: (lv_value_7_0= ruleEBoolean )
                    {
                    // InternalComponentParameter.g:2290:5: (lv_value_7_0= ruleEBoolean )
                    // InternalComponentParameter.g:2291:6: lv_value_7_0= ruleEBoolean
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
                    // InternalComponentParameter.g:2310:3: ( () ( ( ruleFQN ) ) )
                    {
                    // InternalComponentParameter.g:2310:3: ( () ( ( ruleFQN ) ) )
                    // InternalComponentParameter.g:2311:4: () ( ( ruleFQN ) )
                    {
                    // InternalComponentParameter.g:2311:4: ()
                    // InternalComponentParameter.g:2312:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0(),
                    						current);
                    				

                    }

                    // InternalComponentParameter.g:2318:4: ( ( ruleFQN ) )
                    // InternalComponentParameter.g:2319:5: ( ruleFQN )
                    {
                    // InternalComponentParameter.g:2319:5: ( ruleFQN )
                    // InternalComponentParameter.g:2320:6: ruleFQN
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
    // InternalComponentParameter.g:2339:1: rulePRIMITIVE_TYPE_NAME returns [Enumerator current=null] : ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) ;
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
            // InternalComponentParameter.g:2345:2: ( ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) )
            // InternalComponentParameter.g:2346:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            {
            // InternalComponentParameter.g:2346:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            int alt58=12;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt58=1;
                }
                break;
            case 48:
                {
                alt58=2;
                }
                break;
            case 49:
                {
                alt58=3;
                }
                break;
            case 50:
                {
                alt58=4;
                }
                break;
            case 51:
                {
                alt58=5;
                }
                break;
            case 52:
                {
                alt58=6;
                }
                break;
            case 53:
                {
                alt58=7;
                }
                break;
            case 54:
                {
                alt58=8;
                }
                break;
            case 55:
                {
                alt58=9;
                }
                break;
            case 56:
                {
                alt58=10;
                }
                break;
            case 57:
                {
                alt58=11;
                }
                break;
            case 58:
                {
                alt58=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalComponentParameter.g:2347:3: (enumLiteral_0= 'Int8' )
                    {
                    // InternalComponentParameter.g:2347:3: (enumLiteral_0= 'Int8' )
                    // InternalComponentParameter.g:2348:4: enumLiteral_0= 'Int8'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentParameter.g:2355:3: (enumLiteral_1= 'Int16' )
                    {
                    // InternalComponentParameter.g:2355:3: (enumLiteral_1= 'Int16' )
                    // InternalComponentParameter.g:2356:4: enumLiteral_1= 'Int16'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentParameter.g:2363:3: (enumLiteral_2= 'Int32' )
                    {
                    // InternalComponentParameter.g:2363:3: (enumLiteral_2= 'Int32' )
                    // InternalComponentParameter.g:2364:4: enumLiteral_2= 'Int32'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentParameter.g:2371:3: (enumLiteral_3= 'Int64' )
                    {
                    // InternalComponentParameter.g:2371:3: (enumLiteral_3= 'Int64' )
                    // InternalComponentParameter.g:2372:4: enumLiteral_3= 'Int64'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalComponentParameter.g:2379:3: (enumLiteral_4= 'UInt8' )
                    {
                    // InternalComponentParameter.g:2379:3: (enumLiteral_4= 'UInt8' )
                    // InternalComponentParameter.g:2380:4: enumLiteral_4= 'UInt8'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalComponentParameter.g:2387:3: (enumLiteral_5= 'UInt16' )
                    {
                    // InternalComponentParameter.g:2387:3: (enumLiteral_5= 'UInt16' )
                    // InternalComponentParameter.g:2388:4: enumLiteral_5= 'UInt16'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalComponentParameter.g:2395:3: (enumLiteral_6= 'UInt32' )
                    {
                    // InternalComponentParameter.g:2395:3: (enumLiteral_6= 'UInt32' )
                    // InternalComponentParameter.g:2396:4: enumLiteral_6= 'UInt32'
                    {
                    enumLiteral_6=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalComponentParameter.g:2403:3: (enumLiteral_7= 'UInt64' )
                    {
                    // InternalComponentParameter.g:2403:3: (enumLiteral_7= 'UInt64' )
                    // InternalComponentParameter.g:2404:4: enumLiteral_7= 'UInt64'
                    {
                    enumLiteral_7=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalComponentParameter.g:2411:3: (enumLiteral_8= 'Float' )
                    {
                    // InternalComponentParameter.g:2411:3: (enumLiteral_8= 'Float' )
                    // InternalComponentParameter.g:2412:4: enumLiteral_8= 'Float'
                    {
                    enumLiteral_8=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalComponentParameter.g:2419:3: (enumLiteral_9= 'Double' )
                    {
                    // InternalComponentParameter.g:2419:3: (enumLiteral_9= 'Double' )
                    // InternalComponentParameter.g:2420:4: enumLiteral_9= 'Double'
                    {
                    enumLiteral_9=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalComponentParameter.g:2427:3: (enumLiteral_10= 'String' )
                    {
                    // InternalComponentParameter.g:2427:3: (enumLiteral_10= 'String' )
                    // InternalComponentParameter.g:2428:4: enumLiteral_10= 'String'
                    {
                    enumLiteral_10=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalComponentParameter.g:2435:3: (enumLiteral_11= 'Boolean' )
                    {
                    // InternalComponentParameter.g:2435:3: (enumLiteral_11= 'Boolean' )
                    // InternalComponentParameter.g:2436:4: enumLiteral_11= 'Boolean'
                    {
                    enumLiteral_11=(Token)match(input,58,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000009E0020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000005020020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040020020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000600020020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x07FF880000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001002000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000011E0000000D0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000600000000080L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000001E0000000D0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200100000000L});

}