package org.xtext.system.targetPlatform.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.system.targetPlatform.services.TargetPlatformGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTargetPlatformParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_DOCU_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TargetPlatformModel'", "'{'", "'}'", "'NetworkConnection'", "'<->'", "'kind'", "'TargetPlatformDefinition'", "'Windows'", "';'", "'Linux'", "'MacOS'", "'NetworkInterface'", "'HostAddress'", "':'", "'Kind'", "'CPU'", "'CoresTally'", "'LoginAccount'", "'FullName'", "'Email'", "'TargetMiddleware'", "'.'", "'-'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'"
    };
    public static final int RULE_ML_DOCUMENTATION=8;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_SL_DOCUMENTATION=10;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_DOCU_COMMENT=11;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTargetPlatformParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTargetPlatformParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTargetPlatformParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTargetPlatform.g"; }



     	private TargetPlatformGrammarAccess grammarAccess;

        public InternalTargetPlatformParser(TokenStream input, TargetPlatformGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TargetPlatformModel";
       	}

       	@Override
       	protected TargetPlatformGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTargetPlatformModel"
    // InternalTargetPlatform.g:79:1: entryRuleTargetPlatformModel returns [EObject current=null] : iv_ruleTargetPlatformModel= ruleTargetPlatformModel EOF ;
    public final EObject entryRuleTargetPlatformModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetPlatformModel = null;


        try {
            // InternalTargetPlatform.g:79:60: (iv_ruleTargetPlatformModel= ruleTargetPlatformModel EOF )
            // InternalTargetPlatform.g:80:2: iv_ruleTargetPlatformModel= ruleTargetPlatformModel EOF
            {
             newCompositeNode(grammarAccess.getTargetPlatformModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetPlatformModel=ruleTargetPlatformModel();

            state._fsp--;

             current =iv_ruleTargetPlatformModel; 
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
    // $ANTLR end "entryRuleTargetPlatformModel"


    // $ANTLR start "ruleTargetPlatformModel"
    // InternalTargetPlatform.g:86:1: ruleTargetPlatformModel returns [EObject current=null] : (otherlv_0= 'TargetPlatformModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractTPElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleTargetPlatformModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalTargetPlatform.g:92:2: ( (otherlv_0= 'TargetPlatformModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractTPElement ) )* otherlv_4= '}' ) )
            // InternalTargetPlatform.g:93:2: (otherlv_0= 'TargetPlatformModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractTPElement ) )* otherlv_4= '}' )
            {
            // InternalTargetPlatform.g:93:2: (otherlv_0= 'TargetPlatformModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractTPElement ) )* otherlv_4= '}' )
            // InternalTargetPlatform.g:94:3: otherlv_0= 'TargetPlatformModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractTPElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetPlatformModelAccess().getTargetPlatformModelKeyword_0());
            		
            // InternalTargetPlatform.g:98:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTargetPlatform.g:99:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTargetPlatform.g:99:4: (lv_name_1_0= RULE_ID )
            // InternalTargetPlatform.g:100:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTargetPlatformModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetPlatformModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTargetPlatformModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTargetPlatform.g:120:3: ( (lv_elements_3_0= ruleAbstractTPElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTargetPlatform.g:121:4: (lv_elements_3_0= ruleAbstractTPElement )
            	    {
            	    // InternalTargetPlatform.g:121:4: (lv_elements_3_0= ruleAbstractTPElement )
            	    // InternalTargetPlatform.g:122:5: lv_elements_3_0= ruleAbstractTPElement
            	    {

            	    					newCompositeNode(grammarAccess.getTargetPlatformModelAccess().getElementsAbstractTPElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_3_0=ruleAbstractTPElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTargetPlatformModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.xtext.system.targetPlatform.TargetPlatform.AbstractTPElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTargetPlatformModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTargetPlatformModel"


    // $ANTLR start "entryRuleAbstractTPElement"
    // InternalTargetPlatform.g:147:1: entryRuleAbstractTPElement returns [EObject current=null] : iv_ruleAbstractTPElement= ruleAbstractTPElement EOF ;
    public final EObject entryRuleAbstractTPElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTPElement = null;


        try {
            // InternalTargetPlatform.g:147:58: (iv_ruleAbstractTPElement= ruleAbstractTPElement EOF )
            // InternalTargetPlatform.g:148:2: iv_ruleAbstractTPElement= ruleAbstractTPElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractTPElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractTPElement=ruleAbstractTPElement();

            state._fsp--;

             current =iv_ruleAbstractTPElement; 
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
    // $ANTLR end "entryRuleAbstractTPElement"


    // $ANTLR start "ruleAbstractTPElement"
    // InternalTargetPlatform.g:154:1: ruleAbstractTPElement returns [EObject current=null] : (this_TargetPlatformDefinition_0= ruleTargetPlatformDefinition | this_NetworkConnection_1= ruleNetworkConnection ) ;
    public final EObject ruleAbstractTPElement() throws RecognitionException {
        EObject current = null;

        EObject this_TargetPlatformDefinition_0 = null;

        EObject this_NetworkConnection_1 = null;



        	enterRule();

        try {
            // InternalTargetPlatform.g:160:2: ( (this_TargetPlatformDefinition_0= ruleTargetPlatformDefinition | this_NetworkConnection_1= ruleNetworkConnection ) )
            // InternalTargetPlatform.g:161:2: (this_TargetPlatformDefinition_0= ruleTargetPlatformDefinition | this_NetworkConnection_1= ruleNetworkConnection )
            {
            // InternalTargetPlatform.g:161:2: (this_TargetPlatformDefinition_0= ruleTargetPlatformDefinition | this_NetworkConnection_1= ruleNetworkConnection )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTargetPlatform.g:162:3: this_TargetPlatformDefinition_0= ruleTargetPlatformDefinition
                    {

                    			newCompositeNode(grammarAccess.getAbstractTPElementAccess().getTargetPlatformDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TargetPlatformDefinition_0=ruleTargetPlatformDefinition();

                    state._fsp--;


                    			current = this_TargetPlatformDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTargetPlatform.g:171:3: this_NetworkConnection_1= ruleNetworkConnection
                    {

                    			newCompositeNode(grammarAccess.getAbstractTPElementAccess().getNetworkConnectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NetworkConnection_1=ruleNetworkConnection();

                    state._fsp--;


                    			current = this_NetworkConnection_1;
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
    // $ANTLR end "ruleAbstractTPElement"


    // $ANTLR start "entryRuleNetworkConnection"
    // InternalTargetPlatform.g:183:1: entryRuleNetworkConnection returns [EObject current=null] : iv_ruleNetworkConnection= ruleNetworkConnection EOF ;
    public final EObject entryRuleNetworkConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnection = null;


        try {
            // InternalTargetPlatform.g:183:58: (iv_ruleNetworkConnection= ruleNetworkConnection EOF )
            // InternalTargetPlatform.g:184:2: iv_ruleNetworkConnection= ruleNetworkConnection EOF
            {
             newCompositeNode(grammarAccess.getNetworkConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkConnection=ruleNetworkConnection();

            state._fsp--;

             current =iv_ruleNetworkConnection; 
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
    // $ANTLR end "entryRuleNetworkConnection"


    // $ANTLR start "ruleNetworkConnection"
    // InternalTargetPlatform.g:190:1: ruleNetworkConnection returns [EObject current=null] : (otherlv_0= 'NetworkConnection' otherlv_1= '{' ( ( ruleFQN ) ) otherlv_3= '<->' ( ( ruleFQN ) ) (otherlv_5= 'kind' ( (lv_kind_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleNetworkConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_kind_6_0 = null;



        	enterRule();

        try {
            // InternalTargetPlatform.g:196:2: ( (otherlv_0= 'NetworkConnection' otherlv_1= '{' ( ( ruleFQN ) ) otherlv_3= '<->' ( ( ruleFQN ) ) (otherlv_5= 'kind' ( (lv_kind_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalTargetPlatform.g:197:2: (otherlv_0= 'NetworkConnection' otherlv_1= '{' ( ( ruleFQN ) ) otherlv_3= '<->' ( ( ruleFQN ) ) (otherlv_5= 'kind' ( (lv_kind_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalTargetPlatform.g:197:2: (otherlv_0= 'NetworkConnection' otherlv_1= '{' ( ( ruleFQN ) ) otherlv_3= '<->' ( ( ruleFQN ) ) (otherlv_5= 'kind' ( (lv_kind_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalTargetPlatform.g:198:3: otherlv_0= 'NetworkConnection' otherlv_1= '{' ( ( ruleFQN ) ) otherlv_3= '<->' ( ( ruleFQN ) ) (otherlv_5= 'kind' ( (lv_kind_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkConnectionAccess().getNetworkConnectionKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkConnectionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTargetPlatform.g:206:3: ( ( ruleFQN ) )
            // InternalTargetPlatform.g:207:4: ( ruleFQN )
            {
            // InternalTargetPlatform.g:207:4: ( ruleFQN )
            // InternalTargetPlatform.g:208:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNetworkConnectionAccess().getEndpoint1NetworkInterfaceCrossReference_2_0());
            				
            pushFollow(FOLLOW_6);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getNetworkConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalTargetPlatform.g:226:3: ( ( ruleFQN ) )
            // InternalTargetPlatform.g:227:4: ( ruleFQN )
            {
            // InternalTargetPlatform.g:227:4: ( ruleFQN )
            // InternalTargetPlatform.g:228:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNetworkConnectionAccess().getEndpoint2NetworkInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTargetPlatform.g:242:3: (otherlv_5= 'kind' ( (lv_kind_6_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTargetPlatform.g:243:4: otherlv_5= 'kind' ( (lv_kind_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getNetworkConnectionAccess().getKindKeyword_5_0());
                    			
                    // InternalTargetPlatform.g:247:4: ( (lv_kind_6_0= ruleEString ) )
                    // InternalTargetPlatform.g:248:5: (lv_kind_6_0= ruleEString )
                    {
                    // InternalTargetPlatform.g:248:5: (lv_kind_6_0= ruleEString )
                    // InternalTargetPlatform.g:249:6: lv_kind_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNetworkConnectionAccess().getKindEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_kind_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetworkConnectionRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_6_0,
                    							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getNetworkConnectionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleNetworkConnection"


    // $ANTLR start "entryRuleTargetPlatformDefinition"
    // InternalTargetPlatform.g:275:1: entryRuleTargetPlatformDefinition returns [EObject current=null] : iv_ruleTargetPlatformDefinition= ruleTargetPlatformDefinition EOF ;
    public final EObject entryRuleTargetPlatformDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetPlatformDefinition = null;


        try {
            // InternalTargetPlatform.g:275:65: (iv_ruleTargetPlatformDefinition= ruleTargetPlatformDefinition EOF )
            // InternalTargetPlatform.g:276:2: iv_ruleTargetPlatformDefinition= ruleTargetPlatformDefinition EOF
            {
             newCompositeNode(grammarAccess.getTargetPlatformDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetPlatformDefinition=ruleTargetPlatformDefinition();

            state._fsp--;

             current =iv_ruleTargetPlatformDefinition; 
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
    // $ANTLR end "entryRuleTargetPlatformDefinition"


    // $ANTLR start "ruleTargetPlatformDefinition"
    // InternalTargetPlatform.g:282:1: ruleTargetPlatformDefinition returns [EObject current=null] : (otherlv_0= 'TargetPlatformDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_os_3_0= ruleOperatingSystem ) )? ( (lv_elements_4_0= ruleAbstractTPSubNode ) )* otherlv_5= '}' ) ;
    public final EObject ruleTargetPlatformDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_os_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalTargetPlatform.g:288:2: ( (otherlv_0= 'TargetPlatformDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_os_3_0= ruleOperatingSystem ) )? ( (lv_elements_4_0= ruleAbstractTPSubNode ) )* otherlv_5= '}' ) )
            // InternalTargetPlatform.g:289:2: (otherlv_0= 'TargetPlatformDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_os_3_0= ruleOperatingSystem ) )? ( (lv_elements_4_0= ruleAbstractTPSubNode ) )* otherlv_5= '}' )
            {
            // InternalTargetPlatform.g:289:2: (otherlv_0= 'TargetPlatformDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_os_3_0= ruleOperatingSystem ) )? ( (lv_elements_4_0= ruleAbstractTPSubNode ) )* otherlv_5= '}' )
            // InternalTargetPlatform.g:290:3: otherlv_0= 'TargetPlatformDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_os_3_0= ruleOperatingSystem ) )? ( (lv_elements_4_0= ruleAbstractTPSubNode ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetPlatformDefinitionAccess().getTargetPlatformDefinitionKeyword_0());
            		
            // InternalTargetPlatform.g:294:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTargetPlatform.g:295:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTargetPlatform.g:295:4: (lv_name_1_0= RULE_ID )
            // InternalTargetPlatform.g:296:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTargetPlatformDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetPlatformDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTargetPlatformDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTargetPlatform.g:316:3: ( (lv_os_3_0= ruleOperatingSystem ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21||(LA4_0>=23 && LA4_0<=24)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTargetPlatform.g:317:4: (lv_os_3_0= ruleOperatingSystem )
                    {
                    // InternalTargetPlatform.g:317:4: (lv_os_3_0= ruleOperatingSystem )
                    // InternalTargetPlatform.g:318:5: lv_os_3_0= ruleOperatingSystem
                    {

                    					newCompositeNode(grammarAccess.getTargetPlatformDefinitionAccess().getOsOperatingSystemParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_os_3_0=ruleOperatingSystem();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTargetPlatformDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"os",
                    						lv_os_3_0,
                    						"org.xtext.system.targetPlatform.TargetPlatform.OperatingSystem");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTargetPlatform.g:335:3: ( (lv_elements_4_0= ruleAbstractTPSubNode ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25||LA5_0==29||LA5_0==31||LA5_0==34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTargetPlatform.g:336:4: (lv_elements_4_0= ruleAbstractTPSubNode )
            	    {
            	    // InternalTargetPlatform.g:336:4: (lv_elements_4_0= ruleAbstractTPSubNode )
            	    // InternalTargetPlatform.g:337:5: lv_elements_4_0= ruleAbstractTPSubNode
            	    {

            	    					newCompositeNode(grammarAccess.getTargetPlatformDefinitionAccess().getElementsAbstractTPSubNodeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_elements_4_0=ruleAbstractTPSubNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTargetPlatformDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"org.xtext.system.targetPlatform.TargetPlatform.AbstractTPSubNode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTargetPlatformDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTargetPlatformDefinition"


    // $ANTLR start "entryRuleOperatingSystem"
    // InternalTargetPlatform.g:362:1: entryRuleOperatingSystem returns [EObject current=null] : iv_ruleOperatingSystem= ruleOperatingSystem EOF ;
    public final EObject entryRuleOperatingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatingSystem = null;


        try {
            // InternalTargetPlatform.g:362:56: (iv_ruleOperatingSystem= ruleOperatingSystem EOF )
            // InternalTargetPlatform.g:363:2: iv_ruleOperatingSystem= ruleOperatingSystem EOF
            {
             newCompositeNode(grammarAccess.getOperatingSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperatingSystem=ruleOperatingSystem();

            state._fsp--;

             current =iv_ruleOperatingSystem; 
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
    // $ANTLR end "entryRuleOperatingSystem"


    // $ANTLR start "ruleOperatingSystem"
    // InternalTargetPlatform.g:369:1: ruleOperatingSystem returns [EObject current=null] : (this_Windows_0= ruleWindows | this_Linux_1= ruleLinux | this_MacOS_2= ruleMacOS ) ;
    public final EObject ruleOperatingSystem() throws RecognitionException {
        EObject current = null;

        EObject this_Windows_0 = null;

        EObject this_Linux_1 = null;

        EObject this_MacOS_2 = null;



        	enterRule();

        try {
            // InternalTargetPlatform.g:375:2: ( (this_Windows_0= ruleWindows | this_Linux_1= ruleLinux | this_MacOS_2= ruleMacOS ) )
            // InternalTargetPlatform.g:376:2: (this_Windows_0= ruleWindows | this_Linux_1= ruleLinux | this_MacOS_2= ruleMacOS )
            {
            // InternalTargetPlatform.g:376:2: (this_Windows_0= ruleWindows | this_Linux_1= ruleLinux | this_MacOS_2= ruleMacOS )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
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
                    // InternalTargetPlatform.g:377:3: this_Windows_0= ruleWindows
                    {

                    			newCompositeNode(grammarAccess.getOperatingSystemAccess().getWindowsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Windows_0=ruleWindows();

                    state._fsp--;


                    			current = this_Windows_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTargetPlatform.g:386:3: this_Linux_1= ruleLinux
                    {

                    			newCompositeNode(grammarAccess.getOperatingSystemAccess().getLinuxParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Linux_1=ruleLinux();

                    state._fsp--;


                    			current = this_Linux_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTargetPlatform.g:395:3: this_MacOS_2= ruleMacOS
                    {

                    			newCompositeNode(grammarAccess.getOperatingSystemAccess().getMacOSParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MacOS_2=ruleMacOS();

                    state._fsp--;


                    			current = this_MacOS_2;
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
    // $ANTLR end "ruleOperatingSystem"


    // $ANTLR start "entryRuleWindows"
    // InternalTargetPlatform.g:407:1: entryRuleWindows returns [EObject current=null] : iv_ruleWindows= ruleWindows EOF ;
    public final EObject entryRuleWindows() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindows = null;


        try {
            // InternalTargetPlatform.g:407:48: (iv_ruleWindows= ruleWindows EOF )
            // InternalTargetPlatform.g:408:2: iv_ruleWindows= ruleWindows EOF
            {
             newCompositeNode(grammarAccess.getWindowsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWindows=ruleWindows();

            state._fsp--;

             current =iv_ruleWindows; 
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
    // $ANTLR end "entryRuleWindows"


    // $ANTLR start "ruleWindows"
    // InternalTargetPlatform.g:414:1: ruleWindows returns [EObject current=null] : ( () otherlv_1= 'Windows' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleWindows() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_kind_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTargetPlatform.g:420:2: ( ( () otherlv_1= 'Windows' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )? ) )
            // InternalTargetPlatform.g:421:2: ( () otherlv_1= 'Windows' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )? )
            {
            // InternalTargetPlatform.g:421:2: ( () otherlv_1= 'Windows' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )? )
            // InternalTargetPlatform.g:422:3: () otherlv_1= 'Windows' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )?
            {
            // InternalTargetPlatform.g:422:3: ()
            // InternalTargetPlatform.g:423:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWindowsAccess().getWindowsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getWindowsAccess().getWindowsKeyword_1());
            		
            // InternalTargetPlatform.g:433:3: ( (lv_kind_2_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTargetPlatform.g:434:4: (lv_kind_2_0= RULE_STRING )
                    {
                    // InternalTargetPlatform.g:434:4: (lv_kind_2_0= RULE_STRING )
                    // InternalTargetPlatform.g:435:5: lv_kind_2_0= RULE_STRING
                    {
                    lv_kind_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_kind_2_0, grammarAccess.getWindowsAccess().getKindSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWindowsRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"kind",
                    						lv_kind_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalTargetPlatform.g:451:3: (otherlv_3= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTargetPlatform.g:452:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getWindowsAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleWindows"


    // $ANTLR start "entryRuleLinux"
    // InternalTargetPlatform.g:461:1: entryRuleLinux returns [EObject current=null] : iv_ruleLinux= ruleLinux EOF ;
    public final EObject entryRuleLinux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinux = null;


        try {
            // InternalTargetPlatform.g:461:46: (iv_ruleLinux= ruleLinux EOF )
            // InternalTargetPlatform.g:462:2: iv_ruleLinux= ruleLinux EOF
            {
             newCompositeNode(grammarAccess.getLinuxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinux=ruleLinux();

            state._fsp--;

             current =iv_ruleLinux; 
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
    // $ANTLR end "entryRuleLinux"


    // $ANTLR start "ruleLinux"
    // InternalTargetPlatform.g:468:1: ruleLinux returns [EObject current=null] : ( () otherlv_1= 'Linux' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleLinux() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_kind_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTargetPlatform.g:474:2: ( ( () otherlv_1= 'Linux' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )? ) )
            // InternalTargetPlatform.g:475:2: ( () otherlv_1= 'Linux' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )? )
            {
            // InternalTargetPlatform.g:475:2: ( () otherlv_1= 'Linux' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )? )
            // InternalTargetPlatform.g:476:3: () otherlv_1= 'Linux' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )?
            {
            // InternalTargetPlatform.g:476:3: ()
            // InternalTargetPlatform.g:477:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinuxAccess().getLinuxAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getLinuxAccess().getLinuxKeyword_1());
            		
            // InternalTargetPlatform.g:487:3: ( (lv_kind_2_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTargetPlatform.g:488:4: (lv_kind_2_0= RULE_STRING )
                    {
                    // InternalTargetPlatform.g:488:4: (lv_kind_2_0= RULE_STRING )
                    // InternalTargetPlatform.g:489:5: lv_kind_2_0= RULE_STRING
                    {
                    lv_kind_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_kind_2_0, grammarAccess.getLinuxAccess().getKindSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLinuxRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"kind",
                    						lv_kind_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalTargetPlatform.g:505:3: (otherlv_3= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTargetPlatform.g:506:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getLinuxAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleLinux"


    // $ANTLR start "entryRuleMacOS"
    // InternalTargetPlatform.g:515:1: entryRuleMacOS returns [EObject current=null] : iv_ruleMacOS= ruleMacOS EOF ;
    public final EObject entryRuleMacOS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOS = null;


        try {
            // InternalTargetPlatform.g:515:46: (iv_ruleMacOS= ruleMacOS EOF )
            // InternalTargetPlatform.g:516:2: iv_ruleMacOS= ruleMacOS EOF
            {
             newCompositeNode(grammarAccess.getMacOSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMacOS=ruleMacOS();

            state._fsp--;

             current =iv_ruleMacOS; 
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
    // $ANTLR end "entryRuleMacOS"


    // $ANTLR start "ruleMacOS"
    // InternalTargetPlatform.g:522:1: ruleMacOS returns [EObject current=null] : ( () otherlv_1= 'MacOS' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleMacOS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_kind_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTargetPlatform.g:528:2: ( ( () otherlv_1= 'MacOS' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )? ) )
            // InternalTargetPlatform.g:529:2: ( () otherlv_1= 'MacOS' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )? )
            {
            // InternalTargetPlatform.g:529:2: ( () otherlv_1= 'MacOS' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )? )
            // InternalTargetPlatform.g:530:3: () otherlv_1= 'MacOS' ( (lv_kind_2_0= RULE_STRING ) )? (otherlv_3= ';' )?
            {
            // InternalTargetPlatform.g:530:3: ()
            // InternalTargetPlatform.g:531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMacOSAccess().getMacOSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getMacOSAccess().getMacOSKeyword_1());
            		
            // InternalTargetPlatform.g:541:3: ( (lv_kind_2_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTargetPlatform.g:542:4: (lv_kind_2_0= RULE_STRING )
                    {
                    // InternalTargetPlatform.g:542:4: (lv_kind_2_0= RULE_STRING )
                    // InternalTargetPlatform.g:543:5: lv_kind_2_0= RULE_STRING
                    {
                    lv_kind_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_kind_2_0, grammarAccess.getMacOSAccess().getKindSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMacOSRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"kind",
                    						lv_kind_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalTargetPlatform.g:559:3: (otherlv_3= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTargetPlatform.g:560:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getMacOSAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleMacOS"


    // $ANTLR start "entryRuleAbstractTPSubNode"
    // InternalTargetPlatform.g:569:1: entryRuleAbstractTPSubNode returns [EObject current=null] : iv_ruleAbstractTPSubNode= ruleAbstractTPSubNode EOF ;
    public final EObject entryRuleAbstractTPSubNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTPSubNode = null;


        try {
            // InternalTargetPlatform.g:569:58: (iv_ruleAbstractTPSubNode= ruleAbstractTPSubNode EOF )
            // InternalTargetPlatform.g:570:2: iv_ruleAbstractTPSubNode= ruleAbstractTPSubNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractTPSubNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractTPSubNode=ruleAbstractTPSubNode();

            state._fsp--;

             current =iv_ruleAbstractTPSubNode; 
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
    // $ANTLR end "entryRuleAbstractTPSubNode"


    // $ANTLR start "ruleAbstractTPSubNode"
    // InternalTargetPlatform.g:576:1: ruleAbstractTPSubNode returns [EObject current=null] : (this_NetworkInterface_0= ruleNetworkInterface | this_CPU_1= ruleCPU | this_LoginAccount_2= ruleLoginAccount | this_TargetMiddleware_3= ruleTargetMiddleware ) ;
    public final EObject ruleAbstractTPSubNode() throws RecognitionException {
        EObject current = null;

        EObject this_NetworkInterface_0 = null;

        EObject this_CPU_1 = null;

        EObject this_LoginAccount_2 = null;

        EObject this_TargetMiddleware_3 = null;



        	enterRule();

        try {
            // InternalTargetPlatform.g:582:2: ( (this_NetworkInterface_0= ruleNetworkInterface | this_CPU_1= ruleCPU | this_LoginAccount_2= ruleLoginAccount | this_TargetMiddleware_3= ruleTargetMiddleware ) )
            // InternalTargetPlatform.g:583:2: (this_NetworkInterface_0= ruleNetworkInterface | this_CPU_1= ruleCPU | this_LoginAccount_2= ruleLoginAccount | this_TargetMiddleware_3= ruleTargetMiddleware )
            {
            // InternalTargetPlatform.g:583:2: (this_NetworkInterface_0= ruleNetworkInterface | this_CPU_1= ruleCPU | this_LoginAccount_2= ruleLoginAccount | this_TargetMiddleware_3= ruleTargetMiddleware )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt13=1;
                }
                break;
            case 29:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            case 34:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalTargetPlatform.g:584:3: this_NetworkInterface_0= ruleNetworkInterface
                    {

                    			newCompositeNode(grammarAccess.getAbstractTPSubNodeAccess().getNetworkInterfaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NetworkInterface_0=ruleNetworkInterface();

                    state._fsp--;


                    			current = this_NetworkInterface_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTargetPlatform.g:593:3: this_CPU_1= ruleCPU
                    {

                    			newCompositeNode(grammarAccess.getAbstractTPSubNodeAccess().getCPUParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CPU_1=ruleCPU();

                    state._fsp--;


                    			current = this_CPU_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTargetPlatform.g:602:3: this_LoginAccount_2= ruleLoginAccount
                    {

                    			newCompositeNode(grammarAccess.getAbstractTPSubNodeAccess().getLoginAccountParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoginAccount_2=ruleLoginAccount();

                    state._fsp--;


                    			current = this_LoginAccount_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTargetPlatform.g:611:3: this_TargetMiddleware_3= ruleTargetMiddleware
                    {

                    			newCompositeNode(grammarAccess.getAbstractTPSubNodeAccess().getTargetMiddlewareParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TargetMiddleware_3=ruleTargetMiddleware();

                    state._fsp--;


                    			current = this_TargetMiddleware_3;
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
    // $ANTLR end "ruleAbstractTPSubNode"


    // $ANTLR start "entryRuleNetworkInterface"
    // InternalTargetPlatform.g:623:1: entryRuleNetworkInterface returns [EObject current=null] : iv_ruleNetworkInterface= ruleNetworkInterface EOF ;
    public final EObject entryRuleNetworkInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkInterface = null;


        try {
            // InternalTargetPlatform.g:623:57: (iv_ruleNetworkInterface= ruleNetworkInterface EOF )
            // InternalTargetPlatform.g:624:2: iv_ruleNetworkInterface= ruleNetworkInterface EOF
            {
             newCompositeNode(grammarAccess.getNetworkInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkInterface=ruleNetworkInterface();

            state._fsp--;

             current =iv_ruleNetworkInterface; 
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
    // $ANTLR end "entryRuleNetworkInterface"


    // $ANTLR start "ruleNetworkInterface"
    // InternalTargetPlatform.g:630:1: ruleNetworkInterface returns [EObject current=null] : (otherlv_0= 'NetworkInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
    public final EObject ruleNetworkInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_hostAddress_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_portNr_7_0 = null;

        AntlrDatatypeRuleToken lv_kind_9_0 = null;



        	enterRule();

        try {
            // InternalTargetPlatform.g:636:2: ( (otherlv_0= 'NetworkInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalTargetPlatform.g:637:2: (otherlv_0= 'NetworkInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalTargetPlatform.g:637:2: (otherlv_0= 'NetworkInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalTargetPlatform.g:638:3: otherlv_0= 'NetworkInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkInterfaceAccess().getNetworkInterfaceKeyword_0());
            		
            // InternalTargetPlatform.g:642:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTargetPlatform.g:643:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTargetPlatform.g:643:4: (lv_name_1_0= RULE_ID )
            // InternalTargetPlatform.g:644:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNetworkInterfaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkInterfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTargetPlatform.g:664:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) )
            // InternalTargetPlatform.g:665:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalTargetPlatform.g:665:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            // InternalTargetPlatform.g:666:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
            				
            // InternalTargetPlatform.g:669:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            // InternalTargetPlatform.g:670:6: ( ({...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) ) ) )+ {...}?
            {
            // InternalTargetPlatform.g:670:6: ( ({...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTargetPlatform.g:671:4: ({...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) ) )
            	    {
            	    // InternalTargetPlatform.g:671:4: ({...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) ) )
            	    // InternalTargetPlatform.g:672:5: {...}? => ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalTargetPlatform.g:672:113: ( ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) ) )
            	    // InternalTargetPlatform.g:673:6: ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalTargetPlatform.g:676:9: ({...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? ) )
            	    // InternalTargetPlatform.g:676:10: {...}? => (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkInterface", "true");
            	    }
            	    // InternalTargetPlatform.g:676:19: (otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )? )
            	    // InternalTargetPlatform.g:676:20: otherlv_4= 'HostAddress' ( (lv_hostAddress_5_0= RULE_STRING ) ) (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )?
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getNetworkInterfaceAccess().getHostAddressKeyword_3_0_0());
            	    								
            	    // InternalTargetPlatform.g:680:9: ( (lv_hostAddress_5_0= RULE_STRING ) )
            	    // InternalTargetPlatform.g:681:10: (lv_hostAddress_5_0= RULE_STRING )
            	    {
            	    // InternalTargetPlatform.g:681:10: (lv_hostAddress_5_0= RULE_STRING )
            	    // InternalTargetPlatform.g:682:11: lv_hostAddress_5_0= RULE_STRING
            	    {
            	    lv_hostAddress_5_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    											newLeafNode(lv_hostAddress_5_0, grammarAccess.getNetworkInterfaceAccess().getHostAddressSTRINGTerminalRuleCall_3_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getNetworkInterfaceRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"hostAddress",
            	    												lv_hostAddress_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalTargetPlatform.g:698:9: (otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) ) )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==27) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalTargetPlatform.g:699:10: otherlv_6= ':' ( (lv_portNr_7_0= ruleEInt ) )
            	            {
            	            otherlv_6=(Token)match(input,27,FOLLOW_16); 

            	            										newLeafNode(otherlv_6, grammarAccess.getNetworkInterfaceAccess().getColonKeyword_3_0_2_0());
            	            									
            	            // InternalTargetPlatform.g:703:10: ( (lv_portNr_7_0= ruleEInt ) )
            	            // InternalTargetPlatform.g:704:11: (lv_portNr_7_0= ruleEInt )
            	            {
            	            // InternalTargetPlatform.g:704:11: (lv_portNr_7_0= ruleEInt )
            	            // InternalTargetPlatform.g:705:12: lv_portNr_7_0= ruleEInt
            	            {

            	            												newCompositeNode(grammarAccess.getNetworkInterfaceAccess().getPortNrEIntParserRuleCall_3_0_2_1_0());
            	            											
            	            pushFollow(FOLLOW_17);
            	            lv_portNr_7_0=ruleEInt();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getNetworkInterfaceRule());
            	            												}
            	            												set(
            	            													current,
            	            													"portNr",
            	            													lv_portNr_7_0,
            	            													"org.xtext.service.roboticMiddleware.RoboticMiddleware.EInt");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTargetPlatform.g:729:4: ({...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalTargetPlatform.g:729:4: ({...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) ) )
            	    // InternalTargetPlatform.g:730:5: {...}? => ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalTargetPlatform.g:730:113: ( ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) ) )
            	    // InternalTargetPlatform.g:731:6: ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalTargetPlatform.g:734:9: ({...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) ) )
            	    // InternalTargetPlatform.g:734:10: {...}? => (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNetworkInterface", "true");
            	    }
            	    // InternalTargetPlatform.g:734:19: (otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) ) )
            	    // InternalTargetPlatform.g:734:20: otherlv_8= 'Kind' ( (lv_kind_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,28,FOLLOW_8); 

            	    									newLeafNode(otherlv_8, grammarAccess.getNetworkInterfaceAccess().getKindKeyword_3_1_0());
            	    								
            	    // InternalTargetPlatform.g:738:9: ( (lv_kind_9_0= ruleEString ) )
            	    // InternalTargetPlatform.g:739:10: (lv_kind_9_0= ruleEString )
            	    {
            	    // InternalTargetPlatform.g:739:10: (lv_kind_9_0= ruleEString )
            	    // InternalTargetPlatform.g:740:11: lv_kind_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getNetworkInterfaceAccess().getKindEStringParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_kind_9_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNetworkInterfaceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"kind",
            	    												lv_kind_9_0,
            	    												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleNetworkInterface", "getUnorderedGroupHelper().canLeave(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
            				

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getNetworkInterfaceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNetworkInterface"


    // $ANTLR start "entryRuleCPU"
    // InternalTargetPlatform.g:779:1: entryRuleCPU returns [EObject current=null] : iv_ruleCPU= ruleCPU EOF ;
    public final EObject entryRuleCPU() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCPU = null;


        try {
            // InternalTargetPlatform.g:779:44: (iv_ruleCPU= ruleCPU EOF )
            // InternalTargetPlatform.g:780:2: iv_ruleCPU= ruleCPU EOF
            {
             newCompositeNode(grammarAccess.getCPURule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCPU=ruleCPU();

            state._fsp--;

             current =iv_ruleCPU; 
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
    // $ANTLR end "entryRuleCPU"


    // $ANTLR start "ruleCPU"
    // InternalTargetPlatform.g:786:1: ruleCPU returns [EObject current=null] : (otherlv_0= 'CPU' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '}' ) ;
    public final EObject ruleCPU() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_kind_5_0 = null;

        AntlrDatatypeRuleToken lv_coresTally_7_0 = null;



        	enterRule();

        try {
            // InternalTargetPlatform.g:792:2: ( (otherlv_0= 'CPU' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '}' ) )
            // InternalTargetPlatform.g:793:2: (otherlv_0= 'CPU' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '}' )
            {
            // InternalTargetPlatform.g:793:2: (otherlv_0= 'CPU' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '}' )
            // InternalTargetPlatform.g:794:3: otherlv_0= 'CPU' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCPUAccess().getCPUKeyword_0());
            		
            // InternalTargetPlatform.g:798:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTargetPlatform.g:799:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTargetPlatform.g:799:4: (lv_name_1_0= RULE_ID )
            // InternalTargetPlatform.g:800:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCPUAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCPURule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getCPUAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTargetPlatform.g:820:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) ) ) )+ {...}?) ) )
            // InternalTargetPlatform.g:821:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalTargetPlatform.g:821:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) ) ) )+ {...}?) )
            // InternalTargetPlatform.g:822:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getCPUAccess().getUnorderedGroup_3());
            				
            // InternalTargetPlatform.g:825:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) ) ) )+ {...}?)
            // InternalTargetPlatform.g:826:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) ) ) )+ {...}?
            {
            // InternalTargetPlatform.g:826:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTargetPlatform.g:827:4: ({...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalTargetPlatform.g:827:4: ({...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) ) )
            	    // InternalTargetPlatform.g:828:5: {...}? => ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCPU", "getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalTargetPlatform.g:828:100: ( ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) ) )
            	    // InternalTargetPlatform.g:829:6: ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalTargetPlatform.g:832:9: ({...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) ) )
            	    // InternalTargetPlatform.g:832:10: {...}? => (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCPU", "true");
            	    }
            	    // InternalTargetPlatform.g:832:19: (otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) ) )
            	    // InternalTargetPlatform.g:832:20: otherlv_4= 'Kind' ( (lv_kind_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getCPUAccess().getKindKeyword_3_0_0());
            	    								
            	    // InternalTargetPlatform.g:836:9: ( (lv_kind_5_0= ruleEString ) )
            	    // InternalTargetPlatform.g:837:10: (lv_kind_5_0= ruleEString )
            	    {
            	    // InternalTargetPlatform.g:837:10: (lv_kind_5_0= ruleEString )
            	    // InternalTargetPlatform.g:838:11: lv_kind_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getCPUAccess().getKindEStringParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_19);
            	    lv_kind_5_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCPURule());
            	    											}
            	    											set(
            	    												current,
            	    												"kind",
            	    												lv_kind_5_0,
            	    												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCPUAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTargetPlatform.g:861:4: ({...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // InternalTargetPlatform.g:861:4: ({...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) ) )
            	    // InternalTargetPlatform.g:862:5: {...}? => ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCPU", "getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalTargetPlatform.g:862:100: ( ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) ) )
            	    // InternalTargetPlatform.g:863:6: ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalTargetPlatform.g:866:9: ({...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) ) )
            	    // InternalTargetPlatform.g:866:10: {...}? => (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCPU", "true");
            	    }
            	    // InternalTargetPlatform.g:866:19: (otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) ) )
            	    // InternalTargetPlatform.g:866:20: otherlv_6= 'CoresTally' ( (lv_coresTally_7_0= ruleEInt ) )
            	    {
            	    otherlv_6=(Token)match(input,30,FOLLOW_16); 

            	    									newLeafNode(otherlv_6, grammarAccess.getCPUAccess().getCoresTallyKeyword_3_1_0());
            	    								
            	    // InternalTargetPlatform.g:870:9: ( (lv_coresTally_7_0= ruleEInt ) )
            	    // InternalTargetPlatform.g:871:10: (lv_coresTally_7_0= ruleEInt )
            	    {
            	    // InternalTargetPlatform.g:871:10: (lv_coresTally_7_0= ruleEInt )
            	    // InternalTargetPlatform.g:872:11: lv_coresTally_7_0= ruleEInt
            	    {

            	    											newCompositeNode(grammarAccess.getCPUAccess().getCoresTallyEIntParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_19);
            	    lv_coresTally_7_0=ruleEInt();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCPURule());
            	    											}
            	    											set(
            	    												current,
            	    												"coresTally",
            	    												lv_coresTally_7_0,
            	    												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EInt");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCPUAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCPUAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleCPU", "getUnorderedGroupHelper().canLeave(grammarAccess.getCPUAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getCPUAccess().getUnorderedGroup_3());
            				

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCPUAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCPU"


    // $ANTLR start "entryRuleLoginAccount"
    // InternalTargetPlatform.g:911:1: entryRuleLoginAccount returns [EObject current=null] : iv_ruleLoginAccount= ruleLoginAccount EOF ;
    public final EObject entryRuleLoginAccount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoginAccount = null;


        try {
            // InternalTargetPlatform.g:911:53: (iv_ruleLoginAccount= ruleLoginAccount EOF )
            // InternalTargetPlatform.g:912:2: iv_ruleLoginAccount= ruleLoginAccount EOF
            {
             newCompositeNode(grammarAccess.getLoginAccountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoginAccount=ruleLoginAccount();

            state._fsp--;

             current =iv_ruleLoginAccount; 
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
    // $ANTLR end "entryRuleLoginAccount"


    // $ANTLR start "ruleLoginAccount"
    // InternalTargetPlatform.g:918:1: ruleLoginAccount returns [EObject current=null] : (otherlv_0= 'LoginAccount' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ;
    public final EObject ruleLoginAccount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_fullname_5_0=null;
        Token otherlv_6=null;
        Token lv_email_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalTargetPlatform.g:924:2: ( (otherlv_0= 'LoginAccount' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalTargetPlatform.g:925:2: (otherlv_0= 'LoginAccount' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalTargetPlatform.g:925:2: (otherlv_0= 'LoginAccount' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalTargetPlatform.g:926:3: otherlv_0= 'LoginAccount' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLoginAccountAccess().getLoginAccountKeyword_0());
            		
            // InternalTargetPlatform.g:930:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTargetPlatform.g:931:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTargetPlatform.g:931:4: (lv_name_1_0= RULE_ID )
            // InternalTargetPlatform.g:932:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLoginAccountAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoginAccountRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getLoginAccountAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTargetPlatform.g:952:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalTargetPlatform.g:953:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalTargetPlatform.g:953:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalTargetPlatform.g:954:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
            				
            // InternalTargetPlatform.g:957:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalTargetPlatform.g:958:6: ( ({...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalTargetPlatform.g:958:6: ( ({...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTargetPlatform.g:959:4: ({...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalTargetPlatform.g:959:4: ({...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalTargetPlatform.g:960:5: {...}? => ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLoginAccount", "getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalTargetPlatform.g:960:109: ( ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) ) )
            	    // InternalTargetPlatform.g:961:6: ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalTargetPlatform.g:964:9: ({...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) ) )
            	    // InternalTargetPlatform.g:964:10: {...}? => (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLoginAccount", "true");
            	    }
            	    // InternalTargetPlatform.g:964:19: (otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) ) )
            	    // InternalTargetPlatform.g:964:20: otherlv_4= 'FullName' ( (lv_fullname_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getLoginAccountAccess().getFullNameKeyword_3_0_0());
            	    								
            	    // InternalTargetPlatform.g:968:9: ( (lv_fullname_5_0= RULE_STRING ) )
            	    // InternalTargetPlatform.g:969:10: (lv_fullname_5_0= RULE_STRING )
            	    {
            	    // InternalTargetPlatform.g:969:10: (lv_fullname_5_0= RULE_STRING )
            	    // InternalTargetPlatform.g:970:11: lv_fullname_5_0= RULE_STRING
            	    {
            	    lv_fullname_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            	    											newLeafNode(lv_fullname_5_0, grammarAccess.getLoginAccountAccess().getFullnameSTRINGTerminalRuleCall_3_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getLoginAccountRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"fullname",
            	    												lv_fullname_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTargetPlatform.g:992:4: ({...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalTargetPlatform.g:992:4: ({...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalTargetPlatform.g:993:5: {...}? => ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLoginAccount", "getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalTargetPlatform.g:993:109: ( ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) ) )
            	    // InternalTargetPlatform.g:994:6: ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalTargetPlatform.g:997:9: ({...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) ) )
            	    // InternalTargetPlatform.g:997:10: {...}? => (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLoginAccount", "true");
            	    }
            	    // InternalTargetPlatform.g:997:19: (otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) ) )
            	    // InternalTargetPlatform.g:997:20: otherlv_6= 'Email' ( (lv_email_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,33,FOLLOW_8); 

            	    									newLeafNode(otherlv_6, grammarAccess.getLoginAccountAccess().getEmailKeyword_3_1_0());
            	    								
            	    // InternalTargetPlatform.g:1001:9: ( (lv_email_7_0= RULE_STRING ) )
            	    // InternalTargetPlatform.g:1002:10: (lv_email_7_0= RULE_STRING )
            	    {
            	    // InternalTargetPlatform.g:1002:10: (lv_email_7_0= RULE_STRING )
            	    // InternalTargetPlatform.g:1003:11: lv_email_7_0= RULE_STRING
            	    {
            	    lv_email_7_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            	    											newLeafNode(lv_email_7_0, grammarAccess.getLoginAccountAccess().getEmailSTRINGTerminalRuleCall_3_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getLoginAccountRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"email",
            	    												lv_email_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
            				

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLoginAccountAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLoginAccount"


    // $ANTLR start "entryRuleTargetMiddleware"
    // InternalTargetPlatform.g:1040:1: entryRuleTargetMiddleware returns [EObject current=null] : iv_ruleTargetMiddleware= ruleTargetMiddleware EOF ;
    public final EObject entryRuleTargetMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetMiddleware = null;


        try {
            // InternalTargetPlatform.g:1040:57: (iv_ruleTargetMiddleware= ruleTargetMiddleware EOF )
            // InternalTargetPlatform.g:1041:2: iv_ruleTargetMiddleware= ruleTargetMiddleware EOF
            {
             newCompositeNode(grammarAccess.getTargetMiddlewareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetMiddleware=ruleTargetMiddleware();

            state._fsp--;

             current =iv_ruleTargetMiddleware; 
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
    // $ANTLR end "entryRuleTargetMiddleware"


    // $ANTLR start "ruleTargetMiddleware"
    // InternalTargetPlatform.g:1047:1: ruleTargetMiddleware returns [EObject current=null] : (otherlv_0= 'TargetMiddleware' ( (lv_middleware_1_0= ruleRoboticMiddleware ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleTargetMiddleware() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_middleware_1_0 = null;



        	enterRule();

        try {
            // InternalTargetPlatform.g:1053:2: ( (otherlv_0= 'TargetMiddleware' ( (lv_middleware_1_0= ruleRoboticMiddleware ) ) (otherlv_2= ';' )? ) )
            // InternalTargetPlatform.g:1054:2: (otherlv_0= 'TargetMiddleware' ( (lv_middleware_1_0= ruleRoboticMiddleware ) ) (otherlv_2= ';' )? )
            {
            // InternalTargetPlatform.g:1054:2: (otherlv_0= 'TargetMiddleware' ( (lv_middleware_1_0= ruleRoboticMiddleware ) ) (otherlv_2= ';' )? )
            // InternalTargetPlatform.g:1055:3: otherlv_0= 'TargetMiddleware' ( (lv_middleware_1_0= ruleRoboticMiddleware ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetMiddlewareAccess().getTargetMiddlewareKeyword_0());
            		
            // InternalTargetPlatform.g:1059:3: ( (lv_middleware_1_0= ruleRoboticMiddleware ) )
            // InternalTargetPlatform.g:1060:4: (lv_middleware_1_0= ruleRoboticMiddleware )
            {
            // InternalTargetPlatform.g:1060:4: (lv_middleware_1_0= ruleRoboticMiddleware )
            // InternalTargetPlatform.g:1061:5: lv_middleware_1_0= ruleRoboticMiddleware
            {

            					newCompositeNode(grammarAccess.getTargetMiddlewareAccess().getMiddlewareRoboticMiddlewareParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_middleware_1_0=ruleRoboticMiddleware();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetMiddlewareRule());
            					}
            					set(
            						current,
            						"middleware",
            						lv_middleware_1_0,
            						"org.xtext.service.roboticMiddleware.RoboticMiddleware.RoboticMiddleware");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTargetPlatform.g:1078:3: (otherlv_2= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTargetPlatform.g:1079:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTargetMiddlewareAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleTargetMiddleware"


    // $ANTLR start "entryRuleRoboticMiddleware"
    // InternalTargetPlatform.g:1088:1: entryRuleRoboticMiddleware returns [EObject current=null] : iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF ;
    public final EObject entryRuleRoboticMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoboticMiddleware = null;


        try {
            // InternalTargetPlatform.g:1088:58: (iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF )
            // InternalTargetPlatform.g:1089:2: iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF
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
    // InternalTargetPlatform.g:1095:1: ruleRoboticMiddleware returns [EObject current=null] : (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft ) ;
    public final EObject ruleRoboticMiddleware() throws RecognitionException {
        EObject current = null;

        EObject this_ACE_SmartSoft_0 = null;

        EObject this_OpcUa_SeRoNet_1 = null;

        EObject this_CORBA_SmartSoft_2 = null;

        EObject this_DDS_SmartSoft_3 = null;



        	enterRule();

        try {
            // InternalTargetPlatform.g:1101:2: ( (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft ) )
            // InternalTargetPlatform.g:1102:2: (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft )
            {
            // InternalTargetPlatform.g:1102:2: (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 40:
                {
                alt19=3;
                }
                break;
            case 41:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalTargetPlatform.g:1103:3: this_ACE_SmartSoft_0= ruleACE_SmartSoft
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
                    // InternalTargetPlatform.g:1112:3: this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet
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
                    // InternalTargetPlatform.g:1121:3: this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft
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
                    // InternalTargetPlatform.g:1130:3: this_DDS_SmartSoft_3= ruleDDS_SmartSoft
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
    // InternalTargetPlatform.g:1142:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalTargetPlatform.g:1142:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalTargetPlatform.g:1143:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalTargetPlatform.g:1149:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalTargetPlatform.g:1155:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalTargetPlatform.g:1156:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalTargetPlatform.g:1156:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalTargetPlatform.g:1157:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalTargetPlatform.g:1164:3: (kw= '.' this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTargetPlatform.g:1165:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalTargetPlatform.g:1182:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTargetPlatform.g:1182:47: (iv_ruleEString= ruleEString EOF )
            // InternalTargetPlatform.g:1183:2: iv_ruleEString= ruleEString EOF
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
    // InternalTargetPlatform.g:1189:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalTargetPlatform.g:1195:2: (this_STRING_0= RULE_STRING )
            // InternalTargetPlatform.g:1196:2: this_STRING_0= RULE_STRING
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
    // InternalTargetPlatform.g:1206:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTargetPlatform.g:1206:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTargetPlatform.g:1207:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalTargetPlatform.g:1213:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTargetPlatform.g:1219:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTargetPlatform.g:1220:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTargetPlatform.g:1220:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTargetPlatform.g:1221:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTargetPlatform.g:1221:3: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTargetPlatform.g:1222:4: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_23); 

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


    // $ANTLR start "entryRuleACE_SmartSoft"
    // InternalTargetPlatform.g:1239:1: entryRuleACE_SmartSoft returns [EObject current=null] : iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF ;
    public final EObject entryRuleACE_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACE_SmartSoft = null;


        try {
            // InternalTargetPlatform.g:1239:54: (iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF )
            // InternalTargetPlatform.g:1240:2: iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF
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
    // InternalTargetPlatform.g:1246:1: ruleACE_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleACE_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalTargetPlatform.g:1252:2: ( ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalTargetPlatform.g:1253:2: ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalTargetPlatform.g:1253:2: ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalTargetPlatform.g:1254:3: () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalTargetPlatform.g:1254:3: ()
            // InternalTargetPlatform.g:1255:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1());
            		
            // InternalTargetPlatform.g:1265:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTargetPlatform.g:1266:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalTargetPlatform.g:1270:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalTargetPlatform.g:1271:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalTargetPlatform.g:1271:5: (lv_description_3_0= ruleEString )
                    // InternalTargetPlatform.g:1272:6: lv_description_3_0= ruleEString
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
    // InternalTargetPlatform.g:1294:1: entryRuleOpcUa_SeRoNet returns [EObject current=null] : iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF ;
    public final EObject entryRuleOpcUa_SeRoNet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUa_SeRoNet = null;


        try {
            // InternalTargetPlatform.g:1294:54: (iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF )
            // InternalTargetPlatform.g:1295:2: iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF
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
    // InternalTargetPlatform.g:1301:1: ruleOpcUa_SeRoNet returns [EObject current=null] : ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleOpcUa_SeRoNet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalTargetPlatform.g:1307:2: ( ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalTargetPlatform.g:1308:2: ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalTargetPlatform.g:1308:2: ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalTargetPlatform.g:1309:3: () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalTargetPlatform.g:1309:3: ()
            // InternalTargetPlatform.g:1310:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1());
            		
            // InternalTargetPlatform.g:1320:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTargetPlatform.g:1321:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalTargetPlatform.g:1325:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalTargetPlatform.g:1326:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalTargetPlatform.g:1326:5: (lv_description_3_0= ruleEString )
                    // InternalTargetPlatform.g:1327:6: lv_description_3_0= ruleEString
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
    // InternalTargetPlatform.g:1349:1: entryRuleCORBA_SmartSoft returns [EObject current=null] : iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF ;
    public final EObject entryRuleCORBA_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCORBA_SmartSoft = null;


        try {
            // InternalTargetPlatform.g:1349:56: (iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF )
            // InternalTargetPlatform.g:1350:2: iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF
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
    // InternalTargetPlatform.g:1356:1: ruleCORBA_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleCORBA_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalTargetPlatform.g:1362:2: ( ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalTargetPlatform.g:1363:2: ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalTargetPlatform.g:1363:2: ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalTargetPlatform.g:1364:3: () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalTargetPlatform.g:1364:3: ()
            // InternalTargetPlatform.g:1365:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1());
            		
            // InternalTargetPlatform.g:1375:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTargetPlatform.g:1376:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalTargetPlatform.g:1380:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalTargetPlatform.g:1381:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalTargetPlatform.g:1381:5: (lv_description_3_0= ruleEString )
                    // InternalTargetPlatform.g:1382:6: lv_description_3_0= ruleEString
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
    // InternalTargetPlatform.g:1404:1: entryRuleDDS_SmartSoft returns [EObject current=null] : iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF ;
    public final EObject entryRuleDDS_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDS_SmartSoft = null;


        try {
            // InternalTargetPlatform.g:1404:54: (iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF )
            // InternalTargetPlatform.g:1405:2: iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF
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
    // InternalTargetPlatform.g:1411:1: ruleDDS_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleDDS_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalTargetPlatform.g:1417:2: ( ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalTargetPlatform.g:1418:2: ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalTargetPlatform.g:1418:2: ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalTargetPlatform.g:1419:3: () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalTargetPlatform.g:1419:3: ()
            // InternalTargetPlatform.g:1420:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1());
            		
            // InternalTargetPlatform.g:1430:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTargetPlatform.g:1431:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalTargetPlatform.g:1435:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalTargetPlatform.g:1436:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalTargetPlatform.g:1436:5: (lv_description_3_0= ruleEString )
                    // InternalTargetPlatform.g:1437:6: lv_description_3_0= ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000130000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000004A3A10000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000004A2010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001C010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000014010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000050010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000300010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000003A000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000002L});

}
