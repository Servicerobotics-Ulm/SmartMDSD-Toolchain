package org.xtext.service.skillDefinition.parser.antlr.internal;

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
import org.xtext.service.skillDefinition.services.SkillDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSkillDefinitionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SkillDefinitionRepository'", "'{'", "'}'", "'SkillDefinitionSet'", "'SkillDefinition'", "'in'", "'out'", "'results'", "'value'", "'='", "';'", "':'", "'.'", "'true'", "'false'", "'-'", "'E'", "'e'", "'InlineEnumeration'", "'['", "']'", "'*'", "','", "'ERROR'", "'SUCCESS'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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


        public InternalSkillDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSkillDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSkillDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSkillDefinition.g"; }



     	private SkillDefinitionGrammarAccess grammarAccess;

        public InternalSkillDefinitionParser(TokenStream input, SkillDefinitionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SkillDefinitionModel";
       	}

       	@Override
       	protected SkillDefinitionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSkillDefinitionModel"
    // InternalSkillDefinition.g:106:1: entryRuleSkillDefinitionModel returns [EObject current=null] : iv_ruleSkillDefinitionModel= ruleSkillDefinitionModel EOF ;
    public final EObject entryRuleSkillDefinitionModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillDefinitionModel = null;


        try {
            // InternalSkillDefinition.g:106:61: (iv_ruleSkillDefinitionModel= ruleSkillDefinitionModel EOF )
            // InternalSkillDefinition.g:107:2: iv_ruleSkillDefinitionModel= ruleSkillDefinitionModel EOF
            {
             newCompositeNode(grammarAccess.getSkillDefinitionModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkillDefinitionModel=ruleSkillDefinitionModel();

            state._fsp--;

             current =iv_ruleSkillDefinitionModel; 
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
    // $ANTLR end "entryRuleSkillDefinitionModel"


    // $ANTLR start "ruleSkillDefinitionModel"
    // InternalSkillDefinition.g:113:1: ruleSkillDefinitionModel returns [EObject current=null] : ( () ( (lv_repository_1_0= ruleSkillDefinitionRepository ) )? ) ;
    public final EObject ruleSkillDefinitionModel() throws RecognitionException {
        EObject current = null;

        EObject lv_repository_1_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:119:2: ( ( () ( (lv_repository_1_0= ruleSkillDefinitionRepository ) )? ) )
            // InternalSkillDefinition.g:120:2: ( () ( (lv_repository_1_0= ruleSkillDefinitionRepository ) )? )
            {
            // InternalSkillDefinition.g:120:2: ( () ( (lv_repository_1_0= ruleSkillDefinitionRepository ) )? )
            // InternalSkillDefinition.g:121:3: () ( (lv_repository_1_0= ruleSkillDefinitionRepository ) )?
            {
            // InternalSkillDefinition.g:121:3: ()
            // InternalSkillDefinition.g:122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSkillDefinitionModelAccess().getSkillDefinitionModelAction_0(),
            					current);
            			

            }

            // InternalSkillDefinition.g:128:3: ( (lv_repository_1_0= ruleSkillDefinitionRepository ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSkillDefinition.g:129:4: (lv_repository_1_0= ruleSkillDefinitionRepository )
                    {
                    // InternalSkillDefinition.g:129:4: (lv_repository_1_0= ruleSkillDefinitionRepository )
                    // InternalSkillDefinition.g:130:5: lv_repository_1_0= ruleSkillDefinitionRepository
                    {

                    					newCompositeNode(grammarAccess.getSkillDefinitionModelAccess().getRepositorySkillDefinitionRepositoryParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repository_1_0=ruleSkillDefinitionRepository();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSkillDefinitionModelRule());
                    					}
                    					set(
                    						current,
                    						"repository",
                    						lv_repository_1_0,
                    						"org.xtext.service.skillDefinition.SkillDefinition.SkillDefinitionRepository");
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
    // $ANTLR end "ruleSkillDefinitionModel"


    // $ANTLR start "entryRuleSkillDefinitionRepository"
    // InternalSkillDefinition.g:151:1: entryRuleSkillDefinitionRepository returns [EObject current=null] : iv_ruleSkillDefinitionRepository= ruleSkillDefinitionRepository EOF ;
    public final EObject entryRuleSkillDefinitionRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillDefinitionRepository = null;


        try {
            // InternalSkillDefinition.g:151:66: (iv_ruleSkillDefinitionRepository= ruleSkillDefinitionRepository EOF )
            // InternalSkillDefinition.g:152:2: iv_ruleSkillDefinitionRepository= ruleSkillDefinitionRepository EOF
            {
             newCompositeNode(grammarAccess.getSkillDefinitionRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkillDefinitionRepository=ruleSkillDefinitionRepository();

            state._fsp--;

             current =iv_ruleSkillDefinitionRepository; 
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
    // $ANTLR end "entryRuleSkillDefinitionRepository"


    // $ANTLR start "ruleSkillDefinitionRepository"
    // InternalSkillDefinition.g:158:1: ruleSkillDefinitionRepository returns [EObject current=null] : (otherlv_0= 'SkillDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleSkillDefinitionSet ) )* otherlv_4= '}' ) ;
    public final EObject ruleSkillDefinitionRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sets_3_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:164:2: ( (otherlv_0= 'SkillDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleSkillDefinitionSet ) )* otherlv_4= '}' ) )
            // InternalSkillDefinition.g:165:2: (otherlv_0= 'SkillDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleSkillDefinitionSet ) )* otherlv_4= '}' )
            {
            // InternalSkillDefinition.g:165:2: (otherlv_0= 'SkillDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleSkillDefinitionSet ) )* otherlv_4= '}' )
            // InternalSkillDefinition.g:166:3: otherlv_0= 'SkillDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleSkillDefinitionSet ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillDefinitionRepositoryAccess().getSkillDefinitionRepositoryKeyword_0());
            		
            // InternalSkillDefinition.g:170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSkillDefinition.g:171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSkillDefinition.g:171:4: (lv_name_1_0= RULE_ID )
            // InternalSkillDefinition.g:172:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSkillDefinitionRepositoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillDefinitionRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSkillDefinitionRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSkillDefinition.g:192:3: ( (lv_sets_3_0= ruleSkillDefinitionSet ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSkillDefinition.g:193:4: (lv_sets_3_0= ruleSkillDefinitionSet )
            	    {
            	    // InternalSkillDefinition.g:193:4: (lv_sets_3_0= ruleSkillDefinitionSet )
            	    // InternalSkillDefinition.g:194:5: lv_sets_3_0= ruleSkillDefinitionSet
            	    {

            	    					newCompositeNode(grammarAccess.getSkillDefinitionRepositoryAccess().getSetsSkillDefinitionSetParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_sets_3_0=ruleSkillDefinitionSet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSkillDefinitionRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sets",
            	    						lv_sets_3_0,
            	    						"org.xtext.service.skillDefinition.SkillDefinition.SkillDefinitionSet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSkillDefinitionRepositoryAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSkillDefinitionRepository"


    // $ANTLR start "entryRuleSkillDefinitionSet"
    // InternalSkillDefinition.g:219:1: entryRuleSkillDefinitionSet returns [EObject current=null] : iv_ruleSkillDefinitionSet= ruleSkillDefinitionSet EOF ;
    public final EObject entryRuleSkillDefinitionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillDefinitionSet = null;


        try {
            // InternalSkillDefinition.g:219:59: (iv_ruleSkillDefinitionSet= ruleSkillDefinitionSet EOF )
            // InternalSkillDefinition.g:220:2: iv_ruleSkillDefinitionSet= ruleSkillDefinitionSet EOF
            {
             newCompositeNode(grammarAccess.getSkillDefinitionSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkillDefinitionSet=ruleSkillDefinitionSet();

            state._fsp--;

             current =iv_ruleSkillDefinitionSet; 
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
    // $ANTLR end "entryRuleSkillDefinitionSet"


    // $ANTLR start "ruleSkillDefinitionSet"
    // InternalSkillDefinition.g:226:1: ruleSkillDefinitionSet returns [EObject current=null] : (otherlv_0= 'SkillDefinitionSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_skills_3_0= ruleSkillDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleSkillDefinitionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_skills_3_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:232:2: ( (otherlv_0= 'SkillDefinitionSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_skills_3_0= ruleSkillDefinition ) )* otherlv_4= '}' ) )
            // InternalSkillDefinition.g:233:2: (otherlv_0= 'SkillDefinitionSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_skills_3_0= ruleSkillDefinition ) )* otherlv_4= '}' )
            {
            // InternalSkillDefinition.g:233:2: (otherlv_0= 'SkillDefinitionSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_skills_3_0= ruleSkillDefinition ) )* otherlv_4= '}' )
            // InternalSkillDefinition.g:234:3: otherlv_0= 'SkillDefinitionSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_skills_3_0= ruleSkillDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillDefinitionSetAccess().getSkillDefinitionSetKeyword_0());
            		
            // InternalSkillDefinition.g:238:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSkillDefinition.g:239:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSkillDefinition.g:239:4: (lv_name_1_0= RULE_ID )
            // InternalSkillDefinition.g:240:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSkillDefinitionSetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillDefinitionSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSkillDefinitionSetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSkillDefinition.g:260:3: ( (lv_skills_3_0= ruleSkillDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSkillDefinition.g:261:4: (lv_skills_3_0= ruleSkillDefinition )
            	    {
            	    // InternalSkillDefinition.g:261:4: (lv_skills_3_0= ruleSkillDefinition )
            	    // InternalSkillDefinition.g:262:5: lv_skills_3_0= ruleSkillDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getSkillDefinitionSetAccess().getSkillsSkillDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_skills_3_0=ruleSkillDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSkillDefinitionSetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"skills",
            	    						lv_skills_3_0,
            	    						"org.xtext.service.skillDefinition.SkillDefinition.SkillDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSkillDefinitionSetAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSkillDefinitionSet"


    // $ANTLR start "entryRuleSkillDefinition"
    // InternalSkillDefinition.g:287:1: entryRuleSkillDefinition returns [EObject current=null] : iv_ruleSkillDefinition= ruleSkillDefinition EOF ;
    public final EObject entryRuleSkillDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillDefinition = null;


        try {
            // InternalSkillDefinition.g:287:56: (iv_ruleSkillDefinition= ruleSkillDefinition EOF )
            // InternalSkillDefinition.g:288:2: iv_ruleSkillDefinition= ruleSkillDefinition EOF
            {
             newCompositeNode(grammarAccess.getSkillDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkillDefinition=ruleSkillDefinition();

            state._fsp--;

             current =iv_ruleSkillDefinition; 
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
    // $ANTLR end "entryRuleSkillDefinition"


    // $ANTLR start "ruleSkillDefinition"
    // InternalSkillDefinition.g:294:1: ruleSkillDefinition returns [EObject current=null] : (otherlv_0= 'SkillDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleSkillResult ) )+ otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleSkillDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_inAttribute_5_0 = null;

        EObject lv_outAttribute_9_0 = null;

        EObject lv_results_13_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:300:2: ( (otherlv_0= 'SkillDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleSkillResult ) )+ otherlv_14= '}' otherlv_15= '}' ) )
            // InternalSkillDefinition.g:301:2: (otherlv_0= 'SkillDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleSkillResult ) )+ otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalSkillDefinition.g:301:2: (otherlv_0= 'SkillDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleSkillResult ) )+ otherlv_14= '}' otherlv_15= '}' )
            // InternalSkillDefinition.g:302:3: otherlv_0= 'SkillDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleSkillResult ) )+ otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillDefinitionAccess().getSkillDefinitionKeyword_0());
            		
            // InternalSkillDefinition.g:306:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSkillDefinition.g:307:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSkillDefinition.g:307:4: (lv_name_1_0= RULE_ID )
            // InternalSkillDefinition.g:308:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSkillDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSkillDefinition.g:328:3: (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSkillDefinition.g:329:4: otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSkillDefinitionAccess().getInKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSkillDefinition.g:337:4: ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSkillDefinition.g:338:5: (lv_inAttribute_5_0= ruleAttributeDefinition )
                    	    {
                    	    // InternalSkillDefinition.g:338:5: (lv_inAttribute_5_0= ruleAttributeDefinition )
                    	    // InternalSkillDefinition.g:339:6: lv_inAttribute_5_0= ruleAttributeDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getSkillDefinitionAccess().getInAttributeAttributeDefinitionParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_inAttribute_5_0=ruleAttributeDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSkillDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inAttribute",
                    	    							lv_inAttribute_5_0,
                    	    							"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalSkillDefinition.g:361:3: (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSkillDefinition.g:362:4: otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getSkillDefinitionAccess().getOutKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSkillDefinition.g:370:4: ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSkillDefinition.g:371:5: (lv_outAttribute_9_0= ruleAttributeDefinition )
                    	    {
                    	    // InternalSkillDefinition.g:371:5: (lv_outAttribute_9_0= ruleAttributeDefinition )
                    	    // InternalSkillDefinition.g:372:6: lv_outAttribute_9_0= ruleAttributeDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getSkillDefinitionAccess().getOutAttributeAttributeDefinitionParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_outAttribute_9_0=ruleAttributeDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSkillDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"outAttribute",
                    	    							lv_outAttribute_9_0,
                    	    							"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getSkillDefinitionAccess().getResultsKeyword_5());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSkillDefinition.g:402:3: ( (lv_results_13_0= ruleSkillResult ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=34 && LA8_0<=35)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSkillDefinition.g:403:4: (lv_results_13_0= ruleSkillResult )
            	    {
            	    // InternalSkillDefinition.g:403:4: (lv_results_13_0= ruleSkillResult )
            	    // InternalSkillDefinition.g:404:5: lv_results_13_0= ruleSkillResult
            	    {

            	    					newCompositeNode(grammarAccess.getSkillDefinitionAccess().getResultsSkillResultParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_results_13_0=ruleSkillResult();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSkillDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"results",
            	    						lv_results_13_0,
            	    						"org.xtext.service.skillDefinition.SkillDefinition.SkillResult");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_14=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSkillDefinition"


    // $ANTLR start "entryRuleSkillResult"
    // InternalSkillDefinition.g:433:1: entryRuleSkillResult returns [EObject current=null] : iv_ruleSkillResult= ruleSkillResult EOF ;
    public final EObject entryRuleSkillResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillResult = null;


        try {
            // InternalSkillDefinition.g:433:52: (iv_ruleSkillResult= ruleSkillResult EOF )
            // InternalSkillDefinition.g:434:2: iv_ruleSkillResult= ruleSkillResult EOF
            {
             newCompositeNode(grammarAccess.getSkillResultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkillResult=ruleSkillResult();

            state._fsp--;

             current =iv_ruleSkillResult; 
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
    // $ANTLR end "entryRuleSkillResult"


    // $ANTLR start "ruleSkillResult"
    // InternalSkillDefinition.g:440:1: ruleSkillResult returns [EObject current=null] : ( ( (lv_result_0_0= ruleSKILL_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleSkillResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_result_0_0 = null;

        AntlrDatatypeRuleToken lv_resultValue_3_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:446:2: ( ( ( (lv_result_0_0= ruleSKILL_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? ) )
            // InternalSkillDefinition.g:447:2: ( ( (lv_result_0_0= ruleSKILL_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? )
            {
            // InternalSkillDefinition.g:447:2: ( ( (lv_result_0_0= ruleSKILL_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? )
            // InternalSkillDefinition.g:448:3: ( (lv_result_0_0= ruleSKILL_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )?
            {
            // InternalSkillDefinition.g:448:3: ( (lv_result_0_0= ruleSKILL_RESULT_TYPES ) )
            // InternalSkillDefinition.g:449:4: (lv_result_0_0= ruleSKILL_RESULT_TYPES )
            {
            // InternalSkillDefinition.g:449:4: (lv_result_0_0= ruleSKILL_RESULT_TYPES )
            // InternalSkillDefinition.g:450:5: lv_result_0_0= ruleSKILL_RESULT_TYPES
            {

            					newCompositeNode(grammarAccess.getSkillResultAccess().getResultSKILL_RESULT_TYPESEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_result_0_0=ruleSKILL_RESULT_TYPES();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSkillResultRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_0_0,
            						"org.xtext.service.skillDefinition.SkillDefinition.SKILL_RESULT_TYPES");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSkillResultAccess().getValueKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSkillResultAccess().getEqualsSignKeyword_2());
            		
            // InternalSkillDefinition.g:475:3: ( (lv_resultValue_3_0= ruleEString ) )
            // InternalSkillDefinition.g:476:4: (lv_resultValue_3_0= ruleEString )
            {
            // InternalSkillDefinition.g:476:4: (lv_resultValue_3_0= ruleEString )
            // InternalSkillDefinition.g:477:5: lv_resultValue_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSkillResultAccess().getResultValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_resultValue_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSkillResultRule());
            					}
            					set(
            						current,
            						"resultValue",
            						lv_resultValue_3_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSkillDefinition.g:494:3: (otherlv_4= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSkillDefinition.g:495:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSkillResultAccess().getSemicolonKeyword_4());
                    			

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
    // $ANTLR end "ruleSkillResult"


    // $ANTLR start "entryRuleAttributeDefinition"
    // InternalSkillDefinition.g:504:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalSkillDefinition.g:504:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalSkillDefinition.g:505:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
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
    // InternalSkillDefinition.g:511:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? ) ;
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
            // InternalSkillDefinition.g:517:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? ) )
            // InternalSkillDefinition.g:518:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? )
            {
            // InternalSkillDefinition.g:518:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? )
            // InternalSkillDefinition.g:519:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )?
            {
            // InternalSkillDefinition.g:519:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSkillDefinition.g:520:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSkillDefinition.g:520:4: (lv_name_0_0= RULE_ID )
            // InternalSkillDefinition.g:521:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getColonKeyword_1());
            		
            // InternalSkillDefinition.g:541:3: ( (lv_type_2_0= ruleAbstractAttributeType ) )
            // InternalSkillDefinition.g:542:4: (lv_type_2_0= ruleAbstractAttributeType )
            {
            // InternalSkillDefinition.g:542:4: (lv_type_2_0= ruleAbstractAttributeType )
            // InternalSkillDefinition.g:543:5: lv_type_2_0= ruleAbstractAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalSkillDefinition.g:560:3: (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSkillDefinition.g:561:4: otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalSkillDefinition.g:565:4: ( (lv_defaultvalue_4_0= ruleAbstractValue ) )
                    // InternalSkillDefinition.g:566:5: (lv_defaultvalue_4_0= ruleAbstractValue )
                    {
                    // InternalSkillDefinition.g:566:5: (lv_defaultvalue_4_0= ruleAbstractValue )
                    // InternalSkillDefinition.g:567:6: lv_defaultvalue_4_0= ruleAbstractValue
                    {

                    						newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

            // InternalSkillDefinition.g:585:3: (otherlv_5= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSkillDefinition.g:586:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFQN"
    // InternalSkillDefinition.g:595:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalSkillDefinition.g:595:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalSkillDefinition.g:596:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalSkillDefinition.g:602:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSkillDefinition.g:608:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSkillDefinition.g:609:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSkillDefinition.g:609:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSkillDefinition.g:610:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalSkillDefinition.g:617:3: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSkillDefinition.g:618:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalSkillDefinition.g:635:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalSkillDefinition.g:635:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalSkillDefinition.g:636:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalSkillDefinition.g:642:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSkillDefinition.g:648:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalSkillDefinition.g:649:2: (kw= 'true' | kw= 'false' )
            {
            // InternalSkillDefinition.g:649:2: (kw= 'true' | kw= 'false' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            else if ( (LA13_0==25) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSkillDefinition.g:650:3: kw= 'true'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:656:3: kw= 'false'
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
    // InternalSkillDefinition.g:665:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSkillDefinition.g:665:47: (iv_ruleEString= ruleEString EOF )
            // InternalSkillDefinition.g:666:2: iv_ruleEString= ruleEString EOF
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
    // InternalSkillDefinition.g:672:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSkillDefinition.g:678:2: (this_STRING_0= RULE_STRING )
            // InternalSkillDefinition.g:679:2: this_STRING_0= RULE_STRING
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
    // InternalSkillDefinition.g:689:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSkillDefinition.g:689:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSkillDefinition.g:690:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSkillDefinition.g:696:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSkillDefinition.g:702:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSkillDefinition.g:703:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSkillDefinition.g:703:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSkillDefinition.g:704:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSkillDefinition.g:704:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSkillDefinition.g:705:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_23); 

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
    // InternalSkillDefinition.g:722:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalSkillDefinition.g:722:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalSkillDefinition.g:723:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalSkillDefinition.g:729:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalSkillDefinition.g:735:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalSkillDefinition.g:736:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalSkillDefinition.g:736:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalSkillDefinition.g:737:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalSkillDefinition.g:737:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSkillDefinition.g:738:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSkillDefinition.g:744:3: (this_INT_1= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSkillDefinition.g:745:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_25); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,23,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_26); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalSkillDefinition.g:765:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=27 && LA19_0<=28)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSkillDefinition.g:766:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalSkillDefinition.g:766:4: (kw= 'E' | kw= 'e' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==27) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==28) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalSkillDefinition.g:767:5: kw= 'E'
                            {
                            kw=(Token)match(input,27,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSkillDefinition.g:773:5: kw= 'e'
                            {
                            kw=(Token)match(input,28,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSkillDefinition.g:779:4: (kw= '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==26) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalSkillDefinition.g:780:5: kw= '-'
                            {
                            kw=(Token)match(input,26,FOLLOW_23); 

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
    // InternalSkillDefinition.g:798:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalSkillDefinition.g:798:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalSkillDefinition.g:799:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
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
    // InternalSkillDefinition.g:805:1: ruleEnumerationElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:811:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) )
            // InternalSkillDefinition.g:812:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            {
            // InternalSkillDefinition.g:812:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            // InternalSkillDefinition.g:813:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )?
            {
            // InternalSkillDefinition.g:813:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSkillDefinition.g:814:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSkillDefinition.g:814:4: (lv_name_0_0= RULE_ID )
            // InternalSkillDefinition.g:815:5: lv_name_0_0= RULE_ID
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

            // InternalSkillDefinition.g:831:3: (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSkillDefinition.g:832:4: otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalSkillDefinition.g:836:4: ( (lv_value_2_0= ruleEInt ) )
                    // InternalSkillDefinition.g:837:5: (lv_value_2_0= ruleEInt )
                    {
                    // InternalSkillDefinition.g:837:5: (lv_value_2_0= ruleEInt )
                    // InternalSkillDefinition.g:838:6: lv_value_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEnumerationElementAccess().getValueEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

            // InternalSkillDefinition.g:856:3: (otherlv_3= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSkillDefinition.g:857:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_2); 

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
    // InternalSkillDefinition.g:866:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // InternalSkillDefinition.g:866:62: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // InternalSkillDefinition.g:867:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
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
    // InternalSkillDefinition.g:873:1: ruleAbstractAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_InlineEnumerationType_1 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:879:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) )
            // InternalSkillDefinition.g:880:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            {
            // InternalSkillDefinition.g:880:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=36 && LA22_0<=47)) ) {
                alt22=1;
            }
            else if ( (LA22_0==29) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSkillDefinition.g:881:3: this_PrimitiveType_0= rulePrimitiveType
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
                    // InternalSkillDefinition.g:890:3: this_InlineEnumerationType_1= ruleInlineEnumerationType
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
    // InternalSkillDefinition.g:902:1: entryRuleInlineEnumerationType returns [EObject current=null] : iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF ;
    public final EObject entryRuleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineEnumerationType = null;


        try {
            // InternalSkillDefinition.g:902:62: (iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF )
            // InternalSkillDefinition.g:903:2: iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF
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
    // InternalSkillDefinition.g:909:1: ruleInlineEnumerationType returns [EObject current=null] : (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_array_1_0 = null;

        EObject lv_enums_3_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:915:2: ( (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) )
            // InternalSkillDefinition.g:916:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            {
            // InternalSkillDefinition.g:916:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            // InternalSkillDefinition.g:917:3: otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0());
            		
            // InternalSkillDefinition.g:921:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSkillDefinition.g:922:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalSkillDefinition.g:922:4: (lv_array_1_0= ruleArrayType )
                    // InternalSkillDefinition.g:923:5: lv_array_1_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getArrayArrayTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
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

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSkillDefinition.g:944:3: ( (lv_enums_3_0= ruleEnumerationElement ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSkillDefinition.g:945:4: (lv_enums_3_0= ruleEnumerationElement )
            	    {
            	    // InternalSkillDefinition.g:945:4: (lv_enums_3_0= ruleEnumerationElement )
            	    // InternalSkillDefinition.g:946:5: lv_enums_3_0= ruleEnumerationElement
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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
    // InternalSkillDefinition.g:971:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalSkillDefinition.g:971:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalSkillDefinition.g:972:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalSkillDefinition.g:978:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:984:2: ( ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) )
            // InternalSkillDefinition.g:985:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            {
            // InternalSkillDefinition.g:985:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            // InternalSkillDefinition.g:986:3: () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']'
            {
            // InternalSkillDefinition.g:986:3: ()
            // InternalSkillDefinition.g:987:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSkillDefinition.g:997:3: ( (lv_length_2_0= ruleCardinality ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT||LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSkillDefinition.g:998:4: (lv_length_2_0= ruleCardinality )
                    {
                    // InternalSkillDefinition.g:998:4: (lv_length_2_0= ruleCardinality )
                    // InternalSkillDefinition.g:999:5: lv_length_2_0= ruleCardinality
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
    // InternalSkillDefinition.g:1024:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalSkillDefinition.g:1024:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalSkillDefinition.g:1025:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalSkillDefinition.g:1031:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSkillDefinition.g:1037:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalSkillDefinition.g:1038:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalSkillDefinition.g:1038:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            else if ( (LA26_0==32) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSkillDefinition.g:1039:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:1047:3: kw= '*'
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
    // InternalSkillDefinition.g:1056:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalSkillDefinition.g:1056:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalSkillDefinition.g:1057:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalSkillDefinition.g:1063:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeName_0_0 = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:1069:2: ( ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) )
            // InternalSkillDefinition.g:1070:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            {
            // InternalSkillDefinition.g:1070:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            // InternalSkillDefinition.g:1071:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )?
            {
            // InternalSkillDefinition.g:1071:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) )
            // InternalSkillDefinition.g:1072:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            {
            // InternalSkillDefinition.g:1072:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            // InternalSkillDefinition.g:1073:5: lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME
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

            // InternalSkillDefinition.g:1090:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSkillDefinition.g:1091:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalSkillDefinition.g:1091:4: (lv_array_1_0= ruleArrayType )
                    // InternalSkillDefinition.g:1092:5: lv_array_1_0= ruleArrayType
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
    // InternalSkillDefinition.g:1113:1: entryRuleAbstractValue returns [EObject current=null] : iv_ruleAbstractValue= ruleAbstractValue EOF ;
    public final EObject entryRuleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractValue = null;


        try {
            // InternalSkillDefinition.g:1113:54: (iv_ruleAbstractValue= ruleAbstractValue EOF )
            // InternalSkillDefinition.g:1114:2: iv_ruleAbstractValue= ruleAbstractValue EOF
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
    // InternalSkillDefinition.g:1120:1: ruleAbstractValue returns [EObject current=null] : (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) ;
    public final EObject ruleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValue_0 = null;

        EObject this_ArrayValue_1 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:1126:2: ( (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) )
            // InternalSkillDefinition.g:1127:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            {
            // InternalSkillDefinition.g:1127:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_INT)||(LA28_0>=23 && LA28_0<=26)) ) {
                alt28=1;
            }
            else if ( (LA28_0==30) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSkillDefinition.g:1128:3: this_SingleValue_0= ruleSingleValue
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
                    // InternalSkillDefinition.g:1137:3: this_ArrayValue_1= ruleArrayValue
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
    // InternalSkillDefinition.g:1149:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalSkillDefinition.g:1149:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalSkillDefinition.g:1150:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalSkillDefinition.g:1156:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:1162:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) )
            // InternalSkillDefinition.g:1163:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            {
            // InternalSkillDefinition.g:1163:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            // InternalSkillDefinition.g:1164:3: otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSkillDefinition.g:1168:3: ( (lv_values_1_0= ruleSingleValue ) )
            // InternalSkillDefinition.g:1169:4: (lv_values_1_0= ruleSingleValue )
            {
            // InternalSkillDefinition.g:1169:4: (lv_values_1_0= ruleSingleValue )
            // InternalSkillDefinition.g:1170:5: lv_values_1_0= ruleSingleValue
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

            // InternalSkillDefinition.g:1187:3: (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSkillDefinition.g:1188:4: otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_32); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSkillDefinition.g:1192:4: ( (lv_values_3_0= ruleSingleValue ) )
            	    // InternalSkillDefinition.g:1193:5: (lv_values_3_0= ruleSingleValue )
            	    {
            	    // InternalSkillDefinition.g:1193:5: (lv_values_3_0= ruleSingleValue )
            	    // InternalSkillDefinition.g:1194:6: lv_values_3_0= ruleSingleValue
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
            	    break loop29;
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
    // InternalSkillDefinition.g:1220:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalSkillDefinition.g:1220:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalSkillDefinition.g:1221:2: iv_ruleSingleValue= ruleSingleValue EOF
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
    // InternalSkillDefinition.g:1227:1: ruleSingleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:1233:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) )
            // InternalSkillDefinition.g:1234:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            {
            // InternalSkillDefinition.g:1234:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==RULE_INT) ) {
                    int LA30_2 = input.LA(3);

                    if ( (LA30_2==23) ) {
                        alt30=2;
                    }
                    else if ( (LA30_2==EOF||LA30_2==RULE_ID||LA30_2==13||LA30_2==21||LA30_2==31||LA30_2==33) ) {
                        alt30=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA30_1==23) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==23) ) {
                    alt30=2;
                }
                else if ( (LA30_2==EOF||LA30_2==RULE_ID||LA30_2==13||LA30_2==21||LA30_2==31||LA30_2==33) ) {
                    alt30=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt30=2;
                }
                break;
            case RULE_STRING:
                {
                alt30=3;
                }
                break;
            case 24:
            case 25:
                {
                alt30=4;
                }
                break;
            case RULE_ID:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalSkillDefinition.g:1235:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalSkillDefinition.g:1235:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalSkillDefinition.g:1236:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalSkillDefinition.g:1236:4: ()
                    // InternalSkillDefinition.g:1237:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getIntValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSkillDefinition.g:1243:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalSkillDefinition.g:1244:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalSkillDefinition.g:1244:5: (lv_value_1_0= ruleEInt )
                    // InternalSkillDefinition.g:1245:6: lv_value_1_0= ruleEInt
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
                    // InternalSkillDefinition.g:1264:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    {
                    // InternalSkillDefinition.g:1264:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    // InternalSkillDefinition.g:1265:4: () ( (lv_value_3_0= ruleEDouble ) )
                    {
                    // InternalSkillDefinition.g:1265:4: ()
                    // InternalSkillDefinition.g:1266:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSkillDefinition.g:1272:4: ( (lv_value_3_0= ruleEDouble ) )
                    // InternalSkillDefinition.g:1273:5: (lv_value_3_0= ruleEDouble )
                    {
                    // InternalSkillDefinition.g:1273:5: (lv_value_3_0= ruleEDouble )
                    // InternalSkillDefinition.g:1274:6: lv_value_3_0= ruleEDouble
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
                    // InternalSkillDefinition.g:1293:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    {
                    // InternalSkillDefinition.g:1293:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    // InternalSkillDefinition.g:1294:4: () ( (lv_value_5_0= ruleEString ) )
                    {
                    // InternalSkillDefinition.g:1294:4: ()
                    // InternalSkillDefinition.g:1295:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getStringValueAction_2_0(),
                    						current);
                    				

                    }

                    // InternalSkillDefinition.g:1301:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalSkillDefinition.g:1302:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalSkillDefinition.g:1302:5: (lv_value_5_0= ruleEString )
                    // InternalSkillDefinition.g:1303:6: lv_value_5_0= ruleEString
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
                    // InternalSkillDefinition.g:1322:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    {
                    // InternalSkillDefinition.g:1322:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    // InternalSkillDefinition.g:1323:4: () ( (lv_value_7_0= ruleEBoolean ) )
                    {
                    // InternalSkillDefinition.g:1323:4: ()
                    // InternalSkillDefinition.g:1324:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getBoolValueAction_3_0(),
                    						current);
                    				

                    }

                    // InternalSkillDefinition.g:1330:4: ( (lv_value_7_0= ruleEBoolean ) )
                    // InternalSkillDefinition.g:1331:5: (lv_value_7_0= ruleEBoolean )
                    {
                    // InternalSkillDefinition.g:1331:5: (lv_value_7_0= ruleEBoolean )
                    // InternalSkillDefinition.g:1332:6: lv_value_7_0= ruleEBoolean
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
                    // InternalSkillDefinition.g:1351:3: ( () ( ( ruleFQN ) ) )
                    {
                    // InternalSkillDefinition.g:1351:3: ( () ( ( ruleFQN ) ) )
                    // InternalSkillDefinition.g:1352:4: () ( ( ruleFQN ) )
                    {
                    // InternalSkillDefinition.g:1352:4: ()
                    // InternalSkillDefinition.g:1353:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0(),
                    						current);
                    				

                    }

                    // InternalSkillDefinition.g:1359:4: ( ( ruleFQN ) )
                    // InternalSkillDefinition.g:1360:5: ( ruleFQN )
                    {
                    // InternalSkillDefinition.g:1360:5: ( ruleFQN )
                    // InternalSkillDefinition.g:1361:6: ruleFQN
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


    // $ANTLR start "ruleSKILL_RESULT_TYPES"
    // InternalSkillDefinition.g:1380:1: ruleSKILL_RESULT_TYPES returns [Enumerator current=null] : ( (enumLiteral_0= 'ERROR' ) | (enumLiteral_1= 'SUCCESS' ) ) ;
    public final Enumerator ruleSKILL_RESULT_TYPES() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSkillDefinition.g:1386:2: ( ( (enumLiteral_0= 'ERROR' ) | (enumLiteral_1= 'SUCCESS' ) ) )
            // InternalSkillDefinition.g:1387:2: ( (enumLiteral_0= 'ERROR' ) | (enumLiteral_1= 'SUCCESS' ) )
            {
            // InternalSkillDefinition.g:1387:2: ( (enumLiteral_0= 'ERROR' ) | (enumLiteral_1= 'SUCCESS' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            else if ( (LA31_0==35) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalSkillDefinition.g:1388:3: (enumLiteral_0= 'ERROR' )
                    {
                    // InternalSkillDefinition.g:1388:3: (enumLiteral_0= 'ERROR' )
                    // InternalSkillDefinition.g:1389:4: enumLiteral_0= 'ERROR'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSKILL_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSKILL_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:1396:3: (enumLiteral_1= 'SUCCESS' )
                    {
                    // InternalSkillDefinition.g:1396:3: (enumLiteral_1= 'SUCCESS' )
                    // InternalSkillDefinition.g:1397:4: enumLiteral_1= 'SUCCESS'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getSKILL_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSKILL_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSKILL_RESULT_TYPES"


    // $ANTLR start "rulePRIMITIVE_TYPE_NAME"
    // InternalSkillDefinition.g:1407:1: rulePRIMITIVE_TYPE_NAME returns [Enumerator current=null] : ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) ;
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
            // InternalSkillDefinition.g:1413:2: ( ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) )
            // InternalSkillDefinition.g:1414:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            {
            // InternalSkillDefinition.g:1414:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            int alt32=12;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt32=1;
                }
                break;
            case 37:
                {
                alt32=2;
                }
                break;
            case 38:
                {
                alt32=3;
                }
                break;
            case 39:
                {
                alt32=4;
                }
                break;
            case 40:
                {
                alt32=5;
                }
                break;
            case 41:
                {
                alt32=6;
                }
                break;
            case 42:
                {
                alt32=7;
                }
                break;
            case 43:
                {
                alt32=8;
                }
                break;
            case 44:
                {
                alt32=9;
                }
                break;
            case 45:
                {
                alt32=10;
                }
                break;
            case 46:
                {
                alt32=11;
                }
                break;
            case 47:
                {
                alt32=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalSkillDefinition.g:1415:3: (enumLiteral_0= 'Int8' )
                    {
                    // InternalSkillDefinition.g:1415:3: (enumLiteral_0= 'Int8' )
                    // InternalSkillDefinition.g:1416:4: enumLiteral_0= 'Int8'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:1423:3: (enumLiteral_1= 'Int16' )
                    {
                    // InternalSkillDefinition.g:1423:3: (enumLiteral_1= 'Int16' )
                    // InternalSkillDefinition.g:1424:4: enumLiteral_1= 'Int16'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSkillDefinition.g:1431:3: (enumLiteral_2= 'Int32' )
                    {
                    // InternalSkillDefinition.g:1431:3: (enumLiteral_2= 'Int32' )
                    // InternalSkillDefinition.g:1432:4: enumLiteral_2= 'Int32'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSkillDefinition.g:1439:3: (enumLiteral_3= 'Int64' )
                    {
                    // InternalSkillDefinition.g:1439:3: (enumLiteral_3= 'Int64' )
                    // InternalSkillDefinition.g:1440:4: enumLiteral_3= 'Int64'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSkillDefinition.g:1447:3: (enumLiteral_4= 'UInt8' )
                    {
                    // InternalSkillDefinition.g:1447:3: (enumLiteral_4= 'UInt8' )
                    // InternalSkillDefinition.g:1448:4: enumLiteral_4= 'UInt8'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSkillDefinition.g:1455:3: (enumLiteral_5= 'UInt16' )
                    {
                    // InternalSkillDefinition.g:1455:3: (enumLiteral_5= 'UInt16' )
                    // InternalSkillDefinition.g:1456:4: enumLiteral_5= 'UInt16'
                    {
                    enumLiteral_5=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSkillDefinition.g:1463:3: (enumLiteral_6= 'UInt32' )
                    {
                    // InternalSkillDefinition.g:1463:3: (enumLiteral_6= 'UInt32' )
                    // InternalSkillDefinition.g:1464:4: enumLiteral_6= 'UInt32'
                    {
                    enumLiteral_6=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSkillDefinition.g:1471:3: (enumLiteral_7= 'UInt64' )
                    {
                    // InternalSkillDefinition.g:1471:3: (enumLiteral_7= 'UInt64' )
                    // InternalSkillDefinition.g:1472:4: enumLiteral_7= 'UInt64'
                    {
                    enumLiteral_7=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSkillDefinition.g:1479:3: (enumLiteral_8= 'Float' )
                    {
                    // InternalSkillDefinition.g:1479:3: (enumLiteral_8= 'Float' )
                    // InternalSkillDefinition.g:1480:4: enumLiteral_8= 'Float'
                    {
                    enumLiteral_8=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSkillDefinition.g:1487:3: (enumLiteral_9= 'Double' )
                    {
                    // InternalSkillDefinition.g:1487:3: (enumLiteral_9= 'Double' )
                    // InternalSkillDefinition.g:1488:4: enumLiteral_9= 'Double'
                    {
                    enumLiteral_9=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalSkillDefinition.g:1495:3: (enumLiteral_10= 'String' )
                    {
                    // InternalSkillDefinition.g:1495:3: (enumLiteral_10= 'String' )
                    // InternalSkillDefinition.g:1496:4: enumLiteral_10= 'String'
                    {
                    enumLiteral_10=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalSkillDefinition.g:1503:3: (enumLiteral_11= 'Boolean' )
                    {
                    // InternalSkillDefinition.g:1503:3: (enumLiteral_11= 'Boolean' )
                    // InternalSkillDefinition.g:1504:4: enumLiteral_11= 'Boolean'
                    {
                    enumLiteral_11=(Token)match(input,47,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000C00002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000FFF020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000047800070L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000180000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000007800070L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000280000000L});

}