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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_TEXT_BLOCK", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Level1'", "'Level2'", "'Level3'", "'Level4'", "'Level5'", "'Level6'", "'Level7'", "'Level8'", "'Level9'", "'Undefined'", "'ComponentDatasheet'", "'{'", "'}'", "'purposeDescription'", "':'", "'hardwareRequirementDescription'", "'baseURI'", "'shortDescription'", "'longDescription'", "'supplierDescription'", "'homepage'", "'trl'", "'license'", "'spdx'", "'('", "')'", "'proprietary'", "'name'", "'fullText'", "'URL'"
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


    // $ANTLR start "ruleGenericDatasheet"
    // InternalComponentDatasheet.g:120:1: ruleGenericDatasheet : ( ( rule__GenericDatasheet__UnorderedGroup ) ) ;
    public final void ruleGenericDatasheet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:124:2: ( ( ( rule__GenericDatasheet__UnorderedGroup ) ) )
            // InternalComponentDatasheet.g:125:2: ( ( rule__GenericDatasheet__UnorderedGroup ) )
            {
            // InternalComponentDatasheet.g:125:2: ( ( rule__GenericDatasheet__UnorderedGroup ) )
            // InternalComponentDatasheet.g:126:3: ( rule__GenericDatasheet__UnorderedGroup )
            {
             before(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup()); 
            // InternalComponentDatasheet.g:127:3: ( rule__GenericDatasheet__UnorderedGroup )
            // InternalComponentDatasheet.g:127:4: rule__GenericDatasheet__UnorderedGroup
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
    // InternalComponentDatasheet.g:136:1: entryRuleAbstractLicense : ruleAbstractLicense EOF ;
    public final void entryRuleAbstractLicense() throws RecognitionException {
        try {
            // InternalComponentDatasheet.g:137:1: ( ruleAbstractLicense EOF )
            // InternalComponentDatasheet.g:138:1: ruleAbstractLicense EOF
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
    // InternalComponentDatasheet.g:145:1: ruleAbstractLicense : ( ( rule__AbstractLicense__Alternatives ) ) ;
    public final void ruleAbstractLicense() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:149:2: ( ( ( rule__AbstractLicense__Alternatives ) ) )
            // InternalComponentDatasheet.g:150:2: ( ( rule__AbstractLicense__Alternatives ) )
            {
            // InternalComponentDatasheet.g:150:2: ( ( rule__AbstractLicense__Alternatives ) )
            // InternalComponentDatasheet.g:151:3: ( rule__AbstractLicense__Alternatives )
            {
             before(grammarAccess.getAbstractLicenseAccess().getAlternatives()); 
            // InternalComponentDatasheet.g:152:3: ( rule__AbstractLicense__Alternatives )
            // InternalComponentDatasheet.g:152:4: rule__AbstractLicense__Alternatives
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
    // InternalComponentDatasheet.g:161:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentDatasheet.g:162:1: ( ruleEString EOF )
            // InternalComponentDatasheet.g:163:1: ruleEString EOF
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
    // InternalComponentDatasheet.g:170:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:174:2: ( ( RULE_STRING ) )
            // InternalComponentDatasheet.g:175:2: ( RULE_STRING )
            {
            // InternalComponentDatasheet.g:175:2: ( RULE_STRING )
            // InternalComponentDatasheet.g:176:3: RULE_STRING
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
    // InternalComponentDatasheet.g:186:1: entryRuleSpdxLicense : ruleSpdxLicense EOF ;
    public final void entryRuleSpdxLicense() throws RecognitionException {
        try {
            // InternalComponentDatasheet.g:187:1: ( ruleSpdxLicense EOF )
            // InternalComponentDatasheet.g:188:1: ruleSpdxLicense EOF
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
    // InternalComponentDatasheet.g:195:1: ruleSpdxLicense : ( ( rule__SpdxLicense__Group__0 ) ) ;
    public final void ruleSpdxLicense() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:199:2: ( ( ( rule__SpdxLicense__Group__0 ) ) )
            // InternalComponentDatasheet.g:200:2: ( ( rule__SpdxLicense__Group__0 ) )
            {
            // InternalComponentDatasheet.g:200:2: ( ( rule__SpdxLicense__Group__0 ) )
            // InternalComponentDatasheet.g:201:3: ( rule__SpdxLicense__Group__0 )
            {
             before(grammarAccess.getSpdxLicenseAccess().getGroup()); 
            // InternalComponentDatasheet.g:202:3: ( rule__SpdxLicense__Group__0 )
            // InternalComponentDatasheet.g:202:4: rule__SpdxLicense__Group__0
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
    // InternalComponentDatasheet.g:211:1: entryRuleProprietaryLicense : ruleProprietaryLicense EOF ;
    public final void entryRuleProprietaryLicense() throws RecognitionException {
        try {
            // InternalComponentDatasheet.g:212:1: ( ruleProprietaryLicense EOF )
            // InternalComponentDatasheet.g:213:1: ruleProprietaryLicense EOF
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
    // InternalComponentDatasheet.g:220:1: ruleProprietaryLicense : ( ( rule__ProprietaryLicense__Group__0 ) ) ;
    public final void ruleProprietaryLicense() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:224:2: ( ( ( rule__ProprietaryLicense__Group__0 ) ) )
            // InternalComponentDatasheet.g:225:2: ( ( rule__ProprietaryLicense__Group__0 ) )
            {
            // InternalComponentDatasheet.g:225:2: ( ( rule__ProprietaryLicense__Group__0 ) )
            // InternalComponentDatasheet.g:226:3: ( rule__ProprietaryLicense__Group__0 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getGroup()); 
            // InternalComponentDatasheet.g:227:3: ( rule__ProprietaryLicense__Group__0 )
            // InternalComponentDatasheet.g:227:4: rule__ProprietaryLicense__Group__0
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
    // InternalComponentDatasheet.g:236:1: ruleTRL : ( ( rule__TRL__Alternatives ) ) ;
    public final void ruleTRL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:240:1: ( ( ( rule__TRL__Alternatives ) ) )
            // InternalComponentDatasheet.g:241:2: ( ( rule__TRL__Alternatives ) )
            {
            // InternalComponentDatasheet.g:241:2: ( ( rule__TRL__Alternatives ) )
            // InternalComponentDatasheet.g:242:3: ( rule__TRL__Alternatives )
            {
             before(grammarAccess.getTRLAccess().getAlternatives()); 
            // InternalComponentDatasheet.g:243:3: ( rule__TRL__Alternatives )
            // InternalComponentDatasheet.g:243:4: rule__TRL__Alternatives
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
    // InternalComponentDatasheet.g:251:1: rule__AbstractLicense__Alternatives : ( ( ruleSpdxLicense ) | ( ruleProprietaryLicense ) );
    public final void rule__AbstractLicense__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:255:1: ( ( ruleSpdxLicense ) | ( ruleProprietaryLicense ) )
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
                    // InternalComponentDatasheet.g:256:2: ( ruleSpdxLicense )
                    {
                    // InternalComponentDatasheet.g:256:2: ( ruleSpdxLicense )
                    // InternalComponentDatasheet.g:257:3: ruleSpdxLicense
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
                    // InternalComponentDatasheet.g:262:2: ( ruleProprietaryLicense )
                    {
                    // InternalComponentDatasheet.g:262:2: ( ruleProprietaryLicense )
                    // InternalComponentDatasheet.g:263:3: ruleProprietaryLicense
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
    // InternalComponentDatasheet.g:272:1: rule__TRL__Alternatives : ( ( ( 'Level1' ) ) | ( ( 'Level2' ) ) | ( ( 'Level3' ) ) | ( ( 'Level4' ) ) | ( ( 'Level5' ) ) | ( ( 'Level6' ) ) | ( ( 'Level7' ) ) | ( ( 'Level8' ) ) | ( ( 'Level9' ) ) | ( ( 'Undefined' ) ) );
    public final void rule__TRL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:276:1: ( ( ( 'Level1' ) ) | ( ( 'Level2' ) ) | ( ( 'Level3' ) ) | ( ( 'Level4' ) ) | ( ( 'Level5' ) ) | ( ( 'Level6' ) ) | ( ( 'Level7' ) ) | ( ( 'Level8' ) ) | ( ( 'Level9' ) ) | ( ( 'Undefined' ) ) )
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
                    // InternalComponentDatasheet.g:277:2: ( ( 'Level1' ) )
                    {
                    // InternalComponentDatasheet.g:277:2: ( ( 'Level1' ) )
                    // InternalComponentDatasheet.g:278:3: ( 'Level1' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0()); 
                    // InternalComponentDatasheet.g:279:3: ( 'Level1' )
                    // InternalComponentDatasheet.g:279:4: 'Level1'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDatasheet.g:283:2: ( ( 'Level2' ) )
                    {
                    // InternalComponentDatasheet.g:283:2: ( ( 'Level2' ) )
                    // InternalComponentDatasheet.g:284:3: ( 'Level2' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1()); 
                    // InternalComponentDatasheet.g:285:3: ( 'Level2' )
                    // InternalComponentDatasheet.g:285:4: 'Level2'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDatasheet.g:289:2: ( ( 'Level3' ) )
                    {
                    // InternalComponentDatasheet.g:289:2: ( ( 'Level3' ) )
                    // InternalComponentDatasheet.g:290:3: ( 'Level3' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2()); 
                    // InternalComponentDatasheet.g:291:3: ( 'Level3' )
                    // InternalComponentDatasheet.g:291:4: 'Level3'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentDatasheet.g:295:2: ( ( 'Level4' ) )
                    {
                    // InternalComponentDatasheet.g:295:2: ( ( 'Level4' ) )
                    // InternalComponentDatasheet.g:296:3: ( 'Level4' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3()); 
                    // InternalComponentDatasheet.g:297:3: ( 'Level4' )
                    // InternalComponentDatasheet.g:297:4: 'Level4'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalComponentDatasheet.g:301:2: ( ( 'Level5' ) )
                    {
                    // InternalComponentDatasheet.g:301:2: ( ( 'Level5' ) )
                    // InternalComponentDatasheet.g:302:3: ( 'Level5' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4()); 
                    // InternalComponentDatasheet.g:303:3: ( 'Level5' )
                    // InternalComponentDatasheet.g:303:4: 'Level5'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalComponentDatasheet.g:307:2: ( ( 'Level6' ) )
                    {
                    // InternalComponentDatasheet.g:307:2: ( ( 'Level6' ) )
                    // InternalComponentDatasheet.g:308:3: ( 'Level6' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5()); 
                    // InternalComponentDatasheet.g:309:3: ( 'Level6' )
                    // InternalComponentDatasheet.g:309:4: 'Level6'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalComponentDatasheet.g:313:2: ( ( 'Level7' ) )
                    {
                    // InternalComponentDatasheet.g:313:2: ( ( 'Level7' ) )
                    // InternalComponentDatasheet.g:314:3: ( 'Level7' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6()); 
                    // InternalComponentDatasheet.g:315:3: ( 'Level7' )
                    // InternalComponentDatasheet.g:315:4: 'Level7'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalComponentDatasheet.g:319:2: ( ( 'Level8' ) )
                    {
                    // InternalComponentDatasheet.g:319:2: ( ( 'Level8' ) )
                    // InternalComponentDatasheet.g:320:3: ( 'Level8' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7()); 
                    // InternalComponentDatasheet.g:321:3: ( 'Level8' )
                    // InternalComponentDatasheet.g:321:4: 'Level8'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalComponentDatasheet.g:325:2: ( ( 'Level9' ) )
                    {
                    // InternalComponentDatasheet.g:325:2: ( ( 'Level9' ) )
                    // InternalComponentDatasheet.g:326:3: ( 'Level9' )
                    {
                     before(grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8()); 
                    // InternalComponentDatasheet.g:327:3: ( 'Level9' )
                    // InternalComponentDatasheet.g:327:4: 'Level9'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalComponentDatasheet.g:331:2: ( ( 'Undefined' ) )
                    {
                    // InternalComponentDatasheet.g:331:2: ( ( 'Undefined' ) )
                    // InternalComponentDatasheet.g:332:3: ( 'Undefined' )
                    {
                     before(grammarAccess.getTRLAccess().getUNDEFINEDEnumLiteralDeclaration_9()); 
                    // InternalComponentDatasheet.g:333:3: ( 'Undefined' )
                    // InternalComponentDatasheet.g:333:4: 'Undefined'
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
    // InternalComponentDatasheet.g:341:1: rule__ComponentDatasheet__Group__0 : rule__ComponentDatasheet__Group__0__Impl rule__ComponentDatasheet__Group__1 ;
    public final void rule__ComponentDatasheet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:345:1: ( rule__ComponentDatasheet__Group__0__Impl rule__ComponentDatasheet__Group__1 )
            // InternalComponentDatasheet.g:346:2: rule__ComponentDatasheet__Group__0__Impl rule__ComponentDatasheet__Group__1
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
    // InternalComponentDatasheet.g:353:1: rule__ComponentDatasheet__Group__0__Impl : ( 'ComponentDatasheet' ) ;
    public final void rule__ComponentDatasheet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:357:1: ( ( 'ComponentDatasheet' ) )
            // InternalComponentDatasheet.g:358:1: ( 'ComponentDatasheet' )
            {
            // InternalComponentDatasheet.g:358:1: ( 'ComponentDatasheet' )
            // InternalComponentDatasheet.g:359:2: 'ComponentDatasheet'
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
    // InternalComponentDatasheet.g:368:1: rule__ComponentDatasheet__Group__1 : rule__ComponentDatasheet__Group__1__Impl rule__ComponentDatasheet__Group__2 ;
    public final void rule__ComponentDatasheet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:372:1: ( rule__ComponentDatasheet__Group__1__Impl rule__ComponentDatasheet__Group__2 )
            // InternalComponentDatasheet.g:373:2: rule__ComponentDatasheet__Group__1__Impl rule__ComponentDatasheet__Group__2
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
    // InternalComponentDatasheet.g:380:1: rule__ComponentDatasheet__Group__1__Impl : ( ( rule__ComponentDatasheet__ComponentAssignment_1 ) ) ;
    public final void rule__ComponentDatasheet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:384:1: ( ( ( rule__ComponentDatasheet__ComponentAssignment_1 ) ) )
            // InternalComponentDatasheet.g:385:1: ( ( rule__ComponentDatasheet__ComponentAssignment_1 ) )
            {
            // InternalComponentDatasheet.g:385:1: ( ( rule__ComponentDatasheet__ComponentAssignment_1 ) )
            // InternalComponentDatasheet.g:386:2: ( rule__ComponentDatasheet__ComponentAssignment_1 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getComponentAssignment_1()); 
            // InternalComponentDatasheet.g:387:2: ( rule__ComponentDatasheet__ComponentAssignment_1 )
            // InternalComponentDatasheet.g:387:3: rule__ComponentDatasheet__ComponentAssignment_1
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
    // InternalComponentDatasheet.g:395:1: rule__ComponentDatasheet__Group__2 : rule__ComponentDatasheet__Group__2__Impl rule__ComponentDatasheet__Group__3 ;
    public final void rule__ComponentDatasheet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:399:1: ( rule__ComponentDatasheet__Group__2__Impl rule__ComponentDatasheet__Group__3 )
            // InternalComponentDatasheet.g:400:2: rule__ComponentDatasheet__Group__2__Impl rule__ComponentDatasheet__Group__3
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
    // InternalComponentDatasheet.g:407:1: rule__ComponentDatasheet__Group__2__Impl : ( '{' ) ;
    public final void rule__ComponentDatasheet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:411:1: ( ( '{' ) )
            // InternalComponentDatasheet.g:412:1: ( '{' )
            {
            // InternalComponentDatasheet.g:412:1: ( '{' )
            // InternalComponentDatasheet.g:413:2: '{'
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
    // InternalComponentDatasheet.g:422:1: rule__ComponentDatasheet__Group__3 : rule__ComponentDatasheet__Group__3__Impl rule__ComponentDatasheet__Group__4 ;
    public final void rule__ComponentDatasheet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:426:1: ( rule__ComponentDatasheet__Group__3__Impl rule__ComponentDatasheet__Group__4 )
            // InternalComponentDatasheet.g:427:2: rule__ComponentDatasheet__Group__3__Impl rule__ComponentDatasheet__Group__4
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
    // InternalComponentDatasheet.g:434:1: rule__ComponentDatasheet__Group__3__Impl : ( ruleGenericDatasheet ) ;
    public final void rule__ComponentDatasheet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:438:1: ( ( ruleGenericDatasheet ) )
            // InternalComponentDatasheet.g:439:1: ( ruleGenericDatasheet )
            {
            // InternalComponentDatasheet.g:439:1: ( ruleGenericDatasheet )
            // InternalComponentDatasheet.g:440:2: ruleGenericDatasheet
            {
             before(grammarAccess.getComponentDatasheetAccess().getGenericDatasheetParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleGenericDatasheet();

            state._fsp--;

             after(grammarAccess.getComponentDatasheetAccess().getGenericDatasheetParserRuleCall_3()); 

            }


            }

        }
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
    // InternalComponentDatasheet.g:449:1: rule__ComponentDatasheet__Group__4 : rule__ComponentDatasheet__Group__4__Impl rule__ComponentDatasheet__Group__5 ;
    public final void rule__ComponentDatasheet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:453:1: ( rule__ComponentDatasheet__Group__4__Impl rule__ComponentDatasheet__Group__5 )
            // InternalComponentDatasheet.g:454:2: rule__ComponentDatasheet__Group__4__Impl rule__ComponentDatasheet__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDatasheet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group__5();

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
    // InternalComponentDatasheet.g:461:1: rule__ComponentDatasheet__Group__4__Impl : ( ( rule__ComponentDatasheet__UnorderedGroup_4 ) ) ;
    public final void rule__ComponentDatasheet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:465:1: ( ( ( rule__ComponentDatasheet__UnorderedGroup_4 ) ) )
            // InternalComponentDatasheet.g:466:1: ( ( rule__ComponentDatasheet__UnorderedGroup_4 ) )
            {
            // InternalComponentDatasheet.g:466:1: ( ( rule__ComponentDatasheet__UnorderedGroup_4 ) )
            // InternalComponentDatasheet.g:467:2: ( rule__ComponentDatasheet__UnorderedGroup_4 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4()); 
            // InternalComponentDatasheet.g:468:2: ( rule__ComponentDatasheet__UnorderedGroup_4 )
            // InternalComponentDatasheet.g:468:3: rule__ComponentDatasheet__UnorderedGroup_4
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__UnorderedGroup_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentDatasheet__Group__5"
    // InternalComponentDatasheet.g:476:1: rule__ComponentDatasheet__Group__5 : rule__ComponentDatasheet__Group__5__Impl ;
    public final void rule__ComponentDatasheet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:480:1: ( rule__ComponentDatasheet__Group__5__Impl )
            // InternalComponentDatasheet.g:481:2: rule__ComponentDatasheet__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group__5__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__Group__5"


    // $ANTLR start "rule__ComponentDatasheet__Group__5__Impl"
    // InternalComponentDatasheet.g:487:1: rule__ComponentDatasheet__Group__5__Impl : ( '}' ) ;
    public final void rule__ComponentDatasheet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:491:1: ( ( '}' ) )
            // InternalComponentDatasheet.g:492:1: ( '}' )
            {
            // InternalComponentDatasheet.g:492:1: ( '}' )
            // InternalComponentDatasheet.g:493:2: '}'
            {
             before(grammarAccess.getComponentDatasheetAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group__5__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_4_0__0"
    // InternalComponentDatasheet.g:503:1: rule__ComponentDatasheet__Group_4_0__0 : rule__ComponentDatasheet__Group_4_0__0__Impl rule__ComponentDatasheet__Group_4_0__1 ;
    public final void rule__ComponentDatasheet__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:507:1: ( rule__ComponentDatasheet__Group_4_0__0__Impl rule__ComponentDatasheet__Group_4_0__1 )
            // InternalComponentDatasheet.g:508:2: rule__ComponentDatasheet__Group_4_0__0__Impl rule__ComponentDatasheet__Group_4_0__1
            {
            pushFollow(FOLLOW_8);
            rule__ComponentDatasheet__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_4_0__1();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_4_0__0"


    // $ANTLR start "rule__ComponentDatasheet__Group_4_0__0__Impl"
    // InternalComponentDatasheet.g:515:1: rule__ComponentDatasheet__Group_4_0__0__Impl : ( 'purposeDescription' ) ;
    public final void rule__ComponentDatasheet__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:519:1: ( ( 'purposeDescription' ) )
            // InternalComponentDatasheet.g:520:1: ( 'purposeDescription' )
            {
            // InternalComponentDatasheet.g:520:1: ( 'purposeDescription' )
            // InternalComponentDatasheet.g:521:2: 'purposeDescription'
            {
             before(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionKeyword_4_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_4_0__0__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_4_0__1"
    // InternalComponentDatasheet.g:530:1: rule__ComponentDatasheet__Group_4_0__1 : rule__ComponentDatasheet__Group_4_0__1__Impl rule__ComponentDatasheet__Group_4_0__2 ;
    public final void rule__ComponentDatasheet__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:534:1: ( rule__ComponentDatasheet__Group_4_0__1__Impl rule__ComponentDatasheet__Group_4_0__2 )
            // InternalComponentDatasheet.g:535:2: rule__ComponentDatasheet__Group_4_0__1__Impl rule__ComponentDatasheet__Group_4_0__2
            {
            pushFollow(FOLLOW_8);
            rule__ComponentDatasheet__Group_4_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_4_0__2();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_4_0__1"


    // $ANTLR start "rule__ComponentDatasheet__Group_4_0__1__Impl"
    // InternalComponentDatasheet.g:542:1: rule__ComponentDatasheet__Group_4_0__1__Impl : ( ( ':' )? ) ;
    public final void rule__ComponentDatasheet__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:546:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:547:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:547:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:548:2: ( ':' )?
            {
             before(grammarAccess.getComponentDatasheetAccess().getColonKeyword_4_0_1()); 
            // InternalComponentDatasheet.g:549:2: ( ':' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentDatasheet.g:549:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentDatasheetAccess().getColonKeyword_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_4_0__1__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_4_0__2"
    // InternalComponentDatasheet.g:557:1: rule__ComponentDatasheet__Group_4_0__2 : rule__ComponentDatasheet__Group_4_0__2__Impl ;
    public final void rule__ComponentDatasheet__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:561:1: ( rule__ComponentDatasheet__Group_4_0__2__Impl )
            // InternalComponentDatasheet.g:562:2: rule__ComponentDatasheet__Group_4_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_4_0__2__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_4_0__2"


    // $ANTLR start "rule__ComponentDatasheet__Group_4_0__2__Impl"
    // InternalComponentDatasheet.g:568:1: rule__ComponentDatasheet__Group_4_0__2__Impl : ( ( rule__ComponentDatasheet__PurposeDescriptionAssignment_4_0_2 ) ) ;
    public final void rule__ComponentDatasheet__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:572:1: ( ( ( rule__ComponentDatasheet__PurposeDescriptionAssignment_4_0_2 ) ) )
            // InternalComponentDatasheet.g:573:1: ( ( rule__ComponentDatasheet__PurposeDescriptionAssignment_4_0_2 ) )
            {
            // InternalComponentDatasheet.g:573:1: ( ( rule__ComponentDatasheet__PurposeDescriptionAssignment_4_0_2 ) )
            // InternalComponentDatasheet.g:574:2: ( rule__ComponentDatasheet__PurposeDescriptionAssignment_4_0_2 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionAssignment_4_0_2()); 
            // InternalComponentDatasheet.g:575:2: ( rule__ComponentDatasheet__PurposeDescriptionAssignment_4_0_2 )
            // InternalComponentDatasheet.g:575:3: rule__ComponentDatasheet__PurposeDescriptionAssignment_4_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__PurposeDescriptionAssignment_4_0_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionAssignment_4_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_4_0__2__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_4_1__0"
    // InternalComponentDatasheet.g:584:1: rule__ComponentDatasheet__Group_4_1__0 : rule__ComponentDatasheet__Group_4_1__0__Impl rule__ComponentDatasheet__Group_4_1__1 ;
    public final void rule__ComponentDatasheet__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:588:1: ( rule__ComponentDatasheet__Group_4_1__0__Impl rule__ComponentDatasheet__Group_4_1__1 )
            // InternalComponentDatasheet.g:589:2: rule__ComponentDatasheet__Group_4_1__0__Impl rule__ComponentDatasheet__Group_4_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ComponentDatasheet__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_4_1__1();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_4_1__0"


    // $ANTLR start "rule__ComponentDatasheet__Group_4_1__0__Impl"
    // InternalComponentDatasheet.g:596:1: rule__ComponentDatasheet__Group_4_1__0__Impl : ( 'hardwareRequirementDescription' ) ;
    public final void rule__ComponentDatasheet__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:600:1: ( ( 'hardwareRequirementDescription' ) )
            // InternalComponentDatasheet.g:601:1: ( 'hardwareRequirementDescription' )
            {
            // InternalComponentDatasheet.g:601:1: ( 'hardwareRequirementDescription' )
            // InternalComponentDatasheet.g:602:2: 'hardwareRequirementDescription'
            {
             before(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionKeyword_4_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_4_1__0__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_4_1__1"
    // InternalComponentDatasheet.g:611:1: rule__ComponentDatasheet__Group_4_1__1 : rule__ComponentDatasheet__Group_4_1__1__Impl rule__ComponentDatasheet__Group_4_1__2 ;
    public final void rule__ComponentDatasheet__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:615:1: ( rule__ComponentDatasheet__Group_4_1__1__Impl rule__ComponentDatasheet__Group_4_1__2 )
            // InternalComponentDatasheet.g:616:2: rule__ComponentDatasheet__Group_4_1__1__Impl rule__ComponentDatasheet__Group_4_1__2
            {
            pushFollow(FOLLOW_8);
            rule__ComponentDatasheet__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_4_1__2();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_4_1__1"


    // $ANTLR start "rule__ComponentDatasheet__Group_4_1__1__Impl"
    // InternalComponentDatasheet.g:623:1: rule__ComponentDatasheet__Group_4_1__1__Impl : ( ( ':' )? ) ;
    public final void rule__ComponentDatasheet__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:627:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:628:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:628:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:629:2: ( ':' )?
            {
             before(grammarAccess.getComponentDatasheetAccess().getColonKeyword_4_1_1()); 
            // InternalComponentDatasheet.g:630:2: ( ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentDatasheet.g:630:3: ':'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentDatasheetAccess().getColonKeyword_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_4_1__1__Impl"


    // $ANTLR start "rule__ComponentDatasheet__Group_4_1__2"
    // InternalComponentDatasheet.g:638:1: rule__ComponentDatasheet__Group_4_1__2 : rule__ComponentDatasheet__Group_4_1__2__Impl ;
    public final void rule__ComponentDatasheet__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:642:1: ( rule__ComponentDatasheet__Group_4_1__2__Impl )
            // InternalComponentDatasheet.g:643:2: rule__ComponentDatasheet__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__Group_4_1__2__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__Group_4_1__2"


    // $ANTLR start "rule__ComponentDatasheet__Group_4_1__2__Impl"
    // InternalComponentDatasheet.g:649:1: rule__ComponentDatasheet__Group_4_1__2__Impl : ( ( rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_4_1_2 ) ) ;
    public final void rule__ComponentDatasheet__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:653:1: ( ( ( rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_4_1_2 ) ) )
            // InternalComponentDatasheet.g:654:1: ( ( rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_4_1_2 ) )
            {
            // InternalComponentDatasheet.g:654:1: ( ( rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_4_1_2 ) )
            // InternalComponentDatasheet.g:655:2: ( rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_4_1_2 )
            {
             before(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionAssignment_4_1_2()); 
            // InternalComponentDatasheet.g:656:2: ( rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_4_1_2 )
            // InternalComponentDatasheet.g:656:3: rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionAssignment_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__Group_4_1__2__Impl"


    // $ANTLR start "rule__GenericDatasheet__Group_0__0"
    // InternalComponentDatasheet.g:665:1: rule__GenericDatasheet__Group_0__0 : rule__GenericDatasheet__Group_0__0__Impl rule__GenericDatasheet__Group_0__1 ;
    public final void rule__GenericDatasheet__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:669:1: ( rule__GenericDatasheet__Group_0__0__Impl rule__GenericDatasheet__Group_0__1 )
            // InternalComponentDatasheet.g:670:2: rule__GenericDatasheet__Group_0__0__Impl rule__GenericDatasheet__Group_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:677:1: rule__GenericDatasheet__Group_0__0__Impl : ( 'baseURI' ) ;
    public final void rule__GenericDatasheet__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:681:1: ( ( 'baseURI' ) )
            // InternalComponentDatasheet.g:682:1: ( 'baseURI' )
            {
            // InternalComponentDatasheet.g:682:1: ( 'baseURI' )
            // InternalComponentDatasheet.g:683:2: 'baseURI'
            {
             before(grammarAccess.getGenericDatasheetAccess().getBaseURIKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:692:1: rule__GenericDatasheet__Group_0__1 : rule__GenericDatasheet__Group_0__1__Impl rule__GenericDatasheet__Group_0__2 ;
    public final void rule__GenericDatasheet__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:696:1: ( rule__GenericDatasheet__Group_0__1__Impl rule__GenericDatasheet__Group_0__2 )
            // InternalComponentDatasheet.g:697:2: rule__GenericDatasheet__Group_0__1__Impl rule__GenericDatasheet__Group_0__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:704:1: rule__GenericDatasheet__Group_0__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:708:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:709:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:709:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:710:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_0_1()); 
            // InternalComponentDatasheet.g:711:2: ( ':' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentDatasheet.g:711:3: ':'
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
    // InternalComponentDatasheet.g:719:1: rule__GenericDatasheet__Group_0__2 : rule__GenericDatasheet__Group_0__2__Impl ;
    public final void rule__GenericDatasheet__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:723:1: ( rule__GenericDatasheet__Group_0__2__Impl )
            // InternalComponentDatasheet.g:724:2: rule__GenericDatasheet__Group_0__2__Impl
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
    // InternalComponentDatasheet.g:730:1: rule__GenericDatasheet__Group_0__2__Impl : ( ( rule__GenericDatasheet__BaseURIAssignment_0_2 ) ) ;
    public final void rule__GenericDatasheet__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:734:1: ( ( ( rule__GenericDatasheet__BaseURIAssignment_0_2 ) ) )
            // InternalComponentDatasheet.g:735:1: ( ( rule__GenericDatasheet__BaseURIAssignment_0_2 ) )
            {
            // InternalComponentDatasheet.g:735:1: ( ( rule__GenericDatasheet__BaseURIAssignment_0_2 ) )
            // InternalComponentDatasheet.g:736:2: ( rule__GenericDatasheet__BaseURIAssignment_0_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getBaseURIAssignment_0_2()); 
            // InternalComponentDatasheet.g:737:2: ( rule__GenericDatasheet__BaseURIAssignment_0_2 )
            // InternalComponentDatasheet.g:737:3: rule__GenericDatasheet__BaseURIAssignment_0_2
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
    // InternalComponentDatasheet.g:746:1: rule__GenericDatasheet__Group_1__0 : rule__GenericDatasheet__Group_1__0__Impl rule__GenericDatasheet__Group_1__1 ;
    public final void rule__GenericDatasheet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:750:1: ( rule__GenericDatasheet__Group_1__0__Impl rule__GenericDatasheet__Group_1__1 )
            // InternalComponentDatasheet.g:751:2: rule__GenericDatasheet__Group_1__0__Impl rule__GenericDatasheet__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:758:1: rule__GenericDatasheet__Group_1__0__Impl : ( 'shortDescription' ) ;
    public final void rule__GenericDatasheet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:762:1: ( ( 'shortDescription' ) )
            // InternalComponentDatasheet.g:763:1: ( 'shortDescription' )
            {
            // InternalComponentDatasheet.g:763:1: ( 'shortDescription' )
            // InternalComponentDatasheet.g:764:2: 'shortDescription'
            {
             before(grammarAccess.getGenericDatasheetAccess().getShortDescriptionKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:773:1: rule__GenericDatasheet__Group_1__1 : rule__GenericDatasheet__Group_1__1__Impl rule__GenericDatasheet__Group_1__2 ;
    public final void rule__GenericDatasheet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:777:1: ( rule__GenericDatasheet__Group_1__1__Impl rule__GenericDatasheet__Group_1__2 )
            // InternalComponentDatasheet.g:778:2: rule__GenericDatasheet__Group_1__1__Impl rule__GenericDatasheet__Group_1__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:785:1: rule__GenericDatasheet__Group_1__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:789:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:790:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:790:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:791:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_1_1()); 
            // InternalComponentDatasheet.g:792:2: ( ':' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentDatasheet.g:792:3: ':'
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
    // InternalComponentDatasheet.g:800:1: rule__GenericDatasheet__Group_1__2 : rule__GenericDatasheet__Group_1__2__Impl ;
    public final void rule__GenericDatasheet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:804:1: ( rule__GenericDatasheet__Group_1__2__Impl )
            // InternalComponentDatasheet.g:805:2: rule__GenericDatasheet__Group_1__2__Impl
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
    // InternalComponentDatasheet.g:811:1: rule__GenericDatasheet__Group_1__2__Impl : ( ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 ) ) ;
    public final void rule__GenericDatasheet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:815:1: ( ( ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 ) ) )
            // InternalComponentDatasheet.g:816:1: ( ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 ) )
            {
            // InternalComponentDatasheet.g:816:1: ( ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 ) )
            // InternalComponentDatasheet.g:817:2: ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getShortDescriptionAssignment_1_2()); 
            // InternalComponentDatasheet.g:818:2: ( rule__GenericDatasheet__ShortDescriptionAssignment_1_2 )
            // InternalComponentDatasheet.g:818:3: rule__GenericDatasheet__ShortDescriptionAssignment_1_2
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
    // InternalComponentDatasheet.g:827:1: rule__GenericDatasheet__Group_2__0 : rule__GenericDatasheet__Group_2__0__Impl rule__GenericDatasheet__Group_2__1 ;
    public final void rule__GenericDatasheet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:831:1: ( rule__GenericDatasheet__Group_2__0__Impl rule__GenericDatasheet__Group_2__1 )
            // InternalComponentDatasheet.g:832:2: rule__GenericDatasheet__Group_2__0__Impl rule__GenericDatasheet__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentDatasheet.g:839:1: rule__GenericDatasheet__Group_2__0__Impl : ( 'longDescription' ) ;
    public final void rule__GenericDatasheet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:843:1: ( ( 'longDescription' ) )
            // InternalComponentDatasheet.g:844:1: ( 'longDescription' )
            {
            // InternalComponentDatasheet.g:844:1: ( 'longDescription' )
            // InternalComponentDatasheet.g:845:2: 'longDescription'
            {
             before(grammarAccess.getGenericDatasheetAccess().getLongDescriptionKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:854:1: rule__GenericDatasheet__Group_2__1 : rule__GenericDatasheet__Group_2__1__Impl rule__GenericDatasheet__Group_2__2 ;
    public final void rule__GenericDatasheet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:858:1: ( rule__GenericDatasheet__Group_2__1__Impl rule__GenericDatasheet__Group_2__2 )
            // InternalComponentDatasheet.g:859:2: rule__GenericDatasheet__Group_2__1__Impl rule__GenericDatasheet__Group_2__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentDatasheet.g:866:1: rule__GenericDatasheet__Group_2__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:870:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:871:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:871:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:872:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_2_1()); 
            // InternalComponentDatasheet.g:873:2: ( ':' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentDatasheet.g:873:3: ':'
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
    // InternalComponentDatasheet.g:881:1: rule__GenericDatasheet__Group_2__2 : rule__GenericDatasheet__Group_2__2__Impl ;
    public final void rule__GenericDatasheet__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:885:1: ( rule__GenericDatasheet__Group_2__2__Impl )
            // InternalComponentDatasheet.g:886:2: rule__GenericDatasheet__Group_2__2__Impl
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
    // InternalComponentDatasheet.g:892:1: rule__GenericDatasheet__Group_2__2__Impl : ( ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 ) ) ;
    public final void rule__GenericDatasheet__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:896:1: ( ( ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 ) ) )
            // InternalComponentDatasheet.g:897:1: ( ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 ) )
            {
            // InternalComponentDatasheet.g:897:1: ( ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 ) )
            // InternalComponentDatasheet.g:898:2: ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getLongDescriptionAssignment_2_2()); 
            // InternalComponentDatasheet.g:899:2: ( rule__GenericDatasheet__LongDescriptionAssignment_2_2 )
            // InternalComponentDatasheet.g:899:3: rule__GenericDatasheet__LongDescriptionAssignment_2_2
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
    // InternalComponentDatasheet.g:908:1: rule__GenericDatasheet__Group_3__0 : rule__GenericDatasheet__Group_3__0__Impl rule__GenericDatasheet__Group_3__1 ;
    public final void rule__GenericDatasheet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:912:1: ( rule__GenericDatasheet__Group_3__0__Impl rule__GenericDatasheet__Group_3__1 )
            // InternalComponentDatasheet.g:913:2: rule__GenericDatasheet__Group_3__0__Impl rule__GenericDatasheet__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:920:1: rule__GenericDatasheet__Group_3__0__Impl : ( 'supplierDescription' ) ;
    public final void rule__GenericDatasheet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:924:1: ( ( 'supplierDescription' ) )
            // InternalComponentDatasheet.g:925:1: ( 'supplierDescription' )
            {
            // InternalComponentDatasheet.g:925:1: ( 'supplierDescription' )
            // InternalComponentDatasheet.g:926:2: 'supplierDescription'
            {
             before(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:935:1: rule__GenericDatasheet__Group_3__1 : rule__GenericDatasheet__Group_3__1__Impl rule__GenericDatasheet__Group_3__2 ;
    public final void rule__GenericDatasheet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:939:1: ( rule__GenericDatasheet__Group_3__1__Impl rule__GenericDatasheet__Group_3__2 )
            // InternalComponentDatasheet.g:940:2: rule__GenericDatasheet__Group_3__1__Impl rule__GenericDatasheet__Group_3__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:947:1: rule__GenericDatasheet__Group_3__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:951:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:952:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:952:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:953:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_3_1()); 
            // InternalComponentDatasheet.g:954:2: ( ':' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentDatasheet.g:954:3: ':'
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
    // InternalComponentDatasheet.g:962:1: rule__GenericDatasheet__Group_3__2 : rule__GenericDatasheet__Group_3__2__Impl ;
    public final void rule__GenericDatasheet__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:966:1: ( rule__GenericDatasheet__Group_3__2__Impl )
            // InternalComponentDatasheet.g:967:2: rule__GenericDatasheet__Group_3__2__Impl
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
    // InternalComponentDatasheet.g:973:1: rule__GenericDatasheet__Group_3__2__Impl : ( ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 ) ) ;
    public final void rule__GenericDatasheet__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:977:1: ( ( ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 ) ) )
            // InternalComponentDatasheet.g:978:1: ( ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 ) )
            {
            // InternalComponentDatasheet.g:978:1: ( ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 ) )
            // InternalComponentDatasheet.g:979:2: ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionAssignment_3_2()); 
            // InternalComponentDatasheet.g:980:2: ( rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 )
            // InternalComponentDatasheet.g:980:3: rule__GenericDatasheet__SupplierDescriptionAssignment_3_2
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
    // InternalComponentDatasheet.g:989:1: rule__GenericDatasheet__Group_4__0 : rule__GenericDatasheet__Group_4__0__Impl rule__GenericDatasheet__Group_4__1 ;
    public final void rule__GenericDatasheet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:993:1: ( rule__GenericDatasheet__Group_4__0__Impl rule__GenericDatasheet__Group_4__1 )
            // InternalComponentDatasheet.g:994:2: rule__GenericDatasheet__Group_4__0__Impl rule__GenericDatasheet__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:1001:1: rule__GenericDatasheet__Group_4__0__Impl : ( 'homepage' ) ;
    public final void rule__GenericDatasheet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1005:1: ( ( 'homepage' ) )
            // InternalComponentDatasheet.g:1006:1: ( 'homepage' )
            {
            // InternalComponentDatasheet.g:1006:1: ( 'homepage' )
            // InternalComponentDatasheet.g:1007:2: 'homepage'
            {
             before(grammarAccess.getGenericDatasheetAccess().getHomepageKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:1016:1: rule__GenericDatasheet__Group_4__1 : rule__GenericDatasheet__Group_4__1__Impl rule__GenericDatasheet__Group_4__2 ;
    public final void rule__GenericDatasheet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1020:1: ( rule__GenericDatasheet__Group_4__1__Impl rule__GenericDatasheet__Group_4__2 )
            // InternalComponentDatasheet.g:1021:2: rule__GenericDatasheet__Group_4__1__Impl rule__GenericDatasheet__Group_4__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:1028:1: rule__GenericDatasheet__Group_4__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1032:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:1033:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:1033:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:1034:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_4_1()); 
            // InternalComponentDatasheet.g:1035:2: ( ':' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentDatasheet.g:1035:3: ':'
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
    // InternalComponentDatasheet.g:1043:1: rule__GenericDatasheet__Group_4__2 : rule__GenericDatasheet__Group_4__2__Impl ;
    public final void rule__GenericDatasheet__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1047:1: ( rule__GenericDatasheet__Group_4__2__Impl )
            // InternalComponentDatasheet.g:1048:2: rule__GenericDatasheet__Group_4__2__Impl
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
    // InternalComponentDatasheet.g:1054:1: rule__GenericDatasheet__Group_4__2__Impl : ( ( rule__GenericDatasheet__HomepageAssignment_4_2 ) ) ;
    public final void rule__GenericDatasheet__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1058:1: ( ( ( rule__GenericDatasheet__HomepageAssignment_4_2 ) ) )
            // InternalComponentDatasheet.g:1059:1: ( ( rule__GenericDatasheet__HomepageAssignment_4_2 ) )
            {
            // InternalComponentDatasheet.g:1059:1: ( ( rule__GenericDatasheet__HomepageAssignment_4_2 ) )
            // InternalComponentDatasheet.g:1060:2: ( rule__GenericDatasheet__HomepageAssignment_4_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getHomepageAssignment_4_2()); 
            // InternalComponentDatasheet.g:1061:2: ( rule__GenericDatasheet__HomepageAssignment_4_2 )
            // InternalComponentDatasheet.g:1061:3: rule__GenericDatasheet__HomepageAssignment_4_2
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
    // InternalComponentDatasheet.g:1070:1: rule__GenericDatasheet__Group_5__0 : rule__GenericDatasheet__Group_5__0__Impl rule__GenericDatasheet__Group_5__1 ;
    public final void rule__GenericDatasheet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1074:1: ( rule__GenericDatasheet__Group_5__0__Impl rule__GenericDatasheet__Group_5__1 )
            // InternalComponentDatasheet.g:1075:2: rule__GenericDatasheet__Group_5__0__Impl rule__GenericDatasheet__Group_5__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalComponentDatasheet.g:1082:1: rule__GenericDatasheet__Group_5__0__Impl : ( 'trl' ) ;
    public final void rule__GenericDatasheet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1086:1: ( ( 'trl' ) )
            // InternalComponentDatasheet.g:1087:1: ( 'trl' )
            {
            // InternalComponentDatasheet.g:1087:1: ( 'trl' )
            // InternalComponentDatasheet.g:1088:2: 'trl'
            {
             before(grammarAccess.getGenericDatasheetAccess().getTrlKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:1097:1: rule__GenericDatasheet__Group_5__1 : rule__GenericDatasheet__Group_5__1__Impl rule__GenericDatasheet__Group_5__2 ;
    public final void rule__GenericDatasheet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1101:1: ( rule__GenericDatasheet__Group_5__1__Impl rule__GenericDatasheet__Group_5__2 )
            // InternalComponentDatasheet.g:1102:2: rule__GenericDatasheet__Group_5__1__Impl rule__GenericDatasheet__Group_5__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalComponentDatasheet.g:1109:1: rule__GenericDatasheet__Group_5__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1113:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:1114:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:1114:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:1115:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_5_1()); 
            // InternalComponentDatasheet.g:1116:2: ( ':' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentDatasheet.g:1116:3: ':'
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
    // InternalComponentDatasheet.g:1124:1: rule__GenericDatasheet__Group_5__2 : rule__GenericDatasheet__Group_5__2__Impl ;
    public final void rule__GenericDatasheet__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1128:1: ( rule__GenericDatasheet__Group_5__2__Impl )
            // InternalComponentDatasheet.g:1129:2: rule__GenericDatasheet__Group_5__2__Impl
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
    // InternalComponentDatasheet.g:1135:1: rule__GenericDatasheet__Group_5__2__Impl : ( ( rule__GenericDatasheet__TrlAssignment_5_2 ) ) ;
    public final void rule__GenericDatasheet__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1139:1: ( ( ( rule__GenericDatasheet__TrlAssignment_5_2 ) ) )
            // InternalComponentDatasheet.g:1140:1: ( ( rule__GenericDatasheet__TrlAssignment_5_2 ) )
            {
            // InternalComponentDatasheet.g:1140:1: ( ( rule__GenericDatasheet__TrlAssignment_5_2 ) )
            // InternalComponentDatasheet.g:1141:2: ( rule__GenericDatasheet__TrlAssignment_5_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getTrlAssignment_5_2()); 
            // InternalComponentDatasheet.g:1142:2: ( rule__GenericDatasheet__TrlAssignment_5_2 )
            // InternalComponentDatasheet.g:1142:3: rule__GenericDatasheet__TrlAssignment_5_2
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
    // InternalComponentDatasheet.g:1151:1: rule__GenericDatasheet__Group_6__0 : rule__GenericDatasheet__Group_6__0__Impl rule__GenericDatasheet__Group_6__1 ;
    public final void rule__GenericDatasheet__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1155:1: ( rule__GenericDatasheet__Group_6__0__Impl rule__GenericDatasheet__Group_6__1 )
            // InternalComponentDatasheet.g:1156:2: rule__GenericDatasheet__Group_6__0__Impl rule__GenericDatasheet__Group_6__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentDatasheet.g:1163:1: rule__GenericDatasheet__Group_6__0__Impl : ( 'license' ) ;
    public final void rule__GenericDatasheet__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1167:1: ( ( 'license' ) )
            // InternalComponentDatasheet.g:1168:1: ( 'license' )
            {
            // InternalComponentDatasheet.g:1168:1: ( 'license' )
            // InternalComponentDatasheet.g:1169:2: 'license'
            {
             before(grammarAccess.getGenericDatasheetAccess().getLicenseKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalComponentDatasheet.g:1178:1: rule__GenericDatasheet__Group_6__1 : rule__GenericDatasheet__Group_6__1__Impl rule__GenericDatasheet__Group_6__2 ;
    public final void rule__GenericDatasheet__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1182:1: ( rule__GenericDatasheet__Group_6__1__Impl rule__GenericDatasheet__Group_6__2 )
            // InternalComponentDatasheet.g:1183:2: rule__GenericDatasheet__Group_6__1__Impl rule__GenericDatasheet__Group_6__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentDatasheet.g:1190:1: rule__GenericDatasheet__Group_6__1__Impl : ( ( ':' )? ) ;
    public final void rule__GenericDatasheet__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1194:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:1195:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:1195:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:1196:2: ( ':' )?
            {
             before(grammarAccess.getGenericDatasheetAccess().getColonKeyword_6_1()); 
            // InternalComponentDatasheet.g:1197:2: ( ':' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentDatasheet.g:1197:3: ':'
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
    // InternalComponentDatasheet.g:1205:1: rule__GenericDatasheet__Group_6__2 : rule__GenericDatasheet__Group_6__2__Impl ;
    public final void rule__GenericDatasheet__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1209:1: ( rule__GenericDatasheet__Group_6__2__Impl )
            // InternalComponentDatasheet.g:1210:2: rule__GenericDatasheet__Group_6__2__Impl
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
    // InternalComponentDatasheet.g:1216:1: rule__GenericDatasheet__Group_6__2__Impl : ( ( rule__GenericDatasheet__LicenseAssignment_6_2 ) ) ;
    public final void rule__GenericDatasheet__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1220:1: ( ( ( rule__GenericDatasheet__LicenseAssignment_6_2 ) ) )
            // InternalComponentDatasheet.g:1221:1: ( ( rule__GenericDatasheet__LicenseAssignment_6_2 ) )
            {
            // InternalComponentDatasheet.g:1221:1: ( ( rule__GenericDatasheet__LicenseAssignment_6_2 ) )
            // InternalComponentDatasheet.g:1222:2: ( rule__GenericDatasheet__LicenseAssignment_6_2 )
            {
             before(grammarAccess.getGenericDatasheetAccess().getLicenseAssignment_6_2()); 
            // InternalComponentDatasheet.g:1223:2: ( rule__GenericDatasheet__LicenseAssignment_6_2 )
            // InternalComponentDatasheet.g:1223:3: rule__GenericDatasheet__LicenseAssignment_6_2
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
    // InternalComponentDatasheet.g:1232:1: rule__SpdxLicense__Group__0 : rule__SpdxLicense__Group__0__Impl rule__SpdxLicense__Group__1 ;
    public final void rule__SpdxLicense__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1236:1: ( rule__SpdxLicense__Group__0__Impl rule__SpdxLicense__Group__1 )
            // InternalComponentDatasheet.g:1237:2: rule__SpdxLicense__Group__0__Impl rule__SpdxLicense__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentDatasheet.g:1244:1: rule__SpdxLicense__Group__0__Impl : ( 'spdx' ) ;
    public final void rule__SpdxLicense__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1248:1: ( ( 'spdx' ) )
            // InternalComponentDatasheet.g:1249:1: ( 'spdx' )
            {
            // InternalComponentDatasheet.g:1249:1: ( 'spdx' )
            // InternalComponentDatasheet.g:1250:2: 'spdx'
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
    // InternalComponentDatasheet.g:1259:1: rule__SpdxLicense__Group__1 : rule__SpdxLicense__Group__1__Impl rule__SpdxLicense__Group__2 ;
    public final void rule__SpdxLicense__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1263:1: ( rule__SpdxLicense__Group__1__Impl rule__SpdxLicense__Group__2 )
            // InternalComponentDatasheet.g:1264:2: rule__SpdxLicense__Group__1__Impl rule__SpdxLicense__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:1271:1: rule__SpdxLicense__Group__1__Impl : ( '(' ) ;
    public final void rule__SpdxLicense__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1275:1: ( ( '(' ) )
            // InternalComponentDatasheet.g:1276:1: ( '(' )
            {
            // InternalComponentDatasheet.g:1276:1: ( '(' )
            // InternalComponentDatasheet.g:1277:2: '('
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
    // InternalComponentDatasheet.g:1286:1: rule__SpdxLicense__Group__2 : rule__SpdxLicense__Group__2__Impl rule__SpdxLicense__Group__3 ;
    public final void rule__SpdxLicense__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1290:1: ( rule__SpdxLicense__Group__2__Impl rule__SpdxLicense__Group__3 )
            // InternalComponentDatasheet.g:1291:2: rule__SpdxLicense__Group__2__Impl rule__SpdxLicense__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentDatasheet.g:1298:1: rule__SpdxLicense__Group__2__Impl : ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) ) ;
    public final void rule__SpdxLicense__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1302:1: ( ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) ) )
            // InternalComponentDatasheet.g:1303:1: ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) )
            {
            // InternalComponentDatasheet.g:1303:1: ( ( rule__SpdxLicense__LicenseIDAssignment_2 ) )
            // InternalComponentDatasheet.g:1304:2: ( rule__SpdxLicense__LicenseIDAssignment_2 )
            {
             before(grammarAccess.getSpdxLicenseAccess().getLicenseIDAssignment_2()); 
            // InternalComponentDatasheet.g:1305:2: ( rule__SpdxLicense__LicenseIDAssignment_2 )
            // InternalComponentDatasheet.g:1305:3: rule__SpdxLicense__LicenseIDAssignment_2
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
    // InternalComponentDatasheet.g:1313:1: rule__SpdxLicense__Group__3 : rule__SpdxLicense__Group__3__Impl ;
    public final void rule__SpdxLicense__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1317:1: ( rule__SpdxLicense__Group__3__Impl )
            // InternalComponentDatasheet.g:1318:2: rule__SpdxLicense__Group__3__Impl
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
    // InternalComponentDatasheet.g:1324:1: rule__SpdxLicense__Group__3__Impl : ( ')' ) ;
    public final void rule__SpdxLicense__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1328:1: ( ( ')' ) )
            // InternalComponentDatasheet.g:1329:1: ( ')' )
            {
            // InternalComponentDatasheet.g:1329:1: ( ')' )
            // InternalComponentDatasheet.g:1330:2: ')'
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
    // InternalComponentDatasheet.g:1340:1: rule__ProprietaryLicense__Group__0 : rule__ProprietaryLicense__Group__0__Impl rule__ProprietaryLicense__Group__1 ;
    public final void rule__ProprietaryLicense__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1344:1: ( rule__ProprietaryLicense__Group__0__Impl rule__ProprietaryLicense__Group__1 )
            // InternalComponentDatasheet.g:1345:2: rule__ProprietaryLicense__Group__0__Impl rule__ProprietaryLicense__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentDatasheet.g:1352:1: rule__ProprietaryLicense__Group__0__Impl : ( () ) ;
    public final void rule__ProprietaryLicense__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1356:1: ( ( () ) )
            // InternalComponentDatasheet.g:1357:1: ( () )
            {
            // InternalComponentDatasheet.g:1357:1: ( () )
            // InternalComponentDatasheet.g:1358:2: ()
            {
             before(grammarAccess.getProprietaryLicenseAccess().getProprietaryLicenseAction_0()); 
            // InternalComponentDatasheet.g:1359:2: ()
            // InternalComponentDatasheet.g:1359:3: 
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
    // InternalComponentDatasheet.g:1367:1: rule__ProprietaryLicense__Group__1 : rule__ProprietaryLicense__Group__1__Impl rule__ProprietaryLicense__Group__2 ;
    public final void rule__ProprietaryLicense__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1371:1: ( rule__ProprietaryLicense__Group__1__Impl rule__ProprietaryLicense__Group__2 )
            // InternalComponentDatasheet.g:1372:2: rule__ProprietaryLicense__Group__1__Impl rule__ProprietaryLicense__Group__2
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
    // InternalComponentDatasheet.g:1379:1: rule__ProprietaryLicense__Group__1__Impl : ( 'proprietary' ) ;
    public final void rule__ProprietaryLicense__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1383:1: ( ( 'proprietary' ) )
            // InternalComponentDatasheet.g:1384:1: ( 'proprietary' )
            {
            // InternalComponentDatasheet.g:1384:1: ( 'proprietary' )
            // InternalComponentDatasheet.g:1385:2: 'proprietary'
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
    // InternalComponentDatasheet.g:1394:1: rule__ProprietaryLicense__Group__2 : rule__ProprietaryLicense__Group__2__Impl rule__ProprietaryLicense__Group__3 ;
    public final void rule__ProprietaryLicense__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1398:1: ( rule__ProprietaryLicense__Group__2__Impl rule__ProprietaryLicense__Group__3 )
            // InternalComponentDatasheet.g:1399:2: rule__ProprietaryLicense__Group__2__Impl rule__ProprietaryLicense__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentDatasheet.g:1406:1: rule__ProprietaryLicense__Group__2__Impl : ( '{' ) ;
    public final void rule__ProprietaryLicense__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1410:1: ( ( '{' ) )
            // InternalComponentDatasheet.g:1411:1: ( '{' )
            {
            // InternalComponentDatasheet.g:1411:1: ( '{' )
            // InternalComponentDatasheet.g:1412:2: '{'
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
    // InternalComponentDatasheet.g:1421:1: rule__ProprietaryLicense__Group__3 : rule__ProprietaryLicense__Group__3__Impl rule__ProprietaryLicense__Group__4 ;
    public final void rule__ProprietaryLicense__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1425:1: ( rule__ProprietaryLicense__Group__3__Impl rule__ProprietaryLicense__Group__4 )
            // InternalComponentDatasheet.g:1426:2: rule__ProprietaryLicense__Group__3__Impl rule__ProprietaryLicense__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentDatasheet.g:1433:1: rule__ProprietaryLicense__Group__3__Impl : ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) ) ;
    public final void rule__ProprietaryLicense__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1437:1: ( ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) ) )
            // InternalComponentDatasheet.g:1438:1: ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) )
            {
            // InternalComponentDatasheet.g:1438:1: ( ( rule__ProprietaryLicense__UnorderedGroup_3 ) )
            // InternalComponentDatasheet.g:1439:2: ( rule__ProprietaryLicense__UnorderedGroup_3 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3()); 
            // InternalComponentDatasheet.g:1440:2: ( rule__ProprietaryLicense__UnorderedGroup_3 )
            // InternalComponentDatasheet.g:1440:3: rule__ProprietaryLicense__UnorderedGroup_3
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
    // InternalComponentDatasheet.g:1448:1: rule__ProprietaryLicense__Group__4 : rule__ProprietaryLicense__Group__4__Impl ;
    public final void rule__ProprietaryLicense__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1452:1: ( rule__ProprietaryLicense__Group__4__Impl )
            // InternalComponentDatasheet.g:1453:2: rule__ProprietaryLicense__Group__4__Impl
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
    // InternalComponentDatasheet.g:1459:1: rule__ProprietaryLicense__Group__4__Impl : ( '}' ) ;
    public final void rule__ProprietaryLicense__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1463:1: ( ( '}' ) )
            // InternalComponentDatasheet.g:1464:1: ( '}' )
            {
            // InternalComponentDatasheet.g:1464:1: ( '}' )
            // InternalComponentDatasheet.g:1465:2: '}'
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
    // InternalComponentDatasheet.g:1475:1: rule__ProprietaryLicense__Group_3_0__0 : rule__ProprietaryLicense__Group_3_0__0__Impl rule__ProprietaryLicense__Group_3_0__1 ;
    public final void rule__ProprietaryLicense__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1479:1: ( rule__ProprietaryLicense__Group_3_0__0__Impl rule__ProprietaryLicense__Group_3_0__1 )
            // InternalComponentDatasheet.g:1480:2: rule__ProprietaryLicense__Group_3_0__0__Impl rule__ProprietaryLicense__Group_3_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:1487:1: rule__ProprietaryLicense__Group_3_0__0__Impl : ( 'name' ) ;
    public final void rule__ProprietaryLicense__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1491:1: ( ( 'name' ) )
            // InternalComponentDatasheet.g:1492:1: ( 'name' )
            {
            // InternalComponentDatasheet.g:1492:1: ( 'name' )
            // InternalComponentDatasheet.g:1493:2: 'name'
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
    // InternalComponentDatasheet.g:1502:1: rule__ProprietaryLicense__Group_3_0__1 : rule__ProprietaryLicense__Group_3_0__1__Impl rule__ProprietaryLicense__Group_3_0__2 ;
    public final void rule__ProprietaryLicense__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1506:1: ( rule__ProprietaryLicense__Group_3_0__1__Impl rule__ProprietaryLicense__Group_3_0__2 )
            // InternalComponentDatasheet.g:1507:2: rule__ProprietaryLicense__Group_3_0__1__Impl rule__ProprietaryLicense__Group_3_0__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:1514:1: rule__ProprietaryLicense__Group_3_0__1__Impl : ( ( ':' )? ) ;
    public final void rule__ProprietaryLicense__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1518:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:1519:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:1519:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:1520:2: ( ':' )?
            {
             before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_0_1()); 
            // InternalComponentDatasheet.g:1521:2: ( ':' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentDatasheet.g:1521:3: ':'
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
    // InternalComponentDatasheet.g:1529:1: rule__ProprietaryLicense__Group_3_0__2 : rule__ProprietaryLicense__Group_3_0__2__Impl ;
    public final void rule__ProprietaryLicense__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1533:1: ( rule__ProprietaryLicense__Group_3_0__2__Impl )
            // InternalComponentDatasheet.g:1534:2: rule__ProprietaryLicense__Group_3_0__2__Impl
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
    // InternalComponentDatasheet.g:1540:1: rule__ProprietaryLicense__Group_3_0__2__Impl : ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) ) ;
    public final void rule__ProprietaryLicense__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1544:1: ( ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) ) )
            // InternalComponentDatasheet.g:1545:1: ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) )
            {
            // InternalComponentDatasheet.g:1545:1: ( ( rule__ProprietaryLicense__NameAssignment_3_0_2 ) )
            // InternalComponentDatasheet.g:1546:2: ( rule__ProprietaryLicense__NameAssignment_3_0_2 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getNameAssignment_3_0_2()); 
            // InternalComponentDatasheet.g:1547:2: ( rule__ProprietaryLicense__NameAssignment_3_0_2 )
            // InternalComponentDatasheet.g:1547:3: rule__ProprietaryLicense__NameAssignment_3_0_2
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
    // InternalComponentDatasheet.g:1556:1: rule__ProprietaryLicense__Group_3_1__0 : rule__ProprietaryLicense__Group_3_1__0__Impl rule__ProprietaryLicense__Group_3_1__1 ;
    public final void rule__ProprietaryLicense__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1560:1: ( rule__ProprietaryLicense__Group_3_1__0__Impl rule__ProprietaryLicense__Group_3_1__1 )
            // InternalComponentDatasheet.g:1561:2: rule__ProprietaryLicense__Group_3_1__0__Impl rule__ProprietaryLicense__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:1568:1: rule__ProprietaryLicense__Group_3_1__0__Impl : ( 'fullText' ) ;
    public final void rule__ProprietaryLicense__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1572:1: ( ( 'fullText' ) )
            // InternalComponentDatasheet.g:1573:1: ( 'fullText' )
            {
            // InternalComponentDatasheet.g:1573:1: ( 'fullText' )
            // InternalComponentDatasheet.g:1574:2: 'fullText'
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
    // InternalComponentDatasheet.g:1583:1: rule__ProprietaryLicense__Group_3_1__1 : rule__ProprietaryLicense__Group_3_1__1__Impl rule__ProprietaryLicense__Group_3_1__2 ;
    public final void rule__ProprietaryLicense__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1587:1: ( rule__ProprietaryLicense__Group_3_1__1__Impl rule__ProprietaryLicense__Group_3_1__2 )
            // InternalComponentDatasheet.g:1588:2: rule__ProprietaryLicense__Group_3_1__1__Impl rule__ProprietaryLicense__Group_3_1__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:1595:1: rule__ProprietaryLicense__Group_3_1__1__Impl : ( ( ':' )? ) ;
    public final void rule__ProprietaryLicense__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1599:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:1600:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:1600:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:1601:2: ( ':' )?
            {
             before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_1_1()); 
            // InternalComponentDatasheet.g:1602:2: ( ':' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentDatasheet.g:1602:3: ':'
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
    // InternalComponentDatasheet.g:1610:1: rule__ProprietaryLicense__Group_3_1__2 : rule__ProprietaryLicense__Group_3_1__2__Impl ;
    public final void rule__ProprietaryLicense__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1614:1: ( rule__ProprietaryLicense__Group_3_1__2__Impl )
            // InternalComponentDatasheet.g:1615:2: rule__ProprietaryLicense__Group_3_1__2__Impl
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
    // InternalComponentDatasheet.g:1621:1: rule__ProprietaryLicense__Group_3_1__2__Impl : ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) ) ;
    public final void rule__ProprietaryLicense__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1625:1: ( ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) ) )
            // InternalComponentDatasheet.g:1626:1: ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) )
            {
            // InternalComponentDatasheet.g:1626:1: ( ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 ) )
            // InternalComponentDatasheet.g:1627:2: ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getFullTextAssignment_3_1_2()); 
            // InternalComponentDatasheet.g:1628:2: ( rule__ProprietaryLicense__FullTextAssignment_3_1_2 )
            // InternalComponentDatasheet.g:1628:3: rule__ProprietaryLicense__FullTextAssignment_3_1_2
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
    // InternalComponentDatasheet.g:1637:1: rule__ProprietaryLicense__Group_3_2__0 : rule__ProprietaryLicense__Group_3_2__0__Impl rule__ProprietaryLicense__Group_3_2__1 ;
    public final void rule__ProprietaryLicense__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1641:1: ( rule__ProprietaryLicense__Group_3_2__0__Impl rule__ProprietaryLicense__Group_3_2__1 )
            // InternalComponentDatasheet.g:1642:2: rule__ProprietaryLicense__Group_3_2__0__Impl rule__ProprietaryLicense__Group_3_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:1649:1: rule__ProprietaryLicense__Group_3_2__0__Impl : ( 'URL' ) ;
    public final void rule__ProprietaryLicense__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1653:1: ( ( 'URL' ) )
            // InternalComponentDatasheet.g:1654:1: ( 'URL' )
            {
            // InternalComponentDatasheet.g:1654:1: ( 'URL' )
            // InternalComponentDatasheet.g:1655:2: 'URL'
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
    // InternalComponentDatasheet.g:1664:1: rule__ProprietaryLicense__Group_3_2__1 : rule__ProprietaryLicense__Group_3_2__1__Impl rule__ProprietaryLicense__Group_3_2__2 ;
    public final void rule__ProprietaryLicense__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1668:1: ( rule__ProprietaryLicense__Group_3_2__1__Impl rule__ProprietaryLicense__Group_3_2__2 )
            // InternalComponentDatasheet.g:1669:2: rule__ProprietaryLicense__Group_3_2__1__Impl rule__ProprietaryLicense__Group_3_2__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDatasheet.g:1676:1: rule__ProprietaryLicense__Group_3_2__1__Impl : ( ( ':' )? ) ;
    public final void rule__ProprietaryLicense__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1680:1: ( ( ( ':' )? ) )
            // InternalComponentDatasheet.g:1681:1: ( ( ':' )? )
            {
            // InternalComponentDatasheet.g:1681:1: ( ( ':' )? )
            // InternalComponentDatasheet.g:1682:2: ( ':' )?
            {
             before(grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_2_1()); 
            // InternalComponentDatasheet.g:1683:2: ( ':' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentDatasheet.g:1683:3: ':'
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
    // InternalComponentDatasheet.g:1691:1: rule__ProprietaryLicense__Group_3_2__2 : rule__ProprietaryLicense__Group_3_2__2__Impl ;
    public final void rule__ProprietaryLicense__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1695:1: ( rule__ProprietaryLicense__Group_3_2__2__Impl )
            // InternalComponentDatasheet.g:1696:2: rule__ProprietaryLicense__Group_3_2__2__Impl
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
    // InternalComponentDatasheet.g:1702:1: rule__ProprietaryLicense__Group_3_2__2__Impl : ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) ) ;
    public final void rule__ProprietaryLicense__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1706:1: ( ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) ) )
            // InternalComponentDatasheet.g:1707:1: ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) )
            {
            // InternalComponentDatasheet.g:1707:1: ( ( rule__ProprietaryLicense__UrlAssignment_3_2_2 ) )
            // InternalComponentDatasheet.g:1708:2: ( rule__ProprietaryLicense__UrlAssignment_3_2_2 )
            {
             before(grammarAccess.getProprietaryLicenseAccess().getUrlAssignment_3_2_2()); 
            // InternalComponentDatasheet.g:1709:2: ( rule__ProprietaryLicense__UrlAssignment_3_2_2 )
            // InternalComponentDatasheet.g:1709:3: rule__ProprietaryLicense__UrlAssignment_3_2_2
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


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_4"
    // InternalComponentDatasheet.g:1718:1: rule__ComponentDatasheet__UnorderedGroup_4 : ( rule__ComponentDatasheet__UnorderedGroup_4__0 )? ;
    public final void rule__ComponentDatasheet__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4());
        	
        try {
            // InternalComponentDatasheet.g:1723:1: ( ( rule__ComponentDatasheet__UnorderedGroup_4__0 )? )
            // InternalComponentDatasheet.g:1724:2: ( rule__ComponentDatasheet__UnorderedGroup_4__0 )?
            {
            // InternalComponentDatasheet.g:1724:2: ( rule__ComponentDatasheet__UnorderedGroup_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 1) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentDatasheet.g:1724:2: rule__ComponentDatasheet__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__UnorderedGroup_4__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_4"


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_4__Impl"
    // InternalComponentDatasheet.g:1732:1: rule__ComponentDatasheet__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__ComponentDatasheet__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_4_1__0 ) ) ) ) ) ;
    public final void rule__ComponentDatasheet__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDatasheet.g:1737:1: ( ( ({...}? => ( ( ( rule__ComponentDatasheet__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_4_1__0 ) ) ) ) ) )
            // InternalComponentDatasheet.g:1738:3: ( ({...}? => ( ( ( rule__ComponentDatasheet__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_4_1__0 ) ) ) ) )
            {
            // InternalComponentDatasheet.g:1738:3: ( ({...}? => ( ( ( rule__ComponentDatasheet__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDatasheet__Group_4_1__0 ) ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 1) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentDatasheet.g:1739:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_4_0__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1739:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_4_0__0 ) ) ) )
                    // InternalComponentDatasheet.g:1740:4: {...}? => ( ( ( rule__ComponentDatasheet__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDatasheet__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalComponentDatasheet.g:1740:114: ( ( ( rule__ComponentDatasheet__Group_4_0__0 ) ) )
                    // InternalComponentDatasheet.g:1741:5: ( ( rule__ComponentDatasheet__Group_4_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1747:5: ( ( rule__ComponentDatasheet__Group_4_0__0 ) )
                    // InternalComponentDatasheet.g:1748:6: ( rule__ComponentDatasheet__Group_4_0__0 )
                    {
                     before(grammarAccess.getComponentDatasheetAccess().getGroup_4_0()); 
                    // InternalComponentDatasheet.g:1749:6: ( rule__ComponentDatasheet__Group_4_0__0 )
                    // InternalComponentDatasheet.g:1749:7: rule__ComponentDatasheet__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDatasheetAccess().getGroup_4_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDatasheet.g:1754:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_4_1__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1754:3: ({...}? => ( ( ( rule__ComponentDatasheet__Group_4_1__0 ) ) ) )
                    // InternalComponentDatasheet.g:1755:4: {...}? => ( ( ( rule__ComponentDatasheet__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDatasheet__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalComponentDatasheet.g:1755:114: ( ( ( rule__ComponentDatasheet__Group_4_1__0 ) ) )
                    // InternalComponentDatasheet.g:1756:5: ( ( rule__ComponentDatasheet__Group_4_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1762:5: ( ( rule__ComponentDatasheet__Group_4_1__0 ) )
                    // InternalComponentDatasheet.g:1763:6: ( rule__ComponentDatasheet__Group_4_1__0 )
                    {
                     before(grammarAccess.getComponentDatasheetAccess().getGroup_4_1()); 
                    // InternalComponentDatasheet.g:1764:6: ( rule__ComponentDatasheet__Group_4_1__0 )
                    // InternalComponentDatasheet.g:1764:7: rule__ComponentDatasheet__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDatasheetAccess().getGroup_4_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_4__0"
    // InternalComponentDatasheet.g:1777:1: rule__ComponentDatasheet__UnorderedGroup_4__0 : rule__ComponentDatasheet__UnorderedGroup_4__Impl ( rule__ComponentDatasheet__UnorderedGroup_4__1 )? ;
    public final void rule__ComponentDatasheet__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1781:1: ( rule__ComponentDatasheet__UnorderedGroup_4__Impl ( rule__ComponentDatasheet__UnorderedGroup_4__1 )? )
            // InternalComponentDatasheet.g:1782:2: rule__ComponentDatasheet__UnorderedGroup_4__Impl ( rule__ComponentDatasheet__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_15);
            rule__ComponentDatasheet__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1783:2: ( rule__ComponentDatasheet__UnorderedGroup_4__1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 1) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentDatasheet.g:1783:2: rule__ComponentDatasheet__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDatasheet__UnorderedGroup_4__1();

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
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_4__0"


    // $ANTLR start "rule__ComponentDatasheet__UnorderedGroup_4__1"
    // InternalComponentDatasheet.g:1789:1: rule__ComponentDatasheet__UnorderedGroup_4__1 : rule__ComponentDatasheet__UnorderedGroup_4__Impl ;
    public final void rule__ComponentDatasheet__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1793:1: ( rule__ComponentDatasheet__UnorderedGroup_4__Impl )
            // InternalComponentDatasheet.g:1794:2: rule__ComponentDatasheet__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDatasheet__UnorderedGroup_4__Impl();

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
    // $ANTLR end "rule__ComponentDatasheet__UnorderedGroup_4__1"


    // $ANTLR start "rule__GenericDatasheet__UnorderedGroup"
    // InternalComponentDatasheet.g:1801:1: rule__GenericDatasheet__UnorderedGroup : rule__GenericDatasheet__UnorderedGroup__0 {...}?;
    public final void rule__GenericDatasheet__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
        	
        try {
            // InternalComponentDatasheet.g:1806:1: ( rule__GenericDatasheet__UnorderedGroup__0 {...}?)
            // InternalComponentDatasheet.g:1807:2: rule__GenericDatasheet__UnorderedGroup__0 {...}?
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
    // InternalComponentDatasheet.g:1815:1: rule__GenericDatasheet__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) ) ) ;
    public final void rule__GenericDatasheet__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDatasheet.g:1820:1: ( ( ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) ) ) )
            // InternalComponentDatasheet.g:1821:3: ( ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) ) )
            {
            // InternalComponentDatasheet.g:1821:3: ( ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) ) )
            int alt18=7;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt18=2;
            }
            else if ( LA18_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt18=3;
            }
            else if ( LA18_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt18=4;
            }
            else if ( LA18_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt18=5;
            }
            else if ( LA18_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt18=6;
            }
            else if ( LA18_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt18=7;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentDatasheet.g:1822:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1822:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) ) )
                    // InternalComponentDatasheet.g:1823:4: {...}? => ( ( ( rule__GenericDatasheet__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalComponentDatasheet.g:1823:110: ( ( ( rule__GenericDatasheet__Group_0__0 ) ) )
                    // InternalComponentDatasheet.g:1824:5: ( ( rule__GenericDatasheet__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1830:5: ( ( rule__GenericDatasheet__Group_0__0 ) )
                    // InternalComponentDatasheet.g:1831:6: ( rule__GenericDatasheet__Group_0__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_0()); 
                    // InternalComponentDatasheet.g:1832:6: ( rule__GenericDatasheet__Group_0__0 )
                    // InternalComponentDatasheet.g:1832:7: rule__GenericDatasheet__Group_0__0
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
                    // InternalComponentDatasheet.g:1837:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1837:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) ) )
                    // InternalComponentDatasheet.g:1838:4: {...}? => ( ( ( rule__GenericDatasheet__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalComponentDatasheet.g:1838:110: ( ( ( rule__GenericDatasheet__Group_1__0 ) ) )
                    // InternalComponentDatasheet.g:1839:5: ( ( rule__GenericDatasheet__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1845:5: ( ( rule__GenericDatasheet__Group_1__0 ) )
                    // InternalComponentDatasheet.g:1846:6: ( rule__GenericDatasheet__Group_1__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_1()); 
                    // InternalComponentDatasheet.g:1847:6: ( rule__GenericDatasheet__Group_1__0 )
                    // InternalComponentDatasheet.g:1847:7: rule__GenericDatasheet__Group_1__0
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
                    // InternalComponentDatasheet.g:1852:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1852:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) ) )
                    // InternalComponentDatasheet.g:1853:4: {...}? => ( ( ( rule__GenericDatasheet__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalComponentDatasheet.g:1853:110: ( ( ( rule__GenericDatasheet__Group_2__0 ) ) )
                    // InternalComponentDatasheet.g:1854:5: ( ( rule__GenericDatasheet__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1860:5: ( ( rule__GenericDatasheet__Group_2__0 ) )
                    // InternalComponentDatasheet.g:1861:6: ( rule__GenericDatasheet__Group_2__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_2()); 
                    // InternalComponentDatasheet.g:1862:6: ( rule__GenericDatasheet__Group_2__0 )
                    // InternalComponentDatasheet.g:1862:7: rule__GenericDatasheet__Group_2__0
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
                    // InternalComponentDatasheet.g:1867:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1867:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) ) )
                    // InternalComponentDatasheet.g:1868:4: {...}? => ( ( ( rule__GenericDatasheet__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalComponentDatasheet.g:1868:110: ( ( ( rule__GenericDatasheet__Group_3__0 ) ) )
                    // InternalComponentDatasheet.g:1869:5: ( ( rule__GenericDatasheet__Group_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1875:5: ( ( rule__GenericDatasheet__Group_3__0 ) )
                    // InternalComponentDatasheet.g:1876:6: ( rule__GenericDatasheet__Group_3__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_3()); 
                    // InternalComponentDatasheet.g:1877:6: ( rule__GenericDatasheet__Group_3__0 )
                    // InternalComponentDatasheet.g:1877:7: rule__GenericDatasheet__Group_3__0
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
                    // InternalComponentDatasheet.g:1882:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1882:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) ) )
                    // InternalComponentDatasheet.g:1883:4: {...}? => ( ( ( rule__GenericDatasheet__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalComponentDatasheet.g:1883:110: ( ( ( rule__GenericDatasheet__Group_4__0 ) ) )
                    // InternalComponentDatasheet.g:1884:5: ( ( rule__GenericDatasheet__Group_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1890:5: ( ( rule__GenericDatasheet__Group_4__0 ) )
                    // InternalComponentDatasheet.g:1891:6: ( rule__GenericDatasheet__Group_4__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_4()); 
                    // InternalComponentDatasheet.g:1892:6: ( rule__GenericDatasheet__Group_4__0 )
                    // InternalComponentDatasheet.g:1892:7: rule__GenericDatasheet__Group_4__0
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
                    // InternalComponentDatasheet.g:1897:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1897:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) ) )
                    // InternalComponentDatasheet.g:1898:4: {...}? => ( ( ( rule__GenericDatasheet__Group_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalComponentDatasheet.g:1898:110: ( ( ( rule__GenericDatasheet__Group_5__0 ) ) )
                    // InternalComponentDatasheet.g:1899:5: ( ( rule__GenericDatasheet__Group_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1905:5: ( ( rule__GenericDatasheet__Group_5__0 ) )
                    // InternalComponentDatasheet.g:1906:6: ( rule__GenericDatasheet__Group_5__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_5()); 
                    // InternalComponentDatasheet.g:1907:6: ( rule__GenericDatasheet__Group_5__0 )
                    // InternalComponentDatasheet.g:1907:7: rule__GenericDatasheet__Group_5__0
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
                    // InternalComponentDatasheet.g:1912:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:1912:3: ({...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) ) )
                    // InternalComponentDatasheet.g:1913:4: {...}? => ( ( ( rule__GenericDatasheet__Group_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                        throw new FailedPredicateException(input, "rule__GenericDatasheet__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6)");
                    }
                    // InternalComponentDatasheet.g:1913:110: ( ( ( rule__GenericDatasheet__Group_6__0 ) ) )
                    // InternalComponentDatasheet.g:1914:5: ( ( rule__GenericDatasheet__Group_6__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:1920:5: ( ( rule__GenericDatasheet__Group_6__0 ) )
                    // InternalComponentDatasheet.g:1921:6: ( rule__GenericDatasheet__Group_6__0 )
                    {
                     before(grammarAccess.getGenericDatasheetAccess().getGroup_6()); 
                    // InternalComponentDatasheet.g:1922:6: ( rule__GenericDatasheet__Group_6__0 )
                    // InternalComponentDatasheet.g:1922:7: rule__GenericDatasheet__Group_6__0
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
    // InternalComponentDatasheet.g:1935:1: rule__GenericDatasheet__UnorderedGroup__0 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__1 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1939:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__1 )? )
            // InternalComponentDatasheet.g:1940:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_16);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1941:2: ( rule__GenericDatasheet__UnorderedGroup__1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt19=1;
            }
            else if ( LA19_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt19=1;
            }
            else if ( LA19_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt19=1;
            }
            else if ( LA19_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt19=1;
            }
            else if ( LA19_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt19=1;
            }
            else if ( LA19_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentDatasheet.g:1941:2: rule__GenericDatasheet__UnorderedGroup__1
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
    // InternalComponentDatasheet.g:1947:1: rule__GenericDatasheet__UnorderedGroup__1 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__2 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1951:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__2 )? )
            // InternalComponentDatasheet.g:1952:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_16);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1953:2: ( rule__GenericDatasheet__UnorderedGroup__2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt20=1;
            }
            else if ( LA20_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt20=1;
            }
            else if ( LA20_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt20=1;
            }
            else if ( LA20_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt20=1;
            }
            else if ( LA20_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt20=1;
            }
            else if ( LA20_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentDatasheet.g:1953:2: rule__GenericDatasheet__UnorderedGroup__2
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
    // InternalComponentDatasheet.g:1959:1: rule__GenericDatasheet__UnorderedGroup__2 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__3 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1963:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__3 )? )
            // InternalComponentDatasheet.g:1964:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_16);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1965:2: ( rule__GenericDatasheet__UnorderedGroup__3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt21=1;
            }
            else if ( LA21_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt21=1;
            }
            else if ( LA21_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt21=1;
            }
            else if ( LA21_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt21=1;
            }
            else if ( LA21_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt21=1;
            }
            else if ( LA21_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentDatasheet.g:1965:2: rule__GenericDatasheet__UnorderedGroup__3
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
    // InternalComponentDatasheet.g:1971:1: rule__GenericDatasheet__UnorderedGroup__3 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__4 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1975:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__4 )? )
            // InternalComponentDatasheet.g:1976:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_16);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1977:2: ( rule__GenericDatasheet__UnorderedGroup__4 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt22=1;
            }
            else if ( LA22_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt22=1;
            }
            else if ( LA22_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt22=1;
            }
            else if ( LA22_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt22=1;
            }
            else if ( LA22_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentDatasheet.g:1977:2: rule__GenericDatasheet__UnorderedGroup__4
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
    // InternalComponentDatasheet.g:1983:1: rule__GenericDatasheet__UnorderedGroup__4 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__5 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1987:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__5 )? )
            // InternalComponentDatasheet.g:1988:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_16);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:1989:2: ( rule__GenericDatasheet__UnorderedGroup__5 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt23=1;
            }
            else if ( LA23_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt23=1;
            }
            else if ( LA23_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt23=1;
            }
            else if ( LA23_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt23=1;
            }
            else if ( LA23_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentDatasheet.g:1989:2: rule__GenericDatasheet__UnorderedGroup__5
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
    // InternalComponentDatasheet.g:1995:1: rule__GenericDatasheet__UnorderedGroup__5 : rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__6 )? ;
    public final void rule__GenericDatasheet__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:1999:1: ( rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__6 )? )
            // InternalComponentDatasheet.g:2000:2: rule__GenericDatasheet__UnorderedGroup__Impl ( rule__GenericDatasheet__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_16);
            rule__GenericDatasheet__UnorderedGroup__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:2001:2: ( rule__GenericDatasheet__UnorderedGroup__6 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                alt24=1;
            }
            else if ( LA24_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                alt24=1;
            }
            else if ( LA24_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                alt24=1;
            }
            else if ( LA24_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                alt24=1;
            }
            else if ( LA24_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentDatasheet.g:2001:2: rule__GenericDatasheet__UnorderedGroup__6
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
    // InternalComponentDatasheet.g:2007:1: rule__GenericDatasheet__UnorderedGroup__6 : rule__GenericDatasheet__UnorderedGroup__Impl ;
    public final void rule__GenericDatasheet__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2011:1: ( rule__GenericDatasheet__UnorderedGroup__Impl )
            // InternalComponentDatasheet.g:2012:2: rule__GenericDatasheet__UnorderedGroup__Impl
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
    // InternalComponentDatasheet.g:2019:1: rule__ProprietaryLicense__UnorderedGroup_3 : rule__ProprietaryLicense__UnorderedGroup_3__0 {...}?;
    public final void rule__ProprietaryLicense__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
        	
        try {
            // InternalComponentDatasheet.g:2024:1: ( rule__ProprietaryLicense__UnorderedGroup_3__0 {...}?)
            // InternalComponentDatasheet.g:2025:2: rule__ProprietaryLicense__UnorderedGroup_3__0 {...}?
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
    // InternalComponentDatasheet.g:2033:1: rule__ProprietaryLicense__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDatasheet.g:2038:1: ( ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) ) )
            // InternalComponentDatasheet.g:2039:3: ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) )
            {
            // InternalComponentDatasheet.g:2039:3: ( ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) ) )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( LA25_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                alt25=2;
            }
            else if ( LA25_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                alt25=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentDatasheet.g:2040:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:2040:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) ) )
                    // InternalComponentDatasheet.g:2041:4: {...}? => ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ProprietaryLicense__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalComponentDatasheet.g:2041:114: ( ( ( rule__ProprietaryLicense__Group_3_0__0 ) ) )
                    // InternalComponentDatasheet.g:2042:5: ( ( rule__ProprietaryLicense__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:2048:5: ( ( rule__ProprietaryLicense__Group_3_0__0 ) )
                    // InternalComponentDatasheet.g:2049:6: ( rule__ProprietaryLicense__Group_3_0__0 )
                    {
                     before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_0()); 
                    // InternalComponentDatasheet.g:2050:6: ( rule__ProprietaryLicense__Group_3_0__0 )
                    // InternalComponentDatasheet.g:2050:7: rule__ProprietaryLicense__Group_3_0__0
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
                    // InternalComponentDatasheet.g:2055:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:2055:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) ) )
                    // InternalComponentDatasheet.g:2056:4: {...}? => ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ProprietaryLicense__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalComponentDatasheet.g:2056:114: ( ( ( rule__ProprietaryLicense__Group_3_1__0 ) ) )
                    // InternalComponentDatasheet.g:2057:5: ( ( rule__ProprietaryLicense__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:2063:5: ( ( rule__ProprietaryLicense__Group_3_1__0 ) )
                    // InternalComponentDatasheet.g:2064:6: ( rule__ProprietaryLicense__Group_3_1__0 )
                    {
                     before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_1()); 
                    // InternalComponentDatasheet.g:2065:6: ( rule__ProprietaryLicense__Group_3_1__0 )
                    // InternalComponentDatasheet.g:2065:7: rule__ProprietaryLicense__Group_3_1__0
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
                    // InternalComponentDatasheet.g:2070:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) )
                    {
                    // InternalComponentDatasheet.g:2070:3: ({...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) ) )
                    // InternalComponentDatasheet.g:2071:4: {...}? => ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ProprietaryLicense__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalComponentDatasheet.g:2071:114: ( ( ( rule__ProprietaryLicense__Group_3_2__0 ) ) )
                    // InternalComponentDatasheet.g:2072:5: ( ( rule__ProprietaryLicense__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalComponentDatasheet.g:2078:5: ( ( rule__ProprietaryLicense__Group_3_2__0 ) )
                    // InternalComponentDatasheet.g:2079:6: ( rule__ProprietaryLicense__Group_3_2__0 )
                    {
                     before(grammarAccess.getProprietaryLicenseAccess().getGroup_3_2()); 
                    // InternalComponentDatasheet.g:2080:6: ( rule__ProprietaryLicense__Group_3_2__0 )
                    // InternalComponentDatasheet.g:2080:7: rule__ProprietaryLicense__Group_3_2__0
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
    // InternalComponentDatasheet.g:2093:1: rule__ProprietaryLicense__UnorderedGroup_3__0 : rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__1 )? ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2097:1: ( rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__1 )? )
            // InternalComponentDatasheet.g:2098:2: rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_17);
            rule__ProprietaryLicense__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:2099:2: ( rule__ProprietaryLicense__UnorderedGroup_3__1 )?
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
                    // InternalComponentDatasheet.g:2099:2: rule__ProprietaryLicense__UnorderedGroup_3__1
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
    // InternalComponentDatasheet.g:2105:1: rule__ProprietaryLicense__UnorderedGroup_3__1 : rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__2 )? ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2109:1: ( rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__2 )? )
            // InternalComponentDatasheet.g:2110:2: rule__ProprietaryLicense__UnorderedGroup_3__Impl ( rule__ProprietaryLicense__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_17);
            rule__ProprietaryLicense__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDatasheet.g:2111:2: ( rule__ProprietaryLicense__UnorderedGroup_3__2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                alt27=1;
            }
            else if ( LA27_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponentDatasheet.g:2111:2: rule__ProprietaryLicense__UnorderedGroup_3__2
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
    // InternalComponentDatasheet.g:2117:1: rule__ProprietaryLicense__UnorderedGroup_3__2 : rule__ProprietaryLicense__UnorderedGroup_3__Impl ;
    public final void rule__ProprietaryLicense__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2121:1: ( rule__ProprietaryLicense__UnorderedGroup_3__Impl )
            // InternalComponentDatasheet.g:2122:2: rule__ProprietaryLicense__UnorderedGroup_3__Impl
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
    // InternalComponentDatasheet.g:2129:1: rule__ComponentDatasheet__ComponentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ComponentDatasheet__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2133:1: ( ( ( RULE_ID ) ) )
            // InternalComponentDatasheet.g:2134:2: ( ( RULE_ID ) )
            {
            // InternalComponentDatasheet.g:2134:2: ( ( RULE_ID ) )
            // InternalComponentDatasheet.g:2135:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentDatasheetAccess().getComponentComponentDefinitionCrossReference_1_0()); 
            // InternalComponentDatasheet.g:2136:3: ( RULE_ID )
            // InternalComponentDatasheet.g:2137:4: RULE_ID
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


    // $ANTLR start "rule__ComponentDatasheet__PurposeDescriptionAssignment_4_0_2"
    // InternalComponentDatasheet.g:2148:1: rule__ComponentDatasheet__PurposeDescriptionAssignment_4_0_2 : ( ruleEString ) ;
    public final void rule__ComponentDatasheet__PurposeDescriptionAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2152:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2153:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2153:2: ( ruleEString )
            // InternalComponentDatasheet.g:2154:3: ruleEString
            {
             before(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionEStringParserRuleCall_4_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionEStringParserRuleCall_4_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__PurposeDescriptionAssignment_4_0_2"


    // $ANTLR start "rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_4_1_2"
    // InternalComponentDatasheet.g:2163:1: rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_4_1_2 : ( ruleEString ) ;
    public final void rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2167:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2168:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2168:2: ( ruleEString )
            // InternalComponentDatasheet.g:2169:3: ruleEString
            {
             before(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionEStringParserRuleCall_4_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionEStringParserRuleCall_4_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDatasheet__HardwareRequirementDescriptionAssignment_4_1_2"


    // $ANTLR start "rule__GenericDatasheet__BaseURIAssignment_0_2"
    // InternalComponentDatasheet.g:2178:1: rule__GenericDatasheet__BaseURIAssignment_0_2 : ( ruleEString ) ;
    public final void rule__GenericDatasheet__BaseURIAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2182:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2183:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2183:2: ( ruleEString )
            // InternalComponentDatasheet.g:2184:3: ruleEString
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
    // InternalComponentDatasheet.g:2193:1: rule__GenericDatasheet__ShortDescriptionAssignment_1_2 : ( ruleEString ) ;
    public final void rule__GenericDatasheet__ShortDescriptionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2197:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2198:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2198:2: ( ruleEString )
            // InternalComponentDatasheet.g:2199:3: ruleEString
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
    // InternalComponentDatasheet.g:2208:1: rule__GenericDatasheet__LongDescriptionAssignment_2_2 : ( RULE_TEXT_BLOCK ) ;
    public final void rule__GenericDatasheet__LongDescriptionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2212:1: ( ( RULE_TEXT_BLOCK ) )
            // InternalComponentDatasheet.g:2213:2: ( RULE_TEXT_BLOCK )
            {
            // InternalComponentDatasheet.g:2213:2: ( RULE_TEXT_BLOCK )
            // InternalComponentDatasheet.g:2214:3: RULE_TEXT_BLOCK
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
    // InternalComponentDatasheet.g:2223:1: rule__GenericDatasheet__SupplierDescriptionAssignment_3_2 : ( ruleEString ) ;
    public final void rule__GenericDatasheet__SupplierDescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2227:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2228:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2228:2: ( ruleEString )
            // InternalComponentDatasheet.g:2229:3: ruleEString
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
    // InternalComponentDatasheet.g:2238:1: rule__GenericDatasheet__HomepageAssignment_4_2 : ( ruleEString ) ;
    public final void rule__GenericDatasheet__HomepageAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2242:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2243:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2243:2: ( ruleEString )
            // InternalComponentDatasheet.g:2244:3: ruleEString
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
    // InternalComponentDatasheet.g:2253:1: rule__GenericDatasheet__TrlAssignment_5_2 : ( ruleTRL ) ;
    public final void rule__GenericDatasheet__TrlAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2257:1: ( ( ruleTRL ) )
            // InternalComponentDatasheet.g:2258:2: ( ruleTRL )
            {
            // InternalComponentDatasheet.g:2258:2: ( ruleTRL )
            // InternalComponentDatasheet.g:2259:3: ruleTRL
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
    // InternalComponentDatasheet.g:2268:1: rule__GenericDatasheet__LicenseAssignment_6_2 : ( ruleAbstractLicense ) ;
    public final void rule__GenericDatasheet__LicenseAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2272:1: ( ( ruleAbstractLicense ) )
            // InternalComponentDatasheet.g:2273:2: ( ruleAbstractLicense )
            {
            // InternalComponentDatasheet.g:2273:2: ( ruleAbstractLicense )
            // InternalComponentDatasheet.g:2274:3: ruleAbstractLicense
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
    // InternalComponentDatasheet.g:2283:1: rule__SpdxLicense__LicenseIDAssignment_2 : ( ruleEString ) ;
    public final void rule__SpdxLicense__LicenseIDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2287:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2288:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2288:2: ( ruleEString )
            // InternalComponentDatasheet.g:2289:3: ruleEString
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
    // InternalComponentDatasheet.g:2298:1: rule__ProprietaryLicense__NameAssignment_3_0_2 : ( ruleEString ) ;
    public final void rule__ProprietaryLicense__NameAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2302:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2303:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2303:2: ( ruleEString )
            // InternalComponentDatasheet.g:2304:3: ruleEString
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
    // InternalComponentDatasheet.g:2313:1: rule__ProprietaryLicense__FullTextAssignment_3_1_2 : ( ruleEString ) ;
    public final void rule__ProprietaryLicense__FullTextAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2317:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2318:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2318:2: ( ruleEString )
            // InternalComponentDatasheet.g:2319:3: ruleEString
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
    // InternalComponentDatasheet.g:2328:1: rule__ProprietaryLicense__UrlAssignment_3_2_2 : ( ruleEString ) ;
    public final void rule__ProprietaryLicense__UrlAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDatasheet.g:2332:1: ( ( ruleEString ) )
            // InternalComponentDatasheet.g:2333:2: ( ruleEString )
            {
            // InternalComponentDatasheet.g:2333:2: ( ruleEString )
            // InternalComponentDatasheet.g:2334:3: ruleEString
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000007F0000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000043FF000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004804000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000007F0000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000038000000002L});

}
