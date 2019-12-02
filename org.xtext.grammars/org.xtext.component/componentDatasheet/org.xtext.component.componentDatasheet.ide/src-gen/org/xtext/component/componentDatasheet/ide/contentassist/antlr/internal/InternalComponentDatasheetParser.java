package org.xtext.component.componentDatasheet.ide.contentassist.antlr.internal;

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
import org.xtext.component.componentDatasheet.services.ComponentDatasheetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentDatasheetParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BaseURI'", "'ShortDescription'", "'ComponentDatasheet'", "'{'", "'}'", "'ComponentPortDatasheet'", "'DatasheetProperty'", "'value'", "'unit'", "'shortDescription'", "'semanticID'"
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
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalComponentDatasheetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentDatasheetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentDatasheetParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentDatasheet.g"; }


    	private ComponentDatasheetGrammarAccess grammarAccess;

    	public void setGrammarAccess(ComponentDatasheetGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleComponentDatasheet"
    // InternalComponentDatasheet.g:68:1: entryRuleComponentDatasheet : ruleComponentDatasheet EOF ;
    public final void entryRuleComponentDatasheet() throws RecognitionException {
        try {
            // InternalComponentDatasheet.g:69:1: ( ruleComponentDatasheet EOF )
            // InternalComponentDatasheet.g:70:1: ruleComponentDatasheet EOF
            {
             before(grammarAccess.getComponentDatasheetRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentDatasheet();

            state._fsp--;

             after(grammarAccess.getComponentDatasheetRule()); 
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
    // $ANTLR end "entryRuleComponentDatasheet"


    // $ANTLR start "ruleComponentDatasheet"
    // InternalComponentDatasheet.g:77:1: ruleComponentDatasheet : ( ( rule__ComponentDatasheet__Group__0 ) ) ;
    public final void ruleComponentDatasheet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:81:2: ( ( ( rule__ComponentDatasheet__Group__0 ) ) )
            // InternalComponentDatasheet.g:82:2: ( ( rule__ComponentDatasheet__Group__0 ) )
            {
            // InternalComponentDatasheet.g:82:2: ( ( rule__ComponentDatasheet__Group__0 ) )
            // InternalComponentDatasheet.g:83:3: ( rule__ComponentDatasheet__Group__0 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getGroup()); 
            // InternalComponentDatasheet.g:84:3: ( rule__ComponentDatasheet__Group__0 )
            // InternalComponentDatasheet.g:84:4: rule__ComponentDatasheet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentDatasheet"


    // $ANTLR start "entryRuleAbstractDatasheetElement"
    // InternalComponentDatasheet.g:93:1: entryRuleAbstractDatasheetElement : ruleAbstractDatasheetElement EOF ;
    public final void entryRuleAbstractDatasheetElement() throws RecognitionException {
        try {
            // InternalComponentDatasheet.g:94:1: ( ruleAbstractDatasheetElement EOF )
            // InternalComponentDatasheet.g:95:1: ruleAbstractDatasheetElement EOF
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
    // InternalComponentDatasheet.g:102:1: ruleAbstractDatasheetElement : ( ( rule__AbstractDatasheetElement__Alternatives ) ) ;
    public final void ruleAbstractDatasheetElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:106:2: ( ( ( rule__AbstractDatasheetElement__Alternatives ) ) )
            // InternalComponentDatasheet.g:107:2: ( ( rule__AbstractDatasheetElement__Alternatives ) )
            {
            // InternalComponentDatasheet.g:107:2: ( ( rule__AbstractDatasheetElement__Alternatives ) )
            // InternalComponentDatasheet.g:108:3: ( rule__AbstractDatasheetElement__Alternatives )
            {
             before(grammarAccess.getAbstractDatasheetElementAccess().getAlternatives()); 
            // InternalComponentDatasheet.g:109:3: ( rule__AbstractDatasheetElement__Alternatives )
            // InternalComponentDatasheet.g:109:4: rule__AbstractDatasheetElement__Alternatives
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


    // $ANTLR start "entryRuleComponentPortDatasheet"
    // InternalComponentDatasheet.g:118:1: entryRuleComponentPortDatasheet : ruleComponentPortDatasheet EOF ;
    public final void entryRuleComponentPortDatasheet() throws RecognitionException {
        try {
            // InternalComponentDatasheet.g:119:1: ( ruleComponentPortDatasheet EOF )
            // InternalComponentDatasheet.g:120:1: ruleComponentPortDatasheet EOF
            {
             before(grammarAccess.getComponentPortDatasheetRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentPortDatasheet();

            state._fsp--;

             after(grammarAccess.getComponentPortDatasheetRule()); 
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
    // $ANTLR end "entryRuleComponentPortDatasheet"


    // $ANTLR start "ruleComponentPortDatasheet"
    // InternalComponentDatasheet.g:127:1: ruleComponentPortDatasheet : ( ( rule__ComponentPortDatasheet__Group__0 ) ) ;
    public final void ruleComponentPortDatasheet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:131:2: ( ( ( rule__ComponentPortDatasheet__Group__0 ) ) )
            // InternalComponentDatasheet.g:132:2: ( ( rule__ComponentPortDatasheet__Group__0 ) )
            {
            // InternalComponentDatasheet.g:132:2: ( ( rule__ComponentPortDatasheet__Group__0 ) )
            // InternalComponentDatasheet.g:133:3: ( rule__ComponentPortDatasheet__Group__0 )
            {
             before(grammarAccess.getComponentPortDatasheetAccess().getGroup()); 
            // InternalComponentDatasheet.g:134:3: ( rule__ComponentPortDatasheet__Group__0 )
            // InternalComponentDatasheet.g:134:4: rule__ComponentPortDatasheet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentPortDatasheet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentPortDatasheetAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentPortDatasheet"


    // $ANTLR start "ruleGenericDatasheetModel"
    // InternalComponentDatasheet.g:144:1: ruleGenericDatasheetModel : ( ( rule__GenericDatasheetModel__ElementsAssignment )* ) ;
    public final void ruleGenericDatasheetModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:148:2: ( ( ( rule__GenericDatasheetModel__ElementsAssignment )* ) )
            // InternalComponentDatasheet.g:149:2: ( ( rule__GenericDatasheetModel__ElementsAssignment )* )
            {
            // InternalComponentDatasheet.g:149:2: ( ( rule__GenericDatasheetModel__ElementsAssignment )* )
            // InternalComponentDatasheet.g:150:3: ( rule__GenericDatasheetModel__ElementsAssignment )*
            {
             before(grammarAccess.getGenericDatasheetModelAccess().getElementsAssignment()); 
            // InternalComponentDatasheet.g:151:3: ( rule__GenericDatasheetModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=16 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalComponentDatasheet.g:151:4: rule__GenericDatasheetModel__ElementsAssignment
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


    // $ANTLR start "entryRuleDatasheetProperty"
    // InternalComponentDatasheet.g:160:1: entryRuleDatasheetProperty : ruleDatasheetProperty EOF ;
    public final void entryRuleDatasheetProperty() throws RecognitionException {
        try {
            // InternalComponentDatasheet.g:161:1: ( ruleDatasheetProperty EOF )
            // InternalComponentDatasheet.g:162:1: ruleDatasheetProperty EOF
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
    // InternalComponentDatasheet.g:169:1: ruleDatasheetProperty : ( ( rule__DatasheetProperty__Group__0 ) ) ;
    public final void ruleDatasheetProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:173:2: ( ( ( rule__DatasheetProperty__Group__0 ) ) )
            // InternalComponentDatasheet.g:174:2: ( ( rule__DatasheetProperty__Group__0 ) )
            {
            // InternalComponentDatasheet.g:174:2: ( ( rule__DatasheetProperty__Group__0 ) )
            // InternalComponentDatasheet.g:175:3: ( rule__DatasheetProperty__Group__0 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getGroup()); 
            // InternalComponentDatasheet.g:176:3: ( rule__DatasheetProperty__Group__0 )
            // InternalComponentDatasheet.g:176:4: rule__DatasheetProperty__Group__0
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
    // InternalComponentDatasheet.g:185:1: entryRuleMandatoryDatasheetElement : ruleMandatoryDatasheetElement EOF ;
    public final void entryRuleMandatoryDatasheetElement() throws RecognitionException {
        try {
            // InternalComponentDatasheet.g:186:1: ( ruleMandatoryDatasheetElement EOF )
            // InternalComponentDatasheet.g:187:1: ruleMandatoryDatasheetElement EOF
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
    // InternalComponentDatasheet.g:194:1: ruleMandatoryDatasheetElement : ( ( rule__MandatoryDatasheetElement__Group__0 ) ) ;
    public final void ruleMandatoryDatasheetElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:198:2: ( ( ( rule__MandatoryDatasheetElement__Group__0 ) ) )
            // InternalComponentDatasheet.g:199:2: ( ( rule__MandatoryDatasheetElement__Group__0 ) )
            {
            // InternalComponentDatasheet.g:199:2: ( ( rule__MandatoryDatasheetElement__Group__0 ) )
            // InternalComponentDatasheet.g:200:3: ( rule__MandatoryDatasheetElement__Group__0 )
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getGroup()); 
            // InternalComponentDatasheet.g:201:3: ( rule__MandatoryDatasheetElement__Group__0 )
            // InternalComponentDatasheet.g:201:4: rule__MandatoryDatasheetElement__Group__0
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
    // InternalComponentDatasheet.g:210:1: ruleMandatoryDatasheetElementNames : ( ( rule__MandatoryDatasheetElementNames__Alternatives ) ) ;
    public final void ruleMandatoryDatasheetElementNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:214:1: ( ( ( rule__MandatoryDatasheetElementNames__Alternatives ) ) )
            // InternalComponentDatasheet.g:215:2: ( ( rule__MandatoryDatasheetElementNames__Alternatives ) )
            {
            // InternalComponentDatasheet.g:215:2: ( ( rule__MandatoryDatasheetElementNames__Alternatives ) )
            // InternalComponentDatasheet.g:216:3: ( rule__MandatoryDatasheetElementNames__Alternatives )
            {
             before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getAlternatives()); 
            // InternalComponentDatasheet.g:217:3: ( rule__MandatoryDatasheetElementNames__Alternatives )
            // InternalComponentDatasheet.g:217:4: rule__MandatoryDatasheetElementNames__Alternatives
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
    // InternalComponentDatasheet.g:225:1: rule__AbstractDatasheetElement__Alternatives : ( ( ruleDatasheetProperty ) | ( ruleMandatoryDatasheetElement ) | ( ruleComponentPortDatasheet ) );
    public final void rule__AbstractDatasheetElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:229:1: ( ( ruleDatasheetProperty ) | ( ruleMandatoryDatasheetElement ) | ( ruleComponentPortDatasheet ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 11:
            case 12:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalComponentDatasheet.g:230:2: ( ruleDatasheetProperty )
                    {
                    // InternalComponentDatasheet.g:230:2: ( ruleDatasheetProperty )
                    // InternalComponentDatasheet.g:231:3: ruleDatasheetProperty
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
                    // InternalComponentDatasheet.g:236:2: ( ruleMandatoryDatasheetElement )
                    {
                    // InternalComponentDatasheet.g:236:2: ( ruleMandatoryDatasheetElement )
                    // InternalComponentDatasheet.g:237:3: ruleMandatoryDatasheetElement
                    {
                     before(grammarAccess.getAbstractDatasheetElementAccess().getMandatoryDatasheetElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMandatoryDatasheetElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractDatasheetElementAccess().getMandatoryDatasheetElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDatasheet.g:242:2: ( ruleComponentPortDatasheet )
                    {
                    // InternalComponentDatasheet.g:242:2: ( ruleComponentPortDatasheet )
                    // InternalComponentDatasheet.g:243:3: ruleComponentPortDatasheet
                    {
                     before(grammarAccess.getAbstractDatasheetElementAccess().getComponentPortDatasheetParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentPortDatasheet();

                    state._fsp--;

                     after(grammarAccess.getAbstractDatasheetElementAccess().getComponentPortDatasheetParserRuleCall_2()); 

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
    // InternalComponentDatasheet.g:252:1: rule__MandatoryDatasheetElementNames__Alternatives : ( ( ( 'BaseURI' ) ) | ( ( 'ShortDescription' ) ) );
    public final void rule__MandatoryDatasheetElementNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:256:1: ( ( ( 'BaseURI' ) ) | ( ( 'ShortDescription' ) ) )
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
                    // InternalComponentDatasheet.g:257:2: ( ( 'BaseURI' ) )
                    {
                    // InternalComponentDatasheet.g:257:2: ( ( 'BaseURI' ) )
                    // InternalComponentDatasheet.g:258:3: ( 'BaseURI' )
                    {
                     before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0()); 
                    // InternalComponentDatasheet.g:259:3: ( 'BaseURI' )
                    // InternalComponentDatasheet.g:259:4: 'BaseURI'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDatasheet.g:263:2: ( ( 'ShortDescription' ) )
                    {
                    // InternalComponentDatasheet.g:263:2: ( ( 'ShortDescription' ) )
                    // InternalComponentDatasheet.g:264:3: ( 'ShortDescription' )
                    {
                     before(grammarAccess.getMandatoryDatasheetElementNamesAccess().getShortDescriptionEnumLiteralDeclaration_1()); 
                    // InternalComponentDatasheet.g:265:3: ( 'ShortDescription' )
                    // InternalComponentDatasheet.g:265:4: 'ShortDescription'
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


    // $ANTLR start "rule__ComponentDatasheet__Group__0"
    // InternalComponentDatasheet.g:273:1: rule__ComponentDatasheet__Group__0 : rule__ComponentDatasheet__Group__0__Impl rule__ComponentDatasheet__Group__1 ;
    public final void rule__ComponentDatasheet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:277:1: ( rule__ComponentDatasheet__Group__0__Impl rule__ComponentDatasheet__Group__1 )
            // InternalComponentDatasheet.g:278:2: rule__ComponentDatasheet__Group__0__Impl rule__ComponentDatasheet__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ComponentDatasheet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group__1();

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
    // $ANTLR end "rule__ComponentDatasheet__Group__0"


    // $ANTLR start "rule__ComponentDatasheet__Group__0__Impl"
    // InternalComponentDatasheet.g:285:1: rule__ComponentDatasheet__Group__0__Impl : ( 'ComponentDatasheet' ) ;
    public final void rule__ComponentDatasheet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:289:1: ( ( 'ComponentDatasheet' ) )
            // InternalComponentDatasheet.g:290:1: ( 'ComponentDatasheet' )
            {
            // InternalComponentDatasheet.g:290:1: ( 'ComponentDatasheet' )
            // InternalComponentDatasheet.g:291:2: 'ComponentDatasheet'
            {
             before(grammarAccess.getComponentDatasheetAccess().getComponentDatasheetKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getComponentDatasheetKeyword_0()); 

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
    // $ANTLR end "rule__ComponentDatasheet__Group__0__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group__1"
    // InternalComponentDatasheet.g:300:1: rule__ComponentDatasheet__Group__1 : rule__ComponentDatasheet__Group__1__Impl rule__ComponentDatasheet__Group__2 ;
    public final void rule__ComponentDatasheet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:304:1: ( rule__ComponentDatasheet__Group__1__Impl rule__ComponentDatasheet__Group__2 )
            // InternalComponentDatasheet.g:305:2: rule__ComponentDatasheet__Group__1__Impl rule__ComponentDatasheet__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ComponentDatasheet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group__2();

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
    // $ANTLR end "rule__ComponentDatasheet__Group__1"


    // $ANTLR start "rule__ComponentDatasheet__Group__1__Impl"
    // InternalComponentDatasheet.g:312:1: rule__ComponentDatasheet__Group__1__Impl : ( ( rule__ComponentDatasheet__ComponentAssignment_1 ) ) ;
    public final void rule__ComponentDatasheet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:316:1: ( ( ( rule__ComponentDatasheet__ComponentAssignment_1 ) ) )
            // InternalComponentDatasheet.g:317:1: ( ( rule__ComponentDatasheet__ComponentAssignment_1 ) )
            {
            // InternalComponentDatasheet.g:317:1: ( ( rule__ComponentDatasheet__ComponentAssignment_1 ) )
            // InternalComponentDatasheet.g:318:2: ( rule__ComponentDatasheet__ComponentAssignment_1 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getComponentAssignment_1()); 
            // InternalComponentDatasheet.g:319:2: ( rule__ComponentDatasheet__ComponentAssignment_1 )
            // InternalComponentDatasheet.g:319:3: rule__ComponentDatasheet__ComponentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__ComponentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getComponentAssignment_1()); 

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
    // $ANTLR end "rule__ComponentDatasheet__Group__1__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group__2"
    // InternalComponentDatasheet.g:327:1: rule__ComponentDatasheet__Group__2 : rule__ComponentDatasheet__Group__2__Impl rule__ComponentDatasheet__Group__3 ;
    public final void rule__ComponentDatasheet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:331:1: ( rule__ComponentDatasheet__Group__2__Impl rule__ComponentDatasheet__Group__3 )
            // InternalComponentDatasheet.g:332:2: rule__ComponentDatasheet__Group__2__Impl rule__ComponentDatasheet__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ComponentDatasheet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group__3();

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
    // $ANTLR end "rule__ComponentDatasheet__Group__2"


    // $ANTLR start "rule__ComponentDatasheet__Group__2__Impl"
    // InternalComponentDatasheet.g:339:1: rule__ComponentDatasheet__Group__2__Impl : ( '{' ) ;
    public final void rule__ComponentDatasheet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:343:1: ( ( '{' ) )
            // InternalComponentDatasheet.g:344:1: ( '{' )
            {
            // InternalComponentDatasheet.g:344:1: ( '{' )
            // InternalComponentDatasheet.g:345:2: '{'
            {
             before(grammarAccess.getComponentDatasheetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ComponentDatasheet__Group__2__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group__3"
    // InternalComponentDatasheet.g:354:1: rule__ComponentDatasheet__Group__3 : rule__ComponentDatasheet__Group__3__Impl rule__ComponentDatasheet__Group__4 ;
    public final void rule__ComponentDatasheet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:358:1: ( rule__ComponentDatasheet__Group__3__Impl rule__ComponentDatasheet__Group__4 )
            // InternalComponentDatasheet.g:359:2: rule__ComponentDatasheet__Group__3__Impl rule__ComponentDatasheet__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDatasheet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group__4();

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
    // $ANTLR end "rule__ComponentDatasheet__Group__3"


    // $ANTLR start "rule__ComponentDatasheet__Group__3__Impl"
    // InternalComponentDatasheet.g:366:1: rule__ComponentDatasheet__Group__3__Impl : ( ruleGenericDatasheetModel ) ;
    public final void rule__ComponentDatasheet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:370:1: ( ( ruleGenericDatasheetModel ) )
            // InternalComponentDatasheet.g:371:1: ( ruleGenericDatasheetModel )
            {
            // InternalComponentDatasheet.g:371:1: ( ruleGenericDatasheetModel )
            // InternalComponentDatasheet.g:372:2: ruleGenericDatasheetModel
            {
             before(grammarAccess.getComponentDatasheetAccess().getGenericDatasheetModelParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleGenericDatasheetModel();

            state._fsp--;

             after(grammarAccess.getComponentDatasheetAccess().getGenericDatasheetModelParserRuleCall_3()); 

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
    // $ANTLR end "rule__ComponentDatasheet__Group__3__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group__4"
    // InternalComponentDatasheet.g:381:1: rule__ComponentDatasheet__Group__4 : rule__ComponentDatasheet__Group__4__Impl ;
    public final void rule__ComponentDatasheet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:385:1: ( rule__ComponentDatasheet__Group__4__Impl )
            // InternalComponentDatasheet.g:386:2: rule__ComponentDatasheet__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group__4__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__Group__4"


    // $ANTLR start "rule__ComponentDatasheet__Group__4__Impl"
    // InternalComponentDatasheet.g:392:1: rule__ComponentDatasheet__Group__4__Impl : ( '}' ) ;
    public final void rule__ComponentDatasheet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:396:1: ( ( '}' ) )
            // InternalComponentDatasheet.g:397:1: ( '}' )
            {
            // InternalComponentDatasheet.g:397:1: ( '}' )
            // InternalComponentDatasheet.g:398:2: '}'
            {
             before(grammarAccess.getComponentDatasheetAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ComponentDatasheet__Group__4__Impl"


    // $ANTLR start "rule__ComponentPortDatasheet__Group__0"
    // InternalComponentDatasheet.g:408:1: rule__ComponentPortDatasheet__Group__0 : rule__ComponentPortDatasheet__Group__0__Impl rule__ComponentPortDatasheet__Group__1 ;
    public final void rule__ComponentPortDatasheet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:412:1: ( rule__ComponentPortDatasheet__Group__0__Impl rule__ComponentPortDatasheet__Group__1 )
            // InternalComponentDatasheet.g:413:2: rule__ComponentPortDatasheet__Group__0__Impl rule__ComponentPortDatasheet__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ComponentPortDatasheet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentPortDatasheet__Group__1();

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
    // $ANTLR end "rule__ComponentPortDatasheet__Group__0"


    // $ANTLR start "rule__ComponentPortDatasheet__Group__0__Impl"
    // InternalComponentDatasheet.g:420:1: rule__ComponentPortDatasheet__Group__0__Impl : ( 'ComponentPortDatasheet' ) ;
    public final void rule__ComponentPortDatasheet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:424:1: ( ( 'ComponentPortDatasheet' ) )
            // InternalComponentDatasheet.g:425:1: ( 'ComponentPortDatasheet' )
            {
            // InternalComponentDatasheet.g:425:1: ( 'ComponentPortDatasheet' )
            // InternalComponentDatasheet.g:426:2: 'ComponentPortDatasheet'
            {
             before(grammarAccess.getComponentPortDatasheetAccess().getComponentPortDatasheetKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponentPortDatasheetAccess().getComponentPortDatasheetKeyword_0()); 

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
    // $ANTLR end "rule__ComponentPortDatasheet__Group__0__Impl"


    // $ANTLR start "rule__ComponentPortDatasheet__Group__1"
    // InternalComponentDatasheet.g:435:1: rule__ComponentPortDatasheet__Group__1 : rule__ComponentPortDatasheet__Group__1__Impl rule__ComponentPortDatasheet__Group__2 ;
    public final void rule__ComponentPortDatasheet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:439:1: ( rule__ComponentPortDatasheet__Group__1__Impl rule__ComponentPortDatasheet__Group__2 )
            // InternalComponentDatasheet.g:440:2: rule__ComponentPortDatasheet__Group__1__Impl rule__ComponentPortDatasheet__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ComponentPortDatasheet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentPortDatasheet__Group__2();

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
    // $ANTLR end "rule__ComponentPortDatasheet__Group__1"


    // $ANTLR start "rule__ComponentPortDatasheet__Group__1__Impl"
    // InternalComponentDatasheet.g:447:1: rule__ComponentPortDatasheet__Group__1__Impl : ( ( rule__ComponentPortDatasheet__PortAssignment_1 ) ) ;
    public final void rule__ComponentPortDatasheet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:451:1: ( ( ( rule__ComponentPortDatasheet__PortAssignment_1 ) ) )
            // InternalComponentDatasheet.g:452:1: ( ( rule__ComponentPortDatasheet__PortAssignment_1 ) )
            {
            // InternalComponentDatasheet.g:452:1: ( ( rule__ComponentPortDatasheet__PortAssignment_1 ) )
            // InternalComponentDatasheet.g:453:2: ( rule__ComponentPortDatasheet__PortAssignment_1 )
            {
             before(grammarAccess.getComponentPortDatasheetAccess().getPortAssignment_1()); 
            // InternalComponentDatasheet.g:454:2: ( rule__ComponentPortDatasheet__PortAssignment_1 )
            // InternalComponentDatasheet.g:454:3: rule__ComponentPortDatasheet__PortAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentPortDatasheet__PortAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentPortDatasheetAccess().getPortAssignment_1()); 

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
    // $ANTLR end "rule__ComponentPortDatasheet__Group__1__Impl"


    // $ANTLR start "rule__ComponentPortDatasheet__Group__2"
    // InternalComponentDatasheet.g:462:1: rule__ComponentPortDatasheet__Group__2 : rule__ComponentPortDatasheet__Group__2__Impl rule__ComponentPortDatasheet__Group__3 ;
    public final void rule__ComponentPortDatasheet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:466:1: ( rule__ComponentPortDatasheet__Group__2__Impl rule__ComponentPortDatasheet__Group__3 )
            // InternalComponentDatasheet.g:467:2: rule__ComponentPortDatasheet__Group__2__Impl rule__ComponentPortDatasheet__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ComponentPortDatasheet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentPortDatasheet__Group__3();

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
    // $ANTLR end "rule__ComponentPortDatasheet__Group__2"


    // $ANTLR start "rule__ComponentPortDatasheet__Group__2__Impl"
    // InternalComponentDatasheet.g:474:1: rule__ComponentPortDatasheet__Group__2__Impl : ( '{' ) ;
    public final void rule__ComponentPortDatasheet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:478:1: ( ( '{' ) )
            // InternalComponentDatasheet.g:479:1: ( '{' )
            {
            // InternalComponentDatasheet.g:479:1: ( '{' )
            // InternalComponentDatasheet.g:480:2: '{'
            {
             before(grammarAccess.getComponentPortDatasheetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentPortDatasheetAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ComponentPortDatasheet__Group__2__Impl"


    // $ANTLR start "rule__ComponentPortDatasheet__Group__3"
    // InternalComponentDatasheet.g:489:1: rule__ComponentPortDatasheet__Group__3 : rule__ComponentPortDatasheet__Group__3__Impl rule__ComponentPortDatasheet__Group__4 ;
    public final void rule__ComponentPortDatasheet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:493:1: ( rule__ComponentPortDatasheet__Group__3__Impl rule__ComponentPortDatasheet__Group__4 )
            // InternalComponentDatasheet.g:494:2: rule__ComponentPortDatasheet__Group__3__Impl rule__ComponentPortDatasheet__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ComponentPortDatasheet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentPortDatasheet__Group__4();

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
    // $ANTLR end "rule__ComponentPortDatasheet__Group__3"


    // $ANTLR start "rule__ComponentPortDatasheet__Group__3__Impl"
    // InternalComponentDatasheet.g:501:1: rule__ComponentPortDatasheet__Group__3__Impl : ( ( rule__ComponentPortDatasheet__PropertiesAssignment_3 )* ) ;
    public final void rule__ComponentPortDatasheet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:505:1: ( ( ( rule__ComponentPortDatasheet__PropertiesAssignment_3 )* ) )
            // InternalComponentDatasheet.g:506:1: ( ( rule__ComponentPortDatasheet__PropertiesAssignment_3 )* )
            {
            // InternalComponentDatasheet.g:506:1: ( ( rule__ComponentPortDatasheet__PropertiesAssignment_3 )* )
            // InternalComponentDatasheet.g:507:2: ( rule__ComponentPortDatasheet__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getComponentPortDatasheetAccess().getPropertiesAssignment_3()); 
            // InternalComponentDatasheet.g:508:2: ( rule__ComponentPortDatasheet__PropertiesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalComponentDatasheet.g:508:3: rule__ComponentPortDatasheet__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentPortDatasheet__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getComponentPortDatasheetAccess().getPropertiesAssignment_3()); 

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
    // $ANTLR end "rule__ComponentPortDatasheet__Group__3__Impl"


    // $ANTLR start "rule__ComponentPortDatasheet__Group__4"
    // InternalComponentDatasheet.g:516:1: rule__ComponentPortDatasheet__Group__4 : rule__ComponentPortDatasheet__Group__4__Impl ;
    public final void rule__ComponentPortDatasheet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:520:1: ( rule__ComponentPortDatasheet__Group__4__Impl )
            // InternalComponentDatasheet.g:521:2: rule__ComponentPortDatasheet__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentPortDatasheet__Group__4__Impl();

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
    // $ANTLR end "rule__ComponentPortDatasheet__Group__4"


    // $ANTLR start "rule__ComponentPortDatasheet__Group__4__Impl"
    // InternalComponentDatasheet.g:527:1: rule__ComponentPortDatasheet__Group__4__Impl : ( '}' ) ;
    public final void rule__ComponentPortDatasheet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:531:1: ( ( '}' ) )
            // InternalComponentDatasheet.g:532:1: ( '}' )
            {
            // InternalComponentDatasheet.g:532:1: ( '}' )
            // InternalComponentDatasheet.g:533:2: '}'
            {
             before(grammarAccess.getComponentPortDatasheetAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentPortDatasheetAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ComponentPortDatasheet__Group__4__Impl"


    // $ANTLR start "rule__DatasheetProperty__Group__0"
    // InternalComponentDatasheet.g:543:1: rule__DatasheetProperty__Group__0 : rule__DatasheetProperty__Group__0__Impl rule__DatasheetProperty__Group__1 ;
    public final void rule__DatasheetProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:547:1: ( rule__DatasheetProperty__Group__0__Impl rule__DatasheetProperty__Group__1 )
            // InternalComponentDatasheet.g:548:2: rule__DatasheetProperty__Group__0__Impl rule__DatasheetProperty__Group__1
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
    // InternalComponentDatasheet.g:555:1: rule__DatasheetProperty__Group__0__Impl : ( 'DatasheetProperty' ) ;
    public final void rule__DatasheetProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:559:1: ( ( 'DatasheetProperty' ) )
            // InternalComponentDatasheet.g:560:1: ( 'DatasheetProperty' )
            {
            // InternalComponentDatasheet.g:560:1: ( 'DatasheetProperty' )
            // InternalComponentDatasheet.g:561:2: 'DatasheetProperty'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getDatasheetPropertyKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:570:1: rule__DatasheetProperty__Group__1 : rule__DatasheetProperty__Group__1__Impl rule__DatasheetProperty__Group__2 ;
    public final void rule__DatasheetProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:574:1: ( rule__DatasheetProperty__Group__1__Impl rule__DatasheetProperty__Group__2 )
            // InternalComponentDatasheet.g:575:2: rule__DatasheetProperty__Group__1__Impl rule__DatasheetProperty__Group__2
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
    // InternalComponentDatasheet.g:582:1: rule__DatasheetProperty__Group__1__Impl : ( ( rule__DatasheetProperty__NameAssignment_1 ) ) ;
    public final void rule__DatasheetProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:586:1: ( ( ( rule__DatasheetProperty__NameAssignment_1 ) ) )
            // InternalComponentDatasheet.g:587:1: ( ( rule__DatasheetProperty__NameAssignment_1 ) )
            {
            // InternalComponentDatasheet.g:587:1: ( ( rule__DatasheetProperty__NameAssignment_1 ) )
            // InternalComponentDatasheet.g:588:2: ( rule__DatasheetProperty__NameAssignment_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getNameAssignment_1()); 
            // InternalComponentDatasheet.g:589:2: ( rule__DatasheetProperty__NameAssignment_1 )
            // InternalComponentDatasheet.g:589:3: rule__DatasheetProperty__NameAssignment_1
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
    // InternalComponentDatasheet.g:597:1: rule__DatasheetProperty__Group__2 : rule__DatasheetProperty__Group__2__Impl rule__DatasheetProperty__Group__3 ;
    public final void rule__DatasheetProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:601:1: ( rule__DatasheetProperty__Group__2__Impl rule__DatasheetProperty__Group__3 )
            // InternalComponentDatasheet.g:602:2: rule__DatasheetProperty__Group__2__Impl rule__DatasheetProperty__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalComponentDatasheet.g:609:1: rule__DatasheetProperty__Group__2__Impl : ( '{' ) ;
    public final void rule__DatasheetProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:613:1: ( ( '{' ) )
            // InternalComponentDatasheet.g:614:1: ( '{' )
            {
            // InternalComponentDatasheet.g:614:1: ( '{' )
            // InternalComponentDatasheet.g:615:2: '{'
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
    // InternalComponentDatasheet.g:624:1: rule__DatasheetProperty__Group__3 : rule__DatasheetProperty__Group__3__Impl rule__DatasheetProperty__Group__4 ;
    public final void rule__DatasheetProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:628:1: ( rule__DatasheetProperty__Group__3__Impl rule__DatasheetProperty__Group__4 )
            // InternalComponentDatasheet.g:629:2: rule__DatasheetProperty__Group__3__Impl rule__DatasheetProperty__Group__4
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
    // InternalComponentDatasheet.g:636:1: rule__DatasheetProperty__Group__3__Impl : ( ( rule__DatasheetProperty__UnorderedGroup_3 ) ) ;
    public final void rule__DatasheetProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:640:1: ( ( ( rule__DatasheetProperty__UnorderedGroup_3 ) ) )
            // InternalComponentDatasheet.g:641:1: ( ( rule__DatasheetProperty__UnorderedGroup_3 ) )
            {
            // InternalComponentDatasheet.g:641:1: ( ( rule__DatasheetProperty__UnorderedGroup_3 ) )
            // InternalComponentDatasheet.g:642:2: ( rule__DatasheetProperty__UnorderedGroup_3 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3()); 
            // InternalComponentDatasheet.g:643:2: ( rule__DatasheetProperty__UnorderedGroup_3 )
            // InternalComponentDatasheet.g:643:3: rule__DatasheetProperty__UnorderedGroup_3
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
    // InternalComponentDatasheet.g:651:1: rule__DatasheetProperty__Group__4 : rule__DatasheetProperty__Group__4__Impl ;
    public final void rule__DatasheetProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:655:1: ( rule__DatasheetProperty__Group__4__Impl )
            // InternalComponentDatasheet.g:656:2: rule__DatasheetProperty__Group__4__Impl
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
    // InternalComponentDatasheet.g:662:1: rule__DatasheetProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__DatasheetProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:666:1: ( ( '}' ) )
            // InternalComponentDatasheet.g:667:1: ( '}' )
            {
            // InternalComponentDatasheet.g:667:1: ( '}' )
            // InternalComponentDatasheet.g:668:2: '}'
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
    // InternalComponentDatasheet.g:678:1: rule__DatasheetProperty__Group_3_0__0 : rule__DatasheetProperty__Group_3_0__0__Impl rule__DatasheetProperty__Group_3_0__1 ;
    public final void rule__DatasheetProperty__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:682:1: ( rule__DatasheetProperty__Group_3_0__0__Impl rule__DatasheetProperty__Group_3_0__1 )
            // InternalComponentDatasheet.g:683:2: rule__DatasheetProperty__Group_3_0__0__Impl rule__DatasheetProperty__Group_3_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentDatasheet.g:690:1: rule__DatasheetProperty__Group_3_0__0__Impl : ( 'value' ) ;
    public final void rule__DatasheetProperty__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:694:1: ( ( 'value' ) )
            // InternalComponentDatasheet.g:695:1: ( 'value' )
            {
            // InternalComponentDatasheet.g:695:1: ( 'value' )
            // InternalComponentDatasheet.g:696:2: 'value'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getValueKeyword_3_0_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:705:1: rule__DatasheetProperty__Group_3_0__1 : rule__DatasheetProperty__Group_3_0__1__Impl rule__DatasheetProperty__Group_3_0__2 ;
    public final void rule__DatasheetProperty__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:709:1: ( rule__DatasheetProperty__Group_3_0__1__Impl rule__DatasheetProperty__Group_3_0__2 )
            // InternalComponentDatasheet.g:710:2: rule__DatasheetProperty__Group_3_0__1__Impl rule__DatasheetProperty__Group_3_0__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentDatasheet.g:717:1: rule__DatasheetProperty__Group_3_0__1__Impl : ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:721:1: ( ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) ) )
            // InternalComponentDatasheet.g:722:1: ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) )
            {
            // InternalComponentDatasheet.g:722:1: ( ( rule__DatasheetProperty__ValueAssignment_3_0_1 ) )
            // InternalComponentDatasheet.g:723:2: ( rule__DatasheetProperty__ValueAssignment_3_0_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getValueAssignment_3_0_1()); 
            // InternalComponentDatasheet.g:724:2: ( rule__DatasheetProperty__ValueAssignment_3_0_1 )
            // InternalComponentDatasheet.g:724:3: rule__DatasheetProperty__ValueAssignment_3_0_1
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
    // InternalComponentDatasheet.g:732:1: rule__DatasheetProperty__Group_3_0__2 : rule__DatasheetProperty__Group_3_0__2__Impl ;
    public final void rule__DatasheetProperty__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:736:1: ( rule__DatasheetProperty__Group_3_0__2__Impl )
            // InternalComponentDatasheet.g:737:2: rule__DatasheetProperty__Group_3_0__2__Impl
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
    // InternalComponentDatasheet.g:743:1: rule__DatasheetProperty__Group_3_0__2__Impl : ( ( rule__DatasheetProperty__Group_3_0_2__0 )? ) ;
    public final void rule__DatasheetProperty__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:747:1: ( ( ( rule__DatasheetProperty__Group_3_0_2__0 )? ) )
            // InternalComponentDatasheet.g:748:1: ( ( rule__DatasheetProperty__Group_3_0_2__0 )? )
            {
            // InternalComponentDatasheet.g:748:1: ( ( rule__DatasheetProperty__Group_3_0_2__0 )? )
            // InternalComponentDatasheet.g:749:2: ( rule__DatasheetProperty__Group_3_0_2__0 )?
            {
             before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0_2()); 
            // InternalComponentDatasheet.g:750:2: ( rule__DatasheetProperty__Group_3_0_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentDatasheet.g:750:3: rule__DatasheetProperty__Group_3_0_2__0
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
    // InternalComponentDatasheet.g:759:1: rule__DatasheetProperty__Group_3_0_2__0 : rule__DatasheetProperty__Group_3_0_2__0__Impl rule__DatasheetProperty__Group_3_0_2__1 ;
    public final void rule__DatasheetProperty__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:763:1: ( rule__DatasheetProperty__Group_3_0_2__0__Impl rule__DatasheetProperty__Group_3_0_2__1 )
            // InternalComponentDatasheet.g:764:2: rule__DatasheetProperty__Group_3_0_2__0__Impl rule__DatasheetProperty__Group_3_0_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentDatasheet.g:771:1: rule__DatasheetProperty__Group_3_0_2__0__Impl : ( 'unit' ) ;
    public final void rule__DatasheetProperty__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:775:1: ( ( 'unit' ) )
            // InternalComponentDatasheet.g:776:1: ( 'unit' )
            {
            // InternalComponentDatasheet.g:776:1: ( 'unit' )
            // InternalComponentDatasheet.g:777:2: 'unit'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getUnitKeyword_3_0_2_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:786:1: rule__DatasheetProperty__Group_3_0_2__1 : rule__DatasheetProperty__Group_3_0_2__1__Impl ;
    public final void rule__DatasheetProperty__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:790:1: ( rule__DatasheetProperty__Group_3_0_2__1__Impl )
            // InternalComponentDatasheet.g:791:2: rule__DatasheetProperty__Group_3_0_2__1__Impl
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
    // InternalComponentDatasheet.g:797:1: rule__DatasheetProperty__Group_3_0_2__1__Impl : ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:801:1: ( ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) ) )
            // InternalComponentDatasheet.g:802:1: ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) )
            {
            // InternalComponentDatasheet.g:802:1: ( ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 ) )
            // InternalComponentDatasheet.g:803:2: ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getUnitAssignment_3_0_2_1()); 
            // InternalComponentDatasheet.g:804:2: ( rule__DatasheetProperty__UnitAssignment_3_0_2_1 )
            // InternalComponentDatasheet.g:804:3: rule__DatasheetProperty__UnitAssignment_3_0_2_1
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
    // InternalComponentDatasheet.g:813:1: rule__DatasheetProperty__Group_3_1__0 : rule__DatasheetProperty__Group_3_1__0__Impl rule__DatasheetProperty__Group_3_1__1 ;
    public final void rule__DatasheetProperty__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:817:1: ( rule__DatasheetProperty__Group_3_1__0__Impl rule__DatasheetProperty__Group_3_1__1 )
            // InternalComponentDatasheet.g:818:2: rule__DatasheetProperty__Group_3_1__0__Impl rule__DatasheetProperty__Group_3_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentDatasheet.g:825:1: rule__DatasheetProperty__Group_3_1__0__Impl : ( 'shortDescription' ) ;
    public final void rule__DatasheetProperty__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:829:1: ( ( 'shortDescription' ) )
            // InternalComponentDatasheet.g:830:1: ( 'shortDescription' )
            {
            // InternalComponentDatasheet.g:830:1: ( 'shortDescription' )
            // InternalComponentDatasheet.g:831:2: 'shortDescription'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:840:1: rule__DatasheetProperty__Group_3_1__1 : rule__DatasheetProperty__Group_3_1__1__Impl ;
    public final void rule__DatasheetProperty__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:844:1: ( rule__DatasheetProperty__Group_3_1__1__Impl )
            // InternalComponentDatasheet.g:845:2: rule__DatasheetProperty__Group_3_1__1__Impl
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
    // InternalComponentDatasheet.g:851:1: rule__DatasheetProperty__Group_3_1__1__Impl : ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:855:1: ( ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) ) )
            // InternalComponentDatasheet.g:856:1: ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) )
            {
            // InternalComponentDatasheet.g:856:1: ( ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 ) )
            // InternalComponentDatasheet.g:857:2: ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getShortDescriptionAssignment_3_1_1()); 
            // InternalComponentDatasheet.g:858:2: ( rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 )
            // InternalComponentDatasheet.g:858:3: rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1
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
    // InternalComponentDatasheet.g:867:1: rule__DatasheetProperty__Group_3_2__0 : rule__DatasheetProperty__Group_3_2__0__Impl rule__DatasheetProperty__Group_3_2__1 ;
    public final void rule__DatasheetProperty__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:871:1: ( rule__DatasheetProperty__Group_3_2__0__Impl rule__DatasheetProperty__Group_3_2__1 )
            // InternalComponentDatasheet.g:872:2: rule__DatasheetProperty__Group_3_2__0__Impl rule__DatasheetProperty__Group_3_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentDatasheet.g:879:1: rule__DatasheetProperty__Group_3_2__0__Impl : ( 'semanticID' ) ;
    public final void rule__DatasheetProperty__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:883:1: ( ( 'semanticID' ) )
            // InternalComponentDatasheet.g:884:1: ( 'semanticID' )
            {
            // InternalComponentDatasheet.g:884:1: ( 'semanticID' )
            // InternalComponentDatasheet.g:885:2: 'semanticID'
            {
             before(grammarAccess.getDatasheetPropertyAccess().getSemanticIDKeyword_3_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:894:1: rule__DatasheetProperty__Group_3_2__1 : rule__DatasheetProperty__Group_3_2__1__Impl ;
    public final void rule__DatasheetProperty__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:898:1: ( rule__DatasheetProperty__Group_3_2__1__Impl )
            // InternalComponentDatasheet.g:899:2: rule__DatasheetProperty__Group_3_2__1__Impl
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
    // InternalComponentDatasheet.g:905:1: rule__DatasheetProperty__Group_3_2__1__Impl : ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) ) ;
    public final void rule__DatasheetProperty__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:909:1: ( ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) ) )
            // InternalComponentDatasheet.g:910:1: ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) )
            {
            // InternalComponentDatasheet.g:910:1: ( ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 ) )
            // InternalComponentDatasheet.g:911:2: ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 )
            {
             before(grammarAccess.getDatasheetPropertyAccess().getSemanticIDAssignment_3_2_1()); 
            // InternalComponentDatasheet.g:912:2: ( rule__DatasheetProperty__SemanticIDAssignment_3_2_1 )
            // InternalComponentDatasheet.g:912:3: rule__DatasheetProperty__SemanticIDAssignment_3_2_1
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
    // InternalComponentDatasheet.g:921:1: rule__MandatoryDatasheetElement__Group__0 : rule__MandatoryDatasheetElement__Group__0__Impl rule__MandatoryDatasheetElement__Group__1 ;
    public final void rule__MandatoryDatasheetElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:925:1: ( rule__MandatoryDatasheetElement__Group__0__Impl rule__MandatoryDatasheetElement__Group__1 )
            // InternalComponentDatasheet.g:926:2: rule__MandatoryDatasheetElement__Group__0__Impl rule__MandatoryDatasheetElement__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentDatasheet.g:933:1: rule__MandatoryDatasheetElement__Group__0__Impl : ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) ) ;
    public final void rule__MandatoryDatasheetElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:937:1: ( ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) ) )
            // InternalComponentDatasheet.g:938:1: ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) )
            {
            // InternalComponentDatasheet.g:938:1: ( ( rule__MandatoryDatasheetElement__NameAssignment_0 ) )
            // InternalComponentDatasheet.g:939:2: ( rule__MandatoryDatasheetElement__NameAssignment_0 )
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getNameAssignment_0()); 
            // InternalComponentDatasheet.g:940:2: ( rule__MandatoryDatasheetElement__NameAssignment_0 )
            // InternalComponentDatasheet.g:940:3: rule__MandatoryDatasheetElement__NameAssignment_0
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
    // InternalComponentDatasheet.g:948:1: rule__MandatoryDatasheetElement__Group__1 : rule__MandatoryDatasheetElement__Group__1__Impl ;
    public final void rule__MandatoryDatasheetElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:952:1: ( rule__MandatoryDatasheetElement__Group__1__Impl )
            // InternalComponentDatasheet.g:953:2: rule__MandatoryDatasheetElement__Group__1__Impl
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
    // InternalComponentDatasheet.g:959:1: rule__MandatoryDatasheetElement__Group__1__Impl : ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) ) ;
    public final void rule__MandatoryDatasheetElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:963:1: ( ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) ) )
            // InternalComponentDatasheet.g:964:1: ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) )
            {
            // InternalComponentDatasheet.g:964:1: ( ( rule__MandatoryDatasheetElement__ValueAssignment_1 ) )
            // InternalComponentDatasheet.g:965:2: ( rule__MandatoryDatasheetElement__ValueAssignment_1 )
            {
             before(grammarAccess.getMandatoryDatasheetElementAccess().getValueAssignment_1()); 
            // InternalComponentDatasheet.g:966:2: ( rule__MandatoryDatasheetElement__ValueAssignment_1 )
            // InternalComponentDatasheet.g:966:3: rule__MandatoryDatasheetElement__ValueAssignment_1
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
    // InternalComponentDatasheet.g:975:1: rule__DatasheetProperty__UnorderedGroup_3 : rule__DatasheetProperty__UnorderedGroup_3__0 {...}?;
    public final void rule__DatasheetProperty__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
        	
        try {
            // InternalComponentDatasheet.g:980:1: ( rule__DatasheetProperty__UnorderedGroup_3__0 {...}?)
            // InternalComponentDatasheet.g:981:2: rule__DatasheetProperty__UnorderedGroup_3__0 {...}?
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
    // InternalComponentDatasheet.g:989:1: rule__DatasheetProperty__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDatasheet.g:994:1: ( ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) ) )
            // InternalComponentDatasheet.g:995:3: ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) )
            {
            // InternalComponentDatasheet.g:995:3: ( ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( LA6_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                alt6=1;
            }
            else if ( LA6_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                alt6=2;
            }
            else if ( LA6_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentDatasheet.g:996:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:996:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) ) )
                    // InternalComponentDatasheet.g:997:4: {...}? => ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__DatasheetProperty__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalComponentDatasheet.g:997:113: ( ( ( rule__DatasheetProperty__Group_3_0__0 ) ) )
                    // InternalComponentDatasheet.g:998:5: ( ( rule__DatasheetProperty__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1004:5: ( ( rule__DatasheetProperty__Group_3_0__0 ) )
                    // InternalComponentDatasheet.g:1005:6: ( rule__DatasheetProperty__Group_3_0__0 )
                    {
                     before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_0()); 
                    // InternalComponentDatasheet.g:1006:6: ( rule__DatasheetProperty__Group_3_0__0 )
                    // InternalComponentDatasheet.g:1006:7: rule__DatasheetProperty__Group_3_0__0
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
                    // InternalComponentDatasheet.g:1011:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1011:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) ) )
                    // InternalComponentDatasheet.g:1012:4: {...}? => ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__DatasheetProperty__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalComponentDatasheet.g:1012:113: ( ( ( rule__DatasheetProperty__Group_3_1__0 ) ) )
                    // InternalComponentDatasheet.g:1013:5: ( ( rule__DatasheetProperty__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1019:5: ( ( rule__DatasheetProperty__Group_3_1__0 ) )
                    // InternalComponentDatasheet.g:1020:6: ( rule__DatasheetProperty__Group_3_1__0 )
                    {
                     before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_1()); 
                    // InternalComponentDatasheet.g:1021:6: ( rule__DatasheetProperty__Group_3_1__0 )
                    // InternalComponentDatasheet.g:1021:7: rule__DatasheetProperty__Group_3_1__0
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
                    // InternalComponentDatasheet.g:1026:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1026:3: ({...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) ) )
                    // InternalComponentDatasheet.g:1027:4: {...}? => ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__DatasheetProperty__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalComponentDatasheet.g:1027:113: ( ( ( rule__DatasheetProperty__Group_3_2__0 ) ) )
                    // InternalComponentDatasheet.g:1028:5: ( ( rule__DatasheetProperty__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1034:5: ( ( rule__DatasheetProperty__Group_3_2__0 ) )
                    // InternalComponentDatasheet.g:1035:6: ( rule__DatasheetProperty__Group_3_2__0 )
                    {
                     before(grammarAccess.getDatasheetPropertyAccess().getGroup_3_2()); 
                    // InternalComponentDatasheet.g:1036:6: ( rule__DatasheetProperty__Group_3_2__0 )
                    // InternalComponentDatasheet.g:1036:7: rule__DatasheetProperty__Group_3_2__0
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
    // InternalComponentDatasheet.g:1049:1: rule__DatasheetProperty__UnorderedGroup_3__0 : rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__1 )? ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1053:1: ( rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__1 )? )
            // InternalComponentDatasheet.g:1054:2: rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_13);
            rule__DatasheetProperty__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1055:2: ( rule__DatasheetProperty__UnorderedGroup_3__1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( LA7_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                alt7=1;
            }
            else if ( LA7_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                alt7=1;
            }
            else if ( LA7_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentDatasheet.g:1055:2: rule__DatasheetProperty__UnorderedGroup_3__1
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
    // InternalComponentDatasheet.g:1061:1: rule__DatasheetProperty__UnorderedGroup_3__1 : rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__2 )? ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1065:1: ( rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__2 )? )
            // InternalComponentDatasheet.g:1066:2: rule__DatasheetProperty__UnorderedGroup_3__Impl ( rule__DatasheetProperty__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_13);
            rule__DatasheetProperty__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1067:2: ( rule__DatasheetProperty__UnorderedGroup_3__2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( LA8_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                alt8=1;
            }
            else if ( LA8_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                alt8=1;
            }
            else if ( LA8_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentDatasheet.g:1067:2: rule__DatasheetProperty__UnorderedGroup_3__2
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
    // InternalComponentDatasheet.g:1073:1: rule__DatasheetProperty__UnorderedGroup_3__2 : rule__DatasheetProperty__UnorderedGroup_3__Impl ;
    public final void rule__DatasheetProperty__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1077:1: ( rule__DatasheetProperty__UnorderedGroup_3__Impl )
            // InternalComponentDatasheet.g:1078:2: rule__DatasheetProperty__UnorderedGroup_3__Impl
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


    // $ANTLR start "rule__ComponentDatasheet__ComponentAssignment_1"
    // InternalComponentDatasheet.g:1085:1: rule__ComponentDatasheet__ComponentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ComponentDatasheet__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1089:1: ( ( ( RULE_ID ) ) )
            // InternalComponentDatasheet.g:1090:2: ( ( RULE_ID ) )
            {
            // InternalComponentDatasheet.g:1090:2: ( ( RULE_ID ) )
            // InternalComponentDatasheet.g:1091:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentDatasheetAccess().getComponentComponentDefinitionCrossReference_1_0()); 
            // InternalComponentDatasheet.g:1092:3: ( RULE_ID )
            // InternalComponentDatasheet.g:1093:4: RULE_ID
            {
             before(grammarAccess.getComponentDatasheetAccess().getComponentComponentDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getComponentComponentDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComponentDatasheetAccess().getComponentComponentDefinitionCrossReference_1_0()); 

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
    // $ANTLR end "rule__ComponentDatasheet__ComponentAssignment_1"


    // $ANTLR start "rule__ComponentPortDatasheet__PortAssignment_1"
    // InternalComponentDatasheet.g:1104:1: rule__ComponentPortDatasheet__PortAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ComponentPortDatasheet__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1108:1: ( ( ( RULE_ID ) ) )
            // InternalComponentDatasheet.g:1109:2: ( ( RULE_ID ) )
            {
            // InternalComponentDatasheet.g:1109:2: ( ( RULE_ID ) )
            // InternalComponentDatasheet.g:1110:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentPortDatasheetAccess().getPortComponentPortCrossReference_1_0()); 
            // InternalComponentDatasheet.g:1111:3: ( RULE_ID )
            // InternalComponentDatasheet.g:1112:4: RULE_ID
            {
             before(grammarAccess.getComponentPortDatasheetAccess().getPortComponentPortIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentPortDatasheetAccess().getPortComponentPortIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComponentPortDatasheetAccess().getPortComponentPortCrossReference_1_0()); 

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
    // $ANTLR end "rule__ComponentPortDatasheet__PortAssignment_1"


    // $ANTLR start "rule__ComponentPortDatasheet__PropertiesAssignment_3"
    // InternalComponentDatasheet.g:1123:1: rule__ComponentPortDatasheet__PropertiesAssignment_3 : ( ruleDatasheetProperty ) ;
    public final void rule__ComponentPortDatasheet__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1127:1: ( ( ruleDatasheetProperty ) )
            // InternalComponentDatasheet.g:1128:2: ( ruleDatasheetProperty )
            {
            // InternalComponentDatasheet.g:1128:2: ( ruleDatasheetProperty )
            // InternalComponentDatasheet.g:1129:3: ruleDatasheetProperty
            {
             before(grammarAccess.getComponentPortDatasheetAccess().getPropertiesDatasheetPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDatasheetProperty();

            state._fsp--;

             after(grammarAccess.getComponentPortDatasheetAccess().getPropertiesDatasheetPropertyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ComponentPortDatasheet__PropertiesAssignment_3"


    // $ANTLR start "rule__GenericDatasheetModel__ElementsAssignment"
    // InternalComponentDatasheet.g:1138:1: rule__GenericDatasheetModel__ElementsAssignment : ( ruleAbstractDatasheetElement ) ;
    public final void rule__GenericDatasheetModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1142:1: ( ( ruleAbstractDatasheetElement ) )
            // InternalComponentDatasheet.g:1143:2: ( ruleAbstractDatasheetElement )
            {
            // InternalComponentDatasheet.g:1143:2: ( ruleAbstractDatasheetElement )
            // InternalComponentDatasheet.g:1144:3: ruleAbstractDatasheetElement
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
    // InternalComponentDatasheet.g:1153:1: rule__DatasheetProperty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DatasheetProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1157:1: ( ( RULE_ID ) )
            // InternalComponentDatasheet.g:1158:2: ( RULE_ID )
            {
            // InternalComponentDatasheet.g:1158:2: ( RULE_ID )
            // InternalComponentDatasheet.g:1159:3: RULE_ID
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
    // InternalComponentDatasheet.g:1168:1: rule__DatasheetProperty__ValueAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__ValueAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1172:1: ( ( RULE_STRING ) )
            // InternalComponentDatasheet.g:1173:2: ( RULE_STRING )
            {
            // InternalComponentDatasheet.g:1173:2: ( RULE_STRING )
            // InternalComponentDatasheet.g:1174:3: RULE_STRING
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
    // InternalComponentDatasheet.g:1183:1: rule__DatasheetProperty__UnitAssignment_3_0_2_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__UnitAssignment_3_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1187:1: ( ( RULE_STRING ) )
            // InternalComponentDatasheet.g:1188:2: ( RULE_STRING )
            {
            // InternalComponentDatasheet.g:1188:2: ( RULE_STRING )
            // InternalComponentDatasheet.g:1189:3: RULE_STRING
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
    // InternalComponentDatasheet.g:1198:1: rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__ShortDescriptionAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1202:1: ( ( RULE_STRING ) )
            // InternalComponentDatasheet.g:1203:2: ( RULE_STRING )
            {
            // InternalComponentDatasheet.g:1203:2: ( RULE_STRING )
            // InternalComponentDatasheet.g:1204:3: RULE_STRING
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
    // InternalComponentDatasheet.g:1213:1: rule__DatasheetProperty__SemanticIDAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__DatasheetProperty__SemanticIDAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1217:1: ( ( RULE_STRING ) )
            // InternalComponentDatasheet.g:1218:2: ( RULE_STRING )
            {
            // InternalComponentDatasheet.g:1218:2: ( RULE_STRING )
            // InternalComponentDatasheet.g:1219:3: RULE_STRING
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
    // InternalComponentDatasheet.g:1228:1: rule__MandatoryDatasheetElement__NameAssignment_0 : ( ruleMandatoryDatasheetElementNames ) ;
    public final void rule__MandatoryDatasheetElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1232:1: ( ( ruleMandatoryDatasheetElementNames ) )
            // InternalComponentDatasheet.g:1233:2: ( ruleMandatoryDatasheetElementNames )
            {
            // InternalComponentDatasheet.g:1233:2: ( ruleMandatoryDatasheetElementNames )
            // InternalComponentDatasheet.g:1234:3: ruleMandatoryDatasheetElementNames
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
    // InternalComponentDatasheet.g:1243:1: rule__MandatoryDatasheetElement__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MandatoryDatasheetElement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1247:1: ( ( RULE_STRING ) )
            // InternalComponentDatasheet.g:1248:2: ( RULE_STRING )
            {
            // InternalComponentDatasheet.g:1248:2: ( RULE_STRING )
            // InternalComponentDatasheet.g:1249:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000031802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000031800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000340002L});

}
