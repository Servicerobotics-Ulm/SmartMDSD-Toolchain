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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.*'", "'#import'", "';'", "'ParameterSetRepository'", "'{'", "'}'", "'ParameterSet'", "'extends'", "','", "'Parameter'", "'Trigger'", "':'", "'='", "'.'", "'true'", "'false'", "'-'", "'E'", "'e'", "'InlineEnumeration'", "'['", "']'", "'*'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'"
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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
    // InternalParameterDefinition.g:106:1: entryRuleParamDefModel returns [EObject current=null] : iv_ruleParamDefModel= ruleParamDefModel EOF ;
    public final EObject entryRuleParamDefModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamDefModel = null;


        try {
            // InternalParameterDefinition.g:106:54: (iv_ruleParamDefModel= ruleParamDefModel EOF )
            // InternalParameterDefinition.g:107:2: iv_ruleParamDefModel= ruleParamDefModel EOF
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
    // InternalParameterDefinition.g:113:1: ruleParamDefModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_repository_2_0= ruleParameterSetRepository ) )? ) ;
    public final EObject ruleParamDefModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_repository_2_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:119:2: ( ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_repository_2_0= ruleParameterSetRepository ) )? ) )
            // InternalParameterDefinition.g:120:2: ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_repository_2_0= ruleParameterSetRepository ) )? )
            {
            // InternalParameterDefinition.g:120:2: ( () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_repository_2_0= ruleParameterSetRepository ) )? )
            // InternalParameterDefinition.g:121:3: () ( (lv_imports_1_0= ruleParamDefRepoImport ) )* ( (lv_repository_2_0= ruleParameterSetRepository ) )?
            {
            // InternalParameterDefinition.g:121:3: ()
            // InternalParameterDefinition.g:122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParamDefModelAccess().getParamDefModelAction_0(),
            					current);
            			

            }

            // InternalParameterDefinition.g:128:3: ( (lv_imports_1_0= ruleParamDefRepoImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalParameterDefinition.g:129:4: (lv_imports_1_0= ruleParamDefRepoImport )
            	    {
            	    // InternalParameterDefinition.g:129:4: (lv_imports_1_0= ruleParamDefRepoImport )
            	    // InternalParameterDefinition.g:130:5: lv_imports_1_0= ruleParamDefRepoImport
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

            // InternalParameterDefinition.g:147:3: ( (lv_repository_2_0= ruleParameterSetRepository ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalParameterDefinition.g:148:4: (lv_repository_2_0= ruleParameterSetRepository )
                    {
                    // InternalParameterDefinition.g:148:4: (lv_repository_2_0= ruleParameterSetRepository )
                    // InternalParameterDefinition.g:149:5: lv_repository_2_0= ruleParameterSetRepository
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
    // InternalParameterDefinition.g:170:1: entryRuleFQNW returns [String current=null] : iv_ruleFQNW= ruleFQNW EOF ;
    public final String entryRuleFQNW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNW = null;


        try {
            // InternalParameterDefinition.g:170:44: (iv_ruleFQNW= ruleFQNW EOF )
            // InternalParameterDefinition.g:171:2: iv_ruleFQNW= ruleFQNW EOF
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
    // InternalParameterDefinition.g:177:1: ruleFQNW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFQNW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:183:2: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // InternalParameterDefinition.g:184:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // InternalParameterDefinition.g:184:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // InternalParameterDefinition.g:185:3: this_FQN_0= ruleFQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalParameterDefinition.g:195:3: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalParameterDefinition.g:196:4: kw= '.*'
                    {
                    kw=(Token)match(input,11,FOLLOW_2); 

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
    // InternalParameterDefinition.g:206:1: entryRuleParamDefRepoImport returns [EObject current=null] : iv_ruleParamDefRepoImport= ruleParamDefRepoImport EOF ;
    public final EObject entryRuleParamDefRepoImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamDefRepoImport = null;


        try {
            // InternalParameterDefinition.g:206:59: (iv_ruleParamDefRepoImport= ruleParamDefRepoImport EOF )
            // InternalParameterDefinition.g:207:2: iv_ruleParamDefRepoImport= ruleParamDefRepoImport EOF
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
    // InternalParameterDefinition.g:213:1: ruleParamDefRepoImport returns [EObject current=null] : (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleParamDefRepoImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:219:2: ( (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) )
            // InternalParameterDefinition.g:220:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            {
            // InternalParameterDefinition.g:220:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            // InternalParameterDefinition.g:221:3: otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParamDefRepoImportAccess().getImportKeyword_0());
            		
            // InternalParameterDefinition.g:225:3: ( (lv_importedNamespace_1_0= ruleFQNW ) )
            // InternalParameterDefinition.g:226:4: (lv_importedNamespace_1_0= ruleFQNW )
            {
            // InternalParameterDefinition.g:226:4: (lv_importedNamespace_1_0= ruleFQNW )
            // InternalParameterDefinition.g:227:5: lv_importedNamespace_1_0= ruleFQNW
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

            // InternalParameterDefinition.g:244:3: (otherlv_2= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalParameterDefinition.g:245:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_2); 

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
    // InternalParameterDefinition.g:254:1: entryRuleParameterSetRepository returns [EObject current=null] : iv_ruleParameterSetRepository= ruleParameterSetRepository EOF ;
    public final EObject entryRuleParameterSetRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetRepository = null;


        try {
            // InternalParameterDefinition.g:254:63: (iv_ruleParameterSetRepository= ruleParameterSetRepository EOF )
            // InternalParameterDefinition.g:255:2: iv_ruleParameterSetRepository= ruleParameterSetRepository EOF
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
    // InternalParameterDefinition.g:261:1: ruleParameterSetRepository returns [EObject current=null] : (otherlv_0= 'ParameterSetRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleParameterSetDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleParameterSetRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sets_3_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:267:2: ( (otherlv_0= 'ParameterSetRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleParameterSetDefinition ) )* otherlv_4= '}' ) )
            // InternalParameterDefinition.g:268:2: (otherlv_0= 'ParameterSetRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleParameterSetDefinition ) )* otherlv_4= '}' )
            {
            // InternalParameterDefinition.g:268:2: (otherlv_0= 'ParameterSetRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleParameterSetDefinition ) )* otherlv_4= '}' )
            // InternalParameterDefinition.g:269:3: otherlv_0= 'ParameterSetRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sets_3_0= ruleParameterSetDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterSetRepositoryAccess().getParameterSetRepositoryKeyword_0());
            		
            // InternalParameterDefinition.g:273:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalParameterDefinition.g:274:4: (lv_name_1_0= RULE_ID )
            {
            // InternalParameterDefinition.g:274:4: (lv_name_1_0= RULE_ID )
            // InternalParameterDefinition.g:275:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterSetRepositoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterSetRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterSetRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalParameterDefinition.g:295:3: ( (lv_sets_3_0= ruleParameterSetDefinition ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalParameterDefinition.g:296:4: (lv_sets_3_0= ruleParameterSetDefinition )
            	    {
            	    // InternalParameterDefinition.g:296:4: (lv_sets_3_0= ruleParameterSetDefinition )
            	    // InternalParameterDefinition.g:297:5: lv_sets_3_0= ruleParameterSetDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getParameterSetRepositoryAccess().getSetsParameterSetDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_sets_3_0=ruleParameterSetDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterSetRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sets",
            	    						lv_sets_3_0,
            	    						"org.xtext.service.parameterDefinition.ParameterDefinition.ParameterSetDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterSetRepositoryAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalParameterDefinition.g:322:1: entryRuleParameterSetDefinition returns [EObject current=null] : iv_ruleParameterSetDefinition= ruleParameterSetDefinition EOF ;
    public final EObject entryRuleParameterSetDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetDefinition = null;


        try {
            // InternalParameterDefinition.g:322:63: (iv_ruleParameterSetDefinition= ruleParameterSetDefinition EOF )
            // InternalParameterDefinition.g:323:2: iv_ruleParameterSetDefinition= ruleParameterSetDefinition EOF
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
    // InternalParameterDefinition.g:329:1: ruleParameterSetDefinition returns [EObject current=null] : (otherlv_0= 'ParameterSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) (otherlv_4= ',' ( ( ruleFQN ) ) )* )? otherlv_6= '{' ( (lv_parameters_7_0= ruleAbstractParameter ) )* otherlv_8= '}' ) ;
    public final EObject ruleParameterSetDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameters_7_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:335:2: ( (otherlv_0= 'ParameterSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) (otherlv_4= ',' ( ( ruleFQN ) ) )* )? otherlv_6= '{' ( (lv_parameters_7_0= ruleAbstractParameter ) )* otherlv_8= '}' ) )
            // InternalParameterDefinition.g:336:2: (otherlv_0= 'ParameterSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) (otherlv_4= ',' ( ( ruleFQN ) ) )* )? otherlv_6= '{' ( (lv_parameters_7_0= ruleAbstractParameter ) )* otherlv_8= '}' )
            {
            // InternalParameterDefinition.g:336:2: (otherlv_0= 'ParameterSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) (otherlv_4= ',' ( ( ruleFQN ) ) )* )? otherlv_6= '{' ( (lv_parameters_7_0= ruleAbstractParameter ) )* otherlv_8= '}' )
            // InternalParameterDefinition.g:337:3: otherlv_0= 'ParameterSet' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleFQN ) ) (otherlv_4= ',' ( ( ruleFQN ) ) )* )? otherlv_6= '{' ( (lv_parameters_7_0= ruleAbstractParameter ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterSetDefinitionAccess().getParameterSetKeyword_0());
            		
            // InternalParameterDefinition.g:341:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalParameterDefinition.g:342:4: (lv_name_1_0= RULE_ID )
            {
            // InternalParameterDefinition.g:342:4: (lv_name_1_0= RULE_ID )
            // InternalParameterDefinition.g:343:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterSetDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterSetDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalParameterDefinition.g:359:3: (otherlv_2= 'extends' ( ( ruleFQN ) ) (otherlv_4= ',' ( ( ruleFQN ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalParameterDefinition.g:360:4: otherlv_2= 'extends' ( ( ruleFQN ) ) (otherlv_4= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterSetDefinitionAccess().getExtendsKeyword_2_0());
                    			
                    // InternalParameterDefinition.g:364:4: ( ( ruleFQN ) )
                    // InternalParameterDefinition.g:365:5: ( ruleFQN )
                    {
                    // InternalParameterDefinition.g:365:5: ( ruleFQN )
                    // InternalParameterDefinition.g:366:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterSetDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalParameterDefinition.g:380:4: (otherlv_4= ',' ( ( ruleFQN ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalParameterDefinition.g:381:5: otherlv_4= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getParameterSetDefinitionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalParameterDefinition.g:385:5: ( ( ruleFQN ) )
                    	    // InternalParameterDefinition.g:386:6: ( ruleFQN )
                    	    {
                    	    // InternalParameterDefinition.g:386:6: ( ruleFQN )
                    	    // InternalParameterDefinition.g:387:7: ruleFQN
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getParameterSetDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleFQN();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterSetDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalParameterDefinition.g:407:3: ( (lv_parameters_7_0= ruleAbstractParameter ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=20 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalParameterDefinition.g:408:4: (lv_parameters_7_0= ruleAbstractParameter )
            	    {
            	    // InternalParameterDefinition.g:408:4: (lv_parameters_7_0= ruleAbstractParameter )
            	    // InternalParameterDefinition.g:409:5: lv_parameters_7_0= ruleAbstractParameter
            	    {

            	    					newCompositeNode(grammarAccess.getParameterSetDefinitionAccess().getParametersAbstractParameterParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_parameters_7_0=ruleAbstractParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterSetDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_7_0,
            	    						"org.xtext.service.parameterDefinition.ParameterDefinition.AbstractParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getParameterSetDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalParameterDefinition.g:434:1: entryRuleAbstractParameter returns [EObject current=null] : iv_ruleAbstractParameter= ruleAbstractParameter EOF ;
    public final EObject entryRuleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameter = null;


        try {
            // InternalParameterDefinition.g:434:58: (iv_ruleAbstractParameter= ruleAbstractParameter EOF )
            // InternalParameterDefinition.g:435:2: iv_ruleAbstractParameter= ruleAbstractParameter EOF
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
    // InternalParameterDefinition.g:441:1: ruleAbstractParameter returns [EObject current=null] : (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition ) ;
    public final EObject ruleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterDefinition_0 = null;

        EObject this_TriggerDefinition_1 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:447:2: ( (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition ) )
            // InternalParameterDefinition.g:448:2: (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition )
            {
            // InternalParameterDefinition.g:448:2: (this_ParameterDefinition_0= ruleParameterDefinition | this_TriggerDefinition_1= ruleTriggerDefinition )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalParameterDefinition.g:449:3: this_ParameterDefinition_0= ruleParameterDefinition
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
                    // InternalParameterDefinition.g:458:3: this_TriggerDefinition_1= ruleTriggerDefinition
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
    // InternalParameterDefinition.g:470:1: entryRuleParameterDefinition returns [EObject current=null] : iv_ruleParameterDefinition= ruleParameterDefinition EOF ;
    public final EObject entryRuleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDefinition = null;


        try {
            // InternalParameterDefinition.g:470:60: (iv_ruleParameterDefinition= ruleParameterDefinition EOF )
            // InternalParameterDefinition.g:471:2: iv_ruleParameterDefinition= ruleParameterDefinition EOF
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
    // InternalParameterDefinition.g:477:1: ruleParameterDefinition returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:483:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' ) )
            // InternalParameterDefinition.g:484:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' )
            {
            // InternalParameterDefinition.g:484:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' )
            // InternalParameterDefinition.g:485:3: otherlv_0= 'Parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterDefinitionAccess().getParameterKeyword_0());
            		
            // InternalParameterDefinition.g:489:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalParameterDefinition.g:490:4: (lv_name_1_0= RULE_ID )
            {
            // InternalParameterDefinition.g:490:4: (lv_name_1_0= RULE_ID )
            // InternalParameterDefinition.g:491:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalParameterDefinition.g:511:3: ( (lv_attributes_3_0= ruleAttributeDefinition ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalParameterDefinition.g:512:4: (lv_attributes_3_0= ruleAttributeDefinition )
            	    {
            	    // InternalParameterDefinition.g:512:4: (lv_attributes_3_0= ruleAttributeDefinition )
            	    // InternalParameterDefinition.g:513:5: lv_attributes_3_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getParameterDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_attributes_3_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalParameterDefinition.g:538:1: entryRuleTriggerDefinition returns [EObject current=null] : iv_ruleTriggerDefinition= ruleTriggerDefinition EOF ;
    public final EObject entryRuleTriggerDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerDefinition = null;


        try {
            // InternalParameterDefinition.g:538:58: (iv_ruleTriggerDefinition= ruleTriggerDefinition EOF )
            // InternalParameterDefinition.g:539:2: iv_ruleTriggerDefinition= ruleTriggerDefinition EOF
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
    // InternalParameterDefinition.g:545:1: ruleTriggerDefinition returns [EObject current=null] : (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleTriggerDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:551:2: ( (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' ) )
            // InternalParameterDefinition.g:552:2: (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' )
            {
            // InternalParameterDefinition.g:552:2: (otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' )
            // InternalParameterDefinition.g:553:3: otherlv_0= 'Trigger' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerDefinitionAccess().getTriggerKeyword_0());
            		
            // InternalParameterDefinition.g:557:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalParameterDefinition.g:558:4: (lv_name_1_0= RULE_ID )
            {
            // InternalParameterDefinition.g:558:4: (lv_name_1_0= RULE_ID )
            // InternalParameterDefinition.g:559:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTriggerDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTriggerDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalParameterDefinition.g:579:3: ( (lv_attributes_3_0= ruleAttributeDefinition ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalParameterDefinition.g:580:4: (lv_attributes_3_0= ruleAttributeDefinition )
            	    {
            	    // InternalParameterDefinition.g:580:4: (lv_attributes_3_0= ruleAttributeDefinition )
            	    // InternalParameterDefinition.g:581:5: lv_attributes_3_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getTriggerDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_attributes_3_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTriggerDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTriggerDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalParameterDefinition.g:606:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalParameterDefinition.g:606:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalParameterDefinition.g:607:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
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
    // InternalParameterDefinition.g:613:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_2_0 = null;

        EObject lv_defaultvalue_4_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:619:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? ) )
            // InternalParameterDefinition.g:620:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? )
            {
            // InternalParameterDefinition.g:620:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? )
            // InternalParameterDefinition.g:621:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )?
            {
            // InternalParameterDefinition.g:621:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalParameterDefinition.g:622:4: (lv_name_0_0= RULE_ID )
            {
            // InternalParameterDefinition.g:622:4: (lv_name_0_0= RULE_ID )
            // InternalParameterDefinition.g:623:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getColonKeyword_1());
            		
            // InternalParameterDefinition.g:643:3: ( (lv_type_2_0= ruleAbstractAttributeType ) )
            // InternalParameterDefinition.g:644:4: (lv_type_2_0= ruleAbstractAttributeType )
            {
            // InternalParameterDefinition.g:644:4: (lv_type_2_0= ruleAbstractAttributeType )
            // InternalParameterDefinition.g:645:5: lv_type_2_0= ruleAbstractAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_type_2_0=ruleAbstractAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.AbstractAttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalParameterDefinition.g:662:3: (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalParameterDefinition.g:663:4: otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalParameterDefinition.g:667:4: ( (lv_defaultvalue_4_0= ruleAbstractValue ) )
                    // InternalParameterDefinition.g:668:5: (lv_defaultvalue_4_0= ruleAbstractValue )
                    {
                    // InternalParameterDefinition.g:668:5: (lv_defaultvalue_4_0= ruleAbstractValue )
                    // InternalParameterDefinition.g:669:6: lv_defaultvalue_4_0= ruleAbstractValue
                    {

                    						newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_defaultvalue_4_0=ruleAbstractValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"defaultvalue",
                    							lv_defaultvalue_4_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.AbstractValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalParameterDefinition.g:687:3: (otherlv_5= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalParameterDefinition.g:688:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_4());
                    			

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
    // InternalParameterDefinition.g:697:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalParameterDefinition.g:697:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalParameterDefinition.g:698:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalParameterDefinition.g:704:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalParameterDefinition.g:710:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalParameterDefinition.g:711:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalParameterDefinition.g:711:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalParameterDefinition.g:712:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalParameterDefinition.g:719:3: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalParameterDefinition.g:720:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,24,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalParameterDefinition.g:737:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalParameterDefinition.g:737:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalParameterDefinition.g:738:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalParameterDefinition.g:744:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalParameterDefinition.g:750:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalParameterDefinition.g:751:2: (kw= 'true' | kw= 'false' )
            {
            // InternalParameterDefinition.g:751:2: (kw= 'true' | kw= 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalParameterDefinition.g:752:3: kw= 'true'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:758:3: kw= 'false'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

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
    // InternalParameterDefinition.g:767:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalParameterDefinition.g:767:47: (iv_ruleEString= ruleEString EOF )
            // InternalParameterDefinition.g:768:2: iv_ruleEString= ruleEString EOF
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
    // InternalParameterDefinition.g:774:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalParameterDefinition.g:780:2: (this_STRING_0= RULE_STRING )
            // InternalParameterDefinition.g:781:2: this_STRING_0= RULE_STRING
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
    // InternalParameterDefinition.g:791:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalParameterDefinition.g:791:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalParameterDefinition.g:792:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalParameterDefinition.g:798:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalParameterDefinition.g:804:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalParameterDefinition.g:805:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalParameterDefinition.g:805:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalParameterDefinition.g:806:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalParameterDefinition.g:806:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalParameterDefinition.g:807:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_18); 

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
    // InternalParameterDefinition.g:824:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalParameterDefinition.g:824:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalParameterDefinition.g:825:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalParameterDefinition.g:831:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalParameterDefinition.g:837:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalParameterDefinition.g:838:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalParameterDefinition.g:838:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalParameterDefinition.g:839:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalParameterDefinition.g:839:3: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalParameterDefinition.g:840:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalParameterDefinition.g:846:3: (this_INT_1= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalParameterDefinition.g:847:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_20); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,24,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalParameterDefinition.g:867:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=28 && LA21_0<=29)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalParameterDefinition.g:868:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalParameterDefinition.g:868:4: (kw= 'E' | kw= 'e' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==28) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==29) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalParameterDefinition.g:869:5: kw= 'E'
                            {
                            kw=(Token)match(input,28,FOLLOW_22); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalParameterDefinition.g:875:5: kw= 'e'
                            {
                            kw=(Token)match(input,29,FOLLOW_22); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalParameterDefinition.g:881:4: (kw= '-' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==27) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalParameterDefinition.g:882:5: kw= '-'
                            {
                            kw=(Token)match(input,27,FOLLOW_18); 

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
    // InternalParameterDefinition.g:900:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalParameterDefinition.g:900:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalParameterDefinition.g:901:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
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
    // InternalParameterDefinition.g:907:1: ruleEnumerationElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:913:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) )
            // InternalParameterDefinition.g:914:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            {
            // InternalParameterDefinition.g:914:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            // InternalParameterDefinition.g:915:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )?
            {
            // InternalParameterDefinition.g:915:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalParameterDefinition.g:916:4: (lv_name_0_0= RULE_ID )
            {
            // InternalParameterDefinition.g:916:4: (lv_name_0_0= RULE_ID )
            // InternalParameterDefinition.g:917:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            // InternalParameterDefinition.g:933:3: (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalParameterDefinition.g:934:4: otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalParameterDefinition.g:938:4: ( (lv_value_2_0= ruleEInt ) )
                    // InternalParameterDefinition.g:939:5: (lv_value_2_0= ruleEInt )
                    {
                    // InternalParameterDefinition.g:939:5: (lv_value_2_0= ruleEInt )
                    // InternalParameterDefinition.g:940:6: lv_value_2_0= ruleEInt
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

            // InternalParameterDefinition.g:958:3: (otherlv_3= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalParameterDefinition.g:959:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_2); 

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
    // InternalParameterDefinition.g:968:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // InternalParameterDefinition.g:968:62: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // InternalParameterDefinition.g:969:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
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
    // InternalParameterDefinition.g:975:1: ruleAbstractAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_InlineEnumerationType_1 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:981:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) )
            // InternalParameterDefinition.g:982:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            {
            // InternalParameterDefinition.g:982:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=34 && LA24_0<=45)) ) {
                alt24=1;
            }
            else if ( (LA24_0==30) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalParameterDefinition.g:983:3: this_PrimitiveType_0= rulePrimitiveType
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
                    // InternalParameterDefinition.g:992:3: this_InlineEnumerationType_1= ruleInlineEnumerationType
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
    // InternalParameterDefinition.g:1004:1: entryRuleInlineEnumerationType returns [EObject current=null] : iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF ;
    public final EObject entryRuleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineEnumerationType = null;


        try {
            // InternalParameterDefinition.g:1004:62: (iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF )
            // InternalParameterDefinition.g:1005:2: iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF
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
    // InternalParameterDefinition.g:1011:1: ruleInlineEnumerationType returns [EObject current=null] : (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_array_1_0 = null;

        EObject lv_enums_3_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:1017:2: ( (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) )
            // InternalParameterDefinition.g:1018:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            {
            // InternalParameterDefinition.g:1018:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            // InternalParameterDefinition.g:1019:3: otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0());
            		
            // InternalParameterDefinition.g:1023:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalParameterDefinition.g:1024:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalParameterDefinition.g:1024:4: (lv_array_1_0= ruleArrayType )
                    // InternalParameterDefinition.g:1025:5: lv_array_1_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getArrayArrayTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalParameterDefinition.g:1046:3: ( (lv_enums_3_0= ruleEnumerationElement ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalParameterDefinition.g:1047:4: (lv_enums_3_0= ruleEnumerationElement )
            	    {
            	    // InternalParameterDefinition.g:1047:4: (lv_enums_3_0= ruleEnumerationElement )
            	    // InternalParameterDefinition.g:1048:5: lv_enums_3_0= ruleEnumerationElement
            	    {

            	    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalParameterDefinition.g:1073:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalParameterDefinition.g:1073:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalParameterDefinition.g:1074:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalParameterDefinition.g:1080:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:1086:2: ( ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) )
            // InternalParameterDefinition.g:1087:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            {
            // InternalParameterDefinition.g:1087:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            // InternalParameterDefinition.g:1088:3: () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']'
            {
            // InternalParameterDefinition.g:1088:3: ()
            // InternalParameterDefinition.g:1089:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalParameterDefinition.g:1099:3: ( (lv_length_2_0= ruleCardinality ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT||LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalParameterDefinition.g:1100:4: (lv_length_2_0= ruleCardinality )
                    {
                    // InternalParameterDefinition.g:1100:4: (lv_length_2_0= ruleCardinality )
                    // InternalParameterDefinition.g:1101:5: lv_length_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_25);
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

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalParameterDefinition.g:1126:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalParameterDefinition.g:1126:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalParameterDefinition.g:1127:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalParameterDefinition.g:1133:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalParameterDefinition.g:1139:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalParameterDefinition.g:1140:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalParameterDefinition.g:1140:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                alt28=1;
            }
            else if ( (LA28_0==33) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalParameterDefinition.g:1141:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:1149:3: kw= '*'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

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
    // InternalParameterDefinition.g:1158:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalParameterDefinition.g:1158:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalParameterDefinition.g:1159:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalParameterDefinition.g:1165:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeName_0_0 = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:1171:2: ( ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) )
            // InternalParameterDefinition.g:1172:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            {
            // InternalParameterDefinition.g:1172:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            // InternalParameterDefinition.g:1173:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )?
            {
            // InternalParameterDefinition.g:1173:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) )
            // InternalParameterDefinition.g:1174:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            {
            // InternalParameterDefinition.g:1174:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            // InternalParameterDefinition.g:1175:5: lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalParameterDefinition.g:1192:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalParameterDefinition.g:1193:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalParameterDefinition.g:1193:4: (lv_array_1_0= ruleArrayType )
                    // InternalParameterDefinition.g:1194:5: lv_array_1_0= ruleArrayType
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
    // InternalParameterDefinition.g:1215:1: entryRuleAbstractValue returns [EObject current=null] : iv_ruleAbstractValue= ruleAbstractValue EOF ;
    public final EObject entryRuleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractValue = null;


        try {
            // InternalParameterDefinition.g:1215:54: (iv_ruleAbstractValue= ruleAbstractValue EOF )
            // InternalParameterDefinition.g:1216:2: iv_ruleAbstractValue= ruleAbstractValue EOF
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
    // InternalParameterDefinition.g:1222:1: ruleAbstractValue returns [EObject current=null] : (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) ;
    public final EObject ruleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValue_0 = null;

        EObject this_ArrayValue_1 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:1228:2: ( (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) )
            // InternalParameterDefinition.g:1229:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            {
            // InternalParameterDefinition.g:1229:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_INT)||(LA30_0>=24 && LA30_0<=27)) ) {
                alt30=1;
            }
            else if ( (LA30_0==31) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalParameterDefinition.g:1230:3: this_SingleValue_0= ruleSingleValue
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
                    // InternalParameterDefinition.g:1239:3: this_ArrayValue_1= ruleArrayValue
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
    // InternalParameterDefinition.g:1251:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalParameterDefinition.g:1251:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalParameterDefinition.g:1252:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalParameterDefinition.g:1258:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:1264:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) )
            // InternalParameterDefinition.g:1265:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            {
            // InternalParameterDefinition.g:1265:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            // InternalParameterDefinition.g:1266:3: otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalParameterDefinition.g:1270:3: ( (lv_values_1_0= ruleSingleValue ) )
            // InternalParameterDefinition.g:1271:4: (lv_values_1_0= ruleSingleValue )
            {
            // InternalParameterDefinition.g:1271:4: (lv_values_1_0= ruleSingleValue )
            // InternalParameterDefinition.g:1272:5: lv_values_1_0= ruleSingleValue
            {

            					newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalParameterDefinition.g:1289:3: (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==19) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalParameterDefinition.g:1290:4: otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalParameterDefinition.g:1294:4: ( (lv_values_3_0= ruleSingleValue ) )
            	    // InternalParameterDefinition.g:1295:5: (lv_values_3_0= ruleSingleValue )
            	    {
            	    // InternalParameterDefinition.g:1295:5: (lv_values_3_0= ruleSingleValue )
            	    // InternalParameterDefinition.g:1296:6: lv_values_3_0= ruleSingleValue
            	    {

            	    						newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

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
    // InternalParameterDefinition.g:1322:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalParameterDefinition.g:1322:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalParameterDefinition.g:1323:2: iv_ruleSingleValue= ruleSingleValue EOF
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
    // InternalParameterDefinition.g:1329:1: ruleSingleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalParameterDefinition.g:1335:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) )
            // InternalParameterDefinition.g:1336:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            {
            // InternalParameterDefinition.g:1336:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==RULE_INT) ) {
                    int LA32_2 = input.LA(3);

                    if ( (LA32_2==24) ) {
                        alt32=2;
                    }
                    else if ( (LA32_2==EOF||LA32_2==RULE_ID||LA32_2==13||LA32_2==16||LA32_2==19||LA32_2==32) ) {
                        alt32=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA32_1==24) ) {
                    alt32=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA32_2 = input.LA(2);

                if ( (LA32_2==24) ) {
                    alt32=2;
                }
                else if ( (LA32_2==EOF||LA32_2==RULE_ID||LA32_2==13||LA32_2==16||LA32_2==19||LA32_2==32) ) {
                    alt32=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt32=2;
                }
                break;
            case RULE_STRING:
                {
                alt32=3;
                }
                break;
            case 25:
            case 26:
                {
                alt32=4;
                }
                break;
            case RULE_ID:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalParameterDefinition.g:1337:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalParameterDefinition.g:1337:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalParameterDefinition.g:1338:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalParameterDefinition.g:1338:4: ()
                    // InternalParameterDefinition.g:1339:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getIntValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalParameterDefinition.g:1345:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalParameterDefinition.g:1346:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalParameterDefinition.g:1346:5: (lv_value_1_0= ruleEInt )
                    // InternalParameterDefinition.g:1347:6: lv_value_1_0= ruleEInt
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
                    // InternalParameterDefinition.g:1366:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    {
                    // InternalParameterDefinition.g:1366:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    // InternalParameterDefinition.g:1367:4: () ( (lv_value_3_0= ruleEDouble ) )
                    {
                    // InternalParameterDefinition.g:1367:4: ()
                    // InternalParameterDefinition.g:1368:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalParameterDefinition.g:1374:4: ( (lv_value_3_0= ruleEDouble ) )
                    // InternalParameterDefinition.g:1375:5: (lv_value_3_0= ruleEDouble )
                    {
                    // InternalParameterDefinition.g:1375:5: (lv_value_3_0= ruleEDouble )
                    // InternalParameterDefinition.g:1376:6: lv_value_3_0= ruleEDouble
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
                    // InternalParameterDefinition.g:1395:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    {
                    // InternalParameterDefinition.g:1395:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    // InternalParameterDefinition.g:1396:4: () ( (lv_value_5_0= ruleEString ) )
                    {
                    // InternalParameterDefinition.g:1396:4: ()
                    // InternalParameterDefinition.g:1397:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getStringValueAction_2_0(),
                    						current);
                    				

                    }

                    // InternalParameterDefinition.g:1403:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalParameterDefinition.g:1404:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalParameterDefinition.g:1404:5: (lv_value_5_0= ruleEString )
                    // InternalParameterDefinition.g:1405:6: lv_value_5_0= ruleEString
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
                    // InternalParameterDefinition.g:1424:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    {
                    // InternalParameterDefinition.g:1424:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    // InternalParameterDefinition.g:1425:4: () ( (lv_value_7_0= ruleEBoolean ) )
                    {
                    // InternalParameterDefinition.g:1425:4: ()
                    // InternalParameterDefinition.g:1426:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getBoolValueAction_3_0(),
                    						current);
                    				

                    }

                    // InternalParameterDefinition.g:1432:4: ( (lv_value_7_0= ruleEBoolean ) )
                    // InternalParameterDefinition.g:1433:5: (lv_value_7_0= ruleEBoolean )
                    {
                    // InternalParameterDefinition.g:1433:5: (lv_value_7_0= ruleEBoolean )
                    // InternalParameterDefinition.g:1434:6: lv_value_7_0= ruleEBoolean
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
                    // InternalParameterDefinition.g:1453:3: ( () ( ( ruleFQN ) ) )
                    {
                    // InternalParameterDefinition.g:1453:3: ( () ( ( ruleFQN ) ) )
                    // InternalParameterDefinition.g:1454:4: () ( ( ruleFQN ) )
                    {
                    // InternalParameterDefinition.g:1454:4: ()
                    // InternalParameterDefinition.g:1455:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0(),
                    						current);
                    				

                    }

                    // InternalParameterDefinition.g:1461:4: ( ( ruleFQN ) )
                    // InternalParameterDefinition.g:1462:5: ( ruleFQN )
                    {
                    // InternalParameterDefinition.g:1462:5: ( ruleFQN )
                    // InternalParameterDefinition.g:1463:6: ruleFQN
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
    // InternalParameterDefinition.g:1482:1: rulePRIMITIVE_TYPE_NAME returns [Enumerator current=null] : ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) ;
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
            // InternalParameterDefinition.g:1488:2: ( ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) )
            // InternalParameterDefinition.g:1489:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            {
            // InternalParameterDefinition.g:1489:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            int alt33=12;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt33=1;
                }
                break;
            case 35:
                {
                alt33=2;
                }
                break;
            case 36:
                {
                alt33=3;
                }
                break;
            case 37:
                {
                alt33=4;
                }
                break;
            case 38:
                {
                alt33=5;
                }
                break;
            case 39:
                {
                alt33=6;
                }
                break;
            case 40:
                {
                alt33=7;
                }
                break;
            case 41:
                {
                alt33=8;
                }
                break;
            case 42:
                {
                alt33=9;
                }
                break;
            case 43:
                {
                alt33=10;
                }
                break;
            case 44:
                {
                alt33=11;
                }
                break;
            case 45:
                {
                alt33=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalParameterDefinition.g:1490:3: (enumLiteral_0= 'Int8' )
                    {
                    // InternalParameterDefinition.g:1490:3: (enumLiteral_0= 'Int8' )
                    // InternalParameterDefinition.g:1491:4: enumLiteral_0= 'Int8'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:1498:3: (enumLiteral_1= 'Int16' )
                    {
                    // InternalParameterDefinition.g:1498:3: (enumLiteral_1= 'Int16' )
                    // InternalParameterDefinition.g:1499:4: enumLiteral_1= 'Int16'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalParameterDefinition.g:1506:3: (enumLiteral_2= 'Int32' )
                    {
                    // InternalParameterDefinition.g:1506:3: (enumLiteral_2= 'Int32' )
                    // InternalParameterDefinition.g:1507:4: enumLiteral_2= 'Int32'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalParameterDefinition.g:1514:3: (enumLiteral_3= 'Int64' )
                    {
                    // InternalParameterDefinition.g:1514:3: (enumLiteral_3= 'Int64' )
                    // InternalParameterDefinition.g:1515:4: enumLiteral_3= 'Int64'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalParameterDefinition.g:1522:3: (enumLiteral_4= 'UInt8' )
                    {
                    // InternalParameterDefinition.g:1522:3: (enumLiteral_4= 'UInt8' )
                    // InternalParameterDefinition.g:1523:4: enumLiteral_4= 'UInt8'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalParameterDefinition.g:1530:3: (enumLiteral_5= 'UInt16' )
                    {
                    // InternalParameterDefinition.g:1530:3: (enumLiteral_5= 'UInt16' )
                    // InternalParameterDefinition.g:1531:4: enumLiteral_5= 'UInt16'
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalParameterDefinition.g:1538:3: (enumLiteral_6= 'UInt32' )
                    {
                    // InternalParameterDefinition.g:1538:3: (enumLiteral_6= 'UInt32' )
                    // InternalParameterDefinition.g:1539:4: enumLiteral_6= 'UInt32'
                    {
                    enumLiteral_6=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalParameterDefinition.g:1546:3: (enumLiteral_7= 'UInt64' )
                    {
                    // InternalParameterDefinition.g:1546:3: (enumLiteral_7= 'UInt64' )
                    // InternalParameterDefinition.g:1547:4: enumLiteral_7= 'UInt64'
                    {
                    enumLiteral_7=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalParameterDefinition.g:1554:3: (enumLiteral_8= 'Float' )
                    {
                    // InternalParameterDefinition.g:1554:3: (enumLiteral_8= 'Float' )
                    // InternalParameterDefinition.g:1555:4: enumLiteral_8= 'Float'
                    {
                    enumLiteral_8=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalParameterDefinition.g:1562:3: (enumLiteral_9= 'Double' )
                    {
                    // InternalParameterDefinition.g:1562:3: (enumLiteral_9= 'Double' )
                    // InternalParameterDefinition.g:1563:4: enumLiteral_9= 'Double'
                    {
                    enumLiteral_9=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalParameterDefinition.g:1570:3: (enumLiteral_10= 'String' )
                    {
                    // InternalParameterDefinition.g:1570:3: (enumLiteral_10= 'String' )
                    // InternalParameterDefinition.g:1571:4: enumLiteral_10= 'String'
                    {
                    enumLiteral_10=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalParameterDefinition.g:1578:3: (enumLiteral_11= 'Boolean' )
                    {
                    // InternalParameterDefinition.g:1578:3: (enumLiteral_11= 'Boolean' )
                    // InternalParameterDefinition.g:1579:4: enumLiteral_11= 'Boolean'
                    {
                    enumLiteral_11=(Token)match(input,45,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00003FFC40000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000802002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000008F000070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000300000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000F000070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100080000L});

}