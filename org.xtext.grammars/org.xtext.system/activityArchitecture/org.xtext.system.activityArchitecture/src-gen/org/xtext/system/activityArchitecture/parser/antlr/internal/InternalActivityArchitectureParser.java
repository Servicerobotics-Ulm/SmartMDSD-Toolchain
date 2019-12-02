package org.xtext.system.activityArchitecture.parser.antlr.internal;

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
import org.xtext.system.activityArchitecture.services.ActivityArchitectureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivityArchitectureParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ActivityArchitectureModel'", "'{'", "'}'", "'-'", "'.'", "'E'", "'e'", "'DataFlow'", "'source'", "'destination'", "'InputHandlerNode'", "'input'", "'prescale'", "'TriggerInputNode'", "';'", "'ActivityNode'", "'inputs'", "'cpuAffinity'", "'activationSource'", "'executionTime'", "'scheduler'", "'RegisterInputNode'", "'Sporadic'", "'minActFreq'", "'Hz'", "'maxActFreq'", "'DataTriggered'", "'PeriodicTimer'", "'periodicActFreq'", "'type'", "'priority'", "'CPUCore'", "'coreNumber'", "'minTime'", "'maxTime'", "'DEFAULT'", "'FIFO'", "'RR'", "'sec'", "'ms'", "'us'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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


        public InternalActivityArchitectureParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivityArchitectureParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivityArchitectureParser.tokenNames; }
    public String getGrammarFileName() { return "InternalActivityArchitecture.g"; }



     	private ActivityArchitectureGrammarAccess grammarAccess;

        public InternalActivityArchitectureParser(TokenStream input, ActivityArchitectureGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ActivityArchitectureModel";
       	}

       	@Override
       	protected ActivityArchitectureGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleActivityArchitectureModel"
    // InternalActivityArchitecture.g:80:1: entryRuleActivityArchitectureModel returns [EObject current=null] : iv_ruleActivityArchitectureModel= ruleActivityArchitectureModel EOF ;
    public final EObject entryRuleActivityArchitectureModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityArchitectureModel = null;


        try {
            // InternalActivityArchitecture.g:80:66: (iv_ruleActivityArchitectureModel= ruleActivityArchitectureModel EOF )
            // InternalActivityArchitecture.g:81:2: iv_ruleActivityArchitectureModel= ruleActivityArchitectureModel EOF
            {
             newCompositeNode(grammarAccess.getActivityArchitectureModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityArchitectureModel=ruleActivityArchitectureModel();

            state._fsp--;

             current =iv_ruleActivityArchitectureModel; 
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
    // $ANTLR end "entryRuleActivityArchitectureModel"


    // $ANTLR start "ruleActivityArchitectureModel"
    // InternalActivityArchitecture.g:87:1: ruleActivityArchitectureModel returns [EObject current=null] : ( () otherlv_1= 'ActivityArchitectureModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleAbstractActivityArchitectureElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleActivityArchitectureModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalActivityArchitecture.g:93:2: ( ( () otherlv_1= 'ActivityArchitectureModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleAbstractActivityArchitectureElement ) )* otherlv_5= '}' ) )
            // InternalActivityArchitecture.g:94:2: ( () otherlv_1= 'ActivityArchitectureModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleAbstractActivityArchitectureElement ) )* otherlv_5= '}' )
            {
            // InternalActivityArchitecture.g:94:2: ( () otherlv_1= 'ActivityArchitectureModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleAbstractActivityArchitectureElement ) )* otherlv_5= '}' )
            // InternalActivityArchitecture.g:95:3: () otherlv_1= 'ActivityArchitectureModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleAbstractActivityArchitectureElement ) )* otherlv_5= '}'
            {
            // InternalActivityArchitecture.g:95:3: ()
            // InternalActivityArchitecture.g:96:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityArchitectureModelAccess().getActivityArchitectureModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityArchitectureModelAccess().getActivityArchitectureModelKeyword_1());
            		
            // InternalActivityArchitecture.g:106:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalActivityArchitecture.g:107:4: (lv_name_2_0= RULE_ID )
            {
            // InternalActivityArchitecture.g:107:4: (lv_name_2_0= RULE_ID )
            // InternalActivityArchitecture.g:108:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getActivityArchitectureModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityArchitectureModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getActivityArchitectureModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityArchitecture.g:128:3: ( (lv_elements_4_0= ruleAbstractActivityArchitectureElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||LA1_0==21||LA1_0==26||LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalActivityArchitecture.g:129:4: (lv_elements_4_0= ruleAbstractActivityArchitectureElement )
            	    {
            	    // InternalActivityArchitecture.g:129:4: (lv_elements_4_0= ruleAbstractActivityArchitectureElement )
            	    // InternalActivityArchitecture.g:130:5: lv_elements_4_0= ruleAbstractActivityArchitectureElement
            	    {

            	    					newCompositeNode(grammarAccess.getActivityArchitectureModelAccess().getElementsAbstractActivityArchitectureElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_4_0=ruleAbstractActivityArchitectureElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActivityArchitectureModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"org.xtext.system.activityArchitecture.ActivityArchitecture.AbstractActivityArchitectureElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getActivityArchitectureModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleActivityArchitectureModel"


    // $ANTLR start "entryRuleEDouble"
    // InternalActivityArchitecture.g:155:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalActivityArchitecture.g:155:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalActivityArchitecture.g:156:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalActivityArchitecture.g:162:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalActivityArchitecture.g:168:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalActivityArchitecture.g:169:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalActivityArchitecture.g:169:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalActivityArchitecture.g:170:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalActivityArchitecture.g:170:3: (kw= '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalActivityArchitecture.g:171:4: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalActivityArchitecture.g:177:3: (this_INT_1= RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalActivityArchitecture.g:178:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_7); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,15,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_9); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalActivityArchitecture.g:198:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalActivityArchitecture.g:199:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalActivityArchitecture.g:199:4: (kw= 'E' | kw= 'e' )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==16) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==17) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalActivityArchitecture.g:200:5: kw= 'E'
                            {
                            kw=(Token)match(input,16,FOLLOW_10); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalActivityArchitecture.g:206:5: kw= 'e'
                            {
                            kw=(Token)match(input,17,FOLLOW_10); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalActivityArchitecture.g:212:4: (kw= '-' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==14) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalActivityArchitecture.g:213:5: kw= '-'
                            {
                            kw=(Token)match(input,14,FOLLOW_8); 

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


    // $ANTLR start "entryRuleEInt"
    // InternalActivityArchitecture.g:231:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalActivityArchitecture.g:231:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalActivityArchitecture.g:232:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalActivityArchitecture.g:238:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalActivityArchitecture.g:244:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalActivityArchitecture.g:245:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalActivityArchitecture.g:245:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalActivityArchitecture.g:246:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalActivityArchitecture.g:246:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalActivityArchitecture.g:247:4: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_8); 

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
    // InternalActivityArchitecture.g:264:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalActivityArchitecture.g:264:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalActivityArchitecture.g:265:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalActivityArchitecture.g:271:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalActivityArchitecture.g:277:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalActivityArchitecture.g:278:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalActivityArchitecture.g:278:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalActivityArchitecture.g:279:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalActivityArchitecture.g:286:3: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalActivityArchitecture.g:287:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_11); 

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


    // $ANTLR start "entryRuleAbstractActivityArchitectureElement"
    // InternalActivityArchitecture.g:304:1: entryRuleAbstractActivityArchitectureElement returns [EObject current=null] : iv_ruleAbstractActivityArchitectureElement= ruleAbstractActivityArchitectureElement EOF ;
    public final EObject entryRuleAbstractActivityArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractActivityArchitectureElement = null;


        try {
            // InternalActivityArchitecture.g:304:76: (iv_ruleAbstractActivityArchitectureElement= ruleAbstractActivityArchitectureElement EOF )
            // InternalActivityArchitecture.g:305:2: iv_ruleAbstractActivityArchitectureElement= ruleAbstractActivityArchitectureElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractActivityArchitectureElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractActivityArchitectureElement=ruleAbstractActivityArchitectureElement();

            state._fsp--;

             current =iv_ruleAbstractActivityArchitectureElement; 
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
    // $ANTLR end "entryRuleAbstractActivityArchitectureElement"


    // $ANTLR start "ruleAbstractActivityArchitectureElement"
    // InternalActivityArchitecture.g:311:1: ruleAbstractActivityArchitectureElement returns [EObject current=null] : (this_CPUCore_0= ruleCPUCore | this_AbstractSourceNode_1= ruleAbstractSourceNode | this_DataFlow_2= ruleDataFlow ) ;
    public final EObject ruleAbstractActivityArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject this_CPUCore_0 = null;

        EObject this_AbstractSourceNode_1 = null;

        EObject this_DataFlow_2 = null;



        	enterRule();

        try {
            // InternalActivityArchitecture.g:317:2: ( (this_CPUCore_0= ruleCPUCore | this_AbstractSourceNode_1= ruleAbstractSourceNode | this_DataFlow_2= ruleDataFlow ) )
            // InternalActivityArchitecture.g:318:2: (this_CPUCore_0= ruleCPUCore | this_AbstractSourceNode_1= ruleAbstractSourceNode | this_DataFlow_2= ruleDataFlow )
            {
            // InternalActivityArchitecture.g:318:2: (this_CPUCore_0= ruleCPUCore | this_AbstractSourceNode_1= ruleAbstractSourceNode | this_DataFlow_2= ruleDataFlow )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt9=1;
                }
                break;
            case 21:
            case 26:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalActivityArchitecture.g:319:3: this_CPUCore_0= ruleCPUCore
                    {

                    			newCompositeNode(grammarAccess.getAbstractActivityArchitectureElementAccess().getCPUCoreParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CPUCore_0=ruleCPUCore();

                    state._fsp--;


                    			current = this_CPUCore_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:328:3: this_AbstractSourceNode_1= ruleAbstractSourceNode
                    {

                    			newCompositeNode(grammarAccess.getAbstractActivityArchitectureElementAccess().getAbstractSourceNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractSourceNode_1=ruleAbstractSourceNode();

                    state._fsp--;


                    			current = this_AbstractSourceNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalActivityArchitecture.g:337:3: this_DataFlow_2= ruleDataFlow
                    {

                    			newCompositeNode(grammarAccess.getAbstractActivityArchitectureElementAccess().getDataFlowParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataFlow_2=ruleDataFlow();

                    state._fsp--;


                    			current = this_DataFlow_2;
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
    // $ANTLR end "ruleAbstractActivityArchitectureElement"


    // $ANTLR start "entryRuleDataFlow"
    // InternalActivityArchitecture.g:349:1: entryRuleDataFlow returns [EObject current=null] : iv_ruleDataFlow= ruleDataFlow EOF ;
    public final EObject entryRuleDataFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFlow = null;


        try {
            // InternalActivityArchitecture.g:349:49: (iv_ruleDataFlow= ruleDataFlow EOF )
            // InternalActivityArchitecture.g:350:2: iv_ruleDataFlow= ruleDataFlow EOF
            {
             newCompositeNode(grammarAccess.getDataFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataFlow=ruleDataFlow();

            state._fsp--;

             current =iv_ruleDataFlow; 
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
    // $ANTLR end "entryRuleDataFlow"


    // $ANTLR start "ruleDataFlow"
    // InternalActivityArchitecture.g:356:1: ruleDataFlow returns [EObject current=null] : (otherlv_0= 'DataFlow' otherlv_1= '{' otherlv_2= 'source' ( ( ruleFQN ) ) otherlv_4= 'destination' ( ( ruleFQN ) ) otherlv_6= '}' ) ;
    public final EObject ruleDataFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalActivityArchitecture.g:362:2: ( (otherlv_0= 'DataFlow' otherlv_1= '{' otherlv_2= 'source' ( ( ruleFQN ) ) otherlv_4= 'destination' ( ( ruleFQN ) ) otherlv_6= '}' ) )
            // InternalActivityArchitecture.g:363:2: (otherlv_0= 'DataFlow' otherlv_1= '{' otherlv_2= 'source' ( ( ruleFQN ) ) otherlv_4= 'destination' ( ( ruleFQN ) ) otherlv_6= '}' )
            {
            // InternalActivityArchitecture.g:363:2: (otherlv_0= 'DataFlow' otherlv_1= '{' otherlv_2= 'source' ( ( ruleFQN ) ) otherlv_4= 'destination' ( ( ruleFQN ) ) otherlv_6= '}' )
            // InternalActivityArchitecture.g:364:3: otherlv_0= 'DataFlow' otherlv_1= '{' otherlv_2= 'source' ( ( ruleFQN ) ) otherlv_4= 'destination' ( ( ruleFQN ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataFlowAccess().getDataFlowKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDataFlowAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDataFlowAccess().getSourceKeyword_2());
            		
            // InternalActivityArchitecture.g:376:3: ( ( ruleFQN ) )
            // InternalActivityArchitecture.g:377:4: ( ruleFQN )
            {
            // InternalActivityArchitecture.g:377:4: ( ruleFQN )
            // InternalActivityArchitecture.g:378:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataFlowRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataFlowAccess().getSourceAbstractSourceNodeCrossReference_3_0());
            				
            pushFollow(FOLLOW_13);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDataFlowAccess().getDestinationKeyword_4());
            		
            // InternalActivityArchitecture.g:396:3: ( ( ruleFQN ) )
            // InternalActivityArchitecture.g:397:4: ( ruleFQN )
            {
            // InternalActivityArchitecture.g:397:4: ( ruleFQN )
            // InternalActivityArchitecture.g:398:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataFlowRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataFlowAccess().getDestinationAbstractInputNodeCrossReference_5_0());
            				
            pushFollow(FOLLOW_14);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDataFlowAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDataFlow"


    // $ANTLR start "entryRuleAbstractSourceNode"
    // InternalActivityArchitecture.g:420:1: entryRuleAbstractSourceNode returns [EObject current=null] : iv_ruleAbstractSourceNode= ruleAbstractSourceNode EOF ;
    public final EObject entryRuleAbstractSourceNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSourceNode = null;


        try {
            // InternalActivityArchitecture.g:420:59: (iv_ruleAbstractSourceNode= ruleAbstractSourceNode EOF )
            // InternalActivityArchitecture.g:421:2: iv_ruleAbstractSourceNode= ruleAbstractSourceNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractSourceNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractSourceNode=ruleAbstractSourceNode();

            state._fsp--;

             current =iv_ruleAbstractSourceNode; 
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
    // $ANTLR end "entryRuleAbstractSourceNode"


    // $ANTLR start "ruleAbstractSourceNode"
    // InternalActivityArchitecture.g:427:1: ruleAbstractSourceNode returns [EObject current=null] : (this_ActivityNode_0= ruleActivityNode | this_InputHandlerNode_1= ruleInputHandlerNode ) ;
    public final EObject ruleAbstractSourceNode() throws RecognitionException {
        EObject current = null;

        EObject this_ActivityNode_0 = null;

        EObject this_InputHandlerNode_1 = null;



        	enterRule();

        try {
            // InternalActivityArchitecture.g:433:2: ( (this_ActivityNode_0= ruleActivityNode | this_InputHandlerNode_1= ruleInputHandlerNode ) )
            // InternalActivityArchitecture.g:434:2: (this_ActivityNode_0= ruleActivityNode | this_InputHandlerNode_1= ruleInputHandlerNode )
            {
            // InternalActivityArchitecture.g:434:2: (this_ActivityNode_0= ruleActivityNode | this_InputHandlerNode_1= ruleInputHandlerNode )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalActivityArchitecture.g:435:3: this_ActivityNode_0= ruleActivityNode
                    {

                    			newCompositeNode(grammarAccess.getAbstractSourceNodeAccess().getActivityNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActivityNode_0=ruleActivityNode();

                    state._fsp--;


                    			current = this_ActivityNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:444:3: this_InputHandlerNode_1= ruleInputHandlerNode
                    {

                    			newCompositeNode(grammarAccess.getAbstractSourceNodeAccess().getInputHandlerNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputHandlerNode_1=ruleInputHandlerNode();

                    state._fsp--;


                    			current = this_InputHandlerNode_1;
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
    // $ANTLR end "ruleAbstractSourceNode"


    // $ANTLR start "entryRuleInputHandlerNode"
    // InternalActivityArchitecture.g:456:1: entryRuleInputHandlerNode returns [EObject current=null] : iv_ruleInputHandlerNode= ruleInputHandlerNode EOF ;
    public final EObject entryRuleInputHandlerNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputHandlerNode = null;


        try {
            // InternalActivityArchitecture.g:456:57: (iv_ruleInputHandlerNode= ruleInputHandlerNode EOF )
            // InternalActivityArchitecture.g:457:2: iv_ruleInputHandlerNode= ruleInputHandlerNode EOF
            {
             newCompositeNode(grammarAccess.getInputHandlerNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputHandlerNode=ruleInputHandlerNode();

            state._fsp--;

             current =iv_ruleInputHandlerNode; 
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
    // $ANTLR end "entryRuleInputHandlerNode"


    // $ANTLR start "ruleInputHandlerNode"
    // InternalActivityArchitecture.g:463:1: ruleInputHandlerNode returns [EObject current=null] : ( () otherlv_1= 'InputHandlerNode' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'input' ( (lv_inputNode_5_0= ruleHandlerTriggerInputNode ) ) )? (otherlv_6= 'prescale' ( (lv_prescale_7_0= ruleEInt ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleInputHandlerNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_inputNode_5_0 = null;

        AntlrDatatypeRuleToken lv_prescale_7_0 = null;



        	enterRule();

        try {
            // InternalActivityArchitecture.g:469:2: ( ( () otherlv_1= 'InputHandlerNode' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'input' ( (lv_inputNode_5_0= ruleHandlerTriggerInputNode ) ) )? (otherlv_6= 'prescale' ( (lv_prescale_7_0= ruleEInt ) ) )? otherlv_8= '}' ) )
            // InternalActivityArchitecture.g:470:2: ( () otherlv_1= 'InputHandlerNode' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'input' ( (lv_inputNode_5_0= ruleHandlerTriggerInputNode ) ) )? (otherlv_6= 'prescale' ( (lv_prescale_7_0= ruleEInt ) ) )? otherlv_8= '}' )
            {
            // InternalActivityArchitecture.g:470:2: ( () otherlv_1= 'InputHandlerNode' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'input' ( (lv_inputNode_5_0= ruleHandlerTriggerInputNode ) ) )? (otherlv_6= 'prescale' ( (lv_prescale_7_0= ruleEInt ) ) )? otherlv_8= '}' )
            // InternalActivityArchitecture.g:471:3: () otherlv_1= 'InputHandlerNode' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'input' ( (lv_inputNode_5_0= ruleHandlerTriggerInputNode ) ) )? (otherlv_6= 'prescale' ( (lv_prescale_7_0= ruleEInt ) ) )? otherlv_8= '}'
            {
            // InternalActivityArchitecture.g:471:3: ()
            // InternalActivityArchitecture.g:472:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputHandlerNodeAccess().getInputHandlerNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInputHandlerNodeAccess().getInputHandlerNodeKeyword_1());
            		
            // InternalActivityArchitecture.g:482:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalActivityArchitecture.g:483:4: (lv_name_2_0= RULE_ID )
            {
            // InternalActivityArchitecture.g:483:4: (lv_name_2_0= RULE_ID )
            // InternalActivityArchitecture.g:484:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInputHandlerNodeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputHandlerNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getInputHandlerNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityArchitecture.g:504:3: (otherlv_4= 'input' ( (lv_inputNode_5_0= ruleHandlerTriggerInputNode ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalActivityArchitecture.g:505:4: otherlv_4= 'input' ( (lv_inputNode_5_0= ruleHandlerTriggerInputNode ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getInputHandlerNodeAccess().getInputKeyword_4_0());
                    			
                    // InternalActivityArchitecture.g:509:4: ( (lv_inputNode_5_0= ruleHandlerTriggerInputNode ) )
                    // InternalActivityArchitecture.g:510:5: (lv_inputNode_5_0= ruleHandlerTriggerInputNode )
                    {
                    // InternalActivityArchitecture.g:510:5: (lv_inputNode_5_0= ruleHandlerTriggerInputNode )
                    // InternalActivityArchitecture.g:511:6: lv_inputNode_5_0= ruleHandlerTriggerInputNode
                    {

                    						newCompositeNode(grammarAccess.getInputHandlerNodeAccess().getInputNodeHandlerTriggerInputNodeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_inputNode_5_0=ruleHandlerTriggerInputNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputHandlerNodeRule());
                    						}
                    						set(
                    							current,
                    							"inputNode",
                    							lv_inputNode_5_0,
                    							"org.xtext.system.activityArchitecture.ActivityArchitecture.HandlerTriggerInputNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityArchitecture.g:529:3: (otherlv_6= 'prescale' ( (lv_prescale_7_0= ruleEInt ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalActivityArchitecture.g:530:4: otherlv_6= 'prescale' ( (lv_prescale_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getInputHandlerNodeAccess().getPrescaleKeyword_5_0());
                    			
                    // InternalActivityArchitecture.g:534:4: ( (lv_prescale_7_0= ruleEInt ) )
                    // InternalActivityArchitecture.g:535:5: (lv_prescale_7_0= ruleEInt )
                    {
                    // InternalActivityArchitecture.g:535:5: (lv_prescale_7_0= ruleEInt )
                    // InternalActivityArchitecture.g:536:6: lv_prescale_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getInputHandlerNodeAccess().getPrescaleEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_prescale_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputHandlerNodeRule());
                    						}
                    						set(
                    							current,
                    							"prescale",
                    							lv_prescale_7_0,
                    							"org.xtext.system.activityArchitecture.ActivityArchitecture.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getInputHandlerNodeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleInputHandlerNode"


    // $ANTLR start "entryRuleHandlerTriggerInputNode"
    // InternalActivityArchitecture.g:562:1: entryRuleHandlerTriggerInputNode returns [EObject current=null] : iv_ruleHandlerTriggerInputNode= ruleHandlerTriggerInputNode EOF ;
    public final EObject entryRuleHandlerTriggerInputNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerTriggerInputNode = null;


        try {
            // InternalActivityArchitecture.g:562:64: (iv_ruleHandlerTriggerInputNode= ruleHandlerTriggerInputNode EOF )
            // InternalActivityArchitecture.g:563:2: iv_ruleHandlerTriggerInputNode= ruleHandlerTriggerInputNode EOF
            {
             newCompositeNode(grammarAccess.getHandlerTriggerInputNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHandlerTriggerInputNode=ruleHandlerTriggerInputNode();

            state._fsp--;

             current =iv_ruleHandlerTriggerInputNode; 
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
    // $ANTLR end "entryRuleHandlerTriggerInputNode"


    // $ANTLR start "ruleHandlerTriggerInputNode"
    // InternalActivityArchitecture.g:569:1: ruleHandlerTriggerInputNode returns [EObject current=null] : ( () otherlv_1= 'TriggerInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleHandlerTriggerInputNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalActivityArchitecture.g:575:2: ( ( () otherlv_1= 'TriggerInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? ) )
            // InternalActivityArchitecture.g:576:2: ( () otherlv_1= 'TriggerInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? )
            {
            // InternalActivityArchitecture.g:576:2: ( () otherlv_1= 'TriggerInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? )
            // InternalActivityArchitecture.g:577:3: () otherlv_1= 'TriggerInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )?
            {
            // InternalActivityArchitecture.g:577:3: ()
            // InternalActivityArchitecture.g:578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHandlerTriggerInputNodeAccess().getTriggerInputNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHandlerTriggerInputNodeAccess().getTriggerInputNodeKeyword_1());
            		
            // InternalActivityArchitecture.g:588:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalActivityArchitecture.g:589:4: (lv_name_2_0= RULE_ID )
            {
            // InternalActivityArchitecture.g:589:4: (lv_name_2_0= RULE_ID )
            // InternalActivityArchitecture.g:590:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getHandlerTriggerInputNodeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHandlerTriggerInputNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalActivityArchitecture.g:606:3: (otherlv_3= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalActivityArchitecture.g:607:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getHandlerTriggerInputNodeAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleHandlerTriggerInputNode"


    // $ANTLR start "entryRuleActivityNode"
    // InternalActivityArchitecture.g:616:1: entryRuleActivityNode returns [EObject current=null] : iv_ruleActivityNode= ruleActivityNode EOF ;
    public final EObject entryRuleActivityNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityNode = null;


        try {
            // InternalActivityArchitecture.g:616:53: (iv_ruleActivityNode= ruleActivityNode EOF )
            // InternalActivityArchitecture.g:617:2: iv_ruleActivityNode= ruleActivityNode EOF
            {
             newCompositeNode(grammarAccess.getActivityNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityNode=ruleActivityNode();

            state._fsp--;

             current =iv_ruleActivityNode; 
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
    // $ANTLR end "entryRuleActivityNode"


    // $ANTLR start "ruleActivityNode"
    // InternalActivityArchitecture.g:623:1: ruleActivityNode returns [EObject current=null] : ( () otherlv_1= 'ActivityNode' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleAbstractInputNode ) )* otherlv_7= '}' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) ) ) )* ) ) ) otherlv_18= '}' ) ;
    public final EObject ruleActivityNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_inputs_6_0 = null;

        EObject lv_activationSource_13_0 = null;

        EObject lv_executionTime_15_0 = null;

        EObject lv_scheduler_17_0 = null;



        	enterRule();

        try {
            // InternalActivityArchitecture.g:629:2: ( ( () otherlv_1= 'ActivityNode' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleAbstractInputNode ) )* otherlv_7= '}' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) ) ) )* ) ) ) otherlv_18= '}' ) )
            // InternalActivityArchitecture.g:630:2: ( () otherlv_1= 'ActivityNode' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleAbstractInputNode ) )* otherlv_7= '}' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) ) ) )* ) ) ) otherlv_18= '}' )
            {
            // InternalActivityArchitecture.g:630:2: ( () otherlv_1= 'ActivityNode' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleAbstractInputNode ) )* otherlv_7= '}' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) ) ) )* ) ) ) otherlv_18= '}' )
            // InternalActivityArchitecture.g:631:3: () otherlv_1= 'ActivityNode' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleAbstractInputNode ) )* otherlv_7= '}' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) ) ) )* ) ) ) otherlv_18= '}'
            {
            // InternalActivityArchitecture.g:631:3: ()
            // InternalActivityArchitecture.g:632:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityNodeAccess().getActivityNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityNodeAccess().getActivityNodeKeyword_1());
            		
            // InternalActivityArchitecture.g:642:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalActivityArchitecture.g:643:4: (lv_name_2_0= RULE_ID )
            {
            // InternalActivityArchitecture.g:643:4: (lv_name_2_0= RULE_ID )
            // InternalActivityArchitecture.g:644:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getActivityNodeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityArchitecture.g:664:3: (otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleAbstractInputNode ) )* otherlv_7= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalActivityArchitecture.g:665:4: otherlv_4= 'inputs' otherlv_5= '{' ( (lv_inputs_6_0= ruleAbstractInputNode ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivityNodeAccess().getInputsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalActivityArchitecture.g:673:4: ( (lv_inputs_6_0= ruleAbstractInputNode ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==24||LA14_0==32) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalActivityArchitecture.g:674:5: (lv_inputs_6_0= ruleAbstractInputNode )
                    	    {
                    	    // InternalActivityArchitecture.g:674:5: (lv_inputs_6_0= ruleAbstractInputNode )
                    	    // InternalActivityArchitecture.g:675:6: lv_inputs_6_0= ruleAbstractInputNode
                    	    {

                    	    						newCompositeNode(grammarAccess.getActivityNodeAccess().getInputsAbstractInputNodeParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_inputs_6_0=ruleAbstractInputNode();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getActivityNodeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inputs",
                    	    							lv_inputs_6_0,
                    	    							"org.xtext.system.activityArchitecture.ActivityArchitecture.AbstractInputNode");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalActivityArchitecture.g:697:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) ) ) )* ) ) )
            // InternalActivityArchitecture.g:698:4: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) ) ) )* ) )
            {
            // InternalActivityArchitecture.g:698:4: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) ) ) )* ) )
            // InternalActivityArchitecture.g:699:5: ( ( ({...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
            				
            // InternalActivityArchitecture.g:702:5: ( ( ({...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) ) ) )* )
            // InternalActivityArchitecture.g:703:6: ( ({...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) ) ) )*
            {
            // InternalActivityArchitecture.g:703:6: ( ({...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) ) ) )*
            loop17:
            do {
                int alt17=5;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2) ) {
                    alt17=3;
                }
                else if ( LA17_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3) ) {
                    alt17=4;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalActivityArchitecture.g:704:4: ({...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) ) )
            	    {
            	    // InternalActivityArchitecture.g:704:4: ({...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) ) )
            	    // InternalActivityArchitecture.g:705:5: {...}? => ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActivityNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalActivityArchitecture.g:705:109: ( ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) ) )
            	    // InternalActivityArchitecture.g:706:6: ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalActivityArchitecture.g:709:9: ({...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? ) )
            	    // InternalActivityArchitecture.g:709:10: {...}? => (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivityNode", "true");
            	    }
            	    // InternalActivityArchitecture.g:709:19: (otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )? )
            	    // InternalActivityArchitecture.g:709:20: otherlv_9= 'cpuAffinity' ( ( ruleFQN ) ) (otherlv_11= ';' )?
            	    {
            	    otherlv_9=(Token)match(input,28,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getActivityNodeAccess().getCpuAffinityKeyword_5_0_0());
            	    								
            	    // InternalActivityArchitecture.g:713:9: ( ( ruleFQN ) )
            	    // InternalActivityArchitecture.g:714:10: ( ruleFQN )
            	    {
            	    // InternalActivityArchitecture.g:714:10: ( ruleFQN )
            	    // InternalActivityArchitecture.g:715:11: ruleFQN
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getActivityNodeRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getActivityNodeAccess().getAffinityCPUCoreCrossReference_5_0_1_0());
            	    										
            	    pushFollow(FOLLOW_22);
            	    ruleFQN();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalActivityArchitecture.g:729:9: (otherlv_11= ';' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==25) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalActivityArchitecture.g:730:10: otherlv_11= ';'
            	            {
            	            otherlv_11=(Token)match(input,25,FOLLOW_21); 

            	            										newLeafNode(otherlv_11, grammarAccess.getActivityNodeAccess().getSemicolonKeyword_5_0_2());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalActivityArchitecture.g:741:4: ({...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) ) )
            	    {
            	    // InternalActivityArchitecture.g:741:4: ({...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) ) )
            	    // InternalActivityArchitecture.g:742:5: {...}? => ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActivityNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalActivityArchitecture.g:742:109: ( ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) ) )
            	    // InternalActivityArchitecture.g:743:6: ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalActivityArchitecture.g:746:9: ({...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) ) )
            	    // InternalActivityArchitecture.g:746:10: {...}? => (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivityNode", "true");
            	    }
            	    // InternalActivityArchitecture.g:746:19: (otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) ) )
            	    // InternalActivityArchitecture.g:746:20: otherlv_12= 'activationSource' ( (lv_activationSource_13_0= ruleActivationSource ) )
            	    {
            	    otherlv_12=(Token)match(input,29,FOLLOW_23); 

            	    									newLeafNode(otherlv_12, grammarAccess.getActivityNodeAccess().getActivationSourceKeyword_5_1_0());
            	    								
            	    // InternalActivityArchitecture.g:750:9: ( (lv_activationSource_13_0= ruleActivationSource ) )
            	    // InternalActivityArchitecture.g:751:10: (lv_activationSource_13_0= ruleActivationSource )
            	    {
            	    // InternalActivityArchitecture.g:751:10: (lv_activationSource_13_0= ruleActivationSource )
            	    // InternalActivityArchitecture.g:752:11: lv_activationSource_13_0= ruleActivationSource
            	    {

            	    											newCompositeNode(grammarAccess.getActivityNodeAccess().getActivationSourceActivationSourceParserRuleCall_5_1_1_0());
            	    										
            	    pushFollow(FOLLOW_21);
            	    lv_activationSource_13_0=ruleActivationSource();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getActivityNodeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"activationSource",
            	    												lv_activationSource_13_0,
            	    												"org.xtext.system.activityArchitecture.ActivityArchitecture.ActivationSource");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalActivityArchitecture.g:775:4: ({...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) ) )
            	    {
            	    // InternalActivityArchitecture.g:775:4: ({...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) ) )
            	    // InternalActivityArchitecture.g:776:5: {...}? => ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleActivityNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalActivityArchitecture.g:776:109: ( ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) ) )
            	    // InternalActivityArchitecture.g:777:6: ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalActivityArchitecture.g:780:9: ({...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) ) )
            	    // InternalActivityArchitecture.g:780:10: {...}? => (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivityNode", "true");
            	    }
            	    // InternalActivityArchitecture.g:780:19: (otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) ) )
            	    // InternalActivityArchitecture.g:780:20: otherlv_14= 'executionTime' ( (lv_executionTime_15_0= ruleExecutionTime ) )
            	    {
            	    otherlv_14=(Token)match(input,30,FOLLOW_4); 

            	    									newLeafNode(otherlv_14, grammarAccess.getActivityNodeAccess().getExecutionTimeKeyword_5_2_0());
            	    								
            	    // InternalActivityArchitecture.g:784:9: ( (lv_executionTime_15_0= ruleExecutionTime ) )
            	    // InternalActivityArchitecture.g:785:10: (lv_executionTime_15_0= ruleExecutionTime )
            	    {
            	    // InternalActivityArchitecture.g:785:10: (lv_executionTime_15_0= ruleExecutionTime )
            	    // InternalActivityArchitecture.g:786:11: lv_executionTime_15_0= ruleExecutionTime
            	    {

            	    											newCompositeNode(grammarAccess.getActivityNodeAccess().getExecutionTimeExecutionTimeParserRuleCall_5_2_1_0());
            	    										
            	    pushFollow(FOLLOW_21);
            	    lv_executionTime_15_0=ruleExecutionTime();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getActivityNodeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"executionTime",
            	    												lv_executionTime_15_0,
            	    												"org.xtext.system.activityArchitecture.ActivityArchitecture.ExecutionTime");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalActivityArchitecture.g:809:4: ({...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) ) )
            	    {
            	    // InternalActivityArchitecture.g:809:4: ({...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) ) )
            	    // InternalActivityArchitecture.g:810:5: {...}? => ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleActivityNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalActivityArchitecture.g:810:109: ( ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) ) )
            	    // InternalActivityArchitecture.g:811:6: ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalActivityArchitecture.g:814:9: ({...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) ) )
            	    // InternalActivityArchitecture.g:814:10: {...}? => (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivityNode", "true");
            	    }
            	    // InternalActivityArchitecture.g:814:19: (otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) ) )
            	    // InternalActivityArchitecture.g:814:20: otherlv_16= 'scheduler' ( (lv_scheduler_17_0= ruleScheduler ) )
            	    {
            	    otherlv_16=(Token)match(input,31,FOLLOW_4); 

            	    									newLeafNode(otherlv_16, grammarAccess.getActivityNodeAccess().getSchedulerKeyword_5_3_0());
            	    								
            	    // InternalActivityArchitecture.g:818:9: ( (lv_scheduler_17_0= ruleScheduler ) )
            	    // InternalActivityArchitecture.g:819:10: (lv_scheduler_17_0= ruleScheduler )
            	    {
            	    // InternalActivityArchitecture.g:819:10: (lv_scheduler_17_0= ruleScheduler )
            	    // InternalActivityArchitecture.g:820:11: lv_scheduler_17_0= ruleScheduler
            	    {

            	    											newCompositeNode(grammarAccess.getActivityNodeAccess().getSchedulerSchedulerParserRuleCall_5_3_1_0());
            	    										
            	    pushFollow(FOLLOW_21);
            	    lv_scheduler_17_0=ruleScheduler();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getActivityNodeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"scheduler",
            	    												lv_scheduler_17_0,
            	    												"org.xtext.system.activityArchitecture.ActivityArchitecture.Scheduler");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
            				

            }

            otherlv_18=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleActivityNode"


    // $ANTLR start "entryRuleAbstractInputNode"
    // InternalActivityArchitecture.g:858:1: entryRuleAbstractInputNode returns [EObject current=null] : iv_ruleAbstractInputNode= ruleAbstractInputNode EOF ;
    public final EObject entryRuleAbstractInputNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractInputNode = null;


        try {
            // InternalActivityArchitecture.g:858:58: (iv_ruleAbstractInputNode= ruleAbstractInputNode EOF )
            // InternalActivityArchitecture.g:859:2: iv_ruleAbstractInputNode= ruleAbstractInputNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractInputNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractInputNode=ruleAbstractInputNode();

            state._fsp--;

             current =iv_ruleAbstractInputNode; 
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
    // $ANTLR end "entryRuleAbstractInputNode"


    // $ANTLR start "ruleAbstractInputNode"
    // InternalActivityArchitecture.g:865:1: ruleAbstractInputNode returns [EObject current=null] : (this_RegisterInputNode_0= ruleRegisterInputNode | this_TriggerInputNode_1= ruleTriggerInputNode ) ;
    public final EObject ruleAbstractInputNode() throws RecognitionException {
        EObject current = null;

        EObject this_RegisterInputNode_0 = null;

        EObject this_TriggerInputNode_1 = null;



        	enterRule();

        try {
            // InternalActivityArchitecture.g:871:2: ( (this_RegisterInputNode_0= ruleRegisterInputNode | this_TriggerInputNode_1= ruleTriggerInputNode ) )
            // InternalActivityArchitecture.g:872:2: (this_RegisterInputNode_0= ruleRegisterInputNode | this_TriggerInputNode_1= ruleTriggerInputNode )
            {
            // InternalActivityArchitecture.g:872:2: (this_RegisterInputNode_0= ruleRegisterInputNode | this_TriggerInputNode_1= ruleTriggerInputNode )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            else if ( (LA18_0==24) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalActivityArchitecture.g:873:3: this_RegisterInputNode_0= ruleRegisterInputNode
                    {

                    			newCompositeNode(grammarAccess.getAbstractInputNodeAccess().getRegisterInputNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegisterInputNode_0=ruleRegisterInputNode();

                    state._fsp--;


                    			current = this_RegisterInputNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:882:3: this_TriggerInputNode_1= ruleTriggerInputNode
                    {

                    			newCompositeNode(grammarAccess.getAbstractInputNodeAccess().getTriggerInputNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TriggerInputNode_1=ruleTriggerInputNode();

                    state._fsp--;


                    			current = this_TriggerInputNode_1;
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
    // $ANTLR end "ruleAbstractInputNode"


    // $ANTLR start "entryRuleRegisterInputNode"
    // InternalActivityArchitecture.g:894:1: entryRuleRegisterInputNode returns [EObject current=null] : iv_ruleRegisterInputNode= ruleRegisterInputNode EOF ;
    public final EObject entryRuleRegisterInputNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisterInputNode = null;


        try {
            // InternalActivityArchitecture.g:894:58: (iv_ruleRegisterInputNode= ruleRegisterInputNode EOF )
            // InternalActivityArchitecture.g:895:2: iv_ruleRegisterInputNode= ruleRegisterInputNode EOF
            {
             newCompositeNode(grammarAccess.getRegisterInputNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegisterInputNode=ruleRegisterInputNode();

            state._fsp--;

             current =iv_ruleRegisterInputNode; 
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
    // $ANTLR end "entryRuleRegisterInputNode"


    // $ANTLR start "ruleRegisterInputNode"
    // InternalActivityArchitecture.g:901:1: ruleRegisterInputNode returns [EObject current=null] : ( () otherlv_1= 'RegisterInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleRegisterInputNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalActivityArchitecture.g:907:2: ( ( () otherlv_1= 'RegisterInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? ) )
            // InternalActivityArchitecture.g:908:2: ( () otherlv_1= 'RegisterInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? )
            {
            // InternalActivityArchitecture.g:908:2: ( () otherlv_1= 'RegisterInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? )
            // InternalActivityArchitecture.g:909:3: () otherlv_1= 'RegisterInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )?
            {
            // InternalActivityArchitecture.g:909:3: ()
            // InternalActivityArchitecture.g:910:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRegisterInputNodeAccess().getRegisterInputNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRegisterInputNodeAccess().getRegisterInputNodeKeyword_1());
            		
            // InternalActivityArchitecture.g:920:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalActivityArchitecture.g:921:4: (lv_name_2_0= RULE_ID )
            {
            // InternalActivityArchitecture.g:921:4: (lv_name_2_0= RULE_ID )
            // InternalActivityArchitecture.g:922:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRegisterInputNodeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegisterInputNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalActivityArchitecture.g:938:3: (otherlv_3= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalActivityArchitecture.g:939:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getRegisterInputNodeAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleRegisterInputNode"


    // $ANTLR start "entryRuleTriggerInputNode"
    // InternalActivityArchitecture.g:948:1: entryRuleTriggerInputNode returns [EObject current=null] : iv_ruleTriggerInputNode= ruleTriggerInputNode EOF ;
    public final EObject entryRuleTriggerInputNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerInputNode = null;


        try {
            // InternalActivityArchitecture.g:948:57: (iv_ruleTriggerInputNode= ruleTriggerInputNode EOF )
            // InternalActivityArchitecture.g:949:2: iv_ruleTriggerInputNode= ruleTriggerInputNode EOF
            {
             newCompositeNode(grammarAccess.getTriggerInputNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggerInputNode=ruleTriggerInputNode();

            state._fsp--;

             current =iv_ruleTriggerInputNode; 
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
    // $ANTLR end "entryRuleTriggerInputNode"


    // $ANTLR start "ruleTriggerInputNode"
    // InternalActivityArchitecture.g:955:1: ruleTriggerInputNode returns [EObject current=null] : ( () otherlv_1= 'TriggerInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleTriggerInputNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalActivityArchitecture.g:961:2: ( ( () otherlv_1= 'TriggerInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? ) )
            // InternalActivityArchitecture.g:962:2: ( () otherlv_1= 'TriggerInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? )
            {
            // InternalActivityArchitecture.g:962:2: ( () otherlv_1= 'TriggerInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? )
            // InternalActivityArchitecture.g:963:3: () otherlv_1= 'TriggerInputNode' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )?
            {
            // InternalActivityArchitecture.g:963:3: ()
            // InternalActivityArchitecture.g:964:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriggerInputNodeAccess().getTriggerInputNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTriggerInputNodeAccess().getTriggerInputNodeKeyword_1());
            		
            // InternalActivityArchitecture.g:974:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalActivityArchitecture.g:975:4: (lv_name_2_0= RULE_ID )
            {
            // InternalActivityArchitecture.g:975:4: (lv_name_2_0= RULE_ID )
            // InternalActivityArchitecture.g:976:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTriggerInputNodeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerInputNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalActivityArchitecture.g:992:3: (otherlv_3= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalActivityArchitecture.g:993:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTriggerInputNodeAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleTriggerInputNode"


    // $ANTLR start "entryRuleActivationSource"
    // InternalActivityArchitecture.g:1002:1: entryRuleActivationSource returns [EObject current=null] : iv_ruleActivationSource= ruleActivationSource EOF ;
    public final EObject entryRuleActivationSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivationSource = null;


        try {
            // InternalActivityArchitecture.g:1002:57: (iv_ruleActivationSource= ruleActivationSource EOF )
            // InternalActivityArchitecture.g:1003:2: iv_ruleActivationSource= ruleActivationSource EOF
            {
             newCompositeNode(grammarAccess.getActivationSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivationSource=ruleActivationSource();

            state._fsp--;

             current =iv_ruleActivationSource; 
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
    // $ANTLR end "entryRuleActivationSource"


    // $ANTLR start "ruleActivationSource"
    // InternalActivityArchitecture.g:1009:1: ruleActivationSource returns [EObject current=null] : (this_Sporadic_0= ruleSporadic | this_DataTriggered_1= ruleDataTriggered | this_PeriodicTimer_2= rulePeriodicTimer ) ;
    public final EObject ruleActivationSource() throws RecognitionException {
        EObject current = null;

        EObject this_Sporadic_0 = null;

        EObject this_DataTriggered_1 = null;

        EObject this_PeriodicTimer_2 = null;



        	enterRule();

        try {
            // InternalActivityArchitecture.g:1015:2: ( (this_Sporadic_0= ruleSporadic | this_DataTriggered_1= ruleDataTriggered | this_PeriodicTimer_2= rulePeriodicTimer ) )
            // InternalActivityArchitecture.g:1016:2: (this_Sporadic_0= ruleSporadic | this_DataTriggered_1= ruleDataTriggered | this_PeriodicTimer_2= rulePeriodicTimer )
            {
            // InternalActivityArchitecture.g:1016:2: (this_Sporadic_0= ruleSporadic | this_DataTriggered_1= ruleDataTriggered | this_PeriodicTimer_2= rulePeriodicTimer )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt21=1;
                }
                break;
            case 37:
                {
                alt21=2;
                }
                break;
            case 38:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalActivityArchitecture.g:1017:3: this_Sporadic_0= ruleSporadic
                    {

                    			newCompositeNode(grammarAccess.getActivationSourceAccess().getSporadicParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sporadic_0=ruleSporadic();

                    state._fsp--;


                    			current = this_Sporadic_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:1026:3: this_DataTriggered_1= ruleDataTriggered
                    {

                    			newCompositeNode(grammarAccess.getActivationSourceAccess().getDataTriggeredParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataTriggered_1=ruleDataTriggered();

                    state._fsp--;


                    			current = this_DataTriggered_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalActivityArchitecture.g:1035:3: this_PeriodicTimer_2= rulePeriodicTimer
                    {

                    			newCompositeNode(grammarAccess.getActivationSourceAccess().getPeriodicTimerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PeriodicTimer_2=rulePeriodicTimer();

                    state._fsp--;


                    			current = this_PeriodicTimer_2;
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
    // $ANTLR end "ruleActivationSource"


    // $ANTLR start "entryRuleSporadic"
    // InternalActivityArchitecture.g:1047:1: entryRuleSporadic returns [EObject current=null] : iv_ruleSporadic= ruleSporadic EOF ;
    public final EObject entryRuleSporadic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSporadic = null;


        try {
            // InternalActivityArchitecture.g:1047:49: (iv_ruleSporadic= ruleSporadic EOF )
            // InternalActivityArchitecture.g:1048:2: iv_ruleSporadic= ruleSporadic EOF
            {
             newCompositeNode(grammarAccess.getSporadicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSporadic=ruleSporadic();

            state._fsp--;

             current =iv_ruleSporadic; 
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
    // $ANTLR end "entryRuleSporadic"


    // $ANTLR start "ruleSporadic"
    // InternalActivityArchitecture.g:1054:1: ruleSporadic returns [EObject current=null] : ( () otherlv_1= 'Sporadic' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) ) ) )* ) ) ) otherlv_12= '}' ) ;
    public final EObject ruleSporadic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_minActFreq_5_0 = null;

        AntlrDatatypeRuleToken lv_maxActFreq_9_0 = null;



        	enterRule();

        try {
            // InternalActivityArchitecture.g:1060:2: ( ( () otherlv_1= 'Sporadic' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) ) ) )* ) ) ) otherlv_12= '}' ) )
            // InternalActivityArchitecture.g:1061:2: ( () otherlv_1= 'Sporadic' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) ) ) )* ) ) ) otherlv_12= '}' )
            {
            // InternalActivityArchitecture.g:1061:2: ( () otherlv_1= 'Sporadic' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) ) ) )* ) ) ) otherlv_12= '}' )
            // InternalActivityArchitecture.g:1062:3: () otherlv_1= 'Sporadic' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) ) ) )* ) ) ) otherlv_12= '}'
            {
            // InternalActivityArchitecture.g:1062:3: ()
            // InternalActivityArchitecture.g:1063:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSporadicAccess().getSporadicAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSporadicAccess().getSporadicKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSporadicAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalActivityArchitecture.g:1077:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) ) ) )* ) ) )
            // InternalActivityArchitecture.g:1078:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) ) ) )* ) )
            {
            // InternalActivityArchitecture.g:1078:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) ) ) )* ) )
            // InternalActivityArchitecture.g:1079:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSporadicAccess().getUnorderedGroup_3());
            				
            // InternalActivityArchitecture.g:1082:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) ) ) )* )
            // InternalActivityArchitecture.g:1083:6: ( ({...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) ) ) )*
            {
            // InternalActivityArchitecture.g:1083:6: ( ({...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) ) ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 1) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalActivityArchitecture.g:1084:4: ({...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) ) )
            	    {
            	    // InternalActivityArchitecture.g:1084:4: ({...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) ) )
            	    // InternalActivityArchitecture.g:1085:5: {...}? => ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSporadic", "getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalActivityArchitecture.g:1085:105: ( ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) ) )
            	    // InternalActivityArchitecture.g:1086:6: ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalActivityArchitecture.g:1089:9: ({...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? ) )
            	    // InternalActivityArchitecture.g:1089:10: {...}? => (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSporadic", "true");
            	    }
            	    // InternalActivityArchitecture.g:1089:19: (otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )? )
            	    // InternalActivityArchitecture.g:1089:20: otherlv_4= 'minActFreq' ( (lv_minActFreq_5_0= ruleEDouble ) ) otherlv_6= 'Hz' (otherlv_7= ';' )?
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_25); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSporadicAccess().getMinActFreqKeyword_3_0_0());
            	    								
            	    // InternalActivityArchitecture.g:1093:9: ( (lv_minActFreq_5_0= ruleEDouble ) )
            	    // InternalActivityArchitecture.g:1094:10: (lv_minActFreq_5_0= ruleEDouble )
            	    {
            	    // InternalActivityArchitecture.g:1094:10: (lv_minActFreq_5_0= ruleEDouble )
            	    // InternalActivityArchitecture.g:1095:11: lv_minActFreq_5_0= ruleEDouble
            	    {

            	    											newCompositeNode(grammarAccess.getSporadicAccess().getMinActFreqEDoubleParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_26);
            	    lv_minActFreq_5_0=ruleEDouble();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSporadicRule());
            	    											}
            	    											set(
            	    												current,
            	    												"minActFreq",
            	    												lv_minActFreq_5_0,
            	    												"org.xtext.system.activityArchitecture.ActivityArchitecture.EDouble");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_6=(Token)match(input,35,FOLLOW_27); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSporadicAccess().getHzKeyword_3_0_2());
            	    								
            	    // InternalActivityArchitecture.g:1116:9: (otherlv_7= ';' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==25) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalActivityArchitecture.g:1117:10: otherlv_7= ';'
            	            {
            	            otherlv_7=(Token)match(input,25,FOLLOW_24); 

            	            										newLeafNode(otherlv_7, grammarAccess.getSporadicAccess().getSemicolonKeyword_3_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSporadicAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalActivityArchitecture.g:1128:4: ({...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) ) )
            	    {
            	    // InternalActivityArchitecture.g:1128:4: ({...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) ) )
            	    // InternalActivityArchitecture.g:1129:5: {...}? => ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSporadic", "getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalActivityArchitecture.g:1129:105: ( ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) ) )
            	    // InternalActivityArchitecture.g:1130:6: ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalActivityArchitecture.g:1133:9: ({...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? ) )
            	    // InternalActivityArchitecture.g:1133:10: {...}? => (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSporadic", "true");
            	    }
            	    // InternalActivityArchitecture.g:1133:19: (otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )? )
            	    // InternalActivityArchitecture.g:1133:20: otherlv_8= 'maxActFreq' ( (lv_maxActFreq_9_0= ruleEDouble ) ) otherlv_10= 'Hz' (otherlv_11= ';' )?
            	    {
            	    otherlv_8=(Token)match(input,36,FOLLOW_25); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSporadicAccess().getMaxActFreqKeyword_3_1_0());
            	    								
            	    // InternalActivityArchitecture.g:1137:9: ( (lv_maxActFreq_9_0= ruleEDouble ) )
            	    // InternalActivityArchitecture.g:1138:10: (lv_maxActFreq_9_0= ruleEDouble )
            	    {
            	    // InternalActivityArchitecture.g:1138:10: (lv_maxActFreq_9_0= ruleEDouble )
            	    // InternalActivityArchitecture.g:1139:11: lv_maxActFreq_9_0= ruleEDouble
            	    {

            	    											newCompositeNode(grammarAccess.getSporadicAccess().getMaxActFreqEDoubleParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_26);
            	    lv_maxActFreq_9_0=ruleEDouble();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSporadicRule());
            	    											}
            	    											set(
            	    												current,
            	    												"maxActFreq",
            	    												lv_maxActFreq_9_0,
            	    												"org.xtext.system.activityArchitecture.ActivityArchitecture.EDouble");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_10=(Token)match(input,35,FOLLOW_27); 

            	    									newLeafNode(otherlv_10, grammarAccess.getSporadicAccess().getHzKeyword_3_1_2());
            	    								
            	    // InternalActivityArchitecture.g:1160:9: (otherlv_11= ';' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==25) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalActivityArchitecture.g:1161:10: otherlv_11= ';'
            	            {
            	            otherlv_11=(Token)match(input,25,FOLLOW_24); 

            	            										newLeafNode(otherlv_11, grammarAccess.getSporadicAccess().getSemicolonKeyword_3_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSporadicAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSporadicAccess().getUnorderedGroup_3());
            				

            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSporadicAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSporadic"


    // $ANTLR start "entryRuleDataTriggered"
    // InternalActivityArchitecture.g:1187:1: entryRuleDataTriggered returns [EObject current=null] : iv_ruleDataTriggered= ruleDataTriggered EOF ;
    public final EObject entryRuleDataTriggered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTriggered = null;


        try {
            // InternalActivityArchitecture.g:1187:54: (iv_ruleDataTriggered= ruleDataTriggered EOF )
            // InternalActivityArchitecture.g:1188:2: iv_ruleDataTriggered= ruleDataTriggered EOF
            {
             newCompositeNode(grammarAccess.getDataTriggeredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataTriggered=ruleDataTriggered();

            state._fsp--;

             current =iv_ruleDataTriggered; 
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
    // $ANTLR end "entryRuleDataTriggered"


    // $ANTLR start "ruleDataTriggered"
    // InternalActivityArchitecture.g:1194:1: ruleDataTriggered returns [EObject current=null] : (otherlv_0= 'DataTriggered' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= 'prescale' ( (lv_prescale_4_0= ruleEInt ) ) (otherlv_5= ';' )? otherlv_6= '}' ) ;
    public final EObject ruleDataTriggered() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_prescale_4_0 = null;



        	enterRule();

        try {
            // InternalActivityArchitecture.g:1200:2: ( (otherlv_0= 'DataTriggered' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= 'prescale' ( (lv_prescale_4_0= ruleEInt ) ) (otherlv_5= ';' )? otherlv_6= '}' ) )
            // InternalActivityArchitecture.g:1201:2: (otherlv_0= 'DataTriggered' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= 'prescale' ( (lv_prescale_4_0= ruleEInt ) ) (otherlv_5= ';' )? otherlv_6= '}' )
            {
            // InternalActivityArchitecture.g:1201:2: (otherlv_0= 'DataTriggered' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= 'prescale' ( (lv_prescale_4_0= ruleEInt ) ) (otherlv_5= ';' )? otherlv_6= '}' )
            // InternalActivityArchitecture.g:1202:3: otherlv_0= 'DataTriggered' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= 'prescale' ( (lv_prescale_4_0= ruleEInt ) ) (otherlv_5= ';' )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTriggeredAccess().getDataTriggeredKeyword_0());
            		
            // InternalActivityArchitecture.g:1206:3: ( ( ruleFQN ) )
            // InternalActivityArchitecture.g:1207:4: ( ruleFQN )
            {
            // InternalActivityArchitecture.g:1207:4: ( ruleFQN )
            // InternalActivityArchitecture.g:1208:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTriggeredRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataTriggeredAccess().getTriggerRefTriggerInputNodeCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getDataTriggeredAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDataTriggeredAccess().getPrescaleKeyword_3());
            		
            // InternalActivityArchitecture.g:1230:3: ( (lv_prescale_4_0= ruleEInt ) )
            // InternalActivityArchitecture.g:1231:4: (lv_prescale_4_0= ruleEInt )
            {
            // InternalActivityArchitecture.g:1231:4: (lv_prescale_4_0= ruleEInt )
            // InternalActivityArchitecture.g:1232:5: lv_prescale_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDataTriggeredAccess().getPrescaleEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
            lv_prescale_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTriggeredRule());
            					}
            					set(
            						current,
            						"prescale",
            						lv_prescale_4_0,
            						"org.xtext.system.activityArchitecture.ActivityArchitecture.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityArchitecture.g:1249:3: (otherlv_5= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalActivityArchitecture.g:1250:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getDataTriggeredAccess().getSemicolonKeyword_5());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDataTriggeredAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDataTriggered"


    // $ANTLR start "entryRulePeriodicTimer"
    // InternalActivityArchitecture.g:1263:1: entryRulePeriodicTimer returns [EObject current=null] : iv_rulePeriodicTimer= rulePeriodicTimer EOF ;
    public final EObject entryRulePeriodicTimer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeriodicTimer = null;


        try {
            // InternalActivityArchitecture.g:1263:54: (iv_rulePeriodicTimer= rulePeriodicTimer EOF )
            // InternalActivityArchitecture.g:1264:2: iv_rulePeriodicTimer= rulePeriodicTimer EOF
            {
             newCompositeNode(grammarAccess.getPeriodicTimerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePeriodicTimer=rulePeriodicTimer();

            state._fsp--;

             current =iv_rulePeriodicTimer; 
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
    // $ANTLR end "entryRulePeriodicTimer"


    // $ANTLR start "rulePeriodicTimer"
    // InternalActivityArchitecture.g:1270:1: rulePeriodicTimer returns [EObject current=null] : (otherlv_0= 'PeriodicTimer' otherlv_1= '{' otherlv_2= 'periodicActFreq' ( (lv_periodicActFreq_3_0= ruleEDouble ) ) otherlv_4= 'Hz' (otherlv_5= ';' )? otherlv_6= '}' ) ;
    public final EObject rulePeriodicTimer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_periodicActFreq_3_0 = null;



        	enterRule();

        try {
            // InternalActivityArchitecture.g:1276:2: ( (otherlv_0= 'PeriodicTimer' otherlv_1= '{' otherlv_2= 'periodicActFreq' ( (lv_periodicActFreq_3_0= ruleEDouble ) ) otherlv_4= 'Hz' (otherlv_5= ';' )? otherlv_6= '}' ) )
            // InternalActivityArchitecture.g:1277:2: (otherlv_0= 'PeriodicTimer' otherlv_1= '{' otherlv_2= 'periodicActFreq' ( (lv_periodicActFreq_3_0= ruleEDouble ) ) otherlv_4= 'Hz' (otherlv_5= ';' )? otherlv_6= '}' )
            {
            // InternalActivityArchitecture.g:1277:2: (otherlv_0= 'PeriodicTimer' otherlv_1= '{' otherlv_2= 'periodicActFreq' ( (lv_periodicActFreq_3_0= ruleEDouble ) ) otherlv_4= 'Hz' (otherlv_5= ';' )? otherlv_6= '}' )
            // InternalActivityArchitecture.g:1278:3: otherlv_0= 'PeriodicTimer' otherlv_1= '{' otherlv_2= 'periodicActFreq' ( (lv_periodicActFreq_3_0= ruleEDouble ) ) otherlv_4= 'Hz' (otherlv_5= ';' )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPeriodicTimerAccess().getPeriodicTimerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getPeriodicTimerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqKeyword_2());
            		
            // InternalActivityArchitecture.g:1290:3: ( (lv_periodicActFreq_3_0= ruleEDouble ) )
            // InternalActivityArchitecture.g:1291:4: (lv_periodicActFreq_3_0= ruleEDouble )
            {
            // InternalActivityArchitecture.g:1291:4: (lv_periodicActFreq_3_0= ruleEDouble )
            // InternalActivityArchitecture.g:1292:5: lv_periodicActFreq_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_periodicActFreq_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPeriodicTimerRule());
            					}
            					set(
            						current,
            						"periodicActFreq",
            						lv_periodicActFreq_3_0,
            						"org.xtext.system.activityArchitecture.ActivityArchitecture.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getPeriodicTimerAccess().getHzKeyword_4());
            		
            // InternalActivityArchitecture.g:1313:3: (otherlv_5= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalActivityArchitecture.g:1314:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getPeriodicTimerAccess().getSemicolonKeyword_5());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPeriodicTimerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePeriodicTimer"


    // $ANTLR start "entryRuleScheduler"
    // InternalActivityArchitecture.g:1327:1: entryRuleScheduler returns [EObject current=null] : iv_ruleScheduler= ruleScheduler EOF ;
    public final EObject entryRuleScheduler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduler = null;


        try {
            // InternalActivityArchitecture.g:1327:50: (iv_ruleScheduler= ruleScheduler EOF )
            // InternalActivityArchitecture.g:1328:2: iv_ruleScheduler= ruleScheduler EOF
            {
             newCompositeNode(grammarAccess.getSchedulerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScheduler=ruleScheduler();

            state._fsp--;

             current =iv_ruleScheduler; 
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
    // $ANTLR end "entryRuleScheduler"


    // $ANTLR start "ruleScheduler"
    // InternalActivityArchitecture.g:1334:1: ruleScheduler returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) ) ) )* ) ) ) otherlv_9= '}' ) ;
    public final EObject ruleScheduler() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_priority_7_0 = null;



        	enterRule();

        try {
            // InternalActivityArchitecture.g:1340:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) ) ) )* ) ) ) otherlv_9= '}' ) )
            // InternalActivityArchitecture.g:1341:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) ) ) )* ) ) ) otherlv_9= '}' )
            {
            // InternalActivityArchitecture.g:1341:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) ) ) )* ) ) ) otherlv_9= '}' )
            // InternalActivityArchitecture.g:1342:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) ) ) )* ) ) ) otherlv_9= '}'
            {
            // InternalActivityArchitecture.g:1342:3: ()
            // InternalActivityArchitecture.g:1343:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSchedulerAccess().getSchedulerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getSchedulerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalActivityArchitecture.g:1353:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) ) ) )* ) ) )
            // InternalActivityArchitecture.g:1354:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) ) ) )* ) )
            {
            // InternalActivityArchitecture.g:1354:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) ) ) )* ) )
            // InternalActivityArchitecture.g:1355:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSchedulerAccess().getUnorderedGroup_2());
            				
            // InternalActivityArchitecture.g:1358:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) ) ) )* )
            // InternalActivityArchitecture.g:1359:6: ( ({...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) ) ) )*
            {
            // InternalActivityArchitecture.g:1359:6: ( ({...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) ) ) )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( LA29_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 0) ) {
                    alt29=1;
                }
                else if ( LA29_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 1) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalActivityArchitecture.g:1360:4: ({...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) ) )
            	    {
            	    // InternalActivityArchitecture.g:1360:4: ({...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) ) )
            	    // InternalActivityArchitecture.g:1361:5: {...}? => ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleScheduler", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalActivityArchitecture.g:1361:106: ( ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) ) )
            	    // InternalActivityArchitecture.g:1362:6: ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalActivityArchitecture.g:1365:9: ({...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? ) )
            	    // InternalActivityArchitecture.g:1365:10: {...}? => (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScheduler", "true");
            	    }
            	    // InternalActivityArchitecture.g:1365:19: (otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )? )
            	    // InternalActivityArchitecture.g:1365:20: otherlv_3= 'type' ( (lv_type_4_0= ruleSchedulerType ) ) (otherlv_5= ';' )?
            	    {
            	    otherlv_3=(Token)match(input,40,FOLLOW_32); 

            	    									newLeafNode(otherlv_3, grammarAccess.getSchedulerAccess().getTypeKeyword_2_0_0());
            	    								
            	    // InternalActivityArchitecture.g:1369:9: ( (lv_type_4_0= ruleSchedulerType ) )
            	    // InternalActivityArchitecture.g:1370:10: (lv_type_4_0= ruleSchedulerType )
            	    {
            	    // InternalActivityArchitecture.g:1370:10: (lv_type_4_0= ruleSchedulerType )
            	    // InternalActivityArchitecture.g:1371:11: lv_type_4_0= ruleSchedulerType
            	    {

            	    											newCompositeNode(grammarAccess.getSchedulerAccess().getTypeSchedulerTypeEnumRuleCall_2_0_1_0());
            	    										
            	    pushFollow(FOLLOW_33);
            	    lv_type_4_0=ruleSchedulerType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchedulerRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_4_0,
            	    												"org.xtext.system.activityArchitecture.ActivityArchitecture.SchedulerType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalActivityArchitecture.g:1388:9: (otherlv_5= ';' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==25) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalActivityArchitecture.g:1389:10: otherlv_5= ';'
            	            {
            	            otherlv_5=(Token)match(input,25,FOLLOW_31); 

            	            										newLeafNode(otherlv_5, grammarAccess.getSchedulerAccess().getSemicolonKeyword_2_0_2());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchedulerAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalActivityArchitecture.g:1400:4: ({...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) ) )
            	    {
            	    // InternalActivityArchitecture.g:1400:4: ({...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) ) )
            	    // InternalActivityArchitecture.g:1401:5: {...}? => ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleScheduler", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalActivityArchitecture.g:1401:106: ( ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) ) )
            	    // InternalActivityArchitecture.g:1402:6: ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalActivityArchitecture.g:1405:9: ({...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? ) )
            	    // InternalActivityArchitecture.g:1405:10: {...}? => (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScheduler", "true");
            	    }
            	    // InternalActivityArchitecture.g:1405:19: (otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )? )
            	    // InternalActivityArchitecture.g:1405:20: otherlv_6= 'priority' ( (lv_priority_7_0= ruleEInt ) ) (otherlv_8= ';' )?
            	    {
            	    otherlv_6=(Token)match(input,41,FOLLOW_10); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSchedulerAccess().getPriorityKeyword_2_1_0());
            	    								
            	    // InternalActivityArchitecture.g:1409:9: ( (lv_priority_7_0= ruleEInt ) )
            	    // InternalActivityArchitecture.g:1410:10: (lv_priority_7_0= ruleEInt )
            	    {
            	    // InternalActivityArchitecture.g:1410:10: (lv_priority_7_0= ruleEInt )
            	    // InternalActivityArchitecture.g:1411:11: lv_priority_7_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getSchedulerAccess().getPriorityEIntParserRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_33);
            	    lv_priority_7_0=ruleEInt();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchedulerRule());
            	    											}
            	    											set(
            	    												current,
            	    												"priority",
            	    												lv_priority_7_0,
            	    												"org.xtext.system.activityArchitecture.ActivityArchitecture.EInt");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalActivityArchitecture.g:1428:9: (otherlv_8= ';' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==25) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalActivityArchitecture.g:1429:10: otherlv_8= ';'
            	            {
            	            otherlv_8=(Token)match(input,25,FOLLOW_31); 

            	            										newLeafNode(otherlv_8, grammarAccess.getSchedulerAccess().getSemicolonKeyword_2_1_2());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchedulerAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSchedulerAccess().getUnorderedGroup_2());
            				

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSchedulerAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleScheduler"


    // $ANTLR start "entryRuleCPUCore"
    // InternalActivityArchitecture.g:1455:1: entryRuleCPUCore returns [EObject current=null] : iv_ruleCPUCore= ruleCPUCore EOF ;
    public final EObject entryRuleCPUCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCPUCore = null;


        try {
            // InternalActivityArchitecture.g:1455:48: (iv_ruleCPUCore= ruleCPUCore EOF )
            // InternalActivityArchitecture.g:1456:2: iv_ruleCPUCore= ruleCPUCore EOF
            {
             newCompositeNode(grammarAccess.getCPUCoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCPUCore=ruleCPUCore();

            state._fsp--;

             current =iv_ruleCPUCore; 
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
    // $ANTLR end "entryRuleCPUCore"


    // $ANTLR start "ruleCPUCore"
    // InternalActivityArchitecture.g:1462:1: ruleCPUCore returns [EObject current=null] : (otherlv_0= 'CPUCore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'coreNumber' ( (lv_coreNumber_4_0= ruleEInt ) ) (otherlv_5= ';' )? otherlv_6= '}' ) ;
    public final EObject ruleCPUCore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_coreNumber_4_0 = null;



        	enterRule();

        try {
            // InternalActivityArchitecture.g:1468:2: ( (otherlv_0= 'CPUCore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'coreNumber' ( (lv_coreNumber_4_0= ruleEInt ) ) (otherlv_5= ';' )? otherlv_6= '}' ) )
            // InternalActivityArchitecture.g:1469:2: (otherlv_0= 'CPUCore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'coreNumber' ( (lv_coreNumber_4_0= ruleEInt ) ) (otherlv_5= ';' )? otherlv_6= '}' )
            {
            // InternalActivityArchitecture.g:1469:2: (otherlv_0= 'CPUCore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'coreNumber' ( (lv_coreNumber_4_0= ruleEInt ) ) (otherlv_5= ';' )? otherlv_6= '}' )
            // InternalActivityArchitecture.g:1470:3: otherlv_0= 'CPUCore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'coreNumber' ( (lv_coreNumber_4_0= ruleEInt ) ) (otherlv_5= ';' )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCPUCoreAccess().getCPUCoreKeyword_0());
            		
            // InternalActivityArchitecture.g:1474:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalActivityArchitecture.g:1475:4: (lv_name_1_0= RULE_ID )
            {
            // InternalActivityArchitecture.g:1475:4: (lv_name_1_0= RULE_ID )
            // InternalActivityArchitecture.g:1476:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCPUCoreAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCPUCoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getCPUCoreAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCPUCoreAccess().getCoreNumberKeyword_3());
            		
            // InternalActivityArchitecture.g:1500:3: ( (lv_coreNumber_4_0= ruleEInt ) )
            // InternalActivityArchitecture.g:1501:4: (lv_coreNumber_4_0= ruleEInt )
            {
            // InternalActivityArchitecture.g:1501:4: (lv_coreNumber_4_0= ruleEInt )
            // InternalActivityArchitecture.g:1502:5: lv_coreNumber_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCPUCoreAccess().getCoreNumberEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
            lv_coreNumber_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCPUCoreRule());
            					}
            					set(
            						current,
            						"coreNumber",
            						lv_coreNumber_4_0,
            						"org.xtext.system.activityArchitecture.ActivityArchitecture.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityArchitecture.g:1519:3: (otherlv_5= ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalActivityArchitecture.g:1520:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getCPUCoreAccess().getSemicolonKeyword_5());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCPUCoreAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCPUCore"


    // $ANTLR start "entryRuleExecutionTime"
    // InternalActivityArchitecture.g:1533:1: entryRuleExecutionTime returns [EObject current=null] : iv_ruleExecutionTime= ruleExecutionTime EOF ;
    public final EObject entryRuleExecutionTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionTime = null;


        try {
            // InternalActivityArchitecture.g:1533:54: (iv_ruleExecutionTime= ruleExecutionTime EOF )
            // InternalActivityArchitecture.g:1534:2: iv_ruleExecutionTime= ruleExecutionTime EOF
            {
             newCompositeNode(grammarAccess.getExecutionTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecutionTime=ruleExecutionTime();

            state._fsp--;

             current =iv_ruleExecutionTime; 
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
    // $ANTLR end "entryRuleExecutionTime"


    // $ANTLR start "ruleExecutionTime"
    // InternalActivityArchitecture.g:1540:1: ruleExecutionTime returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) ) ) )+ {...}?) ) ) otherlv_8= '}' ) ;
    public final EObject ruleExecutionTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_minTime_3_0 = null;

        EObject lv_maxTime_6_0 = null;



        	enterRule();

        try {
            // InternalActivityArchitecture.g:1546:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) ) ) )+ {...}?) ) ) otherlv_8= '}' ) )
            // InternalActivityArchitecture.g:1547:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) ) ) )+ {...}?) ) ) otherlv_8= '}' )
            {
            // InternalActivityArchitecture.g:1547:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) ) ) )+ {...}?) ) ) otherlv_8= '}' )
            // InternalActivityArchitecture.g:1548:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) ) ) )+ {...}?) ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getExecutionTimeAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalActivityArchitecture.g:1552:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) ) ) )+ {...}?) ) )
            // InternalActivityArchitecture.g:1553:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) ) ) )+ {...}?) )
            {
            // InternalActivityArchitecture.g:1553:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) ) ) )+ {...}?) )
            // InternalActivityArchitecture.g:1554:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1());
            				
            // InternalActivityArchitecture.g:1557:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) ) ) )+ {...}?)
            // InternalActivityArchitecture.g:1558:6: ( ({...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) ) ) )+ {...}?
            {
            // InternalActivityArchitecture.g:1558:6: ( ({...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( LA33_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 1) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalActivityArchitecture.g:1559:4: ({...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) ) )
            	    {
            	    // InternalActivityArchitecture.g:1559:4: ({...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) ) )
            	    // InternalActivityArchitecture.g:1560:5: {...}? => ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleExecutionTime", "getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalActivityArchitecture.g:1560:110: ( ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) ) )
            	    // InternalActivityArchitecture.g:1561:6: ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalActivityArchitecture.g:1564:9: ({...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? ) )
            	    // InternalActivityArchitecture.g:1564:10: {...}? => (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleExecutionTime", "true");
            	    }
            	    // InternalActivityArchitecture.g:1564:19: (otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )? )
            	    // InternalActivityArchitecture.g:1564:20: otherlv_2= 'minTime' ( (lv_minTime_3_0= ruleTimeValue ) ) (otherlv_4= ';' )?
            	    {
            	    otherlv_2=(Token)match(input,44,FOLLOW_10); 

            	    									newLeafNode(otherlv_2, grammarAccess.getExecutionTimeAccess().getMinTimeKeyword_1_0_0());
            	    								
            	    // InternalActivityArchitecture.g:1568:9: ( (lv_minTime_3_0= ruleTimeValue ) )
            	    // InternalActivityArchitecture.g:1569:10: (lv_minTime_3_0= ruleTimeValue )
            	    {
            	    // InternalActivityArchitecture.g:1569:10: (lv_minTime_3_0= ruleTimeValue )
            	    // InternalActivityArchitecture.g:1570:11: lv_minTime_3_0= ruleTimeValue
            	    {

            	    											newCompositeNode(grammarAccess.getExecutionTimeAccess().getMinTimeTimeValueParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_minTime_3_0=ruleTimeValue();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getExecutionTimeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"minTime",
            	    												lv_minTime_3_0,
            	    												"org.xtext.system.activityArchitecture.ActivityArchitecture.TimeValue");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalActivityArchitecture.g:1587:9: (otherlv_4= ';' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==25) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalActivityArchitecture.g:1588:10: otherlv_4= ';'
            	            {
            	            otherlv_4=(Token)match(input,25,FOLLOW_37); 

            	            										newLeafNode(otherlv_4, grammarAccess.getExecutionTimeAccess().getSemicolonKeyword_1_0_2());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalActivityArchitecture.g:1599:4: ({...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) ) )
            	    {
            	    // InternalActivityArchitecture.g:1599:4: ({...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) ) )
            	    // InternalActivityArchitecture.g:1600:5: {...}? => ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleExecutionTime", "getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalActivityArchitecture.g:1600:110: ( ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) ) )
            	    // InternalActivityArchitecture.g:1601:6: ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalActivityArchitecture.g:1604:9: ({...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? ) )
            	    // InternalActivityArchitecture.g:1604:10: {...}? => (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleExecutionTime", "true");
            	    }
            	    // InternalActivityArchitecture.g:1604:19: (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )? )
            	    // InternalActivityArchitecture.g:1604:20: otherlv_5= 'maxTime' ( (lv_maxTime_6_0= ruleTimeValue ) ) (otherlv_7= ';' )?
            	    {
            	    otherlv_5=(Token)match(input,45,FOLLOW_10); 

            	    									newLeafNode(otherlv_5, grammarAccess.getExecutionTimeAccess().getMaxTimeKeyword_1_1_0());
            	    								
            	    // InternalActivityArchitecture.g:1608:9: ( (lv_maxTime_6_0= ruleTimeValue ) )
            	    // InternalActivityArchitecture.g:1609:10: (lv_maxTime_6_0= ruleTimeValue )
            	    {
            	    // InternalActivityArchitecture.g:1609:10: (lv_maxTime_6_0= ruleTimeValue )
            	    // InternalActivityArchitecture.g:1610:11: lv_maxTime_6_0= ruleTimeValue
            	    {

            	    											newCompositeNode(grammarAccess.getExecutionTimeAccess().getMaxTimeTimeValueParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_maxTime_6_0=ruleTimeValue();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getExecutionTimeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"maxTime",
            	    												lv_maxTime_6_0,
            	    												"org.xtext.system.activityArchitecture.ActivityArchitecture.TimeValue");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalActivityArchitecture.g:1627:9: (otherlv_7= ';' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==25) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalActivityArchitecture.g:1628:10: otherlv_7= ';'
            	            {
            	            otherlv_7=(Token)match(input,25,FOLLOW_37); 

            	            										newLeafNode(otherlv_7, grammarAccess.getExecutionTimeAccess().getSemicolonKeyword_1_1_2());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleExecutionTime", "getUnorderedGroupHelper().canLeave(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1());
            				

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getExecutionTimeAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleExecutionTime"


    // $ANTLR start "entryRuleTimeValue"
    // InternalActivityArchitecture.g:1655:1: entryRuleTimeValue returns [EObject current=null] : iv_ruleTimeValue= ruleTimeValue EOF ;
    public final EObject entryRuleTimeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeValue = null;


        try {
            // InternalActivityArchitecture.g:1655:50: (iv_ruleTimeValue= ruleTimeValue EOF )
            // InternalActivityArchitecture.g:1656:2: iv_ruleTimeValue= ruleTimeValue EOF
            {
             newCompositeNode(grammarAccess.getTimeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeValue=ruleTimeValue();

            state._fsp--;

             current =iv_ruleTimeValue; 
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
    // $ANTLR end "entryRuleTimeValue"


    // $ANTLR start "ruleTimeValue"
    // InternalActivityArchitecture.g:1662:1: ruleTimeValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalActivityArchitecture.g:1668:2: ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) )
            // InternalActivityArchitecture.g:1669:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            {
            // InternalActivityArchitecture.g:1669:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            // InternalActivityArchitecture.g:1670:3: ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleTimeUnit ) )
            {
            // InternalActivityArchitecture.g:1670:3: ( (lv_value_0_0= ruleEInt ) )
            // InternalActivityArchitecture.g:1671:4: (lv_value_0_0= ruleEInt )
            {
            // InternalActivityArchitecture.g:1671:4: (lv_value_0_0= ruleEInt )
            // InternalActivityArchitecture.g:1672:5: lv_value_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTimeValueAccess().getValueEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.xtext.system.activityArchitecture.ActivityArchitecture.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityArchitecture.g:1689:3: ( (lv_unit_1_0= ruleTimeUnit ) )
            // InternalActivityArchitecture.g:1690:4: (lv_unit_1_0= ruleTimeUnit )
            {
            // InternalActivityArchitecture.g:1690:4: (lv_unit_1_0= ruleTimeUnit )
            // InternalActivityArchitecture.g:1691:5: lv_unit_1_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getTimeValueAccess().getUnitTimeUnitEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_1_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeValueRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_1_0,
            						"org.xtext.system.activityArchitecture.ActivityArchitecture.TimeUnit");
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
    // $ANTLR end "ruleTimeValue"


    // $ANTLR start "ruleSchedulerType"
    // InternalActivityArchitecture.g:1712:1: ruleSchedulerType returns [Enumerator current=null] : ( (enumLiteral_0= 'DEFAULT' ) | (enumLiteral_1= 'FIFO' ) | (enumLiteral_2= 'RR' ) ) ;
    public final Enumerator ruleSchedulerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalActivityArchitecture.g:1718:2: ( ( (enumLiteral_0= 'DEFAULT' ) | (enumLiteral_1= 'FIFO' ) | (enumLiteral_2= 'RR' ) ) )
            // InternalActivityArchitecture.g:1719:2: ( (enumLiteral_0= 'DEFAULT' ) | (enumLiteral_1= 'FIFO' ) | (enumLiteral_2= 'RR' ) )
            {
            // InternalActivityArchitecture.g:1719:2: ( (enumLiteral_0= 'DEFAULT' ) | (enumLiteral_1= 'FIFO' ) | (enumLiteral_2= 'RR' ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt34=1;
                }
                break;
            case 47:
                {
                alt34=2;
                }
                break;
            case 48:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalActivityArchitecture.g:1720:3: (enumLiteral_0= 'DEFAULT' )
                    {
                    // InternalActivityArchitecture.g:1720:3: (enumLiteral_0= 'DEFAULT' )
                    // InternalActivityArchitecture.g:1721:4: enumLiteral_0= 'DEFAULT'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getSchedulerTypeAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSchedulerTypeAccess().getDEFAULTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:1728:3: (enumLiteral_1= 'FIFO' )
                    {
                    // InternalActivityArchitecture.g:1728:3: (enumLiteral_1= 'FIFO' )
                    // InternalActivityArchitecture.g:1729:4: enumLiteral_1= 'FIFO'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getSchedulerTypeAccess().getFIFOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSchedulerTypeAccess().getFIFOEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalActivityArchitecture.g:1736:3: (enumLiteral_2= 'RR' )
                    {
                    // InternalActivityArchitecture.g:1736:3: (enumLiteral_2= 'RR' )
                    // InternalActivityArchitecture.g:1737:4: enumLiteral_2= 'RR'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getSchedulerTypeAccess().getRREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSchedulerTypeAccess().getRREnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleSchedulerType"


    // $ANTLR start "ruleTimeUnit"
    // InternalActivityArchitecture.g:1747:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalActivityArchitecture.g:1753:2: ( ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) ) )
            // InternalActivityArchitecture.g:1754:2: ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) )
            {
            // InternalActivityArchitecture.g:1754:2: ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt35=1;
                }
                break;
            case 50:
                {
                alt35=2;
                }
                break;
            case 51:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalActivityArchitecture.g:1755:3: (enumLiteral_0= 'sec' )
                    {
                    // InternalActivityArchitecture.g:1755:3: (enumLiteral_0= 'sec' )
                    // InternalActivityArchitecture.g:1756:4: enumLiteral_0= 'sec'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:1763:3: (enumLiteral_1= 'ms' )
                    {
                    // InternalActivityArchitecture.g:1763:3: (enumLiteral_1= 'ms' )
                    // InternalActivityArchitecture.g:1764:4: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMSECEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMSECEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalActivityArchitecture.g:1771:3: (enumLiteral_2= 'us' )
                    {
                    // InternalActivityArchitecture.g:1771:3: (enumLiteral_2= 'us' )
                    // InternalActivityArchitecture.g:1772:4: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000040004242000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C02000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000F8002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000101002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000F0002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000F2002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001400002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000000C020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001402002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000030000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000030002002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000300002002000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000300000002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000E000000000000L});

}
