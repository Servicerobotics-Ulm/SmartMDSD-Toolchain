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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_TEXT_BLOCK", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Level1'", "'Level2'", "'Level3'", "'Level4'", "'Level5'", "'Level6'", "'Level7'", "'Level8'", "'Level9'", "'Undefined'", "'ComponentDatasheet'", "'{'", "'}'", "'shortDescrition'", "':'", "'baseURI'", "'longDescription'", "'supplierDescription'", "'homepage'", "'trl'", "'purposeDescription'", "'hardwareRequirementDescription'", "'license'", "'spdx'", "'('", "')'", "'proprietary'", "'name'", "'fullText'", "'URL'"
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
    public static final int T__40=40;
    public static final int T__41=41;
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
    // InternalComponentDatasheet.g:94:1: entryRuleComponentDatasheet : ruleComponentDatasheet EOF ;
    public final void entryRuleComponentDatasheet() throws RecognitionException {
        try {
            // InternalComponentDatasheet.g:95:1: ( ruleComponentDatasheet EOF )
            // InternalComponentDatasheet.g:96:1: ruleComponentDatasheet EOF
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
    // InternalComponentDatasheet.g:103:1: ruleComponentDatasheet : ( ( rule__ComponentDatasheet__Group__0 ) ) ;
    public final void ruleComponentDatasheet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:107:2: ( ( ( rule__ComponentDatasheet__Group__0 ) ) )
            // InternalComponentDatasheet.g:108:2: ( ( rule__ComponentDatasheet__Group__0 ) )
            {
            // InternalComponentDatasheet.g:108:2: ( ( rule__ComponentDatasheet__Group__0 ) )
            // InternalComponentDatasheet.g:109:3: ( rule__ComponentDatasheet__Group__0 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getGroup()); 
            // InternalComponentDatasheet.g:110:3: ( rule__ComponentDatasheet__Group__0 )
            // InternalComponentDatasheet.g:110:4: rule__ComponentDatasheet__Group__0
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


    // $ANTLR start "entryRuleAbstractLicense"
    // InternalComponentDatasheet.g:119:1: entryRuleAbstractLicense : ruleAbstractLicense EOF ;
    public final void entryRuleAbstractLicense() throws RecognitionException {
        try {
            // InternalComponentDatasheet.g:120:1: ( ruleAbstractLicense EOF )
            // InternalComponentDatasheet.g:121:1: ruleAbstractLicense EOF
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
    // InternalComponentDatasheet.g:128:1: ruleAbstractLicense : ( ( rule__AbstractLicense__Alternatives ) ) ;
    public final void ruleAbstractLicense() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:132:2: ( ( ( rule__AbstractLicense__Alternatives ) ) )
            // InternalComponentDatasheet.g:133:2: ( ( rule__AbstractLicense__Alternatives ) )
            {
            // InternalComponentDatasheet.g:133:2: ( ( rule__AbstractLicense__Alternatives ) )
            // InternalComponentDatasheet.g:134:3: ( rule__AbstractLicense__Alternatives )
            {
             before(grammarAccess.getAbstractLicenseAccess().getAlternatives()); 
            // InternalComponentDatasheet.g:135:3: ( rule__AbstractLicense__Alternatives )
            // InternalComponentDatasheet.g:135:4: rule__AbstractLicense__Alternatives
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
    // InternalComponentDatasheet.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentDatasheet.g:145:1: ( ruleEString EOF )
            // InternalComponentDatasheet.g:146:1: ruleEString EOF
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
    // InternalComponentDatasheet.g:153:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:157:2: ( ( RULE_STRING ) )
            // InternalComponentDatasheet.g:158:2: ( RULE_STRING )
            {
            // InternalComponentDatasheet.g:158:2: ( RULE_STRING )
            // InternalComponentDatasheet.g:159:3: RULE_STRING
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
    // InternalComponentDatasheet.g:169:1: entryRuleSpdxLicense : ruleSpdxLicense EOF ;
    public final void entryRuleSpdxLicense() throws RecognitionException {
        try {
            // InternalComponentDatasheet.g:170:1: ( ruleSpdxLicense EOF )
            // InternalComponentDatasheet.g:171:1: ruleSpdxLicense EOF
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
    // InternalComponentDatasheet.g:178:1: ruleSpdxLicense : ( ( rule__SpdxLicense__Group__0 ) ) ;
    public final void ruleSpdxLicense() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:182:2: ( ( ( rule__SpdxLicense__Group__0 ) ) )
            // InternalComponentDatasheet.g:183:2: ( ( rule__SpdxLicense__Group__0 ) )
            {
            // InternalComponentDatasheet.g:183:2: ( ( rule__SpdxLicense__Group__0 ) )
            // InternalComponentDatasheet.g:184:3: ( rule__SpdxLicense__Group__0 )
            {
             before(grammarAccess.getSpdxLicenseAccess().getGroup()); 
            // InternalComponentDatasheet.g:185:3: ( rule__SpdxLicense__Group__0 )
            // InternalComponentDatasheet.g:185:4: rule__SpdxLicense__Group__0
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
    // InternalComponentDatasheet.g:194:1: entryRuleProprietaryLicense : ruleProprietaryLicense EOF ;
    public final void entryRuleProprietaryLicense() throws RecognitionException {
        try {
            // InternalComponentDatasheet.g:195:1: ( ruleProprietaryLicense EOF )
            // InternalComponentDatasheet.g:196:1: ruleProprietaryLicense EOF
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
    // InternalComponentDatasheet.g:203:1: ruleProprietaryLicense : ( ( rule__ProprietaryLicense__Group__0 ) ) ;
    public final void ruleProprietaryLicense() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:207:2: ( ( ( rule__ProprietaryLicense__Group__0 ) ) )
            // InternalComponentDatasheet.g:208:2: ( ( rule__ProprietaryLicense__Group__0 ) )
            {
            // InternalComponentDatasheet.g:208:2: ( ( rule__ProprietaryLicense__Group__0 ) )
            // InternalComponentDatasheet.g:209:3: ( rule__ProprietaryLicense__Group__0 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getGroup()); 
            // InternalComponentDatasheet.g:210:3: ( rule__ProprietaryLicense__Group__0 )
            // InternalComponentDatasheet.g:210:4: rule__ProprietaryLicense__Group__0
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
    // InternalComponentDatasheet.g:219:1: ruleTRL : ( ( rule__TRL__Alternatives ) ) ;
    public final void ruleTRL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:223:1: ( ( ( rule__TRL__Alternatives ) ) )
            // InternalComponentDatasheet.g:224:2: ( ( rule__TRL__Alternatives ) )
            {
            // InternalComponentDatasheet.g:224:2: ( ( rule__TRL__Alternatives ) )
            // InternalComponentDatasheet.g:225:3: ( rule__TRL__Alternatives )
            {
             before(grammarAccess.getTRLAccess().getAlternatives()); 
            // InternalComponentDatasheet.g:226:3: ( rule__TRL__Alternatives )
            // InternalComponentDatasheet.g:226:4: rule__TRL__Alternatives
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
    // InternalComponentDatasheet.g:234:1: rule__AbstractLicense__Alternatives : ( ( ruleSpdxLicense ) | ( ruleProprietaryLicense ) );
    public final void rule__AbstractLicense__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:238:1: ( ( ruleSpdxLicense ) | ( ruleProprietaryLicense ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==35) ) {
                alt1=1;
            }
            else if ( (LA1_0==38) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentDatasheet.g:239:2: ( ruleSpdxLicense )
                    {
                    // InternalComponentDatasheet.g:239:2: ( ruleSpdxLicense )
                    // InternalComponentDatasheet.g:240:3: ruleSpdxLicense
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
                    // InternalComponentDatasheet.g:245:2: ( ruleProprietaryLicense )
                    {
                    // InternalComponentDatasheet.g:245:2: ( ruleProprietaryLicense )
                    // InternalComponentDatasheet.g:246:3: ruleProprietaryLicense
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
    // InternalComponentDatasheet.g:255:1: rule__TRL__Alternatives : ( ( ( 'Level1' ) ) | ( ( 'Level2' ) ) | ( ( 'Level3' ) ) | ( ( 'Level4' ) ) | ( ( 'Level5' ) ) | ( ( 'Level6' ) ) | ( ( 'Level7' ) ) | ( ( 'Level8' ) ) | ( ( 'Level9' ) ) | ( ( 'Undefined' ) ) );
    public final void rule__TRL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:259:1: ( ( ( 'Level1' ) ) | ( ( 'Level2' ) ) | ( ( 'Level3' ) ) | ( ( 'Level4' ) ) | ( ( 'Level5' ) ) | ( ( 'Level6' ) ) | ( ( 'Level7' ) ) | ( ( 'Level8' ) ) | ( ( 'Level9' ) ) | ( ( 'Undefined' ) ) )
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
                    // InternalComponentDatasheet.g:260:2: ( ( 'Level1' ) )
                    {
                    // InternalComponentDatasheet.g:260:2: ( ( 'Level1' ) )
                    // InternalComponentDatasheet.g:261:3: ( 'Level1' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0()); 
                    // InternalComponentDatasheet.g:262:3: ( 'Level1' )
                    // InternalComponentDatasheet.g:262:4: 'Level1'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDatasheet.g:266:2: ( ( 'Level2' ) )
                    {
                    // InternalComponentDatasheet.g:266:2: ( ( 'Level2' ) )
                    // InternalComponentDatasheet.g:267:3: ( 'Level2' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1()); 
                    // InternalComponentDatasheet.g:268:3: ( 'Level2' )
                    // InternalComponentDatasheet.g:268:4: 'Level2'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDatasheet.g:272:2: ( ( 'Level3' ) )
                    {
                    // InternalComponentDatasheet.g:272:2: ( ( 'Level3' ) )
                    // InternalComponentDatasheet.g:273:3: ( 'Level3' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2()); 
                    // InternalComponentDatasheet.g:274:3: ( 'Level3' )
                    // InternalComponentDatasheet.g:274:4: 'Level3'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentDatasheet.g:278:2: ( ( 'Level4' ) )
                    {
                    // InternalComponentDatasheet.g:278:2: ( ( 'Level4' ) )
                    // InternalComponentDatasheet.g:279:3: ( 'Level4' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3()); 
                    // InternalComponentDatasheet.g:280:3: ( 'Level4' )
                    // InternalComponentDatasheet.g:280:4: 'Level4'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalComponentDatasheet.g:284:2: ( ( 'Level5' ) )
                    {
                    // InternalComponentDatasheet.g:284:2: ( ( 'Level5' ) )
                    // InternalComponentDatasheet.g:285:3: ( 'Level5' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4()); 
                    // InternalComponentDatasheet.g:286:3: ( 'Level5' )
                    // InternalComponentDatasheet.g:286:4: 'Level5'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalComponentDatasheet.g:290:2: ( ( 'Level6' ) )
                    {
                    // InternalComponentDatasheet.g:290:2: ( ( 'Level6' ) )
                    // InternalComponentDatasheet.g:291:3: ( 'Level6' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5()); 
                    // InternalComponentDatasheet.g:292:3: ( 'Level6' )
                    // InternalComponentDatasheet.g:292:4: 'Level6'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalComponentDatasheet.g:296:2: ( ( 'Level7' ) )
                    {
                    // InternalComponentDatasheet.g:296:2: ( ( 'Level7' ) )
                    // InternalComponentDatasheet.g:297:3: ( 'Level7' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6()); 
                    // InternalComponentDatasheet.g:298:3: ( 'Level7' )
                    // InternalComponentDatasheet.g:298:4: 'Level7'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalComponentDatasheet.g:302:2: ( ( 'Level8' ) )
                    {
                    // InternalComponentDatasheet.g:302:2: ( ( 'Level8' ) )
                    // InternalComponentDatasheet.g:303:3: ( 'Level8' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7()); 
                    // InternalComponentDatasheet.g:304:3: ( 'Level8' )
                    // InternalComponentDatasheet.g:304:4: 'Level8'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalComponentDatasheet.g:308:2: ( ( 'Level9' ) )
                    {
                    // InternalComponentDatasheet.g:308:2: ( ( 'Level9' ) )
                    // InternalComponentDatasheet.g:309:3: ( 'Level9' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8()); 
                    // InternalComponentDatasheet.g:310:3: ( 'Level9' )
                    // InternalComponentDatasheet.g:310:4: 'Level9'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalComponentDatasheet.g:314:2: ( ( 'Undefined' ) )
                    {
                    // InternalComponentDatasheet.g:314:2: ( ( 'Undefined' ) )
                    // InternalComponentDatasheet.g:315:3: ( 'Undefined' )
                    {
                     before(grammarAccess.getTRLAccess().getUNDEFINEDEnumLiteralDeclaration_9()); 
                    // InternalComponentDatasheet.g:316:3: ( 'Undefined' )
                    // InternalComponentDatasheet.g:316:4: 'Undefined'
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


    // $ANTLR start "rule__ComponentDatasheet__Group__0"
    // InternalComponentDatasheet.g:324:1: rule__ComponentDatasheet__Group__0 : rule__ComponentDatasheet__Group__0__Impl rule__ComponentDatasheet__Group__1 ;
    public final void rule__ComponentDatasheet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:328:1: ( rule__ComponentDatasheet__Group__0__Impl rule__ComponentDatasheet__Group__1 )
            // InternalComponentDatasheet.g:329:2: rule__ComponentDatasheet__Group__0__Impl rule__ComponentDatasheet__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalComponentDatasheet.g:336:1: rule__ComponentDatasheet__Group__0__Impl : ( 'ComponentDatasheet' ) ;
    public final void rule__ComponentDatasheet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:340:1: ( ( 'ComponentDatasheet' ) )
            // InternalComponentDatasheet.g:341:1: ( 'ComponentDatasheet' )
            {
            // InternalComponentDatasheet.g:341:1: ( 'ComponentDatasheet' )
            // InternalComponentDatasheet.g:342:2: 'ComponentDatasheet'
            {
             before(grammarAccess.getComponentDatasheetAccess().getComponentDatasheetKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:351:1: rule__ComponentDatasheet__Group__1 : rule__ComponentDatasheet__Group__1__Impl rule__ComponentDatasheet__Group__2 ;
    public final void rule__ComponentDatasheet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:355:1: ( rule__ComponentDatasheet__Group__1__Impl rule__ComponentDatasheet__Group__2 )
            // InternalComponentDatasheet.g:356:2: rule__ComponentDatasheet__Group__1__Impl rule__ComponentDatasheet__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalComponentDatasheet.g:363:1: rule__ComponentDatasheet__Group__1__Impl : ( ( rule__ComponentDatasheet__ComponentAssignment_1 ) ) ;
    public final void rule__ComponentDatasheet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:367:1: ( ( ( rule__ComponentDatasheet__ComponentAssignment_1 ) ) )
            // InternalComponentDatasheet.g:368:1: ( ( rule__ComponentDatasheet__ComponentAssignment_1 ) )
            {
            // InternalComponentDatasheet.g:368:1: ( ( rule__ComponentDatasheet__ComponentAssignment_1 ) )
            // InternalComponentDatasheet.g:369:2: ( rule__ComponentDatasheet__ComponentAssignment_1 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getComponentAssignment_1()); 
            // InternalComponentDatasheet.g:370:2: ( rule__ComponentDatasheet__ComponentAssignment_1 )
            // InternalComponentDatasheet.g:370:3: rule__ComponentDatasheet__ComponentAssignment_1
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
    // InternalComponentDatasheet.g:378:1: rule__ComponentDatasheet__Group__2 : rule__ComponentDatasheet__Group__2__Impl rule__ComponentDatasheet__Group__3 ;
    public final void rule__ComponentDatasheet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:382:1: ( rule__ComponentDatasheet__Group__2__Impl rule__ComponentDatasheet__Group__3 )
            // InternalComponentDatasheet.g:383:2: rule__ComponentDatasheet__Group__2__Impl rule__ComponentDatasheet__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDatasheet.g:390:1: rule__ComponentDatasheet__Group__2__Impl : ( '{' ) ;
    public final void rule__ComponentDatasheet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:394:1: ( ( '{' ) )
            // InternalComponentDatasheet.g:395:1: ( '{' )
            {
            // InternalComponentDatasheet.g:395:1: ( '{' )
            // InternalComponentDatasheet.g:396:2: '{'
            {
             before(grammarAccess.getComponentDatasheetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:405:1: rule__ComponentDatasheet__Group__3 : rule__ComponentDatasheet__Group__3__Impl rule__ComponentDatasheet__Group__4 ;
    public final void rule__ComponentDatasheet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:409:1: ( rule__ComponentDatasheet__Group__3__Impl rule__ComponentDatasheet__Group__4 )
            // InternalComponentDatasheet.g:410:2: rule__ComponentDatasheet__Group__3__Impl rule__ComponentDatasheet__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalComponentDatasheet.g:417:1: rule__ComponentDatasheet__Group__3__Impl : ( ( rule__ComponentDatasheet__UnorderedGroup_3 ) ) ;
    public final void rule__ComponentDatasheet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:421:1: ( ( ( rule__ComponentDatasheet__UnorderedGroup_3 ) ) )
            // InternalComponentDatasheet.g:422:1: ( ( rule__ComponentDatasheet__UnorderedGroup_3 ) )
            {
            // InternalComponentDatasheet.g:422:1: ( ( rule__ComponentDatasheet__UnorderedGroup_3 ) )
            // InternalComponentDatasheet.g:423:2: ( rule__ComponentDatasheet__UnorderedGroup_3 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3()); 
            // InternalComponentDatasheet.g:424:2: ( rule__ComponentDatasheet__UnorderedGroup_3 )
            // InternalComponentDatasheet.g:424:3: rule__ComponentDatasheet__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3()); 

            }


            }

        }
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
    // InternalComponentDatasheet.g:432:1: rule__ComponentDatasheet__Group__4 : rule__ComponentDatasheet__Group__4__Impl ;
    public final void rule__ComponentDatasheet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:436:1: ( rule__ComponentDatasheet__Group__4__Impl )
            // InternalComponentDatasheet.g:437:2: rule__ComponentDatasheet__Group__4__Impl
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
    // InternalComponentDatasheet.g:443:1: rule__ComponentDatasheet__Group__4__Impl : ( '}' ) ;
    public final void rule__ComponentDatasheet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:447:1: ( ( '}' ) )
            // InternalComponentDatasheet.g:448:1: ( '}' )
            {
            // InternalComponentDatasheet.g:448:1: ( '}' )
            // InternalComponentDatasheet.g:449:2: '}'
            {
             before(grammarAccess.getComponentDatasheetAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__ComponentDatasheet__Group_3_0__0"
    // InternalComponentDatasheet.g:459:1: rule__ComponentDatasheet__Group_3_0__0 : rule__ComponentDatasheet__Group_3_0__0__Impl rule__ComponentDatasheet__Group_3_0__1 ;
    public final void rule__ComponentDatasheet__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:463:1: ( rule__ComponentDatasheet__Group_3_0__0__Impl rule__ComponentDatasheet__Group_3_0__1 )
            // InternalComponentDatasheet.g:464:2: rule__ComponentDatasheet__Group_3_0__0__Impl rule__ComponentDatasheet__Group_3_0__1
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDatasheet__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_0__1();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_0__0"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_0__0__Impl"
    // InternalComponentDatasheet.g:471:1: rule__ComponentDatasheet__Group_3_0__0__Impl : ( 'shortDescrition' ) ;
    public final void rule__ComponentDatasheet__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:475:1: ( ( 'shortDescrition' ) )
            // InternalComponentDatasheet.g:476:1: ( 'shortDescrition' )
            {
            // InternalComponentDatasheet.g:476:1: ( 'shortDescrition' )
            // InternalComponentDatasheet.g:477:2: 'shortDescrition'
            {
             before(grammarAccess.getComponentDatasheetAccess().getShortDescritionKeyword_3_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getShortDescritionKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_0__0__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_0__1"
    // InternalComponentDatasheet.g:486:1: rule__ComponentDatasheet__Group_3_0__1 : rule__ComponentDatasheet__Group_3_0__1__Impl rule__ComponentDatasheet__Group_3_0__2 ;
    public final void rule__ComponentDatasheet__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:490:1: ( rule__ComponentDatasheet__Group_3_0__1__Impl rule__ComponentDatasheet__Group_3_0__2 )
            // InternalComponentDatasheet.g:491:2: rule__ComponentDatasheet__Group_3_0__1__Impl rule__ComponentDatasheet__Group_3_0__2
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDatasheet__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_0__2();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_0__1"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_0__1__Impl"
    // InternalComponentDatasheet.g:498:1: rule__ComponentDatasheet__Group_3_0__1__Impl : ( ( ':' )? ) ;
    public final void rule__ComponentDatasheet__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:502:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:503:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:503:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:504:2: ( ':' )?
            {
             before(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_0_1()); 
            // InternalComponentDatasheet.g:505:2: ( ':' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentDatasheet.g:505:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_0__1__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_0__2"
    // InternalComponentDatasheet.g:513:1: rule__ComponentDatasheet__Group_3_0__2 : rule__ComponentDatasheet__Group_3_0__2__Impl ;
    public final void rule__ComponentDatasheet__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:517:1: ( rule__ComponentDatasheet__Group_3_0__2__Impl )
            // InternalComponentDatasheet.g:518:2: rule__ComponentDatasheet__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_0__2__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_0__2"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_0__2__Impl"
    // InternalComponentDatasheet.g:524:1: rule__ComponentDatasheet__Group_3_0__2__Impl : ( ( rule__ComponentDatasheet__ShortDescritionAssignment_3_0_2 ) ) ;
    public final void rule__ComponentDatasheet__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:528:1: ( ( ( rule__ComponentDatasheet__ShortDescritionAssignment_3_0_2 ) ) )
            // InternalComponentDatasheet.g:529:1: ( ( rule__ComponentDatasheet__ShortDescritionAssignment_3_0_2 ) )
            {
            // InternalComponentDatasheet.g:529:1: ( ( rule__ComponentDatasheet__ShortDescritionAssignment_3_0_2 ) )
            // InternalComponentDatasheet.g:530:2: ( rule__ComponentDatasheet__ShortDescritionAssignment_3_0_2 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getShortDescritionAssignment_3_0_2()); 
            // InternalComponentDatasheet.g:531:2: ( rule__ComponentDatasheet__ShortDescritionAssignment_3_0_2 )
            // InternalComponentDatasheet.g:531:3: rule__ComponentDatasheet__ShortDescritionAssignment_3_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__ShortDescritionAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getShortDescritionAssignment_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_0__2__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_1__0"
    // InternalComponentDatasheet.g:540:1: rule__ComponentDatasheet__Group_3_1__0 : rule__ComponentDatasheet__Group_3_1__0__Impl rule__ComponentDatasheet__Group_3_1__1 ;
    public final void rule__ComponentDatasheet__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:544:1: ( rule__ComponentDatasheet__Group_3_1__0__Impl rule__ComponentDatasheet__Group_3_1__1 )
            // InternalComponentDatasheet.g:545:2: rule__ComponentDatasheet__Group_3_1__0__Impl rule__ComponentDatasheet__Group_3_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDatasheet__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_1__1();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_1__0"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_1__0__Impl"
    // InternalComponentDatasheet.g:552:1: rule__ComponentDatasheet__Group_3_1__0__Impl : ( 'baseURI' ) ;
    public final void rule__ComponentDatasheet__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:556:1: ( ( 'baseURI' ) )
            // InternalComponentDatasheet.g:557:1: ( 'baseURI' )
            {
            // InternalComponentDatasheet.g:557:1: ( 'baseURI' )
            // InternalComponentDatasheet.g:558:2: 'baseURI'
            {
             before(grammarAccess.getComponentDatasheetAccess().getBaseURIKeyword_3_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getBaseURIKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_1__0__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_1__1"
    // InternalComponentDatasheet.g:567:1: rule__ComponentDatasheet__Group_3_1__1 : rule__ComponentDatasheet__Group_3_1__1__Impl rule__ComponentDatasheet__Group_3_1__2 ;
    public final void rule__ComponentDatasheet__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:571:1: ( rule__ComponentDatasheet__Group_3_1__1__Impl rule__ComponentDatasheet__Group_3_1__2 )
            // InternalComponentDatasheet.g:572:2: rule__ComponentDatasheet__Group_3_1__1__Impl rule__ComponentDatasheet__Group_3_1__2
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDatasheet__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_1__2();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_1__1"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_1__1__Impl"
    // InternalComponentDatasheet.g:579:1: rule__ComponentDatasheet__Group_3_1__1__Impl : ( ( ':' )? ) ;
    public final void rule__ComponentDatasheet__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:583:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:584:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:584:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:585:2: ( ':' )?
            {
             before(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_1_1()); 
            // InternalComponentDatasheet.g:586:2: ( ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentDatasheet.g:586:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_1__1__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_1__2"
    // InternalComponentDatasheet.g:594:1: rule__ComponentDatasheet__Group_3_1__2 : rule__ComponentDatasheet__Group_3_1__2__Impl ;
    public final void rule__ComponentDatasheet__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:598:1: ( rule__ComponentDatasheet__Group_3_1__2__Impl )
            // InternalComponentDatasheet.g:599:2: rule__ComponentDatasheet__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_1__2__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_1__2"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_1__2__Impl"
    // InternalComponentDatasheet.g:605:1: rule__ComponentDatasheet__Group_3_1__2__Impl : ( ( rule__ComponentDatasheet__BaseURIAssignment_3_1_2 ) ) ;
    public final void rule__ComponentDatasheet__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:609:1: ( ( ( rule__ComponentDatasheet__BaseURIAssignment_3_1_2 ) ) )
            // InternalComponentDatasheet.g:610:1: ( ( rule__ComponentDatasheet__BaseURIAssignment_3_1_2 ) )
            {
            // InternalComponentDatasheet.g:610:1: ( ( rule__ComponentDatasheet__BaseURIAssignment_3_1_2 ) )
            // InternalComponentDatasheet.g:611:2: ( rule__ComponentDatasheet__BaseURIAssignment_3_1_2 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getBaseURIAssignment_3_1_2()); 
            // InternalComponentDatasheet.g:612:2: ( rule__ComponentDatasheet__BaseURIAssignment_3_1_2 )
            // InternalComponentDatasheet.g:612:3: rule__ComponentDatasheet__BaseURIAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__BaseURIAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getBaseURIAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_1__2__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_2__0"
    // InternalComponentDatasheet.g:621:1: rule__ComponentDatasheet__Group_3_2__0 : rule__ComponentDatasheet__Group_3_2__0__Impl rule__ComponentDatasheet__Group_3_2__1 ;
    public final void rule__ComponentDatasheet__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:625:1: ( rule__ComponentDatasheet__Group_3_2__0__Impl rule__ComponentDatasheet__Group_3_2__1 )
            // InternalComponentDatasheet.g:626:2: rule__ComponentDatasheet__Group_3_2__0__Impl rule__ComponentDatasheet__Group_3_2__1
            {
            pushFollow(FOLLOW_8);
            rule__ComponentDatasheet__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_2__1();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_2__0"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_2__0__Impl"
    // InternalComponentDatasheet.g:633:1: rule__ComponentDatasheet__Group_3_2__0__Impl : ( 'longDescription' ) ;
    public final void rule__ComponentDatasheet__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:637:1: ( ( 'longDescription' ) )
            // InternalComponentDatasheet.g:638:1: ( 'longDescription' )
            {
            // InternalComponentDatasheet.g:638:1: ( 'longDescription' )
            // InternalComponentDatasheet.g:639:2: 'longDescription'
            {
             before(grammarAccess.getComponentDatasheetAccess().getLongDescriptionKeyword_3_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getLongDescriptionKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_2__0__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_2__1"
    // InternalComponentDatasheet.g:648:1: rule__ComponentDatasheet__Group_3_2__1 : rule__ComponentDatasheet__Group_3_2__1__Impl rule__ComponentDatasheet__Group_3_2__2 ;
    public final void rule__ComponentDatasheet__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:652:1: ( rule__ComponentDatasheet__Group_3_2__1__Impl rule__ComponentDatasheet__Group_3_2__2 )
            // InternalComponentDatasheet.g:653:2: rule__ComponentDatasheet__Group_3_2__1__Impl rule__ComponentDatasheet__Group_3_2__2
            {
            pushFollow(FOLLOW_8);
            rule__ComponentDatasheet__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_2__2();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_2__1"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_2__1__Impl"
    // InternalComponentDatasheet.g:660:1: rule__ComponentDatasheet__Group_3_2__1__Impl : ( ( ':' )? ) ;
    public final void rule__ComponentDatasheet__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:664:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:665:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:665:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:666:2: ( ':' )?
            {
             before(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_2_1()); 
            // InternalComponentDatasheet.g:667:2: ( ':' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentDatasheet.g:667:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_2__1__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_2__2"
    // InternalComponentDatasheet.g:675:1: rule__ComponentDatasheet__Group_3_2__2 : rule__ComponentDatasheet__Group_3_2__2__Impl ;
    public final void rule__ComponentDatasheet__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:679:1: ( rule__ComponentDatasheet__Group_3_2__2__Impl )
            // InternalComponentDatasheet.g:680:2: rule__ComponentDatasheet__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_2__2__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_2__2"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_2__2__Impl"
    // InternalComponentDatasheet.g:686:1: rule__ComponentDatasheet__Group_3_2__2__Impl : ( ( rule__ComponentDatasheet__LongDescriptionAssignment_3_2_2 ) ) ;
    public final void rule__ComponentDatasheet__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:690:1: ( ( ( rule__ComponentDatasheet__LongDescriptionAssignment_3_2_2 ) ) )
            // InternalComponentDatasheet.g:691:1: ( ( rule__ComponentDatasheet__LongDescriptionAssignment_3_2_2 ) )
            {
            // InternalComponentDatasheet.g:691:1: ( ( rule__ComponentDatasheet__LongDescriptionAssignment_3_2_2 ) )
            // InternalComponentDatasheet.g:692:2: ( rule__ComponentDatasheet__LongDescriptionAssignment_3_2_2 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getLongDescriptionAssignment_3_2_2()); 
            // InternalComponentDatasheet.g:693:2: ( rule__ComponentDatasheet__LongDescriptionAssignment_3_2_2 )
            // InternalComponentDatasheet.g:693:3: rule__ComponentDatasheet__LongDescriptionAssignment_3_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__LongDescriptionAssignment_3_2_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getLongDescriptionAssignment_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_2__2__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_3__0"
    // InternalComponentDatasheet.g:702:1: rule__ComponentDatasheet__Group_3_3__0 : rule__ComponentDatasheet__Group_3_3__0__Impl rule__ComponentDatasheet__Group_3_3__1 ;
    public final void rule__ComponentDatasheet__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:706:1: ( rule__ComponentDatasheet__Group_3_3__0__Impl rule__ComponentDatasheet__Group_3_3__1 )
            // InternalComponentDatasheet.g:707:2: rule__ComponentDatasheet__Group_3_3__0__Impl rule__ComponentDatasheet__Group_3_3__1
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDatasheet__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_3__1();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_3__0"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_3__0__Impl"
    // InternalComponentDatasheet.g:714:1: rule__ComponentDatasheet__Group_3_3__0__Impl : ( 'supplierDescription' ) ;
    public final void rule__ComponentDatasheet__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:718:1: ( ( 'supplierDescription' ) )
            // InternalComponentDatasheet.g:719:1: ( 'supplierDescription' )
            {
            // InternalComponentDatasheet.g:719:1: ( 'supplierDescription' )
            // InternalComponentDatasheet.g:720:2: 'supplierDescription'
            {
             before(grammarAccess.getComponentDatasheetAccess().getSupplierDescriptionKeyword_3_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getSupplierDescriptionKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_3__0__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_3__1"
    // InternalComponentDatasheet.g:729:1: rule__ComponentDatasheet__Group_3_3__1 : rule__ComponentDatasheet__Group_3_3__1__Impl rule__ComponentDatasheet__Group_3_3__2 ;
    public final void rule__ComponentDatasheet__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:733:1: ( rule__ComponentDatasheet__Group_3_3__1__Impl rule__ComponentDatasheet__Group_3_3__2 )
            // InternalComponentDatasheet.g:734:2: rule__ComponentDatasheet__Group_3_3__1__Impl rule__ComponentDatasheet__Group_3_3__2
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDatasheet__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_3__2();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_3__1"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_3__1__Impl"
    // InternalComponentDatasheet.g:741:1: rule__ComponentDatasheet__Group_3_3__1__Impl : ( ( ':' )? ) ;
    public final void rule__ComponentDatasheet__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:745:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:746:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:746:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:747:2: ( ':' )?
            {
             before(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_3_1()); 
            // InternalComponentDatasheet.g:748:2: ( ':' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentDatasheet.g:748:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_3__1__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_3__2"
    // InternalComponentDatasheet.g:756:1: rule__ComponentDatasheet__Group_3_3__2 : rule__ComponentDatasheet__Group_3_3__2__Impl ;
    public final void rule__ComponentDatasheet__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:760:1: ( rule__ComponentDatasheet__Group_3_3__2__Impl )
            // InternalComponentDatasheet.g:761:2: rule__ComponentDatasheet__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_3__2__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_3__2"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_3__2__Impl"
    // InternalComponentDatasheet.g:767:1: rule__ComponentDatasheet__Group_3_3__2__Impl : ( ( rule__ComponentDatasheet__SupplierDescriptionAssignment_3_3_2 ) ) ;
    public final void rule__ComponentDatasheet__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:771:1: ( ( ( rule__ComponentDatasheet__SupplierDescriptionAssignment_3_3_2 ) ) )
            // InternalComponentDatasheet.g:772:1: ( ( rule__ComponentDatasheet__SupplierDescriptionAssignment_3_3_2 ) )
            {
            // InternalComponentDatasheet.g:772:1: ( ( rule__ComponentDatasheet__SupplierDescriptionAssignment_3_3_2 ) )
            // InternalComponentDatasheet.g:773:2: ( rule__ComponentDatasheet__SupplierDescriptionAssignment_3_3_2 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getSupplierDescriptionAssignment_3_3_2()); 
            // InternalComponentDatasheet.g:774:2: ( rule__ComponentDatasheet__SupplierDescriptionAssignment_3_3_2 )
            // InternalComponentDatasheet.g:774:3: rule__ComponentDatasheet__SupplierDescriptionAssignment_3_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__SupplierDescriptionAssignment_3_3_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getSupplierDescriptionAssignment_3_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_3__2__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_4__0"
    // InternalComponentDatasheet.g:783:1: rule__ComponentDatasheet__Group_3_4__0 : rule__ComponentDatasheet__Group_3_4__0__Impl rule__ComponentDatasheet__Group_3_4__1 ;
    public final void rule__ComponentDatasheet__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:787:1: ( rule__ComponentDatasheet__Group_3_4__0__Impl rule__ComponentDatasheet__Group_3_4__1 )
            // InternalComponentDatasheet.g:788:2: rule__ComponentDatasheet__Group_3_4__0__Impl rule__ComponentDatasheet__Group_3_4__1
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDatasheet__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_4__1();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_4__0"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_4__0__Impl"
    // InternalComponentDatasheet.g:795:1: rule__ComponentDatasheet__Group_3_4__0__Impl : ( 'homepage' ) ;
    public final void rule__ComponentDatasheet__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:799:1: ( ( 'homepage' ) )
            // InternalComponentDatasheet.g:800:1: ( 'homepage' )
            {
            // InternalComponentDatasheet.g:800:1: ( 'homepage' )
            // InternalComponentDatasheet.g:801:2: 'homepage'
            {
             before(grammarAccess.getComponentDatasheetAccess().getHomepageKeyword_3_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getHomepageKeyword_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_4__0__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_4__1"
    // InternalComponentDatasheet.g:810:1: rule__ComponentDatasheet__Group_3_4__1 : rule__ComponentDatasheet__Group_3_4__1__Impl rule__ComponentDatasheet__Group_3_4__2 ;
    public final void rule__ComponentDatasheet__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:814:1: ( rule__ComponentDatasheet__Group_3_4__1__Impl rule__ComponentDatasheet__Group_3_4__2 )
            // InternalComponentDatasheet.g:815:2: rule__ComponentDatasheet__Group_3_4__1__Impl rule__ComponentDatasheet__Group_3_4__2
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDatasheet__Group_3_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_4__2();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_4__1"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_4__1__Impl"
    // InternalComponentDatasheet.g:822:1: rule__ComponentDatasheet__Group_3_4__1__Impl : ( ( ':' )? ) ;
    public final void rule__ComponentDatasheet__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:826:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:827:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:827:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:828:2: ( ':' )?
            {
             before(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_4_1()); 
            // InternalComponentDatasheet.g:829:2: ( ':' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentDatasheet.g:829:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_4__1__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_4__2"
    // InternalComponentDatasheet.g:837:1: rule__ComponentDatasheet__Group_3_4__2 : rule__ComponentDatasheet__Group_3_4__2__Impl ;
    public final void rule__ComponentDatasheet__Group_3_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:841:1: ( rule__ComponentDatasheet__Group_3_4__2__Impl )
            // InternalComponentDatasheet.g:842:2: rule__ComponentDatasheet__Group_3_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_4__2__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_4__2"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_4__2__Impl"
    // InternalComponentDatasheet.g:848:1: rule__ComponentDatasheet__Group_3_4__2__Impl : ( ( rule__ComponentDatasheet__HomepageAssignment_3_4_2 ) ) ;
    public final void rule__ComponentDatasheet__Group_3_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:852:1: ( ( ( rule__ComponentDatasheet__HomepageAssignment_3_4_2 ) ) )
            // InternalComponentDatasheet.g:853:1: ( ( rule__ComponentDatasheet__HomepageAssignment_3_4_2 ) )
            {
            // InternalComponentDatasheet.g:853:1: ( ( rule__ComponentDatasheet__HomepageAssignment_3_4_2 ) )
            // InternalComponentDatasheet.g:854:2: ( rule__ComponentDatasheet__HomepageAssignment_3_4_2 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getHomepageAssignment_3_4_2()); 
            // InternalComponentDatasheet.g:855:2: ( rule__ComponentDatasheet__HomepageAssignment_3_4_2 )
            // InternalComponentDatasheet.g:855:3: rule__ComponentDatasheet__HomepageAssignment_3_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__HomepageAssignment_3_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getHomepageAssignment_3_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_4__2__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_5__0"
    // InternalComponentDatasheet.g:864:1: rule__ComponentDatasheet__Group_3_5__0 : rule__ComponentDatasheet__Group_3_5__0__Impl rule__ComponentDatasheet__Group_3_5__1 ;
    public final void rule__ComponentDatasheet__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:868:1: ( rule__ComponentDatasheet__Group_3_5__0__Impl rule__ComponentDatasheet__Group_3_5__1 )
            // InternalComponentDatasheet.g:869:2: rule__ComponentDatasheet__Group_3_5__0__Impl rule__ComponentDatasheet__Group_3_5__1
            {
            pushFollow(FOLLOW_9);
            rule__ComponentDatasheet__Group_3_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_5__1();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_5__0"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_5__0__Impl"
    // InternalComponentDatasheet.g:876:1: rule__ComponentDatasheet__Group_3_5__0__Impl : ( 'trl' ) ;
    public final void rule__ComponentDatasheet__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:880:1: ( ( 'trl' ) )
            // InternalComponentDatasheet.g:881:1: ( 'trl' )
            {
            // InternalComponentDatasheet.g:881:1: ( 'trl' )
            // InternalComponentDatasheet.g:882:2: 'trl'
            {
             before(grammarAccess.getComponentDatasheetAccess().getTrlKeyword_3_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getTrlKeyword_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_5__0__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_5__1"
    // InternalComponentDatasheet.g:891:1: rule__ComponentDatasheet__Group_3_5__1 : rule__ComponentDatasheet__Group_3_5__1__Impl rule__ComponentDatasheet__Group_3_5__2 ;
    public final void rule__ComponentDatasheet__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:895:1: ( rule__ComponentDatasheet__Group_3_5__1__Impl rule__ComponentDatasheet__Group_3_5__2 )
            // InternalComponentDatasheet.g:896:2: rule__ComponentDatasheet__Group_3_5__1__Impl rule__ComponentDatasheet__Group_3_5__2
            {
            pushFollow(FOLLOW_9);
            rule__ComponentDatasheet__Group_3_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_5__2();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_5__1"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_5__1__Impl"
    // InternalComponentDatasheet.g:903:1: rule__ComponentDatasheet__Group_3_5__1__Impl : ( ( ':' )? ) ;
    public final void rule__ComponentDatasheet__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:907:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:908:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:908:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:909:2: ( ':' )?
            {
             before(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_5_1()); 
            // InternalComponentDatasheet.g:910:2: ( ':' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentDatasheet.g:910:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_5__1__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_5__2"
    // InternalComponentDatasheet.g:918:1: rule__ComponentDatasheet__Group_3_5__2 : rule__ComponentDatasheet__Group_3_5__2__Impl ;
    public final void rule__ComponentDatasheet__Group_3_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:922:1: ( rule__ComponentDatasheet__Group_3_5__2__Impl )
            // InternalComponentDatasheet.g:923:2: rule__ComponentDatasheet__Group_3_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_5__2__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_5__2"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_5__2__Impl"
    // InternalComponentDatasheet.g:929:1: rule__ComponentDatasheet__Group_3_5__2__Impl : ( ( rule__ComponentDatasheet__TrlAssignment_3_5_2 ) ) ;
    public final void rule__ComponentDatasheet__Group_3_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:933:1: ( ( ( rule__ComponentDatasheet__TrlAssignment_3_5_2 ) ) )
            // InternalComponentDatasheet.g:934:1: ( ( rule__ComponentDatasheet__TrlAssignment_3_5_2 ) )
            {
            // InternalComponentDatasheet.g:934:1: ( ( rule__ComponentDatasheet__TrlAssignment_3_5_2 ) )
            // InternalComponentDatasheet.g:935:2: ( rule__ComponentDatasheet__TrlAssignment_3_5_2 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getTrlAssignment_3_5_2()); 
            // InternalComponentDatasheet.g:936:2: ( rule__ComponentDatasheet__TrlAssignment_3_5_2 )
            // InternalComponentDatasheet.g:936:3: rule__ComponentDatasheet__TrlAssignment_3_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__TrlAssignment_3_5_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getTrlAssignment_3_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_5__2__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_6__0"
    // InternalComponentDatasheet.g:945:1: rule__ComponentDatasheet__Group_3_6__0 : rule__ComponentDatasheet__Group_3_6__0__Impl rule__ComponentDatasheet__Group_3_6__1 ;
    public final void rule__ComponentDatasheet__Group_3_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:949:1: ( rule__ComponentDatasheet__Group_3_6__0__Impl rule__ComponentDatasheet__Group_3_6__1 )
            // InternalComponentDatasheet.g:950:2: rule__ComponentDatasheet__Group_3_6__0__Impl rule__ComponentDatasheet__Group_3_6__1
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDatasheet__Group_3_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_6__1();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_6__0"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_6__0__Impl"
    // InternalComponentDatasheet.g:957:1: rule__ComponentDatasheet__Group_3_6__0__Impl : ( 'purposeDescription' ) ;
    public final void rule__ComponentDatasheet__Group_3_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:961:1: ( ( 'purposeDescription' ) )
            // InternalComponentDatasheet.g:962:1: ( 'purposeDescription' )
            {
            // InternalComponentDatasheet.g:962:1: ( 'purposeDescription' )
            // InternalComponentDatasheet.g:963:2: 'purposeDescription'
            {
             before(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionKeyword_3_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionKeyword_3_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_6__0__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_6__1"
    // InternalComponentDatasheet.g:972:1: rule__ComponentDatasheet__Group_3_6__1 : rule__ComponentDatasheet__Group_3_6__1__Impl rule__ComponentDatasheet__Group_3_6__2 ;
    public final void rule__ComponentDatasheet__Group_3_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:976:1: ( rule__ComponentDatasheet__Group_3_6__1__Impl rule__ComponentDatasheet__Group_3_6__2 )
            // InternalComponentDatasheet.g:977:2: rule__ComponentDatasheet__Group_3_6__1__Impl rule__ComponentDatasheet__Group_3_6__2
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDatasheet__Group_3_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_6__2();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_6__1"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_6__1__Impl"
    // InternalComponentDatasheet.g:984:1: rule__ComponentDatasheet__Group_3_6__1__Impl : ( ( ':' )? ) ;
    public final void rule__ComponentDatasheet__Group_3_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:988:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:989:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:989:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:990:2: ( ':' )?
            {
             before(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_6_1()); 
            // InternalComponentDatasheet.g:991:2: ( ':' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentDatasheet.g:991:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_6__1__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_6__2"
    // InternalComponentDatasheet.g:999:1: rule__ComponentDatasheet__Group_3_6__2 : rule__ComponentDatasheet__Group_3_6__2__Impl ;
    public final void rule__ComponentDatasheet__Group_3_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1003:1: ( rule__ComponentDatasheet__Group_3_6__2__Impl )
            // InternalComponentDatasheet.g:1004:2: rule__ComponentDatasheet__Group_3_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_6__2__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_6__2"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_6__2__Impl"
    // InternalComponentDatasheet.g:1010:1: rule__ComponentDatasheet__Group_3_6__2__Impl : ( ( rule__ComponentDatasheet__PurposeDescriptionAssignment_3_6_2 ) ) ;
    public final void rule__ComponentDatasheet__Group_3_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1014:1: ( ( ( rule__ComponentDatasheet__PurposeDescriptionAssignment_3_6_2 ) ) )
            // InternalComponentDatasheet.g:1015:1: ( ( rule__ComponentDatasheet__PurposeDescriptionAssignment_3_6_2 ) )
            {
            // InternalComponentDatasheet.g:1015:1: ( ( rule__ComponentDatasheet__PurposeDescriptionAssignment_3_6_2 ) )
            // InternalComponentDatasheet.g:1016:2: ( rule__ComponentDatasheet__PurposeDescriptionAssignment_3_6_2 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionAssignment_3_6_2()); 
            // InternalComponentDatasheet.g:1017:2: ( rule__ComponentDatasheet__PurposeDescriptionAssignment_3_6_2 )
            // InternalComponentDatasheet.g:1017:3: rule__ComponentDatasheet__PurposeDescriptionAssignment_3_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__PurposeDescriptionAssignment_3_6_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionAssignment_3_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_6__2__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_7__0"
    // InternalComponentDatasheet.g:1026:1: rule__ComponentDatasheet__Group_3_7__0 : rule__ComponentDatasheet__Group_3_7__0__Impl rule__ComponentDatasheet__Group_3_7__1 ;
    public final void rule__ComponentDatasheet__Group_3_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1030:1: ( rule__ComponentDatasheet__Group_3_7__0__Impl rule__ComponentDatasheet__Group_3_7__1 )
            // InternalComponentDatasheet.g:1031:2: rule__ComponentDatasheet__Group_3_7__0__Impl rule__ComponentDatasheet__Group_3_7__1
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDatasheet__Group_3_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_7__1();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_7__0"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_7__0__Impl"
    // InternalComponentDatasheet.g:1038:1: rule__ComponentDatasheet__Group_3_7__0__Impl : ( 'hardwareRequirementDescription' ) ;
    public final void rule__ComponentDatasheet__Group_3_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1042:1: ( ( 'hardwareRequirementDescription' ) )
            // InternalComponentDatasheet.g:1043:1: ( 'hardwareRequirementDescription' )
            {
            // InternalComponentDatasheet.g:1043:1: ( 'hardwareRequirementDescription' )
            // InternalComponentDatasheet.g:1044:2: 'hardwareRequirementDescription'
            {
             before(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionKeyword_3_7_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionKeyword_3_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_7__0__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_7__1"
    // InternalComponentDatasheet.g:1053:1: rule__ComponentDatasheet__Group_3_7__1 : rule__ComponentDatasheet__Group_3_7__1__Impl rule__ComponentDatasheet__Group_3_7__2 ;
    public final void rule__ComponentDatasheet__Group_3_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1057:1: ( rule__ComponentDatasheet__Group_3_7__1__Impl rule__ComponentDatasheet__Group_3_7__2 )
            // InternalComponentDatasheet.g:1058:2: rule__ComponentDatasheet__Group_3_7__1__Impl rule__ComponentDatasheet__Group_3_7__2
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDatasheet__Group_3_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_7__2();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_7__1"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_7__1__Impl"
    // InternalComponentDatasheet.g:1065:1: rule__ComponentDatasheet__Group_3_7__1__Impl : ( ( ':' )? ) ;
    public final void rule__ComponentDatasheet__Group_3_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1069:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:1070:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:1070:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:1071:2: ( ':' )?
            {
             before(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_7_1()); 
            // InternalComponentDatasheet.g:1072:2: ( ':' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentDatasheet.g:1072:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_7__1__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_7__2"
    // InternalComponentDatasheet.g:1080:1: rule__ComponentDatasheet__Group_3_7__2 : rule__ComponentDatasheet__Group_3_7__2__Impl ;
    public final void rule__ComponentDatasheet__Group_3_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1084:1: ( rule__ComponentDatasheet__Group_3_7__2__Impl )
            // InternalComponentDatasheet.g:1085:2: rule__ComponentDatasheet__Group_3_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_7__2__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_7__2"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_7__2__Impl"
    // InternalComponentDatasheet.g:1091:1: rule__ComponentDatasheet__Group_3_7__2__Impl : ( ( rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_3_7_2 ) ) ;
    public final void rule__ComponentDatasheet__Group_3_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1095:1: ( ( ( rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_3_7_2 ) ) )
            // InternalComponentDatasheet.g:1096:1: ( ( rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_3_7_2 ) )
            {
            // InternalComponentDatasheet.g:1096:1: ( ( rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_3_7_2 ) )
            // InternalComponentDatasheet.g:1097:2: ( rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_3_7_2 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionAssignment_3_7_2()); 
            // InternalComponentDatasheet.g:1098:2: ( rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_3_7_2 )
            // InternalComponentDatasheet.g:1098:3: rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_3_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_3_7_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionAssignment_3_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_7__2__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_8__0"
    // InternalComponentDatasheet.g:1107:1: rule__ComponentDatasheet__Group_3_8__0 : rule__ComponentDatasheet__Group_3_8__0__Impl rule__ComponentDatasheet__Group_3_8__1 ;
    public final void rule__ComponentDatasheet__Group_3_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1111:1: ( rule__ComponentDatasheet__Group_3_8__0__Impl rule__ComponentDatasheet__Group_3_8__1 )
            // InternalComponentDatasheet.g:1112:2: rule__ComponentDatasheet__Group_3_8__0__Impl rule__ComponentDatasheet__Group_3_8__1
            {
            pushFollow(FOLLOW_10);
            rule__ComponentDatasheet__Group_3_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_8__1();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_8__0"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_8__0__Impl"
    // InternalComponentDatasheet.g:1119:1: rule__ComponentDatasheet__Group_3_8__0__Impl : ( 'license' ) ;
    public final void rule__ComponentDatasheet__Group_3_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1123:1: ( ( 'license' ) )
            // InternalComponentDatasheet.g:1124:1: ( 'license' )
            {
            // InternalComponentDatasheet.g:1124:1: ( 'license' )
            // InternalComponentDatasheet.g:1125:2: 'license'
            {
             before(grammarAccess.getComponentDatasheetAccess().getLicenseKeyword_3_8_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getLicenseKeyword_3_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_8__0__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_8__1"
    // InternalComponentDatasheet.g:1134:1: rule__ComponentDatasheet__Group_3_8__1 : rule__ComponentDatasheet__Group_3_8__1__Impl rule__ComponentDatasheet__Group_3_8__2 ;
    public final void rule__ComponentDatasheet__Group_3_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1138:1: ( rule__ComponentDatasheet__Group_3_8__1__Impl rule__ComponentDatasheet__Group_3_8__2 )
            // InternalComponentDatasheet.g:1139:2: rule__ComponentDatasheet__Group_3_8__1__Impl rule__ComponentDatasheet__Group_3_8__2
            {
            pushFollow(FOLLOW_10);
            rule__ComponentDatasheet__Group_3_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_8__2();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_8__1"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_8__1__Impl"
    // InternalComponentDatasheet.g:1146:1: rule__ComponentDatasheet__Group_3_8__1__Impl : ( ( ':' )? ) ;
    public final void rule__ComponentDatasheet__Group_3_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1150:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:1151:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:1151:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:1152:2: ( ':' )?
            {
             before(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_8_1()); 
            // InternalComponentDatasheet.g:1153:2: ( ':' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentDatasheet.g:1153:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_8__1__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_8__2"
    // InternalComponentDatasheet.g:1161:1: rule__ComponentDatasheet__Group_3_8__2 : rule__ComponentDatasheet__Group_3_8__2__Impl ;
    public final void rule__ComponentDatasheet__Group_3_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1165:1: ( rule__ComponentDatasheet__Group_3_8__2__Impl )
            // InternalComponentDatasheet.g:1166:2: rule__ComponentDatasheet__Group_3_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_3_8__2__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_3_8__2"


    // $ANTLR start "rule__ComponentDatasheet__Group_3_8__2__Impl"
    // InternalComponentDatasheet.g:1172:1: rule__ComponentDatasheet__Group_3_8__2__Impl : ( ( rule__ComponentDatasheet__LicenseAssignment_3_8_2 ) ) ;
    public final void rule__ComponentDatasheet__Group_3_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1176:1: ( ( ( rule__ComponentDatasheet__LicenseAssignment_3_8_2 ) ) )
            // InternalComponentDatasheet.g:1177:1: ( ( rule__ComponentDatasheet__LicenseAssignment_3_8_2 ) )
            {
            // InternalComponentDatasheet.g:1177:1: ( ( rule__ComponentDatasheet__LicenseAssignment_3_8_2 ) )
            // InternalComponentDatasheet.g:1178:2: ( rule__ComponentDatasheet__LicenseAssignment_3_8_2 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getLicenseAssignment_3_8_2()); 
            // InternalComponentDatasheet.g:1179:2: ( rule__ComponentDatasheet__LicenseAssignment_3_8_2 )
            // InternalComponentDatasheet.g:1179:3: rule__ComponentDatasheet__LicenseAssignment_3_8_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__LicenseAssignment_3_8_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getLicenseAssignment_3_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_3_8__2__Impl"


    // $ANTLR start "rule__SpdxLicense__Group__0"
    // InternalComponentDatasheet.g:1188:1: rule__SpdxLicense__Group__0 : rule__SpdxLicense__Group__0__Impl rule__SpdxLicense__Group__1 ;
    public final void rule__SpdxLicense__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1192:1: ( rule__SpdxLicense__Group__0__Impl rule__SpdxLicense__Group__1 )
            // InternalComponentDatasheet.g:1193:2: rule__SpdxLicense__Group__0__Impl rule__SpdxLicense__Group__1
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
    // InternalComponentDatasheet.g:1200:1: rule__SpdxLicense__Group__0__Impl : ( 'spdx' ) ;
    public final void rule__SpdxLicense__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1204:1: ( ( 'spdx' ) )
            // InternalComponentDatasheet.g:1205:1: ( 'spdx' )
            {
            // InternalComponentDatasheet.g:1205:1: ( 'spdx' )
            // InternalComponentDatasheet.g:1206:2: 'spdx'
            {
             before(grammarAccess.getSpdxLicenseAccess().getSpdxKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:1215:1: rule__SpdxLicense__Group__1 : rule__SpdxLicense__Group__1__Impl rule__SpdxLicense__Group__2 ;
    public final void rule__SpdxLicense__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1219:1: ( rule__SpdxLicense__Group__1__Impl rule__SpdxLicense__Group__2 )
            // InternalComponentDatasheet.g:1220:2: rule__SpdxLicense__Group__1__Impl rule__SpdxLicense__Group__2
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
    // InternalComponentDatasheet.g:1227:1: rule__SpdxLicense__Group__1__Impl : ( '(' ) ;
    public final void rule__SpdxLicense__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1231:1: ( ( '(' ) )
            // InternalComponentDatasheet.g:1232:1: ( '(' )
            {
            // InternalComponentDatasheet.g:1232:1: ( '(' )
            // InternalComponentDatasheet.g:1233:2: '('
            {
             before(grammarAccess.getSpdxLicenseAccess().getLeftParenthesisKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:1242:1: rule__SpdxLicense__Group__2 : rule__SpdxLicense__Group__2__Impl rule__SpdxLicense__Group__3 ;
    public final void rule__SpdxLicense__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1246:1: ( rule__SpdxLicense__Group__2__Impl rule__SpdxLicense__Group__3 )
            // InternalComponentDatasheet.g:1247:2: rule__SpdxLicense__Group__2__Impl rule__SpdxLicense__Group__3
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
    // InternalComponentDatasheet.g:1254:1: rule__SpdxLicense__Group__2__Impl : ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) ) ;
    public final void rule__SpdxLicense__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1258:1: ( ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) ) )
            // InternalComponentDatasheet.g:1259:1: ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) )
            {
            // InternalComponentDatasheet.g:1259:1: ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) )
            // InternalComponentDatasheet.g:1260:2: ( rule__SpdxLicense__LicenseIDAssignment_2 )
            {
             before(grammarAccess.getSpdxLicenseAccess().getLicenseIDAssignment_2()); 
            // InternalComponentDatasheet.g:1261:2: ( rule__SpdxLicense__LicenseIDAssignment_2 )
            // InternalComponentDatasheet.g:1261:3: rule__SpdxLicense__LicenseIDAssignment_2
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
    // InternalComponentDatasheet.g:1269:1: rule__SpdxLicense__Group__3 : rule__SpdxLicense__Group__3__Impl ;
    public final void rule__SpdxLicense__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1273:1: ( rule__SpdxLicense__Group__3__Impl )
            // InternalComponentDatasheet.g:1274:2: rule__SpdxLicense__Group__3__Impl
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
    // InternalComponentDatasheet.g:1280:1: rule__SpdxLicense__Group__3__Impl : ( ')' ) ;
    public final void rule__SpdxLicense__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1284:1: ( ( ')' ) )
            // InternalComponentDatasheet.g:1285:1: ( ')' )
            {
            // InternalComponentDatasheet.g:1285:1: ( ')' )
            // InternalComponentDatasheet.g:1286:2: ')'
            {
             before(grammarAccess.getSpdxLicenseAccess().getRightParenthesisKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:1296:1: rule__ProprietaryLicense__Group__0 : rule__ProprietaryLicense__Group__0__Impl rule__ProprietaryLicense__Group__1 ;
    public final void rule__ProprietaryLicense__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1300:1: ( rule__ProprietaryLicense__Group__0__Impl rule__ProprietaryLicense__Group__1 )
            // InternalComponentDatasheet.g:1301:2: rule__ProprietaryLicense__Group__0__Impl rule__ProprietaryLicense__Group__1
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
    // InternalComponentDatasheet.g:1308:1: rule__ProprietaryLicense__Group__0__Impl : ( () ) ;
    public final void rule__ProprietaryLicense__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1312:1: ( ( () ) )
            // InternalComponentDatasheet.g:1313:1: ( () )
            {
            // InternalComponentDatasheet.g:1313:1: ( () )
            // InternalComponentDatasheet.g:1314:2: ()
            {
             before(grammarAccess.getProprietaryLicenseAccess().getProprietaryLicenseAction_0()); 
            // InternalComponentDatasheet.g:1315:2: ()
            // InternalComponentDatasheet.g:1315:3: 
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
    // InternalComponentDatasheet.g:1323:1: rule__ProprietaryLicense__Group__1 : rule__ProprietaryLicense__Group__1__Impl rule__ProprietaryLicense__Group__2 ;
    public final void rule__ProprietaryLicense__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1327:1: ( rule__ProprietaryLicense__Group__1__Impl rule__ProprietaryLicense__Group__2 )
            // InternalComponentDatasheet.g:1328:2: rule__ProprietaryLicense__Group__1__Impl rule__ProprietaryLicense__Group__2
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
    // InternalComponentDatasheet.g:1335:1: rule__ProprietaryLicense__Group__1__Impl : ( 'proprietary' ) ;
    public final void rule__ProprietaryLicense__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1339:1: ( ( 'proprietary' ) )
            // InternalComponentDatasheet.g:1340:1: ( 'proprietary' )
            {
            // InternalComponentDatasheet.g:1340:1: ( 'proprietary' )
            // InternalComponentDatasheet.g:1341:2: 'proprietary'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getProprietaryKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:1350:1: rule__ProprietaryLicense__Group__2 : rule__ProprietaryLicense__Group__2__Impl rule__ProprietaryLicense__Group__3 ;
    public final void rule__ProprietaryLicense__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1354:1: ( rule__ProprietaryLicense__Group__2__Impl rule__ProprietaryLicense__Group__3 )
            // InternalComponentDatasheet.g:1355:2: rule__ProprietaryLicense__Group__2__Impl rule__ProprietaryLicense__Group__3
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
    // InternalComponentDatasheet.g:1362:1: rule__ProprietaryLicense__Group__2__Impl : ( '{' ) ;
    public final void rule__ProprietaryLicense__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1366:1: ( ( '{' ) )
            // InternalComponentDatasheet.g:1367:1: ( '{' )
            {
            // InternalComponentDatasheet.g:1367:1: ( '{' )
            // InternalComponentDatasheet.g:1368:2: '{'
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
    // InternalComponentDatasheet.g:1377:1: rule__ProprietaryLicense__Group__3 : rule__ProprietaryLicense__Group__3__Impl rule__ProprietaryLicense__Group__4 ;
    public final void rule__ProprietaryLicense__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1381:1: ( rule__ProprietaryLicense__Group__3__Impl rule__ProprietaryLicense__Group__4 )
            // InternalComponentDatasheet.g:1382:2: rule__ProprietaryLicense__Group__3__Impl rule__ProprietaryLicense__Group__4
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
    // InternalComponentDatasheet.g:1389:1: rule__ProprietaryLicense__Group__3__Impl : ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) ) ;
    public final void rule__ProprietaryLicense__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1393:1: ( ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) ) )
            // InternalComponentDatasheet.g:1394:1: ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) )
            {
            // InternalComponentDatasheet.g:1394:1: ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) )
            // InternalComponentDatasheet.g:1395:2: ( rule__ProprietaryLicense__UnorderedGroup_3 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3()); 
            // InternalComponentDatasheet.g:1396:2: ( rule__ProprietaryLicense__UnorderedGroup_3 )
            // InternalComponentDatasheet.g:1396:3: rule__ProprietaryLicense__UnorderedGroup_3
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
    // InternalComponentDatasheet.g:1404:1: rule__ProprietaryLicense__Group__4 : rule__ProprietaryLicense__Group__4__Impl ;
    public final void rule__ProprietaryLicense__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1408:1: ( rule__ProprietaryLicense__Group__4__Impl )
            // InternalComponentDatasheet.g:1409:2: rule__ProprietaryLicense__Group__4__Impl
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
    // InternalComponentDatasheet.g:1415:1: rule__ProprietaryLicense__Group__4__Impl : ( '}' ) ;
    public final void rule__ProprietaryLicense__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1419:1: ( ( '}' ) )
            // InternalComponentDatasheet.g:1420:1: ( '}' )
            {
            // InternalComponentDatasheet.g:1420:1: ( '}' )
            // InternalComponentDatasheet.g:1421:2: '}'
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
    // InternalComponentDatasheet.g:1431:1: rule__ProprietaryLicense__Group_3_0__0 : rule__ProprietaryLicense__Group_3_0__0__Impl rule__ProprietaryLicense__Group_3_0__1 ;
    public final void rule__ProprietaryLicense__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1435:1: ( rule__ProprietaryLicense__Group_3_0__0__Impl rule__ProprietaryLicense__Group_3_0__1 )
            // InternalComponentDatasheet.g:1436:2: rule__ProprietaryLicense__Group_3_0__0__Impl rule__ProprietaryLicense__Group_3_0__1
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
    // InternalComponentDatasheet.g:1443:1: rule__ProprietaryLicense__Group_3_0__0__Impl : ( 'name' ) ;
    public final void rule__ProprietaryLicense__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1447:1: ( ( 'name' ) )
            // InternalComponentDatasheet.g:1448:1: ( 'name' )
            {
            // InternalComponentDatasheet.g:1448:1: ( 'name' )
            // InternalComponentDatasheet.g:1449:2: 'name'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getNameKeyword_3_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:1458:1: rule__ProprietaryLicense__Group_3_0__1 : rule__ProprietaryLicense__Group_3_0__1__Impl rule__ProprietaryLicense__Group_3_0__2 ;
    public final void rule__ProprietaryLicense__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1462:1: ( rule__ProprietaryLicense__Group_3_0__1__Impl rule__ProprietaryLicense__Group_3_0__2 )
            // InternalComponentDatasheet.g:1463:2: rule__ProprietaryLicense__Group_3_0__1__Impl rule__ProprietaryLicense__Group_3_0__2
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
    // InternalComponentDatasheet.g:1470:1: rule__ProprietaryLicense__Group_3_0__1__Impl : ( ( ':' )? ) ;
    public final void rule__ProprietaryLicense__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1474:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:1475:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:1475:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:1476:2: ( ':' )?
            {
             before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_0_1()); 
            // InternalComponentDatasheet.g:1477:2: ( ':' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentDatasheet.g:1477:3: ':'
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
    // InternalComponentDatasheet.g:1485:1: rule__ProprietaryLicense__Group_3_0__2 : rule__ProprietaryLicense__Group_3_0__2__Impl ;
    public final void rule__ProprietaryLicense__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1489:1: ( rule__ProprietaryLicense__Group_3_0__2__Impl )
            // InternalComponentDatasheet.g:1490:2: rule__ProprietaryLicense__Group_3_0__2__Impl
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
    // InternalComponentDatasheet.g:1496:1: rule__ProprietaryLicense__Group_3_0__2__Impl : ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) ) ;
    public final void rule__ProprietaryLicense__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1500:1: ( ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) ) )
            // InternalComponentDatasheet.g:1501:1: ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) )
            {
            // InternalComponentDatasheet.g:1501:1: ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) )
            // InternalComponentDatasheet.g:1502:2: ( rule__ProprietaryLicense__NameAssignment_3_0_2 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getNameAssignment_3_0_2()); 
            // InternalComponentDatasheet.g:1503:2: ( rule__ProprietaryLicense__NameAssignment_3_0_2 )
            // InternalComponentDatasheet.g:1503:3: rule__ProprietaryLicense__NameAssignment_3_0_2
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
    // InternalComponentDatasheet.g:1512:1: rule__ProprietaryLicense__Group_3_1__0 : rule__ProprietaryLicense__Group_3_1__0__Impl rule__ProprietaryLicense__Group_3_1__1 ;
    public final void rule__ProprietaryLicense__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1516:1: ( rule__ProprietaryLicense__Group_3_1__0__Impl rule__ProprietaryLicense__Group_3_1__1 )
            // InternalComponentDatasheet.g:1517:2: rule__ProprietaryLicense__Group_3_1__0__Impl rule__ProprietaryLicense__Group_3_1__1
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
    // InternalComponentDatasheet.g:1524:1: rule__ProprietaryLicense__Group_3_1__0__Impl : ( 'fullText' ) ;
    public final void rule__ProprietaryLicense__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1528:1: ( ( 'fullText' ) )
            // InternalComponentDatasheet.g:1529:1: ( 'fullText' )
            {
            // InternalComponentDatasheet.g:1529:1: ( 'fullText' )
            // InternalComponentDatasheet.g:1530:2: 'fullText'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getFullTextKeyword_3_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:1539:1: rule__ProprietaryLicense__Group_3_1__1 : rule__ProprietaryLicense__Group_3_1__1__Impl rule__ProprietaryLicense__Group_3_1__2 ;
    public final void rule__ProprietaryLicense__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1543:1: ( rule__ProprietaryLicense__Group_3_1__1__Impl rule__ProprietaryLicense__Group_3_1__2 )
            // InternalComponentDatasheet.g:1544:2: rule__ProprietaryLicense__Group_3_1__1__Impl rule__ProprietaryLicense__Group_3_1__2
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
    // InternalComponentDatasheet.g:1551:1: rule__ProprietaryLicense__Group_3_1__1__Impl : ( ( ':' )? ) ;
    public final void rule__ProprietaryLicense__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1555:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:1556:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:1556:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:1557:2: ( ':' )?
            {
             before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_1_1()); 
            // InternalComponentDatasheet.g:1558:2: ( ':' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentDatasheet.g:1558:3: ':'
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
    // InternalComponentDatasheet.g:1566:1: rule__ProprietaryLicense__Group_3_1__2 : rule__ProprietaryLicense__Group_3_1__2__Impl ;
    public final void rule__ProprietaryLicense__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1570:1: ( rule__ProprietaryLicense__Group_3_1__2__Impl )
            // InternalComponentDatasheet.g:1571:2: rule__ProprietaryLicense__Group_3_1__2__Impl
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
    // InternalComponentDatasheet.g:1577:1: rule__ProprietaryLicense__Group_3_1__2__Impl : ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) ) ;
    public final void rule__ProprietaryLicense__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1581:1: ( ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) ) )
            // InternalComponentDatasheet.g:1582:1: ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) )
            {
            // InternalComponentDatasheet.g:1582:1: ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) )
            // InternalComponentDatasheet.g:1583:2: ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getFullTextAssignment_3_1_2()); 
            // InternalComponentDatasheet.g:1584:2: ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 )
            // InternalComponentDatasheet.g:1584:3: rule__ProprietaryLicense__FullTextAssignment_3_1_2
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
    // InternalComponentDatasheet.g:1593:1: rule__ProprietaryLicense__Group_3_2__0 : rule__ProprietaryLicense__Group_3_2__0__Impl rule__ProprietaryLicense__Group_3_2__1 ;
    public final void rule__ProprietaryLicense__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1597:1: ( rule__ProprietaryLicense__Group_3_2__0__Impl rule__ProprietaryLicense__Group_3_2__1 )
            // InternalComponentDatasheet.g:1598:2: rule__ProprietaryLicense__Group_3_2__0__Impl rule__ProprietaryLicense__Group_3_2__1
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
    // InternalComponentDatasheet.g:1605:1: rule__ProprietaryLicense__Group_3_2__0__Impl : ( 'URL' ) ;
    public final void rule__ProprietaryLicense__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1609:1: ( ( 'URL' ) )
            // InternalComponentDatasheet.g:1610:1: ( 'URL' )
            {
            // InternalComponentDatasheet.g:1610:1: ( 'URL' )
            // InternalComponentDatasheet.g:1611:2: 'URL'
            {
             before(grammarAccess.getProprietaryLicenseAccess().getURLKeyword_3_2_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:1620:1: rule__ProprietaryLicense__Group_3_2__1 : rule__ProprietaryLicense__Group_3_2__1__Impl rule__ProprietaryLicense__Group_3_2__2 ;
    public final void rule__ProprietaryLicense__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1624:1: ( rule__ProprietaryLicense__Group_3_2__1__Impl rule__ProprietaryLicense__Group_3_2__2 )
            // InternalComponentDatasheet.g:1625:2: rule__ProprietaryLicense__Group_3_2__1__Impl rule__ProprietaryLicense__Group_3_2__2
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
    // InternalComponentDatasheet.g:1632:1: rule__ProprietaryLicense__Group_3_2__1__Impl : ( ( ':' )? ) ;
    public final void rule__ProprietaryLicense__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1636:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:1637:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:1637:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:1638:2: ( ':' )?
            {
             before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_2_1()); 
            // InternalComponentDatasheet.g:1639:2: ( ':' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentDatasheet.g:1639:3: ':'
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
    // InternalComponentDatasheet.g:1647:1: rule__ProprietaryLicense__Group_3_2__2 : rule__ProprietaryLicense__Group_3_2__2__Impl ;
    public final void rule__ProprietaryLicense__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1651:1: ( rule__ProprietaryLicense__Group_3_2__2__Impl )
            // InternalComponentDatasheet.g:1652:2: rule__ProprietaryLicense__Group_3_2__2__Impl
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
    // InternalComponentDatasheet.g:1658:1: rule__ProprietaryLicense__Group_3_2__2__Impl : ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) ) ;
    public final void rule__ProprietaryLicense__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1662:1: ( ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) ) )
            // InternalComponentDatasheet.g:1663:1: ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) )
            {
            // InternalComponentDatasheet.g:1663:1: ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) )
            // InternalComponentDatasheet.g:1664:2: ( rule__ProprietaryLicense__UrlAssignment_3_2_2 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getUrlAssignment_3_2_2()); 
            // InternalComponentDatasheet.g:1665:2: ( rule__ProprietaryLicense__UrlAssignment_3_2_2 )
            // InternalComponentDatasheet.g:1665:3: rule__ProprietaryLicense__UrlAssignment_3_2_2
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


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_3"
    // InternalComponentDatasheet.g:1674:1: rule__ComponentDatasheet__UnorderedGroup_3 : rule__ComponentDatasheet__UnorderedGroup_3__0 {...}?;
    public final void rule__ComponentDatasheet__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3());
        	
        try {
            // InternalComponentDatasheet.g:1679:1: ( rule__ComponentDatasheet__UnorderedGroup_3__0 {...}?)
            // InternalComponentDatasheet.g:1680:2: rule__ComponentDatasheet__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__ComponentDatasheet__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_3"


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_3__Impl"
    // InternalComponentDatasheet.g:1688:1: rule__ComponentDatasheet__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_5__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_6__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_7__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_8__0 ) ) ) ) ) ;
    public final void rule__ComponentDatasheet__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDatasheet.g:1693:1: ( ( ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_5__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_6__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_7__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_8__0 ) ) ) ) ) )
            // InternalComponentDatasheet.g:1694:3: ( ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_5__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_6__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_7__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_8__0 ) ) ) ) )
            {
            // InternalComponentDatasheet.g:1694:3: ( ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_5__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_6__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_7__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_8__0 ) ) ) ) )
            int alt15=9;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalComponentDatasheet.g:1695:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_0__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1695:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_0__0 ) ) ) )
                    // InternalComponentDatasheet.g:1696:4: {...}? => ( ( ( rule__ComponentDatasheet__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDatasheet__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalComponentDatasheet.g:1696:114: ( ( ( rule__ComponentDatasheet__Group_3_0__0 ) ) )
                    // InternalComponentDatasheet.g:1697:5: ( ( rule__ComponentDatasheet__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1703:5: ( ( rule__ComponentDatasheet__Group_3_0__0 ) )
                    // InternalComponentDatasheet.g:1704:6: ( rule__ComponentDatasheet__Group_3_0__0 )
                    {
                     before(grammarAccess.getComponentDatasheetAccess().getGroup_3_0()); 
                    // InternalComponentDatasheet.g:1705:6: ( rule__ComponentDatasheet__Group_3_0__0 )
                    // InternalComponentDatasheet.g:1705:7: rule__ComponentDatasheet__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDatasheetAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDatasheet.g:1710:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_1__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1710:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_1__0 ) ) ) )
                    // InternalComponentDatasheet.g:1711:4: {...}? => ( ( ( rule__ComponentDatasheet__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDatasheet__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalComponentDatasheet.g:1711:114: ( ( ( rule__ComponentDatasheet__Group_3_1__0 ) ) )
                    // InternalComponentDatasheet.g:1712:5: ( ( rule__ComponentDatasheet__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1718:5: ( ( rule__ComponentDatasheet__Group_3_1__0 ) )
                    // InternalComponentDatasheet.g:1719:6: ( rule__ComponentDatasheet__Group_3_1__0 )
                    {
                     before(grammarAccess.getComponentDatasheetAccess().getGroup_3_1()); 
                    // InternalComponentDatasheet.g:1720:6: ( rule__ComponentDatasheet__Group_3_1__0 )
                    // InternalComponentDatasheet.g:1720:7: rule__ComponentDatasheet__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDatasheetAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDatasheet.g:1725:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_2__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1725:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_2__0 ) ) ) )
                    // InternalComponentDatasheet.g:1726:4: {...}? => ( ( ( rule__ComponentDatasheet__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDatasheet__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalComponentDatasheet.g:1726:114: ( ( ( rule__ComponentDatasheet__Group_3_2__0 ) ) )
                    // InternalComponentDatasheet.g:1727:5: ( ( rule__ComponentDatasheet__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1733:5: ( ( rule__ComponentDatasheet__Group_3_2__0 ) )
                    // InternalComponentDatasheet.g:1734:6: ( rule__ComponentDatasheet__Group_3_2__0 )
                    {
                     before(grammarAccess.getComponentDatasheetAccess().getGroup_3_2()); 
                    // InternalComponentDatasheet.g:1735:6: ( rule__ComponentDatasheet__Group_3_2__0 )
                    // InternalComponentDatasheet.g:1735:7: rule__ComponentDatasheet__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDatasheetAccess().getGroup_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalComponentDatasheet.g:1740:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_3__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1740:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_3__0 ) ) ) )
                    // InternalComponentDatasheet.g:1741:4: {...}? => ( ( ( rule__ComponentDatasheet__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDatasheet__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalComponentDatasheet.g:1741:114: ( ( ( rule__ComponentDatasheet__Group_3_3__0 ) ) )
                    // InternalComponentDatasheet.g:1742:5: ( ( rule__ComponentDatasheet__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1748:5: ( ( rule__ComponentDatasheet__Group_3_3__0 ) )
                    // InternalComponentDatasheet.g:1749:6: ( rule__ComponentDatasheet__Group_3_3__0 )
                    {
                     before(grammarAccess.getComponentDatasheetAccess().getGroup_3_3()); 
                    // InternalComponentDatasheet.g:1750:6: ( rule__ComponentDatasheet__Group_3_3__0 )
                    // InternalComponentDatasheet.g:1750:7: rule__ComponentDatasheet__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDatasheetAccess().getGroup_3_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalComponentDatasheet.g:1755:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_4__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1755:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_4__0 ) ) ) )
                    // InternalComponentDatasheet.g:1756:4: {...}? => ( ( ( rule__ComponentDatasheet__Group_3_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDatasheet__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalComponentDatasheet.g:1756:114: ( ( ( rule__ComponentDatasheet__Group_3_4__0 ) ) )
                    // InternalComponentDatasheet.g:1757:5: ( ( rule__ComponentDatasheet__Group_3_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1763:5: ( ( rule__ComponentDatasheet__Group_3_4__0 ) )
                    // InternalComponentDatasheet.g:1764:6: ( rule__ComponentDatasheet__Group_3_4__0 )
                    {
                     before(grammarAccess.getComponentDatasheetAccess().getGroup_3_4()); 
                    // InternalComponentDatasheet.g:1765:6: ( rule__ComponentDatasheet__Group_3_4__0 )
                    // InternalComponentDatasheet.g:1765:7: rule__ComponentDatasheet__Group_3_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__Group_3_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDatasheetAccess().getGroup_3_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalComponentDatasheet.g:1770:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_5__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1770:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_5__0 ) ) ) )
                    // InternalComponentDatasheet.g:1771:4: {...}? => ( ( ( rule__ComponentDatasheet__Group_3_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDatasheet__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5)");
                    }
                    // InternalComponentDatasheet.g:1771:114: ( ( ( rule__ComponentDatasheet__Group_3_5__0 ) ) )
                    // InternalComponentDatasheet.g:1772:5: ( ( rule__ComponentDatasheet__Group_3_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1778:5: ( ( rule__ComponentDatasheet__Group_3_5__0 ) )
                    // InternalComponentDatasheet.g:1779:6: ( rule__ComponentDatasheet__Group_3_5__0 )
                    {
                     before(grammarAccess.getComponentDatasheetAccess().getGroup_3_5()); 
                    // InternalComponentDatasheet.g:1780:6: ( rule__ComponentDatasheet__Group_3_5__0 )
                    // InternalComponentDatasheet.g:1780:7: rule__ComponentDatasheet__Group_3_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__Group_3_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDatasheetAccess().getGroup_3_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalComponentDatasheet.g:1785:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_6__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1785:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_6__0 ) ) ) )
                    // InternalComponentDatasheet.g:1786:4: {...}? => ( ( ( rule__ComponentDatasheet__Group_3_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDatasheet__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6)");
                    }
                    // InternalComponentDatasheet.g:1786:114: ( ( ( rule__ComponentDatasheet__Group_3_6__0 ) ) )
                    // InternalComponentDatasheet.g:1787:5: ( ( rule__ComponentDatasheet__Group_3_6__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1793:5: ( ( rule__ComponentDatasheet__Group_3_6__0 ) )
                    // InternalComponentDatasheet.g:1794:6: ( rule__ComponentDatasheet__Group_3_6__0 )
                    {
                     before(grammarAccess.getComponentDatasheetAccess().getGroup_3_6()); 
                    // InternalComponentDatasheet.g:1795:6: ( rule__ComponentDatasheet__Group_3_6__0 )
                    // InternalComponentDatasheet.g:1795:7: rule__ComponentDatasheet__Group_3_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__Group_3_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDatasheetAccess().getGroup_3_6()); 

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalComponentDatasheet.g:1800:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_7__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1800:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_7__0 ) ) ) )
                    // InternalComponentDatasheet.g:1801:4: {...}? => ( ( ( rule__ComponentDatasheet__Group_3_7__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDatasheet__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7)");
                    }
                    // InternalComponentDatasheet.g:1801:114: ( ( ( rule__ComponentDatasheet__Group_3_7__0 ) ) )
                    // InternalComponentDatasheet.g:1802:5: ( ( rule__ComponentDatasheet__Group_3_7__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1808:5: ( ( rule__ComponentDatasheet__Group_3_7__0 ) )
                    // InternalComponentDatasheet.g:1809:6: ( rule__ComponentDatasheet__Group_3_7__0 )
                    {
                     before(grammarAccess.getComponentDatasheetAccess().getGroup_3_7()); 
                    // InternalComponentDatasheet.g:1810:6: ( rule__ComponentDatasheet__Group_3_7__0 )
                    // InternalComponentDatasheet.g:1810:7: rule__ComponentDatasheet__Group_3_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__Group_3_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDatasheetAccess().getGroup_3_7()); 

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalComponentDatasheet.g:1815:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_8__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1815:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_8__0 ) ) ) )
                    // InternalComponentDatasheet.g:1816:4: {...}? => ( ( ( rule__ComponentDatasheet__Group_3_8__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDatasheet__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8)");
                    }
                    // InternalComponentDatasheet.g:1816:114: ( ( ( rule__ComponentDatasheet__Group_3_8__0 ) ) )
                    // InternalComponentDatasheet.g:1817:5: ( ( rule__ComponentDatasheet__Group_3_8__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1823:5: ( ( rule__ComponentDatasheet__Group_3_8__0 ) )
                    // InternalComponentDatasheet.g:1824:6: ( rule__ComponentDatasheet__Group_3_8__0 )
                    {
                     before(grammarAccess.getComponentDatasheetAccess().getGroup_3_8()); 
                    // InternalComponentDatasheet.g:1825:6: ( rule__ComponentDatasheet__Group_3_8__0 )
                    // InternalComponentDatasheet.g:1825:7: rule__ComponentDatasheet__Group_3_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__Group_3_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDatasheetAccess().getGroup_3_8()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_3__0"
    // InternalComponentDatasheet.g:1838:1: rule__ComponentDatasheet__UnorderedGroup_3__0 : rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__1 )? ;
    public final void rule__ComponentDatasheet__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1842:1: ( rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__1 )? )
            // InternalComponentDatasheet.g:1843:2: rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_14);
            rule__ComponentDatasheet__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1844:2: ( rule__ComponentDatasheet__UnorderedGroup_3__1 )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalComponentDatasheet.g:1844:2: rule__ComponentDatasheet__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_3__0"


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_3__1"
    // InternalComponentDatasheet.g:1850:1: rule__ComponentDatasheet__UnorderedGroup_3__1 : rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__2 )? ;
    public final void rule__ComponentDatasheet__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1854:1: ( rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__2 )? )
            // InternalComponentDatasheet.g:1855:2: rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_14);
            rule__ComponentDatasheet__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1856:2: ( rule__ComponentDatasheet__UnorderedGroup_3__2 )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalComponentDatasheet.g:1856:2: rule__ComponentDatasheet__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__UnorderedGroup_3__2();

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
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_3__1"


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_3__2"
    // InternalComponentDatasheet.g:1862:1: rule__ComponentDatasheet__UnorderedGroup_3__2 : rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__3 )? ;
    public final void rule__ComponentDatasheet__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1866:1: ( rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__3 )? )
            // InternalComponentDatasheet.g:1867:2: rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_14);
            rule__ComponentDatasheet__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1868:2: ( rule__ComponentDatasheet__UnorderedGroup_3__3 )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalComponentDatasheet.g:1868:2: rule__ComponentDatasheet__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__UnorderedGroup_3__3();

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
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_3__2"


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_3__3"
    // InternalComponentDatasheet.g:1874:1: rule__ComponentDatasheet__UnorderedGroup_3__3 : rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__4 )? ;
    public final void rule__ComponentDatasheet__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1878:1: ( rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__4 )? )
            // InternalComponentDatasheet.g:1879:2: rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_14);
            rule__ComponentDatasheet__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1880:2: ( rule__ComponentDatasheet__UnorderedGroup_3__4 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalComponentDatasheet.g:1880:2: rule__ComponentDatasheet__UnorderedGroup_3__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__UnorderedGroup_3__4();

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
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_3__3"


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_3__4"
    // InternalComponentDatasheet.g:1886:1: rule__ComponentDatasheet__UnorderedGroup_3__4 : rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__5 )? ;
    public final void rule__ComponentDatasheet__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1890:1: ( rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__5 )? )
            // InternalComponentDatasheet.g:1891:2: rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__5 )?
            {
            pushFollow(FOLLOW_14);
            rule__ComponentDatasheet__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1892:2: ( rule__ComponentDatasheet__UnorderedGroup_3__5 )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalComponentDatasheet.g:1892:2: rule__ComponentDatasheet__UnorderedGroup_3__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__UnorderedGroup_3__5();

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
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_3__4"


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_3__5"
    // InternalComponentDatasheet.g:1898:1: rule__ComponentDatasheet__UnorderedGroup_3__5 : rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__6 )? ;
    public final void rule__ComponentDatasheet__UnorderedGroup_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1902:1: ( rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__6 )? )
            // InternalComponentDatasheet.g:1903:2: rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__6 )?
            {
            pushFollow(FOLLOW_14);
            rule__ComponentDatasheet__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1904:2: ( rule__ComponentDatasheet__UnorderedGroup_3__6 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalComponentDatasheet.g:1904:2: rule__ComponentDatasheet__UnorderedGroup_3__6
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__UnorderedGroup_3__6();

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
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_3__5"


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_3__6"
    // InternalComponentDatasheet.g:1910:1: rule__ComponentDatasheet__UnorderedGroup_3__6 : rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__7 )? ;
    public final void rule__ComponentDatasheet__UnorderedGroup_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1914:1: ( rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__7 )? )
            // InternalComponentDatasheet.g:1915:2: rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__7 )?
            {
            pushFollow(FOLLOW_14);
            rule__ComponentDatasheet__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1916:2: ( rule__ComponentDatasheet__UnorderedGroup_3__7 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalComponentDatasheet.g:1916:2: rule__ComponentDatasheet__UnorderedGroup_3__7
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__UnorderedGroup_3__7();

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
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_3__6"


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_3__7"
    // InternalComponentDatasheet.g:1922:1: rule__ComponentDatasheet__UnorderedGroup_3__7 : rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__8 )? ;
    public final void rule__ComponentDatasheet__UnorderedGroup_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1926:1: ( rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__8 )? )
            // InternalComponentDatasheet.g:1927:2: rule__ComponentDatasheet__UnorderedGroup_3__Impl ( rule__ComponentDatasheet__UnorderedGroup_3__8 )?
            {
            pushFollow(FOLLOW_14);
            rule__ComponentDatasheet__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1928:2: ( rule__ComponentDatasheet__UnorderedGroup_3__8 )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalComponentDatasheet.g:1928:2: rule__ComponentDatasheet__UnorderedGroup_3__8
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__UnorderedGroup_3__8();

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
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_3__7"


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_3__8"
    // InternalComponentDatasheet.g:1934:1: rule__ComponentDatasheet__UnorderedGroup_3__8 : rule__ComponentDatasheet__UnorderedGroup_3__Impl ;
    public final void rule__ComponentDatasheet__UnorderedGroup_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1938:1: ( rule__ComponentDatasheet__UnorderedGroup_3__Impl )
            // InternalComponentDatasheet.g:1939:2: rule__ComponentDatasheet__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_3__8"


    // $ANTLR start "rule__ProprietaryLicense__UnorderedGroup_3"
    // InternalComponentDatasheet.g:1946:1: rule__ProprietaryLicense__UnorderedGroup_3 : rule__ProprietaryLicense__UnorderedGroup_3__0 {...}?;
    public final void rule__ProprietaryLicense__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
        	
        try {
            // InternalComponentDatasheet.g:1951:1: ( rule__ProprietaryLicense__UnorderedGroup_3__0 {...}?)
            // InternalComponentDatasheet.g:1952:2: rule__ProprietaryLicense__UnorderedGroup_3__0 {...}?
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
    // InternalComponentDatasheet.g:1960:1: rule__ProprietaryLicense__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDatasheet.g:1965:1: ( ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) ) )
            // InternalComponentDatasheet.g:1966:3: ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) )
            {
            // InternalComponentDatasheet.g:1966:3: ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                alt24=2;
            }
            else if ( LA24_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                alt24=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentDatasheet.g:1967:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1967:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) )
                    // InternalComponentDatasheet.g:1968:4: {...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ProprietaryLicense__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalComponentDatasheet.g:1968:114: ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) )
                    // InternalComponentDatasheet.g:1969:5: ( ( rule__ProprietaryLicense__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1975:5: ( ( rule__ProprietaryLicense__Group_3_0__0 ) )
                    // InternalComponentDatasheet.g:1976:6: ( rule__ProprietaryLicense__Group_3_0__0 )
                    {
                     before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_0()); 
                    // InternalComponentDatasheet.g:1977:6: ( rule__ProprietaryLicense__Group_3_0__0 )
                    // InternalComponentDatasheet.g:1977:7: rule__ProprietaryLicense__Group_3_0__0
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
                    // InternalComponentDatasheet.g:1982:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1982:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) )
                    // InternalComponentDatasheet.g:1983:4: {...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ProprietaryLicense__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalComponentDatasheet.g:1983:114: ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) )
                    // InternalComponentDatasheet.g:1984:5: ( ( rule__ProprietaryLicense__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1990:5: ( ( rule__ProprietaryLicense__Group_3_1__0 ) )
                    // InternalComponentDatasheet.g:1991:6: ( rule__ProprietaryLicense__Group_3_1__0 )
                    {
                     before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_1()); 
                    // InternalComponentDatasheet.g:1992:6: ( rule__ProprietaryLicense__Group_3_1__0 )
                    // InternalComponentDatasheet.g:1992:7: rule__ProprietaryLicense__Group_3_1__0
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
                    // InternalComponentDatasheet.g:1997:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1997:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) )
                    // InternalComponentDatasheet.g:1998:4: {...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ProprietaryLicense__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalComponentDatasheet.g:1998:114: ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) )
                    // InternalComponentDatasheet.g:1999:5: ( ( rule__ProprietaryLicense__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:2005:5: ( ( rule__ProprietaryLicense__Group_3_2__0 ) )
                    // InternalComponentDatasheet.g:2006:6: ( rule__ProprietaryLicense__Group_3_2__0 )
                    {
                     before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_2()); 
                    // InternalComponentDatasheet.g:2007:6: ( rule__ProprietaryLicense__Group_3_2__0 )
                    // InternalComponentDatasheet.g:2007:7: rule__ProprietaryLicense__Group_3_2__0
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
    // InternalComponentDatasheet.g:2020:1: rule__ProprietaryLicense__UnorderedGroup_3__0 : rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__1 )? ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2024:1: ( rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__1 )? )
            // InternalComponentDatasheet.g:2025:2: rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_15);
            rule__ProprietaryLicense__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:2026:2: ( rule__ProprietaryLicense__UnorderedGroup_3__1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                alt25=1;
            }
            else if ( LA25_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentDatasheet.g:2026:2: rule__ProprietaryLicense__UnorderedGroup_3__1
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
    // InternalComponentDatasheet.g:2032:1: rule__ProprietaryLicense__UnorderedGroup_3__1 : rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__2 )? ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2036:1: ( rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__2 )? )
            // InternalComponentDatasheet.g:2037:2: rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_15);
            rule__ProprietaryLicense__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:2038:2: ( rule__ProprietaryLicense__UnorderedGroup_3__2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                alt26=1;
            }
            else if ( LA26_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentDatasheet.g:2038:2: rule__ProprietaryLicense__UnorderedGroup_3__2
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
    // InternalComponentDatasheet.g:2044:1: rule__ProprietaryLicense__UnorderedGroup_3__2 : rule__ProprietaryLicense__UnorderedGroup_3__Impl ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2048:1: ( rule__ProprietaryLicense__UnorderedGroup_3__Impl )
            // InternalComponentDatasheet.g:2049:2: rule__ProprietaryLicense__UnorderedGroup_3__Impl
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


    // $ANTLR start "rule__ComponentDatasheet__ComponentAssignment_1"
    // InternalComponentDatasheet.g:2056:1: rule__ComponentDatasheet__ComponentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ComponentDatasheet__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2060:1: ( ( ( RULE_ID ) ) )
            // InternalComponentDatasheet.g:2061:2: ( ( RULE_ID ) )
            {
            // InternalComponentDatasheet.g:2061:2: ( ( RULE_ID ) )
            // InternalComponentDatasheet.g:2062:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentDatasheetAccess().getComponentComponentDefinitionCrossReference_1_0()); 
            // InternalComponentDatasheet.g:2063:3: ( RULE_ID )
            // InternalComponentDatasheet.g:2064:4: RULE_ID
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


    // $ANTLR start "rule__ComponentDatasheet__ShortDescritionAssignment_3_0_2"
    // InternalComponentDatasheet.g:2075:1: rule__ComponentDatasheet__ShortDescritionAssignment_3_0_2 : ( ruleEString ) ;
    public final void rule__ComponentDatasheet__ShortDescritionAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2079:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2080:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2080:2: ( ruleEString )
            // InternalComponentDatasheet.g:2081:3: ruleEString
            {
             before(grammarAccess.getComponentDatasheetAccess().getShortDescritionEStringParserRuleCall_3_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentDatasheetAccess().getShortDescritionEStringParserRuleCall_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__ShortDescritionAssignment_3_0_2"


    // $ANTLR start "rule__ComponentDatasheet__BaseURIAssignment_3_1_2"
    // InternalComponentDatasheet.g:2090:1: rule__ComponentDatasheet__BaseURIAssignment_3_1_2 : ( ruleEString ) ;
    public final void rule__ComponentDatasheet__BaseURIAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2094:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2095:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2095:2: ( ruleEString )
            // InternalComponentDatasheet.g:2096:3: ruleEString
            {
             before(grammarAccess.getComponentDatasheetAccess().getBaseURIEStringParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentDatasheetAccess().getBaseURIEStringParserRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__BaseURIAssignment_3_1_2"


    // $ANTLR start "rule__ComponentDatasheet__LongDescriptionAssignment_3_2_2"
    // InternalComponentDatasheet.g:2105:1: rule__ComponentDatasheet__LongDescriptionAssignment_3_2_2 : ( RULE_TEXT_BLOCK ) ;
    public final void rule__ComponentDatasheet__LongDescriptionAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2109:1: ( ( RULE_TEXT_BLOCK ) )
            // InternalComponentDatasheet.g:2110:2: ( RULE_TEXT_BLOCK )
            {
            // InternalComponentDatasheet.g:2110:2: ( RULE_TEXT_BLOCK )
            // InternalComponentDatasheet.g:2111:3: RULE_TEXT_BLOCK
            {
             before(grammarAccess.getComponentDatasheetAccess().getLongDescriptionTEXT_BLOCKTerminalRuleCall_3_2_2_0()); 
            match(input,RULE_TEXT_BLOCK,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getLongDescriptionTEXT_BLOCKTerminalRuleCall_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__LongDescriptionAssignment_3_2_2"


    // $ANTLR start "rule__ComponentDatasheet__SupplierDescriptionAssignment_3_3_2"
    // InternalComponentDatasheet.g:2120:1: rule__ComponentDatasheet__SupplierDescriptionAssignment_3_3_2 : ( ruleEString ) ;
    public final void rule__ComponentDatasheet__SupplierDescriptionAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2124:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2125:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2125:2: ( ruleEString )
            // InternalComponentDatasheet.g:2126:3: ruleEString
            {
             before(grammarAccess.getComponentDatasheetAccess().getSupplierDescriptionEStringParserRuleCall_3_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentDatasheetAccess().getSupplierDescriptionEStringParserRuleCall_3_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__SupplierDescriptionAssignment_3_3_2"


    // $ANTLR start "rule__ComponentDatasheet__HomepageAssignment_3_4_2"
    // InternalComponentDatasheet.g:2135:1: rule__ComponentDatasheet__HomepageAssignment_3_4_2 : ( ruleEString ) ;
    public final void rule__ComponentDatasheet__HomepageAssignment_3_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2139:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2140:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2140:2: ( ruleEString )
            // InternalComponentDatasheet.g:2141:3: ruleEString
            {
             before(grammarAccess.getComponentDatasheetAccess().getHomepageEStringParserRuleCall_3_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentDatasheetAccess().getHomepageEStringParserRuleCall_3_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__HomepageAssignment_3_4_2"


    // $ANTLR start "rule__ComponentDatasheet__TrlAssignment_3_5_2"
    // InternalComponentDatasheet.g:2150:1: rule__ComponentDatasheet__TrlAssignment_3_5_2 : ( ruleTRL ) ;
    public final void rule__ComponentDatasheet__TrlAssignment_3_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2154:1: ( ( ruleTRL ) )
            // InternalComponentDatasheet.g:2155:2: ( ruleTRL )
            {
            // InternalComponentDatasheet.g:2155:2: ( ruleTRL )
            // InternalComponentDatasheet.g:2156:3: ruleTRL
            {
             before(grammarAccess.getComponentDatasheetAccess().getTrlTRLEnumRuleCall_3_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTRL();

            state._fsp--;

             after(grammarAccess.getComponentDatasheetAccess().getTrlTRLEnumRuleCall_3_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__TrlAssignment_3_5_2"


    // $ANTLR start "rule__ComponentDatasheet__PurposeDescriptionAssignment_3_6_2"
    // InternalComponentDatasheet.g:2165:1: rule__ComponentDatasheet__PurposeDescriptionAssignment_3_6_2 : ( ruleEString ) ;
    public final void rule__ComponentDatasheet__PurposeDescriptionAssignment_3_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2169:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2170:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2170:2: ( ruleEString )
            // InternalComponentDatasheet.g:2171:3: ruleEString
            {
             before(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionEStringParserRuleCall_3_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionEStringParserRuleCall_3_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__PurposeDescriptionAssignment_3_6_2"


    // $ANTLR start "rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_3_7_2"
    // InternalComponentDatasheet.g:2180:1: rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_3_7_2 : ( ruleEString ) ;
    public final void rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_3_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2184:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2185:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2185:2: ( ruleEString )
            // InternalComponentDatasheet.g:2186:3: ruleEString
            {
             before(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionEStringParserRuleCall_3_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionEStringParserRuleCall_3_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_3_7_2"


    // $ANTLR start "rule__ComponentDatasheet__LicenseAssignment_3_8_2"
    // InternalComponentDatasheet.g:2195:1: rule__ComponentDatasheet__LicenseAssignment_3_8_2 : ( ruleAbstractLicense ) ;
    public final void rule__ComponentDatasheet__LicenseAssignment_3_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2199:1: ( ( ruleAbstractLicense ) )
            // InternalComponentDatasheet.g:2200:2: ( ruleAbstractLicense )
            {
            // InternalComponentDatasheet.g:2200:2: ( ruleAbstractLicense )
            // InternalComponentDatasheet.g:2201:3: ruleAbstractLicense
            {
             before(grammarAccess.getComponentDatasheetAccess().getLicenseAbstractLicenseParserRuleCall_3_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractLicense();

            state._fsp--;

             after(grammarAccess.getComponentDatasheetAccess().getLicenseAbstractLicenseParserRuleCall_3_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__LicenseAssignment_3_8_2"


    // $ANTLR start "rule__SpdxLicense__LicenseIDAssignment_2"
    // InternalComponentDatasheet.g:2210:1: rule__SpdxLicense__LicenseIDAssignment_2 : ( ruleEString ) ;
    public final void rule__SpdxLicense__LicenseIDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2214:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2215:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2215:2: ( ruleEString )
            // InternalComponentDatasheet.g:2216:3: ruleEString
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
    // InternalComponentDatasheet.g:2225:1: rule__ProprietaryLicense__NameAssignment_3_0_2 : ( ruleEString ) ;
    public final void rule__ProprietaryLicense__NameAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2229:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2230:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2230:2: ( ruleEString )
            // InternalComponentDatasheet.g:2231:3: ruleEString
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
    // InternalComponentDatasheet.g:2240:1: rule__ProprietaryLicense__FullTextAssignment_3_1_2 : ( ruleEString ) ;
    public final void rule__ProprietaryLicense__FullTextAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2244:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2245:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2245:2: ( ruleEString )
            // InternalComponentDatasheet.g:2246:3: ruleEString
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
    // InternalComponentDatasheet.g:2255:1: rule__ProprietaryLicense__UrlAssignment_3_2_2 : ( ruleEString ) ;
    public final void rule__ProprietaryLicense__UrlAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2259:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2260:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2260:2: ( ruleEString )
            // InternalComponentDatasheet.g:2261:3: ruleEString
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


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\31\11\uffff";
    static final String dfa_3s = "\1\42\11\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_5s = "\1\0\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1694:3: ( ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_4__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_5__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_6__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_7__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_3_8__0 ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                         
                        int index15_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0) ) {s = 1;}

                        else if ( LA15_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1) ) {s = 2;}

                        else if ( LA15_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2) ) {s = 3;}

                        else if ( LA15_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3) ) {s = 4;}

                        else if ( LA15_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4) ) {s = 5;}

                        else if ( LA15_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5) ) {s = 6;}

                        else if ( LA15_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6) ) {s = 7;}

                        else if ( LA15_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7) ) {s = 8;}

                        else if ( LA15_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8) ) {s = 9;}

                         
                        input.seek(index15_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\30\12\uffff";
    static final String dfa_9s = "\1\42\12\uffff";
    static final String dfa_10s = "\1\uffff\11\1\1\2";
    static final String dfa_11s = "\1\0\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\12\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1844:2: ( rule__ComponentDatasheet__UnorderedGroup_3__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                         
                        int index16_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA16_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0) ) {s = 1;}

                        else if ( LA16_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1) ) {s = 2;}

                        else if ( LA16_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2) ) {s = 3;}

                        else if ( LA16_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3) ) {s = 4;}

                        else if ( LA16_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4) ) {s = 5;}

                        else if ( LA16_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5) ) {s = 6;}

                        else if ( LA16_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6) ) {s = 7;}

                        else if ( LA16_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7) ) {s = 8;}

                        else if ( LA16_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8) ) {s = 9;}

                        else if ( (LA16_0==24) ) {s = 10;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1856:2: ( rule__ComponentDatasheet__UnorderedGroup_3__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                         
                        int index17_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA17_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0) ) {s = 1;}

                        else if ( LA17_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1) ) {s = 2;}

                        else if ( LA17_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2) ) {s = 3;}

                        else if ( LA17_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3) ) {s = 4;}

                        else if ( LA17_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4) ) {s = 5;}

                        else if ( LA17_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5) ) {s = 6;}

                        else if ( LA17_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6) ) {s = 7;}

                        else if ( LA17_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7) ) {s = 8;}

                        else if ( LA17_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8) ) {s = 9;}

                        else if ( (LA17_0==24) ) {s = 10;}

                         
                        input.seek(index17_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1868:2: ( rule__ComponentDatasheet__UnorderedGroup_3__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA18_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0) ) {s = 1;}

                        else if ( LA18_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1) ) {s = 2;}

                        else if ( LA18_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2) ) {s = 3;}

                        else if ( LA18_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3) ) {s = 4;}

                        else if ( LA18_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4) ) {s = 5;}

                        else if ( LA18_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5) ) {s = 6;}

                        else if ( LA18_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6) ) {s = 7;}

                        else if ( LA18_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7) ) {s = 8;}

                        else if ( LA18_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8) ) {s = 9;}

                        else if ( (LA18_0==24) ) {s = 10;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1880:2: ( rule__ComponentDatasheet__UnorderedGroup_3__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                         
                        int index19_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0) ) {s = 1;}

                        else if ( LA19_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1) ) {s = 2;}

                        else if ( LA19_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2) ) {s = 3;}

                        else if ( LA19_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3) ) {s = 4;}

                        else if ( LA19_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4) ) {s = 5;}

                        else if ( LA19_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5) ) {s = 6;}

                        else if ( LA19_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6) ) {s = 7;}

                        else if ( LA19_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7) ) {s = 8;}

                        else if ( LA19_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8) ) {s = 9;}

                        else if ( (LA19_0==24) ) {s = 10;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1892:2: ( rule__ComponentDatasheet__UnorderedGroup_3__5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                         
                        int index20_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA20_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0) ) {s = 1;}

                        else if ( LA20_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1) ) {s = 2;}

                        else if ( LA20_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2) ) {s = 3;}

                        else if ( LA20_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3) ) {s = 4;}

                        else if ( LA20_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4) ) {s = 5;}

                        else if ( LA20_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5) ) {s = 6;}

                        else if ( LA20_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6) ) {s = 7;}

                        else if ( LA20_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7) ) {s = 8;}

                        else if ( LA20_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8) ) {s = 9;}

                        else if ( (LA20_0==24) ) {s = 10;}

                         
                        input.seek(index20_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1904:2: ( rule__ComponentDatasheet__UnorderedGroup_3__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                         
                        int index21_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA21_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0) ) {s = 1;}

                        else if ( LA21_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1) ) {s = 2;}

                        else if ( LA21_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2) ) {s = 3;}

                        else if ( LA21_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3) ) {s = 4;}

                        else if ( LA21_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4) ) {s = 5;}

                        else if ( LA21_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5) ) {s = 6;}

                        else if ( LA21_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6) ) {s = 7;}

                        else if ( LA21_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7) ) {s = 8;}

                        else if ( LA21_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8) ) {s = 9;}

                        else if ( (LA21_0==24) ) {s = 10;}

                         
                        input.seek(index21_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1916:2: ( rule__ComponentDatasheet__UnorderedGroup_3__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA22_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0) ) {s = 1;}

                        else if ( LA22_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1) ) {s = 2;}

                        else if ( LA22_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2) ) {s = 3;}

                        else if ( LA22_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3) ) {s = 4;}

                        else if ( LA22_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4) ) {s = 5;}

                        else if ( LA22_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5) ) {s = 6;}

                        else if ( LA22_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6) ) {s = 7;}

                        else if ( LA22_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7) ) {s = 8;}

                        else if ( LA22_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8) ) {s = 9;}

                        else if ( (LA22_0==24) ) {s = 10;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1928:2: ( rule__ComponentDatasheet__UnorderedGroup_3__8 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA23_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0) ) {s = 1;}

                        else if ( LA23_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1) ) {s = 2;}

                        else if ( LA23_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2) ) {s = 3;}

                        else if ( LA23_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3) ) {s = 4;}

                        else if ( LA23_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4) ) {s = 5;}

                        else if ( LA23_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5) ) {s = 6;}

                        else if ( LA23_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6) ) {s = 7;}

                        else if ( LA23_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7) ) {s = 8;}

                        else if ( LA23_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8) ) {s = 9;}

                        else if ( (LA23_0==24) ) {s = 10;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000007FA000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000043FF000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004804000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000007FA000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000038000000002L});

}
