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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'.*'", "'-'", "'ServiceDefRepository'", "'version'", "'{'", "'}'", "'#import'", "';'", "'ForkingServiceDefinition'", "'purposeDescription'", "'JoiningServiceDefinition'", "'RequestAnswerServiceDefinition'", "'CoordinationServiceDefinition'", "'CommunicationServiceUsage'", "'uses'", "'StatePattern'", "'<'", "'lifecycle'", "'with'", "'>'", "'ParameterPattern'", "'DynamicWiringPattern'", "'MonitoringPattern'", "'PushPattern'", "'DataType'", "'='", "'EventPattern'", "'EventType'", "'ActivationType'", "'EventStateType'", "'QueryPattern'", "'RequestType'", "'AnswerType'", "'SendPattern'", "'ServiceProperty'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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
    // InternalServiceDefinition.g:105:1: entryRuleServiceDefModel returns [EObject current=null] : iv_ruleServiceDefModel= ruleServiceDefModel EOF ;
    public final EObject entryRuleServiceDefModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceDefModel = null;


        try {
            // InternalServiceDefinition.g:105:56: (iv_ruleServiceDefModel= ruleServiceDefModel EOF )
            // InternalServiceDefinition.g:106:2: iv_ruleServiceDefModel= ruleServiceDefModel EOF
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
    // InternalServiceDefinition.g:112:1: ruleServiceDefModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleCommRepoImport ) )* ( (lv_repository_2_0= ruleServiceDefRepository ) )? ) ;
    public final EObject ruleServiceDefModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_repository_2_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:118:2: ( ( () ( (lv_imports_1_0= ruleCommRepoImport ) )* ( (lv_repository_2_0= ruleServiceDefRepository ) )? ) )
            // InternalServiceDefinition.g:119:2: ( () ( (lv_imports_1_0= ruleCommRepoImport ) )* ( (lv_repository_2_0= ruleServiceDefRepository ) )? )
            {
            // InternalServiceDefinition.g:119:2: ( () ( (lv_imports_1_0= ruleCommRepoImport ) )* ( (lv_repository_2_0= ruleServiceDefRepository ) )? )
            // InternalServiceDefinition.g:120:3: () ( (lv_imports_1_0= ruleCommRepoImport ) )* ( (lv_repository_2_0= ruleServiceDefRepository ) )?
            {
            // InternalServiceDefinition.g:120:3: ()
            // InternalServiceDefinition.g:121:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceDefModelAccess().getServiceDefModelAction_0(),
            					current);
            			

            }

            // InternalServiceDefinition.g:127:3: ( (lv_imports_1_0= ruleCommRepoImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalServiceDefinition.g:128:4: (lv_imports_1_0= ruleCommRepoImport )
            	    {
            	    // InternalServiceDefinition.g:128:4: (lv_imports_1_0= ruleCommRepoImport )
            	    // InternalServiceDefinition.g:129:5: lv_imports_1_0= ruleCommRepoImport
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

            // InternalServiceDefinition.g:146:3: ( (lv_repository_2_0= ruleServiceDefRepository ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalServiceDefinition.g:147:4: (lv_repository_2_0= ruleServiceDefRepository )
                    {
                    // InternalServiceDefinition.g:147:4: (lv_repository_2_0= ruleServiceDefRepository )
                    // InternalServiceDefinition.g:148:5: lv_repository_2_0= ruleServiceDefRepository
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
    // InternalServiceDefinition.g:169:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalServiceDefinition.g:169:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalServiceDefinition.g:170:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalServiceDefinition.g:176:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:182:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalServiceDefinition.g:183:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalServiceDefinition.g:183:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalServiceDefinition.g:184:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalServiceDefinition.g:191:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalServiceDefinition.g:192:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_5); 

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
    // InternalServiceDefinition.g:209:1: entryRuleFQNW returns [String current=null] : iv_ruleFQNW= ruleFQNW EOF ;
    public final String entryRuleFQNW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNW = null;


        try {
            // InternalServiceDefinition.g:209:44: (iv_ruleFQNW= ruleFQNW EOF )
            // InternalServiceDefinition.g:210:2: iv_ruleFQNW= ruleFQNW EOF
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
    // InternalServiceDefinition.g:216:1: ruleFQNW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFQNW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:222:2: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // InternalServiceDefinition.g:223:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // InternalServiceDefinition.g:223:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // InternalServiceDefinition.g:224:3: this_FQN_0= ruleFQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalServiceDefinition.g:234:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalServiceDefinition.g:235:4: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

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
    // InternalServiceDefinition.g:245:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalServiceDefinition.g:245:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalServiceDefinition.g:246:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalServiceDefinition.g:252:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:258:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalServiceDefinition.g:259:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalServiceDefinition.g:259:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalServiceDefinition.g:260:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalServiceDefinition.g:260:3: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalServiceDefinition.g:261:4: kw= '-'
                    {
                    kw=(Token)match(input,13,FOLLOW_7); 

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
    // InternalServiceDefinition.g:278:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalServiceDefinition.g:278:47: (iv_ruleEString= ruleEString EOF )
            // InternalServiceDefinition.g:279:2: iv_ruleEString= ruleEString EOF
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
    // InternalServiceDefinition.g:285:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:291:2: (this_STRING_0= RULE_STRING )
            // InternalServiceDefinition.g:292:2: this_STRING_0= RULE_STRING
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


    // $ANTLR start "entryRuleServiceDefRepository"
    // InternalServiceDefinition.g:302:1: entryRuleServiceDefRepository returns [EObject current=null] : iv_ruleServiceDefRepository= ruleServiceDefRepository EOF ;
    public final EObject entryRuleServiceDefRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceDefRepository = null;


        try {
            // InternalServiceDefinition.g:302:61: (iv_ruleServiceDefRepository= ruleServiceDefRepository EOF )
            // InternalServiceDefinition.g:303:2: iv_ruleServiceDefRepository= ruleServiceDefRepository EOF
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
    // InternalServiceDefinition.g:309:1: ruleServiceDefRepository returns [EObject current=null] : (otherlv_0= 'ServiceDefRepository' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleServiceRepoVersion ) ) )? otherlv_4= '{' ( (lv_services_5_0= ruleAbstractServiceDefinition ) )* otherlv_6= '}' ) ;
    public final EObject ruleServiceDefRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_version_3_0 = null;

        EObject lv_services_5_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:315:2: ( (otherlv_0= 'ServiceDefRepository' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleServiceRepoVersion ) ) )? otherlv_4= '{' ( (lv_services_5_0= ruleAbstractServiceDefinition ) )* otherlv_6= '}' ) )
            // InternalServiceDefinition.g:316:2: (otherlv_0= 'ServiceDefRepository' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleServiceRepoVersion ) ) )? otherlv_4= '{' ( (lv_services_5_0= ruleAbstractServiceDefinition ) )* otherlv_6= '}' )
            {
            // InternalServiceDefinition.g:316:2: (otherlv_0= 'ServiceDefRepository' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleServiceRepoVersion ) ) )? otherlv_4= '{' ( (lv_services_5_0= ruleAbstractServiceDefinition ) )* otherlv_6= '}' )
            // InternalServiceDefinition.g:317:3: otherlv_0= 'ServiceDefRepository' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleServiceRepoVersion ) ) )? otherlv_4= '{' ( (lv_services_5_0= ruleAbstractServiceDefinition ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceDefRepositoryAccess().getServiceDefRepositoryKeyword_0());
            		
            // InternalServiceDefinition.g:321:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalServiceDefinition.g:322:4: (lv_name_1_0= RULE_ID )
            {
            // InternalServiceDefinition.g:322:4: (lv_name_1_0= RULE_ID )
            // InternalServiceDefinition.g:323:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceDefRepositoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceDefRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalServiceDefinition.g:339:3: (otherlv_2= 'version' ( (lv_version_3_0= ruleServiceRepoVersion ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalServiceDefinition.g:340:4: otherlv_2= 'version' ( (lv_version_3_0= ruleServiceRepoVersion ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getServiceDefRepositoryAccess().getVersionKeyword_2_0());
                    			
                    // InternalServiceDefinition.g:344:4: ( (lv_version_3_0= ruleServiceRepoVersion ) )
                    // InternalServiceDefinition.g:345:5: (lv_version_3_0= ruleServiceRepoVersion )
                    {
                    // InternalServiceDefinition.g:345:5: (lv_version_3_0= ruleServiceRepoVersion )
                    // InternalServiceDefinition.g:346:6: lv_version_3_0= ruleServiceRepoVersion
                    {

                    						newCompositeNode(grammarAccess.getServiceDefRepositoryAccess().getVersionServiceRepoVersionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_version_3_0=ruleServiceRepoVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceDefRepositoryRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_3_0,
                    							"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceRepoVersion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceDefRepositoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalServiceDefinition.g:368:3: ( (lv_services_5_0= ruleAbstractServiceDefinition ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20||(LA7_0>=22 && LA7_0<=24)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalServiceDefinition.g:369:4: (lv_services_5_0= ruleAbstractServiceDefinition )
            	    {
            	    // InternalServiceDefinition.g:369:4: (lv_services_5_0= ruleAbstractServiceDefinition )
            	    // InternalServiceDefinition.g:370:5: lv_services_5_0= ruleAbstractServiceDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getServiceDefRepositoryAccess().getServicesAbstractServiceDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_services_5_0=ruleAbstractServiceDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServiceDefRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"services",
            	    						lv_services_5_0,
            	    						"org.xtext.service.serviceDefinition.ServiceDefinition.AbstractServiceDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceDefRepositoryAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalServiceDefinition.g:395:1: entryRuleServiceRepoVersion returns [EObject current=null] : iv_ruleServiceRepoVersion= ruleServiceRepoVersion EOF ;
    public final EObject entryRuleServiceRepoVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceRepoVersion = null;


        try {
            // InternalServiceDefinition.g:395:59: (iv_ruleServiceRepoVersion= ruleServiceRepoVersion EOF )
            // InternalServiceDefinition.g:396:2: iv_ruleServiceRepoVersion= ruleServiceRepoVersion EOF
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
    // InternalServiceDefinition.g:402:1: ruleServiceRepoVersion returns [EObject current=null] : ( ( (lv_major_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_minor_2_0= ruleEInt ) ) (otherlv_3= '.' ( (lv_patch_4_0= ruleEInt ) ) )? ) ;
    public final EObject ruleServiceRepoVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_major_0_0 = null;

        AntlrDatatypeRuleToken lv_minor_2_0 = null;

        AntlrDatatypeRuleToken lv_patch_4_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:408:2: ( ( ( (lv_major_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_minor_2_0= ruleEInt ) ) (otherlv_3= '.' ( (lv_patch_4_0= ruleEInt ) ) )? ) )
            // InternalServiceDefinition.g:409:2: ( ( (lv_major_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_minor_2_0= ruleEInt ) ) (otherlv_3= '.' ( (lv_patch_4_0= ruleEInt ) ) )? )
            {
            // InternalServiceDefinition.g:409:2: ( ( (lv_major_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_minor_2_0= ruleEInt ) ) (otherlv_3= '.' ( (lv_patch_4_0= ruleEInt ) ) )? )
            // InternalServiceDefinition.g:410:3: ( (lv_major_0_0= ruleEInt ) ) otherlv_1= '.' ( (lv_minor_2_0= ruleEInt ) ) (otherlv_3= '.' ( (lv_patch_4_0= ruleEInt ) ) )?
            {
            // InternalServiceDefinition.g:410:3: ( (lv_major_0_0= ruleEInt ) )
            // InternalServiceDefinition.g:411:4: (lv_major_0_0= ruleEInt )
            {
            // InternalServiceDefinition.g:411:4: (lv_major_0_0= ruleEInt )
            // InternalServiceDefinition.g:412:5: lv_major_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getServiceRepoVersionAccess().getMajorEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_1=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_1());
            		
            // InternalServiceDefinition.g:433:3: ( (lv_minor_2_0= ruleEInt ) )
            // InternalServiceDefinition.g:434:4: (lv_minor_2_0= ruleEInt )
            {
            // InternalServiceDefinition.g:434:4: (lv_minor_2_0= ruleEInt )
            // InternalServiceDefinition.g:435:5: lv_minor_2_0= ruleEInt
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

            // InternalServiceDefinition.g:452:3: (otherlv_3= '.' ( (lv_patch_4_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalServiceDefinition.g:453:4: otherlv_3= '.' ( (lv_patch_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_3_0());
                    			
                    // InternalServiceDefinition.g:457:4: ( (lv_patch_4_0= ruleEInt ) )
                    // InternalServiceDefinition.g:458:5: (lv_patch_4_0= ruleEInt )
                    {
                    // InternalServiceDefinition.g:458:5: (lv_patch_4_0= ruleEInt )
                    // InternalServiceDefinition.g:459:6: lv_patch_4_0= ruleEInt
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
    // InternalServiceDefinition.g:481:1: entryRuleCommRepoImport returns [EObject current=null] : iv_ruleCommRepoImport= ruleCommRepoImport EOF ;
    public final EObject entryRuleCommRepoImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommRepoImport = null;


        try {
            // InternalServiceDefinition.g:481:55: (iv_ruleCommRepoImport= ruleCommRepoImport EOF )
            // InternalServiceDefinition.g:482:2: iv_ruleCommRepoImport= ruleCommRepoImport EOF
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
    // InternalServiceDefinition.g:488:1: ruleCommRepoImport returns [EObject current=null] : (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleCommRepoImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:494:2: ( (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) )
            // InternalServiceDefinition.g:495:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            {
            // InternalServiceDefinition.g:495:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            // InternalServiceDefinition.g:496:3: otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCommRepoImportAccess().getImportKeyword_0());
            		
            // InternalServiceDefinition.g:500:3: ( (lv_importedNamespace_1_0= ruleFQNW ) )
            // InternalServiceDefinition.g:501:4: (lv_importedNamespace_1_0= ruleFQNW )
            {
            // InternalServiceDefinition.g:501:4: (lv_importedNamespace_1_0= ruleFQNW )
            // InternalServiceDefinition.g:502:5: lv_importedNamespace_1_0= ruleFQNW
            {

            					newCompositeNode(grammarAccess.getCommRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalServiceDefinition.g:519:3: (otherlv_2= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalServiceDefinition.g:520:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

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
    // InternalServiceDefinition.g:529:1: entryRuleAbstractServiceDefinition returns [EObject current=null] : iv_ruleAbstractServiceDefinition= ruleAbstractServiceDefinition EOF ;
    public final EObject entryRuleAbstractServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractServiceDefinition = null;


        try {
            // InternalServiceDefinition.g:529:66: (iv_ruleAbstractServiceDefinition= ruleAbstractServiceDefinition EOF )
            // InternalServiceDefinition.g:530:2: iv_ruleAbstractServiceDefinition= ruleAbstractServiceDefinition EOF
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
    // InternalServiceDefinition.g:536:1: ruleAbstractServiceDefinition returns [EObject current=null] : (this_CommunicationServiceDefinition_0= ruleCommunicationServiceDefinition | this_CoordinationServiceDefinition_1= ruleCoordinationServiceDefinition ) ;
    public final EObject ruleAbstractServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CommunicationServiceDefinition_0 = null;

        EObject this_CoordinationServiceDefinition_1 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:542:2: ( (this_CommunicationServiceDefinition_0= ruleCommunicationServiceDefinition | this_CoordinationServiceDefinition_1= ruleCoordinationServiceDefinition ) )
            // InternalServiceDefinition.g:543:2: (this_CommunicationServiceDefinition_0= ruleCommunicationServiceDefinition | this_CoordinationServiceDefinition_1= ruleCoordinationServiceDefinition )
            {
            // InternalServiceDefinition.g:543:2: (this_CommunicationServiceDefinition_0= ruleCommunicationServiceDefinition | this_CoordinationServiceDefinition_1= ruleCoordinationServiceDefinition )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20||(LA10_0>=22 && LA10_0<=23)) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalServiceDefinition.g:544:3: this_CommunicationServiceDefinition_0= ruleCommunicationServiceDefinition
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
                    // InternalServiceDefinition.g:553:3: this_CoordinationServiceDefinition_1= ruleCoordinationServiceDefinition
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
    // InternalServiceDefinition.g:565:1: entryRuleCommunicationServiceDefinition returns [EObject current=null] : iv_ruleCommunicationServiceDefinition= ruleCommunicationServiceDefinition EOF ;
    public final EObject entryRuleCommunicationServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationServiceDefinition = null;


        try {
            // InternalServiceDefinition.g:565:71: (iv_ruleCommunicationServiceDefinition= ruleCommunicationServiceDefinition EOF )
            // InternalServiceDefinition.g:566:2: iv_ruleCommunicationServiceDefinition= ruleCommunicationServiceDefinition EOF
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
    // InternalServiceDefinition.g:572:1: ruleCommunicationServiceDefinition returns [EObject current=null] : (this_ForkingServiceDefinition_0= ruleForkingServiceDefinition | this_JoyningServiceDefinition_1= ruleJoyningServiceDefinition | this_RequestAnswerServiceDefinition_2= ruleRequestAnswerServiceDefinition ) ;
    public final EObject ruleCommunicationServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ForkingServiceDefinition_0 = null;

        EObject this_JoyningServiceDefinition_1 = null;

        EObject this_RequestAnswerServiceDefinition_2 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:578:2: ( (this_ForkingServiceDefinition_0= ruleForkingServiceDefinition | this_JoyningServiceDefinition_1= ruleJoyningServiceDefinition | this_RequestAnswerServiceDefinition_2= ruleRequestAnswerServiceDefinition ) )
            // InternalServiceDefinition.g:579:2: (this_ForkingServiceDefinition_0= ruleForkingServiceDefinition | this_JoyningServiceDefinition_1= ruleJoyningServiceDefinition | this_RequestAnswerServiceDefinition_2= ruleRequestAnswerServiceDefinition )
            {
            // InternalServiceDefinition.g:579:2: (this_ForkingServiceDefinition_0= ruleForkingServiceDefinition | this_JoyningServiceDefinition_1= ruleJoyningServiceDefinition | this_RequestAnswerServiceDefinition_2= ruleRequestAnswerServiceDefinition )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt11=1;
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalServiceDefinition.g:580:3: this_ForkingServiceDefinition_0= ruleForkingServiceDefinition
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
                    // InternalServiceDefinition.g:589:3: this_JoyningServiceDefinition_1= ruleJoyningServiceDefinition
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
                    // InternalServiceDefinition.g:598:3: this_RequestAnswerServiceDefinition_2= ruleRequestAnswerServiceDefinition
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
    // InternalServiceDefinition.g:610:1: entryRuleForkingServiceDefinition returns [EObject current=null] : iv_ruleForkingServiceDefinition= ruleForkingServiceDefinition EOF ;
    public final EObject entryRuleForkingServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForkingServiceDefinition = null;


        try {
            // InternalServiceDefinition.g:610:65: (iv_ruleForkingServiceDefinition= ruleForkingServiceDefinition EOF )
            // InternalServiceDefinition.g:611:2: iv_ruleForkingServiceDefinition= ruleForkingServiceDefinition EOF
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
    // InternalServiceDefinition.g:617:1: ruleForkingServiceDefinition returns [EObject current=null] : (otherlv_0= 'ForkingServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleForkingPatternInstance ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}' ) ;
    public final EObject ruleForkingServiceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_pattern_3_0 = null;

        AntlrDatatypeRuleToken lv_purposeDescription_5_0 = null;

        EObject lv_properties_6_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:623:2: ( (otherlv_0= 'ForkingServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleForkingPatternInstance ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}' ) )
            // InternalServiceDefinition.g:624:2: (otherlv_0= 'ForkingServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleForkingPatternInstance ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}' )
            {
            // InternalServiceDefinition.g:624:2: (otherlv_0= 'ForkingServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleForkingPatternInstance ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}' )
            // InternalServiceDefinition.g:625:3: otherlv_0= 'ForkingServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleForkingPatternInstance ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getForkingServiceDefinitionAccess().getForkingServiceDefinitionKeyword_0());
            		
            // InternalServiceDefinition.g:629:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalServiceDefinition.g:630:4: (lv_name_1_0= RULE_ID )
            {
            // InternalServiceDefinition.g:630:4: (lv_name_1_0= RULE_ID )
            // InternalServiceDefinition.g:631:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getForkingServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForkingServiceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getForkingServiceDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalServiceDefinition.g:651:3: ( (lv_pattern_3_0= ruleForkingPatternInstance ) )
            // InternalServiceDefinition.g:652:4: (lv_pattern_3_0= ruleForkingPatternInstance )
            {
            // InternalServiceDefinition.g:652:4: (lv_pattern_3_0= ruleForkingPatternInstance )
            // InternalServiceDefinition.g:653:5: lv_pattern_3_0= ruleForkingPatternInstance
            {

            					newCompositeNode(grammarAccess.getForkingServiceDefinitionAccess().getPatternForkingPatternInstanceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_pattern_3_0=ruleForkingPatternInstance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForkingServiceDefinitionRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_3_0,
            						"org.xtext.service.serviceDefinition.ServiceDefinition.ForkingPatternInstance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalServiceDefinition.g:670:3: (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalServiceDefinition.g:671:4: otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getForkingServiceDefinitionAccess().getPurposeDescriptionKeyword_4_0());
                    			
                    // InternalServiceDefinition.g:675:4: ( (lv_purposeDescription_5_0= ruleEString ) )
                    // InternalServiceDefinition.g:676:5: (lv_purposeDescription_5_0= ruleEString )
                    {
                    // InternalServiceDefinition.g:676:5: (lv_purposeDescription_5_0= ruleEString )
                    // InternalServiceDefinition.g:677:6: lv_purposeDescription_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getForkingServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_purposeDescription_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForkingServiceDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"purposeDescription",
                    							lv_purposeDescription_5_0,
                    							"org.xtext.service.serviceDefinition.ServiceDefinition.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalServiceDefinition.g:695:3: ( (lv_properties_6_0= ruleServiceProperty ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==46) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalServiceDefinition.g:696:4: (lv_properties_6_0= ruleServiceProperty )
            	    {
            	    // InternalServiceDefinition.g:696:4: (lv_properties_6_0= ruleServiceProperty )
            	    // InternalServiceDefinition.g:697:5: lv_properties_6_0= ruleServiceProperty
            	    {

            	    					newCompositeNode(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_properties_6_0=ruleServiceProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForkingServiceDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_6_0,
            	    						"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getForkingServiceDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalServiceDefinition.g:722:1: entryRuleJoyningServiceDefinition returns [EObject current=null] : iv_ruleJoyningServiceDefinition= ruleJoyningServiceDefinition EOF ;
    public final EObject entryRuleJoyningServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoyningServiceDefinition = null;


        try {
            // InternalServiceDefinition.g:722:65: (iv_ruleJoyningServiceDefinition= ruleJoyningServiceDefinition EOF )
            // InternalServiceDefinition.g:723:2: iv_ruleJoyningServiceDefinition= ruleJoyningServiceDefinition EOF
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
    // InternalServiceDefinition.g:729:1: ruleJoyningServiceDefinition returns [EObject current=null] : (otherlv_0= 'JoiningServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleJoiningPatternInstance ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}' ) ;
    public final EObject ruleJoyningServiceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_pattern_3_0 = null;

        AntlrDatatypeRuleToken lv_purposeDescription_5_0 = null;

        EObject lv_properties_6_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:735:2: ( (otherlv_0= 'JoiningServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleJoiningPatternInstance ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}' ) )
            // InternalServiceDefinition.g:736:2: (otherlv_0= 'JoiningServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleJoiningPatternInstance ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}' )
            {
            // InternalServiceDefinition.g:736:2: (otherlv_0= 'JoiningServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleJoiningPatternInstance ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}' )
            // InternalServiceDefinition.g:737:3: otherlv_0= 'JoiningServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleJoiningPatternInstance ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getJoyningServiceDefinitionAccess().getJoiningServiceDefinitionKeyword_0());
            		
            // InternalServiceDefinition.g:741:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalServiceDefinition.g:742:4: (lv_name_1_0= RULE_ID )
            {
            // InternalServiceDefinition.g:742:4: (lv_name_1_0= RULE_ID )
            // InternalServiceDefinition.g:743:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJoyningServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoyningServiceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getJoyningServiceDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalServiceDefinition.g:763:3: ( (lv_pattern_3_0= ruleJoiningPatternInstance ) )
            // InternalServiceDefinition.g:764:4: (lv_pattern_3_0= ruleJoiningPatternInstance )
            {
            // InternalServiceDefinition.g:764:4: (lv_pattern_3_0= ruleJoiningPatternInstance )
            // InternalServiceDefinition.g:765:5: lv_pattern_3_0= ruleJoiningPatternInstance
            {

            					newCompositeNode(grammarAccess.getJoyningServiceDefinitionAccess().getPatternJoiningPatternInstanceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_pattern_3_0=ruleJoiningPatternInstance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoyningServiceDefinitionRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_3_0,
            						"org.xtext.service.serviceDefinition.ServiceDefinition.JoiningPatternInstance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalServiceDefinition.g:782:3: (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalServiceDefinition.g:783:4: otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getJoyningServiceDefinitionAccess().getPurposeDescriptionKeyword_4_0());
                    			
                    // InternalServiceDefinition.g:787:4: ( (lv_purposeDescription_5_0= ruleEString ) )
                    // InternalServiceDefinition.g:788:5: (lv_purposeDescription_5_0= ruleEString )
                    {
                    // InternalServiceDefinition.g:788:5: (lv_purposeDescription_5_0= ruleEString )
                    // InternalServiceDefinition.g:789:6: lv_purposeDescription_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getJoyningServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_purposeDescription_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJoyningServiceDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"purposeDescription",
                    							lv_purposeDescription_5_0,
                    							"org.xtext.service.serviceDefinition.ServiceDefinition.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalServiceDefinition.g:807:3: ( (lv_properties_6_0= ruleServiceProperty ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==46) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalServiceDefinition.g:808:4: (lv_properties_6_0= ruleServiceProperty )
            	    {
            	    // InternalServiceDefinition.g:808:4: (lv_properties_6_0= ruleServiceProperty )
            	    // InternalServiceDefinition.g:809:5: lv_properties_6_0= ruleServiceProperty
            	    {

            	    					newCompositeNode(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_properties_6_0=ruleServiceProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJoyningServiceDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_6_0,
            	    						"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getJoyningServiceDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalServiceDefinition.g:834:1: entryRuleRequestAnswerServiceDefinition returns [EObject current=null] : iv_ruleRequestAnswerServiceDefinition= ruleRequestAnswerServiceDefinition EOF ;
    public final EObject entryRuleRequestAnswerServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestAnswerServiceDefinition = null;


        try {
            // InternalServiceDefinition.g:834:71: (iv_ruleRequestAnswerServiceDefinition= ruleRequestAnswerServiceDefinition EOF )
            // InternalServiceDefinition.g:835:2: iv_ruleRequestAnswerServiceDefinition= ruleRequestAnswerServiceDefinition EOF
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
    // InternalServiceDefinition.g:841:1: ruleRequestAnswerServiceDefinition returns [EObject current=null] : (otherlv_0= 'RequestAnswerServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleRequestAnswerPattern ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}' ) ;
    public final EObject ruleRequestAnswerServiceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_pattern_3_0 = null;

        AntlrDatatypeRuleToken lv_purposeDescription_5_0 = null;

        EObject lv_properties_6_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:847:2: ( (otherlv_0= 'RequestAnswerServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleRequestAnswerPattern ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}' ) )
            // InternalServiceDefinition.g:848:2: (otherlv_0= 'RequestAnswerServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleRequestAnswerPattern ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}' )
            {
            // InternalServiceDefinition.g:848:2: (otherlv_0= 'RequestAnswerServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleRequestAnswerPattern ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}' )
            // InternalServiceDefinition.g:849:3: otherlv_0= 'RequestAnswerServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pattern_3_0= ruleRequestAnswerPattern ) ) (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )? ( (lv_properties_6_0= ruleServiceProperty ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestAnswerServiceDefinitionAccess().getRequestAnswerServiceDefinitionKeyword_0());
            		
            // InternalServiceDefinition.g:853:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalServiceDefinition.g:854:4: (lv_name_1_0= RULE_ID )
            {
            // InternalServiceDefinition.g:854:4: (lv_name_1_0= RULE_ID )
            // InternalServiceDefinition.g:855:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestAnswerServiceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getRequestAnswerServiceDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalServiceDefinition.g:875:3: ( (lv_pattern_3_0= ruleRequestAnswerPattern ) )
            // InternalServiceDefinition.g:876:4: (lv_pattern_3_0= ruleRequestAnswerPattern )
            {
            // InternalServiceDefinition.g:876:4: (lv_pattern_3_0= ruleRequestAnswerPattern )
            // InternalServiceDefinition.g:877:5: lv_pattern_3_0= ruleRequestAnswerPattern
            {

            					newCompositeNode(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternRequestAnswerPatternParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_pattern_3_0=ruleRequestAnswerPattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequestAnswerServiceDefinitionRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_3_0,
            						"org.xtext.service.serviceDefinition.ServiceDefinition.RequestAnswerPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalServiceDefinition.g:894:3: (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalServiceDefinition.g:895:4: otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getRequestAnswerServiceDefinitionAccess().getPurposeDescriptionKeyword_4_0());
                    			
                    // InternalServiceDefinition.g:899:4: ( (lv_purposeDescription_5_0= ruleEString ) )
                    // InternalServiceDefinition.g:900:5: (lv_purposeDescription_5_0= ruleEString )
                    {
                    // InternalServiceDefinition.g:900:5: (lv_purposeDescription_5_0= ruleEString )
                    // InternalServiceDefinition.g:901:6: lv_purposeDescription_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_purposeDescription_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequestAnswerServiceDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"purposeDescription",
                    							lv_purposeDescription_5_0,
                    							"org.xtext.service.serviceDefinition.ServiceDefinition.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalServiceDefinition.g:919:3: ( (lv_properties_6_0= ruleServiceProperty ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==46) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalServiceDefinition.g:920:4: (lv_properties_6_0= ruleServiceProperty )
            	    {
            	    // InternalServiceDefinition.g:920:4: (lv_properties_6_0= ruleServiceProperty )
            	    // InternalServiceDefinition.g:921:5: lv_properties_6_0= ruleServiceProperty
            	    {

            	    					newCompositeNode(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_properties_6_0=ruleServiceProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequestAnswerServiceDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_6_0,
            	    						"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRequestAnswerServiceDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalServiceDefinition.g:946:1: entryRuleCoordinationServiceDefinition returns [EObject current=null] : iv_ruleCoordinationServiceDefinition= ruleCoordinationServiceDefinition EOF ;
    public final EObject entryRuleCoordinationServiceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationServiceDefinition = null;


        try {
            // InternalServiceDefinition.g:946:70: (iv_ruleCoordinationServiceDefinition= ruleCoordinationServiceDefinition EOF )
            // InternalServiceDefinition.g:947:2: iv_ruleCoordinationServiceDefinition= ruleCoordinationServiceDefinition EOF
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
    // InternalServiceDefinition.g:953:1: ruleCoordinationServiceDefinition returns [EObject current=null] : (otherlv_0= 'CoordinationServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) ) ) ( (lv_services_10_0= ruleCommunicationServiceUsage ) )* ( (lv_properties_11_0= ruleServiceProperty ) )* otherlv_12= '}' ) ;
    public final EObject ruleCoordinationServiceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_purposeDescription_5_0 = null;

        EObject lv_statePattern_6_0 = null;

        EObject lv_parameterPattern_7_0 = null;

        EObject lv_monitoringPattern_8_0 = null;

        EObject lv_wiringPattern_9_0 = null;

        EObject lv_services_10_0 = null;

        EObject lv_properties_11_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:959:2: ( (otherlv_0= 'CoordinationServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) ) ) ( (lv_services_10_0= ruleCommunicationServiceUsage ) )* ( (lv_properties_11_0= ruleServiceProperty ) )* otherlv_12= '}' ) )
            // InternalServiceDefinition.g:960:2: (otherlv_0= 'CoordinationServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) ) ) ( (lv_services_10_0= ruleCommunicationServiceUsage ) )* ( (lv_properties_11_0= ruleServiceProperty ) )* otherlv_12= '}' )
            {
            // InternalServiceDefinition.g:960:2: (otherlv_0= 'CoordinationServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) ) ) ( (lv_services_10_0= ruleCommunicationServiceUsage ) )* ( (lv_properties_11_0= ruleServiceProperty ) )* otherlv_12= '}' )
            // InternalServiceDefinition.g:961:3: otherlv_0= 'CoordinationServiceDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) ) ) ( (lv_services_10_0= ruleCommunicationServiceUsage ) )* ( (lv_properties_11_0= ruleServiceProperty ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinationServiceDefinitionAccess().getCoordinationServiceDefinitionKeyword_0());
            		
            // InternalServiceDefinition.g:965:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalServiceDefinition.g:966:4: (lv_name_1_0= RULE_ID )
            {
            // InternalServiceDefinition.g:966:4: (lv_name_1_0= RULE_ID )
            // InternalServiceDefinition.g:967:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCoordinationServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinationServiceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinationServiceDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalServiceDefinition.g:987:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) ) )
            // InternalServiceDefinition.g:988:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) )
            {
            // InternalServiceDefinition.g:988:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) ) ) )* ) )
            // InternalServiceDefinition.g:989:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
            				
            // InternalServiceDefinition.g:992:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) ) ) )* )
            // InternalServiceDefinition.g:993:6: ( ({...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) ) ) )*
            {
            // InternalServiceDefinition.g:993:6: ( ({...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) ) ) )*
            loop18:
            do {
                int alt18=6;
                int LA18_0 = input.LA(1);

                if ( LA18_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                    alt18=2;
                }
                else if ( LA18_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                    alt18=3;
                }
                else if ( LA18_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
                    alt18=4;
                }
                else if ( LA18_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4) ) {
                    alt18=5;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalServiceDefinition.g:994:4: ({...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:994:4: ({...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) ) )
            	    // InternalServiceDefinition.g:995:5: {...}? => ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalServiceDefinition.g:995:126: ( ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) ) )
            	    // InternalServiceDefinition.g:996:6: ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalServiceDefinition.g:999:9: ({...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) ) )
            	    // InternalServiceDefinition.g:999:10: {...}? => (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "true");
            	    }
            	    // InternalServiceDefinition.g:999:19: (otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) ) )
            	    // InternalServiceDefinition.g:999:20: otherlv_4= 'purposeDescription' ( (lv_purposeDescription_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_16); 

            	    									newLeafNode(otherlv_4, grammarAccess.getCoordinationServiceDefinitionAccess().getPurposeDescriptionKeyword_3_0_0());
            	    								
            	    // InternalServiceDefinition.g:1003:9: ( (lv_purposeDescription_5_0= ruleEString ) )
            	    // InternalServiceDefinition.g:1004:10: (lv_purposeDescription_5_0= ruleEString )
            	    {
            	    // InternalServiceDefinition.g:1004:10: (lv_purposeDescription_5_0= ruleEString )
            	    // InternalServiceDefinition.g:1005:11: lv_purposeDescription_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_20);
            	    lv_purposeDescription_5_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"purposeDescription",
            	    												lv_purposeDescription_5_0,
            	    												"org.xtext.service.serviceDefinition.ServiceDefinition.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalServiceDefinition.g:1028:4: ({...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1028:4: ({...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) ) )
            	    // InternalServiceDefinition.g:1029:5: {...}? => ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalServiceDefinition.g:1029:126: ( ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) ) )
            	    // InternalServiceDefinition.g:1030:6: ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalServiceDefinition.g:1033:9: ({...}? => ( (lv_statePattern_6_0= ruleStatePattern ) ) )
            	    // InternalServiceDefinition.g:1033:10: {...}? => ( (lv_statePattern_6_0= ruleStatePattern ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "true");
            	    }
            	    // InternalServiceDefinition.g:1033:19: ( (lv_statePattern_6_0= ruleStatePattern ) )
            	    // InternalServiceDefinition.g:1033:20: (lv_statePattern_6_0= ruleStatePattern )
            	    {
            	    // InternalServiceDefinition.g:1033:20: (lv_statePattern_6_0= ruleStatePattern )
            	    // InternalServiceDefinition.g:1034:10: lv_statePattern_6_0= ruleStatePattern
            	    {

            	    										newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternStatePatternParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_20);
            	    lv_statePattern_6_0=ruleStatePattern();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"statePattern",
            	    											lv_statePattern_6_0,
            	    											"org.xtext.service.serviceDefinition.ServiceDefinition.StatePattern");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalServiceDefinition.g:1056:4: ({...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1056:4: ({...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) ) )
            	    // InternalServiceDefinition.g:1057:5: {...}? => ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalServiceDefinition.g:1057:126: ( ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) ) )
            	    // InternalServiceDefinition.g:1058:6: ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalServiceDefinition.g:1061:9: ({...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) ) )
            	    // InternalServiceDefinition.g:1061:10: {...}? => ( (lv_parameterPattern_7_0= ruleParameterPattern ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "true");
            	    }
            	    // InternalServiceDefinition.g:1061:19: ( (lv_parameterPattern_7_0= ruleParameterPattern ) )
            	    // InternalServiceDefinition.g:1061:20: (lv_parameterPattern_7_0= ruleParameterPattern )
            	    {
            	    // InternalServiceDefinition.g:1061:20: (lv_parameterPattern_7_0= ruleParameterPattern )
            	    // InternalServiceDefinition.g:1062:10: lv_parameterPattern_7_0= ruleParameterPattern
            	    {

            	    										newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternParameterPatternParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_20);
            	    lv_parameterPattern_7_0=ruleParameterPattern();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"parameterPattern",
            	    											lv_parameterPattern_7_0,
            	    											"org.xtext.service.serviceDefinition.ServiceDefinition.ParameterPattern");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalServiceDefinition.g:1084:4: ({...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1084:4: ({...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) ) )
            	    // InternalServiceDefinition.g:1085:5: {...}? => ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalServiceDefinition.g:1085:126: ( ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) ) )
            	    // InternalServiceDefinition.g:1086:6: ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalServiceDefinition.g:1089:9: ({...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) ) )
            	    // InternalServiceDefinition.g:1089:10: {...}? => ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "true");
            	    }
            	    // InternalServiceDefinition.g:1089:19: ( (lv_monitoringPattern_8_0= ruleMonitoringPattern ) )
            	    // InternalServiceDefinition.g:1089:20: (lv_monitoringPattern_8_0= ruleMonitoringPattern )
            	    {
            	    // InternalServiceDefinition.g:1089:20: (lv_monitoringPattern_8_0= ruleMonitoringPattern )
            	    // InternalServiceDefinition.g:1090:10: lv_monitoringPattern_8_0= ruleMonitoringPattern
            	    {

            	    										newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternMonitoringPatternParserRuleCall_3_3_0());
            	    									
            	    pushFollow(FOLLOW_20);
            	    lv_monitoringPattern_8_0=ruleMonitoringPattern();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"monitoringPattern",
            	    											lv_monitoringPattern_8_0,
            	    											"org.xtext.service.serviceDefinition.ServiceDefinition.MonitoringPattern");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalServiceDefinition.g:1112:4: ({...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1112:4: ({...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) ) )
            	    // InternalServiceDefinition.g:1113:5: {...}? => ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalServiceDefinition.g:1113:126: ( ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) ) )
            	    // InternalServiceDefinition.g:1114:6: ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalServiceDefinition.g:1117:9: ({...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) ) )
            	    // InternalServiceDefinition.g:1117:10: {...}? => ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCoordinationServiceDefinition", "true");
            	    }
            	    // InternalServiceDefinition.g:1117:19: ( (lv_wiringPattern_9_0= ruleDynamicWiringPattern ) )
            	    // InternalServiceDefinition.g:1117:20: (lv_wiringPattern_9_0= ruleDynamicWiringPattern )
            	    {
            	    // InternalServiceDefinition.g:1117:20: (lv_wiringPattern_9_0= ruleDynamicWiringPattern )
            	    // InternalServiceDefinition.g:1118:10: lv_wiringPattern_9_0= ruleDynamicWiringPattern
            	    {

            	    										newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternDynamicWiringPatternParserRuleCall_3_4_0());
            	    									
            	    pushFollow(FOLLOW_20);
            	    lv_wiringPattern_9_0=ruleDynamicWiringPattern();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"wiringPattern",
            	    											lv_wiringPattern_9_0,
            	    											"org.xtext.service.serviceDefinition.ServiceDefinition.DynamicWiringPattern");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
            				

            }

            // InternalServiceDefinition.g:1147:3: ( (lv_services_10_0= ruleCommunicationServiceUsage ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalServiceDefinition.g:1148:4: (lv_services_10_0= ruleCommunicationServiceUsage )
            	    {
            	    // InternalServiceDefinition.g:1148:4: (lv_services_10_0= ruleCommunicationServiceUsage )
            	    // InternalServiceDefinition.g:1149:5: lv_services_10_0= ruleCommunicationServiceUsage
            	    {

            	    					newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesCommunicationServiceUsageParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_services_10_0=ruleCommunicationServiceUsage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"services",
            	    						lv_services_10_0,
            	    						"org.xtext.service.serviceDefinition.ServiceDefinition.CommunicationServiceUsage");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalServiceDefinition.g:1166:3: ( (lv_properties_11_0= ruleServiceProperty ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==46) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalServiceDefinition.g:1167:4: (lv_properties_11_0= ruleServiceProperty )
            	    {
            	    // InternalServiceDefinition.g:1167:4: (lv_properties_11_0= ruleServiceProperty )
            	    // InternalServiceDefinition.g:1168:5: lv_properties_11_0= ruleServiceProperty
            	    {

            	    					newCompositeNode(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_properties_11_0=ruleServiceProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoordinationServiceDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_11_0,
            	    						"org.xtext.service.serviceDefinition.ServiceDefinition.ServiceProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCoordinationServiceDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalServiceDefinition.g:1193:1: entryRuleCommunicationServiceUsage returns [EObject current=null] : iv_ruleCommunicationServiceUsage= ruleCommunicationServiceUsage EOF ;
    public final EObject entryRuleCommunicationServiceUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationServiceUsage = null;


        try {
            // InternalServiceDefinition.g:1193:66: (iv_ruleCommunicationServiceUsage= ruleCommunicationServiceUsage EOF )
            // InternalServiceDefinition.g:1194:2: iv_ruleCommunicationServiceUsage= ruleCommunicationServiceUsage EOF
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
    // InternalServiceDefinition.g:1200:1: ruleCommunicationServiceUsage returns [EObject current=null] : (otherlv_0= 'CommunicationServiceUsage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( ( ruleFQN ) ) ) ;
    public final EObject ruleCommunicationServiceUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1206:2: ( (otherlv_0= 'CommunicationServiceUsage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( ( ruleFQN ) ) ) )
            // InternalServiceDefinition.g:1207:2: (otherlv_0= 'CommunicationServiceUsage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( ( ruleFQN ) ) )
            {
            // InternalServiceDefinition.g:1207:2: (otherlv_0= 'CommunicationServiceUsage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:1208:3: otherlv_0= 'CommunicationServiceUsage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCommunicationServiceUsageAccess().getCommunicationServiceUsageKeyword_0());
            		
            // InternalServiceDefinition.g:1212:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalServiceDefinition.g:1213:4: (lv_name_1_0= RULE_ID )
            {
            // InternalServiceDefinition.g:1213:4: (lv_name_1_0= RULE_ID )
            // InternalServiceDefinition.g:1214:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCommunicationServiceUsageAccess().getUsesKeyword_2());
            		
            // InternalServiceDefinition.g:1234:3: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:1235:4: ( ruleFQN )
            {
            // InternalServiceDefinition.g:1235:4: ( ruleFQN )
            // InternalServiceDefinition.g:1236:5: ruleFQN
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
    // InternalServiceDefinition.g:1254:1: entryRuleStatePattern returns [EObject current=null] : iv_ruleStatePattern= ruleStatePattern EOF ;
    public final EObject entryRuleStatePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatePattern = null;


        try {
            // InternalServiceDefinition.g:1254:53: (iv_ruleStatePattern= ruleStatePattern EOF )
            // InternalServiceDefinition.g:1255:2: iv_ruleStatePattern= ruleStatePattern EOF
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
    // InternalServiceDefinition.g:1261:1: ruleStatePattern returns [EObject current=null] : ( () otherlv_1= 'StatePattern' otherlv_2= '<' otherlv_3= 'lifecycle' ( ( ruleFQN ) ) (otherlv_5= 'with' ( ( ruleFQN ) ) )? otherlv_7= '>' ) ;
    public final EObject ruleStatePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1267:2: ( ( () otherlv_1= 'StatePattern' otherlv_2= '<' otherlv_3= 'lifecycle' ( ( ruleFQN ) ) (otherlv_5= 'with' ( ( ruleFQN ) ) )? otherlv_7= '>' ) )
            // InternalServiceDefinition.g:1268:2: ( () otherlv_1= 'StatePattern' otherlv_2= '<' otherlv_3= 'lifecycle' ( ( ruleFQN ) ) (otherlv_5= 'with' ( ( ruleFQN ) ) )? otherlv_7= '>' )
            {
            // InternalServiceDefinition.g:1268:2: ( () otherlv_1= 'StatePattern' otherlv_2= '<' otherlv_3= 'lifecycle' ( ( ruleFQN ) ) (otherlv_5= 'with' ( ( ruleFQN ) ) )? otherlv_7= '>' )
            // InternalServiceDefinition.g:1269:3: () otherlv_1= 'StatePattern' otherlv_2= '<' otherlv_3= 'lifecycle' ( ( ruleFQN ) ) (otherlv_5= 'with' ( ( ruleFQN ) ) )? otherlv_7= '>'
            {
            // InternalServiceDefinition.g:1269:3: ()
            // InternalServiceDefinition.g:1270:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatePatternAccess().getStatePatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getStatePatternAccess().getStatePatternKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getStatePatternAccess().getLessThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getStatePatternAccess().getLifecycleKeyword_3());
            		
            // InternalServiceDefinition.g:1288:3: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:1289:4: ( ruleFQN )
            {
            // InternalServiceDefinition.g:1289:4: ( ruleFQN )
            // InternalServiceDefinition.g:1290:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatePatternRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStatePatternAccess().getLifecycleStateMachineCrossReference_4_0());
            				
            pushFollow(FOLLOW_25);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalServiceDefinition.g:1304:3: (otherlv_5= 'with' ( ( ruleFQN ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalServiceDefinition.g:1305:4: otherlv_5= 'with' ( ( ruleFQN ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getStatePatternAccess().getWithKeyword_5_0());
                    			
                    // InternalServiceDefinition.g:1309:4: ( ( ruleFQN ) )
                    // InternalServiceDefinition.g:1310:5: ( ruleFQN )
                    {
                    // InternalServiceDefinition.g:1310:5: ( ruleFQN )
                    // InternalServiceDefinition.g:1311:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatePatternRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStatePatternAccess().getModesComponentModeCollectionCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FOLLOW_2); 

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
    // InternalServiceDefinition.g:1334:1: entryRuleParameterPattern returns [EObject current=null] : iv_ruleParameterPattern= ruleParameterPattern EOF ;
    public final EObject entryRuleParameterPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterPattern = null;


        try {
            // InternalServiceDefinition.g:1334:57: (iv_ruleParameterPattern= ruleParameterPattern EOF )
            // InternalServiceDefinition.g:1335:2: iv_ruleParameterPattern= ruleParameterPattern EOF
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
    // InternalServiceDefinition.g:1341:1: ruleParameterPattern returns [EObject current=null] : ( () otherlv_1= 'ParameterPattern' otherlv_2= '<' ( ( ruleFQN ) ) otherlv_4= '>' ) ;
    public final EObject ruleParameterPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1347:2: ( ( () otherlv_1= 'ParameterPattern' otherlv_2= '<' ( ( ruleFQN ) ) otherlv_4= '>' ) )
            // InternalServiceDefinition.g:1348:2: ( () otherlv_1= 'ParameterPattern' otherlv_2= '<' ( ( ruleFQN ) ) otherlv_4= '>' )
            {
            // InternalServiceDefinition.g:1348:2: ( () otherlv_1= 'ParameterPattern' otherlv_2= '<' ( ( ruleFQN ) ) otherlv_4= '>' )
            // InternalServiceDefinition.g:1349:3: () otherlv_1= 'ParameterPattern' otherlv_2= '<' ( ( ruleFQN ) ) otherlv_4= '>'
            {
            // InternalServiceDefinition.g:1349:3: ()
            // InternalServiceDefinition.g:1350:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterPatternAccess().getParameterPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterPatternAccess().getParameterPatternKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterPatternAccess().getLessThanSignKeyword_2());
            		
            // InternalServiceDefinition.g:1364:3: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:1365:4: ( ruleFQN )
            {
            // InternalServiceDefinition.g:1365:4: ( ruleFQN )
            // InternalServiceDefinition.g:1366:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterPatternRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterPatternAccess().getParameterSetParameterSetDefinitionCrossReference_3_0());
            				
            pushFollow(FOLLOW_26);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

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
    // InternalServiceDefinition.g:1388:1: entryRuleDynamicWiringPattern returns [EObject current=null] : iv_ruleDynamicWiringPattern= ruleDynamicWiringPattern EOF ;
    public final EObject entryRuleDynamicWiringPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicWiringPattern = null;


        try {
            // InternalServiceDefinition.g:1388:61: (iv_ruleDynamicWiringPattern= ruleDynamicWiringPattern EOF )
            // InternalServiceDefinition.g:1389:2: iv_ruleDynamicWiringPattern= ruleDynamicWiringPattern EOF
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
    // InternalServiceDefinition.g:1395:1: ruleDynamicWiringPattern returns [EObject current=null] : ( () otherlv_1= 'DynamicWiringPattern' ) ;
    public final EObject ruleDynamicWiringPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1401:2: ( ( () otherlv_1= 'DynamicWiringPattern' ) )
            // InternalServiceDefinition.g:1402:2: ( () otherlv_1= 'DynamicWiringPattern' )
            {
            // InternalServiceDefinition.g:1402:2: ( () otherlv_1= 'DynamicWiringPattern' )
            // InternalServiceDefinition.g:1403:3: () otherlv_1= 'DynamicWiringPattern'
            {
            // InternalServiceDefinition.g:1403:3: ()
            // InternalServiceDefinition.g:1404:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

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
    // InternalServiceDefinition.g:1418:1: entryRuleMonitoringPattern returns [EObject current=null] : iv_ruleMonitoringPattern= ruleMonitoringPattern EOF ;
    public final EObject entryRuleMonitoringPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitoringPattern = null;


        try {
            // InternalServiceDefinition.g:1418:58: (iv_ruleMonitoringPattern= ruleMonitoringPattern EOF )
            // InternalServiceDefinition.g:1419:2: iv_ruleMonitoringPattern= ruleMonitoringPattern EOF
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
    // InternalServiceDefinition.g:1425:1: ruleMonitoringPattern returns [EObject current=null] : ( () otherlv_1= 'MonitoringPattern' ) ;
    public final EObject ruleMonitoringPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1431:2: ( ( () otherlv_1= 'MonitoringPattern' ) )
            // InternalServiceDefinition.g:1432:2: ( () otherlv_1= 'MonitoringPattern' )
            {
            // InternalServiceDefinition.g:1432:2: ( () otherlv_1= 'MonitoringPattern' )
            // InternalServiceDefinition.g:1433:3: () otherlv_1= 'MonitoringPattern'
            {
            // InternalServiceDefinition.g:1433:3: ()
            // InternalServiceDefinition.g:1434:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMonitoringPatternAccess().getMonitoringPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); 

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
    // InternalServiceDefinition.g:1448:1: entryRuleForkingPatternInstance returns [EObject current=null] : iv_ruleForkingPatternInstance= ruleForkingPatternInstance EOF ;
    public final EObject entryRuleForkingPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForkingPatternInstance = null;


        try {
            // InternalServiceDefinition.g:1448:63: (iv_ruleForkingPatternInstance= ruleForkingPatternInstance EOF )
            // InternalServiceDefinition.g:1449:2: iv_ruleForkingPatternInstance= ruleForkingPatternInstance EOF
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
    // InternalServiceDefinition.g:1455:1: ruleForkingPatternInstance returns [EObject current=null] : (this_PushPattern_0= rulePushPattern | this_EventPattern_1= ruleEventPattern ) ;
    public final EObject ruleForkingPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject this_PushPattern_0 = null;

        EObject this_EventPattern_1 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:1461:2: ( (this_PushPattern_0= rulePushPattern | this_EventPattern_1= ruleEventPattern ) )
            // InternalServiceDefinition.g:1462:2: (this_PushPattern_0= rulePushPattern | this_EventPattern_1= ruleEventPattern )
            {
            // InternalServiceDefinition.g:1462:2: (this_PushPattern_0= rulePushPattern | this_EventPattern_1= ruleEventPattern )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            else if ( (LA22_0==38) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalServiceDefinition.g:1463:3: this_PushPattern_0= rulePushPattern
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
                    // InternalServiceDefinition.g:1472:3: this_EventPattern_1= ruleEventPattern
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
    // InternalServiceDefinition.g:1484:1: entryRuleJoiningPatternInstance returns [EObject current=null] : iv_ruleJoiningPatternInstance= ruleJoiningPatternInstance EOF ;
    public final EObject entryRuleJoiningPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoiningPatternInstance = null;


        try {
            // InternalServiceDefinition.g:1484:63: (iv_ruleJoiningPatternInstance= ruleJoiningPatternInstance EOF )
            // InternalServiceDefinition.g:1485:2: iv_ruleJoiningPatternInstance= ruleJoiningPatternInstance EOF
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
    // InternalServiceDefinition.g:1491:1: ruleJoiningPatternInstance returns [EObject current=null] : this_SendPattern_0= ruleSendPattern ;
    public final EObject ruleJoiningPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject this_SendPattern_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:1497:2: (this_SendPattern_0= ruleSendPattern )
            // InternalServiceDefinition.g:1498:2: this_SendPattern_0= ruleSendPattern
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
    // InternalServiceDefinition.g:1509:1: entryRuleRequestAnswerPattern returns [EObject current=null] : iv_ruleRequestAnswerPattern= ruleRequestAnswerPattern EOF ;
    public final EObject entryRuleRequestAnswerPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestAnswerPattern = null;


        try {
            // InternalServiceDefinition.g:1509:61: (iv_ruleRequestAnswerPattern= ruleRequestAnswerPattern EOF )
            // InternalServiceDefinition.g:1510:2: iv_ruleRequestAnswerPattern= ruleRequestAnswerPattern EOF
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
    // InternalServiceDefinition.g:1516:1: ruleRequestAnswerPattern returns [EObject current=null] : this_QueryPattern_0= ruleQueryPattern ;
    public final EObject ruleRequestAnswerPattern() throws RecognitionException {
        EObject current = null;

        EObject this_QueryPattern_0 = null;



        	enterRule();

        try {
            // InternalServiceDefinition.g:1522:2: (this_QueryPattern_0= ruleQueryPattern )
            // InternalServiceDefinition.g:1523:2: this_QueryPattern_0= ruleQueryPattern
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
    // InternalServiceDefinition.g:1534:1: entryRulePushPattern returns [EObject current=null] : iv_rulePushPattern= rulePushPattern EOF ;
    public final EObject entryRulePushPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePushPattern = null;


        try {
            // InternalServiceDefinition.g:1534:52: (iv_rulePushPattern= rulePushPattern EOF )
            // InternalServiceDefinition.g:1535:2: iv_rulePushPattern= rulePushPattern EOF
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
    // InternalServiceDefinition.g:1541:1: rulePushPattern returns [EObject current=null] : ( () otherlv_1= 'PushPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' ) ;
    public final EObject rulePushPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1547:2: ( ( () otherlv_1= 'PushPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' ) )
            // InternalServiceDefinition.g:1548:2: ( () otherlv_1= 'PushPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' )
            {
            // InternalServiceDefinition.g:1548:2: ( () otherlv_1= 'PushPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' )
            // InternalServiceDefinition.g:1549:3: () otherlv_1= 'PushPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>'
            {
            // InternalServiceDefinition.g:1549:3: ()
            // InternalServiceDefinition.g:1550:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPushPatternAccess().getPushPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getPushPatternAccess().getPushPatternKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getPushPatternAccess().getLessThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getPushPatternAccess().getDataTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getPushPatternAccess().getEqualsSignKeyword_4());
            		
            // InternalServiceDefinition.g:1572:3: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:1573:4: ( ruleFQN )
            {
            // InternalServiceDefinition.g:1573:4: ( ruleFQN )
            // InternalServiceDefinition.g:1574:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPushPatternRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPushPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0());
            				
            pushFollow(FOLLOW_26);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

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
    // InternalServiceDefinition.g:1596:1: entryRuleEventPattern returns [EObject current=null] : iv_ruleEventPattern= ruleEventPattern EOF ;
    public final EObject entryRuleEventPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventPattern = null;


        try {
            // InternalServiceDefinition.g:1596:53: (iv_ruleEventPattern= ruleEventPattern EOF )
            // InternalServiceDefinition.g:1597:2: iv_ruleEventPattern= ruleEventPattern EOF
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
    // InternalServiceDefinition.g:1603:1: ruleEventPattern returns [EObject current=null] : ( () otherlv_1= 'EventPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '>' ) ;
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
            // InternalServiceDefinition.g:1609:2: ( ( () otherlv_1= 'EventPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '>' ) )
            // InternalServiceDefinition.g:1610:2: ( () otherlv_1= 'EventPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '>' )
            {
            // InternalServiceDefinition.g:1610:2: ( () otherlv_1= 'EventPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '>' )
            // InternalServiceDefinition.g:1611:3: () otherlv_1= 'EventPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '>'
            {
            // InternalServiceDefinition.g:1611:3: ()
            // InternalServiceDefinition.g:1612:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventPatternAccess().getEventPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getEventPatternAccess().getEventPatternKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getEventPatternAccess().getLessThanSignKeyword_2());
            		
            // InternalServiceDefinition.g:1626:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) )
            // InternalServiceDefinition.g:1627:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalServiceDefinition.g:1627:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) )
            // InternalServiceDefinition.g:1628:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
            				
            // InternalServiceDefinition.g:1631:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?)
            // InternalServiceDefinition.g:1632:6: ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?
            {
            // InternalServiceDefinition.g:1632:6: ( ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=4;
                int LA23_0 = input.LA(1);

                if ( LA23_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
                    alt23=2;
                }
                else if ( LA23_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
                    alt23=3;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalServiceDefinition.g:1633:4: ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1633:4: ({...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) )
            	    // InternalServiceDefinition.g:1634:5: {...}? => ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEventPattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalServiceDefinition.g:1634:109: ( ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) )
            	    // InternalServiceDefinition.g:1635:6: ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalServiceDefinition.g:1638:9: ({...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) ) )
            	    // InternalServiceDefinition.g:1638:10: {...}? => (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventPattern", "true");
            	    }
            	    // InternalServiceDefinition.g:1638:19: (otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) ) )
            	    // InternalServiceDefinition.g:1638:20: otherlv_4= 'EventType' otherlv_5= '=' ( ( ruleFQN ) )
            	    {
            	    otherlv_4=(Token)match(input,39,FOLLOW_28); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEventPatternAccess().getEventTypeKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,37,FOLLOW_5); 

            	    									newLeafNode(otherlv_5, grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_0_1());
            	    								
            	    // InternalServiceDefinition.g:1646:9: ( ( ruleFQN ) )
            	    // InternalServiceDefinition.g:1647:10: ( ruleFQN )
            	    {
            	    // InternalServiceDefinition.g:1647:10: ( ruleFQN )
            	    // InternalServiceDefinition.g:1648:11: ruleFQN
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventPatternRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEventPatternAccess().getEventTypeCommunicationObjectCrossReference_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_30);
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
            	    // InternalServiceDefinition.g:1668:4: ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1668:4: ({...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) )
            	    // InternalServiceDefinition.g:1669:5: {...}? => ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEventPattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalServiceDefinition.g:1669:109: ( ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) )
            	    // InternalServiceDefinition.g:1670:6: ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalServiceDefinition.g:1673:9: ({...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) ) )
            	    // InternalServiceDefinition.g:1673:10: {...}? => (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventPattern", "true");
            	    }
            	    // InternalServiceDefinition.g:1673:19: (otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) ) )
            	    // InternalServiceDefinition.g:1673:20: otherlv_7= 'ActivationType' otherlv_8= '=' ( ( ruleFQN ) )
            	    {
            	    otherlv_7=(Token)match(input,40,FOLLOW_28); 

            	    									newLeafNode(otherlv_7, grammarAccess.getEventPatternAccess().getActivationTypeKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,37,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_1_1());
            	    								
            	    // InternalServiceDefinition.g:1681:9: ( ( ruleFQN ) )
            	    // InternalServiceDefinition.g:1682:10: ( ruleFQN )
            	    {
            	    // InternalServiceDefinition.g:1682:10: ( ruleFQN )
            	    // InternalServiceDefinition.g:1683:11: ruleFQN
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventPatternRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEventPatternAccess().getActivationTypeCommunicationObjectCrossReference_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_30);
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
            	    // InternalServiceDefinition.g:1703:4: ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1703:4: ({...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) ) )
            	    // InternalServiceDefinition.g:1704:5: {...}? => ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEventPattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalServiceDefinition.g:1704:109: ( ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) ) )
            	    // InternalServiceDefinition.g:1705:6: ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalServiceDefinition.g:1708:9: ({...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) ) )
            	    // InternalServiceDefinition.g:1708:10: {...}? => (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEventPattern", "true");
            	    }
            	    // InternalServiceDefinition.g:1708:19: (otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) ) )
            	    // InternalServiceDefinition.g:1708:20: otherlv_10= 'EventStateType' otherlv_11= '=' ( ( ruleFQN ) )
            	    {
            	    otherlv_10=(Token)match(input,41,FOLLOW_28); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEventPatternAccess().getEventStateTypeKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,37,FOLLOW_5); 

            	    									newLeafNode(otherlv_11, grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_2_1());
            	    								
            	    // InternalServiceDefinition.g:1716:9: ( ( ruleFQN ) )
            	    // InternalServiceDefinition.g:1717:10: ( ruleFQN )
            	    {
            	    // InternalServiceDefinition.g:1717:10: ( ruleFQN )
            	    // InternalServiceDefinition.g:1718:11: ruleFQN
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEventPatternRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEventPatternAccess().getEventStateTypeCommunicationObjectCrossReference_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_30);
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEventPatternAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleEventPattern", "getUnorderedGroupHelper().canLeave(grammarAccess.getEventPatternAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
            				

            }

            otherlv_13=(Token)match(input,31,FOLLOW_2); 

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
    // InternalServiceDefinition.g:1754:1: entryRuleQueryPattern returns [EObject current=null] : iv_ruleQueryPattern= ruleQueryPattern EOF ;
    public final EObject entryRuleQueryPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryPattern = null;


        try {
            // InternalServiceDefinition.g:1754:53: (iv_ruleQueryPattern= ruleQueryPattern EOF )
            // InternalServiceDefinition.g:1755:2: iv_ruleQueryPattern= ruleQueryPattern EOF
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
    // InternalServiceDefinition.g:1761:1: ruleQueryPattern returns [EObject current=null] : ( () otherlv_1= 'QueryPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '>' ) ;
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
            // InternalServiceDefinition.g:1767:2: ( ( () otherlv_1= 'QueryPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '>' ) )
            // InternalServiceDefinition.g:1768:2: ( () otherlv_1= 'QueryPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '>' )
            {
            // InternalServiceDefinition.g:1768:2: ( () otherlv_1= 'QueryPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '>' )
            // InternalServiceDefinition.g:1769:3: () otherlv_1= 'QueryPattern' otherlv_2= '<' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '>'
            {
            // InternalServiceDefinition.g:1769:3: ()
            // InternalServiceDefinition.g:1770:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQueryPatternAccess().getQueryPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryPatternAccess().getQueryPatternKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getQueryPatternAccess().getLessThanSignKeyword_2());
            		
            // InternalServiceDefinition.g:1784:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) ) )
            // InternalServiceDefinition.g:1785:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalServiceDefinition.g:1785:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?) )
            // InternalServiceDefinition.g:1786:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
            				
            // InternalServiceDefinition.g:1789:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?)
            // InternalServiceDefinition.g:1790:6: ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+ {...}?
            {
            // InternalServiceDefinition.g:1790:6: ( ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalServiceDefinition.g:1791:4: ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1791:4: ({...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) ) )
            	    // InternalServiceDefinition.g:1792:5: {...}? => ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQueryPattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalServiceDefinition.g:1792:109: ( ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) ) )
            	    // InternalServiceDefinition.g:1793:6: ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalServiceDefinition.g:1796:9: ({...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) ) )
            	    // InternalServiceDefinition.g:1796:10: {...}? => (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQueryPattern", "true");
            	    }
            	    // InternalServiceDefinition.g:1796:19: (otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) ) )
            	    // InternalServiceDefinition.g:1796:20: otherlv_4= 'RequestType' otherlv_5= '=' ( ( ruleFQN ) )
            	    {
            	    otherlv_4=(Token)match(input,43,FOLLOW_28); 

            	    									newLeafNode(otherlv_4, grammarAccess.getQueryPatternAccess().getRequestTypeKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,37,FOLLOW_5); 

            	    									newLeafNode(otherlv_5, grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_0_1());
            	    								
            	    // InternalServiceDefinition.g:1804:9: ( ( ruleFQN ) )
            	    // InternalServiceDefinition.g:1805:10: ( ruleFQN )
            	    {
            	    // InternalServiceDefinition.g:1805:10: ( ruleFQN )
            	    // InternalServiceDefinition.g:1806:11: ruleFQN
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getQueryPatternRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getQueryPatternAccess().getRequestTypeCommunicationObjectCrossReference_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_32);
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
            	    // InternalServiceDefinition.g:1826:4: ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) )
            	    {
            	    // InternalServiceDefinition.g:1826:4: ({...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) ) )
            	    // InternalServiceDefinition.g:1827:5: {...}? => ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQueryPattern", "getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalServiceDefinition.g:1827:109: ( ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) ) )
            	    // InternalServiceDefinition.g:1828:6: ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalServiceDefinition.g:1831:9: ({...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) ) )
            	    // InternalServiceDefinition.g:1831:10: {...}? => (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQueryPattern", "true");
            	    }
            	    // InternalServiceDefinition.g:1831:19: (otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) ) )
            	    // InternalServiceDefinition.g:1831:20: otherlv_7= 'AnswerType' otherlv_8= '=' ( ( ruleFQN ) )
            	    {
            	    otherlv_7=(Token)match(input,44,FOLLOW_28); 

            	    									newLeafNode(otherlv_7, grammarAccess.getQueryPatternAccess().getAnswerTypeKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,37,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_1_1());
            	    								
            	    // InternalServiceDefinition.g:1839:9: ( ( ruleFQN ) )
            	    // InternalServiceDefinition.g:1840:10: ( ruleFQN )
            	    {
            	    // InternalServiceDefinition.g:1840:10: ( ruleFQN )
            	    // InternalServiceDefinition.g:1841:11: ruleFQN
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getQueryPatternRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getQueryPatternAccess().getAnswerTypeCommunicationObjectCrossReference_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_32);
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleQueryPattern", "getUnorderedGroupHelper().canLeave(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
            				

            }

            otherlv_10=(Token)match(input,31,FOLLOW_2); 

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
    // InternalServiceDefinition.g:1877:1: entryRuleSendPattern returns [EObject current=null] : iv_ruleSendPattern= ruleSendPattern EOF ;
    public final EObject entryRuleSendPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendPattern = null;


        try {
            // InternalServiceDefinition.g:1877:52: (iv_ruleSendPattern= ruleSendPattern EOF )
            // InternalServiceDefinition.g:1878:2: iv_ruleSendPattern= ruleSendPattern EOF
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
    // InternalServiceDefinition.g:1884:1: ruleSendPattern returns [EObject current=null] : ( () otherlv_1= 'SendPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' ) ;
    public final EObject ruleSendPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1890:2: ( ( () otherlv_1= 'SendPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' ) )
            // InternalServiceDefinition.g:1891:2: ( () otherlv_1= 'SendPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' )
            {
            // InternalServiceDefinition.g:1891:2: ( () otherlv_1= 'SendPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>' )
            // InternalServiceDefinition.g:1892:3: () otherlv_1= 'SendPattern' otherlv_2= '<' otherlv_3= 'DataType' otherlv_4= '=' ( ( ruleFQN ) ) otherlv_6= '>'
            {
            // InternalServiceDefinition.g:1892:3: ()
            // InternalServiceDefinition.g:1893:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSendPatternAccess().getSendPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getSendPatternAccess().getSendPatternKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getSendPatternAccess().getLessThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getSendPatternAccess().getDataTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSendPatternAccess().getEqualsSignKeyword_4());
            		
            // InternalServiceDefinition.g:1915:3: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:1916:4: ( ruleFQN )
            {
            // InternalServiceDefinition.g:1916:4: ( ruleFQN )
            // InternalServiceDefinition.g:1917:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendPatternRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSendPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0());
            				
            pushFollow(FOLLOW_26);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

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
    // InternalServiceDefinition.g:1939:1: entryRuleServiceProperty returns [EObject current=null] : iv_ruleServiceProperty= ruleServiceProperty EOF ;
    public final EObject entryRuleServiceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProperty = null;


        try {
            // InternalServiceDefinition.g:1939:56: (iv_ruleServiceProperty= ruleServiceProperty EOF )
            // InternalServiceDefinition.g:1940:2: iv_ruleServiceProperty= ruleServiceProperty EOF
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
    // InternalServiceDefinition.g:1946:1: ruleServiceProperty returns [EObject current=null] : (otherlv_0= 'ServiceProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleServiceProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalServiceDefinition.g:1952:2: ( (otherlv_0= 'ServiceProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalServiceDefinition.g:1953:2: (otherlv_0= 'ServiceProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalServiceDefinition.g:1953:2: (otherlv_0= 'ServiceProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalServiceDefinition.g:1954:3: otherlv_0= 'ServiceProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getServicePropertyAccess().getServicePropertyKeyword_0());
            		
            // InternalServiceDefinition.g:1958:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalServiceDefinition.g:1959:4: (lv_name_1_0= RULE_ID )
            {
            // InternalServiceDefinition.g:1959:4: (lv_name_1_0= RULE_ID )
            // InternalServiceDefinition.g:1960:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getServicePropertyAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000044002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001D20000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000220000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000040070A220000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400002020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000038080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000180080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000020000L});

}
