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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.*'", "'#import'", "';'", "'CommObjectsRepository'", "'version'", "'{'", "'Dependency'", "'}'", "'.'", "'CommObject'", "'Enumeration'", "'('", "')'", "':'", "'='", "'true'", "'false'", "'-'", "'E'", "'e'", "'InlineEnumeration'", "'['", "']'", "'*'", "','", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'"
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
    // InternalCommunicationObject.g:106:1: entryRuleCommObjectModel returns [EObject current=null] : iv_ruleCommObjectModel= ruleCommObjectModel EOF ;
    public final EObject entryRuleCommObjectModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommObjectModel = null;


        try {
            // InternalCommunicationObject.g:106:56: (iv_ruleCommObjectModel= ruleCommObjectModel EOF )
            // InternalCommunicationObject.g:107:2: iv_ruleCommObjectModel= ruleCommObjectModel EOF
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
    // InternalCommunicationObject.g:113:1: ruleCommObjectModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleCommRepositoryImport ) )* ( (lv_repository_1_0= ruleCommObjectsRepository ) )? ) ;
    public final EObject ruleCommObjectModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_repository_1_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:119:2: ( ( ( (lv_imports_0_0= ruleCommRepositoryImport ) )* ( (lv_repository_1_0= ruleCommObjectsRepository ) )? ) )
            // InternalCommunicationObject.g:120:2: ( ( (lv_imports_0_0= ruleCommRepositoryImport ) )* ( (lv_repository_1_0= ruleCommObjectsRepository ) )? )
            {
            // InternalCommunicationObject.g:120:2: ( ( (lv_imports_0_0= ruleCommRepositoryImport ) )* ( (lv_repository_1_0= ruleCommObjectsRepository ) )? )
            // InternalCommunicationObject.g:121:3: ( (lv_imports_0_0= ruleCommRepositoryImport ) )* ( (lv_repository_1_0= ruleCommObjectsRepository ) )?
            {
            // InternalCommunicationObject.g:121:3: ( (lv_imports_0_0= ruleCommRepositoryImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCommunicationObject.g:122:4: (lv_imports_0_0= ruleCommRepositoryImport )
            	    {
            	    // InternalCommunicationObject.g:122:4: (lv_imports_0_0= ruleCommRepositoryImport )
            	    // InternalCommunicationObject.g:123:5: lv_imports_0_0= ruleCommRepositoryImport
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

            // InternalCommunicationObject.g:140:3: ( (lv_repository_1_0= ruleCommObjectsRepository ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCommunicationObject.g:141:4: (lv_repository_1_0= ruleCommObjectsRepository )
                    {
                    // InternalCommunicationObject.g:141:4: (lv_repository_1_0= ruleCommObjectsRepository )
                    // InternalCommunicationObject.g:142:5: lv_repository_1_0= ruleCommObjectsRepository
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
    // InternalCommunicationObject.g:163:1: entryRuleFQNW returns [String current=null] : iv_ruleFQNW= ruleFQNW EOF ;
    public final String entryRuleFQNW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNW = null;


        try {
            // InternalCommunicationObject.g:163:44: (iv_ruleFQNW= ruleFQNW EOF )
            // InternalCommunicationObject.g:164:2: iv_ruleFQNW= ruleFQNW EOF
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
    // InternalCommunicationObject.g:170:1: ruleFQNW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFQNW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:176:2: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // InternalCommunicationObject.g:177:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // InternalCommunicationObject.g:177:2: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // InternalCommunicationObject.g:178:3: this_FQN_0= ruleFQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalCommunicationObject.g:188:3: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCommunicationObject.g:189:4: kw= '.*'
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


    // $ANTLR start "entryRuleCommRepositoryImport"
    // InternalCommunicationObject.g:199:1: entryRuleCommRepositoryImport returns [EObject current=null] : iv_ruleCommRepositoryImport= ruleCommRepositoryImport EOF ;
    public final EObject entryRuleCommRepositoryImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommRepositoryImport = null;


        try {
            // InternalCommunicationObject.g:199:61: (iv_ruleCommRepositoryImport= ruleCommRepositoryImport EOF )
            // InternalCommunicationObject.g:200:2: iv_ruleCommRepositoryImport= ruleCommRepositoryImport EOF
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
    // InternalCommunicationObject.g:206:1: ruleCommRepositoryImport returns [EObject current=null] : (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleCommRepositoryImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:212:2: ( (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? ) )
            // InternalCommunicationObject.g:213:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            {
            // InternalCommunicationObject.g:213:2: (otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )? )
            // InternalCommunicationObject.g:214:3: otherlv_0= '#import' ( (lv_importedNamespace_1_0= ruleFQNW ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCommRepositoryImportAccess().getImportKeyword_0());
            		
            // InternalCommunicationObject.g:218:3: ( (lv_importedNamespace_1_0= ruleFQNW ) )
            // InternalCommunicationObject.g:219:4: (lv_importedNamespace_1_0= ruleFQNW )
            {
            // InternalCommunicationObject.g:219:4: (lv_importedNamespace_1_0= ruleFQNW )
            // InternalCommunicationObject.g:220:5: lv_importedNamespace_1_0= ruleFQNW
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

            // InternalCommunicationObject.g:237:3: (otherlv_2= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCommunicationObject.g:238:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_2); 

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
    // InternalCommunicationObject.g:247:1: entryRuleCommObjectsRepository returns [EObject current=null] : iv_ruleCommObjectsRepository= ruleCommObjectsRepository EOF ;
    public final EObject entryRuleCommObjectsRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommObjectsRepository = null;


        try {
            // InternalCommunicationObject.g:247:62: (iv_ruleCommObjectsRepository= ruleCommObjectsRepository EOF )
            // InternalCommunicationObject.g:248:2: iv_ruleCommObjectsRepository= ruleCommObjectsRepository EOF
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
    // InternalCommunicationObject.g:254:1: ruleCommObjectsRepository returns [EObject current=null] : (otherlv_0= 'CommObjectsRepository' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleVersion ) ) )? otherlv_4= '{' (otherlv_5= 'Dependency' ( (lv_dependency_6_0= ruleEString ) ) (otherlv_7= ';' )? )? ( (lv_elements_8_0= ruleAbstractCommElement ) )* otherlv_9= '}' ) ;
    public final EObject ruleCommObjectsRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_version_3_0 = null;

        AntlrDatatypeRuleToken lv_dependency_6_0 = null;

        EObject lv_elements_8_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:260:2: ( (otherlv_0= 'CommObjectsRepository' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleVersion ) ) )? otherlv_4= '{' (otherlv_5= 'Dependency' ( (lv_dependency_6_0= ruleEString ) ) (otherlv_7= ';' )? )? ( (lv_elements_8_0= ruleAbstractCommElement ) )* otherlv_9= '}' ) )
            // InternalCommunicationObject.g:261:2: (otherlv_0= 'CommObjectsRepository' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleVersion ) ) )? otherlv_4= '{' (otherlv_5= 'Dependency' ( (lv_dependency_6_0= ruleEString ) ) (otherlv_7= ';' )? )? ( (lv_elements_8_0= ruleAbstractCommElement ) )* otherlv_9= '}' )
            {
            // InternalCommunicationObject.g:261:2: (otherlv_0= 'CommObjectsRepository' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleVersion ) ) )? otherlv_4= '{' (otherlv_5= 'Dependency' ( (lv_dependency_6_0= ruleEString ) ) (otherlv_7= ';' )? )? ( (lv_elements_8_0= ruleAbstractCommElement ) )* otherlv_9= '}' )
            // InternalCommunicationObject.g:262:3: otherlv_0= 'CommObjectsRepository' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleVersion ) ) )? otherlv_4= '{' (otherlv_5= 'Dependency' ( (lv_dependency_6_0= ruleEString ) ) (otherlv_7= ';' )? )? ( (lv_elements_8_0= ruleAbstractCommElement ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCommObjectsRepositoryAccess().getCommObjectsRepositoryKeyword_0());
            		
            // InternalCommunicationObject.g:266:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCommunicationObject.g:267:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCommunicationObject.g:267:4: (lv_name_1_0= RULE_ID )
            // InternalCommunicationObject.g:268:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCommObjectsRepositoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommObjectsRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCommunicationObject.g:284:3: (otherlv_2= 'version' ( (lv_version_3_0= ruleVersion ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCommunicationObject.g:285:4: otherlv_2= 'version' ( (lv_version_3_0= ruleVersion ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommObjectsRepositoryAccess().getVersionKeyword_2_0());
                    			
                    // InternalCommunicationObject.g:289:4: ( (lv_version_3_0= ruleVersion ) )
                    // InternalCommunicationObject.g:290:5: (lv_version_3_0= ruleVersion )
                    {
                    // InternalCommunicationObject.g:290:5: (lv_version_3_0= ruleVersion )
                    // InternalCommunicationObject.g:291:6: lv_version_3_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getCommObjectsRepositoryAccess().getVersionVersionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_version_3_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommObjectsRepositoryRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_3_0,
                    							"org.xtext.service.communicationObject.CommunicationObject.Version");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getCommObjectsRepositoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCommunicationObject.g:313:3: (otherlv_5= 'Dependency' ( (lv_dependency_6_0= ruleEString ) ) (otherlv_7= ';' )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCommunicationObject.g:314:4: otherlv_5= 'Dependency' ( (lv_dependency_6_0= ruleEString ) ) (otherlv_7= ';' )?
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getCommObjectsRepositoryAccess().getDependencyKeyword_4_0());
                    			
                    // InternalCommunicationObject.g:318:4: ( (lv_dependency_6_0= ruleEString ) )
                    // InternalCommunicationObject.g:319:5: (lv_dependency_6_0= ruleEString )
                    {
                    // InternalCommunicationObject.g:319:5: (lv_dependency_6_0= ruleEString )
                    // InternalCommunicationObject.g:320:6: lv_dependency_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommObjectsRepositoryAccess().getDependencyEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_dependency_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommObjectsRepositoryRule());
                    						}
                    						set(
                    							current,
                    							"dependency",
                    							lv_dependency_6_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCommunicationObject.g:337:4: (otherlv_7= ';' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==13) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCommunicationObject.g:338:5: otherlv_7= ';'
                            {
                            otherlv_7=(Token)match(input,13,FOLLOW_13); 

                            					newLeafNode(otherlv_7, grammarAccess.getCommObjectsRepositoryAccess().getSemicolonKeyword_4_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalCommunicationObject.g:344:3: ( (lv_elements_8_0= ruleAbstractCommElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=20 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCommunicationObject.g:345:4: (lv_elements_8_0= ruleAbstractCommElement )
            	    {
            	    // InternalCommunicationObject.g:345:4: (lv_elements_8_0= ruleAbstractCommElement )
            	    // InternalCommunicationObject.g:346:5: lv_elements_8_0= ruleAbstractCommElement
            	    {

            	    					newCompositeNode(grammarAccess.getCommObjectsRepositoryAccess().getElementsAbstractCommElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_elements_8_0=ruleAbstractCommElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCommObjectsRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_8_0,
            	    						"org.xtext.service.communicationObject.CommunicationObject.AbstractCommElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCommObjectsRepositoryAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalCommunicationObject.g:371:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalCommunicationObject.g:371:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalCommunicationObject.g:372:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalCommunicationObject.g:378:1: ruleVersion returns [EObject current=null] : ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) (otherlv_3= '.' ( (lv_patch_4_0= RULE_INT ) ) )? ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token lv_major_0_0=null;
        Token otherlv_1=null;
        Token lv_minor_2_0=null;
        Token otherlv_3=null;
        Token lv_patch_4_0=null;


        	enterRule();

        try {
            // InternalCommunicationObject.g:384:2: ( ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) (otherlv_3= '.' ( (lv_patch_4_0= RULE_INT ) ) )? ) )
            // InternalCommunicationObject.g:385:2: ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) (otherlv_3= '.' ( (lv_patch_4_0= RULE_INT ) ) )? )
            {
            // InternalCommunicationObject.g:385:2: ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) (otherlv_3= '.' ( (lv_patch_4_0= RULE_INT ) ) )? )
            // InternalCommunicationObject.g:386:3: ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) (otherlv_3= '.' ( (lv_patch_4_0= RULE_INT ) ) )?
            {
            // InternalCommunicationObject.g:386:3: ( (lv_major_0_0= RULE_INT ) )
            // InternalCommunicationObject.g:387:4: (lv_major_0_0= RULE_INT )
            {
            // InternalCommunicationObject.g:387:4: (lv_major_0_0= RULE_INT )
            // InternalCommunicationObject.g:388:5: lv_major_0_0= RULE_INT
            {
            lv_major_0_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getFullStopKeyword_1());
            		
            // InternalCommunicationObject.g:408:3: ( (lv_minor_2_0= RULE_INT ) )
            // InternalCommunicationObject.g:409:4: (lv_minor_2_0= RULE_INT )
            {
            // InternalCommunicationObject.g:409:4: (lv_minor_2_0= RULE_INT )
            // InternalCommunicationObject.g:410:5: lv_minor_2_0= RULE_INT
            {
            lv_minor_2_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            // InternalCommunicationObject.g:426:3: (otherlv_3= '.' ( (lv_patch_4_0= RULE_INT ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCommunicationObject.g:427:4: otherlv_3= '.' ( (lv_patch_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getVersionAccess().getFullStopKeyword_3_0());
                    			
                    // InternalCommunicationObject.g:431:4: ( (lv_patch_4_0= RULE_INT ) )
                    // InternalCommunicationObject.g:432:5: (lv_patch_4_0= RULE_INT )
                    {
                    // InternalCommunicationObject.g:432:5: (lv_patch_4_0= RULE_INT )
                    // InternalCommunicationObject.g:433:6: lv_patch_4_0= RULE_INT
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
    // InternalCommunicationObject.g:454:1: entryRuleAbstractCommElement returns [EObject current=null] : iv_ruleAbstractCommElement= ruleAbstractCommElement EOF ;
    public final EObject entryRuleAbstractCommElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCommElement = null;


        try {
            // InternalCommunicationObject.g:454:60: (iv_ruleAbstractCommElement= ruleAbstractCommElement EOF )
            // InternalCommunicationObject.g:455:2: iv_ruleAbstractCommElement= ruleAbstractCommElement EOF
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
    // InternalCommunicationObject.g:461:1: ruleAbstractCommElement returns [EObject current=null] : (this_Enumeration_0= ruleEnumeration | this_CommunicationObject_1= ruleCommunicationObject ) ;
    public final EObject ruleAbstractCommElement() throws RecognitionException {
        EObject current = null;

        EObject this_Enumeration_0 = null;

        EObject this_CommunicationObject_1 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:467:2: ( (this_Enumeration_0= ruleEnumeration | this_CommunicationObject_1= ruleCommunicationObject ) )
            // InternalCommunicationObject.g:468:2: (this_Enumeration_0= ruleEnumeration | this_CommunicationObject_1= ruleCommunicationObject )
            {
            // InternalCommunicationObject.g:468:2: (this_Enumeration_0= ruleEnumeration | this_CommunicationObject_1= ruleCommunicationObject )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCommunicationObject.g:469:3: this_Enumeration_0= ruleEnumeration
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
                    // InternalCommunicationObject.g:478:3: this_CommunicationObject_1= ruleCommunicationObject
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
    // InternalCommunicationObject.g:490:1: entryRuleCommunicationObject returns [EObject current=null] : iv_ruleCommunicationObject= ruleCommunicationObject EOF ;
    public final EObject entryRuleCommunicationObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationObject = null;


        try {
            // InternalCommunicationObject.g:490:60: (iv_ruleCommunicationObject= ruleCommunicationObject EOF )
            // InternalCommunicationObject.g:491:2: iv_ruleCommunicationObject= ruleCommunicationObject EOF
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
    // InternalCommunicationObject.g:497:1: ruleCommunicationObject returns [EObject current=null] : (otherlv_0= 'CommObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleCommunicationObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:503:2: ( (otherlv_0= 'CommObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' ) )
            // InternalCommunicationObject.g:504:2: (otherlv_0= 'CommObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' )
            {
            // InternalCommunicationObject.g:504:2: (otherlv_0= 'CommObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}' )
            // InternalCommunicationObject.g:505:3: otherlv_0= 'CommObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCommunicationObjectAccess().getCommObjectKeyword_0());
            		
            // InternalCommunicationObject.g:509:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCommunicationObject.g:510:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCommunicationObject.g:510:4: (lv_name_1_0= RULE_ID )
            // InternalCommunicationObject.g:511:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCommunicationObjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCommunicationObjectAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCommunicationObject.g:531:3: ( (lv_attributes_3_0= ruleAttributeDefinition ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCommunicationObject.g:532:4: (lv_attributes_3_0= ruleAttributeDefinition )
            	    {
            	    // InternalCommunicationObject.g:532:4: (lv_attributes_3_0= ruleAttributeDefinition )
            	    // InternalCommunicationObject.g:533:5: lv_attributes_3_0= ruleAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getCommunicationObjectAccess().getAttributesAttributeDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_attributes_3_0=ruleAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCommunicationObjectRule());
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

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCommunicationObjectAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalCommunicationObject.g:558:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalCommunicationObject.g:558:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalCommunicationObject.g:559:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalCommunicationObject.g:565:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_enums_3_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:571:2: ( (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )* otherlv_4= '}' ) )
            // InternalCommunicationObject.g:572:2: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )* otherlv_4= '}' )
            {
            // InternalCommunicationObject.g:572:2: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )* otherlv_4= '}' )
            // InternalCommunicationObject.g:573:3: otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
            		
            // InternalCommunicationObject.g:577:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCommunicationObject.g:578:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCommunicationObject.g:578:4: (lv_name_1_0= RULE_ID )
            // InternalCommunicationObject.g:579:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCommunicationObject.g:599:3: ( (lv_enums_3_0= ruleEnumerationElement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCommunicationObject.g:600:4: (lv_enums_3_0= ruleEnumerationElement )
            	    {
            	    // InternalCommunicationObject.g:600:4: (lv_enums_3_0= ruleEnumerationElement )
            	    // InternalCommunicationObject.g:601:5: lv_enums_3_0= ruleEnumerationElement
            	    {

            	    					newCompositeNode(grammarAccess.getEnumerationAccess().getEnumsEnumerationElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_enums_3_0=ruleEnumerationElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumerationRule());
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
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalCommunicationObject.g:626:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // InternalCommunicationObject.g:626:62: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // InternalCommunicationObject.g:627:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
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
    // InternalCommunicationObject.g:633:1: ruleAbstractAttributeType returns [EObject current=null] : (this_CommElementReference_0= ruleCommElementReference | this_AbstractAttributeType_1= superAbstractAttributeType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_CommElementReference_0 = null;

        EObject this_AbstractAttributeType_1 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:639:2: ( (this_CommElementReference_0= ruleCommElementReference | this_AbstractAttributeType_1= superAbstractAttributeType ) )
            // InternalCommunicationObject.g:640:2: (this_CommElementReference_0= ruleCommElementReference | this_AbstractAttributeType_1= superAbstractAttributeType )
            {
            // InternalCommunicationObject.g:640:2: (this_CommElementReference_0= ruleCommElementReference | this_AbstractAttributeType_1= superAbstractAttributeType )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==31||(LA13_0>=36 && LA13_0<=47)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCommunicationObject.g:641:3: this_CommElementReference_0= ruleCommElementReference
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
                    // InternalCommunicationObject.g:650:3: this_AbstractAttributeType_1= superAbstractAttributeType
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
    // InternalCommunicationObject.g:662:1: entryRuleCommElementReference returns [EObject current=null] : iv_ruleCommElementReference= ruleCommElementReference EOF ;
    public final EObject entryRuleCommElementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommElementReference = null;


        try {
            // InternalCommunicationObject.g:662:61: (iv_ruleCommElementReference= ruleCommElementReference EOF )
            // InternalCommunicationObject.g:663:2: iv_ruleCommElementReference= ruleCommElementReference EOF
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
    // InternalCommunicationObject.g:669:1: ruleCommElementReference returns [EObject current=null] : ( ( ( ruleFQN ) ) ( (lv_array_1_0= ruleArrayType ) )? ) ;
    public final EObject ruleCommElementReference() throws RecognitionException {
        EObject current = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:675:2: ( ( ( ( ruleFQN ) ) ( (lv_array_1_0= ruleArrayType ) )? ) )
            // InternalCommunicationObject.g:676:2: ( ( ( ruleFQN ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            {
            // InternalCommunicationObject.g:676:2: ( ( ( ruleFQN ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            // InternalCommunicationObject.g:677:3: ( ( ruleFQN ) ) ( (lv_array_1_0= ruleArrayType ) )?
            {
            // InternalCommunicationObject.g:677:3: ( ( ruleFQN ) )
            // InternalCommunicationObject.g:678:4: ( ruleFQN )
            {
            // InternalCommunicationObject.g:678:4: ( ruleFQN )
            // InternalCommunicationObject.g:679:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommElementReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCommElementReferenceAccess().getTypeNameAbstractCommElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_17);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCommunicationObject.g:693:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCommunicationObject.g:694:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalCommunicationObject.g:694:4: (lv_array_1_0= ruleArrayType )
                    // InternalCommunicationObject.g:695:5: lv_array_1_0= ruleArrayType
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
    // InternalCommunicationObject.g:716:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalCommunicationObject.g:716:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalCommunicationObject.g:717:2: iv_ruleSingleValue= ruleSingleValue EOF
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
    // InternalCommunicationObject.g:723:1: ruleSingleValue returns [EObject current=null] : ( ( () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')' ) | this_SingleValue_4= superSingleValue ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_SingleValue_4 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:729:2: ( ( ( () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')' ) | this_SingleValue_4= superSingleValue ) )
            // InternalCommunicationObject.g:730:2: ( ( () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')' ) | this_SingleValue_4= superSingleValue )
            {
            // InternalCommunicationObject.g:730:2: ( ( () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')' ) | this_SingleValue_4= superSingleValue )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalCommunicationObject.g:731:3: ( () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')' )
                    {
                    // InternalCommunicationObject.g:731:3: ( () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')' )
                    // InternalCommunicationObject.g:732:4: () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')'
                    {
                    // InternalCommunicationObject.g:732:4: ()
                    // InternalCommunicationObject.g:733:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getCommElementValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCommunicationObject.g:739:4: ( ( ruleFQN ) )
                    // InternalCommunicationObject.g:740:5: ( ruleFQN )
                    {
                    // InternalCommunicationObject.g:740:5: ( ruleFQN )
                    // InternalCommunicationObject.g:741:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleValueRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueAbstractCommElementCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getSingleValueAccess().getLeftParenthesisKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSingleValueAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:765:3: this_SingleValue_4= superSingleValue
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
    // InternalCommunicationObject.g:777:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalCommunicationObject.g:777:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalCommunicationObject.g:778:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
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
    // InternalCommunicationObject.g:784:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? ) ;
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
            // InternalCommunicationObject.g:790:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? ) )
            // InternalCommunicationObject.g:791:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? )
            {
            // InternalCommunicationObject.g:791:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? )
            // InternalCommunicationObject.g:792:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )?
            {
            // InternalCommunicationObject.g:792:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCommunicationObject.g:793:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCommunicationObject.g:793:4: (lv_name_0_0= RULE_ID )
            // InternalCommunicationObject.g:794:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getColonKeyword_1());
            		
            // InternalCommunicationObject.g:814:3: ( (lv_type_2_0= ruleAbstractAttributeType ) )
            // InternalCommunicationObject.g:815:4: (lv_type_2_0= ruleAbstractAttributeType )
            {
            // InternalCommunicationObject.g:815:4: (lv_type_2_0= ruleAbstractAttributeType )
            // InternalCommunicationObject.g:816:5: lv_type_2_0= ruleAbstractAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_2_0=ruleAbstractAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.service.communicationObject.CommunicationObject.AbstractAttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCommunicationObject.g:833:3: (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCommunicationObject.g:834:4: otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalCommunicationObject.g:838:4: ( (lv_defaultvalue_4_0= ruleAbstractValue ) )
                    // InternalCommunicationObject.g:839:5: (lv_defaultvalue_4_0= ruleAbstractValue )
                    {
                    // InternalCommunicationObject.g:839:5: (lv_defaultvalue_4_0= ruleAbstractValue )
                    // InternalCommunicationObject.g:840:6: lv_defaultvalue_4_0= ruleAbstractValue
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

            // InternalCommunicationObject.g:858:3: (otherlv_5= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCommunicationObject.g:859:4: otherlv_5= ';'
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
    // InternalCommunicationObject.g:868:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCommunicationObject.g:868:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalCommunicationObject.g:869:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalCommunicationObject.g:875:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCommunicationObject.g:881:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCommunicationObject.g:882:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCommunicationObject.g:882:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCommunicationObject.g:883:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalCommunicationObject.g:890:3: (kw= '.' this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCommunicationObject.g:891:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalCommunicationObject.g:908:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalCommunicationObject.g:908:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalCommunicationObject.g:909:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalCommunicationObject.g:915:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCommunicationObject.g:921:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalCommunicationObject.g:922:2: (kw= 'true' | kw= 'false' )
            {
            // InternalCommunicationObject.g:922:2: (kw= 'true' | kw= 'false' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            else if ( (LA19_0==27) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCommunicationObject.g:923:3: kw= 'true'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:929:3: kw= 'false'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

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
    // InternalCommunicationObject.g:938:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCommunicationObject.g:938:47: (iv_ruleEString= ruleEString EOF )
            // InternalCommunicationObject.g:939:2: iv_ruleEString= ruleEString EOF
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
    // InternalCommunicationObject.g:945:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalCommunicationObject.g:951:2: (this_STRING_0= RULE_STRING )
            // InternalCommunicationObject.g:952:2: this_STRING_0= RULE_STRING
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
    // InternalCommunicationObject.g:962:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalCommunicationObject.g:962:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalCommunicationObject.g:963:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalCommunicationObject.g:969:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCommunicationObject.g:975:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalCommunicationObject.g:976:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalCommunicationObject.g:976:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalCommunicationObject.g:977:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalCommunicationObject.g:977:3: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCommunicationObject.g:978:4: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_8); 

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
    // InternalCommunicationObject.g:995:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalCommunicationObject.g:995:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalCommunicationObject.g:996:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalCommunicationObject.g:1002:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalCommunicationObject.g:1008:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalCommunicationObject.g:1009:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalCommunicationObject.g:1009:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalCommunicationObject.g:1010:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalCommunicationObject.g:1010:3: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCommunicationObject.g:1011:4: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalCommunicationObject.g:1017:3: (this_INT_1= RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCommunicationObject.g:1018:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_14); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,19,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_25); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalCommunicationObject.g:1038:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=29 && LA25_0<=30)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCommunicationObject.g:1039:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalCommunicationObject.g:1039:4: (kw= 'E' | kw= 'e' )
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
                            // InternalCommunicationObject.g:1040:5: kw= 'E'
                            {
                            kw=(Token)match(input,29,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalCommunicationObject.g:1046:5: kw= 'e'
                            {
                            kw=(Token)match(input,30,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalCommunicationObject.g:1052:4: (kw= '-' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==28) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalCommunicationObject.g:1053:5: kw= '-'
                            {
                            kw=(Token)match(input,28,FOLLOW_8); 

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
    // InternalCommunicationObject.g:1071:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalCommunicationObject.g:1071:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalCommunicationObject.g:1072:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
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
    // InternalCommunicationObject.g:1078:1: ruleEnumerationElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1084:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) )
            // InternalCommunicationObject.g:1085:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            {
            // InternalCommunicationObject.g:1085:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            // InternalCommunicationObject.g:1086:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )?
            {
            // InternalCommunicationObject.g:1086:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCommunicationObject.g:1087:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCommunicationObject.g:1087:4: (lv_name_0_0= RULE_ID )
            // InternalCommunicationObject.g:1088:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalCommunicationObject.g:1104:3: (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCommunicationObject.g:1105:4: otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalCommunicationObject.g:1109:4: ( (lv_value_2_0= ruleEInt ) )
                    // InternalCommunicationObject.g:1110:5: (lv_value_2_0= ruleEInt )
                    {
                    // InternalCommunicationObject.g:1110:5: (lv_value_2_0= ruleEInt )
                    // InternalCommunicationObject.g:1111:6: lv_value_2_0= ruleEInt
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

            // InternalCommunicationObject.g:1129:3: (otherlv_3= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCommunicationObject.g:1130:4: otherlv_3= ';'
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


    // $ANTLR start "entrySuperAbstractAttributeType"
    // InternalCommunicationObject.g:1139:1: entrySuperAbstractAttributeType returns [EObject current=null] : iv_superAbstractAttributeType= superAbstractAttributeType EOF ;
    public final EObject entrySuperAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_superAbstractAttributeType = null;


        try {
            // InternalCommunicationObject.g:1139:63: (iv_superAbstractAttributeType= superAbstractAttributeType EOF )
            // InternalCommunicationObject.g:1140:2: iv_superAbstractAttributeType= superAbstractAttributeType EOF
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
    // InternalCommunicationObject.g:1146:1: superAbstractAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) ;
    public final EObject superAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_InlineEnumerationType_1 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1152:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) )
            // InternalCommunicationObject.g:1153:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            {
            // InternalCommunicationObject.g:1153:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=36 && LA28_0<=47)) ) {
                alt28=1;
            }
            else if ( (LA28_0==31) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalCommunicationObject.g:1154:3: this_PrimitiveType_0= rulePrimitiveType
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
                    // InternalCommunicationObject.g:1163:3: this_InlineEnumerationType_1= ruleInlineEnumerationType
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
    // InternalCommunicationObject.g:1175:1: entryRuleInlineEnumerationType returns [EObject current=null] : iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF ;
    public final EObject entryRuleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineEnumerationType = null;


        try {
            // InternalCommunicationObject.g:1175:62: (iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF )
            // InternalCommunicationObject.g:1176:2: iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF
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
    // InternalCommunicationObject.g:1182:1: ruleInlineEnumerationType returns [EObject current=null] : (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_array_1_0 = null;

        EObject lv_enums_3_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1188:2: ( (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) )
            // InternalCommunicationObject.g:1189:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            {
            // InternalCommunicationObject.g:1189:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            // InternalCommunicationObject.g:1190:3: otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0());
            		
            // InternalCommunicationObject.g:1194:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCommunicationObject.g:1195:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalCommunicationObject.g:1195:4: (lv_array_1_0= ruleArrayType )
                    // InternalCommunicationObject.g:1196:5: lv_array_1_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getArrayArrayTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCommunicationObject.g:1217:3: ( (lv_enums_3_0= ruleEnumerationElement ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCommunicationObject.g:1218:4: (lv_enums_3_0= ruleEnumerationElement )
            	    {
            	    // InternalCommunicationObject.g:1218:4: (lv_enums_3_0= ruleEnumerationElement )
            	    // InternalCommunicationObject.g:1219:5: lv_enums_3_0= ruleEnumerationElement
            	    {

            	    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalCommunicationObject.g:1244:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalCommunicationObject.g:1244:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalCommunicationObject.g:1245:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalCommunicationObject.g:1251:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1257:2: ( ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) )
            // InternalCommunicationObject.g:1258:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            {
            // InternalCommunicationObject.g:1258:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            // InternalCommunicationObject.g:1259:3: () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']'
            {
            // InternalCommunicationObject.g:1259:3: ()
            // InternalCommunicationObject.g:1260:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalCommunicationObject.g:1270:3: ( (lv_length_2_0= ruleCardinality ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT||LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCommunicationObject.g:1271:4: (lv_length_2_0= ruleCardinality )
                    {
                    // InternalCommunicationObject.g:1271:4: (lv_length_2_0= ruleCardinality )
                    // InternalCommunicationObject.g:1272:5: lv_length_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_29);
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

            otherlv_3=(Token)match(input,33,FOLLOW_2); 

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
    // InternalCommunicationObject.g:1297:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalCommunicationObject.g:1297:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalCommunicationObject.g:1298:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalCommunicationObject.g:1304:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalCommunicationObject.g:1310:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalCommunicationObject.g:1311:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalCommunicationObject.g:1311:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT) ) {
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
                    // InternalCommunicationObject.g:1312:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:1320:3: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

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
    // InternalCommunicationObject.g:1329:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalCommunicationObject.g:1329:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalCommunicationObject.g:1330:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalCommunicationObject.g:1336:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeName_0_0 = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1342:2: ( ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) )
            // InternalCommunicationObject.g:1343:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            {
            // InternalCommunicationObject.g:1343:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            // InternalCommunicationObject.g:1344:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )?
            {
            // InternalCommunicationObject.g:1344:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) )
            // InternalCommunicationObject.g:1345:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            {
            // InternalCommunicationObject.g:1345:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            // InternalCommunicationObject.g:1346:5: lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalCommunicationObject.g:1363:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCommunicationObject.g:1364:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalCommunicationObject.g:1364:4: (lv_array_1_0= ruleArrayType )
                    // InternalCommunicationObject.g:1365:5: lv_array_1_0= ruleArrayType
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
    // InternalCommunicationObject.g:1386:1: entryRuleAbstractValue returns [EObject current=null] : iv_ruleAbstractValue= ruleAbstractValue EOF ;
    public final EObject entryRuleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractValue = null;


        try {
            // InternalCommunicationObject.g:1386:54: (iv_ruleAbstractValue= ruleAbstractValue EOF )
            // InternalCommunicationObject.g:1387:2: iv_ruleAbstractValue= ruleAbstractValue EOF
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
    // InternalCommunicationObject.g:1393:1: ruleAbstractValue returns [EObject current=null] : (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) ;
    public final EObject ruleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValue_0 = null;

        EObject this_ArrayValue_1 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1399:2: ( (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) )
            // InternalCommunicationObject.g:1400:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            {
            // InternalCommunicationObject.g:1400:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)||LA34_0==19||(LA34_0>=26 && LA34_0<=28)) ) {
                alt34=1;
            }
            else if ( (LA34_0==32) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalCommunicationObject.g:1401:3: this_SingleValue_0= ruleSingleValue
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
                    // InternalCommunicationObject.g:1410:3: this_ArrayValue_1= ruleArrayValue
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
    // InternalCommunicationObject.g:1422:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalCommunicationObject.g:1422:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalCommunicationObject.g:1423:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalCommunicationObject.g:1429:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1435:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) )
            // InternalCommunicationObject.g:1436:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            {
            // InternalCommunicationObject.g:1436:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            // InternalCommunicationObject.g:1437:3: otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalCommunicationObject.g:1441:3: ( (lv_values_1_0= ruleSingleValue ) )
            // InternalCommunicationObject.g:1442:4: (lv_values_1_0= ruleSingleValue )
            {
            // InternalCommunicationObject.g:1442:4: (lv_values_1_0= ruleSingleValue )
            // InternalCommunicationObject.g:1443:5: lv_values_1_0= ruleSingleValue
            {

            					newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalCommunicationObject.g:1460:3: (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==35) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalCommunicationObject.g:1461:4: otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_30); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalCommunicationObject.g:1465:4: ( (lv_values_3_0= ruleSingleValue ) )
            	    // InternalCommunicationObject.g:1466:5: (lv_values_3_0= ruleSingleValue )
            	    {
            	    // InternalCommunicationObject.g:1466:5: (lv_values_3_0= ruleSingleValue )
            	    // InternalCommunicationObject.g:1467:6: lv_values_3_0= ruleSingleValue
            	    {

            	    						newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
            	    break loop35;
                }
            } while (true);

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

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
    // InternalCommunicationObject.g:1493:1: entrySuperSingleValue returns [EObject current=null] : iv_superSingleValue= superSingleValue EOF ;
    public final EObject entrySuperSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_superSingleValue = null;


        try {
            // InternalCommunicationObject.g:1493:53: (iv_superSingleValue= superSingleValue EOF )
            // InternalCommunicationObject.g:1494:2: iv_superSingleValue= superSingleValue EOF
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
    // InternalCommunicationObject.g:1500:1: superSingleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) ;
    public final EObject superSingleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalCommunicationObject.g:1506:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) )
            // InternalCommunicationObject.g:1507:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            {
            // InternalCommunicationObject.g:1507:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            int alt36=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==RULE_INT) ) {
                    int LA36_2 = input.LA(3);

                    if ( (LA36_2==EOF||LA36_2==RULE_ID||LA36_2==13||LA36_2==18||LA36_2==33||LA36_2==35) ) {
                        alt36=1;
                    }
                    else if ( (LA36_2==19) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA36_1==19) ) {
                    alt36=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA36_2 = input.LA(2);

                if ( (LA36_2==EOF||LA36_2==RULE_ID||LA36_2==13||LA36_2==18||LA36_2==33||LA36_2==35) ) {
                    alt36=1;
                }
                else if ( (LA36_2==19) ) {
                    alt36=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt36=2;
                }
                break;
            case RULE_STRING:
                {
                alt36=3;
                }
                break;
            case 26:
            case 27:
                {
                alt36=4;
                }
                break;
            case RULE_ID:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalCommunicationObject.g:1508:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalCommunicationObject.g:1508:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalCommunicationObject.g:1509:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalCommunicationObject.g:1509:4: ()
                    // InternalCommunicationObject.g:1510:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicAttributesSingleValueAccess().getIntValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCommunicationObject.g:1516:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalCommunicationObject.g:1517:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalCommunicationObject.g:1517:5: (lv_value_1_0= ruleEInt )
                    // InternalCommunicationObject.g:1518:6: lv_value_1_0= ruleEInt
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
                    // InternalCommunicationObject.g:1537:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    {
                    // InternalCommunicationObject.g:1537:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    // InternalCommunicationObject.g:1538:4: () ( (lv_value_3_0= ruleEDouble ) )
                    {
                    // InternalCommunicationObject.g:1538:4: ()
                    // InternalCommunicationObject.g:1539:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicAttributesSingleValueAccess().getFloatingPointValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCommunicationObject.g:1545:4: ( (lv_value_3_0= ruleEDouble ) )
                    // InternalCommunicationObject.g:1546:5: (lv_value_3_0= ruleEDouble )
                    {
                    // InternalCommunicationObject.g:1546:5: (lv_value_3_0= ruleEDouble )
                    // InternalCommunicationObject.g:1547:6: lv_value_3_0= ruleEDouble
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
                    // InternalCommunicationObject.g:1566:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    {
                    // InternalCommunicationObject.g:1566:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    // InternalCommunicationObject.g:1567:4: () ( (lv_value_5_0= ruleEString ) )
                    {
                    // InternalCommunicationObject.g:1567:4: ()
                    // InternalCommunicationObject.g:1568:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicAttributesSingleValueAccess().getStringValueAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCommunicationObject.g:1574:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalCommunicationObject.g:1575:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalCommunicationObject.g:1575:5: (lv_value_5_0= ruleEString )
                    // InternalCommunicationObject.g:1576:6: lv_value_5_0= ruleEString
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
                    // InternalCommunicationObject.g:1595:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    {
                    // InternalCommunicationObject.g:1595:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    // InternalCommunicationObject.g:1596:4: () ( (lv_value_7_0= ruleEBoolean ) )
                    {
                    // InternalCommunicationObject.g:1596:4: ()
                    // InternalCommunicationObject.g:1597:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicAttributesSingleValueAccess().getBoolValueAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCommunicationObject.g:1603:4: ( (lv_value_7_0= ruleEBoolean ) )
                    // InternalCommunicationObject.g:1604:5: (lv_value_7_0= ruleEBoolean )
                    {
                    // InternalCommunicationObject.g:1604:5: (lv_value_7_0= ruleEBoolean )
                    // InternalCommunicationObject.g:1605:6: lv_value_7_0= ruleEBoolean
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
                    // InternalCommunicationObject.g:1624:3: ( () ( ( ruleFQN ) ) )
                    {
                    // InternalCommunicationObject.g:1624:3: ( () ( ( ruleFQN ) ) )
                    // InternalCommunicationObject.g:1625:4: () ( ( ruleFQN ) )
                    {
                    // InternalCommunicationObject.g:1625:4: ()
                    // InternalCommunicationObject.g:1626:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicAttributesSingleValueAccess().getEnumerationValueAction_4_0(),
                    						current);
                    				

                    }

                    // InternalCommunicationObject.g:1632:4: ( ( ruleFQN ) )
                    // InternalCommunicationObject.g:1633:5: ( ruleFQN )
                    {
                    // InternalCommunicationObject.g:1633:5: ( ruleFQN )
                    // InternalCommunicationObject.g:1634:6: ruleFQN
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
    // InternalCommunicationObject.g:1653:1: rulePRIMITIVE_TYPE_NAME returns [Enumerator current=null] : ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) ;
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
            // InternalCommunicationObject.g:1659:2: ( ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) )
            // InternalCommunicationObject.g:1660:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            {
            // InternalCommunicationObject.g:1660:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            int alt37=12;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt37=1;
                }
                break;
            case 37:
                {
                alt37=2;
                }
                break;
            case 38:
                {
                alt37=3;
                }
                break;
            case 39:
                {
                alt37=4;
                }
                break;
            case 40:
                {
                alt37=5;
                }
                break;
            case 41:
                {
                alt37=6;
                }
                break;
            case 42:
                {
                alt37=7;
                }
                break;
            case 43:
                {
                alt37=8;
                }
                break;
            case 44:
                {
                alt37=9;
                }
                break;
            case 45:
                {
                alt37=10;
                }
                break;
            case 46:
                {
                alt37=11;
                }
                break;
            case 47:
                {
                alt37=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalCommunicationObject.g:1661:3: (enumLiteral_0= 'Int8' )
                    {
                    // InternalCommunicationObject.g:1661:3: (enumLiteral_0= 'Int8' )
                    // InternalCommunicationObject.g:1662:4: enumLiteral_0= 'Int8'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:1669:3: (enumLiteral_1= 'Int16' )
                    {
                    // InternalCommunicationObject.g:1669:3: (enumLiteral_1= 'Int16' )
                    // InternalCommunicationObject.g:1670:4: enumLiteral_1= 'Int16'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCommunicationObject.g:1677:3: (enumLiteral_2= 'Int32' )
                    {
                    // InternalCommunicationObject.g:1677:3: (enumLiteral_2= 'Int32' )
                    // InternalCommunicationObject.g:1678:4: enumLiteral_2= 'Int32'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCommunicationObject.g:1685:3: (enumLiteral_3= 'Int64' )
                    {
                    // InternalCommunicationObject.g:1685:3: (enumLiteral_3= 'Int64' )
                    // InternalCommunicationObject.g:1686:4: enumLiteral_3= 'Int64'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCommunicationObject.g:1693:3: (enumLiteral_4= 'UInt8' )
                    {
                    // InternalCommunicationObject.g:1693:3: (enumLiteral_4= 'UInt8' )
                    // InternalCommunicationObject.g:1694:4: enumLiteral_4= 'UInt8'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCommunicationObject.g:1701:3: (enumLiteral_5= 'UInt16' )
                    {
                    // InternalCommunicationObject.g:1701:3: (enumLiteral_5= 'UInt16' )
                    // InternalCommunicationObject.g:1702:4: enumLiteral_5= 'UInt16'
                    {
                    enumLiteral_5=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCommunicationObject.g:1709:3: (enumLiteral_6= 'UInt32' )
                    {
                    // InternalCommunicationObject.g:1709:3: (enumLiteral_6= 'UInt32' )
                    // InternalCommunicationObject.g:1710:4: enumLiteral_6= 'UInt32'
                    {
                    enumLiteral_6=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalCommunicationObject.g:1717:3: (enumLiteral_7= 'UInt64' )
                    {
                    // InternalCommunicationObject.g:1717:3: (enumLiteral_7= 'UInt64' )
                    // InternalCommunicationObject.g:1718:4: enumLiteral_7= 'UInt64'
                    {
                    enumLiteral_7=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalCommunicationObject.g:1725:3: (enumLiteral_8= 'Float' )
                    {
                    // InternalCommunicationObject.g:1725:3: (enumLiteral_8= 'Float' )
                    // InternalCommunicationObject.g:1726:4: enumLiteral_8= 'Float'
                    {
                    enumLiteral_8=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalCommunicationObject.g:1733:3: (enumLiteral_9= 'Double' )
                    {
                    // InternalCommunicationObject.g:1733:3: (enumLiteral_9= 'Double' )
                    // InternalCommunicationObject.g:1734:4: enumLiteral_9= 'Double'
                    {
                    enumLiteral_9=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalCommunicationObject.g:1741:3: (enumLiteral_10= 'String' )
                    {
                    // InternalCommunicationObject.g:1741:3: (enumLiteral_10= 'String' )
                    // InternalCommunicationObject.g:1742:4: enumLiteral_10= 'String'
                    {
                    enumLiteral_10=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalCommunicationObject.g:1749:3: (enumLiteral_11= 'Boolean' )
                    {
                    // InternalCommunicationObject.g:1749:3: (enumLiteral_11= 'Boolean' )
                    // InternalCommunicationObject.g:1750:4: enumLiteral_11= 'Boolean'
                    {
                    enumLiteral_11=(Token)match(input,47,FOLLOW_2); 

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


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\uffff\1\2\3\uffff\1\2";
    static final String dfa_3s = "\2\4\1\uffff\1\4\1\uffff\1\4";
    static final String dfa_4s = "\1\34\1\43\1\uffff\1\4\1\uffff\1\43";
    static final String dfa_5s = "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_6s = "\6\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\14\uffff\1\2\6\uffff\3\2",
            "\1\2\10\uffff\1\2\4\uffff\1\2\1\3\2\uffff\1\4\12\uffff\1\2\1\uffff\1\2",
            "",
            "\1\5",
            "",
            "\1\2\10\uffff\1\2\4\uffff\1\2\1\3\2\uffff\1\4\12\uffff\1\2\1\uffff\1\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "730:2: ( ( () ( ( ruleFQN ) ) otherlv_2= '(' otherlv_3= ')' ) | this_SingleValue_4= superSingleValue )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000360000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000342000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000FFF080000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002002002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000011C080070L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000600000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000001C080070L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000A00000000L});

}