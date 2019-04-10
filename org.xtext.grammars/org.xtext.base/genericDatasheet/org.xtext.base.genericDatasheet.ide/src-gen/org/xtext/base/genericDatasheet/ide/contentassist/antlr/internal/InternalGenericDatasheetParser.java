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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_TEXT_BLOCK", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Level1'", "'Level2'", "'Level3'", "'Level4'", "'Level5'", "'Level6'", "'Level7'", "'Level8'", "'Level9'", "'Undefined'", "'baseURI'", "':'", "'shortDescription'", "'longDescription'", "'supplierDescription'", "'homepage'", "'trl'", "'license'", "'spdx'", "'('", "')'", "'proprietary'", "'{'", "'}'", "'name'", "'fullText'", "'URL'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_TEXT_BLOCK=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
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
    public static final int RULE_ID=6;
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



    // $ANTLR start "ruleGenericDatasheet"
    // InternalGenericDatasheet.g:95:1: ruleGenericDatasheet : ( ( rule__GenericDatasheet__UnorderedGroup ) ) ;
    public final void ruleGenericDatasheet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:99:2: ( ( ( rule__GenericDatasheet__UnorderedGroup ) ) )
            // InternalGenericDatasheet.g:100:2: ( ( rule__GenericDatasheet__UnorderedGroup ) )
            {
            // InternalGenericDatasheet.g:100:2: ( ( rule__GenericDatasheet__UnorderedGroup ) )
            // InternalGenericDatasheet.g:101:3: ( rule__GenericDatasheet__UnorderedGroup )
            {
             before(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup()); 
            // InternalGenericDatasheet.g:102:3: ( rule__GenericDatasheet__UnorderedGroup )
            // InternalGenericDatasheet.g:102:4: rule__GenericDatasheet__UnorderedGroup
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:111:1: entryRuleAbstractLicense : ruleAbstractLicense EOF ;
    public final void entryRuleAbstractLicense() throws RecognitionException {
        try {
            // InternalGenericDatasheet.g:112:1: ( ruleAbstractLicense EOF )
            // InternalGenericDatasheet.g:113:1: ruleAbstractLicense EOF
            {
             before(grammarAccess.getAbstractLicenseRule()); 
            pushFollow(FOLLOW_2);
            ruleAbstractLicense();

            state._fsp--;

             after(grammarAccess.getAbstractLicenseRule()); 
            match(input,EOF,FOLLOW_1); 

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
    // InternalGenericDatasheet.g:120:1: ruleAbstractLicense : ( ( rule__AbstractLicense__Alternatives ) ) ;
    public final void ruleAbstractLicense() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:124:2: ( ( ( rule__AbstractLicense__Alternatives ) ) )
            // InternalGenericDatasheet.g:125:2: ( ( rule__AbstractLicense__Alternatives ) )
            {
            // InternalGenericDatasheet.g:125:2: ( ( rule__AbstractLicense__Alternatives ) )
            // InternalGenericDatasheet.g:126:3: ( rule__AbstractLicense__Alternatives )
            {
             before(grammarAccess.getAbstractLicenseAccess().getAlternatives()); 
            // InternalGenericDatasheet.g:127:3: ( rule__AbstractLicense__Alternatives )
            // InternalGenericDatasheet.g:127:4: rule__AbstractLicense__Alternatives
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:136:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGenericDatasheet.g:137:1: ( ruleEString EOF )
            // InternalGenericDatasheet.g:138:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_1); 

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
    // InternalGenericDatasheet.g:145:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:149:2: ( ( RULE_STRING ) )
            // InternalGenericDatasheet.g:150:2: ( RULE_STRING )
            {
            // InternalGenericDatasheet.g:150:2: ( RULE_STRING )
            // InternalGenericDatasheet.g:151:3: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:161:1: entryRuleSpdxLicense : ruleSpdxLicense EOF ;
    public final void entryRuleSpdxLicense() throws RecognitionException {
        try {
            // InternalGenericDatasheet.g:162:1: ( ruleSpdxLicense EOF )
            // InternalGenericDatasheet.g:163:1: ruleSpdxLicense EOF
            {
             before(grammarAccess.getSpdxLicenseRule()); 
            pushFollow(FOLLOW_2);
            ruleSpdxLicense();

            state._fsp--;

             after(grammarAccess.getSpdxLicenseRule()); 
            match(input,EOF,FOLLOW_1); 

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
    // InternalGenericDatasheet.g:170:1: ruleSpdxLicense : ( ( rule__SpdxLicense__Group__0 ) ) ;
    public final void ruleSpdxLicense() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:174:2: ( ( ( rule__SpdxLicense__Group__0 ) ) )
            // InternalGenericDatasheet.g:175:2: ( ( rule__SpdxLicense__Group__0 ) )
            {
            // InternalGenericDatasheet.g:175:2: ( ( rule__SpdxLicense__Group__0 ) )
            // InternalGenericDatasheet.g:176:3: ( rule__SpdxLicense__Group__0 )
            {
             before(grammarAccess.getSpdxLicenseAccess().getGroup()); 
            // InternalGenericDatasheet.g:177:3: ( rule__SpdxLicense__Group__0 )
            // InternalGenericDatasheet.g:177:4: rule__SpdxLicense__Group__0
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:186:1: entryRuleProprietaryLicense : ruleProprietaryLicense EOF ;
    public final void entryRuleProprietaryLicense() throws RecognitionException {
        try {
            // InternalGenericDatasheet.g:187:1: ( ruleProprietaryLicense EOF )
            // InternalGenericDatasheet.g:188:1: ruleProprietaryLicense EOF
            {
             before(grammarAccess.getProprietaryLicenseRule()); 
            pushFollow(FOLLOW_2);
            ruleProprietaryLicense();

            state._fsp--;

             after(grammarAccess.getProprietaryLicenseRule()); 
            match(input,EOF,FOLLOW_1); 

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
    // InternalGenericDatasheet.g:195:1: ruleProprietaryLicense : ( ( rule__ProprietaryLicense__Group__0 ) ) ;
    public final void ruleProprietaryLicense() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:199:2: ( ( ( rule__ProprietaryLicense__Group__0 ) ) )
            // InternalGenericDatasheet.g:200:2: ( ( rule__ProprietaryLicense__Group__0 ) )
            {
            // InternalGenericDatasheet.g:200:2: ( ( rule__ProprietaryLicense__Group__0 ) )
            // InternalGenericDatasheet.g:201:3: ( rule__ProprietaryLicense__Group__0 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getGroup()); 
            // InternalGenericDatasheet.g:202:3: ( rule__ProprietaryLicense__Group__0 )
            // InternalGenericDatasheet.g:202:4: rule__ProprietaryLicense__Group__0
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:211:1: ruleTRL : ( ( rule__TRL__Alternatives ) ) ;
    public final void ruleTRL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:215:1: ( ( ( rule__TRL__Alternatives ) ) )
            // InternalGenericDatasheet.g:216:2: ( ( rule__TRL__Alternatives ) )
            {
            // InternalGenericDatasheet.g:216:2: ( ( rule__TRL__Alternatives ) )
            // InternalGenericDatasheet.g:217:3: ( rule__TRL__Alternatives )
            {
             before(grammarAccess.getTRLAccess().getAlternatives()); 
            // InternalGenericDatasheet.g:218:3: ( rule__TRL__Alternatives )
            // InternalGenericDatasheet.g:218:4: rule__TRL__Alternatives
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:226:1: rule__AbstractLicense__Alternatives : ( ( ruleSpdxLicense ) | ( ruleProprietaryLicense ) );
    public final void rule__AbstractLicense__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:230:1: ( ( ruleSpdxLicense ) | ( ruleProprietaryLicense ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==30) ) {
                alt1=1;
            }
            else if ( (LA1_0==33) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGenericDatasheet.g:231:2: ( ruleSpdxLicense )
                    {
                    // InternalGenericDatasheet.g:231:2: ( ruleSpdxLicense )
                    // InternalGenericDatasheet.g:232:3: ruleSpdxLicense
                    {
                     before(grammarAccess.getAbstractLicenseAccess().getSpdxLicenseParserRuleCall_0()); 
                    pushFollow(FOLLOW_1);
                    ruleSpdxLicense();

                    state._fsp--;

                     after(grammarAccess.getAbstractLicenseAccess().getSpdxLicenseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGenericDatasheet.g:237:2: ( ruleProprietaryLicense )
                    {
                    // InternalGenericDatasheet.g:237:2: ( ruleProprietaryLicense )
                    // InternalGenericDatasheet.g:238:3: ruleProprietaryLicense
                    {
                     before(grammarAccess.getAbstractLicenseAccess().getProprietaryLicenseParserRuleCall_1()); 
                    pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:247:1: rule__TRL__Alternatives : ( ( ( 'Level1' ) ) | ( ( 'Level2' ) ) | ( ( 'Level3' ) ) | ( ( 'Level4' ) ) | ( ( 'Level5' ) ) | ( ( 'Level6' ) ) | ( ( 'Level7' ) ) | ( ( 'Level8' ) ) | ( ( 'Level9' ) ) | ( ( 'Undefined' ) ) );
    public final void rule__TRL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:251:1: ( ( ( 'Level1' ) ) | ( ( 'Level2' ) ) | ( ( 'Level3' ) ) | ( ( 'Level4' ) ) | ( ( 'Level5' ) ) | ( ( 'Level6' ) ) | ( ( 'Level7' ) ) | ( ( 'Level8' ) ) | ( ( 'Level9' ) ) | ( ( 'Undefined' ) ) )
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
                    // InternalGenericDatasheet.g:252:2: ( ( 'Level1' ) )
                    {
                    // InternalGenericDatasheet.g:252:2: ( ( 'Level1' ) )
                    // InternalGenericDatasheet.g:253:3: ( 'Level1' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0()); 
                    // InternalGenericDatasheet.g:254:3: ( 'Level1' )
                    // InternalGenericDatasheet.g:254:4: 'Level1'
                    {
                    match(input,12,FOLLOW_1); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGenericDatasheet.g:258:2: ( ( 'Level2' ) )
                    {
                    // InternalGenericDatasheet.g:258:2: ( ( 'Level2' ) )
                    // InternalGenericDatasheet.g:259:3: ( 'Level2' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1()); 
                    // InternalGenericDatasheet.g:260:3: ( 'Level2' )
                    // InternalGenericDatasheet.g:260:4: 'Level2'
                    {
                    match(input,13,FOLLOW_1); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGenericDatasheet.g:264:2: ( ( 'Level3' ) )
                    {
                    // InternalGenericDatasheet.g:264:2: ( ( 'Level3' ) )
                    // InternalGenericDatasheet.g:265:3: ( 'Level3' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2()); 
                    // InternalGenericDatasheet.g:266:3: ( 'Level3' )
                    // InternalGenericDatasheet.g:266:4: 'Level3'
                    {
                    match(input,14,FOLLOW_1); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGenericDatasheet.g:270:2: ( ( 'Level4' ) )
                    {
                    // InternalGenericDatasheet.g:270:2: ( ( 'Level4' ) )
                    // InternalGenericDatasheet.g:271:3: ( 'Level4' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3()); 
                    // InternalGenericDatasheet.g:272:3: ( 'Level4' )
                    // InternalGenericDatasheet.g:272:4: 'Level4'
                    {
                    match(input,15,FOLLOW_1); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGenericDatasheet.g:276:2: ( ( 'Level5' ) )
                    {
                    // InternalGenericDatasheet.g:276:2: ( ( 'Level5' ) )
                    // InternalGenericDatasheet.g:277:3: ( 'Level5' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4()); 
                    // InternalGenericDatasheet.g:278:3: ( 'Level5' )
                    // InternalGenericDatasheet.g:278:4: 'Level5'
                    {
                    match(input,16,FOLLOW_1); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGenericDatasheet.g:282:2: ( ( 'Level6' ) )
                    {
                    // InternalGenericDatasheet.g:282:2: ( ( 'Level6' ) )
                    // InternalGenericDatasheet.g:283:3: ( 'Level6' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5()); 
                    // InternalGenericDatasheet.g:284:3: ( 'Level6' )
                    // InternalGenericDatasheet.g:284:4: 'Level6'
                    {
                    match(input,17,FOLLOW_1); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGenericDatasheet.g:288:2: ( ( 'Level7' ) )
                    {
                    // InternalGenericDatasheet.g:288:2: ( ( 'Level7' ) )
                    // InternalGenericDatasheet.g:289:3: ( 'Level7' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6()); 
                    // InternalGenericDatasheet.g:290:3: ( 'Level7' )
                    // InternalGenericDatasheet.g:290:4: 'Level7'
                    {
                    match(input,18,FOLLOW_1); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGenericDatasheet.g:294:2: ( ( 'Level8' ) )
                    {
                    // InternalGenericDatasheet.g:294:2: ( ( 'Level8' ) )
                    // InternalGenericDatasheet.g:295:3: ( 'Level8' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7()); 
                    // InternalGenericDatasheet.g:296:3: ( 'Level8' )
                    // InternalGenericDatasheet.g:296:4: 'Level8'
                    {
                    match(input,19,FOLLOW_1); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalGenericDatasheet.g:300:2: ( ( 'Level9' ) )
                    {
                    // InternalGenericDatasheet.g:300:2: ( ( 'Level9' ) )
                    // InternalGenericDatasheet.g:301:3: ( 'Level9' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8()); 
                    // InternalGenericDatasheet.g:302:3: ( 'Level9' )
                    // InternalGenericDatasheet.g:302:4: 'Level9'
                    {
                    match(input,20,FOLLOW_1); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalGenericDatasheet.g:306:2: ( ( 'Undefined' ) )
                    {
                    // InternalGenericDatasheet.g:306:2: ( ( 'Undefined' ) )
                    // InternalGenericDatasheet.g:307:3: ( 'Undefined' )
                    {
                     before(grammarAccess.getTRLAccess().getUNDEFINEDEnumLiteralDeclaration_9()); 
                    // InternalGenericDatasheet.g:308:3: ( 'Undefined' )
                    // InternalGenericDatasheet.g:308:4: 'Undefined'
                    {
                    match(input,21,FOLLOW_1); 

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


    // $ANTLR start "rule__GenericDatasheet__Group_0__0"
    // InternalGenericDatasheet.g:316:1: rule__GenericDatasheet__Group_0__0 : rule__GenericDatasheet__Group_0__0__Impl rule__GenericDatasheet__Group_0__1 ;
    public final void rule__GenericDatasheet__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:320:1: ( rule__GenericDatasheet__Group_0__0__Impl rule__GenericDatasheet__Group_0__1 )
            // InternalGenericDatasheet.g:321:2: rule__GenericDatasheet__Group_0__0__Impl rule__GenericDatasheet__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__GenericDatasheet__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:328:1: rule__GenericDatasheet__Group_0__0__Impl : ( 'baseURI' ) ;
    public final void rule__GenericDatasheet__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:332:1: ( ( 'baseURI' ) )
            // InternalGenericDatasheet.g:333:1: ( 'baseURI' )
            {
            // InternalGenericDatasheet.g:333:1: ( 'baseURI' )
            // InternalGenericDatasheet.g:334:2: 'baseURI'
            {
             before(grammarAccess.getGenericDatasheetAccess().getBaseURIKeyword_0_0()); 
            match(input,22,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:343:1: rule__GenericDatasheet__Group_0__1 : rule__GenericDatasheet__Group_0__1__Impl rule__GenericDatasheet__Group_0__2 ;
    public final void rule__GenericDatasheet__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:347:1: ( rule__GenericDatasheet__Group_0__1__Impl rule__GenericDatasheet__Group_0__2 )
            // InternalGenericDatasheet.g:348:2: rule__GenericDatasheet__Group_0__1__Impl rule__GenericDatasheet__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__GenericDatasheet__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:355:1: rule__GenericDatasheet__Group_0__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:359:1: ( ( ( ':' )? ) )
            // InternalGenericDatasheet.g:360:1: ( ( ':' )? )
            {
            // InternalGenericDatasheet.g:360:1: ( ( ':' )? )
            // InternalGenericDatasheet.g:361:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_0_1()); 
            // InternalGenericDatasheet.g:362:2: ( ':' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGenericDatasheet.g:362:3: ':'
                    {
                    match(input,23,FOLLOW_1); 

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
    // InternalGenericDatasheet.g:370:1: rule__GenericDatasheet__Group_0__2 : rule__GenericDatasheet__Group_0__2__Impl ;
    public final void rule__GenericDatasheet__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:374:1: ( rule__GenericDatasheet__Group_0__2__Impl )
            // InternalGenericDatasheet.g:375:2: rule__GenericDatasheet__Group_0__2__Impl
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:381:1: rule__GenericDatasheet__Group_0__2__Impl : ( ( rule__GenericDatasheet__BaseURIAssignment_0_2 ) ) ;
    public final void rule__GenericDatasheet__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:385:1: ( ( ( rule__GenericDatasheet__BaseURIAssignment_0_2 ) ) )
            // InternalGenericDatasheet.g:386:1: ( ( rule__GenericDatasheet__BaseURIAssignment_0_2 ) )
            {
            // InternalGenericDatasheet.g:386:1: ( ( rule__GenericDatasheet__BaseURIAssignment_0_2 ) )
            // InternalGenericDatasheet.g:387:2: ( rule__GenericDatasheet__BaseURIAssignment_0_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getBaseURIAssignment_0_2()); 
            // InternalGenericDatasheet.g:388:2: ( rule__GenericDatasheet__BaseURIAssignment_0_2 )
            // InternalGenericDatasheet.g:388:3: rule__GenericDatasheet__BaseURIAssignment_0_2
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:397:1: rule__GenericDatasheet__Group_1__0 : rule__GenericDatasheet__Group_1__0__Impl rule__GenericDatasheet__Group_1__1 ;
    public final void rule__GenericDatasheet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:401:1: ( rule__GenericDatasheet__Group_1__0__Impl rule__GenericDatasheet__Group_1__1 )
            // InternalGenericDatasheet.g:402:2: rule__GenericDatasheet__Group_1__0__Impl rule__GenericDatasheet__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__GenericDatasheet__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:409:1: rule__GenericDatasheet__Group_1__0__Impl : ( 'shortDescription' ) ;
    public final void rule__GenericDatasheet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:413:1: ( ( 'shortDescription' ) )
            // InternalGenericDatasheet.g:414:1: ( 'shortDescription' )
            {
            // InternalGenericDatasheet.g:414:1: ( 'shortDescription' )
            // InternalGenericDatasheet.g:415:2: 'shortDescription'
            {
             before(grammarAccess.getGenericDatasheetAccess().getShortDescriptionKeyword_1_0()); 
            match(input,24,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:424:1: rule__GenericDatasheet__Group_1__1 : rule__GenericDatasheet__Group_1__1__Impl rule__GenericDatasheet__Group_1__2 ;
    public final void rule__GenericDatasheet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:428:1: ( rule__GenericDatasheet__Group_1__1__Impl rule__GenericDatasheet__Group_1__2 )
            // InternalGenericDatasheet.g:429:2: rule__GenericDatasheet__Group_1__1__Impl rule__GenericDatasheet__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__GenericDatasheet__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:436:1: rule__GenericDatasheet__Group_1__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:440:1: ( ( ( ':' )? ) )
            // InternalGenericDatasheet.g:441:1: ( ( ':' )? )
            {
            // InternalGenericDatasheet.g:441:1: ( ( ':' )? )
            // InternalGenericDatasheet.g:442:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_1_1()); 
            // InternalGenericDatasheet.g:443:2: ( ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGenericDatasheet.g:443:3: ':'
                    {
                    match(input,23,FOLLOW_1); 

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
    // InternalGenericDatasheet.g:451:1: rule__GenericDatasheet__Group_1__2 : rule__GenericDatasheet__Group_1__2__Impl ;
    public final void rule__GenericDatasheet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:455:1: ( rule__GenericDatasheet__Group_1__2__Impl )
            // InternalGenericDatasheet.g:456:2: rule__GenericDatasheet__Group_1__2__Impl
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:462:1: rule__GenericDatasheet__Group_1__2__Impl : ( ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 ) ) ;
    public final void rule__GenericDatasheet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:466:1: ( ( ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 ) ) )
            // InternalGenericDatasheet.g:467:1: ( ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 ) )
            {
            // InternalGenericDatasheet.g:467:1: ( ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 ) )
            // InternalGenericDatasheet.g:468:2: ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getShortDescriptionAssignment_1_2()); 
            // InternalGenericDatasheet.g:469:2: ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 )
            // InternalGenericDatasheet.g:469:3: rule__GenericDatasheet__ShortDescriptionAssignment_1_2
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:478:1: rule__GenericDatasheet__Group_2__0 : rule__GenericDatasheet__Group_2__0__Impl rule__GenericDatasheet__Group_2__1 ;
    public final void rule__GenericDatasheet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:482:1: ( rule__GenericDatasheet__Group_2__0__Impl rule__GenericDatasheet__Group_2__1 )
            // InternalGenericDatasheet.g:483:2: rule__GenericDatasheet__Group_2__0__Impl rule__GenericDatasheet__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__GenericDatasheet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:490:1: rule__GenericDatasheet__Group_2__0__Impl : ( 'longDescription' ) ;
    public final void rule__GenericDatasheet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:494:1: ( ( 'longDescription' ) )
            // InternalGenericDatasheet.g:495:1: ( 'longDescription' )
            {
            // InternalGenericDatasheet.g:495:1: ( 'longDescription' )
            // InternalGenericDatasheet.g:496:2: 'longDescription'
            {
             before(grammarAccess.getGenericDatasheetAccess().getLongDescriptionKeyword_2_0()); 
            match(input,25,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:505:1: rule__GenericDatasheet__Group_2__1 : rule__GenericDatasheet__Group_2__1__Impl rule__GenericDatasheet__Group_2__2 ;
    public final void rule__GenericDatasheet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:509:1: ( rule__GenericDatasheet__Group_2__1__Impl rule__GenericDatasheet__Group_2__2 )
            // InternalGenericDatasheet.g:510:2: rule__GenericDatasheet__Group_2__1__Impl rule__GenericDatasheet__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__GenericDatasheet__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:517:1: rule__GenericDatasheet__Group_2__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:521:1: ( ( ( ':' )? ) )
            // InternalGenericDatasheet.g:522:1: ( ( ':' )? )
            {
            // InternalGenericDatasheet.g:522:1: ( ( ':' )? )
            // InternalGenericDatasheet.g:523:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_2_1()); 
            // InternalGenericDatasheet.g:524:2: ( ':' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGenericDatasheet.g:524:3: ':'
                    {
                    match(input,23,FOLLOW_1); 

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
    // InternalGenericDatasheet.g:532:1: rule__GenericDatasheet__Group_2__2 : rule__GenericDatasheet__Group_2__2__Impl ;
    public final void rule__GenericDatasheet__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:536:1: ( rule__GenericDatasheet__Group_2__2__Impl )
            // InternalGenericDatasheet.g:537:2: rule__GenericDatasheet__Group_2__2__Impl
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:543:1: rule__GenericDatasheet__Group_2__2__Impl : ( ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 ) ) ;
    public final void rule__GenericDatasheet__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:547:1: ( ( ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 ) ) )
            // InternalGenericDatasheet.g:548:1: ( ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 ) )
            {
            // InternalGenericDatasheet.g:548:1: ( ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 ) )
            // InternalGenericDatasheet.g:549:2: ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getLongDescriptionAssignment_2_2()); 
            // InternalGenericDatasheet.g:550:2: ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 )
            // InternalGenericDatasheet.g:550:3: rule__GenericDatasheet__LongDescriptionAssignment_2_2
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:559:1: rule__GenericDatasheet__Group_3__0 : rule__GenericDatasheet__Group_3__0__Impl rule__GenericDatasheet__Group_3__1 ;
    public final void rule__GenericDatasheet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:563:1: ( rule__GenericDatasheet__Group_3__0__Impl rule__GenericDatasheet__Group_3__1 )
            // InternalGenericDatasheet.g:564:2: rule__GenericDatasheet__Group_3__0__Impl rule__GenericDatasheet__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__GenericDatasheet__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:571:1: rule__GenericDatasheet__Group_3__0__Impl : ( 'supplierDescription' ) ;
    public final void rule__GenericDatasheet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:575:1: ( ( 'supplierDescription' ) )
            // InternalGenericDatasheet.g:576:1: ( 'supplierDescription' )
            {
            // InternalGenericDatasheet.g:576:1: ( 'supplierDescription' )
            // InternalGenericDatasheet.g:577:2: 'supplierDescription'
            {
             before(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionKeyword_3_0()); 
            match(input,26,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:586:1: rule__GenericDatasheet__Group_3__1 : rule__GenericDatasheet__Group_3__1__Impl rule__GenericDatasheet__Group_3__2 ;
    public final void rule__GenericDatasheet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:590:1: ( rule__GenericDatasheet__Group_3__1__Impl rule__GenericDatasheet__Group_3__2 )
            // InternalGenericDatasheet.g:591:2: rule__GenericDatasheet__Group_3__1__Impl rule__GenericDatasheet__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__GenericDatasheet__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:598:1: rule__GenericDatasheet__Group_3__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:602:1: ( ( ( ':' )? ) )
            // InternalGenericDatasheet.g:603:1: ( ( ':' )? )
            {
            // InternalGenericDatasheet.g:603:1: ( ( ':' )? )
            // InternalGenericDatasheet.g:604:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_3_1()); 
            // InternalGenericDatasheet.g:605:2: ( ':' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGenericDatasheet.g:605:3: ':'
                    {
                    match(input,23,FOLLOW_1); 

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
    // InternalGenericDatasheet.g:613:1: rule__GenericDatasheet__Group_3__2 : rule__GenericDatasheet__Group_3__2__Impl ;
    public final void rule__GenericDatasheet__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:617:1: ( rule__GenericDatasheet__Group_3__2__Impl )
            // InternalGenericDatasheet.g:618:2: rule__GenericDatasheet__Group_3__2__Impl
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:624:1: rule__GenericDatasheet__Group_3__2__Impl : ( ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 ) ) ;
    public final void rule__GenericDatasheet__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:628:1: ( ( ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 ) ) )
            // InternalGenericDatasheet.g:629:1: ( ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 ) )
            {
            // InternalGenericDatasheet.g:629:1: ( ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 ) )
            // InternalGenericDatasheet.g:630:2: ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionAssignment_3_2()); 
            // InternalGenericDatasheet.g:631:2: ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 )
            // InternalGenericDatasheet.g:631:3: rule__GenericDatasheet__SupplierDescriptionAssignment_3_2
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:640:1: rule__GenericDatasheet__Group_4__0 : rule__GenericDatasheet__Group_4__0__Impl rule__GenericDatasheet__Group_4__1 ;
    public final void rule__GenericDatasheet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:644:1: ( rule__GenericDatasheet__Group_4__0__Impl rule__GenericDatasheet__Group_4__1 )
            // InternalGenericDatasheet.g:645:2: rule__GenericDatasheet__Group_4__0__Impl rule__GenericDatasheet__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__GenericDatasheet__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:652:1: rule__GenericDatasheet__Group_4__0__Impl : ( 'homepage' ) ;
    public final void rule__GenericDatasheet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:656:1: ( ( 'homepage' ) )
            // InternalGenericDatasheet.g:657:1: ( 'homepage' )
            {
            // InternalGenericDatasheet.g:657:1: ( 'homepage' )
            // InternalGenericDatasheet.g:658:2: 'homepage'
            {
             before(grammarAccess.getGenericDatasheetAccess().getHomepageKeyword_4_0()); 
            match(input,27,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:667:1: rule__GenericDatasheet__Group_4__1 : rule__GenericDatasheet__Group_4__1__Impl rule__GenericDatasheet__Group_4__2 ;
    public final void rule__GenericDatasheet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:671:1: ( rule__GenericDatasheet__Group_4__1__Impl rule__GenericDatasheet__Group_4__2 )
            // InternalGenericDatasheet.g:672:2: rule__GenericDatasheet__Group_4__1__Impl rule__GenericDatasheet__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__GenericDatasheet__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:679:1: rule__GenericDatasheet__Group_4__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:683:1: ( ( ( ':' )? ) )
            // InternalGenericDatasheet.g:684:1: ( ( ':' )? )
            {
            // InternalGenericDatasheet.g:684:1: ( ( ':' )? )
            // InternalGenericDatasheet.g:685:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_4_1()); 
            // InternalGenericDatasheet.g:686:2: ( ':' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGenericDatasheet.g:686:3: ':'
                    {
                    match(input,23,FOLLOW_1); 

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
    // InternalGenericDatasheet.g:694:1: rule__GenericDatasheet__Group_4__2 : rule__GenericDatasheet__Group_4__2__Impl ;
    public final void rule__GenericDatasheet__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:698:1: ( rule__GenericDatasheet__Group_4__2__Impl )
            // InternalGenericDatasheet.g:699:2: rule__GenericDatasheet__Group_4__2__Impl
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:705:1: rule__GenericDatasheet__Group_4__2__Impl : ( ( rule__GenericDatasheet__HomepageAssignment_4_2 ) ) ;
    public final void rule__GenericDatasheet__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:709:1: ( ( ( rule__GenericDatasheet__HomepageAssignment_4_2 ) ) )
            // InternalGenericDatasheet.g:710:1: ( ( rule__GenericDatasheet__HomepageAssignment_4_2 ) )
            {
            // InternalGenericDatasheet.g:710:1: ( ( rule__GenericDatasheet__HomepageAssignment_4_2 ) )
            // InternalGenericDatasheet.g:711:2: ( rule__GenericDatasheet__HomepageAssignment_4_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getHomepageAssignment_4_2()); 
            // InternalGenericDatasheet.g:712:2: ( rule__GenericDatasheet__HomepageAssignment_4_2 )
            // InternalGenericDatasheet.g:712:3: rule__GenericDatasheet__HomepageAssignment_4_2
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:721:1: rule__GenericDatasheet__Group_5__0 : rule__GenericDatasheet__Group_5__0__Impl rule__GenericDatasheet__Group_5__1 ;
    public final void rule__GenericDatasheet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:725:1: ( rule__GenericDatasheet__Group_5__0__Impl rule__GenericDatasheet__Group_5__1 )
            // InternalGenericDatasheet.g:726:2: rule__GenericDatasheet__Group_5__0__Impl rule__GenericDatasheet__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__GenericDatasheet__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:733:1: rule__GenericDatasheet__Group_5__0__Impl : ( 'trl' ) ;
    public final void rule__GenericDatasheet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:737:1: ( ( 'trl' ) )
            // InternalGenericDatasheet.g:738:1: ( 'trl' )
            {
            // InternalGenericDatasheet.g:738:1: ( 'trl' )
            // InternalGenericDatasheet.g:739:2: 'trl'
            {
             before(grammarAccess.getGenericDatasheetAccess().getTrlKeyword_5_0()); 
            match(input,28,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:748:1: rule__GenericDatasheet__Group_5__1 : rule__GenericDatasheet__Group_5__1__Impl rule__GenericDatasheet__Group_5__2 ;
    public final void rule__GenericDatasheet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:752:1: ( rule__GenericDatasheet__Group_5__1__Impl rule__GenericDatasheet__Group_5__2 )
            // InternalGenericDatasheet.g:753:2: rule__GenericDatasheet__Group_5__1__Impl rule__GenericDatasheet__Group_5__2
            {
            pushFollow(FOLLOW_5);
            rule__GenericDatasheet__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:760:1: rule__GenericDatasheet__Group_5__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:764:1: ( ( ( ':' )? ) )
            // InternalGenericDatasheet.g:765:1: ( ( ':' )? )
            {
            // InternalGenericDatasheet.g:765:1: ( ( ':' )? )
            // InternalGenericDatasheet.g:766:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_5_1()); 
            // InternalGenericDatasheet.g:767:2: ( ':' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGenericDatasheet.g:767:3: ':'
                    {
                    match(input,23,FOLLOW_1); 

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
    // InternalGenericDatasheet.g:775:1: rule__GenericDatasheet__Group_5__2 : rule__GenericDatasheet__Group_5__2__Impl ;
    public final void rule__GenericDatasheet__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:779:1: ( rule__GenericDatasheet__Group_5__2__Impl )
            // InternalGenericDatasheet.g:780:2: rule__GenericDatasheet__Group_5__2__Impl
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:786:1: rule__GenericDatasheet__Group_5__2__Impl : ( ( rule__GenericDatasheet__TrlAssignment_5_2 ) ) ;
    public final void rule__GenericDatasheet__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:790:1: ( ( ( rule__GenericDatasheet__TrlAssignment_5_2 ) ) )
            // InternalGenericDatasheet.g:791:1: ( ( rule__GenericDatasheet__TrlAssignment_5_2 ) )
            {
            // InternalGenericDatasheet.g:791:1: ( ( rule__GenericDatasheet__TrlAssignment_5_2 ) )
            // InternalGenericDatasheet.g:792:2: ( rule__GenericDatasheet__TrlAssignment_5_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getTrlAssignment_5_2()); 
            // InternalGenericDatasheet.g:793:2: ( rule__GenericDatasheet__TrlAssignment_5_2 )
            // InternalGenericDatasheet.g:793:3: rule__GenericDatasheet__TrlAssignment_5_2
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:802:1: rule__GenericDatasheet__Group_6__0 : rule__GenericDatasheet__Group_6__0__Impl rule__GenericDatasheet__Group_6__1 ;
    public final void rule__GenericDatasheet__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:806:1: ( rule__GenericDatasheet__Group_6__0__Impl rule__GenericDatasheet__Group_6__1 )
            // InternalGenericDatasheet.g:807:2: rule__GenericDatasheet__Group_6__0__Impl rule__GenericDatasheet__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__GenericDatasheet__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:814:1: rule__GenericDatasheet__Group_6__0__Impl : ( 'license' ) ;
    public final void rule__GenericDatasheet__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:818:1: ( ( 'license' ) )
            // InternalGenericDatasheet.g:819:1: ( 'license' )
            {
            // InternalGenericDatasheet.g:819:1: ( 'license' )
            // InternalGenericDatasheet.g:820:2: 'license'
            {
             before(grammarAccess.getGenericDatasheetAccess().getLicenseKeyword_6_0()); 
            match(input,29,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:829:1: rule__GenericDatasheet__Group_6__1 : rule__GenericDatasheet__Group_6__1__Impl rule__GenericDatasheet__Group_6__2 ;
    public final void rule__GenericDatasheet__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:833:1: ( rule__GenericDatasheet__Group_6__1__Impl rule__GenericDatasheet__Group_6__2 )
            // InternalGenericDatasheet.g:834:2: rule__GenericDatasheet__Group_6__1__Impl rule__GenericDatasheet__Group_6__2
            {
            pushFollow(FOLLOW_6);
            rule__GenericDatasheet__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:841:1: rule__GenericDatasheet__Group_6__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:845:1: ( ( ( ':' )? ) )
            // InternalGenericDatasheet.g:846:1: ( ( ':' )? )
            {
            // InternalGenericDatasheet.g:846:1: ( ( ':' )? )
            // InternalGenericDatasheet.g:847:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_6_1()); 
            // InternalGenericDatasheet.g:848:2: ( ':' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGenericDatasheet.g:848:3: ':'
                    {
                    match(input,23,FOLLOW_1); 

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
    // InternalGenericDatasheet.g:856:1: rule__GenericDatasheet__Group_6__2 : rule__GenericDatasheet__Group_6__2__Impl ;
    public final void rule__GenericDatasheet__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:860:1: ( rule__GenericDatasheet__Group_6__2__Impl )
            // InternalGenericDatasheet.g:861:2: rule__GenericDatasheet__Group_6__2__Impl
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:867:1: rule__GenericDatasheet__Group_6__2__Impl : ( ( rule__GenericDatasheet__LicenseAssignment_6_2 ) ) ;
    public final void rule__GenericDatasheet__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:871:1: ( ( ( rule__GenericDatasheet__LicenseAssignment_6_2 ) ) )
            // InternalGenericDatasheet.g:872:1: ( ( rule__GenericDatasheet__LicenseAssignment_6_2 ) )
            {
            // InternalGenericDatasheet.g:872:1: ( ( rule__GenericDatasheet__LicenseAssignment_6_2 ) )
            // InternalGenericDatasheet.g:873:2: ( rule__GenericDatasheet__LicenseAssignment_6_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getLicenseAssignment_6_2()); 
            // InternalGenericDatasheet.g:874:2: ( rule__GenericDatasheet__LicenseAssignment_6_2 )
            // InternalGenericDatasheet.g:874:3: rule__GenericDatasheet__LicenseAssignment_6_2
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:883:1: rule__SpdxLicense__Group__0 : rule__SpdxLicense__Group__0__Impl rule__SpdxLicense__Group__1 ;
    public final void rule__SpdxLicense__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:887:1: ( rule__SpdxLicense__Group__0__Impl rule__SpdxLicense__Group__1 )
            // InternalGenericDatasheet.g:888:2: rule__SpdxLicense__Group__0__Impl rule__SpdxLicense__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SpdxLicense__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:895:1: rule__SpdxLicense__Group__0__Impl : ( 'spdx' ) ;
    public final void rule__SpdxLicense__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:899:1: ( ( 'spdx' ) )
            // InternalGenericDatasheet.g:900:1: ( 'spdx' )
            {
            // InternalGenericDatasheet.g:900:1: ( 'spdx' )
            // InternalGenericDatasheet.g:901:2: 'spdx'
            {
             before(grammarAccess.getSpdxLicenseAccess().getSpdxKeyword_0()); 
            match(input,30,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:910:1: rule__SpdxLicense__Group__1 : rule__SpdxLicense__Group__1__Impl rule__SpdxLicense__Group__2 ;
    public final void rule__SpdxLicense__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:914:1: ( rule__SpdxLicense__Group__1__Impl rule__SpdxLicense__Group__2 )
            // InternalGenericDatasheet.g:915:2: rule__SpdxLicense__Group__1__Impl rule__SpdxLicense__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SpdxLicense__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:922:1: rule__SpdxLicense__Group__1__Impl : ( '(' ) ;
    public final void rule__SpdxLicense__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:926:1: ( ( '(' ) )
            // InternalGenericDatasheet.g:927:1: ( '(' )
            {
            // InternalGenericDatasheet.g:927:1: ( '(' )
            // InternalGenericDatasheet.g:928:2: '('
            {
             before(grammarAccess.getSpdxLicenseAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:937:1: rule__SpdxLicense__Group__2 : rule__SpdxLicense__Group__2__Impl rule__SpdxLicense__Group__3 ;
    public final void rule__SpdxLicense__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:941:1: ( rule__SpdxLicense__Group__2__Impl rule__SpdxLicense__Group__3 )
            // InternalGenericDatasheet.g:942:2: rule__SpdxLicense__Group__2__Impl rule__SpdxLicense__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__SpdxLicense__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:949:1: rule__SpdxLicense__Group__2__Impl : ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) ) ;
    public final void rule__SpdxLicense__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:953:1: ( ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) ) )
            // InternalGenericDatasheet.g:954:1: ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) )
            {
            // InternalGenericDatasheet.g:954:1: ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) )
            // InternalGenericDatasheet.g:955:2: ( rule__SpdxLicense__LicenseIDAssignment_2 )
            {
             before(grammarAccess.getSpdxLicenseAccess().getLicenseIDAssignment_2()); 
            // InternalGenericDatasheet.g:956:2: ( rule__SpdxLicense__LicenseIDAssignment_2 )
            // InternalGenericDatasheet.g:956:3: rule__SpdxLicense__LicenseIDAssignment_2
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:964:1: rule__SpdxLicense__Group__3 : rule__SpdxLicense__Group__3__Impl ;
    public final void rule__SpdxLicense__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:968:1: ( rule__SpdxLicense__Group__3__Impl )
            // InternalGenericDatasheet.g:969:2: rule__SpdxLicense__Group__3__Impl
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:975:1: rule__SpdxLicense__Group__3__Impl : ( ')' ) ;
    public final void rule__SpdxLicense__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:979:1: ( ( ')' ) )
            // InternalGenericDatasheet.g:980:1: ( ')' )
            {
            // InternalGenericDatasheet.g:980:1: ( ')' )
            // InternalGenericDatasheet.g:981:2: ')'
            {
             before(grammarAccess.getSpdxLicenseAccess().getRightParenthesisKeyword_3()); 
            match(input,32,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:991:1: rule__ProprietaryLicense__Group__0 : rule__ProprietaryLicense__Group__0__Impl rule__ProprietaryLicense__Group__1 ;
    public final void rule__ProprietaryLicense__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:995:1: ( rule__ProprietaryLicense__Group__0__Impl rule__ProprietaryLicense__Group__1 )
            // InternalGenericDatasheet.g:996:2: rule__ProprietaryLicense__Group__0__Impl rule__ProprietaryLicense__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ProprietaryLicense__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1003:1: rule__ProprietaryLicense__Group__0__Impl : ( () ) ;
    public final void rule__ProprietaryLicense__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1007:1: ( ( () ) )
            // InternalGenericDatasheet.g:1008:1: ( () )
            {
            // InternalGenericDatasheet.g:1008:1: ( () )
            // InternalGenericDatasheet.g:1009:2: ()
            {
             before(grammarAccess.getProprietaryLicenseAccess().getProprietaryLicenseAction_0()); 
            // InternalGenericDatasheet.g:1010:2: ()
            // InternalGenericDatasheet.g:1010:3: 
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
    // InternalGenericDatasheet.g:1018:1: rule__ProprietaryLicense__Group__1 : rule__ProprietaryLicense__Group__1__Impl rule__ProprietaryLicense__Group__2 ;
    public final void rule__ProprietaryLicense__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1022:1: ( rule__ProprietaryLicense__Group__1__Impl rule__ProprietaryLicense__Group__2 )
            // InternalGenericDatasheet.g:1023:2: rule__ProprietaryLicense__Group__1__Impl rule__ProprietaryLicense__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ProprietaryLicense__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1030:1: rule__ProprietaryLicense__Group__1__Impl : ( 'proprietary' ) ;
    public final void rule__ProprietaryLicense__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1034:1: ( ( 'proprietary' ) )
            // InternalGenericDatasheet.g:1035:1: ( 'proprietary' )
            {
            // InternalGenericDatasheet.g:1035:1: ( 'proprietary' )
            // InternalGenericDatasheet.g:1036:2: 'proprietary'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getProprietaryKeyword_1()); 
            match(input,33,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:1045:1: rule__ProprietaryLicense__Group__2 : rule__ProprietaryLicense__Group__2__Impl rule__ProprietaryLicense__Group__3 ;
    public final void rule__ProprietaryLicense__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1049:1: ( rule__ProprietaryLicense__Group__2__Impl rule__ProprietaryLicense__Group__3 )
            // InternalGenericDatasheet.g:1050:2: rule__ProprietaryLicense__Group__2__Impl rule__ProprietaryLicense__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ProprietaryLicense__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1057:1: rule__ProprietaryLicense__Group__2__Impl : ( '{' ) ;
    public final void rule__ProprietaryLicense__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1061:1: ( ( '{' ) )
            // InternalGenericDatasheet.g:1062:1: ( '{' )
            {
            // InternalGenericDatasheet.g:1062:1: ( '{' )
            // InternalGenericDatasheet.g:1063:2: '{'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:1072:1: rule__ProprietaryLicense__Group__3 : rule__ProprietaryLicense__Group__3__Impl rule__ProprietaryLicense__Group__4 ;
    public final void rule__ProprietaryLicense__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1076:1: ( rule__ProprietaryLicense__Group__3__Impl rule__ProprietaryLicense__Group__4 )
            // InternalGenericDatasheet.g:1077:2: rule__ProprietaryLicense__Group__3__Impl rule__ProprietaryLicense__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__ProprietaryLicense__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1084:1: rule__ProprietaryLicense__Group__3__Impl : ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) ) ;
    public final void rule__ProprietaryLicense__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1088:1: ( ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) ) )
            // InternalGenericDatasheet.g:1089:1: ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) )
            {
            // InternalGenericDatasheet.g:1089:1: ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) )
            // InternalGenericDatasheet.g:1090:2: ( rule__ProprietaryLicense__UnorderedGroup_3 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3()); 
            // InternalGenericDatasheet.g:1091:2: ( rule__ProprietaryLicense__UnorderedGroup_3 )
            // InternalGenericDatasheet.g:1091:3: rule__ProprietaryLicense__UnorderedGroup_3
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1099:1: rule__ProprietaryLicense__Group__4 : rule__ProprietaryLicense__Group__4__Impl ;
    public final void rule__ProprietaryLicense__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1103:1: ( rule__ProprietaryLicense__Group__4__Impl )
            // InternalGenericDatasheet.g:1104:2: rule__ProprietaryLicense__Group__4__Impl
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1110:1: rule__ProprietaryLicense__Group__4__Impl : ( '}' ) ;
    public final void rule__ProprietaryLicense__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1114:1: ( ( '}' ) )
            // InternalGenericDatasheet.g:1115:1: ( '}' )
            {
            // InternalGenericDatasheet.g:1115:1: ( '}' )
            // InternalGenericDatasheet.g:1116:2: '}'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:1126:1: rule__ProprietaryLicense__Group_3_0__0 : rule__ProprietaryLicense__Group_3_0__0__Impl rule__ProprietaryLicense__Group_3_0__1 ;
    public final void rule__ProprietaryLicense__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1130:1: ( rule__ProprietaryLicense__Group_3_0__0__Impl rule__ProprietaryLicense__Group_3_0__1 )
            // InternalGenericDatasheet.g:1131:2: rule__ProprietaryLicense__Group_3_0__0__Impl rule__ProprietaryLicense__Group_3_0__1
            {
            pushFollow(FOLLOW_3);
            rule__ProprietaryLicense__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1138:1: rule__ProprietaryLicense__Group_3_0__0__Impl : ( 'name' ) ;
    public final void rule__ProprietaryLicense__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1142:1: ( ( 'name' ) )
            // InternalGenericDatasheet.g:1143:1: ( 'name' )
            {
            // InternalGenericDatasheet.g:1143:1: ( 'name' )
            // InternalGenericDatasheet.g:1144:2: 'name'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getNameKeyword_3_0_0()); 
            match(input,36,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:1153:1: rule__ProprietaryLicense__Group_3_0__1 : rule__ProprietaryLicense__Group_3_0__1__Impl rule__ProprietaryLicense__Group_3_0__2 ;
    public final void rule__ProprietaryLicense__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1157:1: ( rule__ProprietaryLicense__Group_3_0__1__Impl rule__ProprietaryLicense__Group_3_0__2 )
            // InternalGenericDatasheet.g:1158:2: rule__ProprietaryLicense__Group_3_0__1__Impl rule__ProprietaryLicense__Group_3_0__2
            {
            pushFollow(FOLLOW_3);
            rule__ProprietaryLicense__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1165:1: rule__ProprietaryLicense__Group_3_0__1__Impl : ( ( ':' )? ) ;
    public final void rule__ProprietaryLicense__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1169:1: ( ( ( ':' )? ) )
            // InternalGenericDatasheet.g:1170:1: ( ( ':' )? )
            {
            // InternalGenericDatasheet.g:1170:1: ( ( ':' )? )
            // InternalGenericDatasheet.g:1171:2: ( ':' )?
            {
             before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_0_1()); 
            // InternalGenericDatasheet.g:1172:2: ( ':' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGenericDatasheet.g:1172:3: ':'
                    {
                    match(input,23,FOLLOW_1); 

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
    // InternalGenericDatasheet.g:1180:1: rule__ProprietaryLicense__Group_3_0__2 : rule__ProprietaryLicense__Group_3_0__2__Impl ;
    public final void rule__ProprietaryLicense__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1184:1: ( rule__ProprietaryLicense__Group_3_0__2__Impl )
            // InternalGenericDatasheet.g:1185:2: rule__ProprietaryLicense__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1191:1: rule__ProprietaryLicense__Group_3_0__2__Impl : ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) ) ;
    public final void rule__ProprietaryLicense__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1195:1: ( ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) ) )
            // InternalGenericDatasheet.g:1196:1: ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) )
            {
            // InternalGenericDatasheet.g:1196:1: ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) )
            // InternalGenericDatasheet.g:1197:2: ( rule__ProprietaryLicense__NameAssignment_3_0_2 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getNameAssignment_3_0_2()); 
            // InternalGenericDatasheet.g:1198:2: ( rule__ProprietaryLicense__NameAssignment_3_0_2 )
            // InternalGenericDatasheet.g:1198:3: rule__ProprietaryLicense__NameAssignment_3_0_2
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1207:1: rule__ProprietaryLicense__Group_3_1__0 : rule__ProprietaryLicense__Group_3_1__0__Impl rule__ProprietaryLicense__Group_3_1__1 ;
    public final void rule__ProprietaryLicense__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1211:1: ( rule__ProprietaryLicense__Group_3_1__0__Impl rule__ProprietaryLicense__Group_3_1__1 )
            // InternalGenericDatasheet.g:1212:2: rule__ProprietaryLicense__Group_3_1__0__Impl rule__ProprietaryLicense__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ProprietaryLicense__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1219:1: rule__ProprietaryLicense__Group_3_1__0__Impl : ( 'fullText' ) ;
    public final void rule__ProprietaryLicense__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1223:1: ( ( 'fullText' ) )
            // InternalGenericDatasheet.g:1224:1: ( 'fullText' )
            {
            // InternalGenericDatasheet.g:1224:1: ( 'fullText' )
            // InternalGenericDatasheet.g:1225:2: 'fullText'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getFullTextKeyword_3_1_0()); 
            match(input,37,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:1234:1: rule__ProprietaryLicense__Group_3_1__1 : rule__ProprietaryLicense__Group_3_1__1__Impl rule__ProprietaryLicense__Group_3_1__2 ;
    public final void rule__ProprietaryLicense__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1238:1: ( rule__ProprietaryLicense__Group_3_1__1__Impl rule__ProprietaryLicense__Group_3_1__2 )
            // InternalGenericDatasheet.g:1239:2: rule__ProprietaryLicense__Group_3_1__1__Impl rule__ProprietaryLicense__Group_3_1__2
            {
            pushFollow(FOLLOW_3);
            rule__ProprietaryLicense__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1246:1: rule__ProprietaryLicense__Group_3_1__1__Impl : ( ( ':' )? ) ;
    public final void rule__ProprietaryLicense__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1250:1: ( ( ( ':' )? ) )
            // InternalGenericDatasheet.g:1251:1: ( ( ':' )? )
            {
            // InternalGenericDatasheet.g:1251:1: ( ( ':' )? )
            // InternalGenericDatasheet.g:1252:2: ( ':' )?
            {
             before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_1_1()); 
            // InternalGenericDatasheet.g:1253:2: ( ':' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGenericDatasheet.g:1253:3: ':'
                    {
                    match(input,23,FOLLOW_1); 

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
    // InternalGenericDatasheet.g:1261:1: rule__ProprietaryLicense__Group_3_1__2 : rule__ProprietaryLicense__Group_3_1__2__Impl ;
    public final void rule__ProprietaryLicense__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1265:1: ( rule__ProprietaryLicense__Group_3_1__2__Impl )
            // InternalGenericDatasheet.g:1266:2: rule__ProprietaryLicense__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1272:1: rule__ProprietaryLicense__Group_3_1__2__Impl : ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) ) ;
    public final void rule__ProprietaryLicense__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1276:1: ( ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) ) )
            // InternalGenericDatasheet.g:1277:1: ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) )
            {
            // InternalGenericDatasheet.g:1277:1: ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) )
            // InternalGenericDatasheet.g:1278:2: ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getFullTextAssignment_3_1_2()); 
            // InternalGenericDatasheet.g:1279:2: ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 )
            // InternalGenericDatasheet.g:1279:3: rule__ProprietaryLicense__FullTextAssignment_3_1_2
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1288:1: rule__ProprietaryLicense__Group_3_2__0 : rule__ProprietaryLicense__Group_3_2__0__Impl rule__ProprietaryLicense__Group_3_2__1 ;
    public final void rule__ProprietaryLicense__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1292:1: ( rule__ProprietaryLicense__Group_3_2__0__Impl rule__ProprietaryLicense__Group_3_2__1 )
            // InternalGenericDatasheet.g:1293:2: rule__ProprietaryLicense__Group_3_2__0__Impl rule__ProprietaryLicense__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ProprietaryLicense__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1300:1: rule__ProprietaryLicense__Group_3_2__0__Impl : ( 'URL' ) ;
    public final void rule__ProprietaryLicense__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1304:1: ( ( 'URL' ) )
            // InternalGenericDatasheet.g:1305:1: ( 'URL' )
            {
            // InternalGenericDatasheet.g:1305:1: ( 'URL' )
            // InternalGenericDatasheet.g:1306:2: 'URL'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getURLKeyword_3_2_0()); 
            match(input,38,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:1315:1: rule__ProprietaryLicense__Group_3_2__1 : rule__ProprietaryLicense__Group_3_2__1__Impl rule__ProprietaryLicense__Group_3_2__2 ;
    public final void rule__ProprietaryLicense__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1319:1: ( rule__ProprietaryLicense__Group_3_2__1__Impl rule__ProprietaryLicense__Group_3_2__2 )
            // InternalGenericDatasheet.g:1320:2: rule__ProprietaryLicense__Group_3_2__1__Impl rule__ProprietaryLicense__Group_3_2__2
            {
            pushFollow(FOLLOW_3);
            rule__ProprietaryLicense__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1327:1: rule__ProprietaryLicense__Group_3_2__1__Impl : ( ( ':' )? ) ;
    public final void rule__ProprietaryLicense__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1331:1: ( ( ( ':' )? ) )
            // InternalGenericDatasheet.g:1332:1: ( ( ':' )? )
            {
            // InternalGenericDatasheet.g:1332:1: ( ( ':' )? )
            // InternalGenericDatasheet.g:1333:2: ( ':' )?
            {
             before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_2_1()); 
            // InternalGenericDatasheet.g:1334:2: ( ':' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGenericDatasheet.g:1334:3: ':'
                    {
                    match(input,23,FOLLOW_1); 

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
    // InternalGenericDatasheet.g:1342:1: rule__ProprietaryLicense__Group_3_2__2 : rule__ProprietaryLicense__Group_3_2__2__Impl ;
    public final void rule__ProprietaryLicense__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1346:1: ( rule__ProprietaryLicense__Group_3_2__2__Impl )
            // InternalGenericDatasheet.g:1347:2: rule__ProprietaryLicense__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1353:1: rule__ProprietaryLicense__Group_3_2__2__Impl : ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) ) ;
    public final void rule__ProprietaryLicense__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1357:1: ( ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) ) )
            // InternalGenericDatasheet.g:1358:1: ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) )
            {
            // InternalGenericDatasheet.g:1358:1: ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) )
            // InternalGenericDatasheet.g:1359:2: ( rule__ProprietaryLicense__UrlAssignment_3_2_2 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getUrlAssignment_3_2_2()); 
            // InternalGenericDatasheet.g:1360:2: ( rule__ProprietaryLicense__UrlAssignment_3_2_2 )
            // InternalGenericDatasheet.g:1360:3: rule__ProprietaryLicense__UrlAssignment_3_2_2
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1369:1: rule__GenericDatasheet__UnorderedGroup : rule__GenericDatasheet__UnorderedGroup__0 {...}?;
    public final void rule__GenericDatasheet__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
        	
        try {
            // InternalGenericDatasheet.g:1374:1: ( rule__GenericDatasheet__UnorderedGroup__0 {...}?)
            // InternalGenericDatasheet.g:1375:2: rule__GenericDatasheet__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1383:1: rule__GenericDatasheet__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) ) ) ;
    public final void rule__GenericDatasheet__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalGenericDatasheet.g:1388:1: ( ( ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) ) ) )
            // InternalGenericDatasheet.g:1389:3: ( ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) ) )
            {
            // InternalGenericDatasheet.g:1389:3: ( ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) ) )
            int alt13=7;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt13=2;
            }
            else if ( LA13_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt13=3;
            }
            else if ( LA13_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt13=4;
            }
            else if ( LA13_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt13=5;
            }
            else if ( LA13_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt13=6;
            }
            else if ( LA13_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt13=7;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGenericDatasheet.g:1390:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) )
                    {
                    // InternalGenericDatasheet.g:1390:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) )
                    // InternalGenericDatasheet.g:1391:4: {...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalGenericDatasheet.g:1391:110: ( ( ( rule__GenericDatasheet__Group_0__0 ) ) )
                    // InternalGenericDatasheet.g:1392:5: ( ( rule__GenericDatasheet__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalGenericDatasheet.g:1398:5: ( ( rule__GenericDatasheet__Group_0__0 ) )
                    // InternalGenericDatasheet.g:1399:6: ( rule__GenericDatasheet__Group_0__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_0()); 
                    // InternalGenericDatasheet.g:1400:6: ( rule__GenericDatasheet__Group_0__0 )
                    // InternalGenericDatasheet.g:1400:7: rule__GenericDatasheet__Group_0__0
                    {
                    pushFollow(FOLLOW_1);
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
                    // InternalGenericDatasheet.g:1405:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) )
                    {
                    // InternalGenericDatasheet.g:1405:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) )
                    // InternalGenericDatasheet.g:1406:4: {...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalGenericDatasheet.g:1406:110: ( ( ( rule__GenericDatasheet__Group_1__0 ) ) )
                    // InternalGenericDatasheet.g:1407:5: ( ( rule__GenericDatasheet__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalGenericDatasheet.g:1413:5: ( ( rule__GenericDatasheet__Group_1__0 ) )
                    // InternalGenericDatasheet.g:1414:6: ( rule__GenericDatasheet__Group_1__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_1()); 
                    // InternalGenericDatasheet.g:1415:6: ( rule__GenericDatasheet__Group_1__0 )
                    // InternalGenericDatasheet.g:1415:7: rule__GenericDatasheet__Group_1__0
                    {
                    pushFollow(FOLLOW_1);
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
                    // InternalGenericDatasheet.g:1420:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) )
                    {
                    // InternalGenericDatasheet.g:1420:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) )
                    // InternalGenericDatasheet.g:1421:4: {...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalGenericDatasheet.g:1421:110: ( ( ( rule__GenericDatasheet__Group_2__0 ) ) )
                    // InternalGenericDatasheet.g:1422:5: ( ( rule__GenericDatasheet__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalGenericDatasheet.g:1428:5: ( ( rule__GenericDatasheet__Group_2__0 ) )
                    // InternalGenericDatasheet.g:1429:6: ( rule__GenericDatasheet__Group_2__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_2()); 
                    // InternalGenericDatasheet.g:1430:6: ( rule__GenericDatasheet__Group_2__0 )
                    // InternalGenericDatasheet.g:1430:7: rule__GenericDatasheet__Group_2__0
                    {
                    pushFollow(FOLLOW_1);
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
                    // InternalGenericDatasheet.g:1435:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) )
                    {
                    // InternalGenericDatasheet.g:1435:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) )
                    // InternalGenericDatasheet.g:1436:4: {...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalGenericDatasheet.g:1436:110: ( ( ( rule__GenericDatasheet__Group_3__0 ) ) )
                    // InternalGenericDatasheet.g:1437:5: ( ( rule__GenericDatasheet__Group_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalGenericDatasheet.g:1443:5: ( ( rule__GenericDatasheet__Group_3__0 ) )
                    // InternalGenericDatasheet.g:1444:6: ( rule__GenericDatasheet__Group_3__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_3()); 
                    // InternalGenericDatasheet.g:1445:6: ( rule__GenericDatasheet__Group_3__0 )
                    // InternalGenericDatasheet.g:1445:7: rule__GenericDatasheet__Group_3__0
                    {
                    pushFollow(FOLLOW_1);
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
                    // InternalGenericDatasheet.g:1450:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) )
                    {
                    // InternalGenericDatasheet.g:1450:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) )
                    // InternalGenericDatasheet.g:1451:4: {...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalGenericDatasheet.g:1451:110: ( ( ( rule__GenericDatasheet__Group_4__0 ) ) )
                    // InternalGenericDatasheet.g:1452:5: ( ( rule__GenericDatasheet__Group_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4);
                    				

                    					selected = true;
                    				
                    // InternalGenericDatasheet.g:1458:5: ( ( rule__GenericDatasheet__Group_4__0 ) )
                    // InternalGenericDatasheet.g:1459:6: ( rule__GenericDatasheet__Group_4__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_4()); 
                    // InternalGenericDatasheet.g:1460:6: ( rule__GenericDatasheet__Group_4__0 )
                    // InternalGenericDatasheet.g:1460:7: rule__GenericDatasheet__Group_4__0
                    {
                    pushFollow(FOLLOW_1);
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
                    // InternalGenericDatasheet.g:1465:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) )
                    {
                    // InternalGenericDatasheet.g:1465:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) )
                    // InternalGenericDatasheet.g:1466:4: {...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalGenericDatasheet.g:1466:110: ( ( ( rule__GenericDatasheet__Group_5__0 ) ) )
                    // InternalGenericDatasheet.g:1467:5: ( ( rule__GenericDatasheet__Group_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5);
                    				

                    					selected = true;
                    				
                    // InternalGenericDatasheet.g:1473:5: ( ( rule__GenericDatasheet__Group_5__0 ) )
                    // InternalGenericDatasheet.g:1474:6: ( rule__GenericDatasheet__Group_5__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_5()); 
                    // InternalGenericDatasheet.g:1475:6: ( rule__GenericDatasheet__Group_5__0 )
                    // InternalGenericDatasheet.g:1475:7: rule__GenericDatasheet__Group_5__0
                    {
                    pushFollow(FOLLOW_1);
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
                    // InternalGenericDatasheet.g:1480:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) )
                    {
                    // InternalGenericDatasheet.g:1480:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) )
                    // InternalGenericDatasheet.g:1481:4: {...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6)");
                    }
                    // InternalGenericDatasheet.g:1481:110: ( ( ( rule__GenericDatasheet__Group_6__0 ) ) )
                    // InternalGenericDatasheet.g:1482:5: ( ( rule__GenericDatasheet__Group_6__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6);
                    				

                    					selected = true;
                    				
                    // InternalGenericDatasheet.g:1488:5: ( ( rule__GenericDatasheet__Group_6__0 ) )
                    // InternalGenericDatasheet.g:1489:6: ( rule__GenericDatasheet__Group_6__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_6()); 
                    // InternalGenericDatasheet.g:1490:6: ( rule__GenericDatasheet__Group_6__0 )
                    // InternalGenericDatasheet.g:1490:7: rule__GenericDatasheet__Group_6__0
                    {
                    pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1503:1: rule__GenericDatasheet__UnorderedGroup__0 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__1 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1507:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__1 )? )
            // InternalGenericDatasheet.g:1508:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_12);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalGenericDatasheet.g:1509:2: ( rule__GenericDatasheet__UnorderedGroup__1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt14=1;
            }
            else if ( LA14_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt14=1;
            }
            else if ( LA14_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt14=1;
            }
            else if ( LA14_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt14=1;
            }
            else if ( LA14_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt14=1;
            }
            else if ( LA14_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGenericDatasheet.g:1509:2: rule__GenericDatasheet__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1515:1: rule__GenericDatasheet__UnorderedGroup__1 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__2 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1519:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__2 )? )
            // InternalGenericDatasheet.g:1520:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_12);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalGenericDatasheet.g:1521:2: ( rule__GenericDatasheet__UnorderedGroup__2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt15=1;
            }
            else if ( LA15_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt15=1;
            }
            else if ( LA15_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt15=1;
            }
            else if ( LA15_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt15=1;
            }
            else if ( LA15_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt15=1;
            }
            else if ( LA15_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGenericDatasheet.g:1521:2: rule__GenericDatasheet__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1527:1: rule__GenericDatasheet__UnorderedGroup__2 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__3 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1531:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__3 )? )
            // InternalGenericDatasheet.g:1532:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_12);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalGenericDatasheet.g:1533:2: ( rule__GenericDatasheet__UnorderedGroup__3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt16=1;
            }
            else if ( LA16_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt16=1;
            }
            else if ( LA16_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt16=1;
            }
            else if ( LA16_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt16=1;
            }
            else if ( LA16_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt16=1;
            }
            else if ( LA16_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGenericDatasheet.g:1533:2: rule__GenericDatasheet__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1539:1: rule__GenericDatasheet__UnorderedGroup__3 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__4 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1543:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__4 )? )
            // InternalGenericDatasheet.g:1544:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_12);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalGenericDatasheet.g:1545:2: ( rule__GenericDatasheet__UnorderedGroup__4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt17=1;
            }
            else if ( LA17_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt17=1;
            }
            else if ( LA17_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt17=1;
            }
            else if ( LA17_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt17=1;
            }
            else if ( LA17_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt17=1;
            }
            else if ( LA17_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGenericDatasheet.g:1545:2: rule__GenericDatasheet__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1551:1: rule__GenericDatasheet__UnorderedGroup__4 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__5 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1555:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__5 )? )
            // InternalGenericDatasheet.g:1556:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_12);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalGenericDatasheet.g:1557:2: ( rule__GenericDatasheet__UnorderedGroup__5 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt18=1;
            }
            else if ( LA18_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt18=1;
            }
            else if ( LA18_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt18=1;
            }
            else if ( LA18_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt18=1;
            }
            else if ( LA18_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt18=1;
            }
            else if ( LA18_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGenericDatasheet.g:1557:2: rule__GenericDatasheet__UnorderedGroup__5
                    {
                    pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1563:1: rule__GenericDatasheet__UnorderedGroup__5 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__6 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1567:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__6 )? )
            // InternalGenericDatasheet.g:1568:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_12);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalGenericDatasheet.g:1569:2: ( rule__GenericDatasheet__UnorderedGroup__6 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt19=1;
            }
            else if ( LA19_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt19=1;
            }
            else if ( LA19_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt19=1;
            }
            else if ( LA19_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt19=1;
            }
            else if ( LA19_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt19=1;
            }
            else if ( LA19_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGenericDatasheet.g:1569:2: rule__GenericDatasheet__UnorderedGroup__6
                    {
                    pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1575:1: rule__GenericDatasheet__UnorderedGroup__6 : rule__GenericDatasheet__UnorderedGroup__Impl ;
    public final void rule__GenericDatasheet__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1579:1: ( rule__GenericDatasheet__UnorderedGroup__Impl )
            // InternalGenericDatasheet.g:1580:2: rule__GenericDatasheet__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1587:1: rule__ProprietaryLicense__UnorderedGroup_3 : rule__ProprietaryLicense__UnorderedGroup_3__0 {...}?;
    public final void rule__ProprietaryLicense__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
        	
        try {
            // InternalGenericDatasheet.g:1592:1: ( rule__ProprietaryLicense__UnorderedGroup_3__0 {...}?)
            // InternalGenericDatasheet.g:1593:2: rule__ProprietaryLicense__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1601:1: rule__ProprietaryLicense__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalGenericDatasheet.g:1606:1: ( ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) ) )
            // InternalGenericDatasheet.g:1607:3: ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) )
            {
            // InternalGenericDatasheet.g:1607:3: ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                alt20=2;
            }
            else if ( LA20_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                alt20=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalGenericDatasheet.g:1608:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) )
                    {
                    // InternalGenericDatasheet.g:1608:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) )
                    // InternalGenericDatasheet.g:1609:4: {...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ProprietaryLicense__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalGenericDatasheet.g:1609:114: ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) )
                    // InternalGenericDatasheet.g:1610:5: ( ( rule__ProprietaryLicense__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalGenericDatasheet.g:1616:5: ( ( rule__ProprietaryLicense__Group_3_0__0 ) )
                    // InternalGenericDatasheet.g:1617:6: ( rule__ProprietaryLicense__Group_3_0__0 )
                    {
                     before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_0()); 
                    // InternalGenericDatasheet.g:1618:6: ( rule__ProprietaryLicense__Group_3_0__0 )
                    // InternalGenericDatasheet.g:1618:7: rule__ProprietaryLicense__Group_3_0__0
                    {
                    pushFollow(FOLLOW_1);
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
                    // InternalGenericDatasheet.g:1623:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) )
                    {
                    // InternalGenericDatasheet.g:1623:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) )
                    // InternalGenericDatasheet.g:1624:4: {...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ProprietaryLicense__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalGenericDatasheet.g:1624:114: ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) )
                    // InternalGenericDatasheet.g:1625:5: ( ( rule__ProprietaryLicense__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalGenericDatasheet.g:1631:5: ( ( rule__ProprietaryLicense__Group_3_1__0 ) )
                    // InternalGenericDatasheet.g:1632:6: ( rule__ProprietaryLicense__Group_3_1__0 )
                    {
                     before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_1()); 
                    // InternalGenericDatasheet.g:1633:6: ( rule__ProprietaryLicense__Group_3_1__0 )
                    // InternalGenericDatasheet.g:1633:7: rule__ProprietaryLicense__Group_3_1__0
                    {
                    pushFollow(FOLLOW_1);
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
                    // InternalGenericDatasheet.g:1638:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) )
                    {
                    // InternalGenericDatasheet.g:1638:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) )
                    // InternalGenericDatasheet.g:1639:4: {...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ProprietaryLicense__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalGenericDatasheet.g:1639:114: ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) )
                    // InternalGenericDatasheet.g:1640:5: ( ( rule__ProprietaryLicense__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalGenericDatasheet.g:1646:5: ( ( rule__ProprietaryLicense__Group_3_2__0 ) )
                    // InternalGenericDatasheet.g:1647:6: ( rule__ProprietaryLicense__Group_3_2__0 )
                    {
                     before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_2()); 
                    // InternalGenericDatasheet.g:1648:6: ( rule__ProprietaryLicense__Group_3_2__0 )
                    // InternalGenericDatasheet.g:1648:7: rule__ProprietaryLicense__Group_3_2__0
                    {
                    pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1661:1: rule__ProprietaryLicense__UnorderedGroup_3__0 : rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__1 )? ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1665:1: ( rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__1 )? )
            // InternalGenericDatasheet.g:1666:2: rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_13);
            rule__ProprietaryLicense__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalGenericDatasheet.g:1667:2: ( rule__ProprietaryLicense__UnorderedGroup_3__1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                alt21=1;
            }
            else if ( LA21_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGenericDatasheet.g:1667:2: rule__ProprietaryLicense__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1673:1: rule__ProprietaryLicense__UnorderedGroup_3__1 : rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__2 )? ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1677:1: ( rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__2 )? )
            // InternalGenericDatasheet.g:1678:2: rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_13);
            rule__ProprietaryLicense__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalGenericDatasheet.g:1679:2: ( rule__ProprietaryLicense__UnorderedGroup_3__2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGenericDatasheet.g:1679:2: rule__ProprietaryLicense__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1685:1: rule__ProprietaryLicense__UnorderedGroup_3__2 : rule__ProprietaryLicense__UnorderedGroup_3__Impl ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1689:1: ( rule__ProprietaryLicense__UnorderedGroup_3__Impl )
            // InternalGenericDatasheet.g:1690:2: rule__ProprietaryLicense__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_1);
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


    // $ANTLR start "rule__GenericDatasheet__BaseURIAssignment_0_2"
    // InternalGenericDatasheet.g:1697:1: rule__GenericDatasheet__BaseURIAssignment_0_2 : ( ruleEString ) ;
    public final void rule__GenericDatasheet__BaseURIAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1701:1: ( ( ruleEString ) )
            // InternalGenericDatasheet.g:1702:2: ( ruleEString )
            {
            // InternalGenericDatasheet.g:1702:2: ( ruleEString )
            // InternalGenericDatasheet.g:1703:3: ruleEString
            {
             before(grammarAccess.getGenericDatasheetAccess().getBaseURIEStringParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1712:1: rule__GenericDatasheet__ShortDescriptionAssignment_1_2 : ( ruleEString ) ;
    public final void rule__GenericDatasheet__ShortDescriptionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1716:1: ( ( ruleEString ) )
            // InternalGenericDatasheet.g:1717:2: ( ruleEString )
            {
            // InternalGenericDatasheet.g:1717:2: ( ruleEString )
            // InternalGenericDatasheet.g:1718:3: ruleEString
            {
             before(grammarAccess.getGenericDatasheetAccess().getShortDescriptionEStringParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1727:1: rule__GenericDatasheet__LongDescriptionAssignment_2_2 : ( RULE_TEXT_BLOCK ) ;
    public final void rule__GenericDatasheet__LongDescriptionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1731:1: ( ( RULE_TEXT_BLOCK ) )
            // InternalGenericDatasheet.g:1732:2: ( RULE_TEXT_BLOCK )
            {
            // InternalGenericDatasheet.g:1732:2: ( RULE_TEXT_BLOCK )
            // InternalGenericDatasheet.g:1733:3: RULE_TEXT_BLOCK
            {
             before(grammarAccess.getGenericDatasheetAccess().getLongDescriptionTEXT_BLOCKTerminalRuleCall_2_2_0()); 
            match(input,RULE_TEXT_BLOCK,FOLLOW_1); 
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
    // InternalGenericDatasheet.g:1742:1: rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 : ( ruleEString ) ;
    public final void rule__GenericDatasheet__SupplierDescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1746:1: ( ( ruleEString ) )
            // InternalGenericDatasheet.g:1747:2: ( ruleEString )
            {
            // InternalGenericDatasheet.g:1747:2: ( ruleEString )
            // InternalGenericDatasheet.g:1748:3: ruleEString
            {
             before(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionEStringParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1757:1: rule__GenericDatasheet__HomepageAssignment_4_2 : ( ruleEString ) ;
    public final void rule__GenericDatasheet__HomepageAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1761:1: ( ( ruleEString ) )
            // InternalGenericDatasheet.g:1762:2: ( ruleEString )
            {
            // InternalGenericDatasheet.g:1762:2: ( ruleEString )
            // InternalGenericDatasheet.g:1763:3: ruleEString
            {
             before(grammarAccess.getGenericDatasheetAccess().getHomepageEStringParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1772:1: rule__GenericDatasheet__TrlAssignment_5_2 : ( ruleTRL ) ;
    public final void rule__GenericDatasheet__TrlAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1776:1: ( ( ruleTRL ) )
            // InternalGenericDatasheet.g:1777:2: ( ruleTRL )
            {
            // InternalGenericDatasheet.g:1777:2: ( ruleTRL )
            // InternalGenericDatasheet.g:1778:3: ruleTRL
            {
             before(grammarAccess.getGenericDatasheetAccess().getTrlTRLEnumRuleCall_5_2_0()); 
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1787:1: rule__GenericDatasheet__LicenseAssignment_6_2 : ( ruleAbstractLicense ) ;
    public final void rule__GenericDatasheet__LicenseAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1791:1: ( ( ruleAbstractLicense ) )
            // InternalGenericDatasheet.g:1792:2: ( ruleAbstractLicense )
            {
            // InternalGenericDatasheet.g:1792:2: ( ruleAbstractLicense )
            // InternalGenericDatasheet.g:1793:3: ruleAbstractLicense
            {
             before(grammarAccess.getGenericDatasheetAccess().getLicenseAbstractLicenseParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1802:1: rule__SpdxLicense__LicenseIDAssignment_2 : ( ruleEString ) ;
    public final void rule__SpdxLicense__LicenseIDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1806:1: ( ( ruleEString ) )
            // InternalGenericDatasheet.g:1807:2: ( ruleEString )
            {
            // InternalGenericDatasheet.g:1807:2: ( ruleEString )
            // InternalGenericDatasheet.g:1808:3: ruleEString
            {
             before(grammarAccess.getSpdxLicenseAccess().getLicenseIDEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1817:1: rule__ProprietaryLicense__NameAssignment_3_0_2 : ( ruleEString ) ;
    public final void rule__ProprietaryLicense__NameAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1821:1: ( ( ruleEString ) )
            // InternalGenericDatasheet.g:1822:2: ( ruleEString )
            {
            // InternalGenericDatasheet.g:1822:2: ( ruleEString )
            // InternalGenericDatasheet.g:1823:3: ruleEString
            {
             before(grammarAccess.getProprietaryLicenseAccess().getNameEStringParserRuleCall_3_0_2_0()); 
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1832:1: rule__ProprietaryLicense__FullTextAssignment_3_1_2 : ( ruleEString ) ;
    public final void rule__ProprietaryLicense__FullTextAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1836:1: ( ( ruleEString ) )
            // InternalGenericDatasheet.g:1837:2: ( ruleEString )
            {
            // InternalGenericDatasheet.g:1837:2: ( ruleEString )
            // InternalGenericDatasheet.g:1838:3: ruleEString
            {
             before(grammarAccess.getProprietaryLicenseAccess().getFullTextEStringParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:1847:1: rule__ProprietaryLicense__UrlAssignment_3_2_2 : ( ruleEString ) ;
    public final void rule__ProprietaryLicense__UrlAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenericDatasheet.g:1851:1: ( ( ruleEString ) )
            // InternalGenericDatasheet.g:1852:2: ( ruleEString )
            {
            // InternalGenericDatasheet.g:1852:2: ( ruleEString )
            // InternalGenericDatasheet.g:1853:3: ruleEString
            {
             before(grammarAccess.getProprietaryLicenseAccess().getUrlEStringParserRuleCall_3_2_2_0()); 
            pushFollow(FOLLOW_1);
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000BFF000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000240800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000003F400002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000007000000002L});

}
