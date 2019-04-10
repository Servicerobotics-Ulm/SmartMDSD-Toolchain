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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SystemComponentArchitecture'", "'usingActivityArchitecture'", "'{'", "'}'", "'Connection'", "'->'", "'useMiddleware'", "';'", "'ComponentInstance'", "'instantiates'", "'ParameterStructInstance'", "'Activity'", "'configuration'", "'InputHandler'", "'OpcUaDeviceClientInstance'", "'deviceURI'", "'OpcUaReadServerInstance'", "'portNumber'", "'RequiredService'", "'ProvidedService'", "'CoordinationModuleMapping'", "'moduleInstance'", "'realizedby'", "'interfaceInstance'", "'BehaviorTaskRef'", "'.'", "'-'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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
    // InternalComponentArchitecture.g:112:1: ruleSystemComponentArchitecture returns [EObject current=null] : ( () otherlv_1= 'SystemComponentArchitecture' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'usingActivityArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_components_6_0= ruleComponentInstance ) )* ( (lv_connections_7_0= ruleConnection ) )* ( (lv_extensions_8_0= ruleSystemExtension ) )* otherlv_9= '}' ) ;
    public final EObject ruleSystemComponentArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_components_6_0 = null;

        EObject lv_connections_7_0 = null;

        EObject lv_extensions_8_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:118:2: ( ( () otherlv_1= 'SystemComponentArchitecture' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'usingActivityArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_components_6_0= ruleComponentInstance ) )* ( (lv_connections_7_0= ruleConnection ) )* ( (lv_extensions_8_0= ruleSystemExtension ) )* otherlv_9= '}' ) )
            // InternalComponentArchitecture.g:119:2: ( () otherlv_1= 'SystemComponentArchitecture' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'usingActivityArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_components_6_0= ruleComponentInstance ) )* ( (lv_connections_7_0= ruleConnection ) )* ( (lv_extensions_8_0= ruleSystemExtension ) )* otherlv_9= '}' )
            {
            // InternalComponentArchitecture.g:119:2: ( () otherlv_1= 'SystemComponentArchitecture' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'usingActivityArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_components_6_0= ruleComponentInstance ) )* ( (lv_connections_7_0= ruleConnection ) )* ( (lv_extensions_8_0= ruleSystemExtension ) )* otherlv_9= '}' )
            // InternalComponentArchitecture.g:120:3: () otherlv_1= 'SystemComponentArchitecture' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'usingActivityArchitecture' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_components_6_0= ruleComponentInstance ) )* ( (lv_connections_7_0= ruleConnection ) )* ( (lv_extensions_8_0= ruleSystemExtension ) )* otherlv_9= '}'
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

            // InternalComponentArchitecture.g:213:3: ( (lv_extensions_8_0= ruleSystemExtension ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==31||LA4_0==35) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalComponentArchitecture.g:214:4: (lv_extensions_8_0= ruleSystemExtension )
            	    {
            	    // InternalComponentArchitecture.g:214:4: (lv_extensions_8_0= ruleSystemExtension )
            	    // InternalComponentArchitecture.g:215:5: lv_extensions_8_0= ruleSystemExtension
            	    {

            	    					newCompositeNode(grammarAccess.getSystemComponentArchitectureAccess().getExtensionsSystemExtensionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_extensions_8_0=ruleSystemExtension();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemComponentArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_8_0,
            	    						"org.xtext.system.componentArchitecture.ComponentArchitecture.SystemExtension");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSystemComponentArchitectureAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleSystemExtension"
    // InternalComponentArchitecture.g:240:1: entryRuleSystemExtension returns [EObject current=null] : iv_ruleSystemExtension= ruleSystemExtension EOF ;
    public final EObject entryRuleSystemExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemExtension = null;


        try {
            // InternalComponentArchitecture.g:240:56: (iv_ruleSystemExtension= ruleSystemExtension EOF )
            // InternalComponentArchitecture.g:241:2: iv_ruleSystemExtension= ruleSystemExtension EOF
            {
             newCompositeNode(grammarAccess.getSystemExtensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemExtension=ruleSystemExtension();

            state._fsp--;

             current =iv_ruleSystemExtension; 
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
    // $ANTLR end "entryRuleSystemExtension"


    // $ANTLR start "ruleSystemExtension"
    // InternalComponentArchitecture.g:247:1: ruleSystemExtension returns [EObject current=null] : (this_CoordinationModuleMapping_0= ruleCoordinationModuleMapping | this_TaskRealizationModelRef_1= ruleTaskRealizationModelRef ) ;
    public final EObject ruleSystemExtension() throws RecognitionException {
        EObject current = null;

        EObject this_CoordinationModuleMapping_0 = null;

        EObject this_TaskRealizationModelRef_1 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:253:2: ( (this_CoordinationModuleMapping_0= ruleCoordinationModuleMapping | this_TaskRealizationModelRef_1= ruleTaskRealizationModelRef ) )
            // InternalComponentArchitecture.g:254:2: (this_CoordinationModuleMapping_0= ruleCoordinationModuleMapping | this_TaskRealizationModelRef_1= ruleTaskRealizationModelRef )
            {
            // InternalComponentArchitecture.g:254:2: (this_CoordinationModuleMapping_0= ruleCoordinationModuleMapping | this_TaskRealizationModelRef_1= ruleTaskRealizationModelRef )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            else if ( (LA5_0==35) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentArchitecture.g:255:3: this_CoordinationModuleMapping_0= ruleCoordinationModuleMapping
                    {

                    			newCompositeNode(grammarAccess.getSystemExtensionAccess().getCoordinationModuleMappingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoordinationModuleMapping_0=ruleCoordinationModuleMapping();

                    state._fsp--;


                    			current = this_CoordinationModuleMapping_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentArchitecture.g:264:3: this_TaskRealizationModelRef_1= ruleTaskRealizationModelRef
                    {

                    			newCompositeNode(grammarAccess.getSystemExtensionAccess().getTaskRealizationModelRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskRealizationModelRef_1=ruleTaskRealizationModelRef();

                    state._fsp--;


                    			current = this_TaskRealizationModelRef_1;
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
    // $ANTLR end "ruleSystemExtension"


    // $ANTLR start "entryRuleConnection"
    // InternalComponentArchitecture.g:276:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalComponentArchitecture.g:276:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalComponentArchitecture.g:277:2: iv_ruleConnection= ruleConnection EOF
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
    // InternalComponentArchitecture.g:283:1: ruleConnection returns [EObject current=null] : (otherlv_0= 'Connection' ( ( ruleFQN ) ) otherlv_2= '->' ( ( ruleFQN ) ) (otherlv_4= 'useMiddleware' ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) ) )? (otherlv_6= ';' )? ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_middlewareSelection_5_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:289:2: ( (otherlv_0= 'Connection' ( ( ruleFQN ) ) otherlv_2= '->' ( ( ruleFQN ) ) (otherlv_4= 'useMiddleware' ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) ) )? (otherlv_6= ';' )? ) )
            // InternalComponentArchitecture.g:290:2: (otherlv_0= 'Connection' ( ( ruleFQN ) ) otherlv_2= '->' ( ( ruleFQN ) ) (otherlv_4= 'useMiddleware' ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) ) )? (otherlv_6= ';' )? )
            {
            // InternalComponentArchitecture.g:290:2: (otherlv_0= 'Connection' ( ( ruleFQN ) ) otherlv_2= '->' ( ( ruleFQN ) ) (otherlv_4= 'useMiddleware' ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) ) )? (otherlv_6= ';' )? )
            // InternalComponentArchitecture.g:291:3: otherlv_0= 'Connection' ( ( ruleFQN ) ) otherlv_2= '->' ( ( ruleFQN ) ) (otherlv_4= 'useMiddleware' ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) ) )? (otherlv_6= ';' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getConnectionKeyword_0());
            		
            // InternalComponentArchitecture.g:295:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:296:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:296:4: ( ruleFQN )
            // InternalComponentArchitecture.g:297:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectionAccess().getFromRequiredServiceCrossReference_1_0());
            				
            pushFollow(FOLLOW_9);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalComponentArchitecture.g:315:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:316:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:316:4: ( ruleFQN )
            // InternalComponentArchitecture.g:317:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectionAccess().getToProvidedServiceCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentArchitecture.g:331:3: (otherlv_4= 'useMiddleware' ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentArchitecture.g:332:4: otherlv_4= 'useMiddleware' ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getUseMiddlewareKeyword_4_0());
                    			
                    // InternalComponentArchitecture.g:336:4: ( (lv_middlewareSelection_5_0= ruleRoboticMiddleware ) )
                    // InternalComponentArchitecture.g:337:5: (lv_middlewareSelection_5_0= ruleRoboticMiddleware )
                    {
                    // InternalComponentArchitecture.g:337:5: (lv_middlewareSelection_5_0= ruleRoboticMiddleware )
                    // InternalComponentArchitecture.g:338:6: lv_middlewareSelection_5_0= ruleRoboticMiddleware
                    {

                    						newCompositeNode(grammarAccess.getConnectionAccess().getMiddlewareSelectionRoboticMiddlewareParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
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

            // InternalComponentArchitecture.g:356:3: (otherlv_6= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentArchitecture.g:357:4: otherlv_6= ';'
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
    // InternalComponentArchitecture.g:366:1: entryRuleComponentInstance returns [EObject current=null] : iv_ruleComponentInstance= ruleComponentInstance EOF ;
    public final EObject entryRuleComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstance = null;


        try {
            // InternalComponentArchitecture.g:366:58: (iv_ruleComponentInstance= ruleComponentInstance EOF )
            // InternalComponentArchitecture.g:367:2: iv_ruleComponentInstance= ruleComponentInstance EOF
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
    // InternalComponentArchitecture.g:373:1: ruleComponentInstance returns [EObject current=null] : (otherlv_0= 'ComponentInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'instantiates' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_ports_5_0= ruleServiceInstance ) )* ( (lv_extensions_6_0= ruleComponentInstanceExtension ) )* otherlv_7= '}' ) ;
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
            // InternalComponentArchitecture.g:379:2: ( (otherlv_0= 'ComponentInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'instantiates' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_ports_5_0= ruleServiceInstance ) )* ( (lv_extensions_6_0= ruleComponentInstanceExtension ) )* otherlv_7= '}' ) )
            // InternalComponentArchitecture.g:380:2: (otherlv_0= 'ComponentInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'instantiates' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_ports_5_0= ruleServiceInstance ) )* ( (lv_extensions_6_0= ruleComponentInstanceExtension ) )* otherlv_7= '}' )
            {
            // InternalComponentArchitecture.g:380:2: (otherlv_0= 'ComponentInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'instantiates' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_ports_5_0= ruleServiceInstance ) )* ( (lv_extensions_6_0= ruleComponentInstanceExtension ) )* otherlv_7= '}' )
            // InternalComponentArchitecture.g:381:3: otherlv_0= 'ComponentInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'instantiates' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_ports_5_0= ruleServiceInstance ) )* ( (lv_extensions_6_0= ruleComponentInstanceExtension ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInstanceAccess().getComponentInstanceKeyword_0());
            		
            // InternalComponentArchitecture.g:385:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentArchitecture.g:386:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentArchitecture.g:386:4: (lv_name_1_0= RULE_ID )
            // InternalComponentArchitecture.g:387:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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
            		
            // InternalComponentArchitecture.g:407:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:408:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:408:4: ( ruleFQN )
            // InternalComponentArchitecture.g:409:5: ruleFQN
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

            otherlv_4=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentInstanceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponentArchitecture.g:427:3: ( (lv_ports_5_0= ruleServiceInstance ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=29 && LA8_0<=30)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalComponentArchitecture.g:428:4: (lv_ports_5_0= ruleServiceInstance )
            	    {
            	    // InternalComponentArchitecture.g:428:4: (lv_ports_5_0= ruleServiceInstance )
            	    // InternalComponentArchitecture.g:429:5: lv_ports_5_0= ruleServiceInstance
            	    {

            	    					newCompositeNode(grammarAccess.getComponentInstanceAccess().getPortsServiceInstanceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop8;
                }
            } while (true);

            // InternalComponentArchitecture.g:446:3: ( (lv_extensions_6_0= ruleComponentInstanceExtension ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=21 && LA9_0<=22)||(LA9_0>=24 && LA9_0<=25)||LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalComponentArchitecture.g:447:4: (lv_extensions_6_0= ruleComponentInstanceExtension )
            	    {
            	    // InternalComponentArchitecture.g:447:4: (lv_extensions_6_0= ruleComponentInstanceExtension )
            	    // InternalComponentArchitecture.g:448:5: lv_extensions_6_0= ruleComponentInstanceExtension
            	    {

            	    					newCompositeNode(grammarAccess.getComponentInstanceAccess().getExtensionsComponentInstanceExtensionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop9;
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
    // InternalComponentArchitecture.g:473:1: entryRuleComponentInstanceExtension returns [EObject current=null] : iv_ruleComponentInstanceExtension= ruleComponentInstanceExtension EOF ;
    public final EObject entryRuleComponentInstanceExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstanceExtension = null;


        try {
            // InternalComponentArchitecture.g:473:67: (iv_ruleComponentInstanceExtension= ruleComponentInstanceExtension EOF )
            // InternalComponentArchitecture.g:474:2: iv_ruleComponentInstanceExtension= ruleComponentInstanceExtension EOF
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
    // InternalComponentArchitecture.g:480:1: ruleComponentInstanceExtension returns [EObject current=null] : (this_ParameterStructInstance_0= ruleParameterStructInstance | this_ActivityConfigurationMapping_1= ruleActivityConfigurationMapping | this_InputHandlerConfigurationMapping_2= ruleInputHandlerConfigurationMapping | this_OpcUaDeviceClientInstance_3= ruleOpcUaDeviceClientInstance | this_OpcUaReadServerInstance_4= ruleOpcUaReadServerInstance ) ;
    public final EObject ruleComponentInstanceExtension() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterStructInstance_0 = null;

        EObject this_ActivityConfigurationMapping_1 = null;

        EObject this_InputHandlerConfigurationMapping_2 = null;

        EObject this_OpcUaDeviceClientInstance_3 = null;

        EObject this_OpcUaReadServerInstance_4 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:486:2: ( (this_ParameterStructInstance_0= ruleParameterStructInstance | this_ActivityConfigurationMapping_1= ruleActivityConfigurationMapping | this_InputHandlerConfigurationMapping_2= ruleInputHandlerConfigurationMapping | this_OpcUaDeviceClientInstance_3= ruleOpcUaDeviceClientInstance | this_OpcUaReadServerInstance_4= ruleOpcUaReadServerInstance ) )
            // InternalComponentArchitecture.g:487:2: (this_ParameterStructInstance_0= ruleParameterStructInstance | this_ActivityConfigurationMapping_1= ruleActivityConfigurationMapping | this_InputHandlerConfigurationMapping_2= ruleInputHandlerConfigurationMapping | this_OpcUaDeviceClientInstance_3= ruleOpcUaDeviceClientInstance | this_OpcUaReadServerInstance_4= ruleOpcUaReadServerInstance )
            {
            // InternalComponentArchitecture.g:487:2: (this_ParameterStructInstance_0= ruleParameterStructInstance | this_ActivityConfigurationMapping_1= ruleActivityConfigurationMapping | this_InputHandlerConfigurationMapping_2= ruleInputHandlerConfigurationMapping | this_OpcUaDeviceClientInstance_3= ruleOpcUaDeviceClientInstance | this_OpcUaReadServerInstance_4= ruleOpcUaReadServerInstance )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 24:
                {
                alt10=3;
                }
                break;
            case 25:
                {
                alt10=4;
                }
                break;
            case 27:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalComponentArchitecture.g:488:3: this_ParameterStructInstance_0= ruleParameterStructInstance
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
                    // InternalComponentArchitecture.g:497:3: this_ActivityConfigurationMapping_1= ruleActivityConfigurationMapping
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
                    // InternalComponentArchitecture.g:506:3: this_InputHandlerConfigurationMapping_2= ruleInputHandlerConfigurationMapping
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
                    // InternalComponentArchitecture.g:515:3: this_OpcUaDeviceClientInstance_3= ruleOpcUaDeviceClientInstance
                    {

                    			newCompositeNode(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaDeviceClientInstanceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpcUaDeviceClientInstance_3=ruleOpcUaDeviceClientInstance();

                    state._fsp--;


                    			current = this_OpcUaDeviceClientInstance_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalComponentArchitecture.g:524:3: this_OpcUaReadServerInstance_4= ruleOpcUaReadServerInstance
                    {

                    			newCompositeNode(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaReadServerInstanceParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpcUaReadServerInstance_4=ruleOpcUaReadServerInstance();

                    state._fsp--;


                    			current = this_OpcUaReadServerInstance_4;
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
    // InternalComponentArchitecture.g:536:1: entryRuleParameterStructInstance returns [EObject current=null] : iv_ruleParameterStructInstance= ruleParameterStructInstance EOF ;
    public final EObject entryRuleParameterStructInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructInstance = null;


        try {
            // InternalComponentArchitecture.g:536:64: (iv_ruleParameterStructInstance= ruleParameterStructInstance EOF )
            // InternalComponentArchitecture.g:537:2: iv_ruleParameterStructInstance= ruleParameterStructInstance EOF
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
    // InternalComponentArchitecture.g:543:1: ruleParameterStructInstance returns [EObject current=null] : (otherlv_0= 'ParameterStructInstance' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleParameterStructInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:549:2: ( (otherlv_0= 'ParameterStructInstance' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentArchitecture.g:550:2: (otherlv_0= 'ParameterStructInstance' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentArchitecture.g:550:2: (otherlv_0= 'ParameterStructInstance' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentArchitecture.g:551:3: otherlv_0= 'ParameterStructInstance' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStructInstanceAccess().getParameterStructInstanceKeyword_0());
            		
            // InternalComponentArchitecture.g:555:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:556:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:556:4: ( ruleFQN )
            // InternalComponentArchitecture.g:557:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterStructInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterStructInstanceAccess().getParameterComponentParameterInstanceCrossReference_1_0());
            				
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentArchitecture.g:571:3: (otherlv_2= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentArchitecture.g:572:4: otherlv_2= ';'
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
    // InternalComponentArchitecture.g:581:1: entryRuleActivityConfigurationMapping returns [EObject current=null] : iv_ruleActivityConfigurationMapping= ruleActivityConfigurationMapping EOF ;
    public final EObject entryRuleActivityConfigurationMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityConfigurationMapping = null;


        try {
            // InternalComponentArchitecture.g:581:69: (iv_ruleActivityConfigurationMapping= ruleActivityConfigurationMapping EOF )
            // InternalComponentArchitecture.g:582:2: iv_ruleActivityConfigurationMapping= ruleActivityConfigurationMapping EOF
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
    // InternalComponentArchitecture.g:588:1: ruleActivityConfigurationMapping returns [EObject current=null] : (otherlv_0= 'Activity' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleActivityConfigurationMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:594:2: ( (otherlv_0= 'Activity' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) )
            // InternalComponentArchitecture.g:595:2: (otherlv_0= 'Activity' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            {
            // InternalComponentArchitecture.g:595:2: (otherlv_0= 'Activity' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            // InternalComponentArchitecture.g:596:3: otherlv_0= 'Activity' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActivityConfigurationMappingAccess().getActivityKeyword_0());
            		
            // InternalComponentArchitecture.g:600:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:601:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:601:4: ( ruleFQN )
            // InternalComponentArchitecture.g:602:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityConfigurationMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActivityConfigurationMappingAccess().getActivityActivityCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getActivityConfigurationMappingAccess().getConfigurationKeyword_2());
            		
            // InternalComponentArchitecture.g:620:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:621:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:621:4: ( ruleFQN )
            // InternalComponentArchitecture.g:622:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityConfigurationMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActivityConfigurationMappingAccess().getConfigActivityNodeCrossReference_3_0());
            				
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentArchitecture.g:636:3: (otherlv_4= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentArchitecture.g:637:4: otherlv_4= ';'
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
    // InternalComponentArchitecture.g:646:1: entryRuleInputHandlerConfigurationMapping returns [EObject current=null] : iv_ruleInputHandlerConfigurationMapping= ruleInputHandlerConfigurationMapping EOF ;
    public final EObject entryRuleInputHandlerConfigurationMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputHandlerConfigurationMapping = null;


        try {
            // InternalComponentArchitecture.g:646:73: (iv_ruleInputHandlerConfigurationMapping= ruleInputHandlerConfigurationMapping EOF )
            // InternalComponentArchitecture.g:647:2: iv_ruleInputHandlerConfigurationMapping= ruleInputHandlerConfigurationMapping EOF
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
    // InternalComponentArchitecture.g:653:1: ruleInputHandlerConfigurationMapping returns [EObject current=null] : (otherlv_0= 'InputHandler' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleInputHandlerConfigurationMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:659:2: ( (otherlv_0= 'InputHandler' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) )
            // InternalComponentArchitecture.g:660:2: (otherlv_0= 'InputHandler' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            {
            // InternalComponentArchitecture.g:660:2: (otherlv_0= 'InputHandler' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            // InternalComponentArchitecture.g:661:3: otherlv_0= 'InputHandler' ( ( ruleFQN ) ) otherlv_2= 'configuration' ( ( ruleFQN ) ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputHandlerConfigurationMappingAccess().getInputHandlerKeyword_0());
            		
            // InternalComponentArchitecture.g:665:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:666:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:666:4: ( ruleFQN )
            // InternalComponentArchitecture.g:667:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputHandlerConfigurationMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerInputHandlerCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigurationKeyword_2());
            		
            // InternalComponentArchitecture.g:685:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:686:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:686:4: ( ruleFQN )
            // InternalComponentArchitecture.g:687:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputHandlerConfigurationMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigInputHandlerNodeCrossReference_3_0());
            				
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentArchitecture.g:701:3: (otherlv_4= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentArchitecture.g:702:4: otherlv_4= ';'
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
    // InternalComponentArchitecture.g:711:1: entryRuleOpcUaDeviceClientInstance returns [EObject current=null] : iv_ruleOpcUaDeviceClientInstance= ruleOpcUaDeviceClientInstance EOF ;
    public final EObject entryRuleOpcUaDeviceClientInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUaDeviceClientInstance = null;


        try {
            // InternalComponentArchitecture.g:711:66: (iv_ruleOpcUaDeviceClientInstance= ruleOpcUaDeviceClientInstance EOF )
            // InternalComponentArchitecture.g:712:2: iv_ruleOpcUaDeviceClientInstance= ruleOpcUaDeviceClientInstance EOF
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
    // InternalComponentArchitecture.g:718:1: ruleOpcUaDeviceClientInstance returns [EObject current=null] : (otherlv_0= 'OpcUaDeviceClientInstance' ( ( ruleFQN ) ) otherlv_2= 'deviceURI' ( (lv_deviceURI_3_0= ruleEString ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleOpcUaDeviceClientInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_deviceURI_3_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:724:2: ( (otherlv_0= 'OpcUaDeviceClientInstance' ( ( ruleFQN ) ) otherlv_2= 'deviceURI' ( (lv_deviceURI_3_0= ruleEString ) ) (otherlv_4= ';' )? ) )
            // InternalComponentArchitecture.g:725:2: (otherlv_0= 'OpcUaDeviceClientInstance' ( ( ruleFQN ) ) otherlv_2= 'deviceURI' ( (lv_deviceURI_3_0= ruleEString ) ) (otherlv_4= ';' )? )
            {
            // InternalComponentArchitecture.g:725:2: (otherlv_0= 'OpcUaDeviceClientInstance' ( ( ruleFQN ) ) otherlv_2= 'deviceURI' ( (lv_deviceURI_3_0= ruleEString ) ) (otherlv_4= ';' )? )
            // InternalComponentArchitecture.g:726:3: otherlv_0= 'OpcUaDeviceClientInstance' ( ( ruleFQN ) ) otherlv_2= 'deviceURI' ( (lv_deviceURI_3_0= ruleEString ) ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpcUaDeviceClientInstanceAccess().getOpcUaDeviceClientInstanceKeyword_0());
            		
            // InternalComponentArchitecture.g:730:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:731:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:731:4: ( ruleFQN )
            // InternalComponentArchitecture.g:732:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpcUaDeviceClientInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientOpcUaDeviceClientCrossReference_1_0());
            				
            pushFollow(FOLLOW_17);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIKeyword_2());
            		
            // InternalComponentArchitecture.g:750:3: ( (lv_deviceURI_3_0= ruleEString ) )
            // InternalComponentArchitecture.g:751:4: (lv_deviceURI_3_0= ruleEString )
            {
            // InternalComponentArchitecture.g:751:4: (lv_deviceURI_3_0= ruleEString )
            // InternalComponentArchitecture.g:752:5: lv_deviceURI_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalComponentArchitecture.g:769:3: (otherlv_4= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentArchitecture.g:770:4: otherlv_4= ';'
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


    // $ANTLR start "entryRuleOpcUaReadServerInstance"
    // InternalComponentArchitecture.g:779:1: entryRuleOpcUaReadServerInstance returns [EObject current=null] : iv_ruleOpcUaReadServerInstance= ruleOpcUaReadServerInstance EOF ;
    public final EObject entryRuleOpcUaReadServerInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUaReadServerInstance = null;


        try {
            // InternalComponentArchitecture.g:779:64: (iv_ruleOpcUaReadServerInstance= ruleOpcUaReadServerInstance EOF )
            // InternalComponentArchitecture.g:780:2: iv_ruleOpcUaReadServerInstance= ruleOpcUaReadServerInstance EOF
            {
             newCompositeNode(grammarAccess.getOpcUaReadServerInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpcUaReadServerInstance=ruleOpcUaReadServerInstance();

            state._fsp--;

             current =iv_ruleOpcUaReadServerInstance; 
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
    // $ANTLR end "entryRuleOpcUaReadServerInstance"


    // $ANTLR start "ruleOpcUaReadServerInstance"
    // InternalComponentArchitecture.g:786:1: ruleOpcUaReadServerInstance returns [EObject current=null] : (otherlv_0= 'OpcUaReadServerInstance' ( ( ruleFQN ) ) (otherlv_2= 'portNumber' ( (lv_portNumber_3_0= ruleEInt ) ) )? (otherlv_4= ';' )? ) ;
    public final EObject ruleOpcUaReadServerInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_portNumber_3_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:792:2: ( (otherlv_0= 'OpcUaReadServerInstance' ( ( ruleFQN ) ) (otherlv_2= 'portNumber' ( (lv_portNumber_3_0= ruleEInt ) ) )? (otherlv_4= ';' )? ) )
            // InternalComponentArchitecture.g:793:2: (otherlv_0= 'OpcUaReadServerInstance' ( ( ruleFQN ) ) (otherlv_2= 'portNumber' ( (lv_portNumber_3_0= ruleEInt ) ) )? (otherlv_4= ';' )? )
            {
            // InternalComponentArchitecture.g:793:2: (otherlv_0= 'OpcUaReadServerInstance' ( ( ruleFQN ) ) (otherlv_2= 'portNumber' ( (lv_portNumber_3_0= ruleEInt ) ) )? (otherlv_4= ';' )? )
            // InternalComponentArchitecture.g:794:3: otherlv_0= 'OpcUaReadServerInstance' ( ( ruleFQN ) ) (otherlv_2= 'portNumber' ( (lv_portNumber_3_0= ruleEInt ) ) )? (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpcUaReadServerInstanceAccess().getOpcUaReadServerInstanceKeyword_0());
            		
            // InternalComponentArchitecture.g:798:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:799:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:799:4: ( ruleFQN )
            // InternalComponentArchitecture.g:800:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpcUaReadServerInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerOpcUaReadServerCrossReference_1_0());
            				
            pushFollow(FOLLOW_19);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentArchitecture.g:814:3: (otherlv_2= 'portNumber' ( (lv_portNumber_3_0= ruleEInt ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentArchitecture.g:815:4: otherlv_2= 'portNumber' ( (lv_portNumber_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberKeyword_2_0());
                    			
                    // InternalComponentArchitecture.g:819:4: ( (lv_portNumber_3_0= ruleEInt ) )
                    // InternalComponentArchitecture.g:820:5: (lv_portNumber_3_0= ruleEInt )
                    {
                    // InternalComponentArchitecture.g:820:5: (lv_portNumber_3_0= ruleEInt )
                    // InternalComponentArchitecture.g:821:6: lv_portNumber_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_portNumber_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpcUaReadServerInstanceRule());
                    						}
                    						set(
                    							current,
                    							"portNumber",
                    							lv_portNumber_3_0,
                    							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentArchitecture.g:839:3: (otherlv_4= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentArchitecture.g:840:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpcUaReadServerInstanceAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleOpcUaReadServerInstance"


    // $ANTLR start "entryRuleServiceInstance"
    // InternalComponentArchitecture.g:849:1: entryRuleServiceInstance returns [EObject current=null] : iv_ruleServiceInstance= ruleServiceInstance EOF ;
    public final EObject entryRuleServiceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceInstance = null;


        try {
            // InternalComponentArchitecture.g:849:56: (iv_ruleServiceInstance= ruleServiceInstance EOF )
            // InternalComponentArchitecture.g:850:2: iv_ruleServiceInstance= ruleServiceInstance EOF
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
    // InternalComponentArchitecture.g:856:1: ruleServiceInstance returns [EObject current=null] : (this_RequiredService_0= ruleRequiredService | this_ProvidedService_1= ruleProvidedService ) ;
    public final EObject ruleServiceInstance() throws RecognitionException {
        EObject current = null;

        EObject this_RequiredService_0 = null;

        EObject this_ProvidedService_1 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:862:2: ( (this_RequiredService_0= ruleRequiredService | this_ProvidedService_1= ruleProvidedService ) )
            // InternalComponentArchitecture.g:863:2: (this_RequiredService_0= ruleRequiredService | this_ProvidedService_1= ruleProvidedService )
            {
            // InternalComponentArchitecture.g:863:2: (this_RequiredService_0= ruleRequiredService | this_ProvidedService_1= ruleProvidedService )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            else if ( (LA17_0==30) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentArchitecture.g:864:3: this_RequiredService_0= ruleRequiredService
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
                    // InternalComponentArchitecture.g:873:3: this_ProvidedService_1= ruleProvidedService
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
    // InternalComponentArchitecture.g:885:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // InternalComponentArchitecture.g:885:56: (iv_ruleRequiredService= ruleRequiredService EOF )
            // InternalComponentArchitecture.g:886:2: iv_ruleRequiredService= ruleRequiredService EOF
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
    // InternalComponentArchitecture.g:892:1: ruleRequiredService returns [EObject current=null] : (otherlv_0= 'RequiredService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:898:2: ( (otherlv_0= 'RequiredService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // InternalComponentArchitecture.g:899:2: (otherlv_0= 'RequiredService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentArchitecture.g:899:2: (otherlv_0= 'RequiredService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            // InternalComponentArchitecture.g:900:3: otherlv_0= 'RequiredService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_0());
            		
            // InternalComponentArchitecture.g:904:3: ( (otherlv_1= RULE_ID ) )
            // InternalComponentArchitecture.g:905:4: (otherlv_1= RULE_ID )
            {
            // InternalComponentArchitecture.g:905:4: (otherlv_1= RULE_ID )
            // InternalComponentArchitecture.g:906:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredServiceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getPortComponentPortCrossReference_1_0());
            				

            }


            }

            // InternalComponentArchitecture.g:917:3: (otherlv_2= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentArchitecture.g:918:4: otherlv_2= ';'
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
    // InternalComponentArchitecture.g:927:1: entryRuleProvidedService returns [EObject current=null] : iv_ruleProvidedService= ruleProvidedService EOF ;
    public final EObject entryRuleProvidedService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedService = null;


        try {
            // InternalComponentArchitecture.g:927:56: (iv_ruleProvidedService= ruleProvidedService EOF )
            // InternalComponentArchitecture.g:928:2: iv_ruleProvidedService= ruleProvidedService EOF
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
    // InternalComponentArchitecture.g:934:1: ruleProvidedService returns [EObject current=null] : (otherlv_0= 'ProvidedService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleProvidedService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:940:2: ( (otherlv_0= 'ProvidedService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // InternalComponentArchitecture.g:941:2: (otherlv_0= 'ProvidedService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentArchitecture.g:941:2: (otherlv_0= 'ProvidedService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            // InternalComponentArchitecture.g:942:3: otherlv_0= 'ProvidedService' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_0());
            		
            // InternalComponentArchitecture.g:946:3: ( (otherlv_1= RULE_ID ) )
            // InternalComponentArchitecture.g:947:4: (otherlv_1= RULE_ID )
            {
            // InternalComponentArchitecture.g:947:4: (otherlv_1= RULE_ID )
            // InternalComponentArchitecture.g:948:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedServiceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getProvidedServiceAccess().getPortComponentPortCrossReference_1_0());
            				

            }


            }

            // InternalComponentArchitecture.g:959:3: (otherlv_2= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentArchitecture.g:960:4: otherlv_2= ';'
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


    // $ANTLR start "entryRuleCoordinationModuleMapping"
    // InternalComponentArchitecture.g:969:1: entryRuleCoordinationModuleMapping returns [EObject current=null] : iv_ruleCoordinationModuleMapping= ruleCoordinationModuleMapping EOF ;
    public final EObject entryRuleCoordinationModuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationModuleMapping = null;


        try {
            // InternalComponentArchitecture.g:969:66: (iv_ruleCoordinationModuleMapping= ruleCoordinationModuleMapping EOF )
            // InternalComponentArchitecture.g:970:2: iv_ruleCoordinationModuleMapping= ruleCoordinationModuleMapping EOF
            {
             newCompositeNode(grammarAccess.getCoordinationModuleMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinationModuleMapping=ruleCoordinationModuleMapping();

            state._fsp--;

             current =iv_ruleCoordinationModuleMapping; 
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
    // $ANTLR end "entryRuleCoordinationModuleMapping"


    // $ANTLR start "ruleCoordinationModuleMapping"
    // InternalComponentArchitecture.g:976:1: ruleCoordinationModuleMapping returns [EObject current=null] : (otherlv_0= 'CoordinationModuleMapping' otherlv_1= '{' otherlv_2= 'moduleInstance' ( ( ruleFQN ) ) otherlv_4= 'realizedby' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_coordInterCompInstMapping_7_0= ruleCoordinationInterfaceComponentInstanceMapping ) )+ otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleCoordinationModuleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_coordInterCompInstMapping_7_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:982:2: ( (otherlv_0= 'CoordinationModuleMapping' otherlv_1= '{' otherlv_2= 'moduleInstance' ( ( ruleFQN ) ) otherlv_4= 'realizedby' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_coordInterCompInstMapping_7_0= ruleCoordinationInterfaceComponentInstanceMapping ) )+ otherlv_8= '}' otherlv_9= '}' ) )
            // InternalComponentArchitecture.g:983:2: (otherlv_0= 'CoordinationModuleMapping' otherlv_1= '{' otherlv_2= 'moduleInstance' ( ( ruleFQN ) ) otherlv_4= 'realizedby' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_coordInterCompInstMapping_7_0= ruleCoordinationInterfaceComponentInstanceMapping ) )+ otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalComponentArchitecture.g:983:2: (otherlv_0= 'CoordinationModuleMapping' otherlv_1= '{' otherlv_2= 'moduleInstance' ( ( ruleFQN ) ) otherlv_4= 'realizedby' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_coordInterCompInstMapping_7_0= ruleCoordinationInterfaceComponentInstanceMapping ) )+ otherlv_8= '}' otherlv_9= '}' )
            // InternalComponentArchitecture.g:984:3: otherlv_0= 'CoordinationModuleMapping' otherlv_1= '{' otherlv_2= 'moduleInstance' ( ( ruleFQN ) ) otherlv_4= 'realizedby' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_coordInterCompInstMapping_7_0= ruleCoordinationInterfaceComponentInstanceMapping ) )+ otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinationModuleMappingAccess().getCoordinationModuleMappingKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getCoordinationModuleMappingAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinationModuleMappingAccess().getModuleInstanceKeyword_2());
            		
            // InternalComponentArchitecture.g:996:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:997:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:997:4: ( ruleFQN )
            // InternalComponentArchitecture.g:998:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationModuleMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAbstractCoordinationModuleInstanceCrossReference_3_0());
            				
            pushFollow(FOLLOW_22);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinationModuleMappingAccess().getRealizedbyKeyword_4());
            		
            // InternalComponentArchitecture.g:1016:3: ( (otherlv_5= RULE_ID ) )
            // InternalComponentArchitecture.g:1017:4: (otherlv_5= RULE_ID )
            {
            // InternalComponentArchitecture.g:1017:4: (otherlv_5= RULE_ID )
            // InternalComponentArchitecture.g:1018:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationModuleMappingRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_5, grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealCoordinationModuleRealizationCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getCoordinationModuleMappingAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalComponentArchitecture.g:1033:3: ( (lv_coordInterCompInstMapping_7_0= ruleCoordinationInterfaceComponentInstanceMapping ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalComponentArchitecture.g:1034:4: (lv_coordInterCompInstMapping_7_0= ruleCoordinationInterfaceComponentInstanceMapping )
            	    {
            	    // InternalComponentArchitecture.g:1034:4: (lv_coordInterCompInstMapping_7_0= ruleCoordinationInterfaceComponentInstanceMapping )
            	    // InternalComponentArchitecture.g:1035:5: lv_coordInterCompInstMapping_7_0= ruleCoordinationInterfaceComponentInstanceMapping
            	    {

            	    					newCompositeNode(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingCoordinationInterfaceComponentInstanceMappingParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_coordInterCompInstMapping_7_0=ruleCoordinationInterfaceComponentInstanceMapping();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoordinationModuleMappingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"coordInterCompInstMapping",
            	    						lv_coordInterCompInstMapping_7_0,
            	    						"org.xtext.system.componentArchitecture.ComponentArchitecture.CoordinationInterfaceComponentInstanceMapping");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getCoordinationModuleMappingAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCoordinationModuleMappingAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleCoordinationModuleMapping"


    // $ANTLR start "entryRuleCoordinationInterfaceComponentInstanceMapping"
    // InternalComponentArchitecture.g:1064:1: entryRuleCoordinationInterfaceComponentInstanceMapping returns [EObject current=null] : iv_ruleCoordinationInterfaceComponentInstanceMapping= ruleCoordinationInterfaceComponentInstanceMapping EOF ;
    public final EObject entryRuleCoordinationInterfaceComponentInstanceMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationInterfaceComponentInstanceMapping = null;


        try {
            // InternalComponentArchitecture.g:1064:86: (iv_ruleCoordinationInterfaceComponentInstanceMapping= ruleCoordinationInterfaceComponentInstanceMapping EOF )
            // InternalComponentArchitecture.g:1065:2: iv_ruleCoordinationInterfaceComponentInstanceMapping= ruleCoordinationInterfaceComponentInstanceMapping EOF
            {
             newCompositeNode(grammarAccess.getCoordinationInterfaceComponentInstanceMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinationInterfaceComponentInstanceMapping=ruleCoordinationInterfaceComponentInstanceMapping();

            state._fsp--;

             current =iv_ruleCoordinationInterfaceComponentInstanceMapping; 
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
    // $ANTLR end "entryRuleCoordinationInterfaceComponentInstanceMapping"


    // $ANTLR start "ruleCoordinationInterfaceComponentInstanceMapping"
    // InternalComponentArchitecture.g:1071:1: ruleCoordinationInterfaceComponentInstanceMapping returns [EObject current=null] : (otherlv_0= 'interfaceInstance' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'realizedby' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleCoordinationInterfaceComponentInstanceMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:1077:2: ( (otherlv_0= 'interfaceInstance' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'realizedby' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalComponentArchitecture.g:1078:2: (otherlv_0= 'interfaceInstance' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'realizedby' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalComponentArchitecture.g:1078:2: (otherlv_0= 'interfaceInstance' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'realizedby' ( (otherlv_3= RULE_ID ) ) )
            // InternalComponentArchitecture.g:1079:3: otherlv_0= 'interfaceInstance' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'realizedby' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getInterfaceInstanceKeyword_0());
            		
            // InternalComponentArchitecture.g:1083:3: ( (otherlv_1= RULE_ID ) )
            // InternalComponentArchitecture.g:1084:4: (otherlv_1= RULE_ID )
            {
            // InternalComponentArchitecture.g:1084:4: (otherlv_1= RULE_ID )
            // InternalComponentArchitecture.g:1085:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationInterfaceComponentInstanceMappingRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstCoordinationInterfaceInstanceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getRealizedbyKeyword_2());
            		
            // InternalComponentArchitecture.g:1100:3: ( (otherlv_3= RULE_ID ) )
            // InternalComponentArchitecture.g:1101:4: (otherlv_3= RULE_ID )
            {
            // InternalComponentArchitecture.g:1101:4: (otherlv_3= RULE_ID )
            // InternalComponentArchitecture.g:1102:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationInterfaceComponentInstanceMappingRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstComponentInstanceCrossReference_3_0());
            				

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
    // $ANTLR end "ruleCoordinationInterfaceComponentInstanceMapping"


    // $ANTLR start "entryRuleTaskRealizationModelRef"
    // InternalComponentArchitecture.g:1117:1: entryRuleTaskRealizationModelRef returns [EObject current=null] : iv_ruleTaskRealizationModelRef= ruleTaskRealizationModelRef EOF ;
    public final EObject entryRuleTaskRealizationModelRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRealizationModelRef = null;


        try {
            // InternalComponentArchitecture.g:1117:64: (iv_ruleTaskRealizationModelRef= ruleTaskRealizationModelRef EOF )
            // InternalComponentArchitecture.g:1118:2: iv_ruleTaskRealizationModelRef= ruleTaskRealizationModelRef EOF
            {
             newCompositeNode(grammarAccess.getTaskRealizationModelRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskRealizationModelRef=ruleTaskRealizationModelRef();

            state._fsp--;

             current =iv_ruleTaskRealizationModelRef; 
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
    // $ANTLR end "entryRuleTaskRealizationModelRef"


    // $ANTLR start "ruleTaskRealizationModelRef"
    // InternalComponentArchitecture.g:1124:1: ruleTaskRealizationModelRef returns [EObject current=null] : (otherlv_0= 'BehaviorTaskRef' ( ( ruleFQN ) ) ) ;
    public final EObject ruleTaskRealizationModelRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:1130:2: ( (otherlv_0= 'BehaviorTaskRef' ( ( ruleFQN ) ) ) )
            // InternalComponentArchitecture.g:1131:2: (otherlv_0= 'BehaviorTaskRef' ( ( ruleFQN ) ) )
            {
            // InternalComponentArchitecture.g:1131:2: (otherlv_0= 'BehaviorTaskRef' ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:1132:3: otherlv_0= 'BehaviorTaskRef' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskRealizationModelRefAccess().getBehaviorTaskRefKeyword_0());
            		
            // InternalComponentArchitecture.g:1136:3: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:1137:4: ( ruleFQN )
            {
            // InternalComponentArchitecture.g:1137:4: ( ruleFQN )
            // InternalComponentArchitecture.g:1138:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRealizationModelRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefTaskRealizationModelCrossReference_1_0());
            				
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
    // $ANTLR end "ruleTaskRealizationModelRef"


    // $ANTLR start "entryRuleRoboticMiddleware"
    // InternalComponentArchitecture.g:1156:1: entryRuleRoboticMiddleware returns [EObject current=null] : iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF ;
    public final EObject entryRuleRoboticMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoboticMiddleware = null;


        try {
            // InternalComponentArchitecture.g:1156:58: (iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF )
            // InternalComponentArchitecture.g:1157:2: iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF
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
    // InternalComponentArchitecture.g:1163:1: ruleRoboticMiddleware returns [EObject current=null] : (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft ) ;
    public final EObject ruleRoboticMiddleware() throws RecognitionException {
        EObject current = null;

        EObject this_ACE_SmartSoft_0 = null;

        EObject this_OpcUa_SeRoNet_1 = null;

        EObject this_CORBA_SmartSoft_2 = null;

        EObject this_DDS_SmartSoft_3 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:1169:2: ( (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft ) )
            // InternalComponentArchitecture.g:1170:2: (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft )
            {
            // InternalComponentArchitecture.g:1170:2: (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt21=1;
                }
                break;
            case 40:
                {
                alt21=2;
                }
                break;
            case 41:
                {
                alt21=3;
                }
                break;
            case 42:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalComponentArchitecture.g:1171:3: this_ACE_SmartSoft_0= ruleACE_SmartSoft
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
                    // InternalComponentArchitecture.g:1180:3: this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet
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
                    // InternalComponentArchitecture.g:1189:3: this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft
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
                    // InternalComponentArchitecture.g:1198:3: this_DDS_SmartSoft_3= ruleDDS_SmartSoft
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
    // InternalComponentArchitecture.g:1210:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalComponentArchitecture.g:1210:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalComponentArchitecture.g:1211:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalComponentArchitecture.g:1217:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:1223:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalComponentArchitecture.g:1224:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalComponentArchitecture.g:1224:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalComponentArchitecture.g:1225:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponentArchitecture.g:1232:3: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalComponentArchitecture.g:1233:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalComponentArchitecture.g:1250:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentArchitecture.g:1250:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentArchitecture.g:1251:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentArchitecture.g:1257:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:1263:2: (this_STRING_0= RULE_STRING )
            // InternalComponentArchitecture.g:1264:2: this_STRING_0= RULE_STRING
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
    // InternalComponentArchitecture.g:1274:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalComponentArchitecture.g:1274:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalComponentArchitecture.g:1275:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalComponentArchitecture.g:1281:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalComponentArchitecture.g:1287:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalComponentArchitecture.g:1288:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalComponentArchitecture.g:1288:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalComponentArchitecture.g:1289:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalComponentArchitecture.g:1289:3: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentArchitecture.g:1290:4: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_27); 

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
    // InternalComponentArchitecture.g:1307:1: entryRuleACE_SmartSoft returns [EObject current=null] : iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF ;
    public final EObject entryRuleACE_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACE_SmartSoft = null;


        try {
            // InternalComponentArchitecture.g:1307:54: (iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF )
            // InternalComponentArchitecture.g:1308:2: iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF
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
    // InternalComponentArchitecture.g:1314:1: ruleACE_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleACE_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:1320:2: ( ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentArchitecture.g:1321:2: ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentArchitecture.g:1321:2: ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentArchitecture.g:1322:3: () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentArchitecture.g:1322:3: ()
            // InternalComponentArchitecture.g:1323:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1());
            		
            // InternalComponentArchitecture.g:1333:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentArchitecture.g:1334:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentArchitecture.g:1338:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentArchitecture.g:1339:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentArchitecture.g:1339:5: (lv_description_3_0= ruleEString )
                    // InternalComponentArchitecture.g:1340:6: lv_description_3_0= ruleEString
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
    // InternalComponentArchitecture.g:1362:1: entryRuleOpcUa_SeRoNet returns [EObject current=null] : iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF ;
    public final EObject entryRuleOpcUa_SeRoNet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUa_SeRoNet = null;


        try {
            // InternalComponentArchitecture.g:1362:54: (iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF )
            // InternalComponentArchitecture.g:1363:2: iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF
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
    // InternalComponentArchitecture.g:1369:1: ruleOpcUa_SeRoNet returns [EObject current=null] : ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleOpcUa_SeRoNet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:1375:2: ( ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentArchitecture.g:1376:2: ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentArchitecture.g:1376:2: ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentArchitecture.g:1377:3: () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentArchitecture.g:1377:3: ()
            // InternalComponentArchitecture.g:1378:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1());
            		
            // InternalComponentArchitecture.g:1388:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentArchitecture.g:1389:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentArchitecture.g:1393:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentArchitecture.g:1394:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentArchitecture.g:1394:5: (lv_description_3_0= ruleEString )
                    // InternalComponentArchitecture.g:1395:6: lv_description_3_0= ruleEString
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
    // InternalComponentArchitecture.g:1417:1: entryRuleCORBA_SmartSoft returns [EObject current=null] : iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF ;
    public final EObject entryRuleCORBA_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCORBA_SmartSoft = null;


        try {
            // InternalComponentArchitecture.g:1417:56: (iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF )
            // InternalComponentArchitecture.g:1418:2: iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF
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
    // InternalComponentArchitecture.g:1424:1: ruleCORBA_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleCORBA_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:1430:2: ( ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentArchitecture.g:1431:2: ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentArchitecture.g:1431:2: ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentArchitecture.g:1432:3: () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentArchitecture.g:1432:3: ()
            // InternalComponentArchitecture.g:1433:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1());
            		
            // InternalComponentArchitecture.g:1443:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentArchitecture.g:1444:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentArchitecture.g:1448:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentArchitecture.g:1449:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentArchitecture.g:1449:5: (lv_description_3_0= ruleEString )
                    // InternalComponentArchitecture.g:1450:6: lv_description_3_0= ruleEString
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
    // InternalComponentArchitecture.g:1472:1: entryRuleDDS_SmartSoft returns [EObject current=null] : iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF ;
    public final EObject entryRuleDDS_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDS_SmartSoft = null;


        try {
            // InternalComponentArchitecture.g:1472:54: (iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF )
            // InternalComponentArchitecture.g:1473:2: iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF
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
    // InternalComponentArchitecture.g:1479:1: ruleDDS_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleDDS_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentArchitecture.g:1485:2: ( ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentArchitecture.g:1486:2: ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentArchitecture.g:1486:2: ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentArchitecture.g:1487:3: () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentArchitecture.g:1487:3: ()
            // InternalComponentArchitecture.g:1488:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1());
            		
            // InternalComponentArchitecture.g:1498:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponentArchitecture.g:1499:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentArchitecture.g:1503:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentArchitecture.g:1504:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentArchitecture.g:1504:5: (lv_description_3_0= ruleEString )
                    // InternalComponentArchitecture.g:1505:6: lv_description_3_0= ruleEString
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000088008C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000088000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000880004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000074000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000006B604000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000B604000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010040002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000002L});

}