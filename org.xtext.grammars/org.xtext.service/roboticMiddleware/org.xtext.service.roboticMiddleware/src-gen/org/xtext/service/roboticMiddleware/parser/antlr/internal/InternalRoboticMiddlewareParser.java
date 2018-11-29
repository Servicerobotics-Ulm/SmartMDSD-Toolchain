package org.xtext.service.roboticMiddleware.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.service.roboticMiddleware.services.RoboticMiddlewareGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRoboticMiddlewareParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalRoboticMiddlewareParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRoboticMiddlewareParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRoboticMiddlewareParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRoboticMiddleware.g"; }



     	private RoboticMiddlewareGrammarAccess grammarAccess;

        public InternalRoboticMiddlewareParser(TokenStream input, RoboticMiddlewareGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RoboticMiddleware";
       	}

       	@Override
       	protected RoboticMiddlewareGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoboticMiddleware"
    // InternalRoboticMiddleware.g:105:1: entryRuleRoboticMiddleware returns [EObject current=null] : iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF ;
    public final EObject entryRuleRoboticMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoboticMiddleware = null;


        try {
            // InternalRoboticMiddleware.g:105:58: (iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF )
            // InternalRoboticMiddleware.g:106:2: iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF
            {
             newCompositeNode(grammarAccess.getRoboticMiddlewareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoboticMiddleware=ruleRoboticMiddleware();

            state._fsp--;

             current =iv_ruleRoboticMiddleware; 
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
    // $ANTLR end "entryRuleRoboticMiddleware"


    // $ANTLR start "ruleRoboticMiddleware"
    // InternalRoboticMiddleware.g:112:1: ruleRoboticMiddleware returns [EObject current=null] : (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft ) ;
    public final EObject ruleRoboticMiddleware() throws RecognitionException {
        EObject current = null;

        EObject this_ACE_SmartSoft_0 = null;

        EObject this_OpcUa_SeRoNet_1 = null;

        EObject this_CORBA_SmartSoft_2 = null;

        EObject this_DDS_SmartSoft_3 = null;



        	enterRule();

        try {
            // InternalRoboticMiddleware.g:118:2: ( (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft ) )
            // InternalRoboticMiddleware.g:119:2: (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft )
            {
            // InternalRoboticMiddleware.g:119:2: (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRoboticMiddleware.g:120:3: this_ACE_SmartSoft_0= ruleACE_SmartSoft
                    {

                    			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getACE_SmartSoftParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ACE_SmartSoft_0=ruleACE_SmartSoft();

                    state._fsp--;


                    			current = this_ACE_SmartSoft_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRoboticMiddleware.g:129:3: this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet
                    {

                    			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getOpcUa_SeRoNetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpcUa_SeRoNet_1=ruleOpcUa_SeRoNet();

                    state._fsp--;


                    			current = this_OpcUa_SeRoNet_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRoboticMiddleware.g:138:3: this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft
                    {

                    			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getCORBA_SmartSoftParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CORBA_SmartSoft_2=ruleCORBA_SmartSoft();

                    state._fsp--;


                    			current = this_CORBA_SmartSoft_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRoboticMiddleware.g:147:3: this_DDS_SmartSoft_3= ruleDDS_SmartSoft
                    {

                    			newCompositeNode(grammarAccess.getRoboticMiddlewareAccess().getDDS_SmartSoftParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DDS_SmartSoft_3=ruleDDS_SmartSoft();

                    state._fsp--;


                    			current = this_DDS_SmartSoft_3;
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
    // $ANTLR end "ruleRoboticMiddleware"


    // $ANTLR start "entryRuleFQN"
    // InternalRoboticMiddleware.g:159:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalRoboticMiddleware.g:159:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalRoboticMiddleware.g:160:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalRoboticMiddleware.g:166:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRoboticMiddleware.g:172:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRoboticMiddleware.g:173:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRoboticMiddleware.g:173:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRoboticMiddleware.g:174:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalRoboticMiddleware.g:181:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRoboticMiddleware.g:182:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_3); 

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


    // $ANTLR start "entryRuleEString"
    // InternalRoboticMiddleware.g:199:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRoboticMiddleware.g:199:47: (iv_ruleEString= ruleEString EOF )
            // InternalRoboticMiddleware.g:200:2: iv_ruleEString= ruleEString EOF
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
    // InternalRoboticMiddleware.g:206:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalRoboticMiddleware.g:212:2: (this_STRING_0= RULE_STRING )
            // InternalRoboticMiddleware.g:213:2: this_STRING_0= RULE_STRING
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


    // $ANTLR start "entryRuleACE_SmartSoft"
    // InternalRoboticMiddleware.g:223:1: entryRuleACE_SmartSoft returns [EObject current=null] : iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF ;
    public final EObject entryRuleACE_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACE_SmartSoft = null;


        try {
            // InternalRoboticMiddleware.g:223:54: (iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF )
            // InternalRoboticMiddleware.g:224:2: iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF
            {
             newCompositeNode(grammarAccess.getACE_SmartSoftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleACE_SmartSoft=ruleACE_SmartSoft();

            state._fsp--;

             current =iv_ruleACE_SmartSoft; 
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
    // $ANTLR end "entryRuleACE_SmartSoft"


    // $ANTLR start "ruleACE_SmartSoft"
    // InternalRoboticMiddleware.g:230:1: ruleACE_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleACE_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalRoboticMiddleware.g:236:2: ( ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalRoboticMiddleware.g:237:2: ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalRoboticMiddleware.g:237:2: ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalRoboticMiddleware.g:238:3: () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalRoboticMiddleware.g:238:3: ()
            // InternalRoboticMiddleware.g:239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1());
            		
            // InternalRoboticMiddleware.g:249:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRoboticMiddleware.g:250:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalRoboticMiddleware.g:254:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalRoboticMiddleware.g:255:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalRoboticMiddleware.g:255:5: (lv_description_3_0= ruleEString )
                    // InternalRoboticMiddleware.g:256:6: lv_description_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getACE_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getACE_SmartSoftRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_3_0,
                    							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleACE_SmartSoft"


    // $ANTLR start "entryRuleOpcUa_SeRoNet"
    // InternalRoboticMiddleware.g:278:1: entryRuleOpcUa_SeRoNet returns [EObject current=null] : iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF ;
    public final EObject entryRuleOpcUa_SeRoNet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUa_SeRoNet = null;


        try {
            // InternalRoboticMiddleware.g:278:54: (iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF )
            // InternalRoboticMiddleware.g:279:2: iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF
            {
             newCompositeNode(grammarAccess.getOpcUa_SeRoNetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpcUa_SeRoNet=ruleOpcUa_SeRoNet();

            state._fsp--;

             current =iv_ruleOpcUa_SeRoNet; 
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
    // $ANTLR end "entryRuleOpcUa_SeRoNet"


    // $ANTLR start "ruleOpcUa_SeRoNet"
    // InternalRoboticMiddleware.g:285:1: ruleOpcUa_SeRoNet returns [EObject current=null] : ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleOpcUa_SeRoNet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalRoboticMiddleware.g:291:2: ( ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalRoboticMiddleware.g:292:2: ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalRoboticMiddleware.g:292:2: ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalRoboticMiddleware.g:293:3: () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalRoboticMiddleware.g:293:3: ()
            // InternalRoboticMiddleware.g:294:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1());
            		
            // InternalRoboticMiddleware.g:304:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoboticMiddleware.g:305:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalRoboticMiddleware.g:309:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalRoboticMiddleware.g:310:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalRoboticMiddleware.g:310:5: (lv_description_3_0= ruleEString )
                    // InternalRoboticMiddleware.g:311:6: lv_description_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpcUa_SeRoNetRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_3_0,
                    							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleOpcUa_SeRoNet"


    // $ANTLR start "entryRuleCORBA_SmartSoft"
    // InternalRoboticMiddleware.g:333:1: entryRuleCORBA_SmartSoft returns [EObject current=null] : iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF ;
    public final EObject entryRuleCORBA_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCORBA_SmartSoft = null;


        try {
            // InternalRoboticMiddleware.g:333:56: (iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF )
            // InternalRoboticMiddleware.g:334:2: iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF
            {
             newCompositeNode(grammarAccess.getCORBA_SmartSoftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCORBA_SmartSoft=ruleCORBA_SmartSoft();

            state._fsp--;

             current =iv_ruleCORBA_SmartSoft; 
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
    // $ANTLR end "entryRuleCORBA_SmartSoft"


    // $ANTLR start "ruleCORBA_SmartSoft"
    // InternalRoboticMiddleware.g:340:1: ruleCORBA_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleCORBA_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalRoboticMiddleware.g:346:2: ( ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalRoboticMiddleware.g:347:2: ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalRoboticMiddleware.g:347:2: ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalRoboticMiddleware.g:348:3: () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalRoboticMiddleware.g:348:3: ()
            // InternalRoboticMiddleware.g:349:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1());
            		
            // InternalRoboticMiddleware.g:359:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoboticMiddleware.g:360:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalRoboticMiddleware.g:364:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalRoboticMiddleware.g:365:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalRoboticMiddleware.g:365:5: (lv_description_3_0= ruleEString )
                    // InternalRoboticMiddleware.g:366:6: lv_description_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCORBA_SmartSoftRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_3_0,
                    							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleCORBA_SmartSoft"


    // $ANTLR start "entryRuleDDS_SmartSoft"
    // InternalRoboticMiddleware.g:388:1: entryRuleDDS_SmartSoft returns [EObject current=null] : iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF ;
    public final EObject entryRuleDDS_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDS_SmartSoft = null;


        try {
            // InternalRoboticMiddleware.g:388:54: (iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF )
            // InternalRoboticMiddleware.g:389:2: iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF
            {
             newCompositeNode(grammarAccess.getDDS_SmartSoftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDDS_SmartSoft=ruleDDS_SmartSoft();

            state._fsp--;

             current =iv_ruleDDS_SmartSoft; 
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
    // $ANTLR end "entryRuleDDS_SmartSoft"


    // $ANTLR start "ruleDDS_SmartSoft"
    // InternalRoboticMiddleware.g:395:1: ruleDDS_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleDDS_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalRoboticMiddleware.g:401:2: ( ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalRoboticMiddleware.g:402:2: ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalRoboticMiddleware.g:402:2: ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalRoboticMiddleware.g:403:3: () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalRoboticMiddleware.g:403:3: ()
            // InternalRoboticMiddleware.g:404:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1());
            		
            // InternalRoboticMiddleware.g:414:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoboticMiddleware.g:415:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalRoboticMiddleware.g:419:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalRoboticMiddleware.g:420:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalRoboticMiddleware.g:420:5: (lv_description_3_0= ruleEString )
                    // InternalRoboticMiddleware.g:421:6: lv_description_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDDS_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDDS_SmartSoftRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_3_0,
                    							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleDDS_SmartSoft"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});

}