package org.xtext.service.componentMode.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.service.componentMode.services.ComponentModeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentModeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentModeRepository'", "'{'", "'}'", "'ComponentModeCollection'", "'ComponentModeDefinition'", "';'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalComponentModeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentModeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentModeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentMode.g"; }



     	private ComponentModeGrammarAccess grammarAccess;

        public InternalComponentModeParser(TokenStream input, ComponentModeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentModeModel";
       	}

       	@Override
       	protected ComponentModeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentModeModel"
    // InternalComponentMode.g:105:1: entryRuleComponentModeModel returns [EObject current=null] : iv_ruleComponentModeModel= ruleComponentModeModel EOF ;
    public final EObject entryRuleComponentModeModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentModeModel = null;


        try {
            // InternalComponentMode.g:105:59: (iv_ruleComponentModeModel= ruleComponentModeModel EOF )
            // InternalComponentMode.g:106:2: iv_ruleComponentModeModel= ruleComponentModeModel EOF
            {
             newCompositeNode(grammarAccess.getComponentModeModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentModeModel=ruleComponentModeModel();

            state._fsp--;

             current =iv_ruleComponentModeModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentModeModel"


    // $ANTLR start "ruleComponentModeModel"
    // InternalComponentMode.g:112:1: ruleComponentModeModel returns [EObject current=null] : ( () ( (lv_repository_1_0= ruleComponentModeRepository ) )? ) ;
    public final EObject ruleComponentModeModel() throws RecognitionException {
        EObject current = null;

        EObject lv_repository_1_0 = null;



        	enterRule();

        try {
            // InternalComponentMode.g:118:2: ( ( () ( (lv_repository_1_0= ruleComponentModeRepository ) )? ) )
            // InternalComponentMode.g:119:2: ( () ( (lv_repository_1_0= ruleComponentModeRepository ) )? )
            {
            // InternalComponentMode.g:119:2: ( () ( (lv_repository_1_0= ruleComponentModeRepository ) )? )
            // InternalComponentMode.g:120:3: () ( (lv_repository_1_0= ruleComponentModeRepository ) )?
            {
            // InternalComponentMode.g:120:3: ()
            // InternalComponentMode.g:121:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentModeModelAccess().getComponentModeModelAction_0(),
            					current);
            			

            }

            // InternalComponentMode.g:127:3: ( (lv_repository_1_0= ruleComponentModeRepository ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentMode.g:128:4: (lv_repository_1_0= ruleComponentModeRepository )
                    {
                    // InternalComponentMode.g:128:4: (lv_repository_1_0= ruleComponentModeRepository )
                    // InternalComponentMode.g:129:5: lv_repository_1_0= ruleComponentModeRepository
                    {

                    					newCompositeNode(grammarAccess.getComponentModeModelAccess().getRepositoryComponentModeRepositoryParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repository_1_0=ruleComponentModeRepository();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentModeModelRule());
                    					}
                    					set(
                    						current,
                    						"repository",
                    						lv_repository_1_0,
                    						"org.xtext.service.componentMode.ComponentMode.ComponentModeRepository");
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
    // $ANTLR end "ruleComponentModeModel"


    // $ANTLR start "entryRuleComponentModeRepository"
    // InternalComponentMode.g:150:1: entryRuleComponentModeRepository returns [EObject current=null] : iv_ruleComponentModeRepository= ruleComponentModeRepository EOF ;
    public final EObject entryRuleComponentModeRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentModeRepository = null;


        try {
            // InternalComponentMode.g:150:64: (iv_ruleComponentModeRepository= ruleComponentModeRepository EOF )
            // InternalComponentMode.g:151:2: iv_ruleComponentModeRepository= ruleComponentModeRepository EOF
            {
             newCompositeNode(grammarAccess.getComponentModeRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentModeRepository=ruleComponentModeRepository();

            state._fsp--;

             current =iv_ruleComponentModeRepository; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentModeRepository"


    // $ANTLR start "ruleComponentModeRepository"
    // InternalComponentMode.g:157:1: ruleComponentModeRepository returns [EObject current=null] : ( () otherlv_1= 'ComponentModeRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_collections_4_0= ruleComponentModeCollection ) )* otherlv_5= '}' ) ;
    public final EObject ruleComponentModeRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_collections_4_0 = null;



        	enterRule();

        try {
            // InternalComponentMode.g:163:2: ( ( () otherlv_1= 'ComponentModeRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_collections_4_0= ruleComponentModeCollection ) )* otherlv_5= '}' ) )
            // InternalComponentMode.g:164:2: ( () otherlv_1= 'ComponentModeRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_collections_4_0= ruleComponentModeCollection ) )* otherlv_5= '}' )
            {
            // InternalComponentMode.g:164:2: ( () otherlv_1= 'ComponentModeRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_collections_4_0= ruleComponentModeCollection ) )* otherlv_5= '}' )
            // InternalComponentMode.g:165:3: () otherlv_1= 'ComponentModeRepository' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_collections_4_0= ruleComponentModeCollection ) )* otherlv_5= '}'
            {
            // InternalComponentMode.g:165:3: ()
            // InternalComponentMode.g:166:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentModeRepositoryAccess().getComponentModeRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentModeRepositoryAccess().getComponentModeRepositoryKeyword_1());
            		
            // InternalComponentMode.g:176:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentMode.g:177:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentMode.g:177:4: (lv_name_2_0= RULE_ID )
            // InternalComponentMode.g:178:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getComponentModeRepositoryAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentModeRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentModeRepositoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentMode.g:198:3: ( (lv_collections_4_0= ruleComponentModeCollection ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalComponentMode.g:199:4: (lv_collections_4_0= ruleComponentModeCollection )
            	    {
            	    // InternalComponentMode.g:199:4: (lv_collections_4_0= ruleComponentModeCollection )
            	    // InternalComponentMode.g:200:5: lv_collections_4_0= ruleComponentModeCollection
            	    {

            	    					newCompositeNode(grammarAccess.getComponentModeRepositoryAccess().getCollectionsComponentModeCollectionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_collections_4_0=ruleComponentModeCollection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentModeRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"collections",
            	    						lv_collections_4_0,
            	    						"org.xtext.service.componentMode.ComponentMode.ComponentModeCollection");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentModeRepositoryAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentModeRepository"


    // $ANTLR start "entryRuleComponentModeCollection"
    // InternalComponentMode.g:225:1: entryRuleComponentModeCollection returns [EObject current=null] : iv_ruleComponentModeCollection= ruleComponentModeCollection EOF ;
    public final EObject entryRuleComponentModeCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentModeCollection = null;


        try {
            // InternalComponentMode.g:225:64: (iv_ruleComponentModeCollection= ruleComponentModeCollection EOF )
            // InternalComponentMode.g:226:2: iv_ruleComponentModeCollection= ruleComponentModeCollection EOF
            {
             newCompositeNode(grammarAccess.getComponentModeCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentModeCollection=ruleComponentModeCollection();

            state._fsp--;

             current =iv_ruleComponentModeCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentModeCollection"


    // $ANTLR start "ruleComponentModeCollection"
    // InternalComponentMode.g:232:1: ruleComponentModeCollection returns [EObject current=null] : ( () otherlv_1= 'ComponentModeCollection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_modes_4_0= ruleComponentModeDefinition ) )* otherlv_5= '}' ) ;
    public final EObject ruleComponentModeCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_modes_4_0 = null;



        	enterRule();

        try {
            // InternalComponentMode.g:238:2: ( ( () otherlv_1= 'ComponentModeCollection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_modes_4_0= ruleComponentModeDefinition ) )* otherlv_5= '}' ) )
            // InternalComponentMode.g:239:2: ( () otherlv_1= 'ComponentModeCollection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_modes_4_0= ruleComponentModeDefinition ) )* otherlv_5= '}' )
            {
            // InternalComponentMode.g:239:2: ( () otherlv_1= 'ComponentModeCollection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_modes_4_0= ruleComponentModeDefinition ) )* otherlv_5= '}' )
            // InternalComponentMode.g:240:3: () otherlv_1= 'ComponentModeCollection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_modes_4_0= ruleComponentModeDefinition ) )* otherlv_5= '}'
            {
            // InternalComponentMode.g:240:3: ()
            // InternalComponentMode.g:241:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentModeCollectionAccess().getComponentModeCollectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentModeCollectionAccess().getComponentModeCollectionKeyword_1());
            		
            // InternalComponentMode.g:251:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentMode.g:252:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentMode.g:252:4: (lv_name_2_0= RULE_ID )
            // InternalComponentMode.g:253:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getComponentModeCollectionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentModeCollectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentModeCollectionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentMode.g:273:3: ( (lv_modes_4_0= ruleComponentModeDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalComponentMode.g:274:4: (lv_modes_4_0= ruleComponentModeDefinition )
            	    {
            	    // InternalComponentMode.g:274:4: (lv_modes_4_0= ruleComponentModeDefinition )
            	    // InternalComponentMode.g:275:5: lv_modes_4_0= ruleComponentModeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getComponentModeCollectionAccess().getModesComponentModeDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_modes_4_0=ruleComponentModeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentModeCollectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modes",
            	    						lv_modes_4_0,
            	    						"org.xtext.service.componentMode.ComponentMode.ComponentModeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentModeCollectionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentModeCollection"


    // $ANTLR start "entryRuleComponentModeDefinition"
    // InternalComponentMode.g:300:1: entryRuleComponentModeDefinition returns [EObject current=null] : iv_ruleComponentModeDefinition= ruleComponentModeDefinition EOF ;
    public final EObject entryRuleComponentModeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentModeDefinition = null;


        try {
            // InternalComponentMode.g:300:64: (iv_ruleComponentModeDefinition= ruleComponentModeDefinition EOF )
            // InternalComponentMode.g:301:2: iv_ruleComponentModeDefinition= ruleComponentModeDefinition EOF
            {
             newCompositeNode(grammarAccess.getComponentModeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentModeDefinition=ruleComponentModeDefinition();

            state._fsp--;

             current =iv_ruleComponentModeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentModeDefinition"


    // $ANTLR start "ruleComponentModeDefinition"
    // InternalComponentMode.g:307:1: ruleComponentModeDefinition returns [EObject current=null] : ( () otherlv_1= 'ComponentModeDefinition' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleComponentModeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalComponentMode.g:313:2: ( ( () otherlv_1= 'ComponentModeDefinition' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? ) )
            // InternalComponentMode.g:314:2: ( () otherlv_1= 'ComponentModeDefinition' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? )
            {
            // InternalComponentMode.g:314:2: ( () otherlv_1= 'ComponentModeDefinition' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )? )
            // InternalComponentMode.g:315:3: () otherlv_1= 'ComponentModeDefinition' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ';' )?
            {
            // InternalComponentMode.g:315:3: ()
            // InternalComponentMode.g:316:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentModeDefinitionAccess().getComponentModeDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentModeDefinitionAccess().getComponentModeDefinitionKeyword_1());
            		
            // InternalComponentMode.g:326:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponentMode.g:327:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponentMode.g:327:4: (lv_name_2_0= RULE_ID )
            // InternalComponentMode.g:328:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getComponentModeDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentModeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalComponentMode.g:344:3: (otherlv_3= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentMode.g:345:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentModeDefinitionAccess().getSemicolonKeyword_3());
                    			

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
    // $ANTLR end "ruleComponentModeDefinition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});

}