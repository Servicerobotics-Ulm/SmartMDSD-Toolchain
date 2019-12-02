package org.xtext.base.genericDatasheet.ide.contentassist.antlr.internal;

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
import org.xtext.base.genericDatasheet.services.GenericDatasheetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGenericDatasheetParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BaseURI'", "'ShortDescription'", "'DatasheetProperty'", "'{'", "'}'", "'value'", "'unit'", "'shortDescription'", "'semanticID'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalGenericDatasheetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGenericDatasheetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGenericDatasheetParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGenericDatasheet.g"; }


    	private GenericDatasheetGrammarAccess grammarAccess;

    	public void setGrammarAccess(GenericDatasheetGrammarAccess grammarAccess) {
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



    // $ANTLR start "ruleGenericDatasheetModel"
    // InternalGenericDatasheet.g:69:1: ruleGenericDatasheetModel : ( ( rule__GenericDatasheetModel__ElementsAssignment )* ) ;
    public final void ruleGenericDatasheetModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:73:2: ( ( ( rule__GenericDatasheetModel__ElementsAssignment )* ) )
            // InternalGenericDatasheet.g:74:2: ( ( rule__GenericDatasheetModel__ElementsAssignment )* )
            {
            // InternalGenericDatasheet.g:74:2: ( ( rule__GenericDatasheetModel__ElementsAssignment )* )
            // InternalGenericDatasheet.g:75:3: ( rule__GenericDatasheetModel__ElementsAssignment )*
            {
             before(grammarAccess.getGenericDatasheetModelAccess().getElementsAssignment()); 
            // InternalGenericDatasheet.g:76:3: ( rule__GenericDatasheetModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGenericDatasheet.g:76:4: rule__GenericDatasheetModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_1);
            	    rule__GenericDatasheetModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getGenericDatasheetModelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleGenericDatasheetModel"


    // $ANTLR start "entryRuleAbstractDatasheetElement"
    // InternalGenericDatasheet.g:85:1: entryRuleAbstractDatasheetElement : ruleAbstractDatasheetElement EOF ;
    public final void entryRuleAbstractDatasheetElement() throws RecognitionException {
        try {
            // InternalGenericDatasheet.g:86:1: ( ruleAbstractDatasheetElement EOF )
            // InternalGenericDatasheet.g:87:1: ruleAbstractDatasheetElement EOF
            {
             before(grammarAccess.getAbstractDatasheetElementRule()); 
            pushFollow(FOLLOW_2);
            ruleAbstractDatasheetElement();

            state._fsp--;

             after(grammarAccess.getAbstractDatasheetElementRule()); 
            match(input,EOF,FOLLOW_3); 

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
    // $ANTLR end "entryRuleAbstractDatasheetElement"


    // $ANTLR start "ruleAbstractDatasheetElement"
    // InternalGenericDatasheet.g:94:1: ruleAbstractDatasheetElement : ( ( rule__AbstractDatasheetElement__Alternatives ) ) ;
    public final void ruleAbstractDatasheetElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:98:2: ( ( ( rule__AbstractDatasheetElement__Alternatives ) ) )
            // InternalGenericDatasheet.g:99:2: ( ( rule__AbstractDatasheetElement__Alternatives ) )
            {
            // InternalGenericDatasheet.g:99:2: ( ( rule__AbstractDatasheetElement__Alternatives ) )
            // InternalGenericDatasheet.g:100:3: ( rule__AbstractDatasheetElement__Alternatives )
            {
             before(grammarAccess.getAbstractDatasheetElementAccess().getAlternatives()); 
            // InternalGenericDatasheet.g:101:3: ( rule__AbstractDatasheetElement__Alternatives )
            // InternalGenericDatasheet.g:101:4: rule__AbstractDatasheetElement__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__AbstractDatasheetElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractDatasheetElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractDatasheetElement"


    // $ANTLR start "entryRuleDatasheetProperty"
    // InternalGenericDatasheet.g:110:1: entryRuleDatasheetProperty : ruleDatasheetProperty EOF ;
    public final void entryRuleDatasheetProperty() throws RecognitionException {
        try {
            // InternalGenericDatasheet.g:111:1: ( ruleDatasheetProperty EOF )
            // InternalGenericDatasheet.g:112:1: ruleDatasheetProperty EOF
            {
             before(grammarAccess.getDatasheetPropertyRule()); 
            pushFollow(FOLLOW_2);
            ruleDatasheetProperty();

            state._fsp--;

             after(grammarAccess.getDatasheetPropertyRule()); 
            match(input,EOF,FOLLOW_3); 

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
    // $ANTLR end "entryRuleDatasheetProperty"


    // $ANTLR start "ruleDatasheetProperty"
    // InternalGenericDatasheet.g:119:1: ruleDatasheetProperty : ( ( rule__DatasheetProperty__Group__0 ) ) ;
    public final void ruleDatasheetProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:123:2: ( ( ( rule__DatasheetProperty__Group__0 ) ) )
            // InternalGenericDatasheet.g:124:2: ( ( rule__DatasheetProperty__Group__0 ) )
            {
            // InternalGenericDatasheet.g:124:2: ( ( rule__DatasheetProperty__Group__0 ) )
            // InternalGenericDatasheet.g:125:3: ( rule__DatasheetProperty__Group__0 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getGroup()); 
            // InternalGenericDatasheet.g:126:3: ( rule__DatasheetProperty__Group__0 )
            // InternalGenericDatasheet.g:126:4: rule__DatasheetProperty__Group__0
            {
            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatasheetPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleDatasheetProperty"


    // $ANTLR start "entryRuleMandatoryDatasheetElement"
    // InternalGenericDatasheet.g:135:1: entryRuleMandatoryDatasheetElement : ruleMandatoryDatasheetElement EOF ;
    public final void entryRuleMandatoryDatasheetElement() throws RecognitionException {
        try {
            // InternalGenericDatasheet.g:136:1: ( ruleMandatoryDatasheetElement EOF )
            // InternalGenericDatasheet.g:137:1: ruleMandatoryDatasheetElement EOF
            {
             before(grammarAccess.getMandatoryDatasheetElementRule()); 
            pushFollow(FOLLOW_2);
            ruleMandatoryDatasheetElement();

            state._fsp--;

             after(grammarAccess.getMandatoryDatasheetElementRule()); 
            match(input,EOF,FOLLOW_3); 

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
    // $ANTLR end "entryRuleMandatoryDatasheetElement"


    // $ANTLR start "ruleMandatoryDatasheetElement"
    // InternalGenericDatasheet.g:144:1: ruleMandatoryDatasheetElement : ( ( rule__MandatoryDatasheetElement__Group__0 ) ) ;
    public final void ruleMandatoryDatasheetElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:148:2: ( ( ( rule__MandatoryDatasheetElement__Group__0 ) ) )
            // InternalGenericDatasheet.g:149:2: ( ( rule__MandatoryDatasheetElement__Group__0 ) )
            {
            // InternalGenericDatasheet.g:149:2: ( ( rule__MandatoryDatasheetElement__Group__0 ) )
            // InternalGenericDatasheet.g:150:3: ( rule__MandatoryDatasheetElement__Group__0 )
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getGroup()); 
            // InternalGenericDatasheet.g:151:3: ( rule__MandatoryDatasheetElement__Group__0 )
            // InternalGenericDatasheet.g:151:4: rule__MandatoryDatasheetElement__Group__0
            {
            pushFollow(FOLLOW_3);
            rule__MandatoryDatasheetElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryDatasheetElementAccess().getGroup()); 

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
    // $ANTLR end "ruleMandatoryDatasheetElement"


    // $ANTLR start "ruleMandatoryDatasheetElementNames"
    // InternalGenericDatasheet.g:160:1: ruleMandatoryDatasheetElementNames : ( ( rule__MandatoryDatasheetElementNames__Alternatives ) ) ;
    public final void ruleMandatoryDatasheetElementNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:164:1: ( ( ( rule__MandatoryDatasheetElementNames__Alternatives ) ) )
            // InternalGenericDatasheet.g:165:2: ( ( rule__MandatoryDatasheetElementNames__Alternatives ) )
            {
            // InternalGenericDatasheet.g:165:2: ( ( rule__MandatoryDatasheetElementNames__Alternatives ) )
            // InternalGenericDatasheet.g:166:3: ( rule__MandatoryDatasheetElementNames__Alternatives )
            {
             before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getAlternatives()); 
            // InternalGenericDatasheet.g:167:3: ( rule__MandatoryDatasheetElementNames__Alternatives )
            // InternalGenericDatasheet.g:167:4: rule__MandatoryDatasheetElementNames__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__MandatoryDatasheetElementNames__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryDatasheetElementNamesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMandatoryDatasheetElementNames"


    // $ANTLR start "rule__AbstractDatasheetElement__Alternatives"
    // InternalGenericDatasheet.g:175:1: rule__AbstractDatasheetElement__Alternatives : ( ( ruleDatasheetProperty ) | ( ruleMandatoryDatasheetElement ) );
    public final void rule__AbstractDatasheetElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:179:1: ( ( ruleDatasheetProperty ) | ( ruleMandatoryDatasheetElement ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=11 && LA2_0<=12)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGenericDatasheet.g:180:2: ( ruleDatasheetProperty )
                    {
                    // InternalGenericDatasheet.g:180:2: ( ruleDatasheetProperty )
                    // InternalGenericDatasheet.g:181:3: ruleDatasheetProperty
                    {
                     before(grammarAccess.getAbstractDatasheetElementAccess().getDatasheetPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_3);
                    ruleDatasheetProperty();

                    state._fsp--;

                     after(grammarAccess.getAbstractDatasheetElementAccess().getDatasheetPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGenericDatasheet.g:186:2: ( ruleMandatoryDatasheetElement )
                    {
                    // InternalGenericDatasheet.g:186:2: ( ruleMandatoryDatasheetElement )
                    // InternalGenericDatasheet.g:187:3: ruleMandatoryDatasheetElement
                    {
                     before(grammarAccess.getAbstractDatasheetElementAccess().getMandatoryDatasheetElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_3);
                    ruleMandatoryDatasheetElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractDatasheetElementAccess().getMandatoryDatasheetElementParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__AbstractDatasheetElement__Alternatives"


    // $ANTLR start "rule__MandatoryDatasheetElementNames__Alternatives"
    // InternalGenericDatasheet.g:196:1: rule__MandatoryDatasheetElementNames__Alternatives : ( ( ( 'BaseURI' ) ) | ( ( 'ShortDescription' ) ) );
    public final void rule__MandatoryDatasheetElementNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:200:1: ( ( ( 'BaseURI' ) ) | ( ( 'ShortDescription' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGenericDatasheet.g:201:2: ( ( 'BaseURI' ) )
                    {
                    // InternalGenericDatasheet.g:201:2: ( ( 'BaseURI' ) )
                    // InternalGenericDatasheet.g:202:3: ( 'BaseURI' )
                    {
                     before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0()); 
                    // InternalGenericDatasheet.g:203:3: ( 'BaseURI' )
                    // InternalGenericDatasheet.g:203:4: 'BaseURI'
                    {
                    match(input,11,FOLLOW_3); 

                    }

                     after(grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGenericDatasheet.g:207:2: ( ( 'ShortDescription' ) )
                    {
                    // InternalGenericDatasheet.g:207:2: ( ( 'ShortDescription' ) )
                    // InternalGenericDatasheet.g:208:3: ( 'ShortDescription' )
                    {
                     before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getShortDescriptionEnumLiteralDeclaration_1()); 
                    // InternalGenericDatasheet.g:209:3: ( 'ShortDescription' )
                    // InternalGenericDatasheet.g:209:4: 'ShortDescription'
                    {
                    match(input,12,FOLLOW_3); 

                    }

                     after(grammarAccess.getMandatoryDatasheetElementNamesAccess().getShortDescriptionEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__MandatoryDatasheetElementNames__Alternatives"


    // $ANTLR start "rule__DatasheetProperty__Group__0"
    // InternalGenericDatasheet.g:217:1: rule__DatasheetProperty__Group__0 : rule__DatasheetProperty__Group__0__Impl rule__DatasheetProperty__Group__1 ;
    public final void rule__DatasheetProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:221:1: ( rule__DatasheetProperty__Group__0__Impl rule__DatasheetProperty__Group__1 )
            // InternalGenericDatasheet.g:222:2: rule__DatasheetProperty__Group__0__Impl rule__DatasheetProperty__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DatasheetProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group__1();

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
    // $ANTLR end "rule__DatasheetProperty__Group__0"


    // $ANTLR start "rule__DatasheetProperty__Group__0__Impl"
    // InternalGenericDatasheet.g:229:1: rule__DatasheetProperty__Group__0__Impl : ( 'DatasheetProperty' ) ;
    public final void rule__DatasheetProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:233:1: ( ( 'DatasheetProperty' ) )
            // InternalGenericDatasheet.g:234:1: ( 'DatasheetProperty' )
            {
            // InternalGenericDatasheet.g:234:1: ( 'DatasheetProperty' )
            // InternalGenericDatasheet.g:235:2: 'DatasheetProperty'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getDatasheetPropertyKeyword_0()); 
            match(input,13,FOLLOW_3); 
             after(grammarAccess.getDatasheetPropertyAccess().getDatasheetPropertyKeyword_0()); 

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
    // $ANTLR end "rule__DatasheetProperty__Group__0__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group__1"
    // InternalGenericDatasheet.g:244:1: rule__DatasheetProperty__Group__1 : rule__DatasheetProperty__Group__1__Impl rule__DatasheetProperty__Group__2 ;
    public final void rule__DatasheetProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:248:1: ( rule__DatasheetProperty__Group__1__Impl rule__DatasheetProperty__Group__2 )
            // InternalGenericDatasheet.g:249:2: rule__DatasheetProperty__Group__1__Impl rule__DatasheetProperty__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DatasheetProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group__2();

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
    // $ANTLR end "rule__DatasheetProperty__Group__1"


    // $ANTLR start "rule__DatasheetProperty__Group__1__Impl"
    // InternalGenericDatasheet.g:256:1: rule__DatasheetProperty__Group__1__Impl : ( ( rule__DatasheetProperty__NameAssignment_1 ) ) ;
    public final void rule__DatasheetProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:260:1: ( ( ( rule__DatasheetProperty__NameAssignment_1 ) ) )
            // InternalGenericDatasheet.g:261:1: ( ( rule__DatasheetProperty__NameAssignment_1 ) )
            {
            // InternalGenericDatasheet.g:261:1: ( ( rule__DatasheetProperty__NameAssignment_1 ) )
            // InternalGenericDatasheet.g:262:2: ( rule__DatasheetProperty__NameAssignment_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getNameAssignment_1()); 
            // InternalGenericDatasheet.g:263:2: ( rule__DatasheetProperty__NameAssignment_1 )
            // InternalGenericDatasheet.g:263:3: rule__DatasheetProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatasheetPropertyAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DatasheetProperty__Group__1__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group__2"
    // InternalGenericDatasheet.g:271:1: rule__DatasheetProperty__Group__2 : rule__DatasheetProperty__Group__2__Impl rule__DatasheetProperty__Group__3 ;
    public final void rule__DatasheetProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:275:1: ( rule__DatasheetProperty__Group__2__Impl rule__DatasheetProperty__Group__3 )
            // InternalGenericDatasheet.g:276:2: rule__DatasheetProperty__Group__2__Impl rule__DatasheetProperty__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DatasheetProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group__3();

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
    // $ANTLR end "rule__DatasheetProperty__Group__2"


    // $ANTLR start "rule__DatasheetProperty__Group__2__Impl"
    // InternalGenericDatasheet.g:283:1: rule__DatasheetProperty__Group__2__Impl : ( '{' ) ;
    public final void rule__DatasheetProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:287:1: ( ( '{' ) )
            // InternalGenericDatasheet.g:288:1: ( '{' )
            {
            // InternalGenericDatasheet.g:288:1: ( '{' )
            // InternalGenericDatasheet.g:289:2: '{'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_3); 
             after(grammarAccess.getDatasheetPropertyAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DatasheetProperty__Group__2__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group__3"
    // InternalGenericDatasheet.g:298:1: rule__DatasheetProperty__Group__3 : rule__DatasheetProperty__Group__3__Impl rule__DatasheetProperty__Group__4 ;
    public final void rule__DatasheetProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:302:1: ( rule__DatasheetProperty__Group__3__Impl rule__DatasheetProperty__Group__4 )
            // InternalGenericDatasheet.g:303:2: rule__DatasheetProperty__Group__3__Impl rule__DatasheetProperty__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__DatasheetProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group__4();

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
    // $ANTLR end "rule__DatasheetProperty__Group__3"


    // $ANTLR start "rule__DatasheetProperty__Group__3__Impl"
    // InternalGenericDatasheet.g:310:1: rule__DatasheetProperty__Group__3__Impl : ( ( rule__DatasheetProperty__UnorderedGroup_3 ) ) ;
    public final void rule__DatasheetProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:314:1: ( ( ( rule__DatasheetProperty__UnorderedGroup_3 ) ) )
            // InternalGenericDatasheet.g:315:1: ( ( rule__DatasheetProperty__UnorderedGroup_3 ) )
            {
            // InternalGenericDatasheet.g:315:1: ( ( rule__DatasheetProperty__UnorderedGroup_3 ) )
            // InternalGenericDatasheet.g:316:2: ( rule__DatasheetProperty__UnorderedGroup_3 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3()); 
            // InternalGenericDatasheet.g:317:2: ( rule__DatasheetProperty__UnorderedGroup_3 )
            // InternalGenericDatasheet.g:317:3: rule__DatasheetProperty__UnorderedGroup_3
            {
            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3()); 

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
    // $ANTLR end "rule__DatasheetProperty__Group__3__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group__4"
    // InternalGenericDatasheet.g:325:1: rule__DatasheetProperty__Group__4 : rule__DatasheetProperty__Group__4__Impl ;
    public final void rule__DatasheetProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:329:1: ( rule__DatasheetProperty__Group__4__Impl )
            // InternalGenericDatasheet.g:330:2: rule__DatasheetProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group__4__Impl();

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
    // $ANTLR end "rule__DatasheetProperty__Group__4"


    // $ANTLR start "rule__DatasheetProperty__Group__4__Impl"
    // InternalGenericDatasheet.g:336:1: rule__DatasheetProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__DatasheetProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:340:1: ( ( '}' ) )
            // InternalGenericDatasheet.g:341:1: ( '}' )
            {
            // InternalGenericDatasheet.g:341:1: ( '}' )
            // InternalGenericDatasheet.g:342:2: '}'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_3); 
             after(grammarAccess.getDatasheetPropertyAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__DatasheetProperty__Group__4__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group_3_0__0"
    // InternalGenericDatasheet.g:352:1: rule__DatasheetProperty__Group_3_0__0 : rule__DatasheetProperty__Group_3_0__0__Impl rule__DatasheetProperty__Group_3_0__1 ;
    public final void rule__DatasheetProperty__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:356:1: ( rule__DatasheetProperty__Group_3_0__0__Impl rule__DatasheetProperty__Group_3_0__1 )
            // InternalGenericDatasheet.g:357:2: rule__DatasheetProperty__Group_3_0__0__Impl rule__DatasheetProperty__Group_3_0__1
            {
            pushFollow(FOLLOW_8);
            rule__DatasheetProperty__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group_3_0__1();

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_0__0"


    // $ANTLR start "rule__DatasheetProperty__Group_3_0__0__Impl"
    // InternalGenericDatasheet.g:364:1: rule__DatasheetProperty__Group_3_0__0__Impl : ( 'value' ) ;
    public final void rule__DatasheetProperty__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:368:1: ( ( 'value' ) )
            // InternalGenericDatasheet.g:369:1: ( 'value' )
            {
            // InternalGenericDatasheet.g:369:1: ( 'value' )
            // InternalGenericDatasheet.g:370:2: 'value'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getValueKeyword_3_0_0()); 
            match(input,16,FOLLOW_3); 
             after(grammarAccess.getDatasheetPropertyAccess().getValueKeyword_3_0_0()); 

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_0__0__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group_3_0__1"
    // InternalGenericDatasheet.g:379:1: rule__DatasheetProperty__Group_3_0__1 : rule__DatasheetProperty__Group_3_0__1__Impl rule__DatasheetProperty__Group_3_0__2 ;
    public final void rule__DatasheetProperty__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:383:1: ( rule__DatasheetProperty__Group_3_0__1__Impl rule__DatasheetProperty__Group_3_0__2 )
            // InternalGenericDatasheet.g:384:2: rule__DatasheetProperty__Group_3_0__1__Impl rule__DatasheetProperty__Group_3_0__2
            {
            pushFollow(FOLLOW_9);
            rule__DatasheetProperty__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group_3_0__2();

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_0__1"


    // $ANTLR start "rule__DatasheetProperty__Group_3_0__1__Impl"
    // InternalGenericDatasheet.g:391:1: rule__DatasheetProperty__Group_3_0__1__Impl : ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:395:1: ( ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) ) )
            // InternalGenericDatasheet.g:396:1: ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) )
            {
            // InternalGenericDatasheet.g:396:1: ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) )
            // InternalGenericDatasheet.g:397:2: ( rule__DatasheetProperty__ValueAssignment_3_0_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getValueAssignment_3_0_1()); 
            // InternalGenericDatasheet.g:398:2: ( rule__DatasheetProperty__ValueAssignment_3_0_1 )
            // InternalGenericDatasheet.g:398:3: rule__DatasheetProperty__ValueAssignment_3_0_1
            {
            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__ValueAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDatasheetPropertyAccess().getValueAssignment_3_0_1()); 

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_0__1__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group_3_0__2"
    // InternalGenericDatasheet.g:406:1: rule__DatasheetProperty__Group_3_0__2 : rule__DatasheetProperty__Group_3_0__2__Impl ;
    public final void rule__DatasheetProperty__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:410:1: ( rule__DatasheetProperty__Group_3_0__2__Impl )
            // InternalGenericDatasheet.g:411:2: rule__DatasheetProperty__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group_3_0__2__Impl();

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_0__2"


    // $ANTLR start "rule__DatasheetProperty__Group_3_0__2__Impl"
    // InternalGenericDatasheet.g:417:1: rule__DatasheetProperty__Group_3_0__2__Impl : ( ( rule__DatasheetProperty__Group_3_0_2__0 )? ) ;
    public final void rule__DatasheetProperty__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:421:1: ( ( ( rule__DatasheetProperty__Group_3_0_2__0 )? ) )
            // InternalGenericDatasheet.g:422:1: ( ( rule__DatasheetProperty__Group_3_0_2__0 )? )
            {
            // InternalGenericDatasheet.g:422:1: ( ( rule__DatasheetProperty__Group_3_0_2__0 )? )
            // InternalGenericDatasheet.g:423:2: ( rule__DatasheetProperty__Group_3_0_2__0 )?
            {
             before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0_2()); 
            // InternalGenericDatasheet.g:424:2: ( rule__DatasheetProperty__Group_3_0_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGenericDatasheet.g:424:3: rule__DatasheetProperty__Group_3_0_2__0
                    {
                    pushFollow(FOLLOW_3);
                    rule__DatasheetProperty__Group_3_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0_2()); 

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_0__2__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group_3_0_2__0"
    // InternalGenericDatasheet.g:433:1: rule__DatasheetProperty__Group_3_0_2__0 : rule__DatasheetProperty__Group_3_0_2__0__Impl rule__DatasheetProperty__Group_3_0_2__1 ;
    public final void rule__DatasheetProperty__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:437:1: ( rule__DatasheetProperty__Group_3_0_2__0__Impl rule__DatasheetProperty__Group_3_0_2__1 )
            // InternalGenericDatasheet.g:438:2: rule__DatasheetProperty__Group_3_0_2__0__Impl rule__DatasheetProperty__Group_3_0_2__1
            {
            pushFollow(FOLLOW_8);
            rule__DatasheetProperty__Group_3_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group_3_0_2__1();

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_0_2__0"


    // $ANTLR start "rule__DatasheetProperty__Group_3_0_2__0__Impl"
    // InternalGenericDatasheet.g:445:1: rule__DatasheetProperty__Group_3_0_2__0__Impl : ( 'unit' ) ;
    public final void rule__DatasheetProperty__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:449:1: ( ( 'unit' ) )
            // InternalGenericDatasheet.g:450:1: ( 'unit' )
            {
            // InternalGenericDatasheet.g:450:1: ( 'unit' )
            // InternalGenericDatasheet.g:451:2: 'unit'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getUnitKeyword_3_0_2_0()); 
            match(input,17,FOLLOW_3); 
             after(grammarAccess.getDatasheetPropertyAccess().getUnitKeyword_3_0_2_0()); 

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_0_2__0__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group_3_0_2__1"
    // InternalGenericDatasheet.g:460:1: rule__DatasheetProperty__Group_3_0_2__1 : rule__DatasheetProperty__Group_3_0_2__1__Impl ;
    public final void rule__DatasheetProperty__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:464:1: ( rule__DatasheetProperty__Group_3_0_2__1__Impl )
            // InternalGenericDatasheet.g:465:2: rule__DatasheetProperty__Group_3_0_2__1__Impl
            {
            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group_3_0_2__1__Impl();

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_0_2__1"


    // $ANTLR start "rule__DatasheetProperty__Group_3_0_2__1__Impl"
    // InternalGenericDatasheet.g:471:1: rule__DatasheetProperty__Group_3_0_2__1__Impl : ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:475:1: ( ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) ) )
            // InternalGenericDatasheet.g:476:1: ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) )
            {
            // InternalGenericDatasheet.g:476:1: ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) )
            // InternalGenericDatasheet.g:477:2: ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getUnitAssignment_3_0_2_1()); 
            // InternalGenericDatasheet.g:478:2: ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 )
            // InternalGenericDatasheet.g:478:3: rule__DatasheetProperty__UnitAssignment_3_0_2_1
            {
            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__UnitAssignment_3_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDatasheetPropertyAccess().getUnitAssignment_3_0_2_1()); 

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_0_2__1__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group_3_1__0"
    // InternalGenericDatasheet.g:487:1: rule__DatasheetProperty__Group_3_1__0 : rule__DatasheetProperty__Group_3_1__0__Impl rule__DatasheetProperty__Group_3_1__1 ;
    public final void rule__DatasheetProperty__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:491:1: ( rule__DatasheetProperty__Group_3_1__0__Impl rule__DatasheetProperty__Group_3_1__1 )
            // InternalGenericDatasheet.g:492:2: rule__DatasheetProperty__Group_3_1__0__Impl rule__DatasheetProperty__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__DatasheetProperty__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group_3_1__1();

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_1__0"


    // $ANTLR start "rule__DatasheetProperty__Group_3_1__0__Impl"
    // InternalGenericDatasheet.g:499:1: rule__DatasheetProperty__Group_3_1__0__Impl : ( 'shortDescription' ) ;
    public final void rule__DatasheetProperty__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:503:1: ( ( 'shortDescription' ) )
            // InternalGenericDatasheet.g:504:1: ( 'shortDescription' )
            {
            // InternalGenericDatasheet.g:504:1: ( 'shortDescription' )
            // InternalGenericDatasheet.g:505:2: 'shortDescription'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionKeyword_3_1_0()); 
            match(input,18,FOLLOW_3); 
             after(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionKeyword_3_1_0()); 

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_1__0__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group_3_1__1"
    // InternalGenericDatasheet.g:514:1: rule__DatasheetProperty__Group_3_1__1 : rule__DatasheetProperty__Group_3_1__1__Impl ;
    public final void rule__DatasheetProperty__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:518:1: ( rule__DatasheetProperty__Group_3_1__1__Impl )
            // InternalGenericDatasheet.g:519:2: rule__DatasheetProperty__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_1__1"


    // $ANTLR start "rule__DatasheetProperty__Group_3_1__1__Impl"
    // InternalGenericDatasheet.g:525:1: rule__DatasheetProperty__Group_3_1__1__Impl : ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:529:1: ( ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) ) )
            // InternalGenericDatasheet.g:530:1: ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) )
            {
            // InternalGenericDatasheet.g:530:1: ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) )
            // InternalGenericDatasheet.g:531:2: ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionAssignment_3_1_1()); 
            // InternalGenericDatasheet.g:532:2: ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 )
            // InternalGenericDatasheet.g:532:3: rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1
            {
            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionAssignment_3_1_1()); 

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_1__1__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group_3_2__0"
    // InternalGenericDatasheet.g:541:1: rule__DatasheetProperty__Group_3_2__0 : rule__DatasheetProperty__Group_3_2__0__Impl rule__DatasheetProperty__Group_3_2__1 ;
    public final void rule__DatasheetProperty__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:545:1: ( rule__DatasheetProperty__Group_3_2__0__Impl rule__DatasheetProperty__Group_3_2__1 )
            // InternalGenericDatasheet.g:546:2: rule__DatasheetProperty__Group_3_2__0__Impl rule__DatasheetProperty__Group_3_2__1
            {
            pushFollow(FOLLOW_8);
            rule__DatasheetProperty__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group_3_2__1();

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_2__0"


    // $ANTLR start "rule__DatasheetProperty__Group_3_2__0__Impl"
    // InternalGenericDatasheet.g:553:1: rule__DatasheetProperty__Group_3_2__0__Impl : ( 'semanticID' ) ;
    public final void rule__DatasheetProperty__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:557:1: ( ( 'semanticID' ) )
            // InternalGenericDatasheet.g:558:1: ( 'semanticID' )
            {
            // InternalGenericDatasheet.g:558:1: ( 'semanticID' )
            // InternalGenericDatasheet.g:559:2: 'semanticID'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getSemanticIDKeyword_3_2_0()); 
            match(input,19,FOLLOW_3); 
             after(grammarAccess.getDatasheetPropertyAccess().getSemanticIDKeyword_3_2_0()); 

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_2__0__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group_3_2__1"
    // InternalGenericDatasheet.g:568:1: rule__DatasheetProperty__Group_3_2__1 : rule__DatasheetProperty__Group_3_2__1__Impl ;
    public final void rule__DatasheetProperty__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:572:1: ( rule__DatasheetProperty__Group_3_2__1__Impl )
            // InternalGenericDatasheet.g:573:2: rule__DatasheetProperty__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_2__1"


    // $ANTLR start "rule__DatasheetProperty__Group_3_2__1__Impl"
    // InternalGenericDatasheet.g:579:1: rule__DatasheetProperty__Group_3_2__1__Impl : ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:583:1: ( ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) ) )
            // InternalGenericDatasheet.g:584:1: ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) )
            {
            // InternalGenericDatasheet.g:584:1: ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) )
            // InternalGenericDatasheet.g:585:2: ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getSemanticIDAssignment_3_2_1()); 
            // InternalGenericDatasheet.g:586:2: ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 )
            // InternalGenericDatasheet.g:586:3: rule__DatasheetProperty__SemanticIDAssignment_3_2_1
            {
            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__SemanticIDAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDatasheetPropertyAccess().getSemanticIDAssignment_3_2_1()); 

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
    // $ANTLR end "rule__DatasheetProperty__Group_3_2__1__Impl"


    // $ANTLR start "rule__MandatoryDatasheetElement__Group__0"
    // InternalGenericDatasheet.g:595:1: rule__MandatoryDatasheetElement__Group__0 : rule__MandatoryDatasheetElement__Group__0__Impl rule__MandatoryDatasheetElement__Group__1 ;
    public final void rule__MandatoryDatasheetElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:599:1: ( rule__MandatoryDatasheetElement__Group__0__Impl rule__MandatoryDatasheetElement__Group__1 )
            // InternalGenericDatasheet.g:600:2: rule__MandatoryDatasheetElement__Group__0__Impl rule__MandatoryDatasheetElement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MandatoryDatasheetElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_3);
            rule__MandatoryDatasheetElement__Group__1();

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
    // $ANTLR end "rule__MandatoryDatasheetElement__Group__0"


    // $ANTLR start "rule__MandatoryDatasheetElement__Group__0__Impl"
    // InternalGenericDatasheet.g:607:1: rule__MandatoryDatasheetElement__Group__0__Impl : ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) ) ;
    public final void rule__MandatoryDatasheetElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:611:1: ( ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) ) )
            // InternalGenericDatasheet.g:612:1: ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) )
            {
            // InternalGenericDatasheet.g:612:1: ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) )
            // InternalGenericDatasheet.g:613:2: ( rule__MandatoryDatasheetElement__NameAssignment_0 )
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getNameAssignment_0()); 
            // InternalGenericDatasheet.g:614:2: ( rule__MandatoryDatasheetElement__NameAssignment_0 )
            // InternalGenericDatasheet.g:614:3: rule__MandatoryDatasheetElement__NameAssignment_0
            {
            pushFollow(FOLLOW_3);
            rule__MandatoryDatasheetElement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryDatasheetElementAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__MandatoryDatasheetElement__Group__0__Impl"


    // $ANTLR start "rule__MandatoryDatasheetElement__Group__1"
    // InternalGenericDatasheet.g:622:1: rule__MandatoryDatasheetElement__Group__1 : rule__MandatoryDatasheetElement__Group__1__Impl ;
    public final void rule__MandatoryDatasheetElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:626:1: ( rule__MandatoryDatasheetElement__Group__1__Impl )
            // InternalGenericDatasheet.g:627:2: rule__MandatoryDatasheetElement__Group__1__Impl
            {
            pushFollow(FOLLOW_3);
            rule__MandatoryDatasheetElement__Group__1__Impl();

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
    // $ANTLR end "rule__MandatoryDatasheetElement__Group__1"


    // $ANTLR start "rule__MandatoryDatasheetElement__Group__1__Impl"
    // InternalGenericDatasheet.g:633:1: rule__MandatoryDatasheetElement__Group__1__Impl : ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) ) ;
    public final void rule__MandatoryDatasheetElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:637:1: ( ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) ) )
            // InternalGenericDatasheet.g:638:1: ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) )
            {
            // InternalGenericDatasheet.g:638:1: ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) )
            // InternalGenericDatasheet.g:639:2: ( rule__MandatoryDatasheetElement__ValueAssignment_1 )
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getValueAssignment_1()); 
            // InternalGenericDatasheet.g:640:2: ( rule__MandatoryDatasheetElement__ValueAssignment_1 )
            // InternalGenericDatasheet.g:640:3: rule__MandatoryDatasheetElement__ValueAssignment_1
            {
            pushFollow(FOLLOW_3);
            rule__MandatoryDatasheetElement__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryDatasheetElementAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__MandatoryDatasheetElement__Group__1__Impl"


    // $ANTLR start "rule__DatasheetProperty__UnorderedGroup_3"
    // InternalGenericDatasheet.g:649:1: rule__DatasheetProperty__UnorderedGroup_3 : rule__DatasheetProperty__UnorderedGroup_3__0 {...}?;
    public final void rule__DatasheetProperty__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
        	
        try {
            // InternalGenericDatasheet.g:654:1: ( rule__DatasheetProperty__UnorderedGroup_3__0 {...}?)
            // InternalGenericDatasheet.g:655:2: rule__DatasheetProperty__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__DatasheetProperty__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasheetProperty__UnorderedGroup_3"


    // $ANTLR start "rule__DatasheetProperty__UnorderedGroup_3__Impl"
    // InternalGenericDatasheet.g:663:1: rule__DatasheetProperty__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalGenericDatasheet.g:668:1: ( ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) ) )
            // InternalGenericDatasheet.g:669:3: ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) )
            {
            // InternalGenericDatasheet.g:669:3: ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( LA5_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                alt5=1;
            }
            else if ( LA5_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                alt5=2;
            }
            else if ( LA5_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGenericDatasheet.g:670:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) )
                    {
                    // InternalGenericDatasheet.g:670:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) )
                    // InternalGenericDatasheet.g:671:4: {...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__DatasheetProperty__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalGenericDatasheet.g:671:113: ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) )
                    // InternalGenericDatasheet.g:672:5: ( ( rule__DatasheetProperty__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalGenericDatasheet.g:678:5: ( ( rule__DatasheetProperty__Group_3_0__0 ) )
                    // InternalGenericDatasheet.g:679:6: ( rule__DatasheetProperty__Group_3_0__0 )
                    {
                     before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0()); 
                    // InternalGenericDatasheet.g:680:6: ( rule__DatasheetProperty__Group_3_0__0 )
                    // InternalGenericDatasheet.g:680:7: rule__DatasheetProperty__Group_3_0__0
                    {
                    pushFollow(FOLLOW_3);
                    rule__DatasheetProperty__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGenericDatasheet.g:685:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) )
                    {
                    // InternalGenericDatasheet.g:685:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) )
                    // InternalGenericDatasheet.g:686:4: {...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__DatasheetProperty__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalGenericDatasheet.g:686:113: ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) )
                    // InternalGenericDatasheet.g:687:5: ( ( rule__DatasheetProperty__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalGenericDatasheet.g:693:5: ( ( rule__DatasheetProperty__Group_3_1__0 ) )
                    // InternalGenericDatasheet.g:694:6: ( rule__DatasheetProperty__Group_3_1__0 )
                    {
                     before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_1()); 
                    // InternalGenericDatasheet.g:695:6: ( rule__DatasheetProperty__Group_3_1__0 )
                    // InternalGenericDatasheet.g:695:7: rule__DatasheetProperty__Group_3_1__0
                    {
                    pushFollow(FOLLOW_3);
                    rule__DatasheetProperty__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDatasheetPropertyAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGenericDatasheet.g:700:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) )
                    {
                    // InternalGenericDatasheet.g:700:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) )
                    // InternalGenericDatasheet.g:701:4: {...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__DatasheetProperty__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalGenericDatasheet.g:701:113: ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) )
                    // InternalGenericDatasheet.g:702:5: ( ( rule__DatasheetProperty__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalGenericDatasheet.g:708:5: ( ( rule__DatasheetProperty__Group_3_2__0 ) )
                    // InternalGenericDatasheet.g:709:6: ( rule__DatasheetProperty__Group_3_2__0 )
                    {
                     before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_2()); 
                    // InternalGenericDatasheet.g:710:6: ( rule__DatasheetProperty__Group_3_2__0 )
                    // InternalGenericDatasheet.g:710:7: rule__DatasheetProperty__Group_3_2__0
                    {
                    pushFollow(FOLLOW_3);
                    rule__DatasheetProperty__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDatasheetPropertyAccess().getGroup_3_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasheetProperty__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__DatasheetProperty__UnorderedGroup_3__0"
    // InternalGenericDatasheet.g:723:1: rule__DatasheetProperty__UnorderedGroup_3__0 : rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__1 )? ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:727:1: ( rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__1 )? )
            // InternalGenericDatasheet.g:728:2: rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_10);
            rule__DatasheetProperty__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalGenericDatasheet.g:729:2: ( rule__DatasheetProperty__UnorderedGroup_3__1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( LA6_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                alt6=1;
            }
            else if ( LA6_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                alt6=1;
            }
            else if ( LA6_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGenericDatasheet.g:729:2: rule__DatasheetProperty__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_3);
                    rule__DatasheetProperty__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__DatasheetProperty__UnorderedGroup_3__0"


    // $ANTLR start "rule__DatasheetProperty__UnorderedGroup_3__1"
    // InternalGenericDatasheet.g:735:1: rule__DatasheetProperty__UnorderedGroup_3__1 : rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__2 )? ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:739:1: ( rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__2 )? )
            // InternalGenericDatasheet.g:740:2: rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_10);
            rule__DatasheetProperty__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalGenericDatasheet.g:741:2: ( rule__DatasheetProperty__UnorderedGroup_3__2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( LA7_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                alt7=1;
            }
            else if ( LA7_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                alt7=1;
            }
            else if ( LA7_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGenericDatasheet.g:741:2: rule__DatasheetProperty__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_3);
                    rule__DatasheetProperty__UnorderedGroup_3__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__DatasheetProperty__UnorderedGroup_3__1"


    // $ANTLR start "rule__DatasheetProperty__UnorderedGroup_3__2"
    // InternalGenericDatasheet.g:747:1: rule__DatasheetProperty__UnorderedGroup_3__2 : rule__DatasheetProperty__UnorderedGroup_3__Impl ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:751:1: ( rule__DatasheetProperty__UnorderedGroup_3__Impl )
            // InternalGenericDatasheet.g:752:2: rule__DatasheetProperty__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_3);
            rule__DatasheetProperty__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__DatasheetProperty__UnorderedGroup_3__2"


    // $ANTLR start "rule__GenericDatasheetModel__ElementsAssignment"
    // InternalGenericDatasheet.g:759:1: rule__GenericDatasheetModel__ElementsAssignment : ( ruleAbstractDatasheetElement ) ;
    public final void rule__GenericDatasheetModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:763:1: ( ( ruleAbstractDatasheetElement ) )
            // InternalGenericDatasheet.g:764:2: ( ruleAbstractDatasheetElement )
            {
            // InternalGenericDatasheet.g:764:2: ( ruleAbstractDatasheetElement )
            // InternalGenericDatasheet.g:765:3: ruleAbstractDatasheetElement
            {
             before(grammarAccess.getGenericDatasheetModelAccess().getElementsAbstractDatasheetElementParserRuleCall_0()); 
            pushFollow(FOLLOW_3);
            ruleAbstractDatasheetElement();

            state._fsp--;

             after(grammarAccess.getGenericDatasheetModelAccess().getElementsAbstractDatasheetElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__GenericDatasheetModel__ElementsAssignment"


    // $ANTLR start "rule__DatasheetProperty__NameAssignment_1"
    // InternalGenericDatasheet.g:774:1: rule__DatasheetProperty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DatasheetProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:778:1: ( ( RULE_ID ) )
            // InternalGenericDatasheet.g:779:2: ( RULE_ID )
            {
            // InternalGenericDatasheet.g:779:2: ( RULE_ID )
            // InternalGenericDatasheet.g:780:3: RULE_ID
            {
             before(grammarAccess.getDatasheetPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_3); 
             after(grammarAccess.getDatasheetPropertyAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DatasheetProperty__NameAssignment_1"


    // $ANTLR start "rule__DatasheetProperty__ValueAssignment_3_0_1"
    // InternalGenericDatasheet.g:789:1: rule__DatasheetProperty__ValueAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__ValueAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:793:1: ( ( RULE_STRING ) )
            // InternalGenericDatasheet.g:794:2: ( RULE_STRING )
            {
            // InternalGenericDatasheet.g:794:2: ( RULE_STRING )
            // InternalGenericDatasheet.g:795:3: RULE_STRING
            {
             before(grammarAccess.getDatasheetPropertyAccess().getValueSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_3); 
             after(grammarAccess.getDatasheetPropertyAccess().getValueSTRINGTerminalRuleCall_3_0_1_0()); 

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
    // $ANTLR end "rule__DatasheetProperty__ValueAssignment_3_0_1"


    // $ANTLR start "rule__DatasheetProperty__UnitAssignment_3_0_2_1"
    // InternalGenericDatasheet.g:804:1: rule__DatasheetProperty__UnitAssignment_3_0_2_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__UnitAssignment_3_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:808:1: ( ( RULE_STRING ) )
            // InternalGenericDatasheet.g:809:2: ( RULE_STRING )
            {
            // InternalGenericDatasheet.g:809:2: ( RULE_STRING )
            // InternalGenericDatasheet.g:810:3: RULE_STRING
            {
             before(grammarAccess.getDatasheetPropertyAccess().getUnitSTRINGTerminalRuleCall_3_0_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_3); 
             after(grammarAccess.getDatasheetPropertyAccess().getUnitSTRINGTerminalRuleCall_3_0_2_1_0()); 

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
    // $ANTLR end "rule__DatasheetProperty__UnitAssignment_3_0_2_1"


    // $ANTLR start "rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1"
    // InternalGenericDatasheet.g:819:1: rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:823:1: ( ( RULE_STRING ) )
            // InternalGenericDatasheet.g:824:2: ( RULE_STRING )
            {
            // InternalGenericDatasheet.g:824:2: ( RULE_STRING )
            // InternalGenericDatasheet.g:825:3: RULE_STRING
            {
             before(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_3); 
             after(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionSTRINGTerminalRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1"


    // $ANTLR start "rule__DatasheetProperty__SemanticIDAssignment_3_2_1"
    // InternalGenericDatasheet.g:834:1: rule__DatasheetProperty__SemanticIDAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__SemanticIDAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:838:1: ( ( RULE_STRING ) )
            // InternalGenericDatasheet.g:839:2: ( RULE_STRING )
            {
            // InternalGenericDatasheet.g:839:2: ( RULE_STRING )
            // InternalGenericDatasheet.g:840:3: RULE_STRING
            {
             before(grammarAccess.getDatasheetPropertyAccess().getSemanticIDSTRINGTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_3); 
             after(grammarAccess.getDatasheetPropertyAccess().getSemanticIDSTRINGTerminalRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__DatasheetProperty__SemanticIDAssignment_3_2_1"


    // $ANTLR start "rule__MandatoryDatasheetElement__NameAssignment_0"
    // InternalGenericDatasheet.g:849:1: rule__MandatoryDatasheetElement__NameAssignment_0 : ( ruleMandatoryDatasheetElementNames ) ;
    public final void rule__MandatoryDatasheetElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:853:1: ( ( ruleMandatoryDatasheetElementNames ) )
            // InternalGenericDatasheet.g:854:2: ( ruleMandatoryDatasheetElementNames )
            {
            // InternalGenericDatasheet.g:854:2: ( ruleMandatoryDatasheetElementNames )
            // InternalGenericDatasheet.g:855:3: ruleMandatoryDatasheetElementNames
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getNameMandatoryDatasheetElementNamesEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_3);
            ruleMandatoryDatasheetElementNames();

            state._fsp--;

             after(grammarAccess.getMandatoryDatasheetElementAccess().getNameMandatoryDatasheetElementNamesEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__MandatoryDatasheetElement__NameAssignment_0"


    // $ANTLR start "rule__MandatoryDatasheetElement__ValueAssignment_1"
    // InternalGenericDatasheet.g:864:1: rule__MandatoryDatasheetElement__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MandatoryDatasheetElement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:868:1: ( ( RULE_STRING ) )
            // InternalGenericDatasheet.g:869:2: ( RULE_STRING )
            {
            // InternalGenericDatasheet.g:869:2: ( RULE_STRING )
            // InternalGenericDatasheet.g:870:3: RULE_STRING
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_3); 
             after(grammarAccess.getMandatoryDatasheetElementAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MandatoryDatasheetElement__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000D0002L});

}
