package org.xtext.service.parameterDefinition.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.service.parameterDefinition.services.ParameterDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalParameterDefinitionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCU_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_WS", "RULE_ANY_OTHER", "'.*'", "'#import'", "';'", "'ParameterSetRepository'", "'{'", "'}'", "'ParameterSet'", "'extends'", "','", "'Parameter'", "'Trigger'", "':'", "'='", "'.'", "'true'", "'false'", "'-'", "'E'", "'e'", "'InlineEnumeration'", "'['", "']'", "'*'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'"
    };
    public static final int RULE_ML_DOCUMENTATION=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int RULE_DOCU_COMMENT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_SL_DOCUMENTATION=11;
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


        public InternalParameterDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalParameterDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalParameterDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalParameterDefinition.g"; }



     	private ParameterDefinitionGrammarAccess grammarAccess;

        public InternalParameterDefinitionParser(TokenStream input, ParameterDefinitionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ParamDefModel";
       	}

       	@Override
       	protected ParameterDefinitionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleParamDefModel"
    // InternalParameterDefinition.g:80:1: entryRuleParamDefModel returns [EObject current=null] : iv_ruleParamDefModel= ruleParamDefModel EOF ;
    public final EObject entryRuleParamDefModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamDefModel = null;


        try {
            // InternalParameterDefinition.g:80:54: (iv_ruleParamDefModel= ruleParamDefModel EOF )
            // InternalParameterDefinition.g:81:2: iv_ruleParamDefModel= ruleParamDefModel EOF
            {
             newCompositeNode(grammarAccess.getParamDefModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamDefModel=ruleParamDefModel();

            state._fsp--;

             current =iv_ruleParamDefModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamDefModel"


    // $ANTLR start "ruleParamDefModel"
    // InternalParameterDefinition.g:87:1: ruleParamDefModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_repository_2_0= ruleParameterSetRepository ) )? ) ;
    public final EObject ruleParamDefModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_repository_2_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:93:2: ( ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_repository_2_0= ruleParameterSetRepository ) )? ) )
            // InternalParameterDefinition.g:94:2: ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_repository_2_0= ruleParameterSetRepository ) )? )
            {
            // InternalParameterDefinition.g:94:2: ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_repository_2_0= ruleParameterSetRepository ) )? )
            // InternalParameterDefinition.g:95:3: () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_repository_2_0= ruleParameterSetRepository ) )?
            {
            // InternalParameterDefinition.g:95:3: ()
            // InternalParameterDefinition.g:96:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParamDefModelAccess().getParamDefModelAction_0(),
            					current);
            			

            }

            // InternalParameterDefinition.g:102:3: ( (lv_imports_1_0= ruleParamDefRepoImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalParameterDefinition.g:103:4: (lv_imports_1_0= ruleParamDefRepoImport )
            	    {
            	    // InternalParameterDefinition.g:103:4: (lv_imports_1_0= ruleParamDefRepoImport )
            	    // InternalParameterDefinition.g:104:5: lv_imports_1_0= ruleParamDefRepoImport
            	    {

            	    					newCompositeNode(grammarAccess.getParamDefModelAccess().getImportsParamDefRepoImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleParamDefRepoImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParamDefModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"org.xtext.service.parameterDefinition.ParameterDefinition.ParamDefRepoImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalParameterDefinition.g:121:3: ( (lv_repository_2_0= ruleParameterSetRepository ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOCU_COMMENT||LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalParameterDefinition.g:122:4: (lv_repository_2_0= ruleParameterSetRepository )
                    {
                    // InternalParameterDefinition.g:122:4: (lv_repository_2_0= ruleParameterSetRepository )
                    // InternalParameterDefinition.g:123:5: lv_repository_2_0= ruleParameterSetRepository
                    {

                    					newCompositeNode(grammarAccess.getParamDefModelAccess().getRepositoryParameterSetRepositoryParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repository_2_0=ruleParameterSetRepository();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParamDefModelRule());
                    					}
                    					set(
                    						current,
                    						"repository",
                    						lv_repository_2_0,
                    						"org.xtext.service.parameterDefinition.ParameterDefinition.ParameterSetRepository");
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
    // $ANTLR end "ruleParamDefModel"


    // $ANTLR start "entryRuleFQNW"
    // InternalParameterDefinition.g:144:1: entryRuleFQNW returns [String current=null] : iv_ruleFQNW= ruleFQNW EOF ;
    public final String entryRuleFQNW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNW = null;


        try {
            // InternalParameterDefinition.g:144:44: (iv_ruleFQNW= ruleFQNW EOF )
            // InternalParameterDefinition.g:145:2: iv_ruleFQNW= ruleFQNW EOF
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
    // InternalParameterDefinition.g:151:1: ruleFQNW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFQNW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:157:2: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // InternalParameterDefinition.g:158:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // InternalParameterDefinition.g:158:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // InternalParameterDefinition.g:159:3: this_FQN_0= ruleFQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalParameterDefinition.g:169:3: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalParameterDefinition.g:170:4: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParamDefRepoImport"
    // InternalParameterDefinition.g:180:1: entryRuleParamDefRepoImport returns [EObject current=null] : iv_ruleParamDefRepoImport= ruleParamDefRepoImport EOF ;
    public final EObject entryRuleParamDefRepoImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamDefRepoImport = null;


        try {
            // InternalParameterDefinition.g:180:59: (iv_ruleParamDefRepoImport= ruleParamDefRepoImport EOF )
            // InternalParameterDefinition.g:181:2: iv_ruleParamDefRepoImport= ruleParamDefRepoImport EOF
            {
             newCompositeNode(grammarAccess.getParamDefRepoImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamDefRepoImport=ruleParamDefRepoImport();

            state._fsp--;

             current =iv_ruleParamDefRepoImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamDefRepoImport"


    // $ANTLR start "ruleParamDefRepoImport"
    // InternalParameterDefinition.g:187:1: ruleParamDefRepoImport returns [EObject current=null] : (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleParamDefRepoImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:193:2: ( (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) )
            // InternalParameterDefinition.g:194:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            {
            // InternalParameterDefinition.g:194:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            // InternalParameterDefinition.g:195:3: otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParamDefRepoImportAccess().getImportKeyword_0());
            		
            // InternalParameterDefinition.g:199:3: ( (lv_importedNamespace_1_0= ruleFQNW ) )
            // InternalParameterDefinition.g:200:4: (lv_importedNamespace_1_0= ruleFQNW )
            {
            // InternalParameterDefinition.g:200:4: (lv_importedNamespace_1_0= ruleFQNW )
            // InternalParameterDefinition.g:201:5: lv_importedNamespace_1_0= ruleFQNW
            {

            					newCompositeNode(grammarAccess.getParamDefRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_importedNamespace_1_0=ruleFQNW();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamDefRepoImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.xtext.service.parameterDefinition.ParameterDefinition.FQNW");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalParameterDefinition.g:218:3: (otherlv_2= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalParameterDefinition.g:219:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getParamDefRepoImportAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleParamDefRepoImport"


    // $ANTLR start "entryRuleParameterSetRepository"
    // InternalParameterDefinition.g:228:1: entryRuleParameterSetRepository returns [EObject current=null] : iv_ruleParameterSetRepository= ruleParameterSetRepository EOF ;
    public final EObject entryRuleParameterSetRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetRepository = null;


        try {
            // InternalParameterDefinition.g:228:63: (iv_ruleParameterSetRepository= ruleParameterSetRepository EOF )
            // InternalParameterDefinition.g:229:2: iv_ruleParameterSetRepository= ruleParameterSetRepository EOF
            {
             newCompositeNode(grammarAccess.getParameterSetRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterSetRepository=ruleParameterSetRepository();

            state._fsp--;

             current =iv_ruleParameterSetRepository; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterSetRepository"


    // $ANTLR start "ruleParameterSetRepository"
    // InternalParameterDefinition.g:235:1: ruleParameterSetRepository returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sets_4_0= ruleParameterSetDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterSetRepository() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_sets_4_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:241:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sets_4_0= ruleParameterSetDefinition ) )* otherlv_5= '}' ) )
            // InternalParameterDefinition.g:242:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sets_4_0= ruleParameterSetDefinition ) )* otherlv_5= '}' )
            {
            // InternalParameterDefinition.g:242:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sets_4_0= ruleParameterSetDefinition ) )* otherlv_5= '}' )
            // InternalParameterDefinition.g:243:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSetRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_sets_4_0= ruleParameterSetDefinition ) )* otherlv_5= '}'
            {
            // InternalParameterDefinition.g:243:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DOCU_COMMENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalParameterDefinition.g:244:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalParameterDefinition.g:244:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalParameterDefinition.g:245:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_7); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getParameterSetRepositoryAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterSetRepositoryRule());
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

            			newLeafNode(otherlv_1, grammarAccess.getParameterSetRepositoryAccess().getParameterSetRepositoryKeyword_1());
            		
            // InternalParameterDefinition.g:265:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalParameterDefinition.g:266:4: (lv_name_2_0= RULE_ID )
            {
            // InternalParameterDefinition.g:266:4: (lv_name_2_0= RULE_ID )
            // InternalParameterDefinition.g:267:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getParameterSetRepositoryAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterSetRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterSetRepositoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalParameterDefinition.g:287:3: ( (lv_sets_4_0= ruleParameterSetDefinition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_DOCU_COMMENT||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalParameterDefinition.g:288:4: (lv_sets_4_0= ruleParameterSetDefinition )
            	    {
            	    // InternalParameterDefinition.g:288:4: (lv_sets_4_0= ruleParameterSetDefinition )
            	    // InternalParameterDefinition.g:289:5: lv_sets_4_0= ruleParameterSetDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getParameterSetRepositoryAccess().getSetsParameterSetDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_sets_4_0=ruleParameterSetDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterSetRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sets",
            	    						lv_sets_4_0,
            	    						"org.xtext.service.parameterDefinition.ParameterDefinition.ParameterSetDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterSetRepositoryAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterSetRepository"


    // $ANTLR start "entryRuleParameterSetDefinition"
    // InternalParameterDefinition.g:314:1: entryRuleParameterSetDefinition returns [EObject current=null] : iv_ruleParameterSetDefinition= ruleParameterSetDefinition EOF ;
    public final EObject entryRuleParameterSetDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetDefinition = null;


        try {
            // InternalParameterDefinition.g:314:63: (iv_ruleParameterSetDefinition= ruleParameterSetDefinition EOF )
            // InternalParameterDefinition.g:315:2: iv_ruleParameterSetDefinition= ruleParameterSetDefinition EOF
            {
             newCompositeNode(grammarAccess.getParameterSetDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterSetDefinition=ruleParameterSetDefinition();

            state._fsp--;

             current =iv_ruleParameterSetDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterSetDefinition"


    // $ANTLR start "ruleParameterSetDefinition"
    // InternalParameterDefinition.g:321:1: ruleParameterSetDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSet' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? otherlv_7= '{' ( (lv_parameters_8_0= ruleAbstractParameter ) )* otherlv_9= '}' ) ;
    public final EObject ruleParameterSetDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_8_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:327:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSet' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? otherlv_7= '{' ( (lv_parameters_8_0= ruleAbstractParameter ) )* otherlv_9= '}' ) )
            // InternalParameterDefinition.g:328:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSet' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? otherlv_7= '{' ( (lv_parameters_8_0= ruleAbstractParameter ) )* otherlv_9= '}' )
            {
            // InternalParameterDefinition.g:328:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSet' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? otherlv_7= '{' ( (lv_parameters_8_0= ruleAbstractParameter ) )* otherlv_9= '}' )
            // InternalParameterDefinition.g:329:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'ParameterSet' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? otherlv_7= '{' ( (lv_parameters_8_0= ruleAbstractParameter ) )* otherlv_9= '}'
            {
            // InternalParameterDefinition.g:329:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DOCU_COMMENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalParameterDefinition.g:330:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalParameterDefinition.g:330:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalParameterDefinition.g:331:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_10); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getParameterSetDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterSetDefinitionRule());
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

            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterSetDefinitionAccess().getParameterSetKeyword_1());
            		
            // InternalParameterDefinition.g:351:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalParameterDefinition.g:352:4: (lv_name_2_0= RULE_ID )
            {
            // InternalParameterDefinition.g:352:4: (lv_name_2_0= RULE_ID )
            // InternalParameterDefinition.g:353:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getParameterSetDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterSetDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalParameterDefinition.g:369:3: (otherlv_3= 'extends' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalParameterDefinition.g:370:4: otherlv_3= 'extends' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterSetDefinitionAccess().getExtendsKeyword_3_0());
                    			
                    // InternalParameterDefinition.g:374:4: ( ( ruleFQN ) )
                    // InternalParameterDefinition.g:375:5: ( ruleFQN )
                    {
                    // InternalParameterDefinition.g:375:5: ( ruleFQN )
                    // InternalParameterDefinition.g:376:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterSetDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalParameterDefinition.g:390:4: (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==22) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalParameterDefinition.g:391:5: otherlv_5= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getParameterSetDefinitionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalParameterDefinition.g:395:5: ( ( ruleFQN ) )
                    	    // InternalParameterDefinition.g:396:6: ( ruleFQN )
                    	    {
                    	    // InternalParameterDefinition.g:396:6: ( ruleFQN )
                    	    // InternalParameterDefinition.g:397:7: ruleFQN
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParameterSetDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleFQN();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getParameterSetDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalParameterDefinition.g:417:3: ( (lv_parameters_8_0= ruleAbstractParameter ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DOCU_COMMENT||(LA10_0>=23 && LA10_0<=24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalParameterDefinition.g:418:4: (lv_parameters_8_0= ruleAbstractParameter )
            	    {
            	    // InternalParameterDefinition.g:418:4: (lv_parameters_8_0= ruleAbstractParameter )
            	    // InternalParameterDefinition.g:419:5: lv_parameters_8_0= ruleAbstractParameter
            	    {

            	    					newCompositeNode(grammarAccess.getParameterSetDefinitionAccess().getParametersAbstractParameterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_parameters_8_0=ruleAbstractParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterSetDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_8_0,
            	    						"org.xtext.service.parameterDefinition.ParameterDefinition.AbstractParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getParameterSetDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterSetDefinition"


    // $ANTLR start "entryRuleAbstractParameter"
    // InternalParameterDefinition.g:444:1: entryRuleAbstractParameter returns [EObject current=null] : iv_ruleAbstractParameter= ruleAbstractParameter EOF ;
    public final EObject entryRuleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameter = null;


        try {
            // InternalParameterDefinition.g:444:58: (iv_ruleAbstractParameter= ruleAbstractParameter EOF )
            // InternalParameterDefinition.g:445:2: iv_ruleAbstractParameter= ruleAbstractParameter EOF
            {
             newCompositeNode(grammarAccess.getAbstractParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractParameter=ruleAbstractParameter();

            state._fsp--;

             current =iv_ruleAbstractParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractParameter"


    // $ANTLR start "ruleAbstractParameter"
    // InternalParameterDefinition.g:451:1: ruleAbstractParameter returns [EObject current=null] : (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition ) ;
    public final EObject ruleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterDefinition_0 = null;

        EObject this_TriggerDefinition_1 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:457:2: ( (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition ) )
            // InternalParameterDefinition.g:458:2: (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition )
            {
            // InternalParameterDefinition.g:458:2: (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition )
            int alt11=2;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==24) ) {
                    alt11=2;
                }
                else if ( (LA11_1==23) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
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
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalParameterDefinition.g:459:3: this_ParameterDefinition_0= ruleParameterDefinition
                    {

                    			newCompositeNode(grammarAccess.getAbstractParameterAccess().getParameterDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDefinition_0=ruleParameterDefinition();

                    state._fsp--;


                    			current = this_ParameterDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:468:3: this_TriggerDefinition_1= ruleTriggerDefinition
                    {

                    			newCompositeNode(grammarAccess.getAbstractParameterAccess().getTriggerDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TriggerDefinition_1=ruleTriggerDefinition();

                    state._fsp--;


                    			current = this_TriggerDefinition_1;
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
    // $ANTLR end "ruleAbstractParameter"


    // $ANTLR start "entryRuleParameterDefinition"
    // InternalParameterDefinition.g:480:1: entryRuleParameterDefinition returns [EObject current=null] : iv_ruleParameterDefinition= ruleParameterDefinition EOF ;
    public final EObject entryRuleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDefinition = null;


        try {
            // InternalParameterDefinition.g:480:60: (iv_ruleParameterDefinition= ruleParameterDefinition EOF )
            // InternalParameterDefinition.g:481:2: iv_ruleParameterDefinition= ruleParameterDefinition EOF
            {
             newCompositeNode(grammarAccess.getParameterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDefinition=ruleParameterDefinition();

            state._fsp--;

             current =iv_ruleParameterDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDefinition"


    // $ANTLR start "ruleParameterDefinition"
    // InternalParameterDefinition.g:487:1: ruleParameterDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:493:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' ) )
            // InternalParameterDefinition.g:494:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' )
            {
            // InternalParameterDefinition.g:494:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' )
            // InternalParameterDefinition.g:495:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Parameter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}'
            {
            // InternalParameterDefinition.g:495:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DOCU_COMMENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalParameterDefinition.g:496:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalParameterDefinition.g:496:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalParameterDefinition.g:497:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_14); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getParameterDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterDefinitionRule());
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

            			newLeafNode(otherlv_1, grammarAccess.getParameterDefinitionAccess().getParameterKeyword_1());
            		
            // InternalParameterDefinition.g:517:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalParameterDefinition.g:518:4: (lv_name_2_0= RULE_ID )
            {
            // InternalParameterDefinition.g:518:4: (lv_name_2_0= RULE_ID )
            // InternalParameterDefinition.g:519:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getParameterDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalParameterDefinition.g:539:3: ( (lv_attributes_4_0= ruleAttributeDefinition ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_DOCU_COMMENT && LA13_0<=RULE_ID)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalParameterDefinition.g:540:4: (lv_attributes_4_0= ruleAttributeDefinition )
            	    {
            	    // InternalParameterDefinition.g:540:4: (lv_attributes_4_0= ruleAttributeDefinition )
            	    // InternalParameterDefinition.g:541:5: lv_attributes_4_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getParameterDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_attributes_4_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_4_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDefinition"


    // $ANTLR start "entryRuleTriggerDefinition"
    // InternalParameterDefinition.g:566:1: entryRuleTriggerDefinition returns [EObject current=null] : iv_ruleTriggerDefinition= ruleTriggerDefinition EOF ;
    public final EObject entryRuleTriggerDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerDefinition = null;


        try {
            // InternalParameterDefinition.g:566:58: (iv_ruleTriggerDefinition= ruleTriggerDefinition EOF )
            // InternalParameterDefinition.g:567:2: iv_ruleTriggerDefinition= ruleTriggerDefinition EOF
            {
             newCompositeNode(grammarAccess.getTriggerDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggerDefinition=ruleTriggerDefinition();

            state._fsp--;

             current =iv_ruleTriggerDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerDefinition"


    // $ANTLR start "ruleTriggerDefinition"
    // InternalParameterDefinition.g:573:1: ruleTriggerDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Trigger' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleTriggerDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:579:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Trigger' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' ) )
            // InternalParameterDefinition.g:580:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Trigger' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' )
            {
            // InternalParameterDefinition.g:580:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Trigger' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' )
            // InternalParameterDefinition.g:581:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Trigger' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}'
            {
            // InternalParameterDefinition.g:581:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DOCU_COMMENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalParameterDefinition.g:582:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalParameterDefinition.g:582:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalParameterDefinition.g:583:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_16); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getTriggerDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTriggerDefinitionRule());
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

            			newLeafNode(otherlv_1, grammarAccess.getTriggerDefinitionAccess().getTriggerKeyword_1());
            		
            // InternalParameterDefinition.g:603:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalParameterDefinition.g:604:4: (lv_name_2_0= RULE_ID )
            {
            // InternalParameterDefinition.g:604:4: (lv_name_2_0= RULE_ID )
            // InternalParameterDefinition.g:605:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTriggerDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getTriggerDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalParameterDefinition.g:625:3: ( (lv_attributes_4_0= ruleAttributeDefinition ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_DOCU_COMMENT && LA15_0<=RULE_ID)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalParameterDefinition.g:626:4: (lv_attributes_4_0= ruleAttributeDefinition )
            	    {
            	    // InternalParameterDefinition.g:626:4: (lv_attributes_4_0= ruleAttributeDefinition )
            	    // InternalParameterDefinition.g:627:5: lv_attributes_4_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getTriggerDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_attributes_4_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTriggerDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_4_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTriggerDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggerDefinition"


    // $ANTLR start "entryRuleAttributeDefinition"
    // InternalParameterDefinition.g:652:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalParameterDefinition.g:652:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalParameterDefinition.g:653:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
             newCompositeNode(grammarAccess.getAttributeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();

            state._fsp--;

             current =iv_ruleAttributeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeDefinition"


    // $ANTLR start "ruleAttributeDefinition"
    // InternalParameterDefinition.g:659:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_defaultvalue_5_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:665:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? ) )
            // InternalParameterDefinition.g:666:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? )
            {
            // InternalParameterDefinition.g:666:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? )
            // InternalParameterDefinition.g:667:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )?
            {
            // InternalParameterDefinition.g:667:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DOCU_COMMENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalParameterDefinition.g:668:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalParameterDefinition.g:668:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalParameterDefinition.g:669:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_5); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getAttributeDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeDefinitionRule());
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

            // InternalParameterDefinition.g:685:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalParameterDefinition.g:686:4: (lv_name_1_0= RULE_ID )
            {
            // InternalParameterDefinition.g:686:4: (lv_name_1_0= RULE_ID )
            // InternalParameterDefinition.g:687:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2());
            		
            // InternalParameterDefinition.g:707:3: ( (lv_type_3_0= ruleAbstractAttributeType ) )
            // InternalParameterDefinition.g:708:4: (lv_type_3_0= ruleAbstractAttributeType )
            {
            // InternalParameterDefinition.g:708:4: (lv_type_3_0= ruleAbstractAttributeType )
            // InternalParameterDefinition.g:709:5: lv_type_3_0= ruleAbstractAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_3_0=ruleAbstractAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.AbstractAttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalParameterDefinition.g:726:3: (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalParameterDefinition.g:727:4: otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalParameterDefinition.g:731:4: ( (lv_defaultvalue_5_0= ruleAbstractValue ) )
                    // InternalParameterDefinition.g:732:5: (lv_defaultvalue_5_0= ruleAbstractValue )
                    {
                    // InternalParameterDefinition.g:732:5: (lv_defaultvalue_5_0= ruleAbstractValue )
                    // InternalParameterDefinition.g:733:6: lv_defaultvalue_5_0= ruleAbstractValue
                    {

                    						newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_defaultvalue_5_0=ruleAbstractValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"defaultvalue",
                    							lv_defaultvalue_5_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.AbstractValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalParameterDefinition.g:751:3: (otherlv_6= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalParameterDefinition.g:752:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5());
                    			

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
    // $ANTLR end "ruleAttributeDefinition"


    // $ANTLR start "entryRuleFQN"
    // InternalParameterDefinition.g:761:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalParameterDefinition.g:761:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalParameterDefinition.g:762:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalParameterDefinition.g:768:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalParameterDefinition.g:774:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalParameterDefinition.g:775:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalParameterDefinition.g:775:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalParameterDefinition.g:776:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalParameterDefinition.g:783:3: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalParameterDefinition.g:784:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalParameterDefinition.g:801:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalParameterDefinition.g:801:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalParameterDefinition.g:802:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalParameterDefinition.g:808:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalParameterDefinition.g:814:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalParameterDefinition.g:815:2: (kw= 'true' | kw= 'false' )
            {
            // InternalParameterDefinition.g:815:2: (kw= 'true' | kw= 'false' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            else if ( (LA20_0==29) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalParameterDefinition.g:816:3: kw= 'true'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:822:3: kw= 'false'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalParameterDefinition.g:831:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalParameterDefinition.g:831:47: (iv_ruleEString= ruleEString EOF )
            // InternalParameterDefinition.g:832:2: iv_ruleEString= ruleEString EOF
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
    // InternalParameterDefinition.g:838:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalParameterDefinition.g:844:2: (this_STRING_0= RULE_STRING )
            // InternalParameterDefinition.g:845:2: this_STRING_0= RULE_STRING
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
    // InternalParameterDefinition.g:855:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalParameterDefinition.g:855:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalParameterDefinition.g:856:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalParameterDefinition.g:862:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalParameterDefinition.g:868:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalParameterDefinition.g:869:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalParameterDefinition.g:869:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalParameterDefinition.g:870:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalParameterDefinition.g:870:3: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalParameterDefinition.g:871:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_22); 

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
    // InternalParameterDefinition.g:888:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalParameterDefinition.g:888:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalParameterDefinition.g:889:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalParameterDefinition.g:895:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalParameterDefinition.g:901:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalParameterDefinition.g:902:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalParameterDefinition.g:902:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalParameterDefinition.g:903:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalParameterDefinition.g:903:3: (kw= '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalParameterDefinition.g:904:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalParameterDefinition.g:910:3: (this_INT_1= RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalParameterDefinition.g:911:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,27,FOLLOW_22); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_25); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalParameterDefinition.g:931:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=31 && LA26_0<=32)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalParameterDefinition.g:932:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalParameterDefinition.g:932:4: (kw= 'E' | kw= 'e' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==31) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==32) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalParameterDefinition.g:933:5: kw= 'E'
                            {
                            kw=(Token)match(input,31,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalParameterDefinition.g:939:5: kw= 'e'
                            {
                            kw=(Token)match(input,32,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalParameterDefinition.g:945:4: (kw= '-' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==30) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalParameterDefinition.g:946:5: kw= '-'
                            {
                            kw=(Token)match(input,30,FOLLOW_22); 

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


    // $ANTLR start "entryRuleEnumerationElement"
    // InternalParameterDefinition.g:964:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalParameterDefinition.g:964:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalParameterDefinition.g:965:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
            {
             newCompositeNode(grammarAccess.getEnumerationElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationElement=ruleEnumerationElement();

            state._fsp--;

             current =iv_ruleEnumerationElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationElement"


    // $ANTLR start "ruleEnumerationElement"
    // InternalParameterDefinition.g:971:1: ruleEnumerationElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:977:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) )
            // InternalParameterDefinition.g:978:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            {
            // InternalParameterDefinition.g:978:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            // InternalParameterDefinition.g:979:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )?
            {
            // InternalParameterDefinition.g:979:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalParameterDefinition.g:980:4: (lv_name_0_0= RULE_ID )
            {
            // InternalParameterDefinition.g:980:4: (lv_name_0_0= RULE_ID )
            // InternalParameterDefinition.g:981:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEnumerationElementAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalParameterDefinition.g:997:3: (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalParameterDefinition.g:998:4: otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalParameterDefinition.g:1002:4: ( (lv_value_2_0= ruleEInt ) )
                    // InternalParameterDefinition.g:1003:5: (lv_value_2_0= ruleEInt )
                    {
                    // InternalParameterDefinition.g:1003:5: (lv_value_2_0= ruleEInt )
                    // InternalParameterDefinition.g:1004:6: lv_value_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEnumerationElementAccess().getValueEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_value_2_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationElementRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalParameterDefinition.g:1022:3: (otherlv_3= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==16) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalParameterDefinition.g:1023:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleEnumerationElement"


    // $ANTLR start "entryRuleAbstractAttributeType"
    // InternalParameterDefinition.g:1032:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // InternalParameterDefinition.g:1032:62: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // InternalParameterDefinition.g:1033:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAbstractAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractAttributeType=ruleAbstractAttributeType();

            state._fsp--;

             current =iv_ruleAbstractAttributeType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractAttributeType"


    // $ANTLR start "ruleAbstractAttributeType"
    // InternalParameterDefinition.g:1039:1: ruleAbstractAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_InlineEnumerationType_1 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:1045:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) )
            // InternalParameterDefinition.g:1046:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            {
            // InternalParameterDefinition.g:1046:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=37 && LA29_0<=48)) ) {
                alt29=1;
            }
            else if ( (LA29_0==33) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalParameterDefinition.g:1047:3: this_PrimitiveType_0= rulePrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;


                    			current = this_PrimitiveType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:1056:3: this_InlineEnumerationType_1= ruleInlineEnumerationType
                    {

                    			newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getInlineEnumerationTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InlineEnumerationType_1=ruleInlineEnumerationType();

                    state._fsp--;


                    			current = this_InlineEnumerationType_1;
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
    // $ANTLR end "ruleAbstractAttributeType"


    // $ANTLR start "entryRuleInlineEnumerationType"
    // InternalParameterDefinition.g:1068:1: entryRuleInlineEnumerationType returns [EObject current=null] : iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF ;
    public final EObject entryRuleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineEnumerationType = null;


        try {
            // InternalParameterDefinition.g:1068:62: (iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF )
            // InternalParameterDefinition.g:1069:2: iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF
            {
             newCompositeNode(grammarAccess.getInlineEnumerationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInlineEnumerationType=ruleInlineEnumerationType();

            state._fsp--;

             current =iv_ruleInlineEnumerationType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInlineEnumerationType"


    // $ANTLR start "ruleInlineEnumerationType"
    // InternalParameterDefinition.g:1075:1: ruleInlineEnumerationType returns [EObject current=null] : (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_array_1_0 = null;

        EObject lv_enums_3_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:1081:2: ( (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) )
            // InternalParameterDefinition.g:1082:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            {
            // InternalParameterDefinition.g:1082:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            // InternalParameterDefinition.g:1083:3: otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0());
            		
            // InternalParameterDefinition.g:1087:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalParameterDefinition.g:1088:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalParameterDefinition.g:1088:4: (lv_array_1_0= ruleArrayType )
                    // InternalParameterDefinition.g:1089:5: lv_array_1_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getArrayArrayTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_array_1_0=ruleArrayType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInlineEnumerationTypeRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_1_0,
                    						"org.xtext.base.basicAttributes.BasicAttributes.ArrayType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalParameterDefinition.g:1110:3: ( (lv_enums_3_0= ruleEnumerationElement ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalParameterDefinition.g:1111:4: (lv_enums_3_0= ruleEnumerationElement )
            	    {
            	    // InternalParameterDefinition.g:1111:4: (lv_enums_3_0= ruleEnumerationElement )
            	    // InternalParameterDefinition.g:1112:5: lv_enums_3_0= ruleEnumerationElement
            	    {

            	    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_enums_3_0=ruleEnumerationElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInlineEnumerationTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"enums",
            	    						lv_enums_3_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.EnumerationElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInlineEnumerationType"


    // $ANTLR start "entryRuleArrayType"
    // InternalParameterDefinition.g:1137:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalParameterDefinition.g:1137:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalParameterDefinition.g:1138:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalParameterDefinition.g:1144:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:1150:2: ( ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) )
            // InternalParameterDefinition.g:1151:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            {
            // InternalParameterDefinition.g:1151:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            // InternalParameterDefinition.g:1152:3: () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']'
            {
            // InternalParameterDefinition.g:1152:3: ()
            // InternalParameterDefinition.g:1153:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalParameterDefinition.g:1163:3: ( (lv_length_2_0= ruleCardinality ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT||LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalParameterDefinition.g:1164:4: (lv_length_2_0= ruleCardinality )
                    {
                    // InternalParameterDefinition.g:1164:4: (lv_length_2_0= ruleCardinality )
                    // InternalParameterDefinition.g:1165:5: lv_length_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_length_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    					}
                    					set(
                    						current,
                    						"length",
                    						lv_length_2_0,
                    						"org.xtext.base.basicAttributes.BasicAttributes.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleCardinality"
    // InternalParameterDefinition.g:1190:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalParameterDefinition.g:1190:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalParameterDefinition.g:1191:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalParameterDefinition.g:1197:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalParameterDefinition.g:1203:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalParameterDefinition.g:1204:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalParameterDefinition.g:1204:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            else if ( (LA33_0==36) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalParameterDefinition.g:1205:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:1213:3: kw= '*'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskKeyword_1());
                    		

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalParameterDefinition.g:1222:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalParameterDefinition.g:1222:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalParameterDefinition.g:1223:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalParameterDefinition.g:1229:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeName_0_0 = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:1235:2: ( ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) )
            // InternalParameterDefinition.g:1236:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            {
            // InternalParameterDefinition.g:1236:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            // InternalParameterDefinition.g:1237:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )?
            {
            // InternalParameterDefinition.g:1237:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) )
            // InternalParameterDefinition.g:1238:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            {
            // InternalParameterDefinition.g:1238:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            // InternalParameterDefinition.g:1239:5: lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_typeName_0_0=rulePRIMITIVE_TYPE_NAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_0_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.PRIMITIVE_TYPE_NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalParameterDefinition.g:1256:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalParameterDefinition.g:1257:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalParameterDefinition.g:1257:4: (lv_array_1_0= ruleArrayType )
                    // InternalParameterDefinition.g:1258:5: lv_array_1_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getArrayArrayTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_1_0=ruleArrayType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_1_0,
                    						"org.xtext.base.basicAttributes.BasicAttributes.ArrayType");
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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleAbstractValue"
    // InternalParameterDefinition.g:1279:1: entryRuleAbstractValue returns [EObject current=null] : iv_ruleAbstractValue= ruleAbstractValue EOF ;
    public final EObject entryRuleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractValue = null;


        try {
            // InternalParameterDefinition.g:1279:54: (iv_ruleAbstractValue= ruleAbstractValue EOF )
            // InternalParameterDefinition.g:1280:2: iv_ruleAbstractValue= ruleAbstractValue EOF
            {
             newCompositeNode(grammarAccess.getAbstractValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractValue=ruleAbstractValue();

            state._fsp--;

             current =iv_ruleAbstractValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractValue"


    // $ANTLR start "ruleAbstractValue"
    // InternalParameterDefinition.g:1286:1: ruleAbstractValue returns [EObject current=null] : (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) ;
    public final EObject ruleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValue_0 = null;

        EObject this_ArrayValue_1 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:1292:2: ( (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) )
            // InternalParameterDefinition.g:1293:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            {
            // InternalParameterDefinition.g:1293:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_INT)||(LA35_0>=27 && LA35_0<=30)) ) {
                alt35=1;
            }
            else if ( (LA35_0==34) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalParameterDefinition.g:1294:3: this_SingleValue_0= ruleSingleValue
                    {

                    			newCompositeNode(grammarAccess.getAbstractValueAccess().getSingleValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleValue_0=ruleSingleValue();

                    state._fsp--;


                    			current = this_SingleValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:1303:3: this_ArrayValue_1= ruleArrayValue
                    {

                    			newCompositeNode(grammarAccess.getAbstractValueAccess().getArrayValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayValue_1=ruleArrayValue();

                    state._fsp--;


                    			current = this_ArrayValue_1;
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
    // $ANTLR end "ruleAbstractValue"


    // $ANTLR start "entryRuleArrayValue"
    // InternalParameterDefinition.g:1315:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalParameterDefinition.g:1315:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalParameterDefinition.g:1316:2: iv_ruleArrayValue= ruleArrayValue EOF
            {
             newCompositeNode(grammarAccess.getArrayValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayValue=ruleArrayValue();

            state._fsp--;

             current =iv_ruleArrayValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalParameterDefinition.g:1322:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:1328:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) )
            // InternalParameterDefinition.g:1329:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            {
            // InternalParameterDefinition.g:1329:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            // InternalParameterDefinition.g:1330:3: otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalParameterDefinition.g:1334:3: ( (lv_values_1_0= ruleSingleValue ) )
            // InternalParameterDefinition.g:1335:4: (lv_values_1_0= ruleSingleValue )
            {
            // InternalParameterDefinition.g:1335:4: (lv_values_1_0= ruleSingleValue )
            // InternalParameterDefinition.g:1336:5: lv_values_1_0= ruleSingleValue
            {

            					newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_values_1_0=ruleSingleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrayValueRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_1_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.SingleValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalParameterDefinition.g:1353:3: (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==22) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalParameterDefinition.g:1354:4: otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_32); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalParameterDefinition.g:1358:4: ( (lv_values_3_0= ruleSingleValue ) )
            	    // InternalParameterDefinition.g:1359:5: (lv_values_3_0= ruleSingleValue )
            	    {
            	    // InternalParameterDefinition.g:1359:5: (lv_values_3_0= ruleSingleValue )
            	    // InternalParameterDefinition.g:1360:6: lv_values_3_0= ruleSingleValue
            	    {

            	    						newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_values_3_0=ruleSingleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArrayValueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.xtext.base.basicAttributes.BasicAttributes.SingleValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_4=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleSingleValue"
    // InternalParameterDefinition.g:1386:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalParameterDefinition.g:1386:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalParameterDefinition.g:1387:2: iv_ruleSingleValue= ruleSingleValue EOF
            {
             newCompositeNode(grammarAccess.getSingleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleValue=ruleSingleValue();

            state._fsp--;

             current =iv_ruleSingleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleValue"


    // $ANTLR start "ruleSingleValue"
    // InternalParameterDefinition.g:1393:1: ruleSingleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:1399:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) )
            // InternalParameterDefinition.g:1400:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            {
            // InternalParameterDefinition.g:1400:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_INT) ) {
                    int LA37_2 = input.LA(3);

                    if ( (LA37_2==EOF||(LA37_2>=RULE_DOCU_COMMENT && LA37_2<=RULE_ID)||LA37_2==16||LA37_2==19||LA37_2==22||LA37_2==35) ) {
                        alt37=1;
                    }
                    else if ( (LA37_2==27) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA37_1==27) ) {
                    alt37=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==EOF||(LA37_2>=RULE_DOCU_COMMENT && LA37_2<=RULE_ID)||LA37_2==16||LA37_2==19||LA37_2==22||LA37_2==35) ) {
                    alt37=1;
                }
                else if ( (LA37_2==27) ) {
                    alt37=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt37=2;
                }
                break;
            case RULE_STRING:
                {
                alt37=3;
                }
                break;
            case 28:
            case 29:
                {
                alt37=4;
                }
                break;
            case RULE_ID:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalParameterDefinition.g:1401:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalParameterDefinition.g:1401:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalParameterDefinition.g:1402:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalParameterDefinition.g:1402:4: ()
                    // InternalParameterDefinition.g:1403:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getIntValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalParameterDefinition.g:1409:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalParameterDefinition.g:1410:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalParameterDefinition.g:1410:5: (lv_value_1_0= ruleEInt )
                    // InternalParameterDefinition.g:1411:6: lv_value_1_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEIntParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:1430:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    {
                    // InternalParameterDefinition.g:1430:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    // InternalParameterDefinition.g:1431:4: () ( (lv_value_3_0= ruleEDouble ) )
                    {
                    // InternalParameterDefinition.g:1431:4: ()
                    // InternalParameterDefinition.g:1432:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalParameterDefinition.g:1438:4: ( (lv_value_3_0= ruleEDouble ) )
                    // InternalParameterDefinition.g:1439:5: (lv_value_3_0= ruleEDouble )
                    {
                    // InternalParameterDefinition.g:1439:5: (lv_value_3_0= ruleEDouble )
                    // InternalParameterDefinition.g:1440:6: lv_value_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEDoubleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalParameterDefinition.g:1459:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    {
                    // InternalParameterDefinition.g:1459:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    // InternalParameterDefinition.g:1460:4: () ( (lv_value_5_0= ruleEString ) )
                    {
                    // InternalParameterDefinition.g:1460:4: ()
                    // InternalParameterDefinition.g:1461:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getStringValueAction_2_0(),
                    						current);
                    				

                    }

                    // InternalParameterDefinition.g:1467:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalParameterDefinition.g:1468:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalParameterDefinition.g:1468:5: (lv_value_5_0= ruleEString )
                    // InternalParameterDefinition.g:1469:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalParameterDefinition.g:1488:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    {
                    // InternalParameterDefinition.g:1488:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    // InternalParameterDefinition.g:1489:4: () ( (lv_value_7_0= ruleEBoolean ) )
                    {
                    // InternalParameterDefinition.g:1489:4: ()
                    // InternalParameterDefinition.g:1490:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getBoolValueAction_3_0(),
                    						current);
                    				

                    }

                    // InternalParameterDefinition.g:1496:4: ( (lv_value_7_0= ruleEBoolean ) )
                    // InternalParameterDefinition.g:1497:5: (lv_value_7_0= ruleEBoolean )
                    {
                    // InternalParameterDefinition.g:1497:5: (lv_value_7_0= ruleEBoolean )
                    // InternalParameterDefinition.g:1498:6: lv_value_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalParameterDefinition.g:1517:3: ( () ( ( ruleFQN ) ) )
                    {
                    // InternalParameterDefinition.g:1517:3: ( () ( ( ruleFQN ) ) )
                    // InternalParameterDefinition.g:1518:4: () ( ( ruleFQN ) )
                    {
                    // InternalParameterDefinition.g:1518:4: ()
                    // InternalParameterDefinition.g:1519:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0(),
                    						current);
                    				

                    }

                    // InternalParameterDefinition.g:1525:4: ( ( ruleFQN ) )
                    // InternalParameterDefinition.g:1526:5: ( ruleFQN )
                    {
                    // InternalParameterDefinition.g:1526:5: ( ruleFQN )
                    // InternalParameterDefinition.g:1527:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleValueRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleSingleValue"


    // $ANTLR start "rulePRIMITIVE_TYPE_NAME"
    // InternalParameterDefinition.g:1546:1: rulePRIMITIVE_TYPE_NAME returns [Enumerator current=null] : ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) ;
    public final Enumerator rulePRIMITIVE_TYPE_NAME() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalParameterDefinition.g:1552:2: ( ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) )
            // InternalParameterDefinition.g:1553:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            {
            // InternalParameterDefinition.g:1553:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            int alt38=12;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt38=1;
                }
                break;
            case 38:
                {
                alt38=2;
                }
                break;
            case 39:
                {
                alt38=3;
                }
                break;
            case 40:
                {
                alt38=4;
                }
                break;
            case 41:
                {
                alt38=5;
                }
                break;
            case 42:
                {
                alt38=6;
                }
                break;
            case 43:
                {
                alt38=7;
                }
                break;
            case 44:
                {
                alt38=8;
                }
                break;
            case 45:
                {
                alt38=9;
                }
                break;
            case 46:
                {
                alt38=10;
                }
                break;
            case 47:
                {
                alt38=11;
                }
                break;
            case 48:
                {
                alt38=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalParameterDefinition.g:1554:3: (enumLiteral_0= 'Int8' )
                    {
                    // InternalParameterDefinition.g:1554:3: (enumLiteral_0= 'Int8' )
                    // InternalParameterDefinition.g:1555:4: enumLiteral_0= 'Int8'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:1562:3: (enumLiteral_1= 'Int16' )
                    {
                    // InternalParameterDefinition.g:1562:3: (enumLiteral_1= 'Int16' )
                    // InternalParameterDefinition.g:1563:4: enumLiteral_1= 'Int16'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalParameterDefinition.g:1570:3: (enumLiteral_2= 'Int32' )
                    {
                    // InternalParameterDefinition.g:1570:3: (enumLiteral_2= 'Int32' )
                    // InternalParameterDefinition.g:1571:4: enumLiteral_2= 'Int32'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalParameterDefinition.g:1578:3: (enumLiteral_3= 'Int64' )
                    {
                    // InternalParameterDefinition.g:1578:3: (enumLiteral_3= 'Int64' )
                    // InternalParameterDefinition.g:1579:4: enumLiteral_3= 'Int64'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalParameterDefinition.g:1586:3: (enumLiteral_4= 'UInt8' )
                    {
                    // InternalParameterDefinition.g:1586:3: (enumLiteral_4= 'UInt8' )
                    // InternalParameterDefinition.g:1587:4: enumLiteral_4= 'UInt8'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalParameterDefinition.g:1594:3: (enumLiteral_5= 'UInt16' )
                    {
                    // InternalParameterDefinition.g:1594:3: (enumLiteral_5= 'UInt16' )
                    // InternalParameterDefinition.g:1595:4: enumLiteral_5= 'UInt16'
                    {
                    enumLiteral_5=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalParameterDefinition.g:1602:3: (enumLiteral_6= 'UInt32' )
                    {
                    // InternalParameterDefinition.g:1602:3: (enumLiteral_6= 'UInt32' )
                    // InternalParameterDefinition.g:1603:4: enumLiteral_6= 'UInt32'
                    {
                    enumLiteral_6=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalParameterDefinition.g:1610:3: (enumLiteral_7= 'UInt64' )
                    {
                    // InternalParameterDefinition.g:1610:3: (enumLiteral_7= 'UInt64' )
                    // InternalParameterDefinition.g:1611:4: enumLiteral_7= 'UInt64'
                    {
                    enumLiteral_7=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalParameterDefinition.g:1618:3: (enumLiteral_8= 'Float' )
                    {
                    // InternalParameterDefinition.g:1618:3: (enumLiteral_8= 'Float' )
                    // InternalParameterDefinition.g:1619:4: enumLiteral_8= 'Float'
                    {
                    enumLiteral_8=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalParameterDefinition.g:1626:3: (enumLiteral_9= 'Double' )
                    {
                    // InternalParameterDefinition.g:1626:3: (enumLiteral_9= 'Double' )
                    // InternalParameterDefinition.g:1627:4: enumLiteral_9= 'Double'
                    {
                    enumLiteral_9=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalParameterDefinition.g:1634:3: (enumLiteral_10= 'String' )
                    {
                    // InternalParameterDefinition.g:1634:3: (enumLiteral_10= 'String' )
                    // InternalParameterDefinition.g:1635:4: enumLiteral_10= 'String'
                    {
                    enumLiteral_10=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalParameterDefinition.g:1642:3: (enumLiteral_11= 'Boolean' )
                    {
                    // InternalParameterDefinition.g:1642:3: (enumLiteral_11= 'Boolean' )
                    // InternalParameterDefinition.g:1643:4: enumLiteral_11= 'Boolean'
                    {
                    enumLiteral_11=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11());
                    			

                    }


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
    // $ANTLR end "rulePRIMITIVE_TYPE_NAME"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000028012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001880010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001FFE200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004010002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000004780000E0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001800000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000780000E0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800400000L});

}