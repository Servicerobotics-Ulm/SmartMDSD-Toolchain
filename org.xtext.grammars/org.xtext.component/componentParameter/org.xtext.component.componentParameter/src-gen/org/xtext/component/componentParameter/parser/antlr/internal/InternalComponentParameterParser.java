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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentParameter'", "'component'", "'{'", "'}'", "'InternalParameter'", "'ExtendedParameter'", "'ExtendedTrigger'", "'active'", "'passive'", "'ParameterSetInstance'", "'TriggerInstance'", "';'", "'ParameterInstance'", "'.*'", "'#import'", "'ParameterSetRepository'", "'ParameterSet'", "'extends'", "','", "'Parameter'", "'Trigger'", "':'", "'='", "'.'", "'true'", "'false'", "'-'", "'E'", "'e'", "'InlineEnumeration'", "'['", "']'", "'*'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalComponentParameter.g:106:1: entryRuleComponentParamModel returns [EObject current=null] : iv_ruleComponentParamModel= ruleComponentParamModel EOF ;
    public final EObject entryRuleComponentParamModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentParamModel = null;


        try {
            // InternalComponentParameter.g:106:60: (iv_ruleComponentParamModel= ruleComponentParamModel EOF )
            // InternalComponentParameter.g:107:2: iv_ruleComponentParamModel= ruleComponentParamModel EOF
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
    // InternalComponentParameter.g:113:1: ruleComponentParamModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_parametrization_2_0= ruleComponentParameter ) )? ) ;
    public final EObject ruleComponentParamModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_parametrization_2_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:119:2: ( ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_parametrization_2_0= ruleComponentParameter ) )? ) )
            // InternalComponentParameter.g:120:2: ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_parametrization_2_0= ruleComponentParameter ) )? )
            {
            // InternalComponentParameter.g:120:2: ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_parametrization_2_0= ruleComponentParameter ) )? )
            // InternalComponentParameter.g:121:3: () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_parametrization_2_0= ruleComponentParameter ) )?
            {
            // InternalComponentParameter.g:121:3: ()
            // InternalComponentParameter.g:122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentParamModelAccess().getComponentParamModelAction_0(),
            					current);
            			

            }

            // InternalComponentParameter.g:128:3: ( (lv_imports_1_0= ruleParamDefRepoImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalComponentParameter.g:129:4: (lv_imports_1_0= ruleParamDefRepoImport )
            	    {
            	    // InternalComponentParameter.g:129:4: (lv_imports_1_0= ruleParamDefRepoImport )
            	    // InternalComponentParameter.g:130:5: lv_imports_1_0= ruleParamDefRepoImport
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

            // InternalComponentParameter.g:147:3: ( (lv_parametrization_2_0= ruleComponentParameter ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentParameter.g:148:4: (lv_parametrization_2_0= ruleComponentParameter )
                    {
                    // InternalComponentParameter.g:148:4: (lv_parametrization_2_0= ruleComponentParameter )
                    // InternalComponentParameter.g:149:5: lv_parametrization_2_0= ruleComponentParameter
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
    // InternalComponentParameter.g:170:1: entryRuleComponentParameter returns [EObject current=null] : iv_ruleComponentParameter= ruleComponentParameter EOF ;
    public final EObject entryRuleComponentParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentParameter = null;


        try {
            // InternalComponentParameter.g:170:59: (iv_ruleComponentParameter= ruleComponentParameter EOF )
            // InternalComponentParameter.g:171:2: iv_ruleComponentParameter= ruleComponentParameter EOF
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
    // InternalComponentParameter.g:177:1: ruleComponentParameter returns [EObject current=null] : (otherlv_0= 'ComponentParameter' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'component' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleAbstractComponentParameter ) )* otherlv_6= '}' ) ;
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
            // InternalComponentParameter.g:183:2: ( (otherlv_0= 'ComponentParameter' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'component' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleAbstractComponentParameter ) )* otherlv_6= '}' ) )
            // InternalComponentParameter.g:184:2: (otherlv_0= 'ComponentParameter' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'component' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleAbstractComponentParameter ) )* otherlv_6= '}' )
            {
            // InternalComponentParameter.g:184:2: (otherlv_0= 'ComponentParameter' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'component' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleAbstractComponentParameter ) )* otherlv_6= '}' )
            // InternalComponentParameter.g:185:3: otherlv_0= 'ComponentParameter' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'component' ( ( ruleFQN ) ) )? otherlv_4= '{' ( (lv_parameters_5_0= ruleAbstractComponentParameter ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentParameterAccess().getComponentParameterKeyword_0());
            		
            // InternalComponentParameter.g:189:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentParameter.g:190:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentParameter.g:190:4: (lv_name_1_0= RULE_ID )
            // InternalComponentParameter.g:191:5: lv_name_1_0= RULE_ID
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

            // InternalComponentParameter.g:207:3: (otherlv_2= 'component' ( ( ruleFQN ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentParameter.g:208:4: otherlv_2= 'component' ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentParameterAccess().getComponentKeyword_2_0());
                    			
                    // InternalComponentParameter.g:212:4: ( ( ruleFQN ) )
                    // InternalComponentParameter.g:213:5: ( ruleFQN )
                    {
                    // InternalComponentParameter.g:213:5: ( ruleFQN )
                    // InternalComponentParameter.g:214:6: ruleFQN
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

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentParameter.g:233:3: ( (lv_parameters_5_0= ruleAbstractComponentParameter ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=17)||LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalComponentParameter.g:234:4: (lv_parameters_5_0= ruleAbstractComponentParameter )
            	    {
            	    // InternalComponentParameter.g:234:4: (lv_parameters_5_0= ruleAbstractComponentParameter )
            	    // InternalComponentParameter.g:235:5: lv_parameters_5_0= ruleAbstractComponentParameter
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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalComponentParameter.g:260:1: entryRuleAbstractComponentParameter returns [EObject current=null] : iv_ruleAbstractComponentParameter= ruleAbstractComponentParameter EOF ;
    public final EObject entryRuleAbstractComponentParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponentParameter = null;


        try {
            // InternalComponentParameter.g:260:67: (iv_ruleAbstractComponentParameter= ruleAbstractComponentParameter EOF )
            // InternalComponentParameter.g:261:2: iv_ruleAbstractComponentParameter= ruleAbstractComponentParameter EOF
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
    // InternalComponentParameter.g:267:1: ruleAbstractComponentParameter returns [EObject current=null] : (this_InternalParameter_0= ruleInternalParameter | this_ExtendedParameter_1= ruleExtendedParameter | this_ExtendedTrigger_2= ruleExtendedTrigger | this_ParameterSetInstance_3= ruleParameterSetInstance ) ;
    public final EObject ruleAbstractComponentParameter() throws RecognitionException {
        EObject current = null;

        EObject this_InternalParameter_0 = null;

        EObject this_ExtendedParameter_1 = null;

        EObject this_ExtendedTrigger_2 = null;

        EObject this_ParameterSetInstance_3 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:273:2: ( (this_InternalParameter_0= ruleInternalParameter | this_ExtendedParameter_1= ruleExtendedParameter | this_ExtendedTrigger_2= ruleExtendedTrigger | this_ParameterSetInstance_3= ruleParameterSetInstance ) )
            // InternalComponentParameter.g:274:2: (this_InternalParameter_0= ruleInternalParameter | this_ExtendedParameter_1= ruleExtendedParameter | this_ExtendedTrigger_2= ruleExtendedTrigger | this_ParameterSetInstance_3= ruleParameterSetInstance )
            {
            // InternalComponentParameter.g:274:2: (this_InternalParameter_0= ruleInternalParameter | this_ExtendedParameter_1= ruleExtendedParameter | this_ExtendedTrigger_2= ruleExtendedTrigger | this_ParameterSetInstance_3= ruleParameterSetInstance )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 20:
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
                    // InternalComponentParameter.g:275:3: this_InternalParameter_0= ruleInternalParameter
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
                    // InternalComponentParameter.g:284:3: this_ExtendedParameter_1= ruleExtendedParameter
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
                    // InternalComponentParameter.g:293:3: this_ExtendedTrigger_2= ruleExtendedTrigger
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
                    // InternalComponentParameter.g:302:3: this_ParameterSetInstance_3= ruleParameterSetInstance
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
    // InternalComponentParameter.g:314:1: entryRuleInternalParameter returns [EObject current=null] : iv_ruleInternalParameter= ruleInternalParameter EOF ;
    public final EObject entryRuleInternalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalParameter = null;


        try {
            // InternalComponentParameter.g:314:58: (iv_ruleInternalParameter= ruleInternalParameter EOF )
            // InternalComponentParameter.g:315:2: iv_ruleInternalParameter= ruleInternalParameter EOF
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
    // InternalComponentParameter.g:321:1: ruleInternalParameter returns [EObject current=null] : (otherlv_0= 'InternalParameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleInternalParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:327:2: ( (otherlv_0= 'InternalParameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' ) )
            // InternalComponentParameter.g:328:2: (otherlv_0= 'InternalParameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' )
            {
            // InternalComponentParameter.g:328:2: (otherlv_0= 'InternalParameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' )
            // InternalComponentParameter.g:329:3: otherlv_0= 'InternalParameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInternalParameterAccess().getInternalParameterKeyword_0());
            		
            // InternalComponentParameter.g:333:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentParameter.g:334:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentParameter.g:334:4: (lv_name_1_0= RULE_ID )
            // InternalComponentParameter.g:335:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInternalParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInternalParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getInternalParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentParameter.g:355:3: ( (lv_attributes_3_0= ruleAttributeDefinition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalComponentParameter.g:356:4: (lv_attributes_3_0= ruleAttributeDefinition )
            	    {
            	    // InternalComponentParameter.g:356:4: (lv_attributes_3_0= ruleAttributeDefinition )
            	    // InternalComponentParameter.g:357:5: lv_attributes_3_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getInternalParameterAccess().getAttributesAttributeDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_attributes_3_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInternalParameterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInternalParameterAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalComponentParameter.g:382:1: entryRuleExtendedParameter returns [EObject current=null] : iv_ruleExtendedParameter= ruleExtendedParameter EOF ;
    public final EObject entryRuleExtendedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedParameter = null;


        try {
            // InternalComponentParameter.g:382:58: (iv_ruleExtendedParameter= ruleExtendedParameter EOF )
            // InternalComponentParameter.g:383:2: iv_ruleExtendedParameter= ruleExtendedParameter EOF
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
    // InternalComponentParameter.g:389:1: ruleExtendedParameter returns [EObject current=null] : (otherlv_0= 'ExtendedParameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleExtendedParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:395:2: ( (otherlv_0= 'ExtendedParameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' ) )
            // InternalComponentParameter.g:396:2: (otherlv_0= 'ExtendedParameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' )
            {
            // InternalComponentParameter.g:396:2: (otherlv_0= 'ExtendedParameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' )
            // InternalComponentParameter.g:397:3: otherlv_0= 'ExtendedParameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendedParameterAccess().getExtendedParameterKeyword_0());
            		
            // InternalComponentParameter.g:401:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentParameter.g:402:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentParameter.g:402:4: (lv_name_1_0= RULE_ID )
            // InternalComponentParameter.g:403:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExtendedParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendedParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getExtendedParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentParameter.g:423:3: ( (lv_attributes_3_0= ruleAttributeDefinition ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalComponentParameter.g:424:4: (lv_attributes_3_0= ruleAttributeDefinition )
            	    {
            	    // InternalComponentParameter.g:424:4: (lv_attributes_3_0= ruleAttributeDefinition )
            	    // InternalComponentParameter.g:425:5: lv_attributes_3_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getExtendedParameterAccess().getAttributesAttributeDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_attributes_3_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtendedParameterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExtendedParameterAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalComponentParameter.g:450:1: entryRuleExtendedTrigger returns [EObject current=null] : iv_ruleExtendedTrigger= ruleExtendedTrigger EOF ;
    public final EObject entryRuleExtendedTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedTrigger = null;


        try {
            // InternalComponentParameter.g:450:56: (iv_ruleExtendedTrigger= ruleExtendedTrigger EOF )
            // InternalComponentParameter.g:451:2: iv_ruleExtendedTrigger= ruleExtendedTrigger EOF
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
    // InternalComponentParameter.g:457:1: ruleExtendedTrigger returns [EObject current=null] : (otherlv_0= 'ExtendedTrigger' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_active_2_0= 'active' ) ) | otherlv_3= 'passive' ) otherlv_4= '{' ( (lv_attributes_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' ) ;
    public final EObject ruleExtendedTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_active_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:463:2: ( (otherlv_0= 'ExtendedTrigger' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_active_2_0= 'active' ) ) | otherlv_3= 'passive' ) otherlv_4= '{' ( (lv_attributes_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' ) )
            // InternalComponentParameter.g:464:2: (otherlv_0= 'ExtendedTrigger' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_active_2_0= 'active' ) ) | otherlv_3= 'passive' ) otherlv_4= '{' ( (lv_attributes_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )
            {
            // InternalComponentParameter.g:464:2: (otherlv_0= 'ExtendedTrigger' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_active_2_0= 'active' ) ) | otherlv_3= 'passive' ) otherlv_4= '{' ( (lv_attributes_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )
            // InternalComponentParameter.g:465:3: otherlv_0= 'ExtendedTrigger' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_active_2_0= 'active' ) ) | otherlv_3= 'passive' ) otherlv_4= '{' ( (lv_attributes_5_0= ruleAttributeDefinition ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendedTriggerAccess().getExtendedTriggerKeyword_0());
            		
            // InternalComponentParameter.g:469:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentParameter.g:470:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentParameter.g:470:4: (lv_name_1_0= RULE_ID )
            // InternalComponentParameter.g:471:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExtendedTriggerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendedTriggerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalComponentParameter.g:487:3: ( ( (lv_active_2_0= 'active' ) ) | otherlv_3= 'passive' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentParameter.g:488:4: ( (lv_active_2_0= 'active' ) )
                    {
                    // InternalComponentParameter.g:488:4: ( (lv_active_2_0= 'active' ) )
                    // InternalComponentParameter.g:489:5: (lv_active_2_0= 'active' )
                    {
                    // InternalComponentParameter.g:489:5: (lv_active_2_0= 'active' )
                    // InternalComponentParameter.g:490:6: lv_active_2_0= 'active'
                    {
                    lv_active_2_0=(Token)match(input,18,FOLLOW_6); 

                    						newLeafNode(lv_active_2_0, grammarAccess.getExtendedTriggerAccess().getActiveActiveKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtendedTriggerRule());
                    						}
                    						setWithLastConsumed(current, "active", true, "active");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponentParameter.g:503:4: otherlv_3= 'passive'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getExtendedTriggerAccess().getPassiveKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getExtendedTriggerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentParameter.g:512:3: ( (lv_attributes_5_0= ruleAttributeDefinition ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalComponentParameter.g:513:4: (lv_attributes_5_0= ruleAttributeDefinition )
            	    {
            	    // InternalComponentParameter.g:513:4: (lv_attributes_5_0= ruleAttributeDefinition )
            	    // InternalComponentParameter.g:514:5: lv_attributes_5_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getExtendedTriggerAccess().getAttributesAttributeDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_attributes_5_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtendedTriggerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_5_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExtendedTriggerAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalComponentParameter.g:539:1: entryRuleParameterSetInstance returns [EObject current=null] : iv_ruleParameterSetInstance= ruleParameterSetInstance EOF ;
    public final EObject entryRuleParameterSetInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetInstance = null;


        try {
            // InternalComponentParameter.g:539:61: (iv_ruleParameterSetInstance= ruleParameterSetInstance EOF )
            // InternalComponentParameter.g:540:2: iv_ruleParameterSetInstance= ruleParameterSetInstance EOF
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
    // InternalComponentParameter.g:546:1: ruleParameterSetInstance returns [EObject current=null] : (otherlv_0= 'ParameterSetInstance' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_parameterInstances_3_0= ruleAbstractParameterInstance ) )* otherlv_4= '}' ) ;
    public final EObject ruleParameterSetInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterInstances_3_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:552:2: ( (otherlv_0= 'ParameterSetInstance' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_parameterInstances_3_0= ruleAbstractParameterInstance ) )* otherlv_4= '}' ) )
            // InternalComponentParameter.g:553:2: (otherlv_0= 'ParameterSetInstance' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_parameterInstances_3_0= ruleAbstractParameterInstance ) )* otherlv_4= '}' )
            {
            // InternalComponentParameter.g:553:2: (otherlv_0= 'ParameterSetInstance' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_parameterInstances_3_0= ruleAbstractParameterInstance ) )* otherlv_4= '}' )
            // InternalComponentParameter.g:554:3: otherlv_0= 'ParameterSetInstance' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_parameterInstances_3_0= ruleAbstractParameterInstance ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterSetInstanceAccess().getParameterSetInstanceKeyword_0());
            		
            // InternalComponentParameter.g:558:3: ( ( ruleFQN ) )
            // InternalComponentParameter.g:559:4: ( ruleFQN )
            {
            // InternalComponentParameter.g:559:4: ( ruleFQN )
            // InternalComponentParameter.g:560:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterSetInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterSetInstanceAccess().getParamSetParameterSetDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_6);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterSetInstanceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentParameter.g:578:3: ( (lv_parameterInstances_3_0= ruleAbstractParameterInstance ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21||LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalComponentParameter.g:579:4: (lv_parameterInstances_3_0= ruleAbstractParameterInstance )
            	    {
            	    // InternalComponentParameter.g:579:4: (lv_parameterInstances_3_0= ruleAbstractParameterInstance )
            	    // InternalComponentParameter.g:580:5: lv_parameterInstances_3_0= ruleAbstractParameterInstance
            	    {

            	    					newCompositeNode(grammarAccess.getParameterSetInstanceAccess().getParameterInstancesAbstractParameterInstanceParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_parameterInstances_3_0=ruleAbstractParameterInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterSetInstanceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameterInstances",
            	    						lv_parameterInstances_3_0,
            	    						"org.xtext.component.componentParameter.ComponentParameter.AbstractParameterInstance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterSetInstanceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalComponentParameter.g:605:1: entryRuleAbstractParameterInstance returns [EObject current=null] : iv_ruleAbstractParameterInstance= ruleAbstractParameterInstance EOF ;
    public final EObject entryRuleAbstractParameterInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameterInstance = null;


        try {
            // InternalComponentParameter.g:605:66: (iv_ruleAbstractParameterInstance= ruleAbstractParameterInstance EOF )
            // InternalComponentParameter.g:606:2: iv_ruleAbstractParameterInstance= ruleAbstractParameterInstance EOF
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
    // InternalComponentParameter.g:612:1: ruleAbstractParameterInstance returns [EObject current=null] : (this_TriggerInstance_0= ruleTriggerInstance | this_ParameterInstance_1= ruleParameterInstance ) ;
    public final EObject ruleAbstractParameterInstance() throws RecognitionException {
        EObject current = null;

        EObject this_TriggerInstance_0 = null;

        EObject this_ParameterInstance_1 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:618:2: ( (this_TriggerInstance_0= ruleTriggerInstance | this_ParameterInstance_1= ruleParameterInstance ) )
            // InternalComponentParameter.g:619:2: (this_TriggerInstance_0= ruleTriggerInstance | this_ParameterInstance_1= ruleParameterInstance )
            {
            // InternalComponentParameter.g:619:2: (this_TriggerInstance_0= ruleTriggerInstance | this_ParameterInstance_1= ruleParameterInstance )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentParameter.g:620:3: this_TriggerInstance_0= ruleTriggerInstance
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
                    // InternalComponentParameter.g:629:3: this_ParameterInstance_1= ruleParameterInstance
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
    // InternalComponentParameter.g:641:1: entryRuleTriggerInstance returns [EObject current=null] : iv_ruleTriggerInstance= ruleTriggerInstance EOF ;
    public final EObject entryRuleTriggerInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerInstance = null;


        try {
            // InternalComponentParameter.g:641:56: (iv_ruleTriggerInstance= ruleTriggerInstance EOF )
            // InternalComponentParameter.g:642:2: iv_ruleTriggerInstance= ruleTriggerInstance EOF
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
    // InternalComponentParameter.g:648:1: ruleTriggerInstance returns [EObject current=null] : (otherlv_0= 'TriggerInstance' ( ( ruleFQN ) ) ( ( (lv_active_2_0= 'active' ) ) | otherlv_3= 'passive' ) (otherlv_4= ';' )? ) ;
    public final EObject ruleTriggerInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_active_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalComponentParameter.g:654:2: ( (otherlv_0= 'TriggerInstance' ( ( ruleFQN ) ) ( ( (lv_active_2_0= 'active' ) ) | otherlv_3= 'passive' ) (otherlv_4= ';' )? ) )
            // InternalComponentParameter.g:655:2: (otherlv_0= 'TriggerInstance' ( ( ruleFQN ) ) ( ( (lv_active_2_0= 'active' ) ) | otherlv_3= 'passive' ) (otherlv_4= ';' )? )
            {
            // InternalComponentParameter.g:655:2: (otherlv_0= 'TriggerInstance' ( ( ruleFQN ) ) ( ( (lv_active_2_0= 'active' ) ) | otherlv_3= 'passive' ) (otherlv_4= ';' )? )
            // InternalComponentParameter.g:656:3: otherlv_0= 'TriggerInstance' ( ( ruleFQN ) ) ( ( (lv_active_2_0= 'active' ) ) | otherlv_3= 'passive' ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerInstanceAccess().getTriggerInstanceKeyword_0());
            		
            // InternalComponentParameter.g:660:3: ( ( ruleFQN ) )
            // InternalComponentParameter.g:661:4: ( ruleFQN )
            {
            // InternalComponentParameter.g:661:4: ( ruleFQN )
            // InternalComponentParameter.g:662:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTriggerInstanceAccess().getTriggerDefTriggerDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_9);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentParameter.g:676:3: ( ( (lv_active_2_0= 'active' ) ) | otherlv_3= 'passive' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentParameter.g:677:4: ( (lv_active_2_0= 'active' ) )
                    {
                    // InternalComponentParameter.g:677:4: ( (lv_active_2_0= 'active' ) )
                    // InternalComponentParameter.g:678:5: (lv_active_2_0= 'active' )
                    {
                    // InternalComponentParameter.g:678:5: (lv_active_2_0= 'active' )
                    // InternalComponentParameter.g:679:6: lv_active_2_0= 'active'
                    {
                    lv_active_2_0=(Token)match(input,18,FOLLOW_11); 

                    						newLeafNode(lv_active_2_0, grammarAccess.getTriggerInstanceAccess().getActiveActiveKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTriggerInstanceRule());
                    						}
                    						setWithLastConsumed(current, "active", true, "active");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponentParameter.g:692:4: otherlv_3= 'passive'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getTriggerInstanceAccess().getPassiveKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalComponentParameter.g:697:3: (otherlv_4= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentParameter.g:698:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTriggerInstanceAccess().getSemicolonKeyword_3());
                    			

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
    // InternalComponentParameter.g:707:1: entryRuleParameterInstance returns [EObject current=null] : iv_ruleParameterInstance= ruleParameterInstance EOF ;
    public final EObject entryRuleParameterInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInstance = null;


        try {
            // InternalComponentParameter.g:707:58: (iv_ruleParameterInstance= ruleParameterInstance EOF )
            // InternalComponentParameter.g:708:2: iv_ruleParameterInstance= ruleParameterInstance EOF
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
    // InternalComponentParameter.g:714:1: ruleParameterInstance returns [EObject current=null] : (otherlv_0= 'ParameterInstance' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeRefinement ) )* otherlv_4= '}' ) ;
    public final EObject ruleParameterInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:720:2: ( (otherlv_0= 'ParameterInstance' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeRefinement ) )* otherlv_4= '}' ) )
            // InternalComponentParameter.g:721:2: (otherlv_0= 'ParameterInstance' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeRefinement ) )* otherlv_4= '}' )
            {
            // InternalComponentParameter.g:721:2: (otherlv_0= 'ParameterInstance' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeRefinement ) )* otherlv_4= '}' )
            // InternalComponentParameter.g:722:3: otherlv_0= 'ParameterInstance' ( ( ruleFQN ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeRefinement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterInstanceAccess().getParameterInstanceKeyword_0());
            		
            // InternalComponentParameter.g:726:3: ( ( ruleFQN ) )
            // InternalComponentParameter.g:727:4: ( ruleFQN )
            {
            // InternalComponentParameter.g:727:4: ( ruleFQN )
            // InternalComponentParameter.g:728:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterInstanceAccess().getParameterDefParameterDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_6);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterInstanceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentParameter.g:746:3: ( (lv_attributes_3_0= ruleAttributeRefinement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalComponentParameter.g:747:4: (lv_attributes_3_0= ruleAttributeRefinement )
            	    {
            	    // InternalComponentParameter.g:747:4: (lv_attributes_3_0= ruleAttributeRefinement )
            	    // InternalComponentParameter.g:748:5: lv_attributes_3_0= ruleAttributeRefinement
            	    {

            	    					newCompositeNode(grammarAccess.getParameterInstanceAccess().getAttributesAttributeRefinementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_attributes_3_0=ruleAttributeRefinement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterInstanceRule());
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
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterInstanceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalComponentParameter.g:773:1: entryRuleFQNW returns [String current=null] : iv_ruleFQNW= ruleFQNW EOF ;
    public final String entryRuleFQNW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNW = null;


        try {
            // InternalComponentParameter.g:773:44: (iv_ruleFQNW= ruleFQNW EOF )
            // InternalComponentParameter.g:774:2: iv_ruleFQNW= ruleFQNW EOF
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
    // InternalComponentParameter.g:780:1: ruleFQNW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFQNW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:786:2: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // InternalComponentParameter.g:787:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // InternalComponentParameter.g:787:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // InternalComponentParameter.g:788:3: this_FQN_0= ruleFQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalComponentParameter.g:798:3: (kw= '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentParameter.g:799:4: kw= '.*'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

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
    // InternalComponentParameter.g:809:1: entryRuleParamDefRepoImport returns [EObject current=null] : iv_ruleParamDefRepoImport= ruleParamDefRepoImport EOF ;
    public final EObject entryRuleParamDefRepoImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamDefRepoImport = null;


        try {
            // InternalComponentParameter.g:809:59: (iv_ruleParamDefRepoImport= ruleParamDefRepoImport EOF )
            // InternalComponentParameter.g:810:2: iv_ruleParamDefRepoImport= ruleParamDefRepoImport EOF
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
    // InternalComponentParameter.g:816:1: ruleParamDefRepoImport returns [EObject current=null] : (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleParamDefRepoImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:822:2: ( (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) )
            // InternalComponentParameter.g:823:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentParameter.g:823:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            // InternalComponentParameter.g:824:3: otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParamDefRepoImportAccess().getImportKeyword_0());
            		
            // InternalComponentParameter.g:828:3: ( (lv_importedNamespace_1_0= ruleFQNW ) )
            // InternalComponentParameter.g:829:4: (lv_importedNamespace_1_0= ruleFQNW )
            {
            // InternalComponentParameter.g:829:4: (lv_importedNamespace_1_0= ruleFQNW )
            // InternalComponentParameter.g:830:5: lv_importedNamespace_1_0= ruleFQNW
            {

            					newCompositeNode(grammarAccess.getParamDefRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalComponentParameter.g:847:3: (otherlv_2= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentParameter.g:848:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_2); 

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
    // InternalComponentParameter.g:857:1: entryRuleParameterSetRepository returns [EObject current=null] : iv_ruleParameterSetRepository= ruleParameterSetRepository EOF ;
    public final EObject entryRuleParameterSetRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetRepository = null;


        try {
            // InternalComponentParameter.g:857:63: (iv_ruleParameterSetRepository= ruleParameterSetRepository EOF )
            // InternalComponentParameter.g:858:2: iv_ruleParameterSetRepository= ruleParameterSetRepository EOF
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
    // InternalComponentParameter.g:864:1: ruleParameterSetRepository returns [EObject current=null] : (otherlv_0= 'ParameterSetRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleParameterSetDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleParameterSetRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sets_3_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:870:2: ( (otherlv_0= 'ParameterSetRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleParameterSetDefinition ) )* otherlv_4= '}' ) )
            // InternalComponentParameter.g:871:2: (otherlv_0= 'ParameterSetRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleParameterSetDefinition ) )* otherlv_4= '}' )
            {
            // InternalComponentParameter.g:871:2: (otherlv_0= 'ParameterSetRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleParameterSetDefinition ) )* otherlv_4= '}' )
            // InternalComponentParameter.g:872:3: otherlv_0= 'ParameterSetRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleParameterSetDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterSetRepositoryAccess().getParameterSetRepositoryKeyword_0());
            		
            // InternalComponentParameter.g:876:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentParameter.g:877:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentParameter.g:877:4: (lv_name_1_0= RULE_ID )
            // InternalComponentParameter.g:878:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterSetRepositoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterSetRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterSetRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentParameter.g:898:3: ( (lv_sets_3_0= ruleParameterSetDefinition ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalComponentParameter.g:899:4: (lv_sets_3_0= ruleParameterSetDefinition )
            	    {
            	    // InternalComponentParameter.g:899:4: (lv_sets_3_0= ruleParameterSetDefinition )
            	    // InternalComponentParameter.g:900:5: lv_sets_3_0= ruleParameterSetDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getParameterSetRepositoryAccess().getSetsParameterSetDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_sets_3_0=ruleParameterSetDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterSetRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sets",
            	    						lv_sets_3_0,
            	    						"org.xtext.service.parameterDefinition.ParameterDefinition.ParameterSetDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterSetRepositoryAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalComponentParameter.g:925:1: entryRuleParameterSetDefinition returns [EObject current=null] : iv_ruleParameterSetDefinition= ruleParameterSetDefinition EOF ;
    public final EObject entryRuleParameterSetDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetDefinition = null;


        try {
            // InternalComponentParameter.g:925:63: (iv_ruleParameterSetDefinition= ruleParameterSetDefinition EOF )
            // InternalComponentParameter.g:926:2: iv_ruleParameterSetDefinition= ruleParameterSetDefinition EOF
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
    // InternalComponentParameter.g:932:1: ruleParameterSetDefinition returns [EObject current=null] : (otherlv_0= 'ParameterSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) (otherlv_4= ',' ( ( ruleFQN ) ) )* )? otherlv_6= '{' ( (lv_parameters_7_0= ruleAbstractParameter ) )* otherlv_8= '}' ) ;
    public final EObject ruleParameterSetDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameters_7_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:938:2: ( (otherlv_0= 'ParameterSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) (otherlv_4= ',' ( ( ruleFQN ) ) )* )? otherlv_6= '{' ( (lv_parameters_7_0= ruleAbstractParameter ) )* otherlv_8= '}' ) )
            // InternalComponentParameter.g:939:2: (otherlv_0= 'ParameterSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) (otherlv_4= ',' ( ( ruleFQN ) ) )* )? otherlv_6= '{' ( (lv_parameters_7_0= ruleAbstractParameter ) )* otherlv_8= '}' )
            {
            // InternalComponentParameter.g:939:2: (otherlv_0= 'ParameterSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) (otherlv_4= ',' ( ( ruleFQN ) ) )* )? otherlv_6= '{' ( (lv_parameters_7_0= ruleAbstractParameter ) )* otherlv_8= '}' )
            // InternalComponentParameter.g:940:3: otherlv_0= 'ParameterSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) (otherlv_4= ',' ( ( ruleFQN ) ) )* )? otherlv_6= '{' ( (lv_parameters_7_0= ruleAbstractParameter ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterSetDefinitionAccess().getParameterSetKeyword_0());
            		
            // InternalComponentParameter.g:944:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentParameter.g:945:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentParameter.g:945:4: (lv_name_1_0= RULE_ID )
            // InternalComponentParameter.g:946:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterSetDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterSetDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalComponentParameter.g:962:3: (otherlv_2= 'extends' ( ( ruleFQN ) ) (otherlv_4= ',' ( ( ruleFQN ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentParameter.g:963:4: otherlv_2= 'extends' ( ( ruleFQN ) ) (otherlv_4= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterSetDefinitionAccess().getExtendsKeyword_2_0());
                    			
                    // InternalComponentParameter.g:967:4: ( ( ruleFQN ) )
                    // InternalComponentParameter.g:968:5: ( ruleFQN )
                    {
                    // InternalComponentParameter.g:968:5: ( ruleFQN )
                    // InternalComponentParameter.g:969:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterSetDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentParameter.g:983:4: (otherlv_4= ',' ( ( ruleFQN ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==29) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalComponentParameter.g:984:5: otherlv_4= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getParameterSetDefinitionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalComponentParameter.g:988:5: ( ( ruleFQN ) )
                    	    // InternalComponentParameter.g:989:6: ( ruleFQN )
                    	    {
                    	    // InternalComponentParameter.g:989:6: ( ruleFQN )
                    	    // InternalComponentParameter.g:990:7: ruleFQN
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParameterSetDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleFQN();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterSetDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentParameter.g:1010:3: ( (lv_parameters_7_0= ruleAbstractParameter ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=30 && LA20_0<=31)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalComponentParameter.g:1011:4: (lv_parameters_7_0= ruleAbstractParameter )
            	    {
            	    // InternalComponentParameter.g:1011:4: (lv_parameters_7_0= ruleAbstractParameter )
            	    // InternalComponentParameter.g:1012:5: lv_parameters_7_0= ruleAbstractParameter
            	    {

            	    					newCompositeNode(grammarAccess.getParameterSetDefinitionAccess().getParametersAbstractParameterParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_parameters_7_0=ruleAbstractParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterSetDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_7_0,
            	    						"org.xtext.service.parameterDefinition.ParameterDefinition.AbstractParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getParameterSetDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalComponentParameter.g:1037:1: entryRuleAbstractParameter returns [EObject current=null] : iv_ruleAbstractParameter= ruleAbstractParameter EOF ;
    public final EObject entryRuleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameter = null;


        try {
            // InternalComponentParameter.g:1037:58: (iv_ruleAbstractParameter= ruleAbstractParameter EOF )
            // InternalComponentParameter.g:1038:2: iv_ruleAbstractParameter= ruleAbstractParameter EOF
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
    // InternalComponentParameter.g:1044:1: ruleAbstractParameter returns [EObject current=null] : (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition ) ;
    public final EObject ruleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterDefinition_0 = null;

        EObject this_TriggerDefinition_1 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1050:2: ( (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition ) )
            // InternalComponentParameter.g:1051:2: (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition )
            {
            // InternalComponentParameter.g:1051:2: (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            else if ( (LA21_0==31) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentParameter.g:1052:3: this_ParameterDefinition_0= ruleParameterDefinition
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
                    // InternalComponentParameter.g:1061:3: this_TriggerDefinition_1= ruleTriggerDefinition
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
    // InternalComponentParameter.g:1073:1: entryRuleParameterDefinition returns [EObject current=null] : iv_ruleParameterDefinition= ruleParameterDefinition EOF ;
    public final EObject entryRuleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDefinition = null;


        try {
            // InternalComponentParameter.g:1073:60: (iv_ruleParameterDefinition= ruleParameterDefinition EOF )
            // InternalComponentParameter.g:1074:2: iv_ruleParameterDefinition= ruleParameterDefinition EOF
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
    // InternalComponentParameter.g:1080:1: ruleParameterDefinition returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1086:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' ) )
            // InternalComponentParameter.g:1087:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' )
            {
            // InternalComponentParameter.g:1087:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' )
            // InternalComponentParameter.g:1088:3: otherlv_0= 'Parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterDefinitionAccess().getParameterKeyword_0());
            		
            // InternalComponentParameter.g:1092:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentParameter.g:1093:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentParameter.g:1093:4: (lv_name_1_0= RULE_ID )
            // InternalComponentParameter.g:1094:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentParameter.g:1114:3: ( (lv_attributes_3_0= ruleAttributeDefinition ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalComponentParameter.g:1115:4: (lv_attributes_3_0= ruleAttributeDefinition )
            	    {
            	    // InternalComponentParameter.g:1115:4: (lv_attributes_3_0= ruleAttributeDefinition )
            	    // InternalComponentParameter.g:1116:5: lv_attributes_3_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getParameterDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_attributes_3_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalComponentParameter.g:1141:1: entryRuleTriggerDefinition returns [EObject current=null] : iv_ruleTriggerDefinition= ruleTriggerDefinition EOF ;
    public final EObject entryRuleTriggerDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerDefinition = null;


        try {
            // InternalComponentParameter.g:1141:58: (iv_ruleTriggerDefinition= ruleTriggerDefinition EOF )
            // InternalComponentParameter.g:1142:2: iv_ruleTriggerDefinition= ruleTriggerDefinition EOF
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
    // InternalComponentParameter.g:1148:1: ruleTriggerDefinition returns [EObject current=null] : (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleTriggerDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1154:2: ( (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' ) )
            // InternalComponentParameter.g:1155:2: (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' )
            {
            // InternalComponentParameter.g:1155:2: (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' )
            // InternalComponentParameter.g:1156:3: otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerDefinitionAccess().getTriggerKeyword_0());
            		
            // InternalComponentParameter.g:1160:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentParameter.g:1161:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentParameter.g:1161:4: (lv_name_1_0= RULE_ID )
            // InternalComponentParameter.g:1162:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTriggerDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTriggerDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentParameter.g:1182:3: ( (lv_attributes_3_0= ruleAttributeDefinition ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalComponentParameter.g:1183:4: (lv_attributes_3_0= ruleAttributeDefinition )
            	    {
            	    // InternalComponentParameter.g:1183:4: (lv_attributes_3_0= ruleAttributeDefinition )
            	    // InternalComponentParameter.g:1184:5: lv_attributes_3_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getTriggerDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_attributes_3_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTriggerDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTriggerDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalComponentParameter.g:1209:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalComponentParameter.g:1209:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalComponentParameter.g:1210:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
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
    // InternalComponentParameter.g:1216:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_2_0 = null;

        EObject lv_defaultvalue_4_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1222:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? ) )
            // InternalComponentParameter.g:1223:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? )
            {
            // InternalComponentParameter.g:1223:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? )
            // InternalComponentParameter.g:1224:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )?
            {
            // InternalComponentParameter.g:1224:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalComponentParameter.g:1225:4: (lv_name_0_0= RULE_ID )
            {
            // InternalComponentParameter.g:1225:4: (lv_name_0_0= RULE_ID )
            // InternalComponentParameter.g:1226:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getColonKeyword_1());
            		
            // InternalComponentParameter.g:1246:3: ( (lv_type_2_0= ruleAbstractAttributeType ) )
            // InternalComponentParameter.g:1247:4: (lv_type_2_0= ruleAbstractAttributeType )
            {
            // InternalComponentParameter.g:1247:4: (lv_type_2_0= ruleAbstractAttributeType )
            // InternalComponentParameter.g:1248:5: lv_type_2_0= ruleAbstractAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_2_0=ruleAbstractAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.AbstractAttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentParameter.g:1265:3: (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentParameter.g:1266:4: otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalComponentParameter.g:1270:4: ( (lv_defaultvalue_4_0= ruleAbstractValue ) )
                    // InternalComponentParameter.g:1271:5: (lv_defaultvalue_4_0= ruleAbstractValue )
                    {
                    // InternalComponentParameter.g:1271:5: (lv_defaultvalue_4_0= ruleAbstractValue )
                    // InternalComponentParameter.g:1272:6: lv_defaultvalue_4_0= ruleAbstractValue
                    {

                    						newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_defaultvalue_4_0=ruleAbstractValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"defaultvalue",
                    							lv_defaultvalue_4_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.AbstractValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentParameter.g:1290:3: (otherlv_5= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentParameter.g:1291:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_4());
                    			

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
    // InternalComponentParameter.g:1300:1: entryRuleAttributeRefinement returns [EObject current=null] : iv_ruleAttributeRefinement= ruleAttributeRefinement EOF ;
    public final EObject entryRuleAttributeRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeRefinement = null;


        try {
            // InternalComponentParameter.g:1300:60: (iv_ruleAttributeRefinement= ruleAttributeRefinement EOF )
            // InternalComponentParameter.g:1301:2: iv_ruleAttributeRefinement= ruleAttributeRefinement EOF
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
    // InternalComponentParameter.g:1307:1: ruleAttributeRefinement returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractValue ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleAttributeRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1313:2: ( ( ( ( ruleFQN ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractValue ) ) (otherlv_3= ';' )? ) )
            // InternalComponentParameter.g:1314:2: ( ( ( ruleFQN ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractValue ) ) (otherlv_3= ';' )? )
            {
            // InternalComponentParameter.g:1314:2: ( ( ( ruleFQN ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractValue ) ) (otherlv_3= ';' )? )
            // InternalComponentParameter.g:1315:3: ( ( ruleFQN ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractValue ) ) (otherlv_3= ';' )?
            {
            // InternalComponentParameter.g:1315:3: ( ( ruleFQN ) )
            // InternalComponentParameter.g:1316:4: ( ruleFQN )
            {
            // InternalComponentParameter.g:1316:4: ( ruleFQN )
            // InternalComponentParameter.g:1317:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRefinementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionCrossReference_0_0());
            				
            pushFollow(FOLLOW_21);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeRefinementAccess().getEqualsSignKeyword_1());
            		
            // InternalComponentParameter.g:1335:3: ( (lv_value_2_0= ruleAbstractValue ) )
            // InternalComponentParameter.g:1336:4: (lv_value_2_0= ruleAbstractValue )
            {
            // InternalComponentParameter.g:1336:4: (lv_value_2_0= ruleAbstractValue )
            // InternalComponentParameter.g:1337:5: lv_value_2_0= ruleAbstractValue
            {

            					newCompositeNode(grammarAccess.getAttributeRefinementAccess().getValueAbstractValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalComponentParameter.g:1354:3: (otherlv_3= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentParameter.g:1355:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

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
    // InternalComponentParameter.g:1364:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalComponentParameter.g:1364:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalComponentParameter.g:1365:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalComponentParameter.g:1371:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponentParameter.g:1377:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalComponentParameter.g:1378:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalComponentParameter.g:1378:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalComponentParameter.g:1379:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponentParameter.g:1386:3: (kw= '.' this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==34) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalComponentParameter.g:1387:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalComponentParameter.g:1404:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalComponentParameter.g:1404:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalComponentParameter.g:1405:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalComponentParameter.g:1411:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalComponentParameter.g:1417:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalComponentParameter.g:1418:2: (kw= 'true' | kw= 'false' )
            {
            // InternalComponentParameter.g:1418:2: (kw= 'true' | kw= 'false' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            else if ( (LA28_0==36) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalComponentParameter.g:1419:3: kw= 'true'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentParameter.g:1425:3: kw= 'false'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

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
    // InternalComponentParameter.g:1434:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentParameter.g:1434:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentParameter.g:1435:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentParameter.g:1441:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalComponentParameter.g:1447:2: (this_STRING_0= RULE_STRING )
            // InternalComponentParameter.g:1448:2: this_STRING_0= RULE_STRING
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
    // InternalComponentParameter.g:1458:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalComponentParameter.g:1458:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalComponentParameter.g:1459:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalComponentParameter.g:1465:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalComponentParameter.g:1471:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalComponentParameter.g:1472:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalComponentParameter.g:1472:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalComponentParameter.g:1473:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalComponentParameter.g:1473:3: (kw= '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalComponentParameter.g:1474:4: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_23); 

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
    // InternalComponentParameter.g:1491:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalComponentParameter.g:1491:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalComponentParameter.g:1492:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalComponentParameter.g:1498:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalComponentParameter.g:1504:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalComponentParameter.g:1505:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalComponentParameter.g:1505:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalComponentParameter.g:1506:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalComponentParameter.g:1506:3: (kw= '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponentParameter.g:1507:4: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalComponentParameter.g:1513:3: (this_INT_1= RULE_INT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalComponentParameter.g:1514:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_25); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,34,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_26); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalComponentParameter.g:1534:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=38 && LA34_0<=39)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalComponentParameter.g:1535:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalComponentParameter.g:1535:4: (kw= 'E' | kw= 'e' )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==38) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==39) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalComponentParameter.g:1536:5: kw= 'E'
                            {
                            kw=(Token)match(input,38,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalComponentParameter.g:1542:5: kw= 'e'
                            {
                            kw=(Token)match(input,39,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalComponentParameter.g:1548:4: (kw= '-' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==37) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalComponentParameter.g:1549:5: kw= '-'
                            {
                            kw=(Token)match(input,37,FOLLOW_23); 

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
    // InternalComponentParameter.g:1567:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalComponentParameter.g:1567:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalComponentParameter.g:1568:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
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
    // InternalComponentParameter.g:1574:1: ruleEnumerationElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1580:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) )
            // InternalComponentParameter.g:1581:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            {
            // InternalComponentParameter.g:1581:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            // InternalComponentParameter.g:1582:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )?
            {
            // InternalComponentParameter.g:1582:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalComponentParameter.g:1583:4: (lv_name_0_0= RULE_ID )
            {
            // InternalComponentParameter.g:1583:4: (lv_name_0_0= RULE_ID )
            // InternalComponentParameter.g:1584:5: lv_name_0_0= RULE_ID
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

            // InternalComponentParameter.g:1600:3: (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalComponentParameter.g:1601:4: otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalComponentParameter.g:1605:4: ( (lv_value_2_0= ruleEInt ) )
                    // InternalComponentParameter.g:1606:5: (lv_value_2_0= ruleEInt )
                    {
                    // InternalComponentParameter.g:1606:5: (lv_value_2_0= ruleEInt )
                    // InternalComponentParameter.g:1607:6: lv_value_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEnumerationElementAccess().getValueEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
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

            // InternalComponentParameter.g:1625:3: (otherlv_3= ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==22) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalComponentParameter.g:1626:4: otherlv_3= ';'
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
    // InternalComponentParameter.g:1635:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // InternalComponentParameter.g:1635:62: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // InternalComponentParameter.g:1636:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
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
    // InternalComponentParameter.g:1642:1: ruleAbstractAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_InlineEnumerationType_1 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1648:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) )
            // InternalComponentParameter.g:1649:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            {
            // InternalComponentParameter.g:1649:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=44 && LA37_0<=55)) ) {
                alt37=1;
            }
            else if ( (LA37_0==40) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalComponentParameter.g:1650:3: this_PrimitiveType_0= rulePrimitiveType
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
                    // InternalComponentParameter.g:1659:3: this_InlineEnumerationType_1= ruleInlineEnumerationType
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
    // InternalComponentParameter.g:1671:1: entryRuleInlineEnumerationType returns [EObject current=null] : iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF ;
    public final EObject entryRuleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineEnumerationType = null;


        try {
            // InternalComponentParameter.g:1671:62: (iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF )
            // InternalComponentParameter.g:1672:2: iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF
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
    // InternalComponentParameter.g:1678:1: ruleInlineEnumerationType returns [EObject current=null] : (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_array_1_0 = null;

        EObject lv_enums_3_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1684:2: ( (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) )
            // InternalComponentParameter.g:1685:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            {
            // InternalComponentParameter.g:1685:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            // InternalComponentParameter.g:1686:3: otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0());
            		
            // InternalComponentParameter.g:1690:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalComponentParameter.g:1691:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalComponentParameter.g:1691:4: (lv_array_1_0= ruleArrayType )
                    // InternalComponentParameter.g:1692:5: lv_array_1_0= ruleArrayType
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

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentParameter.g:1713:3: ( (lv_enums_3_0= ruleEnumerationElement ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalComponentParameter.g:1714:4: (lv_enums_3_0= ruleEnumerationElement )
            	    {
            	    // InternalComponentParameter.g:1714:4: (lv_enums_3_0= ruleEnumerationElement )
            	    // InternalComponentParameter.g:1715:5: lv_enums_3_0= ruleEnumerationElement
            	    {

            	    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
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
    // InternalComponentParameter.g:1740:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalComponentParameter.g:1740:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalComponentParameter.g:1741:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalComponentParameter.g:1747:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1753:2: ( ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) )
            // InternalComponentParameter.g:1754:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            {
            // InternalComponentParameter.g:1754:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            // InternalComponentParameter.g:1755:3: () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']'
            {
            // InternalComponentParameter.g:1755:3: ()
            // InternalComponentParameter.g:1756:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalComponentParameter.g:1766:3: ( (lv_length_2_0= ruleCardinality ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT||LA40_0==43) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalComponentParameter.g:1767:4: (lv_length_2_0= ruleCardinality )
                    {
                    // InternalComponentParameter.g:1767:4: (lv_length_2_0= ruleCardinality )
                    // InternalComponentParameter.g:1768:5: lv_length_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,42,FOLLOW_2); 

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
    // InternalComponentParameter.g:1793:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalComponentParameter.g:1793:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalComponentParameter.g:1794:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalComponentParameter.g:1800:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalComponentParameter.g:1806:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalComponentParameter.g:1807:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalComponentParameter.g:1807:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            else if ( (LA41_0==43) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalComponentParameter.g:1808:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentParameter.g:1816:3: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

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
    // InternalComponentParameter.g:1825:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalComponentParameter.g:1825:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalComponentParameter.g:1826:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalComponentParameter.g:1832:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeName_0_0 = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1838:2: ( ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) )
            // InternalComponentParameter.g:1839:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            {
            // InternalComponentParameter.g:1839:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            // InternalComponentParameter.g:1840:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )?
            {
            // InternalComponentParameter.g:1840:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) )
            // InternalComponentParameter.g:1841:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            {
            // InternalComponentParameter.g:1841:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            // InternalComponentParameter.g:1842:5: lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalComponentParameter.g:1859:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalComponentParameter.g:1860:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalComponentParameter.g:1860:4: (lv_array_1_0= ruleArrayType )
                    // InternalComponentParameter.g:1861:5: lv_array_1_0= ruleArrayType
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
    // InternalComponentParameter.g:1882:1: entryRuleAbstractValue returns [EObject current=null] : iv_ruleAbstractValue= ruleAbstractValue EOF ;
    public final EObject entryRuleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractValue = null;


        try {
            // InternalComponentParameter.g:1882:54: (iv_ruleAbstractValue= ruleAbstractValue EOF )
            // InternalComponentParameter.g:1883:2: iv_ruleAbstractValue= ruleAbstractValue EOF
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
    // InternalComponentParameter.g:1889:1: ruleAbstractValue returns [EObject current=null] : (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) ;
    public final EObject ruleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValue_0 = null;

        EObject this_ArrayValue_1 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1895:2: ( (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) )
            // InternalComponentParameter.g:1896:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            {
            // InternalComponentParameter.g:1896:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_INT)||(LA43_0>=34 && LA43_0<=37)) ) {
                alt43=1;
            }
            else if ( (LA43_0==41) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalComponentParameter.g:1897:3: this_SingleValue_0= ruleSingleValue
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
                    // InternalComponentParameter.g:1906:3: this_ArrayValue_1= ruleArrayValue
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
    // InternalComponentParameter.g:1918:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalComponentParameter.g:1918:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalComponentParameter.g:1919:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalComponentParameter.g:1925:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:1931:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) )
            // InternalComponentParameter.g:1932:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            {
            // InternalComponentParameter.g:1932:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            // InternalComponentParameter.g:1933:3: otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalComponentParameter.g:1937:3: ( (lv_values_1_0= ruleSingleValue ) )
            // InternalComponentParameter.g:1938:4: (lv_values_1_0= ruleSingleValue )
            {
            // InternalComponentParameter.g:1938:4: (lv_values_1_0= ruleSingleValue )
            // InternalComponentParameter.g:1939:5: lv_values_1_0= ruleSingleValue
            {

            					newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalComponentParameter.g:1956:3: (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==29) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalComponentParameter.g:1957:4: otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_32); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalComponentParameter.g:1961:4: ( (lv_values_3_0= ruleSingleValue ) )
            	    // InternalComponentParameter.g:1962:5: (lv_values_3_0= ruleSingleValue )
            	    {
            	    // InternalComponentParameter.g:1962:5: (lv_values_3_0= ruleSingleValue )
            	    // InternalComponentParameter.g:1963:6: lv_values_3_0= ruleSingleValue
            	    {

            	    						newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop44;
                }
            } while (true);

            otherlv_4=(Token)match(input,42,FOLLOW_2); 

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
    // InternalComponentParameter.g:1989:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalComponentParameter.g:1989:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalComponentParameter.g:1990:2: iv_ruleSingleValue= ruleSingleValue EOF
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
    // InternalComponentParameter.g:1996:1: ruleSingleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalComponentParameter.g:2002:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) )
            // InternalComponentParameter.g:2003:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            {
            // InternalComponentParameter.g:2003:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==RULE_INT) ) {
                    int LA45_2 = input.LA(3);

                    if ( (LA45_2==34) ) {
                        alt45=2;
                    }
                    else if ( (LA45_2==EOF||LA45_2==RULE_ID||LA45_2==14||LA45_2==22||LA45_2==29||LA45_2==42) ) {
                        alt45=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA45_1==34) ) {
                    alt45=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==34) ) {
                    alt45=2;
                }
                else if ( (LA45_2==EOF||LA45_2==RULE_ID||LA45_2==14||LA45_2==22||LA45_2==29||LA45_2==42) ) {
                    alt45=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt45=2;
                }
                break;
            case RULE_STRING:
                {
                alt45=3;
                }
                break;
            case 35:
            case 36:
                {
                alt45=4;
                }
                break;
            case RULE_ID:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalComponentParameter.g:2004:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalComponentParameter.g:2004:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalComponentParameter.g:2005:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalComponentParameter.g:2005:4: ()
                    // InternalComponentParameter.g:2006:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getIntValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalComponentParameter.g:2012:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalComponentParameter.g:2013:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalComponentParameter.g:2013:5: (lv_value_1_0= ruleEInt )
                    // InternalComponentParameter.g:2014:6: lv_value_1_0= ruleEInt
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
                    // InternalComponentParameter.g:2033:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    {
                    // InternalComponentParameter.g:2033:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    // InternalComponentParameter.g:2034:4: () ( (lv_value_3_0= ruleEDouble ) )
                    {
                    // InternalComponentParameter.g:2034:4: ()
                    // InternalComponentParameter.g:2035:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalComponentParameter.g:2041:4: ( (lv_value_3_0= ruleEDouble ) )
                    // InternalComponentParameter.g:2042:5: (lv_value_3_0= ruleEDouble )
                    {
                    // InternalComponentParameter.g:2042:5: (lv_value_3_0= ruleEDouble )
                    // InternalComponentParameter.g:2043:6: lv_value_3_0= ruleEDouble
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
                    // InternalComponentParameter.g:2062:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    {
                    // InternalComponentParameter.g:2062:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    // InternalComponentParameter.g:2063:4: () ( (lv_value_5_0= ruleEString ) )
                    {
                    // InternalComponentParameter.g:2063:4: ()
                    // InternalComponentParameter.g:2064:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getStringValueAction_2_0(),
                    						current);
                    				

                    }

                    // InternalComponentParameter.g:2070:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalComponentParameter.g:2071:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalComponentParameter.g:2071:5: (lv_value_5_0= ruleEString )
                    // InternalComponentParameter.g:2072:6: lv_value_5_0= ruleEString
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
                    // InternalComponentParameter.g:2091:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    {
                    // InternalComponentParameter.g:2091:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    // InternalComponentParameter.g:2092:4: () ( (lv_value_7_0= ruleEBoolean ) )
                    {
                    // InternalComponentParameter.g:2092:4: ()
                    // InternalComponentParameter.g:2093:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getBoolValueAction_3_0(),
                    						current);
                    				

                    }

                    // InternalComponentParameter.g:2099:4: ( (lv_value_7_0= ruleEBoolean ) )
                    // InternalComponentParameter.g:2100:5: (lv_value_7_0= ruleEBoolean )
                    {
                    // InternalComponentParameter.g:2100:5: (lv_value_7_0= ruleEBoolean )
                    // InternalComponentParameter.g:2101:6: lv_value_7_0= ruleEBoolean
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
                    // InternalComponentParameter.g:2120:3: ( () ( ( ruleFQN ) ) )
                    {
                    // InternalComponentParameter.g:2120:3: ( () ( ( ruleFQN ) ) )
                    // InternalComponentParameter.g:2121:4: () ( ( ruleFQN ) )
                    {
                    // InternalComponentParameter.g:2121:4: ()
                    // InternalComponentParameter.g:2122:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0(),
                    						current);
                    				

                    }

                    // InternalComponentParameter.g:2128:4: ( ( ruleFQN ) )
                    // InternalComponentParameter.g:2129:5: ( ruleFQN )
                    {
                    // InternalComponentParameter.g:2129:5: ( ruleFQN )
                    // InternalComponentParameter.g:2130:6: ruleFQN
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
    // InternalComponentParameter.g:2149:1: rulePRIMITIVE_TYPE_NAME returns [Enumerator current=null] : ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) ;
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
            // InternalComponentParameter.g:2155:2: ( ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) )
            // InternalComponentParameter.g:2156:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            {
            // InternalComponentParameter.g:2156:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            int alt46=12;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt46=1;
                }
                break;
            case 45:
                {
                alt46=2;
                }
                break;
            case 46:
                {
                alt46=3;
                }
                break;
            case 47:
                {
                alt46=4;
                }
                break;
            case 48:
                {
                alt46=5;
                }
                break;
            case 49:
                {
                alt46=6;
                }
                break;
            case 50:
                {
                alt46=7;
                }
                break;
            case 51:
                {
                alt46=8;
                }
                break;
            case 52:
                {
                alt46=9;
                }
                break;
            case 53:
                {
                alt46=10;
                }
                break;
            case 54:
                {
                alt46=11;
                }
                break;
            case 55:
                {
                alt46=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalComponentParameter.g:2157:3: (enumLiteral_0= 'Int8' )
                    {
                    // InternalComponentParameter.g:2157:3: (enumLiteral_0= 'Int8' )
                    // InternalComponentParameter.g:2158:4: enumLiteral_0= 'Int8'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentParameter.g:2165:3: (enumLiteral_1= 'Int16' )
                    {
                    // InternalComponentParameter.g:2165:3: (enumLiteral_1= 'Int16' )
                    // InternalComponentParameter.g:2166:4: enumLiteral_1= 'Int16'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentParameter.g:2173:3: (enumLiteral_2= 'Int32' )
                    {
                    // InternalComponentParameter.g:2173:3: (enumLiteral_2= 'Int32' )
                    // InternalComponentParameter.g:2174:4: enumLiteral_2= 'Int32'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentParameter.g:2181:3: (enumLiteral_3= 'Int64' )
                    {
                    // InternalComponentParameter.g:2181:3: (enumLiteral_3= 'Int64' )
                    // InternalComponentParameter.g:2182:4: enumLiteral_3= 'Int64'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalComponentParameter.g:2189:3: (enumLiteral_4= 'UInt8' )
                    {
                    // InternalComponentParameter.g:2189:3: (enumLiteral_4= 'UInt8' )
                    // InternalComponentParameter.g:2190:4: enumLiteral_4= 'UInt8'
                    {
                    enumLiteral_4=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalComponentParameter.g:2197:3: (enumLiteral_5= 'UInt16' )
                    {
                    // InternalComponentParameter.g:2197:3: (enumLiteral_5= 'UInt16' )
                    // InternalComponentParameter.g:2198:4: enumLiteral_5= 'UInt16'
                    {
                    enumLiteral_5=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalComponentParameter.g:2205:3: (enumLiteral_6= 'UInt32' )
                    {
                    // InternalComponentParameter.g:2205:3: (enumLiteral_6= 'UInt32' )
                    // InternalComponentParameter.g:2206:4: enumLiteral_6= 'UInt32'
                    {
                    enumLiteral_6=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalComponentParameter.g:2213:3: (enumLiteral_7= 'UInt64' )
                    {
                    // InternalComponentParameter.g:2213:3: (enumLiteral_7= 'UInt64' )
                    // InternalComponentParameter.g:2214:4: enumLiteral_7= 'UInt64'
                    {
                    enumLiteral_7=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalComponentParameter.g:2221:3: (enumLiteral_8= 'Float' )
                    {
                    // InternalComponentParameter.g:2221:3: (enumLiteral_8= 'Float' )
                    // InternalComponentParameter.g:2222:4: enumLiteral_8= 'Float'
                    {
                    enumLiteral_8=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalComponentParameter.g:2229:3: (enumLiteral_9= 'Double' )
                    {
                    // InternalComponentParameter.g:2229:3: (enumLiteral_9= 'Double' )
                    // InternalComponentParameter.g:2230:4: enumLiteral_9= 'Double'
                    {
                    enumLiteral_9=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalComponentParameter.g:2237:3: (enumLiteral_10= 'String' )
                    {
                    // InternalComponentParameter.g:2237:3: (enumLiteral_10= 'String' )
                    // InternalComponentParameter.g:2238:4: enumLiteral_10= 'String'
                    {
                    enumLiteral_10=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalComponentParameter.g:2245:3: (enumLiteral_11= 'Boolean' )
                    {
                    // InternalComponentParameter.g:2245:3: (enumLiteral_11= 'Boolean' )
                    // InternalComponentParameter.g:2246:4: enumLiteral_11= 'Boolean'
                    {
                    enumLiteral_11=(Token)match(input,55,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000013C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000A04000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C0004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00FFF10000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200400002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000023C00000070L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000C0000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003C00000070L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040020000000L});

}