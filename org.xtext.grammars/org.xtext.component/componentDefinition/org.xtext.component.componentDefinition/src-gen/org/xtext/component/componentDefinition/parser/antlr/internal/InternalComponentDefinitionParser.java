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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#import'", "';'", "'ComponentDefinition'", "'logo'", "'{'", "'}'", "'RequestPort'", "'implements'", "'OutputPort'", "'realizedBy'", "'AnswerPort'", "'InputPort'", "'SupportedMiddleware'", "'default'", "'Activity'", "'InputHandler'", "'triggeredFrom'", "'activeQueue'", "'RequestHandler'", "'RequestPortLink'", "'OpcUaClientLink'", "'Observe'", "'InputPortLink'", "'optional'", "'oversamplingOk'", "'undersamplingOk'", "'ActivationConstraints'", "'configurable'", "'='", "'minActFreq'", "'Hz'", "'maxActFreq'", "'OperationModeBinding'", "'DefaultTrigger'", "'InputPortTrigger'", "'prescale'", "'PeriodicTimer'", "'ObservedElement'", "'OpcUaDeviceClient'", "'deviceURI'", "'opcuaXmlFile'", "'OpcUaStatusServer'", "'dataProviderPort'", "'CoordinationSlavePort'", "'SkillRealizationsRef'", "'with'", "'PublicOperationMode'", "'activates'", "'('", "','", "')'", "'PrivateOperationMode'", "'CoordinationMasterPort'", "'ComponentParameters'", "'slave'", "'.'", "'.*'", "'-'", "'E'", "'e'", "'true'", "'false'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'"
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
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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

                if ( (LA5_0==17||LA5_0==19||(LA5_0>=21 && LA5_0<=22)||(LA5_0>=25 && LA5_0<=26)||LA5_0==29||LA5_0==49||LA5_0==52||LA5_0==54||(LA5_0>=63 && LA5_0<=64)) ) {
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
    // InternalComponentDefinition.g:316:1: ruleAbstractComponentElement returns [EObject current=null] : (this_NamedComponentElement_0= ruleNamedComponentElement | this_DerivedComponentElement_1= ruleDerivedComponentElement ) ;
    public final EObject ruleAbstractComponentElement() throws RecognitionException {
        EObject current = null;

        EObject this_NamedComponentElement_0 = null;

        EObject this_DerivedComponentElement_1 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:322:2: ( (this_NamedComponentElement_0= ruleNamedComponentElement | this_DerivedComponentElement_1= ruleDerivedComponentElement ) )
            // InternalComponentDefinition.g:323:2: (this_NamedComponentElement_0= ruleNamedComponentElement | this_DerivedComponentElement_1= ruleDerivedComponentElement )
            {
            // InternalComponentDefinition.g:323:2: (this_NamedComponentElement_0= ruleNamedComponentElement | this_DerivedComponentElement_1= ruleDerivedComponentElement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17||LA6_0==19||(LA6_0>=21 && LA6_0<=22)||(LA6_0>=25 && LA6_0<=26)||LA6_0==29||LA6_0==49||LA6_0==52||LA6_0==54||LA6_0==63) ) {
                alt6=1;
            }
            else if ( (LA6_0==64) ) {
                alt6=2;
            }
            else {
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
    // InternalComponentDefinition.g:345:1: entryRuleDerivedComponentElement returns [EObject current=null] : iv_ruleDerivedComponentElement= ruleDerivedComponentElement EOF ;
    public final EObject entryRuleDerivedComponentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedComponentElement = null;


        try {
            // InternalComponentDefinition.g:345:64: (iv_ruleDerivedComponentElement= ruleDerivedComponentElement EOF )
            // InternalComponentDefinition.g:346:2: iv_ruleDerivedComponentElement= ruleDerivedComponentElement EOF
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
    // InternalComponentDefinition.g:352:1: ruleDerivedComponentElement returns [EObject current=null] : this_ComponentParametersRef_0= ruleComponentParametersRef ;
    public final EObject ruleDerivedComponentElement() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentParametersRef_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:358:2: (this_ComponentParametersRef_0= ruleComponentParametersRef )
            // InternalComponentDefinition.g:359:2: this_ComponentParametersRef_0= ruleComponentParametersRef
            {

            		newCompositeNode(grammarAccess.getDerivedComponentElementAccess().getComponentParametersRefParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ComponentParametersRef_0=ruleComponentParametersRef();

            state._fsp--;


            		current = this_ComponentParametersRef_0;
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
    // $ANTLR end "ruleDerivedComponentElement"


    // $ANTLR start "entryRuleNamedComponentElement"
    // InternalComponentDefinition.g:370:1: entryRuleNamedComponentElement returns [EObject current=null] : iv_ruleNamedComponentElement= ruleNamedComponentElement EOF ;
    public final EObject entryRuleNamedComponentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedComponentElement = null;


        try {
            // InternalComponentDefinition.g:370:62: (iv_ruleNamedComponentElement= ruleNamedComponentElement EOF )
            // InternalComponentDefinition.g:371:2: iv_ruleNamedComponentElement= ruleNamedComponentElement EOF
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
    // InternalComponentDefinition.g:377:1: ruleNamedComponentElement returns [EObject current=null] : (this_ComponentSubNode_0= ruleComponentSubNode | this_ComponentPort_1= ruleComponentPort | this_CoordinationSlavePort_2= ruleCoordinationSlavePort | this_CoordinationMasterPort_3= ruleCoordinationMasterPort | this_PlainOpcUaPort_4= rulePlainOpcUaPort ) ;
    public final EObject ruleNamedComponentElement() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentSubNode_0 = null;

        EObject this_ComponentPort_1 = null;

        EObject this_CoordinationSlavePort_2 = null;

        EObject this_CoordinationMasterPort_3 = null;

        EObject this_PlainOpcUaPort_4 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:383:2: ( (this_ComponentSubNode_0= ruleComponentSubNode | this_ComponentPort_1= ruleComponentPort | this_CoordinationSlavePort_2= ruleCoordinationSlavePort | this_CoordinationMasterPort_3= ruleCoordinationMasterPort | this_PlainOpcUaPort_4= rulePlainOpcUaPort ) )
            // InternalComponentDefinition.g:384:2: (this_ComponentSubNode_0= ruleComponentSubNode | this_ComponentPort_1= ruleComponentPort | this_CoordinationSlavePort_2= ruleCoordinationSlavePort | this_CoordinationMasterPort_3= ruleCoordinationMasterPort | this_PlainOpcUaPort_4= rulePlainOpcUaPort )
            {
            // InternalComponentDefinition.g:384:2: (this_ComponentSubNode_0= ruleComponentSubNode | this_ComponentPort_1= ruleComponentPort | this_CoordinationSlavePort_2= ruleCoordinationSlavePort | this_CoordinationMasterPort_3= ruleCoordinationMasterPort | this_PlainOpcUaPort_4= rulePlainOpcUaPort )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 25:
            case 26:
            case 29:
                {
                alt7=1;
                }
                break;
            case 17:
            case 19:
            case 21:
            case 22:
                {
                alt7=2;
                }
                break;
            case 54:
                {
                alt7=3;
                }
                break;
            case 63:
                {
                alt7=4;
                }
                break;
            case 49:
            case 52:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalComponentDefinition.g:385:3: this_ComponentSubNode_0= ruleComponentSubNode
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
                    // InternalComponentDefinition.g:394:3: this_ComponentPort_1= ruleComponentPort
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
                    // InternalComponentDefinition.g:403:3: this_CoordinationSlavePort_2= ruleCoordinationSlavePort
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
                    // InternalComponentDefinition.g:412:3: this_CoordinationMasterPort_3= ruleCoordinationMasterPort
                    {

                    			newCompositeNode(grammarAccess.getNamedComponentElementAccess().getCoordinationMasterPortParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoordinationMasterPort_3=ruleCoordinationMasterPort();

                    state._fsp--;


                    			current = this_CoordinationMasterPort_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalComponentDefinition.g:421:3: this_PlainOpcUaPort_4= rulePlainOpcUaPort
                    {

                    			newCompositeNode(grammarAccess.getNamedComponentElementAccess().getPlainOpcUaPortParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlainOpcUaPort_4=rulePlainOpcUaPort();

                    state._fsp--;


                    			current = this_PlainOpcUaPort_4;
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
    // InternalComponentDefinition.g:433:1: entryRuleComponentSubNode returns [EObject current=null] : iv_ruleComponentSubNode= ruleComponentSubNode EOF ;
    public final EObject entryRuleComponentSubNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentSubNode = null;


        try {
            // InternalComponentDefinition.g:433:57: (iv_ruleComponentSubNode= ruleComponentSubNode EOF )
            // InternalComponentDefinition.g:434:2: iv_ruleComponentSubNode= ruleComponentSubNode EOF
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
    // InternalComponentDefinition.g:440:1: ruleComponentSubNode returns [EObject current=null] : (this_Activity_0= ruleActivity | this_InputHandler_1= ruleInputHandler | this_RequestHandler_2= ruleRequestHandler ) ;
    public final EObject ruleComponentSubNode() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_InputHandler_1 = null;

        EObject this_RequestHandler_2 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:446:2: ( (this_Activity_0= ruleActivity | this_InputHandler_1= ruleInputHandler | this_RequestHandler_2= ruleRequestHandler ) )
            // InternalComponentDefinition.g:447:2: (this_Activity_0= ruleActivity | this_InputHandler_1= ruleInputHandler | this_RequestHandler_2= ruleRequestHandler )
            {
            // InternalComponentDefinition.g:447:2: (this_Activity_0= ruleActivity | this_InputHandler_1= ruleInputHandler | this_RequestHandler_2= ruleRequestHandler )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt8=1;
                }
                break;
            case 26:
                {
                alt8=2;
                }
                break;
            case 29:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalComponentDefinition.g:448:3: this_Activity_0= ruleActivity
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
                    // InternalComponentDefinition.g:457:3: this_InputHandler_1= ruleInputHandler
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
                    // InternalComponentDefinition.g:466:3: this_RequestHandler_2= ruleRequestHandler
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
    // InternalComponentDefinition.g:478:1: entryRuleComponentPort returns [EObject current=null] : iv_ruleComponentPort= ruleComponentPort EOF ;
    public final EObject entryRuleComponentPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentPort = null;


        try {
            // InternalComponentDefinition.g:478:54: (iv_ruleComponentPort= ruleComponentPort EOF )
            // InternalComponentDefinition.g:479:2: iv_ruleComponentPort= ruleComponentPort EOF
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
    // InternalComponentDefinition.g:485:1: ruleComponentPort returns [EObject current=null] : (this_InputPort_0= ruleInputPort | this_AnswerPort_1= ruleAnswerPort | this_OutputPort_2= ruleOutputPort | this_RequestPort_3= ruleRequestPort ) ;
    public final EObject ruleComponentPort() throws RecognitionException {
        EObject current = null;

        EObject this_InputPort_0 = null;

        EObject this_AnswerPort_1 = null;

        EObject this_OutputPort_2 = null;

        EObject this_RequestPort_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:491:2: ( (this_InputPort_0= ruleInputPort | this_AnswerPort_1= ruleAnswerPort | this_OutputPort_2= ruleOutputPort | this_RequestPort_3= ruleRequestPort ) )
            // InternalComponentDefinition.g:492:2: (this_InputPort_0= ruleInputPort | this_AnswerPort_1= ruleAnswerPort | this_OutputPort_2= ruleOutputPort | this_RequestPort_3= ruleRequestPort )
            {
            // InternalComponentDefinition.g:492:2: (this_InputPort_0= ruleInputPort | this_AnswerPort_1= ruleAnswerPort | this_OutputPort_2= ruleOutputPort | this_RequestPort_3= ruleRequestPort )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 19:
                {
                alt9=3;
                }
                break;
            case 17:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalComponentDefinition.g:493:3: this_InputPort_0= ruleInputPort
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
                    // InternalComponentDefinition.g:502:3: this_AnswerPort_1= ruleAnswerPort
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
                    // InternalComponentDefinition.g:511:3: this_OutputPort_2= ruleOutputPort
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
                    // InternalComponentDefinition.g:520:3: this_RequestPort_3= ruleRequestPort
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
    // InternalComponentDefinition.g:532:1: entryRuleRequestPort returns [EObject current=null] : iv_ruleRequestPort= ruleRequestPort EOF ;
    public final EObject entryRuleRequestPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestPort = null;


        try {
            // InternalComponentDefinition.g:532:52: (iv_ruleRequestPort= ruleRequestPort EOF )
            // InternalComponentDefinition.g:533:2: iv_ruleRequestPort= ruleRequestPort EOF
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
    // InternalComponentDefinition.g:539:1: ruleRequestPort returns [EObject current=null] : (otherlv_0= 'RequestPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' ) ;
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
            // InternalComponentDefinition.g:545:2: ( (otherlv_0= 'RequestPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' ) )
            // InternalComponentDefinition.g:546:2: (otherlv_0= 'RequestPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' )
            {
            // InternalComponentDefinition.g:546:2: (otherlv_0= 'RequestPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' )
            // InternalComponentDefinition.g:547:3: otherlv_0= 'RequestPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestPortAccess().getRequestPortKeyword_0());
            		
            // InternalComponentDefinition.g:551:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:552:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:552:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:553:5: lv_name_1_0= RULE_ID
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
            		
            // InternalComponentDefinition.g:573:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:574:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:574:4: ( ruleFQN )
            // InternalComponentDefinition.g:575:5: ruleFQN
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
            		
            // InternalComponentDefinition.g:593:3: ( (lv_extensions_5_0= ruleComponentPortExtension ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalComponentDefinition.g:594:4: (lv_extensions_5_0= ruleComponentPortExtension )
            	    {
            	    // InternalComponentDefinition.g:594:4: (lv_extensions_5_0= ruleComponentPortExtension )
            	    // InternalComponentDefinition.g:595:5: lv_extensions_5_0= ruleComponentPortExtension
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
            	    break loop10;
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
    // InternalComponentDefinition.g:620:1: entryRuleOutputPort returns [EObject current=null] : iv_ruleOutputPort= ruleOutputPort EOF ;
    public final EObject entryRuleOutputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPort = null;


        try {
            // InternalComponentDefinition.g:620:51: (iv_ruleOutputPort= ruleOutputPort EOF )
            // InternalComponentDefinition.g:621:2: iv_ruleOutputPort= ruleOutputPort EOF
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
    // InternalComponentDefinition.g:627:1: ruleOutputPort returns [EObject current=null] : (otherlv_0= 'OutputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= 'realizedBy' ( ( ruleFQN ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleComponentPortExtension ) )* otherlv_8= '}' ) ;
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
            // InternalComponentDefinition.g:633:2: ( (otherlv_0= 'OutputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= 'realizedBy' ( ( ruleFQN ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleComponentPortExtension ) )* otherlv_8= '}' ) )
            // InternalComponentDefinition.g:634:2: (otherlv_0= 'OutputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= 'realizedBy' ( ( ruleFQN ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleComponentPortExtension ) )* otherlv_8= '}' )
            {
            // InternalComponentDefinition.g:634:2: (otherlv_0= 'OutputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= 'realizedBy' ( ( ruleFQN ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleComponentPortExtension ) )* otherlv_8= '}' )
            // InternalComponentDefinition.g:635:3: otherlv_0= 'OutputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= 'realizedBy' ( ( ruleFQN ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleComponentPortExtension ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputPortAccess().getOutputPortKeyword_0());
            		
            // InternalComponentDefinition.g:639:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:640:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:640:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:641:5: lv_name_1_0= RULE_ID
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
            		
            // InternalComponentDefinition.g:661:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:662:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:662:4: ( ruleFQN )
            // InternalComponentDefinition.g:663:5: ruleFQN
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
            		
            // InternalComponentDefinition.g:681:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:682:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:682:4: ( ruleFQN )
            // InternalComponentDefinition.g:683:5: ruleFQN
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
            		
            // InternalComponentDefinition.g:701:3: ( (lv_extensions_7_0= ruleComponentPortExtension ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComponentDefinition.g:702:4: (lv_extensions_7_0= ruleComponentPortExtension )
            	    {
            	    // InternalComponentDefinition.g:702:4: (lv_extensions_7_0= ruleComponentPortExtension )
            	    // InternalComponentDefinition.g:703:5: lv_extensions_7_0= ruleComponentPortExtension
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
            	    break loop11;
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
    // InternalComponentDefinition.g:728:1: entryRuleAnswerPort returns [EObject current=null] : iv_ruleAnswerPort= ruleAnswerPort EOF ;
    public final EObject entryRuleAnswerPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerPort = null;


        try {
            // InternalComponentDefinition.g:728:51: (iv_ruleAnswerPort= ruleAnswerPort EOF )
            // InternalComponentDefinition.g:729:2: iv_ruleAnswerPort= ruleAnswerPort EOF
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
    // InternalComponentDefinition.g:735:1: ruleAnswerPort returns [EObject current=null] : (otherlv_0= 'AnswerPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' ) ;
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
            // InternalComponentDefinition.g:741:2: ( (otherlv_0= 'AnswerPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' ) )
            // InternalComponentDefinition.g:742:2: (otherlv_0= 'AnswerPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' )
            {
            // InternalComponentDefinition.g:742:2: (otherlv_0= 'AnswerPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' )
            // InternalComponentDefinition.g:743:3: otherlv_0= 'AnswerPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAnswerPortAccess().getAnswerPortKeyword_0());
            		
            // InternalComponentDefinition.g:747:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:748:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:748:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:749:5: lv_name_1_0= RULE_ID
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
            		
            // InternalComponentDefinition.g:769:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:770:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:770:4: ( ruleFQN )
            // InternalComponentDefinition.g:771:5: ruleFQN
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
            		
            // InternalComponentDefinition.g:789:3: ( (lv_extensions_5_0= ruleComponentPortExtension ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComponentDefinition.g:790:4: (lv_extensions_5_0= ruleComponentPortExtension )
            	    {
            	    // InternalComponentDefinition.g:790:4: (lv_extensions_5_0= ruleComponentPortExtension )
            	    // InternalComponentDefinition.g:791:5: lv_extensions_5_0= ruleComponentPortExtension
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
            	    break loop12;
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
    // InternalComponentDefinition.g:816:1: entryRuleInputPort returns [EObject current=null] : iv_ruleInputPort= ruleInputPort EOF ;
    public final EObject entryRuleInputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPort = null;


        try {
            // InternalComponentDefinition.g:816:50: (iv_ruleInputPort= ruleInputPort EOF )
            // InternalComponentDefinition.g:817:2: iv_ruleInputPort= ruleInputPort EOF
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
    // InternalComponentDefinition.g:823:1: ruleInputPort returns [EObject current=null] : (otherlv_0= 'InputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' ) ;
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
            // InternalComponentDefinition.g:829:2: ( (otherlv_0= 'InputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' ) )
            // InternalComponentDefinition.g:830:2: (otherlv_0= 'InputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' )
            {
            // InternalComponentDefinition.g:830:2: (otherlv_0= 'InputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}' )
            // InternalComponentDefinition.g:831:3: otherlv_0= 'InputPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_extensions_5_0= ruleComponentPortExtension ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInputPortAccess().getInputPortKeyword_0());
            		
            // InternalComponentDefinition.g:835:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:836:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:836:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:837:5: lv_name_1_0= RULE_ID
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
            		
            // InternalComponentDefinition.g:857:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:858:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:858:4: ( ruleFQN )
            // InternalComponentDefinition.g:859:5: ruleFQN
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
            		
            // InternalComponentDefinition.g:877:3: ( (lv_extensions_5_0= ruleComponentPortExtension ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalComponentDefinition.g:878:4: (lv_extensions_5_0= ruleComponentPortExtension )
            	    {
            	    // InternalComponentDefinition.g:878:4: (lv_extensions_5_0= ruleComponentPortExtension )
            	    // InternalComponentDefinition.g:879:5: lv_extensions_5_0= ruleComponentPortExtension
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
            	    break loop13;
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
    // InternalComponentDefinition.g:904:1: entryRuleComponentPortExtension returns [EObject current=null] : iv_ruleComponentPortExtension= ruleComponentPortExtension EOF ;
    public final EObject entryRuleComponentPortExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentPortExtension = null;


        try {
            // InternalComponentDefinition.g:904:63: (iv_ruleComponentPortExtension= ruleComponentPortExtension EOF )
            // InternalComponentDefinition.g:905:2: iv_ruleComponentPortExtension= ruleComponentPortExtension EOF
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
    // InternalComponentDefinition.g:911:1: ruleComponentPortExtension returns [EObject current=null] : this_SupportedMiddleware_0= ruleSupportedMiddleware ;
    public final EObject ruleComponentPortExtension() throws RecognitionException {
        EObject current = null;

        EObject this_SupportedMiddleware_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:917:2: (this_SupportedMiddleware_0= ruleSupportedMiddleware )
            // InternalComponentDefinition.g:918:2: this_SupportedMiddleware_0= ruleSupportedMiddleware
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
    // InternalComponentDefinition.g:929:1: entryRuleSupportedMiddleware returns [EObject current=null] : iv_ruleSupportedMiddleware= ruleSupportedMiddleware EOF ;
    public final EObject entryRuleSupportedMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportedMiddleware = null;


        try {
            // InternalComponentDefinition.g:929:60: (iv_ruleSupportedMiddleware= ruleSupportedMiddleware EOF )
            // InternalComponentDefinition.g:930:2: iv_ruleSupportedMiddleware= ruleSupportedMiddleware EOF
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
    // InternalComponentDefinition.g:936:1: ruleSupportedMiddleware returns [EObject current=null] : (otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleSupportedMiddleware() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_default_1_0=null;
        Token otherlv_3=null;
        EObject lv_middleware_2_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:942:2: ( (otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )? ) )
            // InternalComponentDefinition.g:943:2: (otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )? )
            {
            // InternalComponentDefinition.g:943:2: (otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )? )
            // InternalComponentDefinition.g:944:3: otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSupportedMiddlewareAccess().getSupportedMiddlewareKeyword_0());
            		
            // InternalComponentDefinition.g:948:3: ( (lv_default_1_0= 'default' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentDefinition.g:949:4: (lv_default_1_0= 'default' )
                    {
                    // InternalComponentDefinition.g:949:4: (lv_default_1_0= 'default' )
                    // InternalComponentDefinition.g:950:5: lv_default_1_0= 'default'
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

            // InternalComponentDefinition.g:962:3: ( (lv_middleware_2_0= ruleRoboticMiddleware ) )
            // InternalComponentDefinition.g:963:4: (lv_middleware_2_0= ruleRoboticMiddleware )
            {
            // InternalComponentDefinition.g:963:4: (lv_middleware_2_0= ruleRoboticMiddleware )
            // InternalComponentDefinition.g:964:5: lv_middleware_2_0= ruleRoboticMiddleware
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

            // InternalComponentDefinition.g:981:3: (otherlv_3= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentDefinition.g:982:4: otherlv_3= ';'
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
    // InternalComponentDefinition.g:991:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalComponentDefinition.g:991:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalComponentDefinition.g:992:2: iv_ruleActivity= ruleActivity EOF
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
    // InternalComponentDefinition.g:998:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' ) ;
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
            // InternalComponentDefinition.g:1004:2: ( (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' ) )
            // InternalComponentDefinition.g:1005:2: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' )
            {
            // InternalComponentDefinition.g:1005:2: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' )
            // InternalComponentDefinition.g:1006:3: otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
            		
            // InternalComponentDefinition.g:1010:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:1011:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:1011:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:1012:5: lv_name_1_0= RULE_ID
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
            		
            // InternalComponentDefinition.g:1032:3: ( (lv_links_3_0= ruleAbstractComponentLink ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=30 && LA16_0<=33)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalComponentDefinition.g:1033:4: (lv_links_3_0= ruleAbstractComponentLink )
            	    {
            	    // InternalComponentDefinition.g:1033:4: (lv_links_3_0= ruleAbstractComponentLink )
            	    // InternalComponentDefinition.g:1034:5: lv_links_3_0= ruleAbstractComponentLink
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
            	    break loop16;
                }
            } while (true);

            // InternalComponentDefinition.g:1051:3: ( (lv_extensions_4_0= ruleActivityExtension ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37||(LA17_0>=43 && LA17_0<=44)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalComponentDefinition.g:1052:4: (lv_extensions_4_0= ruleActivityExtension )
            	    {
            	    // InternalComponentDefinition.g:1052:4: (lv_extensions_4_0= ruleActivityExtension )
            	    // InternalComponentDefinition.g:1053:5: lv_extensions_4_0= ruleActivityExtension
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
            	    break loop17;
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
    // InternalComponentDefinition.g:1078:1: entryRuleInputHandler returns [EObject current=null] : iv_ruleInputHandler= ruleInputHandler EOF ;
    public final EObject entryRuleInputHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputHandler = null;


        try {
            // InternalComponentDefinition.g:1078:53: (iv_ruleInputHandler= ruleInputHandler EOF )
            // InternalComponentDefinition.g:1079:2: iv_ruleInputHandler= ruleInputHandler EOF
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
    // InternalComponentDefinition.g:1085:1: ruleInputHandler returns [EObject current=null] : (otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' ) ;
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
            // InternalComponentDefinition.g:1091:2: ( (otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' ) )
            // InternalComponentDefinition.g:1092:2: (otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' )
            {
            // InternalComponentDefinition.g:1092:2: (otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' )
            // InternalComponentDefinition.g:1093:3: otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInputHandlerAccess().getInputHandlerKeyword_0());
            		
            // InternalComponentDefinition.g:1097:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:1098:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:1098:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:1099:5: lv_name_1_0= RULE_ID
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
            		
            // InternalComponentDefinition.g:1119:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1120:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1120:4: ( ruleFQN )
            // InternalComponentDefinition.g:1121:5: ruleFQN
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

            // InternalComponentDefinition.g:1135:3: ( (lv_activeQueue_4_0= 'activeQueue' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentDefinition.g:1136:4: (lv_activeQueue_4_0= 'activeQueue' )
                    {
                    // InternalComponentDefinition.g:1136:4: (lv_activeQueue_4_0= 'activeQueue' )
                    // InternalComponentDefinition.g:1137:5: lv_activeQueue_4_0= 'activeQueue'
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
            		
            // InternalComponentDefinition.g:1153:3: ( (lv_links_6_0= ruleAbstractComponentLink ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=30 && LA19_0<=33)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalComponentDefinition.g:1154:4: (lv_links_6_0= ruleAbstractComponentLink )
            	    {
            	    // InternalComponentDefinition.g:1154:4: (lv_links_6_0= ruleAbstractComponentLink )
            	    // InternalComponentDefinition.g:1155:5: lv_links_6_0= ruleAbstractComponentLink
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
            	    break loop19;
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
    // InternalComponentDefinition.g:1180:1: entryRuleRequestHandler returns [EObject current=null] : iv_ruleRequestHandler= ruleRequestHandler EOF ;
    public final EObject entryRuleRequestHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestHandler = null;


        try {
            // InternalComponentDefinition.g:1180:55: (iv_ruleRequestHandler= ruleRequestHandler EOF )
            // InternalComponentDefinition.g:1181:2: iv_ruleRequestHandler= ruleRequestHandler EOF
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
    // InternalComponentDefinition.g:1187:1: ruleRequestHandler returns [EObject current=null] : (otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' ) ;
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
            // InternalComponentDefinition.g:1193:2: ( (otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' ) )
            // InternalComponentDefinition.g:1194:2: (otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' )
            {
            // InternalComponentDefinition.g:1194:2: (otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' )
            // InternalComponentDefinition.g:1195:3: otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestHandlerAccess().getRequestHandlerKeyword_0());
            		
            // InternalComponentDefinition.g:1199:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:1200:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:1200:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:1201:5: lv_name_1_0= RULE_ID
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
            		
            // InternalComponentDefinition.g:1221:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1222:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1222:4: ( ruleFQN )
            // InternalComponentDefinition.g:1223:5: ruleFQN
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

            // InternalComponentDefinition.g:1237:3: ( (lv_activeQueue_4_0= 'activeQueue' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentDefinition.g:1238:4: (lv_activeQueue_4_0= 'activeQueue' )
                    {
                    // InternalComponentDefinition.g:1238:4: (lv_activeQueue_4_0= 'activeQueue' )
                    // InternalComponentDefinition.g:1239:5: lv_activeQueue_4_0= 'activeQueue'
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
            		
            // InternalComponentDefinition.g:1255:3: ( (lv_links_6_0= ruleAbstractComponentLink ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=30 && LA21_0<=33)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalComponentDefinition.g:1256:4: (lv_links_6_0= ruleAbstractComponentLink )
            	    {
            	    // InternalComponentDefinition.g:1256:4: (lv_links_6_0= ruleAbstractComponentLink )
            	    // InternalComponentDefinition.g:1257:5: lv_links_6_0= ruleAbstractComponentLink
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
            	    break loop21;
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
    // InternalComponentDefinition.g:1282:1: entryRuleAbstractComponentLink returns [EObject current=null] : iv_ruleAbstractComponentLink= ruleAbstractComponentLink EOF ;
    public final EObject entryRuleAbstractComponentLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponentLink = null;


        try {
            // InternalComponentDefinition.g:1282:62: (iv_ruleAbstractComponentLink= ruleAbstractComponentLink EOF )
            // InternalComponentDefinition.g:1283:2: iv_ruleAbstractComponentLink= ruleAbstractComponentLink EOF
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
    // InternalComponentDefinition.g:1289:1: ruleAbstractComponentLink returns [EObject current=null] : (this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver | this_RequestPortLink_1= ruleRequestPortLink | this_InputLinkExtension_2= ruleInputLinkExtension | this_OpcUaClientLink_3= ruleOpcUaClientLink ) ;
    public final EObject ruleAbstractComponentLink() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentSubNodeObserver_0 = null;

        EObject this_RequestPortLink_1 = null;

        EObject this_InputLinkExtension_2 = null;

        EObject this_OpcUaClientLink_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1295:2: ( (this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver | this_RequestPortLink_1= ruleRequestPortLink | this_InputLinkExtension_2= ruleInputLinkExtension | this_OpcUaClientLink_3= ruleOpcUaClientLink ) )
            // InternalComponentDefinition.g:1296:2: (this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver | this_RequestPortLink_1= ruleRequestPortLink | this_InputLinkExtension_2= ruleInputLinkExtension | this_OpcUaClientLink_3= ruleOpcUaClientLink )
            {
            // InternalComponentDefinition.g:1296:2: (this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver | this_RequestPortLink_1= ruleRequestPortLink | this_InputLinkExtension_2= ruleInputLinkExtension | this_OpcUaClientLink_3= ruleOpcUaClientLink )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt22=1;
                }
                break;
            case 30:
                {
                alt22=2;
                }
                break;
            case 33:
                {
                alt22=3;
                }
                break;
            case 31:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalComponentDefinition.g:1297:3: this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver
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
                    // InternalComponentDefinition.g:1306:3: this_RequestPortLink_1= ruleRequestPortLink
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
                    // InternalComponentDefinition.g:1315:3: this_InputLinkExtension_2= ruleInputLinkExtension
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
                    // InternalComponentDefinition.g:1324:3: this_OpcUaClientLink_3= ruleOpcUaClientLink
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentLinkAccess().getOpcUaClientLinkParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpcUaClientLink_3=ruleOpcUaClientLink();

                    state._fsp--;


                    			current = this_OpcUaClientLink_3;
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
    // InternalComponentDefinition.g:1336:1: entryRuleRequestPortLink returns [EObject current=null] : iv_ruleRequestPortLink= ruleRequestPortLink EOF ;
    public final EObject entryRuleRequestPortLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestPortLink = null;


        try {
            // InternalComponentDefinition.g:1336:56: (iv_ruleRequestPortLink= ruleRequestPortLink EOF )
            // InternalComponentDefinition.g:1337:2: iv_ruleRequestPortLink= ruleRequestPortLink EOF
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
    // InternalComponentDefinition.g:1343:1: ruleRequestPortLink returns [EObject current=null] : (otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleRequestPortLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1349:2: ( (otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:1350:2: (otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:1350:2: (otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:1351:3: otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestPortLinkAccess().getRequestPortLinkKeyword_0());
            		
            // InternalComponentDefinition.g:1355:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1356:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1356:4: ( ruleFQN )
            // InternalComponentDefinition.g:1357:5: ruleFQN
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

            // InternalComponentDefinition.g:1371:3: (otherlv_2= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==12) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentDefinition.g:1372:4: otherlv_2= ';'
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
    // InternalComponentDefinition.g:1381:1: entryRuleOpcUaClientLink returns [EObject current=null] : iv_ruleOpcUaClientLink= ruleOpcUaClientLink EOF ;
    public final EObject entryRuleOpcUaClientLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUaClientLink = null;


        try {
            // InternalComponentDefinition.g:1381:56: (iv_ruleOpcUaClientLink= ruleOpcUaClientLink EOF )
            // InternalComponentDefinition.g:1382:2: iv_ruleOpcUaClientLink= ruleOpcUaClientLink EOF
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
    // InternalComponentDefinition.g:1388:1: ruleOpcUaClientLink returns [EObject current=null] : (otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleOpcUaClientLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1394:2: ( (otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:1395:2: (otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:1395:2: (otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:1396:3: otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpcUaClientLinkAccess().getOpcUaClientLinkKeyword_0());
            		
            // InternalComponentDefinition.g:1400:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1401:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1401:4: ( ruleFQN )
            // InternalComponentDefinition.g:1402:5: ruleFQN
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

            // InternalComponentDefinition.g:1416:3: (otherlv_2= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==12) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentDefinition.g:1417:4: otherlv_2= ';'
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


    // $ANTLR start "entryRuleComponentSubNodeObserver"
    // InternalComponentDefinition.g:1426:1: entryRuleComponentSubNodeObserver returns [EObject current=null] : iv_ruleComponentSubNodeObserver= ruleComponentSubNodeObserver EOF ;
    public final EObject entryRuleComponentSubNodeObserver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentSubNodeObserver = null;


        try {
            // InternalComponentDefinition.g:1426:65: (iv_ruleComponentSubNodeObserver= ruleComponentSubNodeObserver EOF )
            // InternalComponentDefinition.g:1427:2: iv_ruleComponentSubNodeObserver= ruleComponentSubNodeObserver EOF
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
    // InternalComponentDefinition.g:1433:1: ruleComponentSubNodeObserver returns [EObject current=null] : (otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleComponentSubNodeObserver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1439:2: ( (otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:1440:2: (otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:1440:2: (otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:1441:3: otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentSubNodeObserverAccess().getObserveKeyword_0());
            		
            // InternalComponentDefinition.g:1445:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1446:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1446:4: ( ruleFQN )
            // InternalComponentDefinition.g:1447:5: ruleFQN
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

            // InternalComponentDefinition.g:1461:3: (otherlv_2= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==12) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentDefinition.g:1462:4: otherlv_2= ';'
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
    // InternalComponentDefinition.g:1471:1: entryRuleInputLinkExtension returns [EObject current=null] : iv_ruleInputLinkExtension= ruleInputLinkExtension EOF ;
    public final EObject entryRuleInputLinkExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputLinkExtension = null;


        try {
            // InternalComponentDefinition.g:1471:59: (iv_ruleInputLinkExtension= ruleInputLinkExtension EOF )
            // InternalComponentDefinition.g:1472:2: iv_ruleInputLinkExtension= ruleInputLinkExtension EOF
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
    // InternalComponentDefinition.g:1478:1: ruleInputLinkExtension returns [EObject current=null] : ( () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ;
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
            // InternalComponentDefinition.g:1484:2: ( ( () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalComponentDefinition.g:1485:2: ( () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalComponentDefinition.g:1485:2: ( () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalComponentDefinition.g:1486:3: () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            // InternalComponentDefinition.g:1486:3: ()
            // InternalComponentDefinition.g:1487:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputLinkExtensionAccess().getInputLinkExtensionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInputLinkExtensionAccess().getInputPortLinkKeyword_1());
            		
            // InternalComponentDefinition.g:1497:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1498:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1498:4: ( ruleFQN )
            // InternalComponentDefinition.g:1499:5: ruleFQN
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
            		
            // InternalComponentDefinition.g:1517:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) )
            // InternalComponentDefinition.g:1518:4: ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) )
            {
            // InternalComponentDefinition.g:1518:4: ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) )
            // InternalComponentDefinition.g:1519:5: ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
            				
            // InternalComponentDefinition.g:1522:5: ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* )
            // InternalComponentDefinition.g:1523:6: ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )*
            {
            // InternalComponentDefinition.g:1523:6: ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )*
            loop26:
            do {
                int alt26=4;
                int LA26_0 = input.LA(1);

                if ( LA26_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                    alt26=1;
                }
                else if ( LA26_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                    alt26=2;
                }
                else if ( LA26_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                    alt26=3;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalComponentDefinition.g:1524:4: ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1524:4: ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) )
            	    // InternalComponentDefinition.g:1525:5: {...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalComponentDefinition.g:1525:115: ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) )
            	    // InternalComponentDefinition.g:1526:6: ({...}? => ( (lv_optional_5_0= 'optional' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalComponentDefinition.g:1529:9: ({...}? => ( (lv_optional_5_0= 'optional' ) ) )
            	    // InternalComponentDefinition.g:1529:10: {...}? => ( (lv_optional_5_0= 'optional' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "true");
            	    }
            	    // InternalComponentDefinition.g:1529:19: ( (lv_optional_5_0= 'optional' ) )
            	    // InternalComponentDefinition.g:1529:20: (lv_optional_5_0= 'optional' )
            	    {
            	    // InternalComponentDefinition.g:1529:20: (lv_optional_5_0= 'optional' )
            	    // InternalComponentDefinition.g:1530:10: lv_optional_5_0= 'optional'
            	    {
            	    lv_optional_5_0=(Token)match(input,34,FOLLOW_19); 

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
            	    // InternalComponentDefinition.g:1547:4: ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1547:4: ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) )
            	    // InternalComponentDefinition.g:1548:5: {...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalComponentDefinition.g:1548:115: ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) )
            	    // InternalComponentDefinition.g:1549:6: ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalComponentDefinition.g:1552:9: ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) )
            	    // InternalComponentDefinition.g:1552:10: {...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "true");
            	    }
            	    // InternalComponentDefinition.g:1552:19: ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) )
            	    // InternalComponentDefinition.g:1552:20: (lv_oversamplingOk_6_0= 'oversamplingOk' )
            	    {
            	    // InternalComponentDefinition.g:1552:20: (lv_oversamplingOk_6_0= 'oversamplingOk' )
            	    // InternalComponentDefinition.g:1553:10: lv_oversamplingOk_6_0= 'oversamplingOk'
            	    {
            	    lv_oversamplingOk_6_0=(Token)match(input,35,FOLLOW_19); 

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
            	    // InternalComponentDefinition.g:1570:4: ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1570:4: ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) )
            	    // InternalComponentDefinition.g:1571:5: {...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalComponentDefinition.g:1571:115: ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) )
            	    // InternalComponentDefinition.g:1572:6: ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalComponentDefinition.g:1575:9: ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) )
            	    // InternalComponentDefinition.g:1575:10: {...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "true");
            	    }
            	    // InternalComponentDefinition.g:1575:19: ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) )
            	    // InternalComponentDefinition.g:1575:20: (lv_undersamplingOk_7_0= 'undersamplingOk' )
            	    {
            	    // InternalComponentDefinition.g:1575:20: (lv_undersamplingOk_7_0= 'undersamplingOk' )
            	    // InternalComponentDefinition.g:1576:10: lv_undersamplingOk_7_0= 'undersamplingOk'
            	    {
            	    lv_undersamplingOk_7_0=(Token)match(input,36,FOLLOW_19); 

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
            	    break loop26;
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
    // InternalComponentDefinition.g:1608:1: entryRuleActivityExtension returns [EObject current=null] : iv_ruleActivityExtension= ruleActivityExtension EOF ;
    public final EObject entryRuleActivityExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityExtension = null;


        try {
            // InternalComponentDefinition.g:1608:58: (iv_ruleActivityExtension= ruleActivityExtension EOF )
            // InternalComponentDefinition.g:1609:2: iv_ruleActivityExtension= ruleActivityExtension EOF
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
    // InternalComponentDefinition.g:1615:1: ruleActivityExtension returns [EObject current=null] : (this_ActivationConstraints_0= ruleActivationConstraints | this_OperationModeBinding_1= ruleOperationModeBinding | this_DefaultTrigger_2= ruleDefaultTrigger ) ;
    public final EObject ruleActivityExtension() throws RecognitionException {
        EObject current = null;

        EObject this_ActivationConstraints_0 = null;

        EObject this_OperationModeBinding_1 = null;

        EObject this_DefaultTrigger_2 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1621:2: ( (this_ActivationConstraints_0= ruleActivationConstraints | this_OperationModeBinding_1= ruleOperationModeBinding | this_DefaultTrigger_2= ruleDefaultTrigger ) )
            // InternalComponentDefinition.g:1622:2: (this_ActivationConstraints_0= ruleActivationConstraints | this_OperationModeBinding_1= ruleOperationModeBinding | this_DefaultTrigger_2= ruleDefaultTrigger )
            {
            // InternalComponentDefinition.g:1622:2: (this_ActivationConstraints_0= ruleActivationConstraints | this_OperationModeBinding_1= ruleOperationModeBinding | this_DefaultTrigger_2= ruleDefaultTrigger )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt27=1;
                }
                break;
            case 43:
                {
                alt27=2;
                }
                break;
            case 44:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalComponentDefinition.g:1623:3: this_ActivationConstraints_0= ruleActivationConstraints
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
                    // InternalComponentDefinition.g:1632:3: this_OperationModeBinding_1= ruleOperationModeBinding
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
                    // InternalComponentDefinition.g:1641:3: this_DefaultTrigger_2= ruleDefaultTrigger
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
    // InternalComponentDefinition.g:1653:1: entryRuleActivationConstraints returns [EObject current=null] : iv_ruleActivationConstraints= ruleActivationConstraints EOF ;
    public final EObject entryRuleActivationConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivationConstraints = null;


        try {
            // InternalComponentDefinition.g:1653:62: (iv_ruleActivationConstraints= ruleActivationConstraints EOF )
            // InternalComponentDefinition.g:1654:2: iv_ruleActivationConstraints= ruleActivationConstraints EOF
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
    // InternalComponentDefinition.g:1660:1: ruleActivationConstraints returns [EObject current=null] : ( () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}' ) ;
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
            // InternalComponentDefinition.g:1666:2: ( ( () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}' ) )
            // InternalComponentDefinition.g:1667:2: ( () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}' )
            {
            // InternalComponentDefinition.g:1667:2: ( () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}' )
            // InternalComponentDefinition.g:1668:3: () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}'
            {
            // InternalComponentDefinition.g:1668:3: ()
            // InternalComponentDefinition.g:1669:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivationConstraintsAccess().getActivationConstraintsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getActivationConstraintsAccess().getActivationConstraintsKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getActivationConstraintsAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getActivationConstraintsAccess().getConfigurableKeyword_3());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_4());
            		
            // InternalComponentDefinition.g:1691:3: ( (lv_configurable_5_0= ruleEBoolean ) )
            // InternalComponentDefinition.g:1692:4: (lv_configurable_5_0= ruleEBoolean )
            {
            // InternalComponentDefinition.g:1692:4: (lv_configurable_5_0= ruleEBoolean )
            // InternalComponentDefinition.g:1693:5: lv_configurable_5_0= ruleEBoolean
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

            // InternalComponentDefinition.g:1710:3: (otherlv_6= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==12) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalComponentDefinition.g:1711:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_6());
                    			

                    }
                    break;

            }

            // InternalComponentDefinition.g:1716:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) )
            // InternalComponentDefinition.g:1717:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) )
            {
            // InternalComponentDefinition.g:1717:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) )
            // InternalComponentDefinition.g:1718:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
            				
            // InternalComponentDefinition.g:1721:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* )
            // InternalComponentDefinition.g:1722:6: ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )*
            {
            // InternalComponentDefinition.g:1722:6: ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( LA31_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                    alt31=1;
                }
                else if ( LA31_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalComponentDefinition.g:1723:4: ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1723:4: ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) )
            	    // InternalComponentDefinition.g:1724:5: {...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActivationConstraints", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalComponentDefinition.g:1724:118: ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) )
            	    // InternalComponentDefinition.g:1725:6: ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0);
            	    					
            	    // InternalComponentDefinition.g:1728:9: ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) )
            	    // InternalComponentDefinition.g:1728:10: {...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivationConstraints", "true");
            	    }
            	    // InternalComponentDefinition.g:1728:19: (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? )
            	    // InternalComponentDefinition.g:1728:20: otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )?
            	    {
            	    otherlv_8=(Token)match(input,40,FOLLOW_21); 

            	    									newLeafNode(otherlv_8, grammarAccess.getActivationConstraintsAccess().getMinActFreqKeyword_7_0_0());
            	    								
            	    otherlv_9=(Token)match(input,39,FOLLOW_25); 

            	    									newLeafNode(otherlv_9, grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_0_1());
            	    								
            	    // InternalComponentDefinition.g:1736:9: ( (lv_minActFreq_10_0= ruleEDouble ) )
            	    // InternalComponentDefinition.g:1737:10: (lv_minActFreq_10_0= ruleEDouble )
            	    {
            	    // InternalComponentDefinition.g:1737:10: (lv_minActFreq_10_0= ruleEDouble )
            	    // InternalComponentDefinition.g:1738:11: lv_minActFreq_10_0= ruleEDouble
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

            	    otherlv_11=(Token)match(input,41,FOLLOW_23); 

            	    									newLeafNode(otherlv_11, grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_0_3());
            	    								
            	    // InternalComponentDefinition.g:1759:9: (otherlv_12= ';' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==12) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalComponentDefinition.g:1760:10: otherlv_12= ';'
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
            	    // InternalComponentDefinition.g:1771:4: ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1771:4: ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) )
            	    // InternalComponentDefinition.g:1772:5: {...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActivationConstraints", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalComponentDefinition.g:1772:118: ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) )
            	    // InternalComponentDefinition.g:1773:6: ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1);
            	    					
            	    // InternalComponentDefinition.g:1776:9: ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) )
            	    // InternalComponentDefinition.g:1776:10: {...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivationConstraints", "true");
            	    }
            	    // InternalComponentDefinition.g:1776:19: (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? )
            	    // InternalComponentDefinition.g:1776:20: otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )?
            	    {
            	    otherlv_13=(Token)match(input,42,FOLLOW_21); 

            	    									newLeafNode(otherlv_13, grammarAccess.getActivationConstraintsAccess().getMaxActFreqKeyword_7_1_0());
            	    								
            	    otherlv_14=(Token)match(input,39,FOLLOW_25); 

            	    									newLeafNode(otherlv_14, grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_1_1());
            	    								
            	    // InternalComponentDefinition.g:1784:9: ( (lv_maxActFreq_15_0= ruleEDouble ) )
            	    // InternalComponentDefinition.g:1785:10: (lv_maxActFreq_15_0= ruleEDouble )
            	    {
            	    // InternalComponentDefinition.g:1785:10: (lv_maxActFreq_15_0= ruleEDouble )
            	    // InternalComponentDefinition.g:1786:11: lv_maxActFreq_15_0= ruleEDouble
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

            	    otherlv_16=(Token)match(input,41,FOLLOW_23); 

            	    									newLeafNode(otherlv_16, grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_1_3());
            	    								
            	    // InternalComponentDefinition.g:1807:9: (otherlv_17= ';' )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==12) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalComponentDefinition.g:1808:10: otherlv_17= ';'
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
            	    break loop31;
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
    // InternalComponentDefinition.g:1834:1: entryRuleOperationModeBinding returns [EObject current=null] : iv_ruleOperationModeBinding= ruleOperationModeBinding EOF ;
    public final EObject entryRuleOperationModeBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationModeBinding = null;


        try {
            // InternalComponentDefinition.g:1834:61: (iv_ruleOperationModeBinding= ruleOperationModeBinding EOF )
            // InternalComponentDefinition.g:1835:2: iv_ruleOperationModeBinding= ruleOperationModeBinding EOF
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
    // InternalComponentDefinition.g:1841:1: ruleOperationModeBinding returns [EObject current=null] : (otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleOperationModeBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1847:2: ( (otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:1848:2: (otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:1848:2: (otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:1849:3: otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationModeBindingAccess().getOperationModeBindingKeyword_0());
            		
            // InternalComponentDefinition.g:1853:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1854:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1854:4: ( ruleFQN )
            // InternalComponentDefinition.g:1855:5: ruleFQN
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

            // InternalComponentDefinition.g:1869:3: (otherlv_2= ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==12) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalComponentDefinition.g:1870:4: otherlv_2= ';'
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
    // InternalComponentDefinition.g:1879:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // InternalComponentDefinition.g:1879:55: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // InternalComponentDefinition.g:1880:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
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
    // InternalComponentDefinition.g:1886:1: ruleDefaultTrigger returns [EObject current=null] : (otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )? ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_DefaultInputTrigger_1 = null;

        EObject this_DefaultPeriodicTimer_2 = null;

        EObject this_DefaultObservedElementTrigger_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1892:2: ( (otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )? ) )
            // InternalComponentDefinition.g:1893:2: (otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )? )
            {
            // InternalComponentDefinition.g:1893:2: (otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )? )
            // InternalComponentDefinition.g:1894:3: otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultTriggerAccess().getDefaultTriggerKeyword_0());
            		
            // InternalComponentDefinition.g:1898:3: (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt33=1;
                }
                break;
            case 47:
                {
                alt33=2;
                }
                break;
            case 48:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalComponentDefinition.g:1899:4: this_DefaultInputTrigger_1= ruleDefaultInputTrigger
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
                    // InternalComponentDefinition.g:1908:4: this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer
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
                    // InternalComponentDefinition.g:1917:4: this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger
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

            // InternalComponentDefinition.g:1926:3: (otherlv_4= ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==12) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalComponentDefinition.g:1927:4: otherlv_4= ';'
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
    // InternalComponentDefinition.g:1936:1: entryRuleDefaultInputTrigger returns [EObject current=null] : iv_ruleDefaultInputTrigger= ruleDefaultInputTrigger EOF ;
    public final EObject entryRuleDefaultInputTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultInputTrigger = null;


        try {
            // InternalComponentDefinition.g:1936:60: (iv_ruleDefaultInputTrigger= ruleDefaultInputTrigger EOF )
            // InternalComponentDefinition.g:1937:2: iv_ruleDefaultInputTrigger= ruleDefaultInputTrigger EOF
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
    // InternalComponentDefinition.g:1943:1: ruleDefaultInputTrigger returns [EObject current=null] : (otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )? ) ;
    public final EObject ruleDefaultInputTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_prescale_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1949:2: ( (otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )? ) )
            // InternalComponentDefinition.g:1950:2: (otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )? )
            {
            // InternalComponentDefinition.g:1950:2: (otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )? )
            // InternalComponentDefinition.g:1951:3: otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultInputTriggerAccess().getInputPortTriggerKeyword_0());
            		
            // InternalComponentDefinition.g:1955:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1956:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1956:4: ( ruleFQN )
            // InternalComponentDefinition.g:1957:5: ruleFQN
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

            // InternalComponentDefinition.g:1971:3: (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalComponentDefinition.g:1972:4: otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefaultInputTriggerAccess().getPrescaleKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:1976:4: ( (lv_prescale_3_0= ruleEInt ) )
                    // InternalComponentDefinition.g:1977:5: (lv_prescale_3_0= ruleEInt )
                    {
                    // InternalComponentDefinition.g:1977:5: (lv_prescale_3_0= ruleEInt )
                    // InternalComponentDefinition.g:1978:6: lv_prescale_3_0= ruleEInt
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
    // InternalComponentDefinition.g:2000:1: entryRuleDefaultPeriodicTimer returns [EObject current=null] : iv_ruleDefaultPeriodicTimer= ruleDefaultPeriodicTimer EOF ;
    public final EObject entryRuleDefaultPeriodicTimer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultPeriodicTimer = null;


        try {
            // InternalComponentDefinition.g:2000:61: (iv_ruleDefaultPeriodicTimer= ruleDefaultPeriodicTimer EOF )
            // InternalComponentDefinition.g:2001:2: iv_ruleDefaultPeriodicTimer= ruleDefaultPeriodicTimer EOF
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
    // InternalComponentDefinition.g:2007:1: ruleDefaultPeriodicTimer returns [EObject current=null] : (otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz' ) ;
    public final EObject ruleDefaultPeriodicTimer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_periodicActFreq_1_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2013:2: ( (otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz' ) )
            // InternalComponentDefinition.g:2014:2: (otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz' )
            {
            // InternalComponentDefinition.g:2014:2: (otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz' )
            // InternalComponentDefinition.g:2015:3: otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicTimerKeyword_0());
            		
            // InternalComponentDefinition.g:2019:3: ( (lv_periodicActFreq_1_0= ruleEDouble ) )
            // InternalComponentDefinition.g:2020:4: (lv_periodicActFreq_1_0= ruleEDouble )
            {
            // InternalComponentDefinition.g:2020:4: (lv_periodicActFreq_1_0= ruleEDouble )
            // InternalComponentDefinition.g:2021:5: lv_periodicActFreq_1_0= ruleEDouble
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

            otherlv_2=(Token)match(input,41,FOLLOW_2); 

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
    // InternalComponentDefinition.g:2046:1: entryRuleDefaultObservedElementTrigger returns [EObject current=null] : iv_ruleDefaultObservedElementTrigger= ruleDefaultObservedElementTrigger EOF ;
    public final EObject entryRuleDefaultObservedElementTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultObservedElementTrigger = null;


        try {
            // InternalComponentDefinition.g:2046:70: (iv_ruleDefaultObservedElementTrigger= ruleDefaultObservedElementTrigger EOF )
            // InternalComponentDefinition.g:2047:2: iv_ruleDefaultObservedElementTrigger= ruleDefaultObservedElementTrigger EOF
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
    // InternalComponentDefinition.g:2053:1: ruleDefaultObservedElementTrigger returns [EObject current=null] : (otherlv_0= 'ObservedElement' ( ( ruleFQN ) ) ) ;
    public final EObject ruleDefaultObservedElementTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2059:2: ( (otherlv_0= 'ObservedElement' ( ( ruleFQN ) ) ) )
            // InternalComponentDefinition.g:2060:2: (otherlv_0= 'ObservedElement' ( ( ruleFQN ) ) )
            {
            // InternalComponentDefinition.g:2060:2: (otherlv_0= 'ObservedElement' ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:2061:3: otherlv_0= 'ObservedElement' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultObservedElementTriggerAccess().getObservedElementKeyword_0());
            		
            // InternalComponentDefinition.g:2065:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2066:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2066:4: ( ruleFQN )
            // InternalComponentDefinition.g:2067:5: ruleFQN
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
    // InternalComponentDefinition.g:2085:1: entryRulePlainOpcUaPort returns [EObject current=null] : iv_rulePlainOpcUaPort= rulePlainOpcUaPort EOF ;
    public final EObject entryRulePlainOpcUaPort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainOpcUaPort = null;


        try {
            // InternalComponentDefinition.g:2085:55: (iv_rulePlainOpcUaPort= rulePlainOpcUaPort EOF )
            // InternalComponentDefinition.g:2086:2: iv_rulePlainOpcUaPort= rulePlainOpcUaPort EOF
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
    // InternalComponentDefinition.g:2092:1: rulePlainOpcUaPort returns [EObject current=null] : (this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient | this_OpcUaStatusServer_1= ruleOpcUaStatusServer ) ;
    public final EObject rulePlainOpcUaPort() throws RecognitionException {
        EObject current = null;

        EObject this_OpcUaDeviceClient_0 = null;

        EObject this_OpcUaStatusServer_1 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2098:2: ( (this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient | this_OpcUaStatusServer_1= ruleOpcUaStatusServer ) )
            // InternalComponentDefinition.g:2099:2: (this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient | this_OpcUaStatusServer_1= ruleOpcUaStatusServer )
            {
            // InternalComponentDefinition.g:2099:2: (this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient | this_OpcUaStatusServer_1= ruleOpcUaStatusServer )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            else if ( (LA36_0==52) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalComponentDefinition.g:2100:3: this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient
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
                    // InternalComponentDefinition.g:2109:3: this_OpcUaStatusServer_1= ruleOpcUaStatusServer
                    {

                    			newCompositeNode(grammarAccess.getPlainOpcUaPortAccess().getOpcUaStatusServerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpcUaStatusServer_1=ruleOpcUaStatusServer();

                    state._fsp--;


                    			current = this_OpcUaStatusServer_1;
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
    // InternalComponentDefinition.g:2121:1: entryRuleOpcUaDeviceClient returns [EObject current=null] : iv_ruleOpcUaDeviceClient= ruleOpcUaDeviceClient EOF ;
    public final EObject entryRuleOpcUaDeviceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUaDeviceClient = null;


        try {
            // InternalComponentDefinition.g:2121:58: (iv_ruleOpcUaDeviceClient= ruleOpcUaDeviceClient EOF )
            // InternalComponentDefinition.g:2122:2: iv_ruleOpcUaDeviceClient= ruleOpcUaDeviceClient EOF
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
    // InternalComponentDefinition.g:2128:1: ruleOpcUaDeviceClient returns [EObject current=null] : (otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_7= ';' )? ) ;
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
            // InternalComponentDefinition.g:2134:2: ( (otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_7= ';' )? ) )
            // InternalComponentDefinition.g:2135:2: (otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_7= ';' )? )
            {
            // InternalComponentDefinition.g:2135:2: (otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_7= ';' )? )
            // InternalComponentDefinition.g:2136:3: otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_7= ';' )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpcUaDeviceClientAccess().getOpcUaDeviceClientKeyword_0());
            		
            // InternalComponentDefinition.g:2140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:2141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:2141:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:2142:5: lv_name_1_0= RULE_ID
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

            // InternalComponentDefinition.g:2158:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) )
            // InternalComponentDefinition.g:2159:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalComponentDefinition.g:2159:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            // InternalComponentDefinition.g:2160:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
            				
            // InternalComponentDefinition.g:2163:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            // InternalComponentDefinition.g:2164:6: ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+ {...}?
            {
            // InternalComponentDefinition.g:2164:6: ( ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalComponentDefinition.g:2165:4: ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:2165:4: ({...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDefinition.g:2166:5: {...}? => ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalComponentDefinition.g:2166:114: ( ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) ) )
            	    // InternalComponentDefinition.g:2167:6: ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalComponentDefinition.g:2170:9: ({...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) ) )
            	    // InternalComponentDefinition.g:2170:10: {...}? => (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "true");
            	    }
            	    // InternalComponentDefinition.g:2170:19: (otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) ) )
            	    // InternalComponentDefinition.g:2170:20: otherlv_3= 'deviceURI' ( (lv_deviceURI_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,50,FOLLOW_7); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIKeyword_2_0_0());
            	    								
            	    // InternalComponentDefinition.g:2174:9: ( (lv_deviceURI_4_0= ruleEString ) )
            	    // InternalComponentDefinition.g:2175:10: (lv_deviceURI_4_0= ruleEString )
            	    {
            	    // InternalComponentDefinition.g:2175:10: (lv_deviceURI_4_0= ruleEString )
            	    // InternalComponentDefinition.g:2176:11: lv_deviceURI_4_0= ruleEString
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
            	    // InternalComponentDefinition.g:2199:4: ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:2199:4: ({...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDefinition.g:2200:5: {...}? => ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalComponentDefinition.g:2200:114: ( ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) ) )
            	    // InternalComponentDefinition.g:2201:6: ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalComponentDefinition.g:2204:9: ({...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) ) )
            	    // InternalComponentDefinition.g:2204:10: {...}? => (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "true");
            	    }
            	    // InternalComponentDefinition.g:2204:19: (otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) ) )
            	    // InternalComponentDefinition.g:2204:20: otherlv_5= 'opcuaXmlFile' ( (lv_opcuaXmlFile_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,51,FOLLOW_7); 

            	    									newLeafNode(otherlv_5, grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileKeyword_2_1_0());
            	    								
            	    // InternalComponentDefinition.g:2208:9: ( (lv_opcuaXmlFile_6_0= ruleEString ) )
            	    // InternalComponentDefinition.g:2209:10: (lv_opcuaXmlFile_6_0= ruleEString )
            	    {
            	    // InternalComponentDefinition.g:2209:10: (lv_opcuaXmlFile_6_0= ruleEString )
            	    // InternalComponentDefinition.g:2210:11: lv_opcuaXmlFile_6_0= ruleEString
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
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "getUnorderedGroupHelper().canLeave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
            				

            }

            // InternalComponentDefinition.g:2241:3: (otherlv_7= ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==12) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalComponentDefinition.g:2242:4: otherlv_7= ';'
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


    // $ANTLR start "entryRuleOpcUaStatusServer"
    // InternalComponentDefinition.g:2251:1: entryRuleOpcUaStatusServer returns [EObject current=null] : iv_ruleOpcUaStatusServer= ruleOpcUaStatusServer EOF ;
    public final EObject entryRuleOpcUaStatusServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUaStatusServer = null;


        try {
            // InternalComponentDefinition.g:2251:58: (iv_ruleOpcUaStatusServer= ruleOpcUaStatusServer EOF )
            // InternalComponentDefinition.g:2252:2: iv_ruleOpcUaStatusServer= ruleOpcUaStatusServer EOF
            {
             newCompositeNode(grammarAccess.getOpcUaStatusServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpcUaStatusServer=ruleOpcUaStatusServer();

            state._fsp--;

             current =iv_ruleOpcUaStatusServer; 
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
    // $ANTLR end "entryRuleOpcUaStatusServer"


    // $ANTLR start "ruleOpcUaStatusServer"
    // InternalComponentDefinition.g:2258:1: ruleOpcUaStatusServer returns [EObject current=null] : (otherlv_0= 'OpcUaStatusServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleOpcUaStatusServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2264:2: ( (otherlv_0= 'OpcUaStatusServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) )
            // InternalComponentDefinition.g:2265:2: (otherlv_0= 'OpcUaStatusServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            {
            // InternalComponentDefinition.g:2265:2: (otherlv_0= 'OpcUaStatusServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            // InternalComponentDefinition.g:2266:3: otherlv_0= 'OpcUaStatusServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpcUaStatusServerAccess().getOpcUaStatusServerKeyword_0());
            		
            // InternalComponentDefinition.g:2270:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:2271:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:2271:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:2272:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOpcUaStatusServerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpcUaStatusServerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOpcUaStatusServerAccess().getDataProviderPortKeyword_2());
            		
            // InternalComponentDefinition.g:2292:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2293:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2293:4: ( ruleFQN )
            // InternalComponentDefinition.g:2294:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpcUaStatusServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpcUaStatusServerAccess().getOutPortOutputPortCrossReference_3_0());
            				
            pushFollow(FOLLOW_5);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:2308:3: (otherlv_4= ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==12) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalComponentDefinition.g:2309:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpcUaStatusServerAccess().getSemicolonKeyword_4());
                    			

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
    // $ANTLR end "ruleOpcUaStatusServer"


    // $ANTLR start "entryRuleCoordinationSlavePort"
    // InternalComponentDefinition.g:2318:1: entryRuleCoordinationSlavePort returns [EObject current=null] : iv_ruleCoordinationSlavePort= ruleCoordinationSlavePort EOF ;
    public final EObject entryRuleCoordinationSlavePort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationSlavePort = null;


        try {
            // InternalComponentDefinition.g:2318:62: (iv_ruleCoordinationSlavePort= ruleCoordinationSlavePort EOF )
            // InternalComponentDefinition.g:2319:2: iv_ruleCoordinationSlavePort= ruleCoordinationSlavePort EOF
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
    // InternalComponentDefinition.g:2325:1: ruleCoordinationSlavePort returns [EObject current=null] : (otherlv_0= 'CoordinationSlavePort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractCoordinationElement ) )* otherlv_6= '}' ) ;
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
            // InternalComponentDefinition.g:2331:2: ( (otherlv_0= 'CoordinationSlavePort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractCoordinationElement ) )* otherlv_6= '}' ) )
            // InternalComponentDefinition.g:2332:2: (otherlv_0= 'CoordinationSlavePort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractCoordinationElement ) )* otherlv_6= '}' )
            {
            // InternalComponentDefinition.g:2332:2: (otherlv_0= 'CoordinationSlavePort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractCoordinationElement ) )* otherlv_6= '}' )
            // InternalComponentDefinition.g:2333:3: otherlv_0= 'CoordinationSlavePort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleAbstractCoordinationElement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinationSlavePortAccess().getCoordinationSlavePortKeyword_0());
            		
            // InternalComponentDefinition.g:2337:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:2338:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:2338:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:2339:5: lv_name_1_0= RULE_ID
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
            		
            // InternalComponentDefinition.g:2359:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2360:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2360:4: ( ruleFQN )
            // InternalComponentDefinition.g:2361:5: ruleFQN
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

            otherlv_4=(Token)match(input,15,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinationSlavePortAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponentDefinition.g:2379:3: ( (lv_elements_5_0= ruleAbstractCoordinationElement ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==24||(LA40_0>=55 && LA40_0<=57)||LA40_0==62) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalComponentDefinition.g:2380:4: (lv_elements_5_0= ruleAbstractCoordinationElement )
            	    {
            	    // InternalComponentDefinition.g:2380:4: (lv_elements_5_0= ruleAbstractCoordinationElement )
            	    // InternalComponentDefinition.g:2381:5: lv_elements_5_0= ruleAbstractCoordinationElement
            	    {

            	    					newCompositeNode(grammarAccess.getCoordinationSlavePortAccess().getElementsAbstractCoordinationElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop40;
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
    // InternalComponentDefinition.g:2406:1: entryRuleAbstractCoordinationElement returns [EObject current=null] : iv_ruleAbstractCoordinationElement= ruleAbstractCoordinationElement EOF ;
    public final EObject entryRuleAbstractCoordinationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCoordinationElement = null;


        try {
            // InternalComponentDefinition.g:2406:68: (iv_ruleAbstractCoordinationElement= ruleAbstractCoordinationElement EOF )
            // InternalComponentDefinition.g:2407:2: iv_ruleAbstractCoordinationElement= ruleAbstractCoordinationElement EOF
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
    // InternalComponentDefinition.g:2413:1: ruleAbstractCoordinationElement returns [EObject current=null] : (this_PublicOperationMode_0= rulePublicOperationMode | this_PrivateOperationMode_1= rulePrivateOperationMode | this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization | this_SkillRealizationsRef_3= ruleSkillRealizationsRef ) ;
    public final EObject ruleAbstractCoordinationElement() throws RecognitionException {
        EObject current = null;

        EObject this_PublicOperationMode_0 = null;

        EObject this_PrivateOperationMode_1 = null;

        EObject this_CommunicationServiceUsageRealization_2 = null;

        EObject this_SkillRealizationsRef_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2419:2: ( (this_PublicOperationMode_0= rulePublicOperationMode | this_PrivateOperationMode_1= rulePrivateOperationMode | this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization | this_SkillRealizationsRef_3= ruleSkillRealizationsRef ) )
            // InternalComponentDefinition.g:2420:2: (this_PublicOperationMode_0= rulePublicOperationMode | this_PrivateOperationMode_1= rulePrivateOperationMode | this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization | this_SkillRealizationsRef_3= ruleSkillRealizationsRef )
            {
            // InternalComponentDefinition.g:2420:2: (this_PublicOperationMode_0= rulePublicOperationMode | this_PrivateOperationMode_1= rulePrivateOperationMode | this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization | this_SkillRealizationsRef_3= ruleSkillRealizationsRef )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 24:
            case 57:
                {
                alt41=1;
                }
                break;
            case 62:
                {
                alt41=2;
                }
                break;
            case 56:
                {
                alt41=3;
                }
                break;
            case 55:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalComponentDefinition.g:2421:3: this_PublicOperationMode_0= rulePublicOperationMode
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
                    // InternalComponentDefinition.g:2430:3: this_PrivateOperationMode_1= rulePrivateOperationMode
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
                    // InternalComponentDefinition.g:2439:3: this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization
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
                    // InternalComponentDefinition.g:2448:3: this_SkillRealizationsRef_3= ruleSkillRealizationsRef
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
    // InternalComponentDefinition.g:2460:1: entryRuleSkillRealizationsRef returns [EObject current=null] : iv_ruleSkillRealizationsRef= ruleSkillRealizationsRef EOF ;
    public final EObject entryRuleSkillRealizationsRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillRealizationsRef = null;


        try {
            // InternalComponentDefinition.g:2460:61: (iv_ruleSkillRealizationsRef= ruleSkillRealizationsRef EOF )
            // InternalComponentDefinition.g:2461:2: iv_ruleSkillRealizationsRef= ruleSkillRealizationsRef EOF
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
    // InternalComponentDefinition.g:2467:1: ruleSkillRealizationsRef returns [EObject current=null] : (otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleSkillRealizationsRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2473:2: ( (otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:2474:2: (otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:2474:2: (otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:2475:3: otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationsRefKeyword_0());
            		
            // InternalComponentDefinition.g:2479:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2480:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2480:4: ( ruleFQN )
            // InternalComponentDefinition.g:2481:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillRealizationsRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationSetRefSkillRealizationSetCrossReference_1_0());
            				
            pushFollow(FOLLOW_5);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:2495:3: (otherlv_2= ';' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==12) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalComponentDefinition.g:2496:4: otherlv_2= ';'
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
    // InternalComponentDefinition.g:2505:1: entryRuleCommunicationServiceUsageRealization returns [EObject current=null] : iv_ruleCommunicationServiceUsageRealization= ruleCommunicationServiceUsageRealization EOF ;
    public final EObject entryRuleCommunicationServiceUsageRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationServiceUsageRealization = null;


        try {
            // InternalComponentDefinition.g:2505:77: (iv_ruleCommunicationServiceUsageRealization= ruleCommunicationServiceUsageRealization EOF )
            // InternalComponentDefinition.g:2506:2: iv_ruleCommunicationServiceUsageRealization= ruleCommunicationServiceUsageRealization EOF
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
    // InternalComponentDefinition.g:2512:1: ruleCommunicationServiceUsageRealization returns [EObject current=null] : (otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) ) ) ;
    public final EObject ruleCommunicationServiceUsageRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2518:2: ( (otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) ) ) )
            // InternalComponentDefinition.g:2519:2: (otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) ) )
            {
            // InternalComponentDefinition.g:2519:2: (otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:2520:3: otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCommunicationServiceUsageRealizationAccess().getWithKeyword_0());
            		
            // InternalComponentDefinition.g:2524:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2525:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2525:4: ( ruleFQN )
            // InternalComponentDefinition.g:2526:5: ruleFQN
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
            		
            // InternalComponentDefinition.g:2544:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2545:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2545:4: ( ruleFQN )
            // InternalComponentDefinition.g:2546:5: ruleFQN
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
    // InternalComponentDefinition.g:2564:1: entryRulePublicOperationMode returns [EObject current=null] : iv_rulePublicOperationMode= rulePublicOperationMode EOF ;
    public final EObject entryRulePublicOperationMode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublicOperationMode = null;


        try {
            // InternalComponentDefinition.g:2564:60: (iv_rulePublicOperationMode= rulePublicOperationMode EOF )
            // InternalComponentDefinition.g:2565:2: iv_rulePublicOperationMode= rulePublicOperationMode EOF
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
    // InternalComponentDefinition.g:2571:1: rulePublicOperationMode returns [EObject current=null] : ( () ( (lv_isDefaultInit_1_0= 'default' ) )? otherlv_2= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'activates' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) ;
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
            // InternalComponentDefinition.g:2577:2: ( ( () ( (lv_isDefaultInit_1_0= 'default' ) )? otherlv_2= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'activates' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) )
            // InternalComponentDefinition.g:2578:2: ( () ( (lv_isDefaultInit_1_0= 'default' ) )? otherlv_2= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'activates' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            {
            // InternalComponentDefinition.g:2578:2: ( () ( (lv_isDefaultInit_1_0= 'default' ) )? otherlv_2= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'activates' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            // InternalComponentDefinition.g:2579:3: () ( (lv_isDefaultInit_1_0= 'default' ) )? otherlv_2= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_4= '{' (otherlv_5= 'activates' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? otherlv_11= '}'
            {
            // InternalComponentDefinition.g:2579:3: ()
            // InternalComponentDefinition.g:2580:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPublicOperationModeAccess().getPublicOperationModeAction_0(),
            					current);
            			

            }

            // InternalComponentDefinition.g:2586:3: ( (lv_isDefaultInit_1_0= 'default' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==24) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalComponentDefinition.g:2587:4: (lv_isDefaultInit_1_0= 'default' )
                    {
                    // InternalComponentDefinition.g:2587:4: (lv_isDefaultInit_1_0= 'default' )
                    // InternalComponentDefinition.g:2588:5: lv_isDefaultInit_1_0= 'default'
                    {
                    lv_isDefaultInit_1_0=(Token)match(input,24,FOLLOW_34); 

                    					newLeafNode(lv_isDefaultInit_1_0, grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPublicOperationModeRule());
                    					}
                    					setWithLastConsumed(current, "isDefaultInit", true, "default");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPublicOperationModeAccess().getPublicOperationModeKeyword_2());
            		
            // InternalComponentDefinition.g:2604:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2605:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2605:4: ( ruleFQN )
            // InternalComponentDefinition.g:2606:5: ruleFQN
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

            otherlv_4=(Token)match(input,15,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getPublicOperationModeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponentDefinition.g:2624:3: (otherlv_5= 'activates' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==58) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalComponentDefinition.g:2625:4: otherlv_5= 'activates' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,58,FOLLOW_36); 

                    				newLeafNode(otherlv_5, grammarAccess.getPublicOperationModeAccess().getActivatesKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getPublicOperationModeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalComponentDefinition.g:2633:4: ( (otherlv_7= RULE_ID ) )
                    // InternalComponentDefinition.g:2634:5: (otherlv_7= RULE_ID )
                    {
                    // InternalComponentDefinition.g:2634:5: (otherlv_7= RULE_ID )
                    // InternalComponentDefinition.g:2635:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPublicOperationModeRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_37); 

                    						newLeafNode(otherlv_7, grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_2_0());
                    					

                    }


                    }

                    // InternalComponentDefinition.g:2646:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==60) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalComponentDefinition.g:2647:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,60,FOLLOW_4); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getPublicOperationModeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalComponentDefinition.g:2651:5: ( (otherlv_9= RULE_ID ) )
                    	    // InternalComponentDefinition.g:2652:6: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalComponentDefinition.g:2652:6: (otherlv_9= RULE_ID )
                    	    // InternalComponentDefinition.g:2653:7: otherlv_9= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPublicOperationModeRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_37); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,61,FOLLOW_38); 

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
    // InternalComponentDefinition.g:2678:1: entryRulePrivateOperationMode returns [EObject current=null] : iv_rulePrivateOperationMode= rulePrivateOperationMode EOF ;
    public final EObject entryRulePrivateOperationMode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateOperationMode = null;


        try {
            // InternalComponentDefinition.g:2678:61: (iv_rulePrivateOperationMode= rulePrivateOperationMode EOF )
            // InternalComponentDefinition.g:2679:2: iv_rulePrivateOperationMode= rulePrivateOperationMode EOF
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
    // InternalComponentDefinition.g:2685:1: rulePrivateOperationMode returns [EObject current=null] : (otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final EObject rulePrivateOperationMode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2691:2: ( (otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:2692:2: (otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:2692:2: (otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:2693:3: otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,62,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPrivateOperationModeAccess().getPrivateOperationModeKeyword_0());
            		
            // InternalComponentDefinition.g:2697:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:2698:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:2698:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:2699:5: lv_name_1_0= RULE_ID
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

            // InternalComponentDefinition.g:2715:3: (otherlv_2= ';' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==12) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalComponentDefinition.g:2716:4: otherlv_2= ';'
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
    // InternalComponentDefinition.g:2725:1: entryRuleCoordinationMasterPort returns [EObject current=null] : iv_ruleCoordinationMasterPort= ruleCoordinationMasterPort EOF ;
    public final EObject entryRuleCoordinationMasterPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationMasterPort = null;


        try {
            // InternalComponentDefinition.g:2725:63: (iv_ruleCoordinationMasterPort= ruleCoordinationMasterPort EOF )
            // InternalComponentDefinition.g:2726:2: iv_ruleCoordinationMasterPort= ruleCoordinationMasterPort EOF
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
    // InternalComponentDefinition.g:2732:1: ruleCoordinationMasterPort returns [EObject current=null] : (otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleCoordinationMasterPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2738:2: ( (otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) )
            // InternalComponentDefinition.g:2739:2: (otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            {
            // InternalComponentDefinition.g:2739:2: (otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            // InternalComponentDefinition.g:2740:3: otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinationMasterPortAccess().getCoordinationMasterPortKeyword_0());
            		
            // InternalComponentDefinition.g:2744:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:2745:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:2745:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:2746:5: lv_name_1_0= RULE_ID
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
            		
            // InternalComponentDefinition.g:2766:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2767:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2767:4: ( ruleFQN )
            // InternalComponentDefinition.g:2768:5: ruleFQN
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

            // InternalComponentDefinition.g:2782:3: (otherlv_4= ';' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==12) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalComponentDefinition.g:2783:4: otherlv_4= ';'
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
    // InternalComponentDefinition.g:2792:1: entryRuleComponentParametersRef returns [EObject current=null] : iv_ruleComponentParametersRef= ruleComponentParametersRef EOF ;
    public final EObject entryRuleComponentParametersRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentParametersRef = null;


        try {
            // InternalComponentDefinition.g:2792:63: (iv_ruleComponentParametersRef= ruleComponentParametersRef EOF )
            // InternalComponentDefinition.g:2793:2: iv_ruleComponentParametersRef= ruleComponentParametersRef EOF
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
    // InternalComponentDefinition.g:2799:1: ruleComponentParametersRef returns [EObject current=null] : (otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )? ) ;
    public final EObject ruleComponentParametersRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2805:2: ( (otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )? ) )
            // InternalComponentDefinition.g:2806:2: (otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )? )
            {
            // InternalComponentDefinition.g:2806:2: (otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )? )
            // InternalComponentDefinition.g:2807:3: otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentParametersRefAccess().getComponentParametersKeyword_0());
            		
            // InternalComponentDefinition.g:2811:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2812:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2812:4: ( ruleFQN )
            // InternalComponentDefinition.g:2813:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentParametersRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentParametersRefAccess().getParameterComponentParameterCrossReference_1_0());
            				
            pushFollow(FOLLOW_39);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:2827:3: (otherlv_2= 'slave' ( ( ruleFQN ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==65) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalComponentDefinition.g:2828:4: otherlv_2= 'slave' ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentParametersRefAccess().getSlaveKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:2832:4: ( ( ruleFQN ) )
                    // InternalComponentDefinition.g:2833:5: ( ruleFQN )
                    {
                    // InternalComponentDefinition.g:2833:5: ( ruleFQN )
                    // InternalComponentDefinition.g:2834:6: ruleFQN
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

            // InternalComponentDefinition.g:2849:3: (otherlv_4= ';' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==12) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalComponentDefinition.g:2850:4: otherlv_4= ';'
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
    // InternalComponentDefinition.g:2859:1: entryRuleRoboticMiddleware returns [EObject current=null] : iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF ;
    public final EObject entryRuleRoboticMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoboticMiddleware = null;


        try {
            // InternalComponentDefinition.g:2859:58: (iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF )
            // InternalComponentDefinition.g:2860:2: iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF
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
    // InternalComponentDefinition.g:2866:1: ruleRoboticMiddleware returns [EObject current=null] : (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft ) ;
    public final EObject ruleRoboticMiddleware() throws RecognitionException {
        EObject current = null;

        EObject this_ACE_SmartSoft_0 = null;

        EObject this_OpcUa_SeRoNet_1 = null;

        EObject this_CORBA_SmartSoft_2 = null;

        EObject this_DDS_SmartSoft_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2872:2: ( (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft ) )
            // InternalComponentDefinition.g:2873:2: (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft )
            {
            // InternalComponentDefinition.g:2873:2: (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt50=1;
                }
                break;
            case 75:
                {
                alt50=2;
                }
                break;
            case 76:
                {
                alt50=3;
                }
                break;
            case 77:
                {
                alt50=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalComponentDefinition.g:2874:3: this_ACE_SmartSoft_0= ruleACE_SmartSoft
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
                    // InternalComponentDefinition.g:2883:3: this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet
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
                    // InternalComponentDefinition.g:2892:3: this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft
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
                    // InternalComponentDefinition.g:2901:3: this_DDS_SmartSoft_3= ruleDDS_SmartSoft
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
    // InternalComponentDefinition.g:2913:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalComponentDefinition.g:2913:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalComponentDefinition.g:2914:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalComponentDefinition.g:2920:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2926:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalComponentDefinition.g:2927:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalComponentDefinition.g:2927:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalComponentDefinition.g:2928:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_40); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponentDefinition.g:2935:3: (kw= '.' this_ID_2= RULE_ID )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==66) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalComponentDefinition.g:2936:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,66,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_40); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalComponentDefinition.g:2953:1: entryRuleFQNW returns [String current=null] : iv_ruleFQNW= ruleFQNW EOF ;
    public final String entryRuleFQNW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNW = null;


        try {
            // InternalComponentDefinition.g:2953:44: (iv_ruleFQNW= ruleFQNW EOF )
            // InternalComponentDefinition.g:2954:2: iv_ruleFQNW= ruleFQNW EOF
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
    // InternalComponentDefinition.g:2960:1: ruleFQNW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFQNW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2966:2: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // InternalComponentDefinition.g:2967:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // InternalComponentDefinition.g:2967:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // InternalComponentDefinition.g:2968:3: this_FQN_0= ruleFQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalComponentDefinition.g:2978:3: (kw= '.*' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==67) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalComponentDefinition.g:2979:4: kw= '.*'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

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
    // InternalComponentDefinition.g:2989:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentDefinition.g:2989:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentDefinition.g:2990:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentDefinition.g:2996:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3002:2: (this_STRING_0= RULE_STRING )
            // InternalComponentDefinition.g:3003:2: this_STRING_0= RULE_STRING
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
    // InternalComponentDefinition.g:3013:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalComponentDefinition.g:3013:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalComponentDefinition.g:3014:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalComponentDefinition.g:3020:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3026:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalComponentDefinition.g:3027:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalComponentDefinition.g:3027:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalComponentDefinition.g:3028:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalComponentDefinition.g:3028:3: (kw= '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==68) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalComponentDefinition.g:3029:4: kw= '-'
                    {
                    kw=(Token)match(input,68,FOLLOW_42); 

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
    // InternalComponentDefinition.g:3046:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalComponentDefinition.g:3046:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalComponentDefinition.g:3047:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalComponentDefinition.g:3053:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3059:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalComponentDefinition.g:3060:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalComponentDefinition.g:3060:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalComponentDefinition.g:3061:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalComponentDefinition.g:3061:3: (kw= '-' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==68) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalComponentDefinition.g:3062:4: kw= '-'
                    {
                    kw=(Token)match(input,68,FOLLOW_43); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalComponentDefinition.g:3068:3: (this_INT_1= RULE_INT )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_INT) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalComponentDefinition.g:3069:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_44); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,66,FOLLOW_42); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_45); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalComponentDefinition.g:3089:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=69 && LA58_0<=70)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalComponentDefinition.g:3090:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalComponentDefinition.g:3090:4: (kw= 'E' | kw= 'e' )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==69) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==70) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalComponentDefinition.g:3091:5: kw= 'E'
                            {
                            kw=(Token)match(input,69,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalComponentDefinition.g:3097:5: kw= 'e'
                            {
                            kw=(Token)match(input,70,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalComponentDefinition.g:3103:4: (kw= '-' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==68) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalComponentDefinition.g:3104:5: kw= '-'
                            {
                            kw=(Token)match(input,68,FOLLOW_42); 

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
    // InternalComponentDefinition.g:3122:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalComponentDefinition.g:3122:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalComponentDefinition.g:3123:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalComponentDefinition.g:3129:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3135:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalComponentDefinition.g:3136:2: (kw= 'true' | kw= 'false' )
            {
            // InternalComponentDefinition.g:3136:2: (kw= 'true' | kw= 'false' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==71) ) {
                alt59=1;
            }
            else if ( (LA59_0==72) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalComponentDefinition.g:3137:3: kw= 'true'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:3143:3: kw= 'false'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

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
    // InternalComponentDefinition.g:3152:1: entryRuleACE_SmartSoft returns [EObject current=null] : iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF ;
    public final EObject entryRuleACE_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACE_SmartSoft = null;


        try {
            // InternalComponentDefinition.g:3152:54: (iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF )
            // InternalComponentDefinition.g:3153:2: iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF
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
    // InternalComponentDefinition.g:3159:1: ruleACE_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleACE_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3165:2: ( ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentDefinition.g:3166:2: ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentDefinition.g:3166:2: ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentDefinition.g:3167:3: () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentDefinition.g:3167:3: ()
            // InternalComponentDefinition.g:3168:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1());
            		
            // InternalComponentDefinition.g:3178:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==74) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalComponentDefinition.g:3179:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,74,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:3183:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentDefinition.g:3184:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentDefinition.g:3184:5: (lv_description_3_0= ruleEString )
                    // InternalComponentDefinition.g:3185:6: lv_description_3_0= ruleEString
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
    // InternalComponentDefinition.g:3207:1: entryRuleOpcUa_SeRoNet returns [EObject current=null] : iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF ;
    public final EObject entryRuleOpcUa_SeRoNet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUa_SeRoNet = null;


        try {
            // InternalComponentDefinition.g:3207:54: (iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF )
            // InternalComponentDefinition.g:3208:2: iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF
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
    // InternalComponentDefinition.g:3214:1: ruleOpcUa_SeRoNet returns [EObject current=null] : ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleOpcUa_SeRoNet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3220:2: ( ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentDefinition.g:3221:2: ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentDefinition.g:3221:2: ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentDefinition.g:3222:3: () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentDefinition.g:3222:3: ()
            // InternalComponentDefinition.g:3223:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1());
            		
            // InternalComponentDefinition.g:3233:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==74) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalComponentDefinition.g:3234:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,74,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:3238:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentDefinition.g:3239:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentDefinition.g:3239:5: (lv_description_3_0= ruleEString )
                    // InternalComponentDefinition.g:3240:6: lv_description_3_0= ruleEString
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
    // InternalComponentDefinition.g:3262:1: entryRuleCORBA_SmartSoft returns [EObject current=null] : iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF ;
    public final EObject entryRuleCORBA_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCORBA_SmartSoft = null;


        try {
            // InternalComponentDefinition.g:3262:56: (iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF )
            // InternalComponentDefinition.g:3263:2: iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF
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
    // InternalComponentDefinition.g:3269:1: ruleCORBA_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleCORBA_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3275:2: ( ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentDefinition.g:3276:2: ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentDefinition.g:3276:2: ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentDefinition.g:3277:3: () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentDefinition.g:3277:3: ()
            // InternalComponentDefinition.g:3278:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1());
            		
            // InternalComponentDefinition.g:3288:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==74) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalComponentDefinition.g:3289:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,74,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:3293:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentDefinition.g:3294:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentDefinition.g:3294:5: (lv_description_3_0= ruleEString )
                    // InternalComponentDefinition.g:3295:6: lv_description_3_0= ruleEString
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
    // InternalComponentDefinition.g:3317:1: entryRuleDDS_SmartSoft returns [EObject current=null] : iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF ;
    public final EObject entryRuleDDS_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDS_SmartSoft = null;


        try {
            // InternalComponentDefinition.g:3317:54: (iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF )
            // InternalComponentDefinition.g:3318:2: iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF
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
    // InternalComponentDefinition.g:3324:1: ruleDDS_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleDDS_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3330:2: ( ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentDefinition.g:3331:2: ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentDefinition.g:3331:2: ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentDefinition.g:3332:3: () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentDefinition.g:3332:3: ()
            // InternalComponentDefinition.g:3333:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1());
            		
            // InternalComponentDefinition.g:3343:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==74) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalComponentDefinition.g:3344:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,74,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:3348:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentDefinition.g:3349:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentDefinition.g:3349:5: (lv_description_3_0= ruleEString )
                    // InternalComponentDefinition.g:3350:6: lv_description_3_0= ruleEString
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x80520000266B0000L,0x0000000000000001L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L,0x0000000000003A00L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00001823C0010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000182000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000003C0010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001C00010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000050000011000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000050000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000014L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001A00000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000C000000001002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x4380000001010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0400000000010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000001002L,0x0000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});

}
