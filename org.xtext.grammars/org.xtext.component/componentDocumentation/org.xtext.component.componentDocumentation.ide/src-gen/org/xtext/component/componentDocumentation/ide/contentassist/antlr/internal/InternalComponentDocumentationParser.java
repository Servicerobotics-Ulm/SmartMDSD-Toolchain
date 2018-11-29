package org.xtext.component.componentDocumentation.ide.contentassist.antlr.internal;

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
import org.xtext.component.componentDocumentation.services.ComponentDocumentationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentDocumentationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentDocumentation'", "'{'", "'}'", "'Description'", "':'", "'Purpose'", "'License'", "'HardwareRequirements'", "'.'", "'CoordinationSlavePort'", "'SlavePortDescription'", "'DynamicWiringPort'", "'StatePort'", "'ParameterPort'", "'ComponentPort'", "'ComponentMode'", "'NeutralMode'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalComponentDocumentationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentDocumentationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentDocumentationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentDocumentation.g"; }


    	private ComponentDocumentationGrammarAccess grammarAccess;

    	public void setGrammarAccess(ComponentDocumentationGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleComponentDocumentation"
    // InternalComponentDocumentation.g:94:1: entryRuleComponentDocumentation : ruleComponentDocumentation EOF ;
    public final void entryRuleComponentDocumentation() throws RecognitionException {
        try {
            // InternalComponentDocumentation.g:95:1: ( ruleComponentDocumentation EOF )
            // InternalComponentDocumentation.g:96:1: ruleComponentDocumentation EOF
            {
             before(grammarAccess.getComponentDocumentationRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentDocumentation();

            state._fsp--;

             after(grammarAccess.getComponentDocumentationRule()); 
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
    // $ANTLR end "entryRuleComponentDocumentation"


    // $ANTLR start "ruleComponentDocumentation"
    // InternalComponentDocumentation.g:103:1: ruleComponentDocumentation : ( ( rule__ComponentDocumentation__Group__0 ) ) ;
    public final void ruleComponentDocumentation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:107:2: ( ( ( rule__ComponentDocumentation__Group__0 ) ) )
            // InternalComponentDocumentation.g:108:2: ( ( rule__ComponentDocumentation__Group__0 ) )
            {
            // InternalComponentDocumentation.g:108:2: ( ( rule__ComponentDocumentation__Group__0 ) )
            // InternalComponentDocumentation.g:109:3: ( rule__ComponentDocumentation__Group__0 )
            {
             before(grammarAccess.getComponentDocumentationAccess().getGroup()); 
            // InternalComponentDocumentation.g:110:3: ( rule__ComponentDocumentation__Group__0 )
            // InternalComponentDocumentation.g:110:4: rule__ComponentDocumentation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentDocumentationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentDocumentation"


    // $ANTLR start "entryRuleFQN"
    // InternalComponentDocumentation.g:119:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalComponentDocumentation.g:120:1: ( ruleFQN EOF )
            // InternalComponentDocumentation.g:121:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalComponentDocumentation.g:128:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:132:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalComponentDocumentation.g:133:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalComponentDocumentation.g:133:2: ( ( rule__FQN__Group__0 ) )
            // InternalComponentDocumentation.g:134:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalComponentDocumentation.g:135:3: ( rule__FQN__Group__0 )
            // InternalComponentDocumentation.g:135:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEString"
    // InternalComponentDocumentation.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentDocumentation.g:145:1: ( ruleEString EOF )
            // InternalComponentDocumentation.g:146:1: ruleEString EOF
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
    // InternalComponentDocumentation.g:153:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:157:2: ( ( RULE_STRING ) )
            // InternalComponentDocumentation.g:158:2: ( RULE_STRING )
            {
            // InternalComponentDocumentation.g:158:2: ( RULE_STRING )
            // InternalComponentDocumentation.g:159:3: RULE_STRING
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


    // $ANTLR start "entryRuleAbstractComponentDocuElement"
    // InternalComponentDocumentation.g:169:1: entryRuleAbstractComponentDocuElement : ruleAbstractComponentDocuElement EOF ;
    public final void entryRuleAbstractComponentDocuElement() throws RecognitionException {
        try {
            // InternalComponentDocumentation.g:170:1: ( ruleAbstractComponentDocuElement EOF )
            // InternalComponentDocumentation.g:171:1: ruleAbstractComponentDocuElement EOF
            {
             before(grammarAccess.getAbstractComponentDocuElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractComponentDocuElement();

            state._fsp--;

             after(grammarAccess.getAbstractComponentDocuElementRule()); 
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
    // $ANTLR end "entryRuleAbstractComponentDocuElement"


    // $ANTLR start "ruleAbstractComponentDocuElement"
    // InternalComponentDocumentation.g:178:1: ruleAbstractComponentDocuElement : ( ( rule__AbstractComponentDocuElement__Alternatives ) ) ;
    public final void ruleAbstractComponentDocuElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:182:2: ( ( ( rule__AbstractComponentDocuElement__Alternatives ) ) )
            // InternalComponentDocumentation.g:183:2: ( ( rule__AbstractComponentDocuElement__Alternatives ) )
            {
            // InternalComponentDocumentation.g:183:2: ( ( rule__AbstractComponentDocuElement__Alternatives ) )
            // InternalComponentDocumentation.g:184:3: ( rule__AbstractComponentDocuElement__Alternatives )
            {
             before(grammarAccess.getAbstractComponentDocuElementAccess().getAlternatives()); 
            // InternalComponentDocumentation.g:185:3: ( rule__AbstractComponentDocuElement__Alternatives )
            // InternalComponentDocumentation.g:185:4: rule__AbstractComponentDocuElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractComponentDocuElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractComponentDocuElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractComponentDocuElement"


    // $ANTLR start "entryRuleCoordinationSlavePortDocu"
    // InternalComponentDocumentation.g:194:1: entryRuleCoordinationSlavePortDocu : ruleCoordinationSlavePortDocu EOF ;
    public final void entryRuleCoordinationSlavePortDocu() throws RecognitionException {
        try {
            // InternalComponentDocumentation.g:195:1: ( ruleCoordinationSlavePortDocu EOF )
            // InternalComponentDocumentation.g:196:1: ruleCoordinationSlavePortDocu EOF
            {
             before(grammarAccess.getCoordinationSlavePortDocuRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinationSlavePortDocu();

            state._fsp--;

             after(grammarAccess.getCoordinationSlavePortDocuRule()); 
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
    // $ANTLR end "entryRuleCoordinationSlavePortDocu"


    // $ANTLR start "ruleCoordinationSlavePortDocu"
    // InternalComponentDocumentation.g:203:1: ruleCoordinationSlavePortDocu : ( ( rule__CoordinationSlavePortDocu__Group__0 ) ) ;
    public final void ruleCoordinationSlavePortDocu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:207:2: ( ( ( rule__CoordinationSlavePortDocu__Group__0 ) ) )
            // InternalComponentDocumentation.g:208:2: ( ( rule__CoordinationSlavePortDocu__Group__0 ) )
            {
            // InternalComponentDocumentation.g:208:2: ( ( rule__CoordinationSlavePortDocu__Group__0 ) )
            // InternalComponentDocumentation.g:209:3: ( rule__CoordinationSlavePortDocu__Group__0 )
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup()); 
            // InternalComponentDocumentation.g:210:3: ( rule__CoordinationSlavePortDocu__Group__0 )
            // InternalComponentDocumentation.g:210:4: rule__CoordinationSlavePortDocu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinationSlavePortDocu"


    // $ANTLR start "entryRuleComponentServiceDocu"
    // InternalComponentDocumentation.g:219:1: entryRuleComponentServiceDocu : ruleComponentServiceDocu EOF ;
    public final void entryRuleComponentServiceDocu() throws RecognitionException {
        try {
            // InternalComponentDocumentation.g:220:1: ( ruleComponentServiceDocu EOF )
            // InternalComponentDocumentation.g:221:1: ruleComponentServiceDocu EOF
            {
             before(grammarAccess.getComponentServiceDocuRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentServiceDocu();

            state._fsp--;

             after(grammarAccess.getComponentServiceDocuRule()); 
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
    // $ANTLR end "entryRuleComponentServiceDocu"


    // $ANTLR start "ruleComponentServiceDocu"
    // InternalComponentDocumentation.g:228:1: ruleComponentServiceDocu : ( ( rule__ComponentServiceDocu__Group__0 ) ) ;
    public final void ruleComponentServiceDocu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:232:2: ( ( ( rule__ComponentServiceDocu__Group__0 ) ) )
            // InternalComponentDocumentation.g:233:2: ( ( rule__ComponentServiceDocu__Group__0 ) )
            {
            // InternalComponentDocumentation.g:233:2: ( ( rule__ComponentServiceDocu__Group__0 ) )
            // InternalComponentDocumentation.g:234:3: ( rule__ComponentServiceDocu__Group__0 )
            {
             before(grammarAccess.getComponentServiceDocuAccess().getGroup()); 
            // InternalComponentDocumentation.g:235:3: ( rule__ComponentServiceDocu__Group__0 )
            // InternalComponentDocumentation.g:235:4: rule__ComponentServiceDocu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentServiceDocu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentServiceDocuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentServiceDocu"


    // $ANTLR start "entryRuleAbstractModeDocu"
    // InternalComponentDocumentation.g:244:1: entryRuleAbstractModeDocu : ruleAbstractModeDocu EOF ;
    public final void entryRuleAbstractModeDocu() throws RecognitionException {
        try {
            // InternalComponentDocumentation.g:245:1: ( ruleAbstractModeDocu EOF )
            // InternalComponentDocumentation.g:246:1: ruleAbstractModeDocu EOF
            {
             before(grammarAccess.getAbstractModeDocuRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractModeDocu();

            state._fsp--;

             after(grammarAccess.getAbstractModeDocuRule()); 
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
    // $ANTLR end "entryRuleAbstractModeDocu"


    // $ANTLR start "ruleAbstractModeDocu"
    // InternalComponentDocumentation.g:253:1: ruleAbstractModeDocu : ( ( rule__AbstractModeDocu__Alternatives ) ) ;
    public final void ruleAbstractModeDocu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:257:2: ( ( ( rule__AbstractModeDocu__Alternatives ) ) )
            // InternalComponentDocumentation.g:258:2: ( ( rule__AbstractModeDocu__Alternatives ) )
            {
            // InternalComponentDocumentation.g:258:2: ( ( rule__AbstractModeDocu__Alternatives ) )
            // InternalComponentDocumentation.g:259:3: ( rule__AbstractModeDocu__Alternatives )
            {
             before(grammarAccess.getAbstractModeDocuAccess().getAlternatives()); 
            // InternalComponentDocumentation.g:260:3: ( rule__AbstractModeDocu__Alternatives )
            // InternalComponentDocumentation.g:260:4: rule__AbstractModeDocu__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModeDocu__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractModeDocuAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractModeDocu"


    // $ANTLR start "entryRuleComponentModeDocu"
    // InternalComponentDocumentation.g:269:1: entryRuleComponentModeDocu : ruleComponentModeDocu EOF ;
    public final void entryRuleComponentModeDocu() throws RecognitionException {
        try {
            // InternalComponentDocumentation.g:270:1: ( ruleComponentModeDocu EOF )
            // InternalComponentDocumentation.g:271:1: ruleComponentModeDocu EOF
            {
             before(grammarAccess.getComponentModeDocuRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentModeDocu();

            state._fsp--;

             after(grammarAccess.getComponentModeDocuRule()); 
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
    // $ANTLR end "entryRuleComponentModeDocu"


    // $ANTLR start "ruleComponentModeDocu"
    // InternalComponentDocumentation.g:278:1: ruleComponentModeDocu : ( ( rule__ComponentModeDocu__Group__0 ) ) ;
    public final void ruleComponentModeDocu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:282:2: ( ( ( rule__ComponentModeDocu__Group__0 ) ) )
            // InternalComponentDocumentation.g:283:2: ( ( rule__ComponentModeDocu__Group__0 ) )
            {
            // InternalComponentDocumentation.g:283:2: ( ( rule__ComponentModeDocu__Group__0 ) )
            // InternalComponentDocumentation.g:284:3: ( rule__ComponentModeDocu__Group__0 )
            {
             before(grammarAccess.getComponentModeDocuAccess().getGroup()); 
            // InternalComponentDocumentation.g:285:3: ( rule__ComponentModeDocu__Group__0 )
            // InternalComponentDocumentation.g:285:4: rule__ComponentModeDocu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeDocu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentModeDocuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentModeDocu"


    // $ANTLR start "entryRuleNeutralModeDocu"
    // InternalComponentDocumentation.g:294:1: entryRuleNeutralModeDocu : ruleNeutralModeDocu EOF ;
    public final void entryRuleNeutralModeDocu() throws RecognitionException {
        try {
            // InternalComponentDocumentation.g:295:1: ( ruleNeutralModeDocu EOF )
            // InternalComponentDocumentation.g:296:1: ruleNeutralModeDocu EOF
            {
             before(grammarAccess.getNeutralModeDocuRule()); 
            pushFollow(FOLLOW_1);
            ruleNeutralModeDocu();

            state._fsp--;

             after(grammarAccess.getNeutralModeDocuRule()); 
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
    // $ANTLR end "entryRuleNeutralModeDocu"


    // $ANTLR start "ruleNeutralModeDocu"
    // InternalComponentDocumentation.g:303:1: ruleNeutralModeDocu : ( ( rule__NeutralModeDocu__Group__0 ) ) ;
    public final void ruleNeutralModeDocu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:307:2: ( ( ( rule__NeutralModeDocu__Group__0 ) ) )
            // InternalComponentDocumentation.g:308:2: ( ( rule__NeutralModeDocu__Group__0 ) )
            {
            // InternalComponentDocumentation.g:308:2: ( ( rule__NeutralModeDocu__Group__0 ) )
            // InternalComponentDocumentation.g:309:3: ( rule__NeutralModeDocu__Group__0 )
            {
             before(grammarAccess.getNeutralModeDocuAccess().getGroup()); 
            // InternalComponentDocumentation.g:310:3: ( rule__NeutralModeDocu__Group__0 )
            // InternalComponentDocumentation.g:310:4: rule__NeutralModeDocu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NeutralModeDocu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNeutralModeDocuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNeutralModeDocu"


    // $ANTLR start "rule__AbstractComponentDocuElement__Alternatives"
    // InternalComponentDocumentation.g:318:1: rule__AbstractComponentDocuElement__Alternatives : ( ( ruleCoordinationSlavePortDocu ) | ( ruleComponentServiceDocu ) | ( ruleAbstractModeDocu ) );
    public final void rule__AbstractComponentDocuElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:322:1: ( ( ruleCoordinationSlavePortDocu ) | ( ruleComponentServiceDocu ) | ( ruleAbstractModeDocu ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 26:
            case 27:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalComponentDocumentation.g:323:2: ( ruleCoordinationSlavePortDocu )
                    {
                    // InternalComponentDocumentation.g:323:2: ( ruleCoordinationSlavePortDocu )
                    // InternalComponentDocumentation.g:324:3: ruleCoordinationSlavePortDocu
                    {
                     before(grammarAccess.getAbstractComponentDocuElementAccess().getCoordinationSlavePortDocuParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCoordinationSlavePortDocu();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentDocuElementAccess().getCoordinationSlavePortDocuParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDocumentation.g:329:2: ( ruleComponentServiceDocu )
                    {
                    // InternalComponentDocumentation.g:329:2: ( ruleComponentServiceDocu )
                    // InternalComponentDocumentation.g:330:3: ruleComponentServiceDocu
                    {
                     before(grammarAccess.getAbstractComponentDocuElementAccess().getComponentServiceDocuParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentServiceDocu();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentDocuElementAccess().getComponentServiceDocuParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDocumentation.g:335:2: ( ruleAbstractModeDocu )
                    {
                    // InternalComponentDocumentation.g:335:2: ( ruleAbstractModeDocu )
                    // InternalComponentDocumentation.g:336:3: ruleAbstractModeDocu
                    {
                     before(grammarAccess.getAbstractComponentDocuElementAccess().getAbstractModeDocuParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractModeDocu();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentDocuElementAccess().getAbstractModeDocuParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractComponentDocuElement__Alternatives"


    // $ANTLR start "rule__AbstractModeDocu__Alternatives"
    // InternalComponentDocumentation.g:345:1: rule__AbstractModeDocu__Alternatives : ( ( ruleComponentModeDocu ) | ( ruleNeutralModeDocu ) );
    public final void rule__AbstractModeDocu__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:349:1: ( ( ruleComponentModeDocu ) | ( ruleNeutralModeDocu ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentDocumentation.g:350:2: ( ruleComponentModeDocu )
                    {
                    // InternalComponentDocumentation.g:350:2: ( ruleComponentModeDocu )
                    // InternalComponentDocumentation.g:351:3: ruleComponentModeDocu
                    {
                     before(grammarAccess.getAbstractModeDocuAccess().getComponentModeDocuParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentModeDocu();

                    state._fsp--;

                     after(grammarAccess.getAbstractModeDocuAccess().getComponentModeDocuParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDocumentation.g:356:2: ( ruleNeutralModeDocu )
                    {
                    // InternalComponentDocumentation.g:356:2: ( ruleNeutralModeDocu )
                    // InternalComponentDocumentation.g:357:3: ruleNeutralModeDocu
                    {
                     before(grammarAccess.getAbstractModeDocuAccess().getNeutralModeDocuParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNeutralModeDocu();

                    state._fsp--;

                     after(grammarAccess.getAbstractModeDocuAccess().getNeutralModeDocuParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractModeDocu__Alternatives"


    // $ANTLR start "rule__ComponentDocumentation__Group__0"
    // InternalComponentDocumentation.g:366:1: rule__ComponentDocumentation__Group__0 : rule__ComponentDocumentation__Group__0__Impl rule__ComponentDocumentation__Group__1 ;
    public final void rule__ComponentDocumentation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:370:1: ( rule__ComponentDocumentation__Group__0__Impl rule__ComponentDocumentation__Group__1 )
            // InternalComponentDocumentation.g:371:2: rule__ComponentDocumentation__Group__0__Impl rule__ComponentDocumentation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentDocumentation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group__0"


    // $ANTLR start "rule__ComponentDocumentation__Group__0__Impl"
    // InternalComponentDocumentation.g:378:1: rule__ComponentDocumentation__Group__0__Impl : ( 'ComponentDocumentation' ) ;
    public final void rule__ComponentDocumentation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:382:1: ( ( 'ComponentDocumentation' ) )
            // InternalComponentDocumentation.g:383:1: ( 'ComponentDocumentation' )
            {
            // InternalComponentDocumentation.g:383:1: ( 'ComponentDocumentation' )
            // InternalComponentDocumentation.g:384:2: 'ComponentDocumentation'
            {
             before(grammarAccess.getComponentDocumentationAccess().getComponentDocumentationKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getComponentDocumentationAccess().getComponentDocumentationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group__0__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group__1"
    // InternalComponentDocumentation.g:393:1: rule__ComponentDocumentation__Group__1 : rule__ComponentDocumentation__Group__1__Impl rule__ComponentDocumentation__Group__2 ;
    public final void rule__ComponentDocumentation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:397:1: ( rule__ComponentDocumentation__Group__1__Impl rule__ComponentDocumentation__Group__2 )
            // InternalComponentDocumentation.g:398:2: rule__ComponentDocumentation__Group__1__Impl rule__ComponentDocumentation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComponentDocumentation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group__1"


    // $ANTLR start "rule__ComponentDocumentation__Group__1__Impl"
    // InternalComponentDocumentation.g:405:1: rule__ComponentDocumentation__Group__1__Impl : ( ( rule__ComponentDocumentation__ComponentAssignment_1 ) ) ;
    public final void rule__ComponentDocumentation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:409:1: ( ( ( rule__ComponentDocumentation__ComponentAssignment_1 ) ) )
            // InternalComponentDocumentation.g:410:1: ( ( rule__ComponentDocumentation__ComponentAssignment_1 ) )
            {
            // InternalComponentDocumentation.g:410:1: ( ( rule__ComponentDocumentation__ComponentAssignment_1 ) )
            // InternalComponentDocumentation.g:411:2: ( rule__ComponentDocumentation__ComponentAssignment_1 )
            {
             before(grammarAccess.getComponentDocumentationAccess().getComponentAssignment_1()); 
            // InternalComponentDocumentation.g:412:2: ( rule__ComponentDocumentation__ComponentAssignment_1 )
            // InternalComponentDocumentation.g:412:3: rule__ComponentDocumentation__ComponentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__ComponentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentDocumentationAccess().getComponentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group__1__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group__2"
    // InternalComponentDocumentation.g:420:1: rule__ComponentDocumentation__Group__2 : rule__ComponentDocumentation__Group__2__Impl rule__ComponentDocumentation__Group__3 ;
    public final void rule__ComponentDocumentation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:424:1: ( rule__ComponentDocumentation__Group__2__Impl rule__ComponentDocumentation__Group__3 )
            // InternalComponentDocumentation.g:425:2: rule__ComponentDocumentation__Group__2__Impl rule__ComponentDocumentation__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ComponentDocumentation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group__2"


    // $ANTLR start "rule__ComponentDocumentation__Group__2__Impl"
    // InternalComponentDocumentation.g:432:1: rule__ComponentDocumentation__Group__2__Impl : ( '{' ) ;
    public final void rule__ComponentDocumentation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:436:1: ( ( '{' ) )
            // InternalComponentDocumentation.g:437:1: ( '{' )
            {
            // InternalComponentDocumentation.g:437:1: ( '{' )
            // InternalComponentDocumentation.g:438:2: '{'
            {
             before(grammarAccess.getComponentDocumentationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentDocumentationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group__2__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group__3"
    // InternalComponentDocumentation.g:447:1: rule__ComponentDocumentation__Group__3 : rule__ComponentDocumentation__Group__3__Impl rule__ComponentDocumentation__Group__4 ;
    public final void rule__ComponentDocumentation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:451:1: ( rule__ComponentDocumentation__Group__3__Impl rule__ComponentDocumentation__Group__4 )
            // InternalComponentDocumentation.g:452:2: rule__ComponentDocumentation__Group__3__Impl rule__ComponentDocumentation__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ComponentDocumentation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group__3"


    // $ANTLR start "rule__ComponentDocumentation__Group__3__Impl"
    // InternalComponentDocumentation.g:459:1: rule__ComponentDocumentation__Group__3__Impl : ( ( rule__ComponentDocumentation__UnorderedGroup_3 ) ) ;
    public final void rule__ComponentDocumentation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:463:1: ( ( ( rule__ComponentDocumentation__UnorderedGroup_3 ) ) )
            // InternalComponentDocumentation.g:464:1: ( ( rule__ComponentDocumentation__UnorderedGroup_3 ) )
            {
            // InternalComponentDocumentation.g:464:1: ( ( rule__ComponentDocumentation__UnorderedGroup_3 ) )
            // InternalComponentDocumentation.g:465:2: ( rule__ComponentDocumentation__UnorderedGroup_3 )
            {
             before(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3()); 
            // InternalComponentDocumentation.g:466:2: ( rule__ComponentDocumentation__UnorderedGroup_3 )
            // InternalComponentDocumentation.g:466:3: rule__ComponentDocumentation__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group__3__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group__4"
    // InternalComponentDocumentation.g:474:1: rule__ComponentDocumentation__Group__4 : rule__ComponentDocumentation__Group__4__Impl rule__ComponentDocumentation__Group__5 ;
    public final void rule__ComponentDocumentation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:478:1: ( rule__ComponentDocumentation__Group__4__Impl rule__ComponentDocumentation__Group__5 )
            // InternalComponentDocumentation.g:479:2: rule__ComponentDocumentation__Group__4__Impl rule__ComponentDocumentation__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ComponentDocumentation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group__4"


    // $ANTLR start "rule__ComponentDocumentation__Group__4__Impl"
    // InternalComponentDocumentation.g:486:1: rule__ComponentDocumentation__Group__4__Impl : ( ( rule__ComponentDocumentation__ElementsAssignment_4 )* ) ;
    public final void rule__ComponentDocumentation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:490:1: ( ( ( rule__ComponentDocumentation__ElementsAssignment_4 )* ) )
            // InternalComponentDocumentation.g:491:1: ( ( rule__ComponentDocumentation__ElementsAssignment_4 )* )
            {
            // InternalComponentDocumentation.g:491:1: ( ( rule__ComponentDocumentation__ElementsAssignment_4 )* )
            // InternalComponentDocumentation.g:492:2: ( rule__ComponentDocumentation__ElementsAssignment_4 )*
            {
             before(grammarAccess.getComponentDocumentationAccess().getElementsAssignment_4()); 
            // InternalComponentDocumentation.g:493:2: ( rule__ComponentDocumentation__ElementsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20||(LA3_0>=25 && LA3_0<=27)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalComponentDocumentation.g:493:3: rule__ComponentDocumentation__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ComponentDocumentation__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getComponentDocumentationAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group__4__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group__5"
    // InternalComponentDocumentation.g:501:1: rule__ComponentDocumentation__Group__5 : rule__ComponentDocumentation__Group__5__Impl ;
    public final void rule__ComponentDocumentation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:505:1: ( rule__ComponentDocumentation__Group__5__Impl )
            // InternalComponentDocumentation.g:506:2: rule__ComponentDocumentation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group__5"


    // $ANTLR start "rule__ComponentDocumentation__Group__5__Impl"
    // InternalComponentDocumentation.g:512:1: rule__ComponentDocumentation__Group__5__Impl : ( '}' ) ;
    public final void rule__ComponentDocumentation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:516:1: ( ( '}' ) )
            // InternalComponentDocumentation.g:517:1: ( '}' )
            {
            // InternalComponentDocumentation.g:517:1: ( '}' )
            // InternalComponentDocumentation.g:518:2: '}'
            {
             before(grammarAccess.getComponentDocumentationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentDocumentationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group__5__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_0__0"
    // InternalComponentDocumentation.g:528:1: rule__ComponentDocumentation__Group_3_0__0 : rule__ComponentDocumentation__Group_3_0__0__Impl rule__ComponentDocumentation__Group_3_0__1 ;
    public final void rule__ComponentDocumentation__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:532:1: ( rule__ComponentDocumentation__Group_3_0__0__Impl rule__ComponentDocumentation__Group_3_0__1 )
            // InternalComponentDocumentation.g:533:2: rule__ComponentDocumentation__Group_3_0__0__Impl rule__ComponentDocumentation__Group_3_0__1
            {
            pushFollow(FOLLOW_8);
            rule__ComponentDocumentation__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_0__0"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_0__0__Impl"
    // InternalComponentDocumentation.g:540:1: rule__ComponentDocumentation__Group_3_0__0__Impl : ( 'Description' ) ;
    public final void rule__ComponentDocumentation__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:544:1: ( ( 'Description' ) )
            // InternalComponentDocumentation.g:545:1: ( 'Description' )
            {
            // InternalComponentDocumentation.g:545:1: ( 'Description' )
            // InternalComponentDocumentation.g:546:2: 'Description'
            {
             before(grammarAccess.getComponentDocumentationAccess().getDescriptionKeyword_3_0_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentDocumentationAccess().getDescriptionKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_0__0__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_0__1"
    // InternalComponentDocumentation.g:555:1: rule__ComponentDocumentation__Group_3_0__1 : rule__ComponentDocumentation__Group_3_0__1__Impl rule__ComponentDocumentation__Group_3_0__2 ;
    public final void rule__ComponentDocumentation__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:559:1: ( rule__ComponentDocumentation__Group_3_0__1__Impl rule__ComponentDocumentation__Group_3_0__2 )
            // InternalComponentDocumentation.g:560:2: rule__ComponentDocumentation__Group_3_0__1__Impl rule__ComponentDocumentation__Group_3_0__2
            {
            pushFollow(FOLLOW_9);
            rule__ComponentDocumentation__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_0__1"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_0__1__Impl"
    // InternalComponentDocumentation.g:567:1: rule__ComponentDocumentation__Group_3_0__1__Impl : ( ':' ) ;
    public final void rule__ComponentDocumentation__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:571:1: ( ( ':' ) )
            // InternalComponentDocumentation.g:572:1: ( ':' )
            {
            // InternalComponentDocumentation.g:572:1: ( ':' )
            // InternalComponentDocumentation.g:573:2: ':'
            {
             before(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_0__1__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_0__2"
    // InternalComponentDocumentation.g:582:1: rule__ComponentDocumentation__Group_3_0__2 : rule__ComponentDocumentation__Group_3_0__2__Impl ;
    public final void rule__ComponentDocumentation__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:586:1: ( rule__ComponentDocumentation__Group_3_0__2__Impl )
            // InternalComponentDocumentation.g:587:2: rule__ComponentDocumentation__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_0__2"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_0__2__Impl"
    // InternalComponentDocumentation.g:593:1: rule__ComponentDocumentation__Group_3_0__2__Impl : ( ( rule__ComponentDocumentation__DescriptionAssignment_3_0_2 ) ) ;
    public final void rule__ComponentDocumentation__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:597:1: ( ( ( rule__ComponentDocumentation__DescriptionAssignment_3_0_2 ) ) )
            // InternalComponentDocumentation.g:598:1: ( ( rule__ComponentDocumentation__DescriptionAssignment_3_0_2 ) )
            {
            // InternalComponentDocumentation.g:598:1: ( ( rule__ComponentDocumentation__DescriptionAssignment_3_0_2 ) )
            // InternalComponentDocumentation.g:599:2: ( rule__ComponentDocumentation__DescriptionAssignment_3_0_2 )
            {
             before(grammarAccess.getComponentDocumentationAccess().getDescriptionAssignment_3_0_2()); 
            // InternalComponentDocumentation.g:600:2: ( rule__ComponentDocumentation__DescriptionAssignment_3_0_2 )
            // InternalComponentDocumentation.g:600:3: rule__ComponentDocumentation__DescriptionAssignment_3_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__DescriptionAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDocumentationAccess().getDescriptionAssignment_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_0__2__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_1__0"
    // InternalComponentDocumentation.g:609:1: rule__ComponentDocumentation__Group_3_1__0 : rule__ComponentDocumentation__Group_3_1__0__Impl rule__ComponentDocumentation__Group_3_1__1 ;
    public final void rule__ComponentDocumentation__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:613:1: ( rule__ComponentDocumentation__Group_3_1__0__Impl rule__ComponentDocumentation__Group_3_1__1 )
            // InternalComponentDocumentation.g:614:2: rule__ComponentDocumentation__Group_3_1__0__Impl rule__ComponentDocumentation__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ComponentDocumentation__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_1__0"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_1__0__Impl"
    // InternalComponentDocumentation.g:621:1: rule__ComponentDocumentation__Group_3_1__0__Impl : ( 'Purpose' ) ;
    public final void rule__ComponentDocumentation__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:625:1: ( ( 'Purpose' ) )
            // InternalComponentDocumentation.g:626:1: ( 'Purpose' )
            {
            // InternalComponentDocumentation.g:626:1: ( 'Purpose' )
            // InternalComponentDocumentation.g:627:2: 'Purpose'
            {
             before(grammarAccess.getComponentDocumentationAccess().getPurposeKeyword_3_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponentDocumentationAccess().getPurposeKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_1__0__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_1__1"
    // InternalComponentDocumentation.g:636:1: rule__ComponentDocumentation__Group_3_1__1 : rule__ComponentDocumentation__Group_3_1__1__Impl rule__ComponentDocumentation__Group_3_1__2 ;
    public final void rule__ComponentDocumentation__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:640:1: ( rule__ComponentDocumentation__Group_3_1__1__Impl rule__ComponentDocumentation__Group_3_1__2 )
            // InternalComponentDocumentation.g:641:2: rule__ComponentDocumentation__Group_3_1__1__Impl rule__ComponentDocumentation__Group_3_1__2
            {
            pushFollow(FOLLOW_9);
            rule__ComponentDocumentation__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_1__1"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_1__1__Impl"
    // InternalComponentDocumentation.g:648:1: rule__ComponentDocumentation__Group_3_1__1__Impl : ( ':' ) ;
    public final void rule__ComponentDocumentation__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:652:1: ( ( ':' ) )
            // InternalComponentDocumentation.g:653:1: ( ':' )
            {
            // InternalComponentDocumentation.g:653:1: ( ':' )
            // InternalComponentDocumentation.g:654:2: ':'
            {
             before(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_1__1__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_1__2"
    // InternalComponentDocumentation.g:663:1: rule__ComponentDocumentation__Group_3_1__2 : rule__ComponentDocumentation__Group_3_1__2__Impl ;
    public final void rule__ComponentDocumentation__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:667:1: ( rule__ComponentDocumentation__Group_3_1__2__Impl )
            // InternalComponentDocumentation.g:668:2: rule__ComponentDocumentation__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_1__2"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_1__2__Impl"
    // InternalComponentDocumentation.g:674:1: rule__ComponentDocumentation__Group_3_1__2__Impl : ( ( rule__ComponentDocumentation__PurposeAssignment_3_1_2 ) ) ;
    public final void rule__ComponentDocumentation__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:678:1: ( ( ( rule__ComponentDocumentation__PurposeAssignment_3_1_2 ) ) )
            // InternalComponentDocumentation.g:679:1: ( ( rule__ComponentDocumentation__PurposeAssignment_3_1_2 ) )
            {
            // InternalComponentDocumentation.g:679:1: ( ( rule__ComponentDocumentation__PurposeAssignment_3_1_2 ) )
            // InternalComponentDocumentation.g:680:2: ( rule__ComponentDocumentation__PurposeAssignment_3_1_2 )
            {
             before(grammarAccess.getComponentDocumentationAccess().getPurposeAssignment_3_1_2()); 
            // InternalComponentDocumentation.g:681:2: ( rule__ComponentDocumentation__PurposeAssignment_3_1_2 )
            // InternalComponentDocumentation.g:681:3: rule__ComponentDocumentation__PurposeAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__PurposeAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDocumentationAccess().getPurposeAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_1__2__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_2__0"
    // InternalComponentDocumentation.g:690:1: rule__ComponentDocumentation__Group_3_2__0 : rule__ComponentDocumentation__Group_3_2__0__Impl rule__ComponentDocumentation__Group_3_2__1 ;
    public final void rule__ComponentDocumentation__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:694:1: ( rule__ComponentDocumentation__Group_3_2__0__Impl rule__ComponentDocumentation__Group_3_2__1 )
            // InternalComponentDocumentation.g:695:2: rule__ComponentDocumentation__Group_3_2__0__Impl rule__ComponentDocumentation__Group_3_2__1
            {
            pushFollow(FOLLOW_8);
            rule__ComponentDocumentation__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_2__0"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_2__0__Impl"
    // InternalComponentDocumentation.g:702:1: rule__ComponentDocumentation__Group_3_2__0__Impl : ( 'License' ) ;
    public final void rule__ComponentDocumentation__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:706:1: ( ( 'License' ) )
            // InternalComponentDocumentation.g:707:1: ( 'License' )
            {
            // InternalComponentDocumentation.g:707:1: ( 'License' )
            // InternalComponentDocumentation.g:708:2: 'License'
            {
             before(grammarAccess.getComponentDocumentationAccess().getLicenseKeyword_3_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponentDocumentationAccess().getLicenseKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_2__0__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_2__1"
    // InternalComponentDocumentation.g:717:1: rule__ComponentDocumentation__Group_3_2__1 : rule__ComponentDocumentation__Group_3_2__1__Impl rule__ComponentDocumentation__Group_3_2__2 ;
    public final void rule__ComponentDocumentation__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:721:1: ( rule__ComponentDocumentation__Group_3_2__1__Impl rule__ComponentDocumentation__Group_3_2__2 )
            // InternalComponentDocumentation.g:722:2: rule__ComponentDocumentation__Group_3_2__1__Impl rule__ComponentDocumentation__Group_3_2__2
            {
            pushFollow(FOLLOW_9);
            rule__ComponentDocumentation__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group_3_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_2__1"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_2__1__Impl"
    // InternalComponentDocumentation.g:729:1: rule__ComponentDocumentation__Group_3_2__1__Impl : ( ':' ) ;
    public final void rule__ComponentDocumentation__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:733:1: ( ( ':' ) )
            // InternalComponentDocumentation.g:734:1: ( ':' )
            {
            // InternalComponentDocumentation.g:734:1: ( ':' )
            // InternalComponentDocumentation.g:735:2: ':'
            {
             before(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_2__1__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_2__2"
    // InternalComponentDocumentation.g:744:1: rule__ComponentDocumentation__Group_3_2__2 : rule__ComponentDocumentation__Group_3_2__2__Impl ;
    public final void rule__ComponentDocumentation__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:748:1: ( rule__ComponentDocumentation__Group_3_2__2__Impl )
            // InternalComponentDocumentation.g:749:2: rule__ComponentDocumentation__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group_3_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_2__2"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_2__2__Impl"
    // InternalComponentDocumentation.g:755:1: rule__ComponentDocumentation__Group_3_2__2__Impl : ( ( rule__ComponentDocumentation__LicenseAssignment_3_2_2 ) ) ;
    public final void rule__ComponentDocumentation__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:759:1: ( ( ( rule__ComponentDocumentation__LicenseAssignment_3_2_2 ) ) )
            // InternalComponentDocumentation.g:760:1: ( ( rule__ComponentDocumentation__LicenseAssignment_3_2_2 ) )
            {
            // InternalComponentDocumentation.g:760:1: ( ( rule__ComponentDocumentation__LicenseAssignment_3_2_2 ) )
            // InternalComponentDocumentation.g:761:2: ( rule__ComponentDocumentation__LicenseAssignment_3_2_2 )
            {
             before(grammarAccess.getComponentDocumentationAccess().getLicenseAssignment_3_2_2()); 
            // InternalComponentDocumentation.g:762:2: ( rule__ComponentDocumentation__LicenseAssignment_3_2_2 )
            // InternalComponentDocumentation.g:762:3: rule__ComponentDocumentation__LicenseAssignment_3_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__LicenseAssignment_3_2_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDocumentationAccess().getLicenseAssignment_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_2__2__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_3__0"
    // InternalComponentDocumentation.g:771:1: rule__ComponentDocumentation__Group_3_3__0 : rule__ComponentDocumentation__Group_3_3__0__Impl rule__ComponentDocumentation__Group_3_3__1 ;
    public final void rule__ComponentDocumentation__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:775:1: ( rule__ComponentDocumentation__Group_3_3__0__Impl rule__ComponentDocumentation__Group_3_3__1 )
            // InternalComponentDocumentation.g:776:2: rule__ComponentDocumentation__Group_3_3__0__Impl rule__ComponentDocumentation__Group_3_3__1
            {
            pushFollow(FOLLOW_8);
            rule__ComponentDocumentation__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_3__0"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_3__0__Impl"
    // InternalComponentDocumentation.g:783:1: rule__ComponentDocumentation__Group_3_3__0__Impl : ( 'HardwareRequirements' ) ;
    public final void rule__ComponentDocumentation__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:787:1: ( ( 'HardwareRequirements' ) )
            // InternalComponentDocumentation.g:788:1: ( 'HardwareRequirements' )
            {
            // InternalComponentDocumentation.g:788:1: ( 'HardwareRequirements' )
            // InternalComponentDocumentation.g:789:2: 'HardwareRequirements'
            {
             before(grammarAccess.getComponentDocumentationAccess().getHardwareRequirementsKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentDocumentationAccess().getHardwareRequirementsKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_3__0__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_3__1"
    // InternalComponentDocumentation.g:798:1: rule__ComponentDocumentation__Group_3_3__1 : rule__ComponentDocumentation__Group_3_3__1__Impl rule__ComponentDocumentation__Group_3_3__2 ;
    public final void rule__ComponentDocumentation__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:802:1: ( rule__ComponentDocumentation__Group_3_3__1__Impl rule__ComponentDocumentation__Group_3_3__2 )
            // InternalComponentDocumentation.g:803:2: rule__ComponentDocumentation__Group_3_3__1__Impl rule__ComponentDocumentation__Group_3_3__2
            {
            pushFollow(FOLLOW_9);
            rule__ComponentDocumentation__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group_3_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_3__1"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_3__1__Impl"
    // InternalComponentDocumentation.g:810:1: rule__ComponentDocumentation__Group_3_3__1__Impl : ( ':' ) ;
    public final void rule__ComponentDocumentation__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:814:1: ( ( ':' ) )
            // InternalComponentDocumentation.g:815:1: ( ':' )
            {
            // InternalComponentDocumentation.g:815:1: ( ':' )
            // InternalComponentDocumentation.g:816:2: ':'
            {
             before(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_3_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentDocumentationAccess().getColonKeyword_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_3__1__Impl"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_3__2"
    // InternalComponentDocumentation.g:825:1: rule__ComponentDocumentation__Group_3_3__2 : rule__ComponentDocumentation__Group_3_3__2__Impl ;
    public final void rule__ComponentDocumentation__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:829:1: ( rule__ComponentDocumentation__Group_3_3__2__Impl )
            // InternalComponentDocumentation.g:830:2: rule__ComponentDocumentation__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__Group_3_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_3__2"


    // $ANTLR start "rule__ComponentDocumentation__Group_3_3__2__Impl"
    // InternalComponentDocumentation.g:836:1: rule__ComponentDocumentation__Group_3_3__2__Impl : ( ( rule__ComponentDocumentation__HardwareAssignment_3_3_2 ) ) ;
    public final void rule__ComponentDocumentation__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:840:1: ( ( ( rule__ComponentDocumentation__HardwareAssignment_3_3_2 ) ) )
            // InternalComponentDocumentation.g:841:1: ( ( rule__ComponentDocumentation__HardwareAssignment_3_3_2 ) )
            {
            // InternalComponentDocumentation.g:841:1: ( ( rule__ComponentDocumentation__HardwareAssignment_3_3_2 ) )
            // InternalComponentDocumentation.g:842:2: ( rule__ComponentDocumentation__HardwareAssignment_3_3_2 )
            {
             before(grammarAccess.getComponentDocumentationAccess().getHardwareAssignment_3_3_2()); 
            // InternalComponentDocumentation.g:843:2: ( rule__ComponentDocumentation__HardwareAssignment_3_3_2 )
            // InternalComponentDocumentation.g:843:3: rule__ComponentDocumentation__HardwareAssignment_3_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__HardwareAssignment_3_3_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDocumentationAccess().getHardwareAssignment_3_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__Group_3_3__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalComponentDocumentation.g:852:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:856:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalComponentDocumentation.g:857:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalComponentDocumentation.g:864:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:868:1: ( ( RULE_ID ) )
            // InternalComponentDocumentation.g:869:1: ( RULE_ID )
            {
            // InternalComponentDocumentation.g:869:1: ( RULE_ID )
            // InternalComponentDocumentation.g:870:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalComponentDocumentation.g:879:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:883:1: ( rule__FQN__Group__1__Impl )
            // InternalComponentDocumentation.g:884:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalComponentDocumentation.g:890:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:894:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalComponentDocumentation.g:895:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalComponentDocumentation.g:895:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalComponentDocumentation.g:896:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalComponentDocumentation.g:897:2: ( rule__FQN__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalComponentDocumentation.g:897:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalComponentDocumentation.g:906:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:910:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalComponentDocumentation.g:911:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalComponentDocumentation.g:918:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:922:1: ( ( '.' ) )
            // InternalComponentDocumentation.g:923:1: ( '.' )
            {
            // InternalComponentDocumentation.g:923:1: ( '.' )
            // InternalComponentDocumentation.g:924:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalComponentDocumentation.g:933:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:937:1: ( rule__FQN__Group_1__1__Impl )
            // InternalComponentDocumentation.g:938:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalComponentDocumentation.g:944:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:948:1: ( ( RULE_ID ) )
            // InternalComponentDocumentation.g:949:1: ( RULE_ID )
            {
            // InternalComponentDocumentation.g:949:1: ( RULE_ID )
            // InternalComponentDocumentation.g:950:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group__0"
    // InternalComponentDocumentation.g:960:1: rule__CoordinationSlavePortDocu__Group__0 : rule__CoordinationSlavePortDocu__Group__0__Impl rule__CoordinationSlavePortDocu__Group__1 ;
    public final void rule__CoordinationSlavePortDocu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:964:1: ( rule__CoordinationSlavePortDocu__Group__0__Impl rule__CoordinationSlavePortDocu__Group__1 )
            // InternalComponentDocumentation.g:965:2: rule__CoordinationSlavePortDocu__Group__0__Impl rule__CoordinationSlavePortDocu__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CoordinationSlavePortDocu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group__0"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group__0__Impl"
    // InternalComponentDocumentation.g:972:1: rule__CoordinationSlavePortDocu__Group__0__Impl : ( 'CoordinationSlavePort' ) ;
    public final void rule__CoordinationSlavePortDocu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:976:1: ( ( 'CoordinationSlavePort' ) )
            // InternalComponentDocumentation.g:977:1: ( 'CoordinationSlavePort' )
            {
            // InternalComponentDocumentation.g:977:1: ( 'CoordinationSlavePort' )
            // InternalComponentDocumentation.g:978:2: 'CoordinationSlavePort'
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getCoordinationSlavePortKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortDocuAccess().getCoordinationSlavePortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group__0__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group__1"
    // InternalComponentDocumentation.g:987:1: rule__CoordinationSlavePortDocu__Group__1 : rule__CoordinationSlavePortDocu__Group__1__Impl rule__CoordinationSlavePortDocu__Group__2 ;
    public final void rule__CoordinationSlavePortDocu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:991:1: ( rule__CoordinationSlavePortDocu__Group__1__Impl rule__CoordinationSlavePortDocu__Group__2 )
            // InternalComponentDocumentation.g:992:2: rule__CoordinationSlavePortDocu__Group__1__Impl rule__CoordinationSlavePortDocu__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CoordinationSlavePortDocu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group__1"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group__1__Impl"
    // InternalComponentDocumentation.g:999:1: rule__CoordinationSlavePortDocu__Group__1__Impl : ( ( rule__CoordinationSlavePortDocu__PortAssignment_1 ) ) ;
    public final void rule__CoordinationSlavePortDocu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1003:1: ( ( ( rule__CoordinationSlavePortDocu__PortAssignment_1 ) ) )
            // InternalComponentDocumentation.g:1004:1: ( ( rule__CoordinationSlavePortDocu__PortAssignment_1 ) )
            {
            // InternalComponentDocumentation.g:1004:1: ( ( rule__CoordinationSlavePortDocu__PortAssignment_1 ) )
            // InternalComponentDocumentation.g:1005:2: ( rule__CoordinationSlavePortDocu__PortAssignment_1 )
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getPortAssignment_1()); 
            // InternalComponentDocumentation.g:1006:2: ( rule__CoordinationSlavePortDocu__PortAssignment_1 )
            // InternalComponentDocumentation.g:1006:3: rule__CoordinationSlavePortDocu__PortAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__PortAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationSlavePortDocuAccess().getPortAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group__1__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group__2"
    // InternalComponentDocumentation.g:1014:1: rule__CoordinationSlavePortDocu__Group__2 : rule__CoordinationSlavePortDocu__Group__2__Impl rule__CoordinationSlavePortDocu__Group__3 ;
    public final void rule__CoordinationSlavePortDocu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1018:1: ( rule__CoordinationSlavePortDocu__Group__2__Impl rule__CoordinationSlavePortDocu__Group__3 )
            // InternalComponentDocumentation.g:1019:2: rule__CoordinationSlavePortDocu__Group__2__Impl rule__CoordinationSlavePortDocu__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CoordinationSlavePortDocu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group__2"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group__2__Impl"
    // InternalComponentDocumentation.g:1026:1: rule__CoordinationSlavePortDocu__Group__2__Impl : ( '{' ) ;
    public final void rule__CoordinationSlavePortDocu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1030:1: ( ( '{' ) )
            // InternalComponentDocumentation.g:1031:1: ( '{' )
            {
            // InternalComponentDocumentation.g:1031:1: ( '{' )
            // InternalComponentDocumentation.g:1032:2: '{'
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortDocuAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group__2__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group__3"
    // InternalComponentDocumentation.g:1041:1: rule__CoordinationSlavePortDocu__Group__3 : rule__CoordinationSlavePortDocu__Group__3__Impl rule__CoordinationSlavePortDocu__Group__4 ;
    public final void rule__CoordinationSlavePortDocu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1045:1: ( rule__CoordinationSlavePortDocu__Group__3__Impl rule__CoordinationSlavePortDocu__Group__4 )
            // InternalComponentDocumentation.g:1046:2: rule__CoordinationSlavePortDocu__Group__3__Impl rule__CoordinationSlavePortDocu__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__CoordinationSlavePortDocu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group__3"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group__3__Impl"
    // InternalComponentDocumentation.g:1053:1: rule__CoordinationSlavePortDocu__Group__3__Impl : ( ( rule__CoordinationSlavePortDocu__UnorderedGroup_3 ) ) ;
    public final void rule__CoordinationSlavePortDocu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1057:1: ( ( ( rule__CoordinationSlavePortDocu__UnorderedGroup_3 ) ) )
            // InternalComponentDocumentation.g:1058:1: ( ( rule__CoordinationSlavePortDocu__UnorderedGroup_3 ) )
            {
            // InternalComponentDocumentation.g:1058:1: ( ( rule__CoordinationSlavePortDocu__UnorderedGroup_3 ) )
            // InternalComponentDocumentation.g:1059:2: ( rule__CoordinationSlavePortDocu__UnorderedGroup_3 )
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3()); 
            // InternalComponentDocumentation.g:1060:2: ( rule__CoordinationSlavePortDocu__UnorderedGroup_3 )
            // InternalComponentDocumentation.g:1060:3: rule__CoordinationSlavePortDocu__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group__3__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group__4"
    // InternalComponentDocumentation.g:1068:1: rule__CoordinationSlavePortDocu__Group__4 : rule__CoordinationSlavePortDocu__Group__4__Impl ;
    public final void rule__CoordinationSlavePortDocu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1072:1: ( rule__CoordinationSlavePortDocu__Group__4__Impl )
            // InternalComponentDocumentation.g:1073:2: rule__CoordinationSlavePortDocu__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group__4"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group__4__Impl"
    // InternalComponentDocumentation.g:1079:1: rule__CoordinationSlavePortDocu__Group__4__Impl : ( '}' ) ;
    public final void rule__CoordinationSlavePortDocu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1083:1: ( ( '}' ) )
            // InternalComponentDocumentation.g:1084:1: ( '}' )
            {
            // InternalComponentDocumentation.g:1084:1: ( '}' )
            // InternalComponentDocumentation.g:1085:2: '}'
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortDocuAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group__4__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_0__0"
    // InternalComponentDocumentation.g:1095:1: rule__CoordinationSlavePortDocu__Group_3_0__0 : rule__CoordinationSlavePortDocu__Group_3_0__0__Impl rule__CoordinationSlavePortDocu__Group_3_0__1 ;
    public final void rule__CoordinationSlavePortDocu__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1099:1: ( rule__CoordinationSlavePortDocu__Group_3_0__0__Impl rule__CoordinationSlavePortDocu__Group_3_0__1 )
            // InternalComponentDocumentation.g:1100:2: rule__CoordinationSlavePortDocu__Group_3_0__0__Impl rule__CoordinationSlavePortDocu__Group_3_0__1
            {
            pushFollow(FOLLOW_8);
            rule__CoordinationSlavePortDocu__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_0__0"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_0__0__Impl"
    // InternalComponentDocumentation.g:1107:1: rule__CoordinationSlavePortDocu__Group_3_0__0__Impl : ( 'SlavePortDescription' ) ;
    public final void rule__CoordinationSlavePortDocu__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1111:1: ( ( 'SlavePortDescription' ) )
            // InternalComponentDocumentation.g:1112:1: ( 'SlavePortDescription' )
            {
            // InternalComponentDocumentation.g:1112:1: ( 'SlavePortDescription' )
            // InternalComponentDocumentation.g:1113:2: 'SlavePortDescription'
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getSlavePortDescriptionKeyword_3_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortDocuAccess().getSlavePortDescriptionKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_0__0__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_0__1"
    // InternalComponentDocumentation.g:1122:1: rule__CoordinationSlavePortDocu__Group_3_0__1 : rule__CoordinationSlavePortDocu__Group_3_0__1__Impl rule__CoordinationSlavePortDocu__Group_3_0__2 ;
    public final void rule__CoordinationSlavePortDocu__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1126:1: ( rule__CoordinationSlavePortDocu__Group_3_0__1__Impl rule__CoordinationSlavePortDocu__Group_3_0__2 )
            // InternalComponentDocumentation.g:1127:2: rule__CoordinationSlavePortDocu__Group_3_0__1__Impl rule__CoordinationSlavePortDocu__Group_3_0__2
            {
            pushFollow(FOLLOW_9);
            rule__CoordinationSlavePortDocu__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_0__1"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_0__1__Impl"
    // InternalComponentDocumentation.g:1134:1: rule__CoordinationSlavePortDocu__Group_3_0__1__Impl : ( ':' ) ;
    public final void rule__CoordinationSlavePortDocu__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1138:1: ( ( ':' ) )
            // InternalComponentDocumentation.g:1139:1: ( ':' )
            {
            // InternalComponentDocumentation.g:1139:1: ( ':' )
            // InternalComponentDocumentation.g:1140:2: ':'
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_0__1__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_0__2"
    // InternalComponentDocumentation.g:1149:1: rule__CoordinationSlavePortDocu__Group_3_0__2 : rule__CoordinationSlavePortDocu__Group_3_0__2__Impl ;
    public final void rule__CoordinationSlavePortDocu__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1153:1: ( rule__CoordinationSlavePortDocu__Group_3_0__2__Impl )
            // InternalComponentDocumentation.g:1154:2: rule__CoordinationSlavePortDocu__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_0__2"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_0__2__Impl"
    // InternalComponentDocumentation.g:1160:1: rule__CoordinationSlavePortDocu__Group_3_0__2__Impl : ( ( rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2 ) ) ;
    public final void rule__CoordinationSlavePortDocu__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1164:1: ( ( ( rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2 ) ) )
            // InternalComponentDocumentation.g:1165:1: ( ( rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2 ) )
            {
            // InternalComponentDocumentation.g:1165:1: ( ( rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2 ) )
            // InternalComponentDocumentation.g:1166:2: ( rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2 )
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getDescriptionAssignment_3_0_2()); 
            // InternalComponentDocumentation.g:1167:2: ( rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2 )
            // InternalComponentDocumentation.g:1167:3: rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationSlavePortDocuAccess().getDescriptionAssignment_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_0__2__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_1__0"
    // InternalComponentDocumentation.g:1176:1: rule__CoordinationSlavePortDocu__Group_3_1__0 : rule__CoordinationSlavePortDocu__Group_3_1__0__Impl rule__CoordinationSlavePortDocu__Group_3_1__1 ;
    public final void rule__CoordinationSlavePortDocu__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1180:1: ( rule__CoordinationSlavePortDocu__Group_3_1__0__Impl rule__CoordinationSlavePortDocu__Group_3_1__1 )
            // InternalComponentDocumentation.g:1181:2: rule__CoordinationSlavePortDocu__Group_3_1__0__Impl rule__CoordinationSlavePortDocu__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__CoordinationSlavePortDocu__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_1__0"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_1__0__Impl"
    // InternalComponentDocumentation.g:1188:1: rule__CoordinationSlavePortDocu__Group_3_1__0__Impl : ( 'DynamicWiringPort' ) ;
    public final void rule__CoordinationSlavePortDocu__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1192:1: ( ( 'DynamicWiringPort' ) )
            // InternalComponentDocumentation.g:1193:1: ( 'DynamicWiringPort' )
            {
            // InternalComponentDocumentation.g:1193:1: ( 'DynamicWiringPort' )
            // InternalComponentDocumentation.g:1194:2: 'DynamicWiringPort'
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringPortKeyword_3_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringPortKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_1__0__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_1__1"
    // InternalComponentDocumentation.g:1203:1: rule__CoordinationSlavePortDocu__Group_3_1__1 : rule__CoordinationSlavePortDocu__Group_3_1__1__Impl rule__CoordinationSlavePortDocu__Group_3_1__2 ;
    public final void rule__CoordinationSlavePortDocu__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1207:1: ( rule__CoordinationSlavePortDocu__Group_3_1__1__Impl rule__CoordinationSlavePortDocu__Group_3_1__2 )
            // InternalComponentDocumentation.g:1208:2: rule__CoordinationSlavePortDocu__Group_3_1__1__Impl rule__CoordinationSlavePortDocu__Group_3_1__2
            {
            pushFollow(FOLLOW_9);
            rule__CoordinationSlavePortDocu__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_1__1"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_1__1__Impl"
    // InternalComponentDocumentation.g:1215:1: rule__CoordinationSlavePortDocu__Group_3_1__1__Impl : ( ':' ) ;
    public final void rule__CoordinationSlavePortDocu__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1219:1: ( ( ':' ) )
            // InternalComponentDocumentation.g:1220:1: ( ':' )
            {
            // InternalComponentDocumentation.g:1220:1: ( ':' )
            // InternalComponentDocumentation.g:1221:2: ':'
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_1__1__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_1__2"
    // InternalComponentDocumentation.g:1230:1: rule__CoordinationSlavePortDocu__Group_3_1__2 : rule__CoordinationSlavePortDocu__Group_3_1__2__Impl ;
    public final void rule__CoordinationSlavePortDocu__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1234:1: ( rule__CoordinationSlavePortDocu__Group_3_1__2__Impl )
            // InternalComponentDocumentation.g:1235:2: rule__CoordinationSlavePortDocu__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_1__2"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_1__2__Impl"
    // InternalComponentDocumentation.g:1241:1: rule__CoordinationSlavePortDocu__Group_3_1__2__Impl : ( ( rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2 ) ) ;
    public final void rule__CoordinationSlavePortDocu__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1245:1: ( ( ( rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2 ) ) )
            // InternalComponentDocumentation.g:1246:1: ( ( rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2 ) )
            {
            // InternalComponentDocumentation.g:1246:1: ( ( rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2 ) )
            // InternalComponentDocumentation.g:1247:2: ( rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2 )
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringAssignment_3_1_2()); 
            // InternalComponentDocumentation.g:1248:2: ( rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2 )
            // InternalComponentDocumentation.g:1248:3: rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_1__2__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_2__0"
    // InternalComponentDocumentation.g:1257:1: rule__CoordinationSlavePortDocu__Group_3_2__0 : rule__CoordinationSlavePortDocu__Group_3_2__0__Impl rule__CoordinationSlavePortDocu__Group_3_2__1 ;
    public final void rule__CoordinationSlavePortDocu__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1261:1: ( rule__CoordinationSlavePortDocu__Group_3_2__0__Impl rule__CoordinationSlavePortDocu__Group_3_2__1 )
            // InternalComponentDocumentation.g:1262:2: rule__CoordinationSlavePortDocu__Group_3_2__0__Impl rule__CoordinationSlavePortDocu__Group_3_2__1
            {
            pushFollow(FOLLOW_8);
            rule__CoordinationSlavePortDocu__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_2__0"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_2__0__Impl"
    // InternalComponentDocumentation.g:1269:1: rule__CoordinationSlavePortDocu__Group_3_2__0__Impl : ( 'StatePort' ) ;
    public final void rule__CoordinationSlavePortDocu__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1273:1: ( ( 'StatePort' ) )
            // InternalComponentDocumentation.g:1274:1: ( 'StatePort' )
            {
            // InternalComponentDocumentation.g:1274:1: ( 'StatePort' )
            // InternalComponentDocumentation.g:1275:2: 'StatePort'
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getStatePortKeyword_3_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortDocuAccess().getStatePortKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_2__0__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_2__1"
    // InternalComponentDocumentation.g:1284:1: rule__CoordinationSlavePortDocu__Group_3_2__1 : rule__CoordinationSlavePortDocu__Group_3_2__1__Impl rule__CoordinationSlavePortDocu__Group_3_2__2 ;
    public final void rule__CoordinationSlavePortDocu__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1288:1: ( rule__CoordinationSlavePortDocu__Group_3_2__1__Impl rule__CoordinationSlavePortDocu__Group_3_2__2 )
            // InternalComponentDocumentation.g:1289:2: rule__CoordinationSlavePortDocu__Group_3_2__1__Impl rule__CoordinationSlavePortDocu__Group_3_2__2
            {
            pushFollow(FOLLOW_9);
            rule__CoordinationSlavePortDocu__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group_3_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_2__1"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_2__1__Impl"
    // InternalComponentDocumentation.g:1296:1: rule__CoordinationSlavePortDocu__Group_3_2__1__Impl : ( ':' ) ;
    public final void rule__CoordinationSlavePortDocu__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1300:1: ( ( ':' ) )
            // InternalComponentDocumentation.g:1301:1: ( ':' )
            {
            // InternalComponentDocumentation.g:1301:1: ( ':' )
            // InternalComponentDocumentation.g:1302:2: ':'
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_2__1__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_2__2"
    // InternalComponentDocumentation.g:1311:1: rule__CoordinationSlavePortDocu__Group_3_2__2 : rule__CoordinationSlavePortDocu__Group_3_2__2__Impl ;
    public final void rule__CoordinationSlavePortDocu__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1315:1: ( rule__CoordinationSlavePortDocu__Group_3_2__2__Impl )
            // InternalComponentDocumentation.g:1316:2: rule__CoordinationSlavePortDocu__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group_3_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_2__2"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_2__2__Impl"
    // InternalComponentDocumentation.g:1322:1: rule__CoordinationSlavePortDocu__Group_3_2__2__Impl : ( ( rule__CoordinationSlavePortDocu__StateAssignment_3_2_2 ) ) ;
    public final void rule__CoordinationSlavePortDocu__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1326:1: ( ( ( rule__CoordinationSlavePortDocu__StateAssignment_3_2_2 ) ) )
            // InternalComponentDocumentation.g:1327:1: ( ( rule__CoordinationSlavePortDocu__StateAssignment_3_2_2 ) )
            {
            // InternalComponentDocumentation.g:1327:1: ( ( rule__CoordinationSlavePortDocu__StateAssignment_3_2_2 ) )
            // InternalComponentDocumentation.g:1328:2: ( rule__CoordinationSlavePortDocu__StateAssignment_3_2_2 )
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getStateAssignment_3_2_2()); 
            // InternalComponentDocumentation.g:1329:2: ( rule__CoordinationSlavePortDocu__StateAssignment_3_2_2 )
            // InternalComponentDocumentation.g:1329:3: rule__CoordinationSlavePortDocu__StateAssignment_3_2_2
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__StateAssignment_3_2_2();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationSlavePortDocuAccess().getStateAssignment_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_2__2__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_3__0"
    // InternalComponentDocumentation.g:1338:1: rule__CoordinationSlavePortDocu__Group_3_3__0 : rule__CoordinationSlavePortDocu__Group_3_3__0__Impl rule__CoordinationSlavePortDocu__Group_3_3__1 ;
    public final void rule__CoordinationSlavePortDocu__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1342:1: ( rule__CoordinationSlavePortDocu__Group_3_3__0__Impl rule__CoordinationSlavePortDocu__Group_3_3__1 )
            // InternalComponentDocumentation.g:1343:2: rule__CoordinationSlavePortDocu__Group_3_3__0__Impl rule__CoordinationSlavePortDocu__Group_3_3__1
            {
            pushFollow(FOLLOW_8);
            rule__CoordinationSlavePortDocu__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_3__0"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_3__0__Impl"
    // InternalComponentDocumentation.g:1350:1: rule__CoordinationSlavePortDocu__Group_3_3__0__Impl : ( 'ParameterPort' ) ;
    public final void rule__CoordinationSlavePortDocu__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1354:1: ( ( 'ParameterPort' ) )
            // InternalComponentDocumentation.g:1355:1: ( 'ParameterPort' )
            {
            // InternalComponentDocumentation.g:1355:1: ( 'ParameterPort' )
            // InternalComponentDocumentation.g:1356:2: 'ParameterPort'
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterPortKeyword_3_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterPortKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_3__0__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_3__1"
    // InternalComponentDocumentation.g:1365:1: rule__CoordinationSlavePortDocu__Group_3_3__1 : rule__CoordinationSlavePortDocu__Group_3_3__1__Impl rule__CoordinationSlavePortDocu__Group_3_3__2 ;
    public final void rule__CoordinationSlavePortDocu__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1369:1: ( rule__CoordinationSlavePortDocu__Group_3_3__1__Impl rule__CoordinationSlavePortDocu__Group_3_3__2 )
            // InternalComponentDocumentation.g:1370:2: rule__CoordinationSlavePortDocu__Group_3_3__1__Impl rule__CoordinationSlavePortDocu__Group_3_3__2
            {
            pushFollow(FOLLOW_9);
            rule__CoordinationSlavePortDocu__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group_3_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_3__1"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_3__1__Impl"
    // InternalComponentDocumentation.g:1377:1: rule__CoordinationSlavePortDocu__Group_3_3__1__Impl : ( ':' ) ;
    public final void rule__CoordinationSlavePortDocu__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1381:1: ( ( ':' ) )
            // InternalComponentDocumentation.g:1382:1: ( ':' )
            {
            // InternalComponentDocumentation.g:1382:1: ( ':' )
            // InternalComponentDocumentation.g:1383:2: ':'
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_3_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortDocuAccess().getColonKeyword_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_3__1__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_3__2"
    // InternalComponentDocumentation.g:1392:1: rule__CoordinationSlavePortDocu__Group_3_3__2 : rule__CoordinationSlavePortDocu__Group_3_3__2__Impl ;
    public final void rule__CoordinationSlavePortDocu__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1396:1: ( rule__CoordinationSlavePortDocu__Group_3_3__2__Impl )
            // InternalComponentDocumentation.g:1397:2: rule__CoordinationSlavePortDocu__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__Group_3_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_3__2"


    // $ANTLR start "rule__CoordinationSlavePortDocu__Group_3_3__2__Impl"
    // InternalComponentDocumentation.g:1403:1: rule__CoordinationSlavePortDocu__Group_3_3__2__Impl : ( ( rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2 ) ) ;
    public final void rule__CoordinationSlavePortDocu__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1407:1: ( ( ( rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2 ) ) )
            // InternalComponentDocumentation.g:1408:1: ( ( rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2 ) )
            {
            // InternalComponentDocumentation.g:1408:1: ( ( rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2 ) )
            // InternalComponentDocumentation.g:1409:2: ( rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2 )
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterAssignment_3_3_2()); 
            // InternalComponentDocumentation.g:1410:2: ( rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2 )
            // InternalComponentDocumentation.g:1410:3: rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterAssignment_3_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__Group_3_3__2__Impl"


    // $ANTLR start "rule__ComponentServiceDocu__Group__0"
    // InternalComponentDocumentation.g:1419:1: rule__ComponentServiceDocu__Group__0 : rule__ComponentServiceDocu__Group__0__Impl rule__ComponentServiceDocu__Group__1 ;
    public final void rule__ComponentServiceDocu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1423:1: ( rule__ComponentServiceDocu__Group__0__Impl rule__ComponentServiceDocu__Group__1 )
            // InternalComponentDocumentation.g:1424:2: rule__ComponentServiceDocu__Group__0__Impl rule__ComponentServiceDocu__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentServiceDocu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentServiceDocu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group__0"


    // $ANTLR start "rule__ComponentServiceDocu__Group__0__Impl"
    // InternalComponentDocumentation.g:1431:1: rule__ComponentServiceDocu__Group__0__Impl : ( 'ComponentPort' ) ;
    public final void rule__ComponentServiceDocu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1435:1: ( ( 'ComponentPort' ) )
            // InternalComponentDocumentation.g:1436:1: ( 'ComponentPort' )
            {
            // InternalComponentDocumentation.g:1436:1: ( 'ComponentPort' )
            // InternalComponentDocumentation.g:1437:2: 'ComponentPort'
            {
             before(grammarAccess.getComponentServiceDocuAccess().getComponentPortKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentServiceDocuAccess().getComponentPortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group__0__Impl"


    // $ANTLR start "rule__ComponentServiceDocu__Group__1"
    // InternalComponentDocumentation.g:1446:1: rule__ComponentServiceDocu__Group__1 : rule__ComponentServiceDocu__Group__1__Impl rule__ComponentServiceDocu__Group__2 ;
    public final void rule__ComponentServiceDocu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1450:1: ( rule__ComponentServiceDocu__Group__1__Impl rule__ComponentServiceDocu__Group__2 )
            // InternalComponentDocumentation.g:1451:2: rule__ComponentServiceDocu__Group__1__Impl rule__ComponentServiceDocu__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComponentServiceDocu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentServiceDocu__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group__1"


    // $ANTLR start "rule__ComponentServiceDocu__Group__1__Impl"
    // InternalComponentDocumentation.g:1458:1: rule__ComponentServiceDocu__Group__1__Impl : ( ( rule__ComponentServiceDocu__PortAssignment_1 ) ) ;
    public final void rule__ComponentServiceDocu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1462:1: ( ( ( rule__ComponentServiceDocu__PortAssignment_1 ) ) )
            // InternalComponentDocumentation.g:1463:1: ( ( rule__ComponentServiceDocu__PortAssignment_1 ) )
            {
            // InternalComponentDocumentation.g:1463:1: ( ( rule__ComponentServiceDocu__PortAssignment_1 ) )
            // InternalComponentDocumentation.g:1464:2: ( rule__ComponentServiceDocu__PortAssignment_1 )
            {
             before(grammarAccess.getComponentServiceDocuAccess().getPortAssignment_1()); 
            // InternalComponentDocumentation.g:1465:2: ( rule__ComponentServiceDocu__PortAssignment_1 )
            // InternalComponentDocumentation.g:1465:3: rule__ComponentServiceDocu__PortAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentServiceDocu__PortAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentServiceDocuAccess().getPortAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group__1__Impl"


    // $ANTLR start "rule__ComponentServiceDocu__Group__2"
    // InternalComponentDocumentation.g:1473:1: rule__ComponentServiceDocu__Group__2 : rule__ComponentServiceDocu__Group__2__Impl rule__ComponentServiceDocu__Group__3 ;
    public final void rule__ComponentServiceDocu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1477:1: ( rule__ComponentServiceDocu__Group__2__Impl rule__ComponentServiceDocu__Group__3 )
            // InternalComponentDocumentation.g:1478:2: rule__ComponentServiceDocu__Group__2__Impl rule__ComponentServiceDocu__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ComponentServiceDocu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentServiceDocu__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group__2"


    // $ANTLR start "rule__ComponentServiceDocu__Group__2__Impl"
    // InternalComponentDocumentation.g:1485:1: rule__ComponentServiceDocu__Group__2__Impl : ( '{' ) ;
    public final void rule__ComponentServiceDocu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1489:1: ( ( '{' ) )
            // InternalComponentDocumentation.g:1490:1: ( '{' )
            {
            // InternalComponentDocumentation.g:1490:1: ( '{' )
            // InternalComponentDocumentation.g:1491:2: '{'
            {
             before(grammarAccess.getComponentServiceDocuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentServiceDocuAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group__2__Impl"


    // $ANTLR start "rule__ComponentServiceDocu__Group__3"
    // InternalComponentDocumentation.g:1500:1: rule__ComponentServiceDocu__Group__3 : rule__ComponentServiceDocu__Group__3__Impl rule__ComponentServiceDocu__Group__4 ;
    public final void rule__ComponentServiceDocu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1504:1: ( rule__ComponentServiceDocu__Group__3__Impl rule__ComponentServiceDocu__Group__4 )
            // InternalComponentDocumentation.g:1505:2: rule__ComponentServiceDocu__Group__3__Impl rule__ComponentServiceDocu__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ComponentServiceDocu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentServiceDocu__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group__3"


    // $ANTLR start "rule__ComponentServiceDocu__Group__3__Impl"
    // InternalComponentDocumentation.g:1512:1: rule__ComponentServiceDocu__Group__3__Impl : ( ( rule__ComponentServiceDocu__Group_3__0 )? ) ;
    public final void rule__ComponentServiceDocu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1516:1: ( ( ( rule__ComponentServiceDocu__Group_3__0 )? ) )
            // InternalComponentDocumentation.g:1517:1: ( ( rule__ComponentServiceDocu__Group_3__0 )? )
            {
            // InternalComponentDocumentation.g:1517:1: ( ( rule__ComponentServiceDocu__Group_3__0 )? )
            // InternalComponentDocumentation.g:1518:2: ( rule__ComponentServiceDocu__Group_3__0 )?
            {
             before(grammarAccess.getComponentServiceDocuAccess().getGroup_3()); 
            // InternalComponentDocumentation.g:1519:2: ( rule__ComponentServiceDocu__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentDocumentation.g:1519:3: rule__ComponentServiceDocu__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentServiceDocu__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentServiceDocuAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group__3__Impl"


    // $ANTLR start "rule__ComponentServiceDocu__Group__4"
    // InternalComponentDocumentation.g:1527:1: rule__ComponentServiceDocu__Group__4 : rule__ComponentServiceDocu__Group__4__Impl rule__ComponentServiceDocu__Group__5 ;
    public final void rule__ComponentServiceDocu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1531:1: ( rule__ComponentServiceDocu__Group__4__Impl rule__ComponentServiceDocu__Group__5 )
            // InternalComponentDocumentation.g:1532:2: rule__ComponentServiceDocu__Group__4__Impl rule__ComponentServiceDocu__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ComponentServiceDocu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentServiceDocu__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group__4"


    // $ANTLR start "rule__ComponentServiceDocu__Group__4__Impl"
    // InternalComponentDocumentation.g:1539:1: rule__ComponentServiceDocu__Group__4__Impl : ( ( rule__ComponentServiceDocu__StatesAssignment_4 )* ) ;
    public final void rule__ComponentServiceDocu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1543:1: ( ( ( rule__ComponentServiceDocu__StatesAssignment_4 )* ) )
            // InternalComponentDocumentation.g:1544:1: ( ( rule__ComponentServiceDocu__StatesAssignment_4 )* )
            {
            // InternalComponentDocumentation.g:1544:1: ( ( rule__ComponentServiceDocu__StatesAssignment_4 )* )
            // InternalComponentDocumentation.g:1545:2: ( rule__ComponentServiceDocu__StatesAssignment_4 )*
            {
             before(grammarAccess.getComponentServiceDocuAccess().getStatesAssignment_4()); 
            // InternalComponentDocumentation.g:1546:2: ( rule__ComponentServiceDocu__StatesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=26 && LA6_0<=27)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalComponentDocumentation.g:1546:3: rule__ComponentServiceDocu__StatesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ComponentServiceDocu__StatesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getComponentServiceDocuAccess().getStatesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group__4__Impl"


    // $ANTLR start "rule__ComponentServiceDocu__Group__5"
    // InternalComponentDocumentation.g:1554:1: rule__ComponentServiceDocu__Group__5 : rule__ComponentServiceDocu__Group__5__Impl ;
    public final void rule__ComponentServiceDocu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1558:1: ( rule__ComponentServiceDocu__Group__5__Impl )
            // InternalComponentDocumentation.g:1559:2: rule__ComponentServiceDocu__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentServiceDocu__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group__5"


    // $ANTLR start "rule__ComponentServiceDocu__Group__5__Impl"
    // InternalComponentDocumentation.g:1565:1: rule__ComponentServiceDocu__Group__5__Impl : ( '}' ) ;
    public final void rule__ComponentServiceDocu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1569:1: ( ( '}' ) )
            // InternalComponentDocumentation.g:1570:1: ( '}' )
            {
            // InternalComponentDocumentation.g:1570:1: ( '}' )
            // InternalComponentDocumentation.g:1571:2: '}'
            {
             before(grammarAccess.getComponentServiceDocuAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentServiceDocuAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group__5__Impl"


    // $ANTLR start "rule__ComponentServiceDocu__Group_3__0"
    // InternalComponentDocumentation.g:1581:1: rule__ComponentServiceDocu__Group_3__0 : rule__ComponentServiceDocu__Group_3__0__Impl rule__ComponentServiceDocu__Group_3__1 ;
    public final void rule__ComponentServiceDocu__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1585:1: ( rule__ComponentServiceDocu__Group_3__0__Impl rule__ComponentServiceDocu__Group_3__1 )
            // InternalComponentDocumentation.g:1586:2: rule__ComponentServiceDocu__Group_3__0__Impl rule__ComponentServiceDocu__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__ComponentServiceDocu__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentServiceDocu__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group_3__0"


    // $ANTLR start "rule__ComponentServiceDocu__Group_3__0__Impl"
    // InternalComponentDocumentation.g:1593:1: rule__ComponentServiceDocu__Group_3__0__Impl : ( 'Description' ) ;
    public final void rule__ComponentServiceDocu__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1597:1: ( ( 'Description' ) )
            // InternalComponentDocumentation.g:1598:1: ( 'Description' )
            {
            // InternalComponentDocumentation.g:1598:1: ( 'Description' )
            // InternalComponentDocumentation.g:1599:2: 'Description'
            {
             before(grammarAccess.getComponentServiceDocuAccess().getDescriptionKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentServiceDocuAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group_3__0__Impl"


    // $ANTLR start "rule__ComponentServiceDocu__Group_3__1"
    // InternalComponentDocumentation.g:1608:1: rule__ComponentServiceDocu__Group_3__1 : rule__ComponentServiceDocu__Group_3__1__Impl rule__ComponentServiceDocu__Group_3__2 ;
    public final void rule__ComponentServiceDocu__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1612:1: ( rule__ComponentServiceDocu__Group_3__1__Impl rule__ComponentServiceDocu__Group_3__2 )
            // InternalComponentDocumentation.g:1613:2: rule__ComponentServiceDocu__Group_3__1__Impl rule__ComponentServiceDocu__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__ComponentServiceDocu__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentServiceDocu__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group_3__1"


    // $ANTLR start "rule__ComponentServiceDocu__Group_3__1__Impl"
    // InternalComponentDocumentation.g:1620:1: rule__ComponentServiceDocu__Group_3__1__Impl : ( ':' ) ;
    public final void rule__ComponentServiceDocu__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1624:1: ( ( ':' ) )
            // InternalComponentDocumentation.g:1625:1: ( ':' )
            {
            // InternalComponentDocumentation.g:1625:1: ( ':' )
            // InternalComponentDocumentation.g:1626:2: ':'
            {
             before(grammarAccess.getComponentServiceDocuAccess().getColonKeyword_3_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentServiceDocuAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group_3__1__Impl"


    // $ANTLR start "rule__ComponentServiceDocu__Group_3__2"
    // InternalComponentDocumentation.g:1635:1: rule__ComponentServiceDocu__Group_3__2 : rule__ComponentServiceDocu__Group_3__2__Impl ;
    public final void rule__ComponentServiceDocu__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1639:1: ( rule__ComponentServiceDocu__Group_3__2__Impl )
            // InternalComponentDocumentation.g:1640:2: rule__ComponentServiceDocu__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentServiceDocu__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group_3__2"


    // $ANTLR start "rule__ComponentServiceDocu__Group_3__2__Impl"
    // InternalComponentDocumentation.g:1646:1: rule__ComponentServiceDocu__Group_3__2__Impl : ( ( rule__ComponentServiceDocu__DescriptionAssignment_3_2 ) ) ;
    public final void rule__ComponentServiceDocu__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1650:1: ( ( ( rule__ComponentServiceDocu__DescriptionAssignment_3_2 ) ) )
            // InternalComponentDocumentation.g:1651:1: ( ( rule__ComponentServiceDocu__DescriptionAssignment_3_2 ) )
            {
            // InternalComponentDocumentation.g:1651:1: ( ( rule__ComponentServiceDocu__DescriptionAssignment_3_2 ) )
            // InternalComponentDocumentation.g:1652:2: ( rule__ComponentServiceDocu__DescriptionAssignment_3_2 )
            {
             before(grammarAccess.getComponentServiceDocuAccess().getDescriptionAssignment_3_2()); 
            // InternalComponentDocumentation.g:1653:2: ( rule__ComponentServiceDocu__DescriptionAssignment_3_2 )
            // InternalComponentDocumentation.g:1653:3: rule__ComponentServiceDocu__DescriptionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentServiceDocu__DescriptionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentServiceDocuAccess().getDescriptionAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__Group_3__2__Impl"


    // $ANTLR start "rule__ComponentModeDocu__Group__0"
    // InternalComponentDocumentation.g:1662:1: rule__ComponentModeDocu__Group__0 : rule__ComponentModeDocu__Group__0__Impl rule__ComponentModeDocu__Group__1 ;
    public final void rule__ComponentModeDocu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1666:1: ( rule__ComponentModeDocu__Group__0__Impl rule__ComponentModeDocu__Group__1 )
            // InternalComponentDocumentation.g:1667:2: rule__ComponentModeDocu__Group__0__Impl rule__ComponentModeDocu__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentModeDocu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeDocu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModeDocu__Group__0"


    // $ANTLR start "rule__ComponentModeDocu__Group__0__Impl"
    // InternalComponentDocumentation.g:1674:1: rule__ComponentModeDocu__Group__0__Impl : ( 'ComponentMode' ) ;
    public final void rule__ComponentModeDocu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1678:1: ( ( 'ComponentMode' ) )
            // InternalComponentDocumentation.g:1679:1: ( 'ComponentMode' )
            {
            // InternalComponentDocumentation.g:1679:1: ( 'ComponentMode' )
            // InternalComponentDocumentation.g:1680:2: 'ComponentMode'
            {
             before(grammarAccess.getComponentModeDocuAccess().getComponentModeKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentModeDocuAccess().getComponentModeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModeDocu__Group__0__Impl"


    // $ANTLR start "rule__ComponentModeDocu__Group__1"
    // InternalComponentDocumentation.g:1689:1: rule__ComponentModeDocu__Group__1 : rule__ComponentModeDocu__Group__1__Impl rule__ComponentModeDocu__Group__2 ;
    public final void rule__ComponentModeDocu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1693:1: ( rule__ComponentModeDocu__Group__1__Impl rule__ComponentModeDocu__Group__2 )
            // InternalComponentDocumentation.g:1694:2: rule__ComponentModeDocu__Group__1__Impl rule__ComponentModeDocu__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ComponentModeDocu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeDocu__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModeDocu__Group__1"


    // $ANTLR start "rule__ComponentModeDocu__Group__1__Impl"
    // InternalComponentDocumentation.g:1701:1: rule__ComponentModeDocu__Group__1__Impl : ( ( rule__ComponentModeDocu__ModeAssignment_1 ) ) ;
    public final void rule__ComponentModeDocu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1705:1: ( ( ( rule__ComponentModeDocu__ModeAssignment_1 ) ) )
            // InternalComponentDocumentation.g:1706:1: ( ( rule__ComponentModeDocu__ModeAssignment_1 ) )
            {
            // InternalComponentDocumentation.g:1706:1: ( ( rule__ComponentModeDocu__ModeAssignment_1 ) )
            // InternalComponentDocumentation.g:1707:2: ( rule__ComponentModeDocu__ModeAssignment_1 )
            {
             before(grammarAccess.getComponentModeDocuAccess().getModeAssignment_1()); 
            // InternalComponentDocumentation.g:1708:2: ( rule__ComponentModeDocu__ModeAssignment_1 )
            // InternalComponentDocumentation.g:1708:3: rule__ComponentModeDocu__ModeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeDocu__ModeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentModeDocuAccess().getModeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModeDocu__Group__1__Impl"


    // $ANTLR start "rule__ComponentModeDocu__Group__2"
    // InternalComponentDocumentation.g:1716:1: rule__ComponentModeDocu__Group__2 : rule__ComponentModeDocu__Group__2__Impl rule__ComponentModeDocu__Group__3 ;
    public final void rule__ComponentModeDocu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1720:1: ( rule__ComponentModeDocu__Group__2__Impl rule__ComponentModeDocu__Group__3 )
            // InternalComponentDocumentation.g:1721:2: rule__ComponentModeDocu__Group__2__Impl rule__ComponentModeDocu__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ComponentModeDocu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeDocu__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModeDocu__Group__2"


    // $ANTLR start "rule__ComponentModeDocu__Group__2__Impl"
    // InternalComponentDocumentation.g:1728:1: rule__ComponentModeDocu__Group__2__Impl : ( ':' ) ;
    public final void rule__ComponentModeDocu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1732:1: ( ( ':' ) )
            // InternalComponentDocumentation.g:1733:1: ( ':' )
            {
            // InternalComponentDocumentation.g:1733:1: ( ':' )
            // InternalComponentDocumentation.g:1734:2: ':'
            {
             before(grammarAccess.getComponentModeDocuAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentModeDocuAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModeDocu__Group__2__Impl"


    // $ANTLR start "rule__ComponentModeDocu__Group__3"
    // InternalComponentDocumentation.g:1743:1: rule__ComponentModeDocu__Group__3 : rule__ComponentModeDocu__Group__3__Impl ;
    public final void rule__ComponentModeDocu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1747:1: ( rule__ComponentModeDocu__Group__3__Impl )
            // InternalComponentDocumentation.g:1748:2: rule__ComponentModeDocu__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeDocu__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModeDocu__Group__3"


    // $ANTLR start "rule__ComponentModeDocu__Group__3__Impl"
    // InternalComponentDocumentation.g:1754:1: rule__ComponentModeDocu__Group__3__Impl : ( ( rule__ComponentModeDocu__DescriptionAssignment_3 ) ) ;
    public final void rule__ComponentModeDocu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1758:1: ( ( ( rule__ComponentModeDocu__DescriptionAssignment_3 ) ) )
            // InternalComponentDocumentation.g:1759:1: ( ( rule__ComponentModeDocu__DescriptionAssignment_3 ) )
            {
            // InternalComponentDocumentation.g:1759:1: ( ( rule__ComponentModeDocu__DescriptionAssignment_3 ) )
            // InternalComponentDocumentation.g:1760:2: ( rule__ComponentModeDocu__DescriptionAssignment_3 )
            {
             before(grammarAccess.getComponentModeDocuAccess().getDescriptionAssignment_3()); 
            // InternalComponentDocumentation.g:1761:2: ( rule__ComponentModeDocu__DescriptionAssignment_3 )
            // InternalComponentDocumentation.g:1761:3: rule__ComponentModeDocu__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeDocu__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentModeDocuAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModeDocu__Group__3__Impl"


    // $ANTLR start "rule__NeutralModeDocu__Group__0"
    // InternalComponentDocumentation.g:1770:1: rule__NeutralModeDocu__Group__0 : rule__NeutralModeDocu__Group__0__Impl rule__NeutralModeDocu__Group__1 ;
    public final void rule__NeutralModeDocu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1774:1: ( rule__NeutralModeDocu__Group__0__Impl rule__NeutralModeDocu__Group__1 )
            // InternalComponentDocumentation.g:1775:2: rule__NeutralModeDocu__Group__0__Impl rule__NeutralModeDocu__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__NeutralModeDocu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NeutralModeDocu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeutralModeDocu__Group__0"


    // $ANTLR start "rule__NeutralModeDocu__Group__0__Impl"
    // InternalComponentDocumentation.g:1782:1: rule__NeutralModeDocu__Group__0__Impl : ( () ) ;
    public final void rule__NeutralModeDocu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1786:1: ( ( () ) )
            // InternalComponentDocumentation.g:1787:1: ( () )
            {
            // InternalComponentDocumentation.g:1787:1: ( () )
            // InternalComponentDocumentation.g:1788:2: ()
            {
             before(grammarAccess.getNeutralModeDocuAccess().getNeutralModeDocuAction_0()); 
            // InternalComponentDocumentation.g:1789:2: ()
            // InternalComponentDocumentation.g:1789:3: 
            {
            }

             after(grammarAccess.getNeutralModeDocuAccess().getNeutralModeDocuAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeutralModeDocu__Group__0__Impl"


    // $ANTLR start "rule__NeutralModeDocu__Group__1"
    // InternalComponentDocumentation.g:1797:1: rule__NeutralModeDocu__Group__1 : rule__NeutralModeDocu__Group__1__Impl rule__NeutralModeDocu__Group__2 ;
    public final void rule__NeutralModeDocu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1801:1: ( rule__NeutralModeDocu__Group__1__Impl rule__NeutralModeDocu__Group__2 )
            // InternalComponentDocumentation.g:1802:2: rule__NeutralModeDocu__Group__1__Impl rule__NeutralModeDocu__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__NeutralModeDocu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NeutralModeDocu__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeutralModeDocu__Group__1"


    // $ANTLR start "rule__NeutralModeDocu__Group__1__Impl"
    // InternalComponentDocumentation.g:1809:1: rule__NeutralModeDocu__Group__1__Impl : ( 'NeutralMode' ) ;
    public final void rule__NeutralModeDocu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1813:1: ( ( 'NeutralMode' ) )
            // InternalComponentDocumentation.g:1814:1: ( 'NeutralMode' )
            {
            // InternalComponentDocumentation.g:1814:1: ( 'NeutralMode' )
            // InternalComponentDocumentation.g:1815:2: 'NeutralMode'
            {
             before(grammarAccess.getNeutralModeDocuAccess().getNeutralModeKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNeutralModeDocuAccess().getNeutralModeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeutralModeDocu__Group__1__Impl"


    // $ANTLR start "rule__NeutralModeDocu__Group__2"
    // InternalComponentDocumentation.g:1824:1: rule__NeutralModeDocu__Group__2 : rule__NeutralModeDocu__Group__2__Impl rule__NeutralModeDocu__Group__3 ;
    public final void rule__NeutralModeDocu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1828:1: ( rule__NeutralModeDocu__Group__2__Impl rule__NeutralModeDocu__Group__3 )
            // InternalComponentDocumentation.g:1829:2: rule__NeutralModeDocu__Group__2__Impl rule__NeutralModeDocu__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__NeutralModeDocu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NeutralModeDocu__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeutralModeDocu__Group__2"


    // $ANTLR start "rule__NeutralModeDocu__Group__2__Impl"
    // InternalComponentDocumentation.g:1836:1: rule__NeutralModeDocu__Group__2__Impl : ( ':' ) ;
    public final void rule__NeutralModeDocu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1840:1: ( ( ':' ) )
            // InternalComponentDocumentation.g:1841:1: ( ':' )
            {
            // InternalComponentDocumentation.g:1841:1: ( ':' )
            // InternalComponentDocumentation.g:1842:2: ':'
            {
             before(grammarAccess.getNeutralModeDocuAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNeutralModeDocuAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeutralModeDocu__Group__2__Impl"


    // $ANTLR start "rule__NeutralModeDocu__Group__3"
    // InternalComponentDocumentation.g:1851:1: rule__NeutralModeDocu__Group__3 : rule__NeutralModeDocu__Group__3__Impl ;
    public final void rule__NeutralModeDocu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1855:1: ( rule__NeutralModeDocu__Group__3__Impl )
            // InternalComponentDocumentation.g:1856:2: rule__NeutralModeDocu__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NeutralModeDocu__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeutralModeDocu__Group__3"


    // $ANTLR start "rule__NeutralModeDocu__Group__3__Impl"
    // InternalComponentDocumentation.g:1862:1: rule__NeutralModeDocu__Group__3__Impl : ( ( rule__NeutralModeDocu__DescriptionAssignment_3 ) ) ;
    public final void rule__NeutralModeDocu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1866:1: ( ( ( rule__NeutralModeDocu__DescriptionAssignment_3 ) ) )
            // InternalComponentDocumentation.g:1867:1: ( ( rule__NeutralModeDocu__DescriptionAssignment_3 ) )
            {
            // InternalComponentDocumentation.g:1867:1: ( ( rule__NeutralModeDocu__DescriptionAssignment_3 ) )
            // InternalComponentDocumentation.g:1868:2: ( rule__NeutralModeDocu__DescriptionAssignment_3 )
            {
             before(grammarAccess.getNeutralModeDocuAccess().getDescriptionAssignment_3()); 
            // InternalComponentDocumentation.g:1869:2: ( rule__NeutralModeDocu__DescriptionAssignment_3 )
            // InternalComponentDocumentation.g:1869:3: rule__NeutralModeDocu__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NeutralModeDocu__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNeutralModeDocuAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeutralModeDocu__Group__3__Impl"


    // $ANTLR start "rule__ComponentDocumentation__UnorderedGroup_3"
    // InternalComponentDocumentation.g:1878:1: rule__ComponentDocumentation__UnorderedGroup_3 : ( rule__ComponentDocumentation__UnorderedGroup_3__0 )? ;
    public final void rule__ComponentDocumentation__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
        	
        try {
            // InternalComponentDocumentation.g:1883:1: ( ( rule__ComponentDocumentation__UnorderedGroup_3__0 )? )
            // InternalComponentDocumentation.g:1884:2: ( rule__ComponentDocumentation__UnorderedGroup_3__0 )?
            {
            // InternalComponentDocumentation.g:1884:2: ( rule__ComponentDocumentation__UnorderedGroup_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( LA7_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0) ) {
                alt7=1;
            }
            else if ( LA7_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1) ) {
                alt7=1;
            }
            else if ( LA7_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2) ) {
                alt7=1;
            }
            else if ( LA7_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentDocumentation.g:1884:2: rule__ComponentDocumentation__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDocumentation__UnorderedGroup_3__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__UnorderedGroup_3"


    // $ANTLR start "rule__ComponentDocumentation__UnorderedGroup_3__Impl"
    // InternalComponentDocumentation.g:1892:1: rule__ComponentDocumentation__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_3__0 ) ) ) ) ) ;
    public final void rule__ComponentDocumentation__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDocumentation.g:1897:1: ( ( ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_3__0 ) ) ) ) ) )
            // InternalComponentDocumentation.g:1898:3: ( ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_3__0 ) ) ) ) )
            {
            // InternalComponentDocumentation.g:1898:3: ( ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_3__0 ) ) ) ) )
            int alt8=4;
            int LA8_0 = input.LA(1);

            if ( LA8_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0) ) {
                alt8=1;
            }
            else if ( LA8_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1) ) {
                alt8=2;
            }
            else if ( LA8_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2) ) {
                alt8=3;
            }
            else if ( LA8_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3) ) {
                alt8=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentDocumentation.g:1899:3: ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_0__0 ) ) ) )
                    {
                    // InternalComponentDocumentation.g:1899:3: ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_0__0 ) ) ) )
                    // InternalComponentDocumentation.g:1900:4: {...}? => ( ( ( rule__ComponentDocumentation__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDocumentation__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalComponentDocumentation.g:1900:118: ( ( ( rule__ComponentDocumentation__Group_3_0__0 ) ) )
                    // InternalComponentDocumentation.g:1901:5: ( ( rule__ComponentDocumentation__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDocumentation.g:1907:5: ( ( rule__ComponentDocumentation__Group_3_0__0 ) )
                    // InternalComponentDocumentation.g:1908:6: ( rule__ComponentDocumentation__Group_3_0__0 )
                    {
                     before(grammarAccess.getComponentDocumentationAccess().getGroup_3_0()); 
                    // InternalComponentDocumentation.g:1909:6: ( rule__ComponentDocumentation__Group_3_0__0 )
                    // InternalComponentDocumentation.g:1909:7: rule__ComponentDocumentation__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDocumentation__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDocumentationAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDocumentation.g:1914:3: ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_1__0 ) ) ) )
                    {
                    // InternalComponentDocumentation.g:1914:3: ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_1__0 ) ) ) )
                    // InternalComponentDocumentation.g:1915:4: {...}? => ( ( ( rule__ComponentDocumentation__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDocumentation__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalComponentDocumentation.g:1915:118: ( ( ( rule__ComponentDocumentation__Group_3_1__0 ) ) )
                    // InternalComponentDocumentation.g:1916:5: ( ( rule__ComponentDocumentation__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDocumentation.g:1922:5: ( ( rule__ComponentDocumentation__Group_3_1__0 ) )
                    // InternalComponentDocumentation.g:1923:6: ( rule__ComponentDocumentation__Group_3_1__0 )
                    {
                     before(grammarAccess.getComponentDocumentationAccess().getGroup_3_1()); 
                    // InternalComponentDocumentation.g:1924:6: ( rule__ComponentDocumentation__Group_3_1__0 )
                    // InternalComponentDocumentation.g:1924:7: rule__ComponentDocumentation__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDocumentation__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDocumentationAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDocumentation.g:1929:3: ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_2__0 ) ) ) )
                    {
                    // InternalComponentDocumentation.g:1929:3: ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_2__0 ) ) ) )
                    // InternalComponentDocumentation.g:1930:4: {...}? => ( ( ( rule__ComponentDocumentation__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDocumentation__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalComponentDocumentation.g:1930:118: ( ( ( rule__ComponentDocumentation__Group_3_2__0 ) ) )
                    // InternalComponentDocumentation.g:1931:5: ( ( rule__ComponentDocumentation__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalComponentDocumentation.g:1937:5: ( ( rule__ComponentDocumentation__Group_3_2__0 ) )
                    // InternalComponentDocumentation.g:1938:6: ( rule__ComponentDocumentation__Group_3_2__0 )
                    {
                     before(grammarAccess.getComponentDocumentationAccess().getGroup_3_2()); 
                    // InternalComponentDocumentation.g:1939:6: ( rule__ComponentDocumentation__Group_3_2__0 )
                    // InternalComponentDocumentation.g:1939:7: rule__ComponentDocumentation__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDocumentation__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDocumentationAccess().getGroup_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalComponentDocumentation.g:1944:3: ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_3__0 ) ) ) )
                    {
                    // InternalComponentDocumentation.g:1944:3: ({...}? => ( ( ( rule__ComponentDocumentation__Group_3_3__0 ) ) ) )
                    // InternalComponentDocumentation.g:1945:4: {...}? => ( ( ( rule__ComponentDocumentation__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__ComponentDocumentation__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalComponentDocumentation.g:1945:118: ( ( ( rule__ComponentDocumentation__Group_3_3__0 ) ) )
                    // InternalComponentDocumentation.g:1946:5: ( ( rule__ComponentDocumentation__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalComponentDocumentation.g:1952:5: ( ( rule__ComponentDocumentation__Group_3_3__0 ) )
                    // InternalComponentDocumentation.g:1953:6: ( rule__ComponentDocumentation__Group_3_3__0 )
                    {
                     before(grammarAccess.getComponentDocumentationAccess().getGroup_3_3()); 
                    // InternalComponentDocumentation.g:1954:6: ( rule__ComponentDocumentation__Group_3_3__0 )
                    // InternalComponentDocumentation.g:1954:7: rule__ComponentDocumentation__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDocumentation__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentDocumentationAccess().getGroup_3_3()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__ComponentDocumentation__UnorderedGroup_3__0"
    // InternalComponentDocumentation.g:1967:1: rule__ComponentDocumentation__UnorderedGroup_3__0 : rule__ComponentDocumentation__UnorderedGroup_3__Impl ( rule__ComponentDocumentation__UnorderedGroup_3__1 )? ;
    public final void rule__ComponentDocumentation__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1971:1: ( rule__ComponentDocumentation__UnorderedGroup_3__Impl ( rule__ComponentDocumentation__UnorderedGroup_3__1 )? )
            // InternalComponentDocumentation.g:1972:2: rule__ComponentDocumentation__UnorderedGroup_3__Impl ( rule__ComponentDocumentation__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_16);
            rule__ComponentDocumentation__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDocumentation.g:1973:2: ( rule__ComponentDocumentation__UnorderedGroup_3__1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( LA9_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0) ) {
                alt9=1;
            }
            else if ( LA9_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1) ) {
                alt9=1;
            }
            else if ( LA9_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2) ) {
                alt9=1;
            }
            else if ( LA9_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentDocumentation.g:1973:2: rule__ComponentDocumentation__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDocumentation__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__ComponentDocumentation__UnorderedGroup_3__0"


    // $ANTLR start "rule__ComponentDocumentation__UnorderedGroup_3__1"
    // InternalComponentDocumentation.g:1979:1: rule__ComponentDocumentation__UnorderedGroup_3__1 : rule__ComponentDocumentation__UnorderedGroup_3__Impl ( rule__ComponentDocumentation__UnorderedGroup_3__2 )? ;
    public final void rule__ComponentDocumentation__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1983:1: ( rule__ComponentDocumentation__UnorderedGroup_3__Impl ( rule__ComponentDocumentation__UnorderedGroup_3__2 )? )
            // InternalComponentDocumentation.g:1984:2: rule__ComponentDocumentation__UnorderedGroup_3__Impl ( rule__ComponentDocumentation__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_16);
            rule__ComponentDocumentation__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDocumentation.g:1985:2: ( rule__ComponentDocumentation__UnorderedGroup_3__2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( LA10_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1) ) {
                alt10=1;
            }
            else if ( LA10_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2) ) {
                alt10=1;
            }
            else if ( LA10_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentDocumentation.g:1985:2: rule__ComponentDocumentation__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDocumentation__UnorderedGroup_3__2();

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
    // $ANTLR end "rule__ComponentDocumentation__UnorderedGroup_3__1"


    // $ANTLR start "rule__ComponentDocumentation__UnorderedGroup_3__2"
    // InternalComponentDocumentation.g:1991:1: rule__ComponentDocumentation__UnorderedGroup_3__2 : rule__ComponentDocumentation__UnorderedGroup_3__Impl ( rule__ComponentDocumentation__UnorderedGroup_3__3 )? ;
    public final void rule__ComponentDocumentation__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:1995:1: ( rule__ComponentDocumentation__UnorderedGroup_3__Impl ( rule__ComponentDocumentation__UnorderedGroup_3__3 )? )
            // InternalComponentDocumentation.g:1996:2: rule__ComponentDocumentation__UnorderedGroup_3__Impl ( rule__ComponentDocumentation__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_16);
            rule__ComponentDocumentation__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDocumentation.g:1997:2: ( rule__ComponentDocumentation__UnorderedGroup_3__3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 1) ) {
                alt11=1;
            }
            else if ( LA11_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 2) ) {
                alt11=1;
            }
            else if ( LA11_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDocumentationAccess().getUnorderedGroup_3(), 3) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentDocumentation.g:1997:2: rule__ComponentDocumentation__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDocumentation__UnorderedGroup_3__3();

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
    // $ANTLR end "rule__ComponentDocumentation__UnorderedGroup_3__2"


    // $ANTLR start "rule__ComponentDocumentation__UnorderedGroup_3__3"
    // InternalComponentDocumentation.g:2003:1: rule__ComponentDocumentation__UnorderedGroup_3__3 : rule__ComponentDocumentation__UnorderedGroup_3__Impl ;
    public final void rule__ComponentDocumentation__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2007:1: ( rule__ComponentDocumentation__UnorderedGroup_3__Impl )
            // InternalComponentDocumentation.g:2008:2: rule__ComponentDocumentation__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDocumentation__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__UnorderedGroup_3__3"


    // $ANTLR start "rule__CoordinationSlavePortDocu__UnorderedGroup_3"
    // InternalComponentDocumentation.g:2015:1: rule__CoordinationSlavePortDocu__UnorderedGroup_3 : ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__0 )? ;
    public final void rule__CoordinationSlavePortDocu__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
        	
        try {
            // InternalComponentDocumentation.g:2020:1: ( ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__0 )? )
            // InternalComponentDocumentation.g:2021:2: ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__0 )?
            {
            // InternalComponentDocumentation.g:2021:2: ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1) ) {
                alt12=1;
            }
            else if ( LA12_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2) ) {
                alt12=1;
            }
            else if ( LA12_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentDocumentation.g:2021:2: rule__CoordinationSlavePortDocu__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationSlavePortDocu__UnorderedGroup_3__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__UnorderedGroup_3"


    // $ANTLR start "rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl"
    // InternalComponentDocumentation.g:2029:1: rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_3__0 ) ) ) ) ) ;
    public final void rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDocumentation.g:2034:1: ( ( ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_3__0 ) ) ) ) ) )
            // InternalComponentDocumentation.g:2035:3: ( ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_3__0 ) ) ) ) )
            {
            // InternalComponentDocumentation.g:2035:3: ( ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_3__0 ) ) ) ) )
            int alt13=4;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1) ) {
                alt13=2;
            }
            else if ( LA13_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2) ) {
                alt13=3;
            }
            else if ( LA13_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3) ) {
                alt13=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentDocumentation.g:2036:3: ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_0__0 ) ) ) )
                    {
                    // InternalComponentDocumentation.g:2036:3: ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_0__0 ) ) ) )
                    // InternalComponentDocumentation.g:2037:4: {...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalComponentDocumentation.g:2037:121: ( ( ( rule__CoordinationSlavePortDocu__Group_3_0__0 ) ) )
                    // InternalComponentDocumentation.g:2038:5: ( ( rule__CoordinationSlavePortDocu__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDocumentation.g:2044:5: ( ( rule__CoordinationSlavePortDocu__Group_3_0__0 ) )
                    // InternalComponentDocumentation.g:2045:6: ( rule__CoordinationSlavePortDocu__Group_3_0__0 )
                    {
                     before(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_0()); 
                    // InternalComponentDocumentation.g:2046:6: ( rule__CoordinationSlavePortDocu__Group_3_0__0 )
                    // InternalComponentDocumentation.g:2046:7: rule__CoordinationSlavePortDocu__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationSlavePortDocu__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDocumentation.g:2051:3: ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_1__0 ) ) ) )
                    {
                    // InternalComponentDocumentation.g:2051:3: ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_1__0 ) ) ) )
                    // InternalComponentDocumentation.g:2052:4: {...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalComponentDocumentation.g:2052:121: ( ( ( rule__CoordinationSlavePortDocu__Group_3_1__0 ) ) )
                    // InternalComponentDocumentation.g:2053:5: ( ( rule__CoordinationSlavePortDocu__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDocumentation.g:2059:5: ( ( rule__CoordinationSlavePortDocu__Group_3_1__0 ) )
                    // InternalComponentDocumentation.g:2060:6: ( rule__CoordinationSlavePortDocu__Group_3_1__0 )
                    {
                     before(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_1()); 
                    // InternalComponentDocumentation.g:2061:6: ( rule__CoordinationSlavePortDocu__Group_3_1__0 )
                    // InternalComponentDocumentation.g:2061:7: rule__CoordinationSlavePortDocu__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationSlavePortDocu__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDocumentation.g:2066:3: ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_2__0 ) ) ) )
                    {
                    // InternalComponentDocumentation.g:2066:3: ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_2__0 ) ) ) )
                    // InternalComponentDocumentation.g:2067:4: {...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalComponentDocumentation.g:2067:121: ( ( ( rule__CoordinationSlavePortDocu__Group_3_2__0 ) ) )
                    // InternalComponentDocumentation.g:2068:5: ( ( rule__CoordinationSlavePortDocu__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalComponentDocumentation.g:2074:5: ( ( rule__CoordinationSlavePortDocu__Group_3_2__0 ) )
                    // InternalComponentDocumentation.g:2075:6: ( rule__CoordinationSlavePortDocu__Group_3_2__0 )
                    {
                     before(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_2()); 
                    // InternalComponentDocumentation.g:2076:6: ( rule__CoordinationSlavePortDocu__Group_3_2__0 )
                    // InternalComponentDocumentation.g:2076:7: rule__CoordinationSlavePortDocu__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationSlavePortDocu__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalComponentDocumentation.g:2081:3: ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_3__0 ) ) ) )
                    {
                    // InternalComponentDocumentation.g:2081:3: ({...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_3__0 ) ) ) )
                    // InternalComponentDocumentation.g:2082:4: {...}? => ( ( ( rule__CoordinationSlavePortDocu__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalComponentDocumentation.g:2082:121: ( ( ( rule__CoordinationSlavePortDocu__Group_3_3__0 ) ) )
                    // InternalComponentDocumentation.g:2083:5: ( ( rule__CoordinationSlavePortDocu__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalComponentDocumentation.g:2089:5: ( ( rule__CoordinationSlavePortDocu__Group_3_3__0 ) )
                    // InternalComponentDocumentation.g:2090:6: ( rule__CoordinationSlavePortDocu__Group_3_3__0 )
                    {
                     before(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_3()); 
                    // InternalComponentDocumentation.g:2091:6: ( rule__CoordinationSlavePortDocu__Group_3_3__0 )
                    // InternalComponentDocumentation.g:2091:7: rule__CoordinationSlavePortDocu__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationSlavePortDocu__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationSlavePortDocuAccess().getGroup_3_3()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__CoordinationSlavePortDocu__UnorderedGroup_3__0"
    // InternalComponentDocumentation.g:2104:1: rule__CoordinationSlavePortDocu__UnorderedGroup_3__0 : rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__1 )? ;
    public final void rule__CoordinationSlavePortDocu__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2108:1: ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__1 )? )
            // InternalComponentDocumentation.g:2109:2: rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_17);
            rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDocumentation.g:2110:2: ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1) ) {
                alt14=1;
            }
            else if ( LA14_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2) ) {
                alt14=1;
            }
            else if ( LA14_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentDocumentation.g:2110:2: rule__CoordinationSlavePortDocu__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationSlavePortDocu__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__CoordinationSlavePortDocu__UnorderedGroup_3__0"


    // $ANTLR start "rule__CoordinationSlavePortDocu__UnorderedGroup_3__1"
    // InternalComponentDocumentation.g:2116:1: rule__CoordinationSlavePortDocu__UnorderedGroup_3__1 : rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__2 )? ;
    public final void rule__CoordinationSlavePortDocu__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2120:1: ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__2 )? )
            // InternalComponentDocumentation.g:2121:2: rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_17);
            rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDocumentation.g:2122:2: ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1) ) {
                alt15=1;
            }
            else if ( LA15_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2) ) {
                alt15=1;
            }
            else if ( LA15_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentDocumentation.g:2122:2: rule__CoordinationSlavePortDocu__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationSlavePortDocu__UnorderedGroup_3__2();

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
    // $ANTLR end "rule__CoordinationSlavePortDocu__UnorderedGroup_3__1"


    // $ANTLR start "rule__CoordinationSlavePortDocu__UnorderedGroup_3__2"
    // InternalComponentDocumentation.g:2128:1: rule__CoordinationSlavePortDocu__UnorderedGroup_3__2 : rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__3 )? ;
    public final void rule__CoordinationSlavePortDocu__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2132:1: ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__3 )? )
            // InternalComponentDocumentation.g:2133:2: rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_17);
            rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDocumentation.g:2134:2: ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 1) ) {
                alt16=1;
            }
            else if ( LA16_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 2) ) {
                alt16=1;
            }
            else if ( LA16_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationSlavePortDocuAccess().getUnorderedGroup_3(), 3) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentDocumentation.g:2134:2: rule__CoordinationSlavePortDocu__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationSlavePortDocu__UnorderedGroup_3__3();

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
    // $ANTLR end "rule__CoordinationSlavePortDocu__UnorderedGroup_3__2"


    // $ANTLR start "rule__CoordinationSlavePortDocu__UnorderedGroup_3__3"
    // InternalComponentDocumentation.g:2140:1: rule__CoordinationSlavePortDocu__UnorderedGroup_3__3 : rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl ;
    public final void rule__CoordinationSlavePortDocu__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2144:1: ( rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl )
            // InternalComponentDocumentation.g:2145:2: rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePortDocu__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__UnorderedGroup_3__3"


    // $ANTLR start "rule__ComponentDocumentation__ComponentAssignment_1"
    // InternalComponentDocumentation.g:2152:1: rule__ComponentDocumentation__ComponentAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentDocumentation__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2156:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDocumentation.g:2157:2: ( ( ruleFQN ) )
            {
            // InternalComponentDocumentation.g:2157:2: ( ( ruleFQN ) )
            // InternalComponentDocumentation.g:2158:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentDocumentationAccess().getComponentComponentDefinitionCrossReference_1_0()); 
            // InternalComponentDocumentation.g:2159:3: ( ruleFQN )
            // InternalComponentDocumentation.g:2160:4: ruleFQN
            {
             before(grammarAccess.getComponentDocumentationAccess().getComponentComponentDefinitionFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getComponentDocumentationAccess().getComponentComponentDefinitionFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComponentDocumentationAccess().getComponentComponentDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__ComponentAssignment_1"


    // $ANTLR start "rule__ComponentDocumentation__DescriptionAssignment_3_0_2"
    // InternalComponentDocumentation.g:2171:1: rule__ComponentDocumentation__DescriptionAssignment_3_0_2 : ( ruleEString ) ;
    public final void rule__ComponentDocumentation__DescriptionAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2175:1: ( ( ruleEString ) )
            // InternalComponentDocumentation.g:2176:2: ( ruleEString )
            {
            // InternalComponentDocumentation.g:2176:2: ( ruleEString )
            // InternalComponentDocumentation.g:2177:3: ruleEString
            {
             before(grammarAccess.getComponentDocumentationAccess().getDescriptionEStringParserRuleCall_3_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentDocumentationAccess().getDescriptionEStringParserRuleCall_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__DescriptionAssignment_3_0_2"


    // $ANTLR start "rule__ComponentDocumentation__PurposeAssignment_3_1_2"
    // InternalComponentDocumentation.g:2186:1: rule__ComponentDocumentation__PurposeAssignment_3_1_2 : ( ruleEString ) ;
    public final void rule__ComponentDocumentation__PurposeAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2190:1: ( ( ruleEString ) )
            // InternalComponentDocumentation.g:2191:2: ( ruleEString )
            {
            // InternalComponentDocumentation.g:2191:2: ( ruleEString )
            // InternalComponentDocumentation.g:2192:3: ruleEString
            {
             before(grammarAccess.getComponentDocumentationAccess().getPurposeEStringParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentDocumentationAccess().getPurposeEStringParserRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__PurposeAssignment_3_1_2"


    // $ANTLR start "rule__ComponentDocumentation__LicenseAssignment_3_2_2"
    // InternalComponentDocumentation.g:2201:1: rule__ComponentDocumentation__LicenseAssignment_3_2_2 : ( ruleEString ) ;
    public final void rule__ComponentDocumentation__LicenseAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2205:1: ( ( ruleEString ) )
            // InternalComponentDocumentation.g:2206:2: ( ruleEString )
            {
            // InternalComponentDocumentation.g:2206:2: ( ruleEString )
            // InternalComponentDocumentation.g:2207:3: ruleEString
            {
             before(grammarAccess.getComponentDocumentationAccess().getLicenseEStringParserRuleCall_3_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentDocumentationAccess().getLicenseEStringParserRuleCall_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__LicenseAssignment_3_2_2"


    // $ANTLR start "rule__ComponentDocumentation__HardwareAssignment_3_3_2"
    // InternalComponentDocumentation.g:2216:1: rule__ComponentDocumentation__HardwareAssignment_3_3_2 : ( ruleEString ) ;
    public final void rule__ComponentDocumentation__HardwareAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2220:1: ( ( ruleEString ) )
            // InternalComponentDocumentation.g:2221:2: ( ruleEString )
            {
            // InternalComponentDocumentation.g:2221:2: ( ruleEString )
            // InternalComponentDocumentation.g:2222:3: ruleEString
            {
             before(grammarAccess.getComponentDocumentationAccess().getHardwareEStringParserRuleCall_3_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentDocumentationAccess().getHardwareEStringParserRuleCall_3_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__HardwareAssignment_3_3_2"


    // $ANTLR start "rule__ComponentDocumentation__ElementsAssignment_4"
    // InternalComponentDocumentation.g:2231:1: rule__ComponentDocumentation__ElementsAssignment_4 : ( ruleAbstractComponentDocuElement ) ;
    public final void rule__ComponentDocumentation__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2235:1: ( ( ruleAbstractComponentDocuElement ) )
            // InternalComponentDocumentation.g:2236:2: ( ruleAbstractComponentDocuElement )
            {
            // InternalComponentDocumentation.g:2236:2: ( ruleAbstractComponentDocuElement )
            // InternalComponentDocumentation.g:2237:3: ruleAbstractComponentDocuElement
            {
             before(grammarAccess.getComponentDocumentationAccess().getElementsAbstractComponentDocuElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractComponentDocuElement();

            state._fsp--;

             after(grammarAccess.getComponentDocumentationAccess().getElementsAbstractComponentDocuElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDocumentation__ElementsAssignment_4"


    // $ANTLR start "rule__CoordinationSlavePortDocu__PortAssignment_1"
    // InternalComponentDocumentation.g:2246:1: rule__CoordinationSlavePortDocu__PortAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__CoordinationSlavePortDocu__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2250:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDocumentation.g:2251:2: ( ( ruleFQN ) )
            {
            // InternalComponentDocumentation.g:2251:2: ( ( ruleFQN ) )
            // InternalComponentDocumentation.g:2252:3: ( ruleFQN )
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getPortCoordinationSlavePortCrossReference_1_0()); 
            // InternalComponentDocumentation.g:2253:3: ( ruleFQN )
            // InternalComponentDocumentation.g:2254:4: ruleFQN
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getPortCoordinationSlavePortFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCoordinationSlavePortDocuAccess().getPortCoordinationSlavePortFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCoordinationSlavePortDocuAccess().getPortCoordinationSlavePortCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__PortAssignment_1"


    // $ANTLR start "rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2"
    // InternalComponentDocumentation.g:2265:1: rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2 : ( ruleEString ) ;
    public final void rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2269:1: ( ( ruleEString ) )
            // InternalComponentDocumentation.g:2270:2: ( ruleEString )
            {
            // InternalComponentDocumentation.g:2270:2: ( ruleEString )
            // InternalComponentDocumentation.g:2271:3: ruleEString
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getDescriptionEStringParserRuleCall_3_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoordinationSlavePortDocuAccess().getDescriptionEStringParserRuleCall_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__DescriptionAssignment_3_0_2"


    // $ANTLR start "rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2"
    // InternalComponentDocumentation.g:2280:1: rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2 : ( ruleEString ) ;
    public final void rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2284:1: ( ( ruleEString ) )
            // InternalComponentDocumentation.g:2285:2: ( ruleEString )
            {
            // InternalComponentDocumentation.g:2285:2: ( ruleEString )
            // InternalComponentDocumentation.g:2286:3: ruleEString
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringEStringParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoordinationSlavePortDocuAccess().getDynamicWiringEStringParserRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__DynamicWiringAssignment_3_1_2"


    // $ANTLR start "rule__CoordinationSlavePortDocu__StateAssignment_3_2_2"
    // InternalComponentDocumentation.g:2295:1: rule__CoordinationSlavePortDocu__StateAssignment_3_2_2 : ( ruleEString ) ;
    public final void rule__CoordinationSlavePortDocu__StateAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2299:1: ( ( ruleEString ) )
            // InternalComponentDocumentation.g:2300:2: ( ruleEString )
            {
            // InternalComponentDocumentation.g:2300:2: ( ruleEString )
            // InternalComponentDocumentation.g:2301:3: ruleEString
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getStateEStringParserRuleCall_3_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoordinationSlavePortDocuAccess().getStateEStringParserRuleCall_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__StateAssignment_3_2_2"


    // $ANTLR start "rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2"
    // InternalComponentDocumentation.g:2310:1: rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2 : ( ruleEString ) ;
    public final void rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2314:1: ( ( ruleEString ) )
            // InternalComponentDocumentation.g:2315:2: ( ruleEString )
            {
            // InternalComponentDocumentation.g:2315:2: ( ruleEString )
            // InternalComponentDocumentation.g:2316:3: ruleEString
            {
             before(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterEStringParserRuleCall_3_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoordinationSlavePortDocuAccess().getParameterEStringParserRuleCall_3_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePortDocu__ParameterAssignment_3_3_2"


    // $ANTLR start "rule__ComponentServiceDocu__PortAssignment_1"
    // InternalComponentDocumentation.g:2325:1: rule__ComponentServiceDocu__PortAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentServiceDocu__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2329:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDocumentation.g:2330:2: ( ( ruleFQN ) )
            {
            // InternalComponentDocumentation.g:2330:2: ( ( ruleFQN ) )
            // InternalComponentDocumentation.g:2331:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentServiceDocuAccess().getPortComponentPortCrossReference_1_0()); 
            // InternalComponentDocumentation.g:2332:3: ( ruleFQN )
            // InternalComponentDocumentation.g:2333:4: ruleFQN
            {
             before(grammarAccess.getComponentServiceDocuAccess().getPortComponentPortFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getComponentServiceDocuAccess().getPortComponentPortFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComponentServiceDocuAccess().getPortComponentPortCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__PortAssignment_1"


    // $ANTLR start "rule__ComponentServiceDocu__DescriptionAssignment_3_2"
    // InternalComponentDocumentation.g:2344:1: rule__ComponentServiceDocu__DescriptionAssignment_3_2 : ( ruleEString ) ;
    public final void rule__ComponentServiceDocu__DescriptionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2348:1: ( ( ruleEString ) )
            // InternalComponentDocumentation.g:2349:2: ( ruleEString )
            {
            // InternalComponentDocumentation.g:2349:2: ( ruleEString )
            // InternalComponentDocumentation.g:2350:3: ruleEString
            {
             before(grammarAccess.getComponentServiceDocuAccess().getDescriptionEStringParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentServiceDocuAccess().getDescriptionEStringParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__DescriptionAssignment_3_2"


    // $ANTLR start "rule__ComponentServiceDocu__StatesAssignment_4"
    // InternalComponentDocumentation.g:2359:1: rule__ComponentServiceDocu__StatesAssignment_4 : ( ruleAbstractModeDocu ) ;
    public final void rule__ComponentServiceDocu__StatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2363:1: ( ( ruleAbstractModeDocu ) )
            // InternalComponentDocumentation.g:2364:2: ( ruleAbstractModeDocu )
            {
            // InternalComponentDocumentation.g:2364:2: ( ruleAbstractModeDocu )
            // InternalComponentDocumentation.g:2365:3: ruleAbstractModeDocu
            {
             before(grammarAccess.getComponentServiceDocuAccess().getStatesAbstractModeDocuParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractModeDocu();

            state._fsp--;

             after(grammarAccess.getComponentServiceDocuAccess().getStatesAbstractModeDocuParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentServiceDocu__StatesAssignment_4"


    // $ANTLR start "rule__ComponentModeDocu__ModeAssignment_1"
    // InternalComponentDocumentation.g:2374:1: rule__ComponentModeDocu__ModeAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentModeDocu__ModeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2378:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDocumentation.g:2379:2: ( ( ruleFQN ) )
            {
            // InternalComponentDocumentation.g:2379:2: ( ( ruleFQN ) )
            // InternalComponentDocumentation.g:2380:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentModeDocuAccess().getModePublicOperationModeCrossReference_1_0()); 
            // InternalComponentDocumentation.g:2381:3: ( ruleFQN )
            // InternalComponentDocumentation.g:2382:4: ruleFQN
            {
             before(grammarAccess.getComponentModeDocuAccess().getModePublicOperationModeFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getComponentModeDocuAccess().getModePublicOperationModeFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComponentModeDocuAccess().getModePublicOperationModeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModeDocu__ModeAssignment_1"


    // $ANTLR start "rule__ComponentModeDocu__DescriptionAssignment_3"
    // InternalComponentDocumentation.g:2393:1: rule__ComponentModeDocu__DescriptionAssignment_3 : ( ruleEString ) ;
    public final void rule__ComponentModeDocu__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2397:1: ( ( ruleEString ) )
            // InternalComponentDocumentation.g:2398:2: ( ruleEString )
            {
            // InternalComponentDocumentation.g:2398:2: ( ruleEString )
            // InternalComponentDocumentation.g:2399:3: ruleEString
            {
             before(grammarAccess.getComponentModeDocuAccess().getDescriptionEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentModeDocuAccess().getDescriptionEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModeDocu__DescriptionAssignment_3"


    // $ANTLR start "rule__NeutralModeDocu__DescriptionAssignment_3"
    // InternalComponentDocumentation.g:2408:1: rule__NeutralModeDocu__DescriptionAssignment_3 : ( ruleEString ) ;
    public final void rule__NeutralModeDocu__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDocumentation.g:2412:1: ( ( ruleEString ) )
            // InternalComponentDocumentation.g:2413:2: ( ruleEString )
            {
            // InternalComponentDocumentation.g:2413:2: ( ruleEString )
            // InternalComponentDocumentation.g:2414:3: ruleEString
            {
             before(grammarAccess.getNeutralModeDocuAccess().getDescriptionEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNeutralModeDocuAccess().getDescriptionEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeutralModeDocu__DescriptionAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000E102000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000E100002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000E106000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000E100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000074002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001E00002L});

}
