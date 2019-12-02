package org.xtext.system.causeEffectChain.parser.antlr.internal;

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
import org.xtext.system.causeEffectChain.services.CauseEffectChainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCauseEffectChainParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CuaseEffectChainModel'", "'refinesActivityArch'", "'{'", "'}'", "'-'", "'.'", "'ActivityChain'", "'chainLinks'", "'->'", "'act.'", "'hnd.'", "'desiredMinResponse'", "';'", "'desiredMaxResponse'", "'sec'", "'ms'", "'us'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCauseEffectChainParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCauseEffectChainParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCauseEffectChainParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCauseEffectChain.g"; }



     	private CauseEffectChainGrammarAccess grammarAccess;

        public InternalCauseEffectChainParser(TokenStream input, CauseEffectChainGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CuaseEffectChainModel";
       	}

       	@Override
       	protected CauseEffectChainGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCuaseEffectChainModel"
    // InternalCauseEffectChain.g:80:1: entryRuleCuaseEffectChainModel returns [EObject current=null] : iv_ruleCuaseEffectChainModel= ruleCuaseEffectChainModel EOF ;
    public final EObject entryRuleCuaseEffectChainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCuaseEffectChainModel = null;


        try {
            // InternalCauseEffectChain.g:80:62: (iv_ruleCuaseEffectChainModel= ruleCuaseEffectChainModel EOF )
            // InternalCauseEffectChain.g:81:2: iv_ruleCuaseEffectChainModel= ruleCuaseEffectChainModel EOF
            {
             newCompositeNode(grammarAccess.getCuaseEffectChainModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCuaseEffectChainModel=ruleCuaseEffectChainModel();

            state._fsp--;

             current =iv_ruleCuaseEffectChainModel; 
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
    // $ANTLR end "entryRuleCuaseEffectChainModel"


    // $ANTLR start "ruleCuaseEffectChainModel"
    // InternalCauseEffectChain.g:87:1: ruleCuaseEffectChainModel returns [EObject current=null] : (otherlv_0= 'CuaseEffectChainModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'refinesActivityArch' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_chains_5_0= ruleActivityChain ) )* otherlv_6= '}' ) ;
    public final EObject ruleCuaseEffectChainModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_chains_5_0 = null;



        	enterRule();

        try {
            // InternalCauseEffectChain.g:93:2: ( (otherlv_0= 'CuaseEffectChainModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'refinesActivityArch' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_chains_5_0= ruleActivityChain ) )* otherlv_6= '}' ) )
            // InternalCauseEffectChain.g:94:2: (otherlv_0= 'CuaseEffectChainModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'refinesActivityArch' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_chains_5_0= ruleActivityChain ) )* otherlv_6= '}' )
            {
            // InternalCauseEffectChain.g:94:2: (otherlv_0= 'CuaseEffectChainModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'refinesActivityArch' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_chains_5_0= ruleActivityChain ) )* otherlv_6= '}' )
            // InternalCauseEffectChain.g:95:3: otherlv_0= 'CuaseEffectChainModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'refinesActivityArch' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_chains_5_0= ruleActivityChain ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCuaseEffectChainModelAccess().getCuaseEffectChainModelKeyword_0());
            		
            // InternalCauseEffectChain.g:99:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCauseEffectChain.g:100:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCauseEffectChain.g:100:4: (lv_name_1_0= RULE_ID )
            // InternalCauseEffectChain.g:101:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCuaseEffectChainModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCuaseEffectChainModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCuaseEffectChainModelAccess().getRefinesActivityArchKeyword_2());
            		
            // InternalCauseEffectChain.g:121:3: ( ( ruleFQN ) )
            // InternalCauseEffectChain.g:122:4: ( ruleFQN )
            {
            // InternalCauseEffectChain.g:122:4: ( ruleFQN )
            // InternalCauseEffectChain.g:123:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCuaseEffectChainModelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCuaseEffectChainModelAccess().getActArchActivityArchitectureModelCrossReference_3_0());
            				
            pushFollow(FOLLOW_5);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getCuaseEffectChainModelAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalCauseEffectChain.g:141:3: ( (lv_chains_5_0= ruleActivityChain ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCauseEffectChain.g:142:4: (lv_chains_5_0= ruleActivityChain )
            	    {
            	    // InternalCauseEffectChain.g:142:4: (lv_chains_5_0= ruleActivityChain )
            	    // InternalCauseEffectChain.g:143:5: lv_chains_5_0= ruleActivityChain
            	    {

            	    					newCompositeNode(grammarAccess.getCuaseEffectChainModelAccess().getChainsActivityChainParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_chains_5_0=ruleActivityChain();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCuaseEffectChainModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"chains",
            	    						lv_chains_5_0,
            	    						"org.xtext.system.causeEffectChain.CauseEffectChain.ActivityChain");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCuaseEffectChainModelAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCuaseEffectChainModel"


    // $ANTLR start "entryRuleEInt"
    // InternalCauseEffectChain.g:168:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalCauseEffectChain.g:168:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalCauseEffectChain.g:169:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalCauseEffectChain.g:175:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCauseEffectChain.g:181:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalCauseEffectChain.g:182:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalCauseEffectChain.g:182:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalCauseEffectChain.g:183:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalCauseEffectChain.g:183:3: (kw= '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCauseEffectChain.g:184:4: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_7); 

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


    // $ANTLR start "entryRuleFQN"
    // InternalCauseEffectChain.g:201:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCauseEffectChain.g:201:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalCauseEffectChain.g:202:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalCauseEffectChain.g:208:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCauseEffectChain.g:214:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCauseEffectChain.g:215:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCauseEffectChain.g:215:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCauseEffectChain.g:216:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalCauseEffectChain.g:223:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCauseEffectChain.g:224:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

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


    // $ANTLR start "entryRuleActivityChain"
    // InternalCauseEffectChain.g:241:1: entryRuleActivityChain returns [EObject current=null] : iv_ruleActivityChain= ruleActivityChain EOF ;
    public final EObject entryRuleActivityChain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityChain = null;


        try {
            // InternalCauseEffectChain.g:241:54: (iv_ruleActivityChain= ruleActivityChain EOF )
            // InternalCauseEffectChain.g:242:2: iv_ruleActivityChain= ruleActivityChain EOF
            {
             newCompositeNode(grammarAccess.getActivityChainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityChain=ruleActivityChain();

            state._fsp--;

             current =iv_ruleActivityChain; 
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
    // $ANTLR end "entryRuleActivityChain"


    // $ANTLR start "ruleActivityChain"
    // InternalCauseEffectChain.g:248:1: ruleActivityChain returns [EObject current=null] : ( () otherlv_1= 'ActivityChain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'chainLinks' otherlv_5= '{' ( (lv_chainLinks_6_0= ruleAbstractChainLink ) ) (otherlv_7= '->' ( (lv_chainLinks_8_0= ruleAbstractChainLink ) ) )* otherlv_9= '}' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) ;
    public final EObject ruleActivityChain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        EObject lv_chainLinks_6_0 = null;

        EObject lv_chainLinks_8_0 = null;

        EObject lv_desiredMinResponse_11_0 = null;

        EObject lv_desiredMaxResponse_12_0 = null;



        	enterRule();

        try {
            // InternalCauseEffectChain.g:254:2: ( ( () otherlv_1= 'ActivityChain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'chainLinks' otherlv_5= '{' ( (lv_chainLinks_6_0= ruleAbstractChainLink ) ) (otherlv_7= '->' ( (lv_chainLinks_8_0= ruleAbstractChainLink ) ) )* otherlv_9= '}' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) )
            // InternalCauseEffectChain.g:255:2: ( () otherlv_1= 'ActivityChain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'chainLinks' otherlv_5= '{' ( (lv_chainLinks_6_0= ruleAbstractChainLink ) ) (otherlv_7= '->' ( (lv_chainLinks_8_0= ruleAbstractChainLink ) ) )* otherlv_9= '}' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            {
            // InternalCauseEffectChain.g:255:2: ( () otherlv_1= 'ActivityChain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'chainLinks' otherlv_5= '{' ( (lv_chainLinks_6_0= ruleAbstractChainLink ) ) (otherlv_7= '->' ( (lv_chainLinks_8_0= ruleAbstractChainLink ) ) )* otherlv_9= '}' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            // InternalCauseEffectChain.g:256:3: () otherlv_1= 'ActivityChain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'chainLinks' otherlv_5= '{' ( (lv_chainLinks_6_0= ruleAbstractChainLink ) ) (otherlv_7= '->' ( (lv_chainLinks_8_0= ruleAbstractChainLink ) ) )* otherlv_9= '}' )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) ) ) )* ) ) ) otherlv_13= '}'
            {
            // InternalCauseEffectChain.g:256:3: ()
            // InternalCauseEffectChain.g:257:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityChainAccess().getActivityChainAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityChainAccess().getActivityChainKeyword_1());
            		
            // InternalCauseEffectChain.g:267:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCauseEffectChain.g:268:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCauseEffectChain.g:268:4: (lv_name_2_0= RULE_ID )
            // InternalCauseEffectChain.g:269:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getActivityChainAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityChainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getActivityChainAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCauseEffectChain.g:289:3: (otherlv_4= 'chainLinks' otherlv_5= '{' ( (lv_chainLinks_6_0= ruleAbstractChainLink ) ) (otherlv_7= '->' ( (lv_chainLinks_8_0= ruleAbstractChainLink ) ) )* otherlv_9= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCauseEffectChain.g:290:4: otherlv_4= 'chainLinks' otherlv_5= '{' ( (lv_chainLinks_6_0= ruleAbstractChainLink ) ) (otherlv_7= '->' ( (lv_chainLinks_8_0= ruleAbstractChainLink ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivityChainAccess().getChainLinksKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getActivityChainAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCauseEffectChain.g:298:4: ( (lv_chainLinks_6_0= ruleAbstractChainLink ) )
                    // InternalCauseEffectChain.g:299:5: (lv_chainLinks_6_0= ruleAbstractChainLink )
                    {
                    // InternalCauseEffectChain.g:299:5: (lv_chainLinks_6_0= ruleAbstractChainLink )
                    // InternalCauseEffectChain.g:300:6: lv_chainLinks_6_0= ruleAbstractChainLink
                    {

                    						newCompositeNode(grammarAccess.getActivityChainAccess().getChainLinksAbstractChainLinkParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_chainLinks_6_0=ruleAbstractChainLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityChainRule());
                    						}
                    						add(
                    							current,
                    							"chainLinks",
                    							lv_chainLinks_6_0,
                    							"org.xtext.system.causeEffectChain.CauseEffectChain.AbstractChainLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCauseEffectChain.g:317:4: (otherlv_7= '->' ( (lv_chainLinks_8_0= ruleAbstractChainLink ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCauseEffectChain.g:318:5: otherlv_7= '->' ( (lv_chainLinks_8_0= ruleAbstractChainLink ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getActivityChainAccess().getHyphenMinusGreaterThanSignKeyword_4_3_0());
                    	    				
                    	    // InternalCauseEffectChain.g:322:5: ( (lv_chainLinks_8_0= ruleAbstractChainLink ) )
                    	    // InternalCauseEffectChain.g:323:6: (lv_chainLinks_8_0= ruleAbstractChainLink )
                    	    {
                    	    // InternalCauseEffectChain.g:323:6: (lv_chainLinks_8_0= ruleAbstractChainLink )
                    	    // InternalCauseEffectChain.g:324:7: lv_chainLinks_8_0= ruleAbstractChainLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityChainAccess().getChainLinksAbstractChainLinkParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_chainLinks_8_0=ruleAbstractChainLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityChainRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"chainLinks",
                    	    								lv_chainLinks_8_0,
                    	    								"org.xtext.system.causeEffectChain.CauseEffectChain.AbstractChainLink");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getActivityChainAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCauseEffectChain.g:347:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) ) ) )* ) ) )
            // InternalCauseEffectChain.g:348:4: ( ( ( ({...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) ) ) )* ) )
            {
            // InternalCauseEffectChain.g:348:4: ( ( ( ({...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) ) ) )* ) )
            // InternalCauseEffectChain.g:349:5: ( ( ({...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getActivityChainAccess().getUnorderedGroup_5());
            				
            // InternalCauseEffectChain.g:352:5: ( ( ({...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) ) ) )* )
            // InternalCauseEffectChain.g:353:6: ( ({...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) ) ) )*
            {
            // InternalCauseEffectChain.g:353:6: ( ({...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( LA6_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 1) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCauseEffectChain.g:354:4: ({...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) ) )
            	    {
            	    // InternalCauseEffectChain.g:354:4: ({...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) ) )
            	    // InternalCauseEffectChain.g:355:5: {...}? => ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActivityChain", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalCauseEffectChain.g:355:110: ( ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) ) )
            	    // InternalCauseEffectChain.g:356:6: ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalCauseEffectChain.g:359:9: ({...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) ) )
            	    // InternalCauseEffectChain.g:359:10: {...}? => ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivityChain", "true");
            	    }
            	    // InternalCauseEffectChain.g:359:19: ( (lv_desiredMinResponse_11_0= ruleMinResponseTime ) )
            	    // InternalCauseEffectChain.g:359:20: (lv_desiredMinResponse_11_0= ruleMinResponseTime )
            	    {
            	    // InternalCauseEffectChain.g:359:20: (lv_desiredMinResponse_11_0= ruleMinResponseTime )
            	    // InternalCauseEffectChain.g:360:10: lv_desiredMinResponse_11_0= ruleMinResponseTime
            	    {

            	    										newCompositeNode(grammarAccess.getActivityChainAccess().getDesiredMinResponseMinResponseTimeParserRuleCall_5_0_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_desiredMinResponse_11_0=ruleMinResponseTime();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getActivityChainRule());
            	    										}
            	    										set(
            	    											current,
            	    											"desiredMinResponse",
            	    											lv_desiredMinResponse_11_0,
            	    											"org.xtext.system.causeEffectChain.CauseEffectChain.MinResponseTime");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityChainAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCauseEffectChain.g:382:4: ({...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) ) )
            	    {
            	    // InternalCauseEffectChain.g:382:4: ({...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) ) )
            	    // InternalCauseEffectChain.g:383:5: {...}? => ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActivityChain", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalCauseEffectChain.g:383:110: ( ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) ) )
            	    // InternalCauseEffectChain.g:384:6: ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActivityChainAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalCauseEffectChain.g:387:9: ({...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) ) )
            	    // InternalCauseEffectChain.g:387:10: {...}? => ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivityChain", "true");
            	    }
            	    // InternalCauseEffectChain.g:387:19: ( (lv_desiredMaxResponse_12_0= ruleMaxResponseTime ) )
            	    // InternalCauseEffectChain.g:387:20: (lv_desiredMaxResponse_12_0= ruleMaxResponseTime )
            	    {
            	    // InternalCauseEffectChain.g:387:20: (lv_desiredMaxResponse_12_0= ruleMaxResponseTime )
            	    // InternalCauseEffectChain.g:388:10: lv_desiredMaxResponse_12_0= ruleMaxResponseTime
            	    {

            	    										newCompositeNode(grammarAccess.getActivityChainAccess().getDesiredMaxResponseMaxResponseTimeParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_desiredMaxResponse_12_0=ruleMaxResponseTime();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getActivityChainRule());
            	    										}
            	    										set(
            	    											current,
            	    											"desiredMaxResponse",
            	    											lv_desiredMaxResponse_12_0,
            	    											"org.xtext.system.causeEffectChain.CauseEffectChain.MaxResponseTime");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityChainAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getActivityChainAccess().getUnorderedGroup_5());
            				

            }

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getActivityChainAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleActivityChain"


    // $ANTLR start "entryRuleAbstractChainLink"
    // InternalCauseEffectChain.g:425:1: entryRuleAbstractChainLink returns [EObject current=null] : iv_ruleAbstractChainLink= ruleAbstractChainLink EOF ;
    public final EObject entryRuleAbstractChainLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractChainLink = null;


        try {
            // InternalCauseEffectChain.g:425:58: (iv_ruleAbstractChainLink= ruleAbstractChainLink EOF )
            // InternalCauseEffectChain.g:426:2: iv_ruleAbstractChainLink= ruleAbstractChainLink EOF
            {
             newCompositeNode(grammarAccess.getAbstractChainLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractChainLink=ruleAbstractChainLink();

            state._fsp--;

             current =iv_ruleAbstractChainLink; 
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
    // $ANTLR end "entryRuleAbstractChainLink"


    // $ANTLR start "ruleAbstractChainLink"
    // InternalCauseEffectChain.g:432:1: ruleAbstractChainLink returns [EObject current=null] : (this_ActivityLink_0= ruleActivityLink | this_InputHandlerLink_1= ruleInputHandlerLink ) ;
    public final EObject ruleAbstractChainLink() throws RecognitionException {
        EObject current = null;

        EObject this_ActivityLink_0 = null;

        EObject this_InputHandlerLink_1 = null;



        	enterRule();

        try {
            // InternalCauseEffectChain.g:438:2: ( (this_ActivityLink_0= ruleActivityLink | this_InputHandlerLink_1= ruleInputHandlerLink ) )
            // InternalCauseEffectChain.g:439:2: (this_ActivityLink_0= ruleActivityLink | this_InputHandlerLink_1= ruleInputHandlerLink )
            {
            // InternalCauseEffectChain.g:439:2: (this_ActivityLink_0= ruleActivityLink | this_InputHandlerLink_1= ruleInputHandlerLink )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCauseEffectChain.g:440:3: this_ActivityLink_0= ruleActivityLink
                    {

                    			newCompositeNode(grammarAccess.getAbstractChainLinkAccess().getActivityLinkParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActivityLink_0=ruleActivityLink();

                    state._fsp--;


                    			current = this_ActivityLink_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCauseEffectChain.g:449:3: this_InputHandlerLink_1= ruleInputHandlerLink
                    {

                    			newCompositeNode(grammarAccess.getAbstractChainLinkAccess().getInputHandlerLinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputHandlerLink_1=ruleInputHandlerLink();

                    state._fsp--;


                    			current = this_InputHandlerLink_1;
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
    // $ANTLR end "ruleAbstractChainLink"


    // $ANTLR start "entryRuleActivityLink"
    // InternalCauseEffectChain.g:461:1: entryRuleActivityLink returns [EObject current=null] : iv_ruleActivityLink= ruleActivityLink EOF ;
    public final EObject entryRuleActivityLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityLink = null;


        try {
            // InternalCauseEffectChain.g:461:53: (iv_ruleActivityLink= ruleActivityLink EOF )
            // InternalCauseEffectChain.g:462:2: iv_ruleActivityLink= ruleActivityLink EOF
            {
             newCompositeNode(grammarAccess.getActivityLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityLink=ruleActivityLink();

            state._fsp--;

             current =iv_ruleActivityLink; 
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
    // $ANTLR end "entryRuleActivityLink"


    // $ANTLR start "ruleActivityLink"
    // InternalCauseEffectChain.g:468:1: ruleActivityLink returns [EObject current=null] : (otherlv_0= 'act.' ( ( ruleFQN ) ) ) ;
    public final EObject ruleActivityLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCauseEffectChain.g:474:2: ( (otherlv_0= 'act.' ( ( ruleFQN ) ) ) )
            // InternalCauseEffectChain.g:475:2: (otherlv_0= 'act.' ( ( ruleFQN ) ) )
            {
            // InternalCauseEffectChain.g:475:2: (otherlv_0= 'act.' ( ( ruleFQN ) ) )
            // InternalCauseEffectChain.g:476:3: otherlv_0= 'act.' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActivityLinkAccess().getActKeyword_0());
            		
            // InternalCauseEffectChain.g:480:3: ( ( ruleFQN ) )
            // InternalCauseEffectChain.g:481:4: ( ruleFQN )
            {
            // InternalCauseEffectChain.g:481:4: ( ruleFQN )
            // InternalCauseEffectChain.g:482:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActivityLinkAccess().getRefActivityNodeCrossReference_1_0());
            				
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
    // $ANTLR end "ruleActivityLink"


    // $ANTLR start "entryRuleInputHandlerLink"
    // InternalCauseEffectChain.g:500:1: entryRuleInputHandlerLink returns [EObject current=null] : iv_ruleInputHandlerLink= ruleInputHandlerLink EOF ;
    public final EObject entryRuleInputHandlerLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputHandlerLink = null;


        try {
            // InternalCauseEffectChain.g:500:57: (iv_ruleInputHandlerLink= ruleInputHandlerLink EOF )
            // InternalCauseEffectChain.g:501:2: iv_ruleInputHandlerLink= ruleInputHandlerLink EOF
            {
             newCompositeNode(grammarAccess.getInputHandlerLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputHandlerLink=ruleInputHandlerLink();

            state._fsp--;

             current =iv_ruleInputHandlerLink; 
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
    // $ANTLR end "entryRuleInputHandlerLink"


    // $ANTLR start "ruleInputHandlerLink"
    // InternalCauseEffectChain.g:507:1: ruleInputHandlerLink returns [EObject current=null] : (otherlv_0= 'hnd.' ( ( ruleFQN ) ) ) ;
    public final EObject ruleInputHandlerLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCauseEffectChain.g:513:2: ( (otherlv_0= 'hnd.' ( ( ruleFQN ) ) ) )
            // InternalCauseEffectChain.g:514:2: (otherlv_0= 'hnd.' ( ( ruleFQN ) ) )
            {
            // InternalCauseEffectChain.g:514:2: (otherlv_0= 'hnd.' ( ( ruleFQN ) ) )
            // InternalCauseEffectChain.g:515:3: otherlv_0= 'hnd.' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputHandlerLinkAccess().getHndKeyword_0());
            		
            // InternalCauseEffectChain.g:519:3: ( ( ruleFQN ) )
            // InternalCauseEffectChain.g:520:4: ( ruleFQN )
            {
            // InternalCauseEffectChain.g:520:4: ( ruleFQN )
            // InternalCauseEffectChain.g:521:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputHandlerLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInputHandlerLinkAccess().getRefInputHandlerNodeCrossReference_1_0());
            				
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
    // $ANTLR end "ruleInputHandlerLink"


    // $ANTLR start "entryRuleMinResponseTime"
    // InternalCauseEffectChain.g:539:1: entryRuleMinResponseTime returns [EObject current=null] : iv_ruleMinResponseTime= ruleMinResponseTime EOF ;
    public final EObject entryRuleMinResponseTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinResponseTime = null;


        try {
            // InternalCauseEffectChain.g:539:56: (iv_ruleMinResponseTime= ruleMinResponseTime EOF )
            // InternalCauseEffectChain.g:540:2: iv_ruleMinResponseTime= ruleMinResponseTime EOF
            {
             newCompositeNode(grammarAccess.getMinResponseTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinResponseTime=ruleMinResponseTime();

            state._fsp--;

             current =iv_ruleMinResponseTime; 
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
    // $ANTLR end "entryRuleMinResponseTime"


    // $ANTLR start "ruleMinResponseTime"
    // InternalCauseEffectChain.g:546:1: ruleMinResponseTime returns [EObject current=null] : (otherlv_0= 'desiredMinResponse' ( (lv_value_1_0= ruleEInt ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleMinResponseTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;



        	enterRule();

        try {
            // InternalCauseEffectChain.g:552:2: ( (otherlv_0= 'desiredMinResponse' ( (lv_value_1_0= ruleEInt ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) (otherlv_3= ';' )? ) )
            // InternalCauseEffectChain.g:553:2: (otherlv_0= 'desiredMinResponse' ( (lv_value_1_0= ruleEInt ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) (otherlv_3= ';' )? )
            {
            // InternalCauseEffectChain.g:553:2: (otherlv_0= 'desiredMinResponse' ( (lv_value_1_0= ruleEInt ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) (otherlv_3= ';' )? )
            // InternalCauseEffectChain.g:554:3: otherlv_0= 'desiredMinResponse' ( (lv_value_1_0= ruleEInt ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMinResponseTimeAccess().getDesiredMinResponseKeyword_0());
            		
            // InternalCauseEffectChain.g:558:3: ( (lv_value_1_0= ruleEInt ) )
            // InternalCauseEffectChain.g:559:4: (lv_value_1_0= ruleEInt )
            {
            // InternalCauseEffectChain.g:559:4: (lv_value_1_0= ruleEInt )
            // InternalCauseEffectChain.g:560:5: lv_value_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMinResponseTimeAccess().getValueEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_value_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinResponseTimeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.system.causeEffectChain.CauseEffectChain.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCauseEffectChain.g:577:3: ( (lv_unit_2_0= ruleTimeUnit ) )
            // InternalCauseEffectChain.g:578:4: (lv_unit_2_0= ruleTimeUnit )
            {
            // InternalCauseEffectChain.g:578:4: (lv_unit_2_0= ruleTimeUnit )
            // InternalCauseEffectChain.g:579:5: lv_unit_2_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getMinResponseTimeAccess().getUnitTimeUnitEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_unit_2_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinResponseTimeRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_2_0,
            						"org.xtext.system.causeEffectChain.CauseEffectChain.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCauseEffectChain.g:596:3: (otherlv_3= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCauseEffectChain.g:597:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getMinResponseTimeAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleMinResponseTime"


    // $ANTLR start "entryRuleMaxResponseTime"
    // InternalCauseEffectChain.g:606:1: entryRuleMaxResponseTime returns [EObject current=null] : iv_ruleMaxResponseTime= ruleMaxResponseTime EOF ;
    public final EObject entryRuleMaxResponseTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxResponseTime = null;


        try {
            // InternalCauseEffectChain.g:606:56: (iv_ruleMaxResponseTime= ruleMaxResponseTime EOF )
            // InternalCauseEffectChain.g:607:2: iv_ruleMaxResponseTime= ruleMaxResponseTime EOF
            {
             newCompositeNode(grammarAccess.getMaxResponseTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxResponseTime=ruleMaxResponseTime();

            state._fsp--;

             current =iv_ruleMaxResponseTime; 
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
    // $ANTLR end "entryRuleMaxResponseTime"


    // $ANTLR start "ruleMaxResponseTime"
    // InternalCauseEffectChain.g:613:1: ruleMaxResponseTime returns [EObject current=null] : (otherlv_0= 'desiredMaxResponse' ( (lv_value_1_0= ruleEInt ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleMaxResponseTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;



        	enterRule();

        try {
            // InternalCauseEffectChain.g:619:2: ( (otherlv_0= 'desiredMaxResponse' ( (lv_value_1_0= ruleEInt ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) (otherlv_3= ';' )? ) )
            // InternalCauseEffectChain.g:620:2: (otherlv_0= 'desiredMaxResponse' ( (lv_value_1_0= ruleEInt ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) (otherlv_3= ';' )? )
            {
            // InternalCauseEffectChain.g:620:2: (otherlv_0= 'desiredMaxResponse' ( (lv_value_1_0= ruleEInt ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) (otherlv_3= ';' )? )
            // InternalCauseEffectChain.g:621:3: otherlv_0= 'desiredMaxResponse' ( (lv_value_1_0= ruleEInt ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxResponseTimeAccess().getDesiredMaxResponseKeyword_0());
            		
            // InternalCauseEffectChain.g:625:3: ( (lv_value_1_0= ruleEInt ) )
            // InternalCauseEffectChain.g:626:4: (lv_value_1_0= ruleEInt )
            {
            // InternalCauseEffectChain.g:626:4: (lv_value_1_0= ruleEInt )
            // InternalCauseEffectChain.g:627:5: lv_value_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMaxResponseTimeAccess().getValueEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_value_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxResponseTimeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.system.causeEffectChain.CauseEffectChain.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCauseEffectChain.g:644:3: ( (lv_unit_2_0= ruleTimeUnit ) )
            // InternalCauseEffectChain.g:645:4: (lv_unit_2_0= ruleTimeUnit )
            {
            // InternalCauseEffectChain.g:645:4: (lv_unit_2_0= ruleTimeUnit )
            // InternalCauseEffectChain.g:646:5: lv_unit_2_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getMaxResponseTimeAccess().getUnitTimeUnitEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_unit_2_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxResponseTimeRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_2_0,
            						"org.xtext.system.causeEffectChain.CauseEffectChain.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCauseEffectChain.g:663:3: (otherlv_3= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCauseEffectChain.g:664:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getMaxResponseTimeAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleMaxResponseTime"


    // $ANTLR start "ruleTimeUnit"
    // InternalCauseEffectChain.g:673:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCauseEffectChain.g:679:2: ( ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) ) )
            // InternalCauseEffectChain.g:680:2: ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) )
            {
            // InternalCauseEffectChain.g:680:2: ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCauseEffectChain.g:681:3: (enumLiteral_0= 'sec' )
                    {
                    // InternalCauseEffectChain.g:681:3: (enumLiteral_0= 'sec' )
                    // InternalCauseEffectChain.g:682:4: enumLiteral_0= 'sec'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCauseEffectChain.g:689:3: (enumLiteral_1= 'ms' )
                    {
                    // InternalCauseEffectChain.g:689:3: (enumLiteral_1= 'ms' )
                    // InternalCauseEffectChain.g:690:4: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMSECEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMSECEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCauseEffectChain.g:697:3: (enumLiteral_2= 'us' )
                    {
                    // InternalCauseEffectChain.g:697:3: (enumLiteral_2= 'us' )
                    // InternalCauseEffectChain.g:698:4: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getUSECEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getUSECEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTimeUnit"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001444000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001404000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});

}
