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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOCU_COMMENT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_WS", "RULE_ANY_OTHER", "'SkillDefinitionRepository'", "'{'", "'}'", "'CoordinationModuleDefinition'", "'SkillDefinition'", "'in'", "'out'", "'results'", "'value'", "'='", "';'", "':'", "'.'", "'true'", "'false'", "'-'", "'E'", "'e'", "'InlineEnumeration'", "'['", "']'", "'*'", "','", "'ERROR'", "'SUCCESS'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'"
    };
    public static final int T__50=50;
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
    // InternalSkillDefinition.g:80:1: entryRuleSkillDefinitionModel returns [EObject current=null] : iv_ruleSkillDefinitionModel= ruleSkillDefinitionModel EOF ;
    public final EObject entryRuleSkillDefinitionModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillDefinitionModel = null;


        try {
            // InternalSkillDefinition.g:80:61: (iv_ruleSkillDefinitionModel= ruleSkillDefinitionModel EOF )
            // InternalSkillDefinition.g:81:2: iv_ruleSkillDefinitionModel= ruleSkillDefinitionModel EOF
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
    // InternalSkillDefinition.g:87:1: ruleSkillDefinitionModel returns [EObject current=null] : ( () ( (lv_repository_1_0= ruleSkillDefinitionRepository ) )? ) ;
    public final EObject ruleSkillDefinitionModel() throws RecognitionException {
        EObject current = null;

        EObject lv_repository_1_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:93:2: ( ( () ( (lv_repository_1_0= ruleSkillDefinitionRepository ) )? ) )
            // InternalSkillDefinition.g:94:2: ( () ( (lv_repository_1_0= ruleSkillDefinitionRepository ) )? )
            {
            // InternalSkillDefinition.g:94:2: ( () ( (lv_repository_1_0= ruleSkillDefinitionRepository ) )? )
            // InternalSkillDefinition.g:95:3: () ( (lv_repository_1_0= ruleSkillDefinitionRepository ) )?
            {
            // InternalSkillDefinition.g:95:3: ()
            // InternalSkillDefinition.g:96:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSkillDefinitionModelAccess().getSkillDefinitionModelAction_0(),
            					current);
            			

            }

            // InternalSkillDefinition.g:102:3: ( (lv_repository_1_0= ruleSkillDefinitionRepository ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSkillDefinition.g:103:4: (lv_repository_1_0= ruleSkillDefinitionRepository )
                    {
                    // InternalSkillDefinition.g:103:4: (lv_repository_1_0= ruleSkillDefinitionRepository )
                    // InternalSkillDefinition.g:104:5: lv_repository_1_0= ruleSkillDefinitionRepository
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
    // InternalSkillDefinition.g:125:1: entryRuleSkillDefinitionRepository returns [EObject current=null] : iv_ruleSkillDefinitionRepository= ruleSkillDefinitionRepository EOF ;
    public final EObject entryRuleSkillDefinitionRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillDefinitionRepository = null;


        try {
            // InternalSkillDefinition.g:125:66: (iv_ruleSkillDefinitionRepository= ruleSkillDefinitionRepository EOF )
            // InternalSkillDefinition.g:126:2: iv_ruleSkillDefinitionRepository= ruleSkillDefinitionRepository EOF
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
    // InternalSkillDefinition.g:132:1: ruleSkillDefinitionRepository returns [EObject current=null] : (otherlv_0= 'SkillDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleCoordinationModuleDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleSkillDefinitionRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_modules_3_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:138:2: ( (otherlv_0= 'SkillDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleCoordinationModuleDefinition ) )* otherlv_4= '}' ) )
            // InternalSkillDefinition.g:139:2: (otherlv_0= 'SkillDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleCoordinationModuleDefinition ) )* otherlv_4= '}' )
            {
            // InternalSkillDefinition.g:139:2: (otherlv_0= 'SkillDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleCoordinationModuleDefinition ) )* otherlv_4= '}' )
            // InternalSkillDefinition.g:140:3: otherlv_0= 'SkillDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleCoordinationModuleDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillDefinitionRepositoryAccess().getSkillDefinitionRepositoryKeyword_0());
            		
            // InternalSkillDefinition.g:144:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSkillDefinition.g:145:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSkillDefinition.g:145:4: (lv_name_1_0= RULE_ID )
            // InternalSkillDefinition.g:146:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSkillDefinitionRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSkillDefinition.g:166:3: ( (lv_modules_3_0= ruleCoordinationModuleDefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSkillDefinition.g:167:4: (lv_modules_3_0= ruleCoordinationModuleDefinition )
            	    {
            	    // InternalSkillDefinition.g:167:4: (lv_modules_3_0= ruleCoordinationModuleDefinition )
            	    // InternalSkillDefinition.g:168:5: lv_modules_3_0= ruleCoordinationModuleDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getSkillDefinitionRepositoryAccess().getModulesCoordinationModuleDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_modules_3_0=ruleCoordinationModuleDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSkillDefinitionRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modules",
            	    						lv_modules_3_0,
            	    						"org.xtext.service.skillDefinition.SkillDefinition.CoordinationModuleDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCoordinationModuleDefinition"
    // InternalSkillDefinition.g:193:1: entryRuleCoordinationModuleDefinition returns [EObject current=null] : iv_ruleCoordinationModuleDefinition= ruleCoordinationModuleDefinition EOF ;
    public final EObject entryRuleCoordinationModuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationModuleDefinition = null;


        try {
            // InternalSkillDefinition.g:193:69: (iv_ruleCoordinationModuleDefinition= ruleCoordinationModuleDefinition EOF )
            // InternalSkillDefinition.g:194:2: iv_ruleCoordinationModuleDefinition= ruleCoordinationModuleDefinition EOF
            {
             newCompositeNode(grammarAccess.getCoordinationModuleDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinationModuleDefinition=ruleCoordinationModuleDefinition();

            state._fsp--;

             current =iv_ruleCoordinationModuleDefinition; 
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
    // $ANTLR end "entryRuleCoordinationModuleDefinition"


    // $ANTLR start "ruleCoordinationModuleDefinition"
    // InternalSkillDefinition.g:200:1: ruleCoordinationModuleDefinition returns [EObject current=null] : (otherlv_0= 'CoordinationModuleDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_skills_3_0= ruleSkillDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleCoordinationModuleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_skills_3_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:206:2: ( (otherlv_0= 'CoordinationModuleDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_skills_3_0= ruleSkillDefinition ) )* otherlv_4= '}' ) )
            // InternalSkillDefinition.g:207:2: (otherlv_0= 'CoordinationModuleDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_skills_3_0= ruleSkillDefinition ) )* otherlv_4= '}' )
            {
            // InternalSkillDefinition.g:207:2: (otherlv_0= 'CoordinationModuleDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_skills_3_0= ruleSkillDefinition ) )* otherlv_4= '}' )
            // InternalSkillDefinition.g:208:3: otherlv_0= 'CoordinationModuleDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_skills_3_0= ruleSkillDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinationModuleDefinitionAccess().getCoordinationModuleDefinitionKeyword_0());
            		
            // InternalSkillDefinition.g:212:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSkillDefinition.g:213:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSkillDefinition.g:213:4: (lv_name_1_0= RULE_ID )
            // InternalSkillDefinition.g:214:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCoordinationModuleDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationModuleDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinationModuleDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSkillDefinition.g:234:3: ( (lv_skills_3_0= ruleSkillDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSkillDefinition.g:235:4: (lv_skills_3_0= ruleSkillDefinition )
            	    {
            	    // InternalSkillDefinition.g:235:4: (lv_skills_3_0= ruleSkillDefinition )
            	    // InternalSkillDefinition.g:236:5: lv_skills_3_0= ruleSkillDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getCoordinationModuleDefinitionAccess().getSkillsSkillDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_skills_3_0=ruleSkillDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoordinationModuleDefinitionRule());
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

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinationModuleDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCoordinationModuleDefinition"


    // $ANTLR start "entryRuleSkillDefinition"
    // InternalSkillDefinition.g:261:1: entryRuleSkillDefinition returns [EObject current=null] : iv_ruleSkillDefinition= ruleSkillDefinition EOF ;
    public final EObject entryRuleSkillDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillDefinition = null;


        try {
            // InternalSkillDefinition.g:261:56: (iv_ruleSkillDefinition= ruleSkillDefinition EOF )
            // InternalSkillDefinition.g:262:2: iv_ruleSkillDefinition= ruleSkillDefinition EOF
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
    // InternalSkillDefinition.g:268:1: ruleSkillDefinition returns [EObject current=null] : (otherlv_0= 'SkillDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleSkillResult ) )+ otherlv_14= '}' otherlv_15= '}' ) ;
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
            // InternalSkillDefinition.g:274:2: ( (otherlv_0= 'SkillDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleSkillResult ) )+ otherlv_14= '}' otherlv_15= '}' ) )
            // InternalSkillDefinition.g:275:2: (otherlv_0= 'SkillDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleSkillResult ) )+ otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalSkillDefinition.g:275:2: (otherlv_0= 'SkillDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleSkillResult ) )+ otherlv_14= '}' otherlv_15= '}' )
            // InternalSkillDefinition.g:276:3: otherlv_0= 'SkillDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleSkillResult ) )+ otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillDefinitionAccess().getSkillDefinitionKeyword_0());
            		
            // InternalSkillDefinition.g:280:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSkillDefinition.g:281:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSkillDefinition.g:281:4: (lv_name_1_0= RULE_ID )
            // InternalSkillDefinition.g:282:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSkillDefinition.g:302:3: (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSkillDefinition.g:303:4: otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSkillDefinitionAccess().getInKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSkillDefinition.g:311:4: ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_DOCU_COMMENT)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSkillDefinition.g:312:5: (lv_inAttribute_5_0= ruleAttributeDefinition )
                    	    {
                    	    // InternalSkillDefinition.g:312:5: (lv_inAttribute_5_0= ruleAttributeDefinition )
                    	    // InternalSkillDefinition.g:313:6: lv_inAttribute_5_0= ruleAttributeDefinition
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

                    otherlv_6=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalSkillDefinition.g:335:3: (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSkillDefinition.g:336:4: otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getSkillDefinitionAccess().getOutKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSkillDefinition.g:344:4: ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_DOCU_COMMENT)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSkillDefinition.g:345:5: (lv_outAttribute_9_0= ruleAttributeDefinition )
                    	    {
                    	    // InternalSkillDefinition.g:345:5: (lv_outAttribute_9_0= ruleAttributeDefinition )
                    	    // InternalSkillDefinition.g:346:6: lv_outAttribute_9_0= ruleAttributeDefinition
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

                    otherlv_10=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getSkillDefinitionAccess().getResultsKeyword_5());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSkillDefinition.g:376:3: ( (lv_results_13_0= ruleSkillResult ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=37 && LA8_0<=38)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSkillDefinition.g:377:4: (lv_results_13_0= ruleSkillResult )
            	    {
            	    // InternalSkillDefinition.g:377:4: (lv_results_13_0= ruleSkillResult )
            	    // InternalSkillDefinition.g:378:5: lv_results_13_0= ruleSkillResult
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

            otherlv_14=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_15=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSkillDefinition.g:407:1: entryRuleSkillResult returns [EObject current=null] : iv_ruleSkillResult= ruleSkillResult EOF ;
    public final EObject entryRuleSkillResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillResult = null;


        try {
            // InternalSkillDefinition.g:407:52: (iv_ruleSkillResult= ruleSkillResult EOF )
            // InternalSkillDefinition.g:408:2: iv_ruleSkillResult= ruleSkillResult EOF
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
    // InternalSkillDefinition.g:414:1: ruleSkillResult returns [EObject current=null] : ( ( (lv_result_0_0= ruleSKILL_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleSkillResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_result_0_0 = null;

        AntlrDatatypeRuleToken lv_resultValue_3_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:420:2: ( ( ( (lv_result_0_0= ruleSKILL_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? ) )
            // InternalSkillDefinition.g:421:2: ( ( (lv_result_0_0= ruleSKILL_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? )
            {
            // InternalSkillDefinition.g:421:2: ( ( (lv_result_0_0= ruleSKILL_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? )
            // InternalSkillDefinition.g:422:3: ( (lv_result_0_0= ruleSKILL_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )?
            {
            // InternalSkillDefinition.g:422:3: ( (lv_result_0_0= ruleSKILL_RESULT_TYPES ) )
            // InternalSkillDefinition.g:423:4: (lv_result_0_0= ruleSKILL_RESULT_TYPES )
            {
            // InternalSkillDefinition.g:423:4: (lv_result_0_0= ruleSKILL_RESULT_TYPES )
            // InternalSkillDefinition.g:424:5: lv_result_0_0= ruleSKILL_RESULT_TYPES
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

            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSkillResultAccess().getValueKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSkillResultAccess().getEqualsSignKeyword_2());
            		
            // InternalSkillDefinition.g:449:3: ( (lv_resultValue_3_0= ruleEString ) )
            // InternalSkillDefinition.g:450:4: (lv_resultValue_3_0= ruleEString )
            {
            // InternalSkillDefinition.g:450:4: (lv_resultValue_3_0= ruleEString )
            // InternalSkillDefinition.g:451:5: lv_resultValue_3_0= ruleEString
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

            // InternalSkillDefinition.g:468:3: (otherlv_4= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSkillDefinition.g:469:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_2); 

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
    // InternalSkillDefinition.g:478:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalSkillDefinition.g:478:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalSkillDefinition.g:479:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
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
    // InternalSkillDefinition.g:485:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? ) ;
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
            // InternalSkillDefinition.g:491:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? ) )
            // InternalSkillDefinition.g:492:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? )
            {
            // InternalSkillDefinition.g:492:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? )
            // InternalSkillDefinition.g:493:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )?
            {
            // InternalSkillDefinition.g:493:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DOCU_COMMENT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSkillDefinition.g:494:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalSkillDefinition.g:494:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalSkillDefinition.g:495:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_3); 

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

            // InternalSkillDefinition.g:511:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSkillDefinition.g:512:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSkillDefinition.g:512:4: (lv_name_1_0= RULE_ID )
            // InternalSkillDefinition.g:513:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2());
            		
            // InternalSkillDefinition.g:533:3: ( (lv_type_3_0= ruleAbstractAttributeType ) )
            // InternalSkillDefinition.g:534:4: (lv_type_3_0= ruleAbstractAttributeType )
            {
            // InternalSkillDefinition.g:534:4: (lv_type_3_0= ruleAbstractAttributeType )
            // InternalSkillDefinition.g:535:5: lv_type_3_0= ruleAbstractAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalSkillDefinition.g:552:3: (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSkillDefinition.g:553:4: otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalSkillDefinition.g:557:4: ( (lv_defaultvalue_5_0= ruleAbstractValue ) )
                    // InternalSkillDefinition.g:558:5: (lv_defaultvalue_5_0= ruleAbstractValue )
                    {
                    // InternalSkillDefinition.g:558:5: (lv_defaultvalue_5_0= ruleAbstractValue )
                    // InternalSkillDefinition.g:559:6: lv_defaultvalue_5_0= ruleAbstractValue
                    {

                    						newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

            // InternalSkillDefinition.g:577:3: (otherlv_6= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSkillDefinition.g:578:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFQN"
    // InternalSkillDefinition.g:587:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalSkillDefinition.g:587:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalSkillDefinition.g:588:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalSkillDefinition.g:594:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSkillDefinition.g:600:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSkillDefinition.g:601:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSkillDefinition.g:601:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSkillDefinition.g:602:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalSkillDefinition.g:609:3: (kw= '.' this_ID_2= RULE_ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSkillDefinition.g:610:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSkillDefinition.g:627:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalSkillDefinition.g:627:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalSkillDefinition.g:628:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalSkillDefinition.g:634:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSkillDefinition.g:640:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalSkillDefinition.g:641:2: (kw= 'true' | kw= 'false' )
            {
            // InternalSkillDefinition.g:641:2: (kw= 'true' | kw= 'false' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSkillDefinition.g:642:3: kw= 'true'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:648:3: kw= 'false'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

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
    // InternalSkillDefinition.g:657:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSkillDefinition.g:657:47: (iv_ruleEString= ruleEString EOF )
            // InternalSkillDefinition.g:658:2: iv_ruleEString= ruleEString EOF
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
    // InternalSkillDefinition.g:664:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSkillDefinition.g:670:2: (this_STRING_0= RULE_STRING )
            // InternalSkillDefinition.g:671:2: this_STRING_0= RULE_STRING
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
    // InternalSkillDefinition.g:681:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSkillDefinition.g:681:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSkillDefinition.g:682:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSkillDefinition.g:688:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSkillDefinition.g:694:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSkillDefinition.g:695:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSkillDefinition.g:695:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSkillDefinition.g:696:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSkillDefinition.g:696:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSkillDefinition.g:697:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_23); 

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
    // InternalSkillDefinition.g:714:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalSkillDefinition.g:714:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalSkillDefinition.g:715:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalSkillDefinition.g:721:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalSkillDefinition.g:727:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalSkillDefinition.g:728:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalSkillDefinition.g:728:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalSkillDefinition.g:729:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalSkillDefinition.g:729:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSkillDefinition.g:730:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSkillDefinition.g:736:3: (this_INT_1= RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSkillDefinition.g:737:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_25); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,26,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_26); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalSkillDefinition.g:757:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=30 && LA20_0<=31)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSkillDefinition.g:758:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalSkillDefinition.g:758:4: (kw= 'E' | kw= 'e' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==30) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==31) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalSkillDefinition.g:759:5: kw= 'E'
                            {
                            kw=(Token)match(input,30,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSkillDefinition.g:765:5: kw= 'e'
                            {
                            kw=(Token)match(input,31,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSkillDefinition.g:771:4: (kw= '-' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==29) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalSkillDefinition.g:772:5: kw= '-'
                            {
                            kw=(Token)match(input,29,FOLLOW_23); 

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
    // InternalSkillDefinition.g:790:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalSkillDefinition.g:790:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalSkillDefinition.g:791:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
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
    // InternalSkillDefinition.g:797:1: ruleEnumerationElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:803:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) )
            // InternalSkillDefinition.g:804:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            {
            // InternalSkillDefinition.g:804:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            // InternalSkillDefinition.g:805:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )?
            {
            // InternalSkillDefinition.g:805:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSkillDefinition.g:806:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSkillDefinition.g:806:4: (lv_name_0_0= RULE_ID )
            // InternalSkillDefinition.g:807:5: lv_name_0_0= RULE_ID
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

            // InternalSkillDefinition.g:823:3: (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSkillDefinition.g:824:4: otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalSkillDefinition.g:828:4: ( (lv_value_2_0= ruleEInt ) )
                    // InternalSkillDefinition.g:829:5: (lv_value_2_0= ruleEInt )
                    {
                    // InternalSkillDefinition.g:829:5: (lv_value_2_0= ruleEInt )
                    // InternalSkillDefinition.g:830:6: lv_value_2_0= ruleEInt
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

            // InternalSkillDefinition.g:848:3: (otherlv_3= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSkillDefinition.g:849:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

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
    // InternalSkillDefinition.g:858:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // InternalSkillDefinition.g:858:62: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // InternalSkillDefinition.g:859:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
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
    // InternalSkillDefinition.g:865:1: ruleAbstractAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_InlineEnumerationType_1 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:871:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) )
            // InternalSkillDefinition.g:872:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            {
            // InternalSkillDefinition.g:872:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=39 && LA23_0<=50)) ) {
                alt23=1;
            }
            else if ( (LA23_0==32) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalSkillDefinition.g:873:3: this_PrimitiveType_0= rulePrimitiveType
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
                    // InternalSkillDefinition.g:882:3: this_InlineEnumerationType_1= ruleInlineEnumerationType
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
    // InternalSkillDefinition.g:894:1: entryRuleInlineEnumerationType returns [EObject current=null] : iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF ;
    public final EObject entryRuleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineEnumerationType = null;


        try {
            // InternalSkillDefinition.g:894:62: (iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF )
            // InternalSkillDefinition.g:895:2: iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF
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
    // InternalSkillDefinition.g:901:1: ruleInlineEnumerationType returns [EObject current=null] : (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_array_1_0 = null;

        EObject lv_enums_3_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:907:2: ( (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) )
            // InternalSkillDefinition.g:908:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            {
            // InternalSkillDefinition.g:908:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            // InternalSkillDefinition.g:909:3: otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0());
            		
            // InternalSkillDefinition.g:913:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSkillDefinition.g:914:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalSkillDefinition.g:914:4: (lv_array_1_0= ruleArrayType )
                    // InternalSkillDefinition.g:915:5: lv_array_1_0= ruleArrayType
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

            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSkillDefinition.g:936:3: ( (lv_enums_3_0= ruleEnumerationElement ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSkillDefinition.g:937:4: (lv_enums_3_0= ruleEnumerationElement )
            	    {
            	    // InternalSkillDefinition.g:937:4: (lv_enums_3_0= ruleEnumerationElement )
            	    // InternalSkillDefinition.g:938:5: lv_enums_3_0= ruleEnumerationElement
            	    {

            	    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSkillDefinition.g:963:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalSkillDefinition.g:963:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalSkillDefinition.g:964:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalSkillDefinition.g:970:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:976:2: ( ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) )
            // InternalSkillDefinition.g:977:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            {
            // InternalSkillDefinition.g:977:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            // InternalSkillDefinition.g:978:3: () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']'
            {
            // InternalSkillDefinition.g:978:3: ()
            // InternalSkillDefinition.g:979:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSkillDefinition.g:989:3: ( (lv_length_2_0= ruleCardinality ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT||LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSkillDefinition.g:990:4: (lv_length_2_0= ruleCardinality )
                    {
                    // InternalSkillDefinition.g:990:4: (lv_length_2_0= ruleCardinality )
                    // InternalSkillDefinition.g:991:5: lv_length_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_31);
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

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalSkillDefinition.g:1016:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalSkillDefinition.g:1016:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalSkillDefinition.g:1017:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalSkillDefinition.g:1023:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSkillDefinition.g:1029:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalSkillDefinition.g:1030:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalSkillDefinition.g:1030:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT) ) {
                alt27=1;
            }
            else if ( (LA27_0==35) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalSkillDefinition.g:1031:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:1039:3: kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

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
    // InternalSkillDefinition.g:1048:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalSkillDefinition.g:1048:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalSkillDefinition.g:1049:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalSkillDefinition.g:1055:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeName_0_0 = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:1061:2: ( ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) )
            // InternalSkillDefinition.g:1062:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            {
            // InternalSkillDefinition.g:1062:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            // InternalSkillDefinition.g:1063:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )?
            {
            // InternalSkillDefinition.g:1063:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) )
            // InternalSkillDefinition.g:1064:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            {
            // InternalSkillDefinition.g:1064:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            // InternalSkillDefinition.g:1065:5: lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalSkillDefinition.g:1082:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSkillDefinition.g:1083:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalSkillDefinition.g:1083:4: (lv_array_1_0= ruleArrayType )
                    // InternalSkillDefinition.g:1084:5: lv_array_1_0= ruleArrayType
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
    // InternalSkillDefinition.g:1105:1: entryRuleAbstractValue returns [EObject current=null] : iv_ruleAbstractValue= ruleAbstractValue EOF ;
    public final EObject entryRuleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractValue = null;


        try {
            // InternalSkillDefinition.g:1105:54: (iv_ruleAbstractValue= ruleAbstractValue EOF )
            // InternalSkillDefinition.g:1106:2: iv_ruleAbstractValue= ruleAbstractValue EOF
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
    // InternalSkillDefinition.g:1112:1: ruleAbstractValue returns [EObject current=null] : (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) ;
    public final EObject ruleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValue_0 = null;

        EObject this_ArrayValue_1 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:1118:2: ( (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) )
            // InternalSkillDefinition.g:1119:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            {
            // InternalSkillDefinition.g:1119:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||(LA29_0>=RULE_STRING && LA29_0<=RULE_INT)||(LA29_0>=26 && LA29_0<=29)) ) {
                alt29=1;
            }
            else if ( (LA29_0==33) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalSkillDefinition.g:1120:3: this_SingleValue_0= ruleSingleValue
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
                    // InternalSkillDefinition.g:1129:3: this_ArrayValue_1= ruleArrayValue
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
    // InternalSkillDefinition.g:1141:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalSkillDefinition.g:1141:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalSkillDefinition.g:1142:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalSkillDefinition.g:1148:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:1154:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) )
            // InternalSkillDefinition.g:1155:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            {
            // InternalSkillDefinition.g:1155:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            // InternalSkillDefinition.g:1156:3: otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSkillDefinition.g:1160:3: ( (lv_values_1_0= ruleSingleValue ) )
            // InternalSkillDefinition.g:1161:4: (lv_values_1_0= ruleSingleValue )
            {
            // InternalSkillDefinition.g:1161:4: (lv_values_1_0= ruleSingleValue )
            // InternalSkillDefinition.g:1162:5: lv_values_1_0= ruleSingleValue
            {

            					newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalSkillDefinition.g:1179:3: (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==36) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSkillDefinition.g:1180:4: otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,36,FOLLOW_33); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSkillDefinition.g:1184:4: ( (lv_values_3_0= ruleSingleValue ) )
            	    // InternalSkillDefinition.g:1185:5: (lv_values_3_0= ruleSingleValue )
            	    {
            	    // InternalSkillDefinition.g:1185:5: (lv_values_3_0= ruleSingleValue )
            	    // InternalSkillDefinition.g:1186:6: lv_values_3_0= ruleSingleValue
            	    {

            	    						newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop30;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_2); 

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
    // InternalSkillDefinition.g:1212:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalSkillDefinition.g:1212:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalSkillDefinition.g:1213:2: iv_ruleSingleValue= ruleSingleValue EOF
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
    // InternalSkillDefinition.g:1219:1: ruleSingleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalSkillDefinition.g:1225:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) )
            // InternalSkillDefinition.g:1226:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            {
            // InternalSkillDefinition.g:1226:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==RULE_INT) ) {
                    int LA31_2 = input.LA(3);

                    if ( (LA31_2==EOF||(LA31_2>=RULE_ID && LA31_2<=RULE_DOCU_COMMENT)||LA31_2==16||LA31_2==24||LA31_2==34||LA31_2==36) ) {
                        alt31=1;
                    }
                    else if ( (LA31_2==26) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA31_1==26) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==EOF||(LA31_2>=RULE_ID && LA31_2<=RULE_DOCU_COMMENT)||LA31_2==16||LA31_2==24||LA31_2==34||LA31_2==36) ) {
                    alt31=1;
                }
                else if ( (LA31_2==26) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt31=2;
                }
                break;
            case RULE_STRING:
                {
                alt31=3;
                }
                break;
            case 27:
            case 28:
                {
                alt31=4;
                }
                break;
            case RULE_ID:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalSkillDefinition.g:1227:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalSkillDefinition.g:1227:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalSkillDefinition.g:1228:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalSkillDefinition.g:1228:4: ()
                    // InternalSkillDefinition.g:1229:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getIntValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSkillDefinition.g:1235:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalSkillDefinition.g:1236:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalSkillDefinition.g:1236:5: (lv_value_1_0= ruleEInt )
                    // InternalSkillDefinition.g:1237:6: lv_value_1_0= ruleEInt
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
                    // InternalSkillDefinition.g:1256:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    {
                    // InternalSkillDefinition.g:1256:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    // InternalSkillDefinition.g:1257:4: () ( (lv_value_3_0= ruleEDouble ) )
                    {
                    // InternalSkillDefinition.g:1257:4: ()
                    // InternalSkillDefinition.g:1258:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSkillDefinition.g:1264:4: ( (lv_value_3_0= ruleEDouble ) )
                    // InternalSkillDefinition.g:1265:5: (lv_value_3_0= ruleEDouble )
                    {
                    // InternalSkillDefinition.g:1265:5: (lv_value_3_0= ruleEDouble )
                    // InternalSkillDefinition.g:1266:6: lv_value_3_0= ruleEDouble
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
                    // InternalSkillDefinition.g:1285:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    {
                    // InternalSkillDefinition.g:1285:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    // InternalSkillDefinition.g:1286:4: () ( (lv_value_5_0= ruleEString ) )
                    {
                    // InternalSkillDefinition.g:1286:4: ()
                    // InternalSkillDefinition.g:1287:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getStringValueAction_2_0(),
                    						current);
                    				

                    }

                    // InternalSkillDefinition.g:1293:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalSkillDefinition.g:1294:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalSkillDefinition.g:1294:5: (lv_value_5_0= ruleEString )
                    // InternalSkillDefinition.g:1295:6: lv_value_5_0= ruleEString
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
                    // InternalSkillDefinition.g:1314:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    {
                    // InternalSkillDefinition.g:1314:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    // InternalSkillDefinition.g:1315:4: () ( (lv_value_7_0= ruleEBoolean ) )
                    {
                    // InternalSkillDefinition.g:1315:4: ()
                    // InternalSkillDefinition.g:1316:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getBoolValueAction_3_0(),
                    						current);
                    				

                    }

                    // InternalSkillDefinition.g:1322:4: ( (lv_value_7_0= ruleEBoolean ) )
                    // InternalSkillDefinition.g:1323:5: (lv_value_7_0= ruleEBoolean )
                    {
                    // InternalSkillDefinition.g:1323:5: (lv_value_7_0= ruleEBoolean )
                    // InternalSkillDefinition.g:1324:6: lv_value_7_0= ruleEBoolean
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
                    // InternalSkillDefinition.g:1343:3: ( () ( ( ruleFQN ) ) )
                    {
                    // InternalSkillDefinition.g:1343:3: ( () ( ( ruleFQN ) ) )
                    // InternalSkillDefinition.g:1344:4: () ( ( ruleFQN ) )
                    {
                    // InternalSkillDefinition.g:1344:4: ()
                    // InternalSkillDefinition.g:1345:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0(),
                    						current);
                    				

                    }

                    // InternalSkillDefinition.g:1351:4: ( ( ruleFQN ) )
                    // InternalSkillDefinition.g:1352:5: ( ruleFQN )
                    {
                    // InternalSkillDefinition.g:1352:5: ( ruleFQN )
                    // InternalSkillDefinition.g:1353:6: ruleFQN
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
    // InternalSkillDefinition.g:1372:1: ruleSKILL_RESULT_TYPES returns [Enumerator current=null] : ( (enumLiteral_0= 'ERROR' ) | (enumLiteral_1= 'SUCCESS' ) ) ;
    public final Enumerator ruleSKILL_RESULT_TYPES() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSkillDefinition.g:1378:2: ( ( (enumLiteral_0= 'ERROR' ) | (enumLiteral_1= 'SUCCESS' ) ) )
            // InternalSkillDefinition.g:1379:2: ( (enumLiteral_0= 'ERROR' ) | (enumLiteral_1= 'SUCCESS' ) )
            {
            // InternalSkillDefinition.g:1379:2: ( (enumLiteral_0= 'ERROR' ) | (enumLiteral_1= 'SUCCESS' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            else if ( (LA32_0==38) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalSkillDefinition.g:1380:3: (enumLiteral_0= 'ERROR' )
                    {
                    // InternalSkillDefinition.g:1380:3: (enumLiteral_0= 'ERROR' )
                    // InternalSkillDefinition.g:1381:4: enumLiteral_0= 'ERROR'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getSKILL_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSKILL_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:1388:3: (enumLiteral_1= 'SUCCESS' )
                    {
                    // InternalSkillDefinition.g:1388:3: (enumLiteral_1= 'SUCCESS' )
                    // InternalSkillDefinition.g:1389:4: enumLiteral_1= 'SUCCESS'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

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
    // InternalSkillDefinition.g:1399:1: rulePRIMITIVE_TYPE_NAME returns [Enumerator current=null] : ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) ;
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
            // InternalSkillDefinition.g:1405:2: ( ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) )
            // InternalSkillDefinition.g:1406:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            {
            // InternalSkillDefinition.g:1406:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            int alt33=12;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt33=1;
                }
                break;
            case 40:
                {
                alt33=2;
                }
                break;
            case 41:
                {
                alt33=3;
                }
                break;
            case 42:
                {
                alt33=4;
                }
                break;
            case 43:
                {
                alt33=5;
                }
                break;
            case 44:
                {
                alt33=6;
                }
                break;
            case 45:
                {
                alt33=7;
                }
                break;
            case 46:
                {
                alt33=8;
                }
                break;
            case 47:
                {
                alt33=9;
                }
                break;
            case 48:
                {
                alt33=10;
                }
                break;
            case 49:
                {
                alt33=11;
                }
                break;
            case 50:
                {
                alt33=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalSkillDefinition.g:1407:3: (enumLiteral_0= 'Int8' )
                    {
                    // InternalSkillDefinition.g:1407:3: (enumLiteral_0= 'Int8' )
                    // InternalSkillDefinition.g:1408:4: enumLiteral_0= 'Int8'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:1415:3: (enumLiteral_1= 'Int16' )
                    {
                    // InternalSkillDefinition.g:1415:3: (enumLiteral_1= 'Int16' )
                    // InternalSkillDefinition.g:1416:4: enumLiteral_1= 'Int16'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSkillDefinition.g:1423:3: (enumLiteral_2= 'Int32' )
                    {
                    // InternalSkillDefinition.g:1423:3: (enumLiteral_2= 'Int32' )
                    // InternalSkillDefinition.g:1424:4: enumLiteral_2= 'Int32'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSkillDefinition.g:1431:3: (enumLiteral_3= 'Int64' )
                    {
                    // InternalSkillDefinition.g:1431:3: (enumLiteral_3= 'Int64' )
                    // InternalSkillDefinition.g:1432:4: enumLiteral_3= 'Int64'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSkillDefinition.g:1439:3: (enumLiteral_4= 'UInt8' )
                    {
                    // InternalSkillDefinition.g:1439:3: (enumLiteral_4= 'UInt8' )
                    // InternalSkillDefinition.g:1440:4: enumLiteral_4= 'UInt8'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSkillDefinition.g:1447:3: (enumLiteral_5= 'UInt16' )
                    {
                    // InternalSkillDefinition.g:1447:3: (enumLiteral_5= 'UInt16' )
                    // InternalSkillDefinition.g:1448:4: enumLiteral_5= 'UInt16'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSkillDefinition.g:1455:3: (enumLiteral_6= 'UInt32' )
                    {
                    // InternalSkillDefinition.g:1455:3: (enumLiteral_6= 'UInt32' )
                    // InternalSkillDefinition.g:1456:4: enumLiteral_6= 'UInt32'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalSkillDefinition.g:1463:3: (enumLiteral_7= 'UInt64' )
                    {
                    // InternalSkillDefinition.g:1463:3: (enumLiteral_7= 'UInt64' )
                    // InternalSkillDefinition.g:1464:4: enumLiteral_7= 'UInt64'
                    {
                    enumLiteral_7=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalSkillDefinition.g:1471:3: (enumLiteral_8= 'Float' )
                    {
                    // InternalSkillDefinition.g:1471:3: (enumLiteral_8= 'Float' )
                    // InternalSkillDefinition.g:1472:4: enumLiteral_8= 'Float'
                    {
                    enumLiteral_8=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSkillDefinition.g:1479:3: (enumLiteral_9= 'Double' )
                    {
                    // InternalSkillDefinition.g:1479:3: (enumLiteral_9= 'Double' )
                    // InternalSkillDefinition.g:1480:4: enumLiteral_9= 'Double'
                    {
                    enumLiteral_9=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalSkillDefinition.g:1487:3: (enumLiteral_10= 'String' )
                    {
                    // InternalSkillDefinition.g:1487:3: (enumLiteral_10= 'String' )
                    // InternalSkillDefinition.g:1488:4: enumLiteral_10= 'String'
                    {
                    enumLiteral_10=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalSkillDefinition.g:1495:3: (enumLiteral_11= 'Boolean' )
                    {
                    // InternalSkillDefinition.g:1495:3: (enumLiteral_11= 'Boolean' )
                    // InternalSkillDefinition.g:1496:4: enumLiteral_11= 'Boolean'
                    {
                    enumLiteral_11=(Token)match(input,50,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000006000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0007FF8100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000023C0000D0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C00000080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000003C0000D0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001400000000L});

}