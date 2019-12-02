package org.xtext.service.serviceDefinition.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.service.serviceDefinition.services.ServiceDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalServiceDefinitionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOCU_COMMENT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'.*'", "'-'", "'ServiceDefRepository'", "'version'", "'{'", "'}'", "'#import'", "';'", "'ForkingServiceDefinition'", "'JoiningServiceDefinition'", "'RequestAnswerServiceDefinition'", "'CoordinationServiceDefinition'", "'CommunicationServiceUsage'", "'uses'", "'StatePattern'", "'<'", "'lifecycle'", "'with'", "'>'", "'ParameterPattern'", "'DynamicWiringPattern'", "'MonitoringPattern'", "'PushPattern'", "'DataType'", "'='", "'EventPattern'", "'EventType'", "'ActivationType'", "'EventStateType'", "'QueryPattern'", "'RequestType'", "'AnswerType'", "'SendPattern'", "'ServiceProperty'"
    };
    public static final int RULE_ML_DOCUMENTATION=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int RULE_DOCU_COMMENT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int RULE_SL_DOCUMENTATION=10;
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
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
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


        public InternalServiceDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalServiceDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalServiceDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalServiceDefinition.g"; }



     	private ServiceDefinitionGrammarAccess grammarAccess;

        public InternalServiceDefinitionParser(TokenStream input, ServiceDefinitionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ServiceDefModel";
       	}

       	@Override
       	protected ServiceDefinitionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleServiceDefModel"
    // InternalServiceDefinition.g:79:1: entryRuleServiceDefModel returns [EObject current=null] : iv_ruleServiceDefModel= ruleServiceDefModel EOF ;
    public final EObject entryRuleServiceDefModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceDefModel = null;


        try {
            // InternalServiceDefinition.g:79:56: (iv_ruleServiceDefModel= ruleServiceDefModel EOF )
            // InternalServiceDefinition.g:80:2: iv_ruleServiceDefModel= ruleServiceDefModel EOF
            {
             newCompositeNode(grammarAccess.getServiceDefModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceDefModel=ruleServiceDefModel();

            state._fsp--;

             current =iv_ruleServiceDefModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceDefModel"


    // $ANTLR start "ruleServiceDefModel"
    // InternalServiceDefinition.g:86:1: ruleServiceDefModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleCommRepoImport ) )* ( (lv_repository_2_0= ruleServiceDefRepository ) )? ) ;
    public final EObject ruleServiceDefModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_repository_2_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:92:2: ( ( () ( (lv_imports_1_0= ruleCommRepoImport ) )* ( (lv_repository_2_0= ruleServiceDefRepository ) )? ) )
            // InternalServiceDefinition.g:93:2: ( () ( (lv_imports_1_0= ruleCommRepoImport ) )* ( (lv_repository_2_0= ruleServiceDefRepository ) )? )
            {
            // InternalServiceDefinition.g:93:2: ( () ( (lv_imports_1_0= ruleCommRepoImport ) )* ( (lv_repository_2_0= ruleServiceDefRepository ) )? )
            // InternalServiceDefinition.g:94:3: () ( (lv_imports_1_0= ruleCommRepoImport ) )* ( (lv_repository_2_0= ruleServiceDefRepository ) )?
            {
            // InternalServiceDefinition.g:94:3: ()
            // InternalServiceDefinition.g:95:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceDefModelAccess().getServiceDefModelAction_0(),
            					current);
            			

            }

            // InternalServiceDefinition.g:101:3: ( (lv_imports_1_0= ruleCommRepoImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalServiceDefinition.g:102:4: (lv_imports_1_0= ruleCommRepoImport )
            	    {
            	    // InternalServiceDefinition.g:102:4: (lv_imports_1_0= ruleCommRepoImport )
            	    // InternalServiceDefinition.g:103:5: lv_imports_1_0= ruleCommRepoImport
            	    {

            	    					newCompositeNode(grammarAccess.getServiceDefModelAccess().getImportsCommRepoImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleCommRepoImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServiceDefModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"org.xtext.service.serviceDefinition.ServiceDefinition.CommRepoImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalServiceDefinition.g:120:3: ( (lv_repository_2_0= ruleServiceDefRepository ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOCU_COMMENT||LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalServiceDefinition.g:121:4: (lv_repository_2_0= ruleServiceDefRepository )
                    {
                    // InternalServiceDefinition.g:121:4: (lv_repository_2_0= ruleServiceDefRepository )
                    // InternalServiceDefinition.g:122:5: lv_repository_2_0= ruleServiceDefRepository
                    {

                    					newCompositeNode(grammarAccess.getServiceDefModelAccess().getRepositoryServiceDefRepositoryParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repository_2_0=ruleServiceDefRepository();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getServiceDefModelRule());
                    					}
                    					set(
                    						current,
                    						"repository",
                    						lv_repository_2_0,
                    						"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceDefRepository");
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
    // $ANTLR end "ruleServiceDefModel"


    // $ANTLR start "entryRuleFQN"
    // InternalServiceDefinition.g:143:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalServiceDefinition.g:143:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalServiceDefinition.g:144:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalServiceDefinition.g:150:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:156:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalServiceDefinition.g:157:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalServiceDefinition.g:157:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalServiceDefinition.g:158:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalServiceDefinition.g:165:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalServiceDefinition.g:166:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalServiceDefinition.g:183:1: entryRuleFQNW returns [String current=null] : iv_ruleFQNW= ruleFQNW EOF ;
    public final String entryRuleFQNW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNW = null;


        try {
            // InternalServiceDefinition.g:183:44: (iv_ruleFQNW= ruleFQNW EOF )
            // InternalServiceDefinition.g:184:2: iv_ruleFQNW= ruleFQNW EOF
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
    // InternalServiceDefinition.g:190:1: ruleFQNW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFQNW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:196:2: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // InternalServiceDefinition.g:197:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // InternalServiceDefinition.g:197:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // InternalServiceDefinition.g:198:3: this_FQN_0= ruleFQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalServiceDefinition.g:208:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalServiceDefinition.g:209:4: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEInt"
    // InternalServiceDefinition.g:219:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalServiceDefinition.g:219:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalServiceDefinition.g:220:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalServiceDefinition.g:226:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:232:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalServiceDefinition.g:233:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalServiceDefinition.g:233:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalServiceDefinition.g:234:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalServiceDefinition.g:234:3: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalServiceDefinition.g:235:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_7); 

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


    // $ANTLR start "entryRuleServiceDefRepository"
    // InternalServiceDefinition.g:252:1: entryRuleServiceDefRepository returns [EObject current=null] : iv_ruleServiceDefRepository= ruleServiceDefRepository EOF ;
    public final EObject entryRuleServiceDefRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceDefRepository = null;


        try {
            // InternalServiceDefinition.g:252:61: (iv_ruleServiceDefRepository= ruleServiceDefRepository EOF )
            // InternalServiceDefinition.g:253:2: iv_ruleServiceDefRepository= ruleServiceDefRepository EOF
            {
             newCompositeNode(grammarAccess.getServiceDefRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceDefRepository=ruleServiceDefRepository();

            state._fsp--;

             current =iv_ruleServiceDefRepository; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceDefRepository"


    // $ANTLR start "ruleServiceDefRepository"
    // InternalServiceDefinition.g:259:1: ruleServiceDefRepository returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ServiceDefRepository' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'version' ( (lv_version_4_0= ruleServiceRepoVersion ) ) )? otherlv_5= '{' ( (lv_services_6_0= ruleAbstractServiceDefinition ) )* otherlv_7= '}' ) ;
    public final EObject ruleServiceDefRepository() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_version_4_0 = null;

        EObject lv_services_6_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:265:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ServiceDefRepository' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'version' ( (lv_version_4_0= ruleServiceRepoVersion ) ) )? otherlv_5= '{' ( (lv_services_6_0= ruleAbstractServiceDefinition ) )* otherlv_7= '}' ) )
            // InternalServiceDefinition.g:266:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ServiceDefRepository' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'version' ( (lv_version_4_0= ruleServiceRepoVersion ) ) )? otherlv_5= '{' ( (lv_services_6_0= ruleAbstractServiceDefinition ) )* otherlv_7= '}' )
            {
            // InternalServiceDefinition.g:266:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ServiceDefRepository' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'version' ( (lv_version_4_0= ruleServiceRepoVersion ) ) )? otherlv_5= '{' ( (lv_services_6_0= ruleAbstractServiceDefinition ) )* otherlv_7= '}' )
            // InternalServiceDefinition.g:267:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ServiceDefRepository' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'version' ( (lv_version_4_0= ruleServiceRepoVersion ) ) )? otherlv_5= '{' ( (lv_services_6_0= ruleAbstractServiceDefinition ) )* otherlv_7= '}'
            {
            // InternalServiceDefinition.g:267:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOCU_COMMENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalServiceDefinition.g:268:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalServiceDefinition.g:268:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalServiceDefinition.g:269:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_8); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getServiceDefRepositoryAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getServiceDefRepositoryRule());
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

            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceDefRepositoryAccess().getServiceDefRepositoryKeyword_1());
            		
            // InternalServiceDefinition.g:289:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalServiceDefinition.g:290:4: (lv_name_2_0= RULE_ID )
            {
            // InternalServiceDefinition.g:290:4: (lv_name_2_0= RULE_ID )
            // InternalServiceDefinition.g:291:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getServiceDefRepositoryAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceDefRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalServiceDefinition.g:307:3: (otherlv_3= 'version' ( (lv_version_4_0= ruleServiceRepoVersion ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalServiceDefinition.g:308:4: otherlv_3= 'version' ( (lv_version_4_0= ruleServiceRepoVersion ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getServiceDefRepositoryAccess().getVersionKeyword_3_0());
                    			
                    // InternalServiceDefinition.g:312:4: ( (lv_version_4_0= ruleServiceRepoVersion ) )
                    // InternalServiceDefinition.g:313:5: (lv_version_4_0= ruleServiceRepoVersion )
                    {
                    // InternalServiceDefinition.g:313:5: (lv_version_4_0= ruleServiceRepoVersion )
                    // InternalServiceDefinition.g:314:6: lv_version_4_0= ruleServiceRepoVersion
                    {

                    						newCompositeNode(grammarAccess.getServiceDefRepositoryAccess().getVersionServiceRepoVersionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_version_4_0=ruleServiceRepoVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceDefRepositoryRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_4_0,
                    							"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceRepoVersion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getServiceDefRepositoryAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalServiceDefinition.g:336:3: ( (lv_services_6_0= ruleAbstractServiceDefinition ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_DOCU_COMMENT||(LA8_0>=23 && LA8_0<=26)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalServiceDefinition.g:337:4: (lv_services_6_0= ruleAbstractServiceDefinition )
            	    {
            	    // InternalServiceDefinition.g:337:4: (lv_services_6_0= ruleAbstractServiceDefinition )
            	    // InternalServiceDefinition.g:338:5: lv_services_6_0= ruleAbstractServiceDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getServiceDefRepositoryAccess().getServicesAbstractServiceDefinitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_services_6_0=ruleAbstractServiceDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServiceDefRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"services",
            	    						lv_services_6_0,
            	    						"org.xtext.service.serviceDefinition.ServiceDefinition.AbstractServiceDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceDefRepositoryAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceDefRepository"


    // $ANTLR start "entryRuleServiceRepoVersion"
    // InternalServiceDefinition.g:363:1: entryRuleServiceRepoVersion returns [EObject current=null] : iv_ruleServiceRepoVersion= ruleServiceRepoVersion EOF ;
    public final EObject entryRuleServiceRepoVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceRepoVersion = null;


        try {
            // InternalServiceDefinition.g:363:59: (iv_ruleServiceRepoVersion= ruleServiceRepoVersion EOF )
            // InternalServiceDefinition.g:364:2: iv_ruleServiceRepoVersion= ruleServiceRepoVersion EOF
            {
             newCompositeNode(grammarAccess.getServiceRepoVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceRepoVersion=ruleServiceRepoVersion();

            state._fsp--;

             current =iv_ruleServiceRepoVersion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceRepoVersion"


    // $ANTLR start "ruleServiceRepoVersion"
    // InternalServiceDefinition.g:370:1: ruleServiceRepoVersion returns [EObject current=null] : ( ( (lv_major_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_minor_2_0= ruleEInt ) ) (otherlv_3= '.' ( (lv_patch_4_0= ruleEInt ) ) )? ) ;
    public final EObject ruleServiceRepoVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_major_0_0 = null;

        AntlrDatatypeRuleToken lv_minor_2_0 = null;

        AntlrDatatypeRuleToken lv_patch_4_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:376:2: ( ( ( (lv_major_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_minor_2_0= ruleEInt ) ) (otherlv_3= '.' ( (lv_patch_4_0= ruleEInt ) ) )? ) )
            // InternalServiceDefinition.g:377:2: ( ( (lv_major_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_minor_2_0= ruleEInt ) ) (otherlv_3= '.' ( (lv_patch_4_0= ruleEInt ) ) )? )
            {
            // InternalServiceDefinition.g:377:2: ( ( (lv_major_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_minor_2_0= ruleEInt ) ) (otherlv_3= '.' ( (lv_patch_4_0= ruleEInt ) ) )? )
            // InternalServiceDefinition.g:378:3: ( (lv_major_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_minor_2_0= ruleEInt ) ) (otherlv_3= '.' ( (lv_patch_4_0= ruleEInt ) ) )?
            {
            // InternalServiceDefinition.g:378:3: ( (lv_major_0_0= ruleEInt ) )
            // InternalServiceDefinition.g:379:4: (lv_major_0_0= ruleEInt )
            {
            // InternalServiceDefinition.g:379:4: (lv_major_0_0= ruleEInt )
            // InternalServiceDefinition.g:380:5: lv_major_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getServiceRepoVersionAccess().getMajorEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_major_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRepoVersionRule());
            					}
            					set(
            						current,
            						"major",
            						lv_major_0_0,
            						"org.xtext.service.serviceDefinition.ServiceDefinition.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_1());
            		
            // InternalServiceDefinition.g:401:3: ( (lv_minor_2_0= ruleEInt ) )
            // InternalServiceDefinition.g:402:4: (lv_minor_2_0= ruleEInt )
            {
            // InternalServiceDefinition.g:402:4: (lv_minor_2_0= ruleEInt )
            // InternalServiceDefinition.g:403:5: lv_minor_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getServiceRepoVersionAccess().getMinorEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_minor_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRepoVersionRule());
            					}
            					set(
            						current,
            						"minor",
            						lv_minor_2_0,
            						"org.xtext.service.serviceDefinition.ServiceDefinition.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalServiceDefinition.g:420:3: (otherlv_3= '.' ( (lv_patch_4_0= ruleEInt ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalServiceDefinition.g:421:4: otherlv_3= '.' ( (lv_patch_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_3_0());
                    			
                    // InternalServiceDefinition.g:425:4: ( (lv_patch_4_0= ruleEInt ) )
                    // InternalServiceDefinition.g:426:5: (lv_patch_4_0= ruleEInt )
                    {
                    // InternalServiceDefinition.g:426:5: (lv_patch_4_0= ruleEInt )
                    // InternalServiceDefinition.g:427:6: lv_patch_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getServiceRepoVersionAccess().getPatchEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_patch_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRepoVersionRule());
                    						}
                    						set(
                    							current,
                    							"patch",
                    							lv_patch_4_0,
                    							"org.xtext.service.serviceDefinition.ServiceDefinition.EInt");
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
    // $ANTLR end "ruleServiceRepoVersion"


    // $ANTLR start "entryRuleCommRepoImport"
    // InternalServiceDefinition.g:449:1: entryRuleCommRepoImport returns [EObject current=null] : iv_ruleCommRepoImport= ruleCommRepoImport EOF ;
    public final EObject entryRuleCommRepoImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommRepoImport = null;


        try {
            // InternalServiceDefinition.g:449:55: (iv_ruleCommRepoImport= ruleCommRepoImport EOF )
            // InternalServiceDefinition.g:450:2: iv_ruleCommRepoImport= ruleCommRepoImport EOF
            {
             newCompositeNode(grammarAccess.getCommRepoImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommRepoImport=ruleCommRepoImport();

            state._fsp--;

             current =iv_ruleCommRepoImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommRepoImport"


    // $ANTLR start "ruleCommRepoImport"
    // InternalServiceDefinition.g:456:1: ruleCommRepoImport returns [EObject current=null] : (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleCommRepoImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:462:2: ( (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) )
            // InternalServiceDefinition.g:463:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            {
            // InternalServiceDefinition.g:463:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            // InternalServiceDefinition.g:464:3: otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCommRepoImportAccess().getImportKeyword_0());
            		
            // InternalServiceDefinition.g:468:3: ( (lv_importedNamespace_1_0= ruleFQNW ) )
            // InternalServiceDefinition.g:469:4: (lv_importedNamespace_1_0= ruleFQNW )
            {
            // InternalServiceDefinition.g:469:4: (lv_importedNamespace_1_0= ruleFQNW )
            // InternalServiceDefinition.g:470:5: lv_importedNamespace_1_0= ruleFQNW
            {

            					newCompositeNode(grammarAccess.getCommRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_importedNamespace_1_0=ruleFQNW();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommRepoImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.xtext.service.serviceDefinition.ServiceDefinition.FQNW");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalServiceDefinition.g:487:3: (otherlv_2= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalServiceDefinition.g:488:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommRepoImportAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleCommRepoImport"


    // $ANTLR start "entryRuleAbstractServiceDefinition"
    // InternalServiceDefinition.g:497:1: entryRuleAbstractServiceDefinition returns [EObject current=null] : iv_ruleAbstractServiceDefinition= ruleAbstractServiceDefinition EOF ;
    public final EObject entryRuleAbstractServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractServiceDefinition = null;


        try {
            // InternalServiceDefinition.g:497:66: (iv_ruleAbstractServiceDefinition= ruleAbstractServiceDefinition EOF )
            // InternalServiceDefinition.g:498:2: iv_ruleAbstractServiceDefinition= ruleAbstractServiceDefinition EOF
            {
             newCompositeNode(grammarAccess.getAbstractServiceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractServiceDefinition=ruleAbstractServiceDefinition();

            state._fsp--;

             current =iv_ruleAbstractServiceDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractServiceDefinition"


    // $ANTLR start "ruleAbstractServiceDefinition"
    // InternalServiceDefinition.g:504:1: ruleAbstractServiceDefinition returns [EObject current=null] : (this_CommunicationServiceDefinition_0= ruleCommunicationServiceDefinition | this_CoordinationServiceDefinition_1= ruleCoordinationServiceDefinition ) ;
    public final EObject ruleAbstractServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CommunicationServiceDefinition_0 = null;

        EObject this_CoordinationServiceDefinition_1 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:510:2: ( (this_CommunicationServiceDefinition_0= ruleCommunicationServiceDefinition | this_CoordinationServiceDefinition_1= ruleCoordinationServiceDefinition ) )
            // InternalServiceDefinition.g:511:2: (this_CommunicationServiceDefinition_0= ruleCommunicationServiceDefinition | this_CoordinationServiceDefinition_1= ruleCoordinationServiceDefinition )
            {
            // InternalServiceDefinition.g:511:2: (this_CommunicationServiceDefinition_0= ruleCommunicationServiceDefinition | this_CoordinationServiceDefinition_1= ruleCoordinationServiceDefinition )
            int alt11=2;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
                {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1>=23 && LA11_1<=25)) ) {
                    alt11=1;
                }
                else if ( (LA11_1==26) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
            case 24:
            case 25:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalServiceDefinition.g:512:3: this_CommunicationServiceDefinition_0= ruleCommunicationServiceDefinition
                    {

                    			newCompositeNode(grammarAccess.getAbstractServiceDefinitionAccess().getCommunicationServiceDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommunicationServiceDefinition_0=ruleCommunicationServiceDefinition();

                    state._fsp--;


                    			current = this_CommunicationServiceDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalServiceDefinition.g:521:3: this_CoordinationServiceDefinition_1= ruleCoordinationServiceDefinition
                    {

                    			newCompositeNode(grammarAccess.getAbstractServiceDefinitionAccess().getCoordinationServiceDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoordinationServiceDefinition_1=ruleCoordinationServiceDefinition();

                    state._fsp--;


                    			current = this_CoordinationServiceDefinition_1;
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
    // $ANTLR end "ruleAbstractServiceDefinition"


    // $ANTLR start "entryRuleCommunicationServiceDefinition"
    // InternalServiceDefinition.g:533:1: entryRuleCommunicationServiceDefinition returns [EObject current=null] : iv_ruleCommunicationServiceDefinition= ruleCommunicationServiceDefinition EOF ;
    public final EObject entryRuleCommunicationServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationServiceDefinition = null;


        try {
            // InternalServiceDefinition.g:533:71: (iv_ruleCommunicationServiceDefinition= ruleCommunicationServiceDefinition EOF )
            // InternalServiceDefinition.g:534:2: iv_ruleCommunicationServiceDefinition= ruleCommunicationServiceDefinition EOF
            {
             newCompositeNode(grammarAccess.getCommunicationServiceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommunicationServiceDefinition=ruleCommunicationServiceDefinition();

            state._fsp--;

             current =iv_ruleCommunicationServiceDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommunicationServiceDefinition"


    // $ANTLR start "ruleCommunicationServiceDefinition"
    // InternalServiceDefinition.g:540:1: ruleCommunicationServiceDefinition returns [EObject current=null] : (this_ForkingServiceDefinition_0= ruleForkingServiceDefinition | this_JoyningServiceDefinition_1= ruleJoyningServiceDefinition | this_RequestAnswerServiceDefinition_2= ruleRequestAnswerServiceDefinition ) ;
    public final EObject ruleCommunicationServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ForkingServiceDefinition_0 = null;

        EObject this_JoyningServiceDefinition_1 = null;

        EObject this_RequestAnswerServiceDefinition_2 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:546:2: ( (this_ForkingServiceDefinition_0= ruleForkingServiceDefinition | this_JoyningServiceDefinition_1= ruleJoyningServiceDefinition | this_RequestAnswerServiceDefinition_2= ruleRequestAnswerServiceDefinition ) )
            // InternalServiceDefinition.g:547:2: (this_ForkingServiceDefinition_0= ruleForkingServiceDefinition | this_JoyningServiceDefinition_1= ruleJoyningServiceDefinition | this_RequestAnswerServiceDefinition_2= ruleRequestAnswerServiceDefinition )
            {
            // InternalServiceDefinition.g:547:2: (this_ForkingServiceDefinition_0= ruleForkingServiceDefinition | this_JoyningServiceDefinition_1= ruleJoyningServiceDefinition | this_RequestAnswerServiceDefinition_2= ruleRequestAnswerServiceDefinition )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt12=1;
                    }
                    break;
                case 24:
                    {
                    alt12=2;
                    }
                    break;
                case 25:
                    {
                    alt12=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

                }
                break;
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalServiceDefinition.g:548:3: this_ForkingServiceDefinition_0= ruleForkingServiceDefinition
                    {

                    			newCompositeNode(grammarAccess.getCommunicationServiceDefinitionAccess().getForkingServiceDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForkingServiceDefinition_0=ruleForkingServiceDefinition();

                    state._fsp--;


                    			current = this_ForkingServiceDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalServiceDefinition.g:557:3: this_JoyningServiceDefinition_1= ruleJoyningServiceDefinition
                    {

                    			newCompositeNode(grammarAccess.getCommunicationServiceDefinitionAccess().getJoyningServiceDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JoyningServiceDefinition_1=ruleJoyningServiceDefinition();

                    state._fsp--;


                    			current = this_JoyningServiceDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalServiceDefinition.g:566:3: this_RequestAnswerServiceDefinition_2= ruleRequestAnswerServiceDefinition
                    {

                    			newCompositeNode(grammarAccess.getCommunicationServiceDefinitionAccess().getRequestAnswerServiceDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequestAnswerServiceDefinition_2=ruleRequestAnswerServiceDefinition();

                    state._fsp--;


                    			current = this_RequestAnswerServiceDefinition_2;
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
    // $ANTLR end "ruleCommunicationServiceDefinition"


    // $ANTLR start "entryRuleForkingServiceDefinition"
    // InternalServiceDefinition.g:578:1: entryRuleForkingServiceDefinition returns [EObject current=null] : iv_ruleForkingServiceDefinition= ruleForkingServiceDefinition EOF ;
    public final EObject entryRuleForkingServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForkingServiceDefinition = null;


        try {
            // InternalServiceDefinition.g:578:65: (iv_ruleForkingServiceDefinition= ruleForkingServiceDefinition EOF )
            // InternalServiceDefinition.g:579:2: iv_ruleForkingServiceDefinition= ruleForkingServiceDefinition EOF
            {
             newCompositeNode(grammarAccess.getForkingServiceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForkingServiceDefinition=ruleForkingServiceDefinition();

            state._fsp--;

             current =iv_ruleForkingServiceDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForkingServiceDefinition"


    // $ANTLR start "ruleForkingServiceDefinition"
    // InternalServiceDefinition.g:585:1: ruleForkingServiceDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ForkingServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleForkingPatternInstance ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}' ) ;
    public final EObject ruleForkingServiceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_pattern_4_0 = null;

        EObject lv_properties_5_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:591:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ForkingServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleForkingPatternInstance ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}' ) )
            // InternalServiceDefinition.g:592:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ForkingServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleForkingPatternInstance ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}' )
            {
            // InternalServiceDefinition.g:592:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ForkingServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleForkingPatternInstance ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}' )
            // InternalServiceDefinition.g:593:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ForkingServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleForkingPatternInstance ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}'
            {
            // InternalServiceDefinition.g:593:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DOCU_COMMENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalServiceDefinition.g:594:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalServiceDefinition.g:594:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalServiceDefinition.g:595:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_15); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getForkingServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getForkingServiceDefinitionRule());
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

            otherlv_1=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getForkingServiceDefinitionAccess().getForkingServiceDefinitionKeyword_1());
            		
            // InternalServiceDefinition.g:615:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalServiceDefinition.g:616:4: (lv_name_2_0= RULE_ID )
            {
            // InternalServiceDefinition.g:616:4: (lv_name_2_0= RULE_ID )
            // InternalServiceDefinition.g:617:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getForkingServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForkingServiceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getForkingServiceDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalServiceDefinition.g:637:3: ( (lv_pattern_4_0= ruleForkingPatternInstance ) )
            // InternalServiceDefinition.g:638:4: (lv_pattern_4_0= ruleForkingPatternInstance )
            {
            // InternalServiceDefinition.g:638:4: (lv_pattern_4_0= ruleForkingPatternInstance )
            // InternalServiceDefinition.g:639:5: lv_pattern_4_0= ruleForkingPatternInstance
            {

            					newCompositeNode(grammarAccess.getForkingServiceDefinitionAccess().getPatternForkingPatternInstanceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_pattern_4_0=ruleForkingPatternInstance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForkingServiceDefinitionRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_4_0,
            						"org.xtext.service.serviceDefinition.ServiceDefinition.ForkingPatternInstance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalServiceDefinition.g:656:3: ( (lv_properties_5_0= ruleServiceProperty ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==48) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalServiceDefinition.g:657:4: (lv_properties_5_0= ruleServiceProperty )
            	    {
            	    // InternalServiceDefinition.g:657:4: (lv_properties_5_0= ruleServiceProperty )
            	    // InternalServiceDefinition.g:658:5: lv_properties_5_0= ruleServiceProperty
            	    {

            	    					newCompositeNode(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_properties_5_0=ruleServiceProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForkingServiceDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_5_0,
            	    						"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getForkingServiceDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForkingServiceDefinition"


    // $ANTLR start "entryRuleJoyningServiceDefinition"
    // InternalServiceDefinition.g:683:1: entryRuleJoyningServiceDefinition returns [EObject current=null] : iv_ruleJoyningServiceDefinition= ruleJoyningServiceDefinition EOF ;
    public final EObject entryRuleJoyningServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoyningServiceDefinition = null;


        try {
            // InternalServiceDefinition.g:683:65: (iv_ruleJoyningServiceDefinition= ruleJoyningServiceDefinition EOF )
            // InternalServiceDefinition.g:684:2: iv_ruleJoyningServiceDefinition= ruleJoyningServiceDefinition EOF
            {
             newCompositeNode(grammarAccess.getJoyningServiceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoyningServiceDefinition=ruleJoyningServiceDefinition();

            state._fsp--;

             current =iv_ruleJoyningServiceDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoyningServiceDefinition"


    // $ANTLR start "ruleJoyningServiceDefinition"
    // InternalServiceDefinition.g:690:1: ruleJoyningServiceDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'JoiningServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleJoiningPatternInstance ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}' ) ;
    public final EObject ruleJoyningServiceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_pattern_4_0 = null;

        EObject lv_properties_5_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:696:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'JoiningServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleJoiningPatternInstance ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}' ) )
            // InternalServiceDefinition.g:697:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'JoiningServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleJoiningPatternInstance ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}' )
            {
            // InternalServiceDefinition.g:697:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'JoiningServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleJoiningPatternInstance ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}' )
            // InternalServiceDefinition.g:698:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'JoiningServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleJoiningPatternInstance ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}'
            {
            // InternalServiceDefinition.g:698:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DOCU_COMMENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalServiceDefinition.g:699:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalServiceDefinition.g:699:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalServiceDefinition.g:700:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_18); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getJoyningServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJoyningServiceDefinitionRule());
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

            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getJoyningServiceDefinitionAccess().getJoiningServiceDefinitionKeyword_1());
            		
            // InternalServiceDefinition.g:720:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalServiceDefinition.g:721:4: (lv_name_2_0= RULE_ID )
            {
            // InternalServiceDefinition.g:721:4: (lv_name_2_0= RULE_ID )
            // InternalServiceDefinition.g:722:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getJoyningServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoyningServiceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getJoyningServiceDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalServiceDefinition.g:742:3: ( (lv_pattern_4_0= ruleJoiningPatternInstance ) )
            // InternalServiceDefinition.g:743:4: (lv_pattern_4_0= ruleJoiningPatternInstance )
            {
            // InternalServiceDefinition.g:743:4: (lv_pattern_4_0= ruleJoiningPatternInstance )
            // InternalServiceDefinition.g:744:5: lv_pattern_4_0= ruleJoiningPatternInstance
            {

            					newCompositeNode(grammarAccess.getJoyningServiceDefinitionAccess().getPatternJoiningPatternInstanceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_pattern_4_0=ruleJoiningPatternInstance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoyningServiceDefinitionRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_4_0,
            						"org.xtext.service.serviceDefinition.ServiceDefinition.JoiningPatternInstance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalServiceDefinition.g:761:3: ( (lv_properties_5_0= ruleServiceProperty ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==48) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalServiceDefinition.g:762:4: (lv_properties_5_0= ruleServiceProperty )
            	    {
            	    // InternalServiceDefinition.g:762:4: (lv_properties_5_0= ruleServiceProperty )
            	    // InternalServiceDefinition.g:763:5: lv_properties_5_0= ruleServiceProperty
            	    {

            	    					newCompositeNode(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_properties_5_0=ruleServiceProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJoyningServiceDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_5_0,
            	    						"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getJoyningServiceDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoyningServiceDefinition"


    // $ANTLR start "entryRuleRequestAnswerServiceDefinition"
    // InternalServiceDefinition.g:788:1: entryRuleRequestAnswerServiceDefinition returns [EObject current=null] : iv_ruleRequestAnswerServiceDefinition= ruleRequestAnswerServiceDefinition EOF ;
    public final EObject entryRuleRequestAnswerServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestAnswerServiceDefinition = null;


        try {
            // InternalServiceDefinition.g:788:71: (iv_ruleRequestAnswerServiceDefinition= ruleRequestAnswerServiceDefinition EOF )
            // InternalServiceDefinition.g:789:2: iv_ruleRequestAnswerServiceDefinition= ruleRequestAnswerServiceDefinition EOF
            {
             newCompositeNode(grammarAccess.getRequestAnswerServiceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequestAnswerServiceDefinition=ruleRequestAnswerServiceDefinition();

            state._fsp--;

             current =iv_ruleRequestAnswerServiceDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequestAnswerServiceDefinition"


    // $ANTLR start "ruleRequestAnswerServiceDefinition"
    // InternalServiceDefinition.g:795:1: ruleRequestAnswerServiceDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'RequestAnswerServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleRequestAnswerPattern ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}' ) ;
    public final EObject ruleRequestAnswerServiceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_pattern_4_0 = null;

        EObject lv_properties_5_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:801:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'RequestAnswerServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleRequestAnswerPattern ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}' ) )
            // InternalServiceDefinition.g:802:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'RequestAnswerServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleRequestAnswerPattern ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}' )
            {
            // InternalServiceDefinition.g:802:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'RequestAnswerServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleRequestAnswerPattern ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}' )
            // InternalServiceDefinition.g:803:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'RequestAnswerServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_pattern_4_0= ruleRequestAnswerPattern ) ) ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= '}'
            {
            // InternalServiceDefinition.g:803:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DOCU_COMMENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalServiceDefinition.g:804:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalServiceDefinition.g:804:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalServiceDefinition.g:805:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_20); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getRequestAnswerServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRequestAnswerServiceDefinitionRule());
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

            otherlv_1=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRequestAnswerServiceDefinitionAccess().getRequestAnswerServiceDefinitionKeyword_1());
            		
            // InternalServiceDefinition.g:825:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalServiceDefinition.g:826:4: (lv_name_2_0= RULE_ID )
            {
            // InternalServiceDefinition.g:826:4: (lv_name_2_0= RULE_ID )
            // InternalServiceDefinition.g:827:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestAnswerServiceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getRequestAnswerServiceDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalServiceDefinition.g:847:3: ( (lv_pattern_4_0= ruleRequestAnswerPattern ) )
            // InternalServiceDefinition.g:848:4: (lv_pattern_4_0= ruleRequestAnswerPattern )
            {
            // InternalServiceDefinition.g:848:4: (lv_pattern_4_0= ruleRequestAnswerPattern )
            // InternalServiceDefinition.g:849:5: lv_pattern_4_0= ruleRequestAnswerPattern
            {

            					newCompositeNode(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternRequestAnswerPatternParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_pattern_4_0=ruleRequestAnswerPattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequestAnswerServiceDefinitionRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_4_0,
            						"org.xtext.service.serviceDefinition.ServiceDefinition.RequestAnswerPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalServiceDefinition.g:866:3: ( (lv_properties_5_0= ruleServiceProperty ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==48) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalServiceDefinition.g:867:4: (lv_properties_5_0= ruleServiceProperty )
            	    {
            	    // InternalServiceDefinition.g:867:4: (lv_properties_5_0= ruleServiceProperty )
            	    // InternalServiceDefinition.g:868:5: lv_properties_5_0= ruleServiceProperty
            	    {

            	    					newCompositeNode(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_properties_5_0=ruleServiceProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequestAnswerServiceDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_5_0,
            	    						"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRequestAnswerServiceDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequestAnswerServiceDefinition"


    // $ANTLR start "entryRuleCoordinationServiceDefinition"
    // InternalServiceDefinition.g:893:1: entryRuleCoordinationServiceDefinition returns [EObject current=null] : iv_ruleCoordinationServiceDefinition= ruleCoordinationServiceDefinition EOF ;
    public final EObject entryRuleCoordinationServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationServiceDefinition = null;


        try {
            // InternalServiceDefinition.g:893:70: (iv_ruleCoordinationServiceDefinition= ruleCoordinationServiceDefinition EOF )
            // InternalServiceDefinition.g:894:2: iv_ruleCoordinationServiceDefinition= ruleCoordinationServiceDefinition EOF
            {
             newCompositeNode(grammarAccess.getCoordinationServiceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinationServiceDefinition=ruleCoordinationServiceDefinition();

            state._fsp--;

             current =iv_ruleCoordinationServiceDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoordinationServiceDefinition"


    // $ANTLR start "ruleCoordinationServiceDefinition"
    // InternalServiceDefinition.g:900:1: ruleCoordinationServiceDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CoordinationServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) ) ) ( (lv_services_9_0= ruleCommunicationServiceUsage ) )* ( (lv_properties_10_0= ruleServiceProperty ) )* otherlv_11= '}' ) ;
    public final EObject ruleCoordinationServiceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_11=null;
        EObject lv_statePattern_5_0 = null;

        EObject lv_parameterPattern_6_0 = null;

        EObject lv_monitoringPattern_7_0 = null;

        EObject lv_wiringPattern_8_0 = null;

        EObject lv_services_9_0 = null;

        EObject lv_properties_10_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:906:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CoordinationServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) ) ) ( (lv_services_9_0= ruleCommunicationServiceUsage ) )* ( (lv_properties_10_0= ruleServiceProperty ) )* otherlv_11= '}' ) )
            // InternalServiceDefinition.g:907:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CoordinationServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) ) ) ( (lv_services_9_0= ruleCommunicationServiceUsage ) )* ( (lv_properties_10_0= ruleServiceProperty ) )* otherlv_11= '}' )
            {
            // InternalServiceDefinition.g:907:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CoordinationServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) ) ) ( (lv_services_9_0= ruleCommunicationServiceUsage ) )* ( (lv_properties_10_0= ruleServiceProperty ) )* otherlv_11= '}' )
            // InternalServiceDefinition.g:908:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CoordinationServiceDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) ) ) ( (lv_services_9_0= ruleCommunicationServiceUsage ) )* ( (lv_properties_10_0= ruleServiceProperty ) )* otherlv_11= '}'
            {
            // InternalServiceDefinition.g:908:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DOCU_COMMENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalServiceDefinition.g:909:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalServiceDefinition.g:909:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalServiceDefinition.g:910:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_22); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getCoordinationServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCoordinationServiceDefinitionRule());
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

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCoordinationServiceDefinitionAccess().getCoordinationServiceDefinitionKeyword_1());
            		
            // InternalServiceDefinition.g:930:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalServiceDefinition.g:931:4: (lv_name_2_0= RULE_ID )
            {
            // InternalServiceDefinition.g:931:4: (lv_name_2_0= RULE_ID )
            // InternalServiceDefinition.g:932:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCoordinationServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationServiceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getCoordinationServiceDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalServiceDefinition.g:952:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) ) )
            // InternalServiceDefinition.g:953:4: ( ( ( ({...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) )
            {
            // InternalServiceDefinition.g:953:4: ( ( ( ({...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) )
            // InternalServiceDefinition.g:954:5: ( ( ({...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4());
            				
            // InternalServiceDefinition.g:957:5: ( ( ({...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) ) ) )* )
            // InternalServiceDefinition.g:958:6: ( ({...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) ) ) )*
            {
            // InternalServiceDefinition.g:958:6: ( ({...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) ) ) )*
            loop20:
            do {
                int alt20=5;
                int LA20_0 = input.LA(1);

                if ( LA20_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                    alt20=2;
                }
                else if ( LA20_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                    alt20=3;
                }
                else if ( LA20_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                    alt20=4;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalServiceDefinition.g:959:4: ({...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:959:4: ({...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) ) )
            	    // InternalServiceDefinition.g:960:5: {...}? => ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalServiceDefinition.g:960:126: ( ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) ) )
            	    // InternalServiceDefinition.g:961:6: ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalServiceDefinition.g:964:9: ({...}? => ( (lv_statePattern_5_0= ruleStatePattern ) ) )
            	    // InternalServiceDefinition.g:964:10: {...}? => ( (lv_statePattern_5_0= ruleStatePattern ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "true");
            	    }
            	    // InternalServiceDefinition.g:964:19: ( (lv_statePattern_5_0= ruleStatePattern ) )
            	    // InternalServiceDefinition.g:964:20: (lv_statePattern_5_0= ruleStatePattern )
            	    {
            	    // InternalServiceDefinition.g:964:20: (lv_statePattern_5_0= ruleStatePattern )
            	    // InternalServiceDefinition.g:965:10: lv_statePattern_5_0= ruleStatePattern
            	    {

            	    										newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternStatePatternParserRuleCall_4_0_0());
            	    									
            	    pushFollow(FOLLOW_23);
            	    lv_statePattern_5_0=ruleStatePattern();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"statePattern",
            	    											lv_statePattern_5_0,
            	    											"org.xtext.service.serviceDefinition.ServiceDefinition.StatePattern");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalServiceDefinition.g:987:4: ({...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:987:4: ({...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) ) )
            	    // InternalServiceDefinition.g:988:5: {...}? => ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalServiceDefinition.g:988:126: ( ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) ) )
            	    // InternalServiceDefinition.g:989:6: ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalServiceDefinition.g:992:9: ({...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) ) )
            	    // InternalServiceDefinition.g:992:10: {...}? => ( (lv_parameterPattern_6_0= ruleParameterPattern ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "true");
            	    }
            	    // InternalServiceDefinition.g:992:19: ( (lv_parameterPattern_6_0= ruleParameterPattern ) )
            	    // InternalServiceDefinition.g:992:20: (lv_parameterPattern_6_0= ruleParameterPattern )
            	    {
            	    // InternalServiceDefinition.g:992:20: (lv_parameterPattern_6_0= ruleParameterPattern )
            	    // InternalServiceDefinition.g:993:10: lv_parameterPattern_6_0= ruleParameterPattern
            	    {

            	    										newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternParameterPatternParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_23);
            	    lv_parameterPattern_6_0=ruleParameterPattern();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"parameterPattern",
            	    											lv_parameterPattern_6_0,
            	    											"org.xtext.service.serviceDefinition.ServiceDefinition.ParameterPattern");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalServiceDefinition.g:1015:4: ({...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1015:4: ({...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) ) )
            	    // InternalServiceDefinition.g:1016:5: {...}? => ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalServiceDefinition.g:1016:126: ( ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) ) )
            	    // InternalServiceDefinition.g:1017:6: ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalServiceDefinition.g:1020:9: ({...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) ) )
            	    // InternalServiceDefinition.g:1020:10: {...}? => ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "true");
            	    }
            	    // InternalServiceDefinition.g:1020:19: ( (lv_monitoringPattern_7_0= ruleMonitoringPattern ) )
            	    // InternalServiceDefinition.g:1020:20: (lv_monitoringPattern_7_0= ruleMonitoringPattern )
            	    {
            	    // InternalServiceDefinition.g:1020:20: (lv_monitoringPattern_7_0= ruleMonitoringPattern )
            	    // InternalServiceDefinition.g:1021:10: lv_monitoringPattern_7_0= ruleMonitoringPattern
            	    {

            	    										newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternMonitoringPatternParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_23);
            	    lv_monitoringPattern_7_0=ruleMonitoringPattern();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"monitoringPattern",
            	    											lv_monitoringPattern_7_0,
            	    											"org.xtext.service.serviceDefinition.ServiceDefinition.MonitoringPattern");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalServiceDefinition.g:1043:4: ({...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1043:4: ({...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) ) )
            	    // InternalServiceDefinition.g:1044:5: {...}? => ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalServiceDefinition.g:1044:126: ( ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) ) )
            	    // InternalServiceDefinition.g:1045:6: ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalServiceDefinition.g:1048:9: ({...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) ) )
            	    // InternalServiceDefinition.g:1048:10: {...}? => ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "true");
            	    }
            	    // InternalServiceDefinition.g:1048:19: ( (lv_wiringPattern_8_0= ruleDynamicWiringPattern ) )
            	    // InternalServiceDefinition.g:1048:20: (lv_wiringPattern_8_0= ruleDynamicWiringPattern )
            	    {
            	    // InternalServiceDefinition.g:1048:20: (lv_wiringPattern_8_0= ruleDynamicWiringPattern )
            	    // InternalServiceDefinition.g:1049:10: lv_wiringPattern_8_0= ruleDynamicWiringPattern
            	    {

            	    										newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternDynamicWiringPatternParserRuleCall_4_3_0());
            	    									
            	    pushFollow(FOLLOW_23);
            	    lv_wiringPattern_8_0=ruleDynamicWiringPattern();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"wiringPattern",
            	    											lv_wiringPattern_8_0,
            	    											"org.xtext.service.serviceDefinition.ServiceDefinition.DynamicWiringPattern");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4());
            				

            }

            // InternalServiceDefinition.g:1078:3: ( (lv_services_9_0= ruleCommunicationServiceUsage ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalServiceDefinition.g:1079:4: (lv_services_9_0= ruleCommunicationServiceUsage )
            	    {
            	    // InternalServiceDefinition.g:1079:4: (lv_services_9_0= ruleCommunicationServiceUsage )
            	    // InternalServiceDefinition.g:1080:5: lv_services_9_0= ruleCommunicationServiceUsage
            	    {

            	    					newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesCommunicationServiceUsageParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_services_9_0=ruleCommunicationServiceUsage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"services",
            	    						lv_services_9_0,
            	    						"org.xtext.service.serviceDefinition.ServiceDefinition.CommunicationServiceUsage");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalServiceDefinition.g:1097:3: ( (lv_properties_10_0= ruleServiceProperty ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==48) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalServiceDefinition.g:1098:4: (lv_properties_10_0= ruleServiceProperty )
            	    {
            	    // InternalServiceDefinition.g:1098:4: (lv_properties_10_0= ruleServiceProperty )
            	    // InternalServiceDefinition.g:1099:5: lv_properties_10_0= ruleServiceProperty
            	    {

            	    					newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_properties_10_0=ruleServiceProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_10_0,
            	    						"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCoordinationServiceDefinitionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoordinationServiceDefinition"


    // $ANTLR start "entryRuleCommunicationServiceUsage"
    // InternalServiceDefinition.g:1124:1: entryRuleCommunicationServiceUsage returns [EObject current=null] : iv_ruleCommunicationServiceUsage= ruleCommunicationServiceUsage EOF ;
    public final EObject entryRuleCommunicationServiceUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationServiceUsage = null;


        try {
            // InternalServiceDefinition.g:1124:66: (iv_ruleCommunicationServiceUsage= ruleCommunicationServiceUsage EOF )
            // InternalServiceDefinition.g:1125:2: iv_ruleCommunicationServiceUsage= ruleCommunicationServiceUsage EOF
            {
             newCompositeNode(grammarAccess.getCommunicationServiceUsageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommunicationServiceUsage=ruleCommunicationServiceUsage();

            state._fsp--;

             current =iv_ruleCommunicationServiceUsage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommunicationServiceUsage"


    // $ANTLR start "ruleCommunicationServiceUsage"
    // InternalServiceDefinition.g:1131:1: ruleCommunicationServiceUsage returns [EObject current=null] : (otherlv_0= 'CommunicationServiceUsage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( ( ruleFQN ) ) ) ;
    public final EObject ruleCommunicationServiceUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1137:2: ( (otherlv_0= 'CommunicationServiceUsage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( ( ruleFQN ) ) ) )
            // InternalServiceDefinition.g:1138:2: (otherlv_0= 'CommunicationServiceUsage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( ( ruleFQN ) ) )
            {
            // InternalServiceDefinition.g:1138:2: (otherlv_0= 'CommunicationServiceUsage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:1139:3: otherlv_0= 'CommunicationServiceUsage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCommunicationServiceUsageAccess().getCommunicationServiceUsageKeyword_0());
            		
            // InternalServiceDefinition.g:1143:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalServiceDefinition.g:1144:4: (lv_name_1_0= RULE_ID )
            {
            // InternalServiceDefinition.g:1144:4: (lv_name_1_0= RULE_ID )
            // InternalServiceDefinition.g:1145:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCommunicationServiceUsageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationServiceUsageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCommunicationServiceUsageAccess().getUsesKeyword_2());
            		
            // InternalServiceDefinition.g:1165:3: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:1166:4: ( ruleFQN )
            {
            // InternalServiceDefinition.g:1166:4: ( ruleFQN )
            // InternalServiceDefinition.g:1167:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationServiceUsageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCommunicationServiceUsageAccess().getUsesCommunicationServiceDefinitionCrossReference_3_0());
            				
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
    // $ANTLR end "ruleCommunicationServiceUsage"


    // $ANTLR start "entryRuleStatePattern"
    // InternalServiceDefinition.g:1185:1: entryRuleStatePattern returns [EObject current=null] : iv_ruleStatePattern= ruleStatePattern EOF ;
    public final EObject entryRuleStatePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatePattern = null;


        try {
            // InternalServiceDefinition.g:1185:53: (iv_ruleStatePattern= ruleStatePattern EOF )
            // InternalServiceDefinition.g:1186:2: iv_ruleStatePattern= ruleStatePattern EOF
            {
             newCompositeNode(grammarAccess.getStatePatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatePattern=ruleStatePattern();

            state._fsp--;

             current =iv_ruleStatePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatePattern"


    // $ANTLR start "ruleStatePattern"
    // InternalServiceDefinition.g:1192:1: ruleStatePattern returns [EObject current=null] : ( () otherlv_1= 'StatePattern' otherlv_2= '<' otherlv_3= 'lifecycle' ( ( ruleFQN ) ) (otherlv_5= 'with' ( ( ruleFQN ) ) )? otherlv_7= '>' ) ;
    public final EObject ruleStatePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1198:2: ( ( () otherlv_1= 'StatePattern' otherlv_2= '<' otherlv_3= 'lifecycle' ( ( ruleFQN ) ) (otherlv_5= 'with' ( ( ruleFQN ) ) )? otherlv_7= '>' ) )
            // InternalServiceDefinition.g:1199:2: ( () otherlv_1= 'StatePattern' otherlv_2= '<' otherlv_3= 'lifecycle' ( ( ruleFQN ) ) (otherlv_5= 'with' ( ( ruleFQN ) ) )? otherlv_7= '>' )
            {
            // InternalServiceDefinition.g:1199:2: ( () otherlv_1= 'StatePattern' otherlv_2= '<' otherlv_3= 'lifecycle' ( ( ruleFQN ) ) (otherlv_5= 'with' ( ( ruleFQN ) ) )? otherlv_7= '>' )
            // InternalServiceDefinition.g:1200:3: () otherlv_1= 'StatePattern' otherlv_2= '<' otherlv_3= 'lifecycle' ( ( ruleFQN ) ) (otherlv_5= 'with' ( ( ruleFQN ) ) )? otherlv_7= '>'
            {
            // InternalServiceDefinition.g:1200:3: ()
            // InternalServiceDefinition.g:1201:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatePatternAccess().getStatePatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getStatePatternAccess().getStatePatternKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getStatePatternAccess().getLessThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getStatePatternAccess().getLifecycleKeyword_3());
            		
            // InternalServiceDefinition.g:1219:3: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:1220:4: ( ruleFQN )
            {
            // InternalServiceDefinition.g:1220:4: ( ruleFQN )
            // InternalServiceDefinition.g:1221:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatePatternRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStatePatternAccess().getLifecycleStateMachineCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalServiceDefinition.g:1235:3: (otherlv_5= 'with' ( ( ruleFQN ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalServiceDefinition.g:1236:4: otherlv_5= 'with' ( ( ruleFQN ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getStatePatternAccess().getWithKeyword_5_0());
                    			
                    // InternalServiceDefinition.g:1240:4: ( ( ruleFQN ) )
                    // InternalServiceDefinition.g:1241:5: ( ruleFQN )
                    {
                    // InternalServiceDefinition.g:1241:5: ( ruleFQN )
                    // InternalServiceDefinition.g:1242:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatePatternRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStatePatternAccess().getModesComponentModeCollectionCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getStatePatternAccess().getGreaterThanSignKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatePattern"


    // $ANTLR start "entryRuleParameterPattern"
    // InternalServiceDefinition.g:1265:1: entryRuleParameterPattern returns [EObject current=null] : iv_ruleParameterPattern= ruleParameterPattern EOF ;
    public final EObject entryRuleParameterPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterPattern = null;


        try {
            // InternalServiceDefinition.g:1265:57: (iv_ruleParameterPattern= ruleParameterPattern EOF )
            // InternalServiceDefinition.g:1266:2: iv_ruleParameterPattern= ruleParameterPattern EOF
            {
             newCompositeNode(grammarAccess.getParameterPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterPattern=ruleParameterPattern();

            state._fsp--;

             current =iv_ruleParameterPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterPattern"


    // $ANTLR start "ruleParameterPattern"
    // InternalServiceDefinition.g:1272:1: ruleParameterPattern returns [EObject current=null] : ( () otherlv_1= 'ParameterPattern' otherlv_2= '<' ( ( ruleFQN ) ) otherlv_4= '>' ) ;
    public final EObject ruleParameterPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1278:2: ( ( () otherlv_1= 'ParameterPattern' otherlv_2= '<' ( ( ruleFQN ) ) otherlv_4= '>' ) )
            // InternalServiceDefinition.g:1279:2: ( () otherlv_1= 'ParameterPattern' otherlv_2= '<' ( ( ruleFQN ) ) otherlv_4= '>' )
            {
            // InternalServiceDefinition.g:1279:2: ( () otherlv_1= 'ParameterPattern' otherlv_2= '<' ( ( ruleFQN ) ) otherlv_4= '>' )
            // InternalServiceDefinition.g:1280:3: () otherlv_1= 'ParameterPattern' otherlv_2= '<' ( ( ruleFQN ) ) otherlv_4= '>'
            {
            // InternalServiceDefinition.g:1280:3: ()
            // InternalServiceDefinition.g:1281:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterPatternAccess().getParameterPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterPatternAccess().getParameterPatternKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterPatternAccess().getLessThanSignKeyword_2());
            		
            // InternalServiceDefinition.g:1295:3: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:1296:4: ( ruleFQN )
            {
            // InternalServiceDefinition.g:1296:4: ( ruleFQN )
            // InternalServiceDefinition.g:1297:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterPatternRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterPatternAccess().getParameterSetParameterSetDefinitionCrossReference_3_0());
            				
            pushFollow(FOLLOW_29);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterPatternAccess().getGreaterThanSignKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterPattern"


    // $ANTLR start "entryRuleDynamicWiringPattern"
    // InternalServiceDefinition.g:1319:1: entryRuleDynamicWiringPattern returns [EObject current=null] : iv_ruleDynamicWiringPattern= ruleDynamicWiringPattern EOF ;
    public final EObject entryRuleDynamicWiringPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicWiringPattern = null;


        try {
            // InternalServiceDefinition.g:1319:61: (iv_ruleDynamicWiringPattern= ruleDynamicWiringPattern EOF )
            // InternalServiceDefinition.g:1320:2: iv_ruleDynamicWiringPattern= ruleDynamicWiringPattern EOF
            {
             newCompositeNode(grammarAccess.getDynamicWiringPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDynamicWiringPattern=ruleDynamicWiringPattern();

            state._fsp--;

             current =iv_ruleDynamicWiringPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDynamicWiringPattern"


    // $ANTLR start "ruleDynamicWiringPattern"
    // InternalServiceDefinition.g:1326:1: ruleDynamicWiringPattern returns [EObject current=null] : ( () otherlv_1= 'DynamicWiringPattern' ) ;
    public final EObject ruleDynamicWiringPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1332:2: ( ( () otherlv_1= 'DynamicWiringPattern' ) )
            // InternalServiceDefinition.g:1333:2: ( () otherlv_1= 'DynamicWiringPattern' )
            {
            // InternalServiceDefinition.g:1333:2: ( () otherlv_1= 'DynamicWiringPattern' )
            // InternalServiceDefinition.g:1334:3: () otherlv_1= 'DynamicWiringPattern'
            {
            // InternalServiceDefinition.g:1334:3: ()
            // InternalServiceDefinition.g:1335:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDynamicWiringPattern"


    // $ANTLR start "entryRuleMonitoringPattern"
    // InternalServiceDefinition.g:1349:1: entryRuleMonitoringPattern returns [EObject current=null] : iv_ruleMonitoringPattern= ruleMonitoringPattern EOF ;
    public final EObject entryRuleMonitoringPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitoringPattern = null;


        try {
            // InternalServiceDefinition.g:1349:58: (iv_ruleMonitoringPattern= ruleMonitoringPattern EOF )
            // InternalServiceDefinition.g:1350:2: iv_ruleMonitoringPattern= ruleMonitoringPattern EOF
            {
             newCompositeNode(grammarAccess.getMonitoringPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitoringPattern=ruleMonitoringPattern();

            state._fsp--;

             current =iv_ruleMonitoringPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonitoringPattern"


    // $ANTLR start "ruleMonitoringPattern"
    // InternalServiceDefinition.g:1356:1: ruleMonitoringPattern returns [EObject current=null] : ( () otherlv_1= 'MonitoringPattern' ) ;
    public final EObject ruleMonitoringPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1362:2: ( ( () otherlv_1= 'MonitoringPattern' ) )
            // InternalServiceDefinition.g:1363:2: ( () otherlv_1= 'MonitoringPattern' )
            {
            // InternalServiceDefinition.g:1363:2: ( () otherlv_1= 'MonitoringPattern' )
            // InternalServiceDefinition.g:1364:3: () otherlv_1= 'MonitoringPattern'
            {
            // InternalServiceDefinition.g:1364:3: ()
            // InternalServiceDefinition.g:1365:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMonitoringPatternAccess().getMonitoringPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMonitoringPatternAccess().getMonitoringPatternKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonitoringPattern"


    // $ANTLR start "entryRuleForkingPatternInstance"
    // InternalServiceDefinition.g:1379:1: entryRuleForkingPatternInstance returns [EObject current=null] : iv_ruleForkingPatternInstance= ruleForkingPatternInstance EOF ;
    public final EObject entryRuleForkingPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForkingPatternInstance = null;


        try {
            // InternalServiceDefinition.g:1379:63: (iv_ruleForkingPatternInstance= ruleForkingPatternInstance EOF )
            // InternalServiceDefinition.g:1380:2: iv_ruleForkingPatternInstance= ruleForkingPatternInstance EOF
            {
             newCompositeNode(grammarAccess.getForkingPatternInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForkingPatternInstance=ruleForkingPatternInstance();

            state._fsp--;

             current =iv_ruleForkingPatternInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForkingPatternInstance"


    // $ANTLR start "ruleForkingPatternInstance"
    // InternalServiceDefinition.g:1386:1: ruleForkingPatternInstance returns [EObject current=null] : (this_PushPattern_0= rulePushPattern | this_EventPattern_1= ruleEventPattern ) ;
    public final EObject ruleForkingPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject this_PushPattern_0 = null;

        EObject this_EventPattern_1 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:1392:2: ( (this_PushPattern_0= rulePushPattern | this_EventPattern_1= ruleEventPattern ) )
            // InternalServiceDefinition.g:1393:2: (this_PushPattern_0= rulePushPattern | this_EventPattern_1= ruleEventPattern )
            {
            // InternalServiceDefinition.g:1393:2: (this_PushPattern_0= rulePushPattern | this_EventPattern_1= ruleEventPattern )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            else if ( (LA24_0==40) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalServiceDefinition.g:1394:3: this_PushPattern_0= rulePushPattern
                    {

                    			newCompositeNode(grammarAccess.getForkingPatternInstanceAccess().getPushPatternParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PushPattern_0=rulePushPattern();

                    state._fsp--;


                    			current = this_PushPattern_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalServiceDefinition.g:1403:3: this_EventPattern_1= ruleEventPattern
                    {

                    			newCompositeNode(grammarAccess.getForkingPatternInstanceAccess().getEventPatternParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EventPattern_1=ruleEventPattern();

                    state._fsp--;


                    			current = this_EventPattern_1;
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
    // $ANTLR end "ruleForkingPatternInstance"


    // $ANTLR start "entryRuleJoiningPatternInstance"
    // InternalServiceDefinition.g:1415:1: entryRuleJoiningPatternInstance returns [EObject current=null] : iv_ruleJoiningPatternInstance= ruleJoiningPatternInstance EOF ;
    public final EObject entryRuleJoiningPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoiningPatternInstance = null;


        try {
            // InternalServiceDefinition.g:1415:63: (iv_ruleJoiningPatternInstance= ruleJoiningPatternInstance EOF )
            // InternalServiceDefinition.g:1416:2: iv_ruleJoiningPatternInstance= ruleJoiningPatternInstance EOF
            {
             newCompositeNode(grammarAccess.getJoiningPatternInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoiningPatternInstance=ruleJoiningPatternInstance();

            state._fsp--;

             current =iv_ruleJoiningPatternInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoiningPatternInstance"


    // $ANTLR start "ruleJoiningPatternInstance"
    // InternalServiceDefinition.g:1422:1: ruleJoiningPatternInstance returns [EObject current=null] : this_SendPattern_0= ruleSendPattern ;
    public final EObject ruleJoiningPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject this_SendPattern_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:1428:2: (this_SendPattern_0= ruleSendPattern )
            // InternalServiceDefinition.g:1429:2: this_SendPattern_0= ruleSendPattern
            {

            		newCompositeNode(grammarAccess.getJoiningPatternInstanceAccess().getSendPatternParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SendPattern_0=ruleSendPattern();

            state._fsp--;


            		current = this_SendPattern_0;
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
    // $ANTLR end "ruleJoiningPatternInstance"


    // $ANTLR start "entryRuleRequestAnswerPattern"
    // InternalServiceDefinition.g:1440:1: entryRuleRequestAnswerPattern returns [EObject current=null] : iv_ruleRequestAnswerPattern= ruleRequestAnswerPattern EOF ;
    public final EObject entryRuleRequestAnswerPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestAnswerPattern = null;


        try {
            // InternalServiceDefinition.g:1440:61: (iv_ruleRequestAnswerPattern= ruleRequestAnswerPattern EOF )
            // InternalServiceDefinition.g:1441:2: iv_ruleRequestAnswerPattern= ruleRequestAnswerPattern EOF
            {
             newCompositeNode(grammarAccess.getRequestAnswerPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequestAnswerPattern=ruleRequestAnswerPattern();

            state._fsp--;

             current =iv_ruleRequestAnswerPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequestAnswerPattern"


    // $ANTLR start "ruleRequestAnswerPattern"
    // InternalServiceDefinition.g:1447:1: ruleRequestAnswerPattern returns [EObject current=null] : this_QueryPattern_0= ruleQueryPattern ;
    public final EObject ruleRequestAnswerPattern() throws RecognitionException {
        EObject current = null;

        EObject this_QueryPattern_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:1453:2: (this_QueryPattern_0= ruleQueryPattern )
            // InternalServiceDefinition.g:1454:2: this_QueryPattern_0= ruleQueryPattern
            {

            		newCompositeNode(grammarAccess.getRequestAnswerPatternAccess().getQueryPatternParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_QueryPattern_0=ruleQueryPattern();

            state._fsp--;


            		current = this_QueryPattern_0;
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
    // $ANTLR end "ruleRequestAnswerPattern"


    // $ANTLR start "entryRulePushPattern"
    // InternalServiceDefinition.g:1465:1: entryRulePushPattern returns [EObject current=null] : iv_rulePushPattern= rulePushPattern EOF ;
    public final EObject entryRulePushPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePushPattern = null;


        try {
            // InternalServiceDefinition.g:1465:52: (iv_rulePushPattern= rulePushPattern EOF )
            // InternalServiceDefinition.g:1466:2: iv_rulePushPattern= rulePushPattern EOF
            {
             newCompositeNode(grammarAccess.getPushPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePushPattern=rulePushPattern();

            state._fsp--;

             current =iv_rulePushPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePushPattern"


    // $ANTLR start "rulePushPattern"
    // InternalServiceDefinition.g:1472:1: rulePushPattern returns [EObject current=null] : ( () otherlv_1= 'PushPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' ) ;
    public final EObject rulePushPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1478:2: ( ( () otherlv_1= 'PushPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' ) )
            // InternalServiceDefinition.g:1479:2: ( () otherlv_1= 'PushPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' )
            {
            // InternalServiceDefinition.g:1479:2: ( () otherlv_1= 'PushPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' )
            // InternalServiceDefinition.g:1480:3: () otherlv_1= 'PushPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>'
            {
            // InternalServiceDefinition.g:1480:3: ()
            // InternalServiceDefinition.g:1481:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPushPatternAccess().getPushPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getPushPatternAccess().getPushPatternKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getPushPatternAccess().getLessThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getPushPatternAccess().getDataTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getPushPatternAccess().getEqualsSignKeyword_4());
            		
            // InternalServiceDefinition.g:1503:3: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:1504:4: ( ruleFQN )
            {
            // InternalServiceDefinition.g:1504:4: ( ruleFQN )
            // InternalServiceDefinition.g:1505:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPushPatternRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPushPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPushPatternAccess().getGreaterThanSignKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePushPattern"


    // $ANTLR start "entryRuleEventPattern"
    // InternalServiceDefinition.g:1527:1: entryRuleEventPattern returns [EObject current=null] : iv_ruleEventPattern= ruleEventPattern EOF ;
    public final EObject entryRuleEventPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventPattern = null;


        try {
            // InternalServiceDefinition.g:1527:53: (iv_ruleEventPattern= ruleEventPattern EOF )
            // InternalServiceDefinition.g:1528:2: iv_ruleEventPattern= ruleEventPattern EOF
            {
             newCompositeNode(grammarAccess.getEventPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventPattern=ruleEventPattern();

            state._fsp--;

             current =iv_ruleEventPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventPattern"


    // $ANTLR start "ruleEventPattern"
    // InternalServiceDefinition.g:1534:1: ruleEventPattern returns [EObject current=null] : ( () otherlv_1= 'EventPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '>' ) ;
    public final EObject ruleEventPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1540:2: ( ( () otherlv_1= 'EventPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '>' ) )
            // InternalServiceDefinition.g:1541:2: ( () otherlv_1= 'EventPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '>' )
            {
            // InternalServiceDefinition.g:1541:2: ( () otherlv_1= 'EventPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '>' )
            // InternalServiceDefinition.g:1542:3: () otherlv_1= 'EventPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '>'
            {
            // InternalServiceDefinition.g:1542:3: ()
            // InternalServiceDefinition.g:1543:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventPatternAccess().getEventPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getEventPatternAccess().getEventPatternKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getEventPatternAccess().getLessThanSignKeyword_2());
            		
            // InternalServiceDefinition.g:1557:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) )
            // InternalServiceDefinition.g:1558:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalServiceDefinition.g:1558:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) )
            // InternalServiceDefinition.g:1559:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
            				
            // InternalServiceDefinition.g:1562:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?)
            // InternalServiceDefinition.g:1563:6: ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?
            {
            // InternalServiceDefinition.g:1563:6: ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=4;
                int LA25_0 = input.LA(1);

                if ( LA25_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
                    alt25=2;
                }
                else if ( LA25_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
                    alt25=3;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalServiceDefinition.g:1564:4: ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1564:4: ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) )
            	    // InternalServiceDefinition.g:1565:5: {...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEventPattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalServiceDefinition.g:1565:109: ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) )
            	    // InternalServiceDefinition.g:1566:6: ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalServiceDefinition.g:1569:9: ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) )
            	    // InternalServiceDefinition.g:1569:10: {...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventPattern", "true");
            	    }
            	    // InternalServiceDefinition.g:1569:19: (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) )
            	    // InternalServiceDefinition.g:1569:20: otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) )
            	    {
            	    otherlv_4=(Token)match(input,41,FOLLOW_31); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEventPatternAccess().getEventTypeKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,39,FOLLOW_5); 

            	    									newLeafNode(otherlv_5, grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_0_1());
            	    								
            	    // InternalServiceDefinition.g:1577:9: ( ( ruleFQN ) )
            	    // InternalServiceDefinition.g:1578:10: ( ruleFQN )
            	    {
            	    // InternalServiceDefinition.g:1578:10: ( ruleFQN )
            	    // InternalServiceDefinition.g:1579:11: ruleFQN
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventPatternRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEventPatternAccess().getEventTypeCommunicationObjectCrossReference_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_33);
            	    ruleFQN();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalServiceDefinition.g:1599:4: ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1599:4: ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) )
            	    // InternalServiceDefinition.g:1600:5: {...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEventPattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalServiceDefinition.g:1600:109: ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) )
            	    // InternalServiceDefinition.g:1601:6: ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalServiceDefinition.g:1604:9: ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) )
            	    // InternalServiceDefinition.g:1604:10: {...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventPattern", "true");
            	    }
            	    // InternalServiceDefinition.g:1604:19: (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) )
            	    // InternalServiceDefinition.g:1604:20: otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) )
            	    {
            	    otherlv_7=(Token)match(input,42,FOLLOW_31); 

            	    									newLeafNode(otherlv_7, grammarAccess.getEventPatternAccess().getActivationTypeKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,39,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_1_1());
            	    								
            	    // InternalServiceDefinition.g:1612:9: ( ( ruleFQN ) )
            	    // InternalServiceDefinition.g:1613:10: ( ruleFQN )
            	    {
            	    // InternalServiceDefinition.g:1613:10: ( ruleFQN )
            	    // InternalServiceDefinition.g:1614:11: ruleFQN
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventPatternRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEventPatternAccess().getActivationTypeCommunicationObjectCrossReference_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_33);
            	    ruleFQN();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalServiceDefinition.g:1634:4: ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1634:4: ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) )
            	    // InternalServiceDefinition.g:1635:5: {...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEventPattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalServiceDefinition.g:1635:109: ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) )
            	    // InternalServiceDefinition.g:1636:6: ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalServiceDefinition.g:1639:9: ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) )
            	    // InternalServiceDefinition.g:1639:10: {...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventPattern", "true");
            	    }
            	    // InternalServiceDefinition.g:1639:19: (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) )
            	    // InternalServiceDefinition.g:1639:20: otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) )
            	    {
            	    otherlv_10=(Token)match(input,43,FOLLOW_31); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEventPatternAccess().getEventStateTypeKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,39,FOLLOW_5); 

            	    									newLeafNode(otherlv_11, grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_2_1());
            	    								
            	    // InternalServiceDefinition.g:1647:9: ( ( ruleFQN ) )
            	    // InternalServiceDefinition.g:1648:10: ( ruleFQN )
            	    {
            	    // InternalServiceDefinition.g:1648:10: ( ruleFQN )
            	    // InternalServiceDefinition.g:1649:11: ruleFQN
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventPatternRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEventPatternAccess().getEventStateTypeCommunicationObjectCrossReference_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_33);
            	    ruleFQN();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEventPatternAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleEventPattern", "getUnorderedGroupHelper().canLeave(grammarAccess.getEventPatternAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
            				

            }

            otherlv_13=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getEventPatternAccess().getGreaterThanSignKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventPattern"


    // $ANTLR start "entryRuleQueryPattern"
    // InternalServiceDefinition.g:1685:1: entryRuleQueryPattern returns [EObject current=null] : iv_ruleQueryPattern= ruleQueryPattern EOF ;
    public final EObject entryRuleQueryPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryPattern = null;


        try {
            // InternalServiceDefinition.g:1685:53: (iv_ruleQueryPattern= ruleQueryPattern EOF )
            // InternalServiceDefinition.g:1686:2: iv_ruleQueryPattern= ruleQueryPattern EOF
            {
             newCompositeNode(grammarAccess.getQueryPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryPattern=ruleQueryPattern();

            state._fsp--;

             current =iv_ruleQueryPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryPattern"


    // $ANTLR start "ruleQueryPattern"
    // InternalServiceDefinition.g:1692:1: ruleQueryPattern returns [EObject current=null] : ( () otherlv_1= 'QueryPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '>' ) ;
    public final EObject ruleQueryPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1698:2: ( ( () otherlv_1= 'QueryPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '>' ) )
            // InternalServiceDefinition.g:1699:2: ( () otherlv_1= 'QueryPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '>' )
            {
            // InternalServiceDefinition.g:1699:2: ( () otherlv_1= 'QueryPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '>' )
            // InternalServiceDefinition.g:1700:3: () otherlv_1= 'QueryPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '>'
            {
            // InternalServiceDefinition.g:1700:3: ()
            // InternalServiceDefinition.g:1701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQueryPatternAccess().getQueryPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryPatternAccess().getQueryPatternKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getQueryPatternAccess().getLessThanSignKeyword_2());
            		
            // InternalServiceDefinition.g:1715:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) )
            // InternalServiceDefinition.g:1716:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalServiceDefinition.g:1716:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) )
            // InternalServiceDefinition.g:1717:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
            				
            // InternalServiceDefinition.g:1720:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?)
            // InternalServiceDefinition.g:1721:6: ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?
            {
            // InternalServiceDefinition.g:1721:6: ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( LA26_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0) ) {
                    alt26=1;
                }
                else if ( LA26_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalServiceDefinition.g:1722:4: ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1722:4: ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) )
            	    // InternalServiceDefinition.g:1723:5: {...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQueryPattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalServiceDefinition.g:1723:109: ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) )
            	    // InternalServiceDefinition.g:1724:6: ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalServiceDefinition.g:1727:9: ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) )
            	    // InternalServiceDefinition.g:1727:10: {...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQueryPattern", "true");
            	    }
            	    // InternalServiceDefinition.g:1727:19: (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) )
            	    // InternalServiceDefinition.g:1727:20: otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) )
            	    {
            	    otherlv_4=(Token)match(input,45,FOLLOW_31); 

            	    									newLeafNode(otherlv_4, grammarAccess.getQueryPatternAccess().getRequestTypeKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,39,FOLLOW_5); 

            	    									newLeafNode(otherlv_5, grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_0_1());
            	    								
            	    // InternalServiceDefinition.g:1735:9: ( ( ruleFQN ) )
            	    // InternalServiceDefinition.g:1736:10: ( ruleFQN )
            	    {
            	    // InternalServiceDefinition.g:1736:10: ( ruleFQN )
            	    // InternalServiceDefinition.g:1737:11: ruleFQN
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getQueryPatternRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getQueryPatternAccess().getRequestTypeCommunicationObjectCrossReference_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
            	    ruleFQN();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalServiceDefinition.g:1757:4: ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1757:4: ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) )
            	    // InternalServiceDefinition.g:1758:5: {...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQueryPattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalServiceDefinition.g:1758:109: ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) )
            	    // InternalServiceDefinition.g:1759:6: ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalServiceDefinition.g:1762:9: ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) )
            	    // InternalServiceDefinition.g:1762:10: {...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQueryPattern", "true");
            	    }
            	    // InternalServiceDefinition.g:1762:19: (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) )
            	    // InternalServiceDefinition.g:1762:20: otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) )
            	    {
            	    otherlv_7=(Token)match(input,46,FOLLOW_31); 

            	    									newLeafNode(otherlv_7, grammarAccess.getQueryPatternAccess().getAnswerTypeKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,39,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_1_1());
            	    								
            	    // InternalServiceDefinition.g:1770:9: ( ( ruleFQN ) )
            	    // InternalServiceDefinition.g:1771:10: ( ruleFQN )
            	    {
            	    // InternalServiceDefinition.g:1771:10: ( ruleFQN )
            	    // InternalServiceDefinition.g:1772:11: ruleFQN
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getQueryPatternRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getQueryPatternAccess().getAnswerTypeCommunicationObjectCrossReference_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
            	    ruleFQN();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleQueryPattern", "getUnorderedGroupHelper().canLeave(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
            				

            }

            otherlv_10=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getQueryPatternAccess().getGreaterThanSignKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueryPattern"


    // $ANTLR start "entryRuleSendPattern"
    // InternalServiceDefinition.g:1808:1: entryRuleSendPattern returns [EObject current=null] : iv_ruleSendPattern= ruleSendPattern EOF ;
    public final EObject entryRuleSendPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendPattern = null;


        try {
            // InternalServiceDefinition.g:1808:52: (iv_ruleSendPattern= ruleSendPattern EOF )
            // InternalServiceDefinition.g:1809:2: iv_ruleSendPattern= ruleSendPattern EOF
            {
             newCompositeNode(grammarAccess.getSendPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendPattern=ruleSendPattern();

            state._fsp--;

             current =iv_ruleSendPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSendPattern"


    // $ANTLR start "ruleSendPattern"
    // InternalServiceDefinition.g:1815:1: ruleSendPattern returns [EObject current=null] : ( () otherlv_1= 'SendPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' ) ;
    public final EObject ruleSendPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1821:2: ( ( () otherlv_1= 'SendPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' ) )
            // InternalServiceDefinition.g:1822:2: ( () otherlv_1= 'SendPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' )
            {
            // InternalServiceDefinition.g:1822:2: ( () otherlv_1= 'SendPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' )
            // InternalServiceDefinition.g:1823:3: () otherlv_1= 'SendPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>'
            {
            // InternalServiceDefinition.g:1823:3: ()
            // InternalServiceDefinition.g:1824:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSendPatternAccess().getSendPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getSendPatternAccess().getSendPatternKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getSendPatternAccess().getLessThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getSendPatternAccess().getDataTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSendPatternAccess().getEqualsSignKeyword_4());
            		
            // InternalServiceDefinition.g:1846:3: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:1847:4: ( ruleFQN )
            {
            // InternalServiceDefinition.g:1847:4: ( ruleFQN )
            // InternalServiceDefinition.g:1848:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendPatternRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSendPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSendPatternAccess().getGreaterThanSignKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSendPattern"


    // $ANTLR start "entryRuleServiceProperty"
    // InternalServiceDefinition.g:1870:1: entryRuleServiceProperty returns [EObject current=null] : iv_ruleServiceProperty= ruleServiceProperty EOF ;
    public final EObject entryRuleServiceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProperty = null;


        try {
            // InternalServiceDefinition.g:1870:56: (iv_ruleServiceProperty= ruleServiceProperty EOF )
            // InternalServiceDefinition.g:1871:2: iv_ruleServiceProperty= ruleServiceProperty EOF
            {
             newCompositeNode(grammarAccess.getServicePropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceProperty=ruleServiceProperty();

            state._fsp--;

             current =iv_ruleServiceProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceProperty"


    // $ANTLR start "ruleServiceProperty"
    // InternalServiceDefinition.g:1877:1: ruleServiceProperty returns [EObject current=null] : (otherlv_0= 'ServiceProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleServiceProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1883:2: ( (otherlv_0= 'ServiceProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalServiceDefinition.g:1884:2: (otherlv_0= 'ServiceProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalServiceDefinition.g:1884:2: (otherlv_0= 'ServiceProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalServiceDefinition.g:1885:3: otherlv_0= 'ServiceProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getServicePropertyAccess().getServicePropertyKeyword_0());
            		
            // InternalServiceDefinition.g:1889:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalServiceDefinition.g:1890:4: (lv_name_1_0= RULE_ID )
            {
            // InternalServiceDefinition.g:1890:4: (lv_name_1_0= RULE_ID )
            // InternalServiceDefinition.g:1891:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServicePropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServicePropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getServicePropertyAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getServicePropertyAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceProperty"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000220042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007900040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000012000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001001C28100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000008100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000E0200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000600200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000100000L});

}
