package org.xtext.base.stateMachine.parser.antlr.internal;

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
import org.xtext.base.stateMachine.services.StateMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'{'", "'}'", "'.'", "'State'", "';'", "'StateTransition'", "'->'", "'public'", "'private'"
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
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalStateMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateMachine.g"; }



     	private StateMachineGrammarAccess grammarAccess;

        public InternalStateMachineParser(TokenStream input, StateMachineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";
       	}

       	@Override
       	protected StateMachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStateMachine"
    // InternalStateMachine.g:80:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalStateMachine.g:80:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalStateMachine.g:81:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStateMachine.g:87:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractMachineElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:93:2: ( (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractMachineElement ) )* otherlv_4= '}' ) )
            // InternalStateMachine.g:94:2: (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractMachineElement ) )* otherlv_4= '}' )
            {
            // InternalStateMachine.g:94:2: (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractMachineElement ) )* otherlv_4= '}' )
            // InternalStateMachine.g:95:3: otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractMachineElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStateMachineKeyword_0());
            		
            // InternalStateMachine.g:99:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:100:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:100:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:101:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStateMachine.g:121:3: ( (lv_elements_3_0= ruleAbstractMachineElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==17||(LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStateMachine.g:122:4: (lv_elements_3_0= ruleAbstractMachineElement )
            	    {
            	    // InternalStateMachine.g:122:4: (lv_elements_3_0= ruleAbstractMachineElement )
            	    // InternalStateMachine.g:123:5: lv_elements_3_0= ruleAbstractMachineElement
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getElementsAbstractMachineElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_3_0=ruleAbstractMachineElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.xtext.base.stateMachine.StateMachine.AbstractMachineElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleFQN"
    // InternalStateMachine.g:148:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalStateMachine.g:148:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalStateMachine.g:149:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalStateMachine.g:155:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalStateMachine.g:161:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalStateMachine.g:162:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalStateMachine.g:162:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalStateMachine.g:163:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalStateMachine.g:170:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStateMachine.g:171:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

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


    // $ANTLR start "entryRuleAbstractMachineElement"
    // InternalStateMachine.g:188:1: entryRuleAbstractMachineElement returns [EObject current=null] : iv_ruleAbstractMachineElement= ruleAbstractMachineElement EOF ;
    public final EObject entryRuleAbstractMachineElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMachineElement = null;


        try {
            // InternalStateMachine.g:188:63: (iv_ruleAbstractMachineElement= ruleAbstractMachineElement EOF )
            // InternalStateMachine.g:189:2: iv_ruleAbstractMachineElement= ruleAbstractMachineElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractMachineElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractMachineElement=ruleAbstractMachineElement();

            state._fsp--;

             current =iv_ruleAbstractMachineElement; 
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
    // $ANTLR end "entryRuleAbstractMachineElement"


    // $ANTLR start "ruleAbstractMachineElement"
    // InternalStateMachine.g:195:1: ruleAbstractMachineElement returns [EObject current=null] : (this_AbstractStateElement_0= ruleAbstractStateElement | this_StateTransition_1= ruleStateTransition ) ;
    public final EObject ruleAbstractMachineElement() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractStateElement_0 = null;

        EObject this_StateTransition_1 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:201:2: ( (this_AbstractStateElement_0= ruleAbstractStateElement | this_StateTransition_1= ruleStateTransition ) )
            // InternalStateMachine.g:202:2: (this_AbstractStateElement_0= ruleAbstractStateElement | this_StateTransition_1= ruleStateTransition )
            {
            // InternalStateMachine.g:202:2: (this_AbstractStateElement_0= ruleAbstractStateElement | this_StateTransition_1= ruleStateTransition )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==17||(LA3_0>=19 && LA3_0<=20)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalStateMachine.g:203:3: this_AbstractStateElement_0= ruleAbstractStateElement
                    {

                    			newCompositeNode(grammarAccess.getAbstractMachineElementAccess().getAbstractStateElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractStateElement_0=ruleAbstractStateElement();

                    state._fsp--;


                    			current = this_AbstractStateElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:212:3: this_StateTransition_1= ruleStateTransition
                    {

                    			newCompositeNode(grammarAccess.getAbstractMachineElementAccess().getStateTransitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StateTransition_1=ruleStateTransition();

                    state._fsp--;


                    			current = this_StateTransition_1;
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
    // $ANTLR end "ruleAbstractMachineElement"


    // $ANTLR start "entryRuleAbstractStateElement"
    // InternalStateMachine.g:224:1: entryRuleAbstractStateElement returns [EObject current=null] : iv_ruleAbstractStateElement= ruleAbstractStateElement EOF ;
    public final EObject entryRuleAbstractStateElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractStateElement = null;


        try {
            // InternalStateMachine.g:224:61: (iv_ruleAbstractStateElement= ruleAbstractStateElement EOF )
            // InternalStateMachine.g:225:2: iv_ruleAbstractStateElement= ruleAbstractStateElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractStateElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractStateElement=ruleAbstractStateElement();

            state._fsp--;

             current =iv_ruleAbstractStateElement; 
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
    // $ANTLR end "entryRuleAbstractStateElement"


    // $ANTLR start "ruleAbstractStateElement"
    // InternalStateMachine.g:231:1: ruleAbstractStateElement returns [EObject current=null] : this_State_0= ruleState ;
    public final EObject ruleAbstractStateElement() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:237:2: (this_State_0= ruleState )
            // InternalStateMachine.g:238:2: this_State_0= ruleState
            {

            		newCompositeNode(grammarAccess.getAbstractStateElementAccess().getStateParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_State_0=ruleState();

            state._fsp--;


            		current = this_State_0;
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
    // $ANTLR end "ruleAbstractStateElement"


    // $ANTLR start "entryRuleState"
    // InternalStateMachine.g:249:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachine.g:249:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachine.g:250:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateMachine.g:256:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStateMachine.g:262:2: ( (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // InternalStateMachine.g:263:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // InternalStateMachine.g:263:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? )
            // InternalStateMachine.g:264:3: otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalStateMachine.g:268:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:269:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:269:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:270:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStateMachine.g:286:3: (otherlv_2= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalStateMachine.g:287:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getStateAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStateTransition"
    // InternalStateMachine.g:296:1: entryRuleStateTransition returns [EObject current=null] : iv_ruleStateTransition= ruleStateTransition EOF ;
    public final EObject entryRuleStateTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateTransition = null;


        try {
            // InternalStateMachine.g:296:56: (iv_ruleStateTransition= ruleStateTransition EOF )
            // InternalStateMachine.g:297:2: iv_ruleStateTransition= ruleStateTransition EOF
            {
             newCompositeNode(grammarAccess.getStateTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateTransition=ruleStateTransition();

            state._fsp--;

             current =iv_ruleStateTransition; 
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
    // $ANTLR end "entryRuleStateTransition"


    // $ANTLR start "ruleStateTransition"
    // InternalStateMachine.g:303:1: ruleStateTransition returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityType ) )? otherlv_1= 'StateTransition' ( ( ruleFQN ) ) otherlv_3= '->' ( ( ruleFQN ) ) (otherlv_5= ';' )? ) ;
    public final EObject ruleStateTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:309:2: ( ( ( (lv_visibility_0_0= ruleVisibilityType ) )? otherlv_1= 'StateTransition' ( ( ruleFQN ) ) otherlv_3= '->' ( ( ruleFQN ) ) (otherlv_5= ';' )? ) )
            // InternalStateMachine.g:310:2: ( ( (lv_visibility_0_0= ruleVisibilityType ) )? otherlv_1= 'StateTransition' ( ( ruleFQN ) ) otherlv_3= '->' ( ( ruleFQN ) ) (otherlv_5= ';' )? )
            {
            // InternalStateMachine.g:310:2: ( ( (lv_visibility_0_0= ruleVisibilityType ) )? otherlv_1= 'StateTransition' ( ( ruleFQN ) ) otherlv_3= '->' ( ( ruleFQN ) ) (otherlv_5= ';' )? )
            // InternalStateMachine.g:311:3: ( (lv_visibility_0_0= ruleVisibilityType ) )? otherlv_1= 'StateTransition' ( ( ruleFQN ) ) otherlv_3= '->' ( ( ruleFQN ) ) (otherlv_5= ';' )?
            {
            // InternalStateMachine.g:311:3: ( (lv_visibility_0_0= ruleVisibilityType ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=19 && LA5_0<=20)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStateMachine.g:312:4: (lv_visibility_0_0= ruleVisibilityType )
                    {
                    // InternalStateMachine.g:312:4: (lv_visibility_0_0= ruleVisibilityType )
                    // InternalStateMachine.g:313:5: lv_visibility_0_0= ruleVisibilityType
                    {

                    					newCompositeNode(grammarAccess.getStateTransitionAccess().getVisibilityVisibilityTypeEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_visibility_0_0=ruleVisibilityType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStateTransitionRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.xtext.base.stateMachine.StateMachine.VisibilityType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateTransitionAccess().getStateTransitionKeyword_1());
            		
            // InternalStateMachine.g:334:3: ( ( ruleFQN ) )
            // InternalStateMachine.g:335:4: ( ruleFQN )
            {
            // InternalStateMachine.g:335:4: ( ruleFQN )
            // InternalStateMachine.g:336:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateTransitionAccess().getFromAbstractStateElementCrossReference_2_0());
            				
            pushFollow(FOLLOW_9);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getStateTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalStateMachine.g:354:3: ( ( ruleFQN ) )
            // InternalStateMachine.g:355:4: ( ruleFQN )
            {
            // InternalStateMachine.g:355:4: ( ruleFQN )
            // InternalStateMachine.g:356:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateTransitionAccess().getToAbstractStateElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:370:3: (otherlv_5= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStateMachine.g:371:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateTransitionAccess().getSemicolonKeyword_5());
                    			

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
    // $ANTLR end "ruleStateTransition"


    // $ANTLR start "ruleVisibilityType"
    // InternalStateMachine.g:380:1: ruleVisibilityType returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleVisibilityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalStateMachine.g:386:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalStateMachine.g:387:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalStateMachine.g:387:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalStateMachine.g:388:3: (enumLiteral_0= 'public' )
                    {
                    // InternalStateMachine.g:388:3: (enumLiteral_0= 'public' )
                    // InternalStateMachine.g:389:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityTypeAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityTypeAccess().getPUBLICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:396:3: (enumLiteral_1= 'private' )
                    {
                    // InternalStateMachine.g:396:3: (enumLiteral_1= 'private' )
                    // InternalStateMachine.g:397:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityTypeAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityTypeAccess().getPRIVATEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleVisibilityType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001AA000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});

}