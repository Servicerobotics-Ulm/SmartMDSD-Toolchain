package org.xtext.base.docuterminals.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.base.docuterminals.services.DocuTerminalsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDocuTerminalsParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(DocuTerminalsGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAbstractDocumentedElement"
    // InternalDocuTerminals.g:68:1: entryRuleAbstractDocumentedElement : ruleAbstractDocumentedElement EOF ;
    public final void entryRuleAbstractDocumentedElement() throws RecognitionException {
        try {
            // InternalDocuTerminals.g:69:1: ( ruleAbstractDocumentedElement EOF )
            // InternalDocuTerminals.g:70:1: ruleAbstractDocumentedElement EOF
            {
             before(grammarAccess.getAbstractDocumentedElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractDocumentedElement();

            state._fsp--;

             after(grammarAccess.getAbstractDocumentedElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractDocumentedElement"


    // $ANTLR start "ruleAbstractDocumentedElement"
    // InternalDocuTerminals.g:77:1: ruleAbstractDocumentedElement : ( ( rule__AbstractDocumentedElement__Group__0 ) ) ;
    public final void ruleAbstractDocumentedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDocuTerminals.g:81:2: ( ( ( rule__AbstractDocumentedElement__Group__0 ) ) )
            // InternalDocuTerminals.g:82:2: ( ( rule__AbstractDocumentedElement__Group__0 ) )
            {
            // InternalDocuTerminals.g:82:2: ( ( rule__AbstractDocumentedElement__Group__0 ) )
            // InternalDocuTerminals.g:83:3: ( rule__AbstractDocumentedElement__Group__0 )
            {
             before(grammarAccess.getAbstractDocumentedElementAccess().getGroup()); 
            // InternalDocuTerminals.g:84:3: ( rule__AbstractDocumentedElement__Group__0 )
            // InternalDocuTerminals.g:84:4: rule__AbstractDocumentedElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractDocumentedElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractDocumentedElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractDocumentedElement"


    // $ANTLR start "rule__AbstractDocumentedElement__Group__0"
    // InternalDocuTerminals.g:92:1: rule__AbstractDocumentedElement__Group__0 : rule__AbstractDocumentedElement__Group__0__Impl rule__AbstractDocumentedElement__Group__1 ;
    public final void rule__AbstractDocumentedElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDocuTerminals.g:96:1: ( rule__AbstractDocumentedElement__Group__0__Impl rule__AbstractDocumentedElement__Group__1 )
            // InternalDocuTerminals.g:97:2: rule__AbstractDocumentedElement__Group__0__Impl rule__AbstractDocumentedElement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AbstractDocumentedElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractDocumentedElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractDocumentedElement__Group__0"


    // $ANTLR start "rule__AbstractDocumentedElement__Group__0__Impl"
    // InternalDocuTerminals.g:104:1: rule__AbstractDocumentedElement__Group__0__Impl : ( () ) ;
    public final void rule__AbstractDocumentedElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDocuTerminals.g:108:1: ( ( () ) )
            // InternalDocuTerminals.g:109:1: ( () )
            {
            // InternalDocuTerminals.g:109:1: ( () )
            // InternalDocuTerminals.g:110:2: ()
            {
             before(grammarAccess.getAbstractDocumentedElementAccess().getAbstractDocumentedElementAction_0()); 
            // InternalDocuTerminals.g:111:2: ()
            // InternalDocuTerminals.g:111:3: 
            {
            }

             after(grammarAccess.getAbstractDocumentedElementAccess().getAbstractDocumentedElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractDocumentedElement__Group__0__Impl"


    // $ANTLR start "rule__AbstractDocumentedElement__Group__1"
    // InternalDocuTerminals.g:119:1: rule__AbstractDocumentedElement__Group__1 : rule__AbstractDocumentedElement__Group__1__Impl ;
    public final void rule__AbstractDocumentedElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDocuTerminals.g:123:1: ( rule__AbstractDocumentedElement__Group__1__Impl )
            // InternalDocuTerminals.g:124:2: rule__AbstractDocumentedElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractDocumentedElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractDocumentedElement__Group__1"


    // $ANTLR start "rule__AbstractDocumentedElement__Group__1__Impl"
    // InternalDocuTerminals.g:130:1: rule__AbstractDocumentedElement__Group__1__Impl : ( ( rule__AbstractDocumentedElement__DocumentationAssignment_1 )? ) ;
    public final void rule__AbstractDocumentedElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDocuTerminals.g:134:1: ( ( ( rule__AbstractDocumentedElement__DocumentationAssignment_1 )? ) )
            // InternalDocuTerminals.g:135:1: ( ( rule__AbstractDocumentedElement__DocumentationAssignment_1 )? )
            {
            // InternalDocuTerminals.g:135:1: ( ( rule__AbstractDocumentedElement__DocumentationAssignment_1 )? )
            // InternalDocuTerminals.g:136:2: ( rule__AbstractDocumentedElement__DocumentationAssignment_1 )?
            {
             before(grammarAccess.getAbstractDocumentedElementAccess().getDocumentationAssignment_1()); 
            // InternalDocuTerminals.g:137:2: ( rule__AbstractDocumentedElement__DocumentationAssignment_1 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DOCU_COMMENT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDocuTerminals.g:137:3: rule__AbstractDocumentedElement__DocumentationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractDocumentedElement__DocumentationAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbstractDocumentedElementAccess().getDocumentationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractDocumentedElement__Group__1__Impl"


    // $ANTLR start "rule__AbstractDocumentedElement__DocumentationAssignment_1"
    // InternalDocuTerminals.g:146:1: rule__AbstractDocumentedElement__DocumentationAssignment_1 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__AbstractDocumentedElement__DocumentationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDocuTerminals.g:150:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalDocuTerminals.g:151:2: ( RULE_DOCU_COMMENT )
            {
            // InternalDocuTerminals.g:151:2: ( RULE_DOCU_COMMENT )
            // InternalDocuTerminals.g:152:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getAbstractDocumentedElementAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getAbstractDocumentedElementAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractDocumentedElement__DocumentationAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});

}