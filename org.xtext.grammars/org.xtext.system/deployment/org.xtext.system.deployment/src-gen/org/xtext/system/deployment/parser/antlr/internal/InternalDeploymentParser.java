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
    // InternalDeployment.g:79:1: entryRuleDeploymentModel returns [EObject current=null] : iv_ruleDeploymentModel= ruleDeploymentModel EOF ;
    public final EObject entryRuleDeploymentModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentModel = null;


        try {
            // InternalDeployment.g:79:56: (iv_ruleDeploymentModel= ruleDeploymentModel EOF )
            // InternalDeployment.g:80:2: iv_ruleDeploymentModel= ruleDeploymentModel EOF
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
    // InternalDeployment.g:86:1: ruleDeploymentModel returns [EObject current=null] : (otherlv_0= 'DeploymentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'using' otherlv_3= 'ComponentArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractDeploymentElement ) )* otherlv_7= '}' ) ;
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
            // InternalDeployment.g:92:2: ( (otherlv_0= 'DeploymentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'using' otherlv_3= 'ComponentArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractDeploymentElement ) )* otherlv_7= '}' ) )
            // InternalDeployment.g:93:2: (otherlv_0= 'DeploymentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'using' otherlv_3= 'ComponentArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractDeploymentElement ) )* otherlv_7= '}' )
            {
            // InternalDeployment.g:93:2: (otherlv_0= 'DeploymentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'using' otherlv_3= 'ComponentArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractDeploymentElement ) )* otherlv_7= '}' )
            // InternalDeployment.g:94:3: otherlv_0= 'DeploymentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'using' otherlv_3= 'ComponentArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractDeploymentElement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeploymentModelAccess().getDeploymentModelKeyword_0());
            		
            // InternalDeployment.g:98:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeployment.g:99:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeployment.g:99:4: (lv_name_1_0= RULE_ID )
            // InternalDeployment.g:100:5: lv_name_1_0= RULE_ID
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

            // InternalDeployment.g:116:3: (otherlv_2= 'using' otherlv_3= 'ComponentArchitecture' ( ( ruleFQN ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDeployment.g:117:4: otherlv_2= 'using' otherlv_3= 'ComponentArchitecture' ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeploymentModelAccess().getUsingKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeploymentModelAccess().getComponentArchitectureKeyword_2_1());
                    			
                    // InternalDeployment.g:125:4: ( ( ruleFQN ) )
                    // InternalDeployment.g:126:5: ( ruleFQN )
                    {
                    // InternalDeployment.g:126:5: ( ruleFQN )
                    // InternalDeployment.g:127:6: ruleFQN
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
            		
            // InternalDeployment.g:146:3: ( (lv_elements_6_0= ruleAbstractDeploymentElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18||LA2_0==20||(LA2_0>=24 && LA2_0<=25)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDeployment.g:147:4: (lv_elements_6_0= ruleAbstractDeploymentElement )
            	    {
            	    // InternalDeployment.g:147:4: (lv_elements_6_0= ruleAbstractDeploymentElement )
            	    // InternalDeployment.g:148:5: lv_elements_6_0= ruleAbstractDeploymentElement
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
    // InternalDeployment.g:173:1: entryRuleAbstractDeploymentElement returns [EObject current=null] : iv_ruleAbstractDeploymentElement= ruleAbstractDeploymentElement EOF ;
    public final EObject entryRuleAbstractDeploymentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDeploymentElement = null;


        try {
            // InternalDeployment.g:173:66: (iv_ruleAbstractDeploymentElement= ruleAbstractDeploymentElement EOF )
            // InternalDeployment.g:174:2: iv_ruleAbstractDeploymentElement= ruleAbstractDeploymentElement EOF
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
    // InternalDeployment.g:180:1: ruleAbstractDeploymentElement returns [EObject current=null] : (this_NamingService_0= ruleNamingService | this_TargetPlatformReference_1= ruleTargetPlatformReference | this_ComponentArtefact_2= ruleComponentArtefact | this_TargetModelInclude_3= ruleTargetModelInclude ) ;
    public final EObject ruleAbstractDeploymentElement() throws RecognitionException {
        EObject current = null;

        EObject this_NamingService_0 = null;

        EObject this_TargetPlatformReference_1 = null;

        EObject this_ComponentArtefact_2 = null;

        EObject this_TargetModelInclude_3 = null;



        	enterRule();

        try {
            // InternalDeployment.g:186:2: ( (this_NamingService_0= ruleNamingService | this_TargetPlatformReference_1= ruleTargetPlatformReference | this_ComponentArtefact_2= ruleComponentArtefact | this_TargetModelInclude_3= ruleTargetModelInclude ) )
            // InternalDeployment.g:187:2: (this_NamingService_0= ruleNamingService | this_TargetPlatformReference_1= ruleTargetPlatformReference | this_ComponentArtefact_2= ruleComponentArtefact | this_TargetModelInclude_3= ruleTargetModelInclude )
            {
            // InternalDeployment.g:187:2: (this_NamingService_0= ruleNamingService | this_TargetPlatformReference_1= ruleTargetPlatformReference | this_ComponentArtefact_2= ruleComponentArtefact | this_TargetModelInclude_3= ruleTargetModelInclude )
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
                    // InternalDeployment.g:188:3: this_NamingService_0= ruleNamingService
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
                    // InternalDeployment.g:197:3: this_TargetPlatformReference_1= ruleTargetPlatformReference
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
                    // InternalDeployment.g:206:3: this_ComponentArtefact_2= ruleComponentArtefact
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
                    // InternalDeployment.g:215:3: this_TargetModelInclude_3= ruleTargetModelInclude
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
    // InternalDeployment.g:227:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDeployment.g:227:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDeployment.g:228:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDeployment.g:234:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDeployment.g:240:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDeployment.g:241:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDeployment.g:241:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDeployment.g:242:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDeployment.g:242:3: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDeployment.g:243:4: kw= '-'
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
    // InternalDeployment.g:260:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDeployment.g:260:47: (iv_ruleEString= ruleEString EOF )
            // InternalDeployment.g:261:2: iv_ruleEString= ruleEString EOF
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
    // InternalDeployment.g:267:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalDeployment.g:273:2: (this_STRING_0= RULE_STRING )
            // InternalDeployment.g:274:2: this_STRING_0= RULE_STRING
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
    // InternalDeployment.g:284:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalDeployment.g:284:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalDeployment.g:285:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalDeployment.g:291:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDeployment.g:297:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDeployment.g:298:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDeployment.g:298:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDeployment.g:299:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalDeployment.g:306:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDeployment.g:307:4: kw= '.' this_ID_2= RULE_ID
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
    // InternalDeployment.g:324:1: entryRuleTargetModelInclude returns [EObject current=null] : iv_ruleTargetModelInclude= ruleTargetModelInclude EOF ;
    public final EObject entryRuleTargetModelInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetModelInclude = null;


        try {
            // InternalDeployment.g:324:59: (iv_ruleTargetModelInclude= ruleTargetModelInclude EOF )
            // InternalDeployment.g:325:2: iv_ruleTargetModelInclude= ruleTargetModelInclude EOF
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
    // InternalDeployment.g:331:1: ruleTargetModelInclude returns [EObject current=null] : (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleEString ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleTargetModelInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDeployment.g:337:2: ( (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleEString ) ) (otherlv_2= ';' )? ) )
            // InternalDeployment.g:338:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleEString ) ) (otherlv_2= ';' )? )
            {
            // InternalDeployment.g:338:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleEString ) ) (otherlv_2= ';' )? )
            // InternalDeployment.g:339:3: otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleEString ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetModelIncludeAccess().getImportKeyword_0());
            		
            // InternalDeployment.g:343:3: ( (lv_importedNamespace_1_0= ruleEString ) )
            // InternalDeployment.g:344:4: (lv_importedNamespace_1_0= ruleEString )
            {
            // InternalDeployment.g:344:4: (lv_importedNamespace_1_0= ruleEString )
            // InternalDeployment.g:345:5: lv_importedNamespace_1_0= ruleEString
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

            // InternalDeployment.g:362:3: (otherlv_2= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDeployment.g:363:4: otherlv_2= ';'
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
    // InternalDeployment.g:372:1: entryRuleTargetPlatformReference returns [EObject current=null] : iv_ruleTargetPlatformReference= ruleTargetPlatformReference EOF ;
    public final EObject entryRuleTargetPlatformReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetPlatformReference = null;


        try {
            // InternalDeployment.g:372:64: (iv_ruleTargetPlatformReference= ruleTargetPlatformReference EOF )
            // InternalDeployment.g:373:2: iv_ruleTargetPlatformReference= ruleTargetPlatformReference EOF
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
    // InternalDeployment.g:379:1: ruleTargetPlatformReference returns [EObject current=null] : (otherlv_0= 'TargetPlatformReference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( ( ruleFQN ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) ) ) otherlv_9= '}' ) ;
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
            // InternalDeployment.g:385:2: ( (otherlv_0= 'TargetPlatformReference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( ( ruleFQN ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) ) ) otherlv_9= '}' ) )
            // InternalDeployment.g:386:2: (otherlv_0= 'TargetPlatformReference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( ( ruleFQN ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) ) ) otherlv_9= '}' )
            {
            // InternalDeployment.g:386:2: (otherlv_0= 'TargetPlatformReference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( ( ruleFQN ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) ) ) otherlv_9= '}' )
            // InternalDeployment.g:387:3: otherlv_0= 'TargetPlatformReference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'using' ( ( ruleFQN ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetPlatformReferenceAccess().getTargetPlatformReferenceKeyword_0());
            		
            // InternalDeployment.g:391:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeployment.g:392:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeployment.g:392:4: (lv_name_1_0= RULE_ID )
            // InternalDeployment.g:393:5: lv_name_1_0= RULE_ID
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
            		
            // InternalDeployment.g:413:3: ( ( ruleFQN ) )
            // InternalDeployment.g:414:4: ( ruleFQN )
            {
            // InternalDeployment.g:414:4: ( ruleFQN )
            // InternalDeployment.g:415:5: ruleFQN
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
            		
            // InternalDeployment.g:433:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) ) )
            // InternalDeployment.g:434:4: ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) )
            {
            // InternalDeployment.g:434:4: ( ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* ) )
            // InternalDeployment.g:435:5: ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5());
            				
            // InternalDeployment.g:438:5: ( ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )* )
            // InternalDeployment.g:439:6: ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )*
            {
            // InternalDeployment.g:439:6: ( ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) ) )*
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
            	    // InternalDeployment.g:440:4: ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) )
            	    {
            	    // InternalDeployment.g:440:4: ({...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) ) )
            	    // InternalDeployment.g:441:5: {...}? => ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTargetPlatformReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalDeployment.g:441:120: ( ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) ) )
            	    // InternalDeployment.g:442:6: ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalDeployment.g:445:9: ({...}? => ( (lv_directory_6_0= ruleUploadDirectory ) ) )
            	    // InternalDeployment.g:445:10: {...}? => ( (lv_directory_6_0= ruleUploadDirectory ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTargetPlatformReference", "true");
            	    }
            	    // InternalDeployment.g:445:19: ( (lv_directory_6_0= ruleUploadDirectory ) )
            	    // InternalDeployment.g:445:20: (lv_directory_6_0= ruleUploadDirectory )
            	    {
            	    // InternalDeployment.g:445:20: (lv_directory_6_0= ruleUploadDirectory )
            	    // InternalDeployment.g:446:10: lv_directory_6_0= ruleUploadDirectory
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
            	    // InternalDeployment.g:468:4: ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) )
            	    {
            	    // InternalDeployment.g:468:4: ({...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) ) )
            	    // InternalDeployment.g:469:5: {...}? => ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTargetPlatformReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalDeployment.g:469:120: ( ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) ) )
            	    // InternalDeployment.g:470:6: ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalDeployment.g:473:9: ({...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) ) )
            	    // InternalDeployment.g:473:10: {...}? => ( (lv_login_7_0= ruleLoginAccountSelection ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTargetPlatformReference", "true");
            	    }
            	    // InternalDeployment.g:473:19: ( (lv_login_7_0= ruleLoginAccountSelection ) )
            	    // InternalDeployment.g:473:20: (lv_login_7_0= ruleLoginAccountSelection )
            	    {
            	    // InternalDeployment.g:473:20: (lv_login_7_0= ruleLoginAccountSelection )
            	    // InternalDeployment.g:474:10: lv_login_7_0= ruleLoginAccountSelection
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
            	    // InternalDeployment.g:496:4: ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) )
            	    {
            	    // InternalDeployment.g:496:4: ({...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) ) )
            	    // InternalDeployment.g:497:5: {...}? => ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTargetPlatformReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalDeployment.g:497:120: ( ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) ) )
            	    // InternalDeployment.g:498:6: ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTargetPlatformReferenceAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalDeployment.g:501:9: ({...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) ) )
            	    // InternalDeployment.g:501:10: {...}? => ( (lv_host_8_0= ruleNetworkInterfaceSelection ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTargetPlatformReference", "true");
            	    }
            	    // InternalDeployment.g:501:19: ( (lv_host_8_0= ruleNetworkInterfaceSelection ) )
            	    // InternalDeployment.g:501:20: (lv_host_8_0= ruleNetworkInterfaceSelection )
            	    {
            	    // InternalDeployment.g:501:20: (lv_host_8_0= ruleNetworkInterfaceSelection )
            	    // InternalDeployment.g:502:10: lv_host_8_0= ruleNetworkInterfaceSelection
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
    // InternalDeployment.g:539:1: entryRuleUploadDirectory returns [EObject current=null] : iv_ruleUploadDirectory= ruleUploadDirectory EOF ;
    public final EObject entryRuleUploadDirectory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUploadDirectory = null;


        try {
            // InternalDeployment.g:539:56: (iv_ruleUploadDirectory= ruleUploadDirectory EOF )
            // InternalDeployment.g:540:2: iv_ruleUploadDirectory= ruleUploadDirectory EOF
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
    // InternalDeployment.g:546:1: ruleUploadDirectory returns [EObject current=null] : (otherlv_0= 'UploadDirectory' ( (lv_path_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleUploadDirectory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;


        	enterRule();

        try {
            // InternalDeployment.g:552:2: ( (otherlv_0= 'UploadDirectory' ( (lv_path_1_0= RULE_STRING ) ) ) )
            // InternalDeployment.g:553:2: (otherlv_0= 'UploadDirectory' ( (lv_path_1_0= RULE_STRING ) ) )
            {
            // InternalDeployment.g:553:2: (otherlv_0= 'UploadDirectory' ( (lv_path_1_0= RULE_STRING ) ) )
            // InternalDeployment.g:554:3: otherlv_0= 'UploadDirectory' ( (lv_path_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUploadDirectoryAccess().getUploadDirectoryKeyword_0());
            		
            // InternalDeployment.g:558:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalDeployment.g:559:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalDeployment.g:559:4: (lv_path_1_0= RULE_STRING )
            // InternalDeployment.g:560:5: lv_path_1_0= RULE_STRING
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
    // InternalDeployment.g:580:1: entryRuleLoginAccountSelection returns [EObject current=null] : iv_ruleLoginAccountSelection= ruleLoginAccountSelection EOF ;
    public final EObject entryRuleLoginAccountSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoginAccountSelection = null;


        try {
            // InternalDeployment.g:580:62: (iv_ruleLoginAccountSelection= ruleLoginAccountSelection EOF )
            // InternalDeployment.g:581:2: iv_ruleLoginAccountSelection= ruleLoginAccountSelection EOF
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
    // InternalDeployment.g:587:1: ruleLoginAccountSelection returns [EObject current=null] : (otherlv_0= 'LoginAccount' ( ( ruleFQN ) ) ) ;
    public final EObject ruleLoginAccountSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDeployment.g:593:2: ( (otherlv_0= 'LoginAccount' ( ( ruleFQN ) ) ) )
            // InternalDeployment.g:594:2: (otherlv_0= 'LoginAccount' ( ( ruleFQN ) ) )
            {
            // InternalDeployment.g:594:2: (otherlv_0= 'LoginAccount' ( ( ruleFQN ) ) )
            // InternalDeployment.g:595:3: otherlv_0= 'LoginAccount' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLoginAccountSelectionAccess().getLoginAccountKeyword_0());
            		
            // InternalDeployment.g:599:3: ( ( ruleFQN ) )
            // InternalDeployment.g:600:4: ( ruleFQN )
            {
            // InternalDeployment.g:600:4: ( ruleFQN )
            // InternalDeployment.g:601:5: ruleFQN
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
    // InternalDeployment.g:619:1: entryRuleNetworkInterfaceSelection returns [EObject current=null] : iv_ruleNetworkInterfaceSelection= ruleNetworkInterfaceSelection EOF ;
    public final EObject entryRuleNetworkInterfaceSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkInterfaceSelection = null;


        try {
            // InternalDeployment.g:619:66: (iv_ruleNetworkInterfaceSelection= ruleNetworkInterfaceSelection EOF )
            // InternalDeployment.g:620:2: iv_ruleNetworkInterfaceSelection= ruleNetworkInterfaceSelection EOF
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
    // InternalDeployment.g:626:1: ruleNetworkInterfaceSelection returns [EObject current=null] : (otherlv_0= 'NetworkInterface' ( ( ruleFQN ) ) ) ;
    public final EObject ruleNetworkInterfaceSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDeployment.g:632:2: ( (otherlv_0= 'NetworkInterface' ( ( ruleFQN ) ) ) )
            // InternalDeployment.g:633:2: (otherlv_0= 'NetworkInterface' ( ( ruleFQN ) ) )
            {
            // InternalDeployment.g:633:2: (otherlv_0= 'NetworkInterface' ( ( ruleFQN ) ) )
            // InternalDeployment.g:634:3: otherlv_0= 'NetworkInterface' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkInterfaceSelectionAccess().getNetworkInterfaceKeyword_0());
            		
            // InternalDeployment.g:638:3: ( ( ruleFQN ) )
            // InternalDeployment.g:639:4: ( ruleFQN )
            {
            // InternalDeployment.g:639:4: ( ruleFQN )
            // InternalDeployment.g:640:5: ruleFQN
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
    // InternalDeployment.g:658:1: entryRuleComponentArtefact returns [EObject current=null] : iv_ruleComponentArtefact= ruleComponentArtefact EOF ;
    public final EObject entryRuleComponentArtefact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentArtefact = null;


        try {
            // InternalDeployment.g:658:58: (iv_ruleComponentArtefact= ruleComponentArtefact EOF )
            // InternalDeployment.g:659:2: iv_ruleComponentArtefact= ruleComponentArtefact EOF
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
    // InternalDeployment.g:665:1: ruleComponentArtefact returns [EObject current=null] : (otherlv_0= 'ComponentArtefact' ( ( ruleFQN ) ) ( (lv_deploy_2_0= ruleDeployment ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleComponentArtefact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_deploy_2_0 = null;



        	enterRule();

        try {
            // InternalDeployment.g:671:2: ( (otherlv_0= 'ComponentArtefact' ( ( ruleFQN ) ) ( (lv_deploy_2_0= ruleDeployment ) )? (otherlv_3= ';' )? ) )
            // InternalDeployment.g:672:2: (otherlv_0= 'ComponentArtefact' ( ( ruleFQN ) ) ( (lv_deploy_2_0= ruleDeployment ) )? (otherlv_3= ';' )? )
            {
            // InternalDeployment.g:672:2: (otherlv_0= 'ComponentArtefact' ( ( ruleFQN ) ) ( (lv_deploy_2_0= ruleDeployment ) )? (otherlv_3= ';' )? )
            // InternalDeployment.g:673:3: otherlv_0= 'ComponentArtefact' ( ( ruleFQN ) ) ( (lv_deploy_2_0= ruleDeployment ) )? (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentArtefactAccess().getComponentArtefactKeyword_0());
            		
            // InternalDeployment.g:677:3: ( ( ruleFQN ) )
            // InternalDeployment.g:678:4: ( ruleFQN )
            {
            // InternalDeployment.g:678:4: ( ruleFQN )
            // InternalDeployment.g:679:5: ruleFQN
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

            // InternalDeployment.g:693:3: ( (lv_deploy_2_0= ruleDeployment ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeployment.g:694:4: (lv_deploy_2_0= ruleDeployment )
                    {
                    // InternalDeployment.g:694:4: (lv_deploy_2_0= ruleDeployment )
                    // InternalDeployment.g:695:5: lv_deploy_2_0= ruleDeployment
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

            // InternalDeployment.g:712:3: (otherlv_3= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeployment.g:713:4: otherlv_3= ';'
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
    // InternalDeployment.g:722:1: entryRuleNamingService returns [EObject current=null] : iv_ruleNamingService= ruleNamingService EOF ;
    public final EObject entryRuleNamingService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamingService = null;


        try {
            // InternalDeployment.g:722:54: (iv_ruleNamingService= ruleNamingService EOF )
            // InternalDeployment.g:723:2: iv_ruleNamingService= ruleNamingService EOF
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
    // InternalDeployment.g:729:1: ruleNamingService returns [EObject current=null] : ( () otherlv_1= 'NamingService' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) ) ) otherlv_7= '}' ) ;
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
            // InternalDeployment.g:735:2: ( ( () otherlv_1= 'NamingService' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) ) ) otherlv_7= '}' ) )
            // InternalDeployment.g:736:2: ( () otherlv_1= 'NamingService' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) ) ) otherlv_7= '}' )
            {
            // InternalDeployment.g:736:2: ( () otherlv_1= 'NamingService' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) ) ) otherlv_7= '}' )
            // InternalDeployment.g:737:3: () otherlv_1= 'NamingService' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) ) ) otherlv_7= '}'
            {
            // InternalDeployment.g:737:3: ()
            // InternalDeployment.g:738:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamingServiceAccess().getNamingServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getNamingServiceAccess().getNamingServiceKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getNamingServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDeployment.g:752:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) ) )
            // InternalDeployment.g:753:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) )
            {
            // InternalDeployment.g:753:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* ) )
            // InternalDeployment.g:754:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3());
            				
            // InternalDeployment.g:757:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )* )
            // InternalDeployment.g:758:6: ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )*
            {
            // InternalDeployment.g:758:6: ( ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) ) )*
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
            	    // InternalDeployment.g:759:4: ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalDeployment.g:759:4: ({...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) ) )
            	    // InternalDeployment.g:760:5: {...}? => ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNamingService", "getUnorderedGroupHelper().canSelect(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDeployment.g:760:110: ( ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) ) )
            	    // InternalDeployment.g:761:6: ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDeployment.g:764:9: ({...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) ) )
            	    // InternalDeployment.g:764:10: {...}? => (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNamingService", "true");
            	    }
            	    // InternalDeployment.g:764:19: (otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) ) )
            	    // InternalDeployment.g:764:20: otherlv_4= 'portNr' ( (lv_portNr_5_0= ruleEInt ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_16); 

            	    									newLeafNode(otherlv_4, grammarAccess.getNamingServiceAccess().getPortNrKeyword_3_0_0());
            	    								
            	    // InternalDeployment.g:768:9: ( (lv_portNr_5_0= ruleEInt ) )
            	    // InternalDeployment.g:769:10: (lv_portNr_5_0= ruleEInt )
            	    {
            	    // InternalDeployment.g:769:10: (lv_portNr_5_0= ruleEInt )
            	    // InternalDeployment.g:770:11: lv_portNr_5_0= ruleEInt
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
            	    // InternalDeployment.g:793:4: ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) )
            	    {
            	    // InternalDeployment.g:793:4: ({...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) ) )
            	    // InternalDeployment.g:794:5: {...}? => ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNamingService", "getUnorderedGroupHelper().canSelect(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDeployment.g:794:110: ( ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) ) )
            	    // InternalDeployment.g:795:6: ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNamingServiceAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDeployment.g:798:9: ({...}? => ( (lv_deploy_6_0= ruleDeployment ) ) )
            	    // InternalDeployment.g:798:10: {...}? => ( (lv_deploy_6_0= ruleDeployment ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNamingService", "true");
            	    }
            	    // InternalDeployment.g:798:19: ( (lv_deploy_6_0= ruleDeployment ) )
            	    // InternalDeployment.g:798:20: (lv_deploy_6_0= ruleDeployment )
            	    {
            	    // InternalDeployment.g:798:20: (lv_deploy_6_0= ruleDeployment )
            	    // InternalDeployment.g:799:10: lv_deploy_6_0= ruleDeployment
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
    // InternalDeployment.g:836:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalDeployment.g:836:51: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalDeployment.g:837:2: iv_ruleDeployment= ruleDeployment EOF
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
    // InternalDeployment.g:843:1: ruleDeployment returns [EObject current=null] : (otherlv_0= 'deploy-to' ( ( ruleFQN ) ) ) ;
    public final EObject ruleDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDeployment.g:849:2: ( (otherlv_0= 'deploy-to' ( ( ruleFQN ) ) ) )
            // InternalDeployment.g:850:2: (otherlv_0= 'deploy-to' ( ( ruleFQN ) ) )
            {
            // InternalDeployment.g:850:2: (otherlv_0= 'deploy-to' ( ( ruleFQN ) ) )
            // InternalDeployment.g:851:3: otherlv_0= 'deploy-to' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeploymentAccess().getDeployToKeyword_0());
            		
            // InternalDeployment.g:855:3: ( ( ruleFQN ) )
            // InternalDeployment.g:856:4: ( ruleFQN )
            {
            // InternalDeployment.g:856:4: ( ruleFQN )
            // InternalDeployment.g:857:5: ruleFQN
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
