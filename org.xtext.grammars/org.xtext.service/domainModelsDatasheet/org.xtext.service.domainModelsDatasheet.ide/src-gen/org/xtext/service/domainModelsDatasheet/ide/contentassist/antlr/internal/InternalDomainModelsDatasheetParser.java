package org.xtext.service.domainModelsDatasheet.ide.contentassist.antlr.internal;

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
import org.xtext.service.domainModelsDatasheet.services.DomainModelsDatasheetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainModelsDatasheetParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BaseURI'", "'ShortDescription'", "'DomainModelsDatasheet'", "'{'", "'}'", "'DatasheetProperty'", "'value'", "'unit'", "'shortDescription'", "'semanticID'"
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
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalDomainModelsDatasheetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainModelsDatasheetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainModelsDatasheetParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainModelsDatasheet.g"; }


    	private DomainModelsDatasheetGrammarAccess grammarAccess;

    	public void setGrammarAccess(DomainModelsDatasheetGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDomainModelsDatasheet"
    // InternalDomainModelsDatasheet.g:68:1: entryRuleDomainModelsDatasheet : ruleDomainModelsDatasheet EOF ;
    public final void entryRuleDomainModelsDatasheet() throws RecognitionException {
        try {
            // InternalDomainModelsDatasheet.g:69:1: ( ruleDomainModelsDatasheet EOF )
            // InternalDomainModelsDatasheet.g:70:1: ruleDomainModelsDatasheet EOF
            {
             before(grammarAccess.getDomainModelsDatasheetRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainModelsDatasheet();

            state._fsp--;

             after(grammarAccess.getDomainModelsDatasheetRule()); 
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
    // $ANTLR end "entryRuleDomainModelsDatasheet"


    // $ANTLR start "ruleDomainModelsDatasheet"
    // InternalDomainModelsDatasheet.g:77:1: ruleDomainModelsDatasheet : ( ( rule__DomainModelsDatasheet__Group__0 ) ) ;
    public final void ruleDomainModelsDatasheet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:81:2: ( ( ( rule__DomainModelsDatasheet__Group__0 ) ) )
            // InternalDomainModelsDatasheet.g:82:2: ( ( rule__DomainModelsDatasheet__Group__0 ) )
            {
            // InternalDomainModelsDatasheet.g:82:2: ( ( rule__DomainModelsDatasheet__Group__0 ) )
            // InternalDomainModelsDatasheet.g:83:3: ( rule__DomainModelsDatasheet__Group__0 )
            {
             before(grammarAccess.getDomainModelsDatasheetAccess().getGroup()); 
            // InternalDomainModelsDatasheet.g:84:3: ( rule__DomainModelsDatasheet__Group__0 )
            // InternalDomainModelsDatasheet.g:84:4: rule__DomainModelsDatasheet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DomainModelsDatasheet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelsDatasheetAccess().getGroup()); 

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
    // $ANTLR end "ruleDomainModelsDatasheet"


    // $ANTLR start "ruleGenericDatasheetModel"
    // InternalDomainModelsDatasheet.g:94:1: ruleGenericDatasheetModel : ( ( rule__GenericDatasheetModel__ElementsAssignment )* ) ;
    public final void ruleGenericDatasheetModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:98:2: ( ( ( rule__GenericDatasheetModel__ElementsAssignment )* ) )
            // InternalDomainModelsDatasheet.g:99:2: ( ( rule__GenericDatasheetModel__ElementsAssignment )* )
            {
            // InternalDomainModelsDatasheet.g:99:2: ( ( rule__GenericDatasheetModel__ElementsAssignment )* )
            // InternalDomainModelsDatasheet.g:100:3: ( rule__GenericDatasheetModel__ElementsAssignment )*
            {
             before(grammarAccess.getGenericDatasheetModelAccess().getElementsAssignment()); 
            // InternalDomainModelsDatasheet.g:101:3: ( rule__GenericDatasheetModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainModelsDatasheet.g:101:4: rule__GenericDatasheetModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
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
    // InternalDomainModelsDatasheet.g:110:1: entryRuleAbstractDatasheetElement : ruleAbstractDatasheetElement EOF ;
    public final void entryRuleAbstractDatasheetElement() throws RecognitionException {
        try {
            // InternalDomainModelsDatasheet.g:111:1: ( ruleAbstractDatasheetElement EOF )
            // InternalDomainModelsDatasheet.g:112:1: ruleAbstractDatasheetElement EOF
            {
             before(grammarAccess.getAbstractDatasheetElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractDatasheetElement();

            state._fsp--;

             after(grammarAccess.getAbstractDatasheetElementRule()); 
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
    // $ANTLR end "entryRuleAbstractDatasheetElement"


    // $ANTLR start "ruleAbstractDatasheetElement"
    // InternalDomainModelsDatasheet.g:119:1: ruleAbstractDatasheetElement : ( ( rule__AbstractDatasheetElement__Alternatives ) ) ;
    public final void ruleAbstractDatasheetElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:123:2: ( ( ( rule__AbstractDatasheetElement__Alternatives ) ) )
            // InternalDomainModelsDatasheet.g:124:2: ( ( rule__AbstractDatasheetElement__Alternatives ) )
            {
            // InternalDomainModelsDatasheet.g:124:2: ( ( rule__AbstractDatasheetElement__Alternatives ) )
            // InternalDomainModelsDatasheet.g:125:3: ( rule__AbstractDatasheetElement__Alternatives )
            {
             before(grammarAccess.getAbstractDatasheetElementAccess().getAlternatives()); 
            // InternalDomainModelsDatasheet.g:126:3: ( rule__AbstractDatasheetElement__Alternatives )
            // InternalDomainModelsDatasheet.g:126:4: rule__AbstractDatasheetElement__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:135:1: entryRuleDatasheetProperty : ruleDatasheetProperty EOF ;
    public final void entryRuleDatasheetProperty() throws RecognitionException {
        try {
            // InternalDomainModelsDatasheet.g:136:1: ( ruleDatasheetProperty EOF )
            // InternalDomainModelsDatasheet.g:137:1: ruleDatasheetProperty EOF
            {
             before(grammarAccess.getDatasheetPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleDatasheetProperty();

            state._fsp--;

             after(grammarAccess.getDatasheetPropertyRule()); 
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
    // $ANTLR end "entryRuleDatasheetProperty"


    // $ANTLR start "ruleDatasheetProperty"
    // InternalDomainModelsDatasheet.g:144:1: ruleDatasheetProperty : ( ( rule__DatasheetProperty__Group__0 ) ) ;
    public final void ruleDatasheetProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:148:2: ( ( ( rule__DatasheetProperty__Group__0 ) ) )
            // InternalDomainModelsDatasheet.g:149:2: ( ( rule__DatasheetProperty__Group__0 ) )
            {
            // InternalDomainModelsDatasheet.g:149:2: ( ( rule__DatasheetProperty__Group__0 ) )
            // InternalDomainModelsDatasheet.g:150:3: ( rule__DatasheetProperty__Group__0 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getGroup()); 
            // InternalDomainModelsDatasheet.g:151:3: ( rule__DatasheetProperty__Group__0 )
            // InternalDomainModelsDatasheet.g:151:4: rule__DatasheetProperty__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:160:1: entryRuleMandatoryDatasheetElement : ruleMandatoryDatasheetElement EOF ;
    public final void entryRuleMandatoryDatasheetElement() throws RecognitionException {
        try {
            // InternalDomainModelsDatasheet.g:161:1: ( ruleMandatoryDatasheetElement EOF )
            // InternalDomainModelsDatasheet.g:162:1: ruleMandatoryDatasheetElement EOF
            {
             before(grammarAccess.getMandatoryDatasheetElementRule()); 
            pushFollow(FOLLOW_1);
            ruleMandatoryDatasheetElement();

            state._fsp--;

             after(grammarAccess.getMandatoryDatasheetElementRule()); 
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
    // $ANTLR end "entryRuleMandatoryDatasheetElement"


    // $ANTLR start "ruleMandatoryDatasheetElement"
    // InternalDomainModelsDatasheet.g:169:1: ruleMandatoryDatasheetElement : ( ( rule__MandatoryDatasheetElement__Group__0 ) ) ;
    public final void ruleMandatoryDatasheetElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:173:2: ( ( ( rule__MandatoryDatasheetElement__Group__0 ) ) )
            // InternalDomainModelsDatasheet.g:174:2: ( ( rule__MandatoryDatasheetElement__Group__0 ) )
            {
            // InternalDomainModelsDatasheet.g:174:2: ( ( rule__MandatoryDatasheetElement__Group__0 ) )
            // InternalDomainModelsDatasheet.g:175:3: ( rule__MandatoryDatasheetElement__Group__0 )
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getGroup()); 
            // InternalDomainModelsDatasheet.g:176:3: ( rule__MandatoryDatasheetElement__Group__0 )
            // InternalDomainModelsDatasheet.g:176:4: rule__MandatoryDatasheetElement__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:185:1: ruleMandatoryDatasheetElementNames : ( ( rule__MandatoryDatasheetElementNames__Alternatives ) ) ;
    public final void ruleMandatoryDatasheetElementNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:189:1: ( ( ( rule__MandatoryDatasheetElementNames__Alternatives ) ) )
            // InternalDomainModelsDatasheet.g:190:2: ( ( rule__MandatoryDatasheetElementNames__Alternatives ) )
            {
            // InternalDomainModelsDatasheet.g:190:2: ( ( rule__MandatoryDatasheetElementNames__Alternatives ) )
            // InternalDomainModelsDatasheet.g:191:3: ( rule__MandatoryDatasheetElementNames__Alternatives )
            {
             before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getAlternatives()); 
            // InternalDomainModelsDatasheet.g:192:3: ( rule__MandatoryDatasheetElementNames__Alternatives )
            // InternalDomainModelsDatasheet.g:192:4: rule__MandatoryDatasheetElementNames__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:200:1: rule__AbstractDatasheetElement__Alternatives : ( ( ruleDatasheetProperty ) | ( ruleMandatoryDatasheetElement ) );
    public final void rule__AbstractDatasheetElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:204:1: ( ( ruleDatasheetProperty ) | ( ruleMandatoryDatasheetElement ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
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
                    // InternalDomainModelsDatasheet.g:205:2: ( ruleDatasheetProperty )
                    {
                    // InternalDomainModelsDatasheet.g:205:2: ( ruleDatasheetProperty )
                    // InternalDomainModelsDatasheet.g:206:3: ruleDatasheetProperty
                    {
                     before(grammarAccess.getAbstractDatasheetElementAccess().getDatasheetPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDatasheetProperty();

                    state._fsp--;

                     after(grammarAccess.getAbstractDatasheetElementAccess().getDatasheetPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModelsDatasheet.g:211:2: ( ruleMandatoryDatasheetElement )
                    {
                    // InternalDomainModelsDatasheet.g:211:2: ( ruleMandatoryDatasheetElement )
                    // InternalDomainModelsDatasheet.g:212:3: ruleMandatoryDatasheetElement
                    {
                     before(grammarAccess.getAbstractDatasheetElementAccess().getMandatoryDatasheetElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:221:1: rule__MandatoryDatasheetElementNames__Alternatives : ( ( ( 'BaseURI' ) ) | ( ( 'ShortDescription' ) ) );
    public final void rule__MandatoryDatasheetElementNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:225:1: ( ( ( 'BaseURI' ) ) | ( ( 'ShortDescription' ) ) )
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
                    // InternalDomainModelsDatasheet.g:226:2: ( ( 'BaseURI' ) )
                    {
                    // InternalDomainModelsDatasheet.g:226:2: ( ( 'BaseURI' ) )
                    // InternalDomainModelsDatasheet.g:227:3: ( 'BaseURI' )
                    {
                     before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0()); 
                    // InternalDomainModelsDatasheet.g:228:3: ( 'BaseURI' )
                    // InternalDomainModelsDatasheet.g:228:4: 'BaseURI'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModelsDatasheet.g:232:2: ( ( 'ShortDescription' ) )
                    {
                    // InternalDomainModelsDatasheet.g:232:2: ( ( 'ShortDescription' ) )
                    // InternalDomainModelsDatasheet.g:233:3: ( 'ShortDescription' )
                    {
                     before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getShortDescriptionEnumLiteralDeclaration_1()); 
                    // InternalDomainModelsDatasheet.g:234:3: ( 'ShortDescription' )
                    // InternalDomainModelsDatasheet.g:234:4: 'ShortDescription'
                    {
                    match(input,12,FOLLOW_2); 

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


    // $ANTLR start "rule__DomainModelsDatasheet__Group__0"
    // InternalDomainModelsDatasheet.g:242:1: rule__DomainModelsDatasheet__Group__0 : rule__DomainModelsDatasheet__Group__0__Impl rule__DomainModelsDatasheet__Group__1 ;
    public final void rule__DomainModelsDatasheet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:246:1: ( rule__DomainModelsDatasheet__Group__0__Impl rule__DomainModelsDatasheet__Group__1 )
            // InternalDomainModelsDatasheet.g:247:2: rule__DomainModelsDatasheet__Group__0__Impl rule__DomainModelsDatasheet__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DomainModelsDatasheet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModelsDatasheet__Group__1();

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
    // $ANTLR end "rule__DomainModelsDatasheet__Group__0"


    // $ANTLR start "rule__DomainModelsDatasheet__Group__0__Impl"
    // InternalDomainModelsDatasheet.g:254:1: rule__DomainModelsDatasheet__Group__0__Impl : ( 'DomainModelsDatasheet' ) ;
    public final void rule__DomainModelsDatasheet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:258:1: ( ( 'DomainModelsDatasheet' ) )
            // InternalDomainModelsDatasheet.g:259:1: ( 'DomainModelsDatasheet' )
            {
            // InternalDomainModelsDatasheet.g:259:1: ( 'DomainModelsDatasheet' )
            // InternalDomainModelsDatasheet.g:260:2: 'DomainModelsDatasheet'
            {
             before(grammarAccess.getDomainModelsDatasheetAccess().getDomainModelsDatasheetKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDomainModelsDatasheetAccess().getDomainModelsDatasheetKeyword_0()); 

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
    // $ANTLR end "rule__DomainModelsDatasheet__Group__0__Impl"


    // $ANTLR start "rule__DomainModelsDatasheet__Group__1"
    // InternalDomainModelsDatasheet.g:269:1: rule__DomainModelsDatasheet__Group__1 : rule__DomainModelsDatasheet__Group__1__Impl rule__DomainModelsDatasheet__Group__2 ;
    public final void rule__DomainModelsDatasheet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:273:1: ( rule__DomainModelsDatasheet__Group__1__Impl rule__DomainModelsDatasheet__Group__2 )
            // InternalDomainModelsDatasheet.g:274:2: rule__DomainModelsDatasheet__Group__1__Impl rule__DomainModelsDatasheet__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DomainModelsDatasheet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModelsDatasheet__Group__2();

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
    // $ANTLR end "rule__DomainModelsDatasheet__Group__1"


    // $ANTLR start "rule__DomainModelsDatasheet__Group__1__Impl"
    // InternalDomainModelsDatasheet.g:281:1: rule__DomainModelsDatasheet__Group__1__Impl : ( ( rule__DomainModelsDatasheet__NameAssignment_1 ) ) ;
    public final void rule__DomainModelsDatasheet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:285:1: ( ( ( rule__DomainModelsDatasheet__NameAssignment_1 ) ) )
            // InternalDomainModelsDatasheet.g:286:1: ( ( rule__DomainModelsDatasheet__NameAssignment_1 ) )
            {
            // InternalDomainModelsDatasheet.g:286:1: ( ( rule__DomainModelsDatasheet__NameAssignment_1 ) )
            // InternalDomainModelsDatasheet.g:287:2: ( rule__DomainModelsDatasheet__NameAssignment_1 )
            {
             before(grammarAccess.getDomainModelsDatasheetAccess().getNameAssignment_1()); 
            // InternalDomainModelsDatasheet.g:288:2: ( rule__DomainModelsDatasheet__NameAssignment_1 )
            // InternalDomainModelsDatasheet.g:288:3: rule__DomainModelsDatasheet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainModelsDatasheet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelsDatasheetAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DomainModelsDatasheet__Group__1__Impl"


    // $ANTLR start "rule__DomainModelsDatasheet__Group__2"
    // InternalDomainModelsDatasheet.g:296:1: rule__DomainModelsDatasheet__Group__2 : rule__DomainModelsDatasheet__Group__2__Impl rule__DomainModelsDatasheet__Group__3 ;
    public final void rule__DomainModelsDatasheet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:300:1: ( rule__DomainModelsDatasheet__Group__2__Impl rule__DomainModelsDatasheet__Group__3 )
            // InternalDomainModelsDatasheet.g:301:2: rule__DomainModelsDatasheet__Group__2__Impl rule__DomainModelsDatasheet__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DomainModelsDatasheet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModelsDatasheet__Group__3();

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
    // $ANTLR end "rule__DomainModelsDatasheet__Group__2"


    // $ANTLR start "rule__DomainModelsDatasheet__Group__2__Impl"
    // InternalDomainModelsDatasheet.g:308:1: rule__DomainModelsDatasheet__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainModelsDatasheet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:312:1: ( ( '{' ) )
            // InternalDomainModelsDatasheet.g:313:1: ( '{' )
            {
            // InternalDomainModelsDatasheet.g:313:1: ( '{' )
            // InternalDomainModelsDatasheet.g:314:2: '{'
            {
             before(grammarAccess.getDomainModelsDatasheetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDomainModelsDatasheetAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DomainModelsDatasheet__Group__2__Impl"


    // $ANTLR start "rule__DomainModelsDatasheet__Group__3"
    // InternalDomainModelsDatasheet.g:323:1: rule__DomainModelsDatasheet__Group__3 : rule__DomainModelsDatasheet__Group__3__Impl rule__DomainModelsDatasheet__Group__4 ;
    public final void rule__DomainModelsDatasheet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:327:1: ( rule__DomainModelsDatasheet__Group__3__Impl rule__DomainModelsDatasheet__Group__4 )
            // InternalDomainModelsDatasheet.g:328:2: rule__DomainModelsDatasheet__Group__3__Impl rule__DomainModelsDatasheet__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__DomainModelsDatasheet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModelsDatasheet__Group__4();

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
    // $ANTLR end "rule__DomainModelsDatasheet__Group__3"


    // $ANTLR start "rule__DomainModelsDatasheet__Group__3__Impl"
    // InternalDomainModelsDatasheet.g:335:1: rule__DomainModelsDatasheet__Group__3__Impl : ( ruleGenericDatasheetModel ) ;
    public final void rule__DomainModelsDatasheet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:339:1: ( ( ruleGenericDatasheetModel ) )
            // InternalDomainModelsDatasheet.g:340:1: ( ruleGenericDatasheetModel )
            {
            // InternalDomainModelsDatasheet.g:340:1: ( ruleGenericDatasheetModel )
            // InternalDomainModelsDatasheet.g:341:2: ruleGenericDatasheetModel
            {
             before(grammarAccess.getDomainModelsDatasheetAccess().getGenericDatasheetModelParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleGenericDatasheetModel();

            state._fsp--;

             after(grammarAccess.getDomainModelsDatasheetAccess().getGenericDatasheetModelParserRuleCall_3()); 

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
    // $ANTLR end "rule__DomainModelsDatasheet__Group__3__Impl"


    // $ANTLR start "rule__DomainModelsDatasheet__Group__4"
    // InternalDomainModelsDatasheet.g:350:1: rule__DomainModelsDatasheet__Group__4 : rule__DomainModelsDatasheet__Group__4__Impl ;
    public final void rule__DomainModelsDatasheet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:354:1: ( rule__DomainModelsDatasheet__Group__4__Impl )
            // InternalDomainModelsDatasheet.g:355:2: rule__DomainModelsDatasheet__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainModelsDatasheet__Group__4__Impl();

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
    // $ANTLR end "rule__DomainModelsDatasheet__Group__4"


    // $ANTLR start "rule__DomainModelsDatasheet__Group__4__Impl"
    // InternalDomainModelsDatasheet.g:361:1: rule__DomainModelsDatasheet__Group__4__Impl : ( '}' ) ;
    public final void rule__DomainModelsDatasheet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:365:1: ( ( '}' ) )
            // InternalDomainModelsDatasheet.g:366:1: ( '}' )
            {
            // InternalDomainModelsDatasheet.g:366:1: ( '}' )
            // InternalDomainModelsDatasheet.g:367:2: '}'
            {
             before(grammarAccess.getDomainModelsDatasheetAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDomainModelsDatasheetAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__DomainModelsDatasheet__Group__4__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group__0"
    // InternalDomainModelsDatasheet.g:377:1: rule__DatasheetProperty__Group__0 : rule__DatasheetProperty__Group__0__Impl rule__DatasheetProperty__Group__1 ;
    public final void rule__DatasheetProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:381:1: ( rule__DatasheetProperty__Group__0__Impl rule__DatasheetProperty__Group__1 )
            // InternalDomainModelsDatasheet.g:382:2: rule__DatasheetProperty__Group__0__Impl rule__DatasheetProperty__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DatasheetProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:389:1: rule__DatasheetProperty__Group__0__Impl : ( 'DatasheetProperty' ) ;
    public final void rule__DatasheetProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:393:1: ( ( 'DatasheetProperty' ) )
            // InternalDomainModelsDatasheet.g:394:1: ( 'DatasheetProperty' )
            {
            // InternalDomainModelsDatasheet.g:394:1: ( 'DatasheetProperty' )
            // InternalDomainModelsDatasheet.g:395:2: 'DatasheetProperty'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getDatasheetPropertyKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDomainModelsDatasheet.g:404:1: rule__DatasheetProperty__Group__1 : rule__DatasheetProperty__Group__1__Impl rule__DatasheetProperty__Group__2 ;
    public final void rule__DatasheetProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:408:1: ( rule__DatasheetProperty__Group__1__Impl rule__DatasheetProperty__Group__2 )
            // InternalDomainModelsDatasheet.g:409:2: rule__DatasheetProperty__Group__1__Impl rule__DatasheetProperty__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DatasheetProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:416:1: rule__DatasheetProperty__Group__1__Impl : ( ( rule__DatasheetProperty__NameAssignment_1 ) ) ;
    public final void rule__DatasheetProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:420:1: ( ( ( rule__DatasheetProperty__NameAssignment_1 ) ) )
            // InternalDomainModelsDatasheet.g:421:1: ( ( rule__DatasheetProperty__NameAssignment_1 ) )
            {
            // InternalDomainModelsDatasheet.g:421:1: ( ( rule__DatasheetProperty__NameAssignment_1 ) )
            // InternalDomainModelsDatasheet.g:422:2: ( rule__DatasheetProperty__NameAssignment_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getNameAssignment_1()); 
            // InternalDomainModelsDatasheet.g:423:2: ( rule__DatasheetProperty__NameAssignment_1 )
            // InternalDomainModelsDatasheet.g:423:3: rule__DatasheetProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:431:1: rule__DatasheetProperty__Group__2 : rule__DatasheetProperty__Group__2__Impl rule__DatasheetProperty__Group__3 ;
    public final void rule__DatasheetProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:435:1: ( rule__DatasheetProperty__Group__2__Impl rule__DatasheetProperty__Group__3 )
            // InternalDomainModelsDatasheet.g:436:2: rule__DatasheetProperty__Group__2__Impl rule__DatasheetProperty__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__DatasheetProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:443:1: rule__DatasheetProperty__Group__2__Impl : ( '{' ) ;
    public final void rule__DatasheetProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:447:1: ( ( '{' ) )
            // InternalDomainModelsDatasheet.g:448:1: ( '{' )
            {
            // InternalDomainModelsDatasheet.g:448:1: ( '{' )
            // InternalDomainModelsDatasheet.g:449:2: '{'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDomainModelsDatasheet.g:458:1: rule__DatasheetProperty__Group__3 : rule__DatasheetProperty__Group__3__Impl rule__DatasheetProperty__Group__4 ;
    public final void rule__DatasheetProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:462:1: ( rule__DatasheetProperty__Group__3__Impl rule__DatasheetProperty__Group__4 )
            // InternalDomainModelsDatasheet.g:463:2: rule__DatasheetProperty__Group__3__Impl rule__DatasheetProperty__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__DatasheetProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:470:1: rule__DatasheetProperty__Group__3__Impl : ( ( rule__DatasheetProperty__UnorderedGroup_3 ) ) ;
    public final void rule__DatasheetProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:474:1: ( ( ( rule__DatasheetProperty__UnorderedGroup_3 ) ) )
            // InternalDomainModelsDatasheet.g:475:1: ( ( rule__DatasheetProperty__UnorderedGroup_3 ) )
            {
            // InternalDomainModelsDatasheet.g:475:1: ( ( rule__DatasheetProperty__UnorderedGroup_3 ) )
            // InternalDomainModelsDatasheet.g:476:2: ( rule__DatasheetProperty__UnorderedGroup_3 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3()); 
            // InternalDomainModelsDatasheet.g:477:2: ( rule__DatasheetProperty__UnorderedGroup_3 )
            // InternalDomainModelsDatasheet.g:477:3: rule__DatasheetProperty__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:485:1: rule__DatasheetProperty__Group__4 : rule__DatasheetProperty__Group__4__Impl ;
    public final void rule__DatasheetProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:489:1: ( rule__DatasheetProperty__Group__4__Impl )
            // InternalDomainModelsDatasheet.g:490:2: rule__DatasheetProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:496:1: rule__DatasheetProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__DatasheetProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:500:1: ( ( '}' ) )
            // InternalDomainModelsDatasheet.g:501:1: ( '}' )
            {
            // InternalDomainModelsDatasheet.g:501:1: ( '}' )
            // InternalDomainModelsDatasheet.g:502:2: '}'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDomainModelsDatasheet.g:512:1: rule__DatasheetProperty__Group_3_0__0 : rule__DatasheetProperty__Group_3_0__0__Impl rule__DatasheetProperty__Group_3_0__1 ;
    public final void rule__DatasheetProperty__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:516:1: ( rule__DatasheetProperty__Group_3_0__0__Impl rule__DatasheetProperty__Group_3_0__1 )
            // InternalDomainModelsDatasheet.g:517:2: rule__DatasheetProperty__Group_3_0__0__Impl rule__DatasheetProperty__Group_3_0__1
            {
            pushFollow(FOLLOW_9);
            rule__DatasheetProperty__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:524:1: rule__DatasheetProperty__Group_3_0__0__Impl : ( 'value' ) ;
    public final void rule__DatasheetProperty__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:528:1: ( ( 'value' ) )
            // InternalDomainModelsDatasheet.g:529:1: ( 'value' )
            {
            // InternalDomainModelsDatasheet.g:529:1: ( 'value' )
            // InternalDomainModelsDatasheet.g:530:2: 'value'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getValueKeyword_3_0_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDomainModelsDatasheet.g:539:1: rule__DatasheetProperty__Group_3_0__1 : rule__DatasheetProperty__Group_3_0__1__Impl rule__DatasheetProperty__Group_3_0__2 ;
    public final void rule__DatasheetProperty__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:543:1: ( rule__DatasheetProperty__Group_3_0__1__Impl rule__DatasheetProperty__Group_3_0__2 )
            // InternalDomainModelsDatasheet.g:544:2: rule__DatasheetProperty__Group_3_0__1__Impl rule__DatasheetProperty__Group_3_0__2
            {
            pushFollow(FOLLOW_10);
            rule__DatasheetProperty__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:551:1: rule__DatasheetProperty__Group_3_0__1__Impl : ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:555:1: ( ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) ) )
            // InternalDomainModelsDatasheet.g:556:1: ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) )
            {
            // InternalDomainModelsDatasheet.g:556:1: ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) )
            // InternalDomainModelsDatasheet.g:557:2: ( rule__DatasheetProperty__ValueAssignment_3_0_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getValueAssignment_3_0_1()); 
            // InternalDomainModelsDatasheet.g:558:2: ( rule__DatasheetProperty__ValueAssignment_3_0_1 )
            // InternalDomainModelsDatasheet.g:558:3: rule__DatasheetProperty__ValueAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:566:1: rule__DatasheetProperty__Group_3_0__2 : rule__DatasheetProperty__Group_3_0__2__Impl ;
    public final void rule__DatasheetProperty__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:570:1: ( rule__DatasheetProperty__Group_3_0__2__Impl )
            // InternalDomainModelsDatasheet.g:571:2: rule__DatasheetProperty__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:577:1: rule__DatasheetProperty__Group_3_0__2__Impl : ( ( rule__DatasheetProperty__Group_3_0_2__0 )? ) ;
    public final void rule__DatasheetProperty__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:581:1: ( ( ( rule__DatasheetProperty__Group_3_0_2__0 )? ) )
            // InternalDomainModelsDatasheet.g:582:1: ( ( rule__DatasheetProperty__Group_3_0_2__0 )? )
            {
            // InternalDomainModelsDatasheet.g:582:1: ( ( rule__DatasheetProperty__Group_3_0_2__0 )? )
            // InternalDomainModelsDatasheet.g:583:2: ( rule__DatasheetProperty__Group_3_0_2__0 )?
            {
             before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0_2()); 
            // InternalDomainModelsDatasheet.g:584:2: ( rule__DatasheetProperty__Group_3_0_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:584:3: rule__DatasheetProperty__Group_3_0_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:593:1: rule__DatasheetProperty__Group_3_0_2__0 : rule__DatasheetProperty__Group_3_0_2__0__Impl rule__DatasheetProperty__Group_3_0_2__1 ;
    public final void rule__DatasheetProperty__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:597:1: ( rule__DatasheetProperty__Group_3_0_2__0__Impl rule__DatasheetProperty__Group_3_0_2__1 )
            // InternalDomainModelsDatasheet.g:598:2: rule__DatasheetProperty__Group_3_0_2__0__Impl rule__DatasheetProperty__Group_3_0_2__1
            {
            pushFollow(FOLLOW_9);
            rule__DatasheetProperty__Group_3_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:605:1: rule__DatasheetProperty__Group_3_0_2__0__Impl : ( 'unit' ) ;
    public final void rule__DatasheetProperty__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:609:1: ( ( 'unit' ) )
            // InternalDomainModelsDatasheet.g:610:1: ( 'unit' )
            {
            // InternalDomainModelsDatasheet.g:610:1: ( 'unit' )
            // InternalDomainModelsDatasheet.g:611:2: 'unit'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getUnitKeyword_3_0_2_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDomainModelsDatasheet.g:620:1: rule__DatasheetProperty__Group_3_0_2__1 : rule__DatasheetProperty__Group_3_0_2__1__Impl ;
    public final void rule__DatasheetProperty__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:624:1: ( rule__DatasheetProperty__Group_3_0_2__1__Impl )
            // InternalDomainModelsDatasheet.g:625:2: rule__DatasheetProperty__Group_3_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:631:1: rule__DatasheetProperty__Group_3_0_2__1__Impl : ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:635:1: ( ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) ) )
            // InternalDomainModelsDatasheet.g:636:1: ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) )
            {
            // InternalDomainModelsDatasheet.g:636:1: ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) )
            // InternalDomainModelsDatasheet.g:637:2: ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getUnitAssignment_3_0_2_1()); 
            // InternalDomainModelsDatasheet.g:638:2: ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 )
            // InternalDomainModelsDatasheet.g:638:3: rule__DatasheetProperty__UnitAssignment_3_0_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:647:1: rule__DatasheetProperty__Group_3_1__0 : rule__DatasheetProperty__Group_3_1__0__Impl rule__DatasheetProperty__Group_3_1__1 ;
    public final void rule__DatasheetProperty__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:651:1: ( rule__DatasheetProperty__Group_3_1__0__Impl rule__DatasheetProperty__Group_3_1__1 )
            // InternalDomainModelsDatasheet.g:652:2: rule__DatasheetProperty__Group_3_1__0__Impl rule__DatasheetProperty__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
            rule__DatasheetProperty__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:659:1: rule__DatasheetProperty__Group_3_1__0__Impl : ( 'shortDescription' ) ;
    public final void rule__DatasheetProperty__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:663:1: ( ( 'shortDescription' ) )
            // InternalDomainModelsDatasheet.g:664:1: ( 'shortDescription' )
            {
            // InternalDomainModelsDatasheet.g:664:1: ( 'shortDescription' )
            // InternalDomainModelsDatasheet.g:665:2: 'shortDescription'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionKeyword_3_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDomainModelsDatasheet.g:674:1: rule__DatasheetProperty__Group_3_1__1 : rule__DatasheetProperty__Group_3_1__1__Impl ;
    public final void rule__DatasheetProperty__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:678:1: ( rule__DatasheetProperty__Group_3_1__1__Impl )
            // InternalDomainModelsDatasheet.g:679:2: rule__DatasheetProperty__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:685:1: rule__DatasheetProperty__Group_3_1__1__Impl : ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:689:1: ( ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) ) )
            // InternalDomainModelsDatasheet.g:690:1: ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) )
            {
            // InternalDomainModelsDatasheet.g:690:1: ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) )
            // InternalDomainModelsDatasheet.g:691:2: ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionAssignment_3_1_1()); 
            // InternalDomainModelsDatasheet.g:692:2: ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 )
            // InternalDomainModelsDatasheet.g:692:3: rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:701:1: rule__DatasheetProperty__Group_3_2__0 : rule__DatasheetProperty__Group_3_2__0__Impl rule__DatasheetProperty__Group_3_2__1 ;
    public final void rule__DatasheetProperty__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:705:1: ( rule__DatasheetProperty__Group_3_2__0__Impl rule__DatasheetProperty__Group_3_2__1 )
            // InternalDomainModelsDatasheet.g:706:2: rule__DatasheetProperty__Group_3_2__0__Impl rule__DatasheetProperty__Group_3_2__1
            {
            pushFollow(FOLLOW_9);
            rule__DatasheetProperty__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:713:1: rule__DatasheetProperty__Group_3_2__0__Impl : ( 'semanticID' ) ;
    public final void rule__DatasheetProperty__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:717:1: ( ( 'semanticID' ) )
            // InternalDomainModelsDatasheet.g:718:1: ( 'semanticID' )
            {
            // InternalDomainModelsDatasheet.g:718:1: ( 'semanticID' )
            // InternalDomainModelsDatasheet.g:719:2: 'semanticID'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getSemanticIDKeyword_3_2_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDomainModelsDatasheet.g:728:1: rule__DatasheetProperty__Group_3_2__1 : rule__DatasheetProperty__Group_3_2__1__Impl ;
    public final void rule__DatasheetProperty__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:732:1: ( rule__DatasheetProperty__Group_3_2__1__Impl )
            // InternalDomainModelsDatasheet.g:733:2: rule__DatasheetProperty__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:739:1: rule__DatasheetProperty__Group_3_2__1__Impl : ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:743:1: ( ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) ) )
            // InternalDomainModelsDatasheet.g:744:1: ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) )
            {
            // InternalDomainModelsDatasheet.g:744:1: ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) )
            // InternalDomainModelsDatasheet.g:745:2: ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getSemanticIDAssignment_3_2_1()); 
            // InternalDomainModelsDatasheet.g:746:2: ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 )
            // InternalDomainModelsDatasheet.g:746:3: rule__DatasheetProperty__SemanticIDAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:755:1: rule__MandatoryDatasheetElement__Group__0 : rule__MandatoryDatasheetElement__Group__0__Impl rule__MandatoryDatasheetElement__Group__1 ;
    public final void rule__MandatoryDatasheetElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:759:1: ( rule__MandatoryDatasheetElement__Group__0__Impl rule__MandatoryDatasheetElement__Group__1 )
            // InternalDomainModelsDatasheet.g:760:2: rule__MandatoryDatasheetElement__Group__0__Impl rule__MandatoryDatasheetElement__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MandatoryDatasheetElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:767:1: rule__MandatoryDatasheetElement__Group__0__Impl : ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) ) ;
    public final void rule__MandatoryDatasheetElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:771:1: ( ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) ) )
            // InternalDomainModelsDatasheet.g:772:1: ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) )
            {
            // InternalDomainModelsDatasheet.g:772:1: ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) )
            // InternalDomainModelsDatasheet.g:773:2: ( rule__MandatoryDatasheetElement__NameAssignment_0 )
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getNameAssignment_0()); 
            // InternalDomainModelsDatasheet.g:774:2: ( rule__MandatoryDatasheetElement__NameAssignment_0 )
            // InternalDomainModelsDatasheet.g:774:3: rule__MandatoryDatasheetElement__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:782:1: rule__MandatoryDatasheetElement__Group__1 : rule__MandatoryDatasheetElement__Group__1__Impl ;
    public final void rule__MandatoryDatasheetElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:786:1: ( rule__MandatoryDatasheetElement__Group__1__Impl )
            // InternalDomainModelsDatasheet.g:787:2: rule__MandatoryDatasheetElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:793:1: rule__MandatoryDatasheetElement__Group__1__Impl : ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) ) ;
    public final void rule__MandatoryDatasheetElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:797:1: ( ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) ) )
            // InternalDomainModelsDatasheet.g:798:1: ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) )
            {
            // InternalDomainModelsDatasheet.g:798:1: ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) )
            // InternalDomainModelsDatasheet.g:799:2: ( rule__MandatoryDatasheetElement__ValueAssignment_1 )
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getValueAssignment_1()); 
            // InternalDomainModelsDatasheet.g:800:2: ( rule__MandatoryDatasheetElement__ValueAssignment_1 )
            // InternalDomainModelsDatasheet.g:800:3: rule__MandatoryDatasheetElement__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:809:1: rule__DatasheetProperty__UnorderedGroup_3 : rule__DatasheetProperty__UnorderedGroup_3__0 {...}?;
    public final void rule__DatasheetProperty__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
        	
        try {
            // InternalDomainModelsDatasheet.g:814:1: ( rule__DatasheetProperty__UnorderedGroup_3__0 {...}?)
            // InternalDomainModelsDatasheet.g:815:2: rule__DatasheetProperty__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:823:1: rule__DatasheetProperty__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalDomainModelsDatasheet.g:828:1: ( ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) ) )
            // InternalDomainModelsDatasheet.g:829:3: ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) )
            {
            // InternalDomainModelsDatasheet.g:829:3: ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( LA5_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                alt5=1;
            }
            else if ( LA5_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                alt5=2;
            }
            else if ( LA5_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:830:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) )
                    {
                    // InternalDomainModelsDatasheet.g:830:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) )
                    // InternalDomainModelsDatasheet.g:831:4: {...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__DatasheetProperty__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalDomainModelsDatasheet.g:831:113: ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) )
                    // InternalDomainModelsDatasheet.g:832:5: ( ( rule__DatasheetProperty__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalDomainModelsDatasheet.g:838:5: ( ( rule__DatasheetProperty__Group_3_0__0 ) )
                    // InternalDomainModelsDatasheet.g:839:6: ( rule__DatasheetProperty__Group_3_0__0 )
                    {
                     before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0()); 
                    // InternalDomainModelsDatasheet.g:840:6: ( rule__DatasheetProperty__Group_3_0__0 )
                    // InternalDomainModelsDatasheet.g:840:7: rule__DatasheetProperty__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalDomainModelsDatasheet.g:845:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) )
                    {
                    // InternalDomainModelsDatasheet.g:845:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) )
                    // InternalDomainModelsDatasheet.g:846:4: {...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__DatasheetProperty__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalDomainModelsDatasheet.g:846:113: ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) )
                    // InternalDomainModelsDatasheet.g:847:5: ( ( rule__DatasheetProperty__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalDomainModelsDatasheet.g:853:5: ( ( rule__DatasheetProperty__Group_3_1__0 ) )
                    // InternalDomainModelsDatasheet.g:854:6: ( rule__DatasheetProperty__Group_3_1__0 )
                    {
                     before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_1()); 
                    // InternalDomainModelsDatasheet.g:855:6: ( rule__DatasheetProperty__Group_3_1__0 )
                    // InternalDomainModelsDatasheet.g:855:7: rule__DatasheetProperty__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalDomainModelsDatasheet.g:860:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) )
                    {
                    // InternalDomainModelsDatasheet.g:860:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) )
                    // InternalDomainModelsDatasheet.g:861:4: {...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__DatasheetProperty__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalDomainModelsDatasheet.g:861:113: ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) )
                    // InternalDomainModelsDatasheet.g:862:5: ( ( rule__DatasheetProperty__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalDomainModelsDatasheet.g:868:5: ( ( rule__DatasheetProperty__Group_3_2__0 ) )
                    // InternalDomainModelsDatasheet.g:869:6: ( rule__DatasheetProperty__Group_3_2__0 )
                    {
                     before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_2()); 
                    // InternalDomainModelsDatasheet.g:870:6: ( rule__DatasheetProperty__Group_3_2__0 )
                    // InternalDomainModelsDatasheet.g:870:7: rule__DatasheetProperty__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:883:1: rule__DatasheetProperty__UnorderedGroup_3__0 : rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__1 )? ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:887:1: ( rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__1 )? )
            // InternalDomainModelsDatasheet.g:888:2: rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_11);
            rule__DatasheetProperty__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalDomainModelsDatasheet.g:889:2: ( rule__DatasheetProperty__UnorderedGroup_3__1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( LA6_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                alt6=1;
            }
            else if ( LA6_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                alt6=1;
            }
            else if ( LA6_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:889:2: rule__DatasheetProperty__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:895:1: rule__DatasheetProperty__UnorderedGroup_3__1 : rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__2 )? ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:899:1: ( rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__2 )? )
            // InternalDomainModelsDatasheet.g:900:2: rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_11);
            rule__DatasheetProperty__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalDomainModelsDatasheet.g:901:2: ( rule__DatasheetProperty__UnorderedGroup_3__2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( LA7_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                alt7=1;
            }
            else if ( LA7_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                alt7=1;
            }
            else if ( LA7_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:901:2: rule__DatasheetProperty__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:907:1: rule__DatasheetProperty__UnorderedGroup_3__2 : rule__DatasheetProperty__UnorderedGroup_3__Impl ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:911:1: ( rule__DatasheetProperty__UnorderedGroup_3__Impl )
            // InternalDomainModelsDatasheet.g:912:2: rule__DatasheetProperty__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__DomainModelsDatasheet__NameAssignment_1"
    // InternalDomainModelsDatasheet.g:919:1: rule__DomainModelsDatasheet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DomainModelsDatasheet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:923:1: ( ( RULE_ID ) )
            // InternalDomainModelsDatasheet.g:924:2: ( RULE_ID )
            {
            // InternalDomainModelsDatasheet.g:924:2: ( RULE_ID )
            // InternalDomainModelsDatasheet.g:925:3: RULE_ID
            {
             before(grammarAccess.getDomainModelsDatasheetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainModelsDatasheetAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DomainModelsDatasheet__NameAssignment_1"


    // $ANTLR start "rule__GenericDatasheetModel__ElementsAssignment"
    // InternalDomainModelsDatasheet.g:934:1: rule__GenericDatasheetModel__ElementsAssignment : ( ruleAbstractDatasheetElement ) ;
    public final void rule__GenericDatasheetModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:938:1: ( ( ruleAbstractDatasheetElement ) )
            // InternalDomainModelsDatasheet.g:939:2: ( ruleAbstractDatasheetElement )
            {
            // InternalDomainModelsDatasheet.g:939:2: ( ruleAbstractDatasheetElement )
            // InternalDomainModelsDatasheet.g:940:3: ruleAbstractDatasheetElement
            {
             before(grammarAccess.getGenericDatasheetModelAccess().getElementsAbstractDatasheetElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:949:1: rule__DatasheetProperty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DatasheetProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:953:1: ( ( RULE_ID ) )
            // InternalDomainModelsDatasheet.g:954:2: ( RULE_ID )
            {
            // InternalDomainModelsDatasheet.g:954:2: ( RULE_ID )
            // InternalDomainModelsDatasheet.g:955:3: RULE_ID
            {
             before(grammarAccess.getDatasheetPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDomainModelsDatasheet.g:964:1: rule__DatasheetProperty__ValueAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__ValueAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:968:1: ( ( RULE_STRING ) )
            // InternalDomainModelsDatasheet.g:969:2: ( RULE_STRING )
            {
            // InternalDomainModelsDatasheet.g:969:2: ( RULE_STRING )
            // InternalDomainModelsDatasheet.g:970:3: RULE_STRING
            {
             before(grammarAccess.getDatasheetPropertyAccess().getValueSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalDomainModelsDatasheet.g:979:1: rule__DatasheetProperty__UnitAssignment_3_0_2_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__UnitAssignment_3_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:983:1: ( ( RULE_STRING ) )
            // InternalDomainModelsDatasheet.g:984:2: ( RULE_STRING )
            {
            // InternalDomainModelsDatasheet.g:984:2: ( RULE_STRING )
            // InternalDomainModelsDatasheet.g:985:3: RULE_STRING
            {
             before(grammarAccess.getDatasheetPropertyAccess().getUnitSTRINGTerminalRuleCall_3_0_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalDomainModelsDatasheet.g:994:1: rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:998:1: ( ( RULE_STRING ) )
            // InternalDomainModelsDatasheet.g:999:2: ( RULE_STRING )
            {
            // InternalDomainModelsDatasheet.g:999:2: ( RULE_STRING )
            // InternalDomainModelsDatasheet.g:1000:3: RULE_STRING
            {
             before(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalDomainModelsDatasheet.g:1009:1: rule__DatasheetProperty__SemanticIDAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__SemanticIDAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1013:1: ( ( RULE_STRING ) )
            // InternalDomainModelsDatasheet.g:1014:2: ( RULE_STRING )
            {
            // InternalDomainModelsDatasheet.g:1014:2: ( RULE_STRING )
            // InternalDomainModelsDatasheet.g:1015:3: RULE_STRING
            {
             before(grammarAccess.getDatasheetPropertyAccess().getSemanticIDSTRINGTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalDomainModelsDatasheet.g:1024:1: rule__MandatoryDatasheetElement__NameAssignment_0 : ( ruleMandatoryDatasheetElementNames ) ;
    public final void rule__MandatoryDatasheetElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1028:1: ( ( ruleMandatoryDatasheetElementNames ) )
            // InternalDomainModelsDatasheet.g:1029:2: ( ruleMandatoryDatasheetElementNames )
            {
            // InternalDomainModelsDatasheet.g:1029:2: ( ruleMandatoryDatasheetElementNames )
            // InternalDomainModelsDatasheet.g:1030:3: ruleMandatoryDatasheetElementNames
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getNameMandatoryDatasheetElementNamesEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDomainModelsDatasheet.g:1039:1: rule__MandatoryDatasheetElement__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MandatoryDatasheetElement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1043:1: ( ( RULE_STRING ) )
            // InternalDomainModelsDatasheet.g:1044:2: ( RULE_STRING )
            {
            // InternalDomainModelsDatasheet.g:1044:2: ( RULE_STRING )
            // InternalDomainModelsDatasheet.g:1045:3: RULE_STRING
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000011802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000011800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001A0002L});

}
