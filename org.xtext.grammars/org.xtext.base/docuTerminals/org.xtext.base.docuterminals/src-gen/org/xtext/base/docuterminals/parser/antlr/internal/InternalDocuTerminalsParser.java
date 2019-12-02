package org.xtext.base.docuterminals.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.base.docuterminals.services.DocuTerminalsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDocuTerminalsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCU_COMMENT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=9;
    public static final int RULE_ML_DOCUMENTATION=6;
    public static final int RULE_WS=12;
    public static final int RULE_STRING=11;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_SL_DOCUMENTATION=8;
    public static final int RULE_INT=10;
    public static final int RULE_DOCU_COMMENT=4;
    public static final int RULE_ML_COMMENT=5;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDocuTerminalsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDocuTerminalsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDocuTerminalsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDocuTerminals.g"; }



     	private DocuTerminalsGrammarAccess grammarAccess;

        public InternalDocuTerminalsParser(TokenStream input, DocuTerminalsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AbstractDocumentedElement";
       	}

       	@Override
       	protected DocuTerminalsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAbstractDocumentedElement"
    // InternalDocuTerminals.g:79:1: entryRuleAbstractDocumentedElement returns [EObject current=null] : iv_ruleAbstractDocumentedElement= ruleAbstractDocumentedElement EOF ;
    public final EObject entryRuleAbstractDocumentedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDocumentedElement = null;


        try {
            // InternalDocuTerminals.g:79:66: (iv_ruleAbstractDocumentedElement= ruleAbstractDocumentedElement EOF )
            // InternalDocuTerminals.g:80:2: iv_ruleAbstractDocumentedElement= ruleAbstractDocumentedElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractDocumentedElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractDocumentedElement=ruleAbstractDocumentedElement();

            state._fsp--;

             current =iv_ruleAbstractDocumentedElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDocumentedElement"


    // $ANTLR start "ruleAbstractDocumentedElement"
    // InternalDocuTerminals.g:86:1: ruleAbstractDocumentedElement returns [EObject current=null] : ( () ( (lv_documentation_1_0= RULE_DOCU_COMMENT ) )? ) ;
    public final EObject ruleAbstractDocumentedElement() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_1_0=null;


        	enterRule();

        try {
            // InternalDocuTerminals.g:92:2: ( ( () ( (lv_documentation_1_0= RULE_DOCU_COMMENT ) )? ) )
            // InternalDocuTerminals.g:93:2: ( () ( (lv_documentation_1_0= RULE_DOCU_COMMENT ) )? )
            {
            // InternalDocuTerminals.g:93:2: ( () ( (lv_documentation_1_0= RULE_DOCU_COMMENT ) )? )
            // InternalDocuTerminals.g:94:3: () ( (lv_documentation_1_0= RULE_DOCU_COMMENT ) )?
            {
            // InternalDocuTerminals.g:94:3: ()
            // InternalDocuTerminals.g:95:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAbstractDocumentedElementAccess().getAbstractDocumentedElementAction_0(),
            					current);
            			

            }

            // InternalDocuTerminals.g:101:3: ( (lv_documentation_1_0= RULE_DOCU_COMMENT ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DOCU_COMMENT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDocuTerminals.g:102:4: (lv_documentation_1_0= RULE_DOCU_COMMENT )
                    {
                    // InternalDocuTerminals.g:102:4: (lv_documentation_1_0= RULE_DOCU_COMMENT )
                    // InternalDocuTerminals.g:103:5: lv_documentation_1_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_1_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_2); 

                    					newLeafNode(lv_documentation_1_0, grammarAccess.getAbstractDocumentedElementAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAbstractDocumentedElementRule());
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


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDocumentedElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}