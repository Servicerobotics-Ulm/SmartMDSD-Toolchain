package org.xtext.behavior.skillRealization.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.behavior.skillRealization.services.SkillRealizationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSkillRealizationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SkillRealizationModel'", "'{'", "'}'", "'.'", "'CoordinationModuleRealization'", "'coordModuleDef'", "'uses'", "'intsName'", "'SkillRealization'", "'action'", "'('", "')'", "'tcl-param'", "':server'", "':param'", "':paramvalue'", "'tcl-state'", "':state'", "'tcl-activate-event'", "':name'"
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
    public static final int T__30=30;
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSkillRealizationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSkillRealizationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSkillRealizationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSkillRealization.g"; }



     	private SkillRealizationGrammarAccess grammarAccess;

        public InternalSkillRealizationParser(TokenStream input, SkillRealizationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SkillRealizationModel";
       	}

       	@Override
       	protected SkillRealizationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSkillRealizationModel"
    // InternalSkillRealization.g:105:1: entryRuleSkillRealizationModel returns [EObject current=null] : iv_ruleSkillRealizationModel= ruleSkillRealizationModel EOF ;
    public final EObject entryRuleSkillRealizationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillRealizationModel = null;


        try {
            // InternalSkillRealization.g:105:62: (iv_ruleSkillRealizationModel= ruleSkillRealizationModel EOF )
            // InternalSkillRealization.g:106:2: iv_ruleSkillRealizationModel= ruleSkillRealizationModel EOF
            {
             newCompositeNode(grammarAccess.getSkillRealizationModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkillRealizationModel=ruleSkillRealizationModel();

            state._fsp--;

             current =iv_ruleSkillRealizationModel; 
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
    // $ANTLR end "entryRuleSkillRealizationModel"


    // $ANTLR start "ruleSkillRealizationModel"
    // InternalSkillRealization.g:112:1: ruleSkillRealizationModel returns [EObject current=null] : ( () otherlv_1= 'SkillRealizationModel' otherlv_2= '{' ( (lv_modules_3_0= ruleCoordinationModuleRealization ) )* otherlv_4= '}' ) ;
    public final EObject ruleSkillRealizationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_modules_3_0 = null;



        	enterRule();

        try {
            // InternalSkillRealization.g:118:2: ( ( () otherlv_1= 'SkillRealizationModel' otherlv_2= '{' ( (lv_modules_3_0= ruleCoordinationModuleRealization ) )* otherlv_4= '}' ) )
            // InternalSkillRealization.g:119:2: ( () otherlv_1= 'SkillRealizationModel' otherlv_2= '{' ( (lv_modules_3_0= ruleCoordinationModuleRealization ) )* otherlv_4= '}' )
            {
            // InternalSkillRealization.g:119:2: ( () otherlv_1= 'SkillRealizationModel' otherlv_2= '{' ( (lv_modules_3_0= ruleCoordinationModuleRealization ) )* otherlv_4= '}' )
            // InternalSkillRealization.g:120:3: () otherlv_1= 'SkillRealizationModel' otherlv_2= '{' ( (lv_modules_3_0= ruleCoordinationModuleRealization ) )* otherlv_4= '}'
            {
            // InternalSkillRealization.g:120:3: ()
            // InternalSkillRealization.g:121:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSkillRealizationModelAccess().getSkillRealizationModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSkillRealizationModelAccess().getSkillRealizationModelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSkillRealizationModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSkillRealization.g:135:3: ( (lv_modules_3_0= ruleCoordinationModuleRealization ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSkillRealization.g:136:4: (lv_modules_3_0= ruleCoordinationModuleRealization )
            	    {
            	    // InternalSkillRealization.g:136:4: (lv_modules_3_0= ruleCoordinationModuleRealization )
            	    // InternalSkillRealization.g:137:5: lv_modules_3_0= ruleCoordinationModuleRealization
            	    {

            	    					newCompositeNode(grammarAccess.getSkillRealizationModelAccess().getModulesCoordinationModuleRealizationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_modules_3_0=ruleCoordinationModuleRealization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSkillRealizationModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modules",
            	    						lv_modules_3_0,
            	    						"org.xtext.behavior.skillRealization.SkillRealization.CoordinationModuleRealization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSkillRealizationModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSkillRealizationModel"


    // $ANTLR start "entryRuleFQN"
    // InternalSkillRealization.g:162:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalSkillRealization.g:162:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalSkillRealization.g:163:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalSkillRealization.g:169:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSkillRealization.g:175:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSkillRealization.g:176:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSkillRealization.g:176:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSkillRealization.g:177:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalSkillRealization.g:184:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSkillRealization.g:185:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleCoordinationModuleRealization"
    // InternalSkillRealization.g:202:1: entryRuleCoordinationModuleRealization returns [EObject current=null] : iv_ruleCoordinationModuleRealization= ruleCoordinationModuleRealization EOF ;
    public final EObject entryRuleCoordinationModuleRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationModuleRealization = null;


        try {
            // InternalSkillRealization.g:202:70: (iv_ruleCoordinationModuleRealization= ruleCoordinationModuleRealization EOF )
            // InternalSkillRealization.g:203:2: iv_ruleCoordinationModuleRealization= ruleCoordinationModuleRealization EOF
            {
             newCompositeNode(grammarAccess.getCoordinationModuleRealizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinationModuleRealization=ruleCoordinationModuleRealization();

            state._fsp--;

             current =iv_ruleCoordinationModuleRealization; 
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
    // $ANTLR end "entryRuleCoordinationModuleRealization"


    // $ANTLR start "ruleCoordinationModuleRealization"
    // InternalSkillRealization.g:209:1: ruleCoordinationModuleRealization returns [EObject current=null] : (otherlv_0= 'CoordinationModuleRealization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'coordModuleDef' ( ( ruleFQN ) ) otherlv_4= 'uses' otherlv_5= '{' ( (lv_coordInterfaceInsts_6_0= ruleCoordinationInterfaceInstance ) )* otherlv_7= '}' otherlv_8= '{' ( (lv_skills_9_0= ruleSkillRealization ) )* otherlv_10= '}' ) ;
    public final EObject ruleCoordinationModuleRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_coordInterfaceInsts_6_0 = null;

        EObject lv_skills_9_0 = null;



        	enterRule();

        try {
            // InternalSkillRealization.g:215:2: ( (otherlv_0= 'CoordinationModuleRealization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'coordModuleDef' ( ( ruleFQN ) ) otherlv_4= 'uses' otherlv_5= '{' ( (lv_coordInterfaceInsts_6_0= ruleCoordinationInterfaceInstance ) )* otherlv_7= '}' otherlv_8= '{' ( (lv_skills_9_0= ruleSkillRealization ) )* otherlv_10= '}' ) )
            // InternalSkillRealization.g:216:2: (otherlv_0= 'CoordinationModuleRealization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'coordModuleDef' ( ( ruleFQN ) ) otherlv_4= 'uses' otherlv_5= '{' ( (lv_coordInterfaceInsts_6_0= ruleCoordinationInterfaceInstance ) )* otherlv_7= '}' otherlv_8= '{' ( (lv_skills_9_0= ruleSkillRealization ) )* otherlv_10= '}' )
            {
            // InternalSkillRealization.g:216:2: (otherlv_0= 'CoordinationModuleRealization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'coordModuleDef' ( ( ruleFQN ) ) otherlv_4= 'uses' otherlv_5= '{' ( (lv_coordInterfaceInsts_6_0= ruleCoordinationInterfaceInstance ) )* otherlv_7= '}' otherlv_8= '{' ( (lv_skills_9_0= ruleSkillRealization ) )* otherlv_10= '}' )
            // InternalSkillRealization.g:217:3: otherlv_0= 'CoordinationModuleRealization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'coordModuleDef' ( ( ruleFQN ) ) otherlv_4= 'uses' otherlv_5= '{' ( (lv_coordInterfaceInsts_6_0= ruleCoordinationInterfaceInstance ) )* otherlv_7= '}' otherlv_8= '{' ( (lv_skills_9_0= ruleSkillRealization ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinationModuleRealizationAccess().getCoordinationModuleRealizationKeyword_0());
            		
            // InternalSkillRealization.g:221:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSkillRealization.g:222:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSkillRealization.g:222:4: (lv_name_1_0= RULE_ID )
            // InternalSkillRealization.g:223:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCoordinationModuleRealizationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationModuleRealizationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinationModuleRealizationAccess().getCoordModuleDefKeyword_2());
            		
            // InternalSkillRealization.g:243:3: ( ( ruleFQN ) )
            // InternalSkillRealization.g:244:4: ( ruleFQN )
            {
            // InternalSkillRealization.g:244:4: ( ruleFQN )
            // InternalSkillRealization.g:245:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationModuleRealizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoordinationModuleRealizationAccess().getCoordinationModuleDefCoordinationModuleDefinitionCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinationModuleRealizationAccess().getUsesKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getCoordinationModuleRealizationAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSkillRealization.g:267:3: ( (lv_coordInterfaceInsts_6_0= ruleCoordinationInterfaceInstance ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSkillRealization.g:268:4: (lv_coordInterfaceInsts_6_0= ruleCoordinationInterfaceInstance )
            	    {
            	    // InternalSkillRealization.g:268:4: (lv_coordInterfaceInsts_6_0= ruleCoordinationInterfaceInstance )
            	    // InternalSkillRealization.g:269:5: lv_coordInterfaceInsts_6_0= ruleCoordinationInterfaceInstance
            	    {

            	    					newCompositeNode(grammarAccess.getCoordinationModuleRealizationAccess().getCoordInterfaceInstsCoordinationInterfaceInstanceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_coordInterfaceInsts_6_0=ruleCoordinationInterfaceInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoordinationModuleRealizationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"coordInterfaceInsts",
            	    						lv_coordInterfaceInsts_6_0,
            	    						"org.xtext.behavior.skillRealization.SkillRealization.CoordinationInterfaceInstance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getCoordinationModuleRealizationAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getCoordinationModuleRealizationAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalSkillRealization.g:294:3: ( (lv_skills_9_0= ruleSkillRealization ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSkillRealization.g:295:4: (lv_skills_9_0= ruleSkillRealization )
            	    {
            	    // InternalSkillRealization.g:295:4: (lv_skills_9_0= ruleSkillRealization )
            	    // InternalSkillRealization.g:296:5: lv_skills_9_0= ruleSkillRealization
            	    {

            	    					newCompositeNode(grammarAccess.getCoordinationModuleRealizationAccess().getSkillsSkillRealizationParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_skills_9_0=ruleSkillRealization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoordinationModuleRealizationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"skills",
            	    						lv_skills_9_0,
            	    						"org.xtext.behavior.skillRealization.SkillRealization.SkillRealization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCoordinationModuleRealizationAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleCoordinationModuleRealization"


    // $ANTLR start "entryRuleCoordinationInterfaceInstance"
    // InternalSkillRealization.g:321:1: entryRuleCoordinationInterfaceInstance returns [EObject current=null] : iv_ruleCoordinationInterfaceInstance= ruleCoordinationInterfaceInstance EOF ;
    public final EObject entryRuleCoordinationInterfaceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationInterfaceInstance = null;


        try {
            // InternalSkillRealization.g:321:70: (iv_ruleCoordinationInterfaceInstance= ruleCoordinationInterfaceInstance EOF )
            // InternalSkillRealization.g:322:2: iv_ruleCoordinationInterfaceInstance= ruleCoordinationInterfaceInstance EOF
            {
             newCompositeNode(grammarAccess.getCoordinationInterfaceInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinationInterfaceInstance=ruleCoordinationInterfaceInstance();

            state._fsp--;

             current =iv_ruleCoordinationInterfaceInstance; 
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
    // $ANTLR end "entryRuleCoordinationInterfaceInstance"


    // $ANTLR start "ruleCoordinationInterfaceInstance"
    // InternalSkillRealization.g:328:1: ruleCoordinationInterfaceInstance returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= 'intsName' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCoordinationInterfaceInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSkillRealization.g:334:2: ( ( ( ( ruleFQN ) ) otherlv_1= 'intsName' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSkillRealization.g:335:2: ( ( ( ruleFQN ) ) otherlv_1= 'intsName' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSkillRealization.g:335:2: ( ( ( ruleFQN ) ) otherlv_1= 'intsName' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSkillRealization.g:336:3: ( ( ruleFQN ) ) otherlv_1= 'intsName' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalSkillRealization.g:336:3: ( ( ruleFQN ) )
            // InternalSkillRealization.g:337:4: ( ruleFQN )
            {
            // InternalSkillRealization.g:337:4: ( ruleFQN )
            // InternalSkillRealization.g:338:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationInterfaceInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoordinationInterfaceInstanceAccess().getCoordinationInterfaceDefCoordinationServiceDefinitionCrossReference_0_0());
            				
            pushFollow(FOLLOW_11);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCoordinationInterfaceInstanceAccess().getIntsNameKeyword_1());
            		
            // InternalSkillRealization.g:356:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSkillRealization.g:357:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSkillRealization.g:357:4: (lv_name_2_0= RULE_ID )
            // InternalSkillRealization.g:358:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCoordinationInterfaceInstanceAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationInterfaceInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleCoordinationInterfaceInstance"


    // $ANTLR start "entryRuleSkillRealization"
    // InternalSkillRealization.g:378:1: entryRuleSkillRealization returns [EObject current=null] : iv_ruleSkillRealization= ruleSkillRealization EOF ;
    public final EObject entryRuleSkillRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillRealization = null;


        try {
            // InternalSkillRealization.g:378:57: (iv_ruleSkillRealization= ruleSkillRealization EOF )
            // InternalSkillRealization.g:379:2: iv_ruleSkillRealization= ruleSkillRealization EOF
            {
             newCompositeNode(grammarAccess.getSkillRealizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkillRealization=ruleSkillRealization();

            state._fsp--;

             current =iv_ruleSkillRealization; 
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
    // $ANTLR end "entryRuleSkillRealization"


    // $ANTLR start "ruleSkillRealization"
    // InternalSkillRealization.g:385:1: ruleSkillRealization returns [EObject current=null] : (otherlv_0= 'SkillRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= 'action' otherlv_4= '(' ( (lv_action_5_0= ruleCoordinationActionBlock ) ) otherlv_6= ')' otherlv_7= '}' ) ;
    public final EObject ruleSkillRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_action_5_0 = null;



        	enterRule();

        try {
            // InternalSkillRealization.g:391:2: ( (otherlv_0= 'SkillRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= 'action' otherlv_4= '(' ( (lv_action_5_0= ruleCoordinationActionBlock ) ) otherlv_6= ')' otherlv_7= '}' ) )
            // InternalSkillRealization.g:392:2: (otherlv_0= 'SkillRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= 'action' otherlv_4= '(' ( (lv_action_5_0= ruleCoordinationActionBlock ) ) otherlv_6= ')' otherlv_7= '}' )
            {
            // InternalSkillRealization.g:392:2: (otherlv_0= 'SkillRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= 'action' otherlv_4= '(' ( (lv_action_5_0= ruleCoordinationActionBlock ) ) otherlv_6= ')' otherlv_7= '}' )
            // InternalSkillRealization.g:393:3: otherlv_0= 'SkillRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= 'action' otherlv_4= '(' ( (lv_action_5_0= ruleCoordinationActionBlock ) ) otherlv_6= ')' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillRealizationAccess().getSkillRealizationKeyword_0());
            		
            // InternalSkillRealization.g:397:3: ( ( ruleFQN ) )
            // InternalSkillRealization.g:398:4: ( ruleFQN )
            {
            // InternalSkillRealization.g:398:4: ( ruleFQN )
            // InternalSkillRealization.g:399:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillRealizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSkillRealizationAccess().getSkillDefSkillDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_3);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSkillRealizationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getSkillRealizationAccess().getActionKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getSkillRealizationAccess().getLeftParenthesisKeyword_4());
            		
            // InternalSkillRealization.g:425:3: ( (lv_action_5_0= ruleCoordinationActionBlock ) )
            // InternalSkillRealization.g:426:4: (lv_action_5_0= ruleCoordinationActionBlock )
            {
            // InternalSkillRealization.g:426:4: (lv_action_5_0= ruleCoordinationActionBlock )
            // InternalSkillRealization.g:427:5: lv_action_5_0= ruleCoordinationActionBlock
            {

            					newCompositeNode(grammarAccess.getSkillRealizationAccess().getActionCoordinationActionBlockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_action_5_0=ruleCoordinationActionBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSkillRealizationRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_5_0,
            						"org.xtext.behavior.skillRealization.SkillRealization.CoordinationActionBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getSkillRealizationAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSkillRealizationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSkillRealization"


    // $ANTLR start "entryRuleCoordinationActionBlock"
    // InternalSkillRealization.g:456:1: entryRuleCoordinationActionBlock returns [EObject current=null] : iv_ruleCoordinationActionBlock= ruleCoordinationActionBlock EOF ;
    public final EObject entryRuleCoordinationActionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationActionBlock = null;


        try {
            // InternalSkillRealization.g:456:64: (iv_ruleCoordinationActionBlock= ruleCoordinationActionBlock EOF )
            // InternalSkillRealization.g:457:2: iv_ruleCoordinationActionBlock= ruleCoordinationActionBlock EOF
            {
             newCompositeNode(grammarAccess.getCoordinationActionBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinationActionBlock=ruleCoordinationActionBlock();

            state._fsp--;

             current =iv_ruleCoordinationActionBlock; 
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
    // $ANTLR end "entryRuleCoordinationActionBlock"


    // $ANTLR start "ruleCoordinationActionBlock"
    // InternalSkillRealization.g:463:1: ruleCoordinationActionBlock returns [EObject current=null] : ( () ( (lv_actions_1_0= ruleAbstractCoordinationAction ) )* ) ;
    public final EObject ruleCoordinationActionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_1_0 = null;



        	enterRule();

        try {
            // InternalSkillRealization.g:469:2: ( ( () ( (lv_actions_1_0= ruleAbstractCoordinationAction ) )* ) )
            // InternalSkillRealization.g:470:2: ( () ( (lv_actions_1_0= ruleAbstractCoordinationAction ) )* )
            {
            // InternalSkillRealization.g:470:2: ( () ( (lv_actions_1_0= ruleAbstractCoordinationAction ) )* )
            // InternalSkillRealization.g:471:3: () ( (lv_actions_1_0= ruleAbstractCoordinationAction ) )*
            {
            // InternalSkillRealization.g:471:3: ()
            // InternalSkillRealization.g:472:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCoordinationActionBlockAccess().getCoordinationActionBlockAction_0(),
            					current);
            			

            }

            // InternalSkillRealization.g:478:3: ( (lv_actions_1_0= ruleAbstractCoordinationAction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23||LA5_0==27||LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSkillRealization.g:479:4: (lv_actions_1_0= ruleAbstractCoordinationAction )
            	    {
            	    // InternalSkillRealization.g:479:4: (lv_actions_1_0= ruleAbstractCoordinationAction )
            	    // InternalSkillRealization.g:480:5: lv_actions_1_0= ruleAbstractCoordinationAction
            	    {

            	    					newCompositeNode(grammarAccess.getCoordinationActionBlockAccess().getActionsAbstractCoordinationActionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_actions_1_0=ruleAbstractCoordinationAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoordinationActionBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_1_0,
            	    						"org.xtext.behavior.skillRealization.SkillRealization.AbstractCoordinationAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleCoordinationActionBlock"


    // $ANTLR start "entryRuleAbstractCoordinationAction"
    // InternalSkillRealization.g:501:1: entryRuleAbstractCoordinationAction returns [EObject current=null] : iv_ruleAbstractCoordinationAction= ruleAbstractCoordinationAction EOF ;
    public final EObject entryRuleAbstractCoordinationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCoordinationAction = null;


        try {
            // InternalSkillRealization.g:501:67: (iv_ruleAbstractCoordinationAction= ruleAbstractCoordinationAction EOF )
            // InternalSkillRealization.g:502:2: iv_ruleAbstractCoordinationAction= ruleAbstractCoordinationAction EOF
            {
             newCompositeNode(grammarAccess.getAbstractCoordinationActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractCoordinationAction=ruleAbstractCoordinationAction();

            state._fsp--;

             current =iv_ruleAbstractCoordinationAction; 
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
    // $ANTLR end "entryRuleAbstractCoordinationAction"


    // $ANTLR start "ruleAbstractCoordinationAction"
    // InternalSkillRealization.g:508:1: ruleAbstractCoordinationAction returns [EObject current=null] : this_AbstractComponentCoordinationAction_0= ruleAbstractComponentCoordinationAction ;
    public final EObject ruleAbstractCoordinationAction() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractComponentCoordinationAction_0 = null;



        	enterRule();

        try {
            // InternalSkillRealization.g:514:2: (this_AbstractComponentCoordinationAction_0= ruleAbstractComponentCoordinationAction )
            // InternalSkillRealization.g:515:2: this_AbstractComponentCoordinationAction_0= ruleAbstractComponentCoordinationAction
            {

            		newCompositeNode(grammarAccess.getAbstractCoordinationActionAccess().getAbstractComponentCoordinationActionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AbstractComponentCoordinationAction_0=ruleAbstractComponentCoordinationAction();

            state._fsp--;


            		current = this_AbstractComponentCoordinationAction_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleAbstractCoordinationAction"


    // $ANTLR start "entryRuleAbstractComponentCoordinationAction"
    // InternalSkillRealization.g:526:1: entryRuleAbstractComponentCoordinationAction returns [EObject current=null] : iv_ruleAbstractComponentCoordinationAction= ruleAbstractComponentCoordinationAction EOF ;
    public final EObject entryRuleAbstractComponentCoordinationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponentCoordinationAction = null;


        try {
            // InternalSkillRealization.g:526:76: (iv_ruleAbstractComponentCoordinationAction= ruleAbstractComponentCoordinationAction EOF )
            // InternalSkillRealization.g:527:2: iv_ruleAbstractComponentCoordinationAction= ruleAbstractComponentCoordinationAction EOF
            {
             newCompositeNode(grammarAccess.getAbstractComponentCoordinationActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractComponentCoordinationAction=ruleAbstractComponentCoordinationAction();

            state._fsp--;

             current =iv_ruleAbstractComponentCoordinationAction; 
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
    // $ANTLR end "entryRuleAbstractComponentCoordinationAction"


    // $ANTLR start "ruleAbstractComponentCoordinationAction"
    // InternalSkillRealization.g:533:1: ruleAbstractComponentCoordinationAction returns [EObject current=null] : (this_ComponentCoordinationActionParameter_0= ruleComponentCoordinationActionParameter | this_ComponentCoordinationActionActivation_1= ruleComponentCoordinationActionActivation | this_ComponentCoordinationActionEvent_2= ruleComponentCoordinationActionEvent ) ;
    public final EObject ruleAbstractComponentCoordinationAction() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentCoordinationActionParameter_0 = null;

        EObject this_ComponentCoordinationActionActivation_1 = null;

        EObject this_ComponentCoordinationActionEvent_2 = null;



        	enterRule();

        try {
            // InternalSkillRealization.g:539:2: ( (this_ComponentCoordinationActionParameter_0= ruleComponentCoordinationActionParameter | this_ComponentCoordinationActionActivation_1= ruleComponentCoordinationActionActivation | this_ComponentCoordinationActionEvent_2= ruleComponentCoordinationActionEvent ) )
            // InternalSkillRealization.g:540:2: (this_ComponentCoordinationActionParameter_0= ruleComponentCoordinationActionParameter | this_ComponentCoordinationActionActivation_1= ruleComponentCoordinationActionActivation | this_ComponentCoordinationActionEvent_2= ruleComponentCoordinationActionEvent )
            {
            // InternalSkillRealization.g:540:2: (this_ComponentCoordinationActionParameter_0= ruleComponentCoordinationActionParameter | this_ComponentCoordinationActionActivation_1= ruleComponentCoordinationActionActivation | this_ComponentCoordinationActionEvent_2= ruleComponentCoordinationActionEvent )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSkillRealization.g:541:3: this_ComponentCoordinationActionParameter_0= ruleComponentCoordinationActionParameter
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentCoordinationActionAccess().getComponentCoordinationActionParameterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentCoordinationActionParameter_0=ruleComponentCoordinationActionParameter();

                    state._fsp--;


                    			current = this_ComponentCoordinationActionParameter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSkillRealization.g:550:3: this_ComponentCoordinationActionActivation_1= ruleComponentCoordinationActionActivation
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentCoordinationActionAccess().getComponentCoordinationActionActivationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentCoordinationActionActivation_1=ruleComponentCoordinationActionActivation();

                    state._fsp--;


                    			current = this_ComponentCoordinationActionActivation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSkillRealization.g:559:3: this_ComponentCoordinationActionEvent_2= ruleComponentCoordinationActionEvent
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentCoordinationActionAccess().getComponentCoordinationActionEventParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentCoordinationActionEvent_2=ruleComponentCoordinationActionEvent();

                    state._fsp--;


                    			current = this_ComponentCoordinationActionEvent_2;
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
    // $ANTLR end "ruleAbstractComponentCoordinationAction"


    // $ANTLR start "entryRuleComponentCoordinationActionParameter"
    // InternalSkillRealization.g:571:1: entryRuleComponentCoordinationActionParameter returns [EObject current=null] : iv_ruleComponentCoordinationActionParameter= ruleComponentCoordinationActionParameter EOF ;
    public final EObject entryRuleComponentCoordinationActionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentCoordinationActionParameter = null;


        try {
            // InternalSkillRealization.g:571:77: (iv_ruleComponentCoordinationActionParameter= ruleComponentCoordinationActionParameter EOF )
            // InternalSkillRealization.g:572:2: iv_ruleComponentCoordinationActionParameter= ruleComponentCoordinationActionParameter EOF
            {
             newCompositeNode(grammarAccess.getComponentCoordinationActionParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentCoordinationActionParameter=ruleComponentCoordinationActionParameter();

            state._fsp--;

             current =iv_ruleComponentCoordinationActionParameter; 
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
    // $ANTLR end "entryRuleComponentCoordinationActionParameter"


    // $ANTLR start "ruleComponentCoordinationActionParameter"
    // InternalSkillRealization.g:578:1: ruleComponentCoordinationActionParameter returns [EObject current=null] : (otherlv_0= 'tcl-param' otherlv_1= ':server' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':param' ( ( ruleFQN ) ) (otherlv_5= ':paramvalue' ( (lv_value_6_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleComponentCoordinationActionParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;


        	enterRule();

        try {
            // InternalSkillRealization.g:584:2: ( (otherlv_0= 'tcl-param' otherlv_1= ':server' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':param' ( ( ruleFQN ) ) (otherlv_5= ':paramvalue' ( (lv_value_6_0= RULE_STRING ) ) )? ) )
            // InternalSkillRealization.g:585:2: (otherlv_0= 'tcl-param' otherlv_1= ':server' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':param' ( ( ruleFQN ) ) (otherlv_5= ':paramvalue' ( (lv_value_6_0= RULE_STRING ) ) )? )
            {
            // InternalSkillRealization.g:585:2: (otherlv_0= 'tcl-param' otherlv_1= ':server' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':param' ( ( ruleFQN ) ) (otherlv_5= ':paramvalue' ( (lv_value_6_0= RULE_STRING ) ) )? )
            // InternalSkillRealization.g:586:3: otherlv_0= 'tcl-param' otherlv_1= ':server' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':param' ( ( ruleFQN ) ) (otherlv_5= ':paramvalue' ( (lv_value_6_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentCoordinationActionParameterAccess().getTclParamKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentCoordinationActionParameterAccess().getServerKeyword_1());
            		
            // InternalSkillRealization.g:594:3: ( (otherlv_2= RULE_ID ) )
            // InternalSkillRealization.g:595:4: (otherlv_2= RULE_ID )
            {
            // InternalSkillRealization.g:595:4: (otherlv_2= RULE_ID )
            // InternalSkillRealization.g:596:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentCoordinationActionParameterRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_2, grammarAccess.getComponentCoordinationActionParameterAccess().getCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentCoordinationActionParameterAccess().getParamKeyword_3());
            		
            // InternalSkillRealization.g:611:3: ( ( ruleFQN ) )
            // InternalSkillRealization.g:612:4: ( ruleFQN )
            {
            // InternalSkillRealization.g:612:4: ( ruleFQN )
            // InternalSkillRealization.g:613:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentCoordinationActionParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentCoordinationActionParameterAccess().getParameterAbstractParameterCrossReference_4_0());
            				
            pushFollow(FOLLOW_20);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSkillRealization.g:627:3: (otherlv_5= ':paramvalue' ( (lv_value_6_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSkillRealization.g:628:4: otherlv_5= ':paramvalue' ( (lv_value_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getComponentCoordinationActionParameterAccess().getParamvalueKeyword_5_0());
                    			
                    // InternalSkillRealization.g:632:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalSkillRealization.g:633:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalSkillRealization.g:633:5: (lv_value_6_0= RULE_STRING )
                    // InternalSkillRealization.g:634:6: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_6_0, grammarAccess.getComponentCoordinationActionParameterAccess().getValueSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentCoordinationActionParameterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


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
    // $ANTLR end "ruleComponentCoordinationActionParameter"


    // $ANTLR start "entryRuleComponentCoordinationActionActivation"
    // InternalSkillRealization.g:655:1: entryRuleComponentCoordinationActionActivation returns [EObject current=null] : iv_ruleComponentCoordinationActionActivation= ruleComponentCoordinationActionActivation EOF ;
    public final EObject entryRuleComponentCoordinationActionActivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentCoordinationActionActivation = null;


        try {
            // InternalSkillRealization.g:655:78: (iv_ruleComponentCoordinationActionActivation= ruleComponentCoordinationActionActivation EOF )
            // InternalSkillRealization.g:656:2: iv_ruleComponentCoordinationActionActivation= ruleComponentCoordinationActionActivation EOF
            {
             newCompositeNode(grammarAccess.getComponentCoordinationActionActivationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentCoordinationActionActivation=ruleComponentCoordinationActionActivation();

            state._fsp--;

             current =iv_ruleComponentCoordinationActionActivation; 
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
    // $ANTLR end "entryRuleComponentCoordinationActionActivation"


    // $ANTLR start "ruleComponentCoordinationActionActivation"
    // InternalSkillRealization.g:662:1: ruleComponentCoordinationActionActivation returns [EObject current=null] : (otherlv_0= 'tcl-state' otherlv_1= ':server' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':state' ( ( ruleFQN ) ) ) ;
    public final EObject ruleComponentCoordinationActionActivation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSkillRealization.g:668:2: ( (otherlv_0= 'tcl-state' otherlv_1= ':server' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':state' ( ( ruleFQN ) ) ) )
            // InternalSkillRealization.g:669:2: (otherlv_0= 'tcl-state' otherlv_1= ':server' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':state' ( ( ruleFQN ) ) )
            {
            // InternalSkillRealization.g:669:2: (otherlv_0= 'tcl-state' otherlv_1= ':server' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':state' ( ( ruleFQN ) ) )
            // InternalSkillRealization.g:670:3: otherlv_0= 'tcl-state' otherlv_1= ':server' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':state' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentCoordinationActionActivationAccess().getTclStateKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentCoordinationActionActivationAccess().getServerKeyword_1());
            		
            // InternalSkillRealization.g:678:3: ( (otherlv_2= RULE_ID ) )
            // InternalSkillRealization.g:679:4: (otherlv_2= RULE_ID )
            {
            // InternalSkillRealization.g:679:4: (otherlv_2= RULE_ID )
            // InternalSkillRealization.g:680:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentCoordinationActionActivationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getComponentCoordinationActionActivationAccess().getCoordinationServiceCoordinationInterfaceInstanceCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentCoordinationActionActivationAccess().getStateKeyword_3());
            		
            // InternalSkillRealization.g:695:3: ( ( ruleFQN ) )
            // InternalSkillRealization.g:696:4: ( ruleFQN )
            {
            // InternalSkillRealization.g:696:4: ( ruleFQN )
            // InternalSkillRealization.g:697:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentCoordinationActionActivationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentCoordinationActionActivationAccess().getStateComponentModeDefinitionCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


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
    // $ANTLR end "ruleComponentCoordinationActionActivation"


    // $ANTLR start "entryRuleComponentCoordinationActionEvent"
    // InternalSkillRealization.g:715:1: entryRuleComponentCoordinationActionEvent returns [EObject current=null] : iv_ruleComponentCoordinationActionEvent= ruleComponentCoordinationActionEvent EOF ;
    public final EObject entryRuleComponentCoordinationActionEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentCoordinationActionEvent = null;


        try {
            // InternalSkillRealization.g:715:73: (iv_ruleComponentCoordinationActionEvent= ruleComponentCoordinationActionEvent EOF )
            // InternalSkillRealization.g:716:2: iv_ruleComponentCoordinationActionEvent= ruleComponentCoordinationActionEvent EOF
            {
             newCompositeNode(grammarAccess.getComponentCoordinationActionEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentCoordinationActionEvent=ruleComponentCoordinationActionEvent();

            state._fsp--;

             current =iv_ruleComponentCoordinationActionEvent; 
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
    // $ANTLR end "entryRuleComponentCoordinationActionEvent"


    // $ANTLR start "ruleComponentCoordinationActionEvent"
    // InternalSkillRealization.g:722:1: ruleComponentCoordinationActionEvent returns [EObject current=null] : (otherlv_0= 'tcl-activate-event' otherlv_1= ':name' otherlv_2= ':server' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleComponentCoordinationActionEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSkillRealization.g:728:2: ( (otherlv_0= 'tcl-activate-event' otherlv_1= ':name' otherlv_2= ':server' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSkillRealization.g:729:2: (otherlv_0= 'tcl-activate-event' otherlv_1= ':name' otherlv_2= ':server' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSkillRealization.g:729:2: (otherlv_0= 'tcl-activate-event' otherlv_1= ':name' otherlv_2= ':server' ( (otherlv_3= RULE_ID ) ) )
            // InternalSkillRealization.g:730:3: otherlv_0= 'tcl-activate-event' otherlv_1= ':name' otherlv_2= ':server' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentCoordinationActionEventAccess().getTclActivateEventKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentCoordinationActionEventAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentCoordinationActionEventAccess().getServerKeyword_2());
            		
            // InternalSkillRealization.g:742:3: ( (otherlv_3= RULE_ID ) )
            // InternalSkillRealization.g:743:4: (otherlv_3= RULE_ID )
            {
            // InternalSkillRealization.g:743:4: (otherlv_3= RULE_ID )
            // InternalSkillRealization.g:744:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentCoordinationActionEventRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getComponentCoordinationActionEventAccess().getCoordinationServiceCoordinationInterfaceInstanceCrossReference_3_0());
            				

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
    // $ANTLR end "ruleComponentCoordinationActionEvent"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000028C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000028800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});

}