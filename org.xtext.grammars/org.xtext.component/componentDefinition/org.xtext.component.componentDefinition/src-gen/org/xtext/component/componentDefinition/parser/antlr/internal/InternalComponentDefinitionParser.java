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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCU_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_WS", "RULE_ANY_OTHER", "'#import'", "';'", "'ComponentDefinition'", "'logo'", "'{'", "'}'", "'RequestPort'", "'implements'", "'OutputPort'", "'realizedBy'", "'AnswerPort'", "'InputPort'", "'SupportedMiddleware'", "'default'", "'Activity'", "'InputHandler'", "'triggeredFrom'", "'activeQueue'", "'RequestHandler'", "'RequestPortLink'", "'OpcUaClientLink'", "'MixedPortROSLink'", "'Observe'", "'InputPortLink'", "'optional'", "'oversamplingOk'", "'undersamplingOk'", "'ActivationConstraints'", "'configurable'", "'='", "'minActFreq'", "'Hz'", "'maxActFreq'", "'OperationModeBinding'", "'DefaultTrigger'", "'InputPortTrigger'", "'prescale'", "'PeriodicTimer'", "'ObservedElement'", "'OpcUaDeviceClient'", "'deviceURI'", "'autoConnect'", "'rootObjectPath'", "'opcuaXmlFile'", "'OpcUaReadServer'", "'dataProviderPort'", "'portNumber'", "'MixedPortROS'", "'MixedPortYARP'", "'CoordinationSlavePort'", "'SkillRealizationsRef'", "'with'", "'PublicOperationMode'", "'activates'", "'('", "','", "')'", "'PrivateOperationMode'", "'CoordinationMasterPort'", "'ComponentParameters'", "'slave'", "'.'", "'.*'", "'-'", "'E'", "'e'", "'true'", "'false'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'"
    };
    public static final int T__50=50;
    public static final int RULE_ML_DOCUMENTATION=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int RULE_DOCU_COMMENT=4;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_SL_DOCUMENTATION=11;
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
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
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
    // InternalComponentDefinition.g:79:1: entryRuleComponentDefModel returns [EObject current=null] : iv_ruleComponentDefModel= ruleComponentDefModel EOF ;
    public final EObject entryRuleComponentDefModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefModel = null;


        try {
            // InternalComponentDefinition.g:79:58: (iv_ruleComponentDefModel= ruleComponentDefModel EOF )
            // InternalComponentDefinition.g:80:2: iv_ruleComponentDefModel= ruleComponentDefModel EOF
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
    // InternalComponentDefinition.g:86:1: ruleComponentDefModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleServiceRepoImport ) )* ( (lv_component_2_0= ruleComponentDefinition ) )? ) ;
    public final EObject ruleComponentDefModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_component_2_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:92:2: ( ( () ( (lv_imports_1_0= ruleServiceRepoImport ) )* ( (lv_component_2_0= ruleComponentDefinition ) )? ) )
            // InternalComponentDefinition.g:93:2: ( () ( (lv_imports_1_0= ruleServiceRepoImport ) )* ( (lv_component_2_0= ruleComponentDefinition ) )? )
            {
            // InternalComponentDefinition.g:93:2: ( () ( (lv_imports_1_0= ruleServiceRepoImport ) )* ( (lv_component_2_0= ruleComponentDefinition ) )? )
            // InternalComponentDefinition.g:94:3: () ( (lv_imports_1_0= ruleServiceRepoImport ) )* ( (lv_component_2_0= ruleComponentDefinition ) )?
            {
            // InternalComponentDefinition.g:94:3: ()
            // InternalComponentDefinition.g:95:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentDefModelAccess().getComponentDefModelAction_0(),
            					current);
            			

            }

            // InternalComponentDefinition.g:101:3: ( (lv_imports_1_0= ruleServiceRepoImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalComponentDefinition.g:102:4: (lv_imports_1_0= ruleServiceRepoImport )
            	    {
            	    // InternalComponentDefinition.g:102:4: (lv_imports_1_0= ruleServiceRepoImport )
            	    // InternalComponentDefinition.g:103:5: lv_imports_1_0= ruleServiceRepoImport
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

            // InternalComponentDefinition.g:120:3: ( (lv_component_2_0= ruleComponentDefinition ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOCU_COMMENT||LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentDefinition.g:121:4: (lv_component_2_0= ruleComponentDefinition )
                    {
                    // InternalComponentDefinition.g:121:4: (lv_component_2_0= ruleComponentDefinition )
                    // InternalComponentDefinition.g:122:5: lv_component_2_0= ruleComponentDefinition
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
    // InternalComponentDefinition.g:143:1: entryRuleServiceRepoImport returns [EObject current=null] : iv_ruleServiceRepoImport= ruleServiceRepoImport EOF ;
    public final EObject entryRuleServiceRepoImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceRepoImport = null;


        try {
            // InternalComponentDefinition.g:143:58: (iv_ruleServiceRepoImport= ruleServiceRepoImport EOF )
            // InternalComponentDefinition.g:144:2: iv_ruleServiceRepoImport= ruleServiceRepoImport EOF
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
    // InternalComponentDefinition.g:150:1: ruleServiceRepoImport returns [EObject current=null] : (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleServiceRepoImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:156:2: ( (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:157:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:157:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:158:3: otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceRepoImportAccess().getImportKeyword_0());
            		
            // InternalComponentDefinition.g:162:3: ( (lv_importedNamespace_1_0= ruleFQNW ) )
            // InternalComponentDefinition.g:163:4: (lv_importedNamespace_1_0= ruleFQNW )
            {
            // InternalComponentDefinition.g:163:4: (lv_importedNamespace_1_0= ruleFQNW )
            // InternalComponentDefinition.g:164:5: lv_importedNamespace_1_0= ruleFQNW
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

            // InternalComponentDefinition.g:181:3: (otherlv_2= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentDefinition.g:182:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:191:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // InternalComponentDefinition.g:191:60: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // InternalComponentDefinition.g:192:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
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
    // InternalComponentDefinition.g:198:1: ruleComponentDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ComponentDefinition' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'logo' ( (lv_logo_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractComponentElement ) )* otherlv_7= '}' ) ;
    public final EObject ruleComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_logo_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:204:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ComponentDefinition' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'logo' ( (lv_logo_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractComponentElement ) )* otherlv_7= '}' ) )
            // InternalComponentDefinition.g:205:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ComponentDefinition' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'logo' ( (lv_logo_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractComponentElement ) )* otherlv_7= '}' )
            {
            // InternalComponentDefinition.g:205:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ComponentDefinition' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'logo' ( (lv_logo_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractComponentElement ) )* otherlv_7= '}' )
            // InternalComponentDefinition.g:206:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ComponentDefinition' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'logo' ( (lv_logo_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractComponentElement ) )* otherlv_7= '}'
            {
            // InternalComponentDefinition.g:206:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOCU_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentDefinition.g:207:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentDefinition.g:207:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentDefinition.g:208:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_6); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getComponentDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentDefinitionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_0_0,
                    						"org.xtext.base.docuterminals.DocuTerminals.DOCU_COMMENT");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentDefinitionAccess().getComponentDefinitionKeyword_1());
            		
            // InternalComponentDefinition.g:228:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentDefinition.g:229:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentDefinition.g:229:4: (lv_name_2_0= RULE_ID )
            // InternalComponentDefinition.g:230:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getComponentDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalComponentDefinition.g:246:3: (otherlv_3= 'logo' ( (lv_logo_4_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentDefinition.g:247:4: otherlv_3= 'logo' ( (lv_logo_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentDefinitionAccess().getLogoKeyword_3_0());
                    			
                    // InternalComponentDefinition.g:251:4: ( (lv_logo_4_0= RULE_STRING ) )
                    // InternalComponentDefinition.g:252:5: (lv_logo_4_0= RULE_STRING )
                    {
                    // InternalComponentDefinition.g:252:5: (lv_logo_4_0= RULE_STRING )
                    // InternalComponentDefinition.g:253:6: lv_logo_4_0= RULE_STRING
                    {
                    lv_logo_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_logo_4_0, grammarAccess.getComponentDefinitionAccess().getLogoSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"logo",
                    							lv_logo_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalComponentDefinition.g:274:3: ( (lv_elements_6_0= ruleAbstractComponentElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_DOCU_COMMENT||LA6_0==20||LA6_0==22||(LA6_0>=24 && LA6_0<=25)||(LA6_0>=28 && LA6_0<=29)||LA6_0==32||LA6_0==53||LA6_0==58||(LA6_0>=61 && LA6_0<=63)||(LA6_0>=72 && LA6_0<=73)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalComponentDefinition.g:275:4: (lv_elements_6_0= ruleAbstractComponentElement )
            	    {
            	    // InternalComponentDefinition.g:275:4: (lv_elements_6_0= ruleAbstractComponentElement )
            	    // InternalComponentDefinition.g:276:5: lv_elements_6_0= ruleAbstractComponentElement
            	    {

            	    					newCompositeNode(grammarAccess.getComponentDefinitionAccess().getElementsAbstractComponentElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_elements_6_0=ruleAbstractComponentElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_6_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.AbstractComponentElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalComponentDefinition.g:301:1: entryRuleAbstractComponentElement returns [EObject current=null] : iv_ruleAbstractComponentElement= ruleAbstractComponentElement EOF ;
    public final EObject entryRuleAbstractComponentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponentElement = null;


        try {
            // InternalComponentDefinition.g:301:65: (iv_ruleAbstractComponentElement= ruleAbstractComponentElement EOF )
            // InternalComponentDefinition.g:302:2: iv_ruleAbstractComponentElement= ruleAbstractComponentElement EOF
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
    // InternalComponentDefinition.g:308:1: ruleAbstractComponentElement returns [EObject current=null] : (this_NamedComponentElement_0= ruleNamedComponentElement | this_DerivedComponentElement_1= ruleDerivedComponentElement | this_PlainOpcUaPort_2= rulePlainOpcUaPort ) ;
    public final EObject ruleAbstractComponentElement() throws RecognitionException {
        EObject current = null;

        EObject this_NamedComponentElement_0 = null;

        EObject this_DerivedComponentElement_1 = null;

        EObject this_PlainOpcUaPort_2 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:314:2: ( (this_NamedComponentElement_0= ruleNamedComponentElement | this_DerivedComponentElement_1= ruleDerivedComponentElement | this_PlainOpcUaPort_2= rulePlainOpcUaPort ) )
            // InternalComponentDefinition.g:315:2: (this_NamedComponentElement_0= ruleNamedComponentElement | this_DerivedComponentElement_1= ruleDerivedComponentElement | this_PlainOpcUaPort_2= rulePlainOpcUaPort )
            {
            // InternalComponentDefinition.g:315:2: (this_NamedComponentElement_0= ruleNamedComponentElement | this_DerivedComponentElement_1= ruleDerivedComponentElement | this_PlainOpcUaPort_2= rulePlainOpcUaPort )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
            case 20:
            case 22:
            case 24:
            case 25:
            case 28:
            case 29:
            case 32:
            case 63:
            case 72:
                {
                alt7=1;
                }
                break;
            case 61:
            case 62:
            case 73:
                {
                alt7=2;
                }
                break;
            case 53:
            case 58:
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
                    // InternalComponentDefinition.g:316:3: this_NamedComponentElement_0= ruleNamedComponentElement
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
                    // InternalComponentDefinition.g:325:3: this_DerivedComponentElement_1= ruleDerivedComponentElement
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
                    // InternalComponentDefinition.g:334:3: this_PlainOpcUaPort_2= rulePlainOpcUaPort
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
    // InternalComponentDefinition.g:346:1: entryRuleDerivedComponentElement returns [EObject current=null] : iv_ruleDerivedComponentElement= ruleDerivedComponentElement EOF ;
    public final EObject entryRuleDerivedComponentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedComponentElement = null;


        try {
            // InternalComponentDefinition.g:346:64: (iv_ruleDerivedComponentElement= ruleDerivedComponentElement EOF )
            // InternalComponentDefinition.g:347:2: iv_ruleDerivedComponentElement= ruleDerivedComponentElement EOF
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
    // InternalComponentDefinition.g:353:1: ruleDerivedComponentElement returns [EObject current=null] : (this_ComponentParametersRef_0= ruleComponentParametersRef | this_MixedPortROS_1= ruleMixedPortROS | this_MixedPortYARP_2= ruleMixedPortYARP ) ;
    public final EObject ruleDerivedComponentElement() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentParametersRef_0 = null;

        EObject this_MixedPortROS_1 = null;

        EObject this_MixedPortYARP_2 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:359:2: ( (this_ComponentParametersRef_0= ruleComponentParametersRef | this_MixedPortROS_1= ruleMixedPortROS | this_MixedPortYARP_2= ruleMixedPortYARP ) )
            // InternalComponentDefinition.g:360:2: (this_ComponentParametersRef_0= ruleComponentParametersRef | this_MixedPortROS_1= ruleMixedPortROS | this_MixedPortYARP_2= ruleMixedPortYARP )
            {
            // InternalComponentDefinition.g:360:2: (this_ComponentParametersRef_0= ruleComponentParametersRef | this_MixedPortROS_1= ruleMixedPortROS | this_MixedPortYARP_2= ruleMixedPortYARP )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt8=1;
                }
                break;
            case 61:
                {
                alt8=2;
                }
                break;
            case 62:
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
                    // InternalComponentDefinition.g:361:3: this_ComponentParametersRef_0= ruleComponentParametersRef
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
                    // InternalComponentDefinition.g:370:3: this_MixedPortROS_1= ruleMixedPortROS
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
                    // InternalComponentDefinition.g:379:3: this_MixedPortYARP_2= ruleMixedPortYARP
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
    // InternalComponentDefinition.g:391:1: entryRuleNamedComponentElement returns [EObject current=null] : iv_ruleNamedComponentElement= ruleNamedComponentElement EOF ;
    public final EObject entryRuleNamedComponentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedComponentElement = null;


        try {
            // InternalComponentDefinition.g:391:62: (iv_ruleNamedComponentElement= ruleNamedComponentElement EOF )
            // InternalComponentDefinition.g:392:2: iv_ruleNamedComponentElement= ruleNamedComponentElement EOF
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
    // InternalComponentDefinition.g:398:1: ruleNamedComponentElement returns [EObject current=null] : (this_ComponentSubNode_0= ruleComponentSubNode | this_ComponentPort_1= ruleComponentPort | this_CoordinationSlavePort_2= ruleCoordinationSlavePort | this_CoordinationMasterPort_3= ruleCoordinationMasterPort ) ;
    public final EObject ruleNamedComponentElement() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentSubNode_0 = null;

        EObject this_ComponentPort_1 = null;

        EObject this_CoordinationSlavePort_2 = null;

        EObject this_CoordinationMasterPort_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:404:2: ( (this_ComponentSubNode_0= ruleComponentSubNode | this_ComponentPort_1= ruleComponentPort | this_CoordinationSlavePort_2= ruleCoordinationSlavePort | this_CoordinationMasterPort_3= ruleCoordinationMasterPort ) )
            // InternalComponentDefinition.g:405:2: (this_ComponentSubNode_0= ruleComponentSubNode | this_ComponentPort_1= ruleComponentPort | this_CoordinationSlavePort_2= ruleCoordinationSlavePort | this_CoordinationMasterPort_3= ruleCoordinationMasterPort )
            {
            // InternalComponentDefinition.g:405:2: (this_ComponentSubNode_0= ruleComponentSubNode | this_ComponentPort_1= ruleComponentPort | this_CoordinationSlavePort_2= ruleCoordinationSlavePort | this_CoordinationMasterPort_3= ruleCoordinationMasterPort )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
            case 32:
                {
                alt9=1;
                }
                break;
            case RULE_DOCU_COMMENT:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==20||LA9_2==22||(LA9_2>=24 && LA9_2<=25)) ) {
                    alt9=2;
                }
                else if ( (LA9_2==63) ) {
                    alt9=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
            case 22:
            case 24:
            case 25:
                {
                alt9=2;
                }
                break;
            case 63:
                {
                alt9=3;
                }
                break;
            case 72:
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
                    // InternalComponentDefinition.g:406:3: this_ComponentSubNode_0= ruleComponentSubNode
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
                    // InternalComponentDefinition.g:415:3: this_ComponentPort_1= ruleComponentPort
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
                    // InternalComponentDefinition.g:424:3: this_CoordinationSlavePort_2= ruleCoordinationSlavePort
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
                    // InternalComponentDefinition.g:433:3: this_CoordinationMasterPort_3= ruleCoordinationMasterPort
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
    // InternalComponentDefinition.g:445:1: entryRuleComponentSubNode returns [EObject current=null] : iv_ruleComponentSubNode= ruleComponentSubNode EOF ;
    public final EObject entryRuleComponentSubNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentSubNode = null;


        try {
            // InternalComponentDefinition.g:445:57: (iv_ruleComponentSubNode= ruleComponentSubNode EOF )
            // InternalComponentDefinition.g:446:2: iv_ruleComponentSubNode= ruleComponentSubNode EOF
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
    // InternalComponentDefinition.g:452:1: ruleComponentSubNode returns [EObject current=null] : (this_Activity_0= ruleActivity | this_InputHandler_1= ruleInputHandler | this_RequestHandler_2= ruleRequestHandler ) ;
    public final EObject ruleComponentSubNode() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_InputHandler_1 = null;

        EObject this_RequestHandler_2 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:458:2: ( (this_Activity_0= ruleActivity | this_InputHandler_1= ruleInputHandler | this_RequestHandler_2= ruleRequestHandler ) )
            // InternalComponentDefinition.g:459:2: (this_Activity_0= ruleActivity | this_InputHandler_1= ruleInputHandler | this_RequestHandler_2= ruleRequestHandler )
            {
            // InternalComponentDefinition.g:459:2: (this_Activity_0= ruleActivity | this_InputHandler_1= ruleInputHandler | this_RequestHandler_2= ruleRequestHandler )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalComponentDefinition.g:460:3: this_Activity_0= ruleActivity
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
                    // InternalComponentDefinition.g:469:3: this_InputHandler_1= ruleInputHandler
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
                    // InternalComponentDefinition.g:478:3: this_RequestHandler_2= ruleRequestHandler
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
    // InternalComponentDefinition.g:490:1: entryRuleComponentPort returns [EObject current=null] : iv_ruleComponentPort= ruleComponentPort EOF ;
    public final EObject entryRuleComponentPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentPort = null;


        try {
            // InternalComponentDefinition.g:490:54: (iv_ruleComponentPort= ruleComponentPort EOF )
            // InternalComponentDefinition.g:491:2: iv_ruleComponentPort= ruleComponentPort EOF
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
    // InternalComponentDefinition.g:497:1: ruleComponentPort returns [EObject current=null] : (this_InputPort_0= ruleInputPort | this_AnswerPort_1= ruleAnswerPort | this_OutputPort_2= ruleOutputPort | this_RequestPort_3= ruleRequestPort ) ;
    public final EObject ruleComponentPort() throws RecognitionException {
        EObject current = null;

        EObject this_InputPort_0 = null;

        EObject this_AnswerPort_1 = null;

        EObject this_OutputPort_2 = null;

        EObject this_RequestPort_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:503:2: ( (this_InputPort_0= ruleInputPort | this_AnswerPort_1= ruleAnswerPort | this_OutputPort_2= ruleOutputPort | this_RequestPort_3= ruleRequestPort ) )
            // InternalComponentDefinition.g:504:2: (this_InputPort_0= ruleInputPort | this_AnswerPort_1= ruleAnswerPort | this_OutputPort_2= ruleOutputPort | this_RequestPort_3= ruleRequestPort )
            {
            // InternalComponentDefinition.g:504:2: (this_InputPort_0= ruleInputPort | this_AnswerPort_1= ruleAnswerPort | this_OutputPort_2= ruleOutputPort | this_RequestPort_3= ruleRequestPort )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    alt11=3;
                    }
                    break;
                case 20:
                    {
                    alt11=4;
                    }
                    break;
                case 25:
                    {
                    alt11=1;
                    }
                    break;
                case 24:
                    {
                    alt11=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

                }
                break;
            case 25:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 22:
                {
                alt11=3;
                }
                break;
            case 20:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalComponentDefinition.g:505:3: this_InputPort_0= ruleInputPort
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
                    // InternalComponentDefinition.g:514:3: this_AnswerPort_1= ruleAnswerPort
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
                    // InternalComponentDefinition.g:523:3: this_OutputPort_2= ruleOutputPort
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
                    // InternalComponentDefinition.g:532:3: this_RequestPort_3= ruleRequestPort
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
    // InternalComponentDefinition.g:544:1: entryRuleRequestPort returns [EObject current=null] : iv_ruleRequestPort= ruleRequestPort EOF ;
    public final EObject entryRuleRequestPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestPort = null;


        try {
            // InternalComponentDefinition.g:544:52: (iv_ruleRequestPort= ruleRequestPort EOF )
            // InternalComponentDefinition.g:545:2: iv_ruleRequestPort= ruleRequestPort EOF
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
    // InternalComponentDefinition.g:551:1: ruleRequestPort returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'RequestPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}' ) ;
    public final EObject ruleRequestPort() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_extensions_6_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:557:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'RequestPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}' ) )
            // InternalComponentDefinition.g:558:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'RequestPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}' )
            {
            // InternalComponentDefinition.g:558:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'RequestPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}' )
            // InternalComponentDefinition.g:559:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'RequestPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}'
            {
            // InternalComponentDefinition.g:559:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DOCU_COMMENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentDefinition.g:560:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentDefinition.g:560:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentDefinition.g:561:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_11); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getRequestPortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRequestPortRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_0_0,
                    						"org.xtext.base.docuterminals.DocuTerminals.DOCU_COMMENT");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRequestPortAccess().getRequestPortKeyword_1());
            		
            // InternalComponentDefinition.g:581:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentDefinition.g:582:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentDefinition.g:582:4: (lv_name_2_0= RULE_ID )
            // InternalComponentDefinition.g:583:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRequestPortAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRequestPortAccess().getImplementsKeyword_3());
            		
            // InternalComponentDefinition.g:603:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:604:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:604:4: ( ruleFQN )
            // InternalComponentDefinition.g:605:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getRequestPortAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalComponentDefinition.g:623:3: ( (lv_extensions_6_0= ruleComponentPortExtension ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalComponentDefinition.g:624:4: (lv_extensions_6_0= ruleComponentPortExtension )
            	    {
            	    // InternalComponentDefinition.g:624:4: (lv_extensions_6_0= ruleComponentPortExtension )
            	    // InternalComponentDefinition.g:625:5: lv_extensions_6_0= ruleComponentPortExtension
            	    {

            	    					newCompositeNode(grammarAccess.getRequestPortAccess().getExtensionsComponentPortExtensionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_extensions_6_0=ruleComponentPortExtension();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequestPortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_6_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.ComponentPortExtension");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRequestPortAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalComponentDefinition.g:650:1: entryRuleOutputPort returns [EObject current=null] : iv_ruleOutputPort= ruleOutputPort EOF ;
    public final EObject entryRuleOutputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPort = null;


        try {
            // InternalComponentDefinition.g:650:51: (iv_ruleOutputPort= ruleOutputPort EOF )
            // InternalComponentDefinition.g:651:2: iv_ruleOutputPort= ruleOutputPort EOF
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
    // InternalComponentDefinition.g:657:1: ruleOutputPort returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'OutputPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= 'realizedBy' ( ( ruleFQN ) ) otherlv_7= '{' ( (lv_extensions_8_0= ruleComponentPortExtension ) )* otherlv_9= '}' ) ;
    public final EObject ruleOutputPort() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_extensions_8_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:663:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'OutputPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= 'realizedBy' ( ( ruleFQN ) ) otherlv_7= '{' ( (lv_extensions_8_0= ruleComponentPortExtension ) )* otherlv_9= '}' ) )
            // InternalComponentDefinition.g:664:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'OutputPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= 'realizedBy' ( ( ruleFQN ) ) otherlv_7= '{' ( (lv_extensions_8_0= ruleComponentPortExtension ) )* otherlv_9= '}' )
            {
            // InternalComponentDefinition.g:664:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'OutputPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= 'realizedBy' ( ( ruleFQN ) ) otherlv_7= '{' ( (lv_extensions_8_0= ruleComponentPortExtension ) )* otherlv_9= '}' )
            // InternalComponentDefinition.g:665:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'OutputPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= 'realizedBy' ( ( ruleFQN ) ) otherlv_7= '{' ( (lv_extensions_8_0= ruleComponentPortExtension ) )* otherlv_9= '}'
            {
            // InternalComponentDefinition.g:665:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DOCU_COMMENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentDefinition.g:666:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentDefinition.g:666:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentDefinition.g:667:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_14); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getOutputPortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOutputPortRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_0_0,
                    						"org.xtext.base.docuterminals.DocuTerminals.DOCU_COMMENT");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputPortAccess().getOutputPortKeyword_1());
            		
            // InternalComponentDefinition.g:687:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentDefinition.g:688:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentDefinition.g:688:4: (lv_name_2_0= RULE_ID )
            // InternalComponentDefinition.g:689:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOutputPortAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputPortAccess().getImplementsKeyword_3());
            		
            // InternalComponentDefinition.g:709:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:710:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:710:4: ( ruleFQN )
            // InternalComponentDefinition.g:711:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceCrossReference_4_0());
            				
            pushFollow(FOLLOW_15);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getOutputPortAccess().getRealizedByKeyword_5());
            		
            // InternalComponentDefinition.g:729:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:730:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:730:4: ( ruleFQN )
            // InternalComponentDefinition.g:731:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOutputPortAccess().getActivityActivityCrossReference_6_0());
            				
            pushFollow(FOLLOW_9);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalComponentDefinition.g:749:3: ( (lv_extensions_8_0= ruleComponentPortExtension ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalComponentDefinition.g:750:4: (lv_extensions_8_0= ruleComponentPortExtension )
            	    {
            	    // InternalComponentDefinition.g:750:4: (lv_extensions_8_0= ruleComponentPortExtension )
            	    // InternalComponentDefinition.g:751:5: lv_extensions_8_0= ruleComponentPortExtension
            	    {

            	    					newCompositeNode(grammarAccess.getOutputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_extensions_8_0=ruleComponentPortExtension();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOutputPortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_8_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.ComponentPortExtension");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalComponentDefinition.g:776:1: entryRuleAnswerPort returns [EObject current=null] : iv_ruleAnswerPort= ruleAnswerPort EOF ;
    public final EObject entryRuleAnswerPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerPort = null;


        try {
            // InternalComponentDefinition.g:776:51: (iv_ruleAnswerPort= ruleAnswerPort EOF )
            // InternalComponentDefinition.g:777:2: iv_ruleAnswerPort= ruleAnswerPort EOF
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
    // InternalComponentDefinition.g:783:1: ruleAnswerPort returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'AnswerPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}' ) ;
    public final EObject ruleAnswerPort() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_extensions_6_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:789:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'AnswerPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}' ) )
            // InternalComponentDefinition.g:790:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'AnswerPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}' )
            {
            // InternalComponentDefinition.g:790:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'AnswerPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}' )
            // InternalComponentDefinition.g:791:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'AnswerPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}'
            {
            // InternalComponentDefinition.g:791:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DOCU_COMMENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentDefinition.g:792:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentDefinition.g:792:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentDefinition.g:793:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_16); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getAnswerPortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAnswerPortRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_0_0,
                    						"org.xtext.base.docuterminals.DocuTerminals.DOCU_COMMENT");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAnswerPortAccess().getAnswerPortKeyword_1());
            		
            // InternalComponentDefinition.g:813:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentDefinition.g:814:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentDefinition.g:814:4: (lv_name_2_0= RULE_ID )
            // InternalComponentDefinition.g:815:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAnswerPortAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnswerPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAnswerPortAccess().getImplementsKeyword_3());
            		
            // InternalComponentDefinition.g:835:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:836:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:836:4: ( ruleFQN )
            // InternalComponentDefinition.g:837:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnswerPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getAnswerPortAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalComponentDefinition.g:855:3: ( (lv_extensions_6_0= ruleComponentPortExtension ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalComponentDefinition.g:856:4: (lv_extensions_6_0= ruleComponentPortExtension )
            	    {
            	    // InternalComponentDefinition.g:856:4: (lv_extensions_6_0= ruleComponentPortExtension )
            	    // InternalComponentDefinition.g:857:5: lv_extensions_6_0= ruleComponentPortExtension
            	    {

            	    					newCompositeNode(grammarAccess.getAnswerPortAccess().getExtensionsComponentPortExtensionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_extensions_6_0=ruleComponentPortExtension();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnswerPortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_6_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.ComponentPortExtension");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAnswerPortAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalComponentDefinition.g:882:1: entryRuleInputPort returns [EObject current=null] : iv_ruleInputPort= ruleInputPort EOF ;
    public final EObject entryRuleInputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPort = null;


        try {
            // InternalComponentDefinition.g:882:50: (iv_ruleInputPort= ruleInputPort EOF )
            // InternalComponentDefinition.g:883:2: iv_ruleInputPort= ruleInputPort EOF
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
    // InternalComponentDefinition.g:889:1: ruleInputPort returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'InputPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}' ) ;
    public final EObject ruleInputPort() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_extensions_6_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:895:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'InputPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}' ) )
            // InternalComponentDefinition.g:896:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'InputPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}' )
            {
            // InternalComponentDefinition.g:896:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'InputPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}' )
            // InternalComponentDefinition.g:897:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'InputPort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_extensions_6_0= ruleComponentPortExtension ) )* otherlv_7= '}'
            {
            // InternalComponentDefinition.g:897:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DOCU_COMMENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentDefinition.g:898:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentDefinition.g:898:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentDefinition.g:899:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_17); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getInputPortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputPortRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_0_0,
                    						"org.xtext.base.docuterminals.DocuTerminals.DOCU_COMMENT");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInputPortAccess().getInputPortKeyword_1());
            		
            // InternalComponentDefinition.g:919:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentDefinition.g:920:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentDefinition.g:920:4: (lv_name_2_0= RULE_ID )
            // InternalComponentDefinition.g:921:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInputPortAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getInputPortAccess().getImplementsKeyword_3());
            		
            // InternalComponentDefinition.g:941:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:942:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:942:4: ( ruleFQN )
            // InternalComponentDefinition.g:943:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalComponentDefinition.g:961:3: ( (lv_extensions_6_0= ruleComponentPortExtension ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalComponentDefinition.g:962:4: (lv_extensions_6_0= ruleComponentPortExtension )
            	    {
            	    // InternalComponentDefinition.g:962:4: (lv_extensions_6_0= ruleComponentPortExtension )
            	    // InternalComponentDefinition.g:963:5: lv_extensions_6_0= ruleComponentPortExtension
            	    {

            	    					newCompositeNode(grammarAccess.getInputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_extensions_6_0=ruleComponentPortExtension();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInputPortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"extensions",
            	    						lv_extensions_6_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.ComponentPortExtension");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalComponentDefinition.g:988:1: entryRuleComponentPortExtension returns [EObject current=null] : iv_ruleComponentPortExtension= ruleComponentPortExtension EOF ;
    public final EObject entryRuleComponentPortExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentPortExtension = null;


        try {
            // InternalComponentDefinition.g:988:63: (iv_ruleComponentPortExtension= ruleComponentPortExtension EOF )
            // InternalComponentDefinition.g:989:2: iv_ruleComponentPortExtension= ruleComponentPortExtension EOF
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
    // InternalComponentDefinition.g:995:1: ruleComponentPortExtension returns [EObject current=null] : this_SupportedMiddleware_0= ruleSupportedMiddleware ;
    public final EObject ruleComponentPortExtension() throws RecognitionException {
        EObject current = null;

        EObject this_SupportedMiddleware_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1001:2: (this_SupportedMiddleware_0= ruleSupportedMiddleware )
            // InternalComponentDefinition.g:1002:2: this_SupportedMiddleware_0= ruleSupportedMiddleware
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
    // InternalComponentDefinition.g:1013:1: entryRuleSupportedMiddleware returns [EObject current=null] : iv_ruleSupportedMiddleware= ruleSupportedMiddleware EOF ;
    public final EObject entryRuleSupportedMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportedMiddleware = null;


        try {
            // InternalComponentDefinition.g:1013:60: (iv_ruleSupportedMiddleware= ruleSupportedMiddleware EOF )
            // InternalComponentDefinition.g:1014:2: iv_ruleSupportedMiddleware= ruleSupportedMiddleware EOF
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
    // InternalComponentDefinition.g:1020:1: ruleSupportedMiddleware returns [EObject current=null] : (otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleSupportedMiddleware() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_default_1_0=null;
        Token otherlv_3=null;
        EObject lv_middleware_2_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1026:2: ( (otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )? ) )
            // InternalComponentDefinition.g:1027:2: (otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )? )
            {
            // InternalComponentDefinition.g:1027:2: (otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )? )
            // InternalComponentDefinition.g:1028:3: otherlv_0= 'SupportedMiddleware' ( (lv_default_1_0= 'default' ) )? ( (lv_middleware_2_0= ruleRoboticMiddleware ) ) (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSupportedMiddlewareAccess().getSupportedMiddlewareKeyword_0());
            		
            // InternalComponentDefinition.g:1032:3: ( (lv_default_1_0= 'default' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentDefinition.g:1033:4: (lv_default_1_0= 'default' )
                    {
                    // InternalComponentDefinition.g:1033:4: (lv_default_1_0= 'default' )
                    // InternalComponentDefinition.g:1034:5: lv_default_1_0= 'default'
                    {
                    lv_default_1_0=(Token)match(input,27,FOLLOW_18); 

                    					newLeafNode(lv_default_1_0, grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSupportedMiddlewareRule());
                    					}
                    					setWithLastConsumed(current, "default", true, "default");
                    				

                    }


                    }
                    break;

            }

            // InternalComponentDefinition.g:1046:3: ( (lv_middleware_2_0= ruleRoboticMiddleware ) )
            // InternalComponentDefinition.g:1047:4: (lv_middleware_2_0= ruleRoboticMiddleware )
            {
            // InternalComponentDefinition.g:1047:4: (lv_middleware_2_0= ruleRoboticMiddleware )
            // InternalComponentDefinition.g:1048:5: lv_middleware_2_0= ruleRoboticMiddleware
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

            // InternalComponentDefinition.g:1065:3: (otherlv_3= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentDefinition.g:1066:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:1075:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalComponentDefinition.g:1075:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalComponentDefinition.g:1076:2: iv_ruleActivity= ruleActivity EOF
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
    // InternalComponentDefinition.g:1082:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' ) ;
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
            // InternalComponentDefinition.g:1088:2: ( (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' ) )
            // InternalComponentDefinition.g:1089:2: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' )
            {
            // InternalComponentDefinition.g:1089:2: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}' )
            // InternalComponentDefinition.g:1090:3: otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_links_3_0= ruleAbstractComponentLink ) )* ( (lv_extensions_4_0= ruleActivityExtension ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
            		
            // InternalComponentDefinition.g:1094:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:1095:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:1095:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:1096:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentDefinition.g:1116:3: ( (lv_links_3_0= ruleAbstractComponentLink ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=33 && LA22_0<=37)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalComponentDefinition.g:1117:4: (lv_links_3_0= ruleAbstractComponentLink )
            	    {
            	    // InternalComponentDefinition.g:1117:4: (lv_links_3_0= ruleAbstractComponentLink )
            	    // InternalComponentDefinition.g:1118:5: lv_links_3_0= ruleAbstractComponentLink
            	    {

            	    					newCompositeNode(grammarAccess.getActivityAccess().getLinksAbstractComponentLinkParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop22;
                }
            } while (true);

            // InternalComponentDefinition.g:1135:3: ( (lv_extensions_4_0= ruleActivityExtension ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41||(LA23_0>=47 && LA23_0<=48)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalComponentDefinition.g:1136:4: (lv_extensions_4_0= ruleActivityExtension )
            	    {
            	    // InternalComponentDefinition.g:1136:4: (lv_extensions_4_0= ruleActivityExtension )
            	    // InternalComponentDefinition.g:1137:5: lv_extensions_4_0= ruleActivityExtension
            	    {

            	    					newCompositeNode(grammarAccess.getActivityAccess().getExtensionsActivityExtensionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop23;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:1162:1: entryRuleInputHandler returns [EObject current=null] : iv_ruleInputHandler= ruleInputHandler EOF ;
    public final EObject entryRuleInputHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputHandler = null;


        try {
            // InternalComponentDefinition.g:1162:53: (iv_ruleInputHandler= ruleInputHandler EOF )
            // InternalComponentDefinition.g:1163:2: iv_ruleInputHandler= ruleInputHandler EOF
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
    // InternalComponentDefinition.g:1169:1: ruleInputHandler returns [EObject current=null] : (otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' ) ;
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
            // InternalComponentDefinition.g:1175:2: ( (otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' ) )
            // InternalComponentDefinition.g:1176:2: (otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' )
            {
            // InternalComponentDefinition.g:1176:2: (otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' )
            // InternalComponentDefinition.g:1177:3: otherlv_0= 'InputHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInputHandlerAccess().getInputHandlerKeyword_0());
            		
            // InternalComponentDefinition.g:1181:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:1182:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:1182:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:1183:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_2=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInputHandlerAccess().getTriggeredFromKeyword_2());
            		
            // InternalComponentDefinition.g:1203:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1204:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1204:4: ( ruleFQN )
            // InternalComponentDefinition.g:1205:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputHandlerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInputHandlerAccess().getInputPortInputPortCrossReference_3_0());
            				
            pushFollow(FOLLOW_22);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:1219:3: ( (lv_activeQueue_4_0= 'activeQueue' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentDefinition.g:1220:4: (lv_activeQueue_4_0= 'activeQueue' )
                    {
                    // InternalComponentDefinition.g:1220:4: (lv_activeQueue_4_0= 'activeQueue' )
                    // InternalComponentDefinition.g:1221:5: lv_activeQueue_4_0= 'activeQueue'
                    {
                    lv_activeQueue_4_0=(Token)match(input,31,FOLLOW_9); 

                    					newLeafNode(lv_activeQueue_4_0, grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputHandlerRule());
                    					}
                    					setWithLastConsumed(current, "activeQueue", true, "activeQueue");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getInputHandlerAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalComponentDefinition.g:1237:3: ( (lv_links_6_0= ruleAbstractComponentLink ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=33 && LA25_0<=37)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalComponentDefinition.g:1238:4: (lv_links_6_0= ruleAbstractComponentLink )
            	    {
            	    // InternalComponentDefinition.g:1238:4: (lv_links_6_0= ruleAbstractComponentLink )
            	    // InternalComponentDefinition.g:1239:5: lv_links_6_0= ruleAbstractComponentLink
            	    {

            	    					newCompositeNode(grammarAccess.getInputHandlerAccess().getLinksAbstractComponentLinkParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_23);
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
            	    break loop25;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:1264:1: entryRuleRequestHandler returns [EObject current=null] : iv_ruleRequestHandler= ruleRequestHandler EOF ;
    public final EObject entryRuleRequestHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestHandler = null;


        try {
            // InternalComponentDefinition.g:1264:55: (iv_ruleRequestHandler= ruleRequestHandler EOF )
            // InternalComponentDefinition.g:1265:2: iv_ruleRequestHandler= ruleRequestHandler EOF
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
    // InternalComponentDefinition.g:1271:1: ruleRequestHandler returns [EObject current=null] : (otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' ) ;
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
            // InternalComponentDefinition.g:1277:2: ( (otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' ) )
            // InternalComponentDefinition.g:1278:2: (otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' )
            {
            // InternalComponentDefinition.g:1278:2: (otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}' )
            // InternalComponentDefinition.g:1279:3: otherlv_0= 'RequestHandler' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggeredFrom' ( ( ruleFQN ) ) ( (lv_activeQueue_4_0= 'activeQueue' ) )? otherlv_5= '{' ( (lv_links_6_0= ruleAbstractComponentLink ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestHandlerAccess().getRequestHandlerKeyword_0());
            		
            // InternalComponentDefinition.g:1283:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:1284:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:1284:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:1285:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_2=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRequestHandlerAccess().getTriggeredFromKeyword_2());
            		
            // InternalComponentDefinition.g:1305:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1306:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1306:4: ( ruleFQN )
            // InternalComponentDefinition.g:1307:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestHandlerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequestHandlerAccess().getAnswerPortAnswerPortCrossReference_3_0());
            				
            pushFollow(FOLLOW_22);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:1321:3: ( (lv_activeQueue_4_0= 'activeQueue' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentDefinition.g:1322:4: (lv_activeQueue_4_0= 'activeQueue' )
                    {
                    // InternalComponentDefinition.g:1322:4: (lv_activeQueue_4_0= 'activeQueue' )
                    // InternalComponentDefinition.g:1323:5: lv_activeQueue_4_0= 'activeQueue'
                    {
                    lv_activeQueue_4_0=(Token)match(input,31,FOLLOW_9); 

                    					newLeafNode(lv_activeQueue_4_0, grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRequestHandlerRule());
                    					}
                    					setWithLastConsumed(current, "activeQueue", true, "activeQueue");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getRequestHandlerAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalComponentDefinition.g:1339:3: ( (lv_links_6_0= ruleAbstractComponentLink ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=33 && LA27_0<=37)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalComponentDefinition.g:1340:4: (lv_links_6_0= ruleAbstractComponentLink )
            	    {
            	    // InternalComponentDefinition.g:1340:4: (lv_links_6_0= ruleAbstractComponentLink )
            	    // InternalComponentDefinition.g:1341:5: lv_links_6_0= ruleAbstractComponentLink
            	    {

            	    					newCompositeNode(grammarAccess.getRequestHandlerAccess().getLinksAbstractComponentLinkParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_23);
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
            	    break loop27;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:1366:1: entryRuleAbstractComponentLink returns [EObject current=null] : iv_ruleAbstractComponentLink= ruleAbstractComponentLink EOF ;
    public final EObject entryRuleAbstractComponentLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponentLink = null;


        try {
            // InternalComponentDefinition.g:1366:62: (iv_ruleAbstractComponentLink= ruleAbstractComponentLink EOF )
            // InternalComponentDefinition.g:1367:2: iv_ruleAbstractComponentLink= ruleAbstractComponentLink EOF
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
    // InternalComponentDefinition.g:1373:1: ruleAbstractComponentLink returns [EObject current=null] : (this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver | this_RequestPortLink_1= ruleRequestPortLink | this_InputLinkExtension_2= ruleInputLinkExtension | this_OpcUaClientLink_3= ruleOpcUaClientLink | this_MixedPortROSLink_4= ruleMixedPortROSLink ) ;
    public final EObject ruleAbstractComponentLink() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentSubNodeObserver_0 = null;

        EObject this_RequestPortLink_1 = null;

        EObject this_InputLinkExtension_2 = null;

        EObject this_OpcUaClientLink_3 = null;

        EObject this_MixedPortROSLink_4 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1379:2: ( (this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver | this_RequestPortLink_1= ruleRequestPortLink | this_InputLinkExtension_2= ruleInputLinkExtension | this_OpcUaClientLink_3= ruleOpcUaClientLink | this_MixedPortROSLink_4= ruleMixedPortROSLink ) )
            // InternalComponentDefinition.g:1380:2: (this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver | this_RequestPortLink_1= ruleRequestPortLink | this_InputLinkExtension_2= ruleInputLinkExtension | this_OpcUaClientLink_3= ruleOpcUaClientLink | this_MixedPortROSLink_4= ruleMixedPortROSLink )
            {
            // InternalComponentDefinition.g:1380:2: (this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver | this_RequestPortLink_1= ruleRequestPortLink | this_InputLinkExtension_2= ruleInputLinkExtension | this_OpcUaClientLink_3= ruleOpcUaClientLink | this_MixedPortROSLink_4= ruleMixedPortROSLink )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt28=1;
                }
                break;
            case 33:
                {
                alt28=2;
                }
                break;
            case 37:
                {
                alt28=3;
                }
                break;
            case 34:
                {
                alt28=4;
                }
                break;
            case 35:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalComponentDefinition.g:1381:3: this_ComponentSubNodeObserver_0= ruleComponentSubNodeObserver
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
                    // InternalComponentDefinition.g:1390:3: this_RequestPortLink_1= ruleRequestPortLink
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
                    // InternalComponentDefinition.g:1399:3: this_InputLinkExtension_2= ruleInputLinkExtension
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
                    // InternalComponentDefinition.g:1408:3: this_OpcUaClientLink_3= ruleOpcUaClientLink
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
                    // InternalComponentDefinition.g:1417:3: this_MixedPortROSLink_4= ruleMixedPortROSLink
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
    // InternalComponentDefinition.g:1429:1: entryRuleRequestPortLink returns [EObject current=null] : iv_ruleRequestPortLink= ruleRequestPortLink EOF ;
    public final EObject entryRuleRequestPortLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestPortLink = null;


        try {
            // InternalComponentDefinition.g:1429:56: (iv_ruleRequestPortLink= ruleRequestPortLink EOF )
            // InternalComponentDefinition.g:1430:2: iv_ruleRequestPortLink= ruleRequestPortLink EOF
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
    // InternalComponentDefinition.g:1436:1: ruleRequestPortLink returns [EObject current=null] : (otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleRequestPortLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1442:2: ( (otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:1443:2: (otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:1443:2: (otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:1444:3: otherlv_0= 'RequestPortLink' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestPortLinkAccess().getRequestPortLinkKeyword_0());
            		
            // InternalComponentDefinition.g:1448:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1449:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1449:4: ( ruleFQN )
            // InternalComponentDefinition.g:1450:5: ruleFQN
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

            // InternalComponentDefinition.g:1464:3: (otherlv_2= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==15) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalComponentDefinition.g:1465:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:1474:1: entryRuleOpcUaClientLink returns [EObject current=null] : iv_ruleOpcUaClientLink= ruleOpcUaClientLink EOF ;
    public final EObject entryRuleOpcUaClientLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUaClientLink = null;


        try {
            // InternalComponentDefinition.g:1474:56: (iv_ruleOpcUaClientLink= ruleOpcUaClientLink EOF )
            // InternalComponentDefinition.g:1475:2: iv_ruleOpcUaClientLink= ruleOpcUaClientLink EOF
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
    // InternalComponentDefinition.g:1481:1: ruleOpcUaClientLink returns [EObject current=null] : (otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleOpcUaClientLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1487:2: ( (otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:1488:2: (otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:1488:2: (otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:1489:3: otherlv_0= 'OpcUaClientLink' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpcUaClientLinkAccess().getOpcUaClientLinkKeyword_0());
            		
            // InternalComponentDefinition.g:1493:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1494:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1494:4: ( ruleFQN )
            // InternalComponentDefinition.g:1495:5: ruleFQN
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

            // InternalComponentDefinition.g:1509:3: (otherlv_2= ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==15) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponentDefinition.g:1510:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:1519:1: entryRuleMixedPortROSLink returns [EObject current=null] : iv_ruleMixedPortROSLink= ruleMixedPortROSLink EOF ;
    public final EObject entryRuleMixedPortROSLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixedPortROSLink = null;


        try {
            // InternalComponentDefinition.g:1519:57: (iv_ruleMixedPortROSLink= ruleMixedPortROSLink EOF )
            // InternalComponentDefinition.g:1520:2: iv_ruleMixedPortROSLink= ruleMixedPortROSLink EOF
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
    // InternalComponentDefinition.g:1526:1: ruleMixedPortROSLink returns [EObject current=null] : (otherlv_0= 'MixedPortROSLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleMixedPortROSLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1532:2: ( (otherlv_0= 'MixedPortROSLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:1533:2: (otherlv_0= 'MixedPortROSLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:1533:2: (otherlv_0= 'MixedPortROSLink' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:1534:3: otherlv_0= 'MixedPortROSLink' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMixedPortROSLinkAccess().getMixedPortROSLinkKeyword_0());
            		
            // InternalComponentDefinition.g:1538:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1539:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1539:4: ( ruleFQN )
            // InternalComponentDefinition.g:1540:5: ruleFQN
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

            // InternalComponentDefinition.g:1554:3: (otherlv_2= ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==15) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalComponentDefinition.g:1555:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:1564:1: entryRuleComponentSubNodeObserver returns [EObject current=null] : iv_ruleComponentSubNodeObserver= ruleComponentSubNodeObserver EOF ;
    public final EObject entryRuleComponentSubNodeObserver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentSubNodeObserver = null;


        try {
            // InternalComponentDefinition.g:1564:65: (iv_ruleComponentSubNodeObserver= ruleComponentSubNodeObserver EOF )
            // InternalComponentDefinition.g:1565:2: iv_ruleComponentSubNodeObserver= ruleComponentSubNodeObserver EOF
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
    // InternalComponentDefinition.g:1571:1: ruleComponentSubNodeObserver returns [EObject current=null] : (otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleComponentSubNodeObserver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1577:2: ( (otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:1578:2: (otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:1578:2: (otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:1579:3: otherlv_0= 'Observe' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentSubNodeObserverAccess().getObserveKeyword_0());
            		
            // InternalComponentDefinition.g:1583:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1584:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1584:4: ( ruleFQN )
            // InternalComponentDefinition.g:1585:5: ruleFQN
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

            // InternalComponentDefinition.g:1599:3: (otherlv_2= ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalComponentDefinition.g:1600:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:1609:1: entryRuleInputLinkExtension returns [EObject current=null] : iv_ruleInputLinkExtension= ruleInputLinkExtension EOF ;
    public final EObject entryRuleInputLinkExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputLinkExtension = null;


        try {
            // InternalComponentDefinition.g:1609:59: (iv_ruleInputLinkExtension= ruleInputLinkExtension EOF )
            // InternalComponentDefinition.g:1610:2: iv_ruleInputLinkExtension= ruleInputLinkExtension EOF
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
    // InternalComponentDefinition.g:1616:1: ruleInputLinkExtension returns [EObject current=null] : ( () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ;
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
            // InternalComponentDefinition.g:1622:2: ( ( () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalComponentDefinition.g:1623:2: ( () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalComponentDefinition.g:1623:2: ( () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalComponentDefinition.g:1624:3: () otherlv_1= 'InputPortLink' ( ( ruleFQN ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            // InternalComponentDefinition.g:1624:3: ()
            // InternalComponentDefinition.g:1625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputLinkExtensionAccess().getInputLinkExtensionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInputLinkExtensionAccess().getInputPortLinkKeyword_1());
            		
            // InternalComponentDefinition.g:1635:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1636:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1636:4: ( ruleFQN )
            // InternalComponentDefinition.g:1637:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputLinkExtensionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInputLinkExtensionAccess().getInputPortInputPortCrossReference_2_0());
            				
            pushFollow(FOLLOW_9);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getInputLinkExtensionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentDefinition.g:1655:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) ) )
            // InternalComponentDefinition.g:1656:4: ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) )
            {
            // InternalComponentDefinition.g:1656:4: ( ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* ) )
            // InternalComponentDefinition.g:1657:5: ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
            				
            // InternalComponentDefinition.g:1660:5: ( ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )* )
            // InternalComponentDefinition.g:1661:6: ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )*
            {
            // InternalComponentDefinition.g:1661:6: ( ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) ) )*
            loop33:
            do {
                int alt33=4;
                int LA33_0 = input.LA(1);

                if ( LA33_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                    alt33=2;
                }
                else if ( LA33_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                    alt33=3;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalComponentDefinition.g:1662:4: ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1662:4: ({...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) ) )
            	    // InternalComponentDefinition.g:1663:5: {...}? => ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalComponentDefinition.g:1663:115: ( ({...}? => ( (lv_optional_5_0= 'optional' ) ) ) )
            	    // InternalComponentDefinition.g:1664:6: ({...}? => ( (lv_optional_5_0= 'optional' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalComponentDefinition.g:1667:9: ({...}? => ( (lv_optional_5_0= 'optional' ) ) )
            	    // InternalComponentDefinition.g:1667:10: {...}? => ( (lv_optional_5_0= 'optional' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "true");
            	    }
            	    // InternalComponentDefinition.g:1667:19: ( (lv_optional_5_0= 'optional' ) )
            	    // InternalComponentDefinition.g:1667:20: (lv_optional_5_0= 'optional' )
            	    {
            	    // InternalComponentDefinition.g:1667:20: (lv_optional_5_0= 'optional' )
            	    // InternalComponentDefinition.g:1668:10: lv_optional_5_0= 'optional'
            	    {
            	    lv_optional_5_0=(Token)match(input,38,FOLLOW_24); 

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
            	    // InternalComponentDefinition.g:1685:4: ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1685:4: ({...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) ) )
            	    // InternalComponentDefinition.g:1686:5: {...}? => ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalComponentDefinition.g:1686:115: ( ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) ) )
            	    // InternalComponentDefinition.g:1687:6: ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalComponentDefinition.g:1690:9: ({...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) ) )
            	    // InternalComponentDefinition.g:1690:10: {...}? => ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "true");
            	    }
            	    // InternalComponentDefinition.g:1690:19: ( (lv_oversamplingOk_6_0= 'oversamplingOk' ) )
            	    // InternalComponentDefinition.g:1690:20: (lv_oversamplingOk_6_0= 'oversamplingOk' )
            	    {
            	    // InternalComponentDefinition.g:1690:20: (lv_oversamplingOk_6_0= 'oversamplingOk' )
            	    // InternalComponentDefinition.g:1691:10: lv_oversamplingOk_6_0= 'oversamplingOk'
            	    {
            	    lv_oversamplingOk_6_0=(Token)match(input,39,FOLLOW_24); 

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
            	    // InternalComponentDefinition.g:1708:4: ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1708:4: ({...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) ) )
            	    // InternalComponentDefinition.g:1709:5: {...}? => ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalComponentDefinition.g:1709:115: ( ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) ) )
            	    // InternalComponentDefinition.g:1710:6: ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalComponentDefinition.g:1713:9: ({...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) ) )
            	    // InternalComponentDefinition.g:1713:10: {...}? => ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInputLinkExtension", "true");
            	    }
            	    // InternalComponentDefinition.g:1713:19: ( (lv_undersamplingOk_7_0= 'undersamplingOk' ) )
            	    // InternalComponentDefinition.g:1713:20: (lv_undersamplingOk_7_0= 'undersamplingOk' )
            	    {
            	    // InternalComponentDefinition.g:1713:20: (lv_undersamplingOk_7_0= 'undersamplingOk' )
            	    // InternalComponentDefinition.g:1714:10: lv_undersamplingOk_7_0= 'undersamplingOk'
            	    {
            	    lv_undersamplingOk_7_0=(Token)match(input,40,FOLLOW_24); 

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
            	    break loop33;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
            				

            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:1746:1: entryRuleActivityExtension returns [EObject current=null] : iv_ruleActivityExtension= ruleActivityExtension EOF ;
    public final EObject entryRuleActivityExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityExtension = null;


        try {
            // InternalComponentDefinition.g:1746:58: (iv_ruleActivityExtension= ruleActivityExtension EOF )
            // InternalComponentDefinition.g:1747:2: iv_ruleActivityExtension= ruleActivityExtension EOF
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
    // InternalComponentDefinition.g:1753:1: ruleActivityExtension returns [EObject current=null] : (this_ActivationConstraints_0= ruleActivationConstraints | this_OperationModeBinding_1= ruleOperationModeBinding | this_DefaultTrigger_2= ruleDefaultTrigger ) ;
    public final EObject ruleActivityExtension() throws RecognitionException {
        EObject current = null;

        EObject this_ActivationConstraints_0 = null;

        EObject this_OperationModeBinding_1 = null;

        EObject this_DefaultTrigger_2 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:1759:2: ( (this_ActivationConstraints_0= ruleActivationConstraints | this_OperationModeBinding_1= ruleOperationModeBinding | this_DefaultTrigger_2= ruleDefaultTrigger ) )
            // InternalComponentDefinition.g:1760:2: (this_ActivationConstraints_0= ruleActivationConstraints | this_OperationModeBinding_1= ruleOperationModeBinding | this_DefaultTrigger_2= ruleDefaultTrigger )
            {
            // InternalComponentDefinition.g:1760:2: (this_ActivationConstraints_0= ruleActivationConstraints | this_OperationModeBinding_1= ruleOperationModeBinding | this_DefaultTrigger_2= ruleDefaultTrigger )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 41:
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
                    // InternalComponentDefinition.g:1761:3: this_ActivationConstraints_0= ruleActivationConstraints
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
                    // InternalComponentDefinition.g:1770:3: this_OperationModeBinding_1= ruleOperationModeBinding
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
                    // InternalComponentDefinition.g:1779:3: this_DefaultTrigger_2= ruleDefaultTrigger
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
    // InternalComponentDefinition.g:1791:1: entryRuleActivationConstraints returns [EObject current=null] : iv_ruleActivationConstraints= ruleActivationConstraints EOF ;
    public final EObject entryRuleActivationConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivationConstraints = null;


        try {
            // InternalComponentDefinition.g:1791:62: (iv_ruleActivationConstraints= ruleActivationConstraints EOF )
            // InternalComponentDefinition.g:1792:2: iv_ruleActivationConstraints= ruleActivationConstraints EOF
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
    // InternalComponentDefinition.g:1798:1: ruleActivationConstraints returns [EObject current=null] : ( () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}' ) ;
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
            // InternalComponentDefinition.g:1804:2: ( ( () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}' ) )
            // InternalComponentDefinition.g:1805:2: ( () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}' )
            {
            // InternalComponentDefinition.g:1805:2: ( () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}' )
            // InternalComponentDefinition.g:1806:3: () otherlv_1= 'ActivationConstraints' otherlv_2= '{' otherlv_3= 'configurable' otherlv_4= '=' ( (lv_configurable_5_0= ruleEBoolean ) ) (otherlv_6= ';' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) ) otherlv_18= '}'
            {
            // InternalComponentDefinition.g:1806:3: ()
            // InternalComponentDefinition.g:1807:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivationConstraintsAccess().getActivationConstraintsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getActivationConstraintsAccess().getActivationConstraintsKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getActivationConstraintsAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,42,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getActivationConstraintsAccess().getConfigurableKeyword_3());
            		
            otherlv_4=(Token)match(input,43,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_4());
            		
            // InternalComponentDefinition.g:1829:3: ( (lv_configurable_5_0= ruleEBoolean ) )
            // InternalComponentDefinition.g:1830:4: (lv_configurable_5_0= ruleEBoolean )
            {
            // InternalComponentDefinition.g:1830:4: (lv_configurable_5_0= ruleEBoolean )
            // InternalComponentDefinition.g:1831:5: lv_configurable_5_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getActivationConstraintsAccess().getConfigurableEBooleanParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalComponentDefinition.g:1848:3: (otherlv_6= ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==15) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalComponentDefinition.g:1849:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_6, grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_6());
                    			

                    }
                    break;

            }

            // InternalComponentDefinition.g:1854:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) ) )
            // InternalComponentDefinition.g:1855:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) )
            {
            // InternalComponentDefinition.g:1855:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* ) )
            // InternalComponentDefinition.g:1856:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
            				
            // InternalComponentDefinition.g:1859:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )* )
            // InternalComponentDefinition.g:1860:6: ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )*
            {
            // InternalComponentDefinition.g:1860:6: ( ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( LA38_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalComponentDefinition.g:1861:4: ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1861:4: ({...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) ) )
            	    // InternalComponentDefinition.g:1862:5: {...}? => ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActivationConstraints", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalComponentDefinition.g:1862:118: ( ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) ) )
            	    // InternalComponentDefinition.g:1863:6: ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0);
            	    					
            	    // InternalComponentDefinition.g:1866:9: ({...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? ) )
            	    // InternalComponentDefinition.g:1866:10: {...}? => (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivationConstraints", "true");
            	    }
            	    // InternalComponentDefinition.g:1866:19: (otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )? )
            	    // InternalComponentDefinition.g:1866:20: otherlv_8= 'minActFreq' otherlv_9= '=' ( (lv_minActFreq_10_0= ruleEDouble ) ) otherlv_11= 'Hz' (otherlv_12= ';' )?
            	    {
            	    otherlv_8=(Token)match(input,44,FOLLOW_26); 

            	    									newLeafNode(otherlv_8, grammarAccess.getActivationConstraintsAccess().getMinActFreqKeyword_7_0_0());
            	    								
            	    otherlv_9=(Token)match(input,43,FOLLOW_30); 

            	    									newLeafNode(otherlv_9, grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_0_1());
            	    								
            	    // InternalComponentDefinition.g:1874:9: ( (lv_minActFreq_10_0= ruleEDouble ) )
            	    // InternalComponentDefinition.g:1875:10: (lv_minActFreq_10_0= ruleEDouble )
            	    {
            	    // InternalComponentDefinition.g:1875:10: (lv_minActFreq_10_0= ruleEDouble )
            	    // InternalComponentDefinition.g:1876:11: lv_minActFreq_10_0= ruleEDouble
            	    {

            	    											newCompositeNode(grammarAccess.getActivationConstraintsAccess().getMinActFreqEDoubleParserRuleCall_7_0_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
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

            	    otherlv_11=(Token)match(input,45,FOLLOW_28); 

            	    									newLeafNode(otherlv_11, grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_0_3());
            	    								
            	    // InternalComponentDefinition.g:1897:9: (otherlv_12= ';' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==15) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalComponentDefinition.g:1898:10: otherlv_12= ';'
            	            {
            	            otherlv_12=(Token)match(input,15,FOLLOW_29); 

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
            	    // InternalComponentDefinition.g:1909:4: ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:1909:4: ({...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) ) )
            	    // InternalComponentDefinition.g:1910:5: {...}? => ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActivationConstraints", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalComponentDefinition.g:1910:118: ( ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) ) )
            	    // InternalComponentDefinition.g:1911:6: ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1);
            	    					
            	    // InternalComponentDefinition.g:1914:9: ({...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? ) )
            	    // InternalComponentDefinition.g:1914:10: {...}? => (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivationConstraints", "true");
            	    }
            	    // InternalComponentDefinition.g:1914:19: (otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )? )
            	    // InternalComponentDefinition.g:1914:20: otherlv_13= 'maxActFreq' otherlv_14= '=' ( (lv_maxActFreq_15_0= ruleEDouble ) ) otherlv_16= 'Hz' (otherlv_17= ';' )?
            	    {
            	    otherlv_13=(Token)match(input,46,FOLLOW_26); 

            	    									newLeafNode(otherlv_13, grammarAccess.getActivationConstraintsAccess().getMaxActFreqKeyword_7_1_0());
            	    								
            	    otherlv_14=(Token)match(input,43,FOLLOW_30); 

            	    									newLeafNode(otherlv_14, grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_1_1());
            	    								
            	    // InternalComponentDefinition.g:1922:9: ( (lv_maxActFreq_15_0= ruleEDouble ) )
            	    // InternalComponentDefinition.g:1923:10: (lv_maxActFreq_15_0= ruleEDouble )
            	    {
            	    // InternalComponentDefinition.g:1923:10: (lv_maxActFreq_15_0= ruleEDouble )
            	    // InternalComponentDefinition.g:1924:11: lv_maxActFreq_15_0= ruleEDouble
            	    {

            	    											newCompositeNode(grammarAccess.getActivationConstraintsAccess().getMaxActFreqEDoubleParserRuleCall_7_1_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
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

            	    otherlv_16=(Token)match(input,45,FOLLOW_28); 

            	    									newLeafNode(otherlv_16, grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_1_3());
            	    								
            	    // InternalComponentDefinition.g:1945:9: (otherlv_17= ';' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==15) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalComponentDefinition.g:1946:10: otherlv_17= ';'
            	            {
            	            otherlv_17=(Token)match(input,15,FOLLOW_29); 

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
            	    break loop38;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
            				

            }

            otherlv_18=(Token)match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:1972:1: entryRuleOperationModeBinding returns [EObject current=null] : iv_ruleOperationModeBinding= ruleOperationModeBinding EOF ;
    public final EObject entryRuleOperationModeBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationModeBinding = null;


        try {
            // InternalComponentDefinition.g:1972:61: (iv_ruleOperationModeBinding= ruleOperationModeBinding EOF )
            // InternalComponentDefinition.g:1973:2: iv_ruleOperationModeBinding= ruleOperationModeBinding EOF
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
    // InternalComponentDefinition.g:1979:1: ruleOperationModeBinding returns [EObject current=null] : (otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleOperationModeBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:1985:2: ( (otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:1986:2: (otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:1986:2: (otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:1987:3: otherlv_0= 'OperationModeBinding' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationModeBindingAccess().getOperationModeBindingKeyword_0());
            		
            // InternalComponentDefinition.g:1991:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:1992:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:1992:4: ( ruleFQN )
            // InternalComponentDefinition.g:1993:5: ruleFQN
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

            // InternalComponentDefinition.g:2007:3: (otherlv_2= ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==15) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalComponentDefinition.g:2008:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:2017:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // InternalComponentDefinition.g:2017:55: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // InternalComponentDefinition.g:2018:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
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
    // InternalComponentDefinition.g:2024:1: ruleDefaultTrigger returns [EObject current=null] : (otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )? ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_DefaultInputTrigger_1 = null;

        EObject this_DefaultPeriodicTimer_2 = null;

        EObject this_DefaultObservedElementTrigger_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2030:2: ( (otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )? ) )
            // InternalComponentDefinition.g:2031:2: (otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )? )
            {
            // InternalComponentDefinition.g:2031:2: (otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )? )
            // InternalComponentDefinition.g:2032:3: otherlv_0= 'DefaultTrigger' (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultTriggerAccess().getDefaultTriggerKeyword_0());
            		
            // InternalComponentDefinition.g:2036:3: (this_DefaultInputTrigger_1= ruleDefaultInputTrigger | this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer | this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt40=1;
                }
                break;
            case 51:
                {
                alt40=2;
                }
                break;
            case 52:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalComponentDefinition.g:2037:4: this_DefaultInputTrigger_1= ruleDefaultInputTrigger
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
                    // InternalComponentDefinition.g:2046:4: this_DefaultPeriodicTimer_2= ruleDefaultPeriodicTimer
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
                    // InternalComponentDefinition.g:2055:4: this_DefaultObservedElementTrigger_3= ruleDefaultObservedElementTrigger
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

            // InternalComponentDefinition.g:2064:3: (otherlv_4= ';' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==15) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalComponentDefinition.g:2065:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:2074:1: entryRuleDefaultInputTrigger returns [EObject current=null] : iv_ruleDefaultInputTrigger= ruleDefaultInputTrigger EOF ;
    public final EObject entryRuleDefaultInputTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultInputTrigger = null;


        try {
            // InternalComponentDefinition.g:2074:60: (iv_ruleDefaultInputTrigger= ruleDefaultInputTrigger EOF )
            // InternalComponentDefinition.g:2075:2: iv_ruleDefaultInputTrigger= ruleDefaultInputTrigger EOF
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
    // InternalComponentDefinition.g:2081:1: ruleDefaultInputTrigger returns [EObject current=null] : (otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )? ) ;
    public final EObject ruleDefaultInputTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_prescale_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2087:2: ( (otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )? ) )
            // InternalComponentDefinition.g:2088:2: (otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )? )
            {
            // InternalComponentDefinition.g:2088:2: (otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )? )
            // InternalComponentDefinition.g:2089:3: otherlv_0= 'InputPortTrigger' ( ( ruleFQN ) ) (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultInputTriggerAccess().getInputPortTriggerKeyword_0());
            		
            // InternalComponentDefinition.g:2093:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2094:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2094:4: ( ruleFQN )
            // InternalComponentDefinition.g:2095:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefaultInputTriggerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDefaultInputTriggerAccess().getInputLinkInputLinkExtensionCrossReference_1_0());
            				
            pushFollow(FOLLOW_33);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:2109:3: (otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalComponentDefinition.g:2110:4: otherlv_2= 'prescale' ( (lv_prescale_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefaultInputTriggerAccess().getPrescaleKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:2114:4: ( (lv_prescale_3_0= ruleEInt ) )
                    // InternalComponentDefinition.g:2115:5: (lv_prescale_3_0= ruleEInt )
                    {
                    // InternalComponentDefinition.g:2115:5: (lv_prescale_3_0= ruleEInt )
                    // InternalComponentDefinition.g:2116:6: lv_prescale_3_0= ruleEInt
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
    // InternalComponentDefinition.g:2138:1: entryRuleDefaultPeriodicTimer returns [EObject current=null] : iv_ruleDefaultPeriodicTimer= ruleDefaultPeriodicTimer EOF ;
    public final EObject entryRuleDefaultPeriodicTimer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultPeriodicTimer = null;


        try {
            // InternalComponentDefinition.g:2138:61: (iv_ruleDefaultPeriodicTimer= ruleDefaultPeriodicTimer EOF )
            // InternalComponentDefinition.g:2139:2: iv_ruleDefaultPeriodicTimer= ruleDefaultPeriodicTimer EOF
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
    // InternalComponentDefinition.g:2145:1: ruleDefaultPeriodicTimer returns [EObject current=null] : (otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz' ) ;
    public final EObject ruleDefaultPeriodicTimer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_periodicActFreq_1_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2151:2: ( (otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz' ) )
            // InternalComponentDefinition.g:2152:2: (otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz' )
            {
            // InternalComponentDefinition.g:2152:2: (otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz' )
            // InternalComponentDefinition.g:2153:3: otherlv_0= 'PeriodicTimer' ( (lv_periodicActFreq_1_0= ruleEDouble ) ) otherlv_2= 'Hz'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicTimerKeyword_0());
            		
            // InternalComponentDefinition.g:2157:3: ( (lv_periodicActFreq_1_0= ruleEDouble ) )
            // InternalComponentDefinition.g:2158:4: (lv_periodicActFreq_1_0= ruleEDouble )
            {
            // InternalComponentDefinition.g:2158:4: (lv_periodicActFreq_1_0= ruleEDouble )
            // InternalComponentDefinition.g:2159:5: lv_periodicActFreq_1_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_2=(Token)match(input,45,FOLLOW_2); 

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
    // InternalComponentDefinition.g:2184:1: entryRuleDefaultObservedElementTrigger returns [EObject current=null] : iv_ruleDefaultObservedElementTrigger= ruleDefaultObservedElementTrigger EOF ;
    public final EObject entryRuleDefaultObservedElementTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultObservedElementTrigger = null;


        try {
            // InternalComponentDefinition.g:2184:70: (iv_ruleDefaultObservedElementTrigger= ruleDefaultObservedElementTrigger EOF )
            // InternalComponentDefinition.g:2185:2: iv_ruleDefaultObservedElementTrigger= ruleDefaultObservedElementTrigger EOF
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
    // InternalComponentDefinition.g:2191:1: ruleDefaultObservedElementTrigger returns [EObject current=null] : (otherlv_0= 'ObservedElement' ( ( ruleFQN ) ) ) ;
    public final EObject ruleDefaultObservedElementTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2197:2: ( (otherlv_0= 'ObservedElement' ( ( ruleFQN ) ) ) )
            // InternalComponentDefinition.g:2198:2: (otherlv_0= 'ObservedElement' ( ( ruleFQN ) ) )
            {
            // InternalComponentDefinition.g:2198:2: (otherlv_0= 'ObservedElement' ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:2199:3: otherlv_0= 'ObservedElement' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultObservedElementTriggerAccess().getObservedElementKeyword_0());
            		
            // InternalComponentDefinition.g:2203:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2204:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2204:4: ( ruleFQN )
            // InternalComponentDefinition.g:2205:5: ruleFQN
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
    // InternalComponentDefinition.g:2223:1: entryRulePlainOpcUaPort returns [EObject current=null] : iv_rulePlainOpcUaPort= rulePlainOpcUaPort EOF ;
    public final EObject entryRulePlainOpcUaPort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainOpcUaPort = null;


        try {
            // InternalComponentDefinition.g:2223:55: (iv_rulePlainOpcUaPort= rulePlainOpcUaPort EOF )
            // InternalComponentDefinition.g:2224:2: iv_rulePlainOpcUaPort= rulePlainOpcUaPort EOF
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
    // InternalComponentDefinition.g:2230:1: rulePlainOpcUaPort returns [EObject current=null] : (this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient | this_OpcUaReadServer_1= ruleOpcUaReadServer ) ;
    public final EObject rulePlainOpcUaPort() throws RecognitionException {
        EObject current = null;

        EObject this_OpcUaDeviceClient_0 = null;

        EObject this_OpcUaReadServer_1 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2236:2: ( (this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient | this_OpcUaReadServer_1= ruleOpcUaReadServer ) )
            // InternalComponentDefinition.g:2237:2: (this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient | this_OpcUaReadServer_1= ruleOpcUaReadServer )
            {
            // InternalComponentDefinition.g:2237:2: (this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient | this_OpcUaReadServer_1= ruleOpcUaReadServer )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                alt43=1;
            }
            else if ( (LA43_0==58) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalComponentDefinition.g:2238:3: this_OpcUaDeviceClient_0= ruleOpcUaDeviceClient
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
                    // InternalComponentDefinition.g:2247:3: this_OpcUaReadServer_1= ruleOpcUaReadServer
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
    // InternalComponentDefinition.g:2259:1: entryRuleOpcUaDeviceClient returns [EObject current=null] : iv_ruleOpcUaDeviceClient= ruleOpcUaDeviceClient EOF ;
    public final EObject entryRuleOpcUaDeviceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUaDeviceClient = null;


        try {
            // InternalComponentDefinition.g:2259:58: (iv_ruleOpcUaDeviceClient= ruleOpcUaDeviceClient EOF )
            // InternalComponentDefinition.g:2260:2: iv_ruleOpcUaDeviceClient= ruleOpcUaDeviceClient EOF
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
    // InternalComponentDefinition.g:2266:1: ruleOpcUaDeviceClient returns [EObject current=null] : (otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' ) ;
    public final EObject ruleOpcUaDeviceClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_autoConnect_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_deviceURI_5_0 = null;

        AntlrDatatypeRuleToken lv_rootObjectPath_8_0 = null;

        AntlrDatatypeRuleToken lv_opcuaXmlFile_10_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2272:2: ( (otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' ) )
            // InternalComponentDefinition.g:2273:2: (otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' )
            {
            // InternalComponentDefinition.g:2273:2: (otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' )
            // InternalComponentDefinition.g:2274:3: otherlv_0= 'OpcUaDeviceClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpcUaDeviceClientAccess().getOpcUaDeviceClientKeyword_0());
            		
            // InternalComponentDefinition.g:2278:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:2279:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:2279:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:2280:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getOpcUaDeviceClientAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentDefinition.g:2300:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) )
            // InternalComponentDefinition.g:2301:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalComponentDefinition.g:2301:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            // InternalComponentDefinition.g:2302:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3());
            				
            // InternalComponentDefinition.g:2305:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            // InternalComponentDefinition.g:2306:6: ( ({...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) ) ) )+ {...}?
            {
            // InternalComponentDefinition.g:2306:6: ( ({...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) ) ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=5;
                int LA44_0 = input.LA(1);

                if ( LA44_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 0) ) {
                    alt44=1;
                }
                else if ( LA44_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 1) ) {
                    alt44=2;
                }
                else if ( LA44_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 2) ) {
                    alt44=3;
                }
                else if ( LA44_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 3) ) {
                    alt44=4;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalComponentDefinition.g:2307:4: ({...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:2307:4: ({...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDefinition.g:2308:5: {...}? => ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalComponentDefinition.g:2308:114: ( ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) ) )
            	    // InternalComponentDefinition.g:2309:6: ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalComponentDefinition.g:2312:9: ({...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) ) )
            	    // InternalComponentDefinition.g:2312:10: {...}? => (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "true");
            	    }
            	    // InternalComponentDefinition.g:2312:19: (otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) ) )
            	    // InternalComponentDefinition.g:2312:20: otherlv_4= 'deviceURI' ( (lv_deviceURI_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,54,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIKeyword_3_0_0());
            	    								
            	    // InternalComponentDefinition.g:2316:9: ( (lv_deviceURI_5_0= ruleEString ) )
            	    // InternalComponentDefinition.g:2317:10: (lv_deviceURI_5_0= ruleEString )
            	    {
            	    // InternalComponentDefinition.g:2317:10: (lv_deviceURI_5_0= ruleEString )
            	    // InternalComponentDefinition.g:2318:11: lv_deviceURI_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIEStringParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_deviceURI_5_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOpcUaDeviceClientRule());
            	    											}
            	    											set(
            	    												current,
            	    												"deviceURI",
            	    												lv_deviceURI_5_0,
            	    												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComponentDefinition.g:2341:4: ({...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:2341:4: ({...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) ) )
            	    // InternalComponentDefinition.g:2342:5: {...}? => ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalComponentDefinition.g:2342:114: ( ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) ) )
            	    // InternalComponentDefinition.g:2343:6: ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalComponentDefinition.g:2346:9: ({...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) ) )
            	    // InternalComponentDefinition.g:2346:10: {...}? => ( (lv_autoConnect_6_0= 'autoConnect' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "true");
            	    }
            	    // InternalComponentDefinition.g:2346:19: ( (lv_autoConnect_6_0= 'autoConnect' ) )
            	    // InternalComponentDefinition.g:2346:20: (lv_autoConnect_6_0= 'autoConnect' )
            	    {
            	    // InternalComponentDefinition.g:2346:20: (lv_autoConnect_6_0= 'autoConnect' )
            	    // InternalComponentDefinition.g:2347:10: lv_autoConnect_6_0= 'autoConnect'
            	    {
            	    lv_autoConnect_6_0=(Token)match(input,55,FOLLOW_36); 

            	    										newLeafNode(lv_autoConnect_6_0, grammarAccess.getOpcUaDeviceClientAccess().getAutoConnectAutoConnectKeyword_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getOpcUaDeviceClientRule());
            	    										}
            	    										setWithLastConsumed(current, "autoConnect", true, "autoConnect");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComponentDefinition.g:2364:4: ({...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:2364:4: ({...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDefinition.g:2365:5: {...}? => ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalComponentDefinition.g:2365:114: ( ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) ) )
            	    // InternalComponentDefinition.g:2366:6: ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalComponentDefinition.g:2369:9: ({...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) ) )
            	    // InternalComponentDefinition.g:2369:10: {...}? => (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "true");
            	    }
            	    // InternalComponentDefinition.g:2369:19: (otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) ) )
            	    // InternalComponentDefinition.g:2369:20: otherlv_7= 'rootObjectPath' ( (lv_rootObjectPath_8_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,56,FOLLOW_8); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOpcUaDeviceClientAccess().getRootObjectPathKeyword_3_2_0());
            	    								
            	    // InternalComponentDefinition.g:2373:9: ( (lv_rootObjectPath_8_0= ruleEString ) )
            	    // InternalComponentDefinition.g:2374:10: (lv_rootObjectPath_8_0= ruleEString )
            	    {
            	    // InternalComponentDefinition.g:2374:10: (lv_rootObjectPath_8_0= ruleEString )
            	    // InternalComponentDefinition.g:2375:11: lv_rootObjectPath_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getOpcUaDeviceClientAccess().getRootObjectPathEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_rootObjectPath_8_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOpcUaDeviceClientRule());
            	    											}
            	    											set(
            	    												current,
            	    												"rootObjectPath",
            	    												lv_rootObjectPath_8_0,
            	    												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalComponentDefinition.g:2398:4: ({...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDefinition.g:2398:4: ({...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDefinition.g:2399:5: {...}? => ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalComponentDefinition.g:2399:114: ( ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) ) )
            	    // InternalComponentDefinition.g:2400:6: ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalComponentDefinition.g:2403:9: ({...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) ) )
            	    // InternalComponentDefinition.g:2403:10: {...}? => (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "true");
            	    }
            	    // InternalComponentDefinition.g:2403:19: (otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) ) )
            	    // InternalComponentDefinition.g:2403:20: otherlv_9= 'opcuaXmlFile' ( (lv_opcuaXmlFile_10_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,57,FOLLOW_8); 

            	    									newLeafNode(otherlv_9, grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileKeyword_3_3_0());
            	    								
            	    // InternalComponentDefinition.g:2407:9: ( (lv_opcuaXmlFile_10_0= ruleEString ) )
            	    // InternalComponentDefinition.g:2408:10: (lv_opcuaXmlFile_10_0= ruleEString )
            	    {
            	    // InternalComponentDefinition.g:2408:10: (lv_opcuaXmlFile_10_0= ruleEString )
            	    // InternalComponentDefinition.g:2409:11: lv_opcuaXmlFile_10_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileEStringParserRuleCall_3_3_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_opcuaXmlFile_10_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOpcUaDeviceClientRule());
            	    											}
            	    											set(
            	    												current,
            	    												"opcuaXmlFile",
            	    												lv_opcuaXmlFile_10_0,
            	    												"org.xtext.service.roboticMiddleware.RoboticMiddleware.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleOpcUaDeviceClient", "getUnorderedGroupHelper().canLeave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3());
            				

            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getOpcUaDeviceClientAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalComponentDefinition.g:2448:1: entryRuleOpcUaReadServer returns [EObject current=null] : iv_ruleOpcUaReadServer= ruleOpcUaReadServer EOF ;
    public final EObject entryRuleOpcUaReadServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUaReadServer = null;


        try {
            // InternalComponentDefinition.g:2448:56: (iv_ruleOpcUaReadServer= ruleOpcUaReadServer EOF )
            // InternalComponentDefinition.g:2449:2: iv_ruleOpcUaReadServer= ruleOpcUaReadServer EOF
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
    // InternalComponentDefinition.g:2455:1: ruleOpcUaReadServer returns [EObject current=null] : (otherlv_0= 'OpcUaReadServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= 'portNumber' ( (lv_portNumber_5_0= ruleEInt ) ) )? (otherlv_6= ';' )? ) ;
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
            // InternalComponentDefinition.g:2461:2: ( (otherlv_0= 'OpcUaReadServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= 'portNumber' ( (lv_portNumber_5_0= ruleEInt ) ) )? (otherlv_6= ';' )? ) )
            // InternalComponentDefinition.g:2462:2: (otherlv_0= 'OpcUaReadServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= 'portNumber' ( (lv_portNumber_5_0= ruleEInt ) ) )? (otherlv_6= ';' )? )
            {
            // InternalComponentDefinition.g:2462:2: (otherlv_0= 'OpcUaReadServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= 'portNumber' ( (lv_portNumber_5_0= ruleEInt ) ) )? (otherlv_6= ';' )? )
            // InternalComponentDefinition.g:2463:3: otherlv_0= 'OpcUaReadServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dataProviderPort' ( ( ruleFQN ) ) (otherlv_4= 'portNumber' ( (lv_portNumber_5_0= ruleEInt ) ) )? (otherlv_6= ';' )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpcUaReadServerAccess().getOpcUaReadServerKeyword_0());
            		
            // InternalComponentDefinition.g:2467:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:2468:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:2468:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:2469:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); 

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

            otherlv_2=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOpcUaReadServerAccess().getDataProviderPortKeyword_2());
            		
            // InternalComponentDefinition.g:2489:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2490:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2490:4: ( ruleFQN )
            // InternalComponentDefinition.g:2491:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpcUaReadServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOpcUaReadServerAccess().getOutPortOutputPortCrossReference_3_0());
            				
            pushFollow(FOLLOW_38);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:2505:3: (otherlv_4= 'portNumber' ( (lv_portNumber_5_0= ruleEInt ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==60) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalComponentDefinition.g:2506:4: otherlv_4= 'portNumber' ( (lv_portNumber_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpcUaReadServerAccess().getPortNumberKeyword_4_0());
                    			
                    // InternalComponentDefinition.g:2510:4: ( (lv_portNumber_5_0= ruleEInt ) )
                    // InternalComponentDefinition.g:2511:5: (lv_portNumber_5_0= ruleEInt )
                    {
                    // InternalComponentDefinition.g:2511:5: (lv_portNumber_5_0= ruleEInt )
                    // InternalComponentDefinition.g:2512:6: lv_portNumber_5_0= ruleEInt
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

            // InternalComponentDefinition.g:2530:3: (otherlv_6= ';' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==15) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalComponentDefinition.g:2531:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:2540:1: entryRuleMixedPortROS returns [EObject current=null] : iv_ruleMixedPortROS= ruleMixedPortROS EOF ;
    public final EObject entryRuleMixedPortROS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixedPortROS = null;


        try {
            // InternalComponentDefinition.g:2540:53: (iv_ruleMixedPortROS= ruleMixedPortROS EOF )
            // InternalComponentDefinition.g:2541:2: iv_ruleMixedPortROS= ruleMixedPortROS EOF
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
    // InternalComponentDefinition.g:2547:1: ruleMixedPortROS returns [EObject current=null] : (otherlv_0= 'MixedPortROS' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleMixedPortROS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2553:2: ( (otherlv_0= 'MixedPortROS' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:2554:2: (otherlv_0= 'MixedPortROS' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:2554:2: (otherlv_0= 'MixedPortROS' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:2555:3: otherlv_0= 'MixedPortROS' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMixedPortROSAccess().getMixedPortROSKeyword_0());
            		
            // InternalComponentDefinition.g:2559:3: ( (otherlv_1= RULE_ID ) )
            // InternalComponentDefinition.g:2560:4: (otherlv_1= RULE_ID )
            {
            // InternalComponentDefinition.g:2560:4: (otherlv_1= RULE_ID )
            // InternalComponentDefinition.g:2561:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixedPortROSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getMixedPortROSAccess().getPortMixedPortROSBaseCrossReference_1_0());
            				

            }


            }

            // InternalComponentDefinition.g:2572:3: (otherlv_2= ';' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==15) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalComponentDefinition.g:2573:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:2582:1: entryRuleMixedPortYARP returns [EObject current=null] : iv_ruleMixedPortYARP= ruleMixedPortYARP EOF ;
    public final EObject entryRuleMixedPortYARP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixedPortYARP = null;


        try {
            // InternalComponentDefinition.g:2582:54: (iv_ruleMixedPortYARP= ruleMixedPortYARP EOF )
            // InternalComponentDefinition.g:2583:2: iv_ruleMixedPortYARP= ruleMixedPortYARP EOF
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
    // InternalComponentDefinition.g:2589:1: ruleMixedPortYARP returns [EObject current=null] : (otherlv_0= 'MixedPortYARP' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleMixedPortYARP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2595:2: ( (otherlv_0= 'MixedPortYARP' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:2596:2: (otherlv_0= 'MixedPortYARP' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:2596:2: (otherlv_0= 'MixedPortYARP' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:2597:3: otherlv_0= 'MixedPortYARP' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,62,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMixedPortYARPAccess().getMixedPortYARPKeyword_0());
            		
            // InternalComponentDefinition.g:2601:3: ( (otherlv_1= RULE_ID ) )
            // InternalComponentDefinition.g:2602:4: (otherlv_1= RULE_ID )
            {
            // InternalComponentDefinition.g:2602:4: (otherlv_1= RULE_ID )
            // InternalComponentDefinition.g:2603:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixedPortYARPRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getMixedPortYARPAccess().getPortMixedPortYARPBaseCrossReference_1_0());
            				

            }


            }

            // InternalComponentDefinition.g:2614:3: (otherlv_2= ';' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==15) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalComponentDefinition.g:2615:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:2624:1: entryRuleCoordinationSlavePort returns [EObject current=null] : iv_ruleCoordinationSlavePort= ruleCoordinationSlavePort EOF ;
    public final EObject entryRuleCoordinationSlavePort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationSlavePort = null;


        try {
            // InternalComponentDefinition.g:2624:62: (iv_ruleCoordinationSlavePort= ruleCoordinationSlavePort EOF )
            // InternalComponentDefinition.g:2625:2: iv_ruleCoordinationSlavePort= ruleCoordinationSlavePort EOF
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
    // InternalComponentDefinition.g:2631:1: ruleCoordinationSlavePort returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CoordinationSlavePort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractCoordinationElement ) )* otherlv_7= '}' ) ;
    public final EObject ruleCoordinationSlavePort() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2637:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CoordinationSlavePort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractCoordinationElement ) )* otherlv_7= '}' ) )
            // InternalComponentDefinition.g:2638:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CoordinationSlavePort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractCoordinationElement ) )* otherlv_7= '}' )
            {
            // InternalComponentDefinition.g:2638:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CoordinationSlavePort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractCoordinationElement ) )* otherlv_7= '}' )
            // InternalComponentDefinition.g:2639:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CoordinationSlavePort' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'implements' ( ( ruleFQN ) ) otherlv_5= '{' ( (lv_elements_6_0= ruleAbstractCoordinationElement ) )* otherlv_7= '}'
            {
            // InternalComponentDefinition.g:2639:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_DOCU_COMMENT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalComponentDefinition.g:2640:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentDefinition.g:2640:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalComponentDefinition.g:2641:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_39); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getCoordinationSlavePortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCoordinationSlavePortRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_0_0,
                    						"org.xtext.base.docuterminals.DocuTerminals.DOCU_COMMENT");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,63,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCoordinationSlavePortAccess().getCoordinationSlavePortKeyword_1());
            		
            // InternalComponentDefinition.g:2661:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentDefinition.g:2662:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentDefinition.g:2662:4: (lv_name_2_0= RULE_ID )
            // InternalComponentDefinition.g:2663:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCoordinationSlavePortAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationSlavePortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCoordinationSlavePortAccess().getImplementsKeyword_3());
            		
            // InternalComponentDefinition.g:2683:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2684:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2684:4: ( ruleFQN )
            // InternalComponentDefinition.g:2685:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationSlavePortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getCoordinationSlavePortAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalComponentDefinition.g:2703:3: ( (lv_elements_6_0= ruleAbstractCoordinationElement ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_DOCU_COMMENT||LA50_0==27||(LA50_0>=64 && LA50_0<=66)||LA50_0==71) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalComponentDefinition.g:2704:4: (lv_elements_6_0= ruleAbstractCoordinationElement )
            	    {
            	    // InternalComponentDefinition.g:2704:4: (lv_elements_6_0= ruleAbstractCoordinationElement )
            	    // InternalComponentDefinition.g:2705:5: lv_elements_6_0= ruleAbstractCoordinationElement
            	    {

            	    					newCompositeNode(grammarAccess.getCoordinationSlavePortAccess().getElementsAbstractCoordinationElementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_40);
            	    lv_elements_6_0=ruleAbstractCoordinationElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoordinationSlavePortRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_6_0,
            	    						"org.xtext.component.componentDefinition.ComponentDefinition.AbstractCoordinationElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCoordinationSlavePortAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalComponentDefinition.g:2730:1: entryRuleAbstractCoordinationElement returns [EObject current=null] : iv_ruleAbstractCoordinationElement= ruleAbstractCoordinationElement EOF ;
    public final EObject entryRuleAbstractCoordinationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCoordinationElement = null;


        try {
            // InternalComponentDefinition.g:2730:68: (iv_ruleAbstractCoordinationElement= ruleAbstractCoordinationElement EOF )
            // InternalComponentDefinition.g:2731:2: iv_ruleAbstractCoordinationElement= ruleAbstractCoordinationElement EOF
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
    // InternalComponentDefinition.g:2737:1: ruleAbstractCoordinationElement returns [EObject current=null] : (this_PublicOperationMode_0= rulePublicOperationMode | this_PrivateOperationMode_1= rulePrivateOperationMode | this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization | this_SkillRealizationsRef_3= ruleSkillRealizationsRef ) ;
    public final EObject ruleAbstractCoordinationElement() throws RecognitionException {
        EObject current = null;

        EObject this_PublicOperationMode_0 = null;

        EObject this_PrivateOperationMode_1 = null;

        EObject this_CommunicationServiceUsageRealization_2 = null;

        EObject this_SkillRealizationsRef_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:2743:2: ( (this_PublicOperationMode_0= rulePublicOperationMode | this_PrivateOperationMode_1= rulePrivateOperationMode | this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization | this_SkillRealizationsRef_3= ruleSkillRealizationsRef ) )
            // InternalComponentDefinition.g:2744:2: (this_PublicOperationMode_0= rulePublicOperationMode | this_PrivateOperationMode_1= rulePrivateOperationMode | this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization | this_SkillRealizationsRef_3= ruleSkillRealizationsRef )
            {
            // InternalComponentDefinition.g:2744:2: (this_PublicOperationMode_0= rulePublicOperationMode | this_PrivateOperationMode_1= rulePrivateOperationMode | this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization | this_SkillRealizationsRef_3= ruleSkillRealizationsRef )
            int alt51=4;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
            case 27:
            case 66:
                {
                alt51=1;
                }
                break;
            case 71:
                {
                alt51=2;
                }
                break;
            case 65:
                {
                alt51=3;
                }
                break;
            case 64:
                {
                alt51=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalComponentDefinition.g:2745:3: this_PublicOperationMode_0= rulePublicOperationMode
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
                    // InternalComponentDefinition.g:2754:3: this_PrivateOperationMode_1= rulePrivateOperationMode
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
                    // InternalComponentDefinition.g:2763:3: this_CommunicationServiceUsageRealization_2= ruleCommunicationServiceUsageRealization
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
                    // InternalComponentDefinition.g:2772:3: this_SkillRealizationsRef_3= ruleSkillRealizationsRef
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
    // InternalComponentDefinition.g:2784:1: entryRuleSkillRealizationsRef returns [EObject current=null] : iv_ruleSkillRealizationsRef= ruleSkillRealizationsRef EOF ;
    public final EObject entryRuleSkillRealizationsRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillRealizationsRef = null;


        try {
            // InternalComponentDefinition.g:2784:61: (iv_ruleSkillRealizationsRef= ruleSkillRealizationsRef EOF )
            // InternalComponentDefinition.g:2785:2: iv_ruleSkillRealizationsRef= ruleSkillRealizationsRef EOF
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
    // InternalComponentDefinition.g:2791:1: ruleSkillRealizationsRef returns [EObject current=null] : (otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleSkillRealizationsRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2797:2: ( (otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:2798:2: (otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:2798:2: (otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:2799:3: otherlv_0= 'SkillRealizationsRef' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationsRefKeyword_0());
            		
            // InternalComponentDefinition.g:2803:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2804:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2804:4: ( ruleFQN )
            // InternalComponentDefinition.g:2805:5: ruleFQN
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

            // InternalComponentDefinition.g:2819:3: (otherlv_2= ';' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==15) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalComponentDefinition.g:2820:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:2829:1: entryRuleCommunicationServiceUsageRealization returns [EObject current=null] : iv_ruleCommunicationServiceUsageRealization= ruleCommunicationServiceUsageRealization EOF ;
    public final EObject entryRuleCommunicationServiceUsageRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationServiceUsageRealization = null;


        try {
            // InternalComponentDefinition.g:2829:77: (iv_ruleCommunicationServiceUsageRealization= ruleCommunicationServiceUsageRealization EOF )
            // InternalComponentDefinition.g:2830:2: iv_ruleCommunicationServiceUsageRealization= ruleCommunicationServiceUsageRealization EOF
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
    // InternalComponentDefinition.g:2836:1: ruleCommunicationServiceUsageRealization returns [EObject current=null] : (otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) ) ) ;
    public final EObject ruleCommunicationServiceUsageRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2842:2: ( (otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) ) ) )
            // InternalComponentDefinition.g:2843:2: (otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) ) )
            {
            // InternalComponentDefinition.g:2843:2: (otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:2844:3: otherlv_0= 'with' ( ( ruleFQN ) ) otherlv_2= 'realizedBy' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCommunicationServiceUsageRealizationAccess().getWithKeyword_0());
            		
            // InternalComponentDefinition.g:2848:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2849:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2849:4: ( ruleFQN )
            // InternalComponentDefinition.g:2850:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationServiceUsageRealizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageCommunicationServiceUsageCrossReference_1_0());
            				
            pushFollow(FOLLOW_15);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCommunicationServiceUsageRealizationAccess().getRealizedByKeyword_2());
            		
            // InternalComponentDefinition.g:2868:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2869:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2869:4: ( ruleFQN )
            // InternalComponentDefinition.g:2870:5: ruleFQN
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
    // InternalComponentDefinition.g:2888:1: entryRulePublicOperationMode returns [EObject current=null] : iv_rulePublicOperationMode= rulePublicOperationMode EOF ;
    public final EObject entryRulePublicOperationMode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublicOperationMode = null;


        try {
            // InternalComponentDefinition.g:2888:60: (iv_rulePublicOperationMode= rulePublicOperationMode EOF )
            // InternalComponentDefinition.g:2889:2: iv_rulePublicOperationMode= rulePublicOperationMode EOF
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
    // InternalComponentDefinition.g:2895:1: rulePublicOperationMode returns [EObject current=null] : ( () ( (lv_documentation_1_0= RULE_DOCU_COMMENT ) )? ( (lv_isDefaultInit_2_0= 'default' ) )? otherlv_3= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_5= '{' (otherlv_6= 'activates' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? otherlv_12= '}' ) ;
    public final EObject rulePublicOperationMode() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_1_0=null;
        Token lv_isDefaultInit_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:2901:2: ( ( () ( (lv_documentation_1_0= RULE_DOCU_COMMENT ) )? ( (lv_isDefaultInit_2_0= 'default' ) )? otherlv_3= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_5= '{' (otherlv_6= 'activates' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? otherlv_12= '}' ) )
            // InternalComponentDefinition.g:2902:2: ( () ( (lv_documentation_1_0= RULE_DOCU_COMMENT ) )? ( (lv_isDefaultInit_2_0= 'default' ) )? otherlv_3= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_5= '{' (otherlv_6= 'activates' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? otherlv_12= '}' )
            {
            // InternalComponentDefinition.g:2902:2: ( () ( (lv_documentation_1_0= RULE_DOCU_COMMENT ) )? ( (lv_isDefaultInit_2_0= 'default' ) )? otherlv_3= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_5= '{' (otherlv_6= 'activates' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? otherlv_12= '}' )
            // InternalComponentDefinition.g:2903:3: () ( (lv_documentation_1_0= RULE_DOCU_COMMENT ) )? ( (lv_isDefaultInit_2_0= 'default' ) )? otherlv_3= 'PublicOperationMode' ( ( ruleFQN ) ) otherlv_5= '{' (otherlv_6= 'activates' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )? otherlv_12= '}'
            {
            // InternalComponentDefinition.g:2903:3: ()
            // InternalComponentDefinition.g:2904:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPublicOperationModeAccess().getPublicOperationModeAction_0(),
            					current);
            			

            }

            // InternalComponentDefinition.g:2910:3: ( (lv_documentation_1_0= RULE_DOCU_COMMENT ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_DOCU_COMMENT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalComponentDefinition.g:2911:4: (lv_documentation_1_0= RULE_DOCU_COMMENT )
                    {
                    // InternalComponentDefinition.g:2911:4: (lv_documentation_1_0= RULE_DOCU_COMMENT )
                    // InternalComponentDefinition.g:2912:5: lv_documentation_1_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_1_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_41); 

                    					newLeafNode(lv_documentation_1_0, grammarAccess.getPublicOperationModeAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPublicOperationModeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_1_0,
                    						"org.xtext.base.docuterminals.DocuTerminals.DOCU_COMMENT");
                    				

                    }


                    }
                    break;

            }

            // InternalComponentDefinition.g:2928:3: ( (lv_isDefaultInit_2_0= 'default' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==27) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalComponentDefinition.g:2929:4: (lv_isDefaultInit_2_0= 'default' )
                    {
                    // InternalComponentDefinition.g:2929:4: (lv_isDefaultInit_2_0= 'default' )
                    // InternalComponentDefinition.g:2930:5: lv_isDefaultInit_2_0= 'default'
                    {
                    lv_isDefaultInit_2_0=(Token)match(input,27,FOLLOW_42); 

                    					newLeafNode(lv_isDefaultInit_2_0, grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPublicOperationModeRule());
                    					}
                    					setWithLastConsumed(current, "isDefaultInit", true, "default");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,66,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPublicOperationModeAccess().getPublicOperationModeKeyword_3());
            		
            // InternalComponentDefinition.g:2946:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:2947:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:2947:4: ( ruleFQN )
            // InternalComponentDefinition.g:2948:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublicOperationModeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_43); 

            			newLeafNode(otherlv_5, grammarAccess.getPublicOperationModeAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalComponentDefinition.g:2966:3: (otherlv_6= 'activates' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==67) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalComponentDefinition.g:2967:4: otherlv_6= 'activates' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_44); 

                    				newLeafNode(otherlv_6, grammarAccess.getPublicOperationModeAccess().getActivatesKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,68,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getPublicOperationModeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalComponentDefinition.g:2975:4: ( (otherlv_8= RULE_ID ) )
                    // InternalComponentDefinition.g:2976:5: (otherlv_8= RULE_ID )
                    {
                    // InternalComponentDefinition.g:2976:5: (otherlv_8= RULE_ID )
                    // InternalComponentDefinition.g:2977:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPublicOperationModeRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_45); 

                    						newLeafNode(otherlv_8, grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_6_2_0());
                    					

                    }


                    }

                    // InternalComponentDefinition.g:2988:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==69) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalComponentDefinition.g:2989:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,69,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getPublicOperationModeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalComponentDefinition.g:2993:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalComponentDefinition.g:2994:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalComponentDefinition.g:2994:6: (otherlv_10= RULE_ID )
                    	    // InternalComponentDefinition.g:2995:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPublicOperationModeRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_45); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_6_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,70,FOLLOW_46); 

                    				newLeafNode(otherlv_11, grammarAccess.getPublicOperationModeAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPublicOperationModeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalComponentDefinition.g:3020:1: entryRulePrivateOperationMode returns [EObject current=null] : iv_rulePrivateOperationMode= rulePrivateOperationMode EOF ;
    public final EObject entryRulePrivateOperationMode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateOperationMode = null;


        try {
            // InternalComponentDefinition.g:3020:61: (iv_rulePrivateOperationMode= rulePrivateOperationMode EOF )
            // InternalComponentDefinition.g:3021:2: iv_rulePrivateOperationMode= rulePrivateOperationMode EOF
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
    // InternalComponentDefinition.g:3027:1: rulePrivateOperationMode returns [EObject current=null] : (otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final EObject rulePrivateOperationMode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3033:2: ( (otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // InternalComponentDefinition.g:3034:2: (otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // InternalComponentDefinition.g:3034:2: (otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? )
            // InternalComponentDefinition.g:3035:3: otherlv_0= 'PrivateOperationMode' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,71,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPrivateOperationModeAccess().getPrivateOperationModeKeyword_0());
            		
            // InternalComponentDefinition.g:3039:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:3040:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:3040:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:3041:5: lv_name_1_0= RULE_ID
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

            // InternalComponentDefinition.g:3057:3: (otherlv_2= ';' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==15) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalComponentDefinition.g:3058:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:3067:1: entryRuleCoordinationMasterPort returns [EObject current=null] : iv_ruleCoordinationMasterPort= ruleCoordinationMasterPort EOF ;
    public final EObject entryRuleCoordinationMasterPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationMasterPort = null;


        try {
            // InternalComponentDefinition.g:3067:63: (iv_ruleCoordinationMasterPort= ruleCoordinationMasterPort EOF )
            // InternalComponentDefinition.g:3068:2: iv_ruleCoordinationMasterPort= ruleCoordinationMasterPort EOF
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
    // InternalComponentDefinition.g:3074:1: ruleCoordinationMasterPort returns [EObject current=null] : (otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleCoordinationMasterPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3080:2: ( (otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )? ) )
            // InternalComponentDefinition.g:3081:2: (otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            {
            // InternalComponentDefinition.g:3081:2: (otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )? )
            // InternalComponentDefinition.g:3082:3: otherlv_0= 'CoordinationMasterPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'implements' ( ( ruleFQN ) ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinationMasterPortAccess().getCoordinationMasterPortKeyword_0());
            		
            // InternalComponentDefinition.g:3086:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDefinition.g:3087:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDefinition.g:3087:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDefinition.g:3088:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinationMasterPortAccess().getImplementsKeyword_2());
            		
            // InternalComponentDefinition.g:3108:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:3109:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:3109:4: ( ruleFQN )
            // InternalComponentDefinition.g:3110:5: ruleFQN
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

            // InternalComponentDefinition.g:3124:3: (otherlv_4= ';' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==15) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalComponentDefinition.g:3125:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:3134:1: entryRuleComponentParametersRef returns [EObject current=null] : iv_ruleComponentParametersRef= ruleComponentParametersRef EOF ;
    public final EObject entryRuleComponentParametersRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentParametersRef = null;


        try {
            // InternalComponentDefinition.g:3134:63: (iv_ruleComponentParametersRef= ruleComponentParametersRef EOF )
            // InternalComponentDefinition.g:3135:2: iv_ruleComponentParametersRef= ruleComponentParametersRef EOF
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
    // InternalComponentDefinition.g:3141:1: ruleComponentParametersRef returns [EObject current=null] : (otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )? ) ;
    public final EObject ruleComponentParametersRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3147:2: ( (otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )? ) )
            // InternalComponentDefinition.g:3148:2: (otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )? )
            {
            // InternalComponentDefinition.g:3148:2: (otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )? )
            // InternalComponentDefinition.g:3149:3: otherlv_0= 'ComponentParameters' ( ( ruleFQN ) ) (otherlv_2= 'slave' ( ( ruleFQN ) ) )? (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,73,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentParametersRefAccess().getComponentParametersKeyword_0());
            		
            // InternalComponentDefinition.g:3153:3: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:3154:4: ( ruleFQN )
            {
            // InternalComponentDefinition.g:3154:4: ( ruleFQN )
            // InternalComponentDefinition.g:3155:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentParametersRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentParametersRefAccess().getParameterComponentParameterCrossReference_1_0());
            				
            pushFollow(FOLLOW_47);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentDefinition.g:3169:3: (otherlv_2= 'slave' ( ( ruleFQN ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==74) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalComponentDefinition.g:3170:4: otherlv_2= 'slave' ( ( ruleFQN ) )
                    {
                    otherlv_2=(Token)match(input,74,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentParametersRefAccess().getSlaveKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:3174:4: ( ( ruleFQN ) )
                    // InternalComponentDefinition.g:3175:5: ( ruleFQN )
                    {
                    // InternalComponentDefinition.g:3175:5: ( ruleFQN )
                    // InternalComponentDefinition.g:3176:6: ruleFQN
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

            // InternalComponentDefinition.g:3191:3: (otherlv_4= ';' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==15) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalComponentDefinition.g:3192:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalComponentDefinition.g:3201:1: entryRuleRoboticMiddleware returns [EObject current=null] : iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF ;
    public final EObject entryRuleRoboticMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoboticMiddleware = null;


        try {
            // InternalComponentDefinition.g:3201:58: (iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF )
            // InternalComponentDefinition.g:3202:2: iv_ruleRoboticMiddleware= ruleRoboticMiddleware EOF
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
    // InternalComponentDefinition.g:3208:1: ruleRoboticMiddleware returns [EObject current=null] : (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft ) ;
    public final EObject ruleRoboticMiddleware() throws RecognitionException {
        EObject current = null;

        EObject this_ACE_SmartSoft_0 = null;

        EObject this_OpcUa_SeRoNet_1 = null;

        EObject this_CORBA_SmartSoft_2 = null;

        EObject this_DDS_SmartSoft_3 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3214:2: ( (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft ) )
            // InternalComponentDefinition.g:3215:2: (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft )
            {
            // InternalComponentDefinition.g:3215:2: (this_ACE_SmartSoft_0= ruleACE_SmartSoft | this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet | this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft | this_DDS_SmartSoft_3= ruleDDS_SmartSoft )
            int alt61=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt61=1;
                }
                break;
            case 84:
                {
                alt61=2;
                }
                break;
            case 85:
                {
                alt61=3;
                }
                break;
            case 86:
                {
                alt61=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalComponentDefinition.g:3216:3: this_ACE_SmartSoft_0= ruleACE_SmartSoft
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
                    // InternalComponentDefinition.g:3225:3: this_OpcUa_SeRoNet_1= ruleOpcUa_SeRoNet
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
                    // InternalComponentDefinition.g:3234:3: this_CORBA_SmartSoft_2= ruleCORBA_SmartSoft
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
                    // InternalComponentDefinition.g:3243:3: this_DDS_SmartSoft_3= ruleDDS_SmartSoft
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
    // InternalComponentDefinition.g:3255:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalComponentDefinition.g:3255:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalComponentDefinition.g:3256:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalComponentDefinition.g:3262:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3268:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalComponentDefinition.g:3269:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalComponentDefinition.g:3269:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalComponentDefinition.g:3270:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_48); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponentDefinition.g:3277:3: (kw= '.' this_ID_2= RULE_ID )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==75) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalComponentDefinition.g:3278:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,75,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_48); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // InternalComponentDefinition.g:3295:1: entryRuleFQNW returns [String current=null] : iv_ruleFQNW= ruleFQNW EOF ;
    public final String entryRuleFQNW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNW = null;


        try {
            // InternalComponentDefinition.g:3295:44: (iv_ruleFQNW= ruleFQNW EOF )
            // InternalComponentDefinition.g:3296:2: iv_ruleFQNW= ruleFQNW EOF
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
    // InternalComponentDefinition.g:3302:1: ruleFQNW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFQNW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3308:2: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // InternalComponentDefinition.g:3309:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // InternalComponentDefinition.g:3309:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // InternalComponentDefinition.g:3310:3: this_FQN_0= ruleFQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalComponentDefinition.g:3320:3: (kw= '.*' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==76) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalComponentDefinition.g:3321:4: kw= '.*'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

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
    // InternalComponentDefinition.g:3331:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentDefinition.g:3331:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentDefinition.g:3332:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentDefinition.g:3338:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3344:2: (this_STRING_0= RULE_STRING )
            // InternalComponentDefinition.g:3345:2: this_STRING_0= RULE_STRING
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
    // InternalComponentDefinition.g:3355:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalComponentDefinition.g:3355:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalComponentDefinition.g:3356:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalComponentDefinition.g:3362:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3368:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalComponentDefinition.g:3369:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalComponentDefinition.g:3369:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalComponentDefinition.g:3370:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalComponentDefinition.g:3370:3: (kw= '-' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==77) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalComponentDefinition.g:3371:4: kw= '-'
                    {
                    kw=(Token)match(input,77,FOLLOW_50); 

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
    // InternalComponentDefinition.g:3388:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalComponentDefinition.g:3388:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalComponentDefinition.g:3389:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalComponentDefinition.g:3395:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3401:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalComponentDefinition.g:3402:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalComponentDefinition.g:3402:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalComponentDefinition.g:3403:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalComponentDefinition.g:3403:3: (kw= '-' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==77) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalComponentDefinition.g:3404:4: kw= '-'
                    {
                    kw=(Token)match(input,77,FOLLOW_51); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalComponentDefinition.g:3410:3: (this_INT_1= RULE_INT )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_INT) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalComponentDefinition.g:3411:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_52); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,75,FOLLOW_50); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_53); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalComponentDefinition.g:3431:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=78 && LA69_0<=79)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalComponentDefinition.g:3432:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalComponentDefinition.g:3432:4: (kw= 'E' | kw= 'e' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==78) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==79) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalComponentDefinition.g:3433:5: kw= 'E'
                            {
                            kw=(Token)match(input,78,FOLLOW_34); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalComponentDefinition.g:3439:5: kw= 'e'
                            {
                            kw=(Token)match(input,79,FOLLOW_34); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalComponentDefinition.g:3445:4: (kw= '-' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==77) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalComponentDefinition.g:3446:5: kw= '-'
                            {
                            kw=(Token)match(input,77,FOLLOW_50); 

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
    // InternalComponentDefinition.g:3464:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalComponentDefinition.g:3464:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalComponentDefinition.g:3465:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalComponentDefinition.g:3471:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalComponentDefinition.g:3477:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalComponentDefinition.g:3478:2: (kw= 'true' | kw= 'false' )
            {
            // InternalComponentDefinition.g:3478:2: (kw= 'true' | kw= 'false' )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==80) ) {
                alt70=1;
            }
            else if ( (LA70_0==81) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalComponentDefinition.g:3479:3: kw= 'true'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:3485:3: kw= 'false'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

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
    // InternalComponentDefinition.g:3494:1: entryRuleACE_SmartSoft returns [EObject current=null] : iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF ;
    public final EObject entryRuleACE_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACE_SmartSoft = null;


        try {
            // InternalComponentDefinition.g:3494:54: (iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF )
            // InternalComponentDefinition.g:3495:2: iv_ruleACE_SmartSoft= ruleACE_SmartSoft EOF
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
    // InternalComponentDefinition.g:3501:1: ruleACE_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleACE_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3507:2: ( ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentDefinition.g:3508:2: ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentDefinition.g:3508:2: ( () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentDefinition.g:3509:3: () otherlv_1= 'ACE_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentDefinition.g:3509:3: ()
            // InternalComponentDefinition.g:3510:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1());
            		
            // InternalComponentDefinition.g:3520:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==83) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalComponentDefinition.g:3521:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,83,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:3525:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentDefinition.g:3526:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentDefinition.g:3526:5: (lv_description_3_0= ruleEString )
                    // InternalComponentDefinition.g:3527:6: lv_description_3_0= ruleEString
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
    // InternalComponentDefinition.g:3549:1: entryRuleOpcUa_SeRoNet returns [EObject current=null] : iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF ;
    public final EObject entryRuleOpcUa_SeRoNet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpcUa_SeRoNet = null;


        try {
            // InternalComponentDefinition.g:3549:54: (iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF )
            // InternalComponentDefinition.g:3550:2: iv_ruleOpcUa_SeRoNet= ruleOpcUa_SeRoNet EOF
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
    // InternalComponentDefinition.g:3556:1: ruleOpcUa_SeRoNet returns [EObject current=null] : ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleOpcUa_SeRoNet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3562:2: ( ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentDefinition.g:3563:2: ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentDefinition.g:3563:2: ( () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentDefinition.g:3564:3: () otherlv_1= 'OpcUa_SeRoNet' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentDefinition.g:3564:3: ()
            // InternalComponentDefinition.g:3565:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1());
            		
            // InternalComponentDefinition.g:3575:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==83) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalComponentDefinition.g:3576:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,83,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:3580:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentDefinition.g:3581:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentDefinition.g:3581:5: (lv_description_3_0= ruleEString )
                    // InternalComponentDefinition.g:3582:6: lv_description_3_0= ruleEString
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
    // InternalComponentDefinition.g:3604:1: entryRuleCORBA_SmartSoft returns [EObject current=null] : iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF ;
    public final EObject entryRuleCORBA_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCORBA_SmartSoft = null;


        try {
            // InternalComponentDefinition.g:3604:56: (iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF )
            // InternalComponentDefinition.g:3605:2: iv_ruleCORBA_SmartSoft= ruleCORBA_SmartSoft EOF
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
    // InternalComponentDefinition.g:3611:1: ruleCORBA_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleCORBA_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3617:2: ( ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentDefinition.g:3618:2: ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentDefinition.g:3618:2: ( () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentDefinition.g:3619:3: () otherlv_1= 'CORBA_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentDefinition.g:3619:3: ()
            // InternalComponentDefinition.g:3620:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1());
            		
            // InternalComponentDefinition.g:3630:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==83) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalComponentDefinition.g:3631:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,83,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:3635:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentDefinition.g:3636:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentDefinition.g:3636:5: (lv_description_3_0= ruleEString )
                    // InternalComponentDefinition.g:3637:6: lv_description_3_0= ruleEString
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
    // InternalComponentDefinition.g:3659:1: entryRuleDDS_SmartSoft returns [EObject current=null] : iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF ;
    public final EObject entryRuleDDS_SmartSoft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDS_SmartSoft = null;


        try {
            // InternalComponentDefinition.g:3659:54: (iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF )
            // InternalComponentDefinition.g:3660:2: iv_ruleDDS_SmartSoft= ruleDDS_SmartSoft EOF
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
    // InternalComponentDefinition.g:3666:1: ruleDDS_SmartSoft returns [EObject current=null] : ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleDDS_SmartSoft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDefinition.g:3672:2: ( ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ) )
            // InternalComponentDefinition.g:3673:2: ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            {
            // InternalComponentDefinition.g:3673:2: ( () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? )
            // InternalComponentDefinition.g:3674:3: () otherlv_1= 'DDS_SmartSoft' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            {
            // InternalComponentDefinition.g:3674:3: ()
            // InternalComponentDefinition.g:3675:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,86,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1());
            		
            // InternalComponentDefinition.g:3685:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==83) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalComponentDefinition.g:3686:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,83,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalComponentDefinition.g:3690:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalComponentDefinition.g:3691:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalComponentDefinition.g:3691:5: (lv_description_3_0= ruleEString )
                    // InternalComponentDefinition.g:3692:6: lv_description_3_0= ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000014012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xE420000133580010L,0x0000000000000300L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L,0x0000000000740000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001823E00080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001820000080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003E00080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000001C000080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000500000088000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000500000080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000080L,0x0000000000002800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x001A000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000080L,0x0000000000002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x03C0000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x03C0000000080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1000000000008002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000008080010L,0x0000000000000087L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000400L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000800L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});

}
