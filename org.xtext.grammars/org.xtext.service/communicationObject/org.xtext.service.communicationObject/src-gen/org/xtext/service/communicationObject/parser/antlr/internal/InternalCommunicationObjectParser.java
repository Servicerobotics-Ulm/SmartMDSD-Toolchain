package org.xtext.service.communicationObject.parser.antlr.internal;

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
import org.xtext.service.communicationObject.services.CommunicationObjectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCommunicationObjectParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCU_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_WS", "RULE_ANY_OTHER", "'.*'", "'#import'", "';'", "'CommObjectsRepository'", "'version'", "'{'", "'Dependency'", "'}'", "'.'", "'CommObject'", "'Enumeration'", "'('", "')'", "':'", "'='", "'true'", "'false'", "'-'", "'E'", "'e'", "'InlineEnumeration'", "'['", "']'", "'*'", "','", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'"
    };
    public static final int T__50=50;
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_DOCU_COMMENT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
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


        public InternalCommunicationObjectParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCommunicationObjectParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCommunicationObjectParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCommunicationObject.g"; }



     	private CommunicationObjectGrammarAccess grammarAccess;

        public InternalCommunicationObjectParser(TokenStream input, CommunicationObjectGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CommObjectModel";
       	}

       	@Override
       	protected CommunicationObjectGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCommObjectModel"
    // InternalCommunicationObject.g:80:1: entryRuleCommObjectModel returns [EObject current=null] : iv_ruleCommObjectModel= ruleCommObjectModel EOF ;
    public final EObject entryRuleCommObjectModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommObjectModel = null;


        try {
            // InternalCommunicationObject.g:80:56: (iv_ruleCommObjectModel= ruleCommObjectModel EOF )
            // InternalCommunicationObject.g:81:2: iv_ruleCommObjectModel= ruleCommObjectModel EOF
            {
             newCompositeNode(grammarAccess.getCommObjectModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommObjectModel=ruleCommObjectModel();

            state._fsp--;

             current =iv_ruleCommObjectModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommObjectModel"


    // $ANTLR start "ruleCommObjectModel"
    // InternalCommunicationObject.g:87:1: ruleCommObjectModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleCommRepositoryImport ) )* ( (lv_repository_1_0= ruleCommObjectsRepository ) )? ) ;
    public final EObject ruleCommObjectModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_repository_1_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:93:2: ( ( ( (lv_imports_0_0= ruleCommRepositoryImport ) )* ( (lv_repository_1_0= ruleCommObjectsRepository ) )? ) )
            // InternalCommunicationObject.g:94:2: ( ( (lv_imports_0_0= ruleCommRepositoryImport ) )* ( (lv_repository_1_0= ruleCommObjectsRepository ) )? )
            {
            // InternalCommunicationObject.g:94:2: ( ( (lv_imports_0_0= ruleCommRepositoryImport ) )* ( (lv_repository_1_0= ruleCommObjectsRepository ) )? )
            // InternalCommunicationObject.g:95:3: ( (lv_imports_0_0= ruleCommRepositoryImport ) )* ( (lv_repository_1_0= ruleCommObjectsRepository ) )?
            {
            // InternalCommunicationObject.g:95:3: ( (lv_imports_0_0= ruleCommRepositoryImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCommunicationObject.g:96:4: (lv_imports_0_0= ruleCommRepositoryImport )
            	    {
            	    // InternalCommunicationObject.g:96:4: (lv_imports_0_0= ruleCommRepositoryImport )
            	    // InternalCommunicationObject.g:97:5: lv_imports_0_0= ruleCommRepositoryImport
            	    {

            	    					newCompositeNode(grammarAccess.getCommObjectModelAccess().getImportsCommRepositoryImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleCommRepositoryImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCommObjectModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"org.xtext.service.communicationObject.CommunicationObject.CommRepositoryImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCommunicationObject.g:114:3: ( (lv_repository_1_0= ruleCommObjectsRepository ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DOCU_COMMENT||LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCommunicationObject.g:115:4: (lv_repository_1_0= ruleCommObjectsRepository )
                    {
                    // InternalCommunicationObject.g:115:4: (lv_repository_1_0= ruleCommObjectsRepository )
                    // InternalCommunicationObject.g:116:5: lv_repository_1_0= ruleCommObjectsRepository
                    {

                    					newCompositeNode(grammarAccess.getCommObjectModelAccess().getRepositoryCommObjectsRepositoryParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repository_1_0=ruleCommObjectsRepository();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommObjectModelRule());
                    					}
                    					set(
                    						current,
                    						"repository",
                    						lv_repository_1_0,
                    						"org.xtext.service.communicationObject.CommunicationObject.CommObjectsRepository");
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
    // $ANTLR end "ruleCommObjectModel"


    // $ANTLR start "entryRuleFQNW"
    // InternalCommunicationObject.g:137:1: entryRuleFQNW returns [String current=null] : iv_ruleFQNW= ruleFQNW EOF ;
    public final String entryRuleFQNW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNW = null;


        try {
            // InternalCommunicationObject.g:137:44: (iv_ruleFQNW= ruleFQNW EOF )
            // InternalCommunicationObject.g:138:2: iv_ruleFQNW= ruleFQNW EOF
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
    // InternalCommunicationObject.g:144:1: ruleFQNW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFQNW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:150:2: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // InternalCommunicationObject.g:151:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // InternalCommunicationObject.g:151:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // InternalCommunicationObject.g:152:3: this_FQN_0= ruleFQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalCommunicationObject.g:162:3: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCommunicationObject.g:163:4: kw= '.*'
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


    // $ANTLR start "entryRuleCommRepositoryImport"
    // InternalCommunicationObject.g:173:1: entryRuleCommRepositoryImport returns [EObject current=null] : iv_ruleCommRepositoryImport= ruleCommRepositoryImport EOF ;
    public final EObject entryRuleCommRepositoryImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommRepositoryImport = null;


        try {
            // InternalCommunicationObject.g:173:61: (iv_ruleCommRepositoryImport= ruleCommRepositoryImport EOF )
            // InternalCommunicationObject.g:174:2: iv_ruleCommRepositoryImport= ruleCommRepositoryImport EOF
            {
             newCompositeNode(grammarAccess.getCommRepositoryImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommRepositoryImport=ruleCommRepositoryImport();

            state._fsp--;

             current =iv_ruleCommRepositoryImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommRepositoryImport"


    // $ANTLR start "ruleCommRepositoryImport"
    // InternalCommunicationObject.g:180:1: ruleCommRepositoryImport returns [EObject current=null] : (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleCommRepositoryImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:186:2: ( (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) )
            // InternalCommunicationObject.g:187:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            {
            // InternalCommunicationObject.g:187:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            // InternalCommunicationObject.g:188:3: otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCommRepositoryImportAccess().getImportKeyword_0());
            		
            // InternalCommunicationObject.g:192:3: ( (lv_importedNamespace_1_0= ruleFQNW ) )
            // InternalCommunicationObject.g:193:4: (lv_importedNamespace_1_0= ruleFQNW )
            {
            // InternalCommunicationObject.g:193:4: (lv_importedNamespace_1_0= ruleFQNW )
            // InternalCommunicationObject.g:194:5: lv_importedNamespace_1_0= ruleFQNW
            {

            					newCompositeNode(grammarAccess.getCommRepositoryImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_importedNamespace_1_0=ruleFQNW();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommRepositoryImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.xtext.service.communicationObject.CommunicationObject.FQNW");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCommunicationObject.g:211:3: (otherlv_2= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCommunicationObject.g:212:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommRepositoryImportAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleCommRepositoryImport"


    // $ANTLR start "entryRuleCommObjectsRepository"
    // InternalCommunicationObject.g:221:1: entryRuleCommObjectsRepository returns [EObject current=null] : iv_ruleCommObjectsRepository= ruleCommObjectsRepository EOF ;
    public final EObject entryRuleCommObjectsRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommObjectsRepository = null;


        try {
            // InternalCommunicationObject.g:221:62: (iv_ruleCommObjectsRepository= ruleCommObjectsRepository EOF )
            // InternalCommunicationObject.g:222:2: iv_ruleCommObjectsRepository= ruleCommObjectsRepository EOF
            {
             newCompositeNode(grammarAccess.getCommObjectsRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommObjectsRepository=ruleCommObjectsRepository();

            state._fsp--;

             current =iv_ruleCommObjectsRepository; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommObjectsRepository"


    // $ANTLR start "ruleCommObjectsRepository"
    // InternalCommunicationObject.g:228:1: ruleCommObjectsRepository returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CommObjectsRepository' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'version' ( (lv_version_4_0= ruleVersion ) ) )? otherlv_5= '{' (otherlv_6= 'Dependency' ( (lv_dependency_7_0= ruleEString ) ) (otherlv_8= ';' )? )? ( (lv_elements_9_0= ruleAbstractCommElement ) )* otherlv_10= '}' ) ;
    public final EObject ruleCommObjectsRepository() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_version_4_0 = null;

        AntlrDatatypeRuleToken lv_dependency_7_0 = null;

        EObject lv_elements_9_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:234:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CommObjectsRepository' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'version' ( (lv_version_4_0= ruleVersion ) ) )? otherlv_5= '{' (otherlv_6= 'Dependency' ( (lv_dependency_7_0= ruleEString ) ) (otherlv_8= ';' )? )? ( (lv_elements_9_0= ruleAbstractCommElement ) )* otherlv_10= '}' ) )
            // InternalCommunicationObject.g:235:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CommObjectsRepository' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'version' ( (lv_version_4_0= ruleVersion ) ) )? otherlv_5= '{' (otherlv_6= 'Dependency' ( (lv_dependency_7_0= ruleEString ) ) (otherlv_8= ';' )? )? ( (lv_elements_9_0= ruleAbstractCommElement ) )* otherlv_10= '}' )
            {
            // InternalCommunicationObject.g:235:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CommObjectsRepository' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'version' ( (lv_version_4_0= ruleVersion ) ) )? otherlv_5= '{' (otherlv_6= 'Dependency' ( (lv_dependency_7_0= ruleEString ) ) (otherlv_8= ';' )? )? ( (lv_elements_9_0= ruleAbstractCommElement ) )* otherlv_10= '}' )
            // InternalCommunicationObject.g:236:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CommObjectsRepository' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'version' ( (lv_version_4_0= ruleVersion ) ) )? otherlv_5= '{' (otherlv_6= 'Dependency' ( (lv_dependency_7_0= ruleEString ) ) (otherlv_8= ';' )? )? ( (lv_elements_9_0= ruleAbstractCommElement ) )* otherlv_10= '}'
            {
            // InternalCommunicationObject.g:236:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DOCU_COMMENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCommunicationObject.g:237:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalCommunicationObject.g:237:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalCommunicationObject.g:238:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_7); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getCommObjectsRepositoryAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCommObjectsRepositoryRule());
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

            			newLeafNode(otherlv_1, grammarAccess.getCommObjectsRepositoryAccess().getCommObjectsRepositoryKeyword_1());
            		
            // InternalCommunicationObject.g:258:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCommunicationObject.g:259:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCommunicationObject.g:259:4: (lv_name_2_0= RULE_ID )
            // InternalCommunicationObject.g:260:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCommObjectsRepositoryAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommObjectsRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCommunicationObject.g:276:3: (otherlv_3= 'version' ( (lv_version_4_0= ruleVersion ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCommunicationObject.g:277:4: otherlv_3= 'version' ( (lv_version_4_0= ruleVersion ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getCommObjectsRepositoryAccess().getVersionKeyword_3_0());
                    			
                    // InternalCommunicationObject.g:281:4: ( (lv_version_4_0= ruleVersion ) )
                    // InternalCommunicationObject.g:282:5: (lv_version_4_0= ruleVersion )
                    {
                    // InternalCommunicationObject.g:282:5: (lv_version_4_0= ruleVersion )
                    // InternalCommunicationObject.g:283:6: lv_version_4_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getCommObjectsRepositoryAccess().getVersionVersionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_version_4_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommObjectsRepositoryRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_4_0,
                    							"org.xtext.service.communicationObject.CommunicationObject.Version");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getCommObjectsRepositoryAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalCommunicationObject.g:305:3: (otherlv_6= 'Dependency' ( (lv_dependency_7_0= ruleEString ) ) (otherlv_8= ';' )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCommunicationObject.g:306:4: otherlv_6= 'Dependency' ( (lv_dependency_7_0= ruleEString ) ) (otherlv_8= ';' )?
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getCommObjectsRepositoryAccess().getDependencyKeyword_5_0());
                    			
                    // InternalCommunicationObject.g:310:4: ( (lv_dependency_7_0= ruleEString ) )
                    // InternalCommunicationObject.g:311:5: (lv_dependency_7_0= ruleEString )
                    {
                    // InternalCommunicationObject.g:311:5: (lv_dependency_7_0= ruleEString )
                    // InternalCommunicationObject.g:312:6: lv_dependency_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommObjectsRepositoryAccess().getDependencyEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_dependency_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommObjectsRepositoryRule());
                    						}
                    						set(
                    							current,
                    							"dependency",
                    							lv_dependency_7_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCommunicationObject.g:329:4: (otherlv_8= ';' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==16) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalCommunicationObject.g:330:5: otherlv_8= ';'
                            {
                            otherlv_8=(Token)match(input,16,FOLLOW_14); 

                            					newLeafNode(otherlv_8, grammarAccess.getCommObjectsRepositoryAccess().getSemicolonKeyword_5_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalCommunicationObject.g:336:3: ( (lv_elements_9_0= ruleAbstractCommElement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_DOCU_COMMENT||(LA9_0>=23 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCommunicationObject.g:337:4: (lv_elements_9_0= ruleAbstractCommElement )
            	    {
            	    // InternalCommunicationObject.g:337:4: (lv_elements_9_0= ruleAbstractCommElement )
            	    // InternalCommunicationObject.g:338:5: lv_elements_9_0= ruleAbstractCommElement
            	    {

            	    					newCompositeNode(grammarAccess.getCommObjectsRepositoryAccess().getElementsAbstractCommElementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_elements_9_0=ruleAbstractCommElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCommObjectsRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_9_0,
            	    						"org.xtext.service.communicationObject.CommunicationObject.AbstractCommElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCommObjectsRepositoryAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommObjectsRepository"


    // $ANTLR start "entryRuleVersion"
    // InternalCommunicationObject.g:363:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalCommunicationObject.g:363:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalCommunicationObject.g:364:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalCommunicationObject.g:370:1: ruleVersion returns [EObject current=null] : ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) (otherlv_3= '.' ( (lv_patch_4_0= RULE_INT ) ) )? ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token lv_major_0_0=null;
        Token otherlv_1=null;
        Token lv_minor_2_0=null;
        Token otherlv_3=null;
        Token lv_patch_4_0=null;


        	enterRule();

        try {
            // InternalCommunicationObject.g:376:2: ( ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) (otherlv_3= '.' ( (lv_patch_4_0= RULE_INT ) ) )? ) )
            // InternalCommunicationObject.g:377:2: ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) (otherlv_3= '.' ( (lv_patch_4_0= RULE_INT ) ) )? )
            {
            // InternalCommunicationObject.g:377:2: ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) (otherlv_3= '.' ( (lv_patch_4_0= RULE_INT ) ) )? )
            // InternalCommunicationObject.g:378:3: ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) (otherlv_3= '.' ( (lv_patch_4_0= RULE_INT ) ) )?
            {
            // InternalCommunicationObject.g:378:3: ( (lv_major_0_0= RULE_INT ) )
            // InternalCommunicationObject.g:379:4: (lv_major_0_0= RULE_INT )
            {
            // InternalCommunicationObject.g:379:4: (lv_major_0_0= RULE_INT )
            // InternalCommunicationObject.g:380:5: lv_major_0_0= RULE_INT
            {
            lv_major_0_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_major_0_0, grammarAccess.getVersionAccess().getMajorINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"major",
            						lv_major_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getFullStopKeyword_1());
            		
            // InternalCommunicationObject.g:400:3: ( (lv_minor_2_0= RULE_INT ) )
            // InternalCommunicationObject.g:401:4: (lv_minor_2_0= RULE_INT )
            {
            // InternalCommunicationObject.g:401:4: (lv_minor_2_0= RULE_INT )
            // InternalCommunicationObject.g:402:5: lv_minor_2_0= RULE_INT
            {
            lv_minor_2_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_minor_2_0, grammarAccess.getVersionAccess().getMinorINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minor",
            						lv_minor_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalCommunicationObject.g:418:3: (otherlv_3= '.' ( (lv_patch_4_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCommunicationObject.g:419:4: otherlv_3= '.' ( (lv_patch_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getVersionAccess().getFullStopKeyword_3_0());
                    			
                    // InternalCommunicationObject.g:423:4: ( (lv_patch_4_0= RULE_INT ) )
                    // InternalCommunicationObject.g:424:5: (lv_patch_4_0= RULE_INT )
                    {
                    // InternalCommunicationObject.g:424:5: (lv_patch_4_0= RULE_INT )
                    // InternalCommunicationObject.g:425:6: lv_patch_4_0= RULE_INT
                    {
                    lv_patch_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_patch_4_0, grammarAccess.getVersionAccess().getPatchINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVersionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"patch",
                    							lv_patch_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleAbstractCommElement"
    // InternalCommunicationObject.g:446:1: entryRuleAbstractCommElement returns [EObject current=null] : iv_ruleAbstractCommElement= ruleAbstractCommElement EOF ;
    public final EObject entryRuleAbstractCommElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCommElement = null;


        try {
            // InternalCommunicationObject.g:446:60: (iv_ruleAbstractCommElement= ruleAbstractCommElement EOF )
            // InternalCommunicationObject.g:447:2: iv_ruleAbstractCommElement= ruleAbstractCommElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractCommElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractCommElement=ruleAbstractCommElement();

            state._fsp--;

             current =iv_ruleAbstractCommElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractCommElement"


    // $ANTLR start "ruleAbstractCommElement"
    // InternalCommunicationObject.g:453:1: ruleAbstractCommElement returns [EObject current=null] : (this_Enumeration_0= ruleEnumeration | this_CommunicationObject_1= ruleCommunicationObject ) ;
    public final EObject ruleAbstractCommElement() throws RecognitionException {
        EObject current = null;

        EObject this_Enumeration_0 = null;

        EObject this_CommunicationObject_1 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:459:2: ( (this_Enumeration_0= ruleEnumeration | this_CommunicationObject_1= ruleCommunicationObject ) )
            // InternalCommunicationObject.g:460:2: (this_Enumeration_0= ruleEnumeration | this_CommunicationObject_1= ruleCommunicationObject )
            {
            // InternalCommunicationObject.g:460:2: (this_Enumeration_0= ruleEnumeration | this_CommunicationObject_1= ruleCommunicationObject )
            int alt11=2;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==24) ) {
                    alt11=1;
                }
                else if ( (LA11_1==23) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt11=1;
                }
                break;
            case 23:
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
                    // InternalCommunicationObject.g:461:3: this_Enumeration_0= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getAbstractCommElementAccess().getEnumerationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_0=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:470:3: this_CommunicationObject_1= ruleCommunicationObject
                    {

                    			newCompositeNode(grammarAccess.getAbstractCommElementAccess().getCommunicationObjectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommunicationObject_1=ruleCommunicationObject();

                    state._fsp--;


                    			current = this_CommunicationObject_1;
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
    // $ANTLR end "ruleAbstractCommElement"


    // $ANTLR start "entryRuleCommunicationObject"
    // InternalCommunicationObject.g:482:1: entryRuleCommunicationObject returns [EObject current=null] : iv_ruleCommunicationObject= ruleCommunicationObject EOF ;
    public final EObject entryRuleCommunicationObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationObject = null;


        try {
            // InternalCommunicationObject.g:482:60: (iv_ruleCommunicationObject= ruleCommunicationObject EOF )
            // InternalCommunicationObject.g:483:2: iv_ruleCommunicationObject= ruleCommunicationObject EOF
            {
             newCompositeNode(grammarAccess.getCommunicationObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommunicationObject=ruleCommunicationObject();

            state._fsp--;

             current =iv_ruleCommunicationObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommunicationObject"


    // $ANTLR start "ruleCommunicationObject"
    // InternalCommunicationObject.g:489:1: ruleCommunicationObject returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CommObject' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleCommunicationObject() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:495:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CommObject' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' ) )
            // InternalCommunicationObject.g:496:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CommObject' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' )
            {
            // InternalCommunicationObject.g:496:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CommObject' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}' )
            // InternalCommunicationObject.g:497:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'CommObject' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeDefinition ) )* otherlv_5= '}'
            {
            // InternalCommunicationObject.g:497:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DOCU_COMMENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCommunicationObject.g:498:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalCommunicationObject.g:498:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalCommunicationObject.g:499:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_17); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getCommunicationObjectAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCommunicationObjectRule());
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

            			newLeafNode(otherlv_1, grammarAccess.getCommunicationObjectAccess().getCommObjectKeyword_1());
            		
            // InternalCommunicationObject.g:519:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCommunicationObject.g:520:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCommunicationObject.g:520:4: (lv_name_2_0= RULE_ID )
            // InternalCommunicationObject.g:521:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCommunicationObjectAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getCommunicationObjectAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCommunicationObject.g:541:3: ( (lv_attributes_4_0= ruleAttributeDefinition ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_DOCU_COMMENT && LA13_0<=RULE_ID)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCommunicationObject.g:542:4: (lv_attributes_4_0= ruleAttributeDefinition )
            	    {
            	    // InternalCommunicationObject.g:542:4: (lv_attributes_4_0= ruleAttributeDefinition )
            	    // InternalCommunicationObject.g:543:5: lv_attributes_4_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getCommunicationObjectAccess().getAttributesAttributeDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_attributes_4_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCommunicationObjectRule());
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCommunicationObjectAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommunicationObject"


    // $ANTLR start "entryRuleEnumeration"
    // InternalCommunicationObject.g:568:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalCommunicationObject.g:568:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalCommunicationObject.g:569:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalCommunicationObject.g:575:1: ruleEnumeration returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_enums_4_0= ruleEnumerationElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_enums_4_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:581:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_enums_4_0= ruleEnumerationElement ) )* otherlv_5= '}' ) )
            // InternalCommunicationObject.g:582:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_enums_4_0= ruleEnumerationElement ) )* otherlv_5= '}' )
            {
            // InternalCommunicationObject.g:582:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_enums_4_0= ruleEnumerationElement ) )* otherlv_5= '}' )
            // InternalCommunicationObject.g:583:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_enums_4_0= ruleEnumerationElement ) )* otherlv_5= '}'
            {
            // InternalCommunicationObject.g:583:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DOCU_COMMENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCommunicationObject.g:584:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalCommunicationObject.g:584:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalCommunicationObject.g:585:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_19); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getEnumerationAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEnumerationRule());
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

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumerationKeyword_1());
            		
            // InternalCommunicationObject.g:605:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCommunicationObject.g:606:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCommunicationObject.g:606:4: (lv_name_2_0= RULE_ID )
            // InternalCommunicationObject.g:607:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCommunicationObject.g:627:3: ( (lv_enums_4_0= ruleEnumerationElement ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCommunicationObject.g:628:4: (lv_enums_4_0= ruleEnumerationElement )
            	    {
            	    // InternalCommunicationObject.g:628:4: (lv_enums_4_0= ruleEnumerationElement )
            	    // InternalCommunicationObject.g:629:5: lv_enums_4_0= ruleEnumerationElement
            	    {

            	    					newCompositeNode(grammarAccess.getEnumerationAccess().getEnumsEnumerationElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_enums_4_0=ruleEnumerationElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"enums",
            	    						lv_enums_4_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.EnumerationElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleAbstractAttributeType"
    // InternalCommunicationObject.g:654:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // InternalCommunicationObject.g:654:62: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // InternalCommunicationObject.g:655:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
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
    // InternalCommunicationObject.g:661:1: ruleAbstractAttributeType returns [EObject current=null] : (this_CommElementReference_0= ruleCommElementReference | this_AbstractAttributeType_1= superAbstractAttributeType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_CommElementReference_0 = null;

        EObject this_AbstractAttributeType_1 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:667:2: ( (this_CommElementReference_0= ruleCommElementReference | this_AbstractAttributeType_1= superAbstractAttributeType ) )
            // InternalCommunicationObject.g:668:2: (this_CommElementReference_0= ruleCommElementReference | this_AbstractAttributeType_1= superAbstractAttributeType )
            {
            // InternalCommunicationObject.g:668:2: (this_CommElementReference_0= ruleCommElementReference | this_AbstractAttributeType_1= superAbstractAttributeType )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==34||(LA16_0>=39 && LA16_0<=50)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCommunicationObject.g:669:3: this_CommElementReference_0= ruleCommElementReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getCommElementReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommElementReference_0=ruleCommElementReference();

                    state._fsp--;


                    			current = this_CommElementReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:678:3: this_AbstractAttributeType_1= superAbstractAttributeType
                    {

                    			newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getAbstractAttributeTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractAttributeType_1=superAbstractAttributeType();

                    state._fsp--;


                    			current = this_AbstractAttributeType_1;
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


    // $ANTLR start "entryRuleCommElementReference"
    // InternalCommunicationObject.g:690:1: entryRuleCommElementReference returns [EObject current=null] : iv_ruleCommElementReference= ruleCommElementReference EOF ;
    public final EObject entryRuleCommElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommElementReference = null;


        try {
            // InternalCommunicationObject.g:690:61: (iv_ruleCommElementReference= ruleCommElementReference EOF )
            // InternalCommunicationObject.g:691:2: iv_ruleCommElementReference= ruleCommElementReference EOF
            {
             newCompositeNode(grammarAccess.getCommElementReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommElementReference=ruleCommElementReference();

            state._fsp--;

             current =iv_ruleCommElementReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommElementReference"


    // $ANTLR start "ruleCommElementReference"
    // InternalCommunicationObject.g:697:1: ruleCommElementReference returns [EObject current=null] : ( ( ( ruleFQN ) ) ( (lv_array_1_0= ruleArrayType ) )? ) ;
    public final EObject ruleCommElementReference() throws RecognitionException {
        EObject current = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:703:2: ( ( ( ( ruleFQN ) ) ( (lv_array_1_0= ruleArrayType ) )? ) )
            // InternalCommunicationObject.g:704:2: ( ( ( ruleFQN ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            {
            // InternalCommunicationObject.g:704:2: ( ( ( ruleFQN ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            // InternalCommunicationObject.g:705:3: ( ( ruleFQN ) ) ( (lv_array_1_0= ruleArrayType ) )?
            {
            // InternalCommunicationObject.g:705:3: ( ( ruleFQN ) )
            // InternalCommunicationObject.g:706:4: ( ruleFQN )
            {
            // InternalCommunicationObject.g:706:4: ( ruleFQN )
            // InternalCommunicationObject.g:707:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommElementReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCommElementReferenceAccess().getTypeNameAbstractCommElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_21);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCommunicationObject.g:721:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCommunicationObject.g:722:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalCommunicationObject.g:722:4: (lv_array_1_0= ruleArrayType )
                    // InternalCommunicationObject.g:723:5: lv_array_1_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getCommElementReferenceAccess().getArrayArrayTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_1_0=ruleArrayType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommElementReferenceRule());
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
    // $ANTLR end "ruleCommElementReference"


    // $ANTLR start "entryRuleSingleValue"
    // InternalCommunicationObject.g:744:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalCommunicationObject.g:744:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalCommunicationObject.g:745:2: iv_ruleSingleValue= ruleSingleValue EOF
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
    // InternalCommunicationObject.g:751:1: ruleSingleValue returns [EObject current=null] : ( ( () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')' ) | this_SingleValue_4= superSingleValue ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_SingleValue_4 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:757:2: ( ( ( () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')' ) | this_SingleValue_4= superSingleValue ) )
            // InternalCommunicationObject.g:758:2: ( ( () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')' ) | this_SingleValue_4= superSingleValue )
            {
            // InternalCommunicationObject.g:758:2: ( ( () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')' ) | this_SingleValue_4= superSingleValue )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalCommunicationObject.g:759:3: ( () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')' )
                    {
                    // InternalCommunicationObject.g:759:3: ( () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')' )
                    // InternalCommunicationObject.g:760:4: () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')'
                    {
                    // InternalCommunicationObject.g:760:4: ()
                    // InternalCommunicationObject.g:761:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getCommElementValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCommunicationObject.g:767:4: ( ( ruleFQN ) )
                    // InternalCommunicationObject.g:768:5: ( ruleFQN )
                    {
                    // InternalCommunicationObject.g:768:5: ( ruleFQN )
                    // InternalCommunicationObject.g:769:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleValueRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueAbstractCommElementCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,25,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getSingleValueAccess().getLeftParenthesisKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSingleValueAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:793:3: this_SingleValue_4= superSingleValue
                    {

                    			newCompositeNode(grammarAccess.getSingleValueAccess().getSingleValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleValue_4=superSingleValue();

                    state._fsp--;


                    			current = this_SingleValue_4;
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
    // $ANTLR end "ruleSingleValue"


    // $ANTLR start "entryRuleAttributeDefinition"
    // InternalCommunicationObject.g:805:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalCommunicationObject.g:805:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalCommunicationObject.g:806:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
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
    // InternalCommunicationObject.g:812:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? ) ;
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
            // InternalCommunicationObject.g:818:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? ) )
            // InternalCommunicationObject.g:819:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? )
            {
            // InternalCommunicationObject.g:819:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? )
            // InternalCommunicationObject.g:820:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )?
            {
            // InternalCommunicationObject.g:820:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DOCU_COMMENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCommunicationObject.g:821:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalCommunicationObject.g:821:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalCommunicationObject.g:822:5: lv_documentation_0_0= RULE_DOCU_COMMENT
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

            // InternalCommunicationObject.g:838:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCommunicationObject.g:839:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCommunicationObject.g:839:4: (lv_name_1_0= RULE_ID )
            // InternalCommunicationObject.g:840:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2());
            		
            // InternalCommunicationObject.g:860:3: ( (lv_type_3_0= ruleAbstractAttributeType ) )
            // InternalCommunicationObject.g:861:4: (lv_type_3_0= ruleAbstractAttributeType )
            {
            // InternalCommunicationObject.g:861:4: (lv_type_3_0= ruleAbstractAttributeType )
            // InternalCommunicationObject.g:862:5: lv_type_3_0= ruleAbstractAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_type_3_0=ruleAbstractAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.service.communicationObject.CommunicationObject.AbstractAttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCommunicationObject.g:879:3: (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCommunicationObject.g:880:4: otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalCommunicationObject.g:884:4: ( (lv_defaultvalue_5_0= ruleAbstractValue ) )
                    // InternalCommunicationObject.g:885:5: (lv_defaultvalue_5_0= ruleAbstractValue )
                    {
                    // InternalCommunicationObject.g:885:5: (lv_defaultvalue_5_0= ruleAbstractValue )
                    // InternalCommunicationObject.g:886:6: lv_defaultvalue_5_0= ruleAbstractValue
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

            // InternalCommunicationObject.g:904:3: (otherlv_6= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCommunicationObject.g:905:4: otherlv_6= ';'
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
    // InternalCommunicationObject.g:914:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCommunicationObject.g:914:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalCommunicationObject.g:915:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalCommunicationObject.g:921:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCommunicationObject.g:927:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCommunicationObject.g:928:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCommunicationObject.g:928:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCommunicationObject.g:929:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalCommunicationObject.g:936:3: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCommunicationObject.g:937:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_16); 

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


    // $ANTLR start "entryRuleEBoolean"
    // InternalCommunicationObject.g:954:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalCommunicationObject.g:954:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalCommunicationObject.g:955:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalCommunicationObject.g:961:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCommunicationObject.g:967:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalCommunicationObject.g:968:2: (kw= 'true' | kw= 'false' )
            {
            // InternalCommunicationObject.g:968:2: (kw= 'true' | kw= 'false' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            else if ( (LA23_0==30) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalCommunicationObject.g:969:3: kw= 'true'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:975:3: kw= 'false'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

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
    // InternalCommunicationObject.g:984:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCommunicationObject.g:984:47: (iv_ruleEString= ruleEString EOF )
            // InternalCommunicationObject.g:985:2: iv_ruleEString= ruleEString EOF
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
    // InternalCommunicationObject.g:991:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalCommunicationObject.g:997:2: (this_STRING_0= RULE_STRING )
            // InternalCommunicationObject.g:998:2: this_STRING_0= RULE_STRING
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
    // InternalCommunicationObject.g:1008:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalCommunicationObject.g:1008:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalCommunicationObject.g:1009:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalCommunicationObject.g:1015:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCommunicationObject.g:1021:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalCommunicationObject.g:1022:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalCommunicationObject.g:1022:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalCommunicationObject.g:1023:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalCommunicationObject.g:1023:3: (kw= '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCommunicationObject.g:1024:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_9); 

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
    // InternalCommunicationObject.g:1041:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalCommunicationObject.g:1041:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalCommunicationObject.g:1042:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalCommunicationObject.g:1048:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalCommunicationObject.g:1054:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalCommunicationObject.g:1055:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalCommunicationObject.g:1055:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalCommunicationObject.g:1056:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalCommunicationObject.g:1056:3: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCommunicationObject.g:1057:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalCommunicationObject.g:1063:3: (this_INT_1= RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCommunicationObject.g:1064:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_15); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,22,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_29); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalCommunicationObject.g:1084:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=32 && LA29_0<=33)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCommunicationObject.g:1085:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalCommunicationObject.g:1085:4: (kw= 'E' | kw= 'e' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==32) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==33) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalCommunicationObject.g:1086:5: kw= 'E'
                            {
                            kw=(Token)match(input,32,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalCommunicationObject.g:1092:5: kw= 'e'
                            {
                            kw=(Token)match(input,33,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalCommunicationObject.g:1098:4: (kw= '-' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==31) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalCommunicationObject.g:1099:5: kw= '-'
                            {
                            kw=(Token)match(input,31,FOLLOW_9); 

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
    // InternalCommunicationObject.g:1117:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalCommunicationObject.g:1117:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalCommunicationObject.g:1118:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
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
    // InternalCommunicationObject.g:1124:1: ruleEnumerationElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1130:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) )
            // InternalCommunicationObject.g:1131:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            {
            // InternalCommunicationObject.g:1131:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            // InternalCommunicationObject.g:1132:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )?
            {
            // InternalCommunicationObject.g:1132:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCommunicationObject.g:1133:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCommunicationObject.g:1133:4: (lv_name_0_0= RULE_ID )
            // InternalCommunicationObject.g:1134:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalCommunicationObject.g:1150:3: (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCommunicationObject.g:1151:4: otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalCommunicationObject.g:1155:4: ( (lv_value_2_0= ruleEInt ) )
                    // InternalCommunicationObject.g:1156:5: (lv_value_2_0= ruleEInt )
                    {
                    // InternalCommunicationObject.g:1156:5: (lv_value_2_0= ruleEInt )
                    // InternalCommunicationObject.g:1157:6: lv_value_2_0= ruleEInt
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

            // InternalCommunicationObject.g:1175:3: (otherlv_3= ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==16) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCommunicationObject.g:1176:4: otherlv_3= ';'
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


    // $ANTLR start "entrySuperAbstractAttributeType"
    // InternalCommunicationObject.g:1185:1: entrySuperAbstractAttributeType returns [EObject current=null] : iv_superAbstractAttributeType= superAbstractAttributeType EOF ;
    public final EObject entrySuperAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_superAbstractAttributeType = null;


        try {
            // InternalCommunicationObject.g:1185:63: (iv_superAbstractAttributeType= superAbstractAttributeType EOF )
            // InternalCommunicationObject.g:1186:2: iv_superAbstractAttributeType= superAbstractAttributeType EOF
            {
             newCompositeNode(grammarAccess.getBasicAttributesAbstractAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_superAbstractAttributeType=superAbstractAttributeType();

            state._fsp--;

             current =iv_superAbstractAttributeType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entrySuperAbstractAttributeType"


    // $ANTLR start "superAbstractAttributeType"
    // InternalCommunicationObject.g:1192:1: superAbstractAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) ;
    public final EObject superAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_InlineEnumerationType_1 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1198:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) )
            // InternalCommunicationObject.g:1199:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            {
            // InternalCommunicationObject.g:1199:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=39 && LA32_0<=50)) ) {
                alt32=1;
            }
            else if ( (LA32_0==34) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalCommunicationObject.g:1200:3: this_PrimitiveType_0= rulePrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;


                    			current = this_PrimitiveType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:1209:3: this_InlineEnumerationType_1= ruleInlineEnumerationType
                    {

                    			newCompositeNode(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getInlineEnumerationTypeParserRuleCall_1());
                    		
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
    // $ANTLR end "superAbstractAttributeType"


    // $ANTLR start "entryRuleInlineEnumerationType"
    // InternalCommunicationObject.g:1221:1: entryRuleInlineEnumerationType returns [EObject current=null] : iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF ;
    public final EObject entryRuleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineEnumerationType = null;


        try {
            // InternalCommunicationObject.g:1221:62: (iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF )
            // InternalCommunicationObject.g:1222:2: iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF
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
    // InternalCommunicationObject.g:1228:1: ruleInlineEnumerationType returns [EObject current=null] : (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_array_1_0 = null;

        EObject lv_enums_3_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1234:2: ( (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) )
            // InternalCommunicationObject.g:1235:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            {
            // InternalCommunicationObject.g:1235:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            // InternalCommunicationObject.g:1236:3: otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0());
            		
            // InternalCommunicationObject.g:1240:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCommunicationObject.g:1241:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalCommunicationObject.g:1241:4: (lv_array_1_0= ruleArrayType )
                    // InternalCommunicationObject.g:1242:5: lv_array_1_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getArrayArrayTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCommunicationObject.g:1263:3: ( (lv_enums_3_0= ruleEnumerationElement ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCommunicationObject.g:1264:4: (lv_enums_3_0= ruleEnumerationElement )
            	    {
            	    // InternalCommunicationObject.g:1264:4: (lv_enums_3_0= ruleEnumerationElement )
            	    // InternalCommunicationObject.g:1265:5: lv_enums_3_0= ruleEnumerationElement
            	    {

            	    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalCommunicationObject.g:1290:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalCommunicationObject.g:1290:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalCommunicationObject.g:1291:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalCommunicationObject.g:1297:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1303:2: ( ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) )
            // InternalCommunicationObject.g:1304:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            {
            // InternalCommunicationObject.g:1304:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            // InternalCommunicationObject.g:1305:3: () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']'
            {
            // InternalCommunicationObject.g:1305:3: ()
            // InternalCommunicationObject.g:1306:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalCommunicationObject.g:1316:3: ( (lv_length_2_0= ruleCardinality ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT||LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCommunicationObject.g:1317:4: (lv_length_2_0= ruleCardinality )
                    {
                    // InternalCommunicationObject.g:1317:4: (lv_length_2_0= ruleCardinality )
                    // InternalCommunicationObject.g:1318:5: lv_length_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_33);
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

            otherlv_3=(Token)match(input,36,FOLLOW_2); 

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
    // InternalCommunicationObject.g:1343:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalCommunicationObject.g:1343:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalCommunicationObject.g:1344:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalCommunicationObject.g:1350:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalCommunicationObject.g:1356:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalCommunicationObject.g:1357:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalCommunicationObject.g:1357:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            else if ( (LA36_0==37) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalCommunicationObject.g:1358:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:1366:3: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalCommunicationObject.g:1375:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalCommunicationObject.g:1375:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalCommunicationObject.g:1376:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalCommunicationObject.g:1382:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeName_0_0 = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1388:2: ( ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) )
            // InternalCommunicationObject.g:1389:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            {
            // InternalCommunicationObject.g:1389:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            // InternalCommunicationObject.g:1390:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )?
            {
            // InternalCommunicationObject.g:1390:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) )
            // InternalCommunicationObject.g:1391:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            {
            // InternalCommunicationObject.g:1391:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            // InternalCommunicationObject.g:1392:5: lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalCommunicationObject.g:1409:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCommunicationObject.g:1410:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalCommunicationObject.g:1410:4: (lv_array_1_0= ruleArrayType )
                    // InternalCommunicationObject.g:1411:5: lv_array_1_0= ruleArrayType
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
    // InternalCommunicationObject.g:1432:1: entryRuleAbstractValue returns [EObject current=null] : iv_ruleAbstractValue= ruleAbstractValue EOF ;
    public final EObject entryRuleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractValue = null;


        try {
            // InternalCommunicationObject.g:1432:54: (iv_ruleAbstractValue= ruleAbstractValue EOF )
            // InternalCommunicationObject.g:1433:2: iv_ruleAbstractValue= ruleAbstractValue EOF
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
    // InternalCommunicationObject.g:1439:1: ruleAbstractValue returns [EObject current=null] : (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) ;
    public final EObject ruleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValue_0 = null;

        EObject this_ArrayValue_1 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1445:2: ( (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) )
            // InternalCommunicationObject.g:1446:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            {
            // InternalCommunicationObject.g:1446:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STRING)||LA38_0==22||(LA38_0>=29 && LA38_0<=31)) ) {
                alt38=1;
            }
            else if ( (LA38_0==35) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalCommunicationObject.g:1447:3: this_SingleValue_0= ruleSingleValue
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
                    // InternalCommunicationObject.g:1456:3: this_ArrayValue_1= ruleArrayValue
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
    // InternalCommunicationObject.g:1468:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalCommunicationObject.g:1468:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalCommunicationObject.g:1469:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalCommunicationObject.g:1475:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1481:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) )
            // InternalCommunicationObject.g:1482:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            {
            // InternalCommunicationObject.g:1482:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            // InternalCommunicationObject.g:1483:3: otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalCommunicationObject.g:1487:3: ( (lv_values_1_0= ruleSingleValue ) )
            // InternalCommunicationObject.g:1488:4: (lv_values_1_0= ruleSingleValue )
            {
            // InternalCommunicationObject.g:1488:4: (lv_values_1_0= ruleSingleValue )
            // InternalCommunicationObject.g:1489:5: lv_values_1_0= ruleSingleValue
            {

            					newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_values_1_0=ruleSingleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrayValueRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_1_0,
            						"org.xtext.service.communicationObject.CommunicationObject.SingleValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCommunicationObject.g:1506:3: (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==38) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalCommunicationObject.g:1507:4: otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_34); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalCommunicationObject.g:1511:4: ( (lv_values_3_0= ruleSingleValue ) )
            	    // InternalCommunicationObject.g:1512:5: (lv_values_3_0= ruleSingleValue )
            	    {
            	    // InternalCommunicationObject.g:1512:5: (lv_values_3_0= ruleSingleValue )
            	    // InternalCommunicationObject.g:1513:6: lv_values_3_0= ruleSingleValue
            	    {

            	    						newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_values_3_0=ruleSingleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArrayValueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.xtext.service.communicationObject.CommunicationObject.SingleValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "entrySuperSingleValue"
    // InternalCommunicationObject.g:1539:1: entrySuperSingleValue returns [EObject current=null] : iv_superSingleValue= superSingleValue EOF ;
    public final EObject entrySuperSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_superSingleValue = null;


        try {
            // InternalCommunicationObject.g:1539:53: (iv_superSingleValue= superSingleValue EOF )
            // InternalCommunicationObject.g:1540:2: iv_superSingleValue= superSingleValue EOF
            {
             newCompositeNode(grammarAccess.getBasicAttributesSingleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_superSingleValue=superSingleValue();

            state._fsp--;

             current =iv_superSingleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entrySuperSingleValue"


    // $ANTLR start "superSingleValue"
    // InternalCommunicationObject.g:1546:1: superSingleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) ;
    public final EObject superSingleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1552:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) )
            // InternalCommunicationObject.g:1553:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            {
            // InternalCommunicationObject.g:1553:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==RULE_INT) ) {
                    int LA40_2 = input.LA(3);

                    if ( (LA40_2==EOF||(LA40_2>=RULE_DOCU_COMMENT && LA40_2<=RULE_ID)||LA40_2==16||LA40_2==21||LA40_2==36||LA40_2==38) ) {
                        alt40=1;
                    }
                    else if ( (LA40_2==22) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA40_1==22) ) {
                    alt40=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==EOF||(LA40_2>=RULE_DOCU_COMMENT && LA40_2<=RULE_ID)||LA40_2==16||LA40_2==21||LA40_2==36||LA40_2==38) ) {
                    alt40=1;
                }
                else if ( (LA40_2==22) ) {
                    alt40=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt40=2;
                }
                break;
            case RULE_STRING:
                {
                alt40=3;
                }
                break;
            case 29:
            case 30:
                {
                alt40=4;
                }
                break;
            case RULE_ID:
                {
                alt40=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalCommunicationObject.g:1554:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalCommunicationObject.g:1554:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalCommunicationObject.g:1555:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalCommunicationObject.g:1555:4: ()
                    // InternalCommunicationObject.g:1556:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicAttributesSingleValueAccess().getIntValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCommunicationObject.g:1562:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalCommunicationObject.g:1563:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalCommunicationObject.g:1563:5: (lv_value_1_0= ruleEInt )
                    // InternalCommunicationObject.g:1564:6: lv_value_1_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBasicAttributesSingleValueAccess().getValueEIntParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicAttributesSingleValueRule());
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
                    // InternalCommunicationObject.g:1583:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    {
                    // InternalCommunicationObject.g:1583:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    // InternalCommunicationObject.g:1584:4: () ( (lv_value_3_0= ruleEDouble ) )
                    {
                    // InternalCommunicationObject.g:1584:4: ()
                    // InternalCommunicationObject.g:1585:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicAttributesSingleValueAccess().getFloatingPointValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCommunicationObject.g:1591:4: ( (lv_value_3_0= ruleEDouble ) )
                    // InternalCommunicationObject.g:1592:5: (lv_value_3_0= ruleEDouble )
                    {
                    // InternalCommunicationObject.g:1592:5: (lv_value_3_0= ruleEDouble )
                    // InternalCommunicationObject.g:1593:6: lv_value_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getBasicAttributesSingleValueAccess().getValueEDoubleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicAttributesSingleValueRule());
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
                    // InternalCommunicationObject.g:1612:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    {
                    // InternalCommunicationObject.g:1612:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    // InternalCommunicationObject.g:1613:4: () ( (lv_value_5_0= ruleEString ) )
                    {
                    // InternalCommunicationObject.g:1613:4: ()
                    // InternalCommunicationObject.g:1614:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicAttributesSingleValueAccess().getStringValueAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCommunicationObject.g:1620:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalCommunicationObject.g:1621:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalCommunicationObject.g:1621:5: (lv_value_5_0= ruleEString )
                    // InternalCommunicationObject.g:1622:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBasicAttributesSingleValueAccess().getValueEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicAttributesSingleValueRule());
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
                    // InternalCommunicationObject.g:1641:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    {
                    // InternalCommunicationObject.g:1641:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    // InternalCommunicationObject.g:1642:4: () ( (lv_value_7_0= ruleEBoolean ) )
                    {
                    // InternalCommunicationObject.g:1642:4: ()
                    // InternalCommunicationObject.g:1643:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicAttributesSingleValueAccess().getBoolValueAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCommunicationObject.g:1649:4: ( (lv_value_7_0= ruleEBoolean ) )
                    // InternalCommunicationObject.g:1650:5: (lv_value_7_0= ruleEBoolean )
                    {
                    // InternalCommunicationObject.g:1650:5: (lv_value_7_0= ruleEBoolean )
                    // InternalCommunicationObject.g:1651:6: lv_value_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getBasicAttributesSingleValueAccess().getValueEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicAttributesSingleValueRule());
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
                    // InternalCommunicationObject.g:1670:3: ( () ( ( ruleFQN ) ) )
                    {
                    // InternalCommunicationObject.g:1670:3: ( () ( ( ruleFQN ) ) )
                    // InternalCommunicationObject.g:1671:4: () ( ( ruleFQN ) )
                    {
                    // InternalCommunicationObject.g:1671:4: ()
                    // InternalCommunicationObject.g:1672:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicAttributesSingleValueAccess().getEnumerationValueAction_4_0(),
                    						current);
                    				

                    }

                    // InternalCommunicationObject.g:1678:4: ( ( ruleFQN ) )
                    // InternalCommunicationObject.g:1679:5: ( ruleFQN )
                    {
                    // InternalCommunicationObject.g:1679:5: ( ruleFQN )
                    // InternalCommunicationObject.g:1680:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicAttributesSingleValueRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBasicAttributesSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0());
                    					
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
    // $ANTLR end "superSingleValue"


    // $ANTLR start "rulePRIMITIVE_TYPE_NAME"
    // InternalCommunicationObject.g:1699:1: rulePRIMITIVE_TYPE_NAME returns [Enumerator current=null] : ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) ;
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
            // InternalCommunicationObject.g:1705:2: ( ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) )
            // InternalCommunicationObject.g:1706:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            {
            // InternalCommunicationObject.g:1706:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            int alt41=12;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt41=1;
                }
                break;
            case 40:
                {
                alt41=2;
                }
                break;
            case 41:
                {
                alt41=3;
                }
                break;
            case 42:
                {
                alt41=4;
                }
                break;
            case 43:
                {
                alt41=5;
                }
                break;
            case 44:
                {
                alt41=6;
                }
                break;
            case 45:
                {
                alt41=7;
                }
                break;
            case 46:
                {
                alt41=8;
                }
                break;
            case 47:
                {
                alt41=9;
                }
                break;
            case 48:
                {
                alt41=10;
                }
                break;
            case 49:
                {
                alt41=11;
                }
                break;
            case 50:
                {
                alt41=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalCommunicationObject.g:1707:3: (enumLiteral_0= 'Int8' )
                    {
                    // InternalCommunicationObject.g:1707:3: (enumLiteral_0= 'Int8' )
                    // InternalCommunicationObject.g:1708:4: enumLiteral_0= 'Int8'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:1715:3: (enumLiteral_1= 'Int16' )
                    {
                    // InternalCommunicationObject.g:1715:3: (enumLiteral_1= 'Int16' )
                    // InternalCommunicationObject.g:1716:4: enumLiteral_1= 'Int16'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCommunicationObject.g:1723:3: (enumLiteral_2= 'Int32' )
                    {
                    // InternalCommunicationObject.g:1723:3: (enumLiteral_2= 'Int32' )
                    // InternalCommunicationObject.g:1724:4: enumLiteral_2= 'Int32'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCommunicationObject.g:1731:3: (enumLiteral_3= 'Int64' )
                    {
                    // InternalCommunicationObject.g:1731:3: (enumLiteral_3= 'Int64' )
                    // InternalCommunicationObject.g:1732:4: enumLiteral_3= 'Int64'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCommunicationObject.g:1739:3: (enumLiteral_4= 'UInt8' )
                    {
                    // InternalCommunicationObject.g:1739:3: (enumLiteral_4= 'UInt8' )
                    // InternalCommunicationObject.g:1740:4: enumLiteral_4= 'UInt8'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCommunicationObject.g:1747:3: (enumLiteral_5= 'UInt16' )
                    {
                    // InternalCommunicationObject.g:1747:3: (enumLiteral_5= 'UInt16' )
                    // InternalCommunicationObject.g:1748:4: enumLiteral_5= 'UInt16'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCommunicationObject.g:1755:3: (enumLiteral_6= 'UInt32' )
                    {
                    // InternalCommunicationObject.g:1755:3: (enumLiteral_6= 'UInt32' )
                    // InternalCommunicationObject.g:1756:4: enumLiteral_6= 'UInt32'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalCommunicationObject.g:1763:3: (enumLiteral_7= 'UInt64' )
                    {
                    // InternalCommunicationObject.g:1763:3: (enumLiteral_7= 'UInt64' )
                    // InternalCommunicationObject.g:1764:4: enumLiteral_7= 'UInt64'
                    {
                    enumLiteral_7=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalCommunicationObject.g:1771:3: (enumLiteral_8= 'Float' )
                    {
                    // InternalCommunicationObject.g:1771:3: (enumLiteral_8= 'Float' )
                    // InternalCommunicationObject.g:1772:4: enumLiteral_8= 'Float'
                    {
                    enumLiteral_8=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalCommunicationObject.g:1779:3: (enumLiteral_9= 'Double' )
                    {
                    // InternalCommunicationObject.g:1779:3: (enumLiteral_9= 'Double' )
                    // InternalCommunicationObject.g:1780:4: enumLiteral_9= 'Double'
                    {
                    enumLiteral_9=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalCommunicationObject.g:1787:3: (enumLiteral_10= 'String' )
                    {
                    // InternalCommunicationObject.g:1787:3: (enumLiteral_10= 'String' )
                    // InternalCommunicationObject.g:1788:4: enumLiteral_10= 'String'
                    {
                    enumLiteral_10=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalCommunicationObject.g:1795:3: (enumLiteral_11= 'Boolean' )
                    {
                    // InternalCommunicationObject.g:1795:3: (enumLiteral_11= 'Boolean' )
                    // InternalCommunicationObject.g:1796:4: enumLiteral_11= 'Boolean'
                    {
                    enumLiteral_11=(Token)match(input,50,FOLLOW_2); 

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


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\uffff\1\2\3\uffff\1\2";
    static final String dfa_3s = "\1\5\1\4\1\uffff\1\5\1\uffff\1\4";
    static final String dfa_4s = "\1\37\1\46\1\uffff\1\5\1\uffff\1\46";
    static final String dfa_5s = "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_6s = "\6\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\16\uffff\1\2\6\uffff\3\2",
            "\2\2\12\uffff\1\2\4\uffff\1\2\1\3\2\uffff\1\4\12\uffff\1\2\1\uffff\1\2",
            "",
            "\1\5",
            "",
            "\2\2\12\uffff\1\2\4\uffff\1\2\1\3\2\uffff\1\4\12\uffff\1\2\1\uffff\1\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "758:2: ( ( () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')' ) | this_SingleValue_4= superSingleValue )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000028012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001B00010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001A10010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001A00010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0007FF8400000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010010002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000008E04000E0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000E04000E0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000005000000000L});

}