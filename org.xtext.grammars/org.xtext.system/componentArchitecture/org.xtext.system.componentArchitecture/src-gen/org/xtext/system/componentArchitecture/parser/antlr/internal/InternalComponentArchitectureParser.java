package org.xtext.system.componentArchitecture.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.system.componentArchitecture.services.ComponentArchitectureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentArchitectureParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SystemComponentArchitecture'", "'usingActivityArchitecture'", "'{'", "'}'", "'Connection'", "'->'", "'useMiddleware'", "';'", "'ComponentInstance'", "'instantiates'", "'ParameterStructInstance'", "'Activity'", "'configuration'", "'InputHandler'", "'OpcUaDeviceClientInstance'", "'deviceURI'", "'RequiredService'", "'ProvidedService'", "'.'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalComponentArchitectureParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentArchitectureParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentArchitectureParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentArchitecture.g"; }



     	private ComponentArchitectureGrammarAccess grammarAccess;

        public InternalComponentArchitectureParser(TokenStream input, ComponentArchitectureGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SystemComponentArchitecture";
       	}

       	@Override
       	protected ComponentArchitectureGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystemComponentArchitecture"
    // InternalComponentArchitecture.g:105:1: entryRuleSystemComponentArchitecture returns [EObject current=null] : iv_ruleSystemComponentArchitecture= ruleSystemComponentArchitecture EOF ;
    public final EObject entryRuleSystemComponentArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemComponentArchitecture = null;


        try {
            // InternalComponentArchitecture.g:105:68: (iv_ruleSystemComponentArchitecture= ruleSystemComponentArchitecture EOF )
            // InternalComponentArchitecture.g:106:2: iv_ruleSystemComponentArchitecture= ruleSystemComponentArchitecture EOF
            {
             newCompositeNode(grammarAccess.getSystemComponentArchitectureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemComponentArchitecture=ruleSystemComponentArchitecture();

            state._fsp--;

             current =iv_ruleSystemComponentArchitecture; 
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
    // $ANTLR end "entryRuleSystemComponentArchitecture"


    // $ANTLR start "ruleSystemComponentArchitecture"
    // InternalComponentArchitecture.g:112:1: ruleSystemComponentArchitecture returns [EObject current=null] : ( () otherlv_1= 'SystemComponentArchitecture' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'usingActivityArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_components_6_0= ruleComponentInstance ) )* ( (lv_connections_7_0= ruleConnection ) )* otherlv_8= '}' ) ;
    public final EObject ruleSystemComponentArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_components_6_0 = null;

        EObject lv_connections_7_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:118:2: ( ( () otherlv_1= 'SystemComponentArchitecture' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'usingActivityArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_components_6_0= ruleComponentInstance ) )* ( (lv_connections_7_0= ruleConnection ) )* otherlv_8= '}' ) )
            // InternalComponentArchitecture.g:119:2: ( () otherlv_1= 'SystemComponentArchitecture' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'usingActivityArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_components_6_0= ruleComponentInstance ) )* ( (lv_connections_7_0= ruleConnection ) )* otherlv_8= '}' )
            {
            // InternalComponentArchitecture.g:119:2: ( () otherlv_1= 'SystemComponentArchitecture' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'usingActivityArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_components_6_0= ruleComponentInstance ) )* ( (lv_connections_7_0= ruleConnection ) )* otherlv_8= '}' )
            // InternalComponentArchitecture.g:120:3: () otherlv_1= 'SystemComponentArchitecture' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'usingActivityArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_components_6_0= ruleComponentInstance ) )* ( (lv_connections_7_0= ruleConnection ) )* otherlv_8= '}'
            {
            // InternalComponentArchitecture.g:120:3: ()
            // InternalComponentArchitecture.g:121:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureKeyword_1());
            		
            // InternalComponentArchitecture.g:131:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentArchitecture.g:132:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentArchitecture.g:132:4: (lv_name_2_0= RULE_ID )
            // InternalComponentArchitecture.g:133:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSystemComponentArchitectureAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemComponentArchitectureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalComponentArchitecture.g:149:3: (otherlv_3= 'usingActivityArchitecture' ( ( ruleFQN ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentArchitecture.g:150:4: otherlv_3= 'usingActivityArchitecture' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemComponentArchitectureAccess().getUsingActivityArchitectureKeyword_3_0());
                    			
                    // InternalComponentArchitecture.g:154:4: ( ( ruleFQN ) )
                    // InternalComponentArchitecture.g:155:5: ( ruleFQN )
                    {
                    // InternalComponentArchitecture.g:155:5: ( ruleFQN )
                    // InternalComponentArchitecture.g:156:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemComponentArchitectureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchActivityArchitectureModelCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemComponentArchitectureAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponentArchitecture.g:175:3: ( (lv_components_6_0= ruleComponentInstance ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalComponentArchitecture.g:176:4: (lv_components_6_0= ruleComponentInstance )
            	    {
            	    // InternalComponentArchitecture.g:176:4: (lv_components_6_0= ruleComponentInstance )
            	    // InternalComponentArchitecture.g:177:5: lv_components_6_0= ruleComponentInstance
            	    {

            	    					newCompositeNode(grammarAccess.getSystemComponentArchitectureAccess().getComponentsComponentInstanceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_components_6_0=ruleComponentInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemComponentArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_6_0,
            	    						"org.xtext.system.componentArchitecture.ComponentArchitecture.ComponentInstance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalComponentArchitecture.g:194:3: ( (lv_connections_7_0= ruleConnection ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalComponentArchitecture.g:195:4: (lv_connections_7_0= ruleConnection )
            	    {
            	    // InternalComponentArchitecture.g:195:4: (lv_connections_7_0= ruleConnection )
            	    // InternalComponentArchitecture.g:196:5: lv_connections_7_0= ruleConnection
            	    {

            	    					newCompositeNode(grammarAccess.getSystemComponentArchitectureAccess().getConnectionsConnectionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_connections_7_0=ruleConnection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemComponentArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connections",
            	    						lv_connections_7_0,
            	    						"org.xtext.system.componentArchitecture.ComponentArchitecture.Connection");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSystemComponentArchitectureAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSystemComponentArchitecture"


    // $ANTLR start "entryRuleConnection"
    // InternalComponentArchitecture.g:221:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalComponentArchitecture.g:221:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalComponentArchitecture.g:222:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalComponentArchitecture.g:228:1: ruleConnection returns [EObject current=null] : (otherlv_0= 'Connection' ( ( ruleFQN ) ) otherlv_2= '->' ( ( ruleFQN ) ) (otherlv_4= 'useMiddleware' ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) ) )? (otherlv_6= ';' )? ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_middlewareSelection_5_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:234:2: ( (otherlv_0= 'Connection' ( ( ruleFQN ) ) otherlv_2= '->' ( ( ruleFQN ) ) (otherlv_4= 'useMiddleware' ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) ) )? (otherlv_6= ';' )? ) )
            // InternalComponentArchitecture.g:235:2: (otherlv_0= 'Connection' ( ( ruleFQN ) ) otherlv_2= '->' ( ( ruleFQN ) ) (otherlv_4= 'useMiddleware' ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) ) )? (otherlv_6= ';' )? )
            {
            // InternalComponentArchitecture.g:235:2: (otherlv_0= 'Connection' ( ( ruleFQN ) ) otherlv_2= '->' ( ( ruleFQN ) ) (otherlv_4= 'useMiddleware' ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) ) )? (otherlv_6= ';' )? )
            // InternalComponentArchitecture.g:236:3: otherlv_0= 'Connection' ( ( ruleFQN ) ) otherlv_2= '->' ( ( ruleFQN ) ) (otherlv_4= 'useMiddleware' ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) ) )? (otherlv_6= ';' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getConnectionKeyword_0());
            		
            // InternalComponentArchitecture.g:240:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:241:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:241:4: ( ruleFQN )
            // InternalComponentArchitecture.g:242:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectionAccess().getFromRequiredServiceCrossReference_1_0());
            				
            pushFollow(FOLLOW_8);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalComponentArchitecture.g:260:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:261:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:261:4: ( ruleFQN )
            // InternalComponentArchitecture.g:262:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectionAccess().getToProvidedServiceCrossReference_3_0());
            				
            pushFollow(FOLLOW_9);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentArchitecture.g:276:3: (otherlv_4= 'useMiddleware' ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentArchitecture.g:277:4: otherlv_4= 'useMiddleware' ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getUseMiddlewareKeyword_4_0());
                    			
                    // InternalComponentArchitecture.g:281:4: ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) )
                    // InternalComponentArchitecture.g:282:5: (lv_middlewareSelection_5_0= ruleRoboticMiddleware )
                    {
                    // InternalComponentArchitecture.g:282:5: (lv_middlewareSelection_5_0= ruleRoboticMiddleware )
                    // InternalComponentArchitecture.g:283:6: lv_middlewareSelection_5_0= ruleRoboticMiddleware
                    {

                    						newCompositeNode(grammarAccess.getConnectionAccess().getMiddlewareSelectionRoboticMiddlewareParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_middlewareSelection_5_0=ruleRoboticMiddleware();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionRule());
                    						}
                    						set(
                    							current,
                    							"middlewareSelection",
                    							lv_middlewareSelection_5_0,
                    							"org.xtext.service.roboticMiddleware.RoboticMiddleware.RoboticMiddleware");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentArchitecture.g:301:3: (otherlv_6= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentArchitecture.g:302:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getConnectionAccess().getSemicolonKeyword_5());
                    			

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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleComponentInstance"
    // InternalComponentArchitecture.g:311:1: entryRuleComponentInstance returns [EObject current=null] : iv_ruleComponentInstance= ruleComponentInstance EOF ;
    public final EObject entryRuleComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstance = null;


        try {
            // InternalComponentArchitecture.g:311:58: (iv_ruleComponentInstance= ruleComponentInstance EOF )
            // InternalComponentArchitecture.g:312:2: iv_ruleComponentInstance= ruleComponentInstance EOF
            {
             newCompositeNode(grammarAccess.getComponentInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentInstance=ruleComponentInstance();

            state._fsp--;

             current =iv_ruleComponentInstance; 
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
    // $ANTLR end "entryRuleComponentInstance"


    // $ANTLR start "ruleComponentInstance"
    // InternalComponentArchitecture.g:318:1: ruleComponentInstance returns [EObject current=null] : (otherlv_0= 'ComponentInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'instantiates' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_ports_5_0= ruleServiceInstance ) )* ( (lv_extensions_6_0= ruleComponentInstanceExtension ) )* otherlv_7= '}' ) ;
    public final EObject ruleComponentInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_ports_5_0 = null;

        EObject lv_extensions_6_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:324:2: ( (otherlv_0= 'ComponentInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'instantiates' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_ports_5_0= ruleServiceInstance ) )* ( (lv_extensions_6_0= ruleComponentInstanceExtension ) )* otherlv_7= '}' ) )
            // InternalComponentArchitecture.g:325:2: (otherlv_0= 'ComponentInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'instantiates' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_ports_5_0= ruleServiceInstance ) )* ( (lv_extensions_6_0= ruleComponentInstanceExtension ) )* otherlv_7= '}' )
            {
            // InternalComponentArchitecture.g:325:2: (otherlv_0= 'ComponentInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'instantiates' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_ports_5_0= ruleServiceInstance ) )* ( (lv_extensions_6_0= ruleComponentInstanceExtension ) )* otherlv_7= '}' )
            // InternalComponentArchitecture.g:326:3: otherlv_0= 'ComponentInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'instantiates' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_ports_5_0= ruleServiceInstance ) )* ( (lv_extensions_6_0= ruleComponentInstanceExtension ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInstanceAccess().getComponentInstanceKeyword_0());
            		
            // InternalComponentArchitecture.g:330:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentArchitecture.g:331:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentArchitecture.g:331:4: (lv_name_1_0= RULE_ID )
            // InternalComponentArchitecture.g:332:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentInstanceAccess().getInstantiatesKeyword_2());
            		
            // InternalComponentArchitecture.g:352:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:353:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:353:4: ( ruleFQN )
            // InternalComponentArchitecture.g:354:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentInstanceAccess().getComponentComponentDefinitionCrossReference_3_0());
            				
            pushFollow(FOLLOW_5);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentInstanceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponentArchitecture.g:372:3: ( (lv_ports_5_0= ruleServiceInstance ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=27 && LA6_0<=28)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalComponentArchitecture.g:373:4: (lv_ports_5_0= ruleServiceInstance )
            	    {
            	    // InternalComponentArchitecture.g:373:4: (lv_ports_5_0= ruleServiceInstance )
            	    // InternalComponentArchitecture.g:374:5: lv_ports_5_0= ruleServiceInstance
            	    {

            	    					newCompositeNode(grammarAccess.getComponentInstanceAccess().getPortsServiceInstanceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_ports_5_0=ruleServiceInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentInstanceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ports",
            	    						lv_ports_5_0,
            	    						"org.xtext.system.componentArchitecture.ComponentArchitecture.ServiceInstance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalComponentArchitecture.g:391:3: ( (lv_extensions_6_0= ruleComponentInstanceExtension ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=21 && LA7_0<=22)||(LA7_0>=24 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalComponentArchitecture.g:392:4: (lv_extensions_6_0= ruleComponentInstanceExtension )
            	    {
            	    // InternalComponentArchitecture.g:392:4: (lv_extensions_6_0= ruleComponentInstanceExtension )
            	    // InternalComponentArchitecture.g:393:5: lv_extensions_6_0= ruleComponentInstanceExtension
            	    {

            	    					newCompositeNode(grammarAccess.getComponentInstanceAccess().getExtensionsComponentInstanceExtensionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_extensions_6_0=ruleComponentInstanceExtension();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentInstanceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_6_0,
            	    						"org.xtext.system.componentArchitecture.ComponentArchitecture.ComponentInstanceExtension");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentInstanceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleComponentInstance"


    // $ANTLR start "entryRuleComponentInstanceExtension"
    // InternalComponentArchitecture.g:418:1: entryRuleComponentInstanceExtension returns [EObject current=null] : iv_ruleComponentInstanceExtension= ruleComponentInstanceExtension EOF ;
    public final EObject entryRuleComponentInstanceExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstanceExtension = null;


        try {
            // InternalComponentArchitecture.g:418:67: (iv_ruleComponentInstanceExtension= ruleComponentInstanceExtension EOF )
            // InternalComponentArchitecture.g:419:2: iv_ruleComponentInstanceExtension= ruleComponentInstanceExtension EOF
            {
             newCompositeNode(grammarAccess.getComponentInstanceExtensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentInstanceExtension=ruleComponentInstanceExtension();

            state._fsp--;

             current =iv_ruleComponentInstanceExtension; 
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
    // $ANTLR end "entryRuleComponentInstanceExtension"


    // $ANTLR start "ruleComponentInstanceExtension"
    // InternalComponentArchitecture.g:425:1: ruleComponentInstanceExtension returns [EObject current=null] : (this_ParameterStructInstance_0= ruleParameterStructInstance | this_ActivityConfigurationMapping_1= ruleActivityConfigurationMapping | this_InputHandlerConfigurationMapping_2= ruleInputHandlerConfigurationMapping | this_OpcUaDeviceClientInstance_3= ruleOpcUaDeviceClientInstance ) ;
    public final EObject ruleComponentInstanceExtension() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterStructInstance_0 = null;

        EObject this_ActivityConfigurationMapping_1 = null;

        EObject this_InputHandlerConfigurationMapping_2 = null;

        EObject this_OpcUaDeviceClientInstance_3 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:431:2: ( (this_ParameterStructInstance_0= ruleParameterStructInstance | this_ActivityConfigurationMapping_1= ruleActivityConfigurationMapping | this_InputHandlerConfigurationMapping_2= ruleInputHandlerConfigurationMapping | this_OpcUaDeviceClientInstance_3= ruleOpcUaDeviceClientInstance ) )
            // InternalComponentArchitecture.g:432:2: (this_ParameterStructInstance_0= ruleParameterStructInstance | this_ActivityConfigurationMapping_1= ruleActivityConfigurationMapping | this_InputHandlerConfigurationMapping_2= ruleInputHandlerConfigurationMapping | this_OpcUaDeviceClientInstance_3= ruleOpcUaDeviceClientInstance )
            {
            // InternalComponentArchitecture.g:432:2: (this_ParameterStructInstance_0= ruleParameterStructInstance | this_ActivityConfigurationMapping_1= ruleActivityConfigurationMapping | this_InputHandlerConfigurationMapping_2= ruleInputHandlerConfigurationMapping | this_OpcUaDeviceClientInstance_3= ruleOpcUaDeviceClientInstance )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalComponentArchitecture.g:433:3: this_ParameterStructInstance_0= ruleParameterStructInstance
                    {

                    			newCompositeNode(grammarAccess.getComponentInstanceExtensionAccess().getParameterStructInstanceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStructInstance_0=ruleParameterStructInstance();

                    state._fsp--;


                    			current = this_ParameterStructInstance_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentArchitecture.g:442:3: this_ActivityConfigurationMapping_1= ruleActivityConfigurationMapping
                    {

                    			newCompositeNode(grammarAccess.getComponentInstanceExtensionAccess().getActivityConfigurationMappingParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActivityConfigurationMapping_1=ruleActivityConfigurationMapping();

                    state._fsp--;


                    			current = this_ActivityConfigurationMapping_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentArchitecture.g:451:3: this_InputHandlerConfigurationMapping_2= ruleInputHandlerConfigurationMapping
                    {

                    			newCompositeNode(grammarAccess.getComponentInstanceExtensionAccess().getInputHandlerConfigurationMappingParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputHandlerConfigurationMapping_2=ruleInputHandlerConfigurationMapping();

                    state._fsp--;


                    			current = this_InputHandlerConfigurationMapping_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalComponentArchitecture.g:460:3: this_OpcUaDeviceClientInstance_3= ruleOpcUaDeviceClientInstance
                    {

                    			newCompositeNode(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaDeviceClientInstanceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpcUaDeviceClientInstance_3=ruleOpcUaDeviceClientInstance();

                    state._fsp--;


                    			current = this_OpcUaDeviceClientInstance_3;
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
    // $ANTLR end "ruleComponentInstanceExtension"


    // $ANTLR start "entryRuleParameterStructInstance"
    // InternalComponentArchitecture.g:472:1: entryRuleParameterStructInstance returns [EObject current=null] : iv_ruleParameterStructInstance= ruleParameterStructInstance EOF ;
    public final EObject entryRuleParameterStructInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructInstance = null;


        try {
            // InternalComponentArchitecture.g:472:64: (iv_ruleParameterStructInstance= ruleParameterStructInstance EOF )
            // InternalComponentArchitecture.g:473:2: iv_ruleParameterStructInstance= ruleParameterStructInstance EOF
            {
             newCompositeNode(grammarAccess.getParameterStructInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructInstance=ruleParameterStructInstance();

            state._fsp--;

             current =iv_ruleParameterStructInstance; 
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
    // $ANTLR end "entryRuleParameterStructInstance"


    // $ANTLR start "ruleParameterStructInstance"
    // InternalComponentArchitecture.g:479:1: ruleParameterStructInstance returns [EObject current=null] : (otherlv_0= 'ParameterStructInstance' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleParameterStructInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:485:2: ( (otherlv_0= 'ParameterStructInstance' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentArchitecture.g:486:2: (otherlv_0= 'ParameterStructInstance' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentArchitecture.g:486:2: (otherlv_0= 'ParameterStructInstance' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentArchitecture.g:487:3: otherlv_0= 'ParameterStructInstance' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStructInstanceAccess().getParameterStructInstanceKeyword_0());
            		
            // InternalComponentArchitecture.g:491:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:492:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:492:4: ( ruleFQN )
            // InternalComponentArchitecture.g:493:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterStructInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterStructInstanceAccess().getParameterComponentParameterInstanceCrossReference_1_0());
            				
            pushFollow(FOLLOW_11);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentArchitecture.g:507:3: (otherlv_2= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentArchitecture.g:508:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterStructInstanceAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleParameterStructInstance"


    // $ANTLR start "entryRuleActivityConfigurationMapping"
    // InternalComponentArchitecture.g:517:1: entryRuleActivityConfigurationMapping returns [EObject current=null] : iv_ruleActivityConfigurationMapping= ruleActivityConfigurationMapping EOF ;
    public final EObject entryRuleActivityConfigurationMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityConfigurationMapping = null;


        try {
            // InternalComponentArchitecture.g:517:69: (iv_ruleActivityConfigurationMapping= ruleActivityConfigurationMapping EOF )
            // InternalComponentArchitecture.g:518:2: iv_ruleActivityConfigurationMapping= ruleActivityConfigurationMapping EOF
            {
             newCompositeNode(grammarAccess.getActivityConfigurationMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityConfigurationMapping=ruleActivityConfigurationMapping();

            state._fsp--;

             current =iv_ruleActivityConfigurationMapping; 
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
    // $ANTLR end "entryRuleActivityConfigurationMapping"


    // $ANTLR start "ruleActivityConfigurationMapping"
    // InternalComponentArchitecture.g:524:1: ruleActivityConfigurationMapping returns [EObject current=null] : (otherlv_0= 'Activity' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleActivityConfigurationMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:530:2: ( (otherlv_0= 'Activity' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) )
            // InternalComponentArchitecture.g:531:2: (otherlv_0= 'Activity' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            {
            // InternalComponentArchitecture.g:531:2: (otherlv_0= 'Activity' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            // InternalComponentArchitecture.g:532:3: otherlv_0= 'Activity' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActivityConfigurationMappingAccess().getActivityKeyword_0());
            		
            // InternalComponentArchitecture.g:536:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:537:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:537:4: ( ruleFQN )
            // InternalComponentArchitecture.g:538:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityConfigurationMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActivityConfigurationMappingAccess().getActivityActivityCrossReference_1_0());
            				
            pushFollow(FOLLOW_15);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getActivityConfigurationMappingAccess().getConfigurationKeyword_2());
            		
            // InternalComponentArchitecture.g:556:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:557:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:557:4: ( ruleFQN )
            // InternalComponentArchitecture.g:558:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityConfigurationMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActivityConfigurationMappingAccess().getConfigActivityNodeCrossReference_3_0());
            				
            pushFollow(FOLLOW_11);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentArchitecture.g:572:3: (otherlv_4= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentArchitecture.g:573:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivityConfigurationMappingAccess().getSemicolonKeyword_4());
                    			

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
    // $ANTLR end "ruleActivityConfigurationMapping"


    // $ANTLR start "entryRuleInputHandlerConfigurationMapping"
    // InternalComponentArchitecture.g:582:1: entryRuleInputHandlerConfigurationMapping returns [EObject current=null] : iv_ruleInputHandlerConfigurationMapping= ruleInputHandlerConfigurationMapping EOF ;
    public final EObject entryRuleInputHandlerConfigurationMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputHandlerConfigurationMapping = null;


        try {
            // InternalComponentArchitecture.g:582:73: (iv_ruleInputHandlerConfigurationMapping= ruleInputHandlerConfigurationMapping EOF )
            // InternalComponentArchitecture.g:583:2: iv_ruleInputHandlerConfigurationMapping= ruleInputHandlerConfigurationMapping EOF
            {
             newCompositeNode(grammarAccess.getInputHandlerConfigurationMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputHandlerConfigurationMapping=ruleInputHandlerConfigurationMapping();

            state._fsp--;

             current =iv_ruleInputHandlerConfigurationMapping; 
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
    // $ANTLR end "entryRuleInputHandlerConfigurationMapping"


    // $ANTLR start "ruleInputHandlerConfigurationMapping"
    // InternalComponentArchitecture.g:589:1: ruleInputHandlerConfigurationMapping returns [EObject current=null] : (otherlv_0= 'InputHandler' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleInputHandlerConfigurationMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:595:2: ( (otherlv_0= 'InputHandler' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) )
            // InternalComponentArchitecture.g:596:2: (otherlv_0= 'InputHandler' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            {
            // InternalComponentArchitecture.g:596:2: (otherlv_0= 'InputHandler' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            // InternalComponentArchitecture.g:597:3: otherlv_0= 'InputHandler' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputHandlerConfigurationMappingAccess().getInputHandlerKeyword_0());
            		
            // InternalComponentArchitecture.g:601:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:602:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:602:4: ( ruleFQN )
            // InternalComponentArchitecture.g:603:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputHandlerConfigurationMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerInputHandlerCrossReference_1_0());
            				
            pushFollow(FOLLOW_15);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigurationKeyword_2());
            		
            // InternalComponentArchitecture.g:621:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:622:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:622:4: ( ruleFQN )
            // InternalComponentArchitecture.g:623:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputHandlerConfigurationMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigInputHandlerNodeCrossReference_3_0());
            				
            pushFollow(FOLLOW_11);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentArchitecture.g:637:3: (otherlv_4= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentArchitecture.g:638:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getInputHandlerConfigurationMappingAccess().getSemicolonKeyword_4());
                    			

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
    // $ANTLR end "ruleInputHandlerConfigurationMapping"


    // $ANTLR start "entryRuleOpcUaDeviceClientInstance"
    // InternalComponentArchitecture.g:647:1: entryRuleOpcUaDeviceClientInstance returns [EObject current=null] : iv_ruleOpcUaDeviceClientInstance= ruleOpcUaDeviceClientInstance EOF ;
    public final EObject entryRuleOpcUaDeviceClientInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUaDeviceClientInstance = null;


        try {
            // InternalComponentArchitecture.g:647:66: (iv_ruleOpcUaDeviceClientInstance= ruleOpcUaDeviceClientInstance EOF )
            // InternalComponentArchitecture.g:648:2: iv_ruleOpcUaDeviceClientInstance= ruleOpcUaDeviceClientInstance EOF
            {
             newCompositeNode(grammarAccess.getOpcUaDeviceClientInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpcUaDeviceClientInstance=ruleOpcUaDeviceClientInstance();

            state._fsp--;

             current =iv_ruleOpcUaDeviceClientInstance; 
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
    // $ANTLR end "entryRuleOpcUaDeviceClientInstance"


    // $ANTLR start "ruleOpcUaDeviceClientInstance"
    // InternalComponentArchitecture.g:654:1: ruleOpcUaDeviceClientInstance returns [EObject current=null] : (otherlv_0= 'OpcUaDeviceClientInstance' ( ( ruleFQN ) ) otherlv_2= 'deviceURI' ( (lv_deviceURI_3_0= ruleEString ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleOpcUaDeviceClientInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_deviceURI_3_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:660:2: ( (otherlv_0= 'OpcUaDeviceClientInstance' ( ( ruleFQN ) ) otherlv_2= 'deviceURI' ( (lv_deviceURI_3_0= ruleEString ) ) (otherlv_4= ';' )? ) )
            // InternalComponentArchitecture.g:661:2: (otherlv_0= 'OpcUaDeviceClientInstance' ( ( ruleFQN ) ) otherlv_2= 'deviceURI' ( (lv_deviceURI_3_0= ruleEString ) ) (otherlv_4= ';' )? )
            {
            // InternalComponentArchitecture.g:661:2: (otherlv_0= 'OpcUaDeviceClientInstance' ( ( ruleFQN ) ) otherlv_2= 'deviceURI' ( (lv_deviceURI_3_0= ruleEString ) ) (otherlv_4= ';' )? )
            // InternalComponentArchitecture.g:662:3: otherlv_0= 'OpcUaDeviceClientInstance' ( ( ruleFQN ) ) otherlv_2= 'deviceURI' ( (lv_deviceURI_3_0= ruleEString ) ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpcUaDeviceClientInstanceAccess().getOpcUaDeviceClientInstanceKeyword_0());
            		
            // InternalComponentArchitecture.g:666:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:667:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:667:4: ( ruleFQN )
            // InternalComponentArchitecture.g:668:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpcUaDeviceClientInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientOpcUaDeviceClientCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIKeyword_2());
            		
            // InternalComponentArchitecture.g:686:3: ( (lv_deviceURI_3_0= ruleEString ) )
            // InternalComponentArchitecture.g:687:4: (lv_deviceURI_3_0= ruleEString )
            {
            // InternalComponentArchitecture.g:687:4: (lv_deviceURI_3_0= ruleEString )
            // InternalComponentArchitecture.g:688:5: lv_deviceURI_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_deviceURI_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpcUaDeviceClientInstanceRule());
            					}
            					set(
            						current,
            						"deviceURI",
            						lv_deviceURI_3_0,
            						"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentArchitecture.g:705:3: (otherlv_4= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentArchitecture.g:706:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpcUaDeviceClientInstanceAccess().getSemicolonKeyword_4());
                    			

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
    // $ANTLR end "ruleOpcUaDeviceClientInstance"


    // $ANTLR start "entryRuleServiceInstance"
    // InternalComponentArchitecture.g:715:1: entryRuleServiceInstance returns [EObject current=null] : iv_ruleServiceInstance= ruleServiceInstance EOF ;
    public final EObject entryRuleServiceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceInstance = null;


        try {
            // InternalComponentArchitecture.g:715:56: (iv_ruleServiceInstance= ruleServiceInstance EOF )
            // InternalComponentArchitecture.g:716:2: iv_ruleServiceInstance= ruleServiceInstance EOF
            {
             newCompositeNode(grammarAccess.getServiceInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceInstance=ruleServiceInstance();

            state._fsp--;

             current =iv_ruleServiceInstance; 
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
    // $ANTLR end "entryRuleServiceInstance"


    // $ANTLR start "ruleServiceInstance"
    // InternalComponentArchitecture.g:722:1: ruleServiceInstance returns [EObject current=null] : (this_RequiredService_0= ruleRequiredService | this_ProvidedService_1= ruleProvidedService ) ;
    public final EObject ruleServiceInstance() throws RecognitionException {
        EObject current = null;

        EObject this_RequiredService_0 = null;

        EObject this_ProvidedService_1 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:728:2: ( (this_RequiredService_0= ruleRequiredService | this_ProvidedService_1= ruleProvidedService ) )
            // InternalComponentArchitecture.g:729:2: (this_RequiredService_0= ruleRequiredService | this_ProvidedService_1= ruleProvidedService )
            {
            // InternalComponentArchitecture.g:729:2: (this_RequiredService_0= ruleRequiredService | this_ProvidedService_1= ruleProvidedService )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentArchitecture.g:730:3: this_RequiredService_0= ruleRequiredService
                    {

                    			newCompositeNode(grammarAccess.getServiceInstanceAccess().getRequiredServiceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequiredService_0=ruleRequiredService();

                    state._fsp--;


                    			current = this_RequiredService_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentArchitecture.g:739:3: this_ProvidedService_1= ruleProvidedService
                    {

                    			newCompositeNode(grammarAccess.getServiceInstanceAccess().getProvidedServiceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProvidedService_1=ruleProvidedService();

                    state._fsp--;


                    			current = this_ProvidedService_1;
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
    // $ANTLR end "ruleServiceInstance"


    // $ANTLR start "entryRuleRequiredService"
    // InternalComponentArchitecture.g:751:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // InternalComponentArchitecture.g:751:56: (iv_ruleRequiredService= ruleRequiredService EOF )
            // InternalComponentArchitecture.g:752:2: iv_ruleRequiredService= ruleRequiredService EOF
            {
             newCompositeNode(grammarAccess.getRequiredServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredService=ruleRequiredService();

            state._fsp--;

             current =iv_ruleRequiredService; 
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
    // $ANTLR end "entryRuleRequiredService"


    // $ANTLR start "ruleRequiredService"
    // InternalComponentArchitecture.g:758:1: ruleRequiredService returns [EObject current=null] : (otherlv_0= 'RequiredService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:764:2: ( (otherlv_0= 'RequiredService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // InternalComponentArchitecture.g:765:2: (otherlv_0= 'RequiredService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentArchitecture.g:765:2: (otherlv_0= 'RequiredService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            // InternalComponentArchitecture.g:766:3: otherlv_0= 'RequiredService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_0());
            		
            // InternalComponentArchitecture.g:770:3: ( (otherlv_1= RULE_ID ) )
            // InternalComponentArchitecture.g:771:4: (otherlv_1= RULE_ID )
            {
            // InternalComponentArchitecture.g:771:4: (otherlv_1= RULE_ID )
            // InternalComponentArchitecture.g:772:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredServiceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getPortComponentPortCrossReference_1_0());
            				

            }


            }

            // InternalComponentArchitecture.g:783:3: (otherlv_2= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentArchitecture.g:784:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleRequiredService"


    // $ANTLR start "entryRuleProvidedService"
    // InternalComponentArchitecture.g:793:1: entryRuleProvidedService returns [EObject current=null] : iv_ruleProvidedService= ruleProvidedService EOF ;
    public final EObject entryRuleProvidedService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedService = null;


        try {
            // InternalComponentArchitecture.g:793:56: (iv_ruleProvidedService= ruleProvidedService EOF )
            // InternalComponentArchitecture.g:794:2: iv_ruleProvidedService= ruleProvidedService EOF
            {
             newCompositeNode(grammarAccess.getProvidedServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvidedService=ruleProvidedService();

            state._fsp--;

             current =iv_ruleProvidedService; 
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
    // $ANTLR end "entryRuleProvidedService"


    // $ANTLR start "ruleProvidedService"
    // InternalComponentArchitecture.g:800:1: ruleProvidedService returns [EObject current=null] : (otherlv_0= 'ProvidedService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleProvidedService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:806:2: ( (otherlv_0= 'ProvidedService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // InternalComponentArchitecture.g:807:2: (otherlv_0= 'ProvidedService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentArchitecture.g:807:2: (otherlv_0= 'ProvidedService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            // InternalComponentArchitecture.g:808:3: otherlv_0= 'ProvidedService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_0());
            		
            // InternalComponentArchitecture.g:812:3: ( (otherlv_1= RULE_ID ) )
            // InternalComponentArchitecture.g:813:4: (otherlv_1= RULE_ID )
            {
            // InternalComponentArchitecture.g:813:4: (otherlv_1= RULE_ID )
            // InternalComponentArchitecture.g:814:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedServiceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_1, grammarAccess.getProvidedServiceAccess().getPortComponentPortCrossReference_1_0());
            				

            }


            }

            // InternalComponentArchitecture.g:825:3: (otherlv_2= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentArchitecture.g:826:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getProvidedServiceAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleProvidedService"


    // $ANTLR start "entryRuleRoboticMiddleware"
    // InternalComponentArchitecture.g:835:1: entryRuleRoboticMiddleware returns [EObject current=null] : iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF ;
    public final EObject entryRuleRoboticMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoboticMiddleware = null;


        try {
            // InternalComponentArchitecture.g:835:58: (iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF )
            // InternalComponentArchitecture.g:836:2: iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF
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
    // InternalComponentArchitecture.g:842:1: ruleRoboticMiddleware returns [EObject current=null] : (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft ) ;
    public final EObject ruleRoboticMiddleware() throws RecognitionException {
        EObject current = null;

        EObject this_ACE_SmartSoft_0 = null;

        EObject this_OpcUa_SeRoNet_1 = null;

        EObject this_CORBA_SmartSoft_2 = null;

        EObject this_DDS_SmartSoft_3 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:848:2: ( (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft ) )
            // InternalComponentArchitecture.g:849:2: (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft )
            {
            // InternalComponentArchitecture.g:849:2: (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt16=1;
                }
                break;
            case 32:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            case 34:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalComponentArchitecture.g:850:3: this_ACE_SmartSoft_0= ruleACE_SmartSoft
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
                    // InternalComponentArchitecture.g:859:3: this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet
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
                    // InternalComponentArchitecture.g:868:3: this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft
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
                    // InternalComponentArchitecture.g:877:3: this_DDS_SmartSoft_3= ruleDDS_SmartSoft
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
    // InternalComponentArchitecture.g:889:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalComponentArchitecture.g:889:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalComponentArchitecture.g:890:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalComponentArchitecture.g:896:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:902:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalComponentArchitecture.g:903:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalComponentArchitecture.g:903:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalComponentArchitecture.g:904:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponentArchitecture.g:911:3: (kw= '.' this_ID_2= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalComponentArchitecture.g:912:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalComponentArchitecture.g:929:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentArchitecture.g:929:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentArchitecture.g:930:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentArchitecture.g:936:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:942:2: (this_STRING_0= RULE_STRING )
            // InternalComponentArchitecture.g:943:2: this_STRING_0= RULE_STRING
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
    // InternalComponentArchitecture.g:953:1: entryRuleACE_SmartSoft returns [EObject current=null] : iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF ;
    public final EObject entryRuleACE_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACE_SmartSoft = null;


        try {
            // InternalComponentArchitecture.g:953:54: (iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF )
            // InternalComponentArchitecture.g:954:2: iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF
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
    // InternalComponentArchitecture.g:960:1: ruleACE_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleACE_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:966:2: ( ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentArchitecture.g:967:2: ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentArchitecture.g:967:2: ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentArchitecture.g:968:3: () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentArchitecture.g:968:3: ()
            // InternalComponentArchitecture.g:969:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1());
            		
            // InternalComponentArchitecture.g:979:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentArchitecture.g:980:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentArchitecture.g:984:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentArchitecture.g:985:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentArchitecture.g:985:5: (lv_description_3_0= ruleEString )
                    // InternalComponentArchitecture.g:986:6: lv_description_3_0= ruleEString
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
    // InternalComponentArchitecture.g:1008:1: entryRuleOpcUa_SeRoNet returns [EObject current=null] : iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF ;
    public final EObject entryRuleOpcUa_SeRoNet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUa_SeRoNet = null;


        try {
            // InternalComponentArchitecture.g:1008:54: (iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF )
            // InternalComponentArchitecture.g:1009:2: iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF
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
    // InternalComponentArchitecture.g:1015:1: ruleOpcUa_SeRoNet returns [EObject current=null] : ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleOpcUa_SeRoNet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:1021:2: ( ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentArchitecture.g:1022:2: ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentArchitecture.g:1022:2: ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentArchitecture.g:1023:3: () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentArchitecture.g:1023:3: ()
            // InternalComponentArchitecture.g:1024:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1());
            		
            // InternalComponentArchitecture.g:1034:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentArchitecture.g:1035:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentArchitecture.g:1039:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentArchitecture.g:1040:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentArchitecture.g:1040:5: (lv_description_3_0= ruleEString )
                    // InternalComponentArchitecture.g:1041:6: lv_description_3_0= ruleEString
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
    // InternalComponentArchitecture.g:1063:1: entryRuleCORBA_SmartSoft returns [EObject current=null] : iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF ;
    public final EObject entryRuleCORBA_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCORBA_SmartSoft = null;


        try {
            // InternalComponentArchitecture.g:1063:56: (iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF )
            // InternalComponentArchitecture.g:1064:2: iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF
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
    // InternalComponentArchitecture.g:1070:1: ruleCORBA_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleCORBA_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:1076:2: ( ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentArchitecture.g:1077:2: ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentArchitecture.g:1077:2: ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentArchitecture.g:1078:3: () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentArchitecture.g:1078:3: ()
            // InternalComponentArchitecture.g:1079:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1());
            		
            // InternalComponentArchitecture.g:1089:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentArchitecture.g:1090:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentArchitecture.g:1094:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentArchitecture.g:1095:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentArchitecture.g:1095:5: (lv_description_3_0= ruleEString )
                    // InternalComponentArchitecture.g:1096:6: lv_description_3_0= ruleEString
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
    // InternalComponentArchitecture.g:1118:1: entryRuleDDS_SmartSoft returns [EObject current=null] : iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF ;
    public final EObject entryRuleDDS_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDS_SmartSoft = null;


        try {
            // InternalComponentArchitecture.g:1118:54: (iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF )
            // InternalComponentArchitecture.g:1119:2: iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF
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
    // InternalComponentArchitecture.g:1125:1: ruleDDS_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleDDS_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:1131:2: ( ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentArchitecture.g:1132:2: ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentArchitecture.g:1132:2: ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentArchitecture.g:1133:3: () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentArchitecture.g:1133:3: ()
            // InternalComponentArchitecture.g:1134:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1());
            		
            // InternalComponentArchitecture.g:1144:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentArchitecture.g:1145:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentArchitecture.g:1149:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentArchitecture.g:1150:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentArchitecture.g:1150:5: (lv_description_3_0= ruleEString )
                    // InternalComponentArchitecture.g:1151:6: lv_description_3_0= ruleEString
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000008C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000740000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001B604000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003604000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000002L});

}