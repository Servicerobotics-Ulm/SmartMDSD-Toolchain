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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_TEXT_BLOCK", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Level1'", "'Level2'", "'Level3'", "'Level4'", "'Level5'", "'Level6'", "'Level7'", "'Level8'", "'Level9'", "'Undefined'", "'DomainModelsDatasheet'", "'{'", "'}'", "'baseURI'", "':'", "'shortDescription'", "'longDescription'", "'supplierDescription'", "'homepage'", "'trl'", "'license'", "'spdx'", "'('", "')'", "'proprietary'", "'name'", "'fullText'", "'URL'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_TEXT_BLOCK=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalDomainModelsDatasheet.g:94:1: entryRuleDomainModelsDatasheet : ruleDomainModelsDatasheet EOF ;
    public final void entryRuleDomainModelsDatasheet() throws RecognitionException {
        try {
            // InternalDomainModelsDatasheet.g:95:1: ( ruleDomainModelsDatasheet EOF )
            // InternalDomainModelsDatasheet.g:96:1: ruleDomainModelsDatasheet EOF
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
    // InternalDomainModelsDatasheet.g:103:1: ruleDomainModelsDatasheet : ( ( rule__DomainModelsDatasheet__Group__0 ) ) ;
    public final void ruleDomainModelsDatasheet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:107:2: ( ( ( rule__DomainModelsDatasheet__Group__0 ) ) )
            // InternalDomainModelsDatasheet.g:108:2: ( ( rule__DomainModelsDatasheet__Group__0 ) )
            {
            // InternalDomainModelsDatasheet.g:108:2: ( ( rule__DomainModelsDatasheet__Group__0 ) )
            // InternalDomainModelsDatasheet.g:109:3: ( rule__DomainModelsDatasheet__Group__0 )
            {
             before(grammarAccess.getDomainModelsDatasheetAccess().getGroup()); 
            // InternalDomainModelsDatasheet.g:110:3: ( rule__DomainModelsDatasheet__Group__0 )
            // InternalDomainModelsDatasheet.g:110:4: rule__DomainModelsDatasheet__Group__0
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


    // $ANTLR start "ruleGenericDatasheet"
    // InternalDomainModelsDatasheet.g:120:1: ruleGenericDatasheet : ( ( rule__GenericDatasheet__UnorderedGroup ) ) ;
    public final void ruleGenericDatasheet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:124:2: ( ( ( rule__GenericDatasheet__UnorderedGroup ) ) )
            // InternalDomainModelsDatasheet.g:125:2: ( ( rule__GenericDatasheet__UnorderedGroup ) )
            {
            // InternalDomainModelsDatasheet.g:125:2: ( ( rule__GenericDatasheet__UnorderedGroup ) )
            // InternalDomainModelsDatasheet.g:126:3: ( rule__GenericDatasheet__UnorderedGroup )
            {
             before(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup()); 
            // InternalDomainModelsDatasheet.g:127:3: ( rule__GenericDatasheet__UnorderedGroup )
            // InternalDomainModelsDatasheet.g:127:4: rule__GenericDatasheet__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup()); 

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
    // $ANTLR end "ruleGenericDatasheet"


    // $ANTLR start "entryRuleAbstractLicense"
    // InternalDomainModelsDatasheet.g:136:1: entryRuleAbstractLicense : ruleAbstractLicense EOF ;
    public final void entryRuleAbstractLicense() throws RecognitionException {
        try {
            // InternalDomainModelsDatasheet.g:137:1: ( ruleAbstractLicense EOF )
            // InternalDomainModelsDatasheet.g:138:1: ruleAbstractLicense EOF
            {
             before(grammarAccess.getAbstractLicenseRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractLicense();

            state._fsp--;

             after(grammarAccess.getAbstractLicenseRule()); 
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
    // $ANTLR end "entryRuleAbstractLicense"


    // $ANTLR start "ruleAbstractLicense"
    // InternalDomainModelsDatasheet.g:145:1: ruleAbstractLicense : ( ( rule__AbstractLicense__Alternatives ) ) ;
    public final void ruleAbstractLicense() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:149:2: ( ( ( rule__AbstractLicense__Alternatives ) ) )
            // InternalDomainModelsDatasheet.g:150:2: ( ( rule__AbstractLicense__Alternatives ) )
            {
            // InternalDomainModelsDatasheet.g:150:2: ( ( rule__AbstractLicense__Alternatives ) )
            // InternalDomainModelsDatasheet.g:151:3: ( rule__AbstractLicense__Alternatives )
            {
             before(grammarAccess.getAbstractLicenseAccess().getAlternatives()); 
            // InternalDomainModelsDatasheet.g:152:3: ( rule__AbstractLicense__Alternatives )
            // InternalDomainModelsDatasheet.g:152:4: rule__AbstractLicense__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractLicense__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractLicenseAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractLicense"


    // $ANTLR start "entryRuleEString"
    // InternalDomainModelsDatasheet.g:161:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDomainModelsDatasheet.g:162:1: ( ruleEString EOF )
            // InternalDomainModelsDatasheet.g:163:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDomainModelsDatasheet.g:170:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:174:2: ( ( RULE_STRING ) )
            // InternalDomainModelsDatasheet.g:175:2: ( RULE_STRING )
            {
            // InternalDomainModelsDatasheet.g:175:2: ( RULE_STRING )
            // InternalDomainModelsDatasheet.g:176:3: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSpdxLicense"
    // InternalDomainModelsDatasheet.g:186:1: entryRuleSpdxLicense : ruleSpdxLicense EOF ;
    public final void entryRuleSpdxLicense() throws RecognitionException {
        try {
            // InternalDomainModelsDatasheet.g:187:1: ( ruleSpdxLicense EOF )
            // InternalDomainModelsDatasheet.g:188:1: ruleSpdxLicense EOF
            {
             before(grammarAccess.getSpdxLicenseRule()); 
            pushFollow(FOLLOW_1);
            ruleSpdxLicense();

            state._fsp--;

             after(grammarAccess.getSpdxLicenseRule()); 
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
    // $ANTLR end "entryRuleSpdxLicense"


    // $ANTLR start "ruleSpdxLicense"
    // InternalDomainModelsDatasheet.g:195:1: ruleSpdxLicense : ( ( rule__SpdxLicense__Group__0 ) ) ;
    public final void ruleSpdxLicense() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:199:2: ( ( ( rule__SpdxLicense__Group__0 ) ) )
            // InternalDomainModelsDatasheet.g:200:2: ( ( rule__SpdxLicense__Group__0 ) )
            {
            // InternalDomainModelsDatasheet.g:200:2: ( ( rule__SpdxLicense__Group__0 ) )
            // InternalDomainModelsDatasheet.g:201:3: ( rule__SpdxLicense__Group__0 )
            {
             before(grammarAccess.getSpdxLicenseAccess().getGroup()); 
            // InternalDomainModelsDatasheet.g:202:3: ( rule__SpdxLicense__Group__0 )
            // InternalDomainModelsDatasheet.g:202:4: rule__SpdxLicense__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpdxLicense__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpdxLicenseAccess().getGroup()); 

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
    // $ANTLR end "ruleSpdxLicense"


    // $ANTLR start "entryRuleProprietaryLicense"
    // InternalDomainModelsDatasheet.g:211:1: entryRuleProprietaryLicense : ruleProprietaryLicense EOF ;
    public final void entryRuleProprietaryLicense() throws RecognitionException {
        try {
            // InternalDomainModelsDatasheet.g:212:1: ( ruleProprietaryLicense EOF )
            // InternalDomainModelsDatasheet.g:213:1: ruleProprietaryLicense EOF
            {
             before(grammarAccess.getProprietaryLicenseRule()); 
            pushFollow(FOLLOW_1);
            ruleProprietaryLicense();

            state._fsp--;

             after(grammarAccess.getProprietaryLicenseRule()); 
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
    // $ANTLR end "entryRuleProprietaryLicense"


    // $ANTLR start "ruleProprietaryLicense"
    // InternalDomainModelsDatasheet.g:220:1: ruleProprietaryLicense : ( ( rule__ProprietaryLicense__Group__0 ) ) ;
    public final void ruleProprietaryLicense() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:224:2: ( ( ( rule__ProprietaryLicense__Group__0 ) ) )
            // InternalDomainModelsDatasheet.g:225:2: ( ( rule__ProprietaryLicense__Group__0 ) )
            {
            // InternalDomainModelsDatasheet.g:225:2: ( ( rule__ProprietaryLicense__Group__0 ) )
            // InternalDomainModelsDatasheet.g:226:3: ( rule__ProprietaryLicense__Group__0 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getGroup()); 
            // InternalDomainModelsDatasheet.g:227:3: ( rule__ProprietaryLicense__Group__0 )
            // InternalDomainModelsDatasheet.g:227:4: rule__ProprietaryLicense__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProprietaryLicenseAccess().getGroup()); 

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
    // $ANTLR end "ruleProprietaryLicense"


    // $ANTLR start "ruleTRL"
    // InternalDomainModelsDatasheet.g:236:1: ruleTRL : ( ( rule__TRL__Alternatives ) ) ;
    public final void ruleTRL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:240:1: ( ( ( rule__TRL__Alternatives ) ) )
            // InternalDomainModelsDatasheet.g:241:2: ( ( rule__TRL__Alternatives ) )
            {
            // InternalDomainModelsDatasheet.g:241:2: ( ( rule__TRL__Alternatives ) )
            // InternalDomainModelsDatasheet.g:242:3: ( rule__TRL__Alternatives )
            {
             before(grammarAccess.getTRLAccess().getAlternatives()); 
            // InternalDomainModelsDatasheet.g:243:3: ( rule__TRL__Alternatives )
            // InternalDomainModelsDatasheet.g:243:4: rule__TRL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TRL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTRLAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTRL"


    // $ANTLR start "rule__AbstractLicense__Alternatives"
    // InternalDomainModelsDatasheet.g:251:1: rule__AbstractLicense__Alternatives : ( ( ruleSpdxLicense ) | ( ruleProprietaryLicense ) );
    public final void rule__AbstractLicense__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:255:1: ( ( ruleSpdxLicense ) | ( ruleProprietaryLicense ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==33) ) {
                alt1=1;
            }
            else if ( (LA1_0==36) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:256:2: ( ruleSpdxLicense )
                    {
                    // InternalDomainModelsDatasheet.g:256:2: ( ruleSpdxLicense )
                    // InternalDomainModelsDatasheet.g:257:3: ruleSpdxLicense
                    {
                     before(grammarAccess.getAbstractLicenseAccess().getSpdxLicenseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSpdxLicense();

                    state._fsp--;

                     after(grammarAccess.getAbstractLicenseAccess().getSpdxLicenseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModelsDatasheet.g:262:2: ( ruleProprietaryLicense )
                    {
                    // InternalDomainModelsDatasheet.g:262:2: ( ruleProprietaryLicense )
                    // InternalDomainModelsDatasheet.g:263:3: ruleProprietaryLicense
                    {
                     before(grammarAccess.getAbstractLicenseAccess().getProprietaryLicenseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProprietaryLicense();

                    state._fsp--;

                     after(grammarAccess.getAbstractLicenseAccess().getProprietaryLicenseParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractLicense__Alternatives"


    // $ANTLR start "rule__TRL__Alternatives"
    // InternalDomainModelsDatasheet.g:272:1: rule__TRL__Alternatives : ( ( ( 'Level1' ) ) | ( ( 'Level2' ) ) | ( ( 'Level3' ) ) | ( ( 'Level4' ) ) | ( ( 'Level5' ) ) | ( ( 'Level6' ) ) | ( ( 'Level7' ) ) | ( ( 'Level8' ) ) | ( ( 'Level9' ) ) | ( ( 'Undefined' ) ) );
    public final void rule__TRL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:276:1: ( ( ( 'Level1' ) ) | ( ( 'Level2' ) ) | ( ( 'Level3' ) ) | ( ( 'Level4' ) ) | ( ( 'Level5' ) ) | ( ( 'Level6' ) ) | ( ( 'Level7' ) ) | ( ( 'Level8' ) ) | ( ( 'Level9' ) ) | ( ( 'Undefined' ) ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            case 19:
                {
                alt2=8;
                }
                break;
            case 20:
                {
                alt2=9;
                }
                break;
            case 21:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:277:2: ( ( 'Level1' ) )
                    {
                    // InternalDomainModelsDatasheet.g:277:2: ( ( 'Level1' ) )
                    // InternalDomainModelsDatasheet.g:278:3: ( 'Level1' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0()); 
                    // InternalDomainModelsDatasheet.g:279:3: ( 'Level1' )
                    // InternalDomainModelsDatasheet.g:279:4: 'Level1'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModelsDatasheet.g:283:2: ( ( 'Level2' ) )
                    {
                    // InternalDomainModelsDatasheet.g:283:2: ( ( 'Level2' ) )
                    // InternalDomainModelsDatasheet.g:284:3: ( 'Level2' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1()); 
                    // InternalDomainModelsDatasheet.g:285:3: ( 'Level2' )
                    // InternalDomainModelsDatasheet.g:285:4: 'Level2'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainModelsDatasheet.g:289:2: ( ( 'Level3' ) )
                    {
                    // InternalDomainModelsDatasheet.g:289:2: ( ( 'Level3' ) )
                    // InternalDomainModelsDatasheet.g:290:3: ( 'Level3' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2()); 
                    // InternalDomainModelsDatasheet.g:291:3: ( 'Level3' )
                    // InternalDomainModelsDatasheet.g:291:4: 'Level3'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainModelsDatasheet.g:295:2: ( ( 'Level4' ) )
                    {
                    // InternalDomainModelsDatasheet.g:295:2: ( ( 'Level4' ) )
                    // InternalDomainModelsDatasheet.g:296:3: ( 'Level4' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3()); 
                    // InternalDomainModelsDatasheet.g:297:3: ( 'Level4' )
                    // InternalDomainModelsDatasheet.g:297:4: 'Level4'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDomainModelsDatasheet.g:301:2: ( ( 'Level5' ) )
                    {
                    // InternalDomainModelsDatasheet.g:301:2: ( ( 'Level5' ) )
                    // InternalDomainModelsDatasheet.g:302:3: ( 'Level5' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4()); 
                    // InternalDomainModelsDatasheet.g:303:3: ( 'Level5' )
                    // InternalDomainModelsDatasheet.g:303:4: 'Level5'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDomainModelsDatasheet.g:307:2: ( ( 'Level6' ) )
                    {
                    // InternalDomainModelsDatasheet.g:307:2: ( ( 'Level6' ) )
                    // InternalDomainModelsDatasheet.g:308:3: ( 'Level6' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5()); 
                    // InternalDomainModelsDatasheet.g:309:3: ( 'Level6' )
                    // InternalDomainModelsDatasheet.g:309:4: 'Level6'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDomainModelsDatasheet.g:313:2: ( ( 'Level7' ) )
                    {
                    // InternalDomainModelsDatasheet.g:313:2: ( ( 'Level7' ) )
                    // InternalDomainModelsDatasheet.g:314:3: ( 'Level7' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6()); 
                    // InternalDomainModelsDatasheet.g:315:3: ( 'Level7' )
                    // InternalDomainModelsDatasheet.g:315:4: 'Level7'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDomainModelsDatasheet.g:319:2: ( ( 'Level8' ) )
                    {
                    // InternalDomainModelsDatasheet.g:319:2: ( ( 'Level8' ) )
                    // InternalDomainModelsDatasheet.g:320:3: ( 'Level8' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7()); 
                    // InternalDomainModelsDatasheet.g:321:3: ( 'Level8' )
                    // InternalDomainModelsDatasheet.g:321:4: 'Level8'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDomainModelsDatasheet.g:325:2: ( ( 'Level9' ) )
                    {
                    // InternalDomainModelsDatasheet.g:325:2: ( ( 'Level9' ) )
                    // InternalDomainModelsDatasheet.g:326:3: ( 'Level9' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8()); 
                    // InternalDomainModelsDatasheet.g:327:3: ( 'Level9' )
                    // InternalDomainModelsDatasheet.g:327:4: 'Level9'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDomainModelsDatasheet.g:331:2: ( ( 'Undefined' ) )
                    {
                    // InternalDomainModelsDatasheet.g:331:2: ( ( 'Undefined' ) )
                    // InternalDomainModelsDatasheet.g:332:3: ( 'Undefined' )
                    {
                     before(grammarAccess.getTRLAccess().getUNDEFINEDEnumLiteralDeclaration_9()); 
                    // InternalDomainModelsDatasheet.g:333:3: ( 'Undefined' )
                    // InternalDomainModelsDatasheet.g:333:4: 'Undefined'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getUNDEFINEDEnumLiteralDeclaration_9()); 

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
    // $ANTLR end "rule__TRL__Alternatives"


    // $ANTLR start "rule__DomainModelsDatasheet__Group__0"
    // InternalDomainModelsDatasheet.g:341:1: rule__DomainModelsDatasheet__Group__0 : rule__DomainModelsDatasheet__Group__0__Impl rule__DomainModelsDatasheet__Group__1 ;
    public final void rule__DomainModelsDatasheet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:345:1: ( rule__DomainModelsDatasheet__Group__0__Impl rule__DomainModelsDatasheet__Group__1 )
            // InternalDomainModelsDatasheet.g:346:2: rule__DomainModelsDatasheet__Group__0__Impl rule__DomainModelsDatasheet__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalDomainModelsDatasheet.g:353:1: rule__DomainModelsDatasheet__Group__0__Impl : ( 'DomainModelsDatasheet' ) ;
    public final void rule__DomainModelsDatasheet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:357:1: ( ( 'DomainModelsDatasheet' ) )
            // InternalDomainModelsDatasheet.g:358:1: ( 'DomainModelsDatasheet' )
            {
            // InternalDomainModelsDatasheet.g:358:1: ( 'DomainModelsDatasheet' )
            // InternalDomainModelsDatasheet.g:359:2: 'DomainModelsDatasheet'
            {
             before(grammarAccess.getDomainModelsDatasheetAccess().getDomainModelsDatasheetKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDomainModelsDatasheet.g:368:1: rule__DomainModelsDatasheet__Group__1 : rule__DomainModelsDatasheet__Group__1__Impl rule__DomainModelsDatasheet__Group__2 ;
    public final void rule__DomainModelsDatasheet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:372:1: ( rule__DomainModelsDatasheet__Group__1__Impl rule__DomainModelsDatasheet__Group__2 )
            // InternalDomainModelsDatasheet.g:373:2: rule__DomainModelsDatasheet__Group__1__Impl rule__DomainModelsDatasheet__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDomainModelsDatasheet.g:380:1: rule__DomainModelsDatasheet__Group__1__Impl : ( ( rule__DomainModelsDatasheet__NameAssignment_1 ) ) ;
    public final void rule__DomainModelsDatasheet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:384:1: ( ( ( rule__DomainModelsDatasheet__NameAssignment_1 ) ) )
            // InternalDomainModelsDatasheet.g:385:1: ( ( rule__DomainModelsDatasheet__NameAssignment_1 ) )
            {
            // InternalDomainModelsDatasheet.g:385:1: ( ( rule__DomainModelsDatasheet__NameAssignment_1 ) )
            // InternalDomainModelsDatasheet.g:386:2: ( rule__DomainModelsDatasheet__NameAssignment_1 )
            {
             before(grammarAccess.getDomainModelsDatasheetAccess().getNameAssignment_1()); 
            // InternalDomainModelsDatasheet.g:387:2: ( rule__DomainModelsDatasheet__NameAssignment_1 )
            // InternalDomainModelsDatasheet.g:387:3: rule__DomainModelsDatasheet__NameAssignment_1
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
    // InternalDomainModelsDatasheet.g:395:1: rule__DomainModelsDatasheet__Group__2 : rule__DomainModelsDatasheet__Group__2__Impl rule__DomainModelsDatasheet__Group__3 ;
    public final void rule__DomainModelsDatasheet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:399:1: ( rule__DomainModelsDatasheet__Group__2__Impl rule__DomainModelsDatasheet__Group__3 )
            // InternalDomainModelsDatasheet.g:400:2: rule__DomainModelsDatasheet__Group__2__Impl rule__DomainModelsDatasheet__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalDomainModelsDatasheet.g:407:1: rule__DomainModelsDatasheet__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainModelsDatasheet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:411:1: ( ( '{' ) )
            // InternalDomainModelsDatasheet.g:412:1: ( '{' )
            {
            // InternalDomainModelsDatasheet.g:412:1: ( '{' )
            // InternalDomainModelsDatasheet.g:413:2: '{'
            {
             before(grammarAccess.getDomainModelsDatasheetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDomainModelsDatasheet.g:422:1: rule__DomainModelsDatasheet__Group__3 : rule__DomainModelsDatasheet__Group__3__Impl rule__DomainModelsDatasheet__Group__4 ;
    public final void rule__DomainModelsDatasheet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:426:1: ( rule__DomainModelsDatasheet__Group__3__Impl rule__DomainModelsDatasheet__Group__4 )
            // InternalDomainModelsDatasheet.g:427:2: rule__DomainModelsDatasheet__Group__3__Impl rule__DomainModelsDatasheet__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalDomainModelsDatasheet.g:434:1: rule__DomainModelsDatasheet__Group__3__Impl : ( ruleGenericDatasheet ) ;
    public final void rule__DomainModelsDatasheet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:438:1: ( ( ruleGenericDatasheet ) )
            // InternalDomainModelsDatasheet.g:439:1: ( ruleGenericDatasheet )
            {
            // InternalDomainModelsDatasheet.g:439:1: ( ruleGenericDatasheet )
            // InternalDomainModelsDatasheet.g:440:2: ruleGenericDatasheet
            {
             before(grammarAccess.getDomainModelsDatasheetAccess().getGenericDatasheetParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleGenericDatasheet();

            state._fsp--;

             after(grammarAccess.getDomainModelsDatasheetAccess().getGenericDatasheetParserRuleCall_3()); 

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
    // InternalDomainModelsDatasheet.g:449:1: rule__DomainModelsDatasheet__Group__4 : rule__DomainModelsDatasheet__Group__4__Impl ;
    public final void rule__DomainModelsDatasheet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:453:1: ( rule__DomainModelsDatasheet__Group__4__Impl )
            // InternalDomainModelsDatasheet.g:454:2: rule__DomainModelsDatasheet__Group__4__Impl
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
    // InternalDomainModelsDatasheet.g:460:1: rule__DomainModelsDatasheet__Group__4__Impl : ( '}' ) ;
    public final void rule__DomainModelsDatasheet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:464:1: ( ( '}' ) )
            // InternalDomainModelsDatasheet.g:465:1: ( '}' )
            {
            // InternalDomainModelsDatasheet.g:465:1: ( '}' )
            // InternalDomainModelsDatasheet.g:466:2: '}'
            {
             before(grammarAccess.getDomainModelsDatasheetAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__GenericDatasheet__Group_0__0"
    // InternalDomainModelsDatasheet.g:476:1: rule__GenericDatasheet__Group_0__0 : rule__GenericDatasheet__Group_0__0__Impl rule__GenericDatasheet__Group_0__1 ;
    public final void rule__GenericDatasheet__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:480:1: ( rule__GenericDatasheet__Group_0__0__Impl rule__GenericDatasheet__Group_0__1 )
            // InternalDomainModelsDatasheet.g:481:2: rule__GenericDatasheet__Group_0__0__Impl rule__GenericDatasheet__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__GenericDatasheet__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_0__1();

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
    // $ANTLR end "rule__GenericDatasheet__Group_0__0"


    // $ANTLR start "rule__GenericDatasheet__Group_0__0__Impl"
    // InternalDomainModelsDatasheet.g:488:1: rule__GenericDatasheet__Group_0__0__Impl : ( 'baseURI' ) ;
    public final void rule__GenericDatasheet__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:492:1: ( ( 'baseURI' ) )
            // InternalDomainModelsDatasheet.g:493:1: ( 'baseURI' )
            {
            // InternalDomainModelsDatasheet.g:493:1: ( 'baseURI' )
            // InternalDomainModelsDatasheet.g:494:2: 'baseURI'
            {
             before(grammarAccess.getGenericDatasheetAccess().getBaseURIKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGenericDatasheetAccess().getBaseURIKeyword_0_0()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_0__0__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_0__1"
    // InternalDomainModelsDatasheet.g:503:1: rule__GenericDatasheet__Group_0__1 : rule__GenericDatasheet__Group_0__1__Impl rule__GenericDatasheet__Group_0__2 ;
    public final void rule__GenericDatasheet__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:507:1: ( rule__GenericDatasheet__Group_0__1__Impl rule__GenericDatasheet__Group_0__2 )
            // InternalDomainModelsDatasheet.g:508:2: rule__GenericDatasheet__Group_0__1__Impl rule__GenericDatasheet__Group_0__2
            {
            pushFollow(FOLLOW_7);
            rule__GenericDatasheet__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_0__2();

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
    // $ANTLR end "rule__GenericDatasheet__Group_0__1"


    // $ANTLR start "rule__GenericDatasheet__Group_0__1__Impl"
    // InternalDomainModelsDatasheet.g:515:1: rule__GenericDatasheet__Group_0__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:519:1: ( ( ( ':' )? ) )
            // InternalDomainModelsDatasheet.g:520:1: ( ( ':' )? )
            {
            // InternalDomainModelsDatasheet.g:520:1: ( ( ':' )? )
            // InternalDomainModelsDatasheet.g:521:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_0_1()); 
            // InternalDomainModelsDatasheet.g:522:2: ( ':' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:522:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGenericDatasheetAccess().getColonKeyword_0_1()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_0__1__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_0__2"
    // InternalDomainModelsDatasheet.g:530:1: rule__GenericDatasheet__Group_0__2 : rule__GenericDatasheet__Group_0__2__Impl ;
    public final void rule__GenericDatasheet__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:534:1: ( rule__GenericDatasheet__Group_0__2__Impl )
            // InternalDomainModelsDatasheet.g:535:2: rule__GenericDatasheet__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_0__2__Impl();

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
    // $ANTLR end "rule__GenericDatasheet__Group_0__2"


    // $ANTLR start "rule__GenericDatasheet__Group_0__2__Impl"
    // InternalDomainModelsDatasheet.g:541:1: rule__GenericDatasheet__Group_0__2__Impl : ( ( rule__GenericDatasheet__BaseURIAssignment_0_2 ) ) ;
    public final void rule__GenericDatasheet__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:545:1: ( ( ( rule__GenericDatasheet__BaseURIAssignment_0_2 ) ) )
            // InternalDomainModelsDatasheet.g:546:1: ( ( rule__GenericDatasheet__BaseURIAssignment_0_2 ) )
            {
            // InternalDomainModelsDatasheet.g:546:1: ( ( rule__GenericDatasheet__BaseURIAssignment_0_2 ) )
            // InternalDomainModelsDatasheet.g:547:2: ( rule__GenericDatasheet__BaseURIAssignment_0_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getBaseURIAssignment_0_2()); 
            // InternalDomainModelsDatasheet.g:548:2: ( rule__GenericDatasheet__BaseURIAssignment_0_2 )
            // InternalDomainModelsDatasheet.g:548:3: rule__GenericDatasheet__BaseURIAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__BaseURIAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getGenericDatasheetAccess().getBaseURIAssignment_0_2()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_0__2__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_1__0"
    // InternalDomainModelsDatasheet.g:557:1: rule__GenericDatasheet__Group_1__0 : rule__GenericDatasheet__Group_1__0__Impl rule__GenericDatasheet__Group_1__1 ;
    public final void rule__GenericDatasheet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:561:1: ( rule__GenericDatasheet__Group_1__0__Impl rule__GenericDatasheet__Group_1__1 )
            // InternalDomainModelsDatasheet.g:562:2: rule__GenericDatasheet__Group_1__0__Impl rule__GenericDatasheet__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__GenericDatasheet__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_1__1();

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
    // $ANTLR end "rule__GenericDatasheet__Group_1__0"


    // $ANTLR start "rule__GenericDatasheet__Group_1__0__Impl"
    // InternalDomainModelsDatasheet.g:569:1: rule__GenericDatasheet__Group_1__0__Impl : ( 'shortDescription' ) ;
    public final void rule__GenericDatasheet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:573:1: ( ( 'shortDescription' ) )
            // InternalDomainModelsDatasheet.g:574:1: ( 'shortDescription' )
            {
            // InternalDomainModelsDatasheet.g:574:1: ( 'shortDescription' )
            // InternalDomainModelsDatasheet.g:575:2: 'shortDescription'
            {
             before(grammarAccess.getGenericDatasheetAccess().getShortDescriptionKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGenericDatasheetAccess().getShortDescriptionKeyword_1_0()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_1__0__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_1__1"
    // InternalDomainModelsDatasheet.g:584:1: rule__GenericDatasheet__Group_1__1 : rule__GenericDatasheet__Group_1__1__Impl rule__GenericDatasheet__Group_1__2 ;
    public final void rule__GenericDatasheet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:588:1: ( rule__GenericDatasheet__Group_1__1__Impl rule__GenericDatasheet__Group_1__2 )
            // InternalDomainModelsDatasheet.g:589:2: rule__GenericDatasheet__Group_1__1__Impl rule__GenericDatasheet__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__GenericDatasheet__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_1__2();

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
    // $ANTLR end "rule__GenericDatasheet__Group_1__1"


    // $ANTLR start "rule__GenericDatasheet__Group_1__1__Impl"
    // InternalDomainModelsDatasheet.g:596:1: rule__GenericDatasheet__Group_1__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:600:1: ( ( ( ':' )? ) )
            // InternalDomainModelsDatasheet.g:601:1: ( ( ':' )? )
            {
            // InternalDomainModelsDatasheet.g:601:1: ( ( ':' )? )
            // InternalDomainModelsDatasheet.g:602:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_1_1()); 
            // InternalDomainModelsDatasheet.g:603:2: ( ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:603:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGenericDatasheetAccess().getColonKeyword_1_1()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_1__1__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_1__2"
    // InternalDomainModelsDatasheet.g:611:1: rule__GenericDatasheet__Group_1__2 : rule__GenericDatasheet__Group_1__2__Impl ;
    public final void rule__GenericDatasheet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:615:1: ( rule__GenericDatasheet__Group_1__2__Impl )
            // InternalDomainModelsDatasheet.g:616:2: rule__GenericDatasheet__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_1__2__Impl();

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
    // $ANTLR end "rule__GenericDatasheet__Group_1__2"


    // $ANTLR start "rule__GenericDatasheet__Group_1__2__Impl"
    // InternalDomainModelsDatasheet.g:622:1: rule__GenericDatasheet__Group_1__2__Impl : ( ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 ) ) ;
    public final void rule__GenericDatasheet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:626:1: ( ( ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 ) ) )
            // InternalDomainModelsDatasheet.g:627:1: ( ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 ) )
            {
            // InternalDomainModelsDatasheet.g:627:1: ( ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 ) )
            // InternalDomainModelsDatasheet.g:628:2: ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getShortDescriptionAssignment_1_2()); 
            // InternalDomainModelsDatasheet.g:629:2: ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 )
            // InternalDomainModelsDatasheet.g:629:3: rule__GenericDatasheet__ShortDescriptionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__ShortDescriptionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getGenericDatasheetAccess().getShortDescriptionAssignment_1_2()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_1__2__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_2__0"
    // InternalDomainModelsDatasheet.g:638:1: rule__GenericDatasheet__Group_2__0 : rule__GenericDatasheet__Group_2__0__Impl rule__GenericDatasheet__Group_2__1 ;
    public final void rule__GenericDatasheet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:642:1: ( rule__GenericDatasheet__Group_2__0__Impl rule__GenericDatasheet__Group_2__1 )
            // InternalDomainModelsDatasheet.g:643:2: rule__GenericDatasheet__Group_2__0__Impl rule__GenericDatasheet__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__GenericDatasheet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_2__1();

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
    // $ANTLR end "rule__GenericDatasheet__Group_2__0"


    // $ANTLR start "rule__GenericDatasheet__Group_2__0__Impl"
    // InternalDomainModelsDatasheet.g:650:1: rule__GenericDatasheet__Group_2__0__Impl : ( 'longDescription' ) ;
    public final void rule__GenericDatasheet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:654:1: ( ( 'longDescription' ) )
            // InternalDomainModelsDatasheet.g:655:1: ( 'longDescription' )
            {
            // InternalDomainModelsDatasheet.g:655:1: ( 'longDescription' )
            // InternalDomainModelsDatasheet.g:656:2: 'longDescription'
            {
             before(grammarAccess.getGenericDatasheetAccess().getLongDescriptionKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGenericDatasheetAccess().getLongDescriptionKeyword_2_0()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_2__0__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_2__1"
    // InternalDomainModelsDatasheet.g:665:1: rule__GenericDatasheet__Group_2__1 : rule__GenericDatasheet__Group_2__1__Impl rule__GenericDatasheet__Group_2__2 ;
    public final void rule__GenericDatasheet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:669:1: ( rule__GenericDatasheet__Group_2__1__Impl rule__GenericDatasheet__Group_2__2 )
            // InternalDomainModelsDatasheet.g:670:2: rule__GenericDatasheet__Group_2__1__Impl rule__GenericDatasheet__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__GenericDatasheet__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_2__2();

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
    // $ANTLR end "rule__GenericDatasheet__Group_2__1"


    // $ANTLR start "rule__GenericDatasheet__Group_2__1__Impl"
    // InternalDomainModelsDatasheet.g:677:1: rule__GenericDatasheet__Group_2__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:681:1: ( ( ( ':' )? ) )
            // InternalDomainModelsDatasheet.g:682:1: ( ( ':' )? )
            {
            // InternalDomainModelsDatasheet.g:682:1: ( ( ':' )? )
            // InternalDomainModelsDatasheet.g:683:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_2_1()); 
            // InternalDomainModelsDatasheet.g:684:2: ( ':' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:684:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGenericDatasheetAccess().getColonKeyword_2_1()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_2__1__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_2__2"
    // InternalDomainModelsDatasheet.g:692:1: rule__GenericDatasheet__Group_2__2 : rule__GenericDatasheet__Group_2__2__Impl ;
    public final void rule__GenericDatasheet__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:696:1: ( rule__GenericDatasheet__Group_2__2__Impl )
            // InternalDomainModelsDatasheet.g:697:2: rule__GenericDatasheet__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_2__2__Impl();

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
    // $ANTLR end "rule__GenericDatasheet__Group_2__2"


    // $ANTLR start "rule__GenericDatasheet__Group_2__2__Impl"
    // InternalDomainModelsDatasheet.g:703:1: rule__GenericDatasheet__Group_2__2__Impl : ( ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 ) ) ;
    public final void rule__GenericDatasheet__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:707:1: ( ( ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 ) ) )
            // InternalDomainModelsDatasheet.g:708:1: ( ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 ) )
            {
            // InternalDomainModelsDatasheet.g:708:1: ( ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 ) )
            // InternalDomainModelsDatasheet.g:709:2: ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getLongDescriptionAssignment_2_2()); 
            // InternalDomainModelsDatasheet.g:710:2: ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 )
            // InternalDomainModelsDatasheet.g:710:3: rule__GenericDatasheet__LongDescriptionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__LongDescriptionAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getGenericDatasheetAccess().getLongDescriptionAssignment_2_2()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_2__2__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_3__0"
    // InternalDomainModelsDatasheet.g:719:1: rule__GenericDatasheet__Group_3__0 : rule__GenericDatasheet__Group_3__0__Impl rule__GenericDatasheet__Group_3__1 ;
    public final void rule__GenericDatasheet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:723:1: ( rule__GenericDatasheet__Group_3__0__Impl rule__GenericDatasheet__Group_3__1 )
            // InternalDomainModelsDatasheet.g:724:2: rule__GenericDatasheet__Group_3__0__Impl rule__GenericDatasheet__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__GenericDatasheet__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_3__1();

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
    // $ANTLR end "rule__GenericDatasheet__Group_3__0"


    // $ANTLR start "rule__GenericDatasheet__Group_3__0__Impl"
    // InternalDomainModelsDatasheet.g:731:1: rule__GenericDatasheet__Group_3__0__Impl : ( 'supplierDescription' ) ;
    public final void rule__GenericDatasheet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:735:1: ( ( 'supplierDescription' ) )
            // InternalDomainModelsDatasheet.g:736:1: ( 'supplierDescription' )
            {
            // InternalDomainModelsDatasheet.g:736:1: ( 'supplierDescription' )
            // InternalDomainModelsDatasheet.g:737:2: 'supplierDescription'
            {
             before(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionKeyword_3_0()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_3__0__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_3__1"
    // InternalDomainModelsDatasheet.g:746:1: rule__GenericDatasheet__Group_3__1 : rule__GenericDatasheet__Group_3__1__Impl rule__GenericDatasheet__Group_3__2 ;
    public final void rule__GenericDatasheet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:750:1: ( rule__GenericDatasheet__Group_3__1__Impl rule__GenericDatasheet__Group_3__2 )
            // InternalDomainModelsDatasheet.g:751:2: rule__GenericDatasheet__Group_3__1__Impl rule__GenericDatasheet__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__GenericDatasheet__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_3__2();

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
    // $ANTLR end "rule__GenericDatasheet__Group_3__1"


    // $ANTLR start "rule__GenericDatasheet__Group_3__1__Impl"
    // InternalDomainModelsDatasheet.g:758:1: rule__GenericDatasheet__Group_3__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:762:1: ( ( ( ':' )? ) )
            // InternalDomainModelsDatasheet.g:763:1: ( ( ':' )? )
            {
            // InternalDomainModelsDatasheet.g:763:1: ( ( ':' )? )
            // InternalDomainModelsDatasheet.g:764:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_3_1()); 
            // InternalDomainModelsDatasheet.g:765:2: ( ':' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:765:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGenericDatasheetAccess().getColonKeyword_3_1()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_3__1__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_3__2"
    // InternalDomainModelsDatasheet.g:773:1: rule__GenericDatasheet__Group_3__2 : rule__GenericDatasheet__Group_3__2__Impl ;
    public final void rule__GenericDatasheet__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:777:1: ( rule__GenericDatasheet__Group_3__2__Impl )
            // InternalDomainModelsDatasheet.g:778:2: rule__GenericDatasheet__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_3__2__Impl();

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
    // $ANTLR end "rule__GenericDatasheet__Group_3__2"


    // $ANTLR start "rule__GenericDatasheet__Group_3__2__Impl"
    // InternalDomainModelsDatasheet.g:784:1: rule__GenericDatasheet__Group_3__2__Impl : ( ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 ) ) ;
    public final void rule__GenericDatasheet__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:788:1: ( ( ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 ) ) )
            // InternalDomainModelsDatasheet.g:789:1: ( ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 ) )
            {
            // InternalDomainModelsDatasheet.g:789:1: ( ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 ) )
            // InternalDomainModelsDatasheet.g:790:2: ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionAssignment_3_2()); 
            // InternalDomainModelsDatasheet.g:791:2: ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 )
            // InternalDomainModelsDatasheet.g:791:3: rule__GenericDatasheet__SupplierDescriptionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__SupplierDescriptionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionAssignment_3_2()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_3__2__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_4__0"
    // InternalDomainModelsDatasheet.g:800:1: rule__GenericDatasheet__Group_4__0 : rule__GenericDatasheet__Group_4__0__Impl rule__GenericDatasheet__Group_4__1 ;
    public final void rule__GenericDatasheet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:804:1: ( rule__GenericDatasheet__Group_4__0__Impl rule__GenericDatasheet__Group_4__1 )
            // InternalDomainModelsDatasheet.g:805:2: rule__GenericDatasheet__Group_4__0__Impl rule__GenericDatasheet__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__GenericDatasheet__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_4__1();

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
    // $ANTLR end "rule__GenericDatasheet__Group_4__0"


    // $ANTLR start "rule__GenericDatasheet__Group_4__0__Impl"
    // InternalDomainModelsDatasheet.g:812:1: rule__GenericDatasheet__Group_4__0__Impl : ( 'homepage' ) ;
    public final void rule__GenericDatasheet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:816:1: ( ( 'homepage' ) )
            // InternalDomainModelsDatasheet.g:817:1: ( 'homepage' )
            {
            // InternalDomainModelsDatasheet.g:817:1: ( 'homepage' )
            // InternalDomainModelsDatasheet.g:818:2: 'homepage'
            {
             before(grammarAccess.getGenericDatasheetAccess().getHomepageKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGenericDatasheetAccess().getHomepageKeyword_4_0()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_4__0__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_4__1"
    // InternalDomainModelsDatasheet.g:827:1: rule__GenericDatasheet__Group_4__1 : rule__GenericDatasheet__Group_4__1__Impl rule__GenericDatasheet__Group_4__2 ;
    public final void rule__GenericDatasheet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:831:1: ( rule__GenericDatasheet__Group_4__1__Impl rule__GenericDatasheet__Group_4__2 )
            // InternalDomainModelsDatasheet.g:832:2: rule__GenericDatasheet__Group_4__1__Impl rule__GenericDatasheet__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__GenericDatasheet__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_4__2();

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
    // $ANTLR end "rule__GenericDatasheet__Group_4__1"


    // $ANTLR start "rule__GenericDatasheet__Group_4__1__Impl"
    // InternalDomainModelsDatasheet.g:839:1: rule__GenericDatasheet__Group_4__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:843:1: ( ( ( ':' )? ) )
            // InternalDomainModelsDatasheet.g:844:1: ( ( ':' )? )
            {
            // InternalDomainModelsDatasheet.g:844:1: ( ( ':' )? )
            // InternalDomainModelsDatasheet.g:845:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_4_1()); 
            // InternalDomainModelsDatasheet.g:846:2: ( ':' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:846:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGenericDatasheetAccess().getColonKeyword_4_1()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_4__1__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_4__2"
    // InternalDomainModelsDatasheet.g:854:1: rule__GenericDatasheet__Group_4__2 : rule__GenericDatasheet__Group_4__2__Impl ;
    public final void rule__GenericDatasheet__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:858:1: ( rule__GenericDatasheet__Group_4__2__Impl )
            // InternalDomainModelsDatasheet.g:859:2: rule__GenericDatasheet__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_4__2__Impl();

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
    // $ANTLR end "rule__GenericDatasheet__Group_4__2"


    // $ANTLR start "rule__GenericDatasheet__Group_4__2__Impl"
    // InternalDomainModelsDatasheet.g:865:1: rule__GenericDatasheet__Group_4__2__Impl : ( ( rule__GenericDatasheet__HomepageAssignment_4_2 ) ) ;
    public final void rule__GenericDatasheet__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:869:1: ( ( ( rule__GenericDatasheet__HomepageAssignment_4_2 ) ) )
            // InternalDomainModelsDatasheet.g:870:1: ( ( rule__GenericDatasheet__HomepageAssignment_4_2 ) )
            {
            // InternalDomainModelsDatasheet.g:870:1: ( ( rule__GenericDatasheet__HomepageAssignment_4_2 ) )
            // InternalDomainModelsDatasheet.g:871:2: ( rule__GenericDatasheet__HomepageAssignment_4_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getHomepageAssignment_4_2()); 
            // InternalDomainModelsDatasheet.g:872:2: ( rule__GenericDatasheet__HomepageAssignment_4_2 )
            // InternalDomainModelsDatasheet.g:872:3: rule__GenericDatasheet__HomepageAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__HomepageAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getGenericDatasheetAccess().getHomepageAssignment_4_2()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_4__2__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_5__0"
    // InternalDomainModelsDatasheet.g:881:1: rule__GenericDatasheet__Group_5__0 : rule__GenericDatasheet__Group_5__0__Impl rule__GenericDatasheet__Group_5__1 ;
    public final void rule__GenericDatasheet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:885:1: ( rule__GenericDatasheet__Group_5__0__Impl rule__GenericDatasheet__Group_5__1 )
            // InternalDomainModelsDatasheet.g:886:2: rule__GenericDatasheet__Group_5__0__Impl rule__GenericDatasheet__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__GenericDatasheet__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_5__1();

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
    // $ANTLR end "rule__GenericDatasheet__Group_5__0"


    // $ANTLR start "rule__GenericDatasheet__Group_5__0__Impl"
    // InternalDomainModelsDatasheet.g:893:1: rule__GenericDatasheet__Group_5__0__Impl : ( 'trl' ) ;
    public final void rule__GenericDatasheet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:897:1: ( ( 'trl' ) )
            // InternalDomainModelsDatasheet.g:898:1: ( 'trl' )
            {
            // InternalDomainModelsDatasheet.g:898:1: ( 'trl' )
            // InternalDomainModelsDatasheet.g:899:2: 'trl'
            {
             before(grammarAccess.getGenericDatasheetAccess().getTrlKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGenericDatasheetAccess().getTrlKeyword_5_0()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_5__0__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_5__1"
    // InternalDomainModelsDatasheet.g:908:1: rule__GenericDatasheet__Group_5__1 : rule__GenericDatasheet__Group_5__1__Impl rule__GenericDatasheet__Group_5__2 ;
    public final void rule__GenericDatasheet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:912:1: ( rule__GenericDatasheet__Group_5__1__Impl rule__GenericDatasheet__Group_5__2 )
            // InternalDomainModelsDatasheet.g:913:2: rule__GenericDatasheet__Group_5__1__Impl rule__GenericDatasheet__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__GenericDatasheet__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_5__2();

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
    // $ANTLR end "rule__GenericDatasheet__Group_5__1"


    // $ANTLR start "rule__GenericDatasheet__Group_5__1__Impl"
    // InternalDomainModelsDatasheet.g:920:1: rule__GenericDatasheet__Group_5__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:924:1: ( ( ( ':' )? ) )
            // InternalDomainModelsDatasheet.g:925:1: ( ( ':' )? )
            {
            // InternalDomainModelsDatasheet.g:925:1: ( ( ':' )? )
            // InternalDomainModelsDatasheet.g:926:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_5_1()); 
            // InternalDomainModelsDatasheet.g:927:2: ( ':' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:927:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGenericDatasheetAccess().getColonKeyword_5_1()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_5__1__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_5__2"
    // InternalDomainModelsDatasheet.g:935:1: rule__GenericDatasheet__Group_5__2 : rule__GenericDatasheet__Group_5__2__Impl ;
    public final void rule__GenericDatasheet__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:939:1: ( rule__GenericDatasheet__Group_5__2__Impl )
            // InternalDomainModelsDatasheet.g:940:2: rule__GenericDatasheet__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_5__2__Impl();

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
    // $ANTLR end "rule__GenericDatasheet__Group_5__2"


    // $ANTLR start "rule__GenericDatasheet__Group_5__2__Impl"
    // InternalDomainModelsDatasheet.g:946:1: rule__GenericDatasheet__Group_5__2__Impl : ( ( rule__GenericDatasheet__TrlAssignment_5_2 ) ) ;
    public final void rule__GenericDatasheet__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:950:1: ( ( ( rule__GenericDatasheet__TrlAssignment_5_2 ) ) )
            // InternalDomainModelsDatasheet.g:951:1: ( ( rule__GenericDatasheet__TrlAssignment_5_2 ) )
            {
            // InternalDomainModelsDatasheet.g:951:1: ( ( rule__GenericDatasheet__TrlAssignment_5_2 ) )
            // InternalDomainModelsDatasheet.g:952:2: ( rule__GenericDatasheet__TrlAssignment_5_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getTrlAssignment_5_2()); 
            // InternalDomainModelsDatasheet.g:953:2: ( rule__GenericDatasheet__TrlAssignment_5_2 )
            // InternalDomainModelsDatasheet.g:953:3: rule__GenericDatasheet__TrlAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__TrlAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getGenericDatasheetAccess().getTrlAssignment_5_2()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_5__2__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_6__0"
    // InternalDomainModelsDatasheet.g:962:1: rule__GenericDatasheet__Group_6__0 : rule__GenericDatasheet__Group_6__0__Impl rule__GenericDatasheet__Group_6__1 ;
    public final void rule__GenericDatasheet__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:966:1: ( rule__GenericDatasheet__Group_6__0__Impl rule__GenericDatasheet__Group_6__1 )
            // InternalDomainModelsDatasheet.g:967:2: rule__GenericDatasheet__Group_6__0__Impl rule__GenericDatasheet__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__GenericDatasheet__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_6__1();

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
    // $ANTLR end "rule__GenericDatasheet__Group_6__0"


    // $ANTLR start "rule__GenericDatasheet__Group_6__0__Impl"
    // InternalDomainModelsDatasheet.g:974:1: rule__GenericDatasheet__Group_6__0__Impl : ( 'license' ) ;
    public final void rule__GenericDatasheet__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:978:1: ( ( 'license' ) )
            // InternalDomainModelsDatasheet.g:979:1: ( 'license' )
            {
            // InternalDomainModelsDatasheet.g:979:1: ( 'license' )
            // InternalDomainModelsDatasheet.g:980:2: 'license'
            {
             before(grammarAccess.getGenericDatasheetAccess().getLicenseKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGenericDatasheetAccess().getLicenseKeyword_6_0()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_6__0__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_6__1"
    // InternalDomainModelsDatasheet.g:989:1: rule__GenericDatasheet__Group_6__1 : rule__GenericDatasheet__Group_6__1__Impl rule__GenericDatasheet__Group_6__2 ;
    public final void rule__GenericDatasheet__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:993:1: ( rule__GenericDatasheet__Group_6__1__Impl rule__GenericDatasheet__Group_6__2 )
            // InternalDomainModelsDatasheet.g:994:2: rule__GenericDatasheet__Group_6__1__Impl rule__GenericDatasheet__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__GenericDatasheet__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_6__2();

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
    // $ANTLR end "rule__GenericDatasheet__Group_6__1"


    // $ANTLR start "rule__GenericDatasheet__Group_6__1__Impl"
    // InternalDomainModelsDatasheet.g:1001:1: rule__GenericDatasheet__Group_6__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1005:1: ( ( ( ':' )? ) )
            // InternalDomainModelsDatasheet.g:1006:1: ( ( ':' )? )
            {
            // InternalDomainModelsDatasheet.g:1006:1: ( ( ':' )? )
            // InternalDomainModelsDatasheet.g:1007:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_6_1()); 
            // InternalDomainModelsDatasheet.g:1008:2: ( ':' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:1008:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGenericDatasheetAccess().getColonKeyword_6_1()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_6__1__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_6__2"
    // InternalDomainModelsDatasheet.g:1016:1: rule__GenericDatasheet__Group_6__2 : rule__GenericDatasheet__Group_6__2__Impl ;
    public final void rule__GenericDatasheet__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1020:1: ( rule__GenericDatasheet__Group_6__2__Impl )
            // InternalDomainModelsDatasheet.g:1021:2: rule__GenericDatasheet__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__Group_6__2__Impl();

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
    // $ANTLR end "rule__GenericDatasheet__Group_6__2"


    // $ANTLR start "rule__GenericDatasheet__Group_6__2__Impl"
    // InternalDomainModelsDatasheet.g:1027:1: rule__GenericDatasheet__Group_6__2__Impl : ( ( rule__GenericDatasheet__LicenseAssignment_6_2 ) ) ;
    public final void rule__GenericDatasheet__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1031:1: ( ( ( rule__GenericDatasheet__LicenseAssignment_6_2 ) ) )
            // InternalDomainModelsDatasheet.g:1032:1: ( ( rule__GenericDatasheet__LicenseAssignment_6_2 ) )
            {
            // InternalDomainModelsDatasheet.g:1032:1: ( ( rule__GenericDatasheet__LicenseAssignment_6_2 ) )
            // InternalDomainModelsDatasheet.g:1033:2: ( rule__GenericDatasheet__LicenseAssignment_6_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getLicenseAssignment_6_2()); 
            // InternalDomainModelsDatasheet.g:1034:2: ( rule__GenericDatasheet__LicenseAssignment_6_2 )
            // InternalDomainModelsDatasheet.g:1034:3: rule__GenericDatasheet__LicenseAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__LicenseAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getGenericDatasheetAccess().getLicenseAssignment_6_2()); 

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
    // $ANTLR end "rule__GenericDatasheet__Group_6__2__Impl"


    // $ANTLR start "rule__SpdxLicense__Group__0"
    // InternalDomainModelsDatasheet.g:1043:1: rule__SpdxLicense__Group__0 : rule__SpdxLicense__Group__0__Impl rule__SpdxLicense__Group__1 ;
    public final void rule__SpdxLicense__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1047:1: ( rule__SpdxLicense__Group__0__Impl rule__SpdxLicense__Group__1 )
            // InternalDomainModelsDatasheet.g:1048:2: rule__SpdxLicense__Group__0__Impl rule__SpdxLicense__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SpdxLicense__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpdxLicense__Group__1();

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
    // $ANTLR end "rule__SpdxLicense__Group__0"


    // $ANTLR start "rule__SpdxLicense__Group__0__Impl"
    // InternalDomainModelsDatasheet.g:1055:1: rule__SpdxLicense__Group__0__Impl : ( 'spdx' ) ;
    public final void rule__SpdxLicense__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1059:1: ( ( 'spdx' ) )
            // InternalDomainModelsDatasheet.g:1060:1: ( 'spdx' )
            {
            // InternalDomainModelsDatasheet.g:1060:1: ( 'spdx' )
            // InternalDomainModelsDatasheet.g:1061:2: 'spdx'
            {
             before(grammarAccess.getSpdxLicenseAccess().getSpdxKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSpdxLicenseAccess().getSpdxKeyword_0()); 

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
    // $ANTLR end "rule__SpdxLicense__Group__0__Impl"


    // $ANTLR start "rule__SpdxLicense__Group__1"
    // InternalDomainModelsDatasheet.g:1070:1: rule__SpdxLicense__Group__1 : rule__SpdxLicense__Group__1__Impl rule__SpdxLicense__Group__2 ;
    public final void rule__SpdxLicense__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1074:1: ( rule__SpdxLicense__Group__1__Impl rule__SpdxLicense__Group__2 )
            // InternalDomainModelsDatasheet.g:1075:2: rule__SpdxLicense__Group__1__Impl rule__SpdxLicense__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__SpdxLicense__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpdxLicense__Group__2();

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
    // $ANTLR end "rule__SpdxLicense__Group__1"


    // $ANTLR start "rule__SpdxLicense__Group__1__Impl"
    // InternalDomainModelsDatasheet.g:1082:1: rule__SpdxLicense__Group__1__Impl : ( '(' ) ;
    public final void rule__SpdxLicense__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1086:1: ( ( '(' ) )
            // InternalDomainModelsDatasheet.g:1087:1: ( '(' )
            {
            // InternalDomainModelsDatasheet.g:1087:1: ( '(' )
            // InternalDomainModelsDatasheet.g:1088:2: '('
            {
             before(grammarAccess.getSpdxLicenseAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSpdxLicenseAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__SpdxLicense__Group__1__Impl"


    // $ANTLR start "rule__SpdxLicense__Group__2"
    // InternalDomainModelsDatasheet.g:1097:1: rule__SpdxLicense__Group__2 : rule__SpdxLicense__Group__2__Impl rule__SpdxLicense__Group__3 ;
    public final void rule__SpdxLicense__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1101:1: ( rule__SpdxLicense__Group__2__Impl rule__SpdxLicense__Group__3 )
            // InternalDomainModelsDatasheet.g:1102:2: rule__SpdxLicense__Group__2__Impl rule__SpdxLicense__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SpdxLicense__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpdxLicense__Group__3();

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
    // $ANTLR end "rule__SpdxLicense__Group__2"


    // $ANTLR start "rule__SpdxLicense__Group__2__Impl"
    // InternalDomainModelsDatasheet.g:1109:1: rule__SpdxLicense__Group__2__Impl : ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) ) ;
    public final void rule__SpdxLicense__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1113:1: ( ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) ) )
            // InternalDomainModelsDatasheet.g:1114:1: ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) )
            {
            // InternalDomainModelsDatasheet.g:1114:1: ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) )
            // InternalDomainModelsDatasheet.g:1115:2: ( rule__SpdxLicense__LicenseIDAssignment_2 )
            {
             before(grammarAccess.getSpdxLicenseAccess().getLicenseIDAssignment_2()); 
            // InternalDomainModelsDatasheet.g:1116:2: ( rule__SpdxLicense__LicenseIDAssignment_2 )
            // InternalDomainModelsDatasheet.g:1116:3: rule__SpdxLicense__LicenseIDAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SpdxLicense__LicenseIDAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpdxLicenseAccess().getLicenseIDAssignment_2()); 

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
    // $ANTLR end "rule__SpdxLicense__Group__2__Impl"


    // $ANTLR start "rule__SpdxLicense__Group__3"
    // InternalDomainModelsDatasheet.g:1124:1: rule__SpdxLicense__Group__3 : rule__SpdxLicense__Group__3__Impl ;
    public final void rule__SpdxLicense__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1128:1: ( rule__SpdxLicense__Group__3__Impl )
            // InternalDomainModelsDatasheet.g:1129:2: rule__SpdxLicense__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpdxLicense__Group__3__Impl();

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
    // $ANTLR end "rule__SpdxLicense__Group__3"


    // $ANTLR start "rule__SpdxLicense__Group__3__Impl"
    // InternalDomainModelsDatasheet.g:1135:1: rule__SpdxLicense__Group__3__Impl : ( ')' ) ;
    public final void rule__SpdxLicense__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1139:1: ( ( ')' ) )
            // InternalDomainModelsDatasheet.g:1140:1: ( ')' )
            {
            // InternalDomainModelsDatasheet.g:1140:1: ( ')' )
            // InternalDomainModelsDatasheet.g:1141:2: ')'
            {
             before(grammarAccess.getSpdxLicenseAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSpdxLicenseAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__SpdxLicense__Group__3__Impl"


    // $ANTLR start "rule__ProprietaryLicense__Group__0"
    // InternalDomainModelsDatasheet.g:1151:1: rule__ProprietaryLicense__Group__0 : rule__ProprietaryLicense__Group__0__Impl rule__ProprietaryLicense__Group__1 ;
    public final void rule__ProprietaryLicense__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1155:1: ( rule__ProprietaryLicense__Group__0__Impl rule__ProprietaryLicense__Group__1 )
            // InternalDomainModelsDatasheet.g:1156:2: rule__ProprietaryLicense__Group__0__Impl rule__ProprietaryLicense__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ProprietaryLicense__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group__1();

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
    // $ANTLR end "rule__ProprietaryLicense__Group__0"


    // $ANTLR start "rule__ProprietaryLicense__Group__0__Impl"
    // InternalDomainModelsDatasheet.g:1163:1: rule__ProprietaryLicense__Group__0__Impl : ( () ) ;
    public final void rule__ProprietaryLicense__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1167:1: ( ( () ) )
            // InternalDomainModelsDatasheet.g:1168:1: ( () )
            {
            // InternalDomainModelsDatasheet.g:1168:1: ( () )
            // InternalDomainModelsDatasheet.g:1169:2: ()
            {
             before(grammarAccess.getProprietaryLicenseAccess().getProprietaryLicenseAction_0()); 
            // InternalDomainModelsDatasheet.g:1170:2: ()
            // InternalDomainModelsDatasheet.g:1170:3: 
            {
            }

             after(grammarAccess.getProprietaryLicenseAccess().getProprietaryLicenseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProprietaryLicense__Group__0__Impl"


    // $ANTLR start "rule__ProprietaryLicense__Group__1"
    // InternalDomainModelsDatasheet.g:1178:1: rule__ProprietaryLicense__Group__1 : rule__ProprietaryLicense__Group__1__Impl rule__ProprietaryLicense__Group__2 ;
    public final void rule__ProprietaryLicense__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1182:1: ( rule__ProprietaryLicense__Group__1__Impl rule__ProprietaryLicense__Group__2 )
            // InternalDomainModelsDatasheet.g:1183:2: rule__ProprietaryLicense__Group__1__Impl rule__ProprietaryLicense__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ProprietaryLicense__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group__2();

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
    // $ANTLR end "rule__ProprietaryLicense__Group__1"


    // $ANTLR start "rule__ProprietaryLicense__Group__1__Impl"
    // InternalDomainModelsDatasheet.g:1190:1: rule__ProprietaryLicense__Group__1__Impl : ( 'proprietary' ) ;
    public final void rule__ProprietaryLicense__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1194:1: ( ( 'proprietary' ) )
            // InternalDomainModelsDatasheet.g:1195:1: ( 'proprietary' )
            {
            // InternalDomainModelsDatasheet.g:1195:1: ( 'proprietary' )
            // InternalDomainModelsDatasheet.g:1196:2: 'proprietary'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getProprietaryKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProprietaryLicenseAccess().getProprietaryKeyword_1()); 

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
    // $ANTLR end "rule__ProprietaryLicense__Group__1__Impl"


    // $ANTLR start "rule__ProprietaryLicense__Group__2"
    // InternalDomainModelsDatasheet.g:1205:1: rule__ProprietaryLicense__Group__2 : rule__ProprietaryLicense__Group__2__Impl rule__ProprietaryLicense__Group__3 ;
    public final void rule__ProprietaryLicense__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1209:1: ( rule__ProprietaryLicense__Group__2__Impl rule__ProprietaryLicense__Group__3 )
            // InternalDomainModelsDatasheet.g:1210:2: rule__ProprietaryLicense__Group__2__Impl rule__ProprietaryLicense__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ProprietaryLicense__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group__3();

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
    // $ANTLR end "rule__ProprietaryLicense__Group__2"


    // $ANTLR start "rule__ProprietaryLicense__Group__2__Impl"
    // InternalDomainModelsDatasheet.g:1217:1: rule__ProprietaryLicense__Group__2__Impl : ( '{' ) ;
    public final void rule__ProprietaryLicense__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1221:1: ( ( '{' ) )
            // InternalDomainModelsDatasheet.g:1222:1: ( '{' )
            {
            // InternalDomainModelsDatasheet.g:1222:1: ( '{' )
            // InternalDomainModelsDatasheet.g:1223:2: '{'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProprietaryLicenseAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ProprietaryLicense__Group__2__Impl"


    // $ANTLR start "rule__ProprietaryLicense__Group__3"
    // InternalDomainModelsDatasheet.g:1232:1: rule__ProprietaryLicense__Group__3 : rule__ProprietaryLicense__Group__3__Impl rule__ProprietaryLicense__Group__4 ;
    public final void rule__ProprietaryLicense__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1236:1: ( rule__ProprietaryLicense__Group__3__Impl rule__ProprietaryLicense__Group__4 )
            // InternalDomainModelsDatasheet.g:1237:2: rule__ProprietaryLicense__Group__3__Impl rule__ProprietaryLicense__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ProprietaryLicense__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group__4();

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
    // $ANTLR end "rule__ProprietaryLicense__Group__3"


    // $ANTLR start "rule__ProprietaryLicense__Group__3__Impl"
    // InternalDomainModelsDatasheet.g:1244:1: rule__ProprietaryLicense__Group__3__Impl : ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) ) ;
    public final void rule__ProprietaryLicense__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1248:1: ( ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) ) )
            // InternalDomainModelsDatasheet.g:1249:1: ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) )
            {
            // InternalDomainModelsDatasheet.g:1249:1: ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) )
            // InternalDomainModelsDatasheet.g:1250:2: ( rule__ProprietaryLicense__UnorderedGroup_3 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3()); 
            // InternalDomainModelsDatasheet.g:1251:2: ( rule__ProprietaryLicense__UnorderedGroup_3 )
            // InternalDomainModelsDatasheet.g:1251:3: rule__ProprietaryLicense__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3()); 

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
    // $ANTLR end "rule__ProprietaryLicense__Group__3__Impl"


    // $ANTLR start "rule__ProprietaryLicense__Group__4"
    // InternalDomainModelsDatasheet.g:1259:1: rule__ProprietaryLicense__Group__4 : rule__ProprietaryLicense__Group__4__Impl ;
    public final void rule__ProprietaryLicense__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1263:1: ( rule__ProprietaryLicense__Group__4__Impl )
            // InternalDomainModelsDatasheet.g:1264:2: rule__ProprietaryLicense__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group__4__Impl();

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
    // $ANTLR end "rule__ProprietaryLicense__Group__4"


    // $ANTLR start "rule__ProprietaryLicense__Group__4__Impl"
    // InternalDomainModelsDatasheet.g:1270:1: rule__ProprietaryLicense__Group__4__Impl : ( '}' ) ;
    public final void rule__ProprietaryLicense__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1274:1: ( ( '}' ) )
            // InternalDomainModelsDatasheet.g:1275:1: ( '}' )
            {
            // InternalDomainModelsDatasheet.g:1275:1: ( '}' )
            // InternalDomainModelsDatasheet.g:1276:2: '}'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProprietaryLicenseAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ProprietaryLicense__Group__4__Impl"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_0__0"
    // InternalDomainModelsDatasheet.g:1286:1: rule__ProprietaryLicense__Group_3_0__0 : rule__ProprietaryLicense__Group_3_0__0__Impl rule__ProprietaryLicense__Group_3_0__1 ;
    public final void rule__ProprietaryLicense__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1290:1: ( rule__ProprietaryLicense__Group_3_0__0__Impl rule__ProprietaryLicense__Group_3_0__1 )
            // InternalDomainModelsDatasheet.g:1291:2: rule__ProprietaryLicense__Group_3_0__0__Impl rule__ProprietaryLicense__Group_3_0__1
            {
            pushFollow(FOLLOW_7);
            rule__ProprietaryLicense__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group_3_0__1();

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_0__0"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_0__0__Impl"
    // InternalDomainModelsDatasheet.g:1298:1: rule__ProprietaryLicense__Group_3_0__0__Impl : ( 'name' ) ;
    public final void rule__ProprietaryLicense__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1302:1: ( ( 'name' ) )
            // InternalDomainModelsDatasheet.g:1303:1: ( 'name' )
            {
            // InternalDomainModelsDatasheet.g:1303:1: ( 'name' )
            // InternalDomainModelsDatasheet.g:1304:2: 'name'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getNameKeyword_3_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getProprietaryLicenseAccess().getNameKeyword_3_0_0()); 

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_0__0__Impl"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_0__1"
    // InternalDomainModelsDatasheet.g:1313:1: rule__ProprietaryLicense__Group_3_0__1 : rule__ProprietaryLicense__Group_3_0__1__Impl rule__ProprietaryLicense__Group_3_0__2 ;
    public final void rule__ProprietaryLicense__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1317:1: ( rule__ProprietaryLicense__Group_3_0__1__Impl rule__ProprietaryLicense__Group_3_0__2 )
            // InternalDomainModelsDatasheet.g:1318:2: rule__ProprietaryLicense__Group_3_0__1__Impl rule__ProprietaryLicense__Group_3_0__2
            {
            pushFollow(FOLLOW_7);
            rule__ProprietaryLicense__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group_3_0__2();

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_0__1"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_0__1__Impl"
    // InternalDomainModelsDatasheet.g:1325:1: rule__ProprietaryLicense__Group_3_0__1__Impl : ( ( ':' )? ) ;
    public final void rule__ProprietaryLicense__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1329:1: ( ( ( ':' )? ) )
            // InternalDomainModelsDatasheet.g:1330:1: ( ( ':' )? )
            {
            // InternalDomainModelsDatasheet.g:1330:1: ( ( ':' )? )
            // InternalDomainModelsDatasheet.g:1331:2: ( ':' )?
            {
             before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_0_1()); 
            // InternalDomainModelsDatasheet.g:1332:2: ( ':' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:1332:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_0_1()); 

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_0__1__Impl"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_0__2"
    // InternalDomainModelsDatasheet.g:1340:1: rule__ProprietaryLicense__Group_3_0__2 : rule__ProprietaryLicense__Group_3_0__2__Impl ;
    public final void rule__ProprietaryLicense__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1344:1: ( rule__ProprietaryLicense__Group_3_0__2__Impl )
            // InternalDomainModelsDatasheet.g:1345:2: rule__ProprietaryLicense__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group_3_0__2__Impl();

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_0__2"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_0__2__Impl"
    // InternalDomainModelsDatasheet.g:1351:1: rule__ProprietaryLicense__Group_3_0__2__Impl : ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) ) ;
    public final void rule__ProprietaryLicense__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1355:1: ( ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) ) )
            // InternalDomainModelsDatasheet.g:1356:1: ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) )
            {
            // InternalDomainModelsDatasheet.g:1356:1: ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) )
            // InternalDomainModelsDatasheet.g:1357:2: ( rule__ProprietaryLicense__NameAssignment_3_0_2 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getNameAssignment_3_0_2()); 
            // InternalDomainModelsDatasheet.g:1358:2: ( rule__ProprietaryLicense__NameAssignment_3_0_2 )
            // InternalDomainModelsDatasheet.g:1358:3: rule__ProprietaryLicense__NameAssignment_3_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__NameAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getProprietaryLicenseAccess().getNameAssignment_3_0_2()); 

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_0__2__Impl"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_1__0"
    // InternalDomainModelsDatasheet.g:1367:1: rule__ProprietaryLicense__Group_3_1__0 : rule__ProprietaryLicense__Group_3_1__0__Impl rule__ProprietaryLicense__Group_3_1__1 ;
    public final void rule__ProprietaryLicense__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1371:1: ( rule__ProprietaryLicense__Group_3_1__0__Impl rule__ProprietaryLicense__Group_3_1__1 )
            // InternalDomainModelsDatasheet.g:1372:2: rule__ProprietaryLicense__Group_3_1__0__Impl rule__ProprietaryLicense__Group_3_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ProprietaryLicense__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group_3_1__1();

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_1__0"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_1__0__Impl"
    // InternalDomainModelsDatasheet.g:1379:1: rule__ProprietaryLicense__Group_3_1__0__Impl : ( 'fullText' ) ;
    public final void rule__ProprietaryLicense__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1383:1: ( ( 'fullText' ) )
            // InternalDomainModelsDatasheet.g:1384:1: ( 'fullText' )
            {
            // InternalDomainModelsDatasheet.g:1384:1: ( 'fullText' )
            // InternalDomainModelsDatasheet.g:1385:2: 'fullText'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getFullTextKeyword_3_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProprietaryLicenseAccess().getFullTextKeyword_3_1_0()); 

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_1__0__Impl"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_1__1"
    // InternalDomainModelsDatasheet.g:1394:1: rule__ProprietaryLicense__Group_3_1__1 : rule__ProprietaryLicense__Group_3_1__1__Impl rule__ProprietaryLicense__Group_3_1__2 ;
    public final void rule__ProprietaryLicense__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1398:1: ( rule__ProprietaryLicense__Group_3_1__1__Impl rule__ProprietaryLicense__Group_3_1__2 )
            // InternalDomainModelsDatasheet.g:1399:2: rule__ProprietaryLicense__Group_3_1__1__Impl rule__ProprietaryLicense__Group_3_1__2
            {
            pushFollow(FOLLOW_7);
            rule__ProprietaryLicense__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group_3_1__2();

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_1__1"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_1__1__Impl"
    // InternalDomainModelsDatasheet.g:1406:1: rule__ProprietaryLicense__Group_3_1__1__Impl : ( ( ':' )? ) ;
    public final void rule__ProprietaryLicense__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1410:1: ( ( ( ':' )? ) )
            // InternalDomainModelsDatasheet.g:1411:1: ( ( ':' )? )
            {
            // InternalDomainModelsDatasheet.g:1411:1: ( ( ':' )? )
            // InternalDomainModelsDatasheet.g:1412:2: ( ':' )?
            {
             before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_1_1()); 
            // InternalDomainModelsDatasheet.g:1413:2: ( ':' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:1413:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_1_1()); 

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_1__1__Impl"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_1__2"
    // InternalDomainModelsDatasheet.g:1421:1: rule__ProprietaryLicense__Group_3_1__2 : rule__ProprietaryLicense__Group_3_1__2__Impl ;
    public final void rule__ProprietaryLicense__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1425:1: ( rule__ProprietaryLicense__Group_3_1__2__Impl )
            // InternalDomainModelsDatasheet.g:1426:2: rule__ProprietaryLicense__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group_3_1__2__Impl();

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_1__2"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_1__2__Impl"
    // InternalDomainModelsDatasheet.g:1432:1: rule__ProprietaryLicense__Group_3_1__2__Impl : ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) ) ;
    public final void rule__ProprietaryLicense__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1436:1: ( ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) ) )
            // InternalDomainModelsDatasheet.g:1437:1: ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) )
            {
            // InternalDomainModelsDatasheet.g:1437:1: ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) )
            // InternalDomainModelsDatasheet.g:1438:2: ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getFullTextAssignment_3_1_2()); 
            // InternalDomainModelsDatasheet.g:1439:2: ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 )
            // InternalDomainModelsDatasheet.g:1439:3: rule__ProprietaryLicense__FullTextAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__FullTextAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getProprietaryLicenseAccess().getFullTextAssignment_3_1_2()); 

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_1__2__Impl"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_2__0"
    // InternalDomainModelsDatasheet.g:1448:1: rule__ProprietaryLicense__Group_3_2__0 : rule__ProprietaryLicense__Group_3_2__0__Impl rule__ProprietaryLicense__Group_3_2__1 ;
    public final void rule__ProprietaryLicense__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1452:1: ( rule__ProprietaryLicense__Group_3_2__0__Impl rule__ProprietaryLicense__Group_3_2__1 )
            // InternalDomainModelsDatasheet.g:1453:2: rule__ProprietaryLicense__Group_3_2__0__Impl rule__ProprietaryLicense__Group_3_2__1
            {
            pushFollow(FOLLOW_7);
            rule__ProprietaryLicense__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group_3_2__1();

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_2__0"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_2__0__Impl"
    // InternalDomainModelsDatasheet.g:1460:1: rule__ProprietaryLicense__Group_3_2__0__Impl : ( 'URL' ) ;
    public final void rule__ProprietaryLicense__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1464:1: ( ( 'URL' ) )
            // InternalDomainModelsDatasheet.g:1465:1: ( 'URL' )
            {
            // InternalDomainModelsDatasheet.g:1465:1: ( 'URL' )
            // InternalDomainModelsDatasheet.g:1466:2: 'URL'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getURLKeyword_3_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getProprietaryLicenseAccess().getURLKeyword_3_2_0()); 

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_2__0__Impl"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_2__1"
    // InternalDomainModelsDatasheet.g:1475:1: rule__ProprietaryLicense__Group_3_2__1 : rule__ProprietaryLicense__Group_3_2__1__Impl rule__ProprietaryLicense__Group_3_2__2 ;
    public final void rule__ProprietaryLicense__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1479:1: ( rule__ProprietaryLicense__Group_3_2__1__Impl rule__ProprietaryLicense__Group_3_2__2 )
            // InternalDomainModelsDatasheet.g:1480:2: rule__ProprietaryLicense__Group_3_2__1__Impl rule__ProprietaryLicense__Group_3_2__2
            {
            pushFollow(FOLLOW_7);
            rule__ProprietaryLicense__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group_3_2__2();

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_2__1"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_2__1__Impl"
    // InternalDomainModelsDatasheet.g:1487:1: rule__ProprietaryLicense__Group_3_2__1__Impl : ( ( ':' )? ) ;
    public final void rule__ProprietaryLicense__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1491:1: ( ( ( ':' )? ) )
            // InternalDomainModelsDatasheet.g:1492:1: ( ( ':' )? )
            {
            // InternalDomainModelsDatasheet.g:1492:1: ( ( ':' )? )
            // InternalDomainModelsDatasheet.g:1493:2: ( ':' )?
            {
             before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_2_1()); 
            // InternalDomainModelsDatasheet.g:1494:2: ( ':' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:1494:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_2_1()); 

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_2__1__Impl"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_2__2"
    // InternalDomainModelsDatasheet.g:1502:1: rule__ProprietaryLicense__Group_3_2__2 : rule__ProprietaryLicense__Group_3_2__2__Impl ;
    public final void rule__ProprietaryLicense__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1506:1: ( rule__ProprietaryLicense__Group_3_2__2__Impl )
            // InternalDomainModelsDatasheet.g:1507:2: rule__ProprietaryLicense__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__Group_3_2__2__Impl();

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_2__2"


    // $ANTLR start "rule__ProprietaryLicense__Group_3_2__2__Impl"
    // InternalDomainModelsDatasheet.g:1513:1: rule__ProprietaryLicense__Group_3_2__2__Impl : ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) ) ;
    public final void rule__ProprietaryLicense__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1517:1: ( ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) ) )
            // InternalDomainModelsDatasheet.g:1518:1: ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) )
            {
            // InternalDomainModelsDatasheet.g:1518:1: ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) )
            // InternalDomainModelsDatasheet.g:1519:2: ( rule__ProprietaryLicense__UrlAssignment_3_2_2 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getUrlAssignment_3_2_2()); 
            // InternalDomainModelsDatasheet.g:1520:2: ( rule__ProprietaryLicense__UrlAssignment_3_2_2 )
            // InternalDomainModelsDatasheet.g:1520:3: rule__ProprietaryLicense__UrlAssignment_3_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__UrlAssignment_3_2_2();

            state._fsp--;


            }

             after(grammarAccess.getProprietaryLicenseAccess().getUrlAssignment_3_2_2()); 

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
    // $ANTLR end "rule__ProprietaryLicense__Group_3_2__2__Impl"


    // $ANTLR start "rule__GenericDatasheet__UnorderedGroup"
    // InternalDomainModelsDatasheet.g:1529:1: rule__GenericDatasheet__UnorderedGroup : rule__GenericDatasheet__UnorderedGroup__0 {...}?;
    public final void rule__GenericDatasheet__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
        	
        try {
            // InternalDomainModelsDatasheet.g:1534:1: ( rule__GenericDatasheet__UnorderedGroup__0 {...}?)
            // InternalDomainModelsDatasheet.g:1535:2: rule__GenericDatasheet__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericDatasheet__UnorderedGroup"


    // $ANTLR start "rule__GenericDatasheet__UnorderedGroup__Impl"
    // InternalDomainModelsDatasheet.g:1543:1: rule__GenericDatasheet__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) ) ) ;
    public final void rule__GenericDatasheet__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalDomainModelsDatasheet.g:1548:1: ( ( ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) ) ) )
            // InternalDomainModelsDatasheet.g:1549:3: ( ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) ) )
            {
            // InternalDomainModelsDatasheet.g:1549:3: ( ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) ) )
            int alt13=7;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt13=2;
            }
            else if ( LA13_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt13=3;
            }
            else if ( LA13_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt13=4;
            }
            else if ( LA13_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt13=5;
            }
            else if ( LA13_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt13=6;
            }
            else if ( LA13_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt13=7;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:1550:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) )
                    {
                    // InternalDomainModelsDatasheet.g:1550:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) )
                    // InternalDomainModelsDatasheet.g:1551:4: {...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalDomainModelsDatasheet.g:1551:110: ( ( ( rule__GenericDatasheet__Group_0__0 ) ) )
                    // InternalDomainModelsDatasheet.g:1552:5: ( ( rule__GenericDatasheet__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalDomainModelsDatasheet.g:1558:5: ( ( rule__GenericDatasheet__Group_0__0 ) )
                    // InternalDomainModelsDatasheet.g:1559:6: ( rule__GenericDatasheet__Group_0__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_0()); 
                    // InternalDomainModelsDatasheet.g:1560:6: ( rule__GenericDatasheet__Group_0__0 )
                    // InternalDomainModelsDatasheet.g:1560:7: rule__GenericDatasheet__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenericDatasheet__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenericDatasheetAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModelsDatasheet.g:1565:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) )
                    {
                    // InternalDomainModelsDatasheet.g:1565:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) )
                    // InternalDomainModelsDatasheet.g:1566:4: {...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalDomainModelsDatasheet.g:1566:110: ( ( ( rule__GenericDatasheet__Group_1__0 ) ) )
                    // InternalDomainModelsDatasheet.g:1567:5: ( ( rule__GenericDatasheet__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalDomainModelsDatasheet.g:1573:5: ( ( rule__GenericDatasheet__Group_1__0 ) )
                    // InternalDomainModelsDatasheet.g:1574:6: ( rule__GenericDatasheet__Group_1__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_1()); 
                    // InternalDomainModelsDatasheet.g:1575:6: ( rule__GenericDatasheet__Group_1__0 )
                    // InternalDomainModelsDatasheet.g:1575:7: rule__GenericDatasheet__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenericDatasheet__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenericDatasheetAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDomainModelsDatasheet.g:1580:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) )
                    {
                    // InternalDomainModelsDatasheet.g:1580:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) )
                    // InternalDomainModelsDatasheet.g:1581:4: {...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalDomainModelsDatasheet.g:1581:110: ( ( ( rule__GenericDatasheet__Group_2__0 ) ) )
                    // InternalDomainModelsDatasheet.g:1582:5: ( ( rule__GenericDatasheet__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalDomainModelsDatasheet.g:1588:5: ( ( rule__GenericDatasheet__Group_2__0 ) )
                    // InternalDomainModelsDatasheet.g:1589:6: ( rule__GenericDatasheet__Group_2__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_2()); 
                    // InternalDomainModelsDatasheet.g:1590:6: ( rule__GenericDatasheet__Group_2__0 )
                    // InternalDomainModelsDatasheet.g:1590:7: rule__GenericDatasheet__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenericDatasheet__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenericDatasheetAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDomainModelsDatasheet.g:1595:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) )
                    {
                    // InternalDomainModelsDatasheet.g:1595:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) )
                    // InternalDomainModelsDatasheet.g:1596:4: {...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalDomainModelsDatasheet.g:1596:110: ( ( ( rule__GenericDatasheet__Group_3__0 ) ) )
                    // InternalDomainModelsDatasheet.g:1597:5: ( ( rule__GenericDatasheet__Group_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalDomainModelsDatasheet.g:1603:5: ( ( rule__GenericDatasheet__Group_3__0 ) )
                    // InternalDomainModelsDatasheet.g:1604:6: ( rule__GenericDatasheet__Group_3__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_3()); 
                    // InternalDomainModelsDatasheet.g:1605:6: ( rule__GenericDatasheet__Group_3__0 )
                    // InternalDomainModelsDatasheet.g:1605:7: rule__GenericDatasheet__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenericDatasheet__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenericDatasheetAccess().getGroup_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDomainModelsDatasheet.g:1610:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) )
                    {
                    // InternalDomainModelsDatasheet.g:1610:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) )
                    // InternalDomainModelsDatasheet.g:1611:4: {...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalDomainModelsDatasheet.g:1611:110: ( ( ( rule__GenericDatasheet__Group_4__0 ) ) )
                    // InternalDomainModelsDatasheet.g:1612:5: ( ( rule__GenericDatasheet__Group_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4);
                    				

                    					selected = true;
                    				
                    // InternalDomainModelsDatasheet.g:1618:5: ( ( rule__GenericDatasheet__Group_4__0 ) )
                    // InternalDomainModelsDatasheet.g:1619:6: ( rule__GenericDatasheet__Group_4__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_4()); 
                    // InternalDomainModelsDatasheet.g:1620:6: ( rule__GenericDatasheet__Group_4__0 )
                    // InternalDomainModelsDatasheet.g:1620:7: rule__GenericDatasheet__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenericDatasheet__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenericDatasheetAccess().getGroup_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDomainModelsDatasheet.g:1625:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) )
                    {
                    // InternalDomainModelsDatasheet.g:1625:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) )
                    // InternalDomainModelsDatasheet.g:1626:4: {...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalDomainModelsDatasheet.g:1626:110: ( ( ( rule__GenericDatasheet__Group_5__0 ) ) )
                    // InternalDomainModelsDatasheet.g:1627:5: ( ( rule__GenericDatasheet__Group_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5);
                    				

                    					selected = true;
                    				
                    // InternalDomainModelsDatasheet.g:1633:5: ( ( rule__GenericDatasheet__Group_5__0 ) )
                    // InternalDomainModelsDatasheet.g:1634:6: ( rule__GenericDatasheet__Group_5__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_5()); 
                    // InternalDomainModelsDatasheet.g:1635:6: ( rule__GenericDatasheet__Group_5__0 )
                    // InternalDomainModelsDatasheet.g:1635:7: rule__GenericDatasheet__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenericDatasheet__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenericDatasheetAccess().getGroup_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDomainModelsDatasheet.g:1640:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) )
                    {
                    // InternalDomainModelsDatasheet.g:1640:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) )
                    // InternalDomainModelsDatasheet.g:1641:4: {...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6)");
                    }
                    // InternalDomainModelsDatasheet.g:1641:110: ( ( ( rule__GenericDatasheet__Group_6__0 ) ) )
                    // InternalDomainModelsDatasheet.g:1642:5: ( ( rule__GenericDatasheet__Group_6__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6);
                    				

                    					selected = true;
                    				
                    // InternalDomainModelsDatasheet.g:1648:5: ( ( rule__GenericDatasheet__Group_6__0 ) )
                    // InternalDomainModelsDatasheet.g:1649:6: ( rule__GenericDatasheet__Group_6__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_6()); 
                    // InternalDomainModelsDatasheet.g:1650:6: ( rule__GenericDatasheet__Group_6__0 )
                    // InternalDomainModelsDatasheet.g:1650:7: rule__GenericDatasheet__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenericDatasheet__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenericDatasheetAccess().getGroup_6()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericDatasheet__UnorderedGroup__Impl"


    // $ANTLR start "rule__GenericDatasheet__UnorderedGroup__0"
    // InternalDomainModelsDatasheet.g:1663:1: rule__GenericDatasheet__UnorderedGroup__0 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__1 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1667:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__1 )? )
            // InternalDomainModelsDatasheet.g:1668:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_14);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDomainModelsDatasheet.g:1669:2: ( rule__GenericDatasheet__UnorderedGroup__1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt14=1;
            }
            else if ( LA14_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt14=1;
            }
            else if ( LA14_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt14=1;
            }
            else if ( LA14_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt14=1;
            }
            else if ( LA14_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt14=1;
            }
            else if ( LA14_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:1669:2: rule__GenericDatasheet__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenericDatasheet__UnorderedGroup__1();

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
    // $ANTLR end "rule__GenericDatasheet__UnorderedGroup__0"


    // $ANTLR start "rule__GenericDatasheet__UnorderedGroup__1"
    // InternalDomainModelsDatasheet.g:1675:1: rule__GenericDatasheet__UnorderedGroup__1 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__2 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1679:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__2 )? )
            // InternalDomainModelsDatasheet.g:1680:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_14);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDomainModelsDatasheet.g:1681:2: ( rule__GenericDatasheet__UnorderedGroup__2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt15=1;
            }
            else if ( LA15_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt15=1;
            }
            else if ( LA15_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt15=1;
            }
            else if ( LA15_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt15=1;
            }
            else if ( LA15_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt15=1;
            }
            else if ( LA15_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:1681:2: rule__GenericDatasheet__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenericDatasheet__UnorderedGroup__2();

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
    // $ANTLR end "rule__GenericDatasheet__UnorderedGroup__1"


    // $ANTLR start "rule__GenericDatasheet__UnorderedGroup__2"
    // InternalDomainModelsDatasheet.g:1687:1: rule__GenericDatasheet__UnorderedGroup__2 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__3 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1691:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__3 )? )
            // InternalDomainModelsDatasheet.g:1692:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_14);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDomainModelsDatasheet.g:1693:2: ( rule__GenericDatasheet__UnorderedGroup__3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt16=1;
            }
            else if ( LA16_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt16=1;
            }
            else if ( LA16_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt16=1;
            }
            else if ( LA16_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt16=1;
            }
            else if ( LA16_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt16=1;
            }
            else if ( LA16_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:1693:2: rule__GenericDatasheet__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenericDatasheet__UnorderedGroup__3();

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
    // $ANTLR end "rule__GenericDatasheet__UnorderedGroup__2"


    // $ANTLR start "rule__GenericDatasheet__UnorderedGroup__3"
    // InternalDomainModelsDatasheet.g:1699:1: rule__GenericDatasheet__UnorderedGroup__3 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__4 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1703:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__4 )? )
            // InternalDomainModelsDatasheet.g:1704:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_14);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDomainModelsDatasheet.g:1705:2: ( rule__GenericDatasheet__UnorderedGroup__4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt17=1;
            }
            else if ( LA17_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt17=1;
            }
            else if ( LA17_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt17=1;
            }
            else if ( LA17_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt17=1;
            }
            else if ( LA17_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt17=1;
            }
            else if ( LA17_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:1705:2: rule__GenericDatasheet__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenericDatasheet__UnorderedGroup__4();

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
    // $ANTLR end "rule__GenericDatasheet__UnorderedGroup__3"


    // $ANTLR start "rule__GenericDatasheet__UnorderedGroup__4"
    // InternalDomainModelsDatasheet.g:1711:1: rule__GenericDatasheet__UnorderedGroup__4 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__5 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1715:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__5 )? )
            // InternalDomainModelsDatasheet.g:1716:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_14);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDomainModelsDatasheet.g:1717:2: ( rule__GenericDatasheet__UnorderedGroup__5 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt18=1;
            }
            else if ( LA18_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt18=1;
            }
            else if ( LA18_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt18=1;
            }
            else if ( LA18_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt18=1;
            }
            else if ( LA18_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt18=1;
            }
            else if ( LA18_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:1717:2: rule__GenericDatasheet__UnorderedGroup__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenericDatasheet__UnorderedGroup__5();

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
    // $ANTLR end "rule__GenericDatasheet__UnorderedGroup__4"


    // $ANTLR start "rule__GenericDatasheet__UnorderedGroup__5"
    // InternalDomainModelsDatasheet.g:1723:1: rule__GenericDatasheet__UnorderedGroup__5 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__6 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1727:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__6 )? )
            // InternalDomainModelsDatasheet.g:1728:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_14);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalDomainModelsDatasheet.g:1729:2: ( rule__GenericDatasheet__UnorderedGroup__6 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt19=1;
            }
            else if ( LA19_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt19=1;
            }
            else if ( LA19_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt19=1;
            }
            else if ( LA19_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt19=1;
            }
            else if ( LA19_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt19=1;
            }
            else if ( LA19_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:1729:2: rule__GenericDatasheet__UnorderedGroup__6
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenericDatasheet__UnorderedGroup__6();

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
    // $ANTLR end "rule__GenericDatasheet__UnorderedGroup__5"


    // $ANTLR start "rule__GenericDatasheet__UnorderedGroup__6"
    // InternalDomainModelsDatasheet.g:1735:1: rule__GenericDatasheet__UnorderedGroup__6 : rule__GenericDatasheet__UnorderedGroup__Impl ;
    public final void rule__GenericDatasheet__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1739:1: ( rule__GenericDatasheet__UnorderedGroup__Impl )
            // InternalDomainModelsDatasheet.g:1740:2: rule__GenericDatasheet__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenericDatasheet__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__GenericDatasheet__UnorderedGroup__6"


    // $ANTLR start "rule__ProprietaryLicense__UnorderedGroup_3"
    // InternalDomainModelsDatasheet.g:1747:1: rule__ProprietaryLicense__UnorderedGroup_3 : rule__ProprietaryLicense__UnorderedGroup_3__0 {...}?;
    public final void rule__ProprietaryLicense__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
        	
        try {
            // InternalDomainModelsDatasheet.g:1752:1: ( rule__ProprietaryLicense__UnorderedGroup_3__0 {...}?)
            // InternalDomainModelsDatasheet.g:1753:2: rule__ProprietaryLicense__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__ProprietaryLicense__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProprietaryLicense__UnorderedGroup_3"


    // $ANTLR start "rule__ProprietaryLicense__UnorderedGroup_3__Impl"
    // InternalDomainModelsDatasheet.g:1761:1: rule__ProprietaryLicense__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalDomainModelsDatasheet.g:1766:1: ( ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) ) )
            // InternalDomainModelsDatasheet.g:1767:3: ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) )
            {
            // InternalDomainModelsDatasheet.g:1767:3: ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                alt20=2;
            }
            else if ( LA20_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                alt20=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:1768:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) )
                    {
                    // InternalDomainModelsDatasheet.g:1768:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) )
                    // InternalDomainModelsDatasheet.g:1769:4: {...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ProprietaryLicense__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalDomainModelsDatasheet.g:1769:114: ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) )
                    // InternalDomainModelsDatasheet.g:1770:5: ( ( rule__ProprietaryLicense__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalDomainModelsDatasheet.g:1776:5: ( ( rule__ProprietaryLicense__Group_3_0__0 ) )
                    // InternalDomainModelsDatasheet.g:1777:6: ( rule__ProprietaryLicense__Group_3_0__0 )
                    {
                     before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_0()); 
                    // InternalDomainModelsDatasheet.g:1778:6: ( rule__ProprietaryLicense__Group_3_0__0 )
                    // InternalDomainModelsDatasheet.g:1778:7: rule__ProprietaryLicense__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProprietaryLicense__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProprietaryLicenseAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModelsDatasheet.g:1783:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) )
                    {
                    // InternalDomainModelsDatasheet.g:1783:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) )
                    // InternalDomainModelsDatasheet.g:1784:4: {...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ProprietaryLicense__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalDomainModelsDatasheet.g:1784:114: ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) )
                    // InternalDomainModelsDatasheet.g:1785:5: ( ( rule__ProprietaryLicense__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalDomainModelsDatasheet.g:1791:5: ( ( rule__ProprietaryLicense__Group_3_1__0 ) )
                    // InternalDomainModelsDatasheet.g:1792:6: ( rule__ProprietaryLicense__Group_3_1__0 )
                    {
                     before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_1()); 
                    // InternalDomainModelsDatasheet.g:1793:6: ( rule__ProprietaryLicense__Group_3_1__0 )
                    // InternalDomainModelsDatasheet.g:1793:7: rule__ProprietaryLicense__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProprietaryLicense__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProprietaryLicenseAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDomainModelsDatasheet.g:1798:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) )
                    {
                    // InternalDomainModelsDatasheet.g:1798:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) )
                    // InternalDomainModelsDatasheet.g:1799:4: {...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ProprietaryLicense__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalDomainModelsDatasheet.g:1799:114: ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) )
                    // InternalDomainModelsDatasheet.g:1800:5: ( ( rule__ProprietaryLicense__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalDomainModelsDatasheet.g:1806:5: ( ( rule__ProprietaryLicense__Group_3_2__0 ) )
                    // InternalDomainModelsDatasheet.g:1807:6: ( rule__ProprietaryLicense__Group_3_2__0 )
                    {
                     before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_2()); 
                    // InternalDomainModelsDatasheet.g:1808:6: ( rule__ProprietaryLicense__Group_3_2__0 )
                    // InternalDomainModelsDatasheet.g:1808:7: rule__ProprietaryLicense__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProprietaryLicense__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProprietaryLicenseAccess().getGroup_3_2()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProprietaryLicense__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__ProprietaryLicense__UnorderedGroup_3__0"
    // InternalDomainModelsDatasheet.g:1821:1: rule__ProprietaryLicense__UnorderedGroup_3__0 : rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__1 )? ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1825:1: ( rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__1 )? )
            // InternalDomainModelsDatasheet.g:1826:2: rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_15);
            rule__ProprietaryLicense__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalDomainModelsDatasheet.g:1827:2: ( rule__ProprietaryLicense__UnorderedGroup_3__1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                alt21=1;
            }
            else if ( LA21_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:1827:2: rule__ProprietaryLicense__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProprietaryLicense__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__ProprietaryLicense__UnorderedGroup_3__0"


    // $ANTLR start "rule__ProprietaryLicense__UnorderedGroup_3__1"
    // InternalDomainModelsDatasheet.g:1833:1: rule__ProprietaryLicense__UnorderedGroup_3__1 : rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__2 )? ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1837:1: ( rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__2 )? )
            // InternalDomainModelsDatasheet.g:1838:2: rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_15);
            rule__ProprietaryLicense__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalDomainModelsDatasheet.g:1839:2: ( rule__ProprietaryLicense__UnorderedGroup_3__2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:1839:2: rule__ProprietaryLicense__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProprietaryLicense__UnorderedGroup_3__2();

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
    // $ANTLR end "rule__ProprietaryLicense__UnorderedGroup_3__1"


    // $ANTLR start "rule__ProprietaryLicense__UnorderedGroup_3__2"
    // InternalDomainModelsDatasheet.g:1845:1: rule__ProprietaryLicense__UnorderedGroup_3__2 : rule__ProprietaryLicense__UnorderedGroup_3__Impl ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1849:1: ( rule__ProprietaryLicense__UnorderedGroup_3__Impl )
            // InternalDomainModelsDatasheet.g:1850:2: rule__ProprietaryLicense__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProprietaryLicense__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__ProprietaryLicense__UnorderedGroup_3__2"


    // $ANTLR start "rule__DomainModelsDatasheet__NameAssignment_1"
    // InternalDomainModelsDatasheet.g:1857:1: rule__DomainModelsDatasheet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DomainModelsDatasheet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1861:1: ( ( RULE_ID ) )
            // InternalDomainModelsDatasheet.g:1862:2: ( RULE_ID )
            {
            // InternalDomainModelsDatasheet.g:1862:2: ( RULE_ID )
            // InternalDomainModelsDatasheet.g:1863:3: RULE_ID
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


    // $ANTLR start "rule__GenericDatasheet__BaseURIAssignment_0_2"
    // InternalDomainModelsDatasheet.g:1872:1: rule__GenericDatasheet__BaseURIAssignment_0_2 : ( ruleEString ) ;
    public final void rule__GenericDatasheet__BaseURIAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1876:1: ( ( ruleEString ) )
            // InternalDomainModelsDatasheet.g:1877:2: ( ruleEString )
            {
            // InternalDomainModelsDatasheet.g:1877:2: ( ruleEString )
            // InternalDomainModelsDatasheet.g:1878:3: ruleEString
            {
             before(grammarAccess.getGenericDatasheetAccess().getBaseURIEStringParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGenericDatasheetAccess().getBaseURIEStringParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__GenericDatasheet__BaseURIAssignment_0_2"


    // $ANTLR start "rule__GenericDatasheet__ShortDescriptionAssignment_1_2"
    // InternalDomainModelsDatasheet.g:1887:1: rule__GenericDatasheet__ShortDescriptionAssignment_1_2 : ( ruleEString ) ;
    public final void rule__GenericDatasheet__ShortDescriptionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1891:1: ( ( ruleEString ) )
            // InternalDomainModelsDatasheet.g:1892:2: ( ruleEString )
            {
            // InternalDomainModelsDatasheet.g:1892:2: ( ruleEString )
            // InternalDomainModelsDatasheet.g:1893:3: ruleEString
            {
             before(grammarAccess.getGenericDatasheetAccess().getShortDescriptionEStringParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGenericDatasheetAccess().getShortDescriptionEStringParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__GenericDatasheet__ShortDescriptionAssignment_1_2"


    // $ANTLR start "rule__GenericDatasheet__LongDescriptionAssignment_2_2"
    // InternalDomainModelsDatasheet.g:1902:1: rule__GenericDatasheet__LongDescriptionAssignment_2_2 : ( RULE_TEXT_BLOCK ) ;
    public final void rule__GenericDatasheet__LongDescriptionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1906:1: ( ( RULE_TEXT_BLOCK ) )
            // InternalDomainModelsDatasheet.g:1907:2: ( RULE_TEXT_BLOCK )
            {
            // InternalDomainModelsDatasheet.g:1907:2: ( RULE_TEXT_BLOCK )
            // InternalDomainModelsDatasheet.g:1908:3: RULE_TEXT_BLOCK
            {
             before(grammarAccess.getGenericDatasheetAccess().getLongDescriptionTEXT_BLOCKTerminalRuleCall_2_2_0()); 
            match(input,RULE_TEXT_BLOCK,FOLLOW_2); 
             after(grammarAccess.getGenericDatasheetAccess().getLongDescriptionTEXT_BLOCKTerminalRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__GenericDatasheet__LongDescriptionAssignment_2_2"


    // $ANTLR start "rule__GenericDatasheet__SupplierDescriptionAssignment_3_2"
    // InternalDomainModelsDatasheet.g:1917:1: rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 : ( ruleEString ) ;
    public final void rule__GenericDatasheet__SupplierDescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1921:1: ( ( ruleEString ) )
            // InternalDomainModelsDatasheet.g:1922:2: ( ruleEString )
            {
            // InternalDomainModelsDatasheet.g:1922:2: ( ruleEString )
            // InternalDomainModelsDatasheet.g:1923:3: ruleEString
            {
             before(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionEStringParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionEStringParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__GenericDatasheet__SupplierDescriptionAssignment_3_2"


    // $ANTLR start "rule__GenericDatasheet__HomepageAssignment_4_2"
    // InternalDomainModelsDatasheet.g:1932:1: rule__GenericDatasheet__HomepageAssignment_4_2 : ( ruleEString ) ;
    public final void rule__GenericDatasheet__HomepageAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1936:1: ( ( ruleEString ) )
            // InternalDomainModelsDatasheet.g:1937:2: ( ruleEString )
            {
            // InternalDomainModelsDatasheet.g:1937:2: ( ruleEString )
            // InternalDomainModelsDatasheet.g:1938:3: ruleEString
            {
             before(grammarAccess.getGenericDatasheetAccess().getHomepageEStringParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGenericDatasheetAccess().getHomepageEStringParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__GenericDatasheet__HomepageAssignment_4_2"


    // $ANTLR start "rule__GenericDatasheet__TrlAssignment_5_2"
    // InternalDomainModelsDatasheet.g:1947:1: rule__GenericDatasheet__TrlAssignment_5_2 : ( ruleTRL ) ;
    public final void rule__GenericDatasheet__TrlAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1951:1: ( ( ruleTRL ) )
            // InternalDomainModelsDatasheet.g:1952:2: ( ruleTRL )
            {
            // InternalDomainModelsDatasheet.g:1952:2: ( ruleTRL )
            // InternalDomainModelsDatasheet.g:1953:3: ruleTRL
            {
             before(grammarAccess.getGenericDatasheetAccess().getTrlTRLEnumRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTRL();

            state._fsp--;

             after(grammarAccess.getGenericDatasheetAccess().getTrlTRLEnumRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__GenericDatasheet__TrlAssignment_5_2"


    // $ANTLR start "rule__GenericDatasheet__LicenseAssignment_6_2"
    // InternalDomainModelsDatasheet.g:1962:1: rule__GenericDatasheet__LicenseAssignment_6_2 : ( ruleAbstractLicense ) ;
    public final void rule__GenericDatasheet__LicenseAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1966:1: ( ( ruleAbstractLicense ) )
            // InternalDomainModelsDatasheet.g:1967:2: ( ruleAbstractLicense )
            {
            // InternalDomainModelsDatasheet.g:1967:2: ( ruleAbstractLicense )
            // InternalDomainModelsDatasheet.g:1968:3: ruleAbstractLicense
            {
             before(grammarAccess.getGenericDatasheetAccess().getLicenseAbstractLicenseParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractLicense();

            state._fsp--;

             after(grammarAccess.getGenericDatasheetAccess().getLicenseAbstractLicenseParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__GenericDatasheet__LicenseAssignment_6_2"


    // $ANTLR start "rule__SpdxLicense__LicenseIDAssignment_2"
    // InternalDomainModelsDatasheet.g:1977:1: rule__SpdxLicense__LicenseIDAssignment_2 : ( ruleEString ) ;
    public final void rule__SpdxLicense__LicenseIDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1981:1: ( ( ruleEString ) )
            // InternalDomainModelsDatasheet.g:1982:2: ( ruleEString )
            {
            // InternalDomainModelsDatasheet.g:1982:2: ( ruleEString )
            // InternalDomainModelsDatasheet.g:1983:3: ruleEString
            {
             before(grammarAccess.getSpdxLicenseAccess().getLicenseIDEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpdxLicenseAccess().getLicenseIDEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SpdxLicense__LicenseIDAssignment_2"


    // $ANTLR start "rule__ProprietaryLicense__NameAssignment_3_0_2"
    // InternalDomainModelsDatasheet.g:1992:1: rule__ProprietaryLicense__NameAssignment_3_0_2 : ( ruleEString ) ;
    public final void rule__ProprietaryLicense__NameAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:1996:1: ( ( ruleEString ) )
            // InternalDomainModelsDatasheet.g:1997:2: ( ruleEString )
            {
            // InternalDomainModelsDatasheet.g:1997:2: ( ruleEString )
            // InternalDomainModelsDatasheet.g:1998:3: ruleEString
            {
             before(grammarAccess.getProprietaryLicenseAccess().getNameEStringParserRuleCall_3_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProprietaryLicenseAccess().getNameEStringParserRuleCall_3_0_2_0()); 

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
    // $ANTLR end "rule__ProprietaryLicense__NameAssignment_3_0_2"


    // $ANTLR start "rule__ProprietaryLicense__FullTextAssignment_3_1_2"
    // InternalDomainModelsDatasheet.g:2007:1: rule__ProprietaryLicense__FullTextAssignment_3_1_2 : ( ruleEString ) ;
    public final void rule__ProprietaryLicense__FullTextAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:2011:1: ( ( ruleEString ) )
            // InternalDomainModelsDatasheet.g:2012:2: ( ruleEString )
            {
            // InternalDomainModelsDatasheet.g:2012:2: ( ruleEString )
            // InternalDomainModelsDatasheet.g:2013:3: ruleEString
            {
             before(grammarAccess.getProprietaryLicenseAccess().getFullTextEStringParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProprietaryLicenseAccess().getFullTextEStringParserRuleCall_3_1_2_0()); 

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
    // $ANTLR end "rule__ProprietaryLicense__FullTextAssignment_3_1_2"


    // $ANTLR start "rule__ProprietaryLicense__UrlAssignment_3_2_2"
    // InternalDomainModelsDatasheet.g:2022:1: rule__ProprietaryLicense__UrlAssignment_3_2_2 : ( ruleEString ) ;
    public final void rule__ProprietaryLicense__UrlAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModelsDatasheet.g:2026:1: ( ( ruleEString ) )
            // InternalDomainModelsDatasheet.g:2027:2: ( ruleEString )
            {
            // InternalDomainModelsDatasheet.g:2027:2: ( ruleEString )
            // InternalDomainModelsDatasheet.g:2028:3: ruleEString
            {
             before(grammarAccess.getProprietaryLicenseAccess().getUrlEStringParserRuleCall_3_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProprietaryLicenseAccess().getUrlEStringParserRuleCall_3_2_2_0()); 

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
    // $ANTLR end "rule__ProprietaryLicense__UrlAssignment_3_2_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000001FA000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000043FF000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001204000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001FA000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000E000000002L});

}
