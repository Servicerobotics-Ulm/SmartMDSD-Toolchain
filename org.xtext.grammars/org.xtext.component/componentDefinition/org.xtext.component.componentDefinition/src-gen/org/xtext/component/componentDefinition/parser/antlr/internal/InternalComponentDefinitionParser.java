package org.xtext.component.componentDefinition.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.component.componentDefinition.services.ComponentDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentDefinitionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#import'", "';'", "'ComponentDefinition'", "'logo'", "'{'", "'}'", "'RequestPort'", "'implements'", "'OutputPort'", "'realizedBy'", "'AnswerPort'", "'InputPort'", "'SupportedMiddleware'", "'default'", "'Activity'", "'InputHandler'", "'triggeredFrom'", "'activeQueue'", "'RequestHandler'", "'RequestPortLink'", "'OpcUaClientLink'", "'MixedPortROSLink'", "'Observe'", "'InputPortLink'", "'optional'", "'oversamplingOk'", "'undersamplingOk'", "'ActivationConstraints'", "'configurable'", "'='", "'minActFreq'", "'Hz'", "'maxActFreq'", "'OperationModeBinding'", "'DefaultTrigger'", "'InputPortTrigger'", "'prescale'", "'PeriodicTimer'", "'ObservedElement'", "'OpcUaDeviceClient'", "'deviceURI'", "'opcuaXmlFile'", "'OpcUaReadServer'", "'dataProviderPort'", "'portNumber'", "'MixedPortROS'", "'MixedPortYARP'", "'CoordinationSlavePort'", "'SkillRealizationsRef'", "'with'", "'PublicOperationMode'", "'activates'", "'('", "','", "')'", "'PrivateOperationMode'", "'CoordinationMasterPort'", "'ComponentParameters'", "'slave'", "'.'", "'.*'", "'-'", "'E'", "'e'", "'true'", "'false'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
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


        public InternalComponentDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentDefinition.g"; }



     	private ComponentDefinitionGrammarAccess grammarAccess;

        public InternalComponentDefinitionParser(TokenStream input, ComponentDefinitionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentDefModel";
       	}

       	@Override
       	protected ComponentDefinitionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentDefModel"
    // InternalComponentDefinition.g:105:1: entryRuleComponentDefModel returns [EObject current=null] : iv_ruleComponentDefModel= ruleComponentDefModel EOF ;
    public final EObject entryRuleComponentDefModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefModel = null;


        try {
            // InternalComponentDefinition.g:105:58: (iv_ruleComponentDefModel= ruleComponentDefModel EOF )
            // InternalComponentDefinition.g:106:2: iv_ruleComponentDefModel= ruleComponentDefModel EOF
            {
             newCompositeNode(grammarAccess.getComponentDefModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentDefModel=ruleComponentDefModel();

            state._fsp--;

             current =iv_ruleComponentDefModel; 
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
    // $ANTLR end "entryRuleComponentDefModel"


    // $ANTLR start "ruleComponentDefModel"
    // InternalComponentDefinition.g:112:1: ruleComponentDefModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleServiceRepoImport ) )* ( (lv_component_2_0= ruleComponentDefinition ) )? ) ;
    public final EObject ruleComponentDefModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_component_2_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:118:2: ( ( () ( (lv_imports_1_0= ruleServiceRepoImport ) )* ( (lv_component_2_0= ruleComponentDefinition ) )? ) )
            // InternalComponentDefinition.g:119:2: ( () ( (lv_imports_1_0= ruleServiceRepoImport ) )* ( (lv_component_2_0= ruleComponentDefinition ) )? )
            {
            // InternalComponentDefinition.g:119:2: ( () ( (lv_imports_1_0= ruleServiceRepoImport ) )* ( (lv_component_2_0= ruleComponentDefinition ) )? )
            // InternalComponentDefinition.g:120:3: () ( (lv_imports_1_0= ruleServiceRepoImport ) )* ( (lv_component_2_0= ruleComponentDefinition ) )?
            {
            // InternalComponentDefinition.g:120:3: ()
            // InternalComponentDefinition.g:121:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentDefModelAccess().getComponentDefModelAction_0(),
            					current);
            			

            }

            // InternalComponentDefinition.g:127:3: ( (lv_imports_1_0= ruleServiceRepoImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalComponentDefinition.g:128:4: (lv_imports_1_0= ruleServiceRepoImport )
            	    {
            	    // InternalComponentDefinition.g:128:4: (lv_imports_1_0= ruleServiceRepoImport )
            	    // InternalComponentDefinition.g:129:5: lv_imports_1_0= ruleServiceRepoImport
            	    {

            	    					newCompositeNode(grammarAccess.getComponentDefModelAccess().getImportsServiceRepoImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleServiceRepoImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentDefModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.ServiceRepoImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalComponentDefinition.g:146:3: ( (lv_component_2_0= ruleComponentDefinition ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentDefinition.g:147:4: (lv_component_2_0= ruleComponentDefinition )
                    {
                    // InternalComponentDefinition.g:147:4: (lv_component_2_0= ruleComponentDefinition )
                    // InternalComponentDefinition.g:148:5: lv_component_2_0= ruleComponentDefinition
                    {

                    					newCompositeNode(grammarAccess.getComponentDefModelAccess().getComponentComponentDefinitionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_component_2_0=ruleComponentDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentDefModelRule());
                    					}
                    					set(
                    						current,
                    						"component",
                    						lv_component_2_0,
                    						"org.xtext.component.componentDefinition.ComponentDefinition.ComponentDefinition");
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
    // $ANTLR end "ruleComponentDefModel"


    // $ANTLR start "entryRuleServiceRepoImport"
    // InternalComponentDefinition.g:169:1: entryRuleServiceRepoImport returns [EObject current=null] : iv_ruleServiceRepoImport= ruleServiceRepoImport EOF ;
    public final EObject entryRuleServiceRepoImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceRepoImport = null;


        try {
            // InternalComponentDefinition.g:169:58: (iv_ruleServiceRepoImport= ruleServiceRepoImport EOF )
            // InternalComponentDefinition.g:170:2: iv_ruleServiceRepoImport= ruleServiceRepoImport EOF
            {
             newCompositeNode(grammarAccess.getServiceRepoImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceRepoImport=ruleServiceRepoImport();

            state._fsp--;

             current =iv_ruleServiceRepoImport; 
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
    // $ANTLR end "entryRuleServiceRepoImport"


    // $ANTLR start "ruleServiceRepoImport"
    // InternalComponentDefinition.g:176:1: ruleServiceRepoImport returns [EObject current=null] : (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleServiceRepoImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:182:2: ( (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:183:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:183:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:184:3: otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceRepoImportAccess().getImportKeyword_0());
            		
            // InternalComponentDefinition.g:188:3: ( (lv_importedNamespace_1_0= ruleFQNW ) )
            // InternalComponentDefinition.g:189:4: (lv_importedNamespace_1_0= ruleFQNW )
            {
            // InternalComponentDefinition.g:189:4: (lv_importedNamespace_1_0= ruleFQNW )
            // InternalComponentDefinition.g:190:5: lv_importedNamespace_1_0= ruleFQNW
            {

            					newCompositeNode(grammarAccess.getServiceRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_importedNamespace_1_0=ruleFQNW();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRepoImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.xtext.service.roboticMiddleware.RoboticMiddleware.FQNW");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:207:3: (otherlv_2= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentDefinition.g:208:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getServiceRepoImportAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleServiceRepoImport"


    // $ANTLR start "entryRuleComponentDefinition"
    // InternalComponentDefinition.g:217:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // InternalComponentDefinition.g:217:60: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // InternalComponentDefinition.g:218:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
            {
             newCompositeNode(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentDefinition=ruleComponentDefinition();

            state._fsp--;

             current =iv_ruleComponentDefinition; 
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
    // $ANTLR end "entryRuleComponentDefinition"


    // $ANTLR start "ruleComponentDefinition"
    // InternalComponentDefinition.g:224:1: ruleComponentDefinition returns [EObject current=null] : (otherlv_0= 'ComponentDefinition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'logo' ( (lv_logo_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractComponentElement ) )* otherlv_6= '}' ) ;
    public final EObject ruleComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_logo_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:230:2: ( (otherlv_0= 'ComponentDefinition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'logo' ( (lv_logo_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractComponentElement ) )* otherlv_6= '}' ) )
            // InternalComponentDefinition.g:231:2: (otherlv_0= 'ComponentDefinition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'logo' ( (lv_logo_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractComponentElement ) )* otherlv_6= '}' )
            {
            // InternalComponentDefinition.g:231:2: (otherlv_0= 'ComponentDefinition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'logo' ( (lv_logo_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractComponentElement ) )* otherlv_6= '}' )
            // InternalComponentDefinition.g:232:3: otherlv_0= 'ComponentDefinition' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'logo' ( (lv_logo_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractComponentElement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentDefinitionAccess().getComponentDefinitionKeyword_0());
            		
            // InternalComponentDefinition.g:236:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:237:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:237:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:238:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalComponentDefinition.g:254:3: (otherlv_2= 'logo' ( (lv_logo_3_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentDefinition.g:255:4: otherlv_2= 'logo' ( (lv_logo_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentDefinitionAccess().getLogoKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:259:4: ( (lv_logo_3_0= RULE_STRING ) )
                    // InternalComponentDefinition.g:260:5: (lv_logo_3_0= RULE_STRING )
                    {
                    // InternalComponentDefinition.g:260:5: (lv_logo_3_0= RULE_STRING )
                    // InternalComponentDefinition.g:261:6: lv_logo_3_0= RULE_STRING
                    {
                    lv_logo_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_logo_3_0, grammarAccess.getComponentDefinitionAccess().getLogoSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"logo",
                    							lv_logo_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentDefinition.g:282:3: ( (lv_elements_5_0= ruleAbstractComponentElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17||LA5_0==19||(LA5_0>=21 && LA5_0<=22)||(LA5_0>=25 && LA5_0<=26)||LA5_0==29||LA5_0==50||LA5_0==53||(LA5_0>=56 && LA5_0<=58)||(LA5_0>=67 && LA5_0<=68)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalComponentDefinition.g:283:4: (lv_elements_5_0= ruleAbstractComponentElement )
            	    {
            	    // InternalComponentDefinition.g:283:4: (lv_elements_5_0= ruleAbstractComponentElement )
            	    // InternalComponentDefinition.g:284:5: lv_elements_5_0= ruleAbstractComponentElement
            	    {

            	    					newCompositeNode(grammarAccess.getComponentDefinitionAccess().getElementsAbstractComponentElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_elements_5_0=ruleAbstractComponentElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.AbstractComponentElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleComponentDefinition"


    // $ANTLR start "entryRuleAbstractComponentElement"
    // InternalComponentDefinition.g:309:1: entryRuleAbstractComponentElement returns [EObject current=null] : iv_ruleAbstractComponentElement= ruleAbstractComponentElement EOF ;
    public final EObject entryRuleAbstractComponentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponentElement = null;


        try {
            // InternalComponentDefinition.g:309:65: (iv_ruleAbstractComponentElement= ruleAbstractComponentElement EOF )
            // InternalComponentDefinition.g:310:2: iv_ruleAbstractComponentElement= ruleAbstractComponentElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractComponentElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractComponentElement=ruleAbstractComponentElement();

            state._fsp--;

             current =iv_ruleAbstractComponentElement; 
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
    // $ANTLR end "entryRuleAbstractComponentElement"


    // $ANTLR start "ruleAbstractComponentElement"
    // InternalComponentDefinition.g:316:1: ruleAbstractComponentElement returns [EObject current=null] : (this_NamedComponentElement_0= ruleNamedComponentElement | this_DerivedComponentElement_1= ruleDerivedComponentElement | this_PlainOpcUaPort_2= rulePlainOpcUaPort ) ;
    public final EObject ruleAbstractComponentElement() throws RecognitionException {
        EObject current = null;

        EObject this_NamedComponentElement_0 = null;

        EObject this_DerivedComponentElement_1 = null;

        EObject this_PlainOpcUaPort_2 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:322:2: ( (this_NamedComponentElement_0= ruleNamedComponentElement | this_DerivedComponentElement_1= ruleDerivedComponentElement | this_PlainOpcUaPort_2= rulePlainOpcUaPort ) )
            // InternalComponentDefinition.g:323:2: (this_NamedComponentElement_0= ruleNamedComponentElement | this_DerivedComponentElement_1= ruleDerivedComponentElement | this_PlainOpcUaPort_2= rulePlainOpcUaPort )
            {
            // InternalComponentDefinition.g:323:2: (this_NamedComponentElement_0= ruleNamedComponentElement | this_DerivedComponentElement_1= ruleDerivedComponentElement | this_PlainOpcUaPort_2= rulePlainOpcUaPort )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
            case 19:
            case 21:
            case 22:
            case 25:
            case 26:
            case 29:
            case 58:
            case 67:
                {
                alt6=1;
                }
                break;
            case 56:
            case 57:
            case 68:
                {
                alt6=2;
                }
                break;
            case 50:
            case 53:
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
                    // InternalComponentDefinition.g:324:3: this_NamedComponentElement_0= ruleNamedComponentElement
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentElementAccess().getNamedComponentElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedComponentElement_0=ruleNamedComponentElement();

                    state._fsp--;


                    			current = this_NamedComponentElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:333:3: this_DerivedComponentElement_1= ruleDerivedComponentElement
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentElementAccess().getDerivedComponentElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DerivedComponentElement_1=ruleDerivedComponentElement();

                    state._fsp--;


                    			current = this_DerivedComponentElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:342:3: this_PlainOpcUaPort_2= rulePlainOpcUaPort
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentElementAccess().getPlainOpcUaPortParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlainOpcUaPort_2=rulePlainOpcUaPort();

                    state._fsp--;


                    			current = this_PlainOpcUaPort_2;
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
    // $ANTLR end "ruleAbstractComponentElement"


    // $ANTLR start "entryRuleDerivedComponentElement"
    // InternalComponentDefinition.g:354:1: entryRuleDerivedComponentElement returns [EObject current=null] : iv_ruleDerivedComponentElement= ruleDerivedComponentElement EOF ;
    public final EObject entryRuleDerivedComponentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedComponentElement = null;


        try {
            // InternalComponentDefinition.g:354:64: (iv_ruleDerivedComponentElement= ruleDerivedComponentElement EOF )
            // InternalComponentDefinition.g:355:2: iv_ruleDerivedComponentElement= ruleDerivedComponentElement EOF
            {
             newCompositeNode(grammarAccess.getDerivedComponentElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDerivedComponentElement=ruleDerivedComponentElement();

            state._fsp--;

             current =iv_ruleDerivedComponentElement; 
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
    // $ANTLR end "entryRuleDerivedComponentElement"


    // $ANTLR start "ruleDerivedComponentElement"
    // InternalComponentDefinition.g:361:1: ruleDerivedComponentElement returns [EObject current=null] : (this_ComponentParametersRef_0= ruleComponentParametersRef | this_MixedPortROS_1= ruleMixedPortROS | this_MixedPortYARP_2= ruleMixedPortYARP ) ;
    public final EObject ruleDerivedComponentElement() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentParametersRef_0 = null;

        EObject this_MixedPortROS_1 = null;

        EObject this_MixedPortYARP_2 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:367:2: ( (this_ComponentParametersRef_0= ruleComponentParametersRef | this_MixedPortROS_1= ruleMixedPortROS | this_MixedPortYARP_2= ruleMixedPortYARP ) )
            // InternalComponentDefinition.g:368:2: (this_ComponentParametersRef_0= ruleComponentParametersRef | this_MixedPortROS_1= ruleMixedPortROS | this_MixedPortYARP_2= ruleMixedPortYARP )
            {
            // InternalComponentDefinition.g:368:2: (this_ComponentParametersRef_0= ruleComponentParametersRef | this_MixedPortROS_1= ruleMixedPortROS | this_MixedPortYARP_2= ruleMixedPortYARP )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt7=1;
                }
                break;
            case 56:
                {
                alt7=2;
                }
                break;
            case 57:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalComponentDefinition.g:369:3: this_ComponentParametersRef_0= ruleComponentParametersRef
                    {

                    			newCompositeNode(grammarAccess.getDerivedComponentElementAccess().getComponentParametersRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentParametersRef_0=ruleComponentParametersRef();

                    state._fsp--;


                    			current = this_ComponentParametersRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:378:3: this_MixedPortROS_1= ruleMixedPortROS
                    {

                    			newCompositeNode(grammarAccess.getDerivedComponentElementAccess().getMixedPortROSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MixedPortROS_1=ruleMixedPortROS();

                    state._fsp--;


                    			current = this_MixedPortROS_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:387:3: this_MixedPortYARP_2= ruleMixedPortYARP
                    {

                    			newCompositeNode(grammarAccess.getDerivedComponentElementAccess().getMixedPortYARPParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MixedPortYARP_2=ruleMixedPortYARP();

                    state._fsp--;


                    			current = this_MixedPortYARP_2;
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
    // $ANTLR end "ruleDerivedComponentElement"


    // $ANTLR start "entryRuleNamedComponentElement"
    // InternalComponentDefinition.g:399:1: entryRuleNamedComponentElement returns [EObject current=null] : iv_ruleNamedComponentElement= ruleNamedComponentElement EOF ;
    public final EObject entryRuleNamedComponentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedComponentElement = null;


        try {
            // InternalComponentDefinition.g:399:62: (iv_ruleNamedComponentElement= ruleNamedComponentElement EOF )
            // InternalComponentDefinition.g:400:2: iv_ruleNamedComponentElement= ruleNamedComponentElement EOF
            {
             newCompositeNode(grammarAccess.getNamedComponentElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedComponentElement=ruleNamedComponentElement();

            state._fsp--;

             current =iv_ruleNamedComponentElement; 
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
    // $ANTLR end "entryRuleNamedComponentElement"


    // $ANTLR start "ruleNamedComponentElement"
    // InternalComponentDefinition.g:406:1: ruleNamedComponentElement returns [EObject current=null] : (this_ComponentSubNode_0= ruleComponentSubNode | this_ComponentPort_1= ruleComponentPort | this_CoordinationSlavePort_2= ruleCoordinationSlavePort | this_CoordinationMasterPort_3= ruleCoordinationMasterPort ) ;
    public final EObject ruleNamedComponentElement() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentSubNode_0 = null;

        EObject this_ComponentPort_1 = null;

        EObject this_CoordinationSlavePort_2 = null;

        EObject this_CoordinationMasterPort_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:412:2: ( (this_ComponentSubNode_0= ruleComponentSubNode | this_ComponentPort_1= ruleComponentPort | this_CoordinationSlavePort_2= ruleCoordinationSlavePort | this_CoordinationMasterPort_3= ruleCoordinationMasterPort ) )
            // InternalComponentDefinition.g:413:2: (this_ComponentSubNode_0= ruleComponentSubNode | this_ComponentPort_1= ruleComponentPort | this_CoordinationSlavePort_2= ruleCoordinationSlavePort | this_CoordinationMasterPort_3= ruleCoordinationMasterPort )
            {
            // InternalComponentDefinition.g:413:2: (this_ComponentSubNode_0= ruleComponentSubNode | this_ComponentPort_1= ruleComponentPort | this_CoordinationSlavePort_2= ruleCoordinationSlavePort | this_CoordinationMasterPort_3= ruleCoordinationMasterPort )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 25:
            case 26:
            case 29:
                {
                alt8=1;
                }
                break;
            case 17:
            case 19:
            case 21:
            case 22:
                {
                alt8=2;
                }
                break;
            case 58:
                {
                alt8=3;
                }
                break;
            case 67:
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
                    // InternalComponentDefinition.g:414:3: this_ComponentSubNode_0= ruleComponentSubNode
                    {

                    			newCompositeNode(grammarAccess.getNamedComponentElementAccess().getComponentSubNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentSubNode_0=ruleComponentSubNode();

                    state._fsp--;


                    			current = this_ComponentSubNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:423:3: this_ComponentPort_1= ruleComponentPort
                    {

                    			newCompositeNode(grammarAccess.getNamedComponentElementAccess().getComponentPortParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentPort_1=ruleComponentPort();

                    state._fsp--;


                    			current = this_ComponentPort_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:432:3: this_CoordinationSlavePort_2= ruleCoordinationSlavePort
                    {

                    			newCompositeNode(grammarAccess.getNamedComponentElementAccess().getCoordinationSlavePortParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoordinationSlavePort_2=ruleCoordinationSlavePort();

                    state._fsp--;


                    			current = this_CoordinationSlavePort_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalComponentDefinition.g:441:3: this_CoordinationMasterPort_3= ruleCoordinationMasterPort
                    {

                    			newCompositeNode(grammarAccess.getNamedComponentElementAccess().getCoordinationMasterPortParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoordinationMasterPort_3=ruleCoordinationMasterPort();

                    state._fsp--;


                    			current = this_CoordinationMasterPort_3;
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
    // $ANTLR end "ruleNamedComponentElement"


    // $ANTLR start "entryRuleComponentSubNode"
    // InternalComponentDefinition.g:453:1: entryRuleComponentSubNode returns [EObject current=null] : iv_ruleComponentSubNode= ruleComponentSubNode EOF ;
    public final EObject entryRuleComponentSubNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentSubNode = null;


        try {
            // InternalComponentDefinition.g:453:57: (iv_ruleComponentSubNode= ruleComponentSubNode EOF )
            // InternalComponentDefinition.g:454:2: iv_ruleComponentSubNode= ruleComponentSubNode EOF
            {
             newCompositeNode(grammarAccess.getComponentSubNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentSubNode=ruleComponentSubNode();

            state._fsp--;

             current =iv_ruleComponentSubNode; 
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
    // $ANTLR end "entryRuleComponentSubNode"


    // $ANTLR start "ruleComponentSubNode"
    // InternalComponentDefinition.g:460:1: ruleComponentSubNode returns [EObject current=null] : (this_Activity_0= ruleActivity | this_InputHandler_1= ruleInputHandler | this_RequestHandler_2= ruleRequestHandler ) ;
    public final EObject ruleComponentSubNode() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_InputHandler_1 = null;

        EObject this_RequestHandler_2 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:466:2: ( (this_Activity_0= ruleActivity | this_InputHandler_1= ruleInputHandler | this_RequestHandler_2= ruleRequestHandler ) )
            // InternalComponentDefinition.g:467:2: (this_Activity_0= ruleActivity | this_InputHandler_1= ruleInputHandler | this_RequestHandler_2= ruleRequestHandler )
            {
            // InternalComponentDefinition.g:467:2: (this_Activity_0= ruleActivity | this_InputHandler_1= ruleInputHandler | this_RequestHandler_2= ruleRequestHandler )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 29:
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
                    // InternalComponentDefinition.g:468:3: this_Activity_0= ruleActivity
                    {

                    			newCompositeNode(grammarAccess.getComponentSubNodeAccess().getActivityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Activity_0=ruleActivity();

                    state._fsp--;


                    			current = this_Activity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:477:3: this_InputHandler_1= ruleInputHandler
                    {

                    			newCompositeNode(grammarAccess.getComponentSubNodeAccess().getInputHandlerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputHandler_1=ruleInputHandler();

                    state._fsp--;


                    			current = this_InputHandler_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:486:3: this_RequestHandler_2= ruleRequestHandler
                    {

                    			newCompositeNode(grammarAccess.getComponentSubNodeAccess().getRequestHandlerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequestHandler_2=ruleRequestHandler();

                    state._fsp--;


                    			current = this_RequestHandler_2;
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
    // $ANTLR end "ruleComponentSubNode"


    // $ANTLR start "entryRuleComponentPort"
    // InternalComponentDefinition.g:498:1: entryRuleComponentPort returns [EObject current=null] : iv_ruleComponentPort= ruleComponentPort EOF ;
    public final EObject entryRuleComponentPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentPort = null;


        try {
            // InternalComponentDefinition.g:498:54: (iv_ruleComponentPort= ruleComponentPort EOF )
            // InternalComponentDefinition.g:499:2: iv_ruleComponentPort= ruleComponentPort EOF
            {
             newCompositeNode(grammarAccess.getComponentPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentPort=ruleComponentPort();

            state._fsp--;

             current =iv_ruleComponentPort; 
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
    // $ANTLR end "entryRuleComponentPort"


    // $ANTLR start "ruleComponentPort"
    // InternalComponentDefinition.g:505:1: ruleComponentPort returns [EObject current=null] : (this_InputPort_0= ruleInputPort | this_AnswerPort_1= ruleAnswerPort | this_OutputPort_2= ruleOutputPort | this_RequestPort_3= ruleRequestPort ) ;
    public final EObject ruleComponentPort() throws RecognitionException {
        EObject current = null;

        EObject this_InputPort_0 = null;

        EObject this_AnswerPort_1 = null;

        EObject this_OutputPort_2 = null;

        EObject this_RequestPort_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:511:2: ( (this_InputPort_0= ruleInputPort | this_AnswerPort_1= ruleAnswerPort | this_OutputPort_2= ruleOutputPort | this_RequestPort_3= ruleRequestPort ) )
            // InternalComponentDefinition.g:512:2: (this_InputPort_0= ruleInputPort | this_AnswerPort_1= ruleAnswerPort | this_OutputPort_2= ruleOutputPort | this_RequestPort_3= ruleRequestPort )
            {
            // InternalComponentDefinition.g:512:2: (this_InputPort_0= ruleInputPort | this_AnswerPort_1= ruleAnswerPort | this_OutputPort_2= ruleOutputPort | this_RequestPort_3= ruleRequestPort )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            case 17:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalComponentDefinition.g:513:3: this_InputPort_0= ruleInputPort
                    {

                    			newCompositeNode(grammarAccess.getComponentPortAccess().getInputPortParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputPort_0=ruleInputPort();

                    state._fsp--;


                    			current = this_InputPort_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:522:3: this_AnswerPort_1= ruleAnswerPort
                    {

                    			newCompositeNode(grammarAccess.getComponentPortAccess().getAnswerPortParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnswerPort_1=ruleAnswerPort();

                    state._fsp--;


                    			current = this_AnswerPort_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:531:3: this_OutputPort_2= ruleOutputPort
                    {

                    			newCompositeNode(grammarAccess.getComponentPortAccess().getOutputPortParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutputPort_2=ruleOutputPort();

                    state._fsp--;


                    			current = this_OutputPort_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalComponentDefinition.g:540:3: this_RequestPort_3= ruleRequestPort
                    {

                    			newCompositeNode(grammarAccess.getComponentPortAccess().getRequestPortParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequestPort_3=ruleRequestPort();

                    state._fsp--;


                    			current = this_RequestPort_3;
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
    // $ANTLR end "ruleComponentPort"


    // $ANTLR start "entryRuleRequestPort"
    // InternalComponentDefinition.g:552:1: entryRuleRequestPort returns [EObject current=null] : iv_ruleRequestPort= ruleRequestPort EOF ;
    public final EObject entryRuleRequestPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestPort = null;


        try {
            // InternalComponentDefinition.g:552:52: (iv_ruleRequestPort= ruleRequestPort EOF )
            // InternalComponentDefinition.g:553:2: iv_ruleRequestPort= ruleRequestPort EOF
            {
             newCompositeNode(grammarAccess.getRequestPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequestPort=ruleRequestPort();

            state._fsp--;

             current =iv_ruleRequestPort; 
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
    // $ANTLR end "entryRuleRequestPort"


    // $ANTLR start "ruleRequestPort"
    // InternalComponentDefinition.g:559:1: ruleRequestPort returns [EObject current=null] : (otherlv_0= 'RequestPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' ) ;
    public final EObject ruleRequestPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_extensions_5_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:565:2: ( (otherlv_0= 'RequestPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' ) )
            // InternalComponentDefinition.g:566:2: (otherlv_0= 'RequestPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' )
            {
            // InternalComponentDefinition.g:566:2: (otherlv_0= 'RequestPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' )
            // InternalComponentDefinition.g:567:3: otherlv_0= 'RequestPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestPortAccess().getRequestPortKeyword_0());
            		
            // InternalComponentDefinition.g:571:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:572:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:572:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:573:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequestPortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRequestPortAccess().getImplementsKeyword_2());
            		
            // InternalComponentDefinition.g:593:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:594:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:594:4: ( ruleFQN )
            // InternalComponentDefinition.g:595:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getRequestPortAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponentDefinition.g:613:3: ( (lv_extensions_5_0= ruleComponentPortExtension ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComponentDefinition.g:614:4: (lv_extensions_5_0= ruleComponentPortExtension )
            	    {
            	    // InternalComponentDefinition.g:614:4: (lv_extensions_5_0= ruleComponentPortExtension )
            	    // InternalComponentDefinition.g:615:5: lv_extensions_5_0= ruleComponentPortExtension
            	    {

            	    					newCompositeNode(grammarAccess.getRequestPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_extensions_5_0=ruleComponentPortExtension();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequestPortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_5_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.ComponentPortExtension");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRequestPortAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRequestPort"


    // $ANTLR start "entryRuleOutputPort"
    // InternalComponentDefinition.g:640:1: entryRuleOutputPort returns [EObject current=null] : iv_ruleOutputPort= ruleOutputPort EOF ;
    public final EObject entryRuleOutputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPort = null;


        try {
            // InternalComponentDefinition.g:640:51: (iv_ruleOutputPort= ruleOutputPort EOF )
            // InternalComponentDefinition.g:641:2: iv_ruleOutputPort= ruleOutputPort EOF
            {
             newCompositeNode(grammarAccess.getOutputPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputPort=ruleOutputPort();

            state._fsp--;

             current =iv_ruleOutputPort; 
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
    // $ANTLR end "entryRuleOutputPort"


    // $ANTLR start "ruleOutputPort"
    // InternalComponentDefinition.g:647:1: ruleOutputPort returns [EObject current=null] : (otherlv_0= 'OutputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= 'realizedBy' ( ( ruleFQN ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleComponentPortExtension ) )* otherlv_8= '}' ) ;
    public final EObject ruleOutputPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_extensions_7_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:653:2: ( (otherlv_0= 'OutputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= 'realizedBy' ( ( ruleFQN ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleComponentPortExtension ) )* otherlv_8= '}' ) )
            // InternalComponentDefinition.g:654:2: (otherlv_0= 'OutputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= 'realizedBy' ( ( ruleFQN ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleComponentPortExtension ) )* otherlv_8= '}' )
            {
            // InternalComponentDefinition.g:654:2: (otherlv_0= 'OutputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= 'realizedBy' ( ( ruleFQN ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleComponentPortExtension ) )* otherlv_8= '}' )
            // InternalComponentDefinition.g:655:3: otherlv_0= 'OutputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= 'realizedBy' ( ( ruleFQN ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleComponentPortExtension ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputPortAccess().getOutputPortKeyword_0());
            		
            // InternalComponentDefinition.g:659:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:660:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:660:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:661:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOutputPortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputPortAccess().getImplementsKeyword_2());
            		
            // InternalComponentDefinition.g:681:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:682:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:682:4: ( ruleFQN )
            // InternalComponentDefinition.g:683:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceCrossReference_3_0());
            				
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getOutputPortAccess().getRealizedByKeyword_4());
            		
            // InternalComponentDefinition.g:701:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:702:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:702:4: ( ruleFQN )
            // InternalComponentDefinition.g:703:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOutputPortAccess().getActivityActivityCrossReference_5_0());
            				
            pushFollow(FOLLOW_8);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalComponentDefinition.g:721:3: ( (lv_extensions_7_0= ruleComponentPortExtension ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComponentDefinition.g:722:4: (lv_extensions_7_0= ruleComponentPortExtension )
            	    {
            	    // InternalComponentDefinition.g:722:4: (lv_extensions_7_0= ruleComponentPortExtension )
            	    // InternalComponentDefinition.g:723:5: lv_extensions_7_0= ruleComponentPortExtension
            	    {

            	    					newCompositeNode(grammarAccess.getOutputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_extensions_7_0=ruleComponentPortExtension();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOutputPortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_7_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.ComponentPortExtension");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleOutputPort"


    // $ANTLR start "entryRuleAnswerPort"
    // InternalComponentDefinition.g:748:1: entryRuleAnswerPort returns [EObject current=null] : iv_ruleAnswerPort= ruleAnswerPort EOF ;
    public final EObject entryRuleAnswerPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerPort = null;


        try {
            // InternalComponentDefinition.g:748:51: (iv_ruleAnswerPort= ruleAnswerPort EOF )
            // InternalComponentDefinition.g:749:2: iv_ruleAnswerPort= ruleAnswerPort EOF
            {
             newCompositeNode(grammarAccess.getAnswerPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnswerPort=ruleAnswerPort();

            state._fsp--;

             current =iv_ruleAnswerPort; 
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
    // $ANTLR end "entryRuleAnswerPort"


    // $ANTLR start "ruleAnswerPort"
    // InternalComponentDefinition.g:755:1: ruleAnswerPort returns [EObject current=null] : (otherlv_0= 'AnswerPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' ) ;
    public final EObject ruleAnswerPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_extensions_5_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:761:2: ( (otherlv_0= 'AnswerPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' ) )
            // InternalComponentDefinition.g:762:2: (otherlv_0= 'AnswerPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' )
            {
            // InternalComponentDefinition.g:762:2: (otherlv_0= 'AnswerPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' )
            // InternalComponentDefinition.g:763:3: otherlv_0= 'AnswerPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAnswerPortAccess().getAnswerPortKeyword_0());
            		
            // InternalComponentDefinition.g:767:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:768:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:768:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:769:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnswerPortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnswerPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAnswerPortAccess().getImplementsKeyword_2());
            		
            // InternalComponentDefinition.g:789:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:790:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:790:4: ( ruleFQN )
            // InternalComponentDefinition.g:791:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnswerPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getAnswerPortAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponentDefinition.g:809:3: ( (lv_extensions_5_0= ruleComponentPortExtension ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalComponentDefinition.g:810:4: (lv_extensions_5_0= ruleComponentPortExtension )
            	    {
            	    // InternalComponentDefinition.g:810:4: (lv_extensions_5_0= ruleComponentPortExtension )
            	    // InternalComponentDefinition.g:811:5: lv_extensions_5_0= ruleComponentPortExtension
            	    {

            	    					newCompositeNode(grammarAccess.getAnswerPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_extensions_5_0=ruleComponentPortExtension();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnswerPortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_5_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.ComponentPortExtension");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAnswerPortAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAnswerPort"


    // $ANTLR start "entryRuleInputPort"
    // InternalComponentDefinition.g:836:1: entryRuleInputPort returns [EObject current=null] : iv_ruleInputPort= ruleInputPort EOF ;
    public final EObject entryRuleInputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPort = null;


        try {
            // InternalComponentDefinition.g:836:50: (iv_ruleInputPort= ruleInputPort EOF )
            // InternalComponentDefinition.g:837:2: iv_ruleInputPort= ruleInputPort EOF
            {
             newCompositeNode(grammarAccess.getInputPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputPort=ruleInputPort();

            state._fsp--;

             current =iv_ruleInputPort; 
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
    // $ANTLR end "entryRuleInputPort"


    // $ANTLR start "ruleInputPort"
    // InternalComponentDefinition.g:843:1: ruleInputPort returns [EObject current=null] : (otherlv_0= 'InputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' ) ;
    public final EObject ruleInputPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_extensions_5_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:849:2: ( (otherlv_0= 'InputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' ) )
            // InternalComponentDefinition.g:850:2: (otherlv_0= 'InputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' )
            {
            // InternalComponentDefinition.g:850:2: (otherlv_0= 'InputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' )
            // InternalComponentDefinition.g:851:3: otherlv_0= 'InputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInputPortAccess().getInputPortKeyword_0());
            		
            // InternalComponentDefinition.g:855:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:856:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:856:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:857:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputPortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInputPortAccess().getImplementsKeyword_2());
            		
            // InternalComponentDefinition.g:877:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:878:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:878:4: ( ruleFQN )
            // InternalComponentDefinition.g:879:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponentDefinition.g:897:3: ( (lv_extensions_5_0= ruleComponentPortExtension ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalComponentDefinition.g:898:4: (lv_extensions_5_0= ruleComponentPortExtension )
            	    {
            	    // InternalComponentDefinition.g:898:4: (lv_extensions_5_0= ruleComponentPortExtension )
            	    // InternalComponentDefinition.g:899:5: lv_extensions_5_0= ruleComponentPortExtension
            	    {

            	    					newCompositeNode(grammarAccess.getInputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_extensions_5_0=ruleComponentPortExtension();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInputPortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_5_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.ComponentPortExtension");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleInputPort"


    // $ANTLR start "entryRuleComponentPortExtension"
    // InternalComponentDefinition.g:924:1: entryRuleComponentPortExtension returns [EObject current=null] : iv_ruleComponentPortExtension= ruleComponentPortExtension EOF ;
    public final EObject entryRuleComponentPortExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentPortExtension = null;


        try {
            // InternalComponentDefinition.g:924:63: (iv_ruleComponentPortExtension= ruleComponentPortExtension EOF )
            // InternalComponentDefinition.g:925:2: iv_ruleComponentPortExtension= ruleComponentPortExtension EOF
            {
             newCompositeNode(grammarAccess.getComponentPortExtensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentPortExtension=ruleComponentPortExtension();

            state._fsp--;

             current =iv_ruleComponentPortExtension; 
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
    // $ANTLR end "entryRuleComponentPortExtension"


    // $ANTLR start "ruleComponentPortExtension"
    // InternalComponentDefinition.g:931:1: ruleComponentPortExtension returns [EObject current=null] : this_SupportedMiddleware_0= ruleSupportedMiddleware ;
    public final EObject ruleComponentPortExtension() throws RecognitionException {
        EObject current = null;

        EObject this_SupportedMiddleware_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:937:2: (this_SupportedMiddleware_0= ruleSupportedMiddleware )
            // InternalComponentDefinition.g:938:2: this_SupportedMiddleware_0= ruleSupportedMiddleware
            {

            		newCompositeNode(grammarAccess.getComponentPortExtensionAccess().getSupportedMiddlewareParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SupportedMiddleware_0=ruleSupportedMiddleware();

            state._fsp--;


            		current = this_SupportedMiddleware_0;
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
    // $ANTLR end "ruleComponentPortExtension"


    // $ANTLR start "entryRuleSupportedMiddleware"
    // InternalComponentDefinition.g:949:1: entryRuleSupportedMiddleware returns [EObject current=null] : iv_ruleSupportedMiddleware= ruleSupportedMiddleware EOF ;
    public final EObject entryRuleSupportedMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportedMiddleware = null;


        try {
            // InternalComponentDefinition.g:949:60: (iv_ruleSupportedMiddleware= ruleSupportedMiddleware EOF )
            // InternalComponentDefinition.g:950:2: iv_ruleSupportedMiddleware= ruleSupportedMiddleware EOF
            {
             newCompositeNode(grammarAccess.getSupportedMiddlewareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSupportedMiddleware=ruleSupportedMiddleware();

            state._fsp--;

             current =iv_ruleSupportedMiddleware; 
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
    // $ANTLR end "entryRuleSupportedMiddleware"


    // $ANTLR start "ruleSupportedMiddleware"
    // InternalComponentDefinition.g:956:1: ruleSupportedMiddleware returns [EObject current=null] : (otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleSupportedMiddleware() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_default_1_0=null;
        Token otherlv_3=null;
        EObject lv_middleware_2_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:962:2: ( (otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )? ) )
            // InternalComponentDefinition.g:963:2: (otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )? )
            {
            // InternalComponentDefinition.g:963:2: (otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )? )
            // InternalComponentDefinition.g:964:3: otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSupportedMiddlewareAccess().getSupportedMiddlewareKeyword_0());
            		
            // InternalComponentDefinition.g:968:3: ( (lv_default_1_0= 'default' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentDefinition.g:969:4: (lv_default_1_0= 'default' )
                    {
                    // InternalComponentDefinition.g:969:4: (lv_default_1_0= 'default' )
                    // InternalComponentDefinition.g:970:5: lv_default_1_0= 'default'
                    {
                    lv_default_1_0=(Token)match(input,24,FOLLOW_13); 

                    					newLeafNode(lv_default_1_0, grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSupportedMiddlewareRule());
                    					}
                    					setWithLastConsumed(current, "default", true, "default");
                    				

                    }


                    }
                    break;

            }

            // InternalComponentDefinition.g:982:3: ( (lv_middleware_2_0= ruleRoboticMiddleware ) )
            // InternalComponentDefinition.g:983:4: (lv_middleware_2_0= ruleRoboticMiddleware )
            {
            // InternalComponentDefinition.g:983:4: (lv_middleware_2_0= ruleRoboticMiddleware )
            // InternalComponentDefinition.g:984:5: lv_middleware_2_0= ruleRoboticMiddleware
            {

            					newCompositeNode(grammarAccess.getSupportedMiddlewareAccess().getMiddlewareRoboticMiddlewareParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_middleware_2_0=ruleRoboticMiddleware();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupportedMiddlewareRule());
            					}
            					set(
            						current,
            						"middleware",
            						lv_middleware_2_0,
            						"org.xtext.service.roboticMiddleware.RoboticMiddleware.RoboticMiddleware");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:1001:3: (otherlv_3= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentDefinition.g:1002:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSupportedMiddlewareAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleSupportedMiddleware"


    // $ANTLR start "entryRuleActivity"
    // InternalComponentDefinition.g:1011:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalComponentDefinition.g:1011:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalComponentDefinition.g:1012:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalComponentDefinition.g:1018:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_links_3_0 = null;

        EObject lv_extensions_4_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1024:2: ( (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' ) )
            // InternalComponentDefinition.g:1025:2: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' )
            {
            // InternalComponentDefinition.g:1025:2: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' )
            // InternalComponentDefinition.g:1026:3: otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
            		
            // InternalComponentDefinition.g:1030:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:1031:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:1031:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:1032:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentDefinition.g:1052:3: ( (lv_links_3_0= ruleAbstractComponentLink ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=30 && LA17_0<=34)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalComponentDefinition.g:1053:4: (lv_links_3_0= ruleAbstractComponentLink )
            	    {
            	    // InternalComponentDefinition.g:1053:4: (lv_links_3_0= ruleAbstractComponentLink )
            	    // InternalComponentDefinition.g:1054:5: lv_links_3_0= ruleAbstractComponentLink
            	    {

            	    					newCompositeNode(grammarAccess.getActivityAccess().getLinksAbstractComponentLinkParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_links_3_0=ruleAbstractComponentLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActivityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"links",
            	    						lv_links_3_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.AbstractComponentLink");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalComponentDefinition.g:1071:3: ( (lv_extensions_4_0= ruleActivityExtension ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38||(LA18_0>=44 && LA18_0<=45)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalComponentDefinition.g:1072:4: (lv_extensions_4_0= ruleActivityExtension )
            	    {
            	    // InternalComponentDefinition.g:1072:4: (lv_extensions_4_0= ruleActivityExtension )
            	    // InternalComponentDefinition.g:1073:5: lv_extensions_4_0= ruleActivityExtension
            	    {

            	    					newCompositeNode(grammarAccess.getActivityAccess().getExtensionsActivityExtensionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_extensions_4_0=ruleActivityExtension();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActivityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_4_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.ActivityExtension");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleInputHandler"
    // InternalComponentDefinition.g:1098:1: entryRuleInputHandler returns [EObject current=null] : iv_ruleInputHandler= ruleInputHandler EOF ;
    public final EObject entryRuleInputHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputHandler = null;


        try {
            // InternalComponentDefinition.g:1098:53: (iv_ruleInputHandler= ruleInputHandler EOF )
            // InternalComponentDefinition.g:1099:2: iv_ruleInputHandler= ruleInputHandler EOF
            {
             newCompositeNode(grammarAccess.getInputHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputHandler=ruleInputHandler();

            state._fsp--;

             current =iv_ruleInputHandler; 
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
    // $ANTLR end "entryRuleInputHandler"


    // $ANTLR start "ruleInputHandler"
    // InternalComponentDefinition.g:1105:1: ruleInputHandler returns [EObject current=null] : (otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' ) ;
    public final EObject ruleInputHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_activeQueue_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_links_6_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1111:2: ( (otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' ) )
            // InternalComponentDefinition.g:1112:2: (otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' )
            {
            // InternalComponentDefinition.g:1112:2: (otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' )
            // InternalComponentDefinition.g:1113:3: otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInputHandlerAccess().getInputHandlerKeyword_0());
            		
            // InternalComponentDefinition.g:1117:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:1118:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:1118:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:1119:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputHandlerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputHandlerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInputHandlerAccess().getTriggeredFromKeyword_2());
            		
            // InternalComponentDefinition.g:1139:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1140:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1140:4: ( ruleFQN )
            // InternalComponentDefinition.g:1141:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputHandlerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInputHandlerAccess().getInputPortInputPortCrossReference_3_0());
            				
            pushFollow(FOLLOW_17);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:1155:3: ( (lv_activeQueue_4_0= 'activeQueue' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentDefinition.g:1156:4: (lv_activeQueue_4_0= 'activeQueue' )
                    {
                    // InternalComponentDefinition.g:1156:4: (lv_activeQueue_4_0= 'activeQueue' )
                    // InternalComponentDefinition.g:1157:5: lv_activeQueue_4_0= 'activeQueue'
                    {
                    lv_activeQueue_4_0=(Token)match(input,28,FOLLOW_8); 

                    					newLeafNode(lv_activeQueue_4_0, grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputHandlerRule());
                    					}
                    					setWithLastConsumed(current, "activeQueue", true, "activeQueue");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getInputHandlerAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalComponentDefinition.g:1173:3: ( (lv_links_6_0= ruleAbstractComponentLink ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=30 && LA20_0<=34)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalComponentDefinition.g:1174:4: (lv_links_6_0= ruleAbstractComponentLink )
            	    {
            	    // InternalComponentDefinition.g:1174:4: (lv_links_6_0= ruleAbstractComponentLink )
            	    // InternalComponentDefinition.g:1175:5: lv_links_6_0= ruleAbstractComponentLink
            	    {

            	    					newCompositeNode(grammarAccess.getInputHandlerAccess().getLinksAbstractComponentLinkParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_links_6_0=ruleAbstractComponentLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInputHandlerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"links",
            	    						lv_links_6_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.AbstractComponentLink");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInputHandlerAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleInputHandler"


    // $ANTLR start "entryRuleRequestHandler"
    // InternalComponentDefinition.g:1200:1: entryRuleRequestHandler returns [EObject current=null] : iv_ruleRequestHandler= ruleRequestHandler EOF ;
    public final EObject entryRuleRequestHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestHandler = null;


        try {
            // InternalComponentDefinition.g:1200:55: (iv_ruleRequestHandler= ruleRequestHandler EOF )
            // InternalComponentDefinition.g:1201:2: iv_ruleRequestHandler= ruleRequestHandler EOF
            {
             newCompositeNode(grammarAccess.getRequestHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequestHandler=ruleRequestHandler();

            state._fsp--;

             current =iv_ruleRequestHandler; 
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
    // $ANTLR end "entryRuleRequestHandler"


    // $ANTLR start "ruleRequestHandler"
    // InternalComponentDefinition.g:1207:1: ruleRequestHandler returns [EObject current=null] : (otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' ) ;
    public final EObject ruleRequestHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_activeQueue_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_links_6_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1213:2: ( (otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' ) )
            // InternalComponentDefinition.g:1214:2: (otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' )
            {
            // InternalComponentDefinition.g:1214:2: (otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' )
            // InternalComponentDefinition.g:1215:3: otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestHandlerAccess().getRequestHandlerKeyword_0());
            		
            // InternalComponentDefinition.g:1219:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:1220:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:1220:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:1221:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequestHandlerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestHandlerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRequestHandlerAccess().getTriggeredFromKeyword_2());
            		
            // InternalComponentDefinition.g:1241:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1242:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1242:4: ( ruleFQN )
            // InternalComponentDefinition.g:1243:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestHandlerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequestHandlerAccess().getAnswerPortAnswerPortCrossReference_3_0());
            				
            pushFollow(FOLLOW_17);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:1257:3: ( (lv_activeQueue_4_0= 'activeQueue' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentDefinition.g:1258:4: (lv_activeQueue_4_0= 'activeQueue' )
                    {
                    // InternalComponentDefinition.g:1258:4: (lv_activeQueue_4_0= 'activeQueue' )
                    // InternalComponentDefinition.g:1259:5: lv_activeQueue_4_0= 'activeQueue'
                    {
                    lv_activeQueue_4_0=(Token)match(input,28,FOLLOW_8); 

                    					newLeafNode(lv_activeQueue_4_0, grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRequestHandlerRule());
                    					}
                    					setWithLastConsumed(current, "activeQueue", true, "activeQueue");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getRequestHandlerAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalComponentDefinition.g:1275:3: ( (lv_links_6_0= ruleAbstractComponentLink ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=30 && LA22_0<=34)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalComponentDefinition.g:1276:4: (lv_links_6_0= ruleAbstractComponentLink )
            	    {
            	    // InternalComponentDefinition.g:1276:4: (lv_links_6_0= ruleAbstractComponentLink )
            	    // InternalComponentDefinition.g:1277:5: lv_links_6_0= ruleAbstractComponentLink
            	    {

            	    					newCompositeNode(grammarAccess.getRequestHandlerAccess().getLinksAbstractComponentLinkParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_links_6_0=ruleAbstractComponentLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequestHandlerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"links",
            	    						lv_links_6_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.AbstractComponentLink");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRequestHandlerAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRequestHandler"


    // $ANTLR start "entryRuleAbstractComponentLink"
    // InternalComponentDefinition.g:1302:1: entryRuleAbstractComponentLink returns [EObject current=null] : iv_ruleAbstractComponentLink= ruleAbstractComponentLink EOF ;
    public final EObject entryRuleAbstractComponentLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponentLink = null;


        try {
            // InternalComponentDefinition.g:1302:62: (iv_ruleAbstractComponentLink= ruleAbstractComponentLink EOF )
            // InternalComponentDefinition.g:1303:2: iv_ruleAbstractComponentLink= ruleAbstractComponentLink EOF
            {
             newCompositeNode(grammarAccess.getAbstractComponentLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractComponentLink=ruleAbstractComponentLink();

            state._fsp--;

             current =iv_ruleAbstractComponentLink; 
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
    // $ANTLR end "entryRuleAbstractComponentLink"


    // $ANTLR start "ruleAbstractComponentLink"
    // InternalComponentDefinition.g:1309:1: ruleAbstractComponentLink returns [EObject current=null] : (this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver | this_RequestPortLink_1= ruleRequestPortLink | this_InputLinkExtension_2= ruleInputLinkExtension | this_OpcUaClientLink_3= ruleOpcUaClientLink | this_MixedPortROSLink_4= ruleMixedPortROSLink ) ;
    public final EObject ruleAbstractComponentLink() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentSubNodeObserver_0 = null;

        EObject this_RequestPortLink_1 = null;

        EObject this_InputLinkExtension_2 = null;

        EObject this_OpcUaClientLink_3 = null;

        EObject this_MixedPortROSLink_4 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1315:2: ( (this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver | this_RequestPortLink_1= ruleRequestPortLink | this_InputLinkExtension_2= ruleInputLinkExtension | this_OpcUaClientLink_3= ruleOpcUaClientLink | this_MixedPortROSLink_4= ruleMixedPortROSLink ) )
            // InternalComponentDefinition.g:1316:2: (this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver | this_RequestPortLink_1= ruleRequestPortLink | this_InputLinkExtension_2= ruleInputLinkExtension | this_OpcUaClientLink_3= ruleOpcUaClientLink | this_MixedPortROSLink_4= ruleMixedPortROSLink )
            {
            // InternalComponentDefinition.g:1316:2: (this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver | this_RequestPortLink_1= ruleRequestPortLink | this_InputLinkExtension_2= ruleInputLinkExtension | this_OpcUaClientLink_3= ruleOpcUaClientLink | this_MixedPortROSLink_4= ruleMixedPortROSLink )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt23=1;
                }
                break;
            case 30:
                {
                alt23=2;
                }
                break;
            case 34:
                {
                alt23=3;
                }
                break;
            case 31:
                {
                alt23=4;
                }
                break;
            case 32:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalComponentDefinition.g:1317:3: this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentLinkAccess().getComponentSubNodeObserverParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentSubNodeObserver_0=ruleComponentSubNodeObserver();

                    state._fsp--;


                    			current = this_ComponentSubNodeObserver_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1326:3: this_RequestPortLink_1= ruleRequestPortLink
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentLinkAccess().getRequestPortLinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequestPortLink_1=ruleRequestPortLink();

                    state._fsp--;


                    			current = this_RequestPortLink_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:1335:3: this_InputLinkExtension_2= ruleInputLinkExtension
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentLinkAccess().getInputLinkExtensionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputLinkExtension_2=ruleInputLinkExtension();

                    state._fsp--;


                    			current = this_InputLinkExtension_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalComponentDefinition.g:1344:3: this_OpcUaClientLink_3= ruleOpcUaClientLink
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentLinkAccess().getOpcUaClientLinkParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpcUaClientLink_3=ruleOpcUaClientLink();

                    state._fsp--;


                    			current = this_OpcUaClientLink_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalComponentDefinition.g:1353:3: this_MixedPortROSLink_4= ruleMixedPortROSLink
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentLinkAccess().getMixedPortROSLinkParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MixedPortROSLink_4=ruleMixedPortROSLink();

                    state._fsp--;


                    			current = this_MixedPortROSLink_4;
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
    // $ANTLR end "ruleAbstractComponentLink"


    // $ANTLR start "entryRuleRequestPortLink"
    // InternalComponentDefinition.g:1365:1: entryRuleRequestPortLink returns [EObject current=null] : iv_ruleRequestPortLink= ruleRequestPortLink EOF ;
    public final EObject entryRuleRequestPortLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestPortLink = null;


        try {
            // InternalComponentDefinition.g:1365:56: (iv_ruleRequestPortLink= ruleRequestPortLink EOF )
            // InternalComponentDefinition.g:1366:2: iv_ruleRequestPortLink= ruleRequestPortLink EOF
            {
             newCompositeNode(grammarAccess.getRequestPortLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequestPortLink=ruleRequestPortLink();

            state._fsp--;

             current =iv_ruleRequestPortLink; 
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
    // $ANTLR end "entryRuleRequestPortLink"


    // $ANTLR start "ruleRequestPortLink"
    // InternalComponentDefinition.g:1372:1: ruleRequestPortLink returns [EObject current=null] : (otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleRequestPortLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1378:2: ( (otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:1379:2: (otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:1379:2: (otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:1380:3: otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestPortLinkAccess().getRequestPortLinkKeyword_0());
            		
            // InternalComponentDefinition.g:1384:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1385:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1385:4: ( ruleFQN )
            // InternalComponentDefinition.g:1386:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestPortLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequestPortLinkAccess().getRequestPortRequestPortCrossReference_1_0());
            				
            pushFollow(FOLLOW_5);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:1400:3: (otherlv_2= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==12) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentDefinition.g:1401:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getRequestPortLinkAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleRequestPortLink"


    // $ANTLR start "entryRuleOpcUaClientLink"
    // InternalComponentDefinition.g:1410:1: entryRuleOpcUaClientLink returns [EObject current=null] : iv_ruleOpcUaClientLink= ruleOpcUaClientLink EOF ;
    public final EObject entryRuleOpcUaClientLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUaClientLink = null;


        try {
            // InternalComponentDefinition.g:1410:56: (iv_ruleOpcUaClientLink= ruleOpcUaClientLink EOF )
            // InternalComponentDefinition.g:1411:2: iv_ruleOpcUaClientLink= ruleOpcUaClientLink EOF
            {
             newCompositeNode(grammarAccess.getOpcUaClientLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpcUaClientLink=ruleOpcUaClientLink();

            state._fsp--;

             current =iv_ruleOpcUaClientLink; 
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
    // $ANTLR end "entryRuleOpcUaClientLink"


    // $ANTLR start "ruleOpcUaClientLink"
    // InternalComponentDefinition.g:1417:1: ruleOpcUaClientLink returns [EObject current=null] : (otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleOpcUaClientLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1423:2: ( (otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:1424:2: (otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:1424:2: (otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:1425:3: otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpcUaClientLinkAccess().getOpcUaClientLinkKeyword_0());
            		
            // InternalComponentDefinition.g:1429:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1430:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1430:4: ( ruleFQN )
            // InternalComponentDefinition.g:1431:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpcUaClientLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpcUaClientLinkAccess().getClientOpcUaDeviceClientCrossReference_1_0());
            				
            pushFollow(FOLLOW_5);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:1445:3: (otherlv_2= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==12) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentDefinition.g:1446:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpcUaClientLinkAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleOpcUaClientLink"


    // $ANTLR start "entryRuleMixedPortROSLink"
    // InternalComponentDefinition.g:1455:1: entryRuleMixedPortROSLink returns [EObject current=null] : iv_ruleMixedPortROSLink= ruleMixedPortROSLink EOF ;
    public final EObject entryRuleMixedPortROSLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixedPortROSLink = null;


        try {
            // InternalComponentDefinition.g:1455:57: (iv_ruleMixedPortROSLink= ruleMixedPortROSLink EOF )
            // InternalComponentDefinition.g:1456:2: iv_ruleMixedPortROSLink= ruleMixedPortROSLink EOF
            {
             newCompositeNode(grammarAccess.getMixedPortROSLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMixedPortROSLink=ruleMixedPortROSLink();

            state._fsp--;

             current =iv_ruleMixedPortROSLink; 
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
    // $ANTLR end "entryRuleMixedPortROSLink"


    // $ANTLR start "ruleMixedPortROSLink"
    // InternalComponentDefinition.g:1462:1: ruleMixedPortROSLink returns [EObject current=null] : (otherlv_0= 'MixedPortROSLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleMixedPortROSLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1468:2: ( (otherlv_0= 'MixedPortROSLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:1469:2: (otherlv_0= 'MixedPortROSLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:1469:2: (otherlv_0= 'MixedPortROSLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:1470:3: otherlv_0= 'MixedPortROSLink' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMixedPortROSLinkAccess().getMixedPortROSLinkKeyword_0());
            		
            // InternalComponentDefinition.g:1474:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1475:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1475:4: ( ruleFQN )
            // InternalComponentDefinition.g:1476:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixedPortROSLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMixedPortROSLinkAccess().getMixedportrosMixedPortROSCrossReference_1_0());
            				
            pushFollow(FOLLOW_5);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:1490:3: (otherlv_2= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==12) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentDefinition.g:1491:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getMixedPortROSLinkAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleMixedPortROSLink"


    // $ANTLR start "entryRuleComponentSubNodeObserver"
    // InternalComponentDefinition.g:1500:1: entryRuleComponentSubNodeObserver returns [EObject current=null] : iv_ruleComponentSubNodeObserver= ruleComponentSubNodeObserver EOF ;
    public final EObject entryRuleComponentSubNodeObserver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentSubNodeObserver = null;


        try {
            // InternalComponentDefinition.g:1500:65: (iv_ruleComponentSubNodeObserver= ruleComponentSubNodeObserver EOF )
            // InternalComponentDefinition.g:1501:2: iv_ruleComponentSubNodeObserver= ruleComponentSubNodeObserver EOF
            {
             newCompositeNode(grammarAccess.getComponentSubNodeObserverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentSubNodeObserver=ruleComponentSubNodeObserver();

            state._fsp--;

             current =iv_ruleComponentSubNodeObserver; 
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
    // $ANTLR end "entryRuleComponentSubNodeObserver"


    // $ANTLR start "ruleComponentSubNodeObserver"
    // InternalComponentDefinition.g:1507:1: ruleComponentSubNodeObserver returns [EObject current=null] : (otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleComponentSubNodeObserver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1513:2: ( (otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:1514:2: (otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:1514:2: (otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:1515:3: otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentSubNodeObserverAccess().getObserveKeyword_0());
            		
            // InternalComponentDefinition.g:1519:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1520:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1520:4: ( ruleFQN )
            // InternalComponentDefinition.g:1521:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentSubNodeObserverRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentSubNodeObserverAccess().getSubjectComponentSubNodeCrossReference_1_0());
            				
            pushFollow(FOLLOW_5);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:1535:3: (otherlv_2= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==12) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponentDefinition.g:1536:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentSubNodeObserverAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleComponentSubNodeObserver"


    // $ANTLR start "entryRuleInputLinkExtension"
    // InternalComponentDefinition.g:1545:1: entryRuleInputLinkExtension returns [EObject current=null] : iv_ruleInputLinkExtension= ruleInputLinkExtension EOF ;
    public final EObject entryRuleInputLinkExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputLinkExtension = null;


        try {
            // InternalComponentDefinition.g:1545:59: (iv_ruleInputLinkExtension= ruleInputLinkExtension EOF )
            // InternalComponentDefinition.g:1546:2: iv_ruleInputLinkExtension= ruleInputLinkExtension EOF
            {
             newCompositeNode(grammarAccess.getInputLinkExtensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputLinkExtension=ruleInputLinkExtension();

            state._fsp--;

             current =iv_ruleInputLinkExtension; 
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
    // $ANTLR end "entryRuleInputLinkExtension"


    // $ANTLR start "ruleInputLinkExtension"
    // InternalComponentDefinition.g:1552:1: ruleInputLinkExtension returns [EObject current=null] : ( () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ;
    public final EObject ruleInputLinkExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_optional_5_0=null;
        Token lv_oversamplingOk_6_0=null;
        Token lv_undersamplingOk_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1558:2: ( ( () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalComponentDefinition.g:1559:2: ( () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalComponentDefinition.g:1559:2: ( () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalComponentDefinition.g:1560:3: () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            // InternalComponentDefinition.g:1560:3: ()
            // InternalComponentDefinition.g:1561:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputLinkExtensionAccess().getInputLinkExtensionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInputLinkExtensionAccess().getInputPortLinkKeyword_1());
            		
            // InternalComponentDefinition.g:1571:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1572:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1572:4: ( ruleFQN )
            // InternalComponentDefinition.g:1573:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputLinkExtensionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInputLinkExtensionAccess().getInputPortInputPortCrossReference_2_0());
            				
            pushFollow(FOLLOW_8);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getInputLinkExtensionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentDefinition.g:1591:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) )
            // InternalComponentDefinition.g:1592:4: ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) )
            {
            // InternalComponentDefinition.g:1592:4: ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) )
            // InternalComponentDefinition.g:1593:5: ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
            				
            // InternalComponentDefinition.g:1596:5: ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* )
            // InternalComponentDefinition.g:1597:6: ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )*
            {
            // InternalComponentDefinition.g:1597:6: ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )*
            loop28:
            do {
                int alt28=4;
                int LA28_0 = input.LA(1);

                if ( LA28_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                    alt28=1;
                }
                else if ( LA28_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                    alt28=2;
                }
                else if ( LA28_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                    alt28=3;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalComponentDefinition.g:1598:4: ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1598:4: ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) )
            	    // InternalComponentDefinition.g:1599:5: {...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalComponentDefinition.g:1599:115: ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) )
            	    // InternalComponentDefinition.g:1600:6: ({...}? => ( (lv_optional_5_0= 'optional' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalComponentDefinition.g:1603:9: ({...}? => ( (lv_optional_5_0= 'optional' ) ) )
            	    // InternalComponentDefinition.g:1603:10: {...}? => ( (lv_optional_5_0= 'optional' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "true");
            	    }
            	    // InternalComponentDefinition.g:1603:19: ( (lv_optional_5_0= 'optional' ) )
            	    // InternalComponentDefinition.g:1603:20: (lv_optional_5_0= 'optional' )
            	    {
            	    // InternalComponentDefinition.g:1603:20: (lv_optional_5_0= 'optional' )
            	    // InternalComponentDefinition.g:1604:10: lv_optional_5_0= 'optional'
            	    {
            	    lv_optional_5_0=(Token)match(input,35,FOLLOW_19); 

            	    										newLeafNode(lv_optional_5_0, grammarAccess.getInputLinkExtensionAccess().getOptionalOptionalKeyword_4_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getInputLinkExtensionRule());
            	    										}
            	    										setWithLastConsumed(current, "optional", true, "optional");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComponentDefinition.g:1621:4: ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1621:4: ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) )
            	    // InternalComponentDefinition.g:1622:5: {...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalComponentDefinition.g:1622:115: ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) )
            	    // InternalComponentDefinition.g:1623:6: ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalComponentDefinition.g:1626:9: ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) )
            	    // InternalComponentDefinition.g:1626:10: {...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "true");
            	    }
            	    // InternalComponentDefinition.g:1626:19: ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) )
            	    // InternalComponentDefinition.g:1626:20: (lv_oversamplingOk_6_0= 'oversamplingOk' )
            	    {
            	    // InternalComponentDefinition.g:1626:20: (lv_oversamplingOk_6_0= 'oversamplingOk' )
            	    // InternalComponentDefinition.g:1627:10: lv_oversamplingOk_6_0= 'oversamplingOk'
            	    {
            	    lv_oversamplingOk_6_0=(Token)match(input,36,FOLLOW_19); 

            	    										newLeafNode(lv_oversamplingOk_6_0, grammarAccess.getInputLinkExtensionAccess().getOversamplingOkOversamplingOkKeyword_4_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getInputLinkExtensionRule());
            	    										}
            	    										setWithLastConsumed(current, "oversamplingOk", true, "oversamplingOk");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComponentDefinition.g:1644:4: ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1644:4: ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) )
            	    // InternalComponentDefinition.g:1645:5: {...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalComponentDefinition.g:1645:115: ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) )
            	    // InternalComponentDefinition.g:1646:6: ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalComponentDefinition.g:1649:9: ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) )
            	    // InternalComponentDefinition.g:1649:10: {...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "true");
            	    }
            	    // InternalComponentDefinition.g:1649:19: ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) )
            	    // InternalComponentDefinition.g:1649:20: (lv_undersamplingOk_7_0= 'undersamplingOk' )
            	    {
            	    // InternalComponentDefinition.g:1649:20: (lv_undersamplingOk_7_0= 'undersamplingOk' )
            	    // InternalComponentDefinition.g:1650:10: lv_undersamplingOk_7_0= 'undersamplingOk'
            	    {
            	    lv_undersamplingOk_7_0=(Token)match(input,37,FOLLOW_19); 

            	    										newLeafNode(lv_undersamplingOk_7_0, grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkUndersamplingOkKeyword_4_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getInputLinkExtensionRule());
            	    										}
            	    										setWithLastConsumed(current, "undersamplingOk", true, "undersamplingOk");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
            				

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getInputLinkExtensionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleInputLinkExtension"


    // $ANTLR start "entryRuleActivityExtension"
    // InternalComponentDefinition.g:1682:1: entryRuleActivityExtension returns [EObject current=null] : iv_ruleActivityExtension= ruleActivityExtension EOF ;
    public final EObject entryRuleActivityExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityExtension = null;


        try {
            // InternalComponentDefinition.g:1682:58: (iv_ruleActivityExtension= ruleActivityExtension EOF )
            // InternalComponentDefinition.g:1683:2: iv_ruleActivityExtension= ruleActivityExtension EOF
            {
             newCompositeNode(grammarAccess.getActivityExtensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityExtension=ruleActivityExtension();

            state._fsp--;

             current =iv_ruleActivityExtension; 
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
    // $ANTLR end "entryRuleActivityExtension"


    // $ANTLR start "ruleActivityExtension"
    // InternalComponentDefinition.g:1689:1: ruleActivityExtension returns [EObject current=null] : (this_ActivationConstraints_0= ruleActivationConstraints | this_OperationModeBinding_1= ruleOperationModeBinding | this_DefaultTrigger_2= ruleDefaultTrigger ) ;
    public final EObject ruleActivityExtension() throws RecognitionException {
        EObject current = null;

        EObject this_ActivationConstraints_0 = null;

        EObject this_OperationModeBinding_1 = null;

        EObject this_DefaultTrigger_2 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1695:2: ( (this_ActivationConstraints_0= ruleActivationConstraints | this_OperationModeBinding_1= ruleOperationModeBinding | this_DefaultTrigger_2= ruleDefaultTrigger ) )
            // InternalComponentDefinition.g:1696:2: (this_ActivationConstraints_0= ruleActivationConstraints | this_OperationModeBinding_1= ruleOperationModeBinding | this_DefaultTrigger_2= ruleDefaultTrigger )
            {
            // InternalComponentDefinition.g:1696:2: (this_ActivationConstraints_0= ruleActivationConstraints | this_OperationModeBinding_1= ruleOperationModeBinding | this_DefaultTrigger_2= ruleDefaultTrigger )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt29=1;
                }
                break;
            case 44:
                {
                alt29=2;
                }
                break;
            case 45:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalComponentDefinition.g:1697:3: this_ActivationConstraints_0= ruleActivationConstraints
                    {

                    			newCompositeNode(grammarAccess.getActivityExtensionAccess().getActivationConstraintsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActivationConstraints_0=ruleActivationConstraints();

                    state._fsp--;


                    			current = this_ActivationConstraints_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1706:3: this_OperationModeBinding_1= ruleOperationModeBinding
                    {

                    			newCompositeNode(grammarAccess.getActivityExtensionAccess().getOperationModeBindingParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationModeBinding_1=ruleOperationModeBinding();

                    state._fsp--;


                    			current = this_OperationModeBinding_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:1715:3: this_DefaultTrigger_2= ruleDefaultTrigger
                    {

                    			newCompositeNode(grammarAccess.getActivityExtensionAccess().getDefaultTriggerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefaultTrigger_2=ruleDefaultTrigger();

                    state._fsp--;


                    			current = this_DefaultTrigger_2;
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
    // $ANTLR end "ruleActivityExtension"


    // $ANTLR start "entryRuleActivationConstraints"
    // InternalComponentDefinition.g:1727:1: entryRuleActivationConstraints returns [EObject current=null] : iv_ruleActivationConstraints= ruleActivationConstraints EOF ;
    public final EObject entryRuleActivationConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivationConstraints = null;


        try {
            // InternalComponentDefinition.g:1727:62: (iv_ruleActivationConstraints= ruleActivationConstraints EOF )
            // InternalComponentDefinition.g:1728:2: iv_ruleActivationConstraints= ruleActivationConstraints EOF
            {
             newCompositeNode(grammarAccess.getActivationConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivationConstraints=ruleActivationConstraints();

            state._fsp--;

             current =iv_ruleActivationConstraints; 
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
    // $ANTLR end "entryRuleActivationConstraints"


    // $ANTLR start "ruleActivationConstraints"
    // InternalComponentDefinition.g:1734:1: ruleActivationConstraints returns [EObject current=null] : ( () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}' ) ;
    public final EObject ruleActivationConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_configurable_5_0 = null;

        AntlrDatatypeRuleToken lv_minActFreq_10_0 = null;

        AntlrDatatypeRuleToken lv_maxActFreq_15_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1740:2: ( ( () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}' ) )
            // InternalComponentDefinition.g:1741:2: ( () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}' )
            {
            // InternalComponentDefinition.g:1741:2: ( () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}' )
            // InternalComponentDefinition.g:1742:3: () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}'
            {
            // InternalComponentDefinition.g:1742:3: ()
            // InternalComponentDefinition.g:1743:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivationConstraintsAccess().getActivationConstraintsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getActivationConstraintsAccess().getActivationConstraintsKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getActivationConstraintsAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getActivationConstraintsAccess().getConfigurableKeyword_3());
            		
            otherlv_4=(Token)match(input,40,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_4());
            		
            // InternalComponentDefinition.g:1765:3: ( (lv_configurable_5_0= ruleEBoolean ) )
            // InternalComponentDefinition.g:1766:4: (lv_configurable_5_0= ruleEBoolean )
            {
            // InternalComponentDefinition.g:1766:4: (lv_configurable_5_0= ruleEBoolean )
            // InternalComponentDefinition.g:1767:5: lv_configurable_5_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getActivationConstraintsAccess().getConfigurableEBooleanParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_configurable_5_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivationConstraintsRule());
            					}
            					set(
            						current,
            						"configurable",
            						lv_configurable_5_0,
            						"org.xtext.service.roboticMiddleware.RoboticMiddleware.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:1784:3: (otherlv_6= ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==12) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponentDefinition.g:1785:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_6());
                    			

                    }
                    break;

            }

            // InternalComponentDefinition.g:1790:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) )
            // InternalComponentDefinition.g:1791:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) )
            {
            // InternalComponentDefinition.g:1791:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) )
            // InternalComponentDefinition.g:1792:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
            				
            // InternalComponentDefinition.g:1795:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* )
            // InternalComponentDefinition.g:1796:6: ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )*
            {
            // InternalComponentDefinition.g:1796:6: ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( LA33_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalComponentDefinition.g:1797:4: ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1797:4: ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) )
            	    // InternalComponentDefinition.g:1798:5: {...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActivationConstraints", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalComponentDefinition.g:1798:118: ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) )
            	    // InternalComponentDefinition.g:1799:6: ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0);
            	    					
            	    // InternalComponentDefinition.g:1802:9: ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) )
            	    // InternalComponentDefinition.g:1802:10: {...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivationConstraints", "true");
            	    }
            	    // InternalComponentDefinition.g:1802:19: (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? )
            	    // InternalComponentDefinition.g:1802:20: otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )?
            	    {
            	    otherlv_8=(Token)match(input,41,FOLLOW_21); 

            	    									newLeafNode(otherlv_8, grammarAccess.getActivationConstraintsAccess().getMinActFreqKeyword_7_0_0());
            	    								
            	    otherlv_9=(Token)match(input,40,FOLLOW_25); 

            	    									newLeafNode(otherlv_9, grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_0_1());
            	    								
            	    // InternalComponentDefinition.g:1810:9: ( (lv_minActFreq_10_0= ruleEDouble ) )
            	    // InternalComponentDefinition.g:1811:10: (lv_minActFreq_10_0= ruleEDouble )
            	    {
            	    // InternalComponentDefinition.g:1811:10: (lv_minActFreq_10_0= ruleEDouble )
            	    // InternalComponentDefinition.g:1812:11: lv_minActFreq_10_0= ruleEDouble
            	    {

            	    											newCompositeNode(grammarAccess.getActivationConstraintsAccess().getMinActFreqEDoubleParserRuleCall_7_0_2_0());
            	    										
            	    pushFollow(FOLLOW_26);
            	    lv_minActFreq_10_0=ruleEDouble();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getActivationConstraintsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"minActFreq",
            	    												lv_minActFreq_10_0,
            	    												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EDouble");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_11=(Token)match(input,42,FOLLOW_23); 

            	    									newLeafNode(otherlv_11, grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_0_3());
            	    								
            	    // InternalComponentDefinition.g:1833:9: (otherlv_12= ';' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==12) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalComponentDefinition.g:1834:10: otherlv_12= ';'
            	            {
            	            otherlv_12=(Token)match(input,12,FOLLOW_24); 

            	            										newLeafNode(otherlv_12, grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_0_4());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComponentDefinition.g:1845:4: ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1845:4: ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) )
            	    // InternalComponentDefinition.g:1846:5: {...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActivationConstraints", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalComponentDefinition.g:1846:118: ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) )
            	    // InternalComponentDefinition.g:1847:6: ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1);
            	    					
            	    // InternalComponentDefinition.g:1850:9: ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) )
            	    // InternalComponentDefinition.g:1850:10: {...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivationConstraints", "true");
            	    }
            	    // InternalComponentDefinition.g:1850:19: (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? )
            	    // InternalComponentDefinition.g:1850:20: otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )?
            	    {
            	    otherlv_13=(Token)match(input,43,FOLLOW_21); 

            	    									newLeafNode(otherlv_13, grammarAccess.getActivationConstraintsAccess().getMaxActFreqKeyword_7_1_0());
            	    								
            	    otherlv_14=(Token)match(input,40,FOLLOW_25); 

            	    									newLeafNode(otherlv_14, grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_1_1());
            	    								
            	    // InternalComponentDefinition.g:1858:9: ( (lv_maxActFreq_15_0= ruleEDouble ) )
            	    // InternalComponentDefinition.g:1859:10: (lv_maxActFreq_15_0= ruleEDouble )
            	    {
            	    // InternalComponentDefinition.g:1859:10: (lv_maxActFreq_15_0= ruleEDouble )
            	    // InternalComponentDefinition.g:1860:11: lv_maxActFreq_15_0= ruleEDouble
            	    {

            	    											newCompositeNode(grammarAccess.getActivationConstraintsAccess().getMaxActFreqEDoubleParserRuleCall_7_1_2_0());
            	    										
            	    pushFollow(FOLLOW_26);
            	    lv_maxActFreq_15_0=ruleEDouble();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getActivationConstraintsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"maxActFreq",
            	    												lv_maxActFreq_15_0,
            	    												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EDouble");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_16=(Token)match(input,42,FOLLOW_23); 

            	    									newLeafNode(otherlv_16, grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_1_3());
            	    								
            	    // InternalComponentDefinition.g:1881:9: (otherlv_17= ';' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==12) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalComponentDefinition.g:1882:10: otherlv_17= ';'
            	            {
            	            otherlv_17=(Token)match(input,12,FOLLOW_24); 

            	            										newLeafNode(otherlv_17, grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_1_4());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
            				

            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getActivationConstraintsAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleActivationConstraints"


    // $ANTLR start "entryRuleOperationModeBinding"
    // InternalComponentDefinition.g:1908:1: entryRuleOperationModeBinding returns [EObject current=null] : iv_ruleOperationModeBinding= ruleOperationModeBinding EOF ;
    public final EObject entryRuleOperationModeBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationModeBinding = null;


        try {
            // InternalComponentDefinition.g:1908:61: (iv_ruleOperationModeBinding= ruleOperationModeBinding EOF )
            // InternalComponentDefinition.g:1909:2: iv_ruleOperationModeBinding= ruleOperationModeBinding EOF
            {
             newCompositeNode(grammarAccess.getOperationModeBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationModeBinding=ruleOperationModeBinding();

            state._fsp--;

             current =iv_ruleOperationModeBinding; 
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
    // $ANTLR end "entryRuleOperationModeBinding"


    // $ANTLR start "ruleOperationModeBinding"
    // InternalComponentDefinition.g:1915:1: ruleOperationModeBinding returns [EObject current=null] : (otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleOperationModeBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1921:2: ( (otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:1922:2: (otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:1922:2: (otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:1923:3: otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationModeBindingAccess().getOperationModeBindingKeyword_0());
            		
            // InternalComponentDefinition.g:1927:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1928:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1928:4: ( ruleFQN )
            // InternalComponentDefinition.g:1929:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationModeBindingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOperationModeBindingAccess().getModePrivateOperationModeCrossReference_1_0());
            				
            pushFollow(FOLLOW_5);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:1943:3: (otherlv_2= ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==12) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalComponentDefinition.g:1944:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getOperationModeBindingAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleOperationModeBinding"


    // $ANTLR start "entryRuleDefaultTrigger"
    // InternalComponentDefinition.g:1953:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // InternalComponentDefinition.g:1953:55: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // InternalComponentDefinition.g:1954:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
            {
             newCompositeNode(grammarAccess.getDefaultTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultTrigger=ruleDefaultTrigger();

            state._fsp--;

             current =iv_ruleDefaultTrigger; 
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
    // $ANTLR end "entryRuleDefaultTrigger"


    // $ANTLR start "ruleDefaultTrigger"
    // InternalComponentDefinition.g:1960:1: ruleDefaultTrigger returns [EObject current=null] : (otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )? ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_DefaultInputTrigger_1 = null;

        EObject this_DefaultPeriodicTimer_2 = null;

        EObject this_DefaultObservedElementTrigger_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1966:2: ( (otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )? ) )
            // InternalComponentDefinition.g:1967:2: (otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )? )
            {
            // InternalComponentDefinition.g:1967:2: (otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )? )
            // InternalComponentDefinition.g:1968:3: otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultTriggerAccess().getDefaultTriggerKeyword_0());
            		
            // InternalComponentDefinition.g:1972:3: (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt35=1;
                }
                break;
            case 48:
                {
                alt35=2;
                }
                break;
            case 49:
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
                    // InternalComponentDefinition.g:1973:4: this_DefaultInputTrigger_1= ruleDefaultInputTrigger
                    {

                    				newCompositeNode(grammarAccess.getDefaultTriggerAccess().getDefaultInputTriggerParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_5);
                    this_DefaultInputTrigger_1=ruleDefaultInputTrigger();

                    state._fsp--;


                    				current = this_DefaultInputTrigger_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1982:4: this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer
                    {

                    				newCompositeNode(grammarAccess.getDefaultTriggerAccess().getDefaultPeriodicTimerParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_DefaultPeriodicTimer_2=ruleDefaultPeriodicTimer();

                    state._fsp--;


                    				current = this_DefaultPeriodicTimer_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:1991:4: this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger
                    {

                    				newCompositeNode(grammarAccess.getDefaultTriggerAccess().getDefaultObservedElementTriggerParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_5);
                    this_DefaultObservedElementTrigger_3=ruleDefaultObservedElementTrigger();

                    state._fsp--;


                    				current = this_DefaultObservedElementTrigger_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalComponentDefinition.g:2000:3: (otherlv_4= ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==12) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalComponentDefinition.g:2001:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDefaultTriggerAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleDefaultTrigger"


    // $ANTLR start "entryRuleDefaultInputTrigger"
    // InternalComponentDefinition.g:2010:1: entryRuleDefaultInputTrigger returns [EObject current=null] : iv_ruleDefaultInputTrigger= ruleDefaultInputTrigger EOF ;
    public final EObject entryRuleDefaultInputTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultInputTrigger = null;


        try {
            // InternalComponentDefinition.g:2010:60: (iv_ruleDefaultInputTrigger= ruleDefaultInputTrigger EOF )
            // InternalComponentDefinition.g:2011:2: iv_ruleDefaultInputTrigger= ruleDefaultInputTrigger EOF
            {
             newCompositeNode(grammarAccess.getDefaultInputTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultInputTrigger=ruleDefaultInputTrigger();

            state._fsp--;

             current =iv_ruleDefaultInputTrigger; 
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
    // $ANTLR end "entryRuleDefaultInputTrigger"


    // $ANTLR start "ruleDefaultInputTrigger"
    // InternalComponentDefinition.g:2017:1: ruleDefaultInputTrigger returns [EObject current=null] : (otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )? ) ;
    public final EObject ruleDefaultInputTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_prescale_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2023:2: ( (otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )? ) )
            // InternalComponentDefinition.g:2024:2: (otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )? )
            {
            // InternalComponentDefinition.g:2024:2: (otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )? )
            // InternalComponentDefinition.g:2025:3: otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultInputTriggerAccess().getInputPortTriggerKeyword_0());
            		
            // InternalComponentDefinition.g:2029:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2030:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2030:4: ( ruleFQN )
            // InternalComponentDefinition.g:2031:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefaultInputTriggerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDefaultInputTriggerAccess().getInputLinkInputLinkExtensionCrossReference_1_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:2045:3: (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalComponentDefinition.g:2046:4: otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefaultInputTriggerAccess().getPrescaleKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:2050:4: ( (lv_prescale_3_0= ruleEInt ) )
                    // InternalComponentDefinition.g:2051:5: (lv_prescale_3_0= ruleEInt )
                    {
                    // InternalComponentDefinition.g:2051:5: (lv_prescale_3_0= ruleEInt )
                    // InternalComponentDefinition.g:2052:6: lv_prescale_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDefaultInputTriggerAccess().getPrescaleEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_prescale_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefaultInputTriggerRule());
                    						}
                    						set(
                    							current,
                    							"prescale",
                    							lv_prescale_3_0,
                    							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EInt");
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
    // $ANTLR end "ruleDefaultInputTrigger"


    // $ANTLR start "entryRuleDefaultPeriodicTimer"
    // InternalComponentDefinition.g:2074:1: entryRuleDefaultPeriodicTimer returns [EObject current=null] : iv_ruleDefaultPeriodicTimer= ruleDefaultPeriodicTimer EOF ;
    public final EObject entryRuleDefaultPeriodicTimer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultPeriodicTimer = null;


        try {
            // InternalComponentDefinition.g:2074:61: (iv_ruleDefaultPeriodicTimer= ruleDefaultPeriodicTimer EOF )
            // InternalComponentDefinition.g:2075:2: iv_ruleDefaultPeriodicTimer= ruleDefaultPeriodicTimer EOF
            {
             newCompositeNode(grammarAccess.getDefaultPeriodicTimerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultPeriodicTimer=ruleDefaultPeriodicTimer();

            state._fsp--;

             current =iv_ruleDefaultPeriodicTimer; 
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
    // $ANTLR end "entryRuleDefaultPeriodicTimer"


    // $ANTLR start "ruleDefaultPeriodicTimer"
    // InternalComponentDefinition.g:2081:1: ruleDefaultPeriodicTimer returns [EObject current=null] : (otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz' ) ;
    public final EObject ruleDefaultPeriodicTimer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_periodicActFreq_1_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2087:2: ( (otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz' ) )
            // InternalComponentDefinition.g:2088:2: (otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz' )
            {
            // InternalComponentDefinition.g:2088:2: (otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz' )
            // InternalComponentDefinition.g:2089:3: otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicTimerKeyword_0());
            		
            // InternalComponentDefinition.g:2093:3: ( (lv_periodicActFreq_1_0= ruleEDouble ) )
            // InternalComponentDefinition.g:2094:4: (lv_periodicActFreq_1_0= ruleEDouble )
            {
            // InternalComponentDefinition.g:2094:4: (lv_periodicActFreq_1_0= ruleEDouble )
            // InternalComponentDefinition.g:2095:5: lv_periodicActFreq_1_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_periodicActFreq_1_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefaultPeriodicTimerRule());
            					}
            					set(
            						current,
            						"periodicActFreq",
            						lv_periodicActFreq_1_0,
            						"org.xtext.service.roboticMiddleware.RoboticMiddleware.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDefaultPeriodicTimerAccess().getHzKeyword_2());
            		

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
    // $ANTLR end "ruleDefaultPeriodicTimer"


    // $ANTLR start "entryRuleDefaultObservedElementTrigger"
    // InternalComponentDefinition.g:2120:1: entryRuleDefaultObservedElementTrigger returns [EObject current=null] : iv_ruleDefaultObservedElementTrigger= ruleDefaultObservedElementTrigger EOF ;
    public final EObject entryRuleDefaultObservedElementTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultObservedElementTrigger = null;


        try {
            // InternalComponentDefinition.g:2120:70: (iv_ruleDefaultObservedElementTrigger= ruleDefaultObservedElementTrigger EOF )
            // InternalComponentDefinition.g:2121:2: iv_ruleDefaultObservedElementTrigger= ruleDefaultObservedElementTrigger EOF
            {
             newCompositeNode(grammarAccess.getDefaultObservedElementTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultObservedElementTrigger=ruleDefaultObservedElementTrigger();

            state._fsp--;

             current =iv_ruleDefaultObservedElementTrigger; 
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
    // $ANTLR end "entryRuleDefaultObservedElementTrigger"


    // $ANTLR start "ruleDefaultObservedElementTrigger"
    // InternalComponentDefinition.g:2127:1: ruleDefaultObservedElementTrigger returns [EObject current=null] : (otherlv_0= 'ObservedElement' ( ( ruleFQN ) ) ) ;
    public final EObject ruleDefaultObservedElementTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2133:2: ( (otherlv_0= 'ObservedElement' ( ( ruleFQN ) ) ) )
            // InternalComponentDefinition.g:2134:2: (otherlv_0= 'ObservedElement' ( ( ruleFQN ) ) )
            {
            // InternalComponentDefinition.g:2134:2: (otherlv_0= 'ObservedElement' ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:2135:3: otherlv_0= 'ObservedElement' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultObservedElementTriggerAccess().getObservedElementKeyword_0());
            		
            // InternalComponentDefinition.g:2139:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2140:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2140:4: ( ruleFQN )
            // InternalComponentDefinition.g:2141:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefaultObservedElementTriggerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDefaultObservedElementTriggerAccess().getElementComponentSubNodeCrossReference_1_0());
            				
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
    // $ANTLR end "ruleDefaultObservedElementTrigger"


    // $ANTLR start "entryRulePlainOpcUaPort"
    // InternalComponentDefinition.g:2159:1: entryRulePlainOpcUaPort returns [EObject current=null] : iv_rulePlainOpcUaPort= rulePlainOpcUaPort EOF ;
    public final EObject entryRulePlainOpcUaPort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainOpcUaPort = null;


        try {
            // InternalComponentDefinition.g:2159:55: (iv_rulePlainOpcUaPort= rulePlainOpcUaPort EOF )
            // InternalComponentDefinition.g:2160:2: iv_rulePlainOpcUaPort= rulePlainOpcUaPort EOF
            {
             newCompositeNode(grammarAccess.getPlainOpcUaPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlainOpcUaPort=rulePlainOpcUaPort();

            state._fsp--;

             current =iv_rulePlainOpcUaPort; 
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
    // $ANTLR end "entryRulePlainOpcUaPort"


    // $ANTLR start "rulePlainOpcUaPort"
    // InternalComponentDefinition.g:2166:1: rulePlainOpcUaPort returns [EObject current=null] : (this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient | this_OpcUaReadServer_1= ruleOpcUaReadServer ) ;
    public final EObject rulePlainOpcUaPort() throws RecognitionException {
        EObject current = null;

        EObject this_OpcUaDeviceClient_0 = null;

        EObject this_OpcUaReadServer_1 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2172:2: ( (this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient | this_OpcUaReadServer_1= ruleOpcUaReadServer ) )
            // InternalComponentDefinition.g:2173:2: (this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient | this_OpcUaReadServer_1= ruleOpcUaReadServer )
            {
            // InternalComponentDefinition.g:2173:2: (this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient | this_OpcUaReadServer_1= ruleOpcUaReadServer )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            else if ( (LA38_0==53) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalComponentDefinition.g:2174:3: this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient
                    {

                    			newCompositeNode(grammarAccess.getPlainOpcUaPortAccess().getOpcUaDeviceClientParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpcUaDeviceClient_0=ruleOpcUaDeviceClient();

                    state._fsp--;


                    			current = this_OpcUaDeviceClient_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:2183:3: this_OpcUaReadServer_1= ruleOpcUaReadServer
                    {

                    			newCompositeNode(grammarAccess.getPlainOpcUaPortAccess().getOpcUaReadServerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpcUaReadServer_1=ruleOpcUaReadServer();

                    state._fsp--;


                    			current = this_OpcUaReadServer_1;
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
    // $ANTLR end "rulePlainOpcUaPort"


    // $ANTLR start "entryRuleOpcUaDeviceClient"
    // InternalComponentDefinition.g:2195:1: entryRuleOpcUaDeviceClient returns [EObject current=null] : iv_ruleOpcUaDeviceClient= ruleOpcUaDeviceClient EOF ;
    public final EObject entryRuleOpcUaDeviceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUaDeviceClient = null;


        try {
            // InternalComponentDefinition.g:2195:58: (iv_ruleOpcUaDeviceClient= ruleOpcUaDeviceClient EOF )
            // InternalComponentDefinition.g:2196:2: iv_ruleOpcUaDeviceClient= ruleOpcUaDeviceClient EOF
            {
             newCompositeNode(grammarAccess.getOpcUaDeviceClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpcUaDeviceClient=ruleOpcUaDeviceClient();

            state._fsp--;

             current =iv_ruleOpcUaDeviceClient; 
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
    // $ANTLR end "entryRuleOpcUaDeviceClient"


    // $ANTLR start "ruleOpcUaDeviceClient"
    // InternalComponentDefinition.g:2202:1: ruleOpcUaDeviceClient returns [EObject current=null] : (otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_7= ';' )? ) ;
    public final EObject ruleOpcUaDeviceClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_deviceURI_4_0 = null;

        AntlrDatatypeRuleToken lv_opcuaXmlFile_6_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2208:2: ( (otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_7= ';' )? ) )
            // InternalComponentDefinition.g:2209:2: (otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_7= ';' )? )
            {
            // InternalComponentDefinition.g:2209:2: (otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_7= ';' )? )
            // InternalComponentDefinition.g:2210:3: otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_7= ';' )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpcUaDeviceClientAccess().getOpcUaDeviceClientKeyword_0());
            		
            // InternalComponentDefinition.g:2214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:2215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:2215:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:2216:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOpcUaDeviceClientAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpcUaDeviceClientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalComponentDefinition.g:2232:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) )
            // InternalComponentDefinition.g:2233:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalComponentDefinition.g:2233:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            // InternalComponentDefinition.g:2234:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
            				
            // InternalComponentDefinition.g:2237:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            // InternalComponentDefinition.g:2238:6: ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?
            {
            // InternalComponentDefinition.g:2238:6: ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=3;
                int LA39_0 = input.LA(1);

                if ( LA39_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0) ) {
                    alt39=1;
                }
                else if ( LA39_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1) ) {
                    alt39=2;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalComponentDefinition.g:2239:4: ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:2239:4: ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDefinition.g:2240:5: {...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalComponentDefinition.g:2240:114: ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) )
            	    // InternalComponentDefinition.g:2241:6: ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalComponentDefinition.g:2244:9: ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) )
            	    // InternalComponentDefinition.g:2244:10: {...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "true");
            	    }
            	    // InternalComponentDefinition.g:2244:19: (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) )
            	    // InternalComponentDefinition.g:2244:20: otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,51,FOLLOW_7); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIKeyword_2_0_0());
            	    								
            	    // InternalComponentDefinition.g:2248:9: ( (lv_deviceURI_4_0= ruleEString ) )
            	    // InternalComponentDefinition.g:2249:10: (lv_deviceURI_4_0= ruleEString )
            	    {
            	    // InternalComponentDefinition.g:2249:10: (lv_deviceURI_4_0= ruleEString )
            	    // InternalComponentDefinition.g:2250:11: lv_deviceURI_4_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIEStringParserRuleCall_2_0_1_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_deviceURI_4_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOpcUaDeviceClientRule());
            	    											}
            	    											set(
            	    												current,
            	    												"deviceURI",
            	    												lv_deviceURI_4_0,
            	    												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComponentDefinition.g:2273:4: ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:2273:4: ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDefinition.g:2274:5: {...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalComponentDefinition.g:2274:114: ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) )
            	    // InternalComponentDefinition.g:2275:6: ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalComponentDefinition.g:2278:9: ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) )
            	    // InternalComponentDefinition.g:2278:10: {...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "true");
            	    }
            	    // InternalComponentDefinition.g:2278:19: (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) )
            	    // InternalComponentDefinition.g:2278:20: otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,52,FOLLOW_7); 

            	    									newLeafNode(otherlv_5, grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileKeyword_2_1_0());
            	    								
            	    // InternalComponentDefinition.g:2282:9: ( (lv_opcuaXmlFile_6_0= ruleEString ) )
            	    // InternalComponentDefinition.g:2283:10: (lv_opcuaXmlFile_6_0= ruleEString )
            	    {
            	    // InternalComponentDefinition.g:2283:10: (lv_opcuaXmlFile_6_0= ruleEString )
            	    // InternalComponentDefinition.g:2284:11: lv_opcuaXmlFile_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileEStringParserRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_opcuaXmlFile_6_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOpcUaDeviceClientRule());
            	    											}
            	    											set(
            	    												current,
            	    												"opcuaXmlFile",
            	    												lv_opcuaXmlFile_6_0,
            	    												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "getUnorderedGroupHelper().canLeave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
            				

            }

            // InternalComponentDefinition.g:2315:3: (otherlv_7= ';' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==12) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalComponentDefinition.g:2316:4: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getOpcUaDeviceClientAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleOpcUaDeviceClient"


    // $ANTLR start "entryRuleOpcUaReadServer"
    // InternalComponentDefinition.g:2325:1: entryRuleOpcUaReadServer returns [EObject current=null] : iv_ruleOpcUaReadServer= ruleOpcUaReadServer EOF ;
    public final EObject entryRuleOpcUaReadServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUaReadServer = null;


        try {
            // InternalComponentDefinition.g:2325:56: (iv_ruleOpcUaReadServer= ruleOpcUaReadServer EOF )
            // InternalComponentDefinition.g:2326:2: iv_ruleOpcUaReadServer= ruleOpcUaReadServer EOF
            {
             newCompositeNode(grammarAccess.getOpcUaReadServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpcUaReadServer=ruleOpcUaReadServer();

            state._fsp--;

             current =iv_ruleOpcUaReadServer; 
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
    // $ANTLR end "entryRuleOpcUaReadServer"


    // $ANTLR start "ruleOpcUaReadServer"
    // InternalComponentDefinition.g:2332:1: ruleOpcUaReadServer returns [EObject current=null] : (otherlv_0= 'OpcUaReadServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= 'portNumber' ( (lv_portNumber_5_0= ruleEInt ) ) )? (otherlv_6= ';' )? ) ;
    public final EObject ruleOpcUaReadServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_portNumber_5_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2338:2: ( (otherlv_0= 'OpcUaReadServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= 'portNumber' ( (lv_portNumber_5_0= ruleEInt ) ) )? (otherlv_6= ';' )? ) )
            // InternalComponentDefinition.g:2339:2: (otherlv_0= 'OpcUaReadServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= 'portNumber' ( (lv_portNumber_5_0= ruleEInt ) ) )? (otherlv_6= ';' )? )
            {
            // InternalComponentDefinition.g:2339:2: (otherlv_0= 'OpcUaReadServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= 'portNumber' ( (lv_portNumber_5_0= ruleEInt ) ) )? (otherlv_6= ';' )? )
            // InternalComponentDefinition.g:2340:3: otherlv_0= 'OpcUaReadServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= 'portNumber' ( (lv_portNumber_5_0= ruleEInt ) ) )? (otherlv_6= ';' )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpcUaReadServerAccess().getOpcUaReadServerKeyword_0());
            		
            // InternalComponentDefinition.g:2344:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:2345:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:2345:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:2346:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOpcUaReadServerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpcUaReadServerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOpcUaReadServerAccess().getDataProviderPortKeyword_2());
            		
            // InternalComponentDefinition.g:2366:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2367:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2367:4: ( ruleFQN )
            // InternalComponentDefinition.g:2368:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpcUaReadServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpcUaReadServerAccess().getOutPortOutputPortCrossReference_3_0());
            				
            pushFollow(FOLLOW_33);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:2382:3: (otherlv_4= 'portNumber' ( (lv_portNumber_5_0= ruleEInt ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==55) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalComponentDefinition.g:2383:4: otherlv_4= 'portNumber' ( (lv_portNumber_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpcUaReadServerAccess().getPortNumberKeyword_4_0());
                    			
                    // InternalComponentDefinition.g:2387:4: ( (lv_portNumber_5_0= ruleEInt ) )
                    // InternalComponentDefinition.g:2388:5: (lv_portNumber_5_0= ruleEInt )
                    {
                    // InternalComponentDefinition.g:2388:5: (lv_portNumber_5_0= ruleEInt )
                    // InternalComponentDefinition.g:2389:6: lv_portNumber_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getOpcUaReadServerAccess().getPortNumberEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_portNumber_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpcUaReadServerRule());
                    						}
                    						set(
                    							current,
                    							"portNumber",
                    							lv_portNumber_5_0,
                    							"org.xtext.service.roboticMiddleware.RoboticMiddleware.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentDefinition.g:2407:3: (otherlv_6= ';' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==12) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalComponentDefinition.g:2408:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getOpcUaReadServerAccess().getSemicolonKeyword_5());
                    			

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
    // $ANTLR end "ruleOpcUaReadServer"


    // $ANTLR start "entryRuleMixedPortROS"
    // InternalComponentDefinition.g:2417:1: entryRuleMixedPortROS returns [EObject current=null] : iv_ruleMixedPortROS= ruleMixedPortROS EOF ;
    public final EObject entryRuleMixedPortROS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixedPortROS = null;


        try {
            // InternalComponentDefinition.g:2417:53: (iv_ruleMixedPortROS= ruleMixedPortROS EOF )
            // InternalComponentDefinition.g:2418:2: iv_ruleMixedPortROS= ruleMixedPortROS EOF
            {
             newCompositeNode(grammarAccess.getMixedPortROSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMixedPortROS=ruleMixedPortROS();

            state._fsp--;

             current =iv_ruleMixedPortROS; 
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
    // $ANTLR end "entryRuleMixedPortROS"


    // $ANTLR start "ruleMixedPortROS"
    // InternalComponentDefinition.g:2424:1: ruleMixedPortROS returns [EObject current=null] : (otherlv_0= 'MixedPortROS' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleMixedPortROS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2430:2: ( (otherlv_0= 'MixedPortROS' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:2431:2: (otherlv_0= 'MixedPortROS' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:2431:2: (otherlv_0= 'MixedPortROS' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:2432:3: otherlv_0= 'MixedPortROS' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMixedPortROSAccess().getMixedPortROSKeyword_0());
            		
            // InternalComponentDefinition.g:2436:3: ( (otherlv_1= RULE_ID ) )
            // InternalComponentDefinition.g:2437:4: (otherlv_1= RULE_ID )
            {
            // InternalComponentDefinition.g:2437:4: (otherlv_1= RULE_ID )
            // InternalComponentDefinition.g:2438:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixedPortROSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getMixedPortROSAccess().getPortMixedPortROSBaseCrossReference_1_0());
            				

            }


            }

            // InternalComponentDefinition.g:2449:3: (otherlv_2= ';' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==12) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalComponentDefinition.g:2450:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getMixedPortROSAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleMixedPortROS"


    // $ANTLR start "entryRuleMixedPortYARP"
    // InternalComponentDefinition.g:2459:1: entryRuleMixedPortYARP returns [EObject current=null] : iv_ruleMixedPortYARP= ruleMixedPortYARP EOF ;
    public final EObject entryRuleMixedPortYARP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixedPortYARP = null;


        try {
            // InternalComponentDefinition.g:2459:54: (iv_ruleMixedPortYARP= ruleMixedPortYARP EOF )
            // InternalComponentDefinition.g:2460:2: iv_ruleMixedPortYARP= ruleMixedPortYARP EOF
            {
             newCompositeNode(grammarAccess.getMixedPortYARPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMixedPortYARP=ruleMixedPortYARP();

            state._fsp--;

             current =iv_ruleMixedPortYARP; 
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
    // $ANTLR end "entryRuleMixedPortYARP"


    // $ANTLR start "ruleMixedPortYARP"
    // InternalComponentDefinition.g:2466:1: ruleMixedPortYARP returns [EObject current=null] : (otherlv_0= 'MixedPortYARP' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleMixedPortYARP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2472:2: ( (otherlv_0= 'MixedPortYARP' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:2473:2: (otherlv_0= 'MixedPortYARP' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:2473:2: (otherlv_0= 'MixedPortYARP' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:2474:3: otherlv_0= 'MixedPortYARP' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMixedPortYARPAccess().getMixedPortYARPKeyword_0());
            		
            // InternalComponentDefinition.g:2478:3: ( (otherlv_1= RULE_ID ) )
            // InternalComponentDefinition.g:2479:4: (otherlv_1= RULE_ID )
            {
            // InternalComponentDefinition.g:2479:4: (otherlv_1= RULE_ID )
            // InternalComponentDefinition.g:2480:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixedPortYARPRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getMixedPortYARPAccess().getPortMixedPortYARPBaseCrossReference_1_0());
            				

            }


            }

            // InternalComponentDefinition.g:2491:3: (otherlv_2= ';' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==12) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalComponentDefinition.g:2492:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getMixedPortYARPAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleMixedPortYARP"


    // $ANTLR start "entryRuleCoordinationSlavePort"
    // InternalComponentDefinition.g:2501:1: entryRuleCoordinationSlavePort returns [EObject current=null] : iv_ruleCoordinationSlavePort= ruleCoordinationSlavePort EOF ;
    public final EObject entryRuleCoordinationSlavePort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationSlavePort = null;


        try {
            // InternalComponentDefinition.g:2501:62: (iv_ruleCoordinationSlavePort= ruleCoordinationSlavePort EOF )
            // InternalComponentDefinition.g:2502:2: iv_ruleCoordinationSlavePort= ruleCoordinationSlavePort EOF
            {
             newCompositeNode(grammarAccess.getCoordinationSlavePortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinationSlavePort=ruleCoordinationSlavePort();

            state._fsp--;

             current =iv_ruleCoordinationSlavePort; 
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
    // $ANTLR end "entryRuleCoordinationSlavePort"


    // $ANTLR start "ruleCoordinationSlavePort"
    // InternalComponentDefinition.g:2508:1: ruleCoordinationSlavePort returns [EObject current=null] : (otherlv_0= 'CoordinationSlavePort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractCoordinationElement ) )* otherlv_6= '}' ) ;
    public final EObject ruleCoordinationSlavePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2514:2: ( (otherlv_0= 'CoordinationSlavePort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractCoordinationElement ) )* otherlv_6= '}' ) )
            // InternalComponentDefinition.g:2515:2: (otherlv_0= 'CoordinationSlavePort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractCoordinationElement ) )* otherlv_6= '}' )
            {
            // InternalComponentDefinition.g:2515:2: (otherlv_0= 'CoordinationSlavePort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractCoordinationElement ) )* otherlv_6= '}' )
            // InternalComponentDefinition.g:2516:3: otherlv_0= 'CoordinationSlavePort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractCoordinationElement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinationSlavePortAccess().getCoordinationSlavePortKeyword_0());
            		
            // InternalComponentDefinition.g:2520:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:2521:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:2521:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:2522:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCoordinationSlavePortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationSlavePortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinationSlavePortAccess().getImplementsKeyword_2());
            		
            // InternalComponentDefinition.g:2542:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2543:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2543:4: ( ruleFQN )
            // InternalComponentDefinition.g:2544:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationSlavePortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinationSlavePortAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponentDefinition.g:2562:3: ( (lv_elements_5_0= ruleAbstractCoordinationElement ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==24||(LA45_0>=59 && LA45_0<=61)||LA45_0==66) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalComponentDefinition.g:2563:4: (lv_elements_5_0= ruleAbstractCoordinationElement )
            	    {
            	    // InternalComponentDefinition.g:2563:4: (lv_elements_5_0= ruleAbstractCoordinationElement )
            	    // InternalComponentDefinition.g:2564:5: lv_elements_5_0= ruleAbstractCoordinationElement
            	    {

            	    					newCompositeNode(grammarAccess.getCoordinationSlavePortAccess().getElementsAbstractCoordinationElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_elements_5_0=ruleAbstractCoordinationElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoordinationSlavePortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.AbstractCoordinationElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCoordinationSlavePortAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCoordinationSlavePort"


    // $ANTLR start "entryRuleAbstractCoordinationElement"
    // InternalComponentDefinition.g:2589:1: entryRuleAbstractCoordinationElement returns [EObject current=null] : iv_ruleAbstractCoordinationElement= ruleAbstractCoordinationElement EOF ;
    public final EObject entryRuleAbstractCoordinationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCoordinationElement = null;


        try {
            // InternalComponentDefinition.g:2589:68: (iv_ruleAbstractCoordinationElement= ruleAbstractCoordinationElement EOF )
            // InternalComponentDefinition.g:2590:2: iv_ruleAbstractCoordinationElement= ruleAbstractCoordinationElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractCoordinationElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractCoordinationElement=ruleAbstractCoordinationElement();

            state._fsp--;

             current =iv_ruleAbstractCoordinationElement; 
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
    // $ANTLR end "entryRuleAbstractCoordinationElement"


    // $ANTLR start "ruleAbstractCoordinationElement"
    // InternalComponentDefinition.g:2596:1: ruleAbstractCoordinationElement returns [EObject current=null] : (this_PublicOperationMode_0= rulePublicOperationMode | this_PrivateOperationMode_1= rulePrivateOperationMode | this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization | this_SkillRealizationsRef_3= ruleSkillRealizationsRef ) ;
    public final EObject ruleAbstractCoordinationElement() throws RecognitionException {
        EObject current = null;

        EObject this_PublicOperationMode_0 = null;

        EObject this_PrivateOperationMode_1 = null;

        EObject this_CommunicationServiceUsageRealization_2 = null;

        EObject this_SkillRealizationsRef_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2602:2: ( (this_PublicOperationMode_0= rulePublicOperationMode | this_PrivateOperationMode_1= rulePrivateOperationMode | this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization | this_SkillRealizationsRef_3= ruleSkillRealizationsRef ) )
            // InternalComponentDefinition.g:2603:2: (this_PublicOperationMode_0= rulePublicOperationMode | this_PrivateOperationMode_1= rulePrivateOperationMode | this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization | this_SkillRealizationsRef_3= ruleSkillRealizationsRef )
            {
            // InternalComponentDefinition.g:2603:2: (this_PublicOperationMode_0= rulePublicOperationMode | this_PrivateOperationMode_1= rulePrivateOperationMode | this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization | this_SkillRealizationsRef_3= ruleSkillRealizationsRef )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 24:
            case 61:
                {
                alt46=1;
                }
                break;
            case 66:
                {
                alt46=2;
                }
                break;
            case 60:
                {
                alt46=3;
                }
                break;
            case 59:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalComponentDefinition.g:2604:3: this_PublicOperationMode_0= rulePublicOperationMode
                    {

                    			newCompositeNode(grammarAccess.getAbstractCoordinationElementAccess().getPublicOperationModeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PublicOperationMode_0=rulePublicOperationMode();

                    state._fsp--;


                    			current = this_PublicOperationMode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:2613:3: this_PrivateOperationMode_1= rulePrivateOperationMode
                    {

                    			newCompositeNode(grammarAccess.getAbstractCoordinationElementAccess().getPrivateOperationModeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrivateOperationMode_1=rulePrivateOperationMode();

                    state._fsp--;


                    			current = this_PrivateOperationMode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:2622:3: this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization
                    {

                    			newCompositeNode(grammarAccess.getAbstractCoordinationElementAccess().getCommunicationServiceUsageRealizationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommunicationServiceUsageRealization_2=ruleCommunicationServiceUsageRealization();

                    state._fsp--;


                    			current = this_CommunicationServiceUsageRealization_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalComponentDefinition.g:2631:3: this_SkillRealizationsRef_3= ruleSkillRealizationsRef
                    {

                    			newCompositeNode(grammarAccess.getAbstractCoordinationElementAccess().getSkillRealizationsRefParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SkillRealizationsRef_3=ruleSkillRealizationsRef();

                    state._fsp--;


                    			current = this_SkillRealizationsRef_3;
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
    // $ANTLR end "ruleAbstractCoordinationElement"


    // $ANTLR start "entryRuleSkillRealizationsRef"
    // InternalComponentDefinition.g:2643:1: entryRuleSkillRealizationsRef returns [EObject current=null] : iv_ruleSkillRealizationsRef= ruleSkillRealizationsRef EOF ;
    public final EObject entryRuleSkillRealizationsRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillRealizationsRef = null;


        try {
            // InternalComponentDefinition.g:2643:61: (iv_ruleSkillRealizationsRef= ruleSkillRealizationsRef EOF )
            // InternalComponentDefinition.g:2644:2: iv_ruleSkillRealizationsRef= ruleSkillRealizationsRef EOF
            {
             newCompositeNode(grammarAccess.getSkillRealizationsRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkillRealizationsRef=ruleSkillRealizationsRef();

            state._fsp--;

             current =iv_ruleSkillRealizationsRef; 
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
    // $ANTLR end "entryRuleSkillRealizationsRef"


    // $ANTLR start "ruleSkillRealizationsRef"
    // InternalComponentDefinition.g:2650:1: ruleSkillRealizationsRef returns [EObject current=null] : (otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleSkillRealizationsRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2656:2: ( (otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:2657:2: (otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:2657:2: (otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:2658:3: otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationsRefKeyword_0());
            		
            // InternalComponentDefinition.g:2662:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2663:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2663:4: ( ruleFQN )
            // InternalComponentDefinition.g:2664:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillRealizationsRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefCoordinationModuleRealizationCrossReference_1_0());
            				
            pushFollow(FOLLOW_5);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:2678:3: (otherlv_2= ';' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==12) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalComponentDefinition.g:2679:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getSkillRealizationsRefAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleSkillRealizationsRef"


    // $ANTLR start "entryRuleCommunicationServiceUsageRealization"
    // InternalComponentDefinition.g:2688:1: entryRuleCommunicationServiceUsageRealization returns [EObject current=null] : iv_ruleCommunicationServiceUsageRealization= ruleCommunicationServiceUsageRealization EOF ;
    public final EObject entryRuleCommunicationServiceUsageRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationServiceUsageRealization = null;


        try {
            // InternalComponentDefinition.g:2688:77: (iv_ruleCommunicationServiceUsageRealization= ruleCommunicationServiceUsageRealization EOF )
            // InternalComponentDefinition.g:2689:2: iv_ruleCommunicationServiceUsageRealization= ruleCommunicationServiceUsageRealization EOF
            {
             newCompositeNode(grammarAccess.getCommunicationServiceUsageRealizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommunicationServiceUsageRealization=ruleCommunicationServiceUsageRealization();

            state._fsp--;

             current =iv_ruleCommunicationServiceUsageRealization; 
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
    // $ANTLR end "entryRuleCommunicationServiceUsageRealization"


    // $ANTLR start "ruleCommunicationServiceUsageRealization"
    // InternalComponentDefinition.g:2695:1: ruleCommunicationServiceUsageRealization returns [EObject current=null] : (otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) ) ) ;
    public final EObject ruleCommunicationServiceUsageRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2701:2: ( (otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) ) ) )
            // InternalComponentDefinition.g:2702:2: (otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) ) )
            {
            // InternalComponentDefinition.g:2702:2: (otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:2703:3: otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCommunicationServiceUsageRealizationAccess().getWithKeyword_0());
            		
            // InternalComponentDefinition.g:2707:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2708:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2708:4: ( ruleFQN )
            // InternalComponentDefinition.g:2709:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationServiceUsageRealizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageCommunicationServiceUsageCrossReference_1_0());
            				
            pushFollow(FOLLOW_12);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCommunicationServiceUsageRealizationAccess().getRealizedByKeyword_2());
            		
            // InternalComponentDefinition.g:2727:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2728:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2728:4: ( ruleFQN )
            // InternalComponentDefinition.g:2729:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationServiceUsageRealizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortComponentPortCrossReference_3_0());
            				
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
    // $ANTLR end "ruleCommunicationServiceUsageRealization"


    // $ANTLR start "entryRulePublicOperationMode"
    // InternalComponentDefinition.g:2747:1: entryRulePublicOperationMode returns [EObject current=null] : iv_rulePublicOperationMode= rulePublicOperationMode EOF ;
    public final EObject entryRulePublicOperationMode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublicOperationMode = null;


        try {
            // InternalComponentDefinition.g:2747:60: (iv_rulePublicOperationMode= rulePublicOperationMode EOF )
            // InternalComponentDefinition.g:2748:2: iv_rulePublicOperationMode= rulePublicOperationMode EOF
            {
             newCompositeNode(grammarAccess.getPublicOperationModeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePublicOperationMode=rulePublicOperationMode();

            state._fsp--;

             current =iv_rulePublicOperationMode; 
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
    // $ANTLR end "entryRulePublicOperationMode"


    // $ANTLR start "rulePublicOperationMode"
    // InternalComponentDefinition.g:2754:1: rulePublicOperationMode returns [EObject current=null] : ( () ( (lv_isDefaultInit_1_0= 'default' ) )? otherlv_2= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'activates' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) ;
    public final EObject rulePublicOperationMode() throws RecognitionException {
        EObject current = null;

        Token lv_isDefaultInit_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2760:2: ( ( () ( (lv_isDefaultInit_1_0= 'default' ) )? otherlv_2= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'activates' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) )
            // InternalComponentDefinition.g:2761:2: ( () ( (lv_isDefaultInit_1_0= 'default' ) )? otherlv_2= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'activates' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            {
            // InternalComponentDefinition.g:2761:2: ( () ( (lv_isDefaultInit_1_0= 'default' ) )? otherlv_2= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'activates' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            // InternalComponentDefinition.g:2762:3: () ( (lv_isDefaultInit_1_0= 'default' ) )? otherlv_2= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'activates' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}'
            {
            // InternalComponentDefinition.g:2762:3: ()
            // InternalComponentDefinition.g:2763:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPublicOperationModeAccess().getPublicOperationModeAction_0(),
            					current);
            			

            }

            // InternalComponentDefinition.g:2769:3: ( (lv_isDefaultInit_1_0= 'default' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==24) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalComponentDefinition.g:2770:4: (lv_isDefaultInit_1_0= 'default' )
                    {
                    // InternalComponentDefinition.g:2770:4: (lv_isDefaultInit_1_0= 'default' )
                    // InternalComponentDefinition.g:2771:5: lv_isDefaultInit_1_0= 'default'
                    {
                    lv_isDefaultInit_1_0=(Token)match(input,24,FOLLOW_35); 

                    					newLeafNode(lv_isDefaultInit_1_0, grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPublicOperationModeRule());
                    					}
                    					setWithLastConsumed(current, "isDefaultInit", true, "default");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,61,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPublicOperationModeAccess().getPublicOperationModeKeyword_2());
            		
            // InternalComponentDefinition.g:2787:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2788:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2788:4: ( ruleFQN )
            // InternalComponentDefinition.g:2789:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublicOperationModeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getPublicOperationModeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponentDefinition.g:2807:3: (otherlv_5= 'activates' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==62) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalComponentDefinition.g:2808:4: otherlv_5= 'activates' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_37); 

                    				newLeafNode(otherlv_5, grammarAccess.getPublicOperationModeAccess().getActivatesKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,63,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getPublicOperationModeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalComponentDefinition.g:2816:4: ( (otherlv_7= RULE_ID ) )
                    // InternalComponentDefinition.g:2817:5: (otherlv_7= RULE_ID )
                    {
                    // InternalComponentDefinition.g:2817:5: (otherlv_7= RULE_ID )
                    // InternalComponentDefinition.g:2818:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPublicOperationModeRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						newLeafNode(otherlv_7, grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_2_0());
                    					

                    }


                    }

                    // InternalComponentDefinition.g:2829:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==64) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalComponentDefinition.g:2830:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,64,FOLLOW_4); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getPublicOperationModeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalComponentDefinition.g:2834:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalComponentDefinition.g:2835:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalComponentDefinition.g:2835:6: (otherlv_9= RULE_ID )
                    	    // InternalComponentDefinition.g:2836:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPublicOperationModeRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_38); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,65,FOLLOW_39); 

                    				newLeafNode(otherlv_10, grammarAccess.getPublicOperationModeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPublicOperationModeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePublicOperationMode"


    // $ANTLR start "entryRulePrivateOperationMode"
    // InternalComponentDefinition.g:2861:1: entryRulePrivateOperationMode returns [EObject current=null] : iv_rulePrivateOperationMode= rulePrivateOperationMode EOF ;
    public final EObject entryRulePrivateOperationMode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateOperationMode = null;


        try {
            // InternalComponentDefinition.g:2861:61: (iv_rulePrivateOperationMode= rulePrivateOperationMode EOF )
            // InternalComponentDefinition.g:2862:2: iv_rulePrivateOperationMode= rulePrivateOperationMode EOF
            {
             newCompositeNode(grammarAccess.getPrivateOperationModeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrivateOperationMode=rulePrivateOperationMode();

            state._fsp--;

             current =iv_rulePrivateOperationMode; 
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
    // $ANTLR end "entryRulePrivateOperationMode"


    // $ANTLR start "rulePrivateOperationMode"
    // InternalComponentDefinition.g:2868:1: rulePrivateOperationMode returns [EObject current=null] : (otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final EObject rulePrivateOperationMode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2874:2: ( (otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:2875:2: (otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:2875:2: (otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:2876:3: otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,66,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPrivateOperationModeAccess().getPrivateOperationModeKeyword_0());
            		
            // InternalComponentDefinition.g:2880:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:2881:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:2881:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:2882:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPrivateOperationModeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrivateOperationModeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalComponentDefinition.g:2898:3: (otherlv_2= ';' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==12) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalComponentDefinition.g:2899:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrivateOperationModeAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "rulePrivateOperationMode"


    // $ANTLR start "entryRuleCoordinationMasterPort"
    // InternalComponentDefinition.g:2908:1: entryRuleCoordinationMasterPort returns [EObject current=null] : iv_ruleCoordinationMasterPort= ruleCoordinationMasterPort EOF ;
    public final EObject entryRuleCoordinationMasterPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationMasterPort = null;


        try {
            // InternalComponentDefinition.g:2908:63: (iv_ruleCoordinationMasterPort= ruleCoordinationMasterPort EOF )
            // InternalComponentDefinition.g:2909:2: iv_ruleCoordinationMasterPort= ruleCoordinationMasterPort EOF
            {
             newCompositeNode(grammarAccess.getCoordinationMasterPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinationMasterPort=ruleCoordinationMasterPort();

            state._fsp--;

             current =iv_ruleCoordinationMasterPort; 
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
    // $ANTLR end "entryRuleCoordinationMasterPort"


    // $ANTLR start "ruleCoordinationMasterPort"
    // InternalComponentDefinition.g:2915:1: ruleCoordinationMasterPort returns [EObject current=null] : (otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleCoordinationMasterPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2921:2: ( (otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) )
            // InternalComponentDefinition.g:2922:2: (otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            {
            // InternalComponentDefinition.g:2922:2: (otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            // InternalComponentDefinition.g:2923:3: otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,67,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinationMasterPortAccess().getCoordinationMasterPortKeyword_0());
            		
            // InternalComponentDefinition.g:2927:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:2928:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:2928:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:2929:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCoordinationMasterPortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationMasterPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinationMasterPortAccess().getImplementsKeyword_2());
            		
            // InternalComponentDefinition.g:2949:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2950:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2950:4: ( ruleFQN )
            // InternalComponentDefinition.g:2951:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationMasterPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoordinationMasterPortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0());
            				
            pushFollow(FOLLOW_5);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:2965:3: (otherlv_4= ';' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==12) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalComponentDefinition.g:2966:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getCoordinationMasterPortAccess().getSemicolonKeyword_4());
                    			

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
    // $ANTLR end "ruleCoordinationMasterPort"


    // $ANTLR start "entryRuleComponentParametersRef"
    // InternalComponentDefinition.g:2975:1: entryRuleComponentParametersRef returns [EObject current=null] : iv_ruleComponentParametersRef= ruleComponentParametersRef EOF ;
    public final EObject entryRuleComponentParametersRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentParametersRef = null;


        try {
            // InternalComponentDefinition.g:2975:63: (iv_ruleComponentParametersRef= ruleComponentParametersRef EOF )
            // InternalComponentDefinition.g:2976:2: iv_ruleComponentParametersRef= ruleComponentParametersRef EOF
            {
             newCompositeNode(grammarAccess.getComponentParametersRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentParametersRef=ruleComponentParametersRef();

            state._fsp--;

             current =iv_ruleComponentParametersRef; 
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
    // $ANTLR end "entryRuleComponentParametersRef"


    // $ANTLR start "ruleComponentParametersRef"
    // InternalComponentDefinition.g:2982:1: ruleComponentParametersRef returns [EObject current=null] : (otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )? ) ;
    public final EObject ruleComponentParametersRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2988:2: ( (otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )? ) )
            // InternalComponentDefinition.g:2989:2: (otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )? )
            {
            // InternalComponentDefinition.g:2989:2: (otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )? )
            // InternalComponentDefinition.g:2990:3: otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,68,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentParametersRefAccess().getComponentParametersKeyword_0());
            		
            // InternalComponentDefinition.g:2994:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2995:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2995:4: ( ruleFQN )
            // InternalComponentDefinition.g:2996:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentParametersRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentParametersRefAccess().getParameterComponentParameterCrossReference_1_0());
            				
            pushFollow(FOLLOW_40);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:3010:3: (otherlv_2= 'slave' ( ( ruleFQN ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==69) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalComponentDefinition.g:3011:4: otherlv_2= 'slave' ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentParametersRefAccess().getSlaveKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:3015:4: ( ( ruleFQN ) )
                    // InternalComponentDefinition.g:3016:5: ( ruleFQN )
                    {
                    // InternalComponentDefinition.g:3016:5: ( ruleFQN )
                    // InternalComponentDefinition.g:3017:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentParametersRefRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentParametersRefAccess().getSlaveCoordinationSlavePortCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentDefinition.g:3032:3: (otherlv_4= ';' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==12) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalComponentDefinition.g:3033:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentParametersRefAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleComponentParametersRef"


    // $ANTLR start "entryRuleRoboticMiddleware"
    // InternalComponentDefinition.g:3042:1: entryRuleRoboticMiddleware returns [EObject current=null] : iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF ;
    public final EObject entryRuleRoboticMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoboticMiddleware = null;


        try {
            // InternalComponentDefinition.g:3042:58: (iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF )
            // InternalComponentDefinition.g:3043:2: iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF
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
    // InternalComponentDefinition.g:3049:1: ruleRoboticMiddleware returns [EObject current=null] : (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft ) ;
    public final EObject ruleRoboticMiddleware() throws RecognitionException {
        EObject current = null;

        EObject this_ACE_SmartSoft_0 = null;

        EObject this_OpcUa_SeRoNet_1 = null;

        EObject this_CORBA_SmartSoft_2 = null;

        EObject this_DDS_SmartSoft_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3055:2: ( (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft ) )
            // InternalComponentDefinition.g:3056:2: (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft )
            {
            // InternalComponentDefinition.g:3056:2: (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt55=1;
                }
                break;
            case 79:
                {
                alt55=2;
                }
                break;
            case 80:
                {
                alt55=3;
                }
                break;
            case 81:
                {
                alt55=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalComponentDefinition.g:3057:3: this_ACE_SmartSoft_0= ruleACE_SmartSoft
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
                    // InternalComponentDefinition.g:3066:3: this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet
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
                    // InternalComponentDefinition.g:3075:3: this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft
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
                    // InternalComponentDefinition.g:3084:3: this_DDS_SmartSoft_3= ruleDDS_SmartSoft
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
    // InternalComponentDefinition.g:3096:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalComponentDefinition.g:3096:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalComponentDefinition.g:3097:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalComponentDefinition.g:3103:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3109:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalComponentDefinition.g:3110:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalComponentDefinition.g:3110:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalComponentDefinition.g:3111:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponentDefinition.g:3118:3: (kw= '.' this_ID_2= RULE_ID )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==70) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalComponentDefinition.g:3119:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,70,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_41); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop56;
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


    // $ANTLR start "entryRuleFQNW"
    // InternalComponentDefinition.g:3136:1: entryRuleFQNW returns [String current=null] : iv_ruleFQNW= ruleFQNW EOF ;
    public final String entryRuleFQNW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNW = null;


        try {
            // InternalComponentDefinition.g:3136:44: (iv_ruleFQNW= ruleFQNW EOF )
            // InternalComponentDefinition.g:3137:2: iv_ruleFQNW= ruleFQNW EOF
            {
             newCompositeNode(grammarAccess.getFQNWRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQNW=ruleFQNW();

            state._fsp--;

             current =iv_ruleFQNW.getText(); 
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
    // $ANTLR end "entryRuleFQNW"


    // $ANTLR start "ruleFQNW"
    // InternalComponentDefinition.g:3143:1: ruleFQNW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFQNW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3149:2: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // InternalComponentDefinition.g:3150:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // InternalComponentDefinition.g:3150:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // InternalComponentDefinition.g:3151:3: this_FQN_0= ruleFQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalComponentDefinition.g:3161:3: (kw= '.*' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==71) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalComponentDefinition.g:3162:4: kw= '.*'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleFQNW"


    // $ANTLR start "entryRuleEString"
    // InternalComponentDefinition.g:3172:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentDefinition.g:3172:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentDefinition.g:3173:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentDefinition.g:3179:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3185:2: (this_STRING_0= RULE_STRING )
            // InternalComponentDefinition.g:3186:2: this_STRING_0= RULE_STRING
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
    // InternalComponentDefinition.g:3196:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalComponentDefinition.g:3196:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalComponentDefinition.g:3197:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalComponentDefinition.g:3203:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3209:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalComponentDefinition.g:3210:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalComponentDefinition.g:3210:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalComponentDefinition.g:3211:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalComponentDefinition.g:3211:3: (kw= '-' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==72) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalComponentDefinition.g:3212:4: kw= '-'
                    {
                    kw=(Token)match(input,72,FOLLOW_43); 

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
    // InternalComponentDefinition.g:3229:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalComponentDefinition.g:3229:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalComponentDefinition.g:3230:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalComponentDefinition.g:3236:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3242:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalComponentDefinition.g:3243:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalComponentDefinition.g:3243:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalComponentDefinition.g:3244:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalComponentDefinition.g:3244:3: (kw= '-' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==72) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalComponentDefinition.g:3245:4: kw= '-'
                    {
                    kw=(Token)match(input,72,FOLLOW_44); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalComponentDefinition.g:3251:3: (this_INT_1= RULE_INT )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_INT) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalComponentDefinition.g:3252:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_45); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,70,FOLLOW_43); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_46); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalComponentDefinition.g:3272:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=73 && LA63_0<=74)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalComponentDefinition.g:3273:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalComponentDefinition.g:3273:4: (kw= 'E' | kw= 'e' )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==73) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==74) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalComponentDefinition.g:3274:5: kw= 'E'
                            {
                            kw=(Token)match(input,73,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalComponentDefinition.g:3280:5: kw= 'e'
                            {
                            kw=(Token)match(input,74,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalComponentDefinition.g:3286:4: (kw= '-' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==72) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalComponentDefinition.g:3287:5: kw= '-'
                            {
                            kw=(Token)match(input,72,FOLLOW_43); 

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


    // $ANTLR start "entryRuleEBoolean"
    // InternalComponentDefinition.g:3305:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalComponentDefinition.g:3305:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalComponentDefinition.g:3306:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalComponentDefinition.g:3312:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3318:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalComponentDefinition.g:3319:2: (kw= 'true' | kw= 'false' )
            {
            // InternalComponentDefinition.g:3319:2: (kw= 'true' | kw= 'false' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==75) ) {
                alt64=1;
            }
            else if ( (LA64_0==76) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalComponentDefinition.g:3320:3: kw= 'true'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:3326:3: kw= 'false'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

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


    // $ANTLR start "entryRuleACE_SmartSoft"
    // InternalComponentDefinition.g:3335:1: entryRuleACE_SmartSoft returns [EObject current=null] : iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF ;
    public final EObject entryRuleACE_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACE_SmartSoft = null;


        try {
            // InternalComponentDefinition.g:3335:54: (iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF )
            // InternalComponentDefinition.g:3336:2: iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF
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
    // InternalComponentDefinition.g:3342:1: ruleACE_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleACE_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3348:2: ( ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentDefinition.g:3349:2: ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentDefinition.g:3349:2: ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentDefinition.g:3350:3: () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentDefinition.g:3350:3: ()
            // InternalComponentDefinition.g:3351:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1());
            		
            // InternalComponentDefinition.g:3361:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==78) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalComponentDefinition.g:3362:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,78,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:3366:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentDefinition.g:3367:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentDefinition.g:3367:5: (lv_description_3_0= ruleEString )
                    // InternalComponentDefinition.g:3368:6: lv_description_3_0= ruleEString
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
    // InternalComponentDefinition.g:3390:1: entryRuleOpcUa_SeRoNet returns [EObject current=null] : iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF ;
    public final EObject entryRuleOpcUa_SeRoNet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUa_SeRoNet = null;


        try {
            // InternalComponentDefinition.g:3390:54: (iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF )
            // InternalComponentDefinition.g:3391:2: iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF
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
    // InternalComponentDefinition.g:3397:1: ruleOpcUa_SeRoNet returns [EObject current=null] : ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleOpcUa_SeRoNet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3403:2: ( ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentDefinition.g:3404:2: ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentDefinition.g:3404:2: ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentDefinition.g:3405:3: () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentDefinition.g:3405:3: ()
            // InternalComponentDefinition.g:3406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1());
            		
            // InternalComponentDefinition.g:3416:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==78) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalComponentDefinition.g:3417:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,78,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:3421:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentDefinition.g:3422:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentDefinition.g:3422:5: (lv_description_3_0= ruleEString )
                    // InternalComponentDefinition.g:3423:6: lv_description_3_0= ruleEString
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
    // InternalComponentDefinition.g:3445:1: entryRuleCORBA_SmartSoft returns [EObject current=null] : iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF ;
    public final EObject entryRuleCORBA_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCORBA_SmartSoft = null;


        try {
            // InternalComponentDefinition.g:3445:56: (iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF )
            // InternalComponentDefinition.g:3446:2: iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF
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
    // InternalComponentDefinition.g:3452:1: ruleCORBA_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleCORBA_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3458:2: ( ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentDefinition.g:3459:2: ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentDefinition.g:3459:2: ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentDefinition.g:3460:3: () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentDefinition.g:3460:3: ()
            // InternalComponentDefinition.g:3461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1());
            		
            // InternalComponentDefinition.g:3471:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==78) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalComponentDefinition.g:3472:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,78,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:3476:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentDefinition.g:3477:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentDefinition.g:3477:5: (lv_description_3_0= ruleEString )
                    // InternalComponentDefinition.g:3478:6: lv_description_3_0= ruleEString
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
    // InternalComponentDefinition.g:3500:1: entryRuleDDS_SmartSoft returns [EObject current=null] : iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF ;
    public final EObject entryRuleDDS_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDS_SmartSoft = null;


        try {
            // InternalComponentDefinition.g:3500:54: (iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF )
            // InternalComponentDefinition.g:3501:2: iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF
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
    // InternalComponentDefinition.g:3507:1: ruleDDS_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleDDS_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3513:2: ( ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentDefinition.g:3514:2: ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentDefinition.g:3514:2: ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentDefinition.g:3515:3: () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentDefinition.g:3515:3: ()
            // InternalComponentDefinition.g:3516:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1());
            		
            // InternalComponentDefinition.g:3526:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==78) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalComponentDefinition.g:3527:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,78,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:3531:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentDefinition.g:3532:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentDefinition.g:3532:5: (lv_description_3_0= ruleEString )
                    // InternalComponentDefinition.g:3533:6: lv_description_3_0= ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x07240000266B0000L,0x0000000000000018L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L,0x000000000003A000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00003047C0010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000304000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000007C0010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003800010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000A0000011000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000A0000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000140L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0003400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0018000000001002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000001002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x3800000001010000L,0x0000000000000004L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x4000000000010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000001002L,0x0000000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});

}
