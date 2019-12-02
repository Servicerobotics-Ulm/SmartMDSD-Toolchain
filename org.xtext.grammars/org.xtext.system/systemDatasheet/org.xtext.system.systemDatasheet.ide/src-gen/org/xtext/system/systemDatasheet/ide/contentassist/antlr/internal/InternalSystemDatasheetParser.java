package org.xtext.system.systemDatasheet.ide.contentassist.antlr.internal;

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
import org.xtext.system.systemDatasheet.services.SystemDatasheetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSystemDatasheetParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BaseURI'", "'ShortDescription'", "'SystemDatasheet'", "'{'", "'}'", "'DatasheetProperty'", "'value'", "'unit'", "'shortDescription'", "'semanticID'"
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


        public InternalSystemDatasheetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSystemDatasheetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSystemDatasheetParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSystemDatasheet.g"; }


    	private SystemDatasheetGrammarAccess grammarAccess;

    	public void setGrammarAccess(SystemDatasheetGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSystemDatasheet"
    // InternalSystemDatasheet.g:68:1: entryRuleSystemDatasheet : ruleSystemDatasheet EOF ;
    public final void entryRuleSystemDatasheet() throws RecognitionException {
        try {
            // InternalSystemDatasheet.g:69:1: ( ruleSystemDatasheet EOF )
            // InternalSystemDatasheet.g:70:1: ruleSystemDatasheet EOF
            {
             before(grammarAccess.getSystemDatasheetRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemDatasheet();

            state._fsp--;

             after(grammarAccess.getSystemDatasheetRule()); 
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
    // $ANTLR end "entryRuleSystemDatasheet"


    // $ANTLR start "ruleSystemDatasheet"
    // InternalSystemDatasheet.g:77:1: ruleSystemDatasheet : ( ( rule__SystemDatasheet__Group__0 ) ) ;
    public final void ruleSystemDatasheet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:81:2: ( ( ( rule__SystemDatasheet__Group__0 ) ) )
            // InternalSystemDatasheet.g:82:2: ( ( rule__SystemDatasheet__Group__0 ) )
            {
            // InternalSystemDatasheet.g:82:2: ( ( rule__SystemDatasheet__Group__0 ) )
            // InternalSystemDatasheet.g:83:3: ( rule__SystemDatasheet__Group__0 )
            {
             before(grammarAccess.getSystemDatasheetAccess().getGroup()); 
            // InternalSystemDatasheet.g:84:3: ( rule__SystemDatasheet__Group__0 )
            // InternalSystemDatasheet.g:84:4: rule__SystemDatasheet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemDatasheet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemDatasheetAccess().getGroup()); 

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
    // $ANTLR end "ruleSystemDatasheet"


    // $ANTLR start "ruleGenericDatasheetModel"
    // InternalSystemDatasheet.g:94:1: ruleGenericDatasheetModel : ( ( rule__GenericDatasheetModel__ElementsAssignment )* ) ;
    public final void ruleGenericDatasheetModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:98:2: ( ( ( rule__GenericDatasheetModel__ElementsAssignment )* ) )
            // InternalSystemDatasheet.g:99:2: ( ( rule__GenericDatasheetModel__ElementsAssignment )* )
            {
            // InternalSystemDatasheet.g:99:2: ( ( rule__GenericDatasheetModel__ElementsAssignment )* )
            // InternalSystemDatasheet.g:100:3: ( rule__GenericDatasheetModel__ElementsAssignment )*
            {
             before(grammarAccess.getGenericDatasheetModelAccess().getElementsAssignment()); 
            // InternalSystemDatasheet.g:101:3: ( rule__GenericDatasheetModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSystemDatasheet.g:101:4: rule__GenericDatasheetModel__ElementsAssignment
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
    // InternalSystemDatasheet.g:110:1: entryRuleAbstractDatasheetElement : ruleAbstractDatasheetElement EOF ;
    public final void entryRuleAbstractDatasheetElement() throws RecognitionException {
        try {
            // InternalSystemDatasheet.g:111:1: ( ruleAbstractDatasheetElement EOF )
            // InternalSystemDatasheet.g:112:1: ruleAbstractDatasheetElement EOF
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
    // InternalSystemDatasheet.g:119:1: ruleAbstractDatasheetElement : ( ( rule__AbstractDatasheetElement__Alternatives ) ) ;
    public final void ruleAbstractDatasheetElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:123:2: ( ( ( rule__AbstractDatasheetElement__Alternatives ) ) )
            // InternalSystemDatasheet.g:124:2: ( ( rule__AbstractDatasheetElement__Alternatives ) )
            {
            // InternalSystemDatasheet.g:124:2: ( ( rule__AbstractDatasheetElement__Alternatives ) )
            // InternalSystemDatasheet.g:125:3: ( rule__AbstractDatasheetElement__Alternatives )
            {
             before(grammarAccess.getAbstractDatasheetElementAccess().getAlternatives()); 
            // InternalSystemDatasheet.g:126:3: ( rule__AbstractDatasheetElement__Alternatives )
            // InternalSystemDatasheet.g:126:4: rule__AbstractDatasheetElement__Alternatives
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
    // InternalSystemDatasheet.g:135:1: entryRuleDatasheetProperty : ruleDatasheetProperty EOF ;
    public final void entryRuleDatasheetProperty() throws RecognitionException {
        try {
            // InternalSystemDatasheet.g:136:1: ( ruleDatasheetProperty EOF )
            // InternalSystemDatasheet.g:137:1: ruleDatasheetProperty EOF
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
    // InternalSystemDatasheet.g:144:1: ruleDatasheetProperty : ( ( rule__DatasheetProperty__Group__0 ) ) ;
    public final void ruleDatasheetProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:148:2: ( ( ( rule__DatasheetProperty__Group__0 ) ) )
            // InternalSystemDatasheet.g:149:2: ( ( rule__DatasheetProperty__Group__0 ) )
            {
            // InternalSystemDatasheet.g:149:2: ( ( rule__DatasheetProperty__Group__0 ) )
            // InternalSystemDatasheet.g:150:3: ( rule__DatasheetProperty__Group__0 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getGroup()); 
            // InternalSystemDatasheet.g:151:3: ( rule__DatasheetProperty__Group__0 )
            // InternalSystemDatasheet.g:151:4: rule__DatasheetProperty__Group__0
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
    // InternalSystemDatasheet.g:160:1: entryRuleMandatoryDatasheetElement : ruleMandatoryDatasheetElement EOF ;
    public final void entryRuleMandatoryDatasheetElement() throws RecognitionException {
        try {
            // InternalSystemDatasheet.g:161:1: ( ruleMandatoryDatasheetElement EOF )
            // InternalSystemDatasheet.g:162:1: ruleMandatoryDatasheetElement EOF
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
    // InternalSystemDatasheet.g:169:1: ruleMandatoryDatasheetElement : ( ( rule__MandatoryDatasheetElement__Group__0 ) ) ;
    public final void ruleMandatoryDatasheetElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:173:2: ( ( ( rule__MandatoryDatasheetElement__Group__0 ) ) )
            // InternalSystemDatasheet.g:174:2: ( ( rule__MandatoryDatasheetElement__Group__0 ) )
            {
            // InternalSystemDatasheet.g:174:2: ( ( rule__MandatoryDatasheetElement__Group__0 ) )
            // InternalSystemDatasheet.g:175:3: ( rule__MandatoryDatasheetElement__Group__0 )
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getGroup()); 
            // InternalSystemDatasheet.g:176:3: ( rule__MandatoryDatasheetElement__Group__0 )
            // InternalSystemDatasheet.g:176:4: rule__MandatoryDatasheetElement__Group__0
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
    // InternalSystemDatasheet.g:185:1: ruleMandatoryDatasheetElementNames : ( ( rule__MandatoryDatasheetElementNames__Alternatives ) ) ;
    public final void ruleMandatoryDatasheetElementNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:189:1: ( ( ( rule__MandatoryDatasheetElementNames__Alternatives ) ) )
            // InternalSystemDatasheet.g:190:2: ( ( rule__MandatoryDatasheetElementNames__Alternatives ) )
            {
            // InternalSystemDatasheet.g:190:2: ( ( rule__MandatoryDatasheetElementNames__Alternatives ) )
            // InternalSystemDatasheet.g:191:3: ( rule__MandatoryDatasheetElementNames__Alternatives )
            {
             before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getAlternatives()); 
            // InternalSystemDatasheet.g:192:3: ( rule__MandatoryDatasheetElementNames__Alternatives )
            // InternalSystemDatasheet.g:192:4: rule__MandatoryDatasheetElementNames__Alternatives
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
    // InternalSystemDatasheet.g:200:1: rule__AbstractDatasheetElement__Alternatives : ( ( ruleDatasheetProperty ) | ( ruleMandatoryDatasheetElement ) );
    public final void rule__AbstractDatasheetElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:204:1: ( ( ruleDatasheetProperty ) | ( ruleMandatoryDatasheetElement ) )
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
                    // InternalSystemDatasheet.g:205:2: ( ruleDatasheetProperty )
                    {
                    // InternalSystemDatasheet.g:205:2: ( ruleDatasheetProperty )
                    // InternalSystemDatasheet.g:206:3: ruleDatasheetProperty
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
                    // InternalSystemDatasheet.g:211:2: ( ruleMandatoryDatasheetElement )
                    {
                    // InternalSystemDatasheet.g:211:2: ( ruleMandatoryDatasheetElement )
                    // InternalSystemDatasheet.g:212:3: ruleMandatoryDatasheetElement
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
    // InternalSystemDatasheet.g:221:1: rule__MandatoryDatasheetElementNames__Alternatives : ( ( ( 'BaseURI' ) ) | ( ( 'ShortDescription' ) ) );
    public final void rule__MandatoryDatasheetElementNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:225:1: ( ( ( 'BaseURI' ) ) | ( ( 'ShortDescription' ) ) )
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
                    // InternalSystemDatasheet.g:226:2: ( ( 'BaseURI' ) )
                    {
                    // InternalSystemDatasheet.g:226:2: ( ( 'BaseURI' ) )
                    // InternalSystemDatasheet.g:227:3: ( 'BaseURI' )
                    {
                     before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0()); 
                    // InternalSystemDatasheet.g:228:3: ( 'BaseURI' )
                    // InternalSystemDatasheet.g:228:4: 'BaseURI'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSystemDatasheet.g:232:2: ( ( 'ShortDescription' ) )
                    {
                    // InternalSystemDatasheet.g:232:2: ( ( 'ShortDescription' ) )
                    // InternalSystemDatasheet.g:233:3: ( 'ShortDescription' )
                    {
                     before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getShortDescriptionEnumLiteralDeclaration_1()); 
                    // InternalSystemDatasheet.g:234:3: ( 'ShortDescription' )
                    // InternalSystemDatasheet.g:234:4: 'ShortDescription'
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


    // $ANTLR start "rule__SystemDatasheet__Group__0"
    // InternalSystemDatasheet.g:242:1: rule__SystemDatasheet__Group__0 : rule__SystemDatasheet__Group__0__Impl rule__SystemDatasheet__Group__1 ;
    public final void rule__SystemDatasheet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:246:1: ( rule__SystemDatasheet__Group__0__Impl rule__SystemDatasheet__Group__1 )
            // InternalSystemDatasheet.g:247:2: rule__SystemDatasheet__Group__0__Impl rule__SystemDatasheet__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SystemDatasheet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDatasheet__Group__1();

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
    // $ANTLR end "rule__SystemDatasheet__Group__0"


    // $ANTLR start "rule__SystemDatasheet__Group__0__Impl"
    // InternalSystemDatasheet.g:254:1: rule__SystemDatasheet__Group__0__Impl : ( () ) ;
    public final void rule__SystemDatasheet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:258:1: ( ( () ) )
            // InternalSystemDatasheet.g:259:1: ( () )
            {
            // InternalSystemDatasheet.g:259:1: ( () )
            // InternalSystemDatasheet.g:260:2: ()
            {
             before(grammarAccess.getSystemDatasheetAccess().getSystemDatasheetAction_0()); 
            // InternalSystemDatasheet.g:261:2: ()
            // InternalSystemDatasheet.g:261:3: 
            {
            }

             after(grammarAccess.getSystemDatasheetAccess().getSystemDatasheetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemDatasheet__Group__0__Impl"


    // $ANTLR start "rule__SystemDatasheet__Group__1"
    // InternalSystemDatasheet.g:269:1: rule__SystemDatasheet__Group__1 : rule__SystemDatasheet__Group__1__Impl rule__SystemDatasheet__Group__2 ;
    public final void rule__SystemDatasheet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:273:1: ( rule__SystemDatasheet__Group__1__Impl rule__SystemDatasheet__Group__2 )
            // InternalSystemDatasheet.g:274:2: rule__SystemDatasheet__Group__1__Impl rule__SystemDatasheet__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SystemDatasheet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDatasheet__Group__2();

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
    // $ANTLR end "rule__SystemDatasheet__Group__1"


    // $ANTLR start "rule__SystemDatasheet__Group__1__Impl"
    // InternalSystemDatasheet.g:281:1: rule__SystemDatasheet__Group__1__Impl : ( 'SystemDatasheet' ) ;
    public final void rule__SystemDatasheet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:285:1: ( ( 'SystemDatasheet' ) )
            // InternalSystemDatasheet.g:286:1: ( 'SystemDatasheet' )
            {
            // InternalSystemDatasheet.g:286:1: ( 'SystemDatasheet' )
            // InternalSystemDatasheet.g:287:2: 'SystemDatasheet'
            {
             before(grammarAccess.getSystemDatasheetAccess().getSystemDatasheetKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSystemDatasheetAccess().getSystemDatasheetKeyword_1()); 

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
    // $ANTLR end "rule__SystemDatasheet__Group__1__Impl"


    // $ANTLR start "rule__SystemDatasheet__Group__2"
    // InternalSystemDatasheet.g:296:1: rule__SystemDatasheet__Group__2 : rule__SystemDatasheet__Group__2__Impl rule__SystemDatasheet__Group__3 ;
    public final void rule__SystemDatasheet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:300:1: ( rule__SystemDatasheet__Group__2__Impl rule__SystemDatasheet__Group__3 )
            // InternalSystemDatasheet.g:301:2: rule__SystemDatasheet__Group__2__Impl rule__SystemDatasheet__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SystemDatasheet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDatasheet__Group__3();

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
    // $ANTLR end "rule__SystemDatasheet__Group__2"


    // $ANTLR start "rule__SystemDatasheet__Group__2__Impl"
    // InternalSystemDatasheet.g:308:1: rule__SystemDatasheet__Group__2__Impl : ( ( rule__SystemDatasheet__NameAssignment_2 ) ) ;
    public final void rule__SystemDatasheet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:312:1: ( ( ( rule__SystemDatasheet__NameAssignment_2 ) ) )
            // InternalSystemDatasheet.g:313:1: ( ( rule__SystemDatasheet__NameAssignment_2 ) )
            {
            // InternalSystemDatasheet.g:313:1: ( ( rule__SystemDatasheet__NameAssignment_2 ) )
            // InternalSystemDatasheet.g:314:2: ( rule__SystemDatasheet__NameAssignment_2 )
            {
             before(grammarAccess.getSystemDatasheetAccess().getNameAssignment_2()); 
            // InternalSystemDatasheet.g:315:2: ( rule__SystemDatasheet__NameAssignment_2 )
            // InternalSystemDatasheet.g:315:3: rule__SystemDatasheet__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SystemDatasheet__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemDatasheetAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__SystemDatasheet__Group__2__Impl"


    // $ANTLR start "rule__SystemDatasheet__Group__3"
    // InternalSystemDatasheet.g:323:1: rule__SystemDatasheet__Group__3 : rule__SystemDatasheet__Group__3__Impl rule__SystemDatasheet__Group__4 ;
    public final void rule__SystemDatasheet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:327:1: ( rule__SystemDatasheet__Group__3__Impl rule__SystemDatasheet__Group__4 )
            // InternalSystemDatasheet.g:328:2: rule__SystemDatasheet__Group__3__Impl rule__SystemDatasheet__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SystemDatasheet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDatasheet__Group__4();

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
    // $ANTLR end "rule__SystemDatasheet__Group__3"


    // $ANTLR start "rule__SystemDatasheet__Group__3__Impl"
    // InternalSystemDatasheet.g:335:1: rule__SystemDatasheet__Group__3__Impl : ( '{' ) ;
    public final void rule__SystemDatasheet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:339:1: ( ( '{' ) )
            // InternalSystemDatasheet.g:340:1: ( '{' )
            {
            // InternalSystemDatasheet.g:340:1: ( '{' )
            // InternalSystemDatasheet.g:341:2: '{'
            {
             before(grammarAccess.getSystemDatasheetAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSystemDatasheetAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__SystemDatasheet__Group__3__Impl"


    // $ANTLR start "rule__SystemDatasheet__Group__4"
    // InternalSystemDatasheet.g:350:1: rule__SystemDatasheet__Group__4 : rule__SystemDatasheet__Group__4__Impl rule__SystemDatasheet__Group__5 ;
    public final void rule__SystemDatasheet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:354:1: ( rule__SystemDatasheet__Group__4__Impl rule__SystemDatasheet__Group__5 )
            // InternalSystemDatasheet.g:355:2: rule__SystemDatasheet__Group__4__Impl rule__SystemDatasheet__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SystemDatasheet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDatasheet__Group__5();

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
    // $ANTLR end "rule__SystemDatasheet__Group__4"


    // $ANTLR start "rule__SystemDatasheet__Group__4__Impl"
    // InternalSystemDatasheet.g:362:1: rule__SystemDatasheet__Group__4__Impl : ( ruleGenericDatasheetModel ) ;
    public final void rule__SystemDatasheet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:366:1: ( ( ruleGenericDatasheetModel ) )
            // InternalSystemDatasheet.g:367:1: ( ruleGenericDatasheetModel )
            {
            // InternalSystemDatasheet.g:367:1: ( ruleGenericDatasheetModel )
            // InternalSystemDatasheet.g:368:2: ruleGenericDatasheetModel
            {
             before(grammarAccess.getSystemDatasheetAccess().getGenericDatasheetModelParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleGenericDatasheetModel();

            state._fsp--;

             after(grammarAccess.getSystemDatasheetAccess().getGenericDatasheetModelParserRuleCall_4()); 

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
    // $ANTLR end "rule__SystemDatasheet__Group__4__Impl"


    // $ANTLR start "rule__SystemDatasheet__Group__5"
    // InternalSystemDatasheet.g:377:1: rule__SystemDatasheet__Group__5 : rule__SystemDatasheet__Group__5__Impl ;
    public final void rule__SystemDatasheet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:381:1: ( rule__SystemDatasheet__Group__5__Impl )
            // InternalSystemDatasheet.g:382:2: rule__SystemDatasheet__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemDatasheet__Group__5__Impl();

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
    // $ANTLR end "rule__SystemDatasheet__Group__5"


    // $ANTLR start "rule__SystemDatasheet__Group__5__Impl"
    // InternalSystemDatasheet.g:388:1: rule__SystemDatasheet__Group__5__Impl : ( '}' ) ;
    public final void rule__SystemDatasheet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:392:1: ( ( '}' ) )
            // InternalSystemDatasheet.g:393:1: ( '}' )
            {
            // InternalSystemDatasheet.g:393:1: ( '}' )
            // InternalSystemDatasheet.g:394:2: '}'
            {
             before(grammarAccess.getSystemDatasheetAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSystemDatasheetAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__SystemDatasheet__Group__5__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group__0"
    // InternalSystemDatasheet.g:404:1: rule__DatasheetProperty__Group__0 : rule__DatasheetProperty__Group__0__Impl rule__DatasheetProperty__Group__1 ;
    public final void rule__DatasheetProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:408:1: ( rule__DatasheetProperty__Group__0__Impl rule__DatasheetProperty__Group__1 )
            // InternalSystemDatasheet.g:409:2: rule__DatasheetProperty__Group__0__Impl rule__DatasheetProperty__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSystemDatasheet.g:416:1: rule__DatasheetProperty__Group__0__Impl : ( 'DatasheetProperty' ) ;
    public final void rule__DatasheetProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:420:1: ( ( 'DatasheetProperty' ) )
            // InternalSystemDatasheet.g:421:1: ( 'DatasheetProperty' )
            {
            // InternalSystemDatasheet.g:421:1: ( 'DatasheetProperty' )
            // InternalSystemDatasheet.g:422:2: 'DatasheetProperty'
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
    // InternalSystemDatasheet.g:431:1: rule__DatasheetProperty__Group__1 : rule__DatasheetProperty__Group__1__Impl rule__DatasheetProperty__Group__2 ;
    public final void rule__DatasheetProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:435:1: ( rule__DatasheetProperty__Group__1__Impl rule__DatasheetProperty__Group__2 )
            // InternalSystemDatasheet.g:436:2: rule__DatasheetProperty__Group__1__Impl rule__DatasheetProperty__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSystemDatasheet.g:443:1: rule__DatasheetProperty__Group__1__Impl : ( ( rule__DatasheetProperty__NameAssignment_1 ) ) ;
    public final void rule__DatasheetProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:447:1: ( ( ( rule__DatasheetProperty__NameAssignment_1 ) ) )
            // InternalSystemDatasheet.g:448:1: ( ( rule__DatasheetProperty__NameAssignment_1 ) )
            {
            // InternalSystemDatasheet.g:448:1: ( ( rule__DatasheetProperty__NameAssignment_1 ) )
            // InternalSystemDatasheet.g:449:2: ( rule__DatasheetProperty__NameAssignment_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getNameAssignment_1()); 
            // InternalSystemDatasheet.g:450:2: ( rule__DatasheetProperty__NameAssignment_1 )
            // InternalSystemDatasheet.g:450:3: rule__DatasheetProperty__NameAssignment_1
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
    // InternalSystemDatasheet.g:458:1: rule__DatasheetProperty__Group__2 : rule__DatasheetProperty__Group__2__Impl rule__DatasheetProperty__Group__3 ;
    public final void rule__DatasheetProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:462:1: ( rule__DatasheetProperty__Group__2__Impl rule__DatasheetProperty__Group__3 )
            // InternalSystemDatasheet.g:463:2: rule__DatasheetProperty__Group__2__Impl rule__DatasheetProperty__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalSystemDatasheet.g:470:1: rule__DatasheetProperty__Group__2__Impl : ( '{' ) ;
    public final void rule__DatasheetProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:474:1: ( ( '{' ) )
            // InternalSystemDatasheet.g:475:1: ( '{' )
            {
            // InternalSystemDatasheet.g:475:1: ( '{' )
            // InternalSystemDatasheet.g:476:2: '{'
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
    // InternalSystemDatasheet.g:485:1: rule__DatasheetProperty__Group__3 : rule__DatasheetProperty__Group__3__Impl rule__DatasheetProperty__Group__4 ;
    public final void rule__DatasheetProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:489:1: ( rule__DatasheetProperty__Group__3__Impl rule__DatasheetProperty__Group__4 )
            // InternalSystemDatasheet.g:490:2: rule__DatasheetProperty__Group__3__Impl rule__DatasheetProperty__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalSystemDatasheet.g:497:1: rule__DatasheetProperty__Group__3__Impl : ( ( rule__DatasheetProperty__UnorderedGroup_3 ) ) ;
    public final void rule__DatasheetProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:501:1: ( ( ( rule__DatasheetProperty__UnorderedGroup_3 ) ) )
            // InternalSystemDatasheet.g:502:1: ( ( rule__DatasheetProperty__UnorderedGroup_3 ) )
            {
            // InternalSystemDatasheet.g:502:1: ( ( rule__DatasheetProperty__UnorderedGroup_3 ) )
            // InternalSystemDatasheet.g:503:2: ( rule__DatasheetProperty__UnorderedGroup_3 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3()); 
            // InternalSystemDatasheet.g:504:2: ( rule__DatasheetProperty__UnorderedGroup_3 )
            // InternalSystemDatasheet.g:504:3: rule__DatasheetProperty__UnorderedGroup_3
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
    // InternalSystemDatasheet.g:512:1: rule__DatasheetProperty__Group__4 : rule__DatasheetProperty__Group__4__Impl ;
    public final void rule__DatasheetProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:516:1: ( rule__DatasheetProperty__Group__4__Impl )
            // InternalSystemDatasheet.g:517:2: rule__DatasheetProperty__Group__4__Impl
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
    // InternalSystemDatasheet.g:523:1: rule__DatasheetProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__DatasheetProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:527:1: ( ( '}' ) )
            // InternalSystemDatasheet.g:528:1: ( '}' )
            {
            // InternalSystemDatasheet.g:528:1: ( '}' )
            // InternalSystemDatasheet.g:529:2: '}'
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
    // InternalSystemDatasheet.g:539:1: rule__DatasheetProperty__Group_3_0__0 : rule__DatasheetProperty__Group_3_0__0__Impl rule__DatasheetProperty__Group_3_0__1 ;
    public final void rule__DatasheetProperty__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:543:1: ( rule__DatasheetProperty__Group_3_0__0__Impl rule__DatasheetProperty__Group_3_0__1 )
            // InternalSystemDatasheet.g:544:2: rule__DatasheetProperty__Group_3_0__0__Impl rule__DatasheetProperty__Group_3_0__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSystemDatasheet.g:551:1: rule__DatasheetProperty__Group_3_0__0__Impl : ( 'value' ) ;
    public final void rule__DatasheetProperty__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:555:1: ( ( 'value' ) )
            // InternalSystemDatasheet.g:556:1: ( 'value' )
            {
            // InternalSystemDatasheet.g:556:1: ( 'value' )
            // InternalSystemDatasheet.g:557:2: 'value'
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
    // InternalSystemDatasheet.g:566:1: rule__DatasheetProperty__Group_3_0__1 : rule__DatasheetProperty__Group_3_0__1__Impl rule__DatasheetProperty__Group_3_0__2 ;
    public final void rule__DatasheetProperty__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:570:1: ( rule__DatasheetProperty__Group_3_0__1__Impl rule__DatasheetProperty__Group_3_0__2 )
            // InternalSystemDatasheet.g:571:2: rule__DatasheetProperty__Group_3_0__1__Impl rule__DatasheetProperty__Group_3_0__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSystemDatasheet.g:578:1: rule__DatasheetProperty__Group_3_0__1__Impl : ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:582:1: ( ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) ) )
            // InternalSystemDatasheet.g:583:1: ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) )
            {
            // InternalSystemDatasheet.g:583:1: ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) )
            // InternalSystemDatasheet.g:584:2: ( rule__DatasheetProperty__ValueAssignment_3_0_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getValueAssignment_3_0_1()); 
            // InternalSystemDatasheet.g:585:2: ( rule__DatasheetProperty__ValueAssignment_3_0_1 )
            // InternalSystemDatasheet.g:585:3: rule__DatasheetProperty__ValueAssignment_3_0_1
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
    // InternalSystemDatasheet.g:593:1: rule__DatasheetProperty__Group_3_0__2 : rule__DatasheetProperty__Group_3_0__2__Impl ;
    public final void rule__DatasheetProperty__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:597:1: ( rule__DatasheetProperty__Group_3_0__2__Impl )
            // InternalSystemDatasheet.g:598:2: rule__DatasheetProperty__Group_3_0__2__Impl
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
    // InternalSystemDatasheet.g:604:1: rule__DatasheetProperty__Group_3_0__2__Impl : ( ( rule__DatasheetProperty__Group_3_0_2__0 )? ) ;
    public final void rule__DatasheetProperty__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:608:1: ( ( ( rule__DatasheetProperty__Group_3_0_2__0 )? ) )
            // InternalSystemDatasheet.g:609:1: ( ( rule__DatasheetProperty__Group_3_0_2__0 )? )
            {
            // InternalSystemDatasheet.g:609:1: ( ( rule__DatasheetProperty__Group_3_0_2__0 )? )
            // InternalSystemDatasheet.g:610:2: ( rule__DatasheetProperty__Group_3_0_2__0 )?
            {
             before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0_2()); 
            // InternalSystemDatasheet.g:611:2: ( rule__DatasheetProperty__Group_3_0_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSystemDatasheet.g:611:3: rule__DatasheetProperty__Group_3_0_2__0
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
    // InternalSystemDatasheet.g:620:1: rule__DatasheetProperty__Group_3_0_2__0 : rule__DatasheetProperty__Group_3_0_2__0__Impl rule__DatasheetProperty__Group_3_0_2__1 ;
    public final void rule__DatasheetProperty__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:624:1: ( rule__DatasheetProperty__Group_3_0_2__0__Impl rule__DatasheetProperty__Group_3_0_2__1 )
            // InternalSystemDatasheet.g:625:2: rule__DatasheetProperty__Group_3_0_2__0__Impl rule__DatasheetProperty__Group_3_0_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSystemDatasheet.g:632:1: rule__DatasheetProperty__Group_3_0_2__0__Impl : ( 'unit' ) ;
    public final void rule__DatasheetProperty__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:636:1: ( ( 'unit' ) )
            // InternalSystemDatasheet.g:637:1: ( 'unit' )
            {
            // InternalSystemDatasheet.g:637:1: ( 'unit' )
            // InternalSystemDatasheet.g:638:2: 'unit'
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
    // InternalSystemDatasheet.g:647:1: rule__DatasheetProperty__Group_3_0_2__1 : rule__DatasheetProperty__Group_3_0_2__1__Impl ;
    public final void rule__DatasheetProperty__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:651:1: ( rule__DatasheetProperty__Group_3_0_2__1__Impl )
            // InternalSystemDatasheet.g:652:2: rule__DatasheetProperty__Group_3_0_2__1__Impl
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
    // InternalSystemDatasheet.g:658:1: rule__DatasheetProperty__Group_3_0_2__1__Impl : ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:662:1: ( ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) ) )
            // InternalSystemDatasheet.g:663:1: ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) )
            {
            // InternalSystemDatasheet.g:663:1: ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) )
            // InternalSystemDatasheet.g:664:2: ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getUnitAssignment_3_0_2_1()); 
            // InternalSystemDatasheet.g:665:2: ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 )
            // InternalSystemDatasheet.g:665:3: rule__DatasheetProperty__UnitAssignment_3_0_2_1
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
    // InternalSystemDatasheet.g:674:1: rule__DatasheetProperty__Group_3_1__0 : rule__DatasheetProperty__Group_3_1__0__Impl rule__DatasheetProperty__Group_3_1__1 ;
    public final void rule__DatasheetProperty__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:678:1: ( rule__DatasheetProperty__Group_3_1__0__Impl rule__DatasheetProperty__Group_3_1__1 )
            // InternalSystemDatasheet.g:679:2: rule__DatasheetProperty__Group_3_1__0__Impl rule__DatasheetProperty__Group_3_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSystemDatasheet.g:686:1: rule__DatasheetProperty__Group_3_1__0__Impl : ( 'shortDescription' ) ;
    public final void rule__DatasheetProperty__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:690:1: ( ( 'shortDescription' ) )
            // InternalSystemDatasheet.g:691:1: ( 'shortDescription' )
            {
            // InternalSystemDatasheet.g:691:1: ( 'shortDescription' )
            // InternalSystemDatasheet.g:692:2: 'shortDescription'
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
    // InternalSystemDatasheet.g:701:1: rule__DatasheetProperty__Group_3_1__1 : rule__DatasheetProperty__Group_3_1__1__Impl ;
    public final void rule__DatasheetProperty__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:705:1: ( rule__DatasheetProperty__Group_3_1__1__Impl )
            // InternalSystemDatasheet.g:706:2: rule__DatasheetProperty__Group_3_1__1__Impl
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
    // InternalSystemDatasheet.g:712:1: rule__DatasheetProperty__Group_3_1__1__Impl : ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:716:1: ( ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) ) )
            // InternalSystemDatasheet.g:717:1: ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) )
            {
            // InternalSystemDatasheet.g:717:1: ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) )
            // InternalSystemDatasheet.g:718:2: ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionAssignment_3_1_1()); 
            // InternalSystemDatasheet.g:719:2: ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 )
            // InternalSystemDatasheet.g:719:3: rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1
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
    // InternalSystemDatasheet.g:728:1: rule__DatasheetProperty__Group_3_2__0 : rule__DatasheetProperty__Group_3_2__0__Impl rule__DatasheetProperty__Group_3_2__1 ;
    public final void rule__DatasheetProperty__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:732:1: ( rule__DatasheetProperty__Group_3_2__0__Impl rule__DatasheetProperty__Group_3_2__1 )
            // InternalSystemDatasheet.g:733:2: rule__DatasheetProperty__Group_3_2__0__Impl rule__DatasheetProperty__Group_3_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSystemDatasheet.g:740:1: rule__DatasheetProperty__Group_3_2__0__Impl : ( 'semanticID' ) ;
    public final void rule__DatasheetProperty__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:744:1: ( ( 'semanticID' ) )
            // InternalSystemDatasheet.g:745:1: ( 'semanticID' )
            {
            // InternalSystemDatasheet.g:745:1: ( 'semanticID' )
            // InternalSystemDatasheet.g:746:2: 'semanticID'
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
    // InternalSystemDatasheet.g:755:1: rule__DatasheetProperty__Group_3_2__1 : rule__DatasheetProperty__Group_3_2__1__Impl ;
    public final void rule__DatasheetProperty__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:759:1: ( rule__DatasheetProperty__Group_3_2__1__Impl )
            // InternalSystemDatasheet.g:760:2: rule__DatasheetProperty__Group_3_2__1__Impl
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
    // InternalSystemDatasheet.g:766:1: rule__DatasheetProperty__Group_3_2__1__Impl : ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:770:1: ( ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) ) )
            // InternalSystemDatasheet.g:771:1: ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) )
            {
            // InternalSystemDatasheet.g:771:1: ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) )
            // InternalSystemDatasheet.g:772:2: ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getSemanticIDAssignment_3_2_1()); 
            // InternalSystemDatasheet.g:773:2: ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 )
            // InternalSystemDatasheet.g:773:3: rule__DatasheetProperty__SemanticIDAssignment_3_2_1
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
    // InternalSystemDatasheet.g:782:1: rule__MandatoryDatasheetElement__Group__0 : rule__MandatoryDatasheetElement__Group__0__Impl rule__MandatoryDatasheetElement__Group__1 ;
    public final void rule__MandatoryDatasheetElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:786:1: ( rule__MandatoryDatasheetElement__Group__0__Impl rule__MandatoryDatasheetElement__Group__1 )
            // InternalSystemDatasheet.g:787:2: rule__MandatoryDatasheetElement__Group__0__Impl rule__MandatoryDatasheetElement__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSystemDatasheet.g:794:1: rule__MandatoryDatasheetElement__Group__0__Impl : ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) ) ;
    public final void rule__MandatoryDatasheetElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:798:1: ( ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) ) )
            // InternalSystemDatasheet.g:799:1: ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) )
            {
            // InternalSystemDatasheet.g:799:1: ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) )
            // InternalSystemDatasheet.g:800:2: ( rule__MandatoryDatasheetElement__NameAssignment_0 )
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getNameAssignment_0()); 
            // InternalSystemDatasheet.g:801:2: ( rule__MandatoryDatasheetElement__NameAssignment_0 )
            // InternalSystemDatasheet.g:801:3: rule__MandatoryDatasheetElement__NameAssignment_0
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
    // InternalSystemDatasheet.g:809:1: rule__MandatoryDatasheetElement__Group__1 : rule__MandatoryDatasheetElement__Group__1__Impl ;
    public final void rule__MandatoryDatasheetElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:813:1: ( rule__MandatoryDatasheetElement__Group__1__Impl )
            // InternalSystemDatasheet.g:814:2: rule__MandatoryDatasheetElement__Group__1__Impl
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
    // InternalSystemDatasheet.g:820:1: rule__MandatoryDatasheetElement__Group__1__Impl : ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) ) ;
    public final void rule__MandatoryDatasheetElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:824:1: ( ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) ) )
            // InternalSystemDatasheet.g:825:1: ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) )
            {
            // InternalSystemDatasheet.g:825:1: ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) )
            // InternalSystemDatasheet.g:826:2: ( rule__MandatoryDatasheetElement__ValueAssignment_1 )
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getValueAssignment_1()); 
            // InternalSystemDatasheet.g:827:2: ( rule__MandatoryDatasheetElement__ValueAssignment_1 )
            // InternalSystemDatasheet.g:827:3: rule__MandatoryDatasheetElement__ValueAssignment_1
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
    // InternalSystemDatasheet.g:836:1: rule__DatasheetProperty__UnorderedGroup_3 : rule__DatasheetProperty__UnorderedGroup_3__0 {...}?;
    public final void rule__DatasheetProperty__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
        	
        try {
            // InternalSystemDatasheet.g:841:1: ( rule__DatasheetProperty__UnorderedGroup_3__0 {...}?)
            // InternalSystemDatasheet.g:842:2: rule__DatasheetProperty__UnorderedGroup_3__0 {...}?
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
    // InternalSystemDatasheet.g:850:1: rule__DatasheetProperty__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalSystemDatasheet.g:855:1: ( ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) ) )
            // InternalSystemDatasheet.g:856:3: ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) )
            {
            // InternalSystemDatasheet.g:856:3: ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) )
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
                    // InternalSystemDatasheet.g:857:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) )
                    {
                    // InternalSystemDatasheet.g:857:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) )
                    // InternalSystemDatasheet.g:858:4: {...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__DatasheetProperty__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalSystemDatasheet.g:858:113: ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) )
                    // InternalSystemDatasheet.g:859:5: ( ( rule__DatasheetProperty__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalSystemDatasheet.g:865:5: ( ( rule__DatasheetProperty__Group_3_0__0 ) )
                    // InternalSystemDatasheet.g:866:6: ( rule__DatasheetProperty__Group_3_0__0 )
                    {
                     before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0()); 
                    // InternalSystemDatasheet.g:867:6: ( rule__DatasheetProperty__Group_3_0__0 )
                    // InternalSystemDatasheet.g:867:7: rule__DatasheetProperty__Group_3_0__0
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
                    // InternalSystemDatasheet.g:872:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) )
                    {
                    // InternalSystemDatasheet.g:872:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) )
                    // InternalSystemDatasheet.g:873:4: {...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__DatasheetProperty__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalSystemDatasheet.g:873:113: ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) )
                    // InternalSystemDatasheet.g:874:5: ( ( rule__DatasheetProperty__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalSystemDatasheet.g:880:5: ( ( rule__DatasheetProperty__Group_3_1__0 ) )
                    // InternalSystemDatasheet.g:881:6: ( rule__DatasheetProperty__Group_3_1__0 )
                    {
                     before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_1()); 
                    // InternalSystemDatasheet.g:882:6: ( rule__DatasheetProperty__Group_3_1__0 )
                    // InternalSystemDatasheet.g:882:7: rule__DatasheetProperty__Group_3_1__0
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
                    // InternalSystemDatasheet.g:887:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) )
                    {
                    // InternalSystemDatasheet.g:887:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) )
                    // InternalSystemDatasheet.g:888:4: {...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__DatasheetProperty__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalSystemDatasheet.g:888:113: ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) )
                    // InternalSystemDatasheet.g:889:5: ( ( rule__DatasheetProperty__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalSystemDatasheet.g:895:5: ( ( rule__DatasheetProperty__Group_3_2__0 ) )
                    // InternalSystemDatasheet.g:896:6: ( rule__DatasheetProperty__Group_3_2__0 )
                    {
                     before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_2()); 
                    // InternalSystemDatasheet.g:897:6: ( rule__DatasheetProperty__Group_3_2__0 )
                    // InternalSystemDatasheet.g:897:7: rule__DatasheetProperty__Group_3_2__0
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
    // InternalSystemDatasheet.g:910:1: rule__DatasheetProperty__UnorderedGroup_3__0 : rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__1 )? ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:914:1: ( rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__1 )? )
            // InternalSystemDatasheet.g:915:2: rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_12);
            rule__DatasheetProperty__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalSystemDatasheet.g:916:2: ( rule__DatasheetProperty__UnorderedGroup_3__1 )?
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
                    // InternalSystemDatasheet.g:916:2: rule__DatasheetProperty__UnorderedGroup_3__1
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
    // InternalSystemDatasheet.g:922:1: rule__DatasheetProperty__UnorderedGroup_3__1 : rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__2 )? ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:926:1: ( rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__2 )? )
            // InternalSystemDatasheet.g:927:2: rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_12);
            rule__DatasheetProperty__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalSystemDatasheet.g:928:2: ( rule__DatasheetProperty__UnorderedGroup_3__2 )?
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
                    // InternalSystemDatasheet.g:928:2: rule__DatasheetProperty__UnorderedGroup_3__2
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
    // InternalSystemDatasheet.g:934:1: rule__DatasheetProperty__UnorderedGroup_3__2 : rule__DatasheetProperty__UnorderedGroup_3__Impl ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:938:1: ( rule__DatasheetProperty__UnorderedGroup_3__Impl )
            // InternalSystemDatasheet.g:939:2: rule__DatasheetProperty__UnorderedGroup_3__Impl
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


    // $ANTLR start "rule__SystemDatasheet__NameAssignment_2"
    // InternalSystemDatasheet.g:946:1: rule__SystemDatasheet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SystemDatasheet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:950:1: ( ( RULE_ID ) )
            // InternalSystemDatasheet.g:951:2: ( RULE_ID )
            {
            // InternalSystemDatasheet.g:951:2: ( RULE_ID )
            // InternalSystemDatasheet.g:952:3: RULE_ID
            {
             before(grammarAccess.getSystemDatasheetAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemDatasheetAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SystemDatasheet__NameAssignment_2"


    // $ANTLR start "rule__GenericDatasheetModel__ElementsAssignment"
    // InternalSystemDatasheet.g:961:1: rule__GenericDatasheetModel__ElementsAssignment : ( ruleAbstractDatasheetElement ) ;
    public final void rule__GenericDatasheetModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:965:1: ( ( ruleAbstractDatasheetElement ) )
            // InternalSystemDatasheet.g:966:2: ( ruleAbstractDatasheetElement )
            {
            // InternalSystemDatasheet.g:966:2: ( ruleAbstractDatasheetElement )
            // InternalSystemDatasheet.g:967:3: ruleAbstractDatasheetElement
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
    // InternalSystemDatasheet.g:976:1: rule__DatasheetProperty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DatasheetProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:980:1: ( ( RULE_ID ) )
            // InternalSystemDatasheet.g:981:2: ( RULE_ID )
            {
            // InternalSystemDatasheet.g:981:2: ( RULE_ID )
            // InternalSystemDatasheet.g:982:3: RULE_ID
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
    // InternalSystemDatasheet.g:991:1: rule__DatasheetProperty__ValueAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__ValueAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:995:1: ( ( RULE_STRING ) )
            // InternalSystemDatasheet.g:996:2: ( RULE_STRING )
            {
            // InternalSystemDatasheet.g:996:2: ( RULE_STRING )
            // InternalSystemDatasheet.g:997:3: RULE_STRING
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
    // InternalSystemDatasheet.g:1006:1: rule__DatasheetProperty__UnitAssignment_3_0_2_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__UnitAssignment_3_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:1010:1: ( ( RULE_STRING ) )
            // InternalSystemDatasheet.g:1011:2: ( RULE_STRING )
            {
            // InternalSystemDatasheet.g:1011:2: ( RULE_STRING )
            // InternalSystemDatasheet.g:1012:3: RULE_STRING
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
    // InternalSystemDatasheet.g:1021:1: rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:1025:1: ( ( RULE_STRING ) )
            // InternalSystemDatasheet.g:1026:2: ( RULE_STRING )
            {
            // InternalSystemDatasheet.g:1026:2: ( RULE_STRING )
            // InternalSystemDatasheet.g:1027:3: RULE_STRING
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
    // InternalSystemDatasheet.g:1036:1: rule__DatasheetProperty__SemanticIDAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__SemanticIDAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:1040:1: ( ( RULE_STRING ) )
            // InternalSystemDatasheet.g:1041:2: ( RULE_STRING )
            {
            // InternalSystemDatasheet.g:1041:2: ( RULE_STRING )
            // InternalSystemDatasheet.g:1042:3: RULE_STRING
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
    // InternalSystemDatasheet.g:1051:1: rule__MandatoryDatasheetElement__NameAssignment_0 : ( ruleMandatoryDatasheetElementNames ) ;
    public final void rule__MandatoryDatasheetElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:1055:1: ( ( ruleMandatoryDatasheetElementNames ) )
            // InternalSystemDatasheet.g:1056:2: ( ruleMandatoryDatasheetElementNames )
            {
            // InternalSystemDatasheet.g:1056:2: ( ruleMandatoryDatasheetElementNames )
            // InternalSystemDatasheet.g:1057:3: ruleMandatoryDatasheetElementNames
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
    // InternalSystemDatasheet.g:1066:1: rule__MandatoryDatasheetElement__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MandatoryDatasheetElement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemDatasheet.g:1070:1: ( ( RULE_STRING ) )
            // InternalSystemDatasheet.g:1071:2: ( RULE_STRING )
            {
            // InternalSystemDatasheet.g:1071:2: ( RULE_STRING )
            // InternalSystemDatasheet.g:1072:3: RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000011800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001A0002L});

}
