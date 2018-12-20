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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SkillRealizationModel'", "'{'", "'}'", "'.'", "'SkillSetRealization'", "'skillSetDef'", "'SkillRealization'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalSkillRealization.g:112:1: ruleSkillRealizationModel returns [EObject current=null] : ( () otherlv_1= 'SkillRealizationModel' otherlv_2= '{' ( (lv_skillsets_3_0= ruleSkillRealizationSet ) )* otherlv_4= '}' ) ;
    public final EObject ruleSkillRealizationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_skillsets_3_0 = null;



        	enterRule();

        try {
            // InternalSkillRealization.g:118:2: ( ( () otherlv_1= 'SkillRealizationModel' otherlv_2= '{' ( (lv_skillsets_3_0= ruleSkillRealizationSet ) )* otherlv_4= '}' ) )
            // InternalSkillRealization.g:119:2: ( () otherlv_1= 'SkillRealizationModel' otherlv_2= '{' ( (lv_skillsets_3_0= ruleSkillRealizationSet ) )* otherlv_4= '}' )
            {
            // InternalSkillRealization.g:119:2: ( () otherlv_1= 'SkillRealizationModel' otherlv_2= '{' ( (lv_skillsets_3_0= ruleSkillRealizationSet ) )* otherlv_4= '}' )
            // InternalSkillRealization.g:120:3: () otherlv_1= 'SkillRealizationModel' otherlv_2= '{' ( (lv_skillsets_3_0= ruleSkillRealizationSet ) )* otherlv_4= '}'
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
            		
            // InternalSkillRealization.g:135:3: ( (lv_skillsets_3_0= ruleSkillRealizationSet ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSkillRealization.g:136:4: (lv_skillsets_3_0= ruleSkillRealizationSet )
            	    {
            	    // InternalSkillRealization.g:136:4: (lv_skillsets_3_0= ruleSkillRealizationSet )
            	    // InternalSkillRealization.g:137:5: lv_skillsets_3_0= ruleSkillRealizationSet
            	    {

            	    					newCompositeNode(grammarAccess.getSkillRealizationModelAccess().getSkillsetsSkillRealizationSetParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_skillsets_3_0=ruleSkillRealizationSet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSkillRealizationModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"skillsets",
            	    						lv_skillsets_3_0,
            	    						"org.xtext.behavior.skillRealization.SkillRealization.SkillRealizationSet");
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


    // $ANTLR start "entryRuleSkillRealizationSet"
    // InternalSkillRealization.g:202:1: entryRuleSkillRealizationSet returns [EObject current=null] : iv_ruleSkillRealizationSet= ruleSkillRealizationSet EOF ;
    public final EObject entryRuleSkillRealizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillRealizationSet = null;


        try {
            // InternalSkillRealization.g:202:60: (iv_ruleSkillRealizationSet= ruleSkillRealizationSet EOF )
            // InternalSkillRealization.g:203:2: iv_ruleSkillRealizationSet= ruleSkillRealizationSet EOF
            {
             newCompositeNode(grammarAccess.getSkillRealizationSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkillRealizationSet=ruleSkillRealizationSet();

            state._fsp--;

             current =iv_ruleSkillRealizationSet; 
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
    // $ANTLR end "entryRuleSkillRealizationSet"


    // $ANTLR start "ruleSkillRealizationSet"
    // InternalSkillRealization.g:209:1: ruleSkillRealizationSet returns [EObject current=null] : (otherlv_0= 'SkillSetRealization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'skillSetDef' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_skills_5_0= ruleSkillRealization ) )* otherlv_6= '}' ) ;
    public final EObject ruleSkillRealizationSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_skills_5_0 = null;



        	enterRule();

        try {
            // InternalSkillRealization.g:215:2: ( (otherlv_0= 'SkillSetRealization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'skillSetDef' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_skills_5_0= ruleSkillRealization ) )* otherlv_6= '}' ) )
            // InternalSkillRealization.g:216:2: (otherlv_0= 'SkillSetRealization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'skillSetDef' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_skills_5_0= ruleSkillRealization ) )* otherlv_6= '}' )
            {
            // InternalSkillRealization.g:216:2: (otherlv_0= 'SkillSetRealization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'skillSetDef' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_skills_5_0= ruleSkillRealization ) )* otherlv_6= '}' )
            // InternalSkillRealization.g:217:3: otherlv_0= 'SkillSetRealization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'skillSetDef' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_skills_5_0= ruleSkillRealization ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillRealizationSetAccess().getSkillSetRealizationKeyword_0());
            		
            // InternalSkillRealization.g:221:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSkillRealization.g:222:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSkillRealization.g:222:4: (lv_name_1_0= RULE_ID )
            // InternalSkillRealization.g:223:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSkillRealizationSetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillRealizationSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSkillRealizationSetAccess().getSkillSetDefKeyword_2());
            		
            // InternalSkillRealization.g:243:3: ( ( ruleFQN ) )
            // InternalSkillRealization.g:244:4: ( ruleFQN )
            {
            // InternalSkillRealization.g:244:4: ( ruleFQN )
            // InternalSkillRealization.g:245:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillRealizationSetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSkillRealizationSetAccess().getSkillDefSetSkillDefinitionSetCrossReference_3_0());
            				
            pushFollow(FOLLOW_3);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSkillRealizationSetAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSkillRealization.g:263:3: ( (lv_skills_5_0= ruleSkillRealization ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSkillRealization.g:264:4: (lv_skills_5_0= ruleSkillRealization )
            	    {
            	    // InternalSkillRealization.g:264:4: (lv_skills_5_0= ruleSkillRealization )
            	    // InternalSkillRealization.g:265:5: lv_skills_5_0= ruleSkillRealization
            	    {

            	    					newCompositeNode(grammarAccess.getSkillRealizationSetAccess().getSkillsSkillRealizationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_skills_5_0=ruleSkillRealization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSkillRealizationSetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"skills",
            	    						lv_skills_5_0,
            	    						"org.xtext.behavior.skillRealization.SkillRealization.SkillRealization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSkillRealizationSetAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSkillRealizationSet"


    // $ANTLR start "entryRuleSkillRealization"
    // InternalSkillRealization.g:290:1: entryRuleSkillRealization returns [EObject current=null] : iv_ruleSkillRealization= ruleSkillRealization EOF ;
    public final EObject entryRuleSkillRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillRealization = null;


        try {
            // InternalSkillRealization.g:290:57: (iv_ruleSkillRealization= ruleSkillRealization EOF )
            // InternalSkillRealization.g:291:2: iv_ruleSkillRealization= ruleSkillRealization EOF
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
    // InternalSkillRealization.g:297:1: ruleSkillRealization returns [EObject current=null] : (otherlv_0= 'SkillRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleSkillRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSkillRealization.g:303:2: ( (otherlv_0= 'SkillRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalSkillRealization.g:304:2: (otherlv_0= 'SkillRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalSkillRealization.g:304:2: (otherlv_0= 'SkillRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalSkillRealization.g:305:3: otherlv_0= 'SkillRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillRealizationAccess().getSkillRealizationKeyword_0());
            		
            // InternalSkillRealization.g:309:3: ( ( ruleFQN ) )
            // InternalSkillRealization.g:310:4: ( ruleFQN )
            {
            // InternalSkillRealization.g:310:4: ( ruleFQN )
            // InternalSkillRealization.g:311:5: ruleFQN
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSkillRealizationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSkillRealizationAccess().getRightCurlyBracketKeyword_3());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});

}