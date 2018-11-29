package org.xtext.system.deployment.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.system.deployment.services.DeploymentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeploymentParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DeploymentModel'", "'using'", "'ComponentArchitecture'", "'{'", "'}'", "'-'", "'.'", "'#import'", "';'", "'TargetPlatformReference'", "'UploadDirectory'", "'LoginAccount'", "'NetworkInterface'", "'ComponentArtefact'", "'NamingService'", "'portNr'", "'deploy-to'"
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


        public InternalDeploymentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDeploymentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDeploymentParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDeployment.g"; }



     	private DeploymentGrammarAccess grammarAccess;

        public InternalDeploymentParser(TokenStream input, DeploymentGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DeploymentModel";
       	}

       	@Override
       	protected DeploymentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDeploymentModel"
    // InternalDeployment.g:105:1: entryRuleDeploymentModel returns [EObject current=null] : iv_ruleDeploymentModel= ruleDeploymentModel EOF ;
    public final EObject entryRuleDeploymentModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentModel = null;


        try {
            // InternalDeployment.g:105:56: (iv_ruleDeploymentModel= ruleDeploymentModel EOF )
            // InternalDeployment.g:106:2: iv_ruleDeploymentModel= ruleDeploymentModel EOF
            {
             newCompositeNode(grammarAccess.getDeploymentModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeploymentModel=ruleDeploymentModel();

            state._fsp--;

             current =iv_ruleDeploymentModel; 
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
    // $ANTLR end "entryRuleDeploymentModel"


    // $ANTLR start "ruleDeploymentModel"
    // InternalDeployment.g:112:1: ruleDeploymentModel returns [EObject current=null] : (otherlv_0= 'DeploymentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'using' otherlv_3= 'ComponentArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractDeploymentElement ) )* otherlv_7= '}' ) ;
    public final EObject ruleDeploymentModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalDeployment.g:118:2: ( (otherlv_0= 'DeploymentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'using' otherlv_3= 'ComponentArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractDeploymentElement ) )* otherlv_7= '}' ) )
            // InternalDeployment.g:119:2: (otherlv_0= 'DeploymentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'using' otherlv_3= 'ComponentArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractDeploymentElement ) )* otherlv_7= '}' )
            {
            // InternalDeployment.g:119:2: (otherlv_0= 'DeploymentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'using' otherlv_3= 'ComponentArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractDeploymentElement ) )* otherlv_7= '}' )
            // InternalDeployment.g:120:3: otherlv_0= 'DeploymentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'using' otherlv_3= 'ComponentArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractDeploymentElement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeploymentModelAccess().getDeploymentModelKeyword_0());
            		
            // InternalDeployment.g:124:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeployment.g:125:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeployment.g:125:4: (lv_name_1_0= RULE_ID )
            // InternalDeployment.g:126:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeploymentModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeploymentModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDeployment.g:142:3: (otherlv_2= 'using' otherlv_3= 'ComponentArchitecture' ( ( ruleFQN ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDeployment.g:143:4: otherlv_2= 'using' otherlv_3= 'ComponentArchitecture' ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeploymentModelAccess().getUsingKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeploymentModelAccess().getComponentArchitectureKeyword_2_1());
                    			
                    // InternalDeployment.g:151:4: ( ( ruleFQN ) )
                    // InternalDeployment.g:152:5: ( ruleFQN )
                    {
                    // InternalDeployment.g:152:5: ( ruleFQN )
                    // InternalDeployment.g:153:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeploymentModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDeploymentModelAccess().getComponentArchSystemComponentArchitectureCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getDeploymentModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDeployment.g:172:3: ( (lv_elements_6_0= ruleAbstractDeploymentElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18||LA2_0==20||(LA2_0>=24 && LA2_0<=25)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDeployment.g:173:4: (lv_elements_6_0= ruleAbstractDeploymentElement )
            	    {
            	    // InternalDeployment.g:173:4: (lv_elements_6_0= ruleAbstractDeploymentElement )
            	    // InternalDeployment.g:174:5: lv_elements_6_0= ruleAbstractDeploymentElement
            	    {

            	    					newCompositeNode(grammarAccess.getDeploymentModelAccess().getElementsAbstractDeploymentElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_6_0=ruleAbstractDeploymentElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeploymentModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_6_0,
            	    						"org.xtext.system.deployment.Deployment.AbstractDeploymentElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDeploymentModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDeploymentModel"


    // $ANTLR start "entryRuleAbstractDeploymentElement"
    // InternalDeployment.g:199:1: entryRuleAbstractDeploymentElement returns [EObject current=null] : iv_ruleAbstractDeploymentElement= ruleAbstractDeploymentElement EOF ;
    public final EObject entryRuleAbstractDeploymentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDeploymentElement = null;


        try {
            // InternalDeployment.g:199:66: (iv_ruleAbstractDeploymentElement= ruleAbstractDeploymentElement EOF )
            // InternalDeployment.g:200:2: iv_ruleAbstractDeploymentElement= ruleAbstractDeploymentElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractDeploymentElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractDeploymentElement=ruleAbstractDeploymentElement();

            state._fsp--;

             current =iv_ruleAbstractDeploymentElement; 
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
    // $ANTLR end "entryRuleAbstractDeploymentElement"


    // $ANTLR start "ruleAbstractDeploymentElement"
    // InternalDeployment.g:206:1: ruleAbstractDeploymentElement returns [EObject current=null] : (this_NamingService_0= ruleNamingService | this_TargetPlatformReference_1= ruleTargetPlatformReference | this_ComponentArtefact_2= ruleComponentArtefact | this_TargetModelInclude_3= ruleTargetModelInclude ) ;
    public final EObject ruleAbstractDeploymentElement() throws RecognitionException {
        EObject current = null;

        EObject this_NamingService_0 = null;

        EObject this_TargetPlatformReference_1 = null;

        EObject this_ComponentArtefact_2 = null;

        EObject this_TargetModelInclude_3 = null;



        	enterRule();

        try {
            // InternalDeployment.g:212:2: ( (this_NamingService_0= ruleNamingService | this_TargetPlatformReference_1= ruleTargetPlatformReference | this_ComponentArtefact_2= ruleComponentArtefact | this_TargetModelInclude_3= ruleTargetModelInclude ) )
            // InternalDeployment.g:213:2: (this_NamingService_0= ruleNamingService | this_TargetPlatformReference_1= ruleTargetPlatformReference | this_ComponentArtefact_2= ruleComponentArtefact | this_TargetModelInclude_3= ruleTargetModelInclude )
            {
            // InternalDeployment.g:213:2: (this_NamingService_0= ruleNamingService | this_TargetPlatformReference_1= ruleTargetPlatformReference | this_ComponentArtefact_2= ruleComponentArtefact | this_TargetModelInclude_3= ruleTargetModelInclude )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDeployment.g:214:3: this_NamingService_0= ruleNamingService
                    {

                    			newCompositeNode(grammarAccess.getAbstractDeploymentElementAccess().getNamingServiceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamingService_0=ruleNamingService();

                    state._fsp--;


                    			current = this_NamingService_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployment.g:223:3: this_TargetPlatformReference_1= ruleTargetPlatformReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractDeploymentElementAccess().getTargetPlatformReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TargetPlatformReference_1=ruleTargetPlatformReference();

                    state._fsp--;


                    			current = this_TargetPlatformReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDeployment.g:232:3: this_ComponentArtefact_2= ruleComponentArtefact
                    {

                    			newCompositeNode(grammarAccess.getAbstractDeploymentElementAccess().getComponentArtefactParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentArtefact_2=ruleComponentArtefact();

                    state._fsp--;


                    			current = this_ComponentArtefact_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDeployment.g:241:3: this_TargetModelInclude_3= ruleTargetModelInclude
                    {

                    			newCompositeNode(grammarAccess.getAbstractDeploymentElementAccess().getTargetModelIncludeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TargetModelInclude_3=ruleTargetModelInclude();

                    state._fsp--;


                    			current = this_TargetModelInclude_3;
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
    // $ANTLR end "ruleAbstractDeploymentElement"


    // $ANTLR start "entryRuleEInt"
    // InternalDeployment.g:253:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDeployment.g:253:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDeployment.g:254:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDeployment.g:260:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDeployment.g:266:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDeployment.g:267:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDeployment.g:267:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDeployment.g:268:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDeployment.g:268:3: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDeployment.g:269:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_8); 

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


    // $ANTLR start "entryRuleEString"
    // InternalDeployment.g:286:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDeployment.g:286:47: (iv_ruleEString= ruleEString EOF )
            // InternalDeployment.g:287:2: iv_ruleEString= ruleEString EOF
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
    // InternalDeployment.g:293:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalDeployment.g:299:2: (this_STRING_0= RULE_STRING )
            // InternalDeployment.g:300:2: this_STRING_0= RULE_STRING
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


    // $ANTLR start "entryRuleFQN"
    // InternalDeployment.g:310:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalDeployment.g:310:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalDeployment.g:311:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalDeployment.g:317:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDeployment.g:323:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDeployment.g:324:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDeployment.g:324:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDeployment.g:325:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalDeployment.g:332:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDeployment.g:333:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleTargetModelInclude"
    // InternalDeployment.g:350:1: entryRuleTargetModelInclude returns [EObject current=null] : iv_ruleTargetModelInclude= ruleTargetModelInclude EOF ;
    public final EObject entryRuleTargetModelInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetModelInclude = null;


        try {
            // InternalDeployment.g:350:59: (iv_ruleTargetModelInclude= ruleTargetModelInclude EOF )
            // InternalDeployment.g:351:2: iv_ruleTargetModelInclude= ruleTargetModelInclude EOF
            {
             newCompositeNode(grammarAccess.getTargetModelIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetModelInclude=ruleTargetModelInclude();

            state._fsp--;

             current =iv_ruleTargetModelInclude; 
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
    // $ANTLR end "entryRuleTargetModelInclude"


    // $ANTLR start "ruleTargetModelInclude"
    // InternalDeployment.g:357:1: ruleTargetModelInclude returns [EObject current=null] : (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleEString ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleTargetModelInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDeployment.g:363:2: ( (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleEString ) ) (otherlv_2= ';' )? ) )
            // InternalDeployment.g:364:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleEString ) ) (otherlv_2= ';' )? )
            {
            // InternalDeployment.g:364:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleEString ) ) (otherlv_2= ';' )? )
            // InternalDeployment.g:365:3: otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleEString ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetModelIncludeAccess().getImportKeyword_0());
            		
            // InternalDeployment.g:369:3: ( (lv_importedNamespace_1_0= ruleEString ) )
            // InternalDeployment.g:370:4: (lv_importedNamespace_1_0= ruleEString )
            {
            // InternalDeployment.g:370:4: (lv_importedNamespace_1_0= ruleEString )
            // InternalDeployment.g:371:5: lv_importedNamespace_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTargetModelIncludeAccess().getImportedNamespaceEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_importedNamespace_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetModelIncludeRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.xtext.system.deployment.Deployment.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployment.g:388:3: (otherlv_2= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDeployment.g:389:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTargetModelIncludeAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleTargetModelInclude"


    // $ANTLR start "entryRuleTargetPlatformReference"
    // InternalDeployment.g:398:1: entryRuleTargetPlatformReference returns [EObject current=null] : iv_ruleTargetPlatformReference= ruleTargetPlatformReference EOF ;
    public final EObject entryRuleTargetPlatformReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetPlatformReference = null;


        try {
            // InternalDeployment.g:398:64: (iv_ruleTargetPlatformReference= ruleTargetPlatformReference EOF )
            // InternalDeployment.g:399:2: iv_ruleTargetPlatformReference= ruleTargetPlatformReference EOF
            {
             newCompositeNode(grammarAccess.getTargetPlatformReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetPlatformReference=ruleTargetPlatformReference();

            state._fsp--;

             current =iv_ruleTargetPlatformReference; 
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
    // $ANTLR end "entryRuleTargetPlatformReference"


    // $ANTLR start "ruleTargetPlatformReference"
    // InternalDeployment.g:405:1: ruleTargetPlatformReference returns [EObject current=null] : (otherlv_0= 'TargetPlatformReference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( ( ruleFQN ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) ) ) otherlv_9= '}' ) ;
    public final EObject ruleTargetPlatformReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject lv_directory_6_0 = null;

        EObject lv_login_7_0 = null;

        EObject lv_host_8_0 = null;



        	enterRule();

        try {
            // InternalDeployment.g:411:2: ( (otherlv_0= 'TargetPlatformReference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( ( ruleFQN ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) ) ) otherlv_9= '}' ) )
            // InternalDeployment.g:412:2: (otherlv_0= 'TargetPlatformReference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( ( ruleFQN ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) ) ) otherlv_9= '}' )
            {
            // InternalDeployment.g:412:2: (otherlv_0= 'TargetPlatformReference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( ( ruleFQN ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) ) ) otherlv_9= '}' )
            // InternalDeployment.g:413:3: otherlv_0= 'TargetPlatformReference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( ( ruleFQN ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetPlatformReferenceAccess().getTargetPlatformReferenceKeyword_0());
            		
            // InternalDeployment.g:417:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeployment.g:418:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeployment.g:418:4: (lv_name_1_0= RULE_ID )
            // InternalDeployment.g:419:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTargetPlatformReferenceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetPlatformReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTargetPlatformReferenceAccess().getUsingKeyword_2());
            		
            // InternalDeployment.g:439:3: ( ( ruleFQN ) )
            // InternalDeployment.g:440:4: ( ruleFQN )
            {
            // InternalDeployment.g:440:4: ( ruleFQN )
            // InternalDeployment.g:441:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetPlatformReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTargetPlatformReferenceAccess().getPlatformTargetPlatformDefinitionCrossReference_3_0());
            				
            pushFollow(FOLLOW_6);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getTargetPlatformReferenceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDeployment.g:459:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) ) )
            // InternalDeployment.g:460:4: ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) )
            {
            // InternalDeployment.g:460:4: ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) )
            // InternalDeployment.g:461:5: ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5());
            				
            // InternalDeployment.g:464:5: ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* )
            // InternalDeployment.g:465:6: ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )*
            {
            // InternalDeployment.g:465:6: ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )*
            loop7:
            do {
                int alt7=4;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 2) ) {
                    alt7=3;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDeployment.g:466:4: ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) )
            	    {
            	    // InternalDeployment.g:466:4: ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) )
            	    // InternalDeployment.g:467:5: {...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTargetPlatformReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalDeployment.g:467:120: ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) )
            	    // InternalDeployment.g:468:6: ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalDeployment.g:471:9: ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) )
            	    // InternalDeployment.g:471:10: {...}? => ( (lv_directory_6_0= ruleUploadDirectory ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTargetPlatformReference", "true");
            	    }
            	    // InternalDeployment.g:471:19: ( (lv_directory_6_0= ruleUploadDirectory ) )
            	    // InternalDeployment.g:471:20: (lv_directory_6_0= ruleUploadDirectory )
            	    {
            	    // InternalDeployment.g:471:20: (lv_directory_6_0= ruleUploadDirectory )
            	    // InternalDeployment.g:472:10: lv_directory_6_0= ruleUploadDirectory
            	    {

            	    										newCompositeNode(grammarAccess.getTargetPlatformReferenceAccess().getDirectoryUploadDirectoryParserRuleCall_5_0_0());
            	    									
            	    pushFollow(FOLLOW_13);
            	    lv_directory_6_0=ruleUploadDirectory();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getTargetPlatformReferenceRule());
            	    										}
            	    										set(
            	    											current,
            	    											"directory",
            	    											lv_directory_6_0,
            	    											"org.xtext.system.deployment.Deployment.UploadDirectory");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDeployment.g:494:4: ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) )
            	    {
            	    // InternalDeployment.g:494:4: ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) )
            	    // InternalDeployment.g:495:5: {...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTargetPlatformReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalDeployment.g:495:120: ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) )
            	    // InternalDeployment.g:496:6: ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalDeployment.g:499:9: ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) )
            	    // InternalDeployment.g:499:10: {...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTargetPlatformReference", "true");
            	    }
            	    // InternalDeployment.g:499:19: ( (lv_login_7_0= ruleLoginAccountSelection ) )
            	    // InternalDeployment.g:499:20: (lv_login_7_0= ruleLoginAccountSelection )
            	    {
            	    // InternalDeployment.g:499:20: (lv_login_7_0= ruleLoginAccountSelection )
            	    // InternalDeployment.g:500:10: lv_login_7_0= ruleLoginAccountSelection
            	    {

            	    										newCompositeNode(grammarAccess.getTargetPlatformReferenceAccess().getLoginLoginAccountSelectionParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_13);
            	    lv_login_7_0=ruleLoginAccountSelection();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getTargetPlatformReferenceRule());
            	    										}
            	    										set(
            	    											current,
            	    											"login",
            	    											lv_login_7_0,
            	    											"org.xtext.system.deployment.Deployment.LoginAccountSelection");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDeployment.g:522:4: ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) )
            	    {
            	    // InternalDeployment.g:522:4: ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) )
            	    // InternalDeployment.g:523:5: {...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTargetPlatformReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalDeployment.g:523:120: ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) )
            	    // InternalDeployment.g:524:6: ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalDeployment.g:527:9: ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) )
            	    // InternalDeployment.g:527:10: {...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTargetPlatformReference", "true");
            	    }
            	    // InternalDeployment.g:527:19: ( (lv_host_8_0= ruleNetworkInterfaceSelection ) )
            	    // InternalDeployment.g:527:20: (lv_host_8_0= ruleNetworkInterfaceSelection )
            	    {
            	    // InternalDeployment.g:527:20: (lv_host_8_0= ruleNetworkInterfaceSelection )
            	    // InternalDeployment.g:528:10: lv_host_8_0= ruleNetworkInterfaceSelection
            	    {

            	    										newCompositeNode(grammarAccess.getTargetPlatformReferenceAccess().getHostNetworkInterfaceSelectionParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_13);
            	    lv_host_8_0=ruleNetworkInterfaceSelection();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getTargetPlatformReferenceRule());
            	    										}
            	    										set(
            	    											current,
            	    											"host",
            	    											lv_host_8_0,
            	    											"org.xtext.system.deployment.Deployment.NetworkInterfaceSelection");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5());
            				

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTargetPlatformReferenceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTargetPlatformReference"


    // $ANTLR start "entryRuleUploadDirectory"
    // InternalDeployment.g:565:1: entryRuleUploadDirectory returns [EObject current=null] : iv_ruleUploadDirectory= ruleUploadDirectory EOF ;
    public final EObject entryRuleUploadDirectory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUploadDirectory = null;


        try {
            // InternalDeployment.g:565:56: (iv_ruleUploadDirectory= ruleUploadDirectory EOF )
            // InternalDeployment.g:566:2: iv_ruleUploadDirectory= ruleUploadDirectory EOF
            {
             newCompositeNode(grammarAccess.getUploadDirectoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUploadDirectory=ruleUploadDirectory();

            state._fsp--;

             current =iv_ruleUploadDirectory; 
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
    // $ANTLR end "entryRuleUploadDirectory"


    // $ANTLR start "ruleUploadDirectory"
    // InternalDeployment.g:572:1: ruleUploadDirectory returns [EObject current=null] : (otherlv_0= 'UploadDirectory' ( (lv_path_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleUploadDirectory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;


        	enterRule();

        try {
            // InternalDeployment.g:578:2: ( (otherlv_0= 'UploadDirectory' ( (lv_path_1_0= RULE_STRING ) ) ) )
            // InternalDeployment.g:579:2: (otherlv_0= 'UploadDirectory' ( (lv_path_1_0= RULE_STRING ) ) )
            {
            // InternalDeployment.g:579:2: (otherlv_0= 'UploadDirectory' ( (lv_path_1_0= RULE_STRING ) ) )
            // InternalDeployment.g:580:3: otherlv_0= 'UploadDirectory' ( (lv_path_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUploadDirectoryAccess().getUploadDirectoryKeyword_0());
            		
            // InternalDeployment.g:584:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalDeployment.g:585:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalDeployment.g:585:4: (lv_path_1_0= RULE_STRING )
            // InternalDeployment.g:586:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_1_0, grammarAccess.getUploadDirectoryAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUploadDirectoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleUploadDirectory"


    // $ANTLR start "entryRuleLoginAccountSelection"
    // InternalDeployment.g:606:1: entryRuleLoginAccountSelection returns [EObject current=null] : iv_ruleLoginAccountSelection= ruleLoginAccountSelection EOF ;
    public final EObject entryRuleLoginAccountSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoginAccountSelection = null;


        try {
            // InternalDeployment.g:606:62: (iv_ruleLoginAccountSelection= ruleLoginAccountSelection EOF )
            // InternalDeployment.g:607:2: iv_ruleLoginAccountSelection= ruleLoginAccountSelection EOF
            {
             newCompositeNode(grammarAccess.getLoginAccountSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoginAccountSelection=ruleLoginAccountSelection();

            state._fsp--;

             current =iv_ruleLoginAccountSelection; 
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
    // $ANTLR end "entryRuleLoginAccountSelection"


    // $ANTLR start "ruleLoginAccountSelection"
    // InternalDeployment.g:613:1: ruleLoginAccountSelection returns [EObject current=null] : (otherlv_0= 'LoginAccount' ( ( ruleFQN ) ) ) ;
    public final EObject ruleLoginAccountSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDeployment.g:619:2: ( (otherlv_0= 'LoginAccount' ( ( ruleFQN ) ) ) )
            // InternalDeployment.g:620:2: (otherlv_0= 'LoginAccount' ( ( ruleFQN ) ) )
            {
            // InternalDeployment.g:620:2: (otherlv_0= 'LoginAccount' ( ( ruleFQN ) ) )
            // InternalDeployment.g:621:3: otherlv_0= 'LoginAccount' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLoginAccountSelectionAccess().getLoginAccountKeyword_0());
            		
            // InternalDeployment.g:625:3: ( ( ruleFQN ) )
            // InternalDeployment.g:626:4: ( ruleFQN )
            {
            // InternalDeployment.g:626:4: ( ruleFQN )
            // InternalDeployment.g:627:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoginAccountSelectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLoginAccountSelectionAccess().getLoginLoginAccountCrossReference_1_0());
            				
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
    // $ANTLR end "ruleLoginAccountSelection"


    // $ANTLR start "entryRuleNetworkInterfaceSelection"
    // InternalDeployment.g:645:1: entryRuleNetworkInterfaceSelection returns [EObject current=null] : iv_ruleNetworkInterfaceSelection= ruleNetworkInterfaceSelection EOF ;
    public final EObject entryRuleNetworkInterfaceSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkInterfaceSelection = null;


        try {
            // InternalDeployment.g:645:66: (iv_ruleNetworkInterfaceSelection= ruleNetworkInterfaceSelection EOF )
            // InternalDeployment.g:646:2: iv_ruleNetworkInterfaceSelection= ruleNetworkInterfaceSelection EOF
            {
             newCompositeNode(grammarAccess.getNetworkInterfaceSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkInterfaceSelection=ruleNetworkInterfaceSelection();

            state._fsp--;

             current =iv_ruleNetworkInterfaceSelection; 
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
    // $ANTLR end "entryRuleNetworkInterfaceSelection"


    // $ANTLR start "ruleNetworkInterfaceSelection"
    // InternalDeployment.g:652:1: ruleNetworkInterfaceSelection returns [EObject current=null] : (otherlv_0= 'NetworkInterface' ( ( ruleFQN ) ) ) ;
    public final EObject ruleNetworkInterfaceSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDeployment.g:658:2: ( (otherlv_0= 'NetworkInterface' ( ( ruleFQN ) ) ) )
            // InternalDeployment.g:659:2: (otherlv_0= 'NetworkInterface' ( ( ruleFQN ) ) )
            {
            // InternalDeployment.g:659:2: (otherlv_0= 'NetworkInterface' ( ( ruleFQN ) ) )
            // InternalDeployment.g:660:3: otherlv_0= 'NetworkInterface' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkInterfaceKeyword_0());
            		
            // InternalDeployment.g:664:3: ( ( ruleFQN ) )
            // InternalDeployment.g:665:4: ( ruleFQN )
            {
            // InternalDeployment.g:665:4: ( ruleFQN )
            // InternalDeployment.g:666:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkInterfaceSelectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkNetworkInterfaceCrossReference_1_0());
            				
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
    // $ANTLR end "ruleNetworkInterfaceSelection"


    // $ANTLR start "entryRuleComponentArtefact"
    // InternalDeployment.g:684:1: entryRuleComponentArtefact returns [EObject current=null] : iv_ruleComponentArtefact= ruleComponentArtefact EOF ;
    public final EObject entryRuleComponentArtefact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentArtefact = null;


        try {
            // InternalDeployment.g:684:58: (iv_ruleComponentArtefact= ruleComponentArtefact EOF )
            // InternalDeployment.g:685:2: iv_ruleComponentArtefact= ruleComponentArtefact EOF
            {
             newCompositeNode(grammarAccess.getComponentArtefactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentArtefact=ruleComponentArtefact();

            state._fsp--;

             current =iv_ruleComponentArtefact; 
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
    // $ANTLR end "entryRuleComponentArtefact"


    // $ANTLR start "ruleComponentArtefact"
    // InternalDeployment.g:691:1: ruleComponentArtefact returns [EObject current=null] : (otherlv_0= 'ComponentArtefact' ( ( ruleFQN ) ) ( (lv_deploy_2_0= ruleDeployment ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleComponentArtefact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_deploy_2_0 = null;



        	enterRule();

        try {
            // InternalDeployment.g:697:2: ( (otherlv_0= 'ComponentArtefact' ( ( ruleFQN ) ) ( (lv_deploy_2_0= ruleDeployment ) )? (otherlv_3= ';' )? ) )
            // InternalDeployment.g:698:2: (otherlv_0= 'ComponentArtefact' ( ( ruleFQN ) ) ( (lv_deploy_2_0= ruleDeployment ) )? (otherlv_3= ';' )? )
            {
            // InternalDeployment.g:698:2: (otherlv_0= 'ComponentArtefact' ( ( ruleFQN ) ) ( (lv_deploy_2_0= ruleDeployment ) )? (otherlv_3= ';' )? )
            // InternalDeployment.g:699:3: otherlv_0= 'ComponentArtefact' ( ( ruleFQN ) ) ( (lv_deploy_2_0= ruleDeployment ) )? (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentArtefactAccess().getComponentArtefactKeyword_0());
            		
            // InternalDeployment.g:703:3: ( ( ruleFQN ) )
            // InternalDeployment.g:704:4: ( ruleFQN )
            {
            // InternalDeployment.g:704:4: ( ruleFQN )
            // InternalDeployment.g:705:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentArtefactRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentArtefactAccess().getComponentComponentInstanceCrossReference_1_0());
            				
            pushFollow(FOLLOW_14);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployment.g:719:3: ( (lv_deploy_2_0= ruleDeployment ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeployment.g:720:4: (lv_deploy_2_0= ruleDeployment )
                    {
                    // InternalDeployment.g:720:4: (lv_deploy_2_0= ruleDeployment )
                    // InternalDeployment.g:721:5: lv_deploy_2_0= ruleDeployment
                    {

                    					newCompositeNode(grammarAccess.getComponentArtefactAccess().getDeployDeploymentParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_deploy_2_0=ruleDeployment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentArtefactRule());
                    					}
                    					set(
                    						current,
                    						"deploy",
                    						lv_deploy_2_0,
                    						"org.xtext.system.deployment.Deployment.Deployment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDeployment.g:738:3: (otherlv_3= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeployment.g:739:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentArtefactAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleComponentArtefact"


    // $ANTLR start "entryRuleNamingService"
    // InternalDeployment.g:748:1: entryRuleNamingService returns [EObject current=null] : iv_ruleNamingService= ruleNamingService EOF ;
    public final EObject entryRuleNamingService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamingService = null;


        try {
            // InternalDeployment.g:748:54: (iv_ruleNamingService= ruleNamingService EOF )
            // InternalDeployment.g:749:2: iv_ruleNamingService= ruleNamingService EOF
            {
             newCompositeNode(grammarAccess.getNamingServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamingService=ruleNamingService();

            state._fsp--;

             current =iv_ruleNamingService; 
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
    // $ANTLR end "entryRuleNamingService"


    // $ANTLR start "ruleNamingService"
    // InternalDeployment.g:755:1: ruleNamingService returns [EObject current=null] : ( () otherlv_1= 'NamingService' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) ) ) otherlv_7= '}' ) ;
    public final EObject ruleNamingService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_portNr_5_0 = null;

        EObject lv_deploy_6_0 = null;



        	enterRule();

        try {
            // InternalDeployment.g:761:2: ( ( () otherlv_1= 'NamingService' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) ) ) otherlv_7= '}' ) )
            // InternalDeployment.g:762:2: ( () otherlv_1= 'NamingService' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) ) ) otherlv_7= '}' )
            {
            // InternalDeployment.g:762:2: ( () otherlv_1= 'NamingService' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) ) ) otherlv_7= '}' )
            // InternalDeployment.g:763:3: () otherlv_1= 'NamingService' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) ) ) otherlv_7= '}'
            {
            // InternalDeployment.g:763:3: ()
            // InternalDeployment.g:764:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamingServiceAccess().getNamingServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getNamingServiceAccess().getNamingServiceKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getNamingServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDeployment.g:778:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) ) )
            // InternalDeployment.g:779:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) )
            {
            // InternalDeployment.g:779:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) )
            // InternalDeployment.g:780:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3());
            				
            // InternalDeployment.g:783:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* )
            // InternalDeployment.g:784:6: ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )*
            {
            // InternalDeployment.g:784:6: ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 1) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDeployment.g:785:4: ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDeployment.g:785:4: ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) )
            	    // InternalDeployment.g:786:5: {...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNamingService", "getUnorderedGroupHelper().canSelect(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDeployment.g:786:110: ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) )
            	    // InternalDeployment.g:787:6: ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDeployment.g:790:9: ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) )
            	    // InternalDeployment.g:790:10: {...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNamingService", "true");
            	    }
            	    // InternalDeployment.g:790:19: (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) )
            	    // InternalDeployment.g:790:20: otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_16); 

            	    									newLeafNode(otherlv_4, grammarAccess.getNamingServiceAccess().getPortNrKeyword_3_0_0());
            	    								
            	    // InternalDeployment.g:794:9: ( (lv_portNr_5_0= ruleEInt ) )
            	    // InternalDeployment.g:795:10: (lv_portNr_5_0= ruleEInt )
            	    {
            	    // InternalDeployment.g:795:10: (lv_portNr_5_0= ruleEInt )
            	    // InternalDeployment.g:796:11: lv_portNr_5_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getNamingServiceAccess().getPortNrEIntParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_15);
            	    lv_portNr_5_0=ruleEInt();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNamingServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"portNr",
            	    												lv_portNr_5_0,
            	    												"org.xtext.system.deployment.Deployment.EInt");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDeployment.g:819:4: ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) )
            	    {
            	    // InternalDeployment.g:819:4: ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) )
            	    // InternalDeployment.g:820:5: {...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNamingService", "getUnorderedGroupHelper().canSelect(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDeployment.g:820:110: ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) )
            	    // InternalDeployment.g:821:6: ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDeployment.g:824:9: ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) )
            	    // InternalDeployment.g:824:10: {...}? => ( (lv_deploy_6_0= ruleDeployment ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNamingService", "true");
            	    }
            	    // InternalDeployment.g:824:19: ( (lv_deploy_6_0= ruleDeployment ) )
            	    // InternalDeployment.g:824:20: (lv_deploy_6_0= ruleDeployment )
            	    {
            	    // InternalDeployment.g:824:20: (lv_deploy_6_0= ruleDeployment )
            	    // InternalDeployment.g:825:10: lv_deploy_6_0= ruleDeployment
            	    {

            	    										newCompositeNode(grammarAccess.getNamingServiceAccess().getDeployDeploymentParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_deploy_6_0=ruleDeployment();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getNamingServiceRule());
            	    										}
            	    										set(
            	    											current,
            	    											"deploy",
            	    											lv_deploy_6_0,
            	    											"org.xtext.system.deployment.Deployment.Deployment");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3());
            				

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getNamingServiceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNamingService"


    // $ANTLR start "entryRuleDeployment"
    // InternalDeployment.g:862:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalDeployment.g:862:51: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalDeployment.g:863:2: iv_ruleDeployment= ruleDeployment EOF
            {
             newCompositeNode(grammarAccess.getDeploymentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeployment=ruleDeployment();

            state._fsp--;

             current =iv_ruleDeployment; 
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
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // InternalDeployment.g:869:1: ruleDeployment returns [EObject current=null] : (otherlv_0= 'deploy-to' ( ( ruleFQN ) ) ) ;
    public final EObject ruleDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDeployment.g:875:2: ( (otherlv_0= 'deploy-to' ( ( ruleFQN ) ) ) )
            // InternalDeployment.g:876:2: (otherlv_0= 'deploy-to' ( ( ruleFQN ) ) )
            {
            // InternalDeployment.g:876:2: (otherlv_0= 'deploy-to' ( ( ruleFQN ) ) )
            // InternalDeployment.g:877:3: otherlv_0= 'deploy-to' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeploymentAccess().getDeployToKeyword_0());
            		
            // InternalDeployment.g:881:3: ( ( ruleFQN ) )
            // InternalDeployment.g:882:4: ( ruleFQN )
            {
            // InternalDeployment.g:882:4: ( ruleFQN )
            // InternalDeployment.g:883:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeploymentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDeploymentAccess().getToTargetPlatformReferenceCrossReference_1_0());
            				
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
    // $ANTLR end "ruleDeployment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003148000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E08000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010020L});

}
